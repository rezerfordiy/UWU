package b0;

import android.content.SharedPreferences;
import c.j0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class j {

    @Deprecated
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static a f4341b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0026a f4342a = new C0026a();

        /* JADX INFO: renamed from: b0.j$a$a, reason: collision with other inner class name */
        public static class C0026a {
            public void a(@j0 SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        @Deprecated
        public static a b() {
            if (f4341b == null) {
                f4341b = new a();
            }
            return f4341b;
        }

        @Deprecated
        public void a(@j0 SharedPreferences.Editor editor) {
            this.f4342a.a(editor);
        }
    }
}
