package q3;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f10479a = new C0104a();

    /* JADX INFO: renamed from: q3.a$a, reason: collision with other inner class name */
    public static class C0104a extends a {
        @Override // q3.a
        public void a(Object obj) throws q3.c {
        }

        @Override // q3.a
        public String b() {
            return "all tests";
        }

        @Override // q3.a
        public a c(a aVar) {
            return aVar;
        }

        @Override // q3.a
        public boolean e(p3.c cVar) {
            return true;
        }
    }

    public static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p3.c f10480b;

        public b(p3.c cVar) {
            this.f10480b = cVar;
        }

        @Override // q3.a
        public String b() {
            return String.format("Method %s", this.f10480b.k());
        }

        @Override // q3.a
        public boolean e(p3.c cVar) {
            if (cVar.p()) {
                return this.f10480b.equals(cVar);
            }
            Iterator<p3.c> it = cVar.i().iterator();
            while (it.hasNext()) {
                if (e(it.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    public class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f10481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f10482c;

        public c(a aVar, a aVar2) {
            this.f10481b = aVar;
            this.f10482c = aVar2;
        }

        @Override // q3.a
        public String b() {
            return this.f10481b.b() + " and " + this.f10482c.b();
        }

        @Override // q3.a
        public boolean e(p3.c cVar) {
            return this.f10481b.e(cVar) && this.f10482c.e(cVar);
        }
    }

    public static a d(p3.c cVar) {
        return new b(cVar);
    }

    public void a(Object obj) throws q3.c {
        if (obj instanceof q3.b) {
            ((q3.b) obj).e(this);
        }
    }

    public abstract String b();

    public a c(a aVar) {
        return (aVar == this || aVar == f10479a) ? this : new c(this, aVar);
    }

    public abstract boolean e(p3.c cVar);
}
