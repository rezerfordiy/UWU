package z1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class p0 extends n0 implements j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f13822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<r0> f13827k = new ArrayList();

    @Override // z1.j7
    public void H0() {
        this.f13817a = true;
    }

    @Override // z1.n0
    public String R2() {
        return this.f13821e;
    }

    @Override // z1.n0
    public n0 U2() {
        if (this.f13820d || !this.f13819c) {
            return null;
        }
        return this;
    }

    @Override // z1.n0
    public List<String> W2() {
        ArrayList arrayList = new ArrayList();
        Iterator<r0> it = this.f13827k.iterator();
        while (it.hasNext()) {
            o0 o0VarG = it.next().g();
            if (o0VarG != null) {
                HashMap map = new HashMap();
                o0VarG.f(map);
                arrayList.addAll(map.keySet());
            }
        }
        return arrayList;
    }

    public void X2() {
        List<r0> list = this.f13827k;
        if (list == null) {
            return;
        }
        Iterator<r0> it = list.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public boolean Y2() {
        return this.f13823g;
    }

    public void Z2(r0 r0Var) {
        if (this.f13827k.contains(r0Var)) {
            return;
        }
        this.f13827k.add(r0Var);
        r0Var.e(this, R2());
    }

    public void a3(q qVar) {
        this.f13822f = qVar;
    }

    public void b3(boolean z3) {
        this.f13820d = z3;
    }

    public boolean c3() {
        return this.f13820d;
    }

    public void d0(boolean z3) {
        this.f13823g = z3;
    }

    @Override // z1.j7
    public boolean flag() {
        return this.f13817a;
    }

    @Override // z1.j7
    public void g0() {
        this.f13817a = false;
    }
}
