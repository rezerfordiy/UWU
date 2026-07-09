package p0;

import android.content.Context;
import android.os.UserManager;
import c.j0;

/* JADX INFO: loaded from: classes.dex */
public class x {
    public static boolean a(@j0 Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
