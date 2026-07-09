package z1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z1.n0;

/* JADX INFO: loaded from: classes.dex */
public class s1 extends p0 implements t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<String> f13839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<Boolean> f13840m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<Integer> f13841n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<Integer> f13842o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<Integer> f13843p;

    public s1(boolean z3, boolean z4, List<g7> list, List<Integer> list2) {
        this.f13821e = n0.a.IMAGEUNITCHECKER.toString();
        this.f13819c = z3;
        this.f13818b = z4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            g7 g7Var = list.get(i4);
            arrayList.add(g7Var.e());
            arrayList2.add(Boolean.valueOf(g7Var.b() != null));
            arrayList3.add(Integer.valueOf(i4));
        }
        this.f13839l = arrayList;
        this.f13840m = arrayList2;
        this.f13841n = arrayList3;
        this.f13842o = list2;
        this.f13843p = list2;
    }

    @Override // z1.t
    public List<Integer> Q1() {
        return this.f13843p;
    }

    public boolean d3(int i4) {
        if (i4 >= 0 && i4 < this.f13841n.size()) {
            Iterator<Integer> it = this.f13842o.iterator();
            while (it.hasNext()) {
                if (it.next().intValue() == i4) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean e3(int i4) {
        if (i4 < 0 || i4 >= this.f13841n.size()) {
            return false;
        }
        return this.f13840m.get(i4).booleanValue();
    }

    public String f3(int i4) {
        return (i4 < 0 || i4 >= this.f13841n.size()) ? s0.a.f11071l : this.f13839l.get(i4);
    }

    public List<Integer> g3() {
        return this.f13842o;
    }

    public List<Integer> h3() {
        return this.f13842o;
    }

    public t i3() {
        if (this.f13818b) {
            return this;
        }
        return null;
    }

    public void j3(List<Integer> list) {
        q qVar;
        if (this.f13819c) {
            this.f13842o = list;
            H0();
        }
        if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
            return;
        }
        qVar.d(this);
    }

    public List<Integer> k3() {
        return this.f13841n;
    }

    @Override // z1.t
    public void t1(List<Integer> list) {
        if (this.f13818b) {
            boolean z3 = true;
            if (list.size() == this.f13843p.size()) {
                boolean z4 = false;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    if (!this.f13843p.contains(Integer.valueOf(list.get(i4).intValue()))) {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                this.f13843p.clear();
                this.f13843p.addAll(list);
                this.f13842o.clear();
                this.f13842o.addAll(list);
                q qVar = this.f13822f;
                if (qVar != null) {
                    qVar.d(this);
                }
            }
        }
    }
}
