package m2;

import java.util.ArrayList;
import m2.w;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static v f8904b = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<w.b> f8905a = new ArrayList<>();

    public static v b() {
        return f8904b;
    }

    public void a(d0 d0Var, int i4) {
        u uVar = (u) d0Var.f8789f.get("b_data");
        if (i4 < 0) {
            i4 = 0;
        } else {
            int i5 = uVar.f8885c;
            if (i4 >= i5 - 1) {
                i4 = i5 - 1;
            }
        }
        int i6 = uVar.f8886d;
        byte[] bArr = new byte[i6];
        int i7 = i4 * i6;
        byte[] bArr2 = uVar.f8883a;
        if (i7 >= bArr2.length) {
            return;
        }
        byte[] bArr3 = uVar.f8884b;
        if (bArr3 != null) {
            System.arraycopy(bArr3, i7, bArr, 0, i6);
        } else {
            System.arraycopy(bArr2, i7, bArr, 0, i6);
        }
        this.f8905a.add(new w.b(bArr, i4, d0Var.f8788e));
        if (this.f8905a.size() > 100) {
            this.f8905a.remove(0);
        }
    }

    public void c() {
        this.f8905a.clear();
    }

    public w.a d() {
        w.a aVar = new w.a();
        for (int i4 = 0; i4 < this.f8905a.size(); i4++) {
            aVar.b(this.f8905a.get(i4));
        }
        return aVar;
    }
}
