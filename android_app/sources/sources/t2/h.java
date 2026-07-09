package t2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Appendable f11506a;

    public h() {
        this(new StringBuilder());
    }

    public static String m(g gVar) {
        return n(gVar);
    }

    public static String n(g gVar) {
        return new h().f(gVar).toString();
    }

    @Override // t2.a
    public void g(char c4) {
        try {
            this.f11506a.append(c4);
        } catch (IOException e4) {
            throw new RuntimeException("Could not write description", e4);
        }
    }

    @Override // t2.a
    public void h(String str) {
        try {
            this.f11506a.append(str);
        } catch (IOException e4) {
            throw new RuntimeException("Could not write description", e4);
        }
    }

    public String toString() {
        return this.f11506a.toString();
    }

    public h(Appendable appendable) {
        this.f11506a = appendable;
    }
}
