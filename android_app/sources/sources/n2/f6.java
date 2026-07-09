package n2;

import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class f6 extends q0 {
    public f6() {
    }

    @Override // n2.q0
    public void q0(int i4) {
        this.A = i4;
        if (i4 == 0) {
            r0();
        } else {
            s0();
        }
    }

    public void r0() {
        p1.a aVar = this.f9527g;
        aVar.f9531b = 100000.0f;
        aVar.f9532c = p1.a(33.6f);
        p1.a aVar2 = this.f9527g;
        aVar2.f9533d = true;
        aVar2.f9534e = 33.6f;
        aVar2.f9535f = 160;
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
        aVar2.f9539j = l.a().c(5);
        p1.a aVar3 = this.f9527g;
        aVar3.f9540k = 5.0E7f;
        int[] iArr3 = aVar3.f9541l;
        iArr3[0] = 3;
        iArr3[1] = 4;
        iArr3[2] = 5;
        iArr3[3] = 8;
        x0.a aVar4 = this.f9683s;
        aVar4.f9692c = 3;
        float[][] fArr = aVar4.f9693d;
        float[] fArr2 = fArr[0];
        fArr2[0] = 6.0f;
        fArr2[1] = 15.0f;
        fArr2[2] = 25.0f;
        float[] fArr3 = fArr[1];
        fArr3[0] = 10.0f;
        fArr3[1] = 20.0f;
        fArr3[2] = 30.0f;
        float[] fArr4 = fArr[2];
        fArr4[0] = 10.0f;
        fArr4[1] = 25.0f;
        fArr4[2] = 35.0f;
        float[] fArr5 = fArr[3];
        fArr5[0] = 10.0f;
        fArr5[1] = 25.0f;
        fArr5[2] = 40.0f;
        aVar4.f9694e = 2;
        float[][] fArr6 = aVar4.f9695f;
        float[] fArr7 = fArr6[0];
        fArr7[0] = 6.0f;
        fArr7[1] = 15.0f;
        float[] fArr8 = fArr6[1];
        fArr8[0] = 10.0f;
        fArr8[1] = 20.0f;
        float[] fArr9 = fArr6[2];
        fArr9[0] = 10.0f;
        fArr9[1] = 25.0f;
        float[] fArr10 = fArr6[3];
        fArr10[0] = 10.0f;
        fArr10[1] = 35.0f;
        aVar4.f9696g = 7.5f;
        aVar4.f9697h = 10.0f;
    }

    public void s0() {
        p1.a aVar = this.f9527g;
        aVar.f9531b = 60.0f;
        aVar.f9532c = 1.0471976f;
        aVar.f9533d = false;
        aVar.f9534e = 0.0f;
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
        iArr2[2] = 200;
        iArr2[3] = 240;
        aVar.f9539j = l.a().c(5);
        p1.a aVar2 = this.f9527g;
        aVar2.f9540k = 5.0E7f;
        int[] iArr3 = aVar2.f9541l;
        iArr3[0] = 11;
        iArr3[1] = 20;
        iArr3[2] = 25;
        iArr3[3] = 30;
        x0.a aVar3 = this.f9683s;
        aVar3.f9692c = 3;
        float[][] fArr = aVar3.f9693d;
        float[] fArr2 = fArr[0];
        fArr2[0] = 20.0f;
        fArr2[1] = 40.0f;
        fArr2[2] = 60.0f;
        float[] fArr3 = fArr[1];
        fArr3[0] = 30.0f;
        fArr3[1] = 50.0f;
        fArr3[2] = 70.0f;
        float[] fArr4 = fArr[2];
        fArr4[0] = 30.0f;
        fArr4[1] = 60.0f;
        fArr4[2] = 80.0f;
        float[] fArr5 = fArr[3];
        fArr5[0] = 30.0f;
        fArr5[1] = 60.0f;
        fArr5[2] = 100.0f;
        aVar3.f9694e = 1;
        float[][] fArr6 = aVar3.f9695f;
        fArr6[0][0] = 30.0f;
        fArr6[1][0] = 50.0f;
        fArr6[2][0] = 60.0f;
        fArr6[3][0] = 80.0f;
        aVar3.f9696g = 3.5f;
        aVar3.f9697h = 5.0f;
    }

    @Override // n2.q0, n2.x0, n2.b1, n2.p1
    public r0 y() {
        r0 r0VarY = super.y();
        r0VarY.f9562d.e(true);
        return r0VarY;
    }

    public f6(String str) {
        super(str);
        A("WXP");
        q0(0);
    }
}
