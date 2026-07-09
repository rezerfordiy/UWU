package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StringBuilder f3839b = new StringBuilder(128);

    public b0(String str) {
        this.f3838a = str;
    }

    public final void a() {
        if (this.f3839b.length() > 0) {
            Log.d(this.f3838a, this.f3839b.toString());
            StringBuilder sb = this.f3839b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i4, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            char c4 = cArr[i4 + i6];
            if (c4 == '\n') {
                a();
            } else {
                this.f3839b.append(c4);
            }
        }
    }
}
