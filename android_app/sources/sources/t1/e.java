package t1;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import c.j0;
import c.o0;
import c.r0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public abstract class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f11467d = "VersionedParcel";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f11468e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f11469f = -2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f11470g = -3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f11471h = -4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f11472i = -5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f11473j = -6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f11474k = -7;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f11475l = -9;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f11476m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f11477n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f11478o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f11479p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f11480q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f11481r = 7;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f11482s = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.a<String, Method> f11483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p.a<String, Method> f11484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p.a<String, Class> f11485c;

    public class a extends ObjectInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    public static class b extends RuntimeException {
        public b(Throwable th) {
            super(th);
        }
    }

    public e(p.a<String, Method> aVar, p.a<String, Method> aVar2, p.a<String, Class> aVar3) {
        this.f11483a = aVar;
        this.f11484b = aVar2;
        this.f11485c = aVar3;
    }

    @j0
    public static Throwable f(@j0 Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public double[] A() {
        int iL = L();
        if (iL < 0) {
            return null;
        }
        double[] dArr = new double[iL];
        for (int i4 = 0; i4 < iL; i4++) {
            dArr[i4] = y();
        }
        return dArr;
    }

    public final <T> void A0(Collection<T> collection) {
        if (collection == null) {
            L0(-1);
        }
        int size = collection.size();
        L0(size);
        if (size > 0) {
            int iG = g(collection.iterator().next());
            L0(iG);
            switch (iG) {
                case 1:
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        l1((h) it.next());
                    }
                    break;
                case 2:
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        W0((Parcelable) it2.next());
                    }
                    break;
                case 3:
                    Iterator<T> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        Y0((Serializable) it3.next());
                    }
                    break;
                case 4:
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        e1((String) it4.next());
                    }
                    break;
                case 5:
                    Iterator<T> it5 = collection.iterator();
                    while (it5.hasNext()) {
                        g1((IBinder) it5.next());
                    }
                    break;
                case 7:
                    Iterator<T> it6 = collection.iterator();
                    while (it6.hasNext()) {
                        L0(((Integer) it6.next()).intValue());
                    }
                    break;
                case 8:
                    Iterator<T> it7 = collection.iterator();
                    while (it7.hasNext()) {
                        H0(((Float) it7.next()).floatValue());
                    }
                    break;
            }
        }
    }

    public double[] B(double[] dArr, int i4) {
        return !F(i4) ? dArr : A();
    }

    public final <T> void B0(Collection<T> collection, int i4) {
        i0(i4);
        A0(collection);
    }

    public final Exception C(int i4, String str) {
        return b(i4, str);
    }

    public abstract void C0(double d4);

    public Exception D(Exception exc, int i4) {
        int iE;
        return (F(i4) && (iE = E()) != 0) ? C(iE, c0()) : exc;
    }

    public void D0(double d4, int i4) {
        i0(i4);
        C0(d4);
    }

    public final int E() {
        return L();
    }

    public void E0(double[] dArr) {
        if (dArr == null) {
            L0(-1);
            return;
        }
        L0(dArr.length);
        for (double d4 : dArr) {
            C0(d4);
        }
    }

    public abstract boolean F(int i4);

    public void F0(double[] dArr, int i4) {
        i0(i4);
        E0(dArr);
    }

    public abstract float G();

    /* JADX WARN: Multi-variable type inference failed */
    public void G0(Exception exc, int i4) {
        i0(i4);
        if (exc == 0) {
            V0();
            return;
        }
        int i5 = ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) ? -9 : exc instanceof SecurityException ? -1 : exc instanceof BadParcelableException ? -2 : exc instanceof IllegalArgumentException ? -3 : exc instanceof NullPointerException ? -4 : exc instanceof IllegalStateException ? -5 : exc instanceof NetworkOnMainThreadException ? -6 : exc instanceof UnsupportedOperationException ? -7 : 0;
        L0(i5);
        if (i5 == 0) {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
        e1(exc.getMessage());
        if (i5 != -9) {
            return;
        }
        W0((Parcelable) exc);
    }

    public float H(float f4, int i4) {
        return !F(i4) ? f4 : G();
    }

    public abstract void H0(float f4);

    public float[] I() {
        int iL = L();
        if (iL < 0) {
            return null;
        }
        float[] fArr = new float[iL];
        for (int i4 = 0; i4 < iL; i4++) {
            fArr[i4] = G();
        }
        return fArr;
    }

    public void I0(float f4, int i4) {
        i0(i4);
        H0(f4);
    }

    public float[] J(float[] fArr, int i4) {
        return !F(i4) ? fArr : I();
    }

    public void J0(float[] fArr) {
        if (fArr == null) {
            L0(-1);
            return;
        }
        L0(fArr.length);
        for (float f4 : fArr) {
            H0(f4);
        }
    }

    public <T extends h> T K(String str, e eVar) {
        try {
            return (T) e(str).invoke(null, eVar);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (InvocationTargetException e7) {
            if (e7.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e7.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
        }
    }

    public void K0(float[] fArr, int i4) {
        i0(i4);
        J0(fArr);
    }

    public abstract int L();

    public abstract void L0(int i4);

    public int M(int i4, int i5) {
        return !F(i5) ? i4 : L();
    }

    public void M0(int i4, int i5) {
        i0(i5);
        L0(i4);
    }

    public int[] N() {
        int iL = L();
        if (iL < 0) {
            return null;
        }
        int[] iArr = new int[iL];
        for (int i4 = 0; i4 < iL; i4++) {
            iArr[i4] = L();
        }
        return iArr;
    }

    public void N0(int[] iArr) {
        if (iArr == null) {
            L0(-1);
            return;
        }
        L0(iArr.length);
        for (int i4 : iArr) {
            L0(i4);
        }
    }

    public int[] O(int[] iArr, int i4) {
        return !F(i4) ? iArr : N();
    }

    public void O0(int[] iArr, int i4) {
        i0(i4);
        N0(iArr);
    }

    public <T> List<T> P(List<T> list, int i4) {
        return !F(i4) ? list : (List) x(new ArrayList());
    }

    public <T> void P0(List<T> list, int i4) {
        B0(list, i4);
    }

    public abstract long Q();

    public abstract void Q0(long j4);

    public long R(long j4, int i4) {
        return !F(i4) ? j4 : Q();
    }

    public void R0(long j4, int i4) {
        i0(i4);
        Q0(j4);
    }

    public long[] S() {
        int iL = L();
        if (iL < 0) {
            return null;
        }
        long[] jArr = new long[iL];
        for (int i4 = 0; i4 < iL; i4++) {
            jArr[i4] = Q();
        }
        return jArr;
    }

    public void S0(long[] jArr) {
        if (jArr == null) {
            L0(-1);
            return;
        }
        L0(jArr.length);
        for (long j4 : jArr) {
            Q0(j4);
        }
    }

    public long[] T(long[] jArr, int i4) {
        return !F(i4) ? jArr : S();
    }

    public void T0(long[] jArr, int i4) {
        i0(i4);
        S0(jArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> U(Map<K, V> map, int i4) {
        if (!F(i4)) {
            return map;
        }
        int iL = L();
        if (iL < 0) {
            return null;
        }
        p.a aVar = new p.a();
        if (iL == 0) {
            return aVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        x(arrayList);
        x(arrayList2);
        for (int i5 = 0; i5 < iL; i5++) {
            aVar.put(arrayList.get(i5), arrayList2.get(i5));
        }
        return aVar;
    }

    public <K, V> void U0(Map<K, V> map, int i4) {
        i0(i4);
        if (map == null) {
            L0(-1);
            return;
        }
        int size = map.size();
        L0(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        A0(arrayList);
        A0(arrayList2);
    }

    public abstract <T extends Parcelable> T V();

    public void V0() {
        L0(0);
    }

    public <T extends Parcelable> T W(T t4, int i4) {
        return !F(i4) ? t4 : (T) V();
    }

    public abstract void W0(Parcelable parcelable);

    public Serializable X() {
        String strC0 = c0();
        if (strC0 == null) {
            return null;
        }
        try {
            return (Serializable) new a(new ByteArrayInputStream(s())).readObject();
        } catch (IOException e4) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + strC0 + ")", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + strC0 + ")", e5);
        }
    }

    public void X0(Parcelable parcelable, int i4) {
        i0(i4);
        W0(parcelable);
    }

    public <T> Set<T> Y(Set<T> set, int i4) {
        return !F(i4) ? set : (Set) x(new p.b());
    }

    public final void Y0(Serializable serializable) {
        if (serializable == null) {
            e1(null);
            return;
        }
        String name = serializable.getClass().getName();
        e1(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            t0(byteArrayOutputStream.toByteArray());
        } catch (IOException e4) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e4);
        }
    }

    @o0(api = 21)
    public Size Z(Size size, int i4) {
        if (!F(i4)) {
            return size;
        }
        if (l()) {
            return new Size(L(), L());
        }
        return null;
    }

    public void Z0(Serializable serializable, int i4) {
        i0(i4);
        Y0(serializable);
    }

    public abstract void a();

    @o0(api = 21)
    public SizeF a0(SizeF sizeF, int i4) {
        if (!F(i4)) {
            return sizeF;
        }
        if (l()) {
            return new SizeF(G(), G());
        }
        return null;
    }

    public <T> void a1(Set<T> set, int i4) {
        B0(set, i4);
    }

    public final Exception b(int i4, String str) {
        switch (i4) {
            case f11475l /* -9 */:
                return (Exception) V();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + i4 + " msg " + str);
            case f11474k /* -7 */:
                return new UnsupportedOperationException(str);
            case f11473j /* -6 */:
                return new NetworkOnMainThreadException();
            case f11472i /* -5 */:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    public SparseBooleanArray b0(SparseBooleanArray sparseBooleanArray, int i4) {
        if (!F(i4)) {
            return sparseBooleanArray;
        }
        int iL = L();
        if (iL < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(iL);
        for (int i5 = 0; i5 < iL; i5++) {
            sparseBooleanArray2.put(L(), l());
        }
        return sparseBooleanArray2;
    }

    @o0(api = 21)
    public void b1(Size size, int i4) {
        i0(i4);
        m0(size != null);
        if (size != null) {
            L0(size.getWidth());
            L0(size.getHeight());
        }
    }

    public abstract e c();

    public abstract String c0();

    @o0(api = 21)
    public void c1(SizeF sizeF, int i4) {
        i0(i4);
        m0(sizeF != null);
        if (sizeF != null) {
            H0(sizeF.getWidth());
            H0(sizeF.getHeight());
        }
    }

    public final Class d(Class<? extends h> cls) throws ClassNotFoundException {
        Class cls2 = this.f11485c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f11485c.put(cls.getName(), cls3);
        return cls3;
    }

    public String d0(String str, int i4) {
        return !F(i4) ? str : c0();
    }

    public void d1(SparseBooleanArray sparseBooleanArray, int i4) {
        i0(i4);
        if (sparseBooleanArray == null) {
            L0(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        L0(size);
        for (int i5 = 0; i5 < size; i5++) {
            L0(sparseBooleanArray.keyAt(i5));
            m0(sparseBooleanArray.valueAt(i5));
        }
    }

    public final Method e(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f11483a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, e.class.getClassLoader()).getDeclaredMethod("read", e.class);
        this.f11483a.put(str, declaredMethod);
        return declaredMethod;
    }

    public abstract IBinder e0();

    public abstract void e1(String str);

    public IBinder f0(IBinder iBinder, int i4) {
        return !F(i4) ? iBinder : e0();
    }

    public void f1(String str, int i4) {
        i0(i4);
        e1(str);
    }

    public final <T> int g(T t4) {
        if (t4 instanceof String) {
            return 4;
        }
        if (t4 instanceof Parcelable) {
            return 2;
        }
        if (t4 instanceof h) {
            return 1;
        }
        if (t4 instanceof Serializable) {
            return 3;
        }
        if (t4 instanceof IBinder) {
            return 5;
        }
        if (t4 instanceof Integer) {
            return 7;
        }
        if (t4 instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t4.getClass().getName() + " cannot be VersionedParcelled");
    }

    public <T extends h> T g0() {
        String strC0 = c0();
        if (strC0 == null) {
            return null;
        }
        return (T) K(strC0, c());
    }

    public abstract void g1(IBinder iBinder);

    /* JADX WARN: Multi-variable type inference failed */
    public final Method h(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f11484b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsD = d(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsD.getDeclaredMethod("write", cls, e.class);
        this.f11484b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public <T extends h> T h0(T t4, int i4) {
        return !F(i4) ? t4 : (T) g0();
    }

    public void h1(IBinder iBinder, int i4) {
        i0(i4);
        g1(iBinder);
    }

    public boolean i() {
        return false;
    }

    public abstract void i0(int i4);

    public abstract void i1(IInterface iInterface);

    public <T> T[] j(T[] tArr) {
        int iL = L();
        if (iL < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(iL);
        if (iL != 0) {
            int iL2 = L();
            if (iL < 0) {
                return null;
            }
            if (iL2 == 1) {
                while (iL > 0) {
                    arrayList.add(g0());
                    iL--;
                }
            } else if (iL2 == 2) {
                while (iL > 0) {
                    arrayList.add(V());
                    iL--;
                }
            } else if (iL2 == 3) {
                while (iL > 0) {
                    arrayList.add(X());
                    iL--;
                }
            } else if (iL2 == 4) {
                while (iL > 0) {
                    arrayList.add(c0());
                    iL--;
                }
            } else if (iL2 == 5) {
                while (iL > 0) {
                    arrayList.add(e0());
                    iL--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public void j0(boolean z3, boolean z4) {
    }

    public void j1(IInterface iInterface, int i4) {
        i0(i4);
        i1(iInterface);
    }

    public <T> T[] k(T[] tArr, int i4) {
        return !F(i4) ? tArr : (T[]) j(tArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void k0(T[] tArr) {
        if (tArr == 0) {
            L0(-1);
            return;
        }
        int length = tArr.length;
        L0(length);
        if (length > 0) {
            int i4 = 0;
            int iG = g(tArr[0]);
            L0(iG);
            if (iG == 1) {
                while (i4 < length) {
                    l1((h) tArr[i4]);
                    i4++;
                }
                return;
            }
            if (iG == 2) {
                while (i4 < length) {
                    W0((Parcelable) tArr[i4]);
                    i4++;
                }
                return;
            }
            if (iG == 3) {
                while (i4 < length) {
                    Y0((Serializable) tArr[i4]);
                    i4++;
                }
            } else if (iG == 4) {
                while (i4 < length) {
                    e1((String) tArr[i4]);
                    i4++;
                }
            } else {
                if (iG != 5) {
                    return;
                }
                while (i4 < length) {
                    g1((IBinder) tArr[i4]);
                    i4++;
                }
            }
        }
    }

    public <T extends h> void k1(T t4, e eVar) {
        try {
            h(t4.getClass()).invoke(null, t4, eVar);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (InvocationTargetException e7) {
            if (!(e7.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
            }
            throw ((RuntimeException) e7.getCause());
        }
    }

    public abstract boolean l();

    public <T> void l0(T[] tArr, int i4) {
        i0(i4);
        k0(tArr);
    }

    public void l1(h hVar) {
        if (hVar == null) {
            e1(null);
            return;
        }
        n1(hVar);
        e eVarC = c();
        k1(hVar, eVarC);
        eVarC.a();
    }

    public boolean m(boolean z3, int i4) {
        return !F(i4) ? z3 : l();
    }

    public abstract void m0(boolean z3);

    public void m1(h hVar, int i4) {
        i0(i4);
        l1(hVar);
    }

    public boolean[] n() {
        int iL = L();
        if (iL < 0) {
            return null;
        }
        boolean[] zArr = new boolean[iL];
        for (int i4 = 0; i4 < iL; i4++) {
            zArr[i4] = L() != 0;
        }
        return zArr;
    }

    public void n0(boolean z3, int i4) {
        i0(i4);
        m0(z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n1(h hVar) {
        try {
            e1(d(hVar.getClass()).getName());
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(hVar.getClass().getSimpleName() + " does not have a Parcelizer", e4);
        }
    }

    public boolean[] o(boolean[] zArr, int i4) {
        return !F(i4) ? zArr : n();
    }

    public void o0(boolean[] zArr) {
        if (zArr == null) {
            L0(-1);
            return;
        }
        L0(zArr.length);
        for (boolean z3 : zArr) {
            L0(z3 ? 1 : 0);
        }
    }

    public abstract Bundle p();

    public void p0(boolean[] zArr, int i4) {
        i0(i4);
        o0(zArr);
    }

    public Bundle q(Bundle bundle, int i4) {
        return !F(i4) ? bundle : p();
    }

    public abstract void q0(Bundle bundle);

    public byte r(byte b4, int i4) {
        return !F(i4) ? b4 : (byte) (L() & 255);
    }

    public void r0(Bundle bundle, int i4) {
        i0(i4);
        q0(bundle);
    }

    public abstract byte[] s();

    public void s0(byte b4, int i4) {
        i0(i4);
        L0(b4);
    }

    public byte[] t(byte[] bArr, int i4) {
        return !F(i4) ? bArr : s();
    }

    public abstract void t0(byte[] bArr);

    public char[] u(char[] cArr, int i4) {
        if (!F(i4)) {
            return cArr;
        }
        int iL = L();
        if (iL < 0) {
            return null;
        }
        char[] cArr2 = new char[iL];
        for (int i5 = 0; i5 < iL; i5++) {
            cArr2[i5] = (char) L();
        }
        return cArr2;
    }

    public void u0(byte[] bArr, int i4) {
        i0(i4);
        t0(bArr);
    }

    public abstract CharSequence v();

    public abstract void v0(byte[] bArr, int i4, int i5);

    public CharSequence w(CharSequence charSequence, int i4) {
        return !F(i4) ? charSequence : v();
    }

    public void w0(byte[] bArr, int i4, int i5, int i6) {
        i0(i6);
        v0(bArr, i4, i5);
    }

    public final <T, S extends Collection<T>> S x(S s4) {
        int iL = L();
        if (iL < 0) {
            return null;
        }
        if (iL != 0) {
            int iL2 = L();
            if (iL < 0) {
                return null;
            }
            if (iL2 == 1) {
                while (iL > 0) {
                    s4.add(g0());
                    iL--;
                }
            } else if (iL2 == 2) {
                while (iL > 0) {
                    s4.add(V());
                    iL--;
                }
            } else if (iL2 == 3) {
                while (iL > 0) {
                    s4.add(X());
                    iL--;
                }
            } else if (iL2 == 4) {
                while (iL > 0) {
                    s4.add(c0());
                    iL--;
                }
            } else if (iL2 == 5) {
                while (iL > 0) {
                    s4.add(e0());
                    iL--;
                }
            }
        }
        return s4;
    }

    public void x0(char[] cArr, int i4) {
        i0(i4);
        if (cArr == null) {
            L0(-1);
            return;
        }
        L0(cArr.length);
        for (char c4 : cArr) {
            L0(c4);
        }
    }

    public abstract double y();

    public abstract void y0(CharSequence charSequence);

    public double z(double d4, int i4) {
        return !F(i4) ? d4 : y();
    }

    public void z0(CharSequence charSequence, int i4) {
        i0(i4);
        y0(charSequence);
    }
}
