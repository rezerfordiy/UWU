package n2;

import n2.p1;

/* JADX INFO: loaded from: classes.dex */
public class a6 extends b1 {
    public a6() {
    }

    @Override // n2.b1, n2.p1
    public r0 y() {
        ba baVar = new ba();
        baVar.W(true);
        baVar.f9562d = new n1(this.f9527g.f9535f, 0);
        baVar.f9561c = this;
        baVar.y(this.f9527g.f9535f / 2);
        return baVar;
    }

    public a6(String str) {
        super(str);
        A("WMP");
        p1.a aVar = this.f9527g;
        aVar.f9531b = 16.0f;
        aVar.f9532c = 1.3962634f;
        aVar.f9533d = false;
        aVar.f9534e = 0.0f;
        aVar.f9535f = 128;
        aVar.f9536g = 512;
        int[] iArr = aVar.f9537h;
        iArr[0] = 280;
        iArr[1] = 392;
        iArr[2] = 450;
        iArr[3] = 512;
        int[] iArr2 = aVar.f9538i;
        iArr2[0] = 100;
        iArr2[1] = 140;
        iArr2[2] = 160;
        iArr2[3] = 180;
        aVar.f9539j = l.a().d(-0.026d, 1.0d, 0.27450980392156865d, 1.05d);
        p1.a aVar2 = this.f9527g;
        aVar2.f9540k = 2222222.0f;
        int[] iArr3 = aVar2.f9541l;
        iArr3[0] = 1;
        iArr3[1] = 1;
        iArr3[2] = 1;
        iArr3[3] = 1;
        z("{'abdomen':{'gain':80,'zoom':3},'gynecology':{'gain':60,'zoom':2},'obstetric':{'gain':60,'zoom':2},'cardiac':{'gain':60,'zoom':2},'urology':{'gain':60,'zoom':2},'kidney':{'gain':40,'zoom':1}}");
    }
}
