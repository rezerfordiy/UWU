package u0;

import c.j0;

/* JADX INFO: loaded from: classes.dex */
public class f<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f11560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f11561b;

    public f(F f4, S s4) {
        this.f11560a = f4;
        this.f11561b = s4;
    }

    @j0
    public static <A, B> f<A, B> a(A a4, B b4) {
        return new f<>(a4, b4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return e.a(fVar.f11560a, this.f11560a) && e.a(fVar.f11561b, this.f11561b);
    }

    public int hashCode() {
        F f4 = this.f11560a;
        int iHashCode = f4 == null ? 0 : f4.hashCode();
        S s4 = this.f11561b;
        return iHashCode ^ (s4 != null ? s4.hashCode() : 0);
    }

    @j0
    public String toString() {
        return "Pair{" + this.f11560a + " " + this.f11561b + "}";
    }
}
