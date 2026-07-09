package n2;

import n2.j0;
import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class c5 extends j0 {
    public c5() {
    }

    @Override // n2.j0, n2.x0, n2.b1, n2.p1
    public r0 y() {
        l0 l0Var = new l0();
        n1 n1Var = new n1(this.f9527g.f9535f, 32);
        n1Var.e(true);
        l0Var.f9562d = n1Var;
        l0Var.f9561c = this;
        l0Var.y(this.f9527g.f9535f / 2);
        return l0Var;
    }

    public c5(String str) {
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
        iArr2[2] = 220;
        iArr2[3] = 305;
        aVar.f9539j = l.a().c(5);
        p1.a aVar2 = this.f9527g;
        aVar2.f9540k = 4.0E7f;
        int[] iArr3 = aVar2.f9541l;
        iArr3[0] = 9;
        iArr3[1] = 16;
        iArr3[2] = 22;
        iArr3[3] = 31;
        x0.a aVar3 = this.f9683s;
        aVar3.f9692c = 2;
        float[][] fArr = aVar3.f9693d;
        float[] fArr2 = fArr[0];
        fArr2[0] = 30.0f;
        fArr2[1] = 60.0f;
        float[] fArr3 = fArr[1];
        fArr3[0] = 40.0f;
        fArr3[1] = 80.0f;
        float[] fArr4 = fArr[2];
        fArr4[0] = 40.0f;
        fArr4[1] = 100.0f;
        float[] fArr5 = fArr[3];
        fArr5[0] = 40.0f;
        fArr5[1] = 120.0f;
        aVar3.f9694e = 1;
        float[][] fArr6 = aVar3.f9695f;
        fArr6[0][0] = 40.0f;
        fArr6[1][0] = 60.0f;
        fArr6[2][0] = 80.0f;
        fArr6[3][0] = 120.0f;
        aVar3.f9696g = 3.2f;
        aVar3.f9697h = 5.0f;
        j0.a aVar4 = this.A;
        aVar4.f9393b = 4;
        float[] fArr7 = aVar4.f9394c;
        fArr7[0] = 40.0f;
        fArr7[1] = 60.0f;
        fArr7[2] = 80.0f;
        fArr7[3] = 120.0f;
        aVar4.f9395d = com.sonoptek.pvus_android.loop_view.a.f6120c;
        int[] iArr4 = aVar4.f9398g;
        iArr4[0] = 2000;
        iArr4[1] = 2000;
        iArr4[2] = 1600;
        iArr4[3] = 1600;
        aVar4.f9399h = 2.5f;
        aVar4.f9400i = false;
        aVar4.f9401j = false;
        o1 o1VarD = o1.d(null);
        this.D = o1VarD.e(J0(), (this.f9527g.f9535f / 2) - 16);
        this.E = o1VarD.e(I0(), (this.f9527g.f9535f / 2) + 16);
        this.K = o1VarD.e(R0(), this.f9527g.f9535f / 2);
        d1(60);
        z("{'abdomen':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':3},'gynecology':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2},'obstetric':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2},'cardiac':{'gain':80,'harmonic':1,'dr':80,'enhLevel':2,'focuspos':2},'urology':{'gain':80,'harmonic':1,'dr':80,'enhLevel':2,'focuspos':2},'kidney':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2}}");
    }
}
