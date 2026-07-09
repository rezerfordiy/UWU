package g;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import androidx.appcompat.widget.r0;
import c.j0;
import c.k0;
import c.o0;
import c.s;
import d0.i;
import g.b;
import g.e;
import h.a;
import h0.m;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.j;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public class a extends g.e implements m {
    public static final String A = "transition";
    public static final String B = "item";
    public static final String C = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    public static final String D = ": <transition> tag requires 'fromId' & 'toId' attributes";
    public static final String E = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f7661z = "a";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f7662u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g f7663v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7665x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7666y;

    public static class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animatable f7667a;

        public b(Animatable animatable) {
            super();
            this.f7667a = animatable;
        }

        @Override // g.a.g
        public void c() {
            this.f7667a.start();
        }

        @Override // g.a.g
        public void d() {
            this.f7667a.stop();
        }
    }

    public static class c extends e.a {
        public static final long M = 4294967296L;
        public static final long N = 8589934592L;
        public p.f<Long> K;
        public j<Integer> L;

        public c(@k0 c cVar, @j0 a aVar, @k0 Resources resources) {
            j<Integer> jVar;
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                jVar = cVar.L;
            } else {
                this.K = new p.f<>();
                jVar = new j<>();
            }
            this.L = jVar;
        }

        public static long H(int i4, int i5) {
            return ((long) i5) | (((long) i4) << 32);
        }

        public int F(@j0 int[] iArr, @j0 Drawable drawable, int i4) {
            int iD = super.D(iArr, drawable);
            this.L.n(iD, Integer.valueOf(i4));
            return iD;
        }

        public int G(int i4, int i5, @j0 Drawable drawable, boolean z3) {
            int iA = super.a(drawable);
            long jH = H(i4, i5);
            long j4 = z3 ? N : 0L;
            long j5 = iA;
            this.K.a(jH, Long.valueOf(j5 | j4));
            if (z3) {
                this.K.a(H(i5, i4), Long.valueOf(M | j5 | j4));
            }
            return iA;
        }

        public int I(int i4) {
            if (i4 < 0) {
                return 0;
            }
            return this.L.i(i4, 0).intValue();
        }

        public int J(@j0 int[] iArr) {
            int iE = super.E(iArr);
            return iE >= 0 ? iE : super.E(StateSet.WILD_CARD);
        }

        public int K(int i4, int i5) {
            return (int) this.K.i(H(i4, i5), -1L).longValue();
        }

        public boolean L(int i4, int i5) {
            return (this.K.i(H(i4, i5), -1L).longValue() & M) != 0;
        }

        public boolean M(int i4, int i5) {
            return (this.K.i(H(i4, i5), -1L).longValue() & N) != 0;
        }

        @Override // g.e.a, android.graphics.drawable.Drawable.ConstantState
        @j0
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // g.e.a, g.b.d
        public void v() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // g.e.a, android.graphics.drawable.Drawable.ConstantState
        @j0
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    public static class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s1.c f7668a;

        public d(s1.c cVar) {
            super();
            this.f7668a = cVar;
        }

        @Override // g.a.g
        public void c() {
            this.f7668a.start();
        }

        @Override // g.a.g
        public void d() {
            this.f7668a.stop();
        }
    }

    public static class e extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ObjectAnimator f7669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7670b;

        public e(AnimationDrawable animationDrawable, boolean z3, boolean z4) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i4 = z3 ? numberOfFrames - 1 : 0;
            int i5 = z3 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z3);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i4, i5);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(fVar.a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f7670b = z4;
            this.f7669a = objectAnimatorOfInt;
        }

        @Override // g.a.g
        public boolean a() {
            return this.f7670b;
        }

        @Override // g.a.g
        public void b() {
            this.f7669a.reverse();
        }

        @Override // g.a.g
        public void c() {
            this.f7669a.start();
        }

        @Override // g.a.g
        public void d() {
            this.f7669a.cancel();
        }
    }

    public static class f implements TimeInterpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f7671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7673c;

        public f(AnimationDrawable animationDrawable, boolean z3) {
            b(animationDrawable, z3);
        }

        public int a() {
            return this.f7673c;
        }

        public int b(AnimationDrawable animationDrawable, boolean z3) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f7672b = numberOfFrames;
            int[] iArr = this.f7671a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f7671a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f7671a;
            int i4 = 0;
            for (int i5 = 0; i5 < numberOfFrames; i5++) {
                int duration = animationDrawable.getDuration(z3 ? (numberOfFrames - i5) - 1 : i5);
                iArr2[i5] = duration;
                i4 += duration;
            }
            this.f7673c = i4;
            return i4;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            int i4 = (int) ((f4 * this.f7673c) + 0.5f);
            int i5 = this.f7672b;
            int[] iArr = this.f7671a;
            int i6 = 0;
            while (i6 < i5) {
                int i7 = iArr[i6];
                if (i4 < i7) {
                    break;
                }
                i4 -= i7;
                i6++;
            }
            return (i6 / i5) + (i6 < i5 ? i4 / this.f7673c : 0.0f);
        }
    }

    public static abstract class g {
        public g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    @k0
    public static a B(@j0 Context context, @s int i4, @k0 Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i4);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return C(context, resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e4) {
            Log.e(f7661z, "parser error", e4);
            return null;
        }
    }

    public static a C(@j0 Context context, @j0 Resources resources, @j0 XmlPullParser xmlPullParser, @j0 AttributeSet attributeSet, @k0 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.v(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void w(@j0 Context context, @j0 Resources resources, @j0 XmlPullParser xmlPullParser, @j0 AttributeSet attributeSet, @k0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    E(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals(A)) {
                    F(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void x(TypedArray typedArray) {
        c cVar = this.f7662u;
        cVar.f7694d |= typedArray.getChangingConfigurations();
        cVar.B(typedArray.getBoolean(a.j.f7963d, cVar.f7699i));
        cVar.x(typedArray.getBoolean(a.j.f7965e, cVar.f7702l));
        cVar.y(typedArray.getInt(a.j.f7967f, cVar.A));
        cVar.z(typedArray.getInt(a.j.f7969g, cVar.B));
        setDither(typedArray.getBoolean(a.j.f7959b, cVar.f7714x));
    }

    @Override // g.e
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c o() {
        return new c(this.f7662u, this, null);
    }

    public final void D() {
        onStateChange(getState());
    }

    public final int E(@j0 Context context, @j0 Resources resources, @j0 XmlPullParser xmlPullParser, @j0 AttributeSet attributeSet, @k0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayS = i.s(resources, theme, attributeSet, a.j.f7971h);
        int resourceId = typedArrayS.getResourceId(a.j.f7973i, 0);
        int resourceId2 = typedArrayS.getResourceId(a.j.f7975j, -1);
        Drawable drawableJ = resourceId2 > 0 ? r0.h().j(context, resourceId2) : null;
        typedArrayS.recycle();
        int[] iArrP = p(attributeSet);
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + E);
            }
            drawableJ = xmlPullParser.getName().equals(s1.i.f11237q) ? s1.i.f(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ != null) {
            return this.f7662u.F(iArrP, drawableJ, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + E);
    }

    public final int F(@j0 Context context, @j0 Resources resources, @j0 XmlPullParser xmlPullParser, @j0 AttributeSet attributeSet, @k0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayS = i.s(resources, theme, attributeSet, a.j.f7977k);
        int resourceId = typedArrayS.getResourceId(a.j.f7981n, -1);
        int resourceId2 = typedArrayS.getResourceId(a.j.f7980m, -1);
        int resourceId3 = typedArrayS.getResourceId(a.j.f7979l, -1);
        Drawable drawableJ = resourceId3 > 0 ? r0.h().j(context, resourceId3) : null;
        boolean z3 = typedArrayS.getBoolean(a.j.f7982o, false);
        typedArrayS.recycle();
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + C);
            }
            drawableJ = xmlPullParser.getName().equals(s1.c.f11197k) ? s1.c.f(context, resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + C);
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f7662u.G(resourceId, resourceId2, drawableJ, z3);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + D);
    }

    public final boolean G(int i4) {
        int iD;
        int iK;
        g bVar;
        g gVar = this.f7663v;
        if (gVar == null) {
            iD = d();
        } else {
            if (i4 == this.f7664w) {
                return true;
            }
            if (i4 == this.f7665x && gVar.a()) {
                gVar.b();
                this.f7664w = this.f7665x;
                this.f7665x = i4;
                return true;
            }
            iD = this.f7664w;
            gVar.d();
        }
        this.f7663v = null;
        this.f7665x = -1;
        this.f7664w = -1;
        c cVar = this.f7662u;
        int I = cVar.I(iD);
        int I2 = cVar.I(i4);
        if (I2 == 0 || I == 0 || (iK = cVar.K(I, I2)) < 0) {
            return false;
        }
        boolean zM = cVar.M(I, I2);
        h(iK);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.L(I, I2), zM);
        } else {
            if (!(current instanceof s1.c)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((s1.c) current);
        }
        bVar.c();
        this.f7663v = bVar;
        this.f7665x = iD;
        this.f7664w = i4;
        return true;
    }

    @Override // g.e, g.b, android.graphics.drawable.Drawable
    @o0(21)
    public /* bridge */ /* synthetic */ void applyTheme(@j0 Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // g.e, g.b
    public void b() {
        super.b();
        this.f7666y = false;
    }

    @Override // g.b, android.graphics.drawable.Drawable
    @o0(21)
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(@j0 Canvas canvas) {
        super.draw(canvas);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    @j0
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(@j0 Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    @o0(21)
    public /* bridge */ /* synthetic */ void getOutline(@j0 Outline outline) {
        super.getOutline(outline);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(@j0 Rect rect) {
        return super.getPadding(rect);
    }

    @Override // g.e, g.b
    public void i(@j0 b.d dVar) {
        super.i(dVar);
        if (dVar instanceof c) {
            this.f7662u = (c) dVar;
        }
    }

    @Override // g.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(@j0 Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // g.e, g.b, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f7663v;
        if (gVar != null) {
            gVar.d();
            this.f7663v = null;
            h(this.f7664w);
            this.f7664w = -1;
            this.f7665x = -1;
        }
    }

    @Override // g.b
    public /* bridge */ /* synthetic */ void k(int i4) {
        super.k(i4);
    }

    @Override // g.b
    public /* bridge */ /* synthetic */ void l(int i4) {
        super.l(i4);
    }

    @Override // g.e, g.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f7666y && super.mutate() == this) {
            this.f7662u.v();
            this.f7666y = true;
        }
        return this;
    }

    @Override // g.e
    public /* bridge */ /* synthetic */ void n(int[] iArr, Drawable drawable) {
        super.n(iArr, drawable);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i4) {
        return super.onLayoutDirectionChanged(i4);
    }

    @Override // g.e, g.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int iJ = this.f7662u.J(iArr);
        boolean z3 = iJ != d() && (G(iJ) || h(iJ));
        Drawable current = getCurrent();
        return current != null ? z3 | current.setState(iArr) : z3;
    }

    @Override // g.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(@j0 Drawable drawable, @j0 Runnable runnable, long j4) {
        super.scheduleDrawable(drawable, runnable, j4);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i4) {
        super.setAlpha(i4);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z3) {
        super.setAutoMirrored(z3);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z3) {
        super.setDither(z3);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f4, float f5) {
        super.setHotspot(f4, f5);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i4, int i5, int i6, int i7) {
        super.setHotspotBounds(i4, i5, i6, i7);
    }

    @Override // g.b, android.graphics.drawable.Drawable, h0.m
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // g.b, android.graphics.drawable.Drawable, h0.m
    public /* bridge */ /* synthetic */ void setTintMode(@j0 PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        g gVar = this.f7663v;
        if (gVar != null && (visible || z4)) {
            if (z3) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // g.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(@j0 Drawable drawable, @j0 Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    @Override // g.e
    public void v(@j0 Context context, @j0 Resources resources, @j0 XmlPullParser xmlPullParser, @j0 AttributeSet attributeSet, @k0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayS = i.s(resources, theme, attributeSet, a.j.f7957a);
        setVisible(typedArrayS.getBoolean(a.j.f7961c, true), true);
        x(typedArrayS);
        m(resources);
        typedArrayS.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        D();
    }

    public void y(@j0 int[] iArr, @j0 Drawable drawable, int i4) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable must not be null");
        }
        this.f7662u.F(iArr, drawable, i4);
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void z(int i4, int i5, @j0 T t4, boolean z3) {
        if (t4 == null) {
            throw new IllegalArgumentException("Transition drawable must not be null");
        }
        this.f7662u.G(i4, i5, t4, z3);
    }

    public a(@k0 c cVar, @k0 Resources resources) {
        super(null);
        this.f7664w = -1;
        this.f7665x = -1;
        i(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
