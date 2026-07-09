package y0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import c.j0;
import c.k0;
import c.o0;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f12821a;

    @o0(25)
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @j0
        public final InputContentInfo f12822a;

        public a(@j0 Uri uri, @j0 ClipDescription clipDescription, @k0 Uri uri2) {
            this.f12822a = new InputContentInfo(uri, clipDescription, uri2);
        }

        @Override // y0.j.c
        @j0
        public ClipDescription a() {
            return this.f12822a.getDescription();
        }

        @Override // y0.j.c
        public void b() {
            this.f12822a.requestPermission();
        }

        @Override // y0.j.c
        public void c() {
            this.f12822a.releasePermission();
        }

        @Override // y0.j.c
        @k0
        public Uri d() {
            return this.f12822a.getLinkUri();
        }

        @Override // y0.j.c
        @k0
        public Object e() {
            return this.f12822a;
        }

        @Override // y0.j.c
        @j0
        public Uri f() {
            return this.f12822a.getContentUri();
        }

        public a(@j0 Object obj) {
            this.f12822a = (InputContentInfo) obj;
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @j0
        public final Uri f12823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @j0
        public final ClipDescription f12824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @k0
        public final Uri f12825c;

        public b(@j0 Uri uri, @j0 ClipDescription clipDescription, @k0 Uri uri2) {
            this.f12823a = uri;
            this.f12824b = clipDescription;
            this.f12825c = uri2;
        }

        @Override // y0.j.c
        @j0
        public ClipDescription a() {
            return this.f12824b;
        }

        @Override // y0.j.c
        public void b() {
        }

        @Override // y0.j.c
        public void c() {
        }

        @Override // y0.j.c
        @k0
        public Uri d() {
            return this.f12825c;
        }

        @Override // y0.j.c
        @k0
        public Object e() {
            return null;
        }

        @Override // y0.j.c
        @j0
        public Uri f() {
            return this.f12823a;
        }
    }

    public interface c {
        @j0
        ClipDescription a();

        void b();

        void c();

        @k0
        Uri d();

        @k0
        Object e();

        @j0
        Uri f();
    }

    public j(@j0 Uri uri, @j0 ClipDescription clipDescription, @k0 Uri uri2) {
        this.f12821a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    @k0
    public static j g(@k0 Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new j(new a(obj));
        }
        return null;
    }

    @j0
    public Uri a() {
        return this.f12821a.f();
    }

    @j0
    public ClipDescription b() {
        return this.f12821a.a();
    }

    @k0
    public Uri c() {
        return this.f12821a.d();
    }

    public void d() {
        this.f12821a.c();
    }

    public void e() {
        this.f12821a.b();
    }

    @k0
    public Object f() {
        return this.f12821a.e();
    }

    public j(@j0 c cVar) {
        this.f12821a = cVar;
    }
}
