package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public interface a1 extends SpinnerAdapter {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f1611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f1612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LayoutInflater f1613c;

        public a(@c.j0 Context context) {
            this.f1611a = context;
            this.f1612b = LayoutInflater.from(context);
        }

        @c.j0
        public LayoutInflater a() {
            LayoutInflater layoutInflater = this.f1613c;
            return layoutInflater != null ? layoutInflater : this.f1612b;
        }

        @c.k0
        public Resources.Theme b() {
            LayoutInflater layoutInflater = this.f1613c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void c(@c.k0 Resources.Theme theme) {
            this.f1613c = theme == null ? null : theme == this.f1611a.getTheme() ? this.f1612b : LayoutInflater.from(new j.d(this.f1611a, theme));
        }
    }

    @c.k0
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@c.k0 Resources.Theme theme);
}
