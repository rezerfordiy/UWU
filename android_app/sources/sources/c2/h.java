package c2;

import android.os.Handler;
import android.os.Message;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public class h {

    public class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparable f4692a;

        public a(Comparable comparable) {
            this.f4692a = comparable;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Comparable comparable = this.f4692a;
            if (comparable != null) {
                comparable.compareTo(Boolean.valueOf(message.arg1 == 0));
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f4693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Handler f4694c;

        public b(String str, Handler handler) {
            this.f4693b = str;
            this.f4694c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runtime runtime = Runtime.getRuntime();
            Message message = new Message();
            try {
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(runtime.exec("/system/bin/ping -c 1 " + this.f4693b).getInputStream());
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    if (bufferedReader.readLine() == null) {
                        message.arg1 = -1;
                    } else {
                        message.arg1 = 0;
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                } catch (Exception e4) {
                    message.arg1 = -1;
                    e4.printStackTrace();
                }
            } finally {
                runtime.gc();
                this.f4694c.sendMessage(message);
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f4697c;
    }

    public static void a(String str, Comparable<Boolean> comparable) {
        new Thread(new b(str, new a(comparable))).start();
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0068: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:27:0x0068 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c2.h.c b(java.lang.String r6) throws java.lang.Throwable {
        /*
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55 java.lang.InterruptedException -> L57 java.io.IOException -> L59
            r2.<init>()     // Catch: java.lang.Throwable -> L55 java.lang.InterruptedException -> L57 java.io.IOException -> L59
            java.lang.String r3 = "ping -c 5 -w 4 "
            r2.append(r3)     // Catch: java.lang.Throwable -> L55 java.lang.InterruptedException -> L57 java.io.IOException -> L59
            r2.append(r6)     // Catch: java.lang.Throwable -> L55 java.lang.InterruptedException -> L57 java.io.IOException -> L59
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L55 java.lang.InterruptedException -> L57 java.io.IOException -> L59
            java.lang.Process r2 = r0.exec(r2)     // Catch: java.lang.Throwable -> L55 java.lang.InterruptedException -> L57 java.io.IOException -> L59
            java.io.InputStream r3 = r2.getInputStream()     // Catch: java.lang.InterruptedException -> L51 java.io.IOException -> L53 java.lang.Throwable -> L67
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.InterruptedException -> L51 java.io.IOException -> L53 java.lang.Throwable -> L67
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.InterruptedException -> L51 java.io.IOException -> L53 java.lang.Throwable -> L67
            r5.<init>(r3)     // Catch: java.lang.InterruptedException -> L51 java.io.IOException -> L53 java.lang.Throwable -> L67
            r4.<init>(r5)     // Catch: java.lang.InterruptedException -> L51 java.io.IOException -> L53 java.lang.Throwable -> L67
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch: java.lang.InterruptedException -> L51 java.io.IOException -> L53 java.lang.Throwable -> L67
            r3.<init>()     // Catch: java.lang.InterruptedException -> L51 java.io.IOException -> L53 java.lang.Throwable -> L67
        L2d:
            java.lang.String r5 = r4.readLine()     // Catch: java.lang.InterruptedException -> L51 java.io.IOException -> L53 java.lang.Throwable -> L67
            if (r5 == 0) goto L37
            r3.append(r5)     // Catch: java.lang.InterruptedException -> L51 java.io.IOException -> L53 java.lang.Throwable -> L67
            goto L2d
        L37:
            int r4 = r2.waitFor()     // Catch: java.lang.InterruptedException -> L51 java.io.IOException -> L53 java.lang.Throwable -> L67
            c2.h$c r5 = new c2.h$c     // Catch: java.lang.InterruptedException -> L51 java.io.IOException -> L53 java.lang.Throwable -> L67
            r5.<init>()     // Catch: java.lang.InterruptedException -> L51 java.io.IOException -> L53 java.lang.Throwable -> L67
            r5.f4695a = r6     // Catch: java.lang.InterruptedException -> L51 java.io.IOException -> L53 java.lang.Throwable -> L67
            java.lang.String r6 = r3.toString()     // Catch: java.lang.InterruptedException -> L51 java.io.IOException -> L53 java.lang.Throwable -> L67
            r5.f4697c = r6     // Catch: java.lang.InterruptedException -> L51 java.io.IOException -> L53 java.lang.Throwable -> L67
            r5.f4696b = r4     // Catch: java.lang.InterruptedException -> L51 java.io.IOException -> L53 java.lang.Throwable -> L67
            r2.destroy()
            r0.gc()
            return r5
        L51:
            r6 = move-exception
            goto L5b
        L53:
            r6 = move-exception
            goto L5b
        L55:
            r6 = move-exception
            goto L69
        L57:
            r6 = move-exception
            goto L5a
        L59:
            r6 = move-exception
        L5a:
            r2 = r1
        L5b:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L63
            r2.destroy()
        L63:
            r0.gc()
            return r1
        L67:
            r6 = move-exception
            r1 = r2
        L69:
            if (r1 == 0) goto L6e
            r1.destroy()
        L6e:
            r0.gc()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.h.b(java.lang.String):c2.h$c");
    }
}
