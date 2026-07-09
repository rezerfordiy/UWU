package q0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import c.j0;
import c.k0;
import c.w;
import g0.y0;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p.i;
import q0.f;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p.g<String, Typeface> f10231a = new p.g<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f10232b = g.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f10233c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @w("LOCK")
    public static final i<String, ArrayList<u0.b<C0101e>>> f10234d = new i<>();

    public class a implements Callable<C0101e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f10236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q0.d f10237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f10238d;

        public a(String str, Context context, q0.d dVar, int i4) {
            this.f10235a = str;
            this.f10236b = context;
            this.f10237c = dVar;
            this.f10238d = i4;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0101e call() {
            return e.c(this.f10235a, this.f10236b, this.f10237c, this.f10238d);
        }
    }

    public class b implements u0.b<C0101e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0.a f10239a;

        public b(q0.a aVar) {
            this.f10239a = aVar;
        }

        @Override // u0.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C0101e c0101e) {
            this.f10239a.b(c0101e);
        }
    }

    public class c implements Callable<C0101e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f10241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q0.d f10242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f10243d;

        public c(String str, Context context, q0.d dVar, int i4) {
            this.f10240a = str;
            this.f10241b = context;
            this.f10242c = dVar;
            this.f10243d = i4;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0101e call() {
            return e.c(this.f10240a, this.f10241b, this.f10242c, this.f10243d);
        }
    }

    public class d implements u0.b<C0101e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10244a;

        public d(String str) {
            this.f10244a = str;
        }

        @Override // u0.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C0101e c0101e) {
            synchronized (e.f10233c) {
                i<String, ArrayList<u0.b<C0101e>>> iVar = e.f10234d;
                ArrayList<u0.b<C0101e>> arrayList = iVar.get(this.f10244a);
                if (arrayList == null) {
                    return;
                }
                iVar.remove(this.f10244a);
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    arrayList.get(i4).a(c0101e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q0.e$e, reason: collision with other inner class name */
    public static final class C0101e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Typeface f10245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10246b;

        public C0101e(int i4) {
            this.f10245a = null;
            this.f10246b = i4;
        }

        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.f10246b == 0;
        }

        @SuppressLint({"WrongConstant"})
        public C0101e(@j0 Typeface typeface) {
            this.f10245a = typeface;
            this.f10246b = 0;
        }
    }

    public static String a(@j0 q0.d dVar, int i4) {
        return dVar.d() + "-" + i4;
    }

    @SuppressLint({"WrongConstant"})
    public static int b(@j0 f.b bVar) {
        int i4 = 1;
        if (bVar.c() != 0) {
            return bVar.c() != 1 ? -3 : -2;
        }
        f.c[] cVarArrB = bVar.b();
        if (cVarArrB != null && cVarArrB.length != 0) {
            i4 = 0;
            for (f.c cVar : cVarArrB) {
                int iB = cVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i4;
    }

    @j0
    public static C0101e c(@j0 String str, @j0 Context context, @j0 q0.d dVar, int i4) {
        p.g<String, Typeface> gVar = f10231a;
        Typeface typefaceF = gVar.f(str);
        if (typefaceF != null) {
            return new C0101e(typefaceF);
        }
        try {
            f.b bVarD = q0.c.d(context, dVar, null);
            int iB = b(bVarD);
            if (iB != 0) {
                return new C0101e(iB);
            }
            Typeface typefaceC = y0.c(context, null, bVarD.b(), i4);
            if (typefaceC == null) {
                return new C0101e(-3);
            }
            gVar.j(str, typefaceC);
            return new C0101e(typefaceC);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0101e(-1);
        }
    }

    public static Typeface d(@j0 Context context, @j0 q0.d dVar, int i4, @k0 Executor executor, @j0 q0.a aVar) {
        String strA = a(dVar, i4);
        Typeface typefaceF = f10231a.f(strA);
        if (typefaceF != null) {
            aVar.b(new C0101e(typefaceF));
            return typefaceF;
        }
        b bVar = new b(aVar);
        synchronized (f10233c) {
            i<String, ArrayList<u0.b<C0101e>>> iVar = f10234d;
            ArrayList<u0.b<C0101e>> arrayList = iVar.get(strA);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<u0.b<C0101e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            iVar.put(strA, arrayList2);
            c cVar = new c(strA, context, dVar, i4);
            if (executor == null) {
                executor = f10232b;
            }
            g.c(executor, cVar, new d(strA));
            return null;
        }
    }

    public static Typeface e(@j0 Context context, @j0 q0.d dVar, @j0 q0.a aVar, int i4, int i5) {
        String strA = a(dVar, i4);
        Typeface typefaceF = f10231a.f(strA);
        if (typefaceF != null) {
            aVar.b(new C0101e(typefaceF));
            return typefaceF;
        }
        if (i5 == -1) {
            C0101e c0101eC = c(strA, context, dVar, i4);
            aVar.b(c0101eC);
            return c0101eC.f10245a;
        }
        try {
            C0101e c0101e = (C0101e) g.d(f10232b, new a(strA, context, dVar, i4), i5);
            aVar.b(c0101e);
            return c0101e.f10245a;
        } catch (InterruptedException unused) {
            aVar.b(new C0101e(-3));
            return null;
        }
    }

    public static void f() {
        f10231a.d();
    }
}
