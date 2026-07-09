package c1;

import android.graphics.Rect;
import c.j0;
import c.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class b {

    public interface a<T> {
        void a(T t4, Rect rect);
    }

    /* JADX INFO: renamed from: c1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0032b<T, V> {
        int a(T t4);

        V b(T t4, int i4);
    }

    public static class c<T> implements Comparator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f4589a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f4590b = new Rect();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f4591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a<T> f4592d;

        public c(boolean z3, a<T> aVar) {
            this.f4591c = z3;
            this.f4592d = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t4, T t5) {
            Rect rect = this.f4589a;
            Rect rect2 = this.f4590b;
            this.f4592d.a(t4, rect);
            this.f4592d.a(t5, rect2);
            int i4 = rect.top;
            int i5 = rect2.top;
            if (i4 < i5) {
                return -1;
            }
            if (i4 > i5) {
                return 1;
            }
            int i6 = rect.left;
            int i7 = rect2.left;
            if (i6 < i7) {
                return this.f4591c ? 1 : -1;
            }
            if (i6 > i7) {
                return this.f4591c ? -1 : 1;
            }
            int i8 = rect.bottom;
            int i9 = rect2.bottom;
            if (i8 < i9) {
                return -1;
            }
            if (i8 > i9) {
                return 1;
            }
            int i10 = rect.right;
            int i11 = rect2.right;
            if (i10 < i11) {
                return this.f4591c ? 1 : -1;
            }
            if (i10 > i11) {
                return this.f4591c ? -1 : 1;
            }
            return 0;
        }
    }

    public static boolean a(int i4, @j0 Rect rect, @j0 Rect rect2, @j0 Rect rect3) {
        boolean zB = b(i4, rect, rect2);
        if (b(i4, rect, rect3) || !zB) {
            return false;
        }
        return !j(i4, rect, rect3) || i4 == 17 || i4 == 66 || k(i4, rect, rect2) < m(i4, rect, rect3);
    }

    public static boolean b(int i4, @j0 Rect rect, @j0 Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <L, T> T c(@c.j0 L r7, @c.j0 c1.b.InterfaceC0032b<L, T> r8, @c.j0 c1.b.a<T> r9, @c.k0 T r10, @c.j0 android.graphics.Rect r11, int r12) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r11)
            r1 = 17
            r2 = 0
            if (r12 == r1) goto L38
            r1 = 33
            if (r12 == r1) goto L2e
            r1 = 66
            if (r12 == r1) goto L26
            r1 = 130(0x82, float:1.82E-43)
            if (r12 != r1) goto L1e
            int r1 = r11.height()
            int r1 = r1 + 1
            int r1 = -r1
            goto L34
        L1e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7.<init>(r8)
            throw r7
        L26:
            int r1 = r11.width()
            int r1 = r1 + 1
            int r1 = -r1
            goto L3e
        L2e:
            int r1 = r11.height()
            int r1 = r1 + 1
        L34:
            r0.offset(r2, r1)
            goto L41
        L38:
            int r1 = r11.width()
            int r1 = r1 + 1
        L3e:
            r0.offset(r1, r2)
        L41:
            int r1 = r8.a(r7)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r4 = 0
        L4b:
            if (r2 >= r1) goto L64
            java.lang.Object r5 = r8.b(r7, r2)
            if (r5 != r10) goto L54
            goto L61
        L54:
            r9.a(r5, r3)
            boolean r6 = h(r12, r11, r3, r0)
            if (r6 == 0) goto L61
            r0.set(r3)
            r4 = r5
        L61:
            int r2 = r2 + 1
            goto L4b
        L64:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.b.c(java.lang.Object, c1.b$b, c1.b$a, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    public static <L, T> T d(@j0 L l4, @j0 InterfaceC0032b<L, T> interfaceC0032b, @j0 a<T> aVar, @k0 T t4, int i4, boolean z3, boolean z4) {
        int iA = interfaceC0032b.a(l4);
        ArrayList arrayList = new ArrayList(iA);
        for (int i5 = 0; i5 < iA; i5++) {
            arrayList.add(interfaceC0032b.b(l4, i5));
        }
        Collections.sort(arrayList, new c(z3, aVar));
        if (i4 == 1) {
            return (T) f(t4, arrayList, z4);
        }
        if (i4 == 2) {
            return (T) e(t4, arrayList, z4);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    public static <T> T e(T t4, ArrayList<T> arrayList, boolean z3) {
        int size = arrayList.size();
        int iLastIndexOf = (t4 == null ? -1 : arrayList.lastIndexOf(t4)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z3 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    public static <T> T f(T t4, ArrayList<T> arrayList, boolean z3) {
        int size = arrayList.size();
        int iIndexOf = (t4 == null ? size : arrayList.indexOf(t4)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z3 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    public static int g(int i4, int i5) {
        return (i4 * 13 * i4) + (i5 * i5);
    }

    public static boolean h(int i4, @j0 Rect rect, @j0 Rect rect2, @j0 Rect rect3) {
        if (!i(rect, rect2, i4)) {
            return false;
        }
        if (i(rect, rect3, i4) && !a(i4, rect, rect2, rect3)) {
            return !a(i4, rect, rect3, rect2) && g(k(i4, rect, rect2), o(i4, rect, rect2)) < g(k(i4, rect, rect3), o(i4, rect, rect3));
        }
        return true;
    }

    public static boolean i(@j0 Rect rect, @j0 Rect rect2, int i4) {
        if (i4 == 17) {
            int i5 = rect.right;
            int i6 = rect2.right;
            return (i5 > i6 || rect.left >= i6) && rect.left > rect2.left;
        }
        if (i4 == 33) {
            int i7 = rect.bottom;
            int i8 = rect2.bottom;
            return (i7 > i8 || rect.top >= i8) && rect.top > rect2.top;
        }
        if (i4 == 66) {
            int i9 = rect.left;
            int i10 = rect2.left;
            return (i9 < i10 || rect.right <= i10) && rect.right < rect2.right;
        }
        if (i4 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i11 = rect.top;
        int i12 = rect2.top;
        return (i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom;
    }

    public static boolean j(int i4, @j0 Rect rect, @j0 Rect rect2) {
        if (i4 == 17) {
            return rect.left >= rect2.right;
        }
        if (i4 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i4 == 66) {
            return rect.right <= rect2.left;
        }
        if (i4 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    public static int k(int i4, @j0 Rect rect, @j0 Rect rect2) {
        return Math.max(0, l(i4, rect, rect2));
    }

    public static int l(int i4, @j0 Rect rect, @j0 Rect rect2) {
        int i5;
        int i6;
        if (i4 == 17) {
            i5 = rect.left;
            i6 = rect2.right;
        } else if (i4 == 33) {
            i5 = rect.top;
            i6 = rect2.bottom;
        } else if (i4 == 66) {
            i5 = rect2.left;
            i6 = rect.right;
        } else {
            if (i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i5 = rect2.top;
            i6 = rect.bottom;
        }
        return i5 - i6;
    }

    public static int m(int i4, @j0 Rect rect, @j0 Rect rect2) {
        return Math.max(1, n(i4, rect, rect2));
    }

    public static int n(int i4, @j0 Rect rect, @j0 Rect rect2) {
        int i5;
        int i6;
        if (i4 == 17) {
            i5 = rect.left;
            i6 = rect2.left;
        } else if (i4 == 33) {
            i5 = rect.top;
            i6 = rect2.top;
        } else if (i4 == 66) {
            i5 = rect2.right;
            i6 = rect.right;
        } else {
            if (i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i5 = rect2.bottom;
            i6 = rect.bottom;
        }
        return i5 - i6;
    }

    public static int o(int i4, @j0 Rect rect, @j0 Rect rect2) {
        int iHeight;
        int i5;
        int iHeight2;
        if (i4 == 17) {
            iHeight = rect.top + (rect.height() / 2);
            i5 = rect2.top;
            iHeight2 = rect2.height();
        } else {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
                iHeight = rect.top + (rect.height() / 2);
                i5 = rect2.top;
                iHeight2 = rect2.height();
            }
            iHeight = rect.left + (rect.width() / 2);
            i5 = rect2.left;
            iHeight2 = rect2.width();
        }
        return Math.abs(iHeight - (i5 + (iHeight2 / 2)));
    }
}
