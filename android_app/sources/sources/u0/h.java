package u0;

import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    public interface a<T> {
        boolean a(@j0 T t4);

        @k0
        T b();
    }

    public static class b<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f11588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11589b;

        public b(int i4) {
            if (i4 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f11588a = new Object[i4];
        }

        @Override // u0.h.a
        public boolean a(@j0 T t4) {
            if (c(t4)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i4 = this.f11589b;
            Object[] objArr = this.f11588a;
            if (i4 >= objArr.length) {
                return false;
            }
            objArr[i4] = t4;
            this.f11589b = i4 + 1;
            return true;
        }

        @Override // u0.h.a
        public T b() {
            int i4 = this.f11589b;
            if (i4 <= 0) {
                return null;
            }
            int i5 = i4 - 1;
            Object[] objArr = this.f11588a;
            T t4 = (T) objArr[i5];
            objArr[i5] = null;
            this.f11589b = i4 - 1;
            return t4;
        }

        public final boolean c(@j0 T t4) {
            for (int i4 = 0; i4 < this.f11589b; i4++) {
                if (this.f11588a[i4] == t4) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class c<T> extends b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f11590c;

        public c(int i4) {
            super(i4);
            this.f11590c = new Object();
        }

        @Override // u0.h.b, u0.h.a
        public boolean a(@j0 T t4) {
            boolean zA;
            synchronized (this.f11590c) {
                zA = super.a(t4);
            }
            return zA;
        }

        @Override // u0.h.b, u0.h.a
        public T b() {
            T t4;
            synchronized (this.f11590c) {
                t4 = (T) super.b();
            }
            return t4;
        }
    }
}
