package p;

import c.j0;
import c.k0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f9975f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f9976g = "ArraySet";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f9977h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object[] f9978i = new Object[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f9979j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f9980k = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @k0
    public static Object[] f9981l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f9982m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @k0
    public static Object[] f9983n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f9984o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f9985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f9986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h<E, E> f9988e;

    public class a extends h<E, E> {
        public a() {
        }

        @Override // p.h
        public void a() {
            b.this.clear();
        }

        @Override // p.h
        public Object b(int i4, int i5) {
            return b.this.f9986c[i4];
        }

        @Override // p.h
        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p.h
        public int d() {
            return b.this.f9987d;
        }

        @Override // p.h
        public int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // p.h
        public int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // p.h
        public void g(E e4, E e5) {
            b.this.add(e4);
        }

        @Override // p.h
        public void h(int i4) {
            b.this.i(i4);
        }

        @Override // p.h
        public E i(int i4, E e4) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public static void d(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f9984o < 10) {
                    objArr[0] = f9983n;
                    objArr[1] = iArr;
                    for (int i5 = i4 - 1; i5 >= 2; i5--) {
                        objArr[i5] = null;
                    }
                    f9983n = objArr;
                    f9984o++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                if (f9982m < 10) {
                    objArr[0] = f9981l;
                    objArr[1] = iArr;
                    for (int i6 = i4 - 1; i6 >= 2; i6--) {
                        objArr[i6] = null;
                    }
                    f9981l = objArr;
                    f9982m++;
                }
            }
        }
    }

    public void a(@j0 b<? extends E> bVar) {
        int i4 = bVar.f9987d;
        c(this.f9987d + i4);
        if (this.f9987d != 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                add(bVar.j(i5));
            }
        } else if (i4 > 0) {
            System.arraycopy(bVar.f9985b, 0, this.f9985b, 0, i4);
            System.arraycopy(bVar.f9986c, 0, this.f9986c, 0, i4);
            this.f9987d = i4;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@k0 E e4) {
        int i4;
        int iF;
        if (e4 == null) {
            iF = g();
            i4 = 0;
        } else {
            int iHashCode = e4.hashCode();
            i4 = iHashCode;
            iF = f(e4, iHashCode);
        }
        if (iF >= 0) {
            return false;
        }
        int i5 = ~iF;
        int i6 = this.f9987d;
        int[] iArr = this.f9985b;
        if (i6 >= iArr.length) {
            int i7 = 8;
            if (i6 >= 8) {
                i7 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.f9986c;
            b(i7);
            int[] iArr2 = this.f9985b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f9986c, 0, objArr.length);
            }
            d(iArr, objArr, this.f9987d);
        }
        int i8 = this.f9987d;
        if (i5 < i8) {
            int[] iArr3 = this.f9985b;
            int i9 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i9, i8 - i5);
            Object[] objArr2 = this.f9986c;
            System.arraycopy(objArr2, i5, objArr2, i9, this.f9987d - i5);
        }
        this.f9985b[i5] = i4;
        this.f9986c[i5] = e4;
        this.f9987d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@j0 Collection<? extends E> collection) {
        c(this.f9987d + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void b(int i4) {
        if (i4 == 8) {
            synchronized (b.class) {
                Object[] objArr = f9983n;
                if (objArr != null) {
                    this.f9986c = objArr;
                    f9983n = (Object[]) objArr[0];
                    this.f9985b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f9984o--;
                    return;
                }
            }
        } else if (i4 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f9981l;
                if (objArr2 != null) {
                    this.f9986c = objArr2;
                    f9981l = (Object[]) objArr2[0];
                    this.f9985b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f9982m--;
                    return;
                }
            }
        }
        this.f9985b = new int[i4];
        this.f9986c = new Object[i4];
    }

    public void c(int i4) {
        int[] iArr = this.f9985b;
        if (iArr.length < i4) {
            Object[] objArr = this.f9986c;
            b(i4);
            int i5 = this.f9987d;
            if (i5 > 0) {
                System.arraycopy(iArr, 0, this.f9985b, 0, i5);
                System.arraycopy(objArr, 0, this.f9986c, 0, this.f9987d);
            }
            d(iArr, objArr, this.f9987d);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i4 = this.f9987d;
        if (i4 != 0) {
            d(this.f9985b, this.f9986c, i4);
            this.f9985b = f9977h;
            this.f9986c = f9978i;
            this.f9987d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(@k0 Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@j0 Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final h<E, E> e() {
        if (this.f9988e == null) {
            this.f9988e = new a();
        }
        return this.f9988e;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f9987d; i4++) {
                try {
                    if (!set.contains(j(i4))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj, int i4) {
        int i5 = this.f9987d;
        if (i5 == 0) {
            return -1;
        }
        int iA = e.a(this.f9985b, i5, i4);
        if (iA < 0 || obj.equals(this.f9986c[iA])) {
            return iA;
        }
        int i6 = iA + 1;
        while (i6 < i5 && this.f9985b[i6] == i4) {
            if (obj.equals(this.f9986c[i6])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = iA - 1; i7 >= 0 && this.f9985b[i7] == i4; i7--) {
            if (obj.equals(this.f9986c[i7])) {
                return i7;
            }
        }
        return ~i6;
    }

    public final int g() {
        int i4 = this.f9987d;
        if (i4 == 0) {
            return -1;
        }
        int iA = e.a(this.f9985b, i4, 0);
        if (iA < 0 || this.f9986c[iA] == null) {
            return iA;
        }
        int i5 = iA + 1;
        while (i5 < i4 && this.f9985b[i5] == 0) {
            if (this.f9986c[i5] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = iA - 1; i6 >= 0 && this.f9985b[i6] == 0; i6--) {
            if (this.f9986c[i6] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    public boolean h(@j0 b<? extends E> bVar) {
        int i4 = bVar.f9987d;
        int i5 = this.f9987d;
        for (int i6 = 0; i6 < i4; i6++) {
            remove(bVar.j(i6));
        }
        return i5 != this.f9987d;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f9985b;
        int i4 = this.f9987d;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    public E i(int i4) {
        Object[] objArr = this.f9986c;
        E e4 = (E) objArr[i4];
        int i5 = this.f9987d;
        if (i5 <= 1) {
            d(this.f9985b, objArr, i5);
            this.f9985b = f9977h;
            this.f9986c = f9978i;
            this.f9987d = 0;
        } else {
            int[] iArr = this.f9985b;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                int i6 = i5 - 1;
                this.f9987d = i6;
                if (i4 < i6) {
                    int i7 = i4 + 1;
                    System.arraycopy(iArr, i7, iArr, i4, i6 - i4);
                    Object[] objArr2 = this.f9986c;
                    System.arraycopy(objArr2, i7, objArr2, i4, this.f9987d - i4);
                }
                this.f9986c[this.f9987d] = null;
            } else {
                b(i5 > 8 ? i5 + (i5 >> 1) : 8);
                this.f9987d--;
                if (i4 > 0) {
                    System.arraycopy(iArr, 0, this.f9985b, 0, i4);
                    System.arraycopy(objArr, 0, this.f9986c, 0, i4);
                }
                int i8 = this.f9987d;
                if (i4 < i8) {
                    int i9 = i4 + 1;
                    System.arraycopy(iArr, i9, this.f9985b, i4, i8 - i4);
                    System.arraycopy(objArr, i9, this.f9986c, i4, this.f9987d - i4);
                }
            }
        }
        return e4;
    }

    public int indexOf(@k0 Object obj) {
        return obj == null ? g() : f(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f9987d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return e().m().iterator();
    }

    @k0
    public E j(int i4) {
        return (E) this.f9986c[i4];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(@k0 Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        i(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@j0 Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@j0 Collection<?> collection) {
        boolean z3 = false;
        for (int i4 = this.f9987d - 1; i4 >= 0; i4--) {
            if (!collection.contains(this.f9986c[i4])) {
                i(i4);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f9987d;
    }

    @Override // java.util.Collection, java.util.Set
    @j0
    public Object[] toArray() {
        int i4 = this.f9987d;
        Object[] objArr = new Object[i4];
        System.arraycopy(this.f9986c, 0, objArr, 0, i4);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9987d * 14);
        sb.append('{');
        for (int i4 = 0; i4 < this.f9987d; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            E eJ = j(i4);
            if (eJ != this) {
                sb.append(eJ);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public b(int i4) {
        if (i4 == 0) {
            this.f9985b = f9977h;
            this.f9986c = f9978i;
        } else {
            b(i4);
        }
        this.f9987d = 0;
    }

    @Override // java.util.Collection, java.util.Set
    @j0
    public <T> T[] toArray(@j0 T[] tArr) {
        if (tArr.length < this.f9987d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f9987d));
        }
        System.arraycopy(this.f9986c, 0, tArr, 0, this.f9987d);
        int length = tArr.length;
        int i4 = this.f9987d;
        if (length > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k0 Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k0 b<E> bVar) {
        this();
        if (bVar != 0) {
            a(bVar);
        }
    }
}
