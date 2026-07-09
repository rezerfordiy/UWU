package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import c.j0;
import c.o0;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f968a = "ResourcesFlusher";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Class<?> f971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Field f975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f976i;

    public static void a(@j0 Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        d(resources);
    }

    @o0(21)
    public static void b(@j0 Resources resources) {
        Map map;
        if (!f970c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f969b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e(f968a, "Could not retrieve Resources#mDrawableCache field", e4);
            }
            f970c = true;
        }
        Field field = f969b;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e5) {
                Log.e(f968a, "Could not retrieve value from Resources#mDrawableCache", e5);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    @o0(23)
    public static void c(@j0 Resources resources) {
        Object obj;
        if (!f970c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f969b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e(f968a, "Could not retrieve Resources#mDrawableCache field", e4);
            }
            f970c = true;
        }
        Field field = f969b;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e5) {
                Log.e(f968a, "Could not retrieve value from Resources#mDrawableCache", e5);
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    @o0(24)
    public static void d(@j0 Resources resources) {
        Object obj;
        if (!f976i) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f975h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e(f968a, "Could not retrieve Resources#mResourcesImpl field", e4);
            }
            f976i = true;
        }
        Field field = f975h;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e5) {
            Log.e(f968a, "Could not retrieve value from Resources#mResourcesImpl", e5);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f970c) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f969b = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e6) {
                Log.e(f968a, "Could not retrieve ResourcesImpl#mDrawableCache field", e6);
            }
            f970c = true;
        }
        Field field2 = f969b;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e7) {
                Log.e(f968a, "Could not retrieve value from ResourcesImpl#mDrawableCache", e7);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    @o0(16)
    public static void e(@j0 Object obj) {
        LongSparseArray longSparseArray;
        if (!f972e) {
            try {
                f971d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e4) {
                Log.e(f968a, "Could not find ThemedResourceCache class", e4);
            }
            f972e = true;
        }
        Class<?> cls = f971d;
        if (cls == null) {
            return;
        }
        if (!f974g) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f973f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                Log.e(f968a, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e5);
            }
            f974g = true;
        }
        Field field = f973f;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e6) {
            Log.e(f968a, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e6);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
