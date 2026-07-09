package p;

import c.j0;
import c.k0;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f10029e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f10030f = "ArrayMap";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f10031g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f10032h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f10033i = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @k0
    public static Object[] f10034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f10035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @k0
    public static Object[] f10036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f10037m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f10038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f10039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10040d;

    public i() {
        this.f10038b = e.f9998a;
        this.f10039c = e.f10000c;
        this.f10040d = 0;
    }

    private void a(int i4) {
        if (i4 == 8) {
            synchronized (i.class) {
                Object[] objArr = f10036l;
                if (objArr != null) {
                    this.f10039c = objArr;
                    f10036l = (Object[]) objArr[0];
                    this.f10038b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f10037m--;
                    return;
                }
            }
        } else if (i4 == 4) {
            synchronized (i.class) {
                Object[] objArr2 = f10034j;
                if (objArr2 != null) {
                    this.f10039c = objArr2;
                    f10034j = (Object[]) objArr2[0];
                    this.f10038b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f10035k--;
                    return;
                }
            }
        }
        this.f10038b = new int[i4];
        this.f10039c = new Object[i4 << 1];
    }

    public static int b(int[] iArr, int i4, int i5) {
        try {
            return e.a(iArr, i4, i5);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void d(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (i.class) {
                if (f10037m < 10) {
                    objArr[0] = f10036l;
                    objArr[1] = iArr;
                    for (int i5 = (i4 << 1) - 1; i5 >= 2; i5--) {
                        objArr[i5] = null;
                    }
                    f10036l = objArr;
                    f10037m++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (i.class) {
                if (f10035k < 10) {
                    objArr[0] = f10034j;
                    objArr[1] = iArr;
                    for (int i6 = (i4 << 1) - 1; i6 >= 2; i6--) {
                        objArr[i6] = null;
                    }
                    f10034j = objArr;
                    f10035k++;
                }
            }
        }
    }

    public void c(int i4) {
        int i5 = this.f10040d;
        int[] iArr = this.f10038b;
        if (iArr.length < i4) {
            Object[] objArr = this.f10039c;
            a(i4);
            if (this.f10040d > 0) {
                System.arraycopy(iArr, 0, this.f10038b, 0, i5);
                System.arraycopy(objArr, 0, this.f10039c, 0, i5 << 1);
            }
            d(iArr, objArr, i5);
        }
        if (this.f10040d != i5) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i4 = this.f10040d;
        if (i4 > 0) {
            int[] iArr = this.f10038b;
            Object[] objArr = this.f10039c;
            this.f10038b = e.f9998a;
            this.f10039c = e.f10000c;
            this.f10040d = 0;
            d(iArr, objArr, i4);
        }
        if (this.f10040d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@k0 Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public int e(Object obj, int i4) {
        int i5 = this.f10040d;
        if (i5 == 0) {
            return -1;
        }
        int iB = b(this.f10038b, i5, i4);
        if (iB < 0 || obj.equals(this.f10039c[iB << 1])) {
            return iB;
        }
        int i6 = iB + 1;
        while (i6 < i5 && this.f10038b[i6] == i4) {
            if (obj.equals(this.f10039c[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = iB - 1; i7 >= 0 && this.f10038b[i7] == i4; i7--) {
            if (obj.equals(this.f10039c[i7 << 1])) {
                return i7;
            }
        }
        return ~i6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (size() != iVar.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f10040d; i4++) {
                try {
                    K kI = i(i4);
                    V vM = m(i4);
                    Object obj2 = iVar.get(kI);
                    if (vM == null) {
                        if (obj2 != null || !iVar.containsKey(kI)) {
                            return false;
                        }
                    } else if (!vM.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.f10040d; i5++) {
                try {
                    K kI2 = i(i5);
                    V vM2 = m(i5);
                    Object obj3 = map.get(kI2);
                    if (vM2 == null) {
                        if (obj3 != null || !map.containsKey(kI2)) {
                            return false;
                        }
                    } else if (!vM2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(@k0 Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    public int g() {
        int i4 = this.f10040d;
        if (i4 == 0) {
            return -1;
        }
        int iB = b(this.f10038b, i4, 0);
        if (iB < 0 || this.f10039c[iB << 1] == null) {
            return iB;
        }
        int i5 = iB + 1;
        while (i5 < i4 && this.f10038b[i5] == 0) {
            if (this.f10039c[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = iB - 1; i6 >= 0 && this.f10038b[i6] == 0; i6--) {
            if (this.f10039c[i6 << 1] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    @k0
    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v3) {
        int iF = f(obj);
        return iF >= 0 ? (V) this.f10039c[(iF << 1) + 1] : v3;
    }

    public int h(Object obj) {
        int i4 = this.f10040d * 2;
        Object[] objArr = this.f10039c;
        if (obj == null) {
            for (int i5 = 1; i5 < i4; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i4; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f10038b;
        Object[] objArr = this.f10039c;
        int i4 = this.f10040d;
        int i5 = 1;
        int i6 = 0;
        int iHashCode = 0;
        while (i6 < i4) {
            Object obj = objArr[i5];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i6];
            i6++;
            i5 += 2;
        }
        return iHashCode;
    }

    public K i(int i4) {
        return (K) this.f10039c[i4 << 1];
    }

    public boolean isEmpty() {
        return this.f10040d <= 0;
    }

    public void j(@j0 i<? extends K, ? extends V> iVar) {
        int i4 = iVar.f10040d;
        c(this.f10040d + i4);
        if (this.f10040d != 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                put(iVar.i(i5), iVar.m(i5));
            }
        } else if (i4 > 0) {
            System.arraycopy(iVar.f10038b, 0, this.f10038b, 0, i4);
            System.arraycopy(iVar.f10039c, 0, this.f10039c, 0, i4 << 1);
            this.f10040d = i4;
        }
    }

    public V k(int i4) {
        Object[] objArr = this.f10039c;
        int i5 = i4 << 1;
        V v3 = (V) objArr[i5 + 1];
        int i6 = this.f10040d;
        int i7 = 0;
        if (i6 <= 1) {
            d(this.f10038b, objArr, i6);
            this.f10038b = e.f9998a;
            this.f10039c = e.f10000c;
        } else {
            int i8 = i6 - 1;
            int[] iArr = this.f10038b;
            if (iArr.length <= 8 || i6 >= iArr.length / 3) {
                if (i4 < i8) {
                    int i9 = i4 + 1;
                    int i10 = i8 - i4;
                    System.arraycopy(iArr, i9, iArr, i4, i10);
                    Object[] objArr2 = this.f10039c;
                    System.arraycopy(objArr2, i9 << 1, objArr2, i5, i10 << 1);
                }
                Object[] objArr3 = this.f10039c;
                int i11 = i8 << 1;
                objArr3[i11] = null;
                objArr3[i11 + 1] = null;
            } else {
                a(i6 > 8 ? i6 + (i6 >> 1) : 8);
                if (i6 != this.f10040d) {
                    throw new ConcurrentModificationException();
                }
                if (i4 > 0) {
                    System.arraycopy(iArr, 0, this.f10038b, 0, i4);
                    System.arraycopy(objArr, 0, this.f10039c, 0, i5);
                }
                if (i4 < i8) {
                    int i12 = i4 + 1;
                    int i13 = i8 - i4;
                    System.arraycopy(iArr, i12, this.f10038b, i4, i13);
                    System.arraycopy(objArr, i12 << 1, this.f10039c, i5, i13 << 1);
                }
            }
            i7 = i8;
        }
        if (i6 != this.f10040d) {
            throw new ConcurrentModificationException();
        }
        this.f10040d = i7;
        return v3;
    }

    public V l(int i4, V v3) {
        int i5 = (i4 << 1) + 1;
        Object[] objArr = this.f10039c;
        V v4 = (V) objArr[i5];
        objArr[i5] = v3;
        return v4;
    }

    public V m(int i4) {
        return (V) this.f10039c[(i4 << 1) + 1];
    }

    @k0
    public V put(K k4, V v3) {
        int i4;
        int iE;
        int i5 = this.f10040d;
        if (k4 == null) {
            iE = g();
            i4 = 0;
        } else {
            int iHashCode = k4.hashCode();
            i4 = iHashCode;
            iE = e(k4, iHashCode);
        }
        if (iE >= 0) {
            int i6 = (iE << 1) + 1;
            Object[] objArr = this.f10039c;
            V v4 = (V) objArr[i6];
            objArr[i6] = v3;
            return v4;
        }
        int i7 = ~iE;
        int[] iArr = this.f10038b;
        if (i5 >= iArr.length) {
            int i8 = 8;
            if (i5 >= 8) {
                i8 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i8 = 4;
            }
            Object[] objArr2 = this.f10039c;
            a(i8);
            if (i5 != this.f10040d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f10038b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f10039c, 0, objArr2.length);
            }
            d(iArr, objArr2, i5);
        }
        if (i7 < i5) {
            int[] iArr3 = this.f10038b;
            int i9 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i9, i5 - i7);
            Object[] objArr3 = this.f10039c;
            System.arraycopy(objArr3, i7 << 1, objArr3, i9 << 1, (this.f10040d - i7) << 1);
        }
        int i10 = this.f10040d;
        if (i5 == i10) {
            int[] iArr4 = this.f10038b;
            if (i7 < iArr4.length) {
                iArr4[i7] = i4;
                Object[] objArr4 = this.f10039c;
                int i11 = i7 << 1;
                objArr4[i11] = k4;
                objArr4[i11 + 1] = v3;
                this.f10040d = i10 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @k0
    public V putIfAbsent(K k4, V v3) {
        V v4 = get(k4);
        return v4 == null ? put(k4, v3) : v4;
    }

    @k0
    public V remove(Object obj) {
        int iF = f(obj);
        if (iF >= 0) {
            return k(iF);
        }
        return null;
    }

    @k0
    public V replace(K k4, V v3) {
        int iF = f(k4);
        if (iF >= 0) {
            return l(iF, v3);
        }
        return null;
    }

    public int size() {
        return this.f10040d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10040d * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f10040d; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            K kI = i(i4);
            if (kI != this) {
                sb.append(kI);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vM = m(i4);
            if (vM != this) {
                sb.append(vM);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public i(int i4) {
        if (i4 == 0) {
            this.f10038b = e.f9998a;
            this.f10039c = e.f10000c;
        } else {
            a(i4);
        }
        this.f10040d = 0;
    }

    public boolean remove(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        V vM = m(iF);
        if (obj2 != vM && (obj2 == null || !obj2.equals(vM))) {
            return false;
        }
        k(iF);
        return true;
    }

    public boolean replace(K k4, V v3, V v4) {
        int iF = f(k4);
        if (iF < 0) {
            return false;
        }
        V vM = m(iF);
        if (vM != v3 && (v3 == null || !v3.equals(vM))) {
            return false;
        }
        l(iF, v4);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(i<K, V> iVar) {
        this();
        if (iVar != 0) {
            j(iVar);
        }
    }
}
