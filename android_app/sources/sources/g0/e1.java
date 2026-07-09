package g0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserView;
import c.r0;
import d0.d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import q0.f;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f7786b = "TypefaceCompatBaseImpl";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f7787c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, d.c> f7788a = new ConcurrentHashMap<>();

    public class a implements c<f.c> {
        public a() {
        }

        @Override // g0.e1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(f.c cVar) {
            return cVar.e();
        }

        @Override // g0.e1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(f.c cVar) {
            return cVar.f();
        }
    }

    public class b implements c<d.C0053d> {
        public b() {
        }

        @Override // g0.e1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(d.C0053d c0053d) {
            return c0053d.e();
        }

        @Override // g0.e1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(d.C0053d c0053d) {
            return c0053d.f();
        }
    }

    public interface c<T> {
        int a(T t4);

        boolean b(T t4);
    }

    public static <T> T g(T[] tArr, int i4, c<T> cVar) {
        int i5 = (i4 & 1) == 0 ? 400 : 700;
        boolean z3 = (i4 & 2) != 0;
        T t4 = null;
        int i6 = ActivityChooserView.f.f1331h;
        for (T t5 : tArr) {
            int iAbs = (Math.abs(cVar.a(t5) - i5) * 2) + (cVar.b(t5) == z3 ? 0 : 1);
            if (t4 == null || i6 > iAbs) {
                t4 = t5;
                i6 = iAbs;
            }
        }
        return t4;
    }

    public static long j(@c.k0 Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e4) {
            Log.e(f7786b, "Could not retrieve font from family.", e4);
            return 0L;
        } catch (NoSuchFieldException e5) {
            Log.e(f7786b, "Could not retrieve font from family.", e5);
            return 0L;
        }
    }

    public final void a(Typeface typeface, d.c cVar) {
        long j4 = j(typeface);
        if (j4 != 0) {
            this.f7788a.put(Long.valueOf(j4), cVar);
        }
    }

    @c.k0
    public Typeface b(Context context, d.c cVar, Resources resources, int i4) {
        d.C0053d c0053dF = f(cVar, i4);
        if (c0053dF == null) {
            return null;
        }
        Typeface typefaceE = y0.e(context, resources, c0053dF.b(), c0053dF.a(), i4);
        a(typefaceE, cVar);
        return typefaceE;
    }

    @c.k0
    public Typeface c(Context context, @c.k0 CancellationSignal cancellationSignal, @c.j0 f.c[] cVarArr, int i4) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (cVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(h(cVarArr, i4).d());
            try {
                Typeface typefaceD = d(context, inputStreamOpenInputStream);
                f1.a(inputStreamOpenInputStream);
                return typefaceD;
            } catch (IOException unused) {
                f1.a(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                f1.a(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface d(Context context, InputStream inputStream) {
        File fileE = f1.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (f1.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    @c.k0
    public Typeface e(Context context, Resources resources, int i4, String str, int i5) {
        File fileE = f1.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (f1.c(fileE, resources, i4)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public final d.C0053d f(d.c cVar, int i4) {
        return (d.C0053d) g(cVar.a(), i4, new b());
    }

    public f.c h(f.c[] cVarArr, int i4) {
        return (f.c) g(cVarArr, i4, new a());
    }

    @c.k0
    public d.c i(Typeface typeface) {
        long j4 = j(typeface);
        if (j4 == 0) {
            return null;
        }
        return this.f7788a.get(Long.valueOf(j4));
    }
}
