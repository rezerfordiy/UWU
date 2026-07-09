package n2;

import n2.p1;

/* JADX INFO: loaded from: classes.dex */
public class q5 extends b1 {
    public q5(String str) {
        super(str);
        A("WUP");
        p1.a aVar = this.f9527g;
        aVar.f9531b = 100000.0f;
        aVar.f9532c = p1.a(180.0f);
        p1.a aVar2 = this.f9527g;
        aVar2.f9533d = true;
        aVar2.f9534e = 180.0f;
        aVar2.f9535f = 256;
        aVar2.f9536g = 256;
        int[] iArr = aVar2.f9537h;
        iArr[0] = 256;
        iArr[1] = 256;
        iArr[2] = 256;
        iArr[3] = 256;
        int[] iArr2 = aVar2.f9538i;
        iArr2[0] = 70;
        iArr2[1] = 100;
        iArr2[2] = 120;
        iArr2[3] = 160;
        aVar2.f9539j = l.a().b(1.0f);
        p1.a aVar3 = this.f9527g;
        aVar3.f9540k = 5.0E7f;
        int[] iArr3 = aVar3.f9541l;
        iArr3[0] = 18;
        iArr3[1] = 26;
        iArr3[2] = 32;
        iArr3[3] = 40;
    }

    @Override // n2.b1, n2.p1
    public r0 y() {
        a1 a1Var = new a1();
        a1Var.f9562d = new n1(128, 0);
        a1Var.f9561c = this;
        return a1Var;
    }
}
