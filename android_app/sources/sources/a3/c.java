package a3;

import h3.f;
import t2.d;

/* JADX INFO: loaded from: classes.dex */
public class c {

    public static class a extends f<a3.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f517c;

        public a(int i4) {
            this.f517c = i4;
        }

        @Override // t2.g
        public void b(d dVar) {
            dVar.a("has " + this.f517c + " failures");
        }

        @Override // h3.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean f(a3.b bVar) {
            return bVar.a() == this.f517c;
        }
    }

    public static class b extends t2.b<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f518b;

        public b(String str) {
            this.f518b = str;
        }

        @Override // t2.g
        public void b(d dVar) {
            dVar.a("has single failure containing " + this.f518b);
        }

        @Override // t2.f
        public boolean c(Object obj) {
            return obj.toString().contains(this.f518b) && c.a(1).c(obj);
        }
    }

    /* JADX INFO: renamed from: a3.c$c, reason: collision with other inner class name */
    public static class C0005c extends t2.b<a3.b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f519b;

        public C0005c(String str) {
            this.f519b = str;
        }

        @Override // t2.g
        public void b(d dVar) {
            dVar.a("has failure containing " + this.f519b);
        }

        @Override // t2.f
        public boolean c(Object obj) {
            return obj.toString().contains(this.f519b);
        }
    }

    public static t2.f<a3.b> a(int i4) {
        return new a(i4);
    }

    public static t2.f<a3.b> b(String str) {
        return new C0005c(str);
    }

    public static t2.f<Object> c(String str) {
        return new b(str);
    }

    public static t2.f<a3.b> d() {
        return a(0);
    }
}
