package k2;

import android.content.Context;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* JADX INFO: loaded from: classes.dex */
public class a implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f8362a = Thread.getDefaultUncaughtExceptionHandler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f8363b;

    /* JADX INFO: renamed from: k2.a$a, reason: collision with other inner class name */
    public class RunnableC0070a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InputStream f8364b;

        public RunnableC0070a(InputStream inputStream) {
            this.f8364b = inputStream;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|60|3|(1:5)|6|7|62|8|(4:(5:9|(1:11)(1:64)|54|16|69)|54|16|69)|12|58|13|14|(1:39)|(1:(0))) */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() throws java.lang.Throwable {
            /*
                r5 = this;
                r0 = 0
                java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                k2.a r2 = k2.a.this     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                android.content.Context r2 = k2.a.a(r2)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                java.io.File r2 = r2.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                java.lang.String r3 = "crash"
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                if (r2 != 0) goto L1b
                r1.mkdirs()     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
            L1b:
                java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                java.lang.String r3 = "yyyy-MM-dd HH:mm:ss"
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                java.util.Date r3 = new java.util.Date     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                r3.<init>()     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                java.lang.String r2 = r2.format(r3)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                r3.<init>()     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                r3.append(r2)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                java.lang.String r2 = ".txt"
                r3.append(r2)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L7b java.io.FileNotFoundException -> L85
                r0 = 1024(0x400, float:1.435E-42)
                byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69 java.io.FileNotFoundException -> L6b
            L4a:
                java.io.InputStream r1 = r5.f8364b     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69 java.io.FileNotFoundException -> L6b
                int r1 = r1.read(r0)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69 java.io.FileNotFoundException -> L6b
                r2 = -1
                if (r1 == r2) goto L58
                r2 = 0
                r3.write(r0, r2, r1)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69 java.io.FileNotFoundException -> L6b
                goto L4a
            L58:
                r3.flush()     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69 java.io.FileNotFoundException -> L6b
                r3.close()     // Catch: java.io.IOException -> L5e
            L5e:
                java.io.InputStream r0 = r5.f8364b
                if (r0 == 0) goto L8f
            L62:
                r0.close()     // Catch: java.io.IOException -> L8f
                goto L8f
            L66:
                r1 = move-exception
                r0 = r3
                goto L6e
            L69:
                r0 = r3
                goto L7b
            L6b:
                r0 = r3
                goto L85
            L6d:
                r1 = move-exception
            L6e:
                if (r0 == 0) goto L73
                r0.close()     // Catch: java.io.IOException -> L73
            L73:
                java.io.InputStream r0 = r5.f8364b
                if (r0 == 0) goto L7a
                r0.close()     // Catch: java.io.IOException -> L7a
            L7a:
                throw r1
            L7b:
                if (r0 == 0) goto L80
                r0.close()     // Catch: java.io.IOException -> L80
            L80:
                java.io.InputStream r0 = r5.f8364b
                if (r0 == 0) goto L8f
                goto L62
            L85:
                if (r0 == 0) goto L8a
                r0.close()     // Catch: java.io.IOException -> L8a
            L8a:
                java.io.InputStream r0 = r5.f8364b
                if (r0 == 0) goto L8f
                goto L62
            L8f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k2.a.RunnableC0070a.run():void");
        }
    }

    public a(Context context) {
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.f8363b = context;
    }

    public final void b(InputStream inputStream) {
        new Thread(new RunnableC0070a(inputStream)).start();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        String str = Build.BRAND;
        String str2 = Build.MODEL;
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        b(new ByteArrayInputStream(stringWriter.toString().getBytes()));
        this.f8362a.uncaughtException(thread, th);
    }
}
