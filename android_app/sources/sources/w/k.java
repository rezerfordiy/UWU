package w;

import java.util.Iterator;
import w.f;

/* JADX INFO: loaded from: classes.dex */
public class k extends p {
    public k(v.e eVar) {
        super(eVar);
    }

    @Override // w.p, w.d
    public void a(d dVar) {
        v.a aVar = (v.a) this.f12380b;
        int iS1 = aVar.S1();
        Iterator<f> it = this.f12386h.f12331l.iterator();
        int i4 = 0;
        int i5 = -1;
        while (it.hasNext()) {
            int i6 = it.next().f12326g;
            if (i5 == -1 || i6 < i5) {
                i5 = i6;
            }
            if (i4 < i6) {
                i4 = i6;
            }
        }
        if (iS1 == 0 || iS1 == 2) {
            this.f12386h.e(i5 + aVar.T1());
        } else {
            this.f12386h.e(i4 + aVar.T1());
        }
    }

    @Override // w.p
    public void d() {
        p pVar;
        v.e eVar = this.f12380b;
        if (eVar instanceof v.a) {
            this.f12386h.f12321b = true;
            v.a aVar = (v.a) eVar;
            int iS1 = aVar.S1();
            boolean zR1 = aVar.R1();
            int i4 = 0;
            if (iS1 == 0) {
                this.f12386h.f12324e = f.a.LEFT;
                while (i4 < aVar.f11910p1) {
                    v.e eVar2 = aVar.f11909o1[i4];
                    if (zR1 || eVar2.i0() != 8) {
                        f fVar = eVar2.f11804e.f12386h;
                        fVar.f12330k.add(this.f12386h);
                        this.f12386h.f12331l.add(fVar);
                    }
                    i4++;
                }
            } else {
                if (iS1 != 1) {
                    if (iS1 == 2) {
                        this.f12386h.f12324e = f.a.TOP;
                        while (i4 < aVar.f11910p1) {
                            v.e eVar3 = aVar.f11909o1[i4];
                            if (zR1 || eVar3.i0() != 8) {
                                f fVar2 = eVar3.f11806f.f12386h;
                                fVar2.f12330k.add(this.f12386h);
                                this.f12386h.f12331l.add(fVar2);
                            }
                            i4++;
                        }
                    } else {
                        if (iS1 != 3) {
                            return;
                        }
                        this.f12386h.f12324e = f.a.BOTTOM;
                        while (i4 < aVar.f11910p1) {
                            v.e eVar4 = aVar.f11909o1[i4];
                            if (zR1 || eVar4.i0() != 8) {
                                f fVar3 = eVar4.f11806f.f12387i;
                                fVar3.f12330k.add(this.f12386h);
                                this.f12386h.f12331l.add(fVar3);
                            }
                            i4++;
                        }
                    }
                    u(this.f12380b.f11806f.f12386h);
                    pVar = this.f12380b.f11806f;
                    u(pVar.f12387i);
                }
                this.f12386h.f12324e = f.a.RIGHT;
                while (i4 < aVar.f11910p1) {
                    v.e eVar5 = aVar.f11909o1[i4];
                    if (zR1 || eVar5.i0() != 8) {
                        f fVar4 = eVar5.f11804e.f12387i;
                        fVar4.f12330k.add(this.f12386h);
                        this.f12386h.f12331l.add(fVar4);
                    }
                    i4++;
                }
            }
            u(this.f12380b.f11804e.f12386h);
            pVar = this.f12380b.f11804e;
            u(pVar.f12387i);
        }
    }

    @Override // w.p
    public void e() {
        v.e eVar = this.f12380b;
        if (eVar instanceof v.a) {
            int iS1 = ((v.a) eVar).S1();
            if (iS1 == 0 || iS1 == 1) {
                this.f12380b.J1(this.f12386h.f12326g);
            } else {
                this.f12380b.K1(this.f12386h.f12326g);
            }
        }
    }

    @Override // w.p
    public void f() {
        this.f12381c = null;
        this.f12386h.c();
    }

    @Override // w.p
    public void n() {
        this.f12386h.f12329j = false;
    }

    @Override // w.p
    public boolean p() {
        return false;
    }

    public final void u(f fVar) {
        this.f12386h.f12330k.add(fVar);
        fVar.f12331l.add(this.f12386h);
    }
}
