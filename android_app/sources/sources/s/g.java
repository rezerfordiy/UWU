package s;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f10998a = false;

    public interface a<T> {
        boolean a(T t4);

        T b();

        void c(T[] tArr, int i4);
    }

    public static class b<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f10999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11000b;

        public b(int i4) {
            if (i4 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f10999a = new Object[i4];
        }

        @Override // s.g.a
        public boolean a(T t4) {
            int i4 = this.f11000b;
            Object[] objArr = this.f10999a;
            if (i4 >= objArr.length) {
                return false;
            }
            objArr[i4] = t4;
            this.f11000b = i4 + 1;
            return true;
        }

        @Override // s.g.a
        public T b() {
            int i4 = this.f11000b;
            if (i4 <= 0) {
                return null;
            }
            int i5 = i4 - 1;
            Object[] objArr = this.f10999a;
            T t4 = (T) objArr[i5];
            objArr[i5] = null;
            this.f11000b = i4 - 1;
            return t4;
        }

        @Override // s.g.a
        public void c(T[] tArr, int i4) {
            if (i4 > tArr.length) {
                i4 = tArr.length;
            }
            for (int i5 = 0; i5 < i4; i5++) {
                T t4 = tArr[i5];
                int i6 = this.f11000b;
                Object[] objArr = this.f10999a;
                if (i6 < objArr.length) {
                    objArr[i6] = t4;
                    this.f11000b = i6 + 1;
                }
            }
        }

        public final boolean d(T t4) {
            for (int i4 = 0; i4 < this.f11000b; i4++) {
                if (this.f10999a[i4] == t4) {
                    return true;
                }
            }
            return false;
        }
    }
}
