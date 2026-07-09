package s1;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import c.j0;
import c.o0;

/* JADX INFO: loaded from: classes.dex */
public interface b extends Animatable {

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Animatable2.AnimationCallback f11194a;

        /* JADX INFO: renamed from: s1.b$a$a, reason: collision with other inner class name */
        public class C0110a extends Animatable2.AnimationCallback {
            public C0110a() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                a.this.b(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                a.this.c(drawable);
            }
        }

        @o0(23)
        public Animatable2.AnimationCallback a() {
            if (this.f11194a == null) {
                this.f11194a = new C0110a();
            }
            return this.f11194a;
        }

        public void b(Drawable drawable) {
        }

        public void c(Drawable drawable) {
        }
    }

    void a(@j0 a aVar);

    boolean b(@j0 a aVar);

    void c();
}
