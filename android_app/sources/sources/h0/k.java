package h0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.constraintlayout.widget.e;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends Drawable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f7999n = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f8000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8001b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitmapShader f8004e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f8006g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8010k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8011l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8012m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8002c = e.m.u3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f8003d = new Paint(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f8005f = new Matrix();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f8007h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f8008i = new RectF();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8009j = true;

    public k(Resources resources, Bitmap bitmap) {
        BitmapShader bitmapShader;
        this.f8001b = 160;
        if (resources != null) {
            this.f8001b = resources.getDisplayMetrics().densityDpi;
        }
        this.f8000a = bitmap;
        if (bitmap != null) {
            a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.f8012m = -1;
            this.f8011l = -1;
            bitmapShader = null;
        }
        this.f8004e = bitmapShader;
    }

    public static boolean j(float f4) {
        return f4 > 0.05f;
    }

    public final void a() {
        this.f8011l = this.f8000a.getScaledWidth(this.f8001b);
        this.f8012m = this.f8000a.getScaledHeight(this.f8001b);
    }

    @k0
    public final Bitmap b() {
        return this.f8000a;
    }

    public float c() {
        return this.f8006g;
    }

    public int d() {
        return this.f8002c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@j0 Canvas canvas) {
        Bitmap bitmap = this.f8000a;
        if (bitmap == null) {
            return;
        }
        t();
        if (this.f8003d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f8007h, this.f8003d);
            return;
        }
        RectF rectF = this.f8008i;
        float f4 = this.f8006g;
        canvas.drawRoundRect(rectF, f4, f4, this.f8003d);
    }

    @j0
    public final Paint e() {
        return this.f8003d;
    }

    public void f(int i4, int i5, int i6, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public boolean g() {
        return this.f8003d.isAntiAlias();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f8003d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f8003d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f8012m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f8011l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f8002c != 119 || this.f8010k || (bitmap = this.f8000a) == null || bitmap.hasAlpha() || this.f8003d.getAlpha() < 255 || j(this.f8006g)) ? -3 : -1;
    }

    public boolean h() {
        throw new UnsupportedOperationException();
    }

    public boolean i() {
        return this.f8010k;
    }

    public void k(boolean z3) {
        this.f8003d.setAntiAlias(z3);
        invalidateSelf();
    }

    public void l(boolean z3) {
        this.f8010k = z3;
        this.f8009j = true;
        if (!z3) {
            m(0.0f);
            return;
        }
        s();
        this.f8003d.setShader(this.f8004e);
        invalidateSelf();
    }

    public void m(float f4) {
        Paint paint;
        BitmapShader bitmapShader;
        if (this.f8006g == f4) {
            return;
        }
        this.f8010k = false;
        if (j(f4)) {
            paint = this.f8003d;
            bitmapShader = this.f8004e;
        } else {
            paint = this.f8003d;
            bitmapShader = null;
        }
        paint.setShader(bitmapShader);
        this.f8006g = f4;
        invalidateSelf();
    }

    public void n(int i4) {
        if (this.f8002c != i4) {
            this.f8002c = i4;
            this.f8009j = true;
            invalidateSelf();
        }
    }

    public void o(boolean z3) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f8010k) {
            s();
        }
        this.f8009j = true;
    }

    public void p(int i4) {
        if (this.f8001b != i4) {
            if (i4 == 0) {
                i4 = 160;
            }
            this.f8001b = i4;
            if (this.f8000a != null) {
                a();
            }
            invalidateSelf();
        }
    }

    public void q(@j0 Canvas canvas) {
        p(canvas.getDensity());
    }

    public void r(@j0 DisplayMetrics displayMetrics) {
        p(displayMetrics.densityDpi);
    }

    public final void s() {
        this.f8006g = Math.min(this.f8012m, this.f8011l) / 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        if (i4 != this.f8003d.getAlpha()) {
            this.f8003d.setAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f8003d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z3) {
        this.f8003d.setDither(z3);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z3) {
        this.f8003d.setFilterBitmap(z3);
        invalidateSelf();
    }

    public void t() {
        if (this.f8009j) {
            if (this.f8010k) {
                int iMin = Math.min(this.f8011l, this.f8012m);
                f(this.f8002c, iMin, iMin, getBounds(), this.f8007h);
                int iMin2 = Math.min(this.f8007h.width(), this.f8007h.height());
                this.f8007h.inset(Math.max(0, (this.f8007h.width() - iMin2) / 2), Math.max(0, (this.f8007h.height() - iMin2) / 2));
                this.f8006g = iMin2 * 0.5f;
            } else {
                f(this.f8002c, this.f8011l, this.f8012m, getBounds(), this.f8007h);
            }
            this.f8008i.set(this.f8007h);
            if (this.f8004e != null) {
                Matrix matrix = this.f8005f;
                RectF rectF = this.f8008i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f8005f.preScale(this.f8008i.width() / this.f8000a.getWidth(), this.f8008i.height() / this.f8000a.getHeight());
                this.f8004e.setLocalMatrix(this.f8005f);
                this.f8003d.setShader(this.f8004e);
            }
            this.f8009j = false;
        }
    }
}
