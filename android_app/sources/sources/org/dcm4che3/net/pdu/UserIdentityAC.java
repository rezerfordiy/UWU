package org.dcm4che3.net.pdu;

import org.dcm4che3.util.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class UserIdentityAC {
    private final byte[] serverResponse;

    public UserIdentityAC(byte[] bArr) {
        this.serverResponse = (byte[]) bArr.clone();
    }

    public final byte[] getServerResponse() {
        return (byte[]) this.serverResponse.clone();
    }

    public int length() {
        return this.serverResponse.length + 2;
    }

    public StringBuilder promptTo(StringBuilder sb) {
        sb.append("  UserIdentity[");
        sb.append(StringUtils.LINE_SEPARATOR);
        sb.append("    serverResponse: byte[");
        sb.append(this.serverResponse.length);
        sb.append(']');
        sb.append(StringUtils.LINE_SEPARATOR);
        sb.append("  ]");
        return sb;
    }

    public String toString() {
        return promptTo(new StringBuilder()).toString();
    }
}
