package m2;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Date;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class w extends d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f8906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8907h;

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f8908b = 100;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<b> f8909a = new ArrayList<>();

        public Bitmap a() {
            int[] iArr = new int[51200];
            int size = this.f8909a.size() < 100 ? 100 - this.f8909a.size() : 0;
            for (int i4 = size; i4 < 100; i4++) {
                byte[] bArrB = this.f8909a.get(i4 - size).b();
                for (int i5 = 0; i5 < 512; i5++) {
                    int i6 = bArrB[i5] & 255;
                    iArr[(i5 * 100) + i4] = i6 | (i6 << 16) | (i6 << 8) | z1.f12256t;
                }
            }
            return Bitmap.createBitmap(iArr, 100, 512, Bitmap.Config.ARGB_8888);
        }

        public void b(b bVar) {
            this.f8909a.add(bVar);
            if (this.f8909a.size() > 100) {
                this.f8909a.remove(0);
            }
        }

        public ArrayList<b> c() {
            return this.f8909a;
        }

        public Date d(int i4) {
            int size = (100 - this.f8909a.size()) + 1;
            if (i4 < size) {
                return null;
            }
            return this.f8909a.get(i4 - size).a();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Date f8910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f8912c;

        public b(byte[] bArr, int i4, Date date) {
            this.f8910a = date;
            this.f8911b = i4;
            this.f8912c = bArr;
        }

        public Date a() {
            return this.f8910a;
        }

        public byte[] b() {
            return this.f8912c;
        }

        public int c() {
            return this.f8911b;
        }
    }

    public static w a(d0 d0Var, int i4) {
        if (d0Var == null || ((u) d0Var.f8789f.get("b_data")) == null) {
            return null;
        }
        w wVar = new w();
        wVar.f8788e = d0Var.f8788e;
        wVar.f8784a = d0Var.f8784a;
        wVar.f8785b = d0Var.f8785b;
        wVar.f8786c = d0Var.f8786c;
        wVar.f8787d = d0Var.f8787d;
        wVar.f8789f = d0Var.f8789f;
        wVar.f8907h = i4;
        v vVarB = v.b();
        vVarB.a(d0Var, i4);
        wVar.f8906g = vVarB.d();
        return wVar;
    }
}
