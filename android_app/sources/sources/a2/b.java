package a2;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static Bitmap a(int i4, int i5, byte[] bArr) {
        int[] iArr = new int[i4 * i5];
        for (int i6 = 0; i6 < i5; i6++) {
            for (int i7 = 0; i7 < i4; i7++) {
                byte b4 = bArr[(i6 * i4) + i7];
                iArr[(i7 * i5) + i6] = (b4 & 255) | ((b4 & 255) << 16) | z1.f12256t | ((b4 & 255) << 8);
            }
        }
        return Bitmap.createBitmap(iArr, i5, i4, Bitmap.Config.ARGB_8888);
    }

    public static byte[] b(Context context, String str) {
        String strE = e(context, str);
        ArrayList arrayList = new ArrayList();
        for (String str2 : strE.toString().split("[,\\n]")) {
            if (!a.e(str2)) {
                arrayList.add(Byte.valueOf((byte) (h(str2) & 255)));
            }
        }
        return i(arrayList);
    }

    public static Bitmap c(int i4, int i5, int[] iArr) {
        int[] iArr2 = new int[i4 * i5];
        for (int i6 = 0; i6 < i4; i6++) {
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = iArr[(i6 * i5) + i7];
                iArr2[(i7 * i4) + i6] = (i8 & 255) | ((i8 & 255) << 16) | z1.f12256t | ((i8 & 255) << 8);
            }
        }
        return Bitmap.createBitmap(iArr2, i4, i5, Bitmap.Config.ARGB_8888);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[LOOP:1: B:17:0x0078->B:18:0x007a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] d(android.content.Context r3, java.lang.String r4) {
        /*
            java.io.File r0 = new java.io.File
            r1 = 0
            java.io.File r3 = r3.getExternalFilesDir(r1)
            java.lang.String r2 = "data"
            r0.<init>(r3, r2)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L13
            return r1
        L13:
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = ".txt"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.<init>(r0, r4)
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            r0.<init>(r3)     // Catch: java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            r3.<init>(r0)     // Catch: java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            r1.<init>(r3)     // Catch: java.io.IOException -> L51 java.io.FileNotFoundException -> L53
        L3d:
            java.lang.String r2 = r1.readLine()     // Catch: java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            if (r2 == 0) goto L47
            r4.append(r2)     // Catch: java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            goto L3d
        L47:
            r1.close()     // Catch: java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            r3.close()     // Catch: java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            r0.close()     // Catch: java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            goto L57
        L51:
            r3 = move-exception
            goto L54
        L53:
            r3 = move-exception
        L54:
            r3.printStackTrace()
        L57:
            r3 = 0
            r0 = 1
            r4.delete(r3, r0)
            int r1 = r4.length()
            int r1 = r1 - r0
            int r0 = r4.length()
            r4.delete(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = "[,\\n]"
            java.lang.String[] r4 = r4.split(r1)
            int r1 = r4.length
        L78:
            if (r3 >= r1) goto L8e
            r2 = r4[r3]
            java.lang.String r2 = r2.trim()
            byte r2 = java.lang.Byte.parseByte(r2)
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r0.add(r2)
            int r3 = r3 + 1
            goto L78
        L8e:
            byte[] r3 = i(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.b.d(android.content.Context, java.lang.String):byte[]");
    }

    public static String e(Context context, String str) {
        InputStream inputStreamOpen;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            inputStreamOpen = context.getAssets().open(str);
            inputStreamReader = new InputStreamReader(inputStreamOpen);
            bufferedReader = new BufferedReader(inputStreamReader);
        } catch (FileNotFoundException | IOException e4) {
            e4.printStackTrace();
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            line.replace("\t", s0.a.f11071l);
            line.replace("\r\n", s0.a.f11071l);
            stringBuffer.append(line);
            return stringBuffer.toString();
        }
        bufferedReader.close();
        inputStreamReader.close();
        inputStreamOpen.close();
        return stringBuffer.toString();
    }

    public static void f(Context context, byte[] bArr, String str) {
        File file = new File(context.getExternalFilesDir(null), "data");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            new FileOutputStream(new File(file, str + ".txt")).write(Arrays.toString(bArr).getBytes());
        } catch (FileNotFoundException e4) {
            throw new RuntimeException(e4);
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static void g(Context context, int[] iArr, String str) {
        File file = new File(context.getExternalFilesDir(null), "data");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            new FileOutputStream(new File(file, str + ".txt")).write(Arrays.toString(iArr).getBytes());
        } catch (FileNotFoundException e4) {
            throw new RuntimeException(e4);
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static int h(String str) {
        String str2 = s0.a.f11071l;
        for (int i4 = 0; i4 < str.length(); i4++) {
            if (Character.isDigit(str.charAt(i4))) {
                str2 = str2 + str.charAt(i4);
            }
        }
        return Integer.parseInt(str2);
    }

    public static byte[] i(List<Byte> list) {
        byte[] bArr = new byte[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            bArr[i4] = list.get(i4).byteValue();
        }
        return bArr;
    }
}
