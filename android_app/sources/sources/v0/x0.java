package v0;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12233b;

    public x0(@c.j0 ViewGroup viewGroup) {
    }

    public int a() {
        return this.f12232a | this.f12233b;
    }

    public void b(@c.j0 View view, @c.j0 View view2, int i4) {
        c(view, view2, i4, 0);
    }

    public void c(@c.j0 View view, @c.j0 View view2, int i4, int i5) {
        if (i5 == 1) {
            this.f12233b = i4;
        } else {
            this.f12232a = i4;
        }
    }

    public void d(@c.j0 View view) {
        e(view, 0);
    }

    public void e(@c.j0 View view, int i4) {
        if (i4 == 1) {
            this.f12233b = 0;
        } else {
            this.f12232a = 0;
        }
    }
}
