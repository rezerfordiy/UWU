package q;

import r.t;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f10209g = "VelocityMatrix";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f10210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f10211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f10213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f10214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f10215f;

    public void a(float f4, float f5, int i4, int i5, float[] fArr) {
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = (f4 - 0.5f) * 2.0f;
        float f9 = (f5 - 0.5f) * 2.0f;
        float f10 = f6 + this.f10212c;
        float f11 = f7 + this.f10213d;
        float f12 = f10 + (this.f10210a * f8);
        float f13 = f11 + (this.f10211b * f9);
        float radians = (float) Math.toRadians(this.f10215f);
        float radians2 = (float) Math.toRadians(this.f10214e);
        double d4 = radians;
        double d5 = i5 * f9;
        float fSin = f12 + (((float) ((((double) ((-i4) * f8)) * Math.sin(d4)) - (Math.cos(d4) * d5))) * radians2);
        float fCos = f13 + (radians2 * ((float) ((((double) (i4 * f8)) * Math.cos(d4)) - (d5 * Math.sin(d4)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    public void b() {
        this.f10214e = 0.0f;
        this.f10213d = 0.0f;
        this.f10212c = 0.0f;
        this.f10211b = 0.0f;
        this.f10210a = 0.0f;
    }

    public void c(r.i iVar, float f4) {
        if (iVar != null) {
            this.f10214e = iVar.c(f4);
        }
    }

    public void d(t tVar, float f4) {
        if (tVar != null) {
            this.f10214e = tVar.c(f4);
            this.f10215f = tVar.a(f4);
        }
    }

    public void e(r.i iVar, r.i iVar2, float f4) {
        if (iVar == null && iVar2 == null) {
            return;
        }
        if (iVar == null) {
            this.f10210a = iVar.c(f4);
        }
        if (iVar2 == null) {
            this.f10211b = iVar2.c(f4);
        }
    }

    public void f(t tVar, t tVar2, float f4) {
        if (tVar != null) {
            this.f10210a = tVar.c(f4);
        }
        if (tVar2 != null) {
            this.f10211b = tVar2.c(f4);
        }
    }

    public void g(r.i iVar, r.i iVar2, float f4) {
        if (iVar != null) {
            this.f10212c = iVar.c(f4);
        }
        if (iVar2 != null) {
            this.f10213d = iVar2.c(f4);
        }
    }

    public void h(t tVar, t tVar2, float f4) {
        if (tVar != null) {
            this.f10212c = tVar.c(f4);
        }
        if (tVar2 != null) {
            this.f10213d = tVar2.c(f4);
        }
    }
}
