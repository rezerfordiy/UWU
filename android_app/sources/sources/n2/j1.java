package n2;

/* JADX INFO: loaded from: classes.dex */
public class j1 extends s0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f9403o = 5001;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f9404m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9405n;

    public j1(r0 r0Var) {
        super(r0Var);
        this.f9405n = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // n2.s0, n2.u0, n2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(n2.d r3) {
        /*
            r2 = this;
            boolean r0 = r2.f9579g
            n2.a r1 = r2.f9404m
            if (r1 == 0) goto L28
            int r3 = r3.f9160a
            int r1 = r1.f9160a
            if (r3 != r1) goto Ld
            goto L28
        Ld:
            n2.a r1 = r2.f9573a
            if (r1 == 0) goto L23
            int r1 = r1.f9160a
            if (r3 != r1) goto L16
            goto L23
        L16:
            n2.a r1 = r2.f9574b
            if (r1 == 0) goto L1e
            int r1 = r1.f9160a
            if (r3 != r1) goto L2e
        L1e:
            int r3 = r2.f9405n
            r3 = r3 & 251(0xfb, float:3.52E-43)
            goto L2c
        L23:
            int r3 = r2.f9405n
            r3 = r3 & 253(0xfd, float:3.55E-43)
            goto L2c
        L28:
            int r3 = r2.f9405n
            r3 = r3 & 254(0xfe, float:3.56E-43)
        L2c:
            r2.f9405n = r3
        L2e:
            int r3 = r2.f9405n
            r1 = 7
            if (r3 >= r1) goto L36
            r3 = 0
            r2.f9579g = r3
        L36:
            boolean r3 = r2.f9579g
            if (r0 == r3) goto L3f
            n2.r0 r0 = r2.f9575c
            r0.u(r3)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.j1.a(n2.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // n2.s0, n2.u0, n2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(n2.d r4) {
        /*
            r3 = this;
            int r4 = r4.f9160a
            n2.a r0 = r3.f9404m
            int r0 = r0.f9160a
            r1 = 1
            if (r4 != r0) goto Lf
            int r4 = r3.f9405n
            int r4 = r4 + r1
        Lc:
            r3.f9405n = r4
            goto L25
        Lf:
            n2.a r0 = r3.f9573a
            int r0 = r0.f9160a
            if (r4 != r0) goto L1a
            int r4 = r3.f9405n
            int r4 = r4 + 2
            goto Lc
        L1a:
            n2.a r0 = r3.f9574b
            int r0 = r0.f9160a
            if (r4 != r0) goto L25
            int r4 = r3.f9405n
            int r4 = r4 + 4
            goto Lc
        L25:
            boolean r4 = r3.f9579g
            int r0 = r3.f9405n
            r2 = 7
            if (r0 != r2) goto L39
            r3.f9579g = r1
            n2.a r0 = r3.f9573a
            r1 = 0
            r0.d(r1)
            n2.a r0 = r3.f9574b
            r0.d(r1)
        L39:
            boolean r0 = r3.f9579g
            if (r4 == r0) goto L42
            n2.r0 r4 = r3.f9575c
            r4.u(r0)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.j1.b(n2.d):void");
    }

    @Override // n2.s0, n2.u0, n2.c
    public void d(d dVar, byte[] bArr, int i4) {
        r0 r0Var;
        r0 r0Var2;
        if (i4 <= 0) {
            bArr = null;
        } else if (bArr.length > i4) {
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, 0, bArr2, 0, i4);
            bArr = bArr2;
        }
        if (dVar.f9160a == this.f9573a.f9160a) {
            if (bArr != null && (r0Var2 = this.f9575c) != null) {
                r0Var2.w(bArr);
            }
        } else if (bArr != null && (r0Var = this.f9575c) != null) {
            r0Var.x(bArr);
        }
        dVar.d(0);
    }

    @Override // n2.s0, n2.u0
    public void f() {
        super.f();
        if (this.f9404m == null) {
            a aVar = new a(this);
            this.f9404m = aVar;
            aVar.f9160a = 1;
        }
        if (this.f9404m.c()) {
            return;
        }
        this.f9404m.a("192.168.1.1", f9403o, 990);
    }

    @Override // n2.s0, n2.u0
    public void h() {
        super.h();
        a aVar = this.f9404m;
        if (aVar != null) {
            aVar.b();
            this.f9404m = null;
        }
    }

    @Override // n2.s0
    public void l() {
        this.f9576d++;
        if (i() || this.f9576d % 10 != 0) {
            return;
        }
        f();
    }

    public void m(byte[] bArr) {
        a aVar = this.f9404m;
        if (aVar != null) {
            aVar.e(bArr, 0);
        }
    }
}
