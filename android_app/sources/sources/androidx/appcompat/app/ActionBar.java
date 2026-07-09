package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.v;
import c.j0;
import c.k0;
import c.r0;
import c.s;
import c.u0;
import e.a;
import j.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.dcm4che3.data.Tag;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActionBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f737a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f738b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f739c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f740d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f741e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f742f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f743g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f744h = 16;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f745a;

        public LayoutParams(int i4) {
            this(-2, -1, i4);
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f745a = Tag.ReferencedSurfaceDataSequence;
        }

        public LayoutParams(int i4, int i5, int i6) {
            super(i4, i5);
            this.f745a = i6;
        }

        public LayoutParams(@j0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f745a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.E);
            this.f745a = typedArrayObtainStyledAttributes.getInt(a.n.F, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f745a = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f745a = 0;
            this.f745a = layoutParams.f745a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    public interface c {
        void a(boolean z3);
    }

    @Deprecated
    public interface d {
        boolean a(int i4, long j4);
    }

    @Deprecated
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f746a = -1;

        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract int d();

        public abstract Object e();

        public abstract CharSequence f();

        public abstract void g();

        public abstract e h(@u0 int i4);

        public abstract e i(CharSequence charSequence);

        public abstract e j(int i4);

        public abstract e k(View view);

        public abstract e l(@s int i4);

        public abstract e m(Drawable drawable);

        public abstract e n(f fVar);

        public abstract e o(Object obj);

        public abstract e p(int i4);

        public abstract e q(CharSequence charSequence);
    }

    @Deprecated
    public interface f {
        void a(e eVar, v vVar);

        void b(e eVar, v vVar);

        void c(e eVar, v vVar);
    }

    public Context A() {
        return null;
    }

    public abstract void A0(CharSequence charSequence);

    @k0
    public abstract CharSequence B();

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void B0(CharSequence charSequence) {
    }

    public abstract void C();

    public abstract void C0();

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean D() {
        return false;
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public j.b D0(b.a aVar) {
        return null;
    }

    public boolean E() {
        return false;
    }

    public abstract boolean F();

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean G() {
        return false;
    }

    @Deprecated
    public abstract e H();

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void I(Configuration configuration) {
    }

    public void J() {
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean K(int i4, KeyEvent keyEvent) {
        return false;
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean L(KeyEvent keyEvent) {
        return false;
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean M() {
        return false;
    }

    @Deprecated
    public abstract void N();

    public abstract void O(c cVar);

    @Deprecated
    public abstract void P(e eVar);

    @Deprecated
    public abstract void Q(int i4);

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean R() {
        return false;
    }

    @Deprecated
    public abstract void S(e eVar);

    public abstract void T(@k0 Drawable drawable);

    public abstract void U(int i4);

    public abstract void V(View view);

    public abstract void W(View view, LayoutParams layoutParams);

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void X(boolean z3) {
    }

    public abstract void Y(boolean z3);

    public abstract void Z(int i4);

    public abstract void a0(int i4, int i5);

    public abstract void b0(boolean z3);

    public abstract void c0(boolean z3);

    public abstract void d0(boolean z3);

    public abstract void e0(boolean z3);

    public void f0(float f4) {
        if (f4 != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public abstract void g(c cVar);

    public void g0(int i4) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void h(e eVar);

    public void h0(boolean z3) {
        if (z3) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void i(e eVar, int i4);

    public void i0(@u0 int i4) {
    }

    @Deprecated
    public abstract void j(e eVar, int i4, boolean z3);

    public void j0(@k0 CharSequence charSequence) {
    }

    @Deprecated
    public abstract void k(e eVar, boolean z3);

    public void k0(@s int i4) {
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean l() {
        return false;
    }

    public void l0(@k0 Drawable drawable) {
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean m() {
        return false;
    }

    public void m0(boolean z3) {
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void n(boolean z3) {
    }

    public abstract void n0(@s int i4);

    public abstract View o();

    public abstract void o0(Drawable drawable);

    public abstract int p();

    @Deprecated
    public abstract void p0(SpinnerAdapter spinnerAdapter, d dVar);

    public float q() {
        return 0.0f;
    }

    public abstract void q0(@s int i4);

    public abstract int r();

    public abstract void r0(Drawable drawable);

    public int s() {
        return 0;
    }

    @Deprecated
    public abstract void s0(int i4);

    @Deprecated
    public abstract int t();

    @Deprecated
    public abstract void t0(int i4);

    @Deprecated
    public abstract int u();

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void u0(boolean z3) {
    }

    @Deprecated
    public abstract int v();

    public void v0(Drawable drawable) {
    }

    @k0
    @Deprecated
    public abstract e w();

    public void w0(Drawable drawable) {
    }

    @k0
    public abstract CharSequence x();

    public abstract void x0(int i4);

    @Deprecated
    public abstract e y(int i4);

    public abstract void y0(CharSequence charSequence);

    @Deprecated
    public abstract int z();

    public abstract void z0(@u0 int i4);
}
