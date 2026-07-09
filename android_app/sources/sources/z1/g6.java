package z1;

import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class g6 implements m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f13263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f13264b;

    @Override // z1.m7
    public byte[] a() {
        return this.f13264b;
    }

    @Override // z1.m7
    public byte[] b() {
        return this.f13263a;
    }

    @Override // z1.m7
    public void c(byte[] bArr) {
        this.f13263a = d(bArr);
        this.f13264b = e(bArr);
    }

    public byte[] d(byte[] bArr) {
        boolean z3;
        if (bArr == null) {
            return null;
        }
        Log.e("TTTT", "parseAudio: " + bArr.length);
        byte[] bArr2 = new byte[4096];
        System.arraycopy(bArr, 0, bArr2, 0, 4096);
        byte[] bArr3 = new byte[4096];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = 8;
            if (i4 >= 8) {
                int i7 = i5 * 512;
                byte[] bArr4 = new byte[i7];
                System.arraycopy(bArr3, 0, bArr4, 0, i7);
                Log.e("TTTT", "parseAudio: " + i7);
                return bArr4;
            }
            while (true) {
                if (i6 >= 24) {
                    z3 = true;
                    break;
                }
                if (bArr2[(i4 * 512) + i6] != -1) {
                    z3 = false;
                    break;
                }
                i6++;
            }
            if (!z3) {
                System.arraycopy(bArr2, i4 * 512, bArr3, i5 * 512, 512);
                i5++;
            }
            i4++;
        }
    }

    public byte[] e(byte[] bArr) {
        boolean z3;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length - 4096;
        byte[] bArr2 = new byte[length];
        ArrayList arrayList = new ArrayList();
        System.arraycopy(bArr, 4096, bArr2, 0, length);
        int i4 = length / 512;
        boolean z4 = false;
        for (int i5 = 0; i5 < i4 * 4; i5++) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (i6 >= 128) {
                    z3 = true;
                    break;
                }
                if (bArr2[(i5 * 128) + i6] == -1 && (i7 = i7 + 1) >= 120) {
                    z3 = false;
                    break;
                }
                i6++;
            }
            if (z3) {
                byte[] bArr3 = new byte[128];
                int i8 = i5 * 128;
                System.arraycopy(bArr2, i8, bArr3, 0, 128);
                arrayList.add(bArr3);
                if (!z4) {
                    for (int i9 = 0; i9 < 4; i9++) {
                        byte[] bArr4 = new byte[128];
                        System.arraycopy(bArr2, i8, bArr4, 0, 128);
                        arrayList.add(bArr4);
                    }
                    z4 = true;
                }
            }
        }
        byte[] bArr5 = new byte[arrayList.size() * 128];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            System.arraycopy((byte[]) arrayList.get(i10), 0, bArr5, i10 * 128, 128);
        }
        return bArr5;
    }
}
