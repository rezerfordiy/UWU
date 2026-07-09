package androidx.core.app;

import a0.e4;
import a0.f4;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import c.j0;
import c.o0;
import c.r0;
import t1.h;
import u0.i;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteActionCompat implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP})
    public IconCompat f3371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP})
    public CharSequence f3372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP})
    public CharSequence f3373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP})
    public PendingIntent f3374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP})
    public boolean f3375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP})
    public boolean f3376f;

    @r0({r0.a.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    @o0(26)
    @j0
    public static RemoteActionCompat a(@j0 RemoteAction remoteAction) {
        i.g(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.g(remoteAction.getIcon()), remoteAction.getTitle(), remoteAction.getContentDescription(), remoteAction.getActionIntent());
        remoteActionCompat.g(remoteAction.isEnabled());
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.h(remoteAction.shouldShowIcon());
        }
        return remoteActionCompat;
    }

    @j0
    public PendingIntent b() {
        return this.f3374d;
    }

    @j0
    public CharSequence c() {
        return this.f3373c;
    }

    @j0
    public IconCompat d() {
        return this.f3371a;
    }

    @j0
    public CharSequence e() {
        return this.f3372b;
    }

    public boolean f() {
        return this.f3375e;
    }

    public void g(boolean z3) {
        this.f3375e = z3;
    }

    public void h(boolean z3) {
        this.f3376f = z3;
    }

    public boolean i() {
        return this.f3376f;
    }

    @o0(26)
    @j0
    public RemoteAction j() {
        f4.a();
        RemoteAction remoteActionA = e4.a(this.f3371a.J(), this.f3372b, this.f3373c, this.f3374d);
        remoteActionA.setEnabled(f());
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionA.setShouldShowIcon(i());
        }
        return remoteActionA;
    }

    public RemoteActionCompat(@j0 RemoteActionCompat remoteActionCompat) {
        i.g(remoteActionCompat);
        this.f3371a = remoteActionCompat.f3371a;
        this.f3372b = remoteActionCompat.f3372b;
        this.f3373c = remoteActionCompat.f3373c;
        this.f3374d = remoteActionCompat.f3374d;
        this.f3375e = remoteActionCompat.f3375e;
        this.f3376f = remoteActionCompat.f3376f;
    }

    public RemoteActionCompat(@j0 IconCompat iconCompat, @j0 CharSequence charSequence, @j0 CharSequence charSequence2, @j0 PendingIntent pendingIntent) {
        this.f3371a = (IconCompat) i.g(iconCompat);
        this.f3372b = (CharSequence) i.g(charSequence);
        this.f3373c = (CharSequence) i.g(charSequence2);
        this.f3374d = (PendingIntent) i.g(pendingIntent);
        this.f3375e = true;
        this.f3376f = true;
    }
}
