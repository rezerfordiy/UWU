package g0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import c.r0;
import d0.d;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import q0.f;

/* JADX INFO: loaded from: classes.dex */
@c.o0(24)
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class a1 extends e1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f7739d = "TypefaceCompatApi24Impl";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f7740e = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f7741f = "addFontWeightStyle";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f7742g = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Class<?> f7743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Constructor<?> f7744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Method f7745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Method f7746k;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e(f7739d, e4.getClass().getName(), e4);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f7744i = constructor;
        f7743h = cls;
        f7745j = method2;
        f7746k = method;
    }

    public static boolean k(Object obj, ByteBuffer byteBuffer, int i4, int i5, boolean z3) {
        try {
            return ((Boolean) f7745j.invoke(obj, byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i5), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface l(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(f7743h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f7746k.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean m() {
        Method method = f7745j;
        if (method == null) {
            Log.w(f7739d, "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    public static Object n() {
        try {
            return f7744i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // g0.e1
    @c.k0
    public Typeface b(Context context, d.c cVar, Resources resources, int i4) {
        Object objN = n();
        if (objN == null) {
            return null;
        }
        for (d.C0053d c0053d : cVar.a()) {
            ByteBuffer byteBufferB = f1.b(context, resources, c0053d.b());
            if (byteBufferB == null || !k(objN, byteBufferB, c0053d.c(), c0053d.e(), c0053d.f())) {
                return null;
            }
        }
        return l(objN);
    }

    @Override // g0.e1
    @c.k0
    public Typeface c(Context context, @c.k0 CancellationSignal cancellationSignal, @c.j0 f.c[] cVarArr, int i4) {
        Object objN = n();
        if (objN == null) {
            return null;
        }
        p.i iVar = new p.i();
        for (f.c cVar : cVarArr) {
            Uri uriD = cVar.d();
            ByteBuffer byteBufferF = (ByteBuffer) iVar.get(uriD);
            if (byteBufferF == null) {
                byteBufferF = f1.f(context, cancellationSignal, uriD);
                iVar.put(uriD, byteBufferF);
            }
            if (byteBufferF == null || !k(objN, byteBufferF, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        Typeface typefaceL = l(objN);
        if (typefaceL == null) {
            return null;
        }
        return Typeface.create(typefaceL, i4);
    }
}
