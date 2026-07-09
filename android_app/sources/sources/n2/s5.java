package n2;

import n2.i0;
import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class s5 extends i0 {
    public s5(String str) {
        super(str);
        A("WUP");
        p1.a aVar = this.f9527g;
        aVar.f9531b = 100000.0f;
        aVar.f9532c = p1.a(180.0f);
        p1.a aVar2 = this.f9527g;
        aVar2.f9533d = true;
        aVar2.f9534e = 180.0f;
        aVar2.f9535f = 256;
        aVar2.f9536g = 512;
        int[] iArr = aVar2.f9537h;
        iArr[0] = 512;
        iArr[1] = 512;
        iArr[2] = 512;
        iArr[3] = 512;
        int[] iArr2 = aVar2.f9538i;
        iArr2[0] = 80;
        iArr2[1] = 120;
        iArr2[2] = 140;
        iArr2[3] = 160;
        aVar2.f9539j = l.a().b(1.0f);
        p1.a aVar3 = this.f9527g;
        aVar3.f9540k = 4.0E7f;
        int[] iArr3 = aVar3.f9541l;
        iArr3[0] = 8;
        iArr3[1] = 12;
        iArr3[2] = 14;
        iArr3[3] = 16;
        x0.a aVar4 = this.f9683s;
        aVar4.f9691b = 1;
        aVar4.f9692c = 1;
        float[][] fArr = aVar4.f9693d;
        fArr[0][0] = 20.0f;
        fArr[1][0] = 40.0f;
        fArr[2][0] = 60.0f;
        fArr[3][0] = 80.0f;
        aVar4.f9694e = 1;
        float[][] fArr2 = aVar4.f9695f;
        fArr2[0][0] = 20.0f;
        fArr2[1][0] = 40.0f;
        fArr2[2][0] = 60.0f;
        fArr2[3][0] = 80.0f;
        aVar4.f9698i = 3;
        int[] iArr4 = aVar4.f9699j;
        iArr4[0] = 0;
        iArr4[1] = -7;
        iArr4[2] = 7;
        aVar4.f9696g = 3.5f;
        aVar4.f9697h = 5.0f;
        i0.a aVar5 = this.A;
        aVar5.f9355b = 1;
        aVar5.f9356c = 4;
        float[] fArr3 = aVar5.f9357d;
        fArr3[0] = 10.0f;
        fArr3[1] = 20.0f;
        fArr3[2] = 30.0f;
        fArr3[3] = 40.0f;
        aVar5.f9363j = 4;
        int[] iArr5 = aVar5.f9364k;
        iArr5[0] = 1250;
        iArr5[1] = 2000;
        iArr5[3] = 3200;
        iArr5[4] = 4000;
        aVar5.f9365l = 6.666667f;
        aVar5.f9366m = 16;
        aVar5.f9367n = 5;
        int[] iArr6 = aVar5.f9368o;
        iArr6[0] = 0;
        iArr6[1] = 7;
        iArr6[2] = 12;
        iArr6[3] = -7;
        iArr6[4] = -12;
        aVar5.f9370q = 4;
        int[] iArr7 = aVar5.f9371r;
        iArr7[0] = 10;
        iArr7[1] = 20;
        iArr7[2] = 30;
        iArr7[3] = 40;
        aVar5.f9372s = 4;
        int[] iArr8 = aVar5.f9373t;
        iArr8[0] = 1250;
        iArr8[1] = 2000;
        iArr8[2] = 3200;
        iArr8[3] = 4000;
        aVar5.f9374u = 8;
        aVar5.f9375v = 6.666667f;
        aVar5.f9376w = 5;
        int[] iArr9 = aVar5.f9377x;
        iArr9[0] = 0;
        iArr9[1] = 7;
        iArr9[2] = 12;
        iArr9[3] = -7;
        iArr9[4] = -12;
        aVar5.f9378y = 3;
        int[] iArr10 = aVar5.f9379z;
        iArr10[0] = 255;
        iArr10[1] = 128;
        iArr10[2] = 64;
        aVar5.f9369p = false;
        aVar5.A = false;
        z("{'thyroid':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'smallParts':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'pediatrics':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'vascular':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'carotid':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'breast':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'msk':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2}}");
        x();
    }

    @Override // n2.i0
    public f C1() {
        f fVarC1 = super.C1();
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
        k0Var.k(iW, iE, 0.696f, 0.122173056f, fArr);
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
    public int L0() {
        return 2;
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

    @Override // n2.i0, n2.x0, n2.b1, n2.p1
    public void x() {
        super.x();
        S1(40);
        k0(false);
        o1 o1VarD = o1.d(null);
        this.D = o1VarD.e(n1(), (this.f9527g.f9535f / 2) - 30);
        this.E = o1VarD.e(m1(), (this.f9527g.f9535f / 2) + 30);
        this.O = o1VarD.e(x1(), this.f9527g.f9535f / 2);
        this.f9686v = o1VarD.e(f0(), 2);
        this.f9690z = o1VarD.e(e0(), 0);
        this.f9685u = o1VarD.e(d0(), 80);
        this.f9684t = o1VarD.b(g0(), false);
    }
}
