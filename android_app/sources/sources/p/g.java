package p;

import c.j0;
import c.k0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<K, V> f10006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10013h;

    public g(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f10008c = i4;
        this.f10006a = new LinkedHashMap<>(0, 0.75f, true);
    }

    @k0
    public V a(@j0 K k4) {
        return null;
    }

    public final synchronized int b() {
        return this.f10010e;
    }

    public void c(boolean z3, @j0 K k4, @j0 V v3, @k0 V v4) {
    }

    public final void d() {
        r(-1);
    }

    public final synchronized int e() {
        return this.f10011f;
    }

    @k0
    public final V f(@j0 K k4) {
        V vPut;
        if (k4 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v3 = this.f10006a.get(k4);
            if (v3 != null) {
                this.f10012g++;
                return v3;
            }
            this.f10013h++;
            V vA = a(k4);
            if (vA == null) {
                return null;
            }
            synchronized (this) {
                this.f10010e++;
                vPut = this.f10006a.put(k4, vA);
                if (vPut != null) {
                    this.f10006a.put(k4, vPut);
                } else {
                    this.f10007b += n(k4, vA);
                }
            }
            if (vPut != null) {
                c(false, k4, vA, vPut);
                return vPut;
            }
            r(this.f10008c);
            return vA;
        }
    }

    public final synchronized int g() {
        return this.f10012g;
    }

    public final synchronized int h() {
        return this.f10008c;
    }

    public final synchronized int i() {
        return this.f10013h;
    }

    @k0
    public final V j(@j0 K k4, @j0 V v3) {
        V vPut;
        if (k4 == null || v3 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f10009d++;
            this.f10007b += n(k4, v3);
            vPut = this.f10006a.put(k4, v3);
            if (vPut != null) {
                this.f10007b -= n(k4, vPut);
            }
        }
        if (vPut != null) {
            c(false, k4, vPut, v3);
        }
        r(this.f10008c);
        return vPut;
    }

    public final synchronized int k() {
        return this.f10009d;
    }

    @k0
    public final V l(@j0 K k4) {
        V vRemove;
        if (k4 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            vRemove = this.f10006a.remove(k4);
            if (vRemove != null) {
                this.f10007b -= n(k4, vRemove);
            }
        }
        if (vRemove != null) {
            c(false, k4, vRemove, null);
        }
        return vRemove;
    }

    public void m(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.f10008c = i4;
        }
        r(i4);
    }

    public final int n(K k4, V v3) {
        int iP = p(k4, v3);
        if (iP >= 0) {
            return iP;
        }
        throw new IllegalStateException("Negative size: " + k4 + "=" + v3);
    }

    public final synchronized int o() {
        return this.f10007b;
    }

    public int p(@j0 K k4, @j0 V v3) {
        return 1;
    }

    public final synchronized Map<K, V> q() {
        return new LinkedHashMap(this.f10006a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f10007b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f10006a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f10007b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f10007b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f10006a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f10006a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f10006a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f10007b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.n(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f10007b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f10011f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f10011f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.c(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g.r(int):void");
    }

    public final synchronized String toString() {
        int i4;
        int i5;
        i4 = this.f10012g;
        i5 = this.f10013h + i4;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f10008c), Integer.valueOf(this.f10012g), Integer.valueOf(this.f10013h), Integer.valueOf(i5 != 0 ? (i4 * 100) / i5 : 0));
    }
}
