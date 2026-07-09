package n2;

import n2.p1;

/* JADX INFO: loaded from: classes.dex */
public class c4 extends b1 {
    public c4(String str) {
        super(str);
        A("WFP");
        p1.a aVar = this.f9527g;
        aVar.f9531b = 100000.0f;
        aVar.f9532c = p1.a(38.4f);
        p1.a aVar2 = this.f9527g;
        aVar2.f9533d = true;
        aVar2.f9534e = 38.4f;
        aVar2.f9535f = 128;
        aVar2.f9536g = 512;
        int[] iArr = aVar2.f9537h;
        iArr[0] = 512;
        iArr[1] = 512;
        iArr[2] = 512;
        iArr[3] = 512;
        int[] iArr2 = aVar2.f9538i;
        iArr2[0] = 45;
        iArr2[1] = 80;
        iArr2[2] = 100;
        iArr2[3] = 120;
        aVar2.f9539j = l.a().b(1.1f);
        p1.a aVar3 = this.f9527g;
        aVar3.f9540k = 5.0E7f;
        int[] iArr3 = aVar3.f9541l;
        iArr3[0] = 6;
        iArr3[1] = 10;
        iArr3[2] = 13;
        iArr3[3] = 15;
    }

    @Override // n2.p1
    public boolean k() {
        return true;
    }

    @Override // n2.b1, n2.p1
    public r0 y() {
        a1 a1Var = new a1();
        a1Var.f9561c = this;
        u uVar = new u(a1Var);
        uVar.o(new w());
        uVar.n("190.166.5.1");
        a1Var.U(uVar);
        a1Var.y(this.f9527g.f9535f / 2);
        return a1Var;
    }
}
