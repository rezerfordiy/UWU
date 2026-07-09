package m2;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a0 f8705e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f8706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f8707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f8708c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8709d = new Object();

    public static a0 c() {
        if (f8705e == null) {
            f8705e = new a0();
        }
        return f8705e;
    }

    public void a() {
        this.f8707b = null;
    }

    public q b(d0 d0Var) {
        u uVar = (u) d0Var.f8789f.get("b_data");
        if (this.f8707b != null) {
            h hVar = this.f8708c;
            if (hVar == null || hVar.a() != this.f8707b) {
                this.f8708c = new h(this.f8707b);
            }
        } else if (this.f8708c == null) {
            this.f8708c = new h(uVar.f8893k);
        }
        s.c().f(x.b(d0Var), this.f8708c);
        q qVarA = s.c().a(x.a(d0Var));
        this.f8706a = qVarA;
        return qVarA;
    }

    public q d() {
        q qVar = this.f8706a;
        return qVar == null ? q.f8846d : qVar;
    }

    public void e() {
        f8705e = null;
        this.f8706a = null;
    }

    public void f(int i4) {
        this.f8708c = new h(i4);
    }

    public void g(int[] iArr) {
        this.f8707b = iArr;
    }

    public q h(d0 d0Var) {
        u uVar = (u) d0Var.f8789f.get("b_data");
        if (this.f8707b != null) {
            h hVar = this.f8708c;
            if (hVar == null || hVar.a() != this.f8707b) {
                this.f8708c = new h(this.f8707b);
            }
        } else if (this.f8708c == null) {
            this.f8708c = new h(uVar.f8893k);
        }
        q qVarF = s.c().f(x.b(d0Var), this.f8708c);
        this.f8706a = qVarF;
        return qVarF;
    }
}
