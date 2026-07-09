package n2;

import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class n4 extends x0 {
    public n4() {
    }

    @Override // n2.x0
    public float T(int i4) {
        int[] iArr = {0, 8, 16, 20, 24, 28, 32, 36};
        if (i4 < 0 || i4 >= 8) {
            return 0.0f;
        }
        return iArr[i4];
    }

    @Override // n2.x0
    public float U() {
        return 0.122173056f;
    }

    @Override // n2.x0
    public float a0() {
        return 0.2f;
    }

    @Override // n2.p1
    public boolean b() {
        return true;
    }

    @Override // n2.p1
    public boolean k() {
        return true;
    }

    @Override // n2.x0, n2.b1, n2.p1
    public r0 y() {
        w0 w0Var = (w0) super.y();
        k0 k0Var = new k0();
        k0Var.l(this);
        w0Var.B = k0Var;
        w0Var.f9562d = new n1(this.f9527g.f9535f, 0);
        w0Var.f9561c = this;
        w0Var.y(this.f9527g.f9535f / 2);
        return w0Var;
    }

    public n4(String str) {
        super(str);
        A("WHP");
        p1.a aVar = this.f9527g;
        aVar.f9531b = 100000.0f;
        aVar.f9532c = p1.a(25.6f);
        p1.a aVar2 = this.f9527g;
        aVar2.f9533d = true;
        aVar2.f9534e = 25.6f;
        aVar2.f9535f = 128;
        aVar2.f9536g = 512;
        int[] iArr = aVar2.f9537h;
        iArr[0] = 502;
        iArr[1] = 502;
        iArr[2] = 502;
        iArr[3] = 502;
        int[] iArr2 = aVar2.f9538i;
        iArr2[0] = 20;
        iArr2[1] = 30;
        iArr2[2] = 40;
        iArr2[3] = 55;
        aVar2.f9539j = l.a().c(5);
        p1.a aVar3 = this.f9527g;
        aVar3.f9540k = 5.0E7f;
        int[] iArr3 = aVar3.f9541l;
        iArr3[0] = 3;
        iArr3[1] = 4;
        iArr3[2] = 5;
        iArr3[3] = 7;
        x0.a aVar4 = this.f9683s;
        aVar4.f9692c = 2;
        float[][] fArr = aVar4.f9693d;
        float[] fArr2 = fArr[0];
        fArr2[0] = 6.0f;
        fArr2[1] = 12.0f;
        float[] fArr3 = fArr[1];
        fArr3[0] = 9.0f;
        fArr3[1] = 15.0f;
        float[] fArr4 = fArr[2];
        fArr4[0] = 9.0f;
        fArr4[1] = 20.0f;
        float[] fArr5 = fArr[3];
        fArr5[0] = 9.0f;
        fArr5[1] = 25.0f;
        aVar4.f9694e = 2;
        float[][] fArr6 = aVar4.f9695f;
        float[] fArr7 = fArr6[0];
        fArr7[0] = 4.0f;
        fArr7[0] = 9.0f;
        float[] fArr8 = fArr6[1];
        fArr8[0] = 6.0f;
        fArr8[0] = 12.0f;
        float[] fArr9 = fArr6[2];
        fArr9[0] = 9.0f;
        fArr9[0] = 15.0f;
        float[] fArr10 = fArr6[3];
        fArr10[0] = 9.0f;
        fArr10[0] = 20.0f;
        aVar4.f9696g = 10.0f;
        aVar4.f9697h = 14.0f;
        k0(true);
        z("{'thyroid':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'smallParts':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'pediatrics':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'vascular':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'carotid':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'breast':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'msk':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2}}");
    }
}
