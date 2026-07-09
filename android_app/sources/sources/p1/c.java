package p1;

import android.os.Trace;
import c.j0;
import c.o0;

/* JADX INFO: loaded from: classes.dex */
@o0(18)
public final class c {
    public static void a(@j0 String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
