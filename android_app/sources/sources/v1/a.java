package v1;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12276c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12277d = -2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataSetObservable f12278a = new DataSetObservable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DataSetObserver f12279b;

    @Deprecated
    public void a(@j0 View view, int i4, @j0 Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void b(@j0 ViewGroup viewGroup, int i4, @j0 Object obj) {
        a(viewGroup, i4, obj);
    }

    @Deprecated
    public void c(@j0 View view) {
    }

    public void d(@j0 ViewGroup viewGroup) {
        c(viewGroup);
    }

    public abstract int e();

    public int f(@j0 Object obj) {
        return -1;
    }

    @k0
    public CharSequence g(int i4) {
        return null;
    }

    public float h(int i4) {
        return 1.0f;
    }

    @j0
    @Deprecated
    public Object i(@j0 View view, int i4) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @j0
    public Object j(@j0 ViewGroup viewGroup, int i4) {
        return i(viewGroup, i4);
    }

    public abstract boolean k(@j0 View view, @j0 Object obj);

    public void l() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f12279b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f12278a.notifyChanged();
    }

    public void m(@j0 DataSetObserver dataSetObserver) {
        this.f12278a.registerObserver(dataSetObserver);
    }

    public void n(@k0 Parcelable parcelable, @k0 ClassLoader classLoader) {
    }

    @k0
    public Parcelable o() {
        return null;
    }

    @Deprecated
    public void p(@j0 View view, int i4, @j0 Object obj) {
    }

    public void q(@j0 ViewGroup viewGroup, int i4, @j0 Object obj) {
        p(viewGroup, i4, obj);
    }

    public void r(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f12279b = dataSetObserver;
        }
    }

    @Deprecated
    public void s(@j0 View view) {
    }

    public void t(@j0 ViewGroup viewGroup) {
        s(viewGroup);
    }

    public void u(@j0 DataSetObserver dataSetObserver) {
        this.f12278a.unregisterObserver(dataSetObserver);
    }
}
