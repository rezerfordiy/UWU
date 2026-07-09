package z1;

import java.util.List;
import z1.b0;
import z1.c0;
import z1.g0;

/* JADX INFO: loaded from: classes.dex */
public class q7 {

    public static class a extends b0.k {
        public a(boolean z3, boolean z4, boolean z5) {
            super(z3, z4, z5);
        }

        @Override // z1.b0.k, z1.c0.g
        public void p(boolean z3) {
            q qVar;
            if (this.f13819c) {
                this.f12917l = z3;
                this.f12918m = z3;
                H0();
            }
            if (this.f13819c && this.f13818b && (qVar = this.f13822f) != null) {
                qVar.d(this);
            }
        }
    }

    public static class b extends g0.t {
        public b(int[] iArr, float[] fArr, int i4, int i5, int i6, int i7, int i8, int i9, boolean z3, boolean z4, float f4, int i10, int i11, int i12) {
            super(iArr, fArr, i4, i5, i6, i7, i8, i9, z3, z4, f4, i10, i11, i12);
        }

        @Override // z1.g0.t, z1.h0.w
        public void M1(int i4) {
            if (this.f13819c) {
                this.f13257u = i4;
                this.f13258v = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b) {
                return;
            }
            X2();
            q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }

        @Override // z1.g0.t, z1.h0.w
        public void t2(int i4) {
            q qVar;
            if (this.f13819c) {
                this.f13259w = i4;
                this.f13260x = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b || (qVar = this.f13822f) == null) {
                return;
            }
            qVar.d(this);
        }

        @Override // z1.g0.t, z1.h0.w
        public void y1(int i4) {
            if (this.f13819c) {
                this.f13255s = i4;
                this.f13256t = i4;
                H0();
            }
            if (!this.f13819c || this.f13818b) {
                return;
            }
            X2();
            q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }
    }

    public static class c extends b0.o implements c0.l, b0.q {
        public c(boolean z3, boolean z4, List<g7> list, int i4) {
            super(z3, z4, list, i4);
        }

        @Override // z1.b0.o, z1.c0.k
        public int B0() {
            return super.B0();
        }

        @Override // z1.b0.o, z1.c0.l
        public boolean Q(int i4) {
            return super.Q(i4);
        }

        @Override // z1.b0.o, z1.b0.q
        public int c1() {
            return super.c1();
        }

        @Override // z1.b0.o
        public b0.q d3() {
            return super.d3();
        }

        @Override // z1.b0.o, z1.c0.k
        public void e0(int i4) {
            q qVar;
            if (this.f13819c) {
                this.f12929m = i4;
                this.f12930n = i4;
                H0();
            }
            if (this.f13819c && this.f13818b && (qVar = this.f13822f) != null) {
                qVar.d(this);
            }
        }

        public void e3(int i4) {
            this.f12929m = i4;
            this.f12930n = i4;
        }

        @Override // z1.b0.o, z1.c0.l
        public int l2() {
            return super.l2();
        }

        @Override // z1.b0.o, z1.c0.l
        public String n0(int i4) {
            return super.n0(i4);
        }

        @Override // z1.b0.o, z1.c0.l
        public int o1() {
            return super.o1();
        }

        @Override // z1.b0.o, z1.c0.l
        public int q2() {
            return super.q2();
        }

        @Override // z1.b0.o, z1.b0.q
        public void s1(int i4) {
            super.s1(i4);
        }
    }

    public static class d extends b0.p {
        public d(int i4, float[] fArr, int[] iArr, float[] fArr2, boolean z3, boolean z4, int i5) {
            super(i4, fArr, iArr, fArr2, z3, z4, i5);
        }

        @Override // z1.b0.p, z1.c0.m
        public void o2(int i4) {
            if (this.f13819c) {
                this.f12936p = i4;
                this.f12937q = i4;
                H0();
            }
            X2();
            q qVar = this.f13822f;
            if (qVar != null) {
                qVar.d(this);
            }
        }
    }
}
