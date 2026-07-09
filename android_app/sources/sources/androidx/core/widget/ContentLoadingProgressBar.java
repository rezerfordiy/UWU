package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f3420h = 500;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f3421i = 500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f3426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Runnable f3427g;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
            contentLoadingProgressBar.f3423c = false;
            contentLoadingProgressBar.f3422b = -1L;
            contentLoadingProgressBar.setVisibility(8);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
            contentLoadingProgressBar.f3424d = false;
            if (contentLoadingProgressBar.f3425e) {
                return;
            }
            contentLoadingProgressBar.f3422b = System.currentTimeMillis();
            ContentLoadingProgressBar.this.setVisibility(0);
        }
    }

    public ContentLoadingProgressBar(@j0 Context context) {
        this(context, null);
    }

    public synchronized void a() {
        this.f3425e = true;
        removeCallbacks(this.f3427g);
        this.f3424d = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j4 = this.f3422b;
        long j5 = jCurrentTimeMillis - j4;
        if (j5 >= 500 || j4 == -1) {
            setVisibility(8);
        } else if (!this.f3423c) {
            postDelayed(this.f3426f, 500 - j5);
            this.f3423c = true;
        }
    }

    public final void b() {
        removeCallbacks(this.f3426f);
        removeCallbacks(this.f3427g);
    }

    public synchronized void c() {
        this.f3422b = -1L;
        this.f3425e = false;
        removeCallbacks(this.f3426f);
        this.f3423c = false;
        if (!this.f3424d) {
            postDelayed(this.f3427g, 500L);
            this.f3424d = true;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public ContentLoadingProgressBar(@j0 Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3422b = -1L;
        this.f3423c = false;
        this.f3424d = false;
        this.f3425e = false;
        this.f3426f = new a();
        this.f3427g = new b();
    }
}
