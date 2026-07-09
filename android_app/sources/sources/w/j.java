package w;

/* JADX INFO: loaded from: classes.dex */
public class j extends p {
    public j(v.e eVar) {
        super(eVar);
        eVar.f11804e.f();
        eVar.f11806f.f();
        this.f12384f = ((v.h) eVar).Q1();
    }

    @Override // w.p, w.d
    public void a(d dVar) {
        f fVar = this.f12386h;
        if (fVar.f12322c && !fVar.f12329j) {
            this.f12386h.e((int) ((fVar.f12331l.get(0).f12326g * ((v.h) this.f12380b).U1()) + 0.5f));
        }
    }

    @Override // w.p
    public void d() {
        f fVar;
        p pVar;
        f fVar2;
        v.h hVar = (v.h) this.f12380b;
        int iR1 = hVar.R1();
        int iT1 = hVar.T1();
        hVar.U1();
        if (hVar.Q1() == 1) {
            f fVar3 = this.f12386h;
            if (iR1 != -1) {
                fVar3.f12331l.add(this.f12380b.V.f11804e.f12386h);
                this.f12380b.V.f11804e.f12386h.f12330k.add(this.f12386h);
                fVar2 = this.f12386h;
            } else if (iT1 != -1) {
                fVar3.f12331l.add(this.f12380b.V.f11804e.f12387i);
                this.f12380b.V.f11804e.f12387i.f12330k.add(this.f12386h);
                fVar2 = this.f12386h;
                iR1 = -iT1;
            } else {
                fVar3.f12321b = true;
                fVar3.f12331l.add(this.f12380b.V.f11804e.f12387i);
                this.f12380b.V.f11804e.f12387i.f12330k.add(this.f12386h);
                u(this.f12380b.f11804e.f12386h);
                pVar = this.f12380b.f11804e;
            }
            fVar2.f12325f = iR1;
            u(this.f12380b.f11804e.f12386h);
            pVar = this.f12380b.f11804e;
        } else {
            f fVar4 = this.f12386h;
            if (iR1 != -1) {
                fVar4.f12331l.add(this.f12380b.V.f11806f.f12386h);
                this.f12380b.V.f11806f.f12386h.f12330k.add(this.f12386h);
                fVar = this.f12386h;
            } else if (iT1 != -1) {
                fVar4.f12331l.add(this.f12380b.V.f11806f.f12387i);
                this.f12380b.V.f11806f.f12387i.f12330k.add(this.f12386h);
                fVar = this.f12386h;
                iR1 = -iT1;
            } else {
                fVar4.f12321b = true;
                fVar4.f12331l.add(this.f12380b.V.f11806f.f12387i);
                this.f12380b.V.f11806f.f12387i.f12330k.add(this.f12386h);
                u(this.f12380b.f11806f.f12386h);
                pVar = this.f12380b.f11806f;
            }
            fVar.f12325f = iR1;
            u(this.f12380b.f11806f.f12386h);
            pVar = this.f12380b.f11806f;
        }
        u(pVar.f12387i);
    }

    @Override // w.p
    public void e() {
        if (((v.h) this.f12380b).Q1() == 1) {
            this.f12380b.J1(this.f12386h.f12326g);
        } else {
            this.f12380b.K1(this.f12386h.f12326g);
        }
    }

    @Override // w.p
    public void f() {
        this.f12386h.c();
    }

    @Override // w.p
    public void n() {
        this.f12386h.f12329j = false;
        this.f12387i.f12329j = false;
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
