package n2;

import n2.i0;
import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class i9 extends i0 {
    public i9() {
    }

    @Override // n2.i0
    public f C1() {
        return super.C1();
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
        k0Var.i(iW, iE, 10.0d, 2.111848394913139d, 0.12217304763960307d, fArr);
        return k0Var;
    }

    @Override // n2.p1
    public boolean k() {
        return true;
    }

    @Override // n2.i0, n2.x0, n2.b1, n2.p1
    public void x() {
        super.x();
        S1(60);
        k0(false);
        o1 o1VarD = o1.d(null);
        this.D = o1VarD.e(n1(), (this.f9527g.f9535f / 2) - 30);
        this.E = o1VarD.e(m1(), (this.f9527g.f9535f / 2) + 30);
        this.O = o1VarD.e(x1(), this.f9527g.f9535f / 2);
    }

    public i9(String str) {
        super(str);
        if (str.startsWith("UX-2DB ")) {
            A("UXC");
            p1.a aVar = this.f9527g;
            aVar.f9531b = 10.0f;
            aVar.f9532c = 2.1118484f;
            aVar.f9533d = false;
            aVar.f9535f = 128;
            aVar.f9536g = 512;
            int[] iArr = aVar.f9537h;
            iArr[0] = 502;
            iArr[1] = 502;
            iArr[2] = 502;
            iArr[3] = 502;
            int[] iArr2 = aVar.f9538i;
            iArr2[0] = 40;
            iArr2[1] = 60;
            iArr2[2] = 80;
            iArr2[3] = 100;
            aVar.f9539j = l.a().c(4);
            p1.a aVar2 = this.f9527g;
            aVar2.f9540k = 4.0E7f;
            int[] iArr3 = aVar2.f9541l;
            iArr3[0] = 4;
            iArr3[1] = 6;
            iArr3[2] = 8;
            iArr3[3] = 10;
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
            aVar4.f9358e = 16;
            aVar4.f9359f = 16;
            aVar4.f9360g = aVar2.f9536g / 3;
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
            aVar4.f9369p = true;
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
            aVar4.f9376w = 3;
            int[] iArr9 = aVar4.f9377x;
            iArr9[0] = 0;
            iArr9[1] = 7;
            iArr9[2] = -7;
            aVar4.f9378y = 3;
            int[] iArr10 = aVar4.f9379z;
            iArr10[0] = 255;
            iArr10[1] = 128;
            iArr10[2] = 64;
            aVar4.A = false;
            z("{'thyroid':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'smallParts':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'pediatrics':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'vascular':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'carotid':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'breast':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'msk':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2}}");
            x();
        }
    }
}
