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
public class c0 extends ScriptC {
    public static final int A = 15;
    public static final int B = 0;
    public static boolean C = Process.is64Bit();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f9129h = "imageexenhancer_v1";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f9130i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f9131j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f9132k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f9133l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f9134m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f9135n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f9136o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f9137p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f9138q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f9139r = 6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f9140s = 7;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f9141t = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f9142u = 9;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f9143v = 10;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f9144w = 11;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f9145x = 12;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f9146y = 13;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f9147z = 14;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Element f9148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Element f9149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FieldPacker f9150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9154g;

    public c0(RenderScript renderScript) {
        super(renderScript, f9129h, p.a(), p.c());
        this.f9151d = 1;
        this.f9148a = Element.I32(renderScript);
        this.f9152e = 0;
        this.f9153f = 0;
        this.f9154g = 0;
        this.f9149b = Element.U8(renderScript);
    }

    public void A(Allocation allocation, Allocation allocation2) {
        B(allocation, allocation2, null);
    }

    public void B(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(7, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void C(Allocation allocation, Allocation allocation2) {
        D(allocation, allocation2, null);
    }

    public void D(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9149b)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(1, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID E() {
        return createFieldID(0, null);
    }

    public Script.FieldID F() {
        return createFieldID(1, null);
    }

    public Script.FieldID G() {
        return createFieldID(2, null);
    }

    public Script.FieldID H() {
        return createFieldID(3, null);
    }

    public Script.InvokeID I() {
        return createInvokeID(0);
    }

    public Script.KernelID J() {
        return createKernelID(12, 59, null, null);
    }

    public Script.KernelID K() {
        return createKernelID(10, 59, null, null);
    }

    public Script.KernelID L() {
        return createKernelID(11, 59, null, null);
    }

    public Script.KernelID M() {
        return createKernelID(9, 59, null, null);
    }

    public Script.KernelID N() {
        return createKernelID(3, 59, null, null);
    }

    public Script.KernelID O() {
        return createKernelID(4, 59, null, null);
    }

    public Script.KernelID P() {
        return createKernelID(13, 59, null, null);
    }

    public Script.KernelID Q() {
        return createKernelID(14, 59, null, null);
    }

    public Script.KernelID R() {
        return createKernelID(2, 59, null, null);
    }

    public Script.KernelID S() {
        return createKernelID(6, 43, null, null);
    }

    public Script.KernelID T() {
        return createKernelID(5, 43, null, null);
    }

    public Script.KernelID U() {
        return createKernelID(15, 59, null, null);
    }

    public Script.KernelID V() {
        return createKernelID(8, 59, null, null);
    }

    public Script.KernelID W() {
        return createKernelID(7, 59, null, null);
    }

    public Script.KernelID X() {
        return createKernelID(1, 59, null, null);
    }

    public int Y() {
        return this.f9151d;
    }

    public int Z() {
        return this.f9152e;
    }

    public void a(Allocation allocation, Allocation allocation2) {
        b(allocation, allocation2, null);
    }

    public int a0() {
        return this.f9153f;
    }

    public void b(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(12, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public int b0() {
        return this.f9154g;
    }

    public void c(Allocation allocation, Allocation allocation2) {
        d(allocation, allocation2, null);
    }

    public void c0(Allocation allocation, Allocation allocation2) {
        FieldPacker fieldPacker = new FieldPacker(C ? 64 : 8);
        fieldPacker.addObj(allocation);
        fieldPacker.addObj(allocation2);
        invoke(0, fieldPacker);
    }

    public void d(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(10, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public synchronized void d0(int i4) {
        setVar(0, i4);
        this.f9151d = i4;
    }

    public void e(Allocation allocation, Allocation allocation2) {
        f(allocation, allocation2, null);
    }

    public synchronized void e0(int i4) {
        setVar(1, i4);
        this.f9152e = i4;
    }

    public void f(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(11, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public synchronized void f0(int i4) {
        setVar(2, i4);
        this.f9153f = i4;
    }

    public void g(Allocation allocation, Allocation allocation2) {
        h(allocation, allocation2, null);
    }

    public synchronized void g0(int i4) {
        setVar(3, i4);
        this.f9154g = i4;
    }

    public void h(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(9, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void i(Allocation allocation, Allocation allocation2) {
        j(allocation, allocation2, null);
    }

    public void j(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(3, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void k(Allocation allocation, Allocation allocation2) {
        l(allocation, allocation2, null);
    }

    public void l(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(4, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void m(Allocation allocation, Allocation allocation2) {
        n(allocation, allocation2, null);
    }

    public void n(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(13, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void o(Allocation allocation, Allocation allocation2) {
        p(allocation, allocation2, null);
    }

    public void p(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(14, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void q(Allocation allocation, Allocation allocation2) {
        r(allocation, allocation2, null);
    }

    public void r(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9149b)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(2, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void s(Allocation allocation, Allocation allocation2) {
        t(allocation, allocation2, null);
    }

    public void t(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9149b)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9149b)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(6, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void u(Allocation allocation, Allocation allocation2) {
        v(allocation, allocation2, null);
    }

    public void v(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9149b)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9149b)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(5, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void w(Allocation allocation, Allocation allocation2) {
        x(allocation, allocation2, null);
    }

    public void x(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(15, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void y(Allocation allocation, Allocation allocation2) {
        z(allocation, allocation2, null);
    }

    public void z(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.f9148a)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(8, allocation, allocation2, (FieldPacker) null, launchOptions);
    }
}
