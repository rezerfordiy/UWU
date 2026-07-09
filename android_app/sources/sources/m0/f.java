package m0;

import android.location.GnssStatus;
import android.os.Build;
import c.o0;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@o0(24)
@r0({r0.a.LIBRARY})
public class f extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GnssStatus f8536i;

    public f(GnssStatus gnssStatus) {
        this.f8536i = (GnssStatus) u0.i.g(gnssStatus);
    }

    @Override // m0.a
    public float a(int i4) {
        return this.f8536i.getAzimuthDegrees(i4);
    }

    @Override // m0.a
    public float b(int i4) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f8536i.getBasebandCn0DbHz(i4);
        }
        throw new UnsupportedOperationException();
    }

    @Override // m0.a
    public float c(int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f8536i.getCarrierFrequencyHz(i4);
        }
        throw new UnsupportedOperationException();
    }

    @Override // m0.a
    public float d(int i4) {
        return this.f8536i.getCn0DbHz(i4);
    }

    @Override // m0.a
    public int e(int i4) {
        return this.f8536i.getConstellationType(i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return this.f8536i.equals(((f) obj).f8536i);
        }
        return false;
    }

    @Override // m0.a
    public float f(int i4) {
        return this.f8536i.getElevationDegrees(i4);
    }

    @Override // m0.a
    public int g() {
        return this.f8536i.getSatelliteCount();
    }

    @Override // m0.a
    public int h(int i4) {
        return this.f8536i.getSvid(i4);
    }

    public int hashCode() {
        return this.f8536i.hashCode();
    }

    @Override // m0.a
    public boolean i(int i4) {
        return this.f8536i.hasAlmanacData(i4);
    }

    @Override // m0.a
    public boolean j(int i4) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f8536i.hasBasebandCn0DbHz(i4);
        }
        return false;
    }

    @Override // m0.a
    public boolean k(int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f8536i.hasCarrierFrequencyHz(i4);
        }
        return false;
    }

    @Override // m0.a
    public boolean l(int i4) {
        return this.f8536i.hasEphemerisData(i4);
    }

    @Override // m0.a
    public boolean m(int i4) {
        return this.f8536i.usedInFix(i4);
    }
}
