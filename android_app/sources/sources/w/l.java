package w;

import v.e;
import w.f;
import w.p;

/* JADX INFO: loaded from: classes.dex */
public class l extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int[] f12347k = new int[2];

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12348a;

        static {
            int[] iArr = new int[p.b.values().length];
            f12348a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12348a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12348a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(v.e eVar) {
        super(eVar);
        this.f12386h.f12324e = f.a.LEFT;
        this.f12387i.f12324e = f.a.RIGHT;
        this.f12384f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0292, code lost:
    
        if (r14 != 1) goto L134;
     */
    @Override // w.p, w.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(w.d r17) {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.l.a(w.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01ba  */
    @Override // w.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.l.d():void");
    }

    @Override // w.p
    public void e() {
        f fVar = this.f12386h;
        if (fVar.f12329j) {
            this.f12380b.J1(fVar.f12326g);
        }
    }

    @Override // w.p
    public void f() {
        this.f12381c = null;
        this.f12386h.c();
        this.f12387i.c();
        this.f12383e.c();
        this.f12385g = false;
    }

    @Override // w.p
    public void n() {
        this.f12385g = false;
        this.f12386h.c();
        this.f12386h.f12329j = false;
        this.f12387i.c();
        this.f12387i.f12329j = false;
        this.f12383e.f12329j = false;
    }

    @Override // w.p
    public boolean p() {
        return this.f12382d != e.b.MATCH_CONSTRAINT || this.f12380b.f11826p == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f12380b.y();
    }

    public final void u(int[] iArr, int i4, int i5, int i6, int i7, float f4, int i8) {
        int i9 = i5 - i4;
        int i10 = i7 - i6;
        if (i8 != -1) {
            if (i8 == 0) {
                iArr[0] = (int) ((i10 * f4) + 0.5f);
                iArr[1] = i10;
                return;
            } else {
                if (i8 != 1) {
                    return;
                }
                iArr[0] = i9;
                iArr[1] = (int) ((i9 * f4) + 0.5f);
                return;
            }
        }
        int i11 = (int) ((i10 * f4) + 0.5f);
        int i12 = (int) ((i9 / f4) + 0.5f);
        if (i11 <= i9) {
            iArr[0] = i11;
            iArr[1] = i10;
        } else if (i12 <= i10) {
            iArr[0] = i9;
            iArr[1] = i12;
        }
    }
}
