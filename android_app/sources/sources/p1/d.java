package p1;

import android.os.Trace;
import c.j0;
import c.o0;

/* JADX INFO: loaded from: classes.dex */
@o0(29)
public final class d {
    public static void a(@j0 String str, int i4) {
        Trace.beginAsyncSection(str, i4);
    }

    public static void b(@j0 String str, int i4) {
        Trace.endAsyncSection(str, i4);
    }

    public static void c(@j0 String str, int i4) {
        Trace.setCounter(str, i4);
    }
}
