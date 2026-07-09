package q0;

import android.os.Handler;
import android.os.Looper;
import c.j0;

/* JADX INFO: loaded from: classes.dex */
public class b {
    @j0
    public static Handler a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
