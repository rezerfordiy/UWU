package org.dcm4che3.net.pdu;

import java.io.IOException;
import org.dcm4che3.util.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class AAbort extends IOException {
    public static final int INVALID_PDU_PARAMETER_VALUE = 6;
    private static final String[][] REASONS;
    public static final int REASON_NOT_SPECIFIED = 0;
    private static final String[] SERVICE_PROVIDER_REASONS;
    private static final String[] SERVICE_USER_REASONS;
    private static final String[] SOURCES = {"0 - service-user", "1", "2 - service-provider"};
    public static final int UL_SERIVE_PROVIDER = 2;
    public static final int UL_SERIVE_USER = 0;
    public static final int UNEXPECTED_PDU = 2;
    public static final int UNEXPECTED_PDU_PARAMETER = 5;
    public static final int UNRECOGNIZED_PDU = 1;
    public static final int UNRECOGNIZED_PDU_PARAMETER = 4;
    private static final long serialVersionUID = -1825815767517748111L;
    private final int reason;
    private final int source;

    static {
        String[] strArr = {"0"};
        SERVICE_USER_REASONS = strArr;
        String[] strArr2 = {"0 - reason-not-specified", "1 - unrecognized-PDU", "2 - unexpected-PDU", "3", "4 - unrecognized-PDU-parameter", "5 - unexpected-PDU-parameter", "6 - invalid-PDU-parameter-value"};
        SERVICE_PROVIDER_REASONS = strArr2;
        REASONS = new String[][]{strArr, StringUtils.EMPTY_STRING, strArr2};
    }

    public AAbort() {
        this(0, 0);
    }

    private static String toReason(int i4, int i5) {
        try {
            return toString(REASONS[i4], i5);
        } catch (IndexOutOfBoundsException unused) {
            return Integer.toString(i5);
        }
    }

    public final int getReason() {
        return this.reason;
    }

    public final int getSource() {
        return this.source;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }

    public AAbort(int i4, int i5) {
        super("A-ABORT[source: " + toString(SOURCES, i4) + ", reason: " + toReason(i4, i5) + ']');
        this.source = i4;
        this.reason = i5;
    }

    private static String toString(String[] strArr, int i4) {
        try {
            return strArr[i4];
        } catch (IndexOutOfBoundsException unused) {
            return Integer.toString(i4);
        }
    }
}
