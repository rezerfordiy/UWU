package p;

import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public class f<E> implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f10001f = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f10003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f10004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10005e;

    public f() {
        this(10);
    }

    public void a(long j4, E e4) {
        int i4 = this.f10005e;
        if (i4 != 0 && j4 <= this.f10003c[i4 - 1]) {
            n(j4, e4);
            return;
        }
        if (this.f10002b && i4 >= this.f10003c.length) {
            g();
        }
        int i5 = this.f10005e;
        if (i5 >= this.f10003c.length) {
            int iF = e.f(i5 + 1);
            long[] jArr = new long[iF];
            Object[] objArr = new Object[iF];
            long[] jArr2 = this.f10003c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f10004d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f10003c = jArr;
            this.f10004d = objArr;
        }
        this.f10003c[i5] = j4;
        this.f10004d[i5] = e4;
        this.f10005e = i5 + 1;
    }

    public void b() {
        int i4 = this.f10005e;
        Object[] objArr = this.f10004d;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f10005e = 0;
        this.f10002b = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.f10003c = (long[]) this.f10003c.clone();
            fVar.f10004d = (Object[]) this.f10004d.clone();
            return fVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public boolean d(long j4) {
        return j(j4) >= 0;
    }

    public boolean e(E e4) {
        return k(e4) >= 0;
    }

    @Deprecated
    public void f(long j4) {
        q(j4);
    }

    public final void g() {
        int i4 = this.f10005e;
        long[] jArr = this.f10003c;
        Object[] objArr = this.f10004d;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f10001f) {
                if (i6 != i5) {
                    jArr[i5] = jArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f10002b = false;
        this.f10005e = i5;
    }

    @k0
    public E h(long j4) {
        return i(j4, null);
    }

    public E i(long j4, E e4) {
        E e5;
        int iB = e.b(this.f10003c, this.f10005e, j4);
        return (iB < 0 || (e5 = (E) this.f10004d[iB]) == f10001f) ? e4 : e5;
    }

    public int j(long j4) {
        if (this.f10002b) {
            g();
        }
        return e.b(this.f10003c, this.f10005e, j4);
    }

    public int k(E e4) {
        if (this.f10002b) {
            g();
        }
        for (int i4 = 0; i4 < this.f10005e; i4++) {
            if (this.f10004d[i4] == e4) {
                return i4;
            }
        }
        return -1;
    }

    public boolean l() {
        return w() == 0;
    }

    public long m(int i4) {
        if (this.f10002b) {
            g();
        }
        return this.f10003c[i4];
    }

    public void n(long j4, E e4) {
        int iB = e.b(this.f10003c, this.f10005e, j4);
        if (iB >= 0) {
            this.f10004d[iB] = e4;
            return;
        }
        int i4 = ~iB;
        int i5 = this.f10005e;
        if (i4 < i5) {
            Object[] objArr = this.f10004d;
            if (objArr[i4] == f10001f) {
                this.f10003c[i4] = j4;
                objArr[i4] = e4;
                return;
            }
        }
        if (this.f10002b && i5 >= this.f10003c.length) {
            g();
            i4 = ~e.b(this.f10003c, this.f10005e, j4);
        }
        int i6 = this.f10005e;
        if (i6 >= this.f10003c.length) {
            int iF = e.f(i6 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.f10003c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f10004d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f10003c = jArr;
            this.f10004d = objArr2;
        }
        int i7 = this.f10005e;
        if (i7 - i4 != 0) {
            long[] jArr3 = this.f10003c;
            int i8 = i4 + 1;
            System.arraycopy(jArr3, i4, jArr3, i8, i7 - i4);
            Object[] objArr4 = this.f10004d;
            System.arraycopy(objArr4, i4, objArr4, i8, this.f10005e - i4);
        }
        this.f10003c[i4] = j4;
        this.f10004d[i4] = e4;
        this.f10005e++;
    }

    public void o(@j0 f<? extends E> fVar) {
        int iW = fVar.w();
        for (int i4 = 0; i4 < iW; i4++) {
            n(fVar.m(i4), fVar.x(i4));
        }
    }

    @k0
    public E p(long j4, E e4) {
        E eH = h(j4);
        if (eH == null) {
            n(j4, e4);
        }
        return eH;
    }

    public void q(long j4) {
        int iB = e.b(this.f10003c, this.f10005e, j4);
        if (iB >= 0) {
            Object[] objArr = this.f10004d;
            Object obj = objArr[iB];
            Object obj2 = f10001f;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f10002b = true;
            }
        }
    }

    public boolean r(long j4, Object obj) {
        int iJ = j(j4);
        if (iJ < 0) {
            return false;
        }
        E eX = x(iJ);
        if (obj != eX && (obj == null || !obj.equals(eX))) {
            return false;
        }
        s(iJ);
        return true;
    }

    public void s(int i4) {
        Object[] objArr = this.f10004d;
        Object obj = objArr[i4];
        Object obj2 = f10001f;
        if (obj != obj2) {
            objArr[i4] = obj2;
            this.f10002b = true;
        }
    }

    @k0
    public E t(long j4, E e4) {
        int iJ = j(j4);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = this.f10004d;
        E e5 = (E) objArr[iJ];
        objArr[iJ] = e4;
        return e5;
    }

    public String toString() {
        if (w() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10005e * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f10005e; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(m(i4));
            sb.append('=');
            E eX = x(i4);
            if (eX != this) {
                sb.append(eX);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean u(long j4, E e4, E e5) {
        int iJ = j(j4);
        if (iJ < 0) {
            return false;
        }
        Object obj = this.f10004d[iJ];
        if (obj != e4 && (e4 == null || !e4.equals(obj))) {
            return false;
        }
        this.f10004d[iJ] = e5;
        return true;
    }

    public void v(int i4, E e4) {
        if (this.f10002b) {
            g();
        }
        this.f10004d[i4] = e4;
    }

    public int w() {
        if (this.f10002b) {
            g();
        }
        return this.f10005e;
    }

    public E x(int i4) {
        if (this.f10002b) {
            g();
        }
        return (E) this.f10004d[i4];
    }

    public f(int i4) {
        this.f10002b = false;
        if (i4 == 0) {
            this.f10003c = e.f9999b;
            this.f10004d = e.f10000c;
        } else {
            int iF = e.f(i4);
            this.f10003c = new long[iF];
            this.f10004d = new Object[iF];
        }
    }
}
