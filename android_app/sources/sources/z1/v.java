package z1;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Integer, a> f13971a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13975d;

        public a(int i4) {
            this.f13973b = 512;
            this.f13972a = i4;
            this.f13974c = 0;
        }

        public int a() {
            return this.f13972a;
        }

        public int b() {
            return this.f13975d;
        }

        public int c() {
            return this.f13973b;
        }

        public int d() {
            return this.f13974c;
        }

        public void e(int i4) {
            this.f13972a = i4;
        }

        public void f(int i4) {
            this.f13975d = i4;
        }

        public void g(int i4) {
            this.f13973b = i4;
        }

        public void h(int i4) {
            this.f13974c = i4;
        }

        public a(int i4, int i5) {
            this.f13973b = 512;
            this.f13972a = i4;
            this.f13974c = i5;
        }

        public a(int i4, int i5, int i6) {
            this.f13973b = i4;
            this.f13972a = i5;
            this.f13974c = i6;
        }
    }

    public v() {
        this.f13971a = new HashMap();
    }

    public void a(int i4, int i5, int i6, int i7) {
        this.f13971a.put(Integer.valueOf(i4), new a(i5, i6, i7));
    }

    public void b(int i4, int i5) {
        this.f13971a.put(Integer.valueOf(i4), new a(i5));
    }

    public void c(int i4, int i5, int i6) {
        this.f13971a.put(Integer.valueOf(i4), new a(i5, i6));
    }

    public void d(int i4, int i5, int i6, int i7) {
        this.f13971a.put(Integer.valueOf(i4), new a(i5, i6, i7));
    }

    public v(int i4, int i5, int i6) {
        HashMap map = new HashMap();
        this.f13971a = map;
        map.put(0, new a(i4, i5, 0));
        this.f13971a.put(1, new a(i4, i5, 0));
        this.f13971a.put(2, new a(i4, i5, i6));
        this.f13971a.put(3, new a(i4, i5, i6));
        this.f13971a.put(4, new a(i4, i5, i6));
    }
}
