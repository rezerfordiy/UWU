package i2;

import android.graphics.Canvas;
import android.graphics.PointF;
import i2.f;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class z extends f {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static f.b f8193y = new f.b(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList<f> f8194v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f8195w = {0, 1, 2, 3};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8196x = 4;

    public static void e0(f.b bVar) {
        f8193y = bVar;
    }

    public void M(f fVar) {
        if (this.f8194v == null) {
            this.f8194v = new ArrayList<>();
        }
        if (fVar != null) {
            fVar.B(c0());
            this.f8194v.add(fVar);
        }
    }

    public void N() {
        ArrayList<f> arrayList = this.f8194v;
        if (arrayList != null) {
            arrayList.clear();
            this.f8196x = 4;
        }
    }

    public f O() {
        f fVar = null;
        if (this.f8194v != null) {
            for (int i4 = 0; i4 < this.f8194v.size(); i4++) {
                f fVar2 = this.f8194v.get(i4);
                if (fVar2.n()) {
                    fVar = fVar2;
                }
            }
        }
        return fVar;
    }

    public f P() {
        f fVar = null;
        if (this.f8194v != null) {
            for (int i4 = 0; i4 < this.f8194v.size(); i4++) {
                f fVar2 = this.f8194v.get(i4);
                if (fVar2.m()) {
                    fVar = fVar2;
                }
            }
        }
        return fVar;
    }

    public f Q() {
        f fVar = null;
        if (this.f8194v != null) {
            for (int i4 = 0; i4 < this.f8194v.size(); i4++) {
                f fVar2 = this.f8194v.get(i4);
                if (fVar2.o()) {
                    fVar = fVar2;
                }
            }
        }
        return fVar;
    }

    public f R() {
        f fVar = null;
        if (this.f8194v != null) {
            for (int i4 = 0; i4 < this.f8194v.size(); i4++) {
                f fVar2 = this.f8194v.get(i4);
                if (fVar2.p()) {
                    fVar = fVar2;
                }
            }
        }
        return fVar;
    }

    public f S() {
        f fVar = null;
        if (this.f8194v != null) {
            for (int i4 = 0; i4 < this.f8194v.size(); i4++) {
                f fVar2 = this.f8194v.get(i4);
                if (fVar2.q()) {
                    fVar = fVar2;
                }
            }
        }
        return fVar;
    }

    public f T() {
        f fVar = null;
        if (this.f8194v != null) {
            for (int i4 = 0; i4 < this.f8194v.size(); i4++) {
                f fVar2 = this.f8194v.get(i4);
                if (fVar2.r()) {
                    fVar = fVar2;
                }
            }
        }
        return fVar;
    }

    public f U() {
        f fVar = null;
        if (this.f8194v != null) {
            for (int i4 = 0; i4 < this.f8194v.size(); i4++) {
                f fVar2 = this.f8194v.get(i4);
                if (fVar2.s()) {
                    fVar = fVar2;
                }
            }
        }
        return fVar;
    }

    public f V() {
        ArrayList<f> arrayList = this.f8194v;
        if (arrayList != null) {
            for (f fVar : arrayList) {
                if (fVar.t()) {
                    return fVar;
                }
            }
        }
        return null;
    }

    public f W() {
        ArrayList<f> arrayList = this.f8194v;
        if (arrayList != null) {
            for (f fVar : arrayList) {
                if (fVar.u()) {
                    return fVar;
                }
            }
        }
        return null;
    }

    public f X() {
        f fVar = null;
        if (this.f8194v != null) {
            for (int i4 = 0; i4 < this.f8194v.size(); i4++) {
                f fVar2 = this.f8194v.get(i4);
                if (fVar2.v()) {
                    fVar = fVar2;
                }
            }
        }
        return fVar;
    }

    public f Y() {
        f fVar = null;
        if (this.f8194v != null) {
            for (int i4 = 0; i4 < this.f8194v.size(); i4++) {
                f fVar2 = this.f8194v.get(i4);
                if (fVar2.x()) {
                    fVar = fVar2;
                }
            }
        }
        return fVar;
    }

    public f Z() {
        ArrayList<f> arrayList = this.f8194v;
        if (arrayList != null) {
            for (f fVar : arrayList) {
                if (fVar.y()) {
                    return fVar;
                }
            }
        }
        return null;
    }

    @Override // i2.d
    public void a() {
        if (this.f8194v != null) {
            for (int i4 = 0; i4 < this.f8194v.size(); i4++) {
                this.f8194v.get(i4).a();
            }
        }
    }

    public int a0() {
        ArrayList<f> arrayList = this.f8194v;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // i2.d
    public void b(Canvas canvas) {
        if (this.f8194v != null) {
            f.b bVar = f8193y;
            float f4 = 0.0f;
            for (int i4 = 0; i4 < this.f8194v.size(); i4++) {
                f fVar = this.f8194v.get(i4);
                if (i4 > 0) {
                    f4 += this.f8194v.get(i4 - 1).f8088h.f8112e;
                }
                fVar.E(bVar.a(0.0f, f4, fVar.i()), i4);
                fVar.b(canvas);
            }
        }
    }

    public void b0(f fVar) {
        if (fVar == null || this.f8194v == null) {
            return;
        }
        for (int i4 = 0; i4 < this.f8194v.size(); i4++) {
            if (this.f8194v.get(i4) == fVar) {
                d0(fVar.j());
                this.f8194v.remove(i4);
                return;
            }
        }
    }

    @Override // i2.f, i2.d
    public d c(PointF pointF) {
        f fVar = null;
        if (this.f8194v != null) {
            for (int i4 = 0; i4 < this.f8194v.size() && (fVar = (f) this.f8194v.get(i4).c(pointF)) == null; i4++) {
            }
        }
        return fVar;
    }

    public int c0() {
        int i4 = this.f8196x;
        if (i4 <= 0) {
            return -1;
        }
        int i5 = i4 - 1;
        this.f8196x = i5;
        return this.f8195w[i5];
    }

    public void d0(int i4) {
        if (i4 < 0 || i4 > 3) {
            return;
        }
        if (this.f8196x > 0) {
            for (int i5 = 0; i5 < this.f8196x; i5++) {
                if (i4 == this.f8195w[i5]) {
                    return;
                }
            }
        }
        int[] iArr = this.f8195w;
        int i6 = this.f8196x;
        iArr[i6] = i4;
        this.f8196x = i6 + 1;
    }

    @Override // i2.f, i2.d
    public boolean e() {
        if (this.f8194v == null) {
            return true;
        }
        for (int i4 = 0; i4 < this.f8194v.size(); i4++) {
            if (!this.f8194v.get(i4).e()) {
                return false;
            }
        }
        return true;
    }
}
