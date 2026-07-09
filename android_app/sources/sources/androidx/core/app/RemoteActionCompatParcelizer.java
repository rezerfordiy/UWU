package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import c.r0;
import t1.e;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(e eVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3371a = (IconCompat) eVar.h0(remoteActionCompat.f3371a, 1);
        remoteActionCompat.f3372b = eVar.w(remoteActionCompat.f3372b, 2);
        remoteActionCompat.f3373c = eVar.w(remoteActionCompat.f3373c, 3);
        remoteActionCompat.f3374d = (PendingIntent) eVar.W(remoteActionCompat.f3374d, 4);
        remoteActionCompat.f3375e = eVar.m(remoteActionCompat.f3375e, 5);
        remoteActionCompat.f3376f = eVar.m(remoteActionCompat.f3376f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, e eVar) {
        eVar.j0(false, false);
        eVar.m1(remoteActionCompat.f3371a, 1);
        eVar.z0(remoteActionCompat.f3372b, 2);
        eVar.z0(remoteActionCompat.f3373c, 3);
        eVar.X0(remoteActionCompat.f3374d, 4);
        eVar.n0(remoteActionCompat.f3375e, 5);
        eVar.n0(remoteActionCompat.f3376f, 6);
    }
}
