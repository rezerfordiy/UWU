package q0;

import android.graphics.Typeface;
import android.os.Handler;
import c.j0;
import q0.e;
import q0.f;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @j0
    public final f.d f10216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @j0
    public final Handler f10217b;

    /* JADX INFO: renamed from: q0.a$a, reason: collision with other inner class name */
    public class RunnableC0100a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f.d f10218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Typeface f10219c;

        public RunnableC0100a(f.d dVar, Typeface typeface) {
            this.f10218b = dVar;
            this.f10219c = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10218b.b(this.f10219c);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f.d f10221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f10222c;

        public b(f.d dVar, int i4) {
            this.f10221b = dVar;
            this.f10222c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10221b.a(this.f10222c);
        }
    }

    public a(@j0 f.d dVar) {
        this.f10216a = dVar;
        this.f10217b = q0.b.a();
    }

    public final void a(int i4) {
        this.f10217b.post(new b(this.f10216a, i4));
    }

    public void b(@j0 e.C0101e c0101e) {
        if (c0101e.a()) {
            c(c0101e.f10245a);
        } else {
            a(c0101e.f10246b);
        }
    }

    public final void c(@j0 Typeface typeface) {
        this.f10217b.post(new RunnableC0100a(this.f10216a, typeface));
    }

    public a(@j0 f.d dVar, @j0 Handler handler) {
        this.f10216a = dVar;
        this.f10217b = handler;
    }
}
