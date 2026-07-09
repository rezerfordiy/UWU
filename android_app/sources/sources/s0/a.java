package s0;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f11063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char f11064e = 8234;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char f11065f = 8235;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final char f11066g = 8236;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char f11067h = 8206;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final char f11068i = 8207;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f11069j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f11070k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f11071l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f11072m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f11073n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f11074o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f11075p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f11076q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f11077r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f11078s = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f11081c;

    /* JADX INFO: renamed from: s0.a$a, reason: collision with other inner class name */
    public static final class C0108a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f11082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public x f11084c;

        public C0108a() {
            c(a.j(Locale.getDefault()));
        }

        public static a b(boolean z3) {
            return z3 ? a.f11075p : a.f11074o;
        }

        public a a() {
            return (this.f11083b == 2 && this.f11084c == a.f11063d) ? b(this.f11082a) : new a(this.f11082a, this.f11083b, this.f11084c);
        }

        public final void c(boolean z3) {
            this.f11082a = z3;
            this.f11084c = a.f11063d;
            this.f11083b = 2;
        }

        public C0108a d(x xVar) {
            this.f11084c = xVar;
            return this;
        }

        public C0108a e(boolean z3) {
            this.f11083b = z3 ? this.f11083b | 2 : this.f11083b & (-3);
            return this;
        }

        public C0108a(Locale locale) {
            c(a.j(locale));
        }

        public C0108a(boolean z3) {
            c(z3);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f11085f = 1792;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final byte[] f11086g = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f11087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f11088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f11090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public char f11091e;

        static {
            for (int i4 = 0; i4 < 1792; i4++) {
                f11086g[i4] = Character.getDirectionality(i4);
            }
        }

        public b(CharSequence charSequence, boolean z3) {
            this.f11087a = charSequence;
            this.f11088b = z3;
            this.f11089c = charSequence.length();
        }

        public static byte c(char c4) {
            return c4 < 1792 ? f11086g[c4] : Character.getDirectionality(c4);
        }

        public byte a() {
            char cCharAt = this.f11087a.charAt(this.f11090d - 1);
            this.f11091e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f11087a, this.f11090d);
                this.f11090d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f11090d--;
            byte bC = c(this.f11091e);
            if (!this.f11088b) {
                return bC;
            }
            char c4 = this.f11091e;
            return c4 == '>' ? h() : c4 == ';' ? f() : bC;
        }

        public byte b() {
            char cCharAt = this.f11087a.charAt(this.f11090d);
            this.f11091e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f11087a, this.f11090d);
                this.f11090d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f11090d++;
            byte bC = c(this.f11091e);
            if (!this.f11088b) {
                return bC;
            }
            char c4 = this.f11091e;
            return c4 == '<' ? i() : c4 == '&' ? g() : bC;
        }

        public int d() {
            this.f11090d = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (this.f11090d < this.f11089c && i4 == 0) {
                byte b4 = b();
                if (b4 != 0) {
                    if (b4 == 1 || b4 == 2) {
                        if (i6 == 0) {
                            return 1;
                        }
                    } else if (b4 != 9) {
                        switch (b4) {
                            case 14:
                            case 15:
                                i6++;
                                i5 = -1;
                                continue;
                            case 16:
                            case 17:
                                i6++;
                                i5 = 1;
                                continue;
                            case 18:
                                i6--;
                                i5 = 0;
                                continue;
                        }
                    }
                } else if (i6 == 0) {
                    return -1;
                }
                i4 = i6;
            }
            if (i4 == 0) {
                return 0;
            }
            if (i5 != 0) {
                return i5;
            }
            while (this.f11090d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i4 == i6) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i4 == i6) {
                            return 1;
                        }
                        break;
                    case 18:
                        i6++;
                        continue;
                }
                i6--;
            }
            return 0;
        }

        public int e() {
            this.f11090d = this.f11089c;
            int i4 = 0;
            while (true) {
                int i5 = i4;
                while (this.f11090d > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i4 == 0) {
                            return -1;
                        }
                        if (i5 == 0) {
                            break;
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i4 == 0) {
                            return 1;
                        }
                        if (i5 == 0) {
                            break;
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i5 == i4) {
                                    return -1;
                                }
                                i4--;
                                break;
                            case 16:
                            case 17:
                                if (i5 == i4) {
                                    return 1;
                                }
                                i4--;
                                break;
                            case 18:
                                i4++;
                                break;
                            default:
                                if (i5 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }

        public final byte f() {
            char cCharAt;
            int i4 = this.f11090d;
            do {
                int i5 = this.f11090d;
                if (i5 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f11087a;
                int i6 = i5 - 1;
                this.f11090d = i6;
                cCharAt = charSequence.charAt(i6);
                this.f11091e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f11090d = i4;
            this.f11091e = ';';
            return (byte) 13;
        }

        public final byte g() {
            char cCharAt;
            do {
                int i4 = this.f11090d;
                if (i4 >= this.f11089c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f11087a;
                this.f11090d = i4 + 1;
                cCharAt = charSequence.charAt(i4);
                this.f11091e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        public final byte h() {
            char cCharAt;
            int i4 = this.f11090d;
            while (true) {
                int i5 = this.f11090d;
                if (i5 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f11087a;
                int i6 = i5 - 1;
                this.f11090d = i6;
                char cCharAt2 = charSequence.charAt(i6);
                this.f11091e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i7 = this.f11090d;
                        if (i7 > 0) {
                            CharSequence charSequence2 = this.f11087a;
                            int i8 = i7 - 1;
                            this.f11090d = i8;
                            cCharAt = charSequence2.charAt(i8);
                            this.f11091e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f11090d = i4;
            this.f11091e = '>';
            return (byte) 13;
        }

        public final byte i() {
            char cCharAt;
            int i4 = this.f11090d;
            while (true) {
                int i5 = this.f11090d;
                if (i5 >= this.f11089c) {
                    this.f11090d = i4;
                    this.f11091e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f11087a;
                this.f11090d = i5 + 1;
                char cCharAt2 = charSequence.charAt(i5);
                this.f11091e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i6 = this.f11090d;
                        if (i6 < this.f11089c) {
                            CharSequence charSequence2 = this.f11087a;
                            this.f11090d = i6 + 1;
                            cCharAt = charSequence2.charAt(i6);
                            this.f11091e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }
    }

    static {
        x xVar = y.f11126c;
        f11063d = xVar;
        f11069j = Character.toString(f11067h);
        f11070k = Character.toString(f11068i);
        f11074o = new a(false, 2, xVar);
        f11075p = new a(true, 2, xVar);
    }

    public a(boolean z3, int i4, x xVar) {
        this.f11079a = z3;
        this.f11080b = i4;
        this.f11081c = xVar;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0108a().a();
    }

    public static a d(Locale locale) {
        return new C0108a(locale).a();
    }

    public static a e(boolean z3) {
        return new C0108a(z3).a();
    }

    public static boolean j(Locale locale) {
        return z.b(locale) == 1;
    }

    public boolean f() {
        return (this.f11080b & 2) != 0;
    }

    public boolean g(CharSequence charSequence) {
        return this.f11081c.b(charSequence, 0, charSequence.length());
    }

    public boolean h(String str) {
        return g(str);
    }

    public boolean i() {
        return this.f11079a;
    }

    public final String k(CharSequence charSequence, x xVar) {
        boolean zB = xVar.b(charSequence, 0, charSequence.length());
        return (this.f11079a || !(zB || b(charSequence) == 1)) ? this.f11079a ? (!zB || b(charSequence) == -1) ? f11070k : f11071l : f11071l : f11069j;
    }

    public final String l(CharSequence charSequence, x xVar) {
        boolean zB = xVar.b(charSequence, 0, charSequence.length());
        return (this.f11079a || !(zB || a(charSequence) == 1)) ? this.f11079a ? (!zB || a(charSequence) == -1) ? f11070k : f11071l : f11071l : f11069j;
    }

    public CharSequence m(CharSequence charSequence) {
        return o(charSequence, this.f11081c, true);
    }

    public CharSequence n(CharSequence charSequence, x xVar) {
        return o(charSequence, xVar, true);
    }

    public CharSequence o(CharSequence charSequence, x xVar, boolean z3) {
        if (charSequence == null) {
            return null;
        }
        boolean zB = xVar.b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (f() && z3) {
            spannableStringBuilder.append((CharSequence) l(charSequence, zB ? y.f11125b : y.f11124a));
        }
        if (zB != this.f11079a) {
            spannableStringBuilder.append(zB ? f11065f : f11064e);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f11066g);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z3) {
            spannableStringBuilder.append((CharSequence) k(charSequence, zB ? y.f11125b : y.f11124a));
        }
        return spannableStringBuilder;
    }

    public CharSequence p(CharSequence charSequence, boolean z3) {
        return o(charSequence, this.f11081c, z3);
    }

    public String q(String str) {
        return s(str, this.f11081c, true);
    }

    public String r(String str, x xVar) {
        return s(str, xVar, true);
    }

    public String s(String str, x xVar, boolean z3) {
        if (str == null) {
            return null;
        }
        return o(str, xVar, z3).toString();
    }

    public String t(String str, boolean z3) {
        return s(str, this.f11081c, z3);
    }
}
