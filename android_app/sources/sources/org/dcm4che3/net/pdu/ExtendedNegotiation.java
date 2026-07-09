package org.dcm4che3.net.pdu;

import org.dcm4che3.util.StringUtils;
import org.dcm4che3.util.UIDUtils;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedNegotiation {
    private final String cuid;
    private final byte[] info;

    public ExtendedNegotiation(String str, byte[] bArr) {
        str.getClass();
        this.cuid = str;
        this.info = (byte[]) bArr.clone();
    }

    public final byte getField(int i4, byte b4) {
        byte[] bArr = this.info;
        return i4 < bArr.length ? bArr[i4] : b4;
    }

    public final byte[] getInformation() {
        return (byte[]) this.info.clone();
    }

    public final String getSOPClassUID() {
        return this.cuid;
    }

    public int length() {
        return this.cuid.length() + this.info.length + 2;
    }

    public StringBuilder promptTo(StringBuilder sb) {
        sb.append("  ExtendedNegotiation[");
        sb.append(StringUtils.LINE_SEPARATOR);
        sb.append("    sopClass: ");
        StringBuilder sbPromptTo = UIDUtils.promptTo(this.cuid, sb);
        sbPromptTo.append(StringUtils.LINE_SEPARATOR);
        sbPromptTo.append("    info: [");
        for (byte b4 : this.info) {
            sb.append((int) b4);
            sb.append(", ");
        }
        sb.append(']');
        sb.append(StringUtils.LINE_SEPARATOR);
        sb.append("  ]");
        return sb;
    }

    public String toString() {
        return promptTo(new StringBuilder()).toString();
    }
}
