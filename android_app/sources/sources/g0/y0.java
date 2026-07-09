package g0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import c.r0;
import d0.d;
import d0.g;
import q0.f;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi"})
public class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f7819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p.g<String, Typeface> f7820b;

    @c.r0({r0.a.LIBRARY})
    public static class a extends f.d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @c.k0
        public g.a f7821j;

        public a(@c.k0 g.a aVar) {
            this.f7821j = aVar;
        }

        @Override // q0.f.d
        public void a(int i4) {
            g.a aVar = this.f7821j;
            if (aVar != null) {
                aVar.d(i4);
            }
        }

        @Override // q0.f.d
        public void b(@c.j0 Typeface typeface) {
            g.a aVar = this.f7821j;
            if (aVar != null) {
                aVar.e(typeface);
            }
        }
    }

    static {
        int i4 = Build.VERSION.SDK_INT;
        f7819a = i4 >= 29 ? new d1() : i4 >= 28 ? new c1() : i4 >= 26 ? new b1() : a1.m() ? new a1() : new z0();
        f7820b = new p.g<>(16);
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    @c.z0
    public static void a() {
        f7820b.d();
    }

    @c.j0
    public static Typeface b(@c.j0 Context context, @c.k0 Typeface typeface, int i4) {
        if (context != null) {
            return Typeface.create(typeface, i4);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static Typeface c(@c.j0 Context context, @c.k0 CancellationSignal cancellationSignal, @c.j0 f.c[] cVarArr, int i4) {
        return f7819a.c(context, cancellationSignal, cVarArr, i4);
    }

    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static Typeface d(@c.j0 Context context, @c.j0 d.a aVar, @c.j0 Resources resources, int i4, int i5, @c.k0 g.a aVar2, @c.k0 Handler handler, boolean z3) {
        Typeface typefaceB;
        if (aVar instanceof d.e) {
            d.e eVar = (d.e) aVar;
            Typeface typefaceI = i(eVar.c());
            if (typefaceI != null) {
                if (aVar2 != null) {
                    aVar2.b(typefaceI, handler);
                }
                return typefaceI;
            }
            boolean z4 = !z3 ? aVar2 != null : eVar.a() != 0;
            int iD = z3 ? eVar.d() : -1;
            typefaceB = q0.f.f(context, eVar.b(), i5, z4, iD, g.a.c(handler), new a(aVar2));
        } else {
            typefaceB = f7819a.b(context, (d.c) aVar, resources, i5);
            if (aVar2 != null) {
                if (typefaceB != null) {
                    aVar2.b(typefaceB, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typefaceB != null) {
            f7820b.j(f(resources, i4, i5), typefaceB);
        }
        return typefaceB;
    }

    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static Typeface e(@c.j0 Context context, @c.j0 Resources resources, int i4, String str, int i5) {
        Typeface typefaceE = f7819a.e(context, resources, i4, str, i5);
        if (typefaceE != null) {
            f7820b.j(f(resources, i4, i5), typefaceE);
        }
        return typefaceE;
    }

    public static String f(Resources resources, int i4, int i5) {
        return resources.getResourcePackageName(i4) + "-" + i4 + "-" + i5;
    }

    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static Typeface g(@c.j0 Resources resources, int i4, int i5) {
        return f7820b.f(f(resources, i4, i5));
    }

    @c.k0
    public static Typeface h(Context context, Typeface typeface, int i4) {
        e1 e1Var = f7819a;
        d.c cVarI = e1Var.i(typeface);
        if (cVarI == null) {
            return null;
        }
        return e1Var.b(context, cVarI, context.getResources(), i4);
    }

    public static Typeface i(@c.k0 String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
