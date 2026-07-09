package n2;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public class o1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o1 f9509c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f9510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f9511b;

    public o1(Context context) {
        if (this.f9510a == null) {
            this.f9510a = context;
            this.f9511b = context.getSharedPreferences("com.sonoptek.smartuskit.preferences", 0);
        }
    }

    public static synchronized o1 d(Context context) {
        if (f9509c == null && context != null) {
            f9509c = new o1(context);
        }
        return f9509c;
    }

    public void a() {
        f9509c = null;
        this.f9510a = null;
    }

    public boolean b(String str, boolean z3) {
        return this.f9511b.getBoolean(str, z3);
    }

    public float c(String str, float f4) {
        return this.f9511b.getFloat(str, f4);
    }

    public int e(String str, int i4) {
        return this.f9511b.getInt(str, i4);
    }

    public String f(String str, String str2) {
        return this.f9511b.getString(str, str2);
    }

    public void g(String str, boolean z3) {
        SharedPreferences.Editor editorEdit = this.f9511b.edit();
        editorEdit.putBoolean(str, z3);
        editorEdit.commit();
    }

    public void h(String str, float f4) {
        SharedPreferences.Editor editorEdit = this.f9511b.edit();
        editorEdit.putFloat(str, f4);
        editorEdit.commit();
    }

    public void i(String str, int i4) {
        SharedPreferences.Editor editorEdit = this.f9511b.edit();
        editorEdit.putInt(str, i4);
        editorEdit.commit();
    }

    public void j(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f9511b.edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }
}
