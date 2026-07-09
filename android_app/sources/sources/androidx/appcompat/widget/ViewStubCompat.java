package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c.r0;
import e.a;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference<View> f1595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f1596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f1597f;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(@c.j0 Context context, @c.k0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f1593b == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f1596e;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f1593b, viewGroup, false);
        int i4 = this.f1594c;
        if (i4 != -1) {
            viewInflate.setId(i4);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f1595d = new WeakReference<>(viewInflate);
        a aVar = this.f1597f;
        if (aVar != null) {
            aVar.a(this, viewInflate);
        }
        return viewInflate;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1594c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1596e;
    }

    public int getLayoutResource() {
        return this.f1593b;
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i4) {
        this.f1594c = i4;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1596e = layoutInflater;
    }

    public void setLayoutResource(int i4) {
        this.f1593b = i4;
    }

    public void setOnInflateListener(a aVar) {
        this.f1597f = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        WeakReference<View> weakReference = this.f1595d;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i4);
            return;
        }
        super.setVisibility(i4);
        if (i4 == 0 || i4 == 4) {
            a();
        }
    }

    public ViewStubCompat(@c.j0 Context context, @c.k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1593b = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.f8, i4, 0);
        this.f1594c = typedArrayObtainStyledAttributes.getResourceId(a.n.i8, -1);
        this.f1593b = typedArrayObtainStyledAttributes.getResourceId(a.n.h8, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(a.n.g8, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
