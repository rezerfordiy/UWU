package m2;

import android.graphics.Bitmap;
import android.graphics.PointF;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f8927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Map<String, z> f8928e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f8929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f8930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f8931c;

    public z() {
        a0.c();
    }

    public static void E(int i4) {
        f8927d = i4;
    }

    public static z p(String str) {
        if (str == null) {
            return null;
        }
        z zVar = f8928e.get(str);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z();
        f8928e.put(str, zVar2);
        return zVar2;
    }

    public float A() {
        if (a0.c().d() == null) {
            return 0.2f;
        }
        return a0.c().d().y();
    }

    public float B() {
        return a0.c().d().z();
    }

    public boolean C(int i4, int i5) {
        if (i4 <= 0 || i5 <= 0) {
            return false;
        }
        this.f8929a = i4;
        this.f8930b = i5;
        return true;
    }

    public boolean D(int i4, int i5, int i6) {
        if (i4 <= 0 || i5 <= 0) {
            return false;
        }
        this.f8929a = i4;
        this.f8930b = i5;
        return true;
    }

    public PointF F(PointF pointF, int i4) {
        a0.c().d().E(this.f8929a);
        a0.c().d().D(this.f8930b);
        return a0.c().d().J(pointF, i4);
    }

    public Bitmap a(d0 d0Var) {
        return b(d0Var, false);
    }

    public Bitmap b(d0 d0Var, boolean z3) {
        if (this.f8931c != d0Var) {
            this.f8931c = d0Var;
            a0.c().b(d0Var);
        }
        q qVarD = a0.f8705e.d();
        qVarD.E(this.f8929a);
        qVarD.D(this.f8930b);
        int[][] iArrG = j.a().g();
        int[][] iArrF = j.a().f();
        if (z3) {
            k.d().f(iArrF, iArrG);
        } else {
            k.d().f(iArrG, iArrF);
        }
        return k.d().b(qVarD.j());
    }

    public Bitmap c(d0 d0Var) {
        return d(d0Var, false);
    }

    public Bitmap d(d0 d0Var, boolean z3) {
        if (this.f8931c != d0Var) {
            this.f8931c = d0Var;
            a0.c().b(d0Var);
        }
        q qVarD = a0.c().d();
        qVarD.E(this.f8929a);
        qVarD.D(this.f8930b);
        int[][] iArrG = j.a().g();
        int[][] iArrF = j.a().f();
        if (z3) {
            k.d().f(iArrF, iArrG);
        } else {
            k.d().f(iArrG, iArrF);
        }
        return k.d().b(qVarD.j());
    }

    public Bitmap e(d0 d0Var) {
        if (this.f8931c != d0Var) {
            this.f8931c = d0Var;
            a0.c().b(d0Var);
        }
        q qVarD = a0.c().d();
        qVarD.E(this.f8929a);
        qVarD.D(this.f8930b);
        Bitmap bitmapN = qVarD.n();
        if (bitmapN == null) {
            return null;
        }
        k.d().e(j.a().e(f8927d));
        return k.d().a(bitmapN);
    }

    public PointF f(PointF pointF) {
        a0.c().d().E(this.f8929a);
        a0.c().d().D(this.f8930b);
        return a0.c().d().a(pointF);
    }

    public Bitmap g(d0 d0Var) {
        if (this.f8931c != d0Var) {
            this.f8931c = d0Var;
            a0.c().b(d0Var);
        }
        q qVarD = a0.c().d();
        qVarD.E(this.f8929a);
        qVarD.D(this.f8930b);
        return k.d().c(qVarD.r());
    }

    public Bitmap h(d0 d0Var) {
        if (this.f8931c != d0Var) {
            this.f8931c = d0Var;
            a0.c().b(d0Var);
        }
        q qVarD = a0.f8705e.d();
        qVarD.E(this.f8929a);
        qVarD.D(this.f8930b);
        return k.d().c(qVarD.r());
    }

    public void i(boolean z3) {
    }

    public void j() {
        a0.c().e();
    }

    public float k() {
        return a0.c().d().v();
    }

    public PointF l() {
        return a0.c().d().b();
    }

    public float m() {
        return this.f8930b;
    }

    public float n() {
        return this.f8929a;
    }

    public Bitmap o() {
        q qVarD = a0.f8705e.d();
        if (qVarD == null) {
            qVarD = q.f8846d;
        }
        return qVarD.l();
    }

    public Bitmap q(boolean z3) {
        q qVarD = a0.f8705e.d();
        if (qVarD == null) {
            qVarD = q.f8846d;
        }
        Bitmap bitmapH = qVarD.h();
        int[][] iArrG = j.a().g();
        int[][] iArrF = j.a().f();
        if (z3) {
            k.d().f(iArrF, iArrG);
        } else {
            k.d().f(iArrG, iArrF);
        }
        return k.d().b(bitmapH);
    }

    public Bitmap r() {
        q qVarD = a0.f8705e.d();
        if (qVarD == null) {
            qVarD = q.f8846d;
        }
        return k.d().c(qVarD.p());
    }

    public float s() {
        return a0.c().d().t();
    }

    public boolean t() {
        return true;
    }

    public void u() {
        a0.c().e();
    }

    public PointF v(PointF pointF) {
        a0.c().d().E(this.f8929a);
        a0.c().d().D(this.f8930b);
        return a0.c().d().A(pointF);
    }

    public void w() {
        this.f8931c = null;
    }

    public void x(d0 d0Var) {
        a0.c().h(d0Var);
        a0.c().d().E(this.f8929a);
        a0.c().d().D(this.f8930b);
    }

    public void y(d0 d0Var) {
        x(d0Var);
    }

    public PointF z(PointF pointF, int i4) {
        a0.c().d().E(this.f8929a);
        a0.c().d().D(this.f8930b);
        return a0.c().d().B(pointF, i4);
    }
}
