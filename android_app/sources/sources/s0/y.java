package s0;

import java.nio.CharBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f11124a = new e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f11125b = new e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f11126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f11127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f11128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x f11129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f11130g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f11131h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f11132i = 2;

    public static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f11133b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f11134a;

        public a(boolean z3) {
            this.f11134a = z3;
        }

        @Override // s0.y.c
        public int a(CharSequence charSequence, int i4, int i5) {
            int i6 = i5 + i4;
            boolean z3 = false;
            while (i4 < i6) {
                int iA = y.a(Character.getDirectionality(charSequence.charAt(i4)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i4++;
                        z3 = z3;
                    } else if (!this.f11134a) {
                        return 1;
                    }
                } else if (this.f11134a) {
                    return 0;
                }
                z3 = true;
                i4++;
                z3 = z3;
            }
            if (z3) {
                return this.f11134a ? 1 : 0;
            }
            return 2;
        }
    }

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f11135a = new b();

        @Override // s0.y.c
        public int a(CharSequence charSequence, int i4, int i5) {
            int i6 = i5 + i4;
            int iB = 2;
            while (i4 < i6 && iB == 2) {
                iB = y.b(Character.getDirectionality(charSequence.charAt(i4)));
                i4++;
            }
            return iB;
        }
    }

    public interface c {
        int a(CharSequence charSequence, int i4, int i5);
    }

    public static abstract class d implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f11136a;

        public d(c cVar) {
            this.f11136a = cVar;
        }

        @Override // s0.x
        public boolean a(char[] cArr, int i4, int i5) {
            return b(CharBuffer.wrap(cArr), i4, i5);
        }

        @Override // s0.x
        public boolean b(CharSequence charSequence, int i4, int i5) {
            if (charSequence == null || i4 < 0 || i5 < 0 || charSequence.length() - i5 < i4) {
                throw new IllegalArgumentException();
            }
            return this.f11136a == null ? c() : d(charSequence, i4, i5);
        }

        public abstract boolean c();

        public final boolean d(CharSequence charSequence, int i4, int i5) {
            int iA = this.f11136a.a(charSequence, i4, i5);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return c();
            }
            return false;
        }
    }

    public static class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f11137b;

        public e(c cVar, boolean z3) {
            super(cVar);
            this.f11137b = z3;
        }

        @Override // s0.y.d
        public boolean c() {
            return this.f11137b;
        }
    }

    public static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f11138b = new f();

        public f() {
            super(null);
        }

        @Override // s0.y.d
        public boolean c() {
            return z.b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f11135a;
        f11126c = new e(bVar, false);
        f11127d = new e(bVar, true);
        f11128e = new e(a.f11133b, false);
        f11129f = f.f11138b;
    }

    public static int a(int i4) {
        if (i4 != 0) {
            return (i4 == 1 || i4 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i4) {
        if (i4 != 0) {
            if (i4 == 1 || i4 == 2) {
                return 0;
            }
            switch (i4) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
