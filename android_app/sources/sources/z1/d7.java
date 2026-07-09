package z1;

import java.util.ArrayList;
import java.util.List;
import z1.q7;

/* JADX INFO: loaded from: classes.dex */
public class d7 extends q7.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<Boolean> f13011o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte f13012p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f13013q;

    public d7(boolean z3, boolean z4, List<g7> list, int i4) {
        super(z3, z4, list, i4);
        this.f13011o = new ArrayList();
        this.f13012p = (byte) 0;
        this.f13013q = new byte[2];
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.f13011o.add(Boolean.TRUE);
        }
    }

    @Override // z1.q7.c, z1.b0.o, z1.c0.l
    public boolean Q(int i4) {
        return super.Q(i4);
    }

    @Override // z1.q7.c, z1.b0.o, z1.c0.k
    public void e0(int i4) {
        q qVar;
        q qVar2;
        if (this.f13819c) {
            this.f12929m = i4;
            this.f12930n = i4;
            H0();
        }
        if (flag() && (qVar2 = this.f13822f) != null) {
            qVar2.d(this);
        }
        if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
            return;
        }
        qVar.d(this);
    }

    public int f3() {
        byte bG3 = g3();
        if (bG3 == 15) {
            return 0;
        }
        if (bG3 == 7) {
            return 1;
        }
        if (bG3 == 11) {
            return 2;
        }
        if (bG3 == 3) {
            return 3;
        }
        if (bG3 == 13) {
            return 4;
        }
        if (bG3 == 5) {
            return 5;
        }
        if (bG3 == 9) {
            return 6;
        }
        if (bG3 == 1) {
            return 7;
        }
        return o1();
    }

    public byte g3() {
        int iO1 = o1();
        byte[] bArr = this.f13013q;
        if (iO1 < bArr.length && iO1 >= 0) {
            this.f13012p = bArr[iO1];
        }
        return this.f13012p;
    }

    public byte[] h3() {
        return this.f13013q;
    }

    public void i3(int i4, boolean z3) {
        this.f13011o.remove(i4);
        this.f13011o.add(i4, Boolean.valueOf(z3));
    }

    public void j3(int i4, byte b4) {
        this.f13013q[i4] = b4;
    }

    public List<Boolean> k3() {
        return this.f13011o;
    }

    @Override // z1.q7.c, z1.b0.o, z1.c0.l
    public int l2() {
        return 2;
    }

    @Override // z1.q7.c, z1.b0.o, z1.c0.l
    public String n0(int i4) {
        int iF3;
        return (i4 < 0 || i4 > l2() || (iF3 = f3()) < 0 || iF3 >= this.f12928l.size()) ? s0.a.f11071l : this.f12928l.get(iF3).e();
    }

    @Override // z1.q7.c, z1.b0.o, z1.c0.l
    public int q2() {
        return 0;
    }
}
