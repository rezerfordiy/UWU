package n2;

import n2.i0;
import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class b8 extends m1 {
    public b8() {
    }

    @Override // n2.i0
    public f C1() {
        if (!this.W) {
            f fVarC1 = super.C1();
            fVarC1.D(2);
            fVarC1.F(2);
            return fVarC1;
        }
        f fVarC12 = super.C1();
        fVarC12.D(2);
        fVarC12.F(3);
        fVarC12.C(1);
        fVarC12.d(true, 48);
        return fVarC12;
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
        k0Var.i(iW, iE, 45.0d, 0.8709192967451703d, 0.12217304763960307d, fArr);
        return k0Var;
    }

    @Override // n2.i0
    public n1 E1() {
        return new h1(this.f9527g.f9535f, 32);
    }

    @Override // n2.i0
    public boolean F1() {
        return this.W;
    }

    @Override // n2.i0
    public int L0() {
        return this.W ? 0 : 1;
    }

    @Override // n2.i0
    public i0 M0() {
        b8 b8Var = new b8(this.f9523c);
        b8Var.a2(this.W);
        return b8Var;
    }

    @Override // n2.m1
    public void a2(boolean z3) {
        i0.a aVar;
        super.a2(z3);
        if (z3) {
            p1.a aVar2 = this.f9527g;
            aVar2.f9531b = 0.0f;
            aVar2.f9532c = 1.1868238f;
            aVar2.f9533d = false;
            aVar2.f9535f = 128;
            aVar2.f9536g = 512;
            int[] iArr = aVar2.f9537h;
            iArr[0] = 512;
            iArr[1] = 512;
            iArr[2] = 512;
            iArr[3] = 512;
            int[] iArr2 = aVar2.f9538i;
            iArr2[0] = 90;
            iArr2[1] = 120;
            iArr2[2] = 140;
            iArr2[3] = 160;
            aVar2.f9539j = l.a().c(4);
            p1.a aVar3 = this.f9527g;
            aVar3.f9540k = 4.0E7f;
            int[] iArr3 = aVar3.f9541l;
            iArr3[0] = 9;
            iArr3[1] = 12;
            iArr3[2] = 14;
            iArr3[3] = 16;
            x0.a aVar4 = this.f9683s;
            aVar4.f9691b = 1;
            aVar4.f9692c = 1;
            float[][] fArr = aVar4.f9693d;
            fArr[0][0] = 50.0f;
            fArr[1][0] = 50.0f;
            fArr[2][0] = 80.0f;
            fArr[3][0] = 80.0f;
            aVar4.f9694e = 1;
            float[][] fArr2 = aVar4.f9695f;
            fArr2[0][0] = 50.0f;
            fArr2[1][0] = 50.0f;
            fArr2[2][0] = 80.0f;
            fArr2[3][0] = 80.0f;
            aVar4.f9698i = 3;
            int[] iArr4 = aVar4.f9699j;
            iArr4[0] = 0;
            iArr4[1] = -7;
            iArr4[2] = 7;
            aVar4.f9696g = 2.5f;
            aVar4.f9697h = 5.0f;
            aVar = this.A;
            aVar.f9355b = 1;
            aVar.f9356c = 4;
            float[] fArr3 = aVar.f9357d;
            fArr3[0] = 50.0f;
            fArr3[1] = 50.0f;
            fArr3[2] = 80.0f;
            fArr3[3] = 80.0f;
            aVar.f9358e = 20;
            aVar.f9359f = 16;
            aVar.f9360g = (aVar3.f9536g * 2) / 5;
            aVar.f9361h = 16;
            aVar.f9362i = 64;
            aVar.f9363j = 4;
            int[] iArr5 = aVar.f9364k;
            iArr5[0] = 2500;
            iArr5[1] = 3200;
            iArr5[2] = 4000;
            iArr5[3] = 5000;
            aVar.f9365l = 2.5f;
            aVar.f9366m = 16;
            aVar.f9367n = 1;
            aVar.f9368o[0] = 0;
            aVar.f9369p = false;
            aVar.f9370q = 4;
            int[] iArr6 = aVar.f9371r;
            iArr6[0] = 50;
            iArr6[1] = 50;
            iArr6[2] = 80;
            iArr6[3] = 80;
            aVar.f9372s = 4;
            int[] iArr7 = aVar.f9373t;
            iArr7[0] = 2000;
            iArr7[1] = 2500;
            iArr7[2] = 3200;
            iArr7[3] = 4000;
            aVar.f9374u = 8;
            aVar.f9375v = 2.5f;
            aVar.f9376w = 1;
            aVar.f9377x[0] = 0;
            aVar.f9378y = 3;
            int[] iArr8 = aVar.f9379z;
            iArr8[0] = 255;
            iArr8[1] = 128;
            iArr8[2] = 64;
        } else {
            p1.a aVar5 = this.f9527g;
            aVar5.f9531b = 45.0f;
            aVar5.f9532c = 0.8709193f;
            aVar5.f9533d = false;
            aVar5.f9535f = 160;
            aVar5.f9536g = 512;
            int[] iArr9 = aVar5.f9537h;
            iArr9[0] = 512;
            iArr9[1] = 512;
            iArr9[2] = 512;
            iArr9[3] = 512;
            int[] iArr10 = aVar5.f9538i;
            iArr10[0] = 90;
            iArr10[1] = 160;
            iArr10[2] = 220;
            iArr10[3] = 305;
            aVar5.f9539j = l.a().c(4);
            p1.a aVar6 = this.f9527g;
            aVar6.f9540k = 4.0E7f;
            int[] iArr11 = aVar6.f9541l;
            iArr11[0] = 9;
            iArr11[1] = 16;
            iArr11[2] = 22;
            iArr11[3] = 31;
            x0.a aVar7 = this.f9683s;
            aVar7.f9691b = 1;
            aVar7.f9692c = 1;
            float[][] fArr4 = aVar7.f9693d;
            fArr4[0][0] = 40.0f;
            fArr4[1][0] = 60.0f;
            fArr4[2][0] = 80.0f;
            fArr4[3][0] = 100.0f;
            aVar7.f9694e = 1;
            float[][] fArr5 = aVar7.f9695f;
            fArr5[0][0] = 40.0f;
            fArr5[1][0] = 60.0f;
            fArr5[2][0] = 80.0f;
            fArr5[3][0] = 100.0f;
            aVar7.f9698i = 3;
            int[] iArr12 = aVar7.f9699j;
            iArr12[0] = 0;
            iArr12[1] = -7;
            iArr12[2] = 7;
            aVar7.f9696g = 3.2f;
            aVar7.f9697h = 5.0f;
            aVar = this.A;
            aVar.f9355b = 1;
            aVar.f9356c = 4;
            float[] fArr6 = aVar.f9357d;
            fArr6[0] = 40.0f;
            fArr6[1] = 60.0f;
            fArr6[2] = 80.0f;
            fArr6[3] = 100.0f;
            aVar.f9358e = 20;
            aVar.f9359f = 16;
            aVar.f9360g = (aVar6.f9536g * 2) / 5;
            aVar.f9361h = 16;
            aVar.f9362i = 64;
            aVar.f9363j = 4;
            int[] iArr13 = aVar.f9364k;
            iArr13[0] = 1250;
            iArr13[1] = 1600;
            iArr13[2] = 2000;
            iArr13[3] = 2500;
            aVar.f9365l = 2.5f;
            aVar.f9366m = 16;
            aVar.f9367n = 1;
            aVar.f9368o[0] = 0;
            aVar.f9369p = false;
            aVar.f9370q = 4;
            int[] iArr14 = aVar.f9371r;
            iArr14[0] = 40;
            iArr14[1] = 60;
            iArr14[2] = 80;
            iArr14[3] = 100;
            aVar.f9372s = 4;
            int[] iArr15 = aVar.f9373t;
            iArr15[0] = 1250;
            iArr15[1] = 1600;
            iArr15[2] = 2000;
            iArr15[3] = 2500;
            aVar.f9374u = 8;
            aVar.f9375v = 2.5f;
            aVar.f9376w = 1;
            aVar.f9377x[0] = 0;
            aVar.f9378y = 3;
            int[] iArr16 = aVar.f9379z;
            iArr16[0] = 255;
            iArr16[1] = 128;
            iArr16[2] = 64;
        }
        aVar.A = false;
        x();
    }

    @Override // n2.m1, n2.p1
    public boolean c() {
        return true;
    }

    @Override // n2.p1
    public p1.a g(int i4) {
        p1.a aVarG = super.g(i4);
        if (this.W) {
            aVarG.f9531b = 0.0f;
            aVarG.f9532c = 1.186824f;
            aVarG.f9533d = false;
            aVarG.f9535f = 128;
            aVarG.f9536g = 512;
            int[] iArr = aVarG.f9537h;
            iArr[0] = 512;
            iArr[1] = 512;
            iArr[2] = 512;
            iArr[3] = 512;
            int[] iArr2 = aVarG.f9538i;
            iArr2[0] = 90;
            iArr2[1] = 120;
            iArr2[2] = 140;
            iArr2[3] = 160;
            aVarG.f9540k = 4.0E7f;
            int[] iArr3 = aVarG.f9541l;
            iArr3[0] = 9;
            iArr3[1] = 12;
            iArr3[2] = 14;
            iArr3[3] = 16;
        }
        return aVarG;
    }

    @Override // n2.i0, n2.x0
    public ca i0() {
        return null;
    }

    @Override // n2.p1
    public boolean k() {
        return true;
    }

    @Override // n2.p1
    public boolean t() {
        return true;
    }

    @Override // n2.i0, n2.x0, n2.b1, n2.p1
    public void x() {
        super.x();
        S1(40);
        k0(false);
    }

    public b8(String str) {
        super(str);
        if (str.startsWith("SX-8CXA ")) {
            A("WAP");
            p1.a aVar = this.f9527g;
            aVar.f9531b = 45.0f;
            aVar.f9532c = 0.8709193f;
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
            iArr2[1] = 160;
            iArr2[2] = 220;
            iArr2[3] = 305;
            aVar.f9539j = l.a().c(4);
            p1.a aVar2 = this.f9527g;
            aVar2.f9540k = 4.0E7f;
            int[] iArr3 = aVar2.f9541l;
            iArr3[0] = 9;
            iArr3[1] = 16;
            iArr3[2] = 22;
            iArr3[3] = 31;
            x0.a aVar3 = this.f9683s;
            aVar3.f9691b = 1;
            aVar3.f9692c = 1;
            float[][] fArr = aVar3.f9693d;
            fArr[0][0] = 40.0f;
            fArr[1][0] = 60.0f;
            fArr[2][0] = 80.0f;
            fArr[3][0] = 100.0f;
            aVar3.f9694e = 1;
            float[][] fArr2 = aVar3.f9695f;
            fArr2[0][0] = 40.0f;
            fArr2[1][0] = 60.0f;
            fArr2[2][0] = 80.0f;
            fArr2[3][0] = 100.0f;
            aVar3.f9698i = 3;
            int[] iArr4 = aVar3.f9699j;
            iArr4[0] = 0;
            iArr4[1] = -7;
            iArr4[2] = 7;
            aVar3.f9696g = 3.2f;
            aVar3.f9697h = 5.0f;
            i0.a aVar4 = this.A;
            aVar4.f9355b = 1;
            aVar4.f9356c = 4;
            float[] fArr3 = aVar4.f9357d;
            fArr3[0] = 40.0f;
            fArr3[1] = 60.0f;
            fArr3[2] = 80.0f;
            fArr3[3] = 100.0f;
            aVar4.f9358e = 20;
            aVar4.f9359f = 16;
            aVar4.f9360g = (aVar2.f9536g * 2) / 5;
            aVar4.f9361h = 16;
            aVar4.f9362i = 64;
            aVar4.f9363j = 4;
            int[] iArr5 = aVar4.f9364k;
            iArr5[0] = 1250;
            iArr5[1] = 1600;
            iArr5[2] = 2000;
            iArr5[3] = 2500;
            aVar4.f9365l = 2.5f;
            aVar4.f9366m = 16;
            aVar4.f9367n = 1;
            aVar4.f9368o[0] = 0;
            aVar4.f9369p = false;
            aVar4.f9370q = 4;
            int[] iArr6 = aVar4.f9371r;
            iArr6[0] = 40;
            iArr6[1] = 60;
            iArr6[2] = 80;
            iArr6[3] = 100;
            aVar4.f9372s = 4;
            int[] iArr7 = aVar4.f9373t;
            iArr7[0] = 1250;
            iArr7[1] = 1600;
            iArr7[2] = 2000;
            iArr7[3] = 2500;
            aVar4.f9374u = 8;
            aVar4.f9375v = 2.5f;
            aVar4.f9376w = 1;
            aVar4.f9377x[0] = 0;
            aVar4.f9378y = 3;
            int[] iArr8 = aVar4.f9379z;
            iArr8[0] = 255;
            iArr8[1] = 128;
            iArr8[2] = 64;
            aVar4.A = false;
            z("{'abdomen':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':3,'PRF':0,'WF':3},'gynecology':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2,'PRF':0,'WF':3},'obstetric':{'gain':80,'harmonic':1,'dr':80,'enhLevel':2,'focuspos':2,'PRF':0,'WF':3},'cardiac':{'gain':80,'harmonic':1,'dr':80,'enhLevel':2,'focuspos':2,'PRF':3,'WF':10},'urology':{'gain':80,'harmonic':1,'dr':80,'enhLevel':2,'focuspos':2,'PRF':0,'WF':3},'kidney':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2,'PRF':0,'WF':3}}");
            x();
        }
    }
}
