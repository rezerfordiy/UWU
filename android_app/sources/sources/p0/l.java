package p0;

import android.os.LocaleList;
import c.j0;
import c.k0;
import c.o0;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@o0(24)
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f10062a;

    public l(LocaleList localeList) {
        this.f10062a = localeList;
    }

    @Override // p0.k
    public Object a() {
        return this.f10062a;
    }

    @Override // p0.k
    public String b() {
        return this.f10062a.toLanguageTags();
    }

    @Override // p0.k
    public int c(Locale locale) {
        return this.f10062a.indexOf(locale);
    }

    @Override // p0.k
    @k0
    public Locale d(@j0 String[] strArr) {
        return this.f10062a.getFirstMatch(strArr);
    }

    public boolean equals(Object obj) {
        return this.f10062a.equals(((k) obj).a());
    }

    @Override // p0.k
    public Locale get(int i4) {
        return this.f10062a.get(i4);
    }

    public int hashCode() {
        return this.f10062a.hashCode();
    }

    @Override // p0.k
    public boolean isEmpty() {
        return this.f10062a.isEmpty();
    }

    @Override // p0.k
    public int size() {
        return this.f10062a.size();
    }

    public String toString() {
        return this.f10062a.toString();
    }
}
