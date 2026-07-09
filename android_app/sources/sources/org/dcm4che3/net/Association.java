package org.dcm4che3.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.Tag;
import org.dcm4che3.data.UID;
import org.dcm4che3.data.VR;
import org.dcm4che3.net.TransferCapability;
import org.dcm4che3.net.pdu.AAbort;
import org.dcm4che3.net.pdu.AAssociateAC;
import org.dcm4che3.net.pdu.AAssociateRJ;
import org.dcm4che3.net.pdu.AAssociateRQ;
import org.dcm4che3.net.pdu.CommonExtendedNegotiation;
import org.dcm4che3.net.pdu.PresentationContext;
import org.dcm4che3.net.pdu.RoleSelection;
import org.dcm4che3.util.IntHashMap;
import org.dcm4che3.util.SafeClose;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s0.a;

/* JADX INFO: loaded from: classes.dex */
public class Association {
    public static final Logger LOG = LoggerFactory.getLogger(Association.class);
    private static final AtomicInteger prevSerialNo = new AtomicInteger();
    private AAssociateAC ac;
    private ApplicationEntity ae;
    private final Connection conn;
    private PDUDecoder decoder;
    private final Device device;
    private final PDUEncoder encoder;
    private IOException ex;
    private final InputStream in;
    private int maxOpsInvoked;
    private int maxPDULength;
    private String name;
    private final OutputStream out;
    private int performing;
    private HashMap<String, Object> properties;
    private final boolean requestor;
    private AAssociateRQ rq;
    private final int serialNo;
    private final Socket sock;
    private State state;
    private Timeout timeout;
    private final AtomicInteger messageID = new AtomicInteger();
    private final AtomicIntegerArray dimseCounters = new AtomicIntegerArray(46);
    private final IntHashMap<DimseRSPHandler> rspHandlerForMsgId = new IntHashMap<>();
    private final IntHashMap<CancelRQHandler> cancelHandlerForMsgId = new IntHashMap<>();
    private final HashMap<String, HashMap<String, PresentationContext>> pcMap = new HashMap<>();
    private final LinkedList<AssociationListener> listeners = new LinkedList<>();
    private final long connectTime = System.currentTimeMillis();

    public Association(ApplicationEntity applicationEntity, Connection connection, Socket socket) throws IOException {
        int iIncrementAndGet = prevSerialNo.incrementAndGet();
        this.serialNo = iIncrementAndGet;
        this.ae = applicationEntity;
        boolean z3 = applicationEntity != null;
        this.requestor = z3;
        this.name = a.f11071l + socket.getLocalSocketAddress() + delim() + socket.getRemoteSocketAddress() + '(' + iIncrementAndGet + ')';
        this.conn = connection;
        this.device = connection.getDevice();
        this.sock = socket;
        this.in = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        this.out = outputStream;
        this.encoder = new PDUEncoder(this, outputStream);
        if (z3) {
            enterState(State.Sta4);
        } else {
            enterState(State.Sta2);
            startRequestTimeout();
        }
        activate();
    }

    private void activate() {
        this.device.execute(new Runnable() { // from class: org.dcm4che3.net.Association.2
            @Override // java.lang.Runnable
            public void run() {
                Association association = Association.this;
                Association association2 = Association.this;
                association.decoder = new PDUDecoder(association2, association2.in);
                Association.this.device.addAssociation(Association.this);
                while (Association.this.state != State.Sta1 && Association.this.state != State.Sta13) {
                    try {
                        try {
                            try {
                                Association.this.decoder.nextPDU();
                            } catch (IOException e4) {
                                Association.this.onIOException(e4);
                            }
                        } catch (AAbort e5) {
                            Association.this.abort(e5);
                        }
                    } finally {
                        Association.this.device.removeAssociation(Association.this);
                        Association.this.onClose();
                    }
                }
            }
        });
    }

    private void addDimseRSPHandler(DimseRSPHandler dimseRSPHandler) throws InterruptedException {
        synchronized (this.rspHandlerForMsgId) {
            while (this.maxOpsInvoked > 0 && this.rspHandlerForMsgId.size() >= this.maxOpsInvoked) {
                this.rspHandlerForMsgId.wait();
            }
            this.rspHandlerForMsgId.put(dimseRSPHandler.getMessageID(), dimseRSPHandler);
        }
    }

    private void checkException() throws IOException {
        IOException iOException = this.ex;
        if (iOException != null) {
            throw iOException;
        }
    }

    private void checkIsSCP(String str) throws NoRoleSelectionException {
        if (!isSCPFor(str)) {
            throw new NoRoleSelectionException(str, TransferCapability.Role.SCP);
        }
    }

    private void checkIsSCU(String str) throws NoRoleSelectionException {
        if (!isSCUFor(str)) {
            throw new NoRoleSelectionException(str, TransferCapability.Role.SCU);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void closeSocket() {
        this.state.closeSocket(this);
    }

    private synchronized void closeSocketDelayed() {
        this.state.closeSocketDelayed(this);
    }

    private synchronized void decPerforming() {
        this.performing--;
        notifyAll();
    }

    private String delim() {
        return this.requestor ? "->" : "<-";
    }

    private synchronized void enterState(State state) {
        LOG.debug("{}: enter state: {}", this.name, state);
        this.state = state;
        notifyAll();
    }

    private DimseRSPHandler getDimseRSPHandler(int i4) {
        DimseRSPHandler dimseRSPHandler;
        synchronized (this.rspHandlerForMsgId) {
            dimseRSPHandler = this.rspHandlerForMsgId.get(i4);
        }
        return dimseRSPHandler;
    }

    private synchronized void incPerforming() {
        this.performing++;
    }

    private void initPCMap() {
        for (PresentationContext presentationContext : this.ac.getPresentationContexts()) {
            if (presentationContext.isAccepted()) {
                initTSMap(this.rq.getPresentationContext(presentationContext.getPCID()).getAbstractSyntax()).put(presentationContext.getTransferSyntax(), presentationContext);
            }
        }
    }

    private HashMap<String, PresentationContext> initTSMap(String str) {
        HashMap<String, PresentationContext> map = this.pcMap.get(str);
        if (map != null) {
            return map;
        }
        HashMap<String, HashMap<String, PresentationContext>> map2 = this.pcMap;
        HashMap<String, PresentationContext> map3 = new HashMap<>();
        map2.put(str, map3);
        return map3;
    }

    public static int minZeroAsMax(int i4, int i5) {
        return i4 == 0 ? i5 : i5 == 0 ? i4 : Math.min(i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClose() {
        stopTimeout();
        synchronized (this.rspHandlerForMsgId) {
            this.rspHandlerForMsgId.accept(new IntHashMap.Visitor<DimseRSPHandler>() { // from class: org.dcm4che3.net.Association.3
                @Override // org.dcm4che3.util.IntHashMap.Visitor
                public boolean visit(int i4, DimseRSPHandler dimseRSPHandler) {
                    dimseRSPHandler.onClose(Association.this);
                    return true;
                }
            });
            this.rspHandlerForMsgId.clear();
            this.rspHandlerForMsgId.notifyAll();
        }
        ApplicationEntity applicationEntity = this.ae;
        if (applicationEntity != null) {
            applicationEntity.getDevice().getAssociationHandler().onClose(this);
        }
        Iterator<AssociationListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onClose(this);
        }
    }

    private DimseRSPHandler removeDimseRSPHandler(int i4) {
        DimseRSPHandler dimseRSPHandlerRemove;
        synchronized (this.rspHandlerForMsgId) {
            dimseRSPHandlerRemove = this.rspHandlerForMsgId.remove(i4);
            this.rspHandlerForMsgId.notifyAll();
        }
        return dimseRSPHandlerRemove;
    }

    private void startAcceptTimeout() {
        startTimeout("{}: start A-ASSOCIATE-AC timeout of {}ms", "{}: A-ASSOCIATE-AC timeout expired", "{}: stop A-ASSOCIATE-AC timeout", this.conn.getAcceptTimeout(), State.Sta5);
    }

    private synchronized void startIdleOrReleaseTimeout() {
        State state = this.state;
        if (state == State.Sta6) {
            startIdleTimeout();
        } else if (state == State.Sta7) {
            startReleaseTimeout();
        }
    }

    private void startIdleTimeout() {
        startTimeout("{}: start idle timeout of {}ms", "{}: idle timeout expired", "{}: stop idle timeout", this.conn.getIdleTimeout(), State.Sta6);
    }

    private void startReleaseTimeout() {
        startTimeout("{}: start A-RELEASE-RP timeout of {}ms", "{}: A-RELEASE-RP timeout expired", "{}: stop A-RELEASE-RP timeout", this.conn.getReleaseTimeout(), State.Sta7);
    }

    private void startRequestTimeout() {
        startTimeout("{}: start A-ASSOCIATE-RQ timeout of {}ms", "{}: A-ASSOCIATE-RQ timeout expired", "{}: stop A-ASSOCIATE-RQ timeout", this.conn.getRequestTimeout(), State.Sta2);
    }

    private void startTimeout(int i4, int i5) {
        if (i5 > 0) {
            synchronized (this.rspHandlerForMsgId) {
                DimseRSPHandler dimseRSPHandler = this.rspHandlerForMsgId.get(i4);
                if (dimseRSPHandler != null) {
                    dimseRSPHandler.setTimeout(Timeout.start(this, "{}: start " + i4 + ":DIMSE-RSP timeout of {}ms", "{}: " + i4 + ":DIMSE-RSP timeout expired", "{}: stop " + i4 + ":DIMSE-RSP timeout", i5));
                }
            }
        }
    }

    private synchronized void stopTimeout() {
        Timeout timeout = this.timeout;
        if (timeout != null) {
            timeout.stop();
            this.timeout = null;
        }
    }

    private synchronized void waitForPerformingOps() {
        while (this.performing > 0 && this.state == State.Sta8) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void abort() {
        abort(new AAbort());
    }

    public void addAssociationListener(AssociationListener associationListener) {
        this.listeners.add(associationListener);
    }

    public void addCancelRQHandler(int i4, CancelRQHandler cancelRQHandler) {
        synchronized (this.cancelHandlerForMsgId) {
            this.cancelHandlerForMsgId.put(i4, cancelRQHandler);
        }
    }

    public void cancel(PresentationContext presentationContext, int i4) throws IOException {
        this.encoder.writeDIMSE(presentationContext, Commands.mkCCancelRQ(i4), null);
    }

    public DimseRSP cecho() throws InterruptedException, IOException {
        return cecho(UID.VerificationSOPClass);
    }

    public DimseRSP cfind(String str, int i4, Attributes attributes, String str2, int i5) throws InterruptedException, IOException {
        return cfind(str, str, i4, attributes, str2, i5);
    }

    public DimseRSP cget(String str, int i4, Attributes attributes, String str2) throws InterruptedException, IOException {
        return cget(str, str, i4, attributes, str2);
    }

    public Object clearProperty(String str) {
        HashMap<String, Object> map = this.properties;
        if (map != null) {
            return map.remove(str);
        }
        return null;
    }

    public DimseRSP cmove(String str, int i4, Attributes attributes, String str2, String str3) throws InterruptedException, IOException {
        return cmove(str, str, i4, attributes, str2, str3);
    }

    public boolean containsProperty(String str) {
        HashMap<String, Object> map = this.properties;
        return map != null && map.containsKey(str);
    }

    public Attributes createFileMetaInformation(String str, String str2, String str3) {
        Attributes attributes = new Attributes(7);
        attributes.setBytes(Tag.FileMetaInformationVersion, VR.OB, new byte[]{0, 1});
        VR vr = VR.UI;
        attributes.setString(Tag.MediaStorageSOPClassUID, vr, str2);
        attributes.setString(Tag.MediaStorageSOPInstanceUID, vr, str);
        attributes.setString(Tag.TransferSyntaxUID, vr, str3);
        attributes.setString(Tag.ImplementationClassUID, vr, getRemoteImplClassUID());
        String remoteImplVersionName = getRemoteImplVersionName();
        if (remoteImplVersionName != null) {
            attributes.setString(Tag.ImplementationVersionName, VR.SH, remoteImplVersionName);
        }
        attributes.setString(Tag.SourceApplicationEntityTitle, VR.AE, getRemoteAET());
        return attributes;
    }

    public DimseRSP cstore(String str, String str2, int i4, String str3, int i5, DataWriter dataWriter, String str4) throws InterruptedException, IOException {
        return cstore(str, str, str2, i4, str3, i5, dataWriter, str4);
    }

    public void doCloseSocket() {
        LOG.info("{}: close {}", this.name, this.sock);
        SafeClose.close(this.sock);
        enterState(State.Sta1);
    }

    public void doCloseSocketDelayed() {
        enterState(State.Sta13);
        int socketCloseDelay = this.conn.getSocketCloseDelay();
        if (socketCloseDelay > 0) {
            this.device.schedule(new Runnable() { // from class: org.dcm4che3.net.Association.1
                @Override // java.lang.Runnable
                public void run() {
                    Association.this.closeSocket();
                }
            }, socketCloseDelay, TimeUnit.MILLISECONDS);
        } else {
            closeSocket();
        }
    }

    public void doWritePDataTF() throws IOException {
        this.encoder.writePDataTF();
    }

    public final AAssociateAC getAAssociateAC() {
        return this.ac;
    }

    public final AAssociateRQ getAAssociateRQ() {
        return this.rq;
    }

    public final ApplicationEntity getApplicationEntity() {
        return this.ae;
    }

    public String getCalledAET() {
        AAssociateRQ aAssociateRQ = this.rq;
        if (aAssociateRQ != null) {
            return aAssociateRQ.getCalledAET();
        }
        return null;
    }

    public String getCallingAET() {
        AAssociateRQ aAssociateRQ = this.rq;
        if (aAssociateRQ != null) {
            return aAssociateRQ.getCallingAET();
        }
        return null;
    }

    public CommonExtendedNegotiation getCommonExtendedNegotiationFor(String str) {
        return this.ac.getCommonExtendedNegotiationFor(str);
    }

    public long getConnectTimeInMillis() {
        return this.connectTime;
    }

    public final Connection getConnection() {
        return this.conn;
    }

    public Device getDevice() {
        return this.device;
    }

    public final IOException getException() {
        return this.ex;
    }

    public String getLocalAET() {
        return this.requestor ? getCallingAET() : getCalledAET();
    }

    public String getLocalImplClassUID() {
        return (this.requestor ? this.rq : this.ac).getImplClassUID();
    }

    public String getLocalImplVersionName() {
        return (this.requestor ? this.rq : this.ac).getImplVersionName();
    }

    public final int getMaxPDULengthSend() {
        return this.maxPDULength;
    }

    public int getNumberOfReceived(Dimse dimse) {
        return this.dimseCounters.get(dimse.ordinal() + 23);
    }

    public int getNumberOfSent(Dimse dimse) {
        return this.dimseCounters.get(dimse.ordinal());
    }

    public PresentationContext getPresentationContext(int i4) {
        return this.ac.getPresentationContext(i4);
    }

    public <T> T getProperty(Class<T> cls) {
        return (T) getProperty(cls.getName());
    }

    public Set<String> getPropertyNames() {
        HashMap<String, Object> map = this.properties;
        return map != null ? map.keySet() : Collections.emptySet();
    }

    public EnumSet<QueryOption> getQueryOptionsFor(String str) {
        return QueryOption.toOptions(this.ac.getExtNegotiationFor(str));
    }

    public String getRemoteAET() {
        return this.requestor ? getCalledAET() : getCallingAET();
    }

    public String getRemoteImplClassUID() {
        return (this.requestor ? this.ac : this.rq).getImplClassUID();
    }

    public String getRemoteImplVersionName() {
        return (this.requestor ? this.ac : this.rq).getImplVersionName();
    }

    public int getSerialNo() {
        return this.serialNo;
    }

    public final Socket getSocket() {
        return this.sock;
    }

    public final State getState() {
        return this.state;
    }

    public Set<String> getTransferSyntaxesFor(String str) {
        HashMap<String, PresentationContext> map = this.pcMap.get(str);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    public void handle(AAssociateAC aAssociateAC) throws IOException {
        this.ac = aAssociateAC;
        initPCMap();
        this.maxOpsInvoked = aAssociateAC.getMaxOpsInvoked();
        this.maxPDULength = minZeroAsMax(aAssociateAC.getMaxPDULength(), this.conn.getSendPDULength());
        enterState(State.Sta6);
        startIdleTimeout();
    }

    public void handleAReleaseRP() throws IOException {
        closeSocket();
    }

    public void handleAReleaseRPCollision() throws IOException {
        enterState(State.Sta12);
        LOG.info("{} << A-RELEASE-RP", this.name);
        this.encoder.writeAReleaseRP();
        closeSocketDelayed();
    }

    public void handleAReleaseRQ() throws IOException {
        if (this.decoder.isPendingPDV()) {
            LOG.info("{}: unexpected A-RELEASE-RQ after P-DATA-TF with pending PDV", this);
            abort();
            return;
        }
        enterState(State.Sta8);
        waitForPerformingOps();
        LOG.info("{} << A-RELEASE-RP", this.name);
        this.encoder.writeAReleaseRP();
        closeSocketDelayed();
    }

    public void handleAReleaseRQCollision() throws IOException {
        State state;
        if (isRequestor()) {
            enterState(State.Sta9);
            LOG.info("{} << A-RELEASE-RP", this.name);
            this.encoder.writeAReleaseRP();
            state = State.Sta11;
        } else {
            state = State.Sta10;
        }
        enterState(state);
    }

    public void handlePDataTF() throws IOException {
        this.decoder.decodeDIMSE();
    }

    public void incReceivedCount(Dimse dimse) {
        this.dimseCounters.getAndIncrement(dimse.ordinal() + 23);
    }

    public void incSentCount(Dimse dimse) {
        this.dimseCounters.getAndIncrement(dimse.ordinal());
    }

    public void invoke(PresentationContext presentationContext, Attributes attributes, DataWriter dataWriter, DimseRSPHandler dimseRSPHandler, int i4) throws InterruptedException, IOException {
        stopTimeout();
        checkException();
        dimseRSPHandler.setPC(presentationContext);
        addDimseRSPHandler(dimseRSPHandler);
        this.encoder.writeDIMSE(presentationContext, attributes, dataWriter);
        startTimeout(dimseRSPHandler.getMessageID(), i4);
    }

    public boolean isPackPDV() {
        return this.conn.isPackPDV();
    }

    public boolean isReadyForDataTransfer() {
        return this.state == State.Sta6;
    }

    public final boolean isRequestor() {
        return this.requestor;
    }

    public boolean isSCPFor(String str) {
        RoleSelection roleSelectionFor = this.ac.getRoleSelectionFor(str);
        return roleSelectionFor == null ? !this.requestor : this.requestor ? roleSelectionFor.isSCP() : roleSelectionFor.isSCU();
    }

    public boolean isSCUFor(String str) {
        RoleSelection roleSelectionFor = this.ac.getRoleSelectionFor(str);
        return roleSelectionFor == null ? this.requestor : this.requestor ? roleSelectionFor.isSCU() : roleSelectionFor.isSCP();
    }

    public DimseRSP naction(String str, String str2, int i4, Attributes attributes, String str3) throws InterruptedException, IOException {
        return naction(str, str, str2, i4, attributes, str3);
    }

    public DimseRSP ncreate(String str, String str2, String str3, Attributes attributes, String str4) throws InterruptedException, IOException {
        FutureDimseRSP futureDimseRSP = new FutureDimseRSP(nextMessageID());
        ncreate(str, str2, str3, attributes, str4, futureDimseRSP);
        return futureDimseRSP;
    }

    public DimseRSP ndelete(String str, String str2) throws InterruptedException, IOException {
        return ndelete(str, str, str2);
    }

    public DimseRSP neventReport(String str, String str2, int i4, Attributes attributes, String str3) throws InterruptedException, IOException {
        return neventReport(str, str, str2, i4, attributes, str3);
    }

    public int nextMessageID() {
        return this.messageID.incrementAndGet() & l0.a.f8427a;
    }

    public DimseRSP nget(String str, String str2, String str3, int[] iArr) throws InterruptedException, IOException {
        FutureDimseRSP futureDimseRSP = new FutureDimseRSP(nextMessageID());
        nget(str, str2, str3, iArr, futureDimseRSP);
        return futureDimseRSP;
    }

    public DimseRSP nset(String str, String str2, String str3, Attributes attributes, String str4) throws InterruptedException, IOException {
        return nset(str, str2, str3, new DataWriterAdapter(attributes), str4);
    }

    public void onAAbort(AAbort aAbort) {
        LOG.info("{} >> {}", this.name, aAbort);
        stopTimeout();
        this.ex = aAbort;
        closeSocket();
    }

    public void onAAssociateAC(AAssociateAC aAssociateAC) throws IOException {
        Logger logger = LOG;
        logger.info("{} >> A-ASSOCIATE-AC", this.name);
        logger.debug("{}", aAssociateAC);
        stopTimeout();
        this.state.onAAssociateAC(this, aAssociateAC);
    }

    public void onAAssociateRJ(AAssociateRJ aAssociateRJ) throws IOException {
        LOG.info("{} >> {}", this.name, aAssociateRJ);
        this.state.onAAssociateRJ(this, aAssociateRJ);
    }

    public void onAAssociateRQ(AAssociateRQ aAssociateRQ) throws IOException {
        String str = aAssociateRQ.getCalledAET() + delim() + aAssociateRQ.getCallingAET() + '(' + this.serialNo + ')';
        this.name = str;
        Logger logger = LOG;
        logger.info("{} >> A-ASSOCIATE-RQ", str);
        logger.debug("{}", aAssociateRQ);
        stopTimeout();
        this.state.onAAssociateRQ(this, aAssociateRQ);
    }

    public void onAReleaseRP() throws IOException {
        LOG.info("{} >> A-RELEASE-RP", this.name);
        stopTimeout();
        this.state.onAReleaseRP(this);
    }

    public void onAReleaseRQ() throws IOException {
        LOG.info("{} >> A-RELEASE-RQ", this.name);
        stopTimeout();
        this.state.onAReleaseRQ(this);
    }

    public void onCancelRQ(Attributes attributes) throws IOException {
        incReceivedCount(Dimse.C_CANCEL_RQ);
        CancelRQHandler cancelRQHandlerRemoveCancelRQHandler = removeCancelRQHandler(attributes.getInt(288, -1));
        if (cancelRQHandlerRemoveCancelRQHandler != null) {
            cancelRQHandlerRemoveCancelRQHandler.onCancelRQ(this);
        }
    }

    public void onDimseRQ(PresentationContext presentationContext, Dimse dimse, Attributes attributes, PDVInputStream pDVInputStream) throws IOException {
        stopTimeout();
        incPerforming();
        incReceivedCount(dimse);
        this.ae.onDimseRQ(this, presentationContext, dimse, attributes, pDVInputStream);
    }

    public void onDimseRSP(Dimse dimse, Attributes attributes, Attributes attributes2) throws AAbort {
        int i4 = attributes.getInt(288, -1);
        boolean zIsPending = Status.isPending(attributes.getInt(Tag.Status, 0));
        DimseRSPHandler dimseRSPHandler = getDimseRSPHandler(i4);
        if (dimseRSPHandler == null) {
            Logger logger = Dimse.LOG;
            logger.info("{}: unexpected message ID in DIMSE RSP:", this.name);
            logger.info("\n{}", attributes);
            throw new AAbort();
        }
        dimseRSPHandler.onDimseRSP(this, attributes, attributes2);
        if (zIsPending) {
            startTimeout(i4, dimse.isRetrieveRQ() ? this.conn.getRetrieveTimeout() : this.conn.getResponseTimeout());
            return;
        }
        incReceivedCount(dimse);
        removeDimseRSPHandler(i4);
        if (this.rspHandlerForMsgId.isEmpty() && this.performing == 0) {
            startIdleOrReleaseTimeout();
        }
    }

    public synchronized void onIOException(IOException iOException) {
        if (this.ex != null) {
            return;
        }
        this.ex = iOException;
        LOG.info("{}: i/o exception: {} in State: {}", this.name, iOException, this.state);
        closeSocket();
    }

    public void onPDataTF() throws IOException {
        this.state.onPDataTF(this);
    }

    public PresentationContext pcFor(String str, String str2) throws NoPresentationContextException {
        HashMap<String, PresentationContext> map = this.pcMap.get(str);
        if (map == null) {
            throw new NoPresentationContextException(str);
        }
        if (str2 == null) {
            return map.values().iterator().next();
        }
        PresentationContext presentationContext = map.get(str2);
        if (presentationContext != null) {
            return presentationContext;
        }
        throw new NoPresentationContextException(str, str2);
    }

    public void release() throws IOException {
        this.state.writeAReleaseRQ(this);
    }

    public void removeAssociationListener(AssociationListener associationListener) {
        this.listeners.remove(associationListener);
    }

    public CancelRQHandler removeCancelRQHandler(int i4) {
        CancelRQHandler cancelRQHandlerRemove;
        synchronized (this.cancelHandlerForMsgId) {
            cancelRQHandlerRemove = this.cancelHandlerForMsgId.remove(i4);
        }
        return cancelRQHandlerRemove;
    }

    public Object setProperty(String str, Object obj) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        return this.properties.put(str, obj);
    }

    public String toString() {
        return this.name;
    }

    public boolean tryWriteDimseRSP(PresentationContext presentationContext, Attributes attributes) {
        return tryWriteDimseRSP(presentationContext, attributes, null);
    }

    public void unexpectedPDU(String str) throws AAbort {
        LOG.warn("{} >> unexpected {} in state: {}", this.name, str, this.state);
        throw new AAbort(2, 2);
    }

    public synchronized void waitForEntering(State state) throws InterruptedException, IOException {
        while (this.state != state) {
            wait();
        }
        checkException();
    }

    public synchronized void waitForLeaving(State state) throws InterruptedException, IOException {
        while (this.state == state) {
            wait();
        }
        checkException();
    }

    public void waitForOutstandingRSP() throws InterruptedException {
        synchronized (this.rspHandlerForMsgId) {
            while (!this.rspHandlerForMsgId.isEmpty()) {
                this.rspHandlerForMsgId.wait();
            }
        }
    }

    public void waitForSocketClose() throws InterruptedException, IOException {
        waitForEntering(State.Sta1);
    }

    public void write(AAbort aAbort) throws IOException {
        LOG.info("{} << {}", this.name, aAbort);
        this.encoder.write(aAbort);
        this.ex = aAbort;
        closeSocketDelayed();
    }

    public void writeAReleaseRQ() throws IOException {
        LOG.info("{} << A-RELEASE-RQ", this.name);
        enterState(State.Sta7);
        stopTimeout();
        this.encoder.writeAReleaseRQ();
        startReleaseTimeout();
    }

    public void writeDimseRSP(PresentationContext presentationContext, Attributes attributes) throws IOException {
        writeDimseRSP(presentationContext, attributes, null);
    }

    public void writePDataTF() throws IOException {
        checkException();
        this.state.writePDataTF(this);
    }

    private void startTimeout(String str, String str2, String str3, int i4, State state) {
        if (i4 > 0 && this.performing == 0 && this.rspHandlerForMsgId.isEmpty()) {
            synchronized (this) {
                if (this.state == state) {
                    stopTimeout();
                    this.timeout = Timeout.start(this, str, str2, str3, i4);
                }
            }
        }
    }

    private void write(AAssociateAC aAssociateAC) throws IOException {
        Logger logger = LOG;
        logger.info("{} << A-ASSOCIATE-AC", this.name);
        logger.debug("{}", aAssociateAC);
        enterState(State.Sta6);
        this.encoder.write(aAssociateAC);
        startIdleTimeout();
    }

    public void abort(AAbort aAbort) {
        try {
            this.state.write(this, aAbort);
        } catch (IOException unused) {
        }
    }

    public DimseRSP cecho(String str) throws InterruptedException, IOException {
        FutureDimseRSP futureDimseRSP = new FutureDimseRSP(nextMessageID());
        PresentationContext presentationContextPcFor = pcFor(str, null);
        checkIsSCU(str);
        invoke(presentationContextPcFor, Commands.mkCEchoRQ(futureDimseRSP.getMessageID(), str), null, futureDimseRSP, this.conn.getResponseTimeout());
        return futureDimseRSP;
    }

    public DimseRSP cfind(String str, String str2, int i4, Attributes attributes, String str3, int i5) throws InterruptedException, IOException {
        FutureDimseRSP futureDimseRSP = new FutureDimseRSP(nextMessageID());
        futureDimseRSP.setAutoCancel(i5);
        cfind(str, str2, i4, attributes, str3, futureDimseRSP);
        return futureDimseRSP;
    }

    public DimseRSP cget(String str, String str2, int i4, Attributes attributes, String str3) throws InterruptedException, IOException {
        FutureDimseRSP futureDimseRSP = new FutureDimseRSP(nextMessageID());
        cget(str, str2, i4, attributes, str3, futureDimseRSP);
        return futureDimseRSP;
    }

    public DimseRSP cmove(String str, String str2, int i4, Attributes attributes, String str3, String str4) throws InterruptedException, IOException {
        FutureDimseRSP futureDimseRSP = new FutureDimseRSP(nextMessageID());
        cmove(str, str2, i4, attributes, str3, str4, futureDimseRSP);
        return futureDimseRSP;
    }

    public DimseRSP cstore(String str, String str2, int i4, DataWriter dataWriter, String str3) throws InterruptedException, IOException {
        return cstore(str, str, str2, i4, dataWriter, str3);
    }

    public Object getProperty(String str) {
        HashMap<String, Object> map = this.properties;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public void handle(AAssociateRJ aAssociateRJ) {
        this.ex = aAssociateRJ;
        closeSocket();
    }

    public DimseRSP naction(String str, String str2, String str3, int i4, Attributes attributes, String str4) throws InterruptedException, IOException {
        FutureDimseRSP futureDimseRSP = new FutureDimseRSP(nextMessageID());
        naction(str, str2, str3, i4, attributes, str4, futureDimseRSP);
        return futureDimseRSP;
    }

    public DimseRSP ncreate(String str, String str2, Attributes attributes, String str3) throws InterruptedException, IOException {
        return ncreate(str, str, str2, attributes, str3);
    }

    public DimseRSP ndelete(String str, String str2, String str3) throws InterruptedException, IOException {
        FutureDimseRSP futureDimseRSP = new FutureDimseRSP(nextMessageID());
        ndelete(str, str2, str3, futureDimseRSP);
        return futureDimseRSP;
    }

    public DimseRSP neventReport(String str, String str2, String str3, int i4, Attributes attributes, String str4) throws InterruptedException, IOException {
        FutureDimseRSP futureDimseRSP = new FutureDimseRSP(nextMessageID());
        neventReport(str, str2, str3, i4, attributes, str4, futureDimseRSP);
        return futureDimseRSP;
    }

    public DimseRSP nget(String str, String str2, int[] iArr) throws InterruptedException, IOException {
        return nget(str, str, str2, iArr);
    }

    public DimseRSP nset(String str, String str2, String str3, DataWriter dataWriter, String str4) throws InterruptedException, IOException {
        FutureDimseRSP futureDimseRSP = new FutureDimseRSP(nextMessageID());
        nset(str, str2, str3, dataWriter, str4, futureDimseRSP);
        return futureDimseRSP;
    }

    public <T> void setProperty(Class<T> cls, Object obj) {
        setProperty(cls.getName(), obj);
    }

    public boolean tryWriteDimseRSP(PresentationContext presentationContext, Attributes attributes, Attributes attributes2) {
        try {
            writeDimseRSP(presentationContext, attributes, attributes2);
            return true;
        } catch (IOException e4) {
            LOG.warn("{} << {} failed: {}", this, Dimse.valueOf(attributes.getInt(256, 0)), e4.getMessage());
            return false;
        }
    }

    public void writeDimseRSP(PresentationContext presentationContext, Attributes attributes, Attributes attributes2) throws IOException {
        DataWriterAdapter dataWriterAdapter;
        int withDatasetType;
        if (attributes2 != null) {
            dataWriterAdapter = new DataWriterAdapter(attributes2);
            withDatasetType = Commands.getWithDatasetType();
        } else {
            dataWriterAdapter = null;
            withDatasetType = 257;
        }
        attributes.setInt(2048, VR.US, withDatasetType);
        this.encoder.writeDIMSE(presentationContext, attributes, dataWriterAdapter);
        if (Status.isPending(attributes.getInt(Tag.Status, 0))) {
            return;
        }
        decPerforming();
        startIdleTimeout();
    }

    private void write(AAssociateRJ aAssociateRJ) throws IOException {
        LOG.info("{} << {}", this.name, aAssociateRJ);
        this.encoder.write(aAssociateRJ);
        closeSocketDelayed();
    }

    public void cfind(String str, int i4, Attributes attributes, String str2, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        cfind(str, str, i4, attributes, str2, dimseRSPHandler);
    }

    public void cget(String str, int i4, Attributes attributes, String str2, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        cget(str, str, i4, attributes, str2, dimseRSPHandler);
    }

    public void cmove(String str, int i4, Attributes attributes, String str2, String str3, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        cmove(str, str, i4, attributes, str2, str3, dimseRSPHandler);
    }

    public DimseRSP cstore(String str, String str2, String str3, int i4, String str4, int i5, DataWriter dataWriter, String str5) throws InterruptedException, IOException {
        FutureDimseRSP futureDimseRSP = new FutureDimseRSP(nextMessageID());
        cstore(str, str2, str3, i4, str4, i5, dataWriter, str5, futureDimseRSP);
        return futureDimseRSP;
    }

    public void handle(AAssociateRQ aAssociateRQ) throws IOException {
        this.rq = aAssociateRQ;
        enterState(State.Sta3);
        try {
            this.ae = this.device.getApplicationEntity(aAssociateRQ.getCalledAET(), true);
            this.ac = this.device.getAssociationHandler().negotiate(this, aAssociateRQ);
            initPCMap();
            this.maxOpsInvoked = this.ac.getMaxOpsPerformed();
            this.maxPDULength = minZeroAsMax(aAssociateRQ.getMaxPDULength(), this.conn.getSendPDULength());
            write(this.ac);
        } catch (AAssociateRJ e4) {
            write(e4);
        }
    }

    public void naction(String str, String str2, int i4, Attributes attributes, String str3, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        naction(str, str, str2, i4, attributes, str3, dimseRSPHandler);
    }

    public void ncreate(String str, String str2, String str3, Attributes attributes, String str4, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        PresentationContext presentationContextPcFor = pcFor(str, str4);
        checkIsSCU(str2);
        invoke(presentationContextPcFor, Commands.mkNCreateRQ(dimseRSPHandler.getMessageID(), str2, str3), DataWriterAdapter.forAttributes(attributes), dimseRSPHandler, this.conn.getResponseTimeout());
    }

    public void ndelete(String str, String str2, String str3, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        PresentationContext presentationContextPcFor = pcFor(str, null);
        checkIsSCU(str2);
        invoke(presentationContextPcFor, Commands.mkNDeleteRQ(dimseRSPHandler.getMessageID(), str2, str3), null, dimseRSPHandler, this.conn.getResponseTimeout());
    }

    public void neventReport(String str, String str2, int i4, Attributes attributes, String str3, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        neventReport(str, str, str2, i4, attributes, str3, dimseRSPHandler);
    }

    public void nget(String str, String str2, String str3, int[] iArr, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        PresentationContext presentationContextPcFor = pcFor(str, null);
        checkIsSCU(str2);
        invoke(presentationContextPcFor, Commands.mkNGetRQ(dimseRSPHandler.getMessageID(), str2, str3, iArr), null, dimseRSPHandler, this.conn.getResponseTimeout());
    }

    public DimseRSP nset(String str, String str2, Attributes attributes, String str3) throws InterruptedException, IOException {
        return nset(str, str, str2, new DataWriterAdapter(attributes), str3);
    }

    public void cfind(String str, String str2, int i4, Attributes attributes, String str3, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        PresentationContext presentationContextPcFor = pcFor(str, str3);
        checkIsSCU(str2);
        invoke(presentationContextPcFor, Commands.mkCFindRQ(dimseRSPHandler.getMessageID(), str2, i4), new DataWriterAdapter(attributes), dimseRSPHandler, this.conn.getResponseTimeout());
    }

    public void cget(String str, String str2, int i4, Attributes attributes, String str3, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        PresentationContext presentationContextPcFor = pcFor(str, str3);
        checkIsSCU(str2);
        invoke(presentationContextPcFor, Commands.mkCGetRQ(dimseRSPHandler.getMessageID(), str2, i4), new DataWriterAdapter(attributes), dimseRSPHandler, this.conn.getRetrieveTimeout());
    }

    public void cmove(String str, String str2, int i4, Attributes attributes, String str3, String str4, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        PresentationContext presentationContextPcFor = pcFor(str, str3);
        checkIsSCU(str2);
        invoke(presentationContextPcFor, Commands.mkCMoveRQ(dimseRSPHandler.getMessageID(), str2, i4, str4), new DataWriterAdapter(attributes), dimseRSPHandler, this.conn.getRetrieveTimeout());
    }

    public DimseRSP cstore(String str, String str2, String str3, int i4, DataWriter dataWriter, String str4) throws InterruptedException, IOException {
        FutureDimseRSP futureDimseRSP = new FutureDimseRSP(nextMessageID());
        cstore(str, str2, str3, i4, dataWriter, str4, futureDimseRSP);
        return futureDimseRSP;
    }

    public void naction(String str, String str2, String str3, int i4, Attributes attributes, String str4, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        PresentationContext presentationContextPcFor = pcFor(str, str4);
        checkIsSCU(str2);
        invoke(presentationContextPcFor, Commands.mkNActionRQ(dimseRSPHandler.getMessageID(), str2, str3, i4, attributes), DataWriterAdapter.forAttributes(attributes), dimseRSPHandler, this.conn.getResponseTimeout());
    }

    public void ncreate(String str, String str2, Attributes attributes, String str3, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        ncreate(str, str, str2, attributes, str3, dimseRSPHandler);
    }

    public void ndelete(String str, String str2, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        ndelete(str, str, str2, dimseRSPHandler);
    }

    public void neventReport(String str, String str2, String str3, int i4, Attributes attributes, String str4, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        PresentationContext presentationContextPcFor = pcFor(str, str4);
        checkIsSCP(str2);
        invoke(presentationContextPcFor, Commands.mkNEventReportRQ(dimseRSPHandler.getMessageID(), str2, str3, i4, attributes), DataWriterAdapter.forAttributes(attributes), dimseRSPHandler, this.conn.getResponseTimeout());
    }

    public void nget(String str, String str2, int[] iArr, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        nget(str, str, str2, iArr, dimseRSPHandler);
    }

    public DimseRSP nset(String str, String str2, DataWriter dataWriter, String str3) throws InterruptedException, IOException {
        return nset(str, str, str2, dataWriter, str3);
    }

    public void write(AAssociateRQ aAssociateRQ) throws IOException {
        String str = aAssociateRQ.getCallingAET() + delim() + aAssociateRQ.getCalledAET() + '(' + this.serialNo + ')';
        this.name = str;
        this.rq = aAssociateRQ;
        Logger logger = LOG;
        logger.info("{} << A-ASSOCIATE-RQ", str);
        logger.debug("{}", aAssociateRQ);
        enterState(State.Sta5);
        this.encoder.write(aAssociateRQ);
        startAcceptTimeout();
    }

    public void cstore(String str, String str2, int i4, String str3, int i5, DataWriter dataWriter, String str4, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        cstore(str, str, str2, i4, str3, i5, dataWriter, str4, dimseRSPHandler);
    }

    public void nset(String str, String str2, String str3, Attributes attributes, String str4, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        nset(str, str2, str3, new DataWriterAdapter(attributes), str4, dimseRSPHandler);
    }

    public void cstore(String str, String str2, int i4, DataWriter dataWriter, String str3, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        cstore(str, str, str2, i4, dataWriter, str3, dimseRSPHandler);
    }

    public void nset(String str, String str2, String str3, DataWriter dataWriter, String str4, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        PresentationContext presentationContextPcFor = pcFor(str, str4);
        checkIsSCU(str2);
        invoke(presentationContextPcFor, Commands.mkNSetRQ(dimseRSPHandler.getMessageID(), str2, str3), dataWriter, dimseRSPHandler, this.conn.getResponseTimeout());
    }

    public void cstore(String str, String str2, String str3, int i4, String str4, int i5, DataWriter dataWriter, String str5, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        invoke(pcFor(str, str5), Commands.mkCStoreRQ(dimseRSPHandler.getMessageID(), str2, str3, i4, str4, i5), dataWriter, dimseRSPHandler, this.conn.getResponseTimeout());
    }

    public void nset(String str, String str2, Attributes attributes, String str3, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        nset(str, str, str2, new DataWriterAdapter(attributes), str3, dimseRSPHandler);
    }

    public void cstore(String str, String str2, String str3, int i4, DataWriter dataWriter, String str4, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        PresentationContext presentationContextPcFor = pcFor(str, str4);
        checkIsSCU(str2);
        invoke(presentationContextPcFor, Commands.mkCStoreRQ(dimseRSPHandler.getMessageID(), str2, str3, i4), dataWriter, dimseRSPHandler, this.conn.getResponseTimeout());
    }

    public void nset(String str, String str2, DataWriter dataWriter, String str3, DimseRSPHandler dimseRSPHandler) throws InterruptedException, IOException {
        nset(str, str, str2, dataWriter, str3, dimseRSPHandler);
    }
}
