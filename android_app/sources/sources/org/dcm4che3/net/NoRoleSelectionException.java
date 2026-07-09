package org.dcm4che3.net;

import java.io.IOException;
import org.dcm4che3.net.TransferCapability;
import org.dcm4che3.util.UIDUtils;

/* JADX INFO: loaded from: classes.dex */
public class NoRoleSelectionException extends IOException {
    private static final long serialVersionUID = -8725680403033100521L;

    public NoRoleSelectionException(String str, TransferCapability.Role role) {
        super(toMessage(str, role));
    }

    private static String toMessage(String str, TransferCapability.Role role) {
        StringBuilder sb = new StringBuilder();
        sb.append("No Role Selection for SOP Class ");
        UIDUtils.promptTo(str, sb);
        sb.append(" as ");
        sb.append(role);
        sb.append(" negotiated");
        return sb.toString();
    }
}
