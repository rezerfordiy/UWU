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
public class f0 extends Script.FieldBase {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WeakReference<Element> f9242c = new WeakReference<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a[] f9243a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FieldPacker f9244b = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public short f9245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public short f9246b;
    }

    public f0(RenderScript renderScript) {
        ((Script.FieldBase) this).mElement = i(renderScript);
    }

    public static f0 d(RenderScript renderScript, int i4) {
        return e(renderScript, i4, 1);
    }

    public static f0 e(RenderScript renderScript, int i4, int i5) {
        f0 f0Var = new f0(renderScript);
        ((Script.FieldBase) f0Var).mAllocation = Allocation.createSized(renderScript, ((Script.FieldBase) f0Var).mElement, i4, i5);
        return f0Var;
    }

    public static f0 f(RenderScript renderScript, int i4, int i5) {
        return g(renderScript, i4, i5, 1);
    }

    public static f0 g(RenderScript renderScript, int i4, int i5, int i6) {
        f0 f0Var = new f0(renderScript);
        Type.Builder builder = new Type.Builder(renderScript, ((Script.FieldBase) f0Var).mElement);
        builder.setX(i4);
        builder.setY(i5);
        ((Script.FieldBase) f0Var).mAllocation = Allocation.createTyped(renderScript, builder.create(), i6);
        return f0Var;
    }

    public static f0 h(RenderScript renderScript, Type.Builder builder, int i4) {
        f0 f0Var = new f0(renderScript);
        Type typeCreate = builder.create();
        if (typeCreate.getElement() != ((Script.FieldBase) f0Var).mElement) {
            throw new RSIllegalArgumentException("Type.Builder did not match expected element type.");
        }
        ((Script.FieldBase) f0Var).mAllocation = Allocation.createTyped(renderScript, typeCreate, i4);
        return f0Var;
    }

    public static Element i(RenderScript renderScript) {
        Element.Builder builder = new Element.Builder(renderScript);
        builder.add(Element.I16(renderScript), "x");
        builder.add(Element.I16(renderScript), "y");
        return builder.create();
    }

    public static Type.Builder j(RenderScript renderScript) {
        return new Type.Builder(renderScript, i(renderScript));
    }

    public synchronized void a() {
        int i4 = 0;
        while (true) {
            a[] aVarArr = this.f9243a;
            if (i4 < aVarArr.length) {
                b(aVarArr[i4], i4);
                i4++;
            } else {
                ((Script.FieldBase) this).mAllocation.setFromFieldPacker(0, this.f9244b);
            }
        }
    }

    public final void b(a aVar, int i4) {
        if (this.f9244b == null) {
            this.f9244b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        this.f9244b.reset(i4 * ((Script.FieldBase) this).mElement.getBytesSize());
        c(aVar, this.f9244b);
    }

    public final void c(a aVar, FieldPacker fieldPacker) {
        fieldPacker.addI16(aVar.f9245a);
        fieldPacker.addI16(aVar.f9246b);
    }

    public synchronized a k(int i4) {
        a[] aVarArr = this.f9243a;
        if (aVarArr == null) {
            return null;
        }
        return aVarArr[i4];
    }

    public synchronized short l(int i4) {
        a[] aVarArr = this.f9243a;
        if (aVarArr == null) {
            return (short) 0;
        }
        return aVarArr[i4].f9245a;
    }

    public synchronized short m(int i4) {
        a[] aVarArr = this.f9243a;
        if (aVarArr == null) {
            return (short) 0;
        }
        return aVarArr[i4].f9246b;
    }

    public synchronized void n(int i4) {
        a[] aVarArr = this.f9243a;
        if (aVarArr != null) {
            int length = aVarArr.length;
            int iMin = Math.min(length, i4);
            if (i4 == length) {
                return;
            }
            a[] aVarArr2 = new a[i4];
            System.arraycopy(this.f9243a, 0, aVarArr2, 0, iMin);
            this.f9243a = aVarArr2;
        }
        ((Script.FieldBase) this).mAllocation.resize(i4);
        if (this.f9244b != null) {
            this.f9244b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
    }

    public synchronized void o(a aVar, int i4, boolean z3) {
        if (this.f9243a == null) {
            this.f9243a = new a[getType().getX()];
        }
        this.f9243a[i4] = aVar;
        if (z3) {
            b(aVar, i4);
            FieldPacker fieldPacker = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize());
            c(aVar, fieldPacker);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, fieldPacker);
        }
    }

    public synchronized void p(int i4, short s4, boolean z3) {
        if (this.f9244b == null) {
            this.f9244b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        if (this.f9243a == null) {
            this.f9243a = new a[getType().getX()];
        }
        a[] aVarArr = this.f9243a;
        if (aVarArr[i4] == null) {
            aVarArr[i4] = new a();
        }
        this.f9243a[i4].f9245a = s4;
        if (z3) {
            this.f9244b.reset(((Script.FieldBase) this).mElement.getBytesSize() * i4);
            this.f9244b.addI16(s4);
            FieldPacker fieldPacker = new FieldPacker(2);
            fieldPacker.addI16(s4);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, 0, fieldPacker);
        }
    }

    public synchronized void q(int i4, short s4, boolean z3) {
        if (this.f9244b == null) {
            this.f9244b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        if (this.f9243a == null) {
            this.f9243a = new a[getType().getX()];
        }
        a[] aVarArr = this.f9243a;
        if (aVarArr[i4] == null) {
            aVarArr[i4] = new a();
        }
        this.f9243a[i4].f9246b = s4;
        if (z3) {
            this.f9244b.reset((((Script.FieldBase) this).mElement.getBytesSize() * i4) + 2);
            this.f9244b.addI16(s4);
            FieldPacker fieldPacker = new FieldPacker(2);
            fieldPacker.addI16(s4);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, 1, fieldPacker);
        }
    }

    public f0(RenderScript renderScript, int i4) {
        ((Script.FieldBase) this).mElement = i(renderScript);
        init(renderScript, i4);
    }

    public f0(RenderScript renderScript, int i4, int i5) {
        ((Script.FieldBase) this).mElement = i(renderScript);
        init(renderScript, i4, i5);
    }
}
