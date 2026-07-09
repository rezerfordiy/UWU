package org.dcm4che3.net.pdu;

import org.dcm4che3.util.StringUtils;
import org.dcm4che3.util.UIDUtils;

/* JADX INFO: loaded from: classes.dex */
public class CommonExtendedNegotiation {
    private final String[] relSopCUIDs;
    private final String serviceCUID;
    private final String sopCUID;

    public CommonExtendedNegotiation(String str, String str2, String... strArr) {
        if (str == null) {
            throw new NullPointerException("sopCUID");
        }
        if (str2 == null) {
            throw new NullPointerException("serviceCUID");
        }
        this.sopCUID = str;
        this.serviceCUID = str2;
        this.relSopCUIDs = strArr;
    }

    public String[] getRelatedGeneralSOPClassUIDs() {
        return this.relSopCUIDs;
    }

    public int getRelatedGeneralSOPClassUIDsLength() {
        int length = 0;
        for (String str : this.relSopCUIDs) {
            length += str.length() + 2;
        }
        return length;
    }

    public final String getSOPClassUID() {
        return this.sopCUID;
    }

    public final String getServiceClassUID() {
        return this.serviceCUID;
    }

    public int length() {
        return this.sopCUID.length() + 6 + this.serviceCUID.length() + getRelatedGeneralSOPClassUIDsLength();
    }

    public StringBuilder promptTo(StringBuilder sb) {
        sb.append("  CommonExtendedNegotiation[");
        sb.append(StringUtils.LINE_SEPARATOR);
        sb.append("    sopClass: ");
        StringBuilder sbPromptTo = UIDUtils.promptTo(this.sopCUID, sb);
        sbPromptTo.append(StringUtils.LINE_SEPARATOR);
        sbPromptTo.append("    serviceClass: ");
        UIDUtils.promptTo(this.serviceCUID, sb).append(StringUtils.LINE_SEPARATOR);
        if (this.relSopCUIDs.length != 0) {
            sb.append("    relatedSOPClasses:");
            sb.append(StringUtils.LINE_SEPARATOR);
            for (String str : this.relSopCUIDs) {
                sb.append("      ");
                UIDUtils.promptTo(str, sb).append(StringUtils.LINE_SEPARATOR);
            }
        }
        sb.append("  ]");
        return sb;
    }

    public String toString() {
        return promptTo(new StringBuilder()).toString();
    }
}
