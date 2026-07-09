package o0;

import android.net.Uri;
import c.j0;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    @j0
    public static String a(@j0 Uri uri) {
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (scheme.equalsIgnoreCase("tel") || scheme.equalsIgnoreCase("sip") || scheme.equalsIgnoreCase("sms") || scheme.equalsIgnoreCase("smsto") || scheme.equalsIgnoreCase(c.f9857c) || scheme.equalsIgnoreCase("nfc")) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(scheme);
                sb.append(':');
                if (schemeSpecificPart != null) {
                    for (int i4 = 0; i4 < schemeSpecificPart.length(); i4++) {
                        char cCharAt = schemeSpecificPart.charAt(i4);
                        if (cCharAt != '-' && cCharAt != '@' && cCharAt != '.') {
                            cCharAt = 'x';
                        }
                        sb.append(cCharAt);
                    }
                }
                return sb.toString();
            }
            if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https") || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("//");
                String host = uri.getHost();
                String str = s0.a.f11071l;
                sb2.append(host != null ? uri.getHost() : s0.a.f11071l);
                if (uri.getPort() != -1) {
                    str = ":" + uri.getPort();
                }
                sb2.append(str);
                sb2.append("/...");
                schemeSpecificPart = sb2.toString();
            }
        }
        StringBuilder sb3 = new StringBuilder(64);
        if (scheme != null) {
            sb3.append(scheme);
            sb3.append(':');
        }
        if (schemeSpecificPart != null) {
            sb3.append(schemeSpecificPart);
        }
        return sb3.toString();
    }
}
