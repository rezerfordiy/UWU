package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.e1;
import c.r0;
import e.a;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f1069s = "ListMenuItemView";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f1070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f1071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RadioButton f1072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f1073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CheckBox f1074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f1075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f1076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f1077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f1078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f1079k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Context f1081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f1083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LayoutInflater f1085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1086r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f6812f2);
    }

    private LayoutInflater getInflater() {
        if (this.f1085q == null) {
            this.f1085q = LayoutInflater.from(getContext());
        }
        return this.f1085q;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        ImageView imageView = this.f1076h;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
        }
    }

    public final void a(View view) {
        c(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1077i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1077i.getLayoutParams();
        rect.top += this.f1077i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void b(boolean z3, char c4) {
        int i4 = (z3 && this.f1070b.D()) ? 0 : 8;
        if (i4 == 0) {
            this.f1075g.setText(this.f1070b.k());
        }
        if (this.f1075g.getVisibility() != i4) {
            this.f1075g.setVisibility(i4);
        }
    }

    public final void c(View view, int i4) {
        LinearLayout linearLayout = this.f1078j;
        if (linearLayout != null) {
            linearLayout.addView(view, i4);
        } else {
            addView(view, i4);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean e() {
        return this.f1086r;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void f(h hVar, int i4) {
        this.f1070b = hVar;
        setVisibility(hVar.isVisible() ? 0 : 8);
        setTitle(hVar.l(this));
        setCheckable(hVar.isCheckable());
        b(hVar.D(), hVar.j());
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.getContentDescription());
    }

    public final void g() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(a.k.f7186o, (ViewGroup) this, false);
        this.f1074f = checkBox;
        a(checkBox);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f1070b;
    }

    public final void h() {
        ImageView imageView = (ImageView) getInflater().inflate(a.k.f7187p, (ViewGroup) this, false);
        this.f1071c = imageView;
        c(imageView, 0);
    }

    public final void i() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(a.k.f7189r, (ViewGroup) this, false);
        this.f1072d = radioButton;
        a(radioButton);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        z1.G1(this, this.f1079k);
        TextView textView = (TextView) findViewById(a.h.L1);
        this.f1073e = textView;
        int i4 = this.f1080l;
        if (i4 != -1) {
            textView.setTextAppearance(this.f1081m, i4);
        }
        this.f1075g = (TextView) findViewById(a.h.f7111j1);
        ImageView imageView = (ImageView) findViewById(a.h.f7132q1);
        this.f1076h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1083o);
        }
        this.f1077i = (ImageView) findViewById(a.h.f7143u0);
        this.f1078j = (LinearLayout) findViewById(a.h.f7107i0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        if (this.f1071c != null && this.f1082n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1071c.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i4, i5);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f1072d == null && this.f1074f == null) {
            return;
        }
        if (this.f1070b.p()) {
            if (this.f1072d == null) {
                i();
            }
            compoundButton = this.f1072d;
            view = this.f1074f;
        } else {
            if (this.f1074f == null) {
                g();
            }
            compoundButton = this.f1074f;
            view = this.f1072d;
        }
        if (z3) {
            compoundButton.setChecked(this.f1070b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f1074f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f1072d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if (this.f1070b.p()) {
            if (this.f1072d == null) {
                i();
            }
            compoundButton = this.f1072d;
        } else {
            if (this.f1074f == null) {
                g();
            }
            compoundButton = this.f1074f;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f1086r = z3;
        this.f1082n = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        ImageView imageView = this.f1077i;
        if (imageView != null) {
            imageView.setVisibility((this.f1084p || !z3) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setIcon(Drawable drawable) {
        boolean z3 = this.f1070b.C() || this.f1086r;
        if (z3 || this.f1082n) {
            ImageView imageView = this.f1071c;
            if (imageView == null && drawable == null && !this.f1082n) {
                return;
            }
            if (imageView == null) {
                h();
            }
            if (drawable == null && !this.f1082n) {
                this.f1071c.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f1071c;
            if (!z3) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f1071c.getVisibility() != 0) {
                this.f1071c.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setTitle(CharSequence charSequence) {
        int i4;
        TextView textView;
        if (charSequence != null) {
            this.f1073e.setText(charSequence);
            if (this.f1073e.getVisibility() == 0) {
                return;
            }
            textView = this.f1073e;
            i4 = 0;
        } else {
            i4 = 8;
            if (this.f1073e.getVisibility() == 8) {
                return;
            } else {
                textView = this.f1073e;
            }
        }
        textView.setVisibility(i4);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        e1 e1VarG = e1.G(getContext(), attributeSet, a.n.K5, i4, 0);
        this.f1079k = e1VarG.h(a.n.Q5);
        this.f1080l = e1VarG.u(a.n.M5, -1);
        this.f1082n = e1VarG.a(a.n.S5, false);
        this.f1081m = context;
        this.f1083o = e1VarG.h(a.n.T5);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, a.c.f6851n1, 0);
        this.f1084p = typedArrayObtainStyledAttributes.hasValue(0);
        e1VarG.I();
        typedArrayObtainStyledAttributes.recycle();
    }
}
