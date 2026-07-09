package c0;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    @c.o0(28)
    public static class a {
        @c.k0
        public static Signature[] a(@c.j0 SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        @c.k0
        public static Signature[] b(@c.j0 SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        public static boolean c(@c.j0 SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        public static boolean d(@c.j0 PackageManager packageManager, @c.j0 String str, @c.j0 byte[] bArr, int i4) {
            return packageManager.hasSigningCertificate(str, bArr, i4);
        }
    }

    public static boolean a(@c.j0 byte[][] bArr, @c.j0 byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            if (Arrays.equals(bArr2, bArr3)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] b(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e4);
        }
    }

    public static long c(@c.j0 PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    @c.j0
    public static List<Signature> d(@c.j0 PackageManager packageManager, @c.j0 String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArrA;
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
            signatureArrA = a.c(signingInfo) ? a.a(signingInfo) : a.b(signingInfo);
        } else {
            signatureArrA = packageManager.getPackageInfo(str, 64).signatures;
        }
        return signatureArrA == null ? Collections.emptyList() : Arrays.asList(signatureArrA);
    }

    public static boolean e(@c.j0 PackageManager packageManager, @c.j0 String str, @c.s0(min = 1) @c.j0 Map<byte[], Integer> map, boolean z3) throws PackageManager.NameNotFoundException {
        byte[][] bArr;
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> setKeySet = map.keySet();
        for (byte[] bArr2 : setKeySet) {
            if (bArr2 == null) {
                throw new IllegalArgumentException("Cert byte array cannot be null when verifying " + str);
            }
            Integer num = map.get(bArr2);
            if (num == null) {
                throw new IllegalArgumentException("Type must be specified for cert when verifying " + str);
            }
            int iIntValue = num.intValue();
            if (iIntValue != 0 && iIntValue != 1) {
                throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
            }
        }
        List<Signature> listD = d(packageManager, str);
        if (!z3 && Build.VERSION.SDK_INT >= 28) {
            for (byte[] bArr3 : setKeySet) {
                if (!a.d(packageManager, str, bArr3, map.get(bArr3).intValue())) {
                    return false;
                }
            }
            return true;
        }
        if (listD.size() != 0 && map.size() <= listD.size() && (!z3 || map.size() == listD.size())) {
            if (map.containsValue(1)) {
                bArr = new byte[listD.size()][];
                for (int i4 = 0; i4 < listD.size(); i4++) {
                    bArr[i4] = b(listD.get(i4).toByteArray());
                }
            } else {
                bArr = null;
            }
            Iterator<byte[]> it = setKeySet.iterator();
            if (it.hasNext()) {
                byte[] next = it.next();
                Integer num2 = map.get(next);
                int iIntValue2 = num2.intValue();
                if (iIntValue2 != 0) {
                    if (iIntValue2 != 1) {
                        throw new IllegalArgumentException("Unsupported certificate type " + num2);
                    }
                    if (!a(bArr, next)) {
                        return false;
                    }
                } else if (!listD.contains(new Signature(next))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
