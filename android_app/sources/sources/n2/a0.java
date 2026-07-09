package n2;

import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.Script;
import android.renderscript.ScriptC;
import android.renderscript.Type;
import n2.e0;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends ScriptC {
    public static final int A0 = 25;
    public static final int B0 = 26;
    public static final int C0 = 27;
    public static final int D0 = 28;
    public static final int E0 = 29;
    public static final int F0 = 30;
    public static final int G0 = 31;
    public static final int H0 = 32;
    public static final int I0 = 33;
    public static final int J0 = 34;
    public static final int K0 = 35;
    public static final int L0 = 36;
    public static final int M0 = 37;
    public static final int N0 = 38;
    public static final int O0 = 39;
    public static final int P0 = 40;
    public static final int Q0 = 41;
    public static final int R0 = 42;
    public static final int S0 = 1;
    public static final int T0 = 2;
    public static final int U0 = 3;
    public static final int V0 = 4;
    public static final int W0 = 5;
    public static final int X0 = 6;
    public static final int Y0 = 7;
    public static final int Z0 = 8;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f8996a0 = "imageexenhancer";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int f8997a1 = 9;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f8998b0 = 0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final int f8999b1 = 10;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f9000c0 = 1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int f9001c1 = 11;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f9002d0 = 2;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final int f9003d1 = 12;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f9004e0 = 3;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final int f9005e1 = 13;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f9006f0 = 4;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final int f9007f1 = 0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f9008g0 = 5;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final int f9009g1 = 1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f9010h0 = 6;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final int f9011h1 = 2;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f9012i0 = 7;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f9013i1 = 3;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f9014j0 = 8;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final int f9015j1 = 4;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f9016k0 = 9;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final int f9017k1 = 5;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f9018l0 = 10;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final int f9019l1 = 6;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f9020m0 = 11;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final int f9021m1 = 7;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f9022n0 = 12;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final int f9023n1 = 8;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f9024o0 = 13;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f9025p0 = 14;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f9026q0 = 15;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f9027r0 = 16;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f9028s0 = 17;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f9029t0 = 18;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f9030u0 = 19;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f9031v0 = 20;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f9032w0 = 21;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f9033x0 = 22;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f9034y0 = 23;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int f9035z0 = 24;
    public Allocation A;
    public Allocation B;
    public Allocation C;
    public Allocation D;
    public Allocation E;
    public Allocation F;
    public Allocation G;
    public Allocation H;
    public Allocation I;
    public Allocation J;
    public Allocation K;
    public Allocation L;
    public Allocation M;
    public Allocation N;
    public Allocation O;
    public Allocation P;
    public Allocation Q;
    public Allocation R;
    public Allocation S;
    public Allocation T;
    public Allocation U;
    public Allocation V;
    public double W;
    public double X;
    public Allocation Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Element f9036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Element f9037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Element f9038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Element f9039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Element f9040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FieldPacker f9041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FieldPacker f9042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FieldPacker f9043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FieldPacker f9044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e0.a f9045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Allocation f9048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9050o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f9052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Allocation f9053r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Allocation f9054s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Allocation f9055t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Allocation f9056u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Allocation f9057v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Allocation f9058w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Allocation f9059x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Allocation f9060y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Allocation f9061z;

    public a0(RenderScript renderScript) {
        super(renderScript, f8996a0, n.a(), n.c());
        this.f9039d = e0.i(renderScript);
        this.f9038c = Element.I32(renderScript);
        this.f9036a = Element.F32(renderScript);
        this.f9037b = Element.F64(renderScript);
        this.f9040e = Element.U8(renderScript);
    }

    public void A(Allocation allocation) {
        this.f9048m = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 3);
    }

    public Script.KernelID A0() {
        return createKernelID(5, 59, null, null);
    }

    public Allocation A1() {
        return this.C;
    }

    public void B(Allocation allocation) {
        this.f9060y = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 15);
    }

    public Script.KernelID B0() {
        return createKernelID(3, 59, null, null);
    }

    public Allocation B1() {
        return this.f9059x;
    }

    public void C(Allocation allocation) {
        this.B = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 18);
    }

    public Script.KernelID C0() {
        return createKernelID(4, 59, null, null);
    }

    public Allocation C1() {
        return this.A;
    }

    public void D(Allocation allocation) {
        this.f9061z = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 16);
    }

    public Script.KernelID D0() {
        return createKernelID(2, 59, null, null);
    }

    public e0.a D1() {
        return this.f9045j;
    }

    public void E(Allocation allocation) {
        this.C = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 19);
    }

    public Script.KernelID E0() {
        return createKernelID(8, 59, null, null);
    }

    public void E1() {
        invoke(8);
    }

    public void F(Allocation allocation) {
        this.f9059x = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 14);
    }

    public Script.KernelID F0() {
        return createKernelID(11, 59, null, null);
    }

    public void F1() {
        invoke(4);
    }

    public void G(Allocation allocation) {
        this.A = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 17);
    }

    public Script.KernelID G0() {
        return createKernelID(7, 59, null, null);
    }

    public void G1() {
        invoke(6);
    }

    public void H(Allocation allocation, Allocation allocation2) {
        I(allocation, allocation2, null);
    }

    public Script.KernelID H0() {
        return createKernelID(13, 59, null, null);
    }

    public void H1() {
        invoke(5);
    }

    public void I(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(5, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.KernelID I0() {
        return createKernelID(10, 59, null, null);
    }

    public void I1() {
        invoke(2);
    }

    public void J(Allocation allocation, Allocation allocation2) {
        K(allocation, allocation2, null);
    }

    public Script.KernelID J0() {
        return createKernelID(9, 59, null, null);
    }

    public void J1() {
        invoke(3);
    }

    public void K(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(3, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.KernelID K0() {
        return createKernelID(12, 59, null, null);
    }

    public void K1() {
        invoke(1);
    }

    public void L(Allocation allocation, Allocation allocation2) {
        M(allocation, allocation2, null);
    }

    public Script.KernelID L0() {
        return createKernelID(6, 59, null, null);
    }

    public void L1() {
        invoke(7);
    }

    public void M(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(4, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.KernelID M0() {
        return createKernelID(1, 59, null, null);
    }

    public void M1() {
        invoke(0);
    }

    public void N(Allocation allocation, Allocation allocation2) {
        O(allocation, allocation2, null);
    }

    public int N0() {
        return this.Z;
    }

    public synchronized void N1(int i4) {
        setVar(42, i4);
        this.Z = i4;
    }

    public void O(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9040e)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(2, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public double O0() {
        return this.W;
    }

    public synchronized void O1(double d4) {
        setVar(39, d4);
        this.W = d4;
    }

    public void P(Allocation allocation, Allocation allocation2) {
        Q(allocation, allocation2, null);
    }

    public double P0() {
        return this.X;
    }

    public synchronized void P1(double d4) {
        setVar(40, d4);
        this.X = d4;
    }

    public void Q(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(8, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public float Q0() {
        return this.f9052q;
    }

    public synchronized void Q1(float f4) {
        setVar(7, f4);
        this.f9052q = f4;
    }

    public void R(Allocation allocation, Allocation allocation2) {
        S(allocation, allocation2, null);
    }

    public int R0() {
        return this.f9049n;
    }

    public synchronized void R1(int i4) {
        setVar(4, i4);
        this.f9049n = i4;
    }

    public void S(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(11, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public int S0() {
        return this.f9046k;
    }

    public synchronized void S1(int i4) {
        setVar(1, i4);
        this.f9046k = i4;
    }

    public void T(Allocation allocation, Allocation allocation2) {
        U(allocation, allocation2, null);
    }

    public int T0() {
        return this.f9051p;
    }

    public synchronized void T1(int i4) {
        setVar(6, i4);
        this.f9051p = i4;
    }

    public void U(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(7, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public int U0() {
        return this.f9050o;
    }

    public synchronized void U1(int i4) {
        setVar(5, i4);
        this.f9050o = i4;
    }

    public void V(Allocation allocation, Allocation allocation2) {
        W(allocation, allocation2, null);
    }

    public int V0() {
        return this.f9047l;
    }

    public synchronized void V1(int i4) {
        setVar(2, i4);
        this.f9047l = i4;
    }

    public void W(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(13, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Allocation W0() {
        return this.V;
    }

    public synchronized void W1(e0.a aVar) {
        this.f9045j = aVar;
        FieldPacker fieldPacker = new FieldPacker(36);
        fieldPacker.addI32(aVar.f9185a);
        fieldPacker.addI32(aVar.f9186b);
        fieldPacker.addI32(aVar.f9187c);
        fieldPacker.addI32(aVar.f9188d);
        fieldPacker.addI32(aVar.f9189e);
        fieldPacker.addI32(aVar.f9190f);
        fieldPacker.addI32(aVar.f9191g);
        fieldPacker.addI32(aVar.f9192h);
        fieldPacker.addI32(aVar.f9193i);
        setVar(0, fieldPacker, this.f9039d, new int[]{1});
    }

    public void X(Allocation allocation, Allocation allocation2) {
        Y(allocation, allocation2, null);
    }

    public Allocation X0() {
        return this.E;
    }

    public void Y(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(10, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Allocation Y0() {
        return this.L;
    }

    public void Z(Allocation allocation, Allocation allocation2) {
        a0(allocation, allocation2, null);
    }

    public Allocation Z0() {
        return this.F;
    }

    public void a(Allocation allocation) {
        this.V = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 38);
    }

    public void a0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(9, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Allocation a1() {
        return this.H;
    }

    public void b(Allocation allocation) {
        this.E = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 21);
    }

    public void b0(Allocation allocation, Allocation allocation2) {
        c0(allocation, allocation2, null);
    }

    public Allocation b1() {
        return this.M;
    }

    public void c(Allocation allocation) {
        this.L = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 28);
    }

    public void c0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(12, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Allocation c1() {
        return this.I;
    }

    public void d(Allocation allocation) {
        this.F = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 22);
    }

    public void d0(Allocation allocation, Allocation allocation2) {
        e0(allocation, allocation2, null);
    }

    public Allocation d1() {
        return this.Q;
    }

    public void e(Allocation allocation) {
        this.H = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 24);
    }

    public void e0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(6, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Allocation e1() {
        return this.G;
    }

    public void f(Allocation allocation) {
        this.M = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 29);
    }

    public void f0(Allocation allocation, Allocation allocation2) {
        g0(allocation, allocation2, null);
    }

    public Allocation f1() {
        return this.f9057v;
    }

    public void g(Allocation allocation) {
        this.I = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 25);
    }

    public void g0(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9040e)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9038c)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(1, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Allocation g1() {
        return this.f9058w;
    }

    public void h(Allocation allocation) {
        this.Q = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 33);
    }

    public Script.FieldID h0() {
        return createFieldID(42, null);
    }

    public Allocation h1() {
        return this.P;
    }

    public void i(Allocation allocation) {
        this.G = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 23);
    }

    public Script.FieldID i0() {
        return createFieldID(39, null);
    }

    public Allocation i1() {
        return this.S;
    }

    public void j(Allocation allocation) {
        this.f9057v = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 12);
    }

    public Script.FieldID j0() {
        return createFieldID(40, null);
    }

    public Allocation j1() {
        return this.O;
    }

    public void k(Allocation allocation) {
        this.f9058w = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 13);
    }

    public Script.FieldID k0() {
        return createFieldID(7, null);
    }

    public Allocation k1() {
        return this.D;
    }

    public void l(Allocation allocation) {
        this.P = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 32);
    }

    public Script.FieldID l0() {
        return createFieldID(4, null);
    }

    public Allocation l1() {
        return this.f9053r;
    }

    public void m(Allocation allocation) {
        this.S = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 35);
    }

    public Script.FieldID m0() {
        return createFieldID(1, null);
    }

    public Allocation m1() {
        return this.f9055t;
    }

    public void n(Allocation allocation) {
        this.O = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 31);
    }

    public Script.FieldID n0() {
        return createFieldID(6, null);
    }

    public Allocation n1() {
        return this.f9056u;
    }

    public void o(Allocation allocation) {
        this.D = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 20);
    }

    public Script.FieldID o0() {
        return createFieldID(5, null);
    }

    public Allocation o1() {
        return this.T;
    }

    public void p(Allocation allocation) {
        this.f9053r = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 8);
    }

    public Script.FieldID p0() {
        return createFieldID(2, null);
    }

    public Allocation p1() {
        return this.f9054s;
    }

    public void q(Allocation allocation) {
        this.f9055t = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 10);
    }

    public Script.FieldID q0() {
        return createFieldID(0, null);
    }

    public Allocation q1() {
        return this.N;
    }

    public void r(Allocation allocation) {
        this.f9056u = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 11);
    }

    public Script.InvokeID r0() {
        return createInvokeID(8);
    }

    public Allocation r1() {
        return this.J;
    }

    public void s(Allocation allocation) {
        this.T = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 36);
    }

    public Script.InvokeID s0() {
        return createInvokeID(4);
    }

    public Allocation s1() {
        return this.K;
    }

    public void t(Allocation allocation) {
        this.f9054s = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 9);
    }

    public Script.InvokeID t0() {
        return createInvokeID(6);
    }

    public Allocation t1() {
        return this.Y;
    }

    public void u(Allocation allocation) {
        this.N = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 30);
    }

    public Script.InvokeID u0() {
        return createInvokeID(5);
    }

    public Allocation u1() {
        return this.R;
    }

    public void v(Allocation allocation) {
        this.J = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 26);
    }

    public Script.InvokeID v0() {
        return createInvokeID(2);
    }

    public Allocation v1() {
        return this.U;
    }

    public void w(Allocation allocation) {
        this.K = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 27);
    }

    public Script.InvokeID w0() {
        return createInvokeID(3);
    }

    public Allocation w1() {
        return this.f9048m;
    }

    public void x(Allocation allocation) {
        this.Y = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 41);
    }

    public Script.InvokeID x0() {
        return createInvokeID(1);
    }

    public Allocation x1() {
        return this.f9060y;
    }

    public void y(Allocation allocation) {
        this.R = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 34);
    }

    public Script.InvokeID y0() {
        return createInvokeID(7);
    }

    public Allocation y1() {
        return this.B;
    }

    public void z(Allocation allocation) {
        this.U = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 37);
    }

    public Script.InvokeID z0() {
        return createInvokeID(0);
    }

    public Allocation z1() {
        return this.f9061z;
    }
}
