package n2;

import n2.p1;
import n2.x0;

/* JADX INFO: loaded from: classes.dex */
public class m4 extends x0 {
    public m4() {
    }

    @Override // n2.p1
    public byte[] C(byte[] bArr) {
        int length = bArr.length / 512;
        int length2 = bArr.length;
        byte[] bArr2 = new byte[length2];
        System.arraycopy(bArr, 0, bArr2, 0, length2);
        int length3 = bArr.length;
        byte[] bArr3 = new byte[length3];
        System.arraycopy(bArr, 0, bArr3, 0, length3);
        for (int i4 = 0; i4 < 512; i4++) {
            int i5 = i4 + 1024;
            bArr2[i4 + 0] = bArr3[i5];
            bArr2[i4 + 512] = bArr3[i5];
            int i6 = ((length - 3) * 512) + i4;
            bArr2[((length - 1) * 512) + i4] = bArr3[i6];
            bArr2[((length - 2) * 512) + i4] = bArr3[i6];
        }
        return bArr2;
    }

    public m4(String str) {
        super(str);
        A("WHP");
        p1.a aVar = this.f9527g;
        aVar.f9531b = 100000.0f;
        aVar.f9532c = p1.a(25.6f);
        p1.a aVar2 = this.f9527g;
        aVar2.f9533d = true;
        aVar2.f9534e = 25.6f;
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
        fArr2[0] = 6.0f;
        fArr2[1] = 12.0f;
        float[] fArr3 = fArr[1];
        fArr3[0] = 9.0f;
        fArr3[1] = 15.0f;
        float[] fArr4 = fArr[2];
        fArr4[0] = 9.0f;
        fArr4[1] = 20.0f;
        float[] fArr5 = fArr[3];
        fArr5[0] = 9.0f;
        fArr5[1] = 25.0f;
        aVar4.f9694e = 1;
        float[][] fArr6 = aVar4.f9695f;
        fArr6[0][0] = 6.0f;
        fArr6[1][0] = 9.0f;
        fArr6[2][0] = 12.0f;
        fArr6[3][0] = 15.0f;
        aVar4.f9696g = 10.0f;
        aVar4.f9697h = 14.0f;
        z("{'thyroid':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'smallParts':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'pediatrics':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'vascular':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'carotid':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':3},'breast':{'gain':80,'harmonic':1,'dr':70,'enhLevel':2,'focuspos':2},'msk':{'gain':80,'harmonic':0,'dr':80,'enhLevel':2,'focuspos':2}}");
    }
}
