package f3;

/* JADX INFO: loaded from: classes.dex */
public class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f7659a;

    public e(double d4) {
        this.f7659a = d4;
    }

    @Override // f3.c
    public void c(Object obj, Object obj2) {
        double dFloatValue;
        double dFloatValue2;
        if (obj instanceof Double) {
            dFloatValue = ((Double) obj).doubleValue();
            dFloatValue2 = ((Double) obj2).doubleValue();
        } else {
            dFloatValue = ((Float) obj).floatValue();
            dFloatValue2 = ((Float) obj2).floatValue();
        }
        w2.c.r(dFloatValue, dFloatValue2, this.f7659a);
    }
}
