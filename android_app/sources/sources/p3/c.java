package p3;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class c implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f10094e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f10095f = new c("No Tests", new Annotation[0]);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f10096g = new c("Test mechanism", new Annotation[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<c> f10097b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Annotation[] f10099d;

    public c(String str, Annotation... annotationArr) {
        this.f10098c = str;
        this.f10099d = annotationArr;
    }

    public static c c(Class<?> cls) {
        return new c(cls.getName(), cls.getAnnotations());
    }

    public static c d(String str, Annotation... annotationArr) {
        if (str.length() != 0) {
            return new c(str, annotationArr);
        }
        throw new IllegalArgumentException("name must have non-zero length");
    }

    public static c e(Class<?> cls, String str) {
        return f(cls, str, new Annotation[0]);
    }

    public static c f(Class<?> cls, String str, Annotation... annotationArr) {
        return new c(String.format("%s(%s)", str, cls.getName()), annotationArr);
    }

    public void a(c cVar) {
        i().add(cVar);
    }

    public c b() {
        return new c(this.f10098c, this.f10099d);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return k().equals(((c) obj).k());
        }
        return false;
    }

    public <T extends Annotation> T g(Class<T> cls) {
        for (Annotation annotation : this.f10099d) {
            if (annotation.annotationType().equals(cls)) {
                return cls.cast(annotation);
            }
        }
        return null;
    }

    public Collection<Annotation> h() {
        return Arrays.asList(this.f10099d);
    }

    public int hashCode() {
        return k().hashCode();
    }

    public ArrayList<c> i() {
        return this.f10097b;
    }

    public String j() {
        Matcher matcherQ = q();
        return matcherQ.matches() ? matcherQ.group(2) : toString();
    }

    public String k() {
        return this.f10098c;
    }

    public String l() {
        return r();
    }

    public Class<?> m() {
        String strJ = j();
        if (strJ == null) {
            return null;
        }
        try {
            return Class.forName(strJ);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public boolean n() {
        return equals(f10095f);
    }

    public boolean o() {
        return !p();
    }

    public boolean p() {
        return i().isEmpty();
    }

    public final Matcher q() {
        return Pattern.compile("(.*)\\((.*)\\)").matcher(toString());
    }

    public final String r() {
        Matcher matcherQ = q();
        if (matcherQ.matches()) {
            return matcherQ.group(1);
        }
        return null;
    }

    public int s() {
        if (p()) {
            return 1;
        }
        Iterator<c> it = i().iterator();
        int iS = 0;
        while (it.hasNext()) {
            iS += it.next().s();
        }
        return iS;
    }

    public String toString() {
        return k();
    }
}
