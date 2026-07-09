package org.dcm4che3.net;

import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.net.Connection;
import org.dcm4che3.net.TransferCapability;
import org.dcm4che3.net.pdu.AAbort;
import org.dcm4che3.net.pdu.AAssociateAC;
import org.dcm4che3.net.pdu.AAssociateRQ;
import org.dcm4che3.net.pdu.CommonExtendedNegotiation;
import org.dcm4che3.net.pdu.ExtendedNegotiation;
import org.dcm4che3.net.pdu.PresentationContext;
import org.dcm4che3.util.SafeClose;
import org.dcm4che3.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import s0.a;

/* JADX INFO: loaded from: classes.dex */
public class ApplicationEntity implements Serializable {
    protected static final Logger LOG = LoggerFactory.getLogger(ApplicationEntity.class);
    private static final long serialVersionUID = 3883790997057469573L;
    private final LinkedHashSet<String> acceptedCallingAETs;
    private boolean acceptor;
    private String aet;
    private String[] applicationClusters;
    private final List<Connection> conns;
    private String description;
    private Device device;
    private transient DimseRQHandler dimseRQHandler;
    private final LinkedHashMap<Class<? extends AEExtension>, AEExtension> extensions;
    private String hl7ApplicationName;
    private boolean initiator;
    private Boolean installed;
    private final LinkedHashMap<String, String> masqueradeCallingAETs;
    private final LinkedHashSet<String> otherAETs;
    private String[] prefCalledAETs;
    private String[] prefCallingAETs;
    private final LinkedHashMap<String, TransferCapability> scpTCs;
    private final LinkedHashMap<String, TransferCapability> scuTCs;
    private String[] supportedCharacterSets;
    private byte[][] vendorData;

    public ApplicationEntity() {
        this.vendorData = new byte[0][];
        this.applicationClusters = new String[0];
        this.prefCalledAETs = new String[0];
        this.prefCallingAETs = new String[0];
        this.supportedCharacterSets = new String[0];
        this.acceptor = true;
        this.initiator = true;
        this.acceptedCallingAETs = new LinkedHashSet<>();
        this.otherAETs = new LinkedHashSet<>();
        this.masqueradeCallingAETs = new LinkedHashMap<>();
        this.conns = new ArrayList(1);
        this.scuTCs = new LinkedHashMap<>();
        this.scpTCs = new LinkedHashMap<>();
        this.extensions = new LinkedHashMap<>();
    }

    private void checkDevice() {
        if (this.device == null) {
            throw new IllegalStateException("Not attached to Device");
        }
    }

    private void checkInstalled() {
        if (!isInstalled()) {
            throw new IllegalStateException("Not installed");
        }
    }

    private TransferCapability getTC(HashMap<String, TransferCapability> map, String str, AAssociateRQ aAssociateRQ) {
        TransferCapability transferCapability = map.get(str);
        if (transferCapability != null) {
            return transferCapability;
        }
        CommonExtendedNegotiation commonExtendedNegotiationFor = aAssociateRQ.getCommonExtendedNegotiationFor(str);
        if (commonExtendedNegotiationFor != null) {
            for (String str2 : commonExtendedNegotiationFor.getRelatedGeneralSOPClassUIDs()) {
                TransferCapability transferCapability2 = map.get(str2);
                if (transferCapability2 != null) {
                    return transferCapability2;
                }
            }
            TransferCapability transferCapability3 = map.get(commonExtendedNegotiationFor.getServiceClassUID());
            if (transferCapability3 != null) {
                return transferCapability3;
            }
        }
        return map.get(Marker.ANY_MARKER);
    }

    private void reconfigureAEExtensions(ApplicationEntity applicationEntity) {
        Iterator<Class<? extends AEExtension>> it = this.extensions.keySet().iterator();
        while (it.hasNext()) {
            if (!applicationEntity.extensions.containsKey(it.next())) {
                it.remove();
            }
        }
        for (AEExtension aEExtension : applicationEntity.extensions.values()) {
            Class<?> cls = aEExtension.getClass();
            AEExtension aEExtension2 = this.extensions.get(cls);
            if (aEExtension2 == null) {
                try {
                    aEExtension2 = (AEExtension) cls.newInstance();
                    addAEExtension(aEExtension2);
                } catch (Exception e4) {
                    throw new RuntimeException("Failed to instantiate " + cls.getName(), e4);
                }
            }
            aEExtension2.reconfigure(aEExtension);
        }
    }

    private void reconfigureTransferCapabilities(ApplicationEntity applicationEntity) {
        this.scuTCs.clear();
        this.scuTCs.putAll(applicationEntity.scuTCs);
        this.scpTCs.clear();
        this.scpTCs.putAll(applicationEntity.scpTCs);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047 A[PHI: r4
      0x0047: PHI (r4v1 org.dcm4che3.net.TransferCapability) = (r4v0 org.dcm4che3.net.TransferCapability), (r4v3 org.dcm4che3.net.TransferCapability) binds: [B:22:0x003c, B:24:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.dcm4che3.net.TransferCapability roleSelection(org.dcm4che3.net.pdu.AAssociateRQ r7, org.dcm4che3.net.pdu.AAssociateAC r8, java.lang.String r9) {
        /*
            r6 = this;
            org.dcm4che3.net.pdu.RoleSelection r0 = r7.getRoleSelectionFor(r9)
            if (r0 != 0) goto Ld
            java.util.LinkedHashMap<java.lang.String, org.dcm4che3.net.TransferCapability> r8 = r6.scpTCs
            org.dcm4che3.net.TransferCapability r7 = r6.getTC(r8, r9, r7)
            return r7
        Ld:
            org.dcm4che3.net.pdu.RoleSelection r1 = r8.getRoleSelectionFor(r9)
            if (r1 == 0) goto L23
            boolean r8 = r1.isSCU()
            if (r8 == 0) goto L1c
            java.util.LinkedHashMap<java.lang.String, org.dcm4che3.net.TransferCapability> r8 = r6.scpTCs
            goto L1e
        L1c:
            java.util.LinkedHashMap<java.lang.String, org.dcm4che3.net.TransferCapability> r8 = r6.scuTCs
        L1e:
            org.dcm4che3.net.TransferCapability r7 = r6.getTC(r8, r9, r7)
            return r7
        L23:
            boolean r1 = r0.isSCU()
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L36
            java.util.LinkedHashMap<java.lang.String, org.dcm4che3.net.TransferCapability> r1 = r6.scpTCs
            org.dcm4che3.net.TransferCapability r1 = r6.getTC(r1, r9, r7)
            if (r1 == 0) goto L37
            r5 = r2
            goto L38
        L36:
            r1 = r4
        L37:
            r5 = r3
        L38:
            boolean r0 = r0.isSCP()
            if (r0 == 0) goto L47
            java.util.LinkedHashMap<java.lang.String, org.dcm4che3.net.TransferCapability> r0 = r6.scuTCs
            org.dcm4che3.net.TransferCapability r4 = r6.getTC(r0, r9, r7)
            if (r4 == 0) goto L47
            goto L48
        L47:
            r2 = r3
        L48:
            org.dcm4che3.net.pdu.RoleSelection r7 = new org.dcm4che3.net.pdu.RoleSelection
            r7.<init>(r9, r5, r2)
            r8.addRoleSelection(r7)
            if (r5 == 0) goto L53
            goto L54
        L53:
            r1 = r4
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dcm4che3.net.ApplicationEntity.roleSelection(org.dcm4che3.net.pdu.AAssociateRQ, org.dcm4che3.net.pdu.AAssociateAC, java.lang.String):org.dcm4che3.net.TransferCapability");
    }

    public void addAEExtension(AEExtension aEExtension) {
        Class<?> cls = aEExtension.getClass();
        if (!this.extensions.containsKey(cls)) {
            aEExtension.setApplicationEntity(this);
            this.extensions.put((Class<? extends AEExtension>) cls, aEExtension);
        } else {
            throw new IllegalStateException("already contains AE Extension:" + cls);
        }
    }

    public void addConnection(Connection connection) {
        if (connection.getProtocol() != Connection.Protocol.DICOM) {
            throw new IllegalArgumentException("protocol != DICOM - " + connection.getProtocol());
        }
        Device device = this.device;
        if (device == null || device == connection.getDevice()) {
            this.conns.add(connection);
            return;
        }
        throw new IllegalStateException(connection + " not contained by Device: " + this.device.getDeviceName());
    }

    public TransferCapability addTransferCapability(TransferCapability transferCapability) {
        transferCapability.setApplicationEntity(this);
        TransferCapability transferCapabilityPut = (transferCapability.getRole() == TransferCapability.Role.SCU ? this.scuTCs : this.scpTCs).put(transferCapability.getSopClass(), transferCapability);
        if (transferCapabilityPut != null && transferCapabilityPut != transferCapability) {
            transferCapabilityPut.setApplicationEntity(null);
        }
        return transferCapabilityPut;
    }

    public Association connect(ApplicationEntity applicationEntity, AAssociateRQ aAssociateRQ) throws GeneralSecurityException, InterruptedException, IncompatibleConnectionException, IOException {
        CompatibleConnection compatibleConnectionFindCompatibelConnection = findCompatibelConnection(applicationEntity);
        if (aAssociateRQ.getCalledAET() == null) {
            aAssociateRQ.setCalledAET(applicationEntity.getAETitle());
        }
        return connect(compatibleConnectionFindCompatibelConnection.getLocalConnection(), compatibleConnectionFindCompatibelConnection.getRemoteConnection(), aAssociateRQ);
    }

    public CompatibleConnection findCompatibelConnection(ApplicationEntity applicationEntity) throws IncompatibleConnectionException {
        for (Connection connection : applicationEntity.conns) {
            if (connection.isInstalled() && connection.isServer()) {
                for (Connection connection2 : this.conns) {
                    if (connection2.isInstalled() && connection2.isCompatible(connection)) {
                        return new CompatibleConnection(connection2, connection);
                    }
                }
            }
        }
        throw new IncompatibleConnectionException("No compatible connection to " + applicationEntity.getAETitle() + " available on " + this.aet);
    }

    public <T extends AEExtension> T getAEExtension(Class<T> cls) {
        return (T) this.extensions.get(cls);
    }

    public <T extends AEExtension> T getAEExtensionNotNull(Class<T> cls) {
        T t4 = (T) getAEExtension(cls);
        if (t4 != null) {
            return t4;
        }
        throw new IllegalStateException("No " + cls.getName() + " configured for AE: " + this.aet);
    }

    public final String getAETitle() {
        return this.aet;
    }

    public String[] getAcceptedCallingAETitles() {
        LinkedHashSet<String> linkedHashSet = this.acceptedCallingAETs;
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    public String[] getApplicationClusters() {
        return this.applicationClusters;
    }

    public String getCallingAETitle(String str) {
        String str2 = this.masqueradeCallingAETs.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = this.masqueradeCallingAETs.get(Marker.ANY_MARKER);
        return str3 == null ? this.aet : str3;
    }

    public List<Connection> getConnections() {
        return this.conns;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Device getDevice() {
        return this.device;
    }

    public DimseRQHandler getDimseRQHandler() {
        DimseRQHandler dimseRQHandler = this.dimseRQHandler;
        if (dimseRQHandler != null) {
            return dimseRQHandler;
        }
        Device device = this.device;
        if (device != null) {
            return device.getDimseRQHandler();
        }
        return null;
    }

    public String getHl7ApplicationName() {
        return this.hl7ApplicationName;
    }

    public final Boolean getInstalled() {
        return this.installed;
    }

    public String[] getMasqueradeCallingAETitles() {
        String[] strArr = new String[this.masqueradeCallingAETs.size()];
        for (Map.Entry<String, String> entry : this.masqueradeCallingAETs.entrySet()) {
            strArr[0] = entry.getKey().equals(Marker.ANY_MARKER) ? entry.getValue() : '[' + entry.getKey() + ']' + entry.getValue();
        }
        return strArr;
    }

    public String[] getOtherAETitles() {
        LinkedHashSet<String> linkedHashSet = this.otherAETs;
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    public String[] getPreferredCalledAETitles() {
        return this.prefCalledAETs;
    }

    public String[] getPreferredCallingAETitles() {
        return this.prefCallingAETs;
    }

    public String[] getSupportedCharacterSets() {
        return this.supportedCharacterSets;
    }

    public Collection<TransferCapability> getTransferCapabilities() {
        ArrayList arrayList = new ArrayList(this.scuTCs.size() + this.scpTCs.size());
        arrayList.addAll(this.scpTCs.values());
        arrayList.addAll(this.scuTCs.values());
        return arrayList;
    }

    public Collection<TransferCapability> getTransferCapabilitiesWithRole(TransferCapability.Role role) {
        return (role == TransferCapability.Role.SCU ? this.scuTCs : this.scpTCs).values();
    }

    public TransferCapability getTransferCapabilityFor(String str, TransferCapability.Role role) {
        return (role == TransferCapability.Role.SCU ? this.scuTCs : this.scpTCs).get(str);
    }

    public final byte[][] getVendorData() {
        return this.vendorData;
    }

    public boolean isAcceptedCallingAETitle(String str) {
        return this.acceptedCallingAETs.isEmpty() || this.acceptedCallingAETs.contains(str);
    }

    public final boolean isAssociationAcceptor() {
        return this.acceptor;
    }

    public final boolean isAssociationInitiator() {
        return this.initiator;
    }

    public boolean isInstalled() {
        Boolean bool;
        Device device = this.device;
        return device != null && device.isInstalled() && ((bool = this.installed) == null || bool.booleanValue());
    }

    public boolean isMasqueradeCallingAETitle(String str) {
        return this.masqueradeCallingAETs.containsKey(str) || this.masqueradeCallingAETs.containsKey(Marker.ANY_MARKER);
    }

    public boolean isOtherAETitle(String str) {
        return this.otherAETs.contains(str);
    }

    public Collection<AEExtension> listAEExtensions() {
        return this.extensions.values();
    }

    public PresentationContext negotiate(AAssociateRQ aAssociateRQ, AAssociateAC aAssociateAC, PresentationContext presentationContext) {
        String abstractSyntax = presentationContext.getAbstractSyntax();
        TransferCapability transferCapabilityRoleSelection = roleSelection(aAssociateRQ, aAssociateAC, abstractSyntax);
        int pcid = presentationContext.getPCID();
        if (transferCapabilityRoleSelection == null) {
            return new PresentationContext(pcid, 3, presentationContext.getTransferSyntax());
        }
        for (String str : presentationContext.getTransferSyntaxes()) {
            if (transferCapabilityRoleSelection.containsTransferSyntax(str)) {
                byte[] bArrNegotiate = negotiate(aAssociateRQ.getExtNegotiationFor(abstractSyntax), transferCapabilityRoleSelection);
                if (bArrNegotiate != null) {
                    aAssociateAC.addExtendedNegotiation(new ExtendedNegotiation(abstractSyntax, bArrNegotiate));
                }
                return new PresentationContext(pcid, 0, str);
            }
        }
        return new PresentationContext(pcid, 4, presentationContext.getTransferSyntax());
    }

    public void onDimseRQ(Association association, PresentationContext presentationContext, Dimse dimse, Attributes attributes, PDVInputStream pDVInputStream) throws IOException {
        DimseRQHandler dimseRQHandler = getDimseRQHandler();
        if (dimseRQHandler != null) {
            dimseRQHandler.onDimseRQ(association, presentationContext, dimse, attributes, pDVInputStream);
        } else {
            LOG.error("DimseRQHandler not initalized");
            throw new AAbort();
        }
    }

    public StringBuilder promptTo(StringBuilder sb, String str) {
        String str2 = str + "  ";
        StringUtils.appendLine(sb, str, "ApplicationEntity[title: ", this.aet);
        StringUtils.appendLine(sb, str2, "desc: ", this.description);
        StringUtils.appendLine(sb, str2, "acceptor: ", Boolean.valueOf(this.acceptor));
        StringUtils.appendLine(sb, str2, "initiator: ", Boolean.valueOf(this.initiator));
        StringUtils.appendLine(sb, str2, "installed: ", getInstalled());
        Iterator<Connection> it = this.conns.iterator();
        while (it.hasNext()) {
            it.next().promptTo(sb, str2).append(StringUtils.LINE_SEPARATOR);
        }
        Iterator<TransferCapability> it2 = getTransferCapabilities().iterator();
        while (it2.hasNext()) {
            it2.next().promptTo(sb, str2).append(StringUtils.LINE_SEPARATOR);
        }
        sb.append(str);
        sb.append(']');
        return sb;
    }

    public void reconfigure(ApplicationEntity applicationEntity) {
        setApplicationEntityAttributes(applicationEntity);
        this.device.reconfigureConnections(this.conns, applicationEntity.conns);
        reconfigureTransferCapabilities(applicationEntity);
        reconfigureAEExtensions(applicationEntity);
    }

    public boolean removeAEExtension(AEExtension aEExtension) {
        if (this.extensions.remove(aEExtension.getClass()) == null) {
            return false;
        }
        aEExtension.setApplicationEntity(null);
        return true;
    }

    public boolean removeConnection(Connection connection) {
        return this.conns.remove(connection);
    }

    public TransferCapability removeTransferCapabilityFor(String str, TransferCapability.Role role) {
        TransferCapability transferCapabilityRemove = (role == TransferCapability.Role.SCU ? this.scuTCs : this.scpTCs).remove(str);
        if (transferCapabilityRemove != null) {
            transferCapabilityRemove.setApplicationEntity(null);
        }
        return transferCapabilityRemove;
    }

    public void setAETitle(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("AE title cannot be empty");
        }
        Device device = this.device;
        if (device != null) {
            device.removeApplicationEntity(this.aet);
        }
        this.aet = str;
        if (device != null) {
            device.addApplicationEntity(this);
        }
    }

    public void setAcceptedCallingAETitles(String... strArr) {
        this.acceptedCallingAETs.clear();
        for (String str : strArr) {
            this.acceptedCallingAETs.add(str);
        }
    }

    public void setApplicationClusters(String... strArr) {
        this.applicationClusters = strArr;
    }

    public void setApplicationEntityAttributes(ApplicationEntity applicationEntity) {
        this.description = applicationEntity.description;
        this.vendorData = applicationEntity.vendorData;
        this.applicationClusters = applicationEntity.applicationClusters;
        this.prefCalledAETs = applicationEntity.prefCalledAETs;
        this.prefCallingAETs = applicationEntity.prefCallingAETs;
        this.acceptedCallingAETs.clear();
        this.acceptedCallingAETs.addAll(applicationEntity.acceptedCallingAETs);
        this.otherAETs.clear();
        this.otherAETs.addAll(applicationEntity.otherAETs);
        this.masqueradeCallingAETs.clear();
        this.masqueradeCallingAETs.putAll(applicationEntity.masqueradeCallingAETs);
        this.supportedCharacterSets = applicationEntity.supportedCharacterSets;
        this.hl7ApplicationName = applicationEntity.hl7ApplicationName;
        this.acceptor = applicationEntity.acceptor;
        this.initiator = applicationEntity.initiator;
        this.installed = applicationEntity.installed;
    }

    public final void setAssociationAcceptor(boolean z3) {
        this.acceptor = z3;
    }

    public final void setAssociationInitiator(boolean z3) {
        this.initiator = z3;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public void setDevice(Device device) {
        if (device != null) {
            if (this.device != null) {
                throw new IllegalStateException("already owned by " + this.device.getDeviceName());
            }
            for (Connection connection : this.conns) {
                if (connection.getDevice() != device) {
                    throw new IllegalStateException(connection + " not owned by " + device.getDeviceName());
                }
            }
        }
        this.device = device;
    }

    public final void setDimseRQHandler(DimseRQHandler dimseRQHandler) {
        this.dimseRQHandler = dimseRQHandler;
    }

    public void setHl7ApplicationName(String str) {
        this.hl7ApplicationName = str;
    }

    public void setInstalled(Boolean bool) {
        this.installed = bool;
    }

    public void setMasqueradeCallingAETitles(String... strArr) {
        this.masqueradeCallingAETs.clear();
        for (String str : strArr) {
            if (str.charAt(0) == '[') {
                int iIndexOf = str.indexOf(93);
                if (iIndexOf > 0) {
                    this.masqueradeCallingAETs.put(str.substring(1, iIndexOf), str.substring(iIndexOf + 1));
                }
            } else {
                this.masqueradeCallingAETs.put(Marker.ANY_MARKER, str);
            }
        }
    }

    public void setOtherAETitles(String... strArr) {
        this.otherAETs.clear();
        for (String str : strArr) {
            this.otherAETs.add(str);
        }
    }

    public void setPreferredCalledAETitles(String... strArr) {
        this.prefCalledAETs = strArr;
    }

    public void setPreferredCallingAETitles(String... strArr) {
        this.prefCallingAETs = strArr;
    }

    public void setSupportedCharacterSets(String... strArr) {
        this.supportedCharacterSets = strArr;
    }

    public final void setVendorData(byte[]... bArr) {
        this.vendorData = bArr;
    }

    public String toString() {
        return promptTo(new StringBuilder(512), a.f11071l).toString();
    }

    public ApplicationEntity(String str) {
        this.vendorData = new byte[0][];
        this.applicationClusters = new String[0];
        this.prefCalledAETs = new String[0];
        this.prefCallingAETs = new String[0];
        this.supportedCharacterSets = new String[0];
        this.acceptor = true;
        this.initiator = true;
        this.acceptedCallingAETs = new LinkedHashSet<>();
        this.otherAETs = new LinkedHashSet<>();
        this.masqueradeCallingAETs = new LinkedHashMap<>();
        this.conns = new ArrayList(1);
        this.scuTCs = new LinkedHashMap<>();
        this.scpTCs = new LinkedHashMap<>();
        this.extensions = new LinkedHashMap<>();
        setAETitle(str);
    }

    private byte[] negotiate(ExtendedNegotiation extendedNegotiation, TransferCapability transferCapability) {
        if (extendedNegotiation == null) {
            return null;
        }
        StorageOptions storageOptions = transferCapability.getStorageOptions();
        if (storageOptions != null) {
            return storageOptions.toExtendedNegotiationInformation();
        }
        EnumSet<QueryOption> queryOptions = transferCapability.getQueryOptions();
        if (queryOptions == null) {
            return null;
        }
        EnumSet<QueryOption> options = QueryOption.toOptions(extendedNegotiation);
        options.retainAll(queryOptions);
        return QueryOption.toExtendedNegotiationInformation(options);
    }

    public Association connect(Connection connection, Connection connection2, AAssociateRQ aAssociateRQ) throws GeneralSecurityException, InterruptedException, IOException, IncompatibleConnectionException {
        checkDevice();
        checkInstalled();
        if (aAssociateRQ.getCallingAET() == null) {
            aAssociateRQ.setCallingAET(getCallingAETitle(aAssociateRQ.getCalledAET()));
        }
        aAssociateRQ.setMaxOpsInvoked(connection.getMaxOpsInvoked());
        aAssociateRQ.setMaxOpsPerformed(connection.getMaxOpsPerformed());
        aAssociateRQ.setMaxPDULength(connection.getReceivePDULength());
        Socket socketConnect = connection.connect(connection2);
        try {
            Association association = new Association(this, connection, socketConnect);
            association.write(aAssociateRQ);
            association.waitForLeaving(State.Sta5);
            return association;
        } catch (IOException e4) {
            SafeClose.close(socketConnect);
            throw e4;
        } catch (InterruptedException e5) {
            SafeClose.close(socketConnect);
            throw e5;
        }
    }

    public Connection findCompatibelConnection(Connection connection) throws IncompatibleConnectionException {
        for (Connection connection2 : this.conns) {
            if (connection2.isInstalled() && connection2.isCompatible(connection)) {
                return connection2;
            }
        }
        throw new IncompatibleConnectionException("No compatible connection to " + connection + " available on " + this.aet);
    }

    public Association connect(Connection connection, AAssociateRQ aAssociateRQ) throws GeneralSecurityException, InterruptedException, IOException, IncompatibleConnectionException {
        return connect(findCompatibelConnection(connection), connection, aAssociateRQ);
    }
}
