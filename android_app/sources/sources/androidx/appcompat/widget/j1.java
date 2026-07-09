package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import c.r0;
import e.a;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class j1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f1758h = "TooltipPopup";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f1760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f1761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f1762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f1763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f1764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f1765g;

    public j1(@c.j0 Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1762d = layoutParams;
        this.f1763e = new Rect();
        this.f1764f = new int[2];
        this.f1765g = new int[2];
        this.f1759a = context;
        View viewInflate = LayoutInflater.from(context).inflate(a.k.B, (ViewGroup) null);
        this.f1760b = viewInflate;
        this.f1761c = (TextView) viewInflate.findViewById(a.h.F0);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = v0.c1.f12010e;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = a.m.f7244e;
        layoutParams.flags = 24;
    }

    public static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    public final void a(View view, int i4, int i5, boolean z3, WindowManager.LayoutParams layoutParams) {
        int height;
        int i6;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1759a.getResources().getDimensionPixelOffset(a.f.f7000m1);
        if (view.getWidth() < dimensionPixelOffset) {
            i4 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1759a.getResources().getDimensionPixelOffset(a.f.f6997l1);
            height = i5 + dimensionPixelOffset2;
            i6 = i5 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i6 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1759a.getResources().getDimensionPixelOffset(z3 ? a.f.f7009p1 : a.f.f7006o1);
        View viewB = b(view);
        if (viewB == null) {
            Log.e(f1758h, "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f1763e);
        Rect rect = this.f1763e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1759a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1763e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f1765g);
        view.getLocationOnScreen(this.f1764f);
        int[] iArr = this.f1764f;
        int i7 = iArr[0];
        int[] iArr2 = this.f1765g;
        int i8 = i7 - iArr2[0];
        iArr[0] = i8;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i8 + i4) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1760b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f1760b.getMeasuredHeight();
        int i9 = this.f1764f[1];
        int i10 = ((i6 + i9) - dimensionPixelOffset3) - measuredHeight;
        int i11 = i9 + height + dimensionPixelOffset3;
        if (!z3 ? measuredHeight + i11 <= this.f1763e.height() : i10 < 0) {
            layoutParams.y = i10;
        } else {
            layoutParams.y = i11;
        }
    }

    public void c() {
        if (d()) {
            ((WindowManager) this.f1759a.getSystemService("window")).removeView(this.f1760b);
        }
    }

    public boolean d() {
        return this.f1760b.getParent() != null;
    }

    public void e(View view, int i4, int i5, boolean z3, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1761c.setText(charSequence);
        a(view, i4, i5, z3, this.f1762d);
        ((WindowManager) this.f1759a.getSystemService("window")).addView(this.f1760b, this.f1762d);
    }
}
