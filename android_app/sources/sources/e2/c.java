package e2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.sonoptek.pvus_android.MyApplication;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f7620a = "sp_config.cfg";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SharedPreferences f7621b;

    public static void A(Context context, String str, Object obj) {
        if (f7621b == null) {
            f7621b = context.getSharedPreferences(f7620a, 0);
        }
        if (obj == null) {
            return;
        }
        if (!(obj instanceof Serializable)) {
            throw new IllegalArgumentException("The object should implements Serializable!");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
            B(context, str, new String(Base64.encode(byteArrayOutputStream.toByteArray(), 0)));
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    public static synchronized void B(Context context, String str, String str2) {
        if (f7621b == null) {
            f7621b = context.getSharedPreferences(f7620a, 0);
        }
        f7621b.edit().putString(str, str2).commit();
    }

    public static synchronized void C(String str, String str2) {
        if (f7621b == null) {
            f7621b = MyApplication.p().getSharedPreferences(f7620a, 0);
        }
        f7621b.edit().putString(str, str2).commit();
    }

    public static boolean a(Context context, String str) {
        if (f7621b == null) {
            f7621b = context.getSharedPreferences(f7620a, 0);
        }
        return f7621b.getBoolean(str, false);
    }

    public static boolean b(Context context, String str, boolean z3) {
        if (f7621b == null) {
            f7621b = context.getSharedPreferences(f7620a, 0);
        }
        return f7621b.getBoolean(str, z3);
    }

    public static boolean c(String str) {
        if (f7621b == null) {
            f7621b = MyApplication.p().getSharedPreferences(f7620a, 0);
        }
        return f7621b.getBoolean(str, false);
    }

    public static boolean d(String str, boolean z3) {
        if (f7621b == null) {
            f7621b = MyApplication.p().getSharedPreferences(f7620a, 0);
        }
        return f7621b.getBoolean(str, z3);
    }

    public static float e(Context context, String str) {
        if (f7621b == null) {
            f7621b = context.getSharedPreferences(f7620a, 0);
        }
        return f7621b.getFloat(str, -1.0f);
    }

    public static float f(Context context, String str, float f4) {
        if (f7621b == null) {
            f7621b = context.getSharedPreferences(f7620a, 0);
        }
        return f7621b.getFloat(str, f4);
    }

    public static float g(String str) {
        if (f7621b == null) {
            f7621b = MyApplication.p().getSharedPreferences(f7620a, 0);
        }
        return f7621b.getFloat(str, -1.0f);
    }

    public static int h(Context context, String str) {
        if (f7621b == null) {
            f7621b = context.getSharedPreferences(f7620a, 0);
        }
        return f7621b.getInt(str, -1);
    }

    public static int i(Context context, String str, int i4) {
        if (f7621b == null) {
            f7621b = context.getSharedPreferences(f7620a, 0);
        }
        return f7621b.getInt(str, i4);
    }

    public static int j(String str) {
        if (f7621b == null) {
            f7621b = MyApplication.p().getSharedPreferences(f7620a, 0);
        }
        return f7621b.getInt(str, -1);
    }

    public static long k(Context context, String str, long j4) {
        if (f7621b == null) {
            f7621b = context.getSharedPreferences(f7620a, 0);
        }
        return f7621b.getLong(str, j4);
    }

    public static long l(String str) {
        if (f7621b == null) {
            f7621b = MyApplication.p().getSharedPreferences(f7620a, 0);
        }
        return f7621b.getLong(str, -1L);
    }

    public static long m(String str, long j4) {
        if (f7621b == null) {
            f7621b = MyApplication.p().getSharedPreferences(f7620a, 0);
        }
        return f7621b.getLong(str, j4);
    }

    public static Object n(Context context, String str) {
        if (f7621b == null) {
            f7621b = context.getSharedPreferences(f7620a, 0);
        }
        String string = f7621b.getString(str, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return new ObjectInputStream(new ByteArrayInputStream(Base64.decode(string, 0))).readObject();
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static String o(Context context, String str) {
        if (f7621b == null) {
            f7621b = context.getSharedPreferences(f7620a, 0);
        }
        return f7621b.getString(str, s0.a.f11071l);
    }

    public static String p(Context context, String str, String str2) {
        if (f7621b == null) {
            f7621b = context.getSharedPreferences(f7620a, 0);
        }
        return f7621b.getString(str, str2);
    }

    public static String q(String str) {
        if (f7621b == null) {
            f7621b = MyApplication.p().getSharedPreferences(f7620a, 0);
        }
        return f7621b.getString(str, s0.a.f11071l);
    }

    public static String r(String str, String str2) {
        if (f7621b == null) {
            f7621b = MyApplication.p().getSharedPreferences(f7620a, 0);
        }
        return f7621b.getString(str, str2);
    }

    public static void s(Context context, String str) {
        if (f7621b == null) {
            f7621b = context.getSharedPreferences(f7620a, 0);
        }
        f7621b.edit().remove(str).commit();
    }

    public static void t(Context context, String str, boolean z3) {
        if (f7621b == null) {
            f7621b = context.getSharedPreferences(f7620a, 0);
        }
        f7621b.edit().putBoolean(str, z3).commit();
    }

    public static void u(String str, boolean z3) {
        if (f7621b == null) {
            f7621b = MyApplication.p().getSharedPreferences(f7620a, 0);
        }
        f7621b.edit().putBoolean(str, z3).commit();
    }

    public static void v(Context context, String str, float f4) {
        if (f7621b == null) {
            f7621b = MyApplication.p().getSharedPreferences(f7620a, 0);
        }
        f7621b.edit().putFloat(str, f4).commit();
    }

    public static void w(Context context, String str, int i4) {
        if (f7621b == null) {
            f7621b = context.getSharedPreferences(f7620a, 0);
        }
        f7621b.edit().putInt(str, i4).commit();
    }

    public static void x(String str, int i4) {
        if (f7621b == null) {
            f7621b = MyApplication.p().getSharedPreferences(f7620a, 0);
        }
        f7621b.edit().putInt(str, i4).commit();
    }

    public static void y(Context context, String str, long j4) {
        if (f7621b == null) {
            f7621b = context.getSharedPreferences(f7620a, 0);
        }
        f7621b.edit().putLong(str, j4).commit();
    }

    public static void z(String str, long j4) {
        if (f7621b == null) {
            f7621b = MyApplication.p().getSharedPreferences(f7620a, 0);
        }
        f7621b.edit().putLong(str, j4).commit();
    }
}
