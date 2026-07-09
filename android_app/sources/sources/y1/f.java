package y1;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f12843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f12844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f12845c;

    public f() {
    }

    public static double a(f fVar, f fVar2) {
        return (fVar.f12843a * fVar2.f12843a) + (fVar.f12844b * fVar2.f12844b) + (fVar.f12845c * fVar2.f12845c);
    }

    public static f d(f fVar, f fVar2) {
        f fVar3 = new f();
        fVar3.f12843a = fVar.f12843a - fVar2.f12843a;
        fVar3.f12844b = fVar.f12844b - fVar2.f12844b;
        fVar3.f12845c = fVar.f12845c - fVar2.f12845c;
        return fVar3;
    }

    public static f e(f fVar, f fVar2) {
        f fVar3 = new f();
        double d4 = fVar.f12844b;
        double d5 = fVar2.f12845c;
        double d6 = fVar.f12845c;
        fVar3.f12843a = (d4 * d5) - (fVar2.f12844b * d6);
        double d7 = fVar2.f12843a;
        double d8 = fVar.f12843a;
        fVar3.f12844b = (d6 * d7) - (d5 * d8);
        fVar3.f12845c = (d8 * fVar2.f12844b) - (fVar.f12844b * d7);
        return fVar3;
    }

    public void b() {
        if (Math.sqrt(Math.pow(this.f12843a, 2.0d) + Math.pow(this.f12844b, 2.0d) + Math.pow(this.f12845c, 2.0d)) == 0.0d) {
            return;
        }
        this.f12843a = (float) (this.f12843a / r0);
        this.f12844b = (float) (this.f12844b / r0);
        this.f12845c = (float) (this.f12845c / r0);
    }

    public void c(float f4, float f5, float f6) {
        this.f12843a = f4;
        this.f12844b = f5;
        this.f12845c = f6;
    }

    public f(double d4, double d5, double d6) {
        this.f12843a = (float) d4;
        this.f12844b = (float) d5;
        this.f12845c = (float) d6;
    }
}
