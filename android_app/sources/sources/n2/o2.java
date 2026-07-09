package n2;

import n2.i0;
import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class o2 extends i0 {
    public o2() {
    }

    @Override // n2.i0
    public f C1() {
        f fVarC1 = super.C1();
        fVarC1.D(2);
        fVarC1.A(false);
        fVarC1.B(true);
        return fVarC1;
    }

    @Override // n2.i0
    public n1 E1() {
        return new n1(this.f9527g.f9535f, 32, 1);
    }

    @Override // n2.i0
    public int L0() {
        return 0;
    }

    @Override // n2.p1
    public boolean d() {
        return false;
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

    public o2(String str) {
        super(str);
        A("WEP");
        p1.a aVar = this.f9527g;
        aVar.f9531b = 13.0f;
        aVar.f9532c = 1.2217305f;
        aVar.f9533d = false;
        aVar.f9535f = 160;
        aVar.f9536g = 512;
        int[] iArr = aVar.f9537h;
        iArr[0] = 512;
        iArr[1] = 512;
        iArr[2] = 512;
        iArr[3] = 512;
        int[] iArr2 = aVar.f9538i;
        iArr2[0] = 30;
        iArr2[1] = 50;
        iArr2[2] = 70;
        iArr2[3] = 90;
        aVar.f9540k = 4.0E7f;
        int[] iArr3 = aVar.f9541l;
        iArr3[0] = 3;
        iArr3[1] = 5;
        iArr3[2] = 7;
        iArr3[3] = 9;
        aVar.f9539j = l.a().c(4);
        x0.a aVar2 = this.f9683s;
        aVar2.f9691b = 1;
        aVar2.f9692c = 1;
        float[][] fArr = aVar2.f9693d;
        fArr[0][0] = 12.0f;
        fArr[1][0] = 20.0f;
        fArr[2][0] = 30.0f;
        fArr[3][0] = 40.0f;
        aVar2.f9694e = 1;
        float[][] fArr2 = aVar2.f9695f;
        fArr2[0][0] = 12.0f;
        fArr2[1][0] = 20.0f;
        fArr2[2][0] = 30.0f;
        fArr2[3][0] = 40.0f;
        aVar2.f9696g = 8.0f;
        aVar2.f9697h = 11.0f;
        aVar2.f9698i = 1;
        aVar2.f9699j[0] = 0;
        i0.a aVar3 = this.A;
        aVar3.f9355b = 1;
        aVar3.f9356c = 4;
        float[] fArr3 = aVar3.f9357d;
        fArr3[0] = 12.0f;
        fArr3[1] = 20.0f;
        fArr3[2] = 30.0f;
        fArr3[3] = 40.0f;
        aVar3.f9358e = 10;
        aVar3.f9359f = 16;
        aVar3.f9360g = this.f9527g.f9536g / 3;
        aVar3.f9361h = 16;
        aVar3.f9362i = 64;
        aVar3.f9363j = 4;
        int[] iArr4 = aVar3.f9364k;
        iArr4[0] = 1250;
        iArr4[1] = 2000;
        iArr4[2] = 3200;
        iArr4[3] = 4000;
        aVar3.f9365l = 6.6666665f;
        aVar3.f9366m = 16;
        aVar3.f9367n = 1;
        aVar3.f9368o[0] = 0;
        aVar3.f9370q = 4;
        int[] iArr5 = aVar3.f9371r;
        iArr5[0] = 12;
        iArr5[1] = 20;
        iArr5[2] = 30;
        iArr5[3] = 40;
        aVar3.f9372s = 4;
        int[] iArr6 = aVar3.f9373t;
        iArr6[0] = 1250;
        iArr6[1] = 2000;
        iArr6[2] = 3200;
        iArr6[3] = 4000;
        aVar3.f9374u = 8;
        aVar3.f9375v = 6.6666665f;
        aVar3.f9376w = 1;
        aVar3.f9377x[0] = 0;
        aVar3.f9378y = 3;
        int[] iArr7 = aVar3.f9379z;
        iArr7[0] = 255;
        iArr7[1] = 128;
        iArr7[2] = 64;
        aVar3.f9369p = false;
        aVar3.A = false;
        z("{'thyroid':{'gain':80,'harmonic':true,'dr':70,'enhLevel':2,'focuspos':3},'smallparts':{'gain':80,'harmonic':true,'dr':70,'enhLevel':2,'focuspos':2},'pediatrics':{'gain':80,'harmonic':true,'dr':70,'enhLevel':2,'focuspos':2},'vascular':{'gain':80,'harmonic':true,'dr':70,'enhLevel':2,'focuspos':3},'carotid':{'gain':80,'harmonic':true,'dr':70,'enhLevel':2,'focuspos':3},'breast':{'gain':80,'harmonic':true,'dr':70,'enhLevel':2,'focuspos':2},'msk':{'gain':80,'harmonic':false,'dr':80,'enhLevel':2,'focuspos':2}}");
        x();
    }
}
