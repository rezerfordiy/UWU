package org.dcm4che3.net.pdu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.dcm4che3.data.Implementation;
import org.dcm4che3.data.UID;
import org.dcm4che3.net.Connection;
import org.dcm4che3.util.IntHashMap;
import org.dcm4che3.util.StringUtils;
import org.dcm4che3.util.UIDUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class AAssociateRQAC {
    protected String calledAET;
    protected String callingAET;
    protected UserIdentityAC userIdentityAC;
    protected UserIdentityRQ userIdentityRQ;
    protected byte[] reservedBytes = new byte[32];
    protected int protocolVersion = 1;
    protected int maxPDULength = Connection.DEF_MAX_PDU_LENGTH;
    protected int maxOpsInvoked = 1;
    protected int maxOpsPerformed = 1;
    protected String applicationContext = UID.DICOMApplicationContextName;
    protected String implClassUID = Implementation.getClassUID();
    protected String implVersionName = Implementation.getVersionName();
    protected final ArrayList<PresentationContext> pcs = new ArrayList<>();
    protected final IntHashMap<PresentationContext> pcidMap = new IntHashMap<>();
    protected final LinkedHashMap<String, RoleSelection> roleSelMap = new LinkedHashMap<>();
    protected final LinkedHashMap<String, ExtendedNegotiation> extNegMap = new LinkedHashMap<>();
    protected final LinkedHashMap<String, CommonExtendedNegotiation> commonExtNegMap = new LinkedHashMap<>();

    public CommonExtendedNegotiation addCommonExtendedNegotiation(CommonExtendedNegotiation commonExtendedNegotiation) {
        return this.commonExtNegMap.put(commonExtendedNegotiation.getSOPClassUID(), commonExtendedNegotiation);
    }

    public ExtendedNegotiation addExtendedNegotiation(ExtendedNegotiation extendedNegotiation) {
        return this.extNegMap.put(extendedNegotiation.getSOPClassUID(), extendedNegotiation);
    }

    public void addPresentationContext(PresentationContext presentationContext) {
        int pcid = presentationContext.getPCID();
        if (!this.pcidMap.containsKey(pcid)) {
            this.pcidMap.put(pcid, presentationContext);
            this.pcs.add(presentationContext);
        } else {
            throw new IllegalStateException("Already contains Presentation Context with pid: " + pcid);
        }
    }

    public RoleSelection addRoleSelection(RoleSelection roleSelection) {
        return this.roleSelMap.put(roleSelection.getSOPClassUID(), roleSelection);
    }

    public void checkCalledAET() {
        if (this.calledAET == null) {
            throw new IllegalStateException("Called AET not initalized");
        }
    }

    public void checkCallingAET() {
        if (this.callingAET == null) {
            throw new IllegalStateException("Calling AET not initalized");
        }
    }

    public final String getApplicationContext() {
        return this.applicationContext;
    }

    public final String getCalledAET() {
        return this.calledAET;
    }

    public final String getCallingAET() {
        return this.callingAET;
    }

    public CommonExtendedNegotiation getCommonExtendedNegotiationFor(String str) {
        return this.commonExtNegMap.get(str);
    }

    public Collection<CommonExtendedNegotiation> getCommonExtendedNegotiations() {
        return Collections.unmodifiableCollection(this.commonExtNegMap.values());
    }

    public ExtendedNegotiation getExtNegotiationFor(String str) {
        return this.extNegMap.get(str);
    }

    public Collection<ExtendedNegotiation> getExtendedNegotiations() {
        return Collections.unmodifiableCollection(this.extNegMap.values());
    }

    public final String getImplClassUID() {
        return this.implClassUID;
    }

    public final String getImplVersionName() {
        return this.implVersionName;
    }

    public final int getMaxOpsInvoked() {
        return this.maxOpsInvoked;
    }

    public final int getMaxOpsPerformed() {
        return this.maxOpsPerformed;
    }

    public final int getMaxPDULength() {
        return this.maxPDULength;
    }

    public int getNumberOfPresentationContexts() {
        return this.pcs.size();
    }

    public PresentationContext getPresentationContext(int i4) {
        return this.pcidMap.get(i4);
    }

    public List<PresentationContext> getPresentationContexts() {
        return Collections.unmodifiableList(this.pcs);
    }

    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    public final byte[] getReservedBytes() {
        return (byte[]) this.reservedBytes.clone();
    }

    public RoleSelection getRoleSelectionFor(String str) {
        return this.roleSelMap.get(str);
    }

    public Collection<RoleSelection> getRoleSelections() {
        return Collections.unmodifiableCollection(this.roleSelMap.values());
    }

    public final UserIdentityAC getUserIdentityAC() {
        return this.userIdentityAC;
    }

    public final UserIdentityRQ getUserIdentityRQ() {
        return this.userIdentityRQ;
    }

    public final boolean isAsyncOps() {
        return (this.maxOpsInvoked == 1 && this.maxOpsPerformed == 1) ? false : true;
    }

    public int length() {
        int length = this.applicationContext.length() + 4 + 68;
        Iterator<PresentationContext> it = this.pcs.iterator();
        while (it.hasNext()) {
            length += it.next().length() + 4;
        }
        return length + userInfoLength() + 4;
    }

    public StringBuilder promptTo(String str, StringBuilder sb) {
        sb.append(str);
        sb.append(StringUtils.LINE_SEPARATOR);
        sb.append("  calledAET: ");
        sb.append(this.calledAET);
        sb.append(StringUtils.LINE_SEPARATOR);
        sb.append("  callingAET: ");
        sb.append(this.callingAET);
        sb.append(StringUtils.LINE_SEPARATOR);
        sb.append("  applicationContext: ");
        StringBuilder sbPromptTo = UIDUtils.promptTo(this.applicationContext, sb);
        sbPromptTo.append(StringUtils.LINE_SEPARATOR);
        sbPromptTo.append("  implClassUID: ");
        sbPromptTo.append(this.implClassUID);
        sbPromptTo.append(StringUtils.LINE_SEPARATOR);
        sbPromptTo.append("  implVersionName: ");
        sbPromptTo.append(this.implVersionName);
        sbPromptTo.append(StringUtils.LINE_SEPARATOR);
        sbPromptTo.append("  maxPDULength: ");
        sbPromptTo.append(this.maxPDULength);
        sbPromptTo.append(StringUtils.LINE_SEPARATOR);
        sbPromptTo.append("  maxOpsInvoked/maxOpsPerformed: ");
        sbPromptTo.append(this.maxOpsInvoked);
        sbPromptTo.append("/");
        sbPromptTo.append(this.maxOpsPerformed);
        sbPromptTo.append(StringUtils.LINE_SEPARATOR);
        UserIdentityRQ userIdentityRQ = this.userIdentityRQ;
        if (userIdentityRQ != null) {
            userIdentityRQ.promptTo(sb).append(StringUtils.LINE_SEPARATOR);
        }
        UserIdentityAC userIdentityAC = this.userIdentityAC;
        if (userIdentityAC != null) {
            userIdentityAC.promptTo(sb).append(StringUtils.LINE_SEPARATOR);
        }
        Iterator<PresentationContext> it = this.pcs.iterator();
        while (it.hasNext()) {
            it.next().promptTo(sb).append(StringUtils.LINE_SEPARATOR);
        }
        Iterator<RoleSelection> it2 = this.roleSelMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().promptTo(sb).append(StringUtils.LINE_SEPARATOR);
        }
        Iterator<ExtendedNegotiation> it3 = this.extNegMap.values().iterator();
        while (it3.hasNext()) {
            it3.next().promptTo(sb).append(StringUtils.LINE_SEPARATOR);
        }
        Iterator<CommonExtendedNegotiation> it4 = this.commonExtNegMap.values().iterator();
        while (it4.hasNext()) {
            it4.next().promptTo(sb).append(StringUtils.LINE_SEPARATOR);
        }
        sb.append("]");
        return sb;
    }

    public CommonExtendedNegotiation removeCommonExtendedNegotiationFor(String str) {
        return this.commonExtNegMap.remove(str);
    }

    public ExtendedNegotiation removeExtendedNegotiationFor(String str) {
        return this.extNegMap.remove(str);
    }

    public boolean removePresentationContext(PresentationContext presentationContext) {
        if (!this.pcs.remove(presentationContext)) {
            return false;
        }
        this.pcidMap.remove(presentationContext.getPCID());
        return true;
    }

    public RoleSelection removeRoleSelectionFor(String str) {
        return this.roleSelMap.remove(str);
    }

    public final void setApplicationContext(String str) {
        str.getClass();
        this.applicationContext = str;
    }

    public final void setCalledAET(String str) {
        if (str.length() <= 16) {
            this.calledAET = str;
            return;
        }
        throw new IllegalArgumentException("calledAET: " + str);
    }

    public final void setCallingAET(String str) {
        if (str.length() <= 16) {
            this.callingAET = str;
            return;
        }
        throw new IllegalArgumentException("callingAET: " + str);
    }

    public final void setImplClassUID(String str) {
        str.getClass();
        this.implClassUID = str;
    }

    public final void setImplVersionName(String str) {
        this.implVersionName = str;
    }

    public final void setMaxOpsInvoked(int i4) {
        this.maxOpsInvoked = i4;
    }

    public final void setMaxOpsPerformed(int i4) {
        this.maxOpsPerformed = i4;
    }

    public final void setMaxPDULength(int i4) {
        this.maxPDULength = i4;
    }

    public final void setProtocolVersion(int i4) {
        this.protocolVersion = i4;
    }

    public final void setReservedBytes(byte[] bArr) {
        if (bArr.length == 32) {
            System.arraycopy(bArr, 0, this.reservedBytes, 0, 32);
            return;
        }
        throw new IllegalArgumentException("reservedBytes.length: " + bArr.length);
    }

    public void setUserIdentityAC(UserIdentityAC userIdentityAC) {
        this.userIdentityAC = userIdentityAC;
    }

    public void setUserIdentityRQ(UserIdentityRQ userIdentityRQ) {
        this.userIdentityRQ = userIdentityRQ;
    }

    public int userInfoLength() {
        int length = this.implClassUID.length() + 4 + 8;
        if (isAsyncOps()) {
            length += 8;
        }
        Iterator<RoleSelection> it = this.roleSelMap.values().iterator();
        while (it.hasNext()) {
            length += it.next().length() + 4;
        }
        String str = this.implVersionName;
        if (str != null) {
            length += str.length() + 4;
        }
        Iterator<ExtendedNegotiation> it2 = this.extNegMap.values().iterator();
        while (it2.hasNext()) {
            length += it2.next().length() + 4;
        }
        Iterator<CommonExtendedNegotiation> it3 = this.commonExtNegMap.values().iterator();
        while (it3.hasNext()) {
            length += it3.next().length() + 4;
        }
        UserIdentityRQ userIdentityRQ = this.userIdentityRQ;
        if (userIdentityRQ != null) {
            length += userIdentityRQ.length() + 4;
        }
        UserIdentityAC userIdentityAC = this.userIdentityAC;
        return userIdentityAC != null ? length + userIdentityAC.length() + 4 : length;
    }
}
