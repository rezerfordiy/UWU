package n2;

import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class r5 extends x0 {
    public r5(String str) {
        super(str);
        A("WUP");
        p1.a aVar = this.f9527g;
        aVar.f9531b = 100000.0f;
        aVar.f9532c = p1.a(180.0f);
        p1.a aVar2 = this.f9527g;
        aVar2.f9533d = true;
        aVar2.f9534e = 180.0f;
        aVar2.f9535f = 256;
        aVar2.f9536g = 256;
        int[] iArr = aVar2.f9537h;
        iArr[0] = 256;
        iArr[1] = 256;
        iArr[2] = 256;
        iArr[3] = 256;
        int[] iArr2 = aVar2.f9538i;
        iArr2[0] = 80;
        iArr2[1] = 120;
        iArr2[2] = 160;
        iArr2[3] = 200;
        aVar2.f9539j = l.a().b(1.0f);
        p1.a aVar3 = this.f9527g;
        aVar3.f9540k = 4.0E7f;
        int[] iArr3 = aVar3.f9541l;
        iArr3[0] = 16;
        iArr3[1] = 24;
        iArr3[2] = 32;
        iArr3[3] = 40;
        x0.a aVar4 = this.f9683s;
        aVar4.f9692c = 2;
        float[][] fArr = aVar4.f9693d;
        float[] fArr2 = fArr[0];
        fArr2[0] = 30.0f;
        fArr2[1] = 40.0f;
        float[] fArr3 = fArr[1];
        fArr3[0] = 40.0f;
        fArr3[1] = 60.0f;
        float[] fArr4 = fArr[2];
        fArr4[0] = 40.0f;
        fArr4[1] = 70.0f;
        float[] fArr5 = fArr[3];
        fArr5[0] = 40.0f;
        fArr5[1] = 100.0f;
        aVar4.f9694e = 1;
        float[][] fArr6 = aVar4.f9695f;
        fArr6[0][0] = 40.0f;
        fArr6[1][0] = 60.0f;
        fArr6[2][0] = 80.0f;
        fArr6[3][0] = 100.0f;
        aVar4.f9696g = 3.5f;
        aVar4.f9697h = 5.0f;
    }

    @Override // n2.x0, n2.b1, n2.p1
    public r0 y() {
        w0 w0Var = (w0) super.y();
        w0Var.f9562d = new n1(128, 0);
        w0Var.f9561c = this;
        return w0Var;
    }
}
