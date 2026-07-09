package w0;

import android.os.Bundle;
import android.view.View;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
public interface l0 {

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bundle f12501a;

        @r0({r0.a.LIBRARY_GROUP_PREFIX})
        public void a(Bundle bundle) {
            this.f12501a = bundle;
        }
    }

    public static final class b extends a {
        public boolean b() {
            return this.f12501a.getBoolean(e0.Q);
        }

        public int c() {
            return this.f12501a.getInt(e0.O);
        }
    }

    public static final class c extends a {
        public String b() {
            return this.f12501a.getString(e0.P);
        }
    }

    public static final class d extends a {
        public int b() {
            return this.f12501a.getInt(e0.X);
        }

        public int c() {
            return this.f12501a.getInt(e0.Y);
        }
    }

    public static final class e extends a {
        public int b() {
            return this.f12501a.getInt(e0.V);
        }

        public int c() {
            return this.f12501a.getInt(e0.U);
        }
    }

    public static final class f extends a {
        public float b() {
            return this.f12501a.getFloat(e0.W);
        }
    }

    public static final class g extends a {
        public int b() {
            return this.f12501a.getInt(e0.S);
        }

        public int c() {
            return this.f12501a.getInt(e0.R);
        }
    }

    public static final class h extends a {
        public CharSequence b() {
            return this.f12501a.getCharSequence(e0.T);
        }
    }

    boolean a(@c.j0 View view, @c.k0 a aVar);
}
