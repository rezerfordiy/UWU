package a0;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import c.r0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f122b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f123c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f124d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f125e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f126f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f127g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f128h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f129i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f130j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f131k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f132l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f133m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f134n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f135o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f136p = 16;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f137q = 32;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f138r = 64;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f139s = 128;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f140t = 256;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f141u = 511;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f142a;

    @c.o0(24)
    public static class a extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f143e = 1000000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f144f = 500000;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static HandlerThread f145g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static Handler f146h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseIntArray[] f148b = new SparseIntArray[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<WeakReference<Activity>> f149c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Window.OnFrameMetricsAvailableListener f150d = new WindowOnFrameMetricsAvailableListenerC0001a();

        /* JADX INFO: renamed from: a0.m$a$a, reason: collision with other inner class name */
        public class WindowOnFrameMetricsAvailableListenerC0001a implements Window.OnFrameMetricsAvailableListener {
            public WindowOnFrameMetricsAvailableListenerC0001a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i4) {
                a aVar = a.this;
                if ((aVar.f147a & 1) != 0) {
                    aVar.f(aVar.f148b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f147a & 2) != 0) {
                    aVar2.f(aVar2.f148b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f147a & 4) != 0) {
                    aVar3.f(aVar3.f148b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f147a & 8) != 0) {
                    aVar4.f(aVar4.f148b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f147a & 16) != 0) {
                    aVar5.f(aVar5.f148b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f147a & 64) != 0) {
                    aVar6.f(aVar6.f148b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f147a & 32) != 0) {
                    aVar7.f(aVar7.f148b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f147a & 128) != 0) {
                    aVar8.f(aVar8.f148b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f147a & 256) != 0) {
                    aVar9.f(aVar9.f148b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public a(int i4) {
            this.f147a = i4;
        }

        @Override // a0.m.b
        public void a(Activity activity) {
            if (f145g == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f145g = handlerThread;
                handlerThread.start();
                f146h = new Handler(f145g.getLooper());
            }
            for (int i4 = 0; i4 <= 8; i4++) {
                SparseIntArray[] sparseIntArrayArr = this.f148b;
                if (sparseIntArrayArr[i4] == null && (this.f147a & (1 << i4)) != 0) {
                    sparseIntArrayArr[i4] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f150d, f146h);
            this.f149c.add(new WeakReference<>(activity));
        }

        @Override // a0.m.b
        public SparseIntArray[] b() {
            return this.f148b;
        }

        @Override // a0.m.b
        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f149c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f149c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f150d);
            return this.f148b;
        }

        @Override // a0.m.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f148b;
            this.f148b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // a0.m.b
        public SparseIntArray[] e() {
            for (int size = this.f149c.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f149c.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f150d);
                    this.f149c.remove(size);
                }
            }
            return this.f148b;
        }

        public void f(SparseIntArray sparseIntArray, long j4) {
            if (sparseIntArray != null) {
                int i4 = (int) ((500000 + j4) / 1000000);
                if (j4 >= 0) {
                    sparseIntArray.put(i4, sparseIntArray.get(i4) + 1);
                }
            }
        }
    }

    public static class b {
        public void a(Activity activity) {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public SparseIntArray[] e() {
            return null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public m() {
        this(1);
    }

    public void a(@c.j0 Activity activity) {
        this.f142a.a(activity);
    }

    @c.k0
    public SparseIntArray[] b() {
        return this.f142a.b();
    }

    @c.k0
    public SparseIntArray[] c(@c.j0 Activity activity) {
        return this.f142a.c(activity);
    }

    @c.k0
    public SparseIntArray[] d() {
        return this.f142a.d();
    }

    @c.k0
    public SparseIntArray[] e() {
        return this.f142a.e();
    }

    public m(int i4) {
        this.f142a = new a(i4);
    }
}
