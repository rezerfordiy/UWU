package g0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import c.r0;
import d0.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import q0.f;

/* JADX INFO: loaded from: classes.dex */
@c.o0(21)
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class z0 extends e1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f7822d = "TypefaceCompatApi21Impl";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f7823e = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f7824f = "addFontWeightStyle";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f7825g = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Class<?> f7826h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Constructor<?> f7827i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Method f7828j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Method f7829k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f7830l = false;

    public static boolean k(Object obj, String str, int i4, boolean z3) {
        n();
        try {
            return ((Boolean) f7828j.invoke(obj, str, Integer.valueOf(i4), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static Typeface l(Object obj) {
        n();
        try {
            Object objNewInstance = Array.newInstance(f7826h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f7829k.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void n() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f7830l) {
            return;
        }
        f7830l = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e(f7822d, e4.getClass().getName(), e4);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f7827i = constructor;
        f7826h = cls;
        f7828j = method2;
        f7829k = method;
    }

    public static Object o() {
        n();
        try {
            return f7827i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // g0.e1
    public Typeface b(Context context, d.c cVar, Resources resources, int i4) {
        Object objO = o();
        for (d.C0053d c0053d : cVar.a()) {
            File fileE = f1.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!f1.c(fileE, resources, c0053d.b())) {
                    return null;
                }
                if (!k(objO, fileE.getPath(), c0053d.e(), c0053d.f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileE.delete();
            }
        }
        return l(objO);
    }

    @Override // g0.e1
    public Typeface c(Context context, CancellationSignal cancellationSignal, @c.j0 f.c[] cVarArr, int i4) {
        if (cVarArr.length < 1) {
            return null;
        }
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
                File fileM = m(parcelFileDescriptorOpenFileDescriptor);
                if (fileM != null && fileM.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileM);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceD = super.d(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceD;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final File m(@c.j0 ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
