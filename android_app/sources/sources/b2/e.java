package b2;

import m2.b0;
import m2.c0;
import m2.d0;
import m2.u;
import m2.y;

/* JADX INFO: loaded from: classes.dex */
public class e extends d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y f4496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c0 f4497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b0 f4498i;

    public e(d0 d0Var) {
        this.f8788e = d0Var.f8788e;
        this.f8785b = d0Var.f8785b;
        this.f8784a = d0Var.f8784a;
        this.f8786c = d0Var.f8786c;
        this.f8787d = d0Var.f8787d;
        this.f8789f = d0Var.f8789f;
    }

    public d0 a() {
        if (this.f4496g == null) {
            return null;
        }
        d0 d0Var = new d0();
        d0Var.f8788e = this.f8788e;
        d0Var.f8784a = this.f8784a;
        d0Var.f8785b = this.f8785b;
        d0Var.f8786c = this.f8786c;
        d0Var.f8787d = this.f8787d;
        d0Var.f8789f.put("b_data", (u) this.f8789f.get("b_data"));
        d0Var.f8789f.put("color_data", this.f4496g);
        return d0Var;
    }

    public d0 b() {
        if (this.f4498i == null) {
            return null;
        }
        d0 d0Var = new d0();
        d0Var.f8788e = this.f8788e;
        d0Var.f8784a = this.f8784a;
        d0Var.f8785b = this.f8785b;
        d0Var.f8786c = this.f8786c;
        d0Var.f8787d = this.f8787d;
        d0Var.f8789f.put("b_data", (u) this.f8789f.get("b_data"));
        d0Var.f8789f.put("pw_data", this.f4498i);
        return d0Var;
    }

    public d0 c() {
        if (this.f4497h == null) {
            return null;
        }
        d0 d0Var = new d0();
        d0Var.f8788e = this.f8788e;
        d0Var.f8784a = this.f8784a;
        d0Var.f8785b = this.f8785b;
        d0Var.f8786c = this.f8786c;
        d0Var.f8787d = this.f8787d;
        d0Var.f8789f.put("b_data", (u) this.f8789f.get("b_data"));
        d0Var.f8789f.put("power_data", this.f4497h);
        return d0Var;
    }

    public void d(d0 d0Var) {
        y yVar = (y) d0Var.f8789f.get("color_data");
        u uVar = (u) d0Var.f8789f.get("b_data");
        u uVar2 = (u) this.f8789f.get("b_data");
        uVar2.f8883a = uVar.f8883a;
        uVar2.f8884b = uVar.f8884b;
        this.f4496g = yVar;
    }

    public void e(b0 b0Var) {
        this.f4498i = b0Var;
    }

    public void f(d0 d0Var) {
        c0 c0Var = (c0) d0Var.f8789f.get("power_data");
        u uVar = (u) d0Var.f8789f.get("b_data");
        u uVar2 = (u) this.f8789f.get("b_data");
        uVar2.f8883a = uVar.f8883a;
        uVar2.f8884b = uVar.f8884b;
        this.f4497h = c0Var;
    }

    public void g(b0 b0Var) {
        this.f4498i = b0Var;
    }
}
