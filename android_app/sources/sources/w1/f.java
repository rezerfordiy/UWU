package w1;

import android.os.AsyncTask;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.Type;
import n2.b0;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f12532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RenderScript f12533b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0 f12534c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Allocation f12539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Allocation f12540i;

    public class b extends AsyncTask<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f12543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f12544d;

        public b() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Integer... numArr) {
            try {
                Type typeCreateXY = Type.createXY(f.this.f12533b, Element.U8(f.this.f12533b), this.f12542b, this.f12541a);
                f fVar = f.this;
                fVar.f12539h = Allocation.createTyped(fVar.f12533b, typeCreateXY);
                f fVar2 = f.this;
                fVar2.f12540i = Allocation.createTyped(fVar2.f12533b, typeCreateXY);
                f.this.f12539h.copy2DRangeFrom(0, 0, this.f12542b, this.f12541a, this.f12543c);
                f.this.f12534c.W(f.this.f12535d);
                f.this.f12534c.V(f.this.f12536e - 1);
                f.this.f12534c.U(f.this.f12539h, f.this.f12540i);
                f.this.f12540i.copy2DRangeTo(0, 0, this.f12542b, this.f12541a, this.f12544d);
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        }

        public byte[] b() {
            return this.f12544d;
        }

        public void c(byte[] bArr, int i4, int i5) {
            this.f12543c = bArr;
            this.f12541a = i4;
            this.f12542b = i5;
            byte[] bArr2 = new byte[i4 * i5];
            this.f12544d = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, i4 * i5);
        }
    }

    public byte[] a(byte[] bArr, int i4, int i5, int i6, int i7) {
        if (bArr.length != i4 * i5) {
            return bArr;
        }
        this.f12535d = i6;
        this.f12536e = i7;
        this.f12537f = i4;
        this.f12538g = i5;
        b bVar = new b();
        bVar.c(bArr, this.f12537f, this.f12538g);
        try {
            bVar.execute(0);
            bVar.get();
        } catch (Exception unused) {
        }
        return bVar.b();
    }

    public final void j() {
        if (this.f12534c == null) {
            this.f12534c = new b0(this.f12533b);
        }
    }

    public void k(RenderScript renderScript) {
        this.f12533b = renderScript;
        j();
    }
}
