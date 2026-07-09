package p0;

import androidx.appcompat.widget.ActivityChooserView;
import c.b0;
import c.j0;
import c.k0;
import c.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class j implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Locale[] f10056c = new Locale[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Locale f10057d = new Locale("en", "XA");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Locale f10058e = new Locale("ar", "XB");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Locale f10059f = i.b("en-Latn");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale[] f10060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @j0
    public final String f10061b;

    public j(@j0 Locale... localeArr) {
        String string;
        if (localeArr.length == 0) {
            this.f10060a = f10056c;
            string = s0.a.f11071l;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < localeArr.length; i4++) {
                Locale locale = localeArr[i4];
                if (locale == null) {
                    throw new NullPointerException("list[" + i4 + "] is null");
                }
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    k(sb, locale2);
                    if (i4 < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.f10060a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
            string = sb.toString();
        }
        this.f10061b = string;
    }

    public static String h(Locale locale) {
        String script = locale.getScript();
        return !script.isEmpty() ? script : s0.a.f11071l;
    }

    public static boolean i(Locale locale) {
        return f10057d.equals(locale) || f10058e.equals(locale);
    }

    @b0(from = 0, to = 1)
    public static int j(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || i(locale) || i(locale2)) {
            return 0;
        }
        String strH = h(locale);
        if (!strH.isEmpty()) {
            return strH.equals(h(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
    }

    @z0
    public static void k(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // p0.k
    @k0
    public Object a() {
        return null;
    }

    @Override // p0.k
    public String b() {
        return this.f10061b;
    }

    @Override // p0.k
    public int c(Locale locale) {
        int i4 = 0;
        while (true) {
            Locale[] localeArr = this.f10060a;
            if (i4 >= localeArr.length) {
                return -1;
            }
            if (localeArr[i4].equals(locale)) {
                return i4;
            }
            i4++;
        }
    }

    @Override // p0.k
    public Locale d(@j0 String[] strArr) {
        return e(Arrays.asList(strArr), false);
    }

    public final Locale e(Collection<String> collection, boolean z3) {
        int iF = f(collection, z3);
        if (iF == -1) {
            return null;
        }
        return this.f10060a[iF];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        Locale[] localeArr = ((j) obj).f10060a;
        if (this.f10060a.length != localeArr.length) {
            return false;
        }
        int i4 = 0;
        while (true) {
            Locale[] localeArr2 = this.f10060a;
            if (i4 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i4].equals(localeArr[i4])) {
                return false;
            }
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(java.util.Collection<java.lang.String> r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.f10060a
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L8
            return r3
        L8:
            int r0 = r0.length
            if (r0 != 0) goto Ld
            r5 = -1
            return r5
        Ld:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L1e
            java.util.Locale r6 = p0.j.f10059f
            int r6 = r4.g(r6)
            if (r6 != 0) goto L1b
            return r3
        L1b:
            if (r6 >= r0) goto L1e
            goto L1f
        L1e:
            r6 = r0
        L1f:
            java.util.Iterator r5 = r5.iterator()
        L23:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = p0.i.b(r1)
            int r1 = r4.g(r1)
            if (r1 != 0) goto L3a
            return r3
        L3a:
            if (r1 >= r6) goto L23
            r6 = r1
            goto L23
        L3e:
            if (r6 != r0) goto L41
            return r3
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.j.f(java.util.Collection, boolean):int");
    }

    public final int g(Locale locale) {
        int i4 = 0;
        while (true) {
            Locale[] localeArr = this.f10060a;
            if (i4 >= localeArr.length) {
                return ActivityChooserView.f.f1331h;
            }
            if (j(locale, localeArr[i4]) > 0) {
                return i4;
            }
            i4++;
        }
    }

    @Override // p0.k
    public Locale get(int i4) {
        if (i4 >= 0) {
            Locale[] localeArr = this.f10060a;
            if (i4 < localeArr.length) {
                return localeArr[i4];
            }
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        int i4 = 0;
        while (true) {
            Locale[] localeArr = this.f10060a;
            if (i4 >= localeArr.length) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 31) + localeArr[i4].hashCode();
            i4++;
        }
    }

    @Override // p0.k
    public boolean isEmpty() {
        return this.f10060a.length == 0;
    }

    @Override // p0.k
    public int size() {
        return this.f10060a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i4 = 0;
        while (true) {
            Locale[] localeArr = this.f10060a;
            if (i4 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i4]);
            if (i4 < this.f10060a.length - 1) {
                sb.append(',');
            }
            i4++;
        }
    }
}
