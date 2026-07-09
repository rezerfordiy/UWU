package g0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import c.r0;
import d0.d;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import q0.f;

/* JADX INFO: loaded from: classes.dex */
@c.o0(26)
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class b1 extends z0 {
    public static final int A = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f7747t = "TypefaceCompatApi26Impl";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f7748u = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f7749v = "addFontFromAssetManager";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f7750w = "addFontFromBuffer";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f7751x = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f7752y = "freeze";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f7753z = "abortCreation";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Class<?> f7754m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Constructor<?> f7755n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Method f7756o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Method f7757p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Method f7758q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Method f7759r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Method f7760s;

    public b1() {
        Class<?> clsY;
        Constructor<?> constructorZ;
        Method methodV;
        Method methodW;
        Method methodA;
        Method methodU;
        Method methodX;
        try {
            clsY = y();
            constructorZ = z(clsY);
            methodV = v(clsY);
            methodW = w(clsY);
            methodA = A(clsY);
            methodU = u(clsY);
            methodX = x(clsY);
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e(f7747t, "Unable to collect necessary methods for class " + e4.getClass().getName(), e4);
            clsY = null;
            constructorZ = null;
            methodV = null;
            methodW = null;
            methodA = null;
            methodU = null;
            methodX = null;
        }
        this.f7754m = clsY;
        this.f7755n = constructorZ;
        this.f7756o = methodV;
        this.f7757p = methodW;
        this.f7758q = methodA;
        this.f7759r = methodU;
        this.f7760s = methodX;
    }

    @c.k0
    private Object o() {
        try {
            return this.f7755n.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method A(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f7752y, new Class[0]);
    }

    @Override // g0.z0, g0.e1
    @c.k0
    public Typeface b(Context context, d.c cVar, Resources resources, int i4) {
        if (!t()) {
            return super.b(context, cVar, resources, i4);
        }
        Object objO = o();
        if (objO == null) {
            return null;
        }
        for (d.C0053d c0053d : cVar.a()) {
            if (!q(context, objO, c0053d.a(), c0053d.c(), c0053d.e(), c0053d.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0053d.d()))) {
                p(objO);
                return null;
            }
        }
        if (s(objO)) {
            return l(objO);
        }
        return null;
    }

    @Override // g0.z0, g0.e1
    @c.k0
    public Typeface c(Context context, @c.k0 CancellationSignal cancellationSignal, @c.j0 f.c[] cVarArr, int i4) {
        Typeface typefaceL;
        if (cVarArr.length < 1) {
            return null;
        }
        if (!t()) {
            f.c cVarH = h(cVarArr, i4);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(cVarH.d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(cVarH.e()).setItalic(cVarH.f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapH = f1.h(context, cVarArr, cancellationSignal);
        Object objO = o();
        if (objO == null) {
            return null;
        }
        boolean z3 = false;
        for (f.c cVar : cVarArr) {
            ByteBuffer byteBuffer = mapH.get(cVar.d());
            if (byteBuffer != null) {
                if (!r(objO, byteBuffer, cVar.c(), cVar.e(), cVar.f() ? 1 : 0)) {
                    p(objO);
                    return null;
                }
                z3 = true;
            }
        }
        if (!z3) {
            p(objO);
            return null;
        }
        if (s(objO) && (typefaceL = l(objO)) != null) {
            return Typeface.create(typefaceL, i4);
        }
        return null;
    }

    @Override // g0.e1
    @c.k0
    public Typeface e(Context context, Resources resources, int i4, String str, int i5) {
        if (!t()) {
            return super.e(context, resources, i4, str, i5);
        }
        Object objO = o();
        if (objO == null) {
            return null;
        }
        if (!q(context, objO, str, 0, -1, -1, null)) {
            p(objO);
            return null;
        }
        if (s(objO)) {
            return l(objO);
        }
        return null;
    }

    @c.k0
    public Typeface l(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f7754m, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f7760s.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void p(Object obj) {
        try {
            this.f7759r.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean q(Context context, Object obj, String str, int i4, int i5, int i6, @c.k0 FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f7756o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean r(Object obj, ByteBuffer byteBuffer, int i4, int i5, int i6) {
        try {
            return ((Boolean) this.f7757p.invoke(obj, byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i5), Integer.valueOf(i6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean s(Object obj) {
        try {
            return ((Boolean) this.f7758q.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean t() {
        if (this.f7756o == null) {
            Log.w(f7747t, "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f7756o != null;
    }

    public Method u(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f7753z, new Class[0]);
    }

    public Method v(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(f7749v, AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method w(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(f7750w, ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class<?> y() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor<?> z(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }
}
