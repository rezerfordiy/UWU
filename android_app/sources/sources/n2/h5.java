package n2;

import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class h5 extends x0 {
    public h5() {
    }

    @Override // n2.x0, n2.b1, n2.p1
    public r0 y() {
        r0 r0VarY = super.y();
        r0VarY.f9562d.e(true);
        return r0VarY;
    }

    public h5(String str) {
        super(str);
        A("WAP");
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
        iArr2[3] = 280;
        aVar.f9539j = l.a().c(5);
        p1.a aVar2 = this.f9527g;
        aVar2.f9540k = 5.0E7f;
        int[] iArr3 = aVar2.f9541l;
        iArr3[0] = 11;
        iArr3[1] = 20;
        iArr3[2] = 25;
        iArr3[3] = 36;
        x0.a aVar3 = this.f9683s;
        aVar3.f9692c = 2;
        float[][] fArr = aVar3.f9693d;
        float[] fArr2 = fArr[0];
        fArr2[0] = 20.0f;
        fArr2[1] = 60.0f;
        float[] fArr3 = fArr[1];
        fArr3[0] = 30.0f;
        fArr3[1] = 70.0f;
        float[] fArr4 = fArr[2];
        fArr4[0] = 40.0f;
        fArr4[1] = 80.0f;
        float[] fArr5 = fArr[3];
        fArr5[0] = 50.0f;
        fArr5[1] = 100.0f;
        aVar3.f9694e = 2;
        float[][] fArr6 = aVar3.f9695f;
        float[] fArr7 = fArr6[0];
        fArr7[0] = 20.0f;
        fArr7[1] = 60.0f;
        float[] fArr8 = fArr6[1];
        fArr8[0] = 30.0f;
        fArr8[1] = 70.0f;
        float[] fArr9 = fArr6[2];
        fArr9[0] = 40.0f;
        fArr9[1] = 80.0f;
        float[] fArr10 = fArr6[3];
        fArr10[0] = 50.0f;
        fArr10[1] = 100.0f;
        aVar3.f9696g = 3.5f;
        aVar3.f9697h = 5.0f;
        z("{'abdomen':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':3},'gynecology':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2},'obstetric':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2},'cardiac':{'gain':80,'harmonic':1,'dr':80,'enhLevel':2,'focuspos':2},'urology':{'gain':80,'harmonic':1,'dr':80,'enhLevel':2,'focuspos':2},'kidney':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2}}");
    }
}
