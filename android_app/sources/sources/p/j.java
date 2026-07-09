package p;

import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public class j<E> implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f10041f = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f10043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f10044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10045e;

    public j() {
        this(10);
    }

    public void a(int i4, E e4) {
        int i5 = this.f10045e;
        if (i5 != 0 && i4 <= this.f10043c[i5 - 1]) {
            n(i4, e4);
            return;
        }
        if (this.f10042b && i5 >= this.f10043c.length) {
            g();
        }
        int i6 = this.f10045e;
        if (i6 >= this.f10043c.length) {
            int iE = e.e(i6 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.f10043c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f10044d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f10043c = iArr;
            this.f10044d = objArr;
        }
        this.f10043c[i6] = i4;
        this.f10044d[i6] = e4;
        this.f10045e = i6 + 1;
    }

    public void b() {
        int i4 = this.f10045e;
        Object[] objArr = this.f10044d;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f10045e = 0;
        this.f10042b = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public j<E> clone() {
        try {
            j<E> jVar = (j) super.clone();
            jVar.f10043c = (int[]) this.f10043c.clone();
            jVar.f10044d = (Object[]) this.f10044d.clone();
            return jVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public boolean d(int i4) {
        return j(i4) >= 0;
    }

    public boolean e(E e4) {
        return k(e4) >= 0;
    }

    @Deprecated
    public void f(int i4) {
        q(i4);
    }

    public final void g() {
        int i4 = this.f10045e;
        int[] iArr = this.f10043c;
        Object[] objArr = this.f10044d;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f10041f) {
                if (i6 != i5) {
                    iArr[i5] = iArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f10042b = false;
        this.f10045e = i5;
    }

    @k0
    public E h(int i4) {
        return i(i4, null);
    }

    public E i(int i4, E e4) {
        E e5;
        int iA = e.a(this.f10043c, this.f10045e, i4);
        return (iA < 0 || (e5 = (E) this.f10044d[iA]) == f10041f) ? e4 : e5;
    }

    public int j(int i4) {
        if (this.f10042b) {
            g();
        }
        return e.a(this.f10043c, this.f10045e, i4);
    }

    public int k(E e4) {
        if (this.f10042b) {
            g();
        }
        for (int i4 = 0; i4 < this.f10045e; i4++) {
            if (this.f10044d[i4] == e4) {
                return i4;
            }
        }
        return -1;
    }

    public boolean l() {
        return x() == 0;
    }

    public int m(int i4) {
        if (this.f10042b) {
            g();
        }
        return this.f10043c[i4];
    }

    public void n(int i4, E e4) {
        int iA = e.a(this.f10043c, this.f10045e, i4);
        if (iA >= 0) {
            this.f10044d[iA] = e4;
            return;
        }
        int i5 = ~iA;
        int i6 = this.f10045e;
        if (i5 < i6) {
            Object[] objArr = this.f10044d;
            if (objArr[i5] == f10041f) {
                this.f10043c[i5] = i4;
                objArr[i5] = e4;
                return;
            }
        }
        if (this.f10042b && i6 >= this.f10043c.length) {
            g();
            i5 = ~e.a(this.f10043c, this.f10045e, i4);
        }
        int i7 = this.f10045e;
        if (i7 >= this.f10043c.length) {
            int iE = e.e(i7 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.f10043c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f10044d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f10043c = iArr;
            this.f10044d = objArr2;
        }
        int i8 = this.f10045e;
        if (i8 - i5 != 0) {
            int[] iArr3 = this.f10043c;
            int i9 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i9, i8 - i5);
            Object[] objArr4 = this.f10044d;
            System.arraycopy(objArr4, i5, objArr4, i9, this.f10045e - i5);
        }
        this.f10043c[i5] = i4;
        this.f10044d[i5] = e4;
        this.f10045e++;
    }

    public void o(@j0 j<? extends E> jVar) {
        int iX = jVar.x();
        for (int i4 = 0; i4 < iX; i4++) {
            n(jVar.m(i4), jVar.y(i4));
        }
    }

    @k0
    public E p(int i4, E e4) {
        E eH = h(i4);
        if (eH == null) {
            n(i4, e4);
        }
        return eH;
    }

    public void q(int i4) {
        int iA = e.a(this.f10043c, this.f10045e, i4);
        if (iA >= 0) {
            Object[] objArr = this.f10044d;
            Object obj = objArr[iA];
            Object obj2 = f10041f;
            if (obj != obj2) {
                objArr[iA] = obj2;
                this.f10042b = true;
            }
        }
    }

    public boolean r(int i4, Object obj) {
        int iJ = j(i4);
        if (iJ < 0) {
            return false;
        }
        E eY = y(iJ);
        if (obj != eY && (obj == null || !obj.equals(eY))) {
            return false;
        }
        s(iJ);
        return true;
    }

    public void s(int i4) {
        Object[] objArr = this.f10044d;
        Object obj = objArr[i4];
        Object obj2 = f10041f;
        if (obj != obj2) {
            objArr[i4] = obj2;
            this.f10042b = true;
        }
    }

    public void t(int i4, int i5) {
        int iMin = Math.min(this.f10045e, i5 + i4);
        while (i4 < iMin) {
            s(i4);
            i4++;
        }
    }

    public String toString() {
        if (x() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10045e * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f10045e; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(m(i4));
            sb.append('=');
            E eY = y(i4);
            if (eY != this) {
                sb.append(eY);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @k0
    public E u(int i4, E e4) {
        int iJ = j(i4);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = this.f10044d;
        E e5 = (E) objArr[iJ];
        objArr[iJ] = e4;
        return e5;
    }

    public boolean v(int i4, E e4, E e5) {
        int iJ = j(i4);
        if (iJ < 0) {
            return false;
        }
        Object obj = this.f10044d[iJ];
        if (obj != e4 && (e4 == null || !e4.equals(obj))) {
            return false;
        }
        this.f10044d[iJ] = e5;
        return true;
    }

    public void w(int i4, E e4) {
        if (this.f10042b) {
            g();
        }
        this.f10044d[i4] = e4;
    }

    public int x() {
        if (this.f10042b) {
            g();
        }
        return this.f10045e;
    }

    public E y(int i4) {
        if (this.f10042b) {
            g();
        }
        return (E) this.f10044d[i4];
    }

    public j(int i4) {
        this.f10042b = false;
        if (i4 == 0) {
            this.f10043c = e.f9998a;
            this.f10044d = e.f10000c;
        } else {
            int iE = e.e(i4);
            this.f10043c = new int[iE];
            this.f10044d = new Object[iE];
        }
    }
}
