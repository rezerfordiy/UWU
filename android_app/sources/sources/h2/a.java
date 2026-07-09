package h2;

import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RectF f8027a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f8028b = new RectF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RectF f8029c = new RectF();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f8030d = new RectF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PointF f8031e = new PointF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f8032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f8033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView.ScaleType f8034h;

    public a(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, PointF pointF, float f4, float f5, ImageView.ScaleType scaleType) {
        this.f8027a.set(rectF);
        this.f8028b.set(rectF2);
        this.f8029c.set(rectF3);
        this.f8032f = f4;
        this.f8034h = scaleType;
        this.f8033g = f5;
        this.f8030d.set(rectF4);
        this.f8031e.set(pointF);
    }
}
