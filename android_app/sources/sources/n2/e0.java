package n2;

import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.RSIllegalArgumentException;
import android.renderscript.RenderScript;
import android.renderscript.Script;
import android.renderscript.Type;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends Script.FieldBase {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WeakReference<Element> f9182c = new WeakReference<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a[] f9183a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FieldPacker f9184b = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9189e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9190f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9191g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f9192h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f9193i;
    }

    public e0(RenderScript renderScript) {
        ((Script.FieldBase) this).mElement = i(renderScript);
    }

    public static e0 d(RenderScript renderScript, int i4) {
        return e(renderScript, i4, 1);
    }

    public static e0 e(RenderScript renderScript, int i4, int i5) {
        e0 e0Var = new e0(renderScript);
        ((Script.FieldBase) e0Var).mAllocation = Allocation.createSized(renderScript, ((Script.FieldBase) e0Var).mElement, i4, i5);
        return e0Var;
    }

    public static e0 f(RenderScript renderScript, int i4, int i5) {
        return g(renderScript, i4, i5, 1);
    }

    public static e0 g(RenderScript renderScript, int i4, int i5, int i6) {
        e0 e0Var = new e0(renderScript);
        Type.Builder builder = new Type.Builder(renderScript, ((Script.FieldBase) e0Var).mElement);
        builder.setX(i4);
        builder.setY(i5);
        ((Script.FieldBase) e0Var).mAllocation = Allocation.createTyped(renderScript, builder.create(), i6);
        return e0Var;
    }

    public static e0 h(RenderScript renderScript, Type.Builder builder, int i4) {
        e0 e0Var = new e0(renderScript);
        Type typeCreate = builder.create();
        if (typeCreate.getElement() != ((Script.FieldBase) e0Var).mElement) {
            throw new RSIllegalArgumentException("Type.Builder did not match expected element type.");
        }
        ((Script.FieldBase) e0Var).mAllocation = Allocation.createTyped(renderScript, typeCreate, i4);
        return e0Var;
    }

    public static Element i(RenderScript renderScript) {
        Element.Builder builder = new Element.Builder(renderScript);
        builder.add(Element.I32(renderScript), "Bns1_256");
        builder.add(Element.I32(renderScript), "Bns2_256");
        builder.add(Element.I32(renderScript), "a_T");
        builder.add(Element.I32(renderScript), "b_T");
        builder.add(Element.I32(renderScript), "sL_256_256");
        builder.add(Element.I32(renderScript), "delta_slp_256");
        builder.add(Element.I32(renderScript), "nACF_256");
        builder.add(Element.I32(renderScript), "delta_c_256");
        builder.add(Element.I32(renderScript), "c2_256_256");
        return builder.create();
    }

    public static Type.Builder j(RenderScript renderScript) {
        return new Type.Builder(renderScript, i(renderScript));
    }

    public synchronized void A(int i4, int i5, boolean z3) {
        if (this.f9184b == null) {
            this.f9184b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        if (this.f9183a == null) {
            this.f9183a = new a[getType().getX()];
        }
        a[] aVarArr = this.f9183a;
        if (aVarArr[i4] == null) {
            aVarArr[i4] = new a();
        }
        this.f9183a[i4].f9193i = i5;
        if (z3) {
            this.f9184b.reset((((Script.FieldBase) this).mElement.getBytesSize() * i4) + 32);
            this.f9184b.addI32(i5);
            FieldPacker fieldPacker = new FieldPacker(4);
            fieldPacker.addI32(i5);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, 8, fieldPacker);
        }
    }

    public synchronized void B(int i4, int i5, boolean z3) {
        if (this.f9184b == null) {
            this.f9184b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        if (this.f9183a == null) {
            this.f9183a = new a[getType().getX()];
        }
        a[] aVarArr = this.f9183a;
        if (aVarArr[i4] == null) {
            aVarArr[i4] = new a();
        }
        this.f9183a[i4].f9192h = i5;
        if (z3) {
            this.f9184b.reset((((Script.FieldBase) this).mElement.getBytesSize() * i4) + 28);
            this.f9184b.addI32(i5);
            FieldPacker fieldPacker = new FieldPacker(4);
            fieldPacker.addI32(i5);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, 7, fieldPacker);
        }
    }

    public synchronized void C(int i4, int i5, boolean z3) {
        if (this.f9184b == null) {
            this.f9184b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        if (this.f9183a == null) {
            this.f9183a = new a[getType().getX()];
        }
        a[] aVarArr = this.f9183a;
        if (aVarArr[i4] == null) {
            aVarArr[i4] = new a();
        }
        this.f9183a[i4].f9190f = i5;
        if (z3) {
            this.f9184b.reset((((Script.FieldBase) this).mElement.getBytesSize() * i4) + 20);
            this.f9184b.addI32(i5);
            FieldPacker fieldPacker = new FieldPacker(4);
            fieldPacker.addI32(i5);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, 5, fieldPacker);
        }
    }

    public synchronized void D(int i4, int i5, boolean z3) {
        if (this.f9184b == null) {
            this.f9184b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        if (this.f9183a == null) {
            this.f9183a = new a[getType().getX()];
        }
        a[] aVarArr = this.f9183a;
        if (aVarArr[i4] == null) {
            aVarArr[i4] = new a();
        }
        this.f9183a[i4].f9191g = i5;
        if (z3) {
            this.f9184b.reset((((Script.FieldBase) this).mElement.getBytesSize() * i4) + 24);
            this.f9184b.addI32(i5);
            FieldPacker fieldPacker = new FieldPacker(4);
            fieldPacker.addI32(i5);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, 6, fieldPacker);
        }
    }

    public synchronized void E(int i4, int i5, boolean z3) {
        if (this.f9184b == null) {
            this.f9184b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        if (this.f9183a == null) {
            this.f9183a = new a[getType().getX()];
        }
        a[] aVarArr = this.f9183a;
        if (aVarArr[i4] == null) {
            aVarArr[i4] = new a();
        }
        this.f9183a[i4].f9189e = i5;
        if (z3) {
            this.f9184b.reset((((Script.FieldBase) this).mElement.getBytesSize() * i4) + 16);
            this.f9184b.addI32(i5);
            FieldPacker fieldPacker = new FieldPacker(4);
            fieldPacker.addI32(i5);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, 4, fieldPacker);
        }
    }

    public synchronized void a() {
        int i4 = 0;
        while (true) {
            a[] aVarArr = this.f9183a;
            if (i4 < aVarArr.length) {
                b(aVarArr[i4], i4);
                i4++;
            } else {
                ((Script.FieldBase) this).mAllocation.setFromFieldPacker(0, this.f9184b);
            }
        }
    }

    public final void b(a aVar, int i4) {
        if (this.f9184b == null) {
            this.f9184b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        this.f9184b.reset(i4 * ((Script.FieldBase) this).mElement.getBytesSize());
        c(aVar, this.f9184b);
    }

    public final void c(a aVar, FieldPacker fieldPacker) {
        fieldPacker.addI32(aVar.f9185a);
        fieldPacker.addI32(aVar.f9186b);
        fieldPacker.addI32(aVar.f9187c);
        fieldPacker.addI32(aVar.f9188d);
        fieldPacker.addI32(aVar.f9189e);
        fieldPacker.addI32(aVar.f9190f);
        fieldPacker.addI32(aVar.f9191g);
        fieldPacker.addI32(aVar.f9192h);
        fieldPacker.addI32(aVar.f9193i);
    }

    public synchronized a k(int i4) {
        a[] aVarArr = this.f9183a;
        if (aVarArr == null) {
            return null;
        }
        return aVarArr[i4];
    }

    public synchronized int l(int i4) {
        a[] aVarArr = this.f9183a;
        if (aVarArr == null) {
            return 0;
        }
        return aVarArr[i4].f9185a;
    }

    public synchronized int m(int i4) {
        a[] aVarArr = this.f9183a;
        if (aVarArr == null) {
            return 0;
        }
        return aVarArr[i4].f9186b;
    }

    public synchronized int n(int i4) {
        a[] aVarArr = this.f9183a;
        if (aVarArr == null) {
            return 0;
        }
        return aVarArr[i4].f9187c;
    }

    public synchronized int o(int i4) {
        a[] aVarArr = this.f9183a;
        if (aVarArr == null) {
            return 0;
        }
        return aVarArr[i4].f9188d;
    }

    public synchronized int p(int i4) {
        a[] aVarArr = this.f9183a;
        if (aVarArr == null) {
            return 0;
        }
        return aVarArr[i4].f9193i;
    }

    public synchronized int q(int i4) {
        a[] aVarArr = this.f9183a;
        if (aVarArr == null) {
            return 0;
        }
        return aVarArr[i4].f9192h;
    }

    public synchronized int r(int i4) {
        a[] aVarArr = this.f9183a;
        if (aVarArr == null) {
            return 0;
        }
        return aVarArr[i4].f9190f;
    }

    public synchronized int s(int i4) {
        a[] aVarArr = this.f9183a;
        if (aVarArr == null) {
            return 0;
        }
        return aVarArr[i4].f9191g;
    }

    public synchronized int t(int i4) {
        a[] aVarArr = this.f9183a;
        if (aVarArr == null) {
            return 0;
        }
        return aVarArr[i4].f9189e;
    }

    public synchronized void u(int i4) {
        a[] aVarArr = this.f9183a;
        if (aVarArr != null) {
            int length = aVarArr.length;
            int iMin = Math.min(length, i4);
            if (i4 == length) {
                return;
            }
            a[] aVarArr2 = new a[i4];
            System.arraycopy(this.f9183a, 0, aVarArr2, 0, iMin);
            this.f9183a = aVarArr2;
        }
        ((Script.FieldBase) this).mAllocation.resize(i4);
        if (this.f9184b != null) {
            this.f9184b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
    }

    public synchronized void v(a aVar, int i4, boolean z3) {
        if (this.f9183a == null) {
            this.f9183a = new a[getType().getX()];
        }
        this.f9183a[i4] = aVar;
        if (z3) {
            b(aVar, i4);
            FieldPacker fieldPacker = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize());
            c(aVar, fieldPacker);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, fieldPacker);
        }
    }

    public synchronized void w(int i4, int i5, boolean z3) {
        if (this.f9184b == null) {
            this.f9184b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        if (this.f9183a == null) {
            this.f9183a = new a[getType().getX()];
        }
        a[] aVarArr = this.f9183a;
        if (aVarArr[i4] == null) {
            aVarArr[i4] = new a();
        }
        this.f9183a[i4].f9185a = i5;
        if (z3) {
            this.f9184b.reset(((Script.FieldBase) this).mElement.getBytesSize() * i4);
            this.f9184b.addI32(i5);
            FieldPacker fieldPacker = new FieldPacker(4);
            fieldPacker.addI32(i5);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, 0, fieldPacker);
        }
    }

    public synchronized void x(int i4, int i5, boolean z3) {
        if (this.f9184b == null) {
            this.f9184b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        if (this.f9183a == null) {
            this.f9183a = new a[getType().getX()];
        }
        a[] aVarArr = this.f9183a;
        if (aVarArr[i4] == null) {
            aVarArr[i4] = new a();
        }
        this.f9183a[i4].f9186b = i5;
        if (z3) {
            this.f9184b.reset((((Script.FieldBase) this).mElement.getBytesSize() * i4) + 4);
            this.f9184b.addI32(i5);
            FieldPacker fieldPacker = new FieldPacker(4);
            fieldPacker.addI32(i5);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, 1, fieldPacker);
        }
    }

    public synchronized void y(int i4, int i5, boolean z3) {
        if (this.f9184b == null) {
            this.f9184b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        if (this.f9183a == null) {
            this.f9183a = new a[getType().getX()];
        }
        a[] aVarArr = this.f9183a;
        if (aVarArr[i4] == null) {
            aVarArr[i4] = new a();
        }
        this.f9183a[i4].f9187c = i5;
        if (z3) {
            this.f9184b.reset((((Script.FieldBase) this).mElement.getBytesSize() * i4) + 8);
            this.f9184b.addI32(i5);
            FieldPacker fieldPacker = new FieldPacker(4);
            fieldPacker.addI32(i5);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, 2, fieldPacker);
        }
    }

    public synchronized void z(int i4, int i5, boolean z3) {
        if (this.f9184b == null) {
            this.f9184b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        if (this.f9183a == null) {
            this.f9183a = new a[getType().getX()];
        }
        a[] aVarArr = this.f9183a;
        if (aVarArr[i4] == null) {
            aVarArr[i4] = new a();
        }
        this.f9183a[i4].f9188d = i5;
        if (z3) {
            this.f9184b.reset((((Script.FieldBase) this).mElement.getBytesSize() * i4) + 12);
            this.f9184b.addI32(i5);
            FieldPacker fieldPacker = new FieldPacker(4);
            fieldPacker.addI32(i5);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, 3, fieldPacker);
        }
    }

    public e0(RenderScript renderScript, int i4) {
        ((Script.FieldBase) this).mElement = i(renderScript);
        init(renderScript, i4);
    }

    public e0(RenderScript renderScript, int i4, int i5) {
        ((Script.FieldBase) this).mElement = i(renderScript);
        init(renderScript, i4, i5);
    }
}
