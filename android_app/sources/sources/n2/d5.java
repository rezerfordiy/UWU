package n2;

import n2.i0;
import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class d5 extends i0 {
    public d5() {
    }

    @Override // n2.i0
    public f C1() {
        f fVarC1 = super.C1();
        fVarC1.A(true);
        fVarC1.B(true);
        return fVarC1;
    }

    @Override // n2.i0
    public int L0() {
        return 1;
    }

    @Override // n2.i0, n2.x0
    public ca i0() {
        ca caVarI0 = super.i0();
        int i4 = this.f9527g.f9536g;
        caVarI0.f9158d = i4;
        caVarI0.f9159e = i4 / 2;
        caVarI0.f9155a = true;
        caVarI0.f9156b = true;
        caVarI0.f9157c = true;
        return caVarI0;
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
        o1 o1VarD = o1.d(null);
        this.D = o1VarD.e(n1(), (this.f9527g.f9535f / 2) - 30);
        this.E = o1VarD.e(m1(), (this.f9527g.f9535f / 2) + 30);
        this.O = o1VarD.e(x1(), this.f9527g.f9535f / 2);
    }

    public d5(String str) {
        super(str);
        A("WAP");
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
        aVar3.f9696g = 3.2f;
        aVar3.f9697h = 5.0f;
        i0.a aVar4 = this.A;
        aVar4.f9356c = 4;
        float[] fArr3 = aVar4.f9357d;
        fArr3[0] = 40.0f;
        fArr3[1] = 60.0f;
        fArr3[2] = 80.0f;
        fArr3[3] = 100.0f;
        aVar4.f9358e = 10;
        aVar4.f9359f = 16;
        aVar4.f9360g = aVar2.f9536g / 3;
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
        aVar4.f9369p = false;
        aVar4.f9370q = 4;
        int[] iArr5 = aVar4.f9371r;
        iArr5[0] = 40;
        iArr5[1] = 60;
        iArr5[2] = 80;
        iArr5[3] = 100;
        aVar4.f9372s = 4;
        int[] iArr6 = aVar4.f9373t;
        iArr6[0] = 1250;
        iArr6[1] = 1600;
        iArr6[2] = 2000;
        iArr6[3] = 2500;
        aVar4.f9374u = 8;
        aVar4.f9375v = 2.5f;
        aVar4.f9376w = 1;
        aVar4.f9377x[0] = 0;
        aVar4.f9378y = 3;
        int[] iArr7 = aVar4.f9379z;
        iArr7[0] = 255;
        iArr7[1] = 128;
        iArr7[2] = 64;
        aVar4.A = false;
        z("{'abdomen':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':3},'gynecology':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2},'obstetric':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2},'cardiac':{'gain':80,'harmonic':1,'dr':80,'enhLevel':2,'focuspos':2},'urology':{'gain':80,'harmonic':1,'dr':80,'enhLevel':2,'focuspos':2},'kidney':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2}}");
        x();
    }
}
