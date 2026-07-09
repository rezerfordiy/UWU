package g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import c.j0;
import c.k0;
import c.o0;
import c.r0;
import d0.i;
import g.b;
import h.a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class e extends b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f7735s = "StateListDrawable";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f7736t = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a f7737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7738r;

    public static class a extends b.d {
        public int[][] J;

        public a(a aVar, e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[g()][];
            }
        }

        public int D(int[] iArr, Drawable drawable) {
            int iA = a(drawable);
            this.J[iA] = iArr;
            return iA;
        }

        public int E(int[] iArr) {
            int[][] iArr2 = this.J;
            int i4 = i();
            for (int i5 = 0; i5 < i4; i5++) {
                if (StateSet.stateSetMatches(iArr2[i5], iArr)) {
                    return i5;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @j0
        public Drawable newDrawable() {
            return new e(this, null);
        }

        @Override // g.b.d
        public void r(int i4, int i5) {
            super.r(i4, i5);
            int[][] iArr = new int[i5][];
            System.arraycopy(this.J, 0, iArr, 0, i4);
            this.J = iArr;
        }

        @Override // g.b.d
        public void v() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.J[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.J = iArr2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @j0
        public Drawable newDrawable(Resources resources) {
            return new e(this, resources);
        }
    }

    public e() {
        this(null, null);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    @o0(21)
    public void applyTheme(@j0 Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // g.b
    public void b() {
        super.b();
        this.f7738r = false;
    }

    @Override // g.b
    public void i(@j0 b.d dVar) {
        super.i(dVar);
        if (dVar instanceof a) {
            this.f7737q = (a) dVar;
        }
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // g.b, android.graphics.drawable.Drawable
    @j0
    public Drawable mutate() {
        if (!this.f7738r && super.mutate() == this) {
            this.f7737q.v();
            this.f7738r = true;
        }
        return this;
    }

    public void n(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.f7737q.D(iArr, drawable);
            onStateChange(getState());
        }
    }

    @Override // g.b
    public a o() {
        return new a(this.f7737q, this, null);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iE = this.f7737q.E(iArr);
        if (iE < 0) {
            iE = this.f7737q.E(StateSet.WILD_CARD);
        }
        return h(iE) || zOnStateChange;
    }

    public int[] p(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i4 = 0;
        for (int i5 = 0; i5 < attributeCount; i5++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i5);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i6 = i4 + 1;
                if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i4] = attributeNameResource;
                i4 = i6;
            }
        }
        return StateSet.trimStateSet(iArr, i4);
    }

    public int q() {
        return this.f7737q.i();
    }

    public Drawable r(int i4) {
        return this.f7737q.h(i4);
    }

    public int s(int[] iArr) {
        return this.f7737q.E(iArr);
    }

    public a t() {
        return this.f7737q;
    }

    public int[] u(int i4) {
        return this.f7737q.J[i4];
    }

    public void v(@j0 Context context, @j0 Resources resources, @j0 XmlPullParser xmlPullParser, @j0 AttributeSet attributeSet, @k0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayS = i.s(resources, theme, attributeSet, a.j.f7962c0);
        setVisible(typedArrayS.getBoolean(a.j.f7966e0, true), true);
        x(typedArrayS);
        m(resources);
        typedArrayS.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    public final void w(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        a aVar = this.f7737q;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                return;
            }
            if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayS = i.s(resources, theme, attributeSet, a.j.f7976j0);
                int resourceId = typedArrayS.getResourceId(a.j.f7978k0, -1);
                Drawable drawableJ = resourceId > 0 ? androidx.appcompat.widget.r0.h().j(context, resourceId) : null;
                typedArrayS.recycle();
                int[] iArrP = p(attributeSet);
                if (drawableJ == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next != 2) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + g.a.E);
                    }
                    drawableJ = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                }
                aVar.D(iArrP, drawableJ);
            }
        }
    }

    public final void x(TypedArray typedArray) {
        a aVar = this.f7737q;
        aVar.f7694d |= typedArray.getChangingConfigurations();
        aVar.f7699i = typedArray.getBoolean(a.j.f7968f0, aVar.f7699i);
        aVar.f7702l = typedArray.getBoolean(a.j.f7970g0, aVar.f7702l);
        aVar.A = typedArray.getInt(a.j.f7972h0, aVar.A);
        aVar.B = typedArray.getInt(a.j.f7974i0, aVar.B);
        aVar.f7714x = typedArray.getBoolean(a.j.f7964d0, aVar.f7714x);
    }

    public e(@k0 a aVar) {
        if (aVar != null) {
            i(aVar);
        }
    }

    public e(a aVar, Resources resources) {
        i(new a(aVar, this, resources));
        onStateChange(getState());
    }
}
