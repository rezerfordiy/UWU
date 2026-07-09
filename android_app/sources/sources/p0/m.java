package p0;

import android.annotation.SuppressLint;
import android.os.Message;
import c.j0;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f10063a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f10064b = true;

    @SuppressLint({"NewApi"})
    public static boolean a(@j0 Message message) {
        return message.isAsynchronous();
    }

    @SuppressLint({"NewApi"})
    public static void b(@j0 Message message, boolean z3) {
        message.setAsynchronous(z3);
    }
}
