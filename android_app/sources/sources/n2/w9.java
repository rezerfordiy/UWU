package n2;

import n2.i0;
import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class w9 extends m1 {
    public w9() {
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
        return null;
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
        w9 w9Var = new w9(this.f9523c);
        w9Var.a2(this.W);
        return w9Var;
    }

    @Override // n2.m1
    public void a2(boolean z3) {
        i0.a aVar;
        super.a2(z3);
        p1.a aVar2 = this.f9527g;
        aVar2.f9531b = 0.0f;
        aVar2.f9532c = 1.3962634f;
        aVar2.f9533d = false;
        aVar2.f9535f = 128;
        aVar2.f9536g = 512;
        int[] iArr = aVar2.f9537h;
        if (z3) {
            iArr[0] = 512;
            iArr[1] = 512;
            iArr[2] = 512;
            iArr[3] = 512;
            int[] iArr2 = aVar2.f9538i;
            iArr2[0] = 90;
            iArr2[1] = 130;
            iArr2[2] = 160;
            iArr2[3] = 200;
            aVar2.f9539j = l.a().c(4);
            p1.a aVar3 = this.f9527g;
            aVar3.f9540k = 4.0E7f;
            int[] iArr3 = aVar3.f9541l;
            iArr3[0] = 9;
            iArr3[1] = 13;
            iArr3[2] = 16;
            iArr3[3] = 20;
            x0.a aVar4 = this.f9683s;
            aVar4.f9691b = 1;
            aVar4.f9692c = 1;
            float[][] fArr = aVar4.f9693d;
            fArr[0][0] = 40.0f;
            fArr[1][0] = 60.0f;
            fArr[2][0] = 80.0f;
            fArr[3][0] = 100.0f;
            aVar4.f9694e = 1;
            float[][] fArr2 = aVar4.f9695f;
            fArr2[0][0] = 40.0f;
            fArr2[1][0] = 60.0f;
            fArr2[2][0] = 80.0f;
            fArr2[3][0] = 100.0f;
            aVar4.f9698i = 0;
            aVar4.f9699j[0] = 0;
            aVar4.f9696g = 2.2f;
            aVar4.f9697h = 3.6f;
            aVar = this.A;
            aVar.f9355b = 1;
            aVar.f9356c = 4;
            float[] fArr3 = aVar.f9357d;
            fArr3[0] = 40.0f;
            fArr3[1] = 60.0f;
            fArr3[2] = 80.0f;
            fArr3[3] = 100.0f;
            aVar.f9358e = 20;
            aVar.f9359f = 16;
            aVar.f9360g = (aVar3.f9536g * 2) / 5;
            aVar.f9361h = 16;
            aVar.f9362i = 48;
            aVar.f9363j = 4;
            int[] iArr4 = aVar.f9364k;
            iArr4[0] = 2000;
            iArr4[1] = 2500;
            iArr4[2] = 3200;
            iArr4[3] = 4000;
            aVar.f9365l = 2.5f;
            aVar.f9366m = 16;
            aVar.f9367n = 1;
            aVar.f9368o[0] = 0;
            aVar.f9369p = true;
            aVar.f9370q = 4;
            int[] iArr5 = aVar.f9371r;
            iArr5[0] = 40;
            iArr5[1] = 60;
            iArr5[2] = 80;
            iArr5[3] = 100;
            aVar.f9372s = 4;
            int[] iArr6 = aVar.f9373t;
            iArr6[0] = 2000;
            iArr6[1] = 2500;
            iArr6[2] = 3200;
            iArr6[3] = 4000;
            aVar.f9374u = 8;
            aVar.f9375v = 2.5f;
            aVar.f9376w = 1;
            aVar.f9377x[0] = 0;
            aVar.f9378y = 3;
            int[] iArr7 = aVar.f9379z;
            iArr7[0] = 255;
            iArr7[1] = 128;
            iArr7[2] = 64;
        } else {
            iArr[0] = 512;
            iArr[1] = 512;
            iArr[2] = 512;
            iArr[3] = 512;
            int[] iArr8 = aVar2.f9538i;
            iArr8[0] = 90;
            iArr8[1] = 160;
            iArr8[2] = 200;
            iArr8[3] = 240;
            aVar2.f9539j = l.a().c(4);
            p1.a aVar5 = this.f9527g;
            aVar5.f9540k = 4.0E7f;
            int[] iArr9 = aVar5.f9541l;
            iArr9[0] = 9;
            iArr9[1] = 16;
            iArr9[2] = 20;
            iArr9[3] = 24;
            x0.a aVar6 = this.f9683s;
            aVar6.f9691b = 1;
            aVar6.f9692c = 1;
            float[][] fArr4 = aVar6.f9693d;
            fArr4[0][0] = 40.0f;
            fArr4[1][0] = 50.0f;
            fArr4[2][0] = 80.0f;
            fArr4[3][0] = 100.0f;
            aVar6.f9694e = 1;
            float[][] fArr5 = aVar6.f9695f;
            fArr5[0][0] = 40.0f;
            fArr5[1][0] = 60.0f;
            fArr5[2][0] = 80.0f;
            fArr5[3][0] = 100.0f;
            aVar6.f9698i = 0;
            aVar6.f9699j[0] = 0;
            aVar6.f9696g = 2.2f;
            aVar6.f9697h = 3.6f;
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
            aVar.f9360g = (aVar5.f9536g * 2) / 5;
            aVar.f9361h = 16;
            aVar.f9362i = 48;
            aVar.f9363j = 4;
            int[] iArr10 = aVar.f9364k;
            iArr10[0] = 1000;
            iArr10[1] = 1250;
            iArr10[2] = 1600;
            iArr10[3] = 2000;
            aVar.f9365l = 2.5f;
            aVar.f9366m = 16;
            aVar.f9367n = 1;
            aVar.f9368o[0] = 0;
            aVar.f9369p = true;
            aVar.f9370q = 4;
            int[] iArr11 = aVar.f9371r;
            iArr11[0] = 40;
            iArr11[1] = 60;
            iArr11[2] = 80;
            iArr11[3] = 100;
            aVar.f9372s = 4;
            int[] iArr12 = aVar.f9373t;
            iArr12[0] = 2000;
            iArr12[1] = 2500;
            iArr12[2] = 3200;
            iArr12[3] = 4000;
            aVar.f9374u = 8;
            aVar.f9375v = 2.5f;
            aVar.f9376w = 1;
            aVar.f9377x[0] = 0;
            aVar.f9378y = 3;
            int[] iArr13 = aVar.f9379z;
            iArr13[0] = 255;
            iArr13[1] = 128;
            iArr13[2] = 64;
        }
        aVar.A = true;
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
            aVarG.f9532c = 1.3962634f;
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
            iArr2[1] = 130;
            iArr2[2] = 160;
            iArr2[3] = 200;
            aVarG.f9540k = 4.0E7f;
            int[] iArr3 = aVarG.f9541l;
            iArr3[0] = 9;
            iArr3[1] = 13;
            iArr3[2] = 16;
            iArr3[3] = 20;
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

    @Override // n2.i0, n2.x0, n2.b1, n2.p1
    public void x() {
        super.x();
        S1(40);
        k0(false);
    }

    public w9(String str) {
        super(str);
        if (str.startsWith("UX-8PA ")) {
            A("WAP");
            p1.a aVar = this.f9527g;
            aVar.f9531b = 0.0f;
            aVar.f9532c = 1.3962634f;
            aVar.f9533d = false;
            aVar.f9535f = 128;
            aVar.f9536g = 512;
            int[] iArr = aVar.f9537h;
            iArr[0] = 512;
            iArr[1] = 512;
            iArr[2] = 512;
            iArr[3] = 512;
            int[] iArr2 = aVar.f9538i;
            iArr2[0] = 90;
            iArr2[1] = 160;
            iArr2[2] = 200;
            iArr2[3] = 240;
            aVar.f9539j = l.a().c(4);
            p1.a aVar2 = this.f9527g;
            aVar2.f9540k = 4.0E7f;
            int[] iArr3 = aVar2.f9541l;
            iArr3[0] = 9;
            iArr3[1] = 16;
            iArr3[2] = 20;
            iArr3[3] = 25;
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
            aVar3.f9698i = 1;
            aVar3.f9699j[0] = 0;
            aVar3.f9696g = 2.2f;
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
            int[] iArr4 = aVar4.f9364k;
            iArr4[0] = 1000;
            iArr4[1] = 1250;
            iArr4[2] = 1600;
            iArr4[3] = 2000;
            aVar4.f9365l = 2.5f;
            aVar4.f9366m = 16;
            aVar4.f9367n = 1;
            aVar4.f9368o[0] = 0;
            aVar4.f9369p = true;
            aVar4.f9370q = 4;
            int[] iArr5 = aVar4.f9371r;
            iArr5[0] = 40;
            iArr5[1] = 60;
            iArr5[2] = 80;
            iArr5[3] = 100;
            aVar4.f9372s = 4;
            int[] iArr6 = aVar4.f9373t;
            iArr6[0] = 2000;
            iArr6[1] = 2500;
            iArr6[2] = 3200;
            iArr6[3] = 4000;
            aVar4.f9374u = 8;
            aVar4.f9375v = 2.5f;
            aVar4.f9376w = 1;
            aVar4.f9377x[0] = 0;
            aVar4.f9378y = 3;
            int[] iArr7 = aVar4.f9379z;
            iArr7[0] = 255;
            iArr7[1] = 128;
            iArr7[2] = 64;
            aVar4.A = true;
            z("{'abdomen':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':3,'PRF':0,'WF':3},'gynecology':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2,'PRF':0,'WF':3},'obstetric':{'gain':80,'harmonic':1,'dr':80,'enhLevel':2,'focuspos':2,'PRF':0,'WF':3},'cardiac':{'gain':80,'harmonic':1,'dr':80,'enhLevel':2,'focuspos':2,'PRF':3,'WF':10},'urology':{'gain':80,'harmonic':1,'dr':80,'enhLevel':2,'focuspos':2,'PRF':0,'WF':3},'kidney':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2,'PRF':0,'WF':3}}");
            x();
        }
    }
}
