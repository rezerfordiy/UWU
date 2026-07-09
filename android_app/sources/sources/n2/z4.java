package n2;

import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class z4 extends x0 {
    public z4() {
    }

    @Override // n2.p1
    public boolean d() {
        return false;
    }

    @Override // n2.x0
    public ca i0() {
        ca caVar = new ca();
        caVar.f9158d = this.f9527g.f9536g;
        caVar.f9155a = true;
        return caVar;
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
        n0(2);
        m0(3);
        l0(80);
        o0(false);
    }

    @Override // n2.x0, n2.b1, n2.p1
    public r0 y() {
        w0 w0Var = (w0) super.y();
        w0Var.f9561c = this;
        u uVar = new u(w0Var);
        uVar.o(new w());
        uVar.n("190.166.7.1");
        w0Var.A = i0();
        w0Var.U(uVar);
        w0Var.y(this.f9527g.f9535f / 2);
        return w0Var;
    }

    public z4(String str) {
        super(str);
        A("WSP");
        p1.a aVar = this.f9527g;
        aVar.f9531b = 60.0f;
        aVar.f9532c = 1.0471976f;
        aVar.f9533d = false;
        aVar.f9535f = 160;
        aVar.f9536g = 512;
        int[] iArr = aVar.f9537h;
        iArr[0] = 512;
        iArr[1] = 512;
        iArr[2] = 512;
        iArr[3] = 512;
        int[] iArr2 = aVar.f9538i;
        iArr2[0] = 90;
        iArr2[1] = 130;
        iArr2[2] = 160;
        iArr2[3] = 200;
        aVar.f9539j = l.a().d(-0.12d, 1.0d, 0.4d, 1.8d);
        p1.a aVar2 = this.f9527g;
        aVar2.f9540k = 5.0E7f;
        int[] iArr3 = aVar2.f9541l;
        iArr3[0] = 11;
        iArr3[1] = 16;
        iArr3[2] = 20;
        iArr3[3] = 25;
        x0.a aVar3 = this.f9683s;
        aVar3.f9692c = 3;
        float[][] fArr = aVar3.f9693d;
        float[] fArr2 = fArr[0];
        fArr2[0] = 20.0f;
        fArr2[1] = 40.0f;
        fArr2[2] = 60.0f;
        float[] fArr3 = fArr[1];
        fArr3[0] = 30.0f;
        fArr3[1] = 50.0f;
        fArr3[2] = 70.0f;
        float[] fArr4 = fArr[2];
        fArr4[0] = 30.0f;
        fArr4[1] = 50.0f;
        fArr4[2] = 80.0f;
        float[] fArr5 = fArr[3];
        fArr5[0] = 30.0f;
        fArr5[1] = 60.0f;
        fArr5[2] = 100.0f;
        aVar3.f9694e = 2;
        float[][] fArr6 = aVar3.f9695f;
        float[] fArr7 = fArr6[0];
        fArr7[0] = 30.0f;
        fArr7[1] = 50.0f;
        float[] fArr8 = fArr6[1];
        fArr8[0] = 30.0f;
        fArr8[1] = 70.0f;
        float[] fArr9 = fArr6[2];
        fArr9[0] = 40.0f;
        fArr9[1] = 80.0f;
        float[] fArr10 = fArr6[3];
        fArr10[0] = 50.0f;
        fArr10[1] = 100.0f;
        aVar3.f9696g = 3.5f;
        aVar3.f9697h = 5.0f;
        z("{'abdomen':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':3},'gynecology':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2},'obstetric':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2},'cardiac':{'gain':80,'harmonic':1,'dr':80,'enhLevel':2,'focuspos':2},'urology':{'gain':80,'harmonic':1,'dr':80,'enhLevel':2,'focuspos':2},'kidney':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2}}");
        x();
    }
}
