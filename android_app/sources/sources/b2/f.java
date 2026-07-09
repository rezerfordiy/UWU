package b2;

import m2.d0;
import m2.w;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d0 f4499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i2.e f4500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f4501c;

    public f() {
        this.f4500b = new i2.e();
    }

    public boolean a(f fVar) {
        return this.f4499a.f8789f.containsKey("pw_data") ? fVar.f4499a.f8789f.containsKey("pw_data") : this.f4499a.f8789f.containsKey("color_data") ? fVar.f4499a.f8789f.containsKey("color_data") : this.f4499a instanceof w ? fVar.f4499a instanceof w : (fVar.f4499a.f8789f.containsKey("pw_data") || fVar.f4499a.f8789f.containsKey("color_data") || (fVar.f4499a instanceof w)) ? false : true;
    }

    public f(d0 d0Var) {
        this.f4500b = new i2.e();
        this.f4499a = d0Var;
    }

    public f(d0 d0Var, i2.e eVar) {
        new i2.e();
        this.f4499a = d0Var;
        this.f4500b = eVar;
    }
}
