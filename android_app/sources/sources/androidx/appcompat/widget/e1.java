package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import c.r0;
import d0.g;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypedArray f1671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f1672c;

    public e1(Context context, TypedArray typedArray) {
        this.f1670a = context;
        this.f1671b = typedArray;
    }

    public static e1 E(Context context, int i4, int[] iArr) {
        return new e1(context, context.obtainStyledAttributes(i4, iArr));
    }

    public static e1 F(Context context, AttributeSet attributeSet, int[] iArr) {
        return new e1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static e1 G(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5) {
        return new e1(context, context.obtainStyledAttributes(attributeSet, iArr, i4, i5));
    }

    public boolean A(int i4, TypedValue typedValue) {
        return this.f1671b.getValue(i4, typedValue);
    }

    public TypedArray B() {
        return this.f1671b;
    }

    public boolean C(int i4) {
        return this.f1671b.hasValue(i4);
    }

    public int D() {
        return this.f1671b.length();
    }

    public TypedValue H(int i4) {
        return this.f1671b.peekValue(i4);
    }

    public void I() {
        this.f1671b.recycle();
    }

    public boolean a(int i4, boolean z3) {
        return this.f1671b.getBoolean(i4, z3);
    }

    @c.o0(21)
    public int b() {
        return this.f1671b.getChangingConfigurations();
    }

    public int c(int i4, int i5) {
        return this.f1671b.getColor(i4, i5);
    }

    public ColorStateList d(int i4) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!this.f1671b.hasValue(i4) || (resourceId = this.f1671b.getResourceId(i4, 0)) == 0 || (colorStateListC = f.a.c(this.f1670a, resourceId)) == null) ? this.f1671b.getColorStateList(i4) : colorStateListC;
    }

    public float e(int i4, float f4) {
        return this.f1671b.getDimension(i4, f4);
    }

    public int f(int i4, int i5) {
        return this.f1671b.getDimensionPixelOffset(i4, i5);
    }

    public int g(int i4, int i5) {
        return this.f1671b.getDimensionPixelSize(i4, i5);
    }

    public Drawable h(int i4) {
        int resourceId;
        return (!this.f1671b.hasValue(i4) || (resourceId = this.f1671b.getResourceId(i4, 0)) == 0) ? this.f1671b.getDrawable(i4) : f.a.d(this.f1670a, resourceId);
    }

    public Drawable i(int i4) {
        int resourceId;
        if (!this.f1671b.hasValue(i4) || (resourceId = this.f1671b.getResourceId(i4, 0)) == 0) {
            return null;
        }
        return f.b().d(this.f1670a, resourceId, true);
    }

    public float j(int i4, float f4) {
        return this.f1671b.getFloat(i4, f4);
    }

    @c.k0
    public Typeface k(@c.w0 int i4, int i5, @c.k0 g.a aVar) {
        int resourceId = this.f1671b.getResourceId(i4, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1672c == null) {
            this.f1672c = new TypedValue();
        }
        return d0.g.h(this.f1670a, resourceId, this.f1672c, i5, aVar);
    }

    public float l(int i4, int i5, int i6, float f4) {
        return this.f1671b.getFraction(i4, i5, i6, f4);
    }

    public int m(int i4) {
        return this.f1671b.getIndex(i4);
    }

    public int n() {
        return this.f1671b.getIndexCount();
    }

    public int o(int i4, int i5) {
        return this.f1671b.getInt(i4, i5);
    }

    public int p(int i4, int i5) {
        return this.f1671b.getInteger(i4, i5);
    }

    public int q(int i4, int i5) {
        return this.f1671b.getLayoutDimension(i4, i5);
    }

    public int r(int i4, String str) {
        return this.f1671b.getLayoutDimension(i4, str);
    }

    public String s(int i4) {
        return this.f1671b.getNonResourceString(i4);
    }

    public String t() {
        return this.f1671b.getPositionDescription();
    }

    public int u(int i4, int i5) {
        return this.f1671b.getResourceId(i4, i5);
    }

    public Resources v() {
        return this.f1671b.getResources();
    }

    public String w(int i4) {
        return this.f1671b.getString(i4);
    }

    public CharSequence x(int i4) {
        return this.f1671b.getText(i4);
    }

    public CharSequence[] y(int i4) {
        return this.f1671b.getTextArray(i4);
    }

    public int z(int i4) {
        return this.f1671b.getType(i4);
    }
}
