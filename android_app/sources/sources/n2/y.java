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
public class y extends ScriptC {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 3;
    public static final int E = 4;
    public static final int F = 5;
    public static final int G = 6;
    public static final int H = 7;
    public static final int I = 8;
    public static final int J = 9;
    public static final int K = 10;
    public static final int L = 11;
    public static final int M = 12;
    public static final int N = 13;
    public static final int O = 14;
    public static final int P = 15;
    public static final int Q = 16;
    public static final int R = 17;
    public static final int S = 18;
    public static final int T = 1;
    public static final int U = 2;
    public static final int V = 3;
    public static final int W = 4;
    public static final int X = 5;
    public static final int Y = 6;
    public static final int Z = 7;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f9703a0 = 8;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f9704b0 = 9;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f9705c0 = 10;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f9706d0 = 11;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f9707e0 = 12;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f9708f0 = 13;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f9709g0 = 14;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f9710h0 = 0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f9711i0 = 1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f9712j0 = 2;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f9713k0 = 3;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f9714l0 = 4;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f9715m0 = 5;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f9716n0 = 6;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f9717o0 = 7;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f9718p0 = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f9719z = "dscenhance";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Element f9720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Element f9721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Element f9722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Element f9723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Element f9724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FieldPacker f9725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9731l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9732m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Allocation f9733n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Allocation f9734o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Allocation f9736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Allocation f9737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Allocation f9738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Allocation f9739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Allocation f9740u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Allocation f9741v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d0 f9742w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d0 f9743x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Allocation f9744y;

    public y(RenderScript renderScript) {
        super(renderScript, f9719z, j.a(), j.c());
        this.f9720a = Element.I32(renderScript);
        this.f9722c = d0.i(renderScript);
        this.f9724e = Element.U8_4(renderScript);
        this.f9721b = Element.I8(renderScript);
        this.f9723d = Element.U8(renderScript);
    }

    public void A(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9721b)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9721b)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(7, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public int A0() {
        return this.f9730k;
    }

    public void B(Allocation allocation, Allocation allocation2) {
        C(allocation, allocation2, null);
    }

    public Allocation B0() {
        return this.f9734o;
    }

    public void C(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9724e)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9724e)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(4, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Allocation C0() {
        return this.f9736q;
    }

    public void D(Allocation allocation, Allocation allocation2) {
        E(allocation, allocation2, null);
    }

    public Allocation D0() {
        return this.f9739t;
    }

    public void E(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9722c)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_DSC_INDEX_TAG!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9723d)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(12, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Allocation E0() {
        return this.f9738s;
    }

    public void F(Allocation allocation, Allocation allocation2) {
        G(allocation, allocation2, null);
    }

    public Allocation F0() {
        return this.f9741v;
    }

    public void G(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9723d)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9723d)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(10, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Allocation G0() {
        return this.f9733n;
    }

    public void H(Allocation allocation, Allocation allocation2) {
        I(allocation, allocation2, null);
    }

    public Allocation H0() {
        return this.f9737r;
    }

    public void I(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9723d)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9723d)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(11, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Allocation I0() {
        return this.f9740u;
    }

    public void J(Allocation allocation, Allocation allocation2) {
        K(allocation, allocation2, null);
    }

    public Allocation J0() {
        return this.f9744y;
    }

    public void K(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9722c)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_DSC_INDEX_TAG!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9722c)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_DSC_INDEX_TAG!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(2, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public d0 K0() {
        return this.f9743x;
    }

    public void L(Allocation allocation, Allocation allocation2) {
        M(allocation, allocation2, null);
    }

    public void L0(int i4, int i5, int i6, int i7) {
        FieldPacker fieldPacker = new FieldPacker(16);
        fieldPacker.addI32(i4);
        fieldPacker.addI32(i5);
        fieldPacker.addI32(i6);
        fieldPacker.addI32(i7);
        invoke(5, fieldPacker);
    }

    public void M(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9723d)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9724e)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(14, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void M0(int i4, int i5, int i6, int i7, int i8, int i9) {
        FieldPacker fieldPacker = new FieldPacker(24);
        fieldPacker.addI32(i4);
        fieldPacker.addI32(i5);
        fieldPacker.addI32(i6);
        fieldPacker.addI32(i7);
        fieldPacker.addI32(i8);
        fieldPacker.addI32(i9);
        invoke(6, fieldPacker);
    }

    public Script.FieldID N() {
        return createFieldID(3, null);
    }

    public void N0(int i4, int i5, int i6, int i7) {
        FieldPacker fieldPacker = new FieldPacker(16);
        fieldPacker.addI32(i4);
        fieldPacker.addI32(i5);
        fieldPacker.addI32(i6);
        fieldPacker.addI32(i7);
        invoke(7, fieldPacker);
    }

    public Script.FieldID O() {
        return createFieldID(2, null);
    }

    public void O0(int i4, int i5, int i6, int i7, int i8, int i9) {
        FieldPacker fieldPacker = new FieldPacker(24);
        fieldPacker.addI32(i4);
        fieldPacker.addI32(i5);
        fieldPacker.addI32(i6);
        fieldPacker.addI32(i7);
        fieldPacker.addI32(i8);
        fieldPacker.addI32(i9);
        invoke(8, fieldPacker);
    }

    public Script.FieldID P() {
        return createFieldID(1, null);
    }

    public void P0(long j4, long j5, float f4, float f5, float f6, float f7, float f8, float f9) {
        FieldPacker fieldPacker = new FieldPacker(32);
        fieldPacker.addU32(j4);
        fieldPacker.addU32(j5);
        fieldPacker.addF32(f4);
        fieldPacker.addF32(f5);
        fieldPacker.addF32(f6);
        fieldPacker.addF32(f7);
        fieldPacker.addF32(f8);
        fieldPacker.addF32(f9);
        invoke(1, fieldPacker);
    }

    public Script.FieldID Q() {
        return createFieldID(0, null);
    }

    public void Q0(int i4, int i5, int i6, int i7, float f4, int i8) {
        FieldPacker fieldPacker = new FieldPacker(24);
        fieldPacker.addI32(i4);
        fieldPacker.addI32(i5);
        fieldPacker.addI32(i6);
        fieldPacker.addI32(i7);
        fieldPacker.addF32(f4);
        fieldPacker.addI32(i8);
        invoke(4, fieldPacker);
    }

    public Script.FieldID R() {
        return createFieldID(9, null);
    }

    public void R0() {
        invoke(0);
    }

    public Script.FieldID S() {
        return createFieldID(5, null);
    }

    public void S0(int i4) {
        FieldPacker fieldPacker = new FieldPacker(4);
        fieldPacker.addI32(i4);
        invoke(2, fieldPacker);
    }

    public Script.FieldID T() {
        return createFieldID(6, null);
    }

    public void T0(float f4) {
        FieldPacker fieldPacker = new FieldPacker(4);
        fieldPacker.addF32(f4);
        invoke(3, fieldPacker);
    }

    public Script.FieldID U() {
        return createFieldID(4, null);
    }

    public synchronized void U0(int i4) {
        setVar(3, i4);
        this.f9729j = i4;
    }

    public Script.InvokeID V() {
        return createInvokeID(5);
    }

    public synchronized void V0(int i4) {
        setVar(2, i4);
        this.f9728i = i4;
    }

    public Script.InvokeID W() {
        return createInvokeID(6);
    }

    public synchronized void W0(int i4) {
        setVar(1, i4);
        this.f9727h = i4;
    }

    public Script.InvokeID X() {
        return createInvokeID(7);
    }

    public synchronized void X0(int i4) {
        setVar(0, i4);
        this.f9726g = i4;
    }

    public Script.InvokeID Y() {
        return createInvokeID(8);
    }

    public synchronized void Y0(int i4) {
        setVar(9, i4);
        this.f9735p = i4;
    }

    public Script.InvokeID Z() {
        return createInvokeID(1);
    }

    public synchronized void Z0(int i4) {
        setVar(5, i4);
        this.f9731l = i4;
    }

    public void a(d0 d0Var) {
        this.f9742w = d0Var;
        bindAllocation(d0Var == null ? null : d0Var.getAllocation(), 16);
    }

    public Script.InvokeID a0() {
        return createInvokeID(4);
    }

    public synchronized void a1(int i4) {
        setVar(6, i4);
        this.f9732m = i4;
    }

    public void b(Allocation allocation) {
        this.f9734o = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 8);
    }

    public Script.InvokeID b0() {
        return createInvokeID(0);
    }

    public synchronized void b1(int i4) {
        setVar(4, i4);
        this.f9730k = i4;
    }

    public void c(Allocation allocation) {
        this.f9736q = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 10);
    }

    public Script.InvokeID c0() {
        return createInvokeID(2);
    }

    public void d(Allocation allocation) {
        this.f9739t = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 13);
    }

    public Script.InvokeID d0() {
        return createInvokeID(3);
    }

    public void e(Allocation allocation) {
        this.f9738s = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 12);
    }

    public Script.KernelID e0() {
        return createKernelID(1, 43, null, null);
    }

    public void f(Allocation allocation) {
        this.f9741v = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 15);
    }

    public Script.KernelID f0() {
        return createKernelID(3, 59, null, null);
    }

    public void g(Allocation allocation) {
        this.f9733n = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 7);
    }

    public Script.KernelID g0() {
        return createKernelID(13, 35, null, null);
    }

    public void h(Allocation allocation) {
        this.f9737r = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 11);
    }

    public Script.KernelID h0() {
        return createKernelID(8, 59, null, null);
    }

    public void i(Allocation allocation) {
        this.f9740u = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 14);
    }

    public Script.KernelID i0() {
        return createKernelID(9, 59, null, null);
    }

    public void j(Allocation allocation) {
        this.f9744y = allocation;
        if (allocation == null) {
            allocation = null;
        }
        bindAllocation(allocation, 18);
    }

    public Script.KernelID j0() {
        return createKernelID(5, 59, null, null);
    }

    public void k(d0 d0Var) {
        this.f9743x = d0Var;
        bindAllocation(d0Var == null ? null : d0Var.getAllocation(), 17);
    }

    public Script.KernelID k0() {
        return createKernelID(6, 59, null, null);
    }

    public void l(Allocation allocation, Allocation allocation2) {
        m(allocation, allocation2, null);
    }

    public Script.KernelID l0() {
        return createKernelID(7, 43, null, null);
    }

    public void m(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9722c)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_DSC_INDEX_TAG!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9722c)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_DSC_INDEX_TAG!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(1, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.KernelID m0() {
        return createKernelID(4, 59, null, null);
    }

    public void n(Allocation allocation, Allocation allocation2) {
        o(allocation, allocation2, null);
    }

    public Script.KernelID n0() {
        return createKernelID(12, 59, null, null);
    }

    public void o(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9722c)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_DSC_INDEX_TAG!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9722c)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_DSC_INDEX_TAG!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(3, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.KernelID o0() {
        return createKernelID(10, 59, null, null);
    }

    public void p(Allocation allocation, Allocation allocation2) {
        q(allocation, allocation2, null);
    }

    public Script.KernelID p0() {
        return createKernelID(11, 43, null, null);
    }

    public void q(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9721b)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9724e)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(13, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.KernelID q0() {
        return createKernelID(2, 43, null, null);
    }

    public void r(Allocation allocation, Allocation allocation2) {
        s(allocation, allocation2, null);
    }

    public Script.KernelID r0() {
        return createKernelID(14, 35, null, null);
    }

    public void s(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9721b)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9721b)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(8, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public d0 s0() {
        return this.f9742w;
    }

    public void t(Allocation allocation, Allocation allocation2) {
        u(allocation, allocation2, null);
    }

    public int t0() {
        return this.f9729j;
    }

    public void u(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9723d)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9723d)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(9, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public int u0() {
        return this.f9728i;
    }

    public void v(Allocation allocation, Allocation allocation2) {
        w(allocation, allocation2, null);
    }

    public int v0() {
        return this.f9727h;
    }

    public void w(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9722c)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_DSC_INDEX_TAG!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9721b)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(5, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public int w0() {
        return this.f9726g;
    }

    public void x(Allocation allocation, Allocation allocation2) {
        y(allocation, allocation2, null);
    }

    public int x0() {
        return this.f9735p;
    }

    public void y(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9721b)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9721b)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(6, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public int y0() {
        return this.f9731l;
    }

    public void z(Allocation allocation, Allocation allocation2) {
        A(allocation, allocation2, null);
    }

    public int z0() {
        return this.f9732m;
    }
}
