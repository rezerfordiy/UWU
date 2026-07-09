package v0;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import c.r0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f11992f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f11993g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f11994h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f11995i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f11996j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @c.j0
    public final ClipData f11997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @c.k0
    public final Uri f12000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @c.k0
    public final Bundle f12001e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @c.j0
        public ClipData f12002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @c.k0
        public Uri f12005d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @c.k0
        public Bundle f12006e;

        public a(@c.j0 ClipData clipData, int i4) {
            this.f12002a = clipData;
            this.f12003b = i4;
        }

        @c.j0
        public c a() {
            return new c(this);
        }

        @c.j0
        public a b(@c.j0 ClipData clipData) {
            this.f12002a = clipData;
            return this;
        }

        @c.j0
        public a c(@c.k0 Bundle bundle) {
            this.f12006e = bundle;
            return this;
        }

        @c.j0
        public a d(int i4) {
            this.f12004c = i4;
            return this;
        }

        @c.j0
        public a e(@c.k0 Uri uri) {
            this.f12005d = uri;
            return this;
        }

        @c.j0
        public a f(int i4) {
            this.f12003b = i4;
            return this;
        }

        public a(@c.j0 c cVar) {
            this.f12002a = cVar.f11997a;
            this.f12003b = cVar.f11998b;
            this.f12004c = cVar.f11999c;
            this.f12005d = cVar.f12000d;
            this.f12006e = cVar.f12001e;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    /* JADX INFO: renamed from: v0.c$c, reason: collision with other inner class name */
    @Retention(RetentionPolicy.SOURCE)
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface InterfaceC0122c {
    }

    public c(a aVar) {
        this.f11997a = (ClipData) u0.i.g(aVar.f12002a);
        this.f11998b = u0.i.c(aVar.f12003b, 0, 3, "source");
        this.f11999c = u0.i.f(aVar.f12004c, 1);
        this.f12000d = aVar.f12005d;
        this.f12001e = aVar.f12006e;
    }

    public static ClipData a(ClipDescription clipDescription, List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i4 = 1; i4 < list.size(); i4++) {
            clipData.addItem(list.get(i4));
        }
        return clipData;
    }

    @c.j0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static String b(int i4) {
        return (i4 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i4);
    }

    @c.j0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static String i(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? String.valueOf(i4) : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    @c.j0
    public ClipData c() {
        return this.f11997a;
    }

    @c.k0
    public Bundle d() {
        return this.f12001e;
    }

    public int e() {
        return this.f11999c;
    }

    @c.k0
    public Uri f() {
        return this.f12000d;
    }

    public int g() {
        return this.f11998b;
    }

    @c.j0
    public Pair<c, c> h(@c.j0 u0.j<ClipData.Item> jVar) {
        if (this.f11997a.getItemCount() == 1) {
            boolean zA = jVar.a(this.f11997a.getItemAt(0));
            return Pair.create(zA ? this : null, zA ? null : this);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < this.f11997a.getItemCount(); i4++) {
            ClipData.Item itemAt = this.f11997a.getItemAt(i4);
            if (jVar.a(itemAt)) {
                arrayList.add(itemAt);
            } else {
                arrayList2.add(itemAt);
            }
        }
        return arrayList.isEmpty() ? Pair.create(null, this) : arrayList2.isEmpty() ? Pair.create(this, null) : Pair.create(new a(this).b(a(this.f11997a.getDescription(), arrayList)).a(), new a(this).b(a(this.f11997a.getDescription(), arrayList2)).a());
    }

    @c.j0
    public String toString() {
        return "ContentInfoCompat{clip=" + this.f11997a + ", source=" + i(this.f11998b) + ", flags=" + b(this.f11999c) + ", linkUri=" + this.f12000d + ", extras=" + this.f12001e + "}";
    }
}
