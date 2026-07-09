package n1;

import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.l;
import c.g0;
import c.j0;
import c.k0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o1.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: n1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0083a<D> {
        @g0
        void a(@j0 c<D> cVar);

        @g0
        @j0
        c<D> b(int i4, @k0 Bundle bundle);

        @g0
        void c(@j0 c<D> cVar, D d4);
    }

    public static void c(boolean z3) {
        b.f8963d = z3;
    }

    @j0
    public static <T extends l & b0> a d(@j0 T t4) {
        return new b(t4, t4.n());
    }

    @g0
    public abstract void a(int i4);

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @k0
    public abstract <D> c<D> e(int i4);

    public boolean f() {
        return false;
    }

    @g0
    @j0
    public abstract <D> c<D> g(int i4, @k0 Bundle bundle, @j0 InterfaceC0083a<D> interfaceC0083a);

    public abstract void h();

    @g0
    @j0
    public abstract <D> c<D> i(int i4, @k0 Bundle bundle, @j0 InterfaceC0083a<D> interfaceC0083a);
}
