package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import c.l;
import c.r0;
import c.t;
import e.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class d extends Drawable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f7718m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f7719n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f7720o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f7721p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f7722q = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f7723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f7724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f7725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f7726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f7727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f7729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f7732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f7733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7734l;

    @Retention(RetentionPolicy.SOURCE)
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    public d(Context context) {
        Paint paint = new Paint();
        this.f7723a = paint;
        this.f7729g = new Path();
        this.f7731i = false;
        this.f7734l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, a.n.O3, a.c.f6846m1, a.m.f7330v1);
        p(typedArrayObtainStyledAttributes.getColor(a.n.S3, 0));
        o(typedArrayObtainStyledAttributes.getDimension(a.n.W3, 0.0f));
        t(typedArrayObtainStyledAttributes.getBoolean(a.n.V3, true));
        r(Math.round(typedArrayObtainStyledAttributes.getDimension(a.n.U3, 0.0f)));
        this.f7730h = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.n.T3, 0);
        this.f7725c = Math.round(typedArrayObtainStyledAttributes.getDimension(a.n.R3, 0.0f));
        this.f7724b = Math.round(typedArrayObtainStyledAttributes.getDimension(a.n.P3, 0.0f));
        this.f7726d = typedArrayObtainStyledAttributes.getDimension(a.n.Q3, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float k(float f4, float f5, float f6) {
        return f4 + ((f5 - f4) * f6);
    }

    public float a() {
        return this.f7724b;
    }

    public float b() {
        return this.f7726d;
    }

    public float c() {
        return this.f7725c;
    }

    public float d() {
        return this.f7723a.getStrokeWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i4 = this.f7734l;
        boolean z3 = false;
        if (i4 != 0 && (i4 == 1 || (i4 == 3 ? h0.a.f(this) == 0 : h0.a.f(this) == 1))) {
            z3 = true;
        }
        float f4 = this.f7724b;
        float fK = k(this.f7725c, (float) Math.sqrt(f4 * f4 * 2.0f), this.f7732j);
        float fK2 = k(this.f7725c, this.f7726d, this.f7732j);
        float fRound = Math.round(k(0.0f, this.f7733k, this.f7732j));
        float fK3 = k(0.0f, f7722q, this.f7732j);
        float fK4 = k(z3 ? 0.0f : -180.0f, z3 ? 180.0f : 0.0f, this.f7732j);
        double d4 = fK;
        double d5 = fK3;
        boolean z4 = z3;
        float fRound2 = Math.round(Math.cos(d5) * d4);
        float fRound3 = Math.round(d4 * Math.sin(d5));
        this.f7729g.rewind();
        float fK5 = k(this.f7727e + this.f7723a.getStrokeWidth(), -this.f7733k, this.f7732j);
        float f5 = (-fK2) / 2.0f;
        this.f7729g.moveTo(f5 + fRound, 0.0f);
        this.f7729g.rLineTo(fK2 - (fRound * 2.0f), 0.0f);
        this.f7729g.moveTo(f5, fK5);
        this.f7729g.rLineTo(fRound2, fRound3);
        this.f7729g.moveTo(f5, -fK5);
        this.f7729g.rLineTo(fRound2, -fRound3);
        this.f7729g.close();
        canvas.save();
        float strokeWidth = this.f7723a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (2.0f * r5))) / 4) * 2) + (strokeWidth * 1.5f) + this.f7727e);
        if (this.f7728f) {
            canvas.rotate(fK4 * (this.f7731i ^ z4 ? -1 : 1));
        } else if (z4) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f7729g, this.f7723a);
        canvas.restore();
    }

    @l
    public int e() {
        return this.f7723a.getColor();
    }

    public int f() {
        return this.f7734l;
    }

    public float g() {
        return this.f7727e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f7730h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f7730h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint h() {
        return this.f7723a;
    }

    @t(from = 0.0d, to = 1.0d)
    public float i() {
        return this.f7732j;
    }

    public boolean j() {
        return this.f7728f;
    }

    public void l(float f4) {
        if (this.f7724b != f4) {
            this.f7724b = f4;
            invalidateSelf();
        }
    }

    public void m(float f4) {
        if (this.f7726d != f4) {
            this.f7726d = f4;
            invalidateSelf();
        }
    }

    public void n(float f4) {
        if (this.f7725c != f4) {
            this.f7725c = f4;
            invalidateSelf();
        }
    }

    public void o(float f4) {
        if (this.f7723a.getStrokeWidth() != f4) {
            this.f7723a.setStrokeWidth(f4);
            this.f7733k = (float) (((double) (f4 / 2.0f)) * Math.cos(f7722q));
            invalidateSelf();
        }
    }

    public void p(@l int i4) {
        if (i4 != this.f7723a.getColor()) {
            this.f7723a.setColor(i4);
            invalidateSelf();
        }
    }

    public void q(int i4) {
        if (i4 != this.f7734l) {
            this.f7734l = i4;
            invalidateSelf();
        }
    }

    public void r(float f4) {
        if (f4 != this.f7727e) {
            this.f7727e = f4;
            invalidateSelf();
        }
    }

    public void s(@t(from = 0.0d, to = 1.0d) float f4) {
        if (this.f7732j != f4) {
            this.f7732j = f4;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        if (i4 != this.f7723a.getAlpha()) {
            this.f7723a.setAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7723a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void t(boolean z3) {
        if (this.f7728f != z3) {
            this.f7728f = z3;
            invalidateSelf();
        }
    }

    public void u(boolean z3) {
        if (this.f7731i != z3) {
            this.f7731i = z3;
            invalidateSelf();
        }
    }
}
