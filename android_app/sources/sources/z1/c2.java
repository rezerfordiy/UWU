package z1;

import z1.d2;

/* JADX INFO: loaded from: classes.dex */
public class c2 {

    public static class a extends p0 implements d2.b, d2.a, b {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int[] f12954l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int[] f12955m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f12956n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f12957o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f12958p;

        /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(boolean r3, boolean r4, java.lang.String r5, int r6) {
            /*
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f12958p = r0
                z1.n0$d r1 = z1.n0.d.WIFI_CHANNEL
                java.lang.String r1 = r1.toString()
                r2.f13821e = r1
                r2.f13819c = r3
                r2.f13818b = r4
                r2.f12956n = r6
                r2.f12957o = r6
                r3 = 13
                int[] r4 = new int[r3]
                r4 = {x006c: FILL_ARRAY_DATA , data: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13} // fill-array
                z1.n0$g r6 = z1.n0.g.WIFI_MODUAL_3200
                java.lang.String r6 = r6.toString()
                boolean r6 = r5.equals(r6)
                if (r6 == 0) goto L2a
                goto L55
            L2a:
                z1.n0$g r6 = z1.n0.g.WIFI_MODUAL_BM23
                java.lang.String r6 = r6.toString()
                boolean r6 = r5.equals(r6)
                if (r6 == 0) goto L3e
                r5 = 8
                int[] r5 = new int[r5]
                r5 = {x008a: FILL_ARRAY_DATA , data: [40, 44, 48, 149, 153, 157, 161, 165} // fill-array
                goto L56
            L3e:
                z1.n0$g r6 = z1.n0.g.WIFI_MODUAL_3235
                java.lang.String r6 = r6.toString()
                boolean r5 = r5.equals(r6)
                if (r5 == 0) goto L55
                r5 = 9
                int[] r5 = new int[r5]
                r5 = {x009e: FILL_ARRAY_DATA , data: [36, 40, 44, 48, 149, 153, 157, 161, 165} // fill-array
                r6 = 1
                r2.f12958p = r6
                goto L56
            L55:
                r5 = 0
            L56:
                if (r5 == 0) goto L5b
                int r6 = r5.length
                int r6 = r6 + r3
                goto L5c
            L5b:
                r6 = r3
            L5c:
                int[] r6 = new int[r6]
                java.lang.System.arraycopy(r4, r0, r6, r0, r3)
                if (r5 == 0) goto L67
                int r4 = r5.length
                java.lang.System.arraycopy(r5, r0, r6, r3, r4)
            L67:
                r2.f12954l = r6
                r2.f12955m = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.c2.a.<init>(boolean, boolean, java.lang.String, int):void");
        }

        @Override // z1.c2.b
        public void D0(int i4) {
            if (!this.f13818b || this.f12957o == i4) {
                return;
            }
            this.f12957o = i4;
            q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.d2.a
        public int F0() {
            return this.f12956n;
        }

        @Override // z1.d2.b
        public int M2() {
            return this.f12957o;
        }

        @Override // z1.c2.b
        public int V1() {
            return this.f12957o;
        }

        public boolean d3() {
            return this.f12958p;
        }

        public b e3() {
            return null;
        }

        @Override // z1.d2.b
        public int[] i0() {
            return this.f12954l;
        }

        @Override // z1.d2.b
        public int[] p1() {
            return this.f12955m;
        }

        @Override // z1.d2.b
        public int[] s0() {
            int[] iArr = this.f12955m;
            if (iArr == null) {
                return this.f12954l;
            }
            int[] iArr2 = this.f12954l;
            int[] iArr3 = new int[iArr2.length + iArr.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            int[] iArr4 = this.f12955m;
            System.arraycopy(iArr4, 0, iArr3, this.f12954l.length, iArr4.length);
            return iArr3;
        }

        @Override // z1.d2.a
        public void x2(int i4) {
            q qVar;
            if (this.f13819c) {
                this.f12956n = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }
    }

    public interface b {
        void D0(int i4);

        int V1();
    }
}
