package n2;

import n2.i0;
import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class e2 extends i0 {
    public e2() {
    }

    @Override // n2.i0
    public f C1() {
        f fVarC1 = super.C1();
        fVarC1.A(false);
        fVarC1.B(true);
        fVarC1.D(2);
        return fVarC1;
    }

    @Override // n2.i0
    public k0 D1() {
        float[] fArr = new float[4];
        for (int i4 = 0; i4 < 4; i4++) {
            fArr[i4] = G(i4);
        }
        int iW = w();
        int iE = E();
        k0 k0Var = new k0();
        k0Var.k(iW, iE, 0.3f, 0.122173056f, fArr);
        return k0Var;
    }

    @Override // n2.p1
    public boolean d() {
        return true;
    }

    @Override // n2.p1
    public boolean k() {
        return true;
    }

    @Override // n2.i0, n2.x0, n2.b1, n2.p1
    public void x() {
        super.x();
        S1(40);
        k0(true);
        o1 o1VarD = o1.d(null);
        this.D = o1VarD.e(n1(), (this.f9527g.f9535f / 2) - 30);
        this.E = o1VarD.e(m1(), (this.f9527g.f9535f / 2) + 30);
        this.O = o1VarD.e(x1(), this.f9527g.f9535f / 2);
    }

    public e2(String str) {
        super(str);
        A("DWP");
        p1.a aVar = this.f9527g;
        aVar.f9531b = 100000.0f;
        aVar.f9532c = p1.a(38.4f);
        p1.a aVar2 = this.f9527g;
        aVar2.f9533d = true;
        aVar2.f9534e = 38.4f;
        aVar2.f9535f = 128;
        aVar2.f9536g = 512;
        int[] iArr = aVar2.f9537h;
        iArr[0] = 502;
        iArr[1] = 502;
        iArr[2] = 502;
        iArr[3] = 502;
        int[] iArr2 = aVar2.f9538i;
        iArr2[0] = 20;
        iArr2[1] = 40;
        iArr2[2] = 60;
        iArr2[3] = 100;
        aVar2.f9539j = l.a().c(4);
        p1.a aVar3 = this.f9527g;
        aVar3.f9540k = 4.0E7f;
        int[] iArr3 = aVar3.f9541l;
        iArr3[0] = 2;
        iArr3[1] = 4;
        iArr3[2] = 6;
        iArr3[3] = 10;
        x0.a aVar4 = this.f9683s;
        aVar4.f9692c = 2;
        float[][] fArr = aVar4.f9693d;
        float[] fArr2 = fArr[0];
        fArr2[0] = 6.0f;
        fArr2[1] = 15.0f;
        float[] fArr3 = fArr[1];
        fArr3[0] = 9.0f;
        fArr3[1] = 20.0f;
        float[] fArr4 = fArr[2];
        fArr4[0] = 12.0f;
        fArr4[1] = 25.0f;
        float[] fArr5 = fArr[3];
        fArr5[0] = 15.0f;
        fArr5[1] = 30.0f;
        aVar4.f9694e = 2;
        float[][] fArr6 = aVar4.f9695f;
        float[] fArr7 = fArr6[0];
        fArr7[0] = 4.0f;
        fArr7[1] = 9.0f;
        float[] fArr8 = fArr6[1];
        fArr8[0] = 9.0f;
        fArr8[1] = 15.0f;
        float[] fArr9 = fArr6[2];
        fArr9[0] = 9.0f;
        fArr9[1] = 20.0f;
        float[] fArr10 = fArr6[3];
        fArr10[0] = 12.0f;
        fArr10[1] = 25.0f;
        aVar4.f9696g = 7.5f;
        aVar4.f9697h = 10.0f;
        i0.a aVar5 = this.A;
        aVar5.f9356c = 4;
        float[] fArr11 = aVar5.f9357d;
        fArr11[0] = 6.0f;
        fArr11[1] = 12.0f;
        fArr11[2] = 20.0f;
        fArr11[3] = 25.0f;
        aVar5.f9358e = 10;
        aVar5.f9359f = 16;
        aVar5.f9360g = aVar3.f9536g / 2;
        aVar5.f9363j = 4;
        int[] iArr4 = aVar5.f9364k;
        iArr4[0] = 1250;
        iArr4[1] = 2000;
        iArr4[2] = 3200;
        iArr4[3] = 4000;
        aVar5.f9365l = 6.6666665f;
        aVar5.f9366m = 16;
        aVar5.f9367n = 5;
        int[] iArr5 = aVar5.f9368o;
        iArr5[0] = 0;
        iArr5[1] = 7;
        iArr5[2] = 12;
        iArr5[3] = -7;
        iArr5[4] = -12;
        aVar5.f9369p = true;
        aVar5.f9370q = 4;
        int[] iArr6 = aVar5.f9371r;
        iArr6[0] = 6;
        iArr6[1] = 12;
        iArr6[2] = 20;
        iArr6[3] = 25;
        aVar5.f9372s = 4;
        int[] iArr7 = aVar5.f9373t;
        iArr7[0] = 1250;
        iArr7[1] = 2000;
        iArr7[2] = 3200;
        iArr7[3] = 4000;
        aVar5.f9374u = 8;
        aVar5.f9375v = 6.6666665f;
        aVar5.f9376w = 5;
        int[] iArr8 = aVar5.f9377x;
        iArr8[0] = 0;
        iArr8[1] = 7;
        iArr8[2] = 12;
        iArr8[3] = -7;
        iArr8[4] = -12;
        aVar5.f9378y = 3;
        int[] iArr9 = aVar5.f9379z;
        iArr9[0] = 255;
        iArr9[1] = 128;
        iArr9[2] = 64;
        aVar5.A = true;
        z("{'thyroid':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'smallParts':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'pediatrics':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'vascular':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'carotid':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'breast':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'msk':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2}}");
        x();
    }
}
