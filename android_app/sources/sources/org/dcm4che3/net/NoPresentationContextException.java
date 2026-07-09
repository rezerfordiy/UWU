package org.dcm4che3.net;

import java.io.IOException;
import org.dcm4che3.util.UIDUtils;

/* JADX INFO: loaded from: classes.dex */
public class NoPresentationContextException extends IOException {
    private static final long serialVersionUID = 2724320651716449165L;

    public NoPresentationContextException(String str) {
        super(toMessage(str));
    }

    private static String toMessage(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("No Presentation Context for Abstract Syntax: ");
        UIDUtils.promptTo(str, sb);
        sb.append(" negotiated");
        return sb.toString();
    }

    public NoPresentationContextException(String str, String str2) {
        super(toMessage(str, str2));
    }

    private static String toMessage(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("No Presentation Context for Abstract Syntax: ");
        UIDUtils.promptTo(str, sb);
        sb.append(" with Transfer Syntax: ");
        UIDUtils.promptTo(str2, sb);
        sb.append(" negotiated");
        return sb.toString();
    }
}
