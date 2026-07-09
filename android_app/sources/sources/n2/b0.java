package n2;

import android.os.Process;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.Script;
import android.renderscript.ScriptC;
import android.renderscript.Type;

/* JADX INFO: loaded from: classes.dex */
public class b0 extends ScriptC {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f9104f = "imageexenhancer_full";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f9105g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f9106h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f9107i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f9108j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f9109k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f9110l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f9111m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f9112n = 6;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f9113o = 7;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f9114p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f9115q = 9;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f9116r = 10;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f9117s = 11;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f9118t = 12;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f9119u = 13;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f9120v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f9121w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static boolean f9122x = Process.is64Bit();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Element f9123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Element f9124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FieldPacker f9125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9127e;

    public b0(RenderScript renderScript) {
        super(renderScript, f9104f, o.a(), o.c());
        this.f9126d = 1;
        this.f9123a = Element.I32(renderScript);
        this.f9127e = 0;
        this.f9124b = Element.U8(renderScript);
    }

    public Script.FieldID A() {
        return createFieldID(0, null);
    }

    public Script.FieldID B() {
        return createFieldID(1, null);
    }

    public Script.InvokeID C() {
        return createInvokeID(0);
    }

    public Script.InvokeID D() {
        return createInvokeID(1);
    }

    public Script.KernelID E() {
        return createKernelID(12, 59, null, null);
    }

    public Script.KernelID F() {
        return createKernelID(7, 59, null, null);
    }

    public Script.KernelID G() {
        return createKernelID(6, 59, null, null);
    }

    public Script.KernelID H() {
        return createKernelID(10, 59, null, null);
    }

    public Script.KernelID I() {
        return createKernelID(11, 59, null, null);
    }

    public Script.KernelID J() {
        return createKernelID(2, 59, null, null);
    }

    public Script.KernelID K() {
        return createKernelID(5, 43, null, null);
    }

    public Script.KernelID L() {
        return createKernelID(4, 43, null, null);
    }

    public Script.KernelID M() {
        return createKernelID(3, 59, null, null);
    }

    public Script.KernelID N() {
        return createKernelID(13, 59, null, null);
    }

    public Script.KernelID O() {
        return createKernelID(8, 59, null, null);
    }

    public Script.KernelID P() {
        return createKernelID(9, 59, null, null);
    }

    public Script.KernelID Q() {
        return createKernelID(1, 59, null, null);
    }

    public int R() {
        return this.f9126d;
    }

    public int S() {
        return this.f9127e;
    }

    public void T(Allocation allocation, Allocation allocation2) {
        FieldPacker fieldPacker = new FieldPacker(f9122x ? 64 : 8);
        fieldPacker.addObj(allocation);
        fieldPacker.addObj(allocation2);
        invoke(0, fieldPacker);
    }

    public void U(Allocation allocation, Allocation allocation2) {
        FieldPacker fieldPacker = new FieldPacker(f9122x ? 64 : 8);
        fieldPacker.addObj(allocation);
        fieldPacker.addObj(allocation2);
        invoke(1, fieldPacker);
    }

    public synchronized void V(int i4) {
        setVar(0, i4);
        this.f9126d = i4;
    }

    public synchronized void W(int i4) {
        setVar(1, i4);
        this.f9127e = i4;
    }

    public void a(Allocation allocation, Allocation allocation2) {
        b(allocation, allocation2, null);
    }

    public void b(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(12, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void c(Allocation allocation, Allocation allocation2) {
        d(allocation, allocation2, null);
    }

    public void d(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(7, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void e(Allocation allocation, Allocation allocation2) {
        f(allocation, allocation2, null);
    }

    public void f(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(6, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void g(Allocation allocation, Allocation allocation2) {
        h(allocation, allocation2, null);
    }

    public void h(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(10, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void i(Allocation allocation, Allocation allocation2) {
        j(allocation, allocation2, null);
    }

    public void j(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(11, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void k(Allocation allocation, Allocation allocation2) {
        l(allocation, allocation2, null);
    }

    public void l(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9124b)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(2, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void m(Allocation allocation, Allocation allocation2) {
        n(allocation, allocation2, null);
    }

    public void n(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9124b)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9124b)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(5, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void o(Allocation allocation, Allocation allocation2) {
        p(allocation, allocation2, null);
    }

    public void p(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9124b)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9124b)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(4, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void q(Allocation allocation, Allocation allocation2) {
        r(allocation, allocation2, null);
    }

    public void r(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(3, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void s(Allocation allocation, Allocation allocation2) {
        t(allocation, allocation2, null);
    }

    public void t(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(13, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void u(Allocation allocation, Allocation allocation2) {
        v(allocation, allocation2, null);
    }

    public void v(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(8, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void w(Allocation allocation, Allocation allocation2) {
        x(allocation, allocation2, null);
    }

    public void x(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(9, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void y(Allocation allocation, Allocation allocation2) {
        z(allocation, allocation2, null);
    }

    public void z(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9124b)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9123a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(1, allocation, allocation2, (FieldPacker) null, launchOptions);
    }
}
