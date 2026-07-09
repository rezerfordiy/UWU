package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import c.r0;
import v0.s2;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public interface b0 {
    void A(boolean z3);

    void B(Drawable drawable);

    int C();

    boolean D();

    Context E();

    int F();

    int G();

    void H(View view);

    void I(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener);

    void J(SparseArray<Parcelable> sparseArray);

    void K(int i4);

    s2 L(int i4, long j4);

    void M(int i4);

    void N();

    boolean O();

    int P();

    boolean Q();

    void R();

    void S(Drawable drawable);

    void T(boolean z3);

    void U(int i4);

    CharSequence V();

    void W(int i4);

    void a(Menu menu, j.a aVar);

    boolean b();

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    void f();

    boolean g();

    CharSequence getTitle();

    void h(Drawable drawable);

    boolean i();

    boolean j();

    void k(int i4);

    void l();

    void m(CharSequence charSequence);

    void n(j.a aVar, e.a aVar2);

    void o(CharSequence charSequence);

    View p();

    int q();

    void r(int i4);

    int s();

    void setIcon(int i4);

    void setIcon(Drawable drawable);

    void setLogo(int i4);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(Drawable drawable);

    void u(SparseArray<Parcelable> sparseArray);

    void v(int i4);

    Menu w();

    void x(u0 u0Var);

    ViewGroup y();

    void z(int i4);
}
