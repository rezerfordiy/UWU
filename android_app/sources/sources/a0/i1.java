package a0;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f88b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f89c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f90d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<y0> f91e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i1 f92a;

        public a(@c.j0 String str) {
            this.f92a = new i1(str);
        }

        @c.j0
        public i1 a() {
            return this.f92a;
        }

        @c.j0
        public a b(@c.k0 String str) {
            this.f92a.f89c = str;
            return this;
        }

        @c.j0
        public a c(@c.k0 CharSequence charSequence) {
            this.f92a.f88b = charSequence;
            return this;
        }
    }

    @c.o0(28)
    public i1(@c.j0 NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    @c.j0
    public List<y0> a() {
        return this.f91e;
    }

    @c.o0(26)
    public final List<y0> b(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationChannel> it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannelA = f1.a(it.next());
            if (this.f87a.equals(notificationChannelA.getGroup())) {
                arrayList.add(new y0(notificationChannelA));
            }
        }
        return arrayList;
    }

    @c.k0
    public String c() {
        return this.f89c;
    }

    @c.j0
    public String d() {
        return this.f87a;
    }

    @c.k0
    public CharSequence e() {
        return this.f88b;
    }

    public NotificationChannelGroup f() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            return null;
        }
        h1.a();
        NotificationChannelGroup notificationChannelGroupA = g1.a(this.f87a, this.f88b);
        if (i4 >= 28) {
            notificationChannelGroupA.setDescription(this.f89c);
        }
        return notificationChannelGroupA;
    }

    public boolean g() {
        return this.f90d;
    }

    @c.j0
    public a h() {
        return new a(this.f87a).c(this.f88b).b(this.f89c);
    }

    @c.o0(26)
    public i1(@c.j0 NotificationChannelGroup notificationChannelGroup, @c.j0 List<NotificationChannel> list) {
        List<y0> listB;
        this(notificationChannelGroup.getId());
        this.f88b = notificationChannelGroup.getName();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            this.f89c = notificationChannelGroup.getDescription();
        }
        if (i4 >= 28) {
            this.f90d = notificationChannelGroup.isBlocked();
            listB = b(notificationChannelGroup.getChannels());
        } else {
            listB = b(list);
        }
        this.f91e = listB;
    }

    public i1(@c.j0 String str) {
        this.f91e = Collections.emptyList();
        this.f87a = (String) u0.i.g(str);
    }
}
