package n2;

import n2.j0;
import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class z1 extends j0 {
    public z1() {
    }

    @Override // n2.p1
    public byte[] C(byte[] bArr) {
        int iE = E();
        for (int i4 = 0; i4 < iE; i4++) {
            bArr[i4] = bArr[i4 + iE];
        }
        return bArr;
    }

    public z1(String str) {
        super(str);
        A("SLP");
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
        fArr5[1] = 30.0f;
        aVar4.f9694e = 1;
        float[][] fArr6 = aVar4.f9695f;
        fArr6[0][0] = 8.0f;
        fArr6[1][0] = 15.0f;
        fArr6[2][0] = 20.0f;
        fArr6[3][0] = 25.0f;
        aVar4.f9696g = 7.5f;
        aVar4.f9697h = 10.0f;
        j0.a aVar5 = this.A;
        aVar5.f9393b = 4;
        float[] fArr7 = aVar5.f9394c;
        fArr7[0] = 8.0f;
        fArr7[1] = 15.0f;
        fArr7[2] = 20.0f;
        fArr7[3] = 25.0f;
        aVar5.f9395d = 4000;
        int[] iArr4 = aVar5.f9398g;
        iArr4[0] = 4000;
        iArr4[1] = 4000;
        iArr4[2] = 4000;
        iArr4[3] = 4000;
        aVar5.f9399h = 6.25f;
        aVar5.f9400i = false;
        aVar5.f9401j = false;
        o1 o1VarD = o1.d(null);
        this.D = o1VarD.e(J0(), (this.f9527g.f9535f / 2) - 16);
        this.E = o1VarD.e(I0(), (this.f9527g.f9535f / 2) + 16);
        this.K = o1VarD.e(R0(), this.f9527g.f9535f / 2);
        z("{'thyroid':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'smallParts':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'pediatrics':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'vascular':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'carotid':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'breast':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'msk':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2}}");
    }
}
