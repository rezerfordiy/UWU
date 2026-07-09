package b0;

import android.content.LocusId;
import android.os.Build;
import c.j0;
import c.k0;
import c.o0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocusId f4337b;

    @o0(29)
    public static class a {
        @j0
        public static LocusId a(@j0 String str) {
            return new LocusId(str);
        }

        @j0
        public static String b(@j0 LocusId locusId) {
            return locusId.getId();
        }
    }

    public g(@j0 String str) {
        this.f4336a = (String) u0.i.l(str, "id cannot be empty");
        this.f4337b = Build.VERSION.SDK_INT >= 29 ? a.a(str) : null;
    }

    @o0(29)
    @j0
    public static g d(@j0 LocusId locusId) {
        u0.i.h(locusId, "locusId cannot be null");
        return new g((String) u0.i.l(a.b(locusId), "id cannot be empty"));
    }

    @j0
    public String a() {
        return this.f4336a;
    }

    @j0
    public final String b() {
        return this.f4336a.length() + "_chars";
    }

    @o0(29)
    @j0
    public LocusId c() {
        return this.f4337b;
    }

    public boolean equals(@k0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        String str = this.f4336a;
        String str2 = ((g) obj).f4336a;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        String str = this.f4336a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @j0
    public String toString() {
        return "LocusIdCompat[" + b() + "]";
    }
}
