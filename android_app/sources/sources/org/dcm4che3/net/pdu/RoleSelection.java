package org.dcm4che3.net.pdu;

import org.dcm4che3.util.StringUtils;
import org.dcm4che3.util.UIDUtils;

/* JADX INFO: loaded from: classes.dex */
public class RoleSelection {
    private final String cuid;
    private final boolean scp;
    private final boolean scu;

    public RoleSelection(String str, boolean z3, boolean z4) {
        str.getClass();
        this.cuid = str;
        this.scu = z3;
        this.scp = z4;
    }

    public final String getSOPClassUID() {
        return this.cuid;
    }

    public final boolean isSCP() {
        return this.scp;
    }

    public final boolean isSCU() {
        return this.scu;
    }

    public int length() {
        return this.cuid.length() + 4;
    }

    public StringBuilder promptTo(StringBuilder sb) {
        sb.append("  RoleSelection[");
        sb.append(StringUtils.LINE_SEPARATOR);
        sb.append("    sopClass: ");
        StringBuilder sbPromptTo = UIDUtils.promptTo(this.cuid, sb);
        sbPromptTo.append(StringUtils.LINE_SEPARATOR);
        sbPromptTo.append("    scu: ");
        sbPromptTo.append(this.scu);
        sbPromptTo.append(StringUtils.LINE_SEPARATOR);
        sbPromptTo.append("    scp: ");
        sbPromptTo.append(this.scp);
        sbPromptTo.append(StringUtils.LINE_SEPARATOR);
        sbPromptTo.append("  ]");
        return sbPromptTo;
    }

    public String toString() {
        return promptTo(new StringBuilder()).toString();
    }
}
