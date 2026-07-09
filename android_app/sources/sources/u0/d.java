package u0;

import android.util.Log;
import c.r0;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
@Deprecated
public class d extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StringBuilder f11559b = new StringBuilder(128);

    public d(String str) {
        this.f11558a = str;
    }

    public final void a() {
        if (this.f11559b.length() > 0) {
            Log.d(this.f11558a, this.f11559b.toString());
            StringBuilder sb = this.f11559b;
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
                this.f11559b.append(c4);
            }
        }
    }
}
