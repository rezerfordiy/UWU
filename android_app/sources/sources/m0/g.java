package m0;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import c.r0;
import c.w;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY})
public class g extends a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f8537n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f8538o = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f8539p = 33;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f8540q = 64;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f8541r = -87;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f8542s = 64;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f8543t = 24;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f8544u = 193;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f8545v = 200;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f8546w = 200;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f8547x = 35;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GpsStatus f8548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @w("mWrapped")
    public int f8549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @w("mWrapped")
    public Iterator<GpsSatellite> f8550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @w("mWrapped")
    public int f8551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @w("mWrapped")
    public GpsSatellite f8552m;

    public g(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) u0.i.g(gpsStatus);
        this.f8548i = gpsStatus2;
        this.f8549j = -1;
        this.f8550k = gpsStatus2.getSatellites().iterator();
        this.f8551l = -1;
        this.f8552m = null;
    }

    public static int p(int i4) {
        if (i4 > 0 && i4 <= 32) {
            return 1;
        }
        if (i4 >= 33 && i4 <= 64) {
            return 2;
        }
        if (i4 > 64 && i4 <= 88) {
            return 3;
        }
        if (i4 <= 200 || i4 > 235) {
            return (i4 < 193 || i4 > 200) ? 0 : 4;
        }
        return 5;
    }

    public static int r(int i4) {
        int iP = p(i4);
        return iP != 2 ? iP != 3 ? iP != 5 ? i4 : i4 - 200 : i4 - 64 : i4 + 87;
    }

    @Override // m0.a
    public float a(int i4) {
        return q(i4).getAzimuth();
    }

    @Override // m0.a
    public float b(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // m0.a
    public float c(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // m0.a
    public float d(int i4) {
        return q(i4).getSnr();
    }

    @Override // m0.a
    public int e(int i4) {
        return p(q(i4).getPrn());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f8548i.equals(((g) obj).f8548i);
        }
        return false;
    }

    @Override // m0.a
    public float f(int i4) {
        return q(i4).getElevation();
    }

    @Override // m0.a
    public int g() {
        int i4;
        synchronized (this.f8548i) {
            if (this.f8549j == -1) {
                for (GpsSatellite gpsSatellite : this.f8548i.getSatellites()) {
                    this.f8549j++;
                }
                this.f8549j++;
            }
            i4 = this.f8549j;
        }
        return i4;
    }

    @Override // m0.a
    public int h(int i4) {
        return r(q(i4).getPrn());
    }

    public int hashCode() {
        return this.f8548i.hashCode();
    }

    @Override // m0.a
    public boolean i(int i4) {
        return q(i4).hasAlmanac();
    }

    @Override // m0.a
    public boolean j(int i4) {
        return false;
    }

    @Override // m0.a
    public boolean k(int i4) {
        return false;
    }

    @Override // m0.a
    public boolean l(int i4) {
        return q(i4).hasEphemeris();
    }

    @Override // m0.a
    public boolean m(int i4) {
        return q(i4).usedInFix();
    }

    public final GpsSatellite q(int i4) {
        GpsSatellite gpsSatellite;
        synchronized (this.f8548i) {
            if (i4 < this.f8551l) {
                this.f8550k = this.f8548i.getSatellites().iterator();
                this.f8551l = -1;
            }
            while (true) {
                int i5 = this.f8551l;
                if (i5 >= i4) {
                    break;
                }
                this.f8551l = i5 + 1;
                if (!this.f8550k.hasNext()) {
                    this.f8552m = null;
                    break;
                }
                this.f8552m = this.f8550k.next();
            }
            gpsSatellite = this.f8552m;
        }
        return (GpsSatellite) u0.i.g(gpsSatellite);
    }
}
