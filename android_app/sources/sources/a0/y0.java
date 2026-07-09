package a0;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public class y0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f470s = "miscellaneous";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f471t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f472u = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @c.j0
    public final String f473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioAttributes f480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long[] f484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f490r;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y0 f491a;

        public a(@c.j0 String str, int i4) {
            this.f491a = new y0(str, i4);
        }

        @c.j0
        public y0 a() {
            return this.f491a;
        }

        @c.j0
        public a b(@c.j0 String str, @c.j0 String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                y0 y0Var = this.f491a;
                y0Var.f485m = str;
                y0Var.f486n = str2;
            }
            return this;
        }

        @c.j0
        public a c(@c.k0 String str) {
            this.f491a.f476d = str;
            return this;
        }

        @c.j0
        public a d(@c.k0 String str) {
            this.f491a.f477e = str;
            return this;
        }

        @c.j0
        public a e(int i4) {
            this.f491a.f475c = i4;
            return this;
        }

        @c.j0
        public a f(int i4) {
            this.f491a.f482j = i4;
            return this;
        }

        @c.j0
        public a g(boolean z3) {
            this.f491a.f481i = z3;
            return this;
        }

        @c.j0
        public a h(@c.k0 CharSequence charSequence) {
            this.f491a.f474b = charSequence;
            return this;
        }

        @c.j0
        public a i(boolean z3) {
            this.f491a.f478f = z3;
            return this;
        }

        @c.j0
        public a j(@c.k0 Uri uri, @c.k0 AudioAttributes audioAttributes) {
            y0 y0Var = this.f491a;
            y0Var.f479g = uri;
            y0Var.f480h = audioAttributes;
            return this;
        }

        @c.j0
        public a k(boolean z3) {
            this.f491a.f483k = z3;
            return this;
        }

        @c.j0
        public a l(@c.k0 long[] jArr) {
            y0 y0Var = this.f491a;
            y0Var.f483k = jArr != null && jArr.length > 0;
            y0Var.f484l = jArr;
            return this;
        }
    }

    @c.o0(26)
    public y0(@c.j0 NotificationChannel notificationChannel) {
        this(notificationChannel.getId(), notificationChannel.getImportance());
        this.f474b = notificationChannel.getName();
        this.f476d = notificationChannel.getDescription();
        this.f477e = notificationChannel.getGroup();
        this.f478f = notificationChannel.canShowBadge();
        this.f479g = notificationChannel.getSound();
        this.f480h = notificationChannel.getAudioAttributes();
        this.f481i = notificationChannel.shouldShowLights();
        this.f482j = notificationChannel.getLightColor();
        this.f483k = notificationChannel.shouldVibrate();
        this.f484l = notificationChannel.getVibrationPattern();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            this.f485m = notificationChannel.getParentChannelId();
            this.f486n = notificationChannel.getConversationId();
        }
        this.f487o = notificationChannel.canBypassDnd();
        this.f488p = notificationChannel.getLockscreenVisibility();
        if (i4 >= 29) {
            this.f489q = notificationChannel.canBubble();
        }
        if (i4 >= 30) {
            this.f490r = notificationChannel.isImportantConversation();
        }
    }

    public boolean a() {
        return this.f489q;
    }

    public boolean b() {
        return this.f487o;
    }

    public boolean c() {
        return this.f478f;
    }

    @c.k0
    public AudioAttributes d() {
        return this.f480h;
    }

    @c.k0
    public String e() {
        return this.f486n;
    }

    @c.k0
    public String f() {
        return this.f476d;
    }

    @c.k0
    public String g() {
        return this.f477e;
    }

    @c.j0
    public String h() {
        return this.f473a;
    }

    public int i() {
        return this.f475c;
    }

    public int j() {
        return this.f482j;
    }

    public int k() {
        return this.f488p;
    }

    @c.k0
    public CharSequence l() {
        return this.f474b;
    }

    public NotificationChannel m() {
        String str;
        String str2;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            return null;
        }
        p0.a();
        NotificationChannel notificationChannelA = o0.a(this.f473a, this.f474b, this.f475c);
        notificationChannelA.setDescription(this.f476d);
        notificationChannelA.setGroup(this.f477e);
        notificationChannelA.setShowBadge(this.f478f);
        notificationChannelA.setSound(this.f479g, this.f480h);
        notificationChannelA.enableLights(this.f481i);
        notificationChannelA.setLightColor(this.f482j);
        notificationChannelA.setVibrationPattern(this.f484l);
        notificationChannelA.enableVibration(this.f483k);
        if (i4 >= 30 && (str = this.f485m) != null && (str2 = this.f486n) != null) {
            notificationChannelA.setConversationId(str, str2);
        }
        return notificationChannelA;
    }

    @c.k0
    public String n() {
        return this.f485m;
    }

    @c.k0
    public Uri o() {
        return this.f479g;
    }

    @c.k0
    public long[] p() {
        return this.f484l;
    }

    public boolean q() {
        return this.f490r;
    }

    public boolean r() {
        return this.f481i;
    }

    public boolean s() {
        return this.f483k;
    }

    @c.j0
    public a t() {
        return new a(this.f473a, this.f475c).h(this.f474b).c(this.f476d).d(this.f477e).i(this.f478f).j(this.f479g, this.f480h).g(this.f481i).f(this.f482j).k(this.f483k).l(this.f484l).b(this.f485m, this.f486n);
    }

    public y0(@c.j0 String str, int i4) {
        this.f478f = true;
        this.f479g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f482j = 0;
        this.f473a = (String) u0.i.g(str);
        this.f475c = i4;
        this.f480h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }
}
