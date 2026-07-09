package m0;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import c.b0;
import c.j0;
import c.o0;
import c.r0;
import c.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f8528a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f8529b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f8530c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f8531d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f8532e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f8533f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f8534g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f8535h = 7;

    /* JADX INFO: renamed from: m0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0078a {
        public void a(@b0(from = 0) int i4) {
        }

        public void b(@j0 a aVar) {
        }

        public void c() {
        }

        public void d() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @r0({r0.a.LIBRARY})
    public @interface b {
    }

    @o0(24)
    @j0
    public static a n(@j0 GnssStatus gnssStatus) {
        return new f(gnssStatus);
    }

    @SuppressLint({"ReferencesDeprecated"})
    @j0
    public static a o(@j0 GpsStatus gpsStatus) {
        return new g(gpsStatus);
    }

    @t(from = 0.0d, to = 360.0d)
    public abstract float a(@b0(from = 0) int i4);

    @t(from = 0.0d, to = 63.0d)
    public abstract float b(@b0(from = 0) int i4);

    @t(from = 0.0d)
    public abstract float c(@b0(from = 0) int i4);

    @t(from = 0.0d, to = 63.0d)
    public abstract float d(@b0(from = 0) int i4);

    public abstract int e(@b0(from = 0) int i4);

    @t(from = -90.0d, to = 90.0d)
    public abstract float f(@b0(from = 0) int i4);

    @b0(from = 0)
    public abstract int g();

    @b0(from = 1, to = 200)
    public abstract int h(@b0(from = 0) int i4);

    public abstract boolean i(@b0(from = 0) int i4);

    public abstract boolean j(@b0(from = 0) int i4);

    public abstract boolean k(@b0(from = 0) int i4);

    public abstract boolean l(@b0(from = 0) int i4);

    public abstract boolean m(@b0(from = 0) int i4);
}
