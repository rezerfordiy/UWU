package org.dcm4che3.net.pdu;

import org.dcm4che3.util.StringUtils;
import org.dcm4che3.util.UIDUtils;

/* JADX INFO: loaded from: classes.dex */
public class PresentationContext {
    public static final int ABSTRACT_SYNTAX_NOT_SUPPORTED = 3;
    public static final int ACCEPTANCE = 0;
    public static final int PROVIDER_REJECTION = 2;
    private static final String[] RESULTS = {"0 - acceptance", "1 - user-rejection", "2 - no-reason (provider rejection)", "3 - abstract-syntax-not-supported (provider rejection)", "4 - transfer-syntaxes-not-supported (provider rejection)"};
    public static final int TRANSFER_SYNTAX_NOT_SUPPORTED = 4;
    public static final int USER_REJECTION = 1;
    private final String as;
    private final int pcid;
    private final int result;
    private final String[] tss;

    public PresentationContext(int i4, int i5, String str) {
        this(i4, i5, null, str);
    }

    private static String resultAsString(int i4) {
        try {
            return RESULTS[i4];
        } catch (IndexOutOfBoundsException unused) {
            return Integer.toString(i4);
        }
    }

    public boolean containsTransferSyntax(String str) {
        for (String str2 : this.tss) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final String getAbstractSyntax() {
        return this.as;
    }

    public final int getPCID() {
        return this.pcid;
    }

    public final int getResult() {
        return this.result;
    }

    public String getTransferSyntax() {
        return this.tss[0];
    }

    public final String[] getTransferSyntaxes() {
        return this.tss;
    }

    public boolean isAccepted() {
        return this.result == 0;
    }

    public int length() {
        String str = this.as;
        int length = str != null ? str.length() + 4 + 4 : 4;
        for (String str2 : this.tss) {
            length += str2.length() + 4;
        }
        return length;
    }

    public StringBuilder promptTo(StringBuilder sb) {
        sb.append("  PresentationContext[id: ");
        sb.append(this.pcid);
        sb.append(StringUtils.LINE_SEPARATOR);
        String str = this.as;
        if (str != null) {
            sb.append("    as: ");
            UIDUtils.promptTo(str, sb);
        } else {
            sb.append("    result: ");
            sb.append(resultAsString(this.result));
        }
        sb.append(StringUtils.LINE_SEPARATOR);
        for (String str2 : this.tss) {
            sb.append("    ts: ");
            UIDUtils.promptTo(str2, sb).append(StringUtils.LINE_SEPARATOR);
        }
        sb.append("  ]");
        return sb;
    }

    public String toString() {
        return promptTo(new StringBuilder()).toString();
    }

    public PresentationContext(int i4, int i5, String str, String... strArr) {
        this.pcid = i4;
        this.result = i5;
        this.as = str;
        this.tss = strArr;
    }

    public PresentationContext(int i4, String str, String... strArr) {
        this(i4, 0, str, strArr);
    }
}
