package u2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class c<T> extends t2.b<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f11716e = Pattern.compile("%([0-9]+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t2.f<T> f11718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f11719d;

    public c(String str, t2.f<T> fVar, Object[] objArr) {
        this.f11717b = str;
        this.f11718c = fVar;
        this.f11719d = (Object[]) objArr.clone();
    }

    @t2.e
    public static <T> t2.f<T> d(String str, t2.f<T> fVar, Object... objArr) {
        return new c(str, fVar, objArr);
    }

    @Override // t2.g
    public void b(t2.d dVar) {
        Matcher matcher = f11716e.matcher(this.f11717b);
        int iEnd = 0;
        while (matcher.find()) {
            dVar.a(this.f11717b.substring(iEnd, matcher.start()));
            dVar.c(this.f11719d[Integer.parseInt(matcher.group(1))]);
            iEnd = matcher.end();
        }
        if (iEnd < this.f11717b.length()) {
            dVar.a(this.f11717b.substring(iEnd));
        }
    }

    @Override // t2.f
    public boolean c(Object obj) {
        return this.f11718c.c(obj);
    }
}
