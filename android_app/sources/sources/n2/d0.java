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
public class d0 extends Script.FieldBase {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WeakReference<Element> f9161c = new WeakReference<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a[] f9162a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FieldPacker f9163b = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public short f9165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public short f9166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9168e;
    }

    public d0(RenderScript renderScript) {
        ((Script.FieldBase) this).mElement = i(renderScript);
    }

    public static d0 d(RenderScript renderScript, int i4) {
        return e(renderScript, i4, 1);
    }

    public static d0 e(RenderScript renderScript, int i4, int i5) {
        d0 d0Var = new d0(renderScript);
        ((Script.FieldBase) d0Var).mAllocation = Allocation.createSized(renderScript, ((Script.FieldBase) d0Var).mElement, i4, i5);
        return d0Var;
    }

    public static d0 f(RenderScript renderScript, int i4, int i5) {
        return g(renderScript, i4, i5, 1);
    }

    public static d0 g(RenderScript renderScript, int i4, int i5, int i6) {
        d0 d0Var = new d0(renderScript);
        Type.Builder builder = new Type.Builder(renderScript, ((Script.FieldBase) d0Var).mElement);
        builder.setX(i4);
        builder.setY(i5);
        ((Script.FieldBase) d0Var).mAllocation = Allocation.createTyped(renderScript, builder.create(), i6);
        return d0Var;
    }

    public static d0 h(RenderScript renderScript, Type.Builder builder, int i4) {
        d0 d0Var = new d0(renderScript);
        Type typeCreate = builder.create();
        if (typeCreate.getElement() != ((Script.FieldBase) d0Var).mElement) {
            throw new RSIllegalArgumentException("Type.Builder did not match expected element type.");
        }
        ((Script.FieldBase) d0Var).mAllocation = Allocation.createTyped(renderScript, typeCreate, i4);
        return d0Var;
    }

    public static Element i(RenderScript renderScript) {
        Element.Builder builder = new Element.Builder(renderScript);
        builder.add(Element.U16(renderScript), "unAlpha");
        builder.add(Element.I16(renderScript), "nLine");
        builder.add(Element.I16(renderScript), "nSample");
        builder.add(Element.U16(renderScript), "unPartLine");
        builder.add(Element.U16(renderScript), "unPartSample");
        return builder.create();
    }

    public static Type.Builder j(RenderScript renderScript) {
        return new Type.Builder(renderScript, i(renderScript));
    }

    public synchronized void a() {
        int i4 = 0;
        while (true) {
            a[] aVarArr = this.f9162a;
            if (i4 < aVarArr.length) {
                b(aVarArr[i4], i4);
                i4++;
            } else {
                ((Script.FieldBase) this).mAllocation.setFromFieldPacker(0, this.f9163b);
            }
        }
    }

    public final void b(a aVar, int i4) {
        if (this.f9163b == null) {
            this.f9163b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        this.f9163b.reset(i4 * ((Script.FieldBase) this).mElement.getBytesSize());
        c(aVar, this.f9163b);
    }

    public final void c(a aVar, FieldPacker fieldPacker) {
        fieldPacker.addU16(aVar.f9164a);
        fieldPacker.addI16(aVar.f9165b);
        fieldPacker.addI16(aVar.f9166c);
        fieldPacker.addU16(aVar.f9167d);
        fieldPacker.addU16(aVar.f9168e);
    }

    public synchronized a k(int i4) {
        a[] aVarArr = this.f9162a;
        if (aVarArr == null) {
            return null;
        }
        return aVarArr[i4];
    }

    public synchronized short l(int i4) {
        a[] aVarArr = this.f9162a;
        if (aVarArr == null) {
            return (short) 0;
        }
        return aVarArr[i4].f9165b;
    }

    public synchronized short m(int i4) {
        a[] aVarArr = this.f9162a;
        if (aVarArr == null) {
            return (short) 0;
        }
        return aVarArr[i4].f9166c;
    }

    public synchronized int n(int i4) {
        a[] aVarArr = this.f9162a;
        if (aVarArr == null) {
            return 0;
        }
        return aVarArr[i4].f9164a;
    }

    public synchronized int o(int i4) {
        a[] aVarArr = this.f9162a;
        if (aVarArr == null) {
            return 0;
        }
        return aVarArr[i4].f9167d;
    }

    public synchronized int p(int i4) {
        a[] aVarArr = this.f9162a;
        if (aVarArr == null) {
            return 0;
        }
        return aVarArr[i4].f9168e;
    }

    public synchronized void q(int i4) {
        a[] aVarArr = this.f9162a;
        if (aVarArr != null) {
            int length = aVarArr.length;
            int iMin = Math.min(length, i4);
            if (i4 == length) {
                return;
            }
            a[] aVarArr2 = new a[i4];
            System.arraycopy(this.f9162a, 0, aVarArr2, 0, iMin);
            this.f9162a = aVarArr2;
        }
        ((Script.FieldBase) this).mAllocation.resize(i4);
        if (this.f9163b != null) {
            this.f9163b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
    }

    public synchronized void r(a aVar, int i4, boolean z3) {
        if (this.f9162a == null) {
            this.f9162a = new a[getType().getX()];
        }
        this.f9162a[i4] = aVar;
        if (z3) {
            b(aVar, i4);
            FieldPacker fieldPacker = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize());
            c(aVar, fieldPacker);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, fieldPacker);
        }
    }

    public synchronized void s(int i4, short s4, boolean z3) {
        if (this.f9163b == null) {
            this.f9163b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        if (this.f9162a == null) {
            this.f9162a = new a[getType().getX()];
        }
        a[] aVarArr = this.f9162a;
        if (aVarArr[i4] == null) {
            aVarArr[i4] = new a();
        }
        this.f9162a[i4].f9165b = s4;
        if (z3) {
            this.f9163b.reset((((Script.FieldBase) this).mElement.getBytesSize() * i4) + 2);
            this.f9163b.addI16(s4);
            FieldPacker fieldPacker = new FieldPacker(2);
            fieldPacker.addI16(s4);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, 1, fieldPacker);
        }
    }

    public synchronized void t(int i4, short s4, boolean z3) {
        if (this.f9163b == null) {
            this.f9163b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        if (this.f9162a == null) {
            this.f9162a = new a[getType().getX()];
        }
        a[] aVarArr = this.f9162a;
        if (aVarArr[i4] == null) {
            aVarArr[i4] = new a();
        }
        this.f9162a[i4].f9166c = s4;
        if (z3) {
            this.f9163b.reset((((Script.FieldBase) this).mElement.getBytesSize() * i4) + 4);
            this.f9163b.addI16(s4);
            FieldPacker fieldPacker = new FieldPacker(2);
            fieldPacker.addI16(s4);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, 2, fieldPacker);
        }
    }

    public synchronized void u(int i4, int i5, boolean z3) {
        if (this.f9163b == null) {
            this.f9163b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        if (this.f9162a == null) {
            this.f9162a = new a[getType().getX()];
        }
        a[] aVarArr = this.f9162a;
        if (aVarArr[i4] == null) {
            aVarArr[i4] = new a();
        }
        this.f9162a[i4].f9164a = i5;
        if (z3) {
            this.f9163b.reset(((Script.FieldBase) this).mElement.getBytesSize() * i4);
            this.f9163b.addU16(i5);
            FieldPacker fieldPacker = new FieldPacker(2);
            fieldPacker.addU16(i5);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, 0, fieldPacker);
        }
    }

    public synchronized void v(int i4, int i5, boolean z3) {
        if (this.f9163b == null) {
            this.f9163b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        if (this.f9162a == null) {
            this.f9162a = new a[getType().getX()];
        }
        a[] aVarArr = this.f9162a;
        if (aVarArr[i4] == null) {
            aVarArr[i4] = new a();
        }
        this.f9162a[i4].f9167d = i5;
        if (z3) {
            this.f9163b.reset((((Script.FieldBase) this).mElement.getBytesSize() * i4) + 6);
            this.f9163b.addU16(i5);
            FieldPacker fieldPacker = new FieldPacker(2);
            fieldPacker.addU16(i5);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, 3, fieldPacker);
        }
    }

    public synchronized void w(int i4, int i5, boolean z3) {
        if (this.f9163b == null) {
            this.f9163b = new FieldPacker(((Script.FieldBase) this).mElement.getBytesSize() * getType().getX());
        }
        if (this.f9162a == null) {
            this.f9162a = new a[getType().getX()];
        }
        a[] aVarArr = this.f9162a;
        if (aVarArr[i4] == null) {
            aVarArr[i4] = new a();
        }
        this.f9162a[i4].f9168e = i5;
        if (z3) {
            this.f9163b.reset((((Script.FieldBase) this).mElement.getBytesSize() * i4) + 8);
            this.f9163b.addU16(i5);
            FieldPacker fieldPacker = new FieldPacker(2);
            fieldPacker.addU16(i5);
            ((Script.FieldBase) this).mAllocation.setFromFieldPacker(i4, 4, fieldPacker);
        }
    }

    public d0(RenderScript renderScript, int i4) {
        ((Script.FieldBase) this).mElement = i(renderScript);
        init(renderScript, i4);
    }

    public d0(RenderScript renderScript, int i4, int i5) {
        ((Script.FieldBase) this).mElement = i(renderScript);
        init(renderScript, i4, i5);
    }
}
