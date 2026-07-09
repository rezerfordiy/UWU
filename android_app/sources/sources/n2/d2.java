package n2;

import n2.i0;
import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class d2 extends m1 {
    public d2() {
    }

    @Override // n2.i0
    public f C1() {
        if (!this.W) {
            return super.C1();
        }
        f fVarC1 = super.C1();
        fVarC1.D(2);
        fVarC1.F(3);
        return fVarC1;
    }

    @Override // n2.i0
    public k0 D1() {
        if (this.W) {
            return null;
        }
        float[] fArr = new float[4];
        for (int i4 = 0; i4 < 4; i4++) {
            fArr[i4] = G(i4);
        }
        int iW = w();
        int iE = E();
        k0 k0Var = new k0();
        k0Var.i(iW, iE, 10.0d, 2.6354471705114375d, 0.12217304763960307d, fArr);
        return k0Var;
    }

    @Override // n2.i0
    public n1 E1() {
        return new n1(this.f9527g.f9535f, 32, 1);
    }

    @Override // n2.i0
    public int K0(byte b4) {
        return (b4 & 112) >> 4;
    }

    @Override // n2.i0
    public i0 M0() {
        d2 d2Var = new d2(this.f9523c);
        d2Var.a2(this.W);
        return d2Var;
    }

    @Override // n2.m1
    public void a2(boolean z3) {
        super.a2(z3);
        if (z3) {
            p1.a aVar = this.f9527g;
            aVar.f9531b = 10.0f;
            aVar.f9532c = 1.3177236f;
            aVar.f9533d = false;
            aVar.f9535f = 128;
            aVar.f9536g = 512;
            int[] iArr = aVar.f9537h;
            iArr[0] = 512;
            iArr[1] = 512;
            iArr[2] = 512;
            iArr[3] = 512;
            int[] iArr2 = aVar.f9538i;
            iArr2[0] = 30;
            iArr2[1] = 60;
            iArr2[2] = 90;
            iArr2[3] = 120;
            aVar.f9539j = l.a().c(4);
            p1.a aVar2 = this.f9527g;
            aVar2.f9540k = 4.0E7f;
            int[] iArr3 = aVar2.f9541l;
            iArr3[0] = 3;
            iArr3[1] = 6;
            iArr3[2] = 9;
            iArr3[3] = 12;
            x0.a aVar3 = this.f9683s;
            aVar3.f9691b = 1;
            aVar3.f9692c = 2;
            float[][] fArr = aVar3.f9693d;
            float[] fArr2 = fArr[0];
            fArr2[0] = 10.0f;
            fArr2[1] = 20.0f;
            float[] fArr3 = fArr[1];
            fArr3[0] = 10.0f;
            fArr3[1] = 30.0f;
            float[] fArr4 = fArr[2];
            fArr4[0] = 15.0f;
            fArr4[1] = 40.0f;
            float[] fArr5 = fArr[3];
            fArr5[0] = 15.0f;
            fArr5[1] = 60.0f;
            aVar3.f9694e = 2;
            float[][] fArr6 = aVar3.f9695f;
            float[] fArr7 = fArr6[0];
            fArr7[0] = 10.0f;
            fArr7[1] = 20.0f;
            float[] fArr8 = fArr6[1];
            fArr8[0] = 10.0f;
            fArr8[1] = 25.0f;
            float[] fArr9 = fArr6[2];
            fArr9[0] = 15.0f;
            fArr9[1] = 30.0f;
            float[] fArr10 = fArr6[3];
            fArr10[0] = 15.0f;
            fArr10[1] = 40.0f;
            aVar3.f9698i = 1;
            aVar3.f9699j[0] = 0;
            aVar3.f9696g = 6.5f;
            aVar3.f9697h = 8.0f;
            i0.a aVar4 = this.A;
            aVar4.f9355b = 0;
            aVar4.f9356c = 4;
            float[] fArr11 = aVar4.f9357d;
            fArr11[0] = 10.0f;
            fArr11[1] = 20.0f;
            fArr11[2] = 30.0f;
            fArr11[3] = 40.0f;
            aVar4.f9358e = 10;
            aVar4.f9359f = 16;
            aVar4.f9360g = aVar2.f9536g / 3;
            aVar4.f9363j = 4;
            int[] iArr4 = aVar4.f9364k;
            iArr4[0] = 1250;
            iArr4[1] = 2000;
            iArr4[2] = 3200;
            iArr4[3] = 4000;
            aVar4.f9365l = 6.6666665f;
            aVar4.f9366m = 16;
            aVar4.f9367n = 3;
            int[] iArr5 = aVar4.f9368o;
            iArr5[0] = 0;
            iArr5[1] = 7;
            iArr5[2] = -7;
            aVar4.f9369p = false;
            aVar4.f9370q = 4;
            int[] iArr6 = aVar4.f9371r;
            iArr6[0] = 10;
            iArr6[1] = 20;
            iArr6[2] = 30;
            iArr6[3] = 40;
            aVar4.f9372s = 4;
            int[] iArr7 = aVar4.f9373t;
            iArr7[0] = 1250;
            iArr7[1] = 2000;
            iArr7[2] = 3200;
            iArr7[3] = 4000;
            aVar4.f9374u = 8;
            aVar4.f9375v = 6.6666665f;
            aVar4.f9376w = 1;
            aVar4.f9377x[0] = 0;
            aVar4.f9378y = 3;
            int[] iArr8 = aVar4.f9379z;
            iArr8[0] = 255;
            iArr8[1] = 128;
            iArr8[2] = 64;
            aVar4.A = false;
        } else {
            p1.a aVar5 = this.f9527g;
            aVar5.f9531b = 10.0f;
            aVar5.f9532c = 2.6354473f;
            aVar5.f9533d = false;
            aVar5.f9535f = 256;
            aVar5.f9536g = 512;
            int[] iArr9 = aVar5.f9537h;
            iArr9[0] = 512;
            iArr9[1] = 512;
            iArr9[2] = 512;
            iArr9[3] = 512;
            int[] iArr10 = aVar5.f9538i;
            iArr10[0] = 30;
            iArr10[1] = 60;
            iArr10[2] = 90;
            iArr10[3] = 120;
            aVar5.f9539j = l.a().c(4);
            p1.a aVar6 = this.f9527g;
            aVar6.f9540k = 4.0E7f;
            int[] iArr11 = aVar6.f9541l;
            iArr11[0] = 3;
            iArr11[1] = 6;
            iArr11[2] = 9;
            iArr11[3] = 12;
            x0.a aVar7 = this.f9683s;
            aVar7.f9691b = 1;
            aVar7.f9692c = 2;
            float[][] fArr12 = aVar7.f9693d;
            float[] fArr13 = fArr12[0];
            fArr13[0] = 10.0f;
            fArr13[1] = 20.0f;
            float[] fArr14 = fArr12[1];
            fArr14[0] = 10.0f;
            fArr14[1] = 30.0f;
            float[] fArr15 = fArr12[2];
            fArr15[0] = 15.0f;
            fArr15[1] = 40.0f;
            float[] fArr16 = fArr12[3];
            fArr16[0] = 15.0f;
            fArr16[1] = 60.0f;
            aVar7.f9694e = 2;
            float[][] fArr17 = aVar7.f9695f;
            float[] fArr18 = fArr17[0];
            fArr18[0] = 10.0f;
            fArr18[1] = 20.0f;
            float[] fArr19 = fArr17[1];
            fArr19[0] = 10.0f;
            fArr19[1] = 25.0f;
            float[] fArr20 = fArr17[2];
            fArr20[0] = 15.0f;
            fArr20[1] = 30.0f;
            float[] fArr21 = fArr17[3];
            fArr21[0] = 15.0f;
            fArr21[1] = 40.0f;
            aVar7.f9698i = 3;
            int[] iArr12 = aVar7.f9699j;
            iArr12[0] = 0;
            iArr12[1] = 7;
            iArr12[2] = -7;
            aVar7.f9696g = 6.5f;
            aVar7.f9697h = 8.0f;
            i0.a aVar8 = this.A;
            aVar8.f9355b = 0;
            aVar8.f9356c = 4;
            float[] fArr22 = aVar8.f9357d;
            fArr22[0] = 10.0f;
            fArr22[1] = 20.0f;
            fArr22[2] = 30.0f;
            fArr22[3] = 40.0f;
            aVar8.f9358e = 10;
            aVar8.f9359f = 16;
            aVar8.f9360g = aVar6.f9536g / 3;
            aVar8.f9361h = 16;
            aVar8.f9362i = 64;
            aVar8.f9363j = 4;
            int[] iArr13 = aVar8.f9364k;
            iArr13[0] = 1250;
            iArr13[1] = 2000;
            iArr13[2] = 3200;
            iArr13[3] = 4000;
            aVar8.f9365l = 6.6666665f;
            aVar8.f9366m = 16;
            aVar8.f9367n = 3;
            int[] iArr14 = aVar8.f9368o;
            iArr14[0] = 0;
            iArr14[1] = 7;
            iArr14[2] = -7;
            aVar8.f9369p = false;
            aVar8.f9370q = 4;
            int[] iArr15 = aVar8.f9371r;
            iArr15[0] = 10;
            iArr15[1] = 20;
            iArr15[2] = 30;
            iArr15[3] = 40;
            aVar8.f9372s = 4;
            int[] iArr16 = aVar8.f9373t;
            iArr16[0] = 1250;
            iArr16[1] = 2000;
            iArr16[2] = 3200;
            iArr16[3] = 4000;
            aVar8.f9374u = 8;
            aVar8.f9375v = 6.6666665f;
            aVar8.f9376w = 1;
            aVar8.f9377x[0] = 0;
            aVar8.f9378y = 3;
            int[] iArr17 = aVar8.f9379z;
            iArr17[0] = 255;
            iArr17[1] = 128;
            iArr17[2] = 64;
            aVar8.A = false;
        }
        x();
    }

    @Override // n2.m1, n2.p1
    public boolean c() {
        return true;
    }

    @Override // n2.p1
    public boolean k() {
        return true;
    }

    @Override // n2.i0, n2.x0, n2.b1, n2.p1
    public void x() {
        super.x();
        k0(false);
        o1 o1VarD = o1.d(null);
        this.D = o1VarD.e(n1(), (this.f9527g.f9535f / 2) - (this.A.f9362i / 2));
        this.E = o1VarD.e(m1(), (this.f9527g.f9535f / 2) + (this.A.f9362i / 2));
        this.O = o1VarD.e(x1(), this.f9527g.f9535f / 2);
    }

    public d2(String str) {
        super(str);
        A("DWP");
        p1.a aVar = this.f9527g;
        aVar.f9531b = 10.0f;
        aVar.f9532c = 2.6354473f;
        aVar.f9533d = false;
        aVar.f9535f = 256;
        aVar.f9536g = 512;
        int[] iArr = aVar.f9537h;
        iArr[0] = 512;
        iArr[1] = 512;
        iArr[2] = 512;
        iArr[3] = 512;
        int[] iArr2 = aVar.f9538i;
        iArr2[0] = 30;
        iArr2[1] = 60;
        iArr2[2] = 90;
        iArr2[3] = 120;
        aVar.f9539j = l.a().c(4);
        p1.a aVar2 = this.f9527g;
        aVar2.f9540k = 4.0E7f;
        int[] iArr3 = aVar2.f9541l;
        iArr3[0] = 3;
        iArr3[1] = 6;
        iArr3[2] = 9;
        iArr3[3] = 12;
        x0.a aVar3 = this.f9683s;
        aVar3.f9691b = 1;
        aVar3.f9692c = 2;
        float[][] fArr = aVar3.f9693d;
        float[] fArr2 = fArr[0];
        fArr2[0] = 10.0f;
        fArr2[1] = 20.0f;
        float[] fArr3 = fArr[1];
        fArr3[0] = 10.0f;
        fArr3[1] = 30.0f;
        float[] fArr4 = fArr[2];
        fArr4[0] = 15.0f;
        fArr4[1] = 40.0f;
        float[] fArr5 = fArr[3];
        fArr5[0] = 15.0f;
        fArr5[1] = 60.0f;
        aVar3.f9694e = 2;
        float[][] fArr6 = aVar3.f9695f;
        float[] fArr7 = fArr6[0];
        fArr7[0] = 10.0f;
        fArr7[1] = 20.0f;
        float[] fArr8 = fArr6[1];
        fArr8[0] = 10.0f;
        fArr8[1] = 25.0f;
        float[] fArr9 = fArr6[2];
        fArr9[0] = 15.0f;
        fArr9[1] = 30.0f;
        float[] fArr10 = fArr6[3];
        fArr10[0] = 15.0f;
        fArr10[1] = 40.0f;
        aVar3.f9698i = 3;
        int[] iArr4 = aVar3.f9699j;
        iArr4[0] = 0;
        iArr4[1] = 7;
        iArr4[2] = -7;
        aVar3.f9696g = 6.5f;
        aVar3.f9697h = 8.0f;
        i0.a aVar4 = this.A;
        aVar4.f9355b = 0;
        aVar4.f9356c = 4;
        float[] fArr11 = aVar4.f9357d;
        fArr11[0] = 10.0f;
        fArr11[1] = 20.0f;
        fArr11[2] = 30.0f;
        fArr11[3] = 40.0f;
        aVar4.f9358e = 10;
        aVar4.f9359f = 16;
        aVar4.f9360g = aVar2.f9536g / 3;
        aVar4.f9361h = 16;
        aVar4.f9362i = 64;
        aVar4.f9363j = 4;
        int[] iArr5 = aVar4.f9364k;
        iArr5[0] = 1250;
        iArr5[1] = 2000;
        iArr5[2] = 3200;
        iArr5[3] = 4000;
        aVar4.f9365l = 6.6666665f;
        aVar4.f9366m = 16;
        aVar4.f9367n = 3;
        int[] iArr6 = aVar4.f9368o;
        iArr6[0] = 0;
        iArr6[1] = 7;
        iArr6[2] = -7;
        aVar4.f9369p = false;
        aVar4.f9370q = 4;
        int[] iArr7 = aVar4.f9371r;
        iArr7[0] = 10;
        iArr7[1] = 20;
        iArr7[2] = 30;
        iArr7[3] = 40;
        aVar4.f9372s = 4;
        int[] iArr8 = aVar4.f9373t;
        iArr8[0] = 1250;
        iArr8[1] = 2000;
        iArr8[2] = 3200;
        iArr8[3] = 4000;
        aVar4.f9374u = 8;
        aVar4.f9375v = 6.6666665f;
        aVar4.f9376w = 1;
        aVar4.f9377x[0] = 0;
        aVar4.f9378y = 3;
        int[] iArr9 = aVar4.f9379z;
        iArr9[0] = 255;
        iArr9[1] = 128;
        iArr9[2] = 64;
        aVar4.A = false;
        z("{'abdomen':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':3},'gynecology':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2},'obstetric':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2},'cardiac':{'gain':80,'harmonic':1,'dr':80,'enhLevel':2,'focuspos':2},'urology':{'gain':80,'harmonic':1,'dr':80,'enhLevel':2,'focuspos':2},'kidney':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2}}");
        x();
    }
}
