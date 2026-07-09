package z;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12848a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12849b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12850c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12851d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12852e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f12853f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f12854g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f12855h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f12856i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f12857j = 16;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f12858k = 32;

    @j0
    public static String a(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 4 ? i4 != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @j0
    public static String b(int i4) {
        StringBuilder sb = new StringBuilder();
        String str = "[";
        while (true) {
            sb.append(str);
            while (i4 > 0) {
                int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i4);
                i4 &= ~iNumberOfTrailingZeros;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                if (iNumberOfTrailingZeros == 1) {
                    str = "FEEDBACK_SPOKEN";
                } else if (iNumberOfTrailingZeros == 2) {
                    str = "FEEDBACK_HAPTIC";
                } else if (iNumberOfTrailingZeros == 4) {
                    str = "FEEDBACK_AUDIBLE";
                } else if (iNumberOfTrailingZeros == 8) {
                    str = "FEEDBACK_VISUAL";
                } else if (iNumberOfTrailingZeros == 16) {
                    str = "FEEDBACK_GENERIC";
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    @k0
    public static String c(int i4) {
        if (i4 == 1) {
            return "DEFAULT";
        }
        if (i4 == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (i4 == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i4 == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i4 == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i4 != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }

    public static int d(@j0 AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @k0
    public static String e(@j0 AccessibilityServiceInfo accessibilityServiceInfo, @j0 PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}
