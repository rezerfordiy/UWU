package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c.r0;
import e.a;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f1224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f1225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f1226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f1228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f1229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1232k;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1227f;
        if (drawable != null && drawable.isStateful()) {
            this.f1227f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1228g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1228g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1229h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1229h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1224c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1227f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1228g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1229h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1225d = findViewById(a.h.H);
        this.f1226e = findViewById(a.h.P);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1223b || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v9 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:32:0x009d, B:34:0x00a1, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f1224c
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L13
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L13
            r1 = r9
            goto L14
        L13:
            r1 = r0
        L14:
            if (r5 == 0) goto L33
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L33
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L33:
            boolean r6 = r4.f1230i
            if (r6 == 0) goto L4a
            android.graphics.drawable.Drawable r5 = r4.f1229h
            if (r5 == 0) goto L48
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto Lb6
        L48:
            r9 = r0
            goto Lb6
        L4a:
            android.graphics.drawable.Drawable r6 = r4.f1227f
            if (r6 == 0) goto L9b
            android.view.View r6 = r4.f1225d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L74
            android.graphics.drawable.Drawable r6 = r4.f1227f
            android.view.View r7 = r4.f1225d
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f1225d
            int r8 = r8.getTop()
            android.view.View r0 = r4.f1225d
            int r0 = r0.getRight()
            android.view.View r2 = r4.f1225d
        L6c:
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L9a
        L74:
            android.view.View r6 = r4.f1226e
            if (r6 == 0) goto L95
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L95
            android.graphics.drawable.Drawable r6 = r4.f1227f
            android.view.View r7 = r4.f1226e
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f1226e
            int r8 = r8.getTop()
            android.view.View r0 = r4.f1226e
            int r0 = r0.getRight()
            android.view.View r2 = r4.f1226e
            goto L6c
        L95:
            android.graphics.drawable.Drawable r6 = r4.f1227f
            r6.setBounds(r0, r0, r0, r0)
        L9a:
            r0 = r9
        L9b:
            r4.f1231j = r1
            if (r1 == 0) goto L48
            android.graphics.drawable.Drawable r6 = r4.f1228g
            if (r6 == 0) goto L48
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        Lb6:
            if (r9 == 0) goto Lbb
            r4.invalidate()
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1225d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f1232k
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f1225d
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f1224c
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f1225d
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f1225d
        L42:
            int r0 = r3.a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f1226e
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f1226e
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f1224c
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1227f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1227f);
        }
        this.f1227f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1225d;
            if (view != null) {
                this.f1227f.setBounds(view.getLeft(), this.f1225d.getTop(), this.f1225d.getRight(), this.f1225d.getBottom());
            }
        }
        boolean z3 = true;
        if (!this.f1230i ? this.f1227f != null || this.f1228g != null : this.f1229h != null) {
            z3 = false;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1229h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1229h);
        }
        this.f1229h = drawable;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1230i && (drawable2 = this.f1229h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1230i ? !(this.f1227f != null || this.f1228g != null) : this.f1229h == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1228g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1228g);
        }
        this.f1228g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1231j && (drawable2 = this.f1228g) != null) {
                drawable2.setBounds(this.f1224c.getLeft(), this.f1224c.getTop(), this.f1224c.getRight(), this.f1224c.getBottom());
            }
        }
        boolean z3 = true;
        if (!this.f1230i ? this.f1227f != null || this.f1228g != null : this.f1229h != null) {
            z3 = false;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(u0 u0Var) {
        View view = this.f1224c;
        if (view != null) {
            removeView(view);
        }
        this.f1224c = u0Var;
        if (u0Var != null) {
            addView(u0Var);
            ViewGroup.LayoutParams layoutParams = u0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            u0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z3) {
        this.f1223b = z3;
        setDescendantFocusability(z3 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z3 = i4 == 0;
        Drawable drawable = this.f1227f;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f1228g;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f1229h;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1227f && !this.f1230i) || (drawable == this.f1228g && this.f1231j) || ((drawable == this.f1229h && this.f1230i) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z1.G1(this, new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.f7348a);
        this.f1227f = typedArrayObtainStyledAttributes.getDrawable(a.n.f7353b);
        this.f1228g = typedArrayObtainStyledAttributes.getDrawable(a.n.f7363d);
        this.f1232k = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.n.f7418o, -1);
        boolean z3 = true;
        if (getId() == a.h.f7120m1) {
            this.f1230i = true;
            this.f1229h = typedArrayObtainStyledAttributes.getDrawable(a.n.f7358c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f1230i ? this.f1227f != null || this.f1228g != null : this.f1229h != null) {
            z3 = false;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }
}
