package o1;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import c.g0;
import c.j0;
import c.k0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class c<D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0089c<D> f9885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b<D> f9886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f9887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9888e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9889f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9890g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9891h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9892i = false;

    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z3) {
            c.this.p();
        }
    }

    public interface b<D> {
        void a(@j0 c<D> cVar);
    }

    /* JADX INFO: renamed from: o1.c$c, reason: collision with other inner class name */
    public interface InterfaceC0089c<D> {
        void a(@j0 c<D> cVar, @k0 D d4);
    }

    public c(@j0 Context context) {
        this.f9887d = context.getApplicationContext();
    }

    public boolean A() {
        boolean z3 = this.f9891h;
        this.f9891h = false;
        this.f9892i |= z3;
        return z3;
    }

    @g0
    public void B(@j0 InterfaceC0089c<D> interfaceC0089c) {
        InterfaceC0089c<D> interfaceC0089c2 = this.f9885b;
        if (interfaceC0089c2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0089c2 != interfaceC0089c) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f9885b = null;
    }

    @g0
    public void C(@j0 b<D> bVar) {
        b<D> bVar2 = this.f9886c;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f9886c = null;
    }

    @g0
    public void a() {
        this.f9889f = true;
        n();
    }

    @g0
    public boolean b() {
        return o();
    }

    public void c() {
        this.f9892i = false;
    }

    @j0
    public String d(@k0 D d4) {
        StringBuilder sb = new StringBuilder(64);
        u0.c.a(d4, sb);
        sb.append("}");
        return sb.toString();
    }

    @g0
    public void e() {
        b<D> bVar = this.f9886c;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @g0
    public void f(@k0 D d4) {
        InterfaceC0089c<D> interfaceC0089c = this.f9885b;
        if (interfaceC0089c != null) {
            interfaceC0089c.a(this, d4);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f9884a);
        printWriter.print(" mListener=");
        printWriter.println(this.f9885b);
        if (this.f9888e || this.f9891h || this.f9892i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f9888e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f9891h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f9892i);
        }
        if (this.f9889f || this.f9890g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f9889f);
            printWriter.print(" mReset=");
            printWriter.println(this.f9890g);
        }
    }

    @g0
    public void h() {
        q();
    }

    @j0
    public Context i() {
        return this.f9887d;
    }

    public int j() {
        return this.f9884a;
    }

    public boolean k() {
        return this.f9889f;
    }

    public boolean l() {
        return this.f9890g;
    }

    public boolean m() {
        return this.f9888e;
    }

    @g0
    public void n() {
    }

    @g0
    public boolean o() {
        return false;
    }

    @g0
    public void p() {
        if (this.f9888e) {
            h();
        } else {
            this.f9891h = true;
        }
    }

    @g0
    public void q() {
    }

    @g0
    public void r() {
    }

    @g0
    public void s() {
    }

    @g0
    public void t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        u0.c.a(this, sb);
        sb.append(" id=");
        sb.append(this.f9884a);
        sb.append("}");
        return sb.toString();
    }

    @g0
    public void u(int i4, @j0 InterfaceC0089c<D> interfaceC0089c) {
        if (this.f9885b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f9885b = interfaceC0089c;
        this.f9884a = i4;
    }

    @g0
    public void v(@j0 b<D> bVar) {
        if (this.f9886c != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f9886c = bVar;
    }

    @g0
    public void w() {
        r();
        this.f9890g = true;
        this.f9888e = false;
        this.f9889f = false;
        this.f9891h = false;
        this.f9892i = false;
    }

    public void x() {
        if (this.f9892i) {
            p();
        }
    }

    @g0
    public final void y() {
        this.f9888e = true;
        this.f9890g = false;
        this.f9889f = false;
        s();
    }

    @g0
    public void z() {
        this.f9888e = false;
        t();
    }
}
