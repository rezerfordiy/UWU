package n2;

import n2.i0;
import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class v6 extends i0 {
    public v6() {
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

    @Override // n2.i0
    public n1 E1() {
        return new n1(this.f9527g.f9535f, 0);
    }

    @Override // n2.i0
    public int K0(byte b4) {
        return (b4 & 112) >> 4;
    }

    @Override // n2.p1
    public boolean d() {
        return true;
    }

    @Override // n2.p1
    public boolean k() {
        return true;
    }

    @Override // n2.i0, n2.p1
    public boolean l() {
        return false;
    }

    @Override // n2.i0, n2.p1
    public boolean m() {
        return false;
    }

    public v6(String str) {
        super(str);
        if (str.startsWith("SX-1TB ")) {
            A("WLP");
            p1.a aVar = this.f9527g;
            aVar.f9531b = 100000.0f;
            aVar.f9532c = p1.a(38.4f);
            p1.a aVar2 = this.f9527g;
            aVar2.f9533d = true;
            aVar2.f9534e = 38.4f;
            aVar2.f9535f = 128;
            aVar2.f9536g = 512;
            int[] iArr = aVar2.f9537h;
            iArr[0] = 512;
            iArr[1] = 512;
            iArr[2] = 512;
            iArr[3] = 512;
            int[] iArr2 = aVar2.f9538i;
            iArr2[0] = 20;
            iArr2[1] = 30;
            iArr2[2] = 40;
            iArr2[3] = 60;
            aVar2.f9539j = l.a().c(4);
            p1.a aVar3 = this.f9527g;
            aVar3.f9540k = 4.0E7f;
            int[] iArr3 = aVar3.f9541l;
            iArr3[0] = 2;
            iArr3[1] = 3;
            iArr3[2] = 4;
            iArr3[3] = 6;
            x0.a aVar4 = this.f9683s;
            aVar4.f9692c = 2;
            float[][] fArr = aVar4.f9693d;
            float[] fArr2 = fArr[0];
            fArr2[0] = 8.0f;
            fArr2[1] = 15.0f;
            float[] fArr3 = fArr[1];
            fArr3[0] = 10.0f;
            fArr3[1] = 20.0f;
            float[] fArr4 = fArr[2];
            fArr4[0] = 10.0f;
            fArr4[1] = 25.0f;
            float[] fArr5 = fArr[3];
            fArr5[0] = 10.0f;
            fArr5[1] = 3.0f;
            aVar4.f9694e = 2;
            float[][] fArr6 = aVar4.f9695f;
            float[] fArr7 = fArr6[0];
            fArr7[0] = 4.0f;
            fArr7[1] = 10.0f;
            float[] fArr8 = fArr6[1];
            fArr8[0] = 8.0f;
            fArr8[1] = 15.0f;
            float[] fArr9 = fArr6[2];
            fArr9[0] = 8.0f;
            fArr9[1] = 20.0f;
            float[] fArr10 = fArr6[3];
            fArr10[0] = 8.0f;
            fArr10[1] = 25.0f;
            aVar4.f9696g = 7.5f;
            aVar4.f9697h = 10.0f;
            i0.a aVar5 = this.A;
            aVar5.f9367n = 3;
            int[] iArr4 = aVar5.f9368o;
            iArr4[0] = 0;
            iArr4[1] = -7;
            iArr4[2] = 7;
            k0(true);
            z("{'thyroid':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'smallParts':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'pediatrics':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'vascular':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'carotid':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'breast':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'msk':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2}}");
        }
    }
}
