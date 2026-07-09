package s1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import c.j0;
import c.k0;
import c.o0;
import c.s;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s1.b;

/* JADX INFO: loaded from: classes.dex */
public class c extends h implements s1.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f11196j = "AnimatedVDCompat";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f11197k = "animated-vector";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f11198l = "target";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final boolean f11199m = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0111c f11200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f11201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArgbEvaluator f11202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f11203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Animator.AnimatorListener f11204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<b.a> f11205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Drawable.Callback f11206i;

    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
            c.this.scheduleSelf(runnable, j4);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f11205h);
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((b.a) arrayList.get(i4)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f11205h);
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((b.a) arrayList.get(i4)).c(c.this);
            }
        }
    }

    /* JADX INFO: renamed from: s1.c$c, reason: collision with other inner class name */
    public static class C0111c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i f11210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AnimatorSet f11211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList<Animator> f11212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public p.a<Animator, String> f11213e;

        public C0111c(Context context, C0111c c0111c, Drawable.Callback callback, Resources resources) {
            if (c0111c != null) {
                this.f11209a = c0111c.f11209a;
                i iVar = c0111c.f11210b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    this.f11210b = (i) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    i iVar2 = (i) this.f11210b.mutate();
                    this.f11210b = iVar2;
                    iVar2.setCallback(callback);
                    this.f11210b.setBounds(c0111c.f11210b.getBounds());
                    this.f11210b.m(false);
                }
                ArrayList<Animator> arrayList = c0111c.f11212d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f11212d = new ArrayList<>(size);
                    this.f11213e = new p.a<>(size);
                    for (int i4 = 0; i4 < size; i4++) {
                        Animator animator = c0111c.f11212d.get(i4);
                        Animator animatorClone = animator.clone();
                        String str = c0111c.f11213e.get(animator);
                        animatorClone.setTarget(this.f11210b.h(str));
                        this.f11212d.add(animatorClone);
                        this.f11213e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f11211c == null) {
                this.f11211c = new AnimatorSet();
            }
            this.f11211c.playTogether(this.f11212d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11209a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    @o0(24)
    public static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f11214a;

        public d(Drawable.ConstantState constantState) {
            this.f11214a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f11214a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11214a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f11214a.newDrawable();
            cVar.f11231b = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f11206i);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f11214a.newDrawable(resources);
            cVar.f11231b = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f11206i);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f11214a.newDrawable(resources, theme);
            cVar.f11231b = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f11206i);
            return cVar;
        }
    }

    public c() {
        this(null, null, null);
    }

    public static void d(Drawable drawable) {
        if (drawable instanceof Animatable) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
        }
    }

    @k0
    public static c e(@j0 Context context, @s int i4) {
        c cVar = new c(context);
        Drawable drawableD = d0.g.d(context.getResources(), i4, context.getTheme());
        cVar.f11231b = drawableD;
        drawableD.setCallback(cVar.f11206i);
        cVar.f11203f = new d(cVar.f11231b.getConstantState());
        return cVar;
    }

    public static c f(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    public static void g(Drawable drawable, b.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return;
        }
        h((AnimatedVectorDrawable) drawable, aVar);
    }

    @o0(23)
    public static void h(@j0 AnimatedVectorDrawable animatedVectorDrawable, @j0 b.a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.a());
    }

    public static boolean l(Drawable drawable, b.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return m((AnimatedVectorDrawable) drawable, aVar);
    }

    @o0(23)
    public static boolean m(AnimatedVectorDrawable animatedVectorDrawable, b.a aVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.a());
    }

    @Override // s1.b
    public void a(@j0 b.a aVar) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            h((AnimatedVectorDrawable) drawable, aVar);
            return;
        }
        if (aVar == null) {
            return;
        }
        if (this.f11205h == null) {
            this.f11205h = new ArrayList<>();
        }
        if (this.f11205h.contains(aVar)) {
            return;
        }
        this.f11205h.add(aVar);
        if (this.f11204g == null) {
            this.f11204g = new b();
        }
        this.f11200c.f11211c.addListener(this.f11204g);
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            h0.a.a(drawable, theme);
        }
    }

    @Override // s1.b
    public boolean b(@j0 b.a aVar) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            m((AnimatedVectorDrawable) drawable, aVar);
        }
        ArrayList<b.a> arrayList = this.f11205h;
        if (arrayList == null || aVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(aVar);
        if (this.f11205h.size() == 0) {
            i();
        }
        return zRemove;
    }

    @Override // s1.b
    public void c() {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        i();
        ArrayList<b.a> arrayList = this.f11205h;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            return h0.a.b(drawable);
        }
        return false;
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f11200c.f11210b.draw(canvas);
        if (this.f11200c.f11211c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f11231b;
        return drawable != null ? h0.a.d(drawable) : this.f11200c.f11210b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f11231b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f11200c.f11209a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f11231b;
        return drawable != null ? h0.a.e(drawable) : this.f11200c.f11210b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f11231b != null) {
            return new d(this.f11231b.getConstantState());
        }
        return null;
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f11231b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f11200c.f11210b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f11231b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f11200c.f11210b.getIntrinsicWidth();
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f11231b;
        return drawable != null ? drawable.getOpacity() : this.f11200c.f11210b.getOpacity();
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void i() {
        Animator.AnimatorListener animatorListener = this.f11204g;
        if (animatorListener != null) {
            this.f11200c.f11211c.removeListener(animatorListener);
            this.f11204g = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f11231b;
        return drawable != null ? h0.a.h(drawable) : this.f11200c.f11210b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f11231b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f11200c.f11211c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f11231b;
        return drawable != null ? drawable.isStateful() : this.f11200c.f11210b.isStateful();
    }

    public final void j(String str, Animator animator) {
        animator.setTarget(this.f11200c.f11210b.h(str));
        C0111c c0111c = this.f11200c;
        if (c0111c.f11212d == null) {
            c0111c.f11212d = new ArrayList<>();
            this.f11200c.f11213e = new p.a<>();
        }
        this.f11200c.f11212d.add(animator);
        this.f11200c.f11213e.put(animator, str);
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final void k(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i4 = 0; i4 < childAnimations.size(); i4++) {
                k(childAnimations.get(i4));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f11202e == null) {
                    this.f11202e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f11202e);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f11200c.f11210b.setBounds(rect);
        }
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i4) {
        Drawable drawable = this.f11231b;
        return drawable != null ? drawable.setLevel(i4) : this.f11200c.f11210b.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11231b;
        return drawable != null ? drawable.setState(iArr) : this.f11200c.f11210b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else {
            this.f11200c.f11210b.setAlpha(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            h0.a.j(drawable, z3);
        } else {
            this.f11200c.f11210b.setAutoMirrored(z3);
        }
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i4) {
        super.setChangingConfigurations(i4);
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i4, PorterDuff.Mode mode) {
        super.setColorFilter(i4, mode);
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z3) {
        super.setFilterBitmap(z3);
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f4, float f5) {
        super.setHotspot(f4, f5);
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i4, int i5, int i6, int i7) {
        super.setHotspotBounds(i4, i5, i6, i7);
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, h0.m
    public void setTint(int i4) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            h0.a.n(drawable, i4);
        } else {
            this.f11200c.f11210b.setTint(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable, h0.m
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            h0.a.o(drawable, colorStateList);
        } else {
            this.f11200c.f11210b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, h0.m
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            h0.a.p(drawable, mode);
        } else {
            this.f11200c.f11210b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            return drawable.setVisible(z3, z4);
        }
        this.f11200c.f11210b.setVisible(z3, z4);
        return super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f11200c.f11211c.isStarted()) {
                return;
            }
            this.f11200c.f11211c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f11200c.f11211c.end();
        }
    }

    public c(@k0 Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes;
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            h0.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (f11197k.equals(name)) {
                    typedArrayObtainAttributes = d0.i.s(resources, theme, attributeSet, s1.a.M);
                    int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i iVarE = i.e(resources, resourceId, theme);
                        iVarE.m(false);
                        iVarE.setCallback(this.f11206i);
                        i iVar = this.f11200c.f11210b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f11200c.f11210b = iVarE;
                    }
                } else if (f11198l.equals(name)) {
                    typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, s1.a.O);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f11201d;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        j(string, e.j(context, resourceId2));
                    }
                } else {
                    continue;
                }
                typedArrayObtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f11200c.a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11200c.f11210b.setColorFilter(colorFilter);
        }
    }

    public c(@k0 Context context, @k0 C0111c c0111c, @k0 Resources resources) {
        this.f11202e = null;
        this.f11204g = null;
        this.f11205h = null;
        a aVar = new a();
        this.f11206i = aVar;
        this.f11201d = context;
        if (c0111c != null) {
            this.f11200c = c0111c;
        } else {
            this.f11200c = new C0111c(context, c0111c, aVar, resources);
        }
    }
}
