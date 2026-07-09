package org.dcm4che3.net.pdu;

import java.io.UnsupportedEncodingException;
import org.dcm4che3.util.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class UserIdentityRQ {
    public static final int KERBEROS = 3;
    public static final int SAML = 4;
    private static final String[] TYPES = {"0", "1 - Username", "2 - Username and passcode", "3 - Kerberos Service ticket", "4 - SAML Assertion"};
    public static final int USERNAME = 1;
    public static final int USERNAME_PASSCODE = 2;
    private final byte[] primaryField;
    private final boolean rspReq;
    private final byte[] secondaryField;
    private final int type;

    public UserIdentityRQ(int i4, boolean z3, byte[] bArr) {
        this(i4, z3, bArr, null);
    }

    private static byte[] toBytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e4) {
            throw new Error(e4);
        }
    }

    private static String typeAsString(int i4) {
        try {
            return TYPES[i4];
        } catch (IndexOutOfBoundsException unused) {
            return Integer.toString(i4);
        }
    }

    public final char[] getPasscode() {
        return toString(this.secondaryField).toCharArray();
    }

    public final byte[] getPrimaryField() {
        return (byte[]) this.primaryField.clone();
    }

    public final byte[] getSecondaryField() {
        return (byte[]) this.secondaryField.clone();
    }

    public final int getType() {
        return this.type;
    }

    public final String getUsername() {
        return toString(this.primaryField);
    }

    public final boolean isPositiveResponseRequested() {
        return this.rspReq;
    }

    public int length() {
        return this.primaryField.length + 6 + this.secondaryField.length;
    }

    public StringBuilder promptTo(StringBuilder sb) {
        sb.append("  UserIdentity[");
        sb.append(StringUtils.LINE_SEPARATOR);
        sb.append("    type: ");
        sb.append(typeAsString(this.type));
        sb.append(StringUtils.LINE_SEPARATOR);
        int i4 = this.type;
        if (i4 == 1 || i4 == 2) {
            sb.append("    username: ");
            sb.append(getUsername());
        } else {
            sb.append("    primaryField: byte[");
            sb.append(this.primaryField.length);
            sb.append(']');
        }
        if (this.type == 2) {
            sb.append(StringUtils.LINE_SEPARATOR);
            sb.append("    passcode: ");
            int length = this.secondaryField.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                sb.append('*');
            }
        } else if (this.secondaryField.length > 0) {
            sb.append(StringUtils.LINE_SEPARATOR);
            sb.append("    secondaryField: byte[");
            sb.append(this.secondaryField.length);
            sb.append(']');
        }
        sb.append(StringUtils.LINE_SEPARATOR);
        sb.append("  ]");
        return sb;
    }

    public String toString() {
        return promptTo(new StringBuilder()).toString();
    }

    public UserIdentityRQ(int i4, boolean z3, byte[] bArr, byte[] bArr2) {
        this.type = i4;
        this.rspReq = z3;
        this.primaryField = (byte[]) bArr.clone();
        this.secondaryField = bArr2 != null ? (byte[]) bArr2.clone() : new byte[0];
    }

    private static String toString(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e4) {
            throw new Error(e4);
        }
    }

    public UserIdentityRQ(String str, boolean z3) {
        this(1, z3, toBytes(str));
    }

    public UserIdentityRQ(String str, char[] cArr) {
        this(2, true, toBytes(str), toBytes(new String(cArr)));
    }
}
