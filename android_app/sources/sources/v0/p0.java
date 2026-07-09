package v0;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    @Deprecated
    public static final int A = 17;

    @Deprecated
    public static final int B = 18;

    @Deprecated
    public static final int C = 19;

    @Deprecated
    public static final int D = 20;

    @Deprecated
    public static final int E = 21;

    @Deprecated
    public static final int F = 22;

    @Deprecated
    public static final int G = 23;

    @Deprecated
    public static final int H = 24;

    @Deprecated
    public static final int I = 25;
    public static final int J = 26;
    public static final int K = 27;
    public static final int L = 28;

    @Deprecated
    public static final int M = 32;

    @Deprecated
    public static final int N = 33;

    @Deprecated
    public static final int O = 34;

    @Deprecated
    public static final int P = 35;

    @Deprecated
    public static final int Q = 36;

    @Deprecated
    public static final int R = 37;

    @Deprecated
    public static final int S = 38;

    @Deprecated
    public static final int T = 39;

    @Deprecated
    public static final int U = 40;

    @Deprecated
    public static final int V = 41;

    @Deprecated
    public static final int W = 42;

    @Deprecated
    public static final int X = 43;

    @Deprecated
    public static final int Y = 44;

    @Deprecated
    public static final int Z = 45;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f12107a = 255;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Deprecated
    public static final int f12108a0 = 46;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f12109b = 5;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @Deprecated
    public static final int f12110b0 = 47;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f12111c = 6;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @Deprecated
    public static final int f12112c0 = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f12113d = 7;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f12114e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f12115f = 65280;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f12116g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final int f12117h = 9;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final int f12118i = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final int f12119j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final int f12120k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f12121l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f12122m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final int f12123n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final int f12124o = 5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final int f12125p = 6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final int f12126q = 7;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final int f12127r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f12128s = 9;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final int f12129t = 10;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final int f12130u = 11;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final int f12131v = 12;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    public static final int f12132w = 13;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Deprecated
    public static final int f12133x = 14;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Deprecated
    public static final int f12134y = 15;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Deprecated
    public static final int f12135z = 16;

    @Deprecated
    public static int a(MotionEvent motionEvent, int i4) {
        return motionEvent.findPointerIndex(i4);
    }

    @Deprecated
    public static int b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    public static int c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    public static float d(MotionEvent motionEvent, int i4) {
        return motionEvent.getAxisValue(i4);
    }

    @Deprecated
    public static float e(MotionEvent motionEvent, int i4, int i5) {
        return motionEvent.getAxisValue(i4, i5);
    }

    @Deprecated
    public static int f(MotionEvent motionEvent) {
        return motionEvent.getButtonState();
    }

    @Deprecated
    public static int g(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    @Deprecated
    public static int h(MotionEvent motionEvent, int i4) {
        return motionEvent.getPointerId(i4);
    }

    @Deprecated
    public static int i(MotionEvent motionEvent) {
        return motionEvent.getSource();
    }

    @Deprecated
    public static float j(MotionEvent motionEvent, int i4) {
        return motionEvent.getX(i4);
    }

    @Deprecated
    public static float k(MotionEvent motionEvent, int i4) {
        return motionEvent.getY(i4);
    }

    public static boolean l(MotionEvent motionEvent, int i4) {
        return (motionEvent.getSource() & i4) == i4;
    }
}
