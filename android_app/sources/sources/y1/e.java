package y1;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f12839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f12840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f12841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f12842d;

    public e() {
    }

    public e(Float f4, float f5, float f6, float f7) {
        this.f12839a = f4.floatValue();
        this.f12840b = f5;
        this.f12841c = f6;
        this.f12842d = f7;
    }

    public e(f fVar, f fVar2, f fVar3) {
        f fVarE = f.e(f.d(fVar3, fVar), f.d(fVar2, fVar));
        fVarE.b();
        double d4 = fVarE.f12843a;
        this.f12839a = d4;
        double d5 = fVarE.f12844b;
        this.f12840b = d5;
        double d6 = fVarE.f12845c;
        this.f12841c = d6;
        this.f12842d = -((d4 * fVar.f12843a) + (d5 * fVar.f12844b) + (d6 * fVar.f12845c));
    }
}
