package org.dcm4che3.net.pdu;

import java.io.IOException;
import org.dcm4che3.util.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class AAssociateRJ extends IOException {
    private static final String[][] REASONS;
    public static final int REASON_APP_CTX_NAME_NOT_SUPPORTED = 2;
    public static final int REASON_CALLED_AET_NOT_RECOGNIZED = 7;
    public static final int REASON_CALLING_AET_NOT_RECOGNIZED = 3;
    public static final int REASON_LOCAL_LIMIT_EXCEEDED = 2;
    public static final int REASON_NO_REASON_GIVEN = 1;
    public static final int REASON_PROTOCOL_VERSION_NOT_SUPPORTED = 2;
    public static final int REASON_TEMPORARY_CONGESTION = 1;
    public static final int RESULT_REJECTED_PERMANENT = 1;
    public static final int RESULT_REJECTED_TRANSIENT = 2;
    private static final String[] SERVICE_PROVIDER_ACSE_REASONS;
    private static final String[] SERVICE_PROVIDER_PRES_REASONS;
    private static final String[] SERVICE_USER_REASONS;
    public static final int SOURCE_SERVICE_PROVIDER_ACSE = 2;
    public static final int SOURCE_SERVICE_PROVIDER_PRES = 3;
    public static final int SOURCE_SERVICE_USER = 1;
    private static final long serialVersionUID = 6390401944858894694L;
    private final int reason;
    private final int result;
    private final int source;
    private static final String[] RESULTS = {"0", "1 - rejected-permanent", "2 - rejected-transient"};
    private static final String[] SOURCES = {"0", "1 - service-user", "2 - service-provider (ACSE related function)", "3 - service-provider (Presentation related function)"};

    static {
        String[] strArr = {"0", "1 - no-reason-given]", "2 - application-context-name-not-supported", "3 - calling-AE-title-not-recognized", "4", "5", "6", "7 - called-AE-title-not-recognized]"};
        SERVICE_USER_REASONS = strArr;
        String[] strArr2 = {"0", "1 - no-reason-given", "2 - protocol-version-not-supported"};
        SERVICE_PROVIDER_ACSE_REASONS = strArr2;
        String[] strArr3 = {"0", "1 - temporary-congestion]", "2 - local-limit-exceeded]"};
        SERVICE_PROVIDER_PRES_REASONS = strArr3;
        REASONS = new String[][]{StringUtils.EMPTY_STRING, strArr, strArr2, strArr3};
    }

    public AAssociateRJ(int i4, int i5, int i6) {
        super("A-ASSOCIATE-RJ[result: " + toString(RESULTS, i4) + ", source: " + toString(SOURCES, i5) + ", reason: " + toReason(i5, i6) + ']');
        this.result = i4;
        this.source = i5;
        this.reason = i6;
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

    public final int getResult() {
        return this.result;
    }

    public final int getSource() {
        return this.source;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }

    private static String toString(String[] strArr, int i4) {
        try {
            return strArr[i4];
        } catch (IndexOutOfBoundsException unused) {
            return Integer.toString(i4);
        }
    }
}
