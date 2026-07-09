package n2;

import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.Script;
import android.renderscript.ScriptC;
import android.renderscript.Type;

/* JADX INFO: loaded from: classes.dex */
public class z extends ScriptC {
    public static final int A0 = 0;
    public static final int A1 = 52;
    public static final int A2 = 8;
    public static final int B0 = 1;
    public static final int B1 = 53;
    public static final int B2 = 9;
    public static final int C0 = 2;
    public static final int C1 = 54;
    public static final int C2 = 10;
    public static final int D0 = 3;
    public static final int D1 = 55;
    public static final int D2 = 11;
    public static final int E0 = 4;
    public static final int E1 = 56;
    public static final int E2 = 12;
    public static final int F0 = 5;
    public static final int F1 = 57;
    public static final int F2 = 13;
    public static final int G0 = 6;
    public static final int G1 = 58;
    public static final int G2 = 14;
    public static final int H0 = 7;
    public static final int H1 = 59;
    public static final int H2 = 15;
    public static final int I0 = 8;
    public static final int I1 = 60;
    public static final int I2 = 16;
    public static final int J0 = 9;
    public static final int J1 = 61;
    public static final int J2 = 17;
    public static final int K0 = 10;
    public static final int K1 = 62;
    public static final int K2 = 18;
    public static final int L0 = 11;
    public static final int L1 = 63;
    public static final int L2 = 19;
    public static final int M0 = 12;
    public static final int M1 = 64;
    public static final int M2 = 20;
    public static final int N0 = 13;
    public static final int N1 = 65;
    public static final int N2 = 21;
    public static final int O0 = 14;
    public static final int O1 = 66;
    public static final int O2 = 22;
    public static final int P0 = 15;
    public static final int P1 = 1;
    public static final int P2 = 23;
    public static final int Q0 = 16;
    public static final int Q1 = 2;
    public static final int Q2 = 24;
    public static final int R0 = 17;
    public static final int R1 = 3;
    public static final int S0 = 18;
    public static final int S1 = 4;
    public static final int T0 = 19;
    public static final int T1 = 5;
    public static final int U0 = 20;
    public static final int U1 = 6;
    public static final int V0 = 21;
    public static final int V1 = 7;
    public static final int W0 = 22;
    public static final int W1 = 8;
    public static final int X0 = 23;
    public static final int X1 = 9;
    public static final int Y0 = 24;
    public static final int Y1 = 10;
    public static final int Z0 = 25;
    public static final int Z1 = 11;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int f9747a1 = 26;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final int f9748a2 = 12;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final int f9749b1 = 27;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final int f9750b2 = 13;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int f9751c1 = 28;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final int f9752c2 = 14;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final int f9753d1 = 29;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final int f9754d2 = 15;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final int f9755e1 = 30;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final int f9756e2 = 16;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final int f9757f1 = 31;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final int f9758f2 = 17;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final int f9759g1 = 32;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public static final int f9760g2 = 18;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final int f9761h1 = 33;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final int f9762h2 = 19;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f9763i1 = 34;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final int f9764i2 = 20;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final int f9765j1 = 35;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final int f9766j2 = 21;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final int f9767k1 = 36;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final int f9768k2 = 22;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final int f9769l1 = 37;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final int f9770l2 = 23;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final int f9771m1 = 38;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public static final int f9772m2 = 24;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final int f9773n1 = 39;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final int f9774n2 = 25;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final int f9775o1 = 40;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public static final int f9776o2 = 26;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f9777p1 = 41;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f9778p2 = 27;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final int f9779q1 = 42;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public static final int f9780q2 = 28;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final int f9781r1 = 43;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public static final int f9782r2 = 29;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final int f9783s1 = 44;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public static final int f9784s2 = 0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final int f9785t1 = 45;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public static final int f9786t2 = 1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final int f9787u1 = 46;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public static final int f9788u2 = 2;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final int f9789v1 = 47;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public static final int f9790v2 = 3;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final int f9791w1 = 48;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public static final int f9792w2 = 4;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f9793x1 = 49;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f9794x2 = 5;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f9795y1 = 50;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final int f9796y2 = 6;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f9797z0 = "imageenhance";

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final int f9798z1 = 51;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public static final int f9799z2 = 7;
    public int A;
    public int B;
    public int C;
    public Allocation D;
    public Allocation E;
    public Allocation F;
    public Allocation G;
    public Allocation H;
    public f0 I;
    public Allocation J;
    public Allocation K;
    public Allocation L;
    public int M;
    public int N;
    public float O;
    public Allocation P;
    public Allocation Q;
    public Allocation R;
    public boolean S;
    public Allocation T;
    public Allocation U;
    public Allocation V;
    public Allocation W;
    public Allocation X;
    public Allocation Y;
    public Allocation Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Element f9800a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Allocation f9801a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Element f9802b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Allocation f9803b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Element f9804c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Allocation f9805c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Element f9806d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Allocation f9807d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Element f9808e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f9809e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Element f9810f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Allocation f9811f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FieldPacker f9812g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Allocation f9813g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FieldPacker f9814h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Allocation f9815h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FieldPacker f9816i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Allocation f9817i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public FieldPacker f9818j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Allocation f9819j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9820k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Allocation f9821k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9822l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Allocation f9823l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9824m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public Allocation f9825m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9826n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f9827n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f9828o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Allocation f9829o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9830p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Allocation f9831p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9832q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Allocation f9833q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9834r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Allocation f9835r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9836s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Allocation f9837s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9838t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Allocation f9839t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9840u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Allocation f9841u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9842v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Allocation f9843v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9844w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Allocation f9845w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9846x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Allocation f9847x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9848y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Allocation f9849y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Allocation f9850z;

    public z(RenderScript renderScript) {
        super(renderScript, f9797z0, m.a(), m.c());
        this.f9806d = Element.I32(renderScript);
        this.f9808e = Element.U16(renderScript);
        this.f9802b = Element.F32(renderScript);
        this.f9800a = Element.BOOLEAN(renderScript);
        this.f9810f = Element.U8(renderScript);
        this.f9804c = Element.I16(renderScript);
    }

    public void A(Allocation allocation) {
        this.f9841u0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 62);
    }

    public void A0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(29, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.InvokeID A1() {
        return createInvokeID(12);
    }

    public float A2() {
        return this.O;
    }

    public Allocation A3() {
        return this.f9811f0;
    }

    public synchronized void A4(int i4) {
        setVar(28, i4);
        this.M = i4;
    }

    public void B(Allocation allocation) {
        this.f9813g0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 48);
    }

    public void B0(Allocation allocation, Allocation allocation2) {
        C0(allocation, allocation2, null);
    }

    public Script.InvokeID B1() {
        return createInvokeID(22);
    }

    public int B2() {
        return this.f9834r;
    }

    public Allocation B3() {
        return this.f9829o0;
    }

    public synchronized void B4(int i4) {
        FieldPacker fieldPacker = this.f9818j;
        if (fieldPacker != null) {
            fieldPacker.reset();
        } else {
            this.f9818j = new FieldPacker(2);
        }
        this.f9818j.addU16(i4);
        setVar(1, this.f9818j);
        this.f9822l = i4;
    }

    public void C(Allocation allocation) {
        this.f9833q0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 58);
    }

    public void C0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(4, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.InvokeID C1() {
        return createInvokeID(23);
    }

    public int C2() {
        return this.f9826n;
    }

    public Allocation C3() {
        return this.f9831p0;
    }

    public synchronized void C4(int i4) {
        setVar(0, i4);
        this.f9820k = i4;
    }

    public void D(Allocation allocation) {
        this.f9815h0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 49);
    }

    public void D0(Allocation allocation, Allocation allocation2) {
        E0(allocation, allocation2, null);
    }

    public Script.InvokeID D1() {
        return createInvokeID(19);
    }

    public int D2() {
        return this.f9809e0;
    }

    public Allocation D3() {
        return this.f9819j0;
    }

    public synchronized void D4(int i4) {
        setVar(5, i4);
        this.f9830p = i4;
    }

    public void E(Allocation allocation) {
        this.f9821k0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 52);
    }

    public void E0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(5, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.InvokeID E1() {
        return createInvokeID(20);
    }

    public int E2() {
        return this.f9827n0;
    }

    public Allocation E3() {
        return this.f9837s0;
    }

    public synchronized void E4(int i4) {
        setVar(6, i4);
        this.f9832q = i4;
    }

    public void F(Allocation allocation) {
        this.f9811f0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 47);
    }

    public void F0(Allocation allocation, Allocation allocation2) {
        G0(allocation, allocation2, null);
    }

    public Script.InvokeID F1() {
        return createInvokeID(21);
    }

    public int F2() {
        return this.N;
    }

    public Allocation F3() {
        return this.W;
    }

    public synchronized void F4(int i4) {
        setVar(14, i4);
        this.f9848y = i4;
    }

    public void G(Allocation allocation) {
        this.f9829o0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 56);
    }

    public void G0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(14, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.InvokeID G1() {
        return createInvokeID(4);
    }

    public int G2() {
        return this.f9824m;
    }

    public Allocation G3() {
        return this.f9817i0;
    }

    public synchronized void G4(int i4) {
        setVar(13, i4);
        this.f9846x = i4;
    }

    public void H(Allocation allocation) {
        this.f9831p0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 57);
    }

    public void H0(Allocation allocation, Allocation allocation2) {
        I0(allocation, allocation2, null);
    }

    public Script.InvokeID H1() {
        return createInvokeID(7);
    }

    public int H2() {
        return this.A;
    }

    public Allocation H3() {
        return this.f9835r0;
    }

    public synchronized void H4(int i4) {
        setVar(18, i4);
        this.C = i4;
    }

    public void I(Allocation allocation) {
        this.f9819j0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 51);
    }

    public void I0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(12, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.InvokeID I1() {
        return createInvokeID(0);
    }

    public int I2() {
        return this.f9836s;
    }

    public Allocation I3() {
        return this.f9839t0;
    }

    public synchronized void I4(int i4) {
        setVar(17, i4);
        this.B = i4;
    }

    public void J(Allocation allocation) {
        this.f9837s0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 60);
    }

    public void J0(Allocation allocation, Allocation allocation2) {
        K0(allocation, allocation2, null);
    }

    public Script.InvokeID J1() {
        return createInvokeID(18);
    }

    public int J2() {
        return this.f9838t;
    }

    public Allocation J3() {
        return this.X;
    }

    public void K(Allocation allocation) {
        this.W = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 38);
    }

    public void K0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(13, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.InvokeID K1() {
        return createInvokeID(10);
    }

    public int K2() {
        return this.f9840u;
    }

    public Allocation K3() {
        return this.V;
    }

    public void L(Allocation allocation) {
        this.f9817i0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 50);
    }

    public void L0(Allocation allocation, Allocation allocation2) {
        M0(allocation, allocation2, null);
    }

    public Script.InvokeID L1() {
        return createInvokeID(11);
    }

    public int L2() {
        return this.f9842v;
    }

    public f0 L3() {
        return this.I;
    }

    public void M(Allocation allocation) {
        this.f9835r0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 59);
    }

    public void M0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(9, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.InvokeID M1() {
        return createInvokeID(15);
    }

    public int M2() {
        return this.f9844w;
    }

    public void M3() {
        invoke(1);
    }

    public void N(Allocation allocation) {
        this.f9839t0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 61);
    }

    public void N0(Allocation allocation, Allocation allocation2) {
        O0(allocation, allocation2, null);
    }

    public Script.InvokeID N1() {
        return createInvokeID(13);
    }

    public int N2() {
        return this.M;
    }

    public void N3() {
        invoke(6);
    }

    public void O(Allocation allocation) {
        this.X = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 39);
    }

    public void O0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(11, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.InvokeID O1() {
        return createInvokeID(17);
    }

    public int O2() {
        return this.f9822l;
    }

    public void O3() {
        invoke(2);
    }

    public void P(Allocation allocation) {
        this.V = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 37);
    }

    public void P0(Allocation allocation, Allocation allocation2) {
        Q0(allocation, allocation2, null);
    }

    public Script.InvokeID P1() {
        return createInvokeID(9);
    }

    public int P2() {
        return this.f9820k;
    }

    public void P3() {
        invoke(5);
    }

    public void Q(f0 f0Var) {
        this.I = f0Var;
        bindAllocation(f0Var == null ? null : f0Var.getAllocation(), 24);
    }

    public void Q0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9808e)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(10, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.InvokeID Q1() {
        return createInvokeID(24);
    }

    public int Q2() {
        return this.f9830p;
    }

    public void Q3() {
        invoke(3);
    }

    public void R(Allocation allocation, Allocation allocation2) {
        S(allocation, allocation2, null);
    }

    public void R0(Allocation allocation, Allocation allocation2) {
        S0(allocation, allocation2, null);
    }

    public Script.InvokeID R1() {
        return createInvokeID(16);
    }

    public int R2() {
        return this.f9832q;
    }

    public void R3() {
        invoke(12);
    }

    public void S(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9808e)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(6, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void S0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(1, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.InvokeID S1() {
        return createInvokeID(14);
    }

    public int S2() {
        return this.f9848y;
    }

    public void S3() {
        invoke(22);
    }

    public void T(Allocation allocation, Allocation allocation2) {
        U(allocation, allocation2, null);
    }

    public void T0(Allocation allocation, Allocation allocation2) {
        U0(allocation, allocation2, null);
    }

    public Script.InvokeID T1() {
        return createInvokeID(8);
    }

    public int T2() {
        return this.f9846x;
    }

    public void T3() {
        invoke(23);
    }

    public void U(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9804c)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(20, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void U0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(2, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.KernelID U1() {
        return createKernelID(6, 59, null, null);
    }

    public int U2() {
        return this.C;
    }

    public void U3() {
        invoke(19);
    }

    public void V(Allocation allocation, Allocation allocation2) {
        W(allocation, allocation2, null);
    }

    public void V0(Allocation allocation, Allocation allocation2) {
        W0(allocation, allocation2, null);
    }

    public Script.KernelID V1() {
        return createKernelID(20, 59, null, null);
    }

    public int V2() {
        return this.B;
    }

    public void V3() {
        invoke(20);
    }

    public void W(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9804c)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9804c)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(21, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void W0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(3, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.KernelID W1() {
        return createKernelID(21, 59, null, null);
    }

    public Allocation W2() {
        return this.f9805c0;
    }

    public void W3() {
        invoke(21);
    }

    public void X(Allocation allocation, Allocation allocation2) {
        Y(allocation, allocation2, null);
    }

    public Script.FieldID X0() {
        return createFieldID(34, null);
    }

    public Script.KernelID X1() {
        return createKernelID(23, 59, null, null);
    }

    public Allocation X2() {
        return this.f9807d0;
    }

    public void X3() {
        invoke(4);
    }

    public void Y(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9804c)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(23, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID Y0() {
        return createFieldID(4, null);
    }

    public Script.KernelID Y1() {
        return createKernelID(24, 59, null, null);
    }

    public Allocation Y2() {
        return this.G;
    }

    public void Y3() {
        invoke(7);
    }

    public void Z(Allocation allocation, Allocation allocation2) {
        a0(allocation, allocation2, null);
    }

    public Script.FieldID Z0() {
        return createFieldID(30, null);
    }

    public Script.KernelID Z1() {
        return createKernelID(22, 59, null, null);
    }

    public Allocation Z2() {
        return this.f9801a0;
    }

    public void Z3() {
        invoke(0);
    }

    public void a(Allocation allocation) {
        this.J = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 25);
    }

    public void a0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9804c)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9804c)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(24, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID a1() {
        return createFieldID(7, null);
    }

    public Script.KernelID a2() {
        return createKernelID(25, 59, null, null);
    }

    public Allocation a3() {
        return this.f9843v0;
    }

    public void a4() {
        invoke(18);
    }

    public void b(Allocation allocation) {
        this.f9805c0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 44);
    }

    public void b0(Allocation allocation, Allocation allocation2) {
        c0(allocation, allocation2, null);
    }

    public Script.FieldID b1() {
        return createFieldID(3, null);
    }

    public Script.KernelID b2() {
        return createKernelID(26, 59, null, null);
    }

    public Allocation b3() {
        return this.f9847x0;
    }

    public void b4() {
        invoke(10);
    }

    public void c(Allocation allocation) {
        this.f9807d0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 45);
    }

    public void c0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9804c)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(22, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID c1() {
        return createFieldID(46, null);
    }

    public Script.KernelID c2() {
        return createKernelID(15, 59, null, null);
    }

    public Allocation c3() {
        return this.f9825m0;
    }

    public void c4() {
        invoke(11);
    }

    public void d(Allocation allocation) {
        this.G = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 22);
    }

    public void d0(Allocation allocation, Allocation allocation2) {
        e0(allocation, allocation2, null);
    }

    public Script.FieldID d1() {
        return createFieldID(55, null);
    }

    public Script.KernelID d2() {
        return createKernelID(17, 59, null, null);
    }

    public Allocation d3() {
        return this.f9845w0;
    }

    public void d4() {
        invoke(15);
    }

    public void e(Allocation allocation) {
        this.f9801a0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 42);
    }

    public void e0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9804c)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9804c)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(25, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID e1() {
        return createFieldID(29, null);
    }

    public Script.KernelID e2() {
        return createKernelID(18, 59, null, null);
    }

    public Allocation e3() {
        return this.K;
    }

    public void e4() {
        invoke(13);
    }

    public void f(Allocation allocation) {
        this.f9843v0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 63);
    }

    public void f0(Allocation allocation, Allocation allocation2) {
        g0(allocation, allocation2, null);
    }

    public Script.FieldID f1() {
        return createFieldID(2, null);
    }

    public Script.KernelID f2() {
        return createKernelID(16, 59, null, null);
    }

    public Allocation f3() {
        return this.f9849y0;
    }

    public void f4() {
        invoke(17);
    }

    public void g(Allocation allocation) {
        this.f9847x0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 65);
    }

    public void g0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9806d)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(26, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID g1() {
        return createFieldID(16, null);
    }

    public Script.KernelID g2() {
        return createKernelID(19, 59, null, null);
    }

    public Allocation g3() {
        return this.Z;
    }

    public void g4() {
        invoke(9);
    }

    public void h(Allocation allocation) {
        this.f9825m0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 54);
    }

    public void h0(Allocation allocation, Allocation allocation2) {
        i0(allocation, allocation2, null);
    }

    public Script.FieldID h1() {
        return createFieldID(8, null);
    }

    public Script.KernelID h2() {
        return createKernelID(7, 59, null, null);
    }

    public Allocation h3() {
        return this.F;
    }

    public void h4() {
        invoke(24);
    }

    public void i(Allocation allocation) {
        this.f9845w0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 64);
    }

    public void i0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(15, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID i1() {
        return createFieldID(9, null);
    }

    public Script.KernelID i2() {
        return createKernelID(8, 59, null, null);
    }

    public Allocation i3() {
        return this.P;
    }

    public void i4() {
        invoke(16);
    }

    public void j(Allocation allocation) {
        this.K = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 26);
    }

    public void j0(Allocation allocation, Allocation allocation2) {
        k0(allocation, allocation2, null);
    }

    public Script.FieldID j1() {
        return createFieldID(10, null);
    }

    public Script.KernelID j2() {
        return createKernelID(28, 59, null, null);
    }

    public Allocation j3() {
        return this.H;
    }

    public void j4() {
        invoke(14);
    }

    public void k(Allocation allocation) {
        this.f9849y0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 66);
    }

    public void k0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(17, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID k1() {
        return createFieldID(11, null);
    }

    public Script.KernelID k2() {
        return createKernelID(27, 59, null, null);
    }

    public Allocation k3() {
        return this.E;
    }

    public void k4() {
        invoke(8);
    }

    public void l(Allocation allocation) {
        this.Z = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 41);
    }

    public void l0(Allocation allocation, Allocation allocation2) {
        m0(allocation, allocation2, null);
    }

    public Script.FieldID l1() {
        return createFieldID(12, null);
    }

    public Script.KernelID l2() {
        return createKernelID(29, 59, null, null);
    }

    public Allocation l3() {
        return this.Q;
    }

    public synchronized void l4(boolean z3) {
        FieldPacker fieldPacker = this.f9812g;
        if (fieldPacker != null) {
            fieldPacker.reset();
        } else {
            this.f9812g = new FieldPacker(1);
        }
        this.f9812g.addBoolean(z3);
        setVar(34, this.f9812g);
        this.S = z3;
    }

    public void m(Allocation allocation) {
        this.F = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 21);
    }

    public void m0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(18, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID m1() {
        return createFieldID(28, null);
    }

    public Script.KernelID m2() {
        return createKernelID(4, 59, null, null);
    }

    public Allocation m3() {
        return this.f9803b0;
    }

    public synchronized void m4(float f4) {
        setVar(4, f4);
        this.f9828o = f4;
    }

    public void n(Allocation allocation) {
        this.P = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 31);
    }

    public void n0(Allocation allocation, Allocation allocation2) {
        o0(allocation, allocation2, null);
    }

    public Script.FieldID n1() {
        return createFieldID(1, null);
    }

    public Script.KernelID n2() {
        return createKernelID(5, 59, null, null);
    }

    public Allocation n3() {
        return this.T;
    }

    public synchronized void n4(float f4) {
        setVar(30, f4);
        this.O = f4;
    }

    public void o(Allocation allocation) {
        this.H = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 23);
    }

    public void o0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(16, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID o1() {
        return createFieldID(0, null);
    }

    public Script.KernelID o2() {
        return createKernelID(14, 59, null, null);
    }

    public Allocation o3() {
        return this.f9850z;
    }

    public synchronized void o4(int i4) {
        setVar(7, i4);
        this.f9834r = i4;
    }

    public void p(Allocation allocation) {
        this.E = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 20);
    }

    public void p0(Allocation allocation, Allocation allocation2) {
        q0(allocation, allocation2, null);
    }

    public Script.FieldID p1() {
        return createFieldID(5, null);
    }

    public Script.KernelID p2() {
        return createKernelID(12, 59, null, null);
    }

    public Allocation p3() {
        return this.D;
    }

    public synchronized void p4(int i4) {
        setVar(3, i4);
        this.f9826n = i4;
    }

    public void q(Allocation allocation) {
        this.Q = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 32);
    }

    public void q0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(19, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID q1() {
        return createFieldID(6, null);
    }

    public Script.KernelID q2() {
        return createKernelID(13, 59, null, null);
    }

    public Allocation q3() {
        return this.U;
    }

    public synchronized void q4(int i4) {
        setVar(46, i4);
        this.f9809e0 = i4;
    }

    public void r(Allocation allocation) {
        this.f9803b0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 43);
    }

    public void r0(Allocation allocation, Allocation allocation2) {
        s0(allocation, allocation2, null);
    }

    public Script.FieldID r1() {
        return createFieldID(14, null);
    }

    public Script.KernelID r2() {
        return createKernelID(9, 59, null, null);
    }

    public Allocation r3() {
        return this.L;
    }

    public synchronized void r4(int i4) {
        setVar(55, i4);
        this.f9827n0 = i4;
    }

    public void s(Allocation allocation) {
        this.T = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 35);
    }

    public void s0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9808e)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(7, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID s1() {
        return createFieldID(13, null);
    }

    public Script.KernelID s2() {
        return createKernelID(11, 59, null, null);
    }

    public Allocation s3() {
        return this.R;
    }

    public synchronized void s4(int i4) {
        FieldPacker fieldPacker = this.f9818j;
        if (fieldPacker != null) {
            fieldPacker.reset();
        } else {
            this.f9818j = new FieldPacker(2);
        }
        this.f9818j.addU16(i4);
        setVar(29, this.f9818j);
        this.N = i4;
    }

    public void t(Allocation allocation) {
        this.f9850z = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 15);
    }

    public void t0(Allocation allocation, Allocation allocation2) {
        u0(allocation, allocation2, null);
    }

    public Script.FieldID t1() {
        return createFieldID(18, null);
    }

    public Script.KernelID t2() {
        return createKernelID(10, 59, null, null);
    }

    public Allocation t3() {
        return this.Y;
    }

    public synchronized void t4(int i4) {
        setVar(2, i4);
        this.f9824m = i4;
    }

    public void u(Allocation allocation) {
        this.D = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 19);
    }

    public void u0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(8, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID u1() {
        return createFieldID(17, null);
    }

    public Script.KernelID u2() {
        return createKernelID(1, 59, null, null);
    }

    public Allocation u3() {
        return this.f9823l0;
    }

    public synchronized void u4(int i4) {
        setVar(16, i4);
        this.A = i4;
    }

    public void v(Allocation allocation) {
        this.U = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 36);
    }

    public void v0(Allocation allocation, Allocation allocation2) {
        w0(allocation, allocation2, null);
    }

    public Script.InvokeID v1() {
        return createInvokeID(1);
    }

    public Script.KernelID v2() {
        return createKernelID(2, 59, null, null);
    }

    public Allocation v3() {
        return this.f9841u0;
    }

    public synchronized void v4(int i4) {
        setVar(8, i4);
        this.f9836s = i4;
    }

    public void w(Allocation allocation) {
        this.L = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 27);
    }

    public void w0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9806d)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9806d)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(28, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.InvokeID w1() {
        return createInvokeID(6);
    }

    public Script.KernelID w2() {
        return createKernelID(3, 59, null, null);
    }

    public Allocation w3() {
        return this.f9813g0;
    }

    public synchronized void w4(int i4) {
        setVar(9, i4);
        this.f9838t = i4;
    }

    public void x(Allocation allocation) {
        this.R = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 33);
    }

    public void x0(Allocation allocation, Allocation allocation2) {
        y0(allocation, allocation2, null);
    }

    public Script.InvokeID x1() {
        return createInvokeID(2);
    }

    public Allocation x2() {
        return this.J;
    }

    public Allocation x3() {
        return this.f9833q0;
    }

    public synchronized void x4(int i4) {
        setVar(10, i4);
        this.f9840u = i4;
    }

    public void y(Allocation allocation) {
        this.Y = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 40);
    }

    public void y0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9810f)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(27, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.InvokeID y1() {
        return createInvokeID(5);
    }

    public boolean y2() {
        return this.S;
    }

    public Allocation y3() {
        return this.f9815h0;
    }

    public synchronized void y4(int i4) {
        setVar(11, i4);
        this.f9842v = i4;
    }

    public void z(Allocation allocation) {
        this.f9823l0 = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 53);
    }

    public void z0(Allocation allocation, Allocation allocation2) {
        A0(allocation, allocation2, null);
    }

    public Script.InvokeID z1() {
        return createInvokeID(3);
    }

    public float z2() {
        return this.f9828o;
    }

    public Allocation z3() {
        return this.f9821k0;
    }

    public synchronized void z4(int i4) {
        setVar(12, i4);
        this.f9844w = i4;
    }
}
