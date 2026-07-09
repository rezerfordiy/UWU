package j;

import android.view.View;
import android.view.animation.Interpolator;
import c.r0;
import java.util.ArrayList;
import java.util.Iterator;
import v0.s2;
import v0.t2;
import v0.u2;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f8266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t2 f8267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8268e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8265b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u2 f8269f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<s2> f8264a = new ArrayList<>();

    public class a extends u2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8270a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8271b = 0;

        public a() {
        }

        @Override // v0.u2, v0.t2
        public void a(View view) {
            int i4 = this.f8271b + 1;
            this.f8271b = i4;
            if (i4 == h.this.f8264a.size()) {
                t2 t2Var = h.this.f8267d;
                if (t2Var != null) {
                    t2Var.a(null);
                }
                d();
            }
        }

        @Override // v0.u2, v0.t2
        public void b(View view) {
            if (this.f8270a) {
                return;
            }
            this.f8270a = true;
            t2 t2Var = h.this.f8267d;
            if (t2Var != null) {
                t2Var.b(null);
            }
        }

        public void d() {
            this.f8271b = 0;
            this.f8270a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f8268e) {
            Iterator<s2> it = this.f8264a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f8268e = false;
        }
    }

    public void b() {
        this.f8268e = false;
    }

    public h c(s2 s2Var) {
        if (!this.f8268e) {
            this.f8264a.add(s2Var);
        }
        return this;
    }

    public h d(s2 s2Var, s2 s2Var2) {
        this.f8264a.add(s2Var);
        s2Var2.u(s2Var.d());
        this.f8264a.add(s2Var2);
        return this;
    }

    public h e(long j4) {
        if (!this.f8268e) {
            this.f8265b = j4;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f8268e) {
            this.f8266c = interpolator;
        }
        return this;
    }

    public h g(t2 t2Var) {
        if (!this.f8268e) {
            this.f8267d = t2Var;
        }
        return this;
    }

    public void h() {
        if (this.f8268e) {
            return;
        }
        for (s2 s2Var : this.f8264a) {
            long j4 = this.f8265b;
            if (j4 >= 0) {
                s2Var.q(j4);
            }
            Interpolator interpolator = this.f8266c;
            if (interpolator != null) {
                s2Var.r(interpolator);
            }
            if (this.f8267d != null) {
                s2Var.s(this.f8269f);
            }
            s2Var.w();
        }
        this.f8268e = true;
    }
}
