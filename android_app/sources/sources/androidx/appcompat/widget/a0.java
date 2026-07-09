package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.view.menu.j;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public interface a0 {
    void a(Menu menu, j.a aVar);

    boolean b();

    boolean c();

    boolean d();

    boolean e();

    void f();

    boolean g();

    CharSequence getTitle();

    boolean i();

    boolean j();

    void m(SparseArray<Parcelable> sparseArray);

    void n(int i4);

    void o();

    void q(SparseArray<Parcelable> sparseArray);

    void setIcon(int i4);

    void setIcon(Drawable drawable);

    void setLogo(int i4);

    void setUiOptions(int i4);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
