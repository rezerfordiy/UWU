package n1;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.l;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import c.g0;
import c.j0;
import c.k0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import n1.a;
import o1.c;
import p.j;

/* JADX INFO: loaded from: classes.dex */
public class b extends n1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f8962c = "LoaderManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f8963d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @j0
    public final l f8964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @j0
    public final c f8965b;

    public static class a<D> extends q<D> implements c.InterfaceC0089c<D> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f8966m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @k0
        public final Bundle f8967n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @j0
        public final o1.c<D> f8968o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public l f8969p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public C0084b<D> f8970q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public o1.c<D> f8971r;

        public a(int i4, @k0 Bundle bundle, @j0 o1.c<D> cVar, @k0 o1.c<D> cVar2) {
            this.f8966m = i4;
            this.f8967n = bundle;
            this.f8968o = cVar;
            this.f8971r = cVar2;
            cVar.u(i4, this);
        }

        @Override // o1.c.InterfaceC0089c
        public void a(@j0 o1.c<D> cVar, @k0 D d4) {
            if (b.f8963d) {
                Log.v(b.f8962c, "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                q(d4);
                return;
            }
            if (b.f8963d) {
                Log.w(b.f8962c, "onLoadComplete was incorrectly called on a background thread");
            }
            n(d4);
        }

        @Override // androidx.lifecycle.LiveData
        public void l() {
            if (b.f8963d) {
                Log.v(b.f8962c, "  Starting: " + this);
            }
            this.f8968o.y();
        }

        @Override // androidx.lifecycle.LiveData
        public void m() {
            if (b.f8963d) {
                Log.v(b.f8962c, "  Stopping: " + this);
            }
            this.f8968o.z();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void o(@j0 r<? super D> rVar) {
            super.o(rVar);
            this.f8969p = null;
            this.f8970q = null;
        }

        @Override // androidx.lifecycle.q, androidx.lifecycle.LiveData
        public void q(D d4) {
            super.q(d4);
            o1.c<D> cVar = this.f8971r;
            if (cVar != null) {
                cVar.w();
                this.f8971r = null;
            }
        }

        @g0
        public o1.c<D> r(boolean z3) {
            if (b.f8963d) {
                Log.v(b.f8962c, "  Destroying: " + this);
            }
            this.f8968o.b();
            this.f8968o.a();
            C0084b<D> c0084b = this.f8970q;
            if (c0084b != null) {
                o(c0084b);
                if (z3) {
                    c0084b.d();
                }
            }
            this.f8968o.B(this);
            if ((c0084b == null || c0084b.c()) && !z3) {
                return this.f8968o;
            }
            this.f8968o.w();
            return this.f8971r;
        }

        public void s(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f8966m);
            printWriter.print(" mArgs=");
            printWriter.println(this.f8967n);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f8968o);
            this.f8968o.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f8970q != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f8970q);
                this.f8970q.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(t().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        @j0
        public o1.c<D> t() {
            return this.f8968o;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f8966m);
            sb.append(" : ");
            u0.c.a(this.f8968o, sb);
            sb.append("}}");
            return sb.toString();
        }

        public boolean u() {
            C0084b<D> c0084b;
            return (!h() || (c0084b = this.f8970q) == null || c0084b.c()) ? false : true;
        }

        public void v() {
            l lVar = this.f8969p;
            C0084b<D> c0084b = this.f8970q;
            if (lVar == null || c0084b == null) {
                return;
            }
            super.o(c0084b);
            j(lVar, c0084b);
        }

        @g0
        @j0
        public o1.c<D> w(@j0 l lVar, @j0 a.InterfaceC0083a<D> interfaceC0083a) {
            C0084b<D> c0084b = new C0084b<>(this.f8968o, interfaceC0083a);
            j(lVar, c0084b);
            C0084b<D> c0084b2 = this.f8970q;
            if (c0084b2 != null) {
                o(c0084b2);
            }
            this.f8969p = lVar;
            this.f8970q = c0084b;
            return this.f8968o;
        }
    }

    /* JADX INFO: renamed from: n1.b$b, reason: collision with other inner class name */
    public static class C0084b<D> implements r<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @j0
        public final o1.c<D> f8972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @j0
        public final a.InterfaceC0083a<D> f8973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f8974c = false;

        public C0084b(@j0 o1.c<D> cVar, @j0 a.InterfaceC0083a<D> interfaceC0083a) {
            this.f8972a = cVar;
            this.f8973b = interfaceC0083a;
        }

        @Override // androidx.lifecycle.r
        public void a(@k0 D d4) {
            if (b.f8963d) {
                Log.v(b.f8962c, "  onLoadFinished in " + this.f8972a + ": " + this.f8972a.d(d4));
            }
            this.f8973b.c(this.f8972a, d4);
            this.f8974c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f8974c);
        }

        public boolean c() {
            return this.f8974c;
        }

        @g0
        public void d() {
            if (this.f8974c) {
                if (b.f8963d) {
                    Log.v(b.f8962c, "  Resetting: " + this.f8972a);
                }
                this.f8973b.a(this.f8972a);
            }
        }

        public String toString() {
            return this.f8973b.toString();
        }
    }

    public static class c extends y {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final z.b f8975e = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public j<a> f8976c = new j<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f8977d = false;

        public static class a implements z.b {
            @Override // androidx.lifecycle.z.b
            @j0
            public <T extends y> T a(@j0 Class<T> cls) {
                return new c();
            }
        }

        @j0
        public static c h(a0 a0Var) {
            return (c) new z(a0Var, f8975e).a(c.class);
        }

        @Override // androidx.lifecycle.y
        public void d() {
            super.d();
            int iX = this.f8976c.x();
            for (int i4 = 0; i4 < iX; i4++) {
                this.f8976c.y(i4).r(true);
            }
            this.f8976c.b();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f8976c.x() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i4 = 0; i4 < this.f8976c.x(); i4++) {
                    a aVarY = this.f8976c.y(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f8976c.m(i4));
                    printWriter.print(": ");
                    printWriter.println(aVarY.toString());
                    aVarY.s(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void g() {
            this.f8977d = false;
        }

        public <D> a<D> i(int i4) {
            return this.f8976c.h(i4);
        }

        public boolean j() {
            int iX = this.f8976c.x();
            for (int i4 = 0; i4 < iX; i4++) {
                if (this.f8976c.y(i4).u()) {
                    return true;
                }
            }
            return false;
        }

        public boolean k() {
            return this.f8977d;
        }

        public void l() {
            int iX = this.f8976c.x();
            for (int i4 = 0; i4 < iX; i4++) {
                this.f8976c.y(i4).v();
            }
        }

        public void m(int i4, @j0 a aVar) {
            this.f8976c.n(i4, aVar);
        }

        public void n(int i4) {
            this.f8976c.q(i4);
        }

        public void o() {
            this.f8977d = true;
        }
    }

    public b(@j0 l lVar, @j0 a0 a0Var) {
        this.f8964a = lVar;
        this.f8965b = c.h(a0Var);
    }

    @Override // n1.a
    @g0
    public void a(int i4) {
        if (this.f8965b.k()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (f8963d) {
            Log.v(f8962c, "destroyLoader in " + this + " of " + i4);
        }
        a aVarI = this.f8965b.i(i4);
        if (aVarI != null) {
            aVarI.r(true);
            this.f8965b.n(i4);
        }
    }

    @Override // n1.a
    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f8965b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // n1.a
    @k0
    public <D> o1.c<D> e(int i4) {
        if (this.f8965b.k()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        a<D> aVarI = this.f8965b.i(i4);
        if (aVarI != null) {
            return aVarI.t();
        }
        return null;
    }

    @Override // n1.a
    public boolean f() {
        return this.f8965b.j();
    }

    @Override // n1.a
    @g0
    @j0
    public <D> o1.c<D> g(int i4, @k0 Bundle bundle, @j0 a.InterfaceC0083a<D> interfaceC0083a) {
        if (this.f8965b.k()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> aVarI = this.f8965b.i(i4);
        if (f8963d) {
            Log.v(f8962c, "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarI == null) {
            return j(i4, bundle, interfaceC0083a, null);
        }
        if (f8963d) {
            Log.v(f8962c, "  Re-using existing loader " + aVarI);
        }
        return aVarI.w(this.f8964a, interfaceC0083a);
    }

    @Override // n1.a
    public void h() {
        this.f8965b.l();
    }

    @Override // n1.a
    @g0
    @j0
    public <D> o1.c<D> i(int i4, @k0 Bundle bundle, @j0 a.InterfaceC0083a<D> interfaceC0083a) {
        if (this.f8965b.k()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if (f8963d) {
            Log.v(f8962c, "restartLoader in " + this + ": args=" + bundle);
        }
        a<D> aVarI = this.f8965b.i(i4);
        return j(i4, bundle, interfaceC0083a, aVarI != null ? aVarI.r(false) : null);
    }

    @g0
    @j0
    public final <D> o1.c<D> j(int i4, @k0 Bundle bundle, @j0 a.InterfaceC0083a<D> interfaceC0083a, @k0 o1.c<D> cVar) {
        try {
            this.f8965b.o();
            o1.c<D> cVarB = interfaceC0083a.b(i4, bundle);
            if (cVarB == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (cVarB.getClass().isMemberClass() && !Modifier.isStatic(cVarB.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + cVarB);
            }
            a aVar = new a(i4, bundle, cVarB, cVar);
            if (f8963d) {
                Log.v(f8962c, "  Created new loader " + aVar);
            }
            this.f8965b.m(i4, aVar);
            this.f8965b.g();
            return aVar.w(this.f8964a, interfaceC0083a);
        } catch (Throwable th) {
            this.f8965b.g();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        u0.c.a(this.f8964a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
