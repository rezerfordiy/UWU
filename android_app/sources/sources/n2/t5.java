package n2;

import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class t5 extends x0 {
    public t5(String str) {
        super(str);
        A("WUP");
        p1.a aVar = this.f9527g;
        aVar.f9531b = 100000.0f;
        aVar.f9532c = p1.a(180.0f);
        p1.a aVar2 = this.f9527g;
        aVar2.f9533d = true;
        aVar2.f9534e = 180.0f;
        aVar2.f9535f = 256;
        aVar2.f9536g = 512;
        int[] iArr = aVar2.f9537h;
        iArr[0] = 512;
        iArr[1] = 512;
        iArr[2] = 512;
        iArr[3] = 512;
        int[] iArr2 = aVar2.f9538i;
        iArr2[0] = 80;
        iArr2[1] = 120;
        iArr2[2] = 140;
        iArr2[3] = 160;
        aVar2.f9539j = l.a().b(1.0f);
        p1.a aVar3 = this.f9527g;
        aVar3.f9540k = 4.0E7f;
        int[] iArr3 = aVar3.f9541l;
        iArr3[0] = 8;
        iArr3[1] = 12;
        iArr3[2] = 14;
        iArr3[3] = 16;
        x0.a aVar4 = this.f9683s;
        aVar4.f9691b = 1;
        aVar4.f9692c = 1;
        float[][] fArr = aVar4.f9693d;
        fArr[0][0] = 20.0f;
        fArr[1][0] = 40.0f;
        fArr[2][0] = 60.0f;
        fArr[3][0] = 80.0f;
        aVar4.f9694e = 1;
        float[][] fArr2 = aVar4.f9695f;
        fArr2[0][0] = 20.0f;
        fArr2[1][0] = 40.0f;
        fArr2[2][0] = 60.0f;
        fArr2[3][0] = 80.0f;
        aVar4.f9698i = 3;
        int[] iArr4 = aVar4.f9699j;
        iArr4[0] = 0;
        iArr4[1] = -7;
        iArr4[2] = 7;
        aVar4.f9696g = 3.5f;
        aVar4.f9697h = 5.0f;
        z("{'thyroid':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'smallParts':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'pediatrics':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'vascular':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'carotid':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'breast':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'msk':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2}}");
        x();
    }

    @Override // n2.p1
    public boolean d() {
        return true;
    }

    @Override // n2.p1
    public boolean k() {
        return true;
    }

    @Override // n2.p1
    public boolean t() {
        return true;
    }

    @Override // n2.x0, n2.b1, n2.p1
    public void x() {
        super.x();
        k0(false);
        o1 o1VarD = o1.d(null);
        this.f9686v = o1VarD.e(f0(), 2);
        this.f9690z = o1VarD.e(e0(), 0);
        this.f9685u = o1VarD.e(d0(), 80);
        this.f9684t = o1VarD.b(g0(), false);
    }

    @Override // n2.x0, n2.b1, n2.p1
    public r0 y() {
        w0 w0Var = (w0) super.y();
        w0Var.f9561c = this;
        u uVar = new u(w0Var);
        uVar.o(new w());
        uVar.n("190.166.6.1");
        w0Var.U(uVar);
        w0Var.y(this.f9527g.f9535f / 2);
        return w0Var;
    }
}
