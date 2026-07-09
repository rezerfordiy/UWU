package i2;

import android.graphics.Canvas;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class e extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z f8067f = new z();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f8068g = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8069h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8070i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8071j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8072k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8073l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8074m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8075n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8076o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8077p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8078q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8079r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8080s = false;

    @Override // i2.d
    public void a() {
        this.f8067f.a();
        this.f8068g.a();
    }

    @Override // i2.d
    public void b(Canvas canvas) {
        this.f8067f.b(canvas);
        this.f8068g.b(canvas);
    }

    @Override // i2.d
    public d c(PointF pointF) {
        d dVarC = this.f8068g.c(pointF);
        return dVarC != null ? dVarC : this.f8067f.c(pointF);
    }

    @Override // i2.d
    public boolean e() {
        if (this.f8067f.e()) {
            return this.f8068g.e();
        }
        return false;
    }

    public void g(d dVar) {
        if (dVar.f() == 2) {
            this.f8068g.m((b) dVar);
            return;
        }
        if (dVar.f() == 1) {
            f fVar = (f) dVar;
            if (fVar.x()) {
                this.f8069h = true;
            }
            if (fVar.m()) {
                this.f8070i = true;
            }
            if (fVar.n()) {
                this.f8071j = true;
            }
            if (fVar.p()) {
                this.f8072k = true;
            }
            if (fVar.o()) {
                this.f8073l = true;
            }
            if (fVar.q()) {
                this.f8074m = true;
            }
            if (fVar.v()) {
                this.f8075n = true;
            }
            if (fVar.s()) {
                this.f8076o = true;
            }
            if (fVar.y()) {
                this.f8078q = true;
            }
            if (fVar.r()) {
                this.f8077p = true;
            }
            if (fVar.t()) {
                this.f8079r = true;
            }
            if (fVar.u()) {
                this.f8080s = true;
            }
            this.f8067f.M(fVar);
        }
    }

    public void h() {
        f fVarP = p();
        this.f8067f.N();
        if (fVarP != null) {
            this.f8067f.M(fVarP);
        }
        this.f8068g.o();
    }

    public f i() {
        return this.f8067f.P();
    }

    public f j() {
        return this.f8067f.O();
    }

    public f k() {
        return this.f8067f.Q();
    }

    public f l() {
        return this.f8067f.R();
    }

    public f m() {
        return this.f8067f.S();
    }

    public f n() {
        return this.f8067f.T();
    }

    public f o() {
        return this.f8067f.U();
    }

    public f p() {
        return this.f8067f.V();
    }

    public f q() {
        return this.f8067f.W();
    }

    public f r() {
        return this.f8067f.X();
    }

    public f s() {
        return this.f8067f.Y();
    }

    public f t() {
        return this.f8067f.Z();
    }

    public int u(int i4) {
        return i4 == 2 ? this.f8068g.n() : i4 == 1 ? this.f8067f.a0() : this.f8068g.n() + this.f8067f.a0();
    }

    public void v(d dVar) {
        if (dVar.f() == 2) {
            this.f8068g.p((b) dVar);
        } else if (dVar.f() == 1) {
            this.f8067f.b0((f) dVar);
        }
    }
}
