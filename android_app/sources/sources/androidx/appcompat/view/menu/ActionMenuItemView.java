package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.h1;
import androidx.appcompat.widget.k0;
import c.r0;
import e.a;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f1052r = "ActionMenuItemView";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f1053s = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f1054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f1055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f1056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e.b f1057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k0 f1058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f1059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1060m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1061n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1062o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1064q;

    public class a extends k0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.k0
        public k.f b() {
            b bVar = ActionMenuItemView.this.f1059l;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.k0
        public boolean c() {
            k.f fVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f1057j;
            return bVar != null && bVar.a(actionMenuItemView.f1054g) && (fVarB = b()) != null && fVarB.c();
        }
    }

    public static abstract class b {
        public abstract k.f a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return h();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void b(boolean z3, char c4) {
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean c() {
        return h() && this.f1054g.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean e() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void f(h hVar, int i4) {
        this.f1054g = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.l(this));
        setId(hVar.getItemId());
        setVisibility(hVar.isVisible() ? 0 : 8);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f1058k == null) {
            this.f1058k = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f1054g;
    }

    public boolean h() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean i() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        return i4 >= 480 || (i4 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void j() {
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f1055h);
        if (this.f1056i != null && (!this.f1054g.E() || (!this.f1060m && !this.f1061n))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        setText(z5 ? this.f1055h : null);
        CharSequence contentDescription = this.f1054g.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z5 ? null : this.f1054g.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f1054g.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            h1.a(this, z5 ? null : this.f1054g.getTitle());
        } else {
            h1.a(this, tooltipText);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f1057j;
        if (bVar != null) {
            bVar.a(this.f1054g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1060m = i();
        j();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        int i6;
        boolean zH = h();
        if (zH && (i6 = this.f1063p) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f1062o) : this.f1062o;
        if (mode != 1073741824 && this.f1062o > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, w.b.f12287g), i5);
        }
        if (zH || this.f1056i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1056i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        k0 k0Var;
        if (this.f1054g.hasSubMenu() && (k0Var = this.f1058k) != null && k0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setCheckable(boolean z3) {
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f1061n != z3) {
            this.f1061n = z3;
            h hVar = this.f1054g;
            if (hVar != null) {
                hVar.e();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setIcon(Drawable drawable) {
        this.f1056i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.f1064q;
            if (intrinsicWidth > i4) {
                intrinsicHeight = (int) (intrinsicHeight * (i4 / intrinsicWidth));
                intrinsicWidth = i4;
            }
            if (intrinsicHeight > i4) {
                intrinsicWidth = (int) (intrinsicWidth * (i4 / intrinsicHeight));
            } else {
                i4 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i4);
        }
        setCompoundDrawables(drawable, null, null, null);
        j();
    }

    public void setItemInvoker(e.b bVar) {
        this.f1057j = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
        this.f1063p = i4;
        super.setPadding(i4, i5, i6, i7);
    }

    public void setPopupCallback(b bVar) {
        this.f1059l = bVar;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setTitle(CharSequence charSequence) {
        this.f1055h = charSequence;
        j();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Resources resources = context.getResources();
        this.f1060m = i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.G, i4, 0);
        this.f1062o = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.n.H, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1064q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1063p = -1;
        setSaveEnabled(false);
    }
}
