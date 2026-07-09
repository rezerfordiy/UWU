package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.e;
import c.o0;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f2169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Path f2174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewOutlineProvider f2175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RectF f2176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable[] f2177l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LayerDrawable f2178m;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), (Math.min(r3, r4) * ImageFilterView.this.f2172g) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f2173h);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float[] f2181a = new float[20];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ColorMatrix f2182b = new ColorMatrix();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorMatrix f2183c = new ColorMatrix();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f2184d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f2185e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f2186f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f2187g = 1.0f;

        public final void a(float f4) {
            float[] fArr = this.f2181a;
            fArr[0] = f4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f4;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f4;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public final void b(float f4) {
            float f5 = 1.0f - f4;
            float f6 = 0.2999f * f5;
            float f7 = 0.587f * f5;
            float f8 = f5 * 0.114f;
            float[] fArr = this.f2181a;
            fArr[0] = f6 + f4;
            fArr[1] = f7;
            fArr[2] = f8;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f6;
            fArr[6] = f7 + f4;
            fArr[7] = f8;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f6;
            fArr[11] = f7;
            fArr[12] = f8 + f4;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public void c(ImageView imageView) {
            boolean z3;
            this.f2182b.reset();
            float f4 = this.f2185e;
            boolean z4 = true;
            if (f4 != 1.0f) {
                b(f4);
                this.f2182b.set(this.f2181a);
                z3 = true;
            } else {
                z3 = false;
            }
            float f5 = this.f2186f;
            if (f5 != 1.0f) {
                this.f2183c.setScale(f5, f5, f5, 1.0f);
                this.f2182b.postConcat(this.f2183c);
                z3 = true;
            }
            float f6 = this.f2187g;
            if (f6 != 1.0f) {
                d(f6);
                this.f2183c.set(this.f2181a);
                this.f2182b.postConcat(this.f2183c);
                z3 = true;
            }
            float f7 = this.f2184d;
            if (f7 != 1.0f) {
                a(f7);
                this.f2183c.set(this.f2181a);
                this.f2182b.postConcat(this.f2183c);
            } else {
                z4 = z3;
            }
            if (z4) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f2182b));
            } else {
                imageView.clearColorFilter();
            }
        }

        public final void d(float f4) {
            float fLog;
            float fPow;
            if (f4 <= 0.0f) {
                f4 = 0.01f;
            }
            float f5 = (5000.0f / f4) / 100.0f;
            if (f5 > 66.0f) {
                double d4 = f5 - 60.0f;
                fPow = ((float) Math.pow(d4, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d4, 0.07551484555006027d)) * 288.12216f;
            } else {
                fLog = (((float) Math.log(f5)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            float fLog2 = f5 < 66.0f ? f5 > 19.0f ? (((float) Math.log(f5 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
            float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
            float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
            float[] fArr = this.f2181a;
            fArr[0] = fMin / fMin4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fMin2 / fMin5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = fMin6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        this.f2169d = new c();
        this.f2170e = true;
        this.f2171f = 0.0f;
        this.f2172g = 0.0f;
        this.f2173h = Float.NaN;
        e(context, null);
    }

    private void setOverlay(boolean z3) {
        this.f2170e = z3;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public final void e(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.Wa);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(e.m.Xa);
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == e.m.ab) {
                    this.f2171f = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == e.m.fb) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == e.m.eb) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == e.m.Za) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == e.m.cb) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == e.m.db) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == e.m.bb) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f2170e));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f2177l = drawableArr;
                drawableArr[0] = getDrawable();
                this.f2177l[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f2177l);
                this.f2178m = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f2171f * 255.0f));
                super.setImageDrawable(this.f2178m);
            }
        }
    }

    public float getBrightness() {
        return this.f2169d.f2184d;
    }

    public float getContrast() {
        return this.f2169d.f2186f;
    }

    public float getCrossfade() {
        return this.f2171f;
    }

    public float getRound() {
        return this.f2173h;
    }

    public float getRoundPercent() {
        return this.f2172g;
    }

    public float getSaturation() {
        return this.f2169d.f2185e;
    }

    public float getWarmth() {
        return this.f2169d.f2187g;
    }

    public void setBrightness(float f4) {
        c cVar = this.f2169d;
        cVar.f2184d = f4;
        cVar.c(this);
    }

    public void setContrast(float f4) {
        c cVar = this.f2169d;
        cVar.f2186f = f4;
        cVar.c(this);
    }

    public void setCrossfade(float f4) {
        this.f2171f = f4;
        if (this.f2177l != null) {
            if (!this.f2170e) {
                this.f2178m.getDrawable(0).setAlpha((int) ((1.0f - this.f2171f) * 255.0f));
            }
            this.f2178m.getDrawable(1).setAlpha((int) (this.f2171f * 255.0f));
            super.setImageDrawable(this.f2178m);
        }
    }

    @o0(21)
    public void setRound(float f4) {
        if (Float.isNaN(f4)) {
            this.f2173h = f4;
            float f5 = this.f2172g;
            this.f2172g = -1.0f;
            setRoundPercent(f5);
            return;
        }
        boolean z3 = this.f2173h != f4;
        this.f2173h = f4;
        if (f4 != 0.0f) {
            if (this.f2174i == null) {
                this.f2174i = new Path();
            }
            if (this.f2176k == null) {
                this.f2176k = new RectF();
            }
            if (this.f2175j == null) {
                b bVar = new b();
                this.f2175j = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2176k.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f2174i.reset();
            Path path = this.f2174i;
            RectF rectF = this.f2176k;
            float f6 = this.f2173h;
            path.addRoundRect(rectF, f6, f6, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    @o0(21)
    public void setRoundPercent(float f4) {
        boolean z3 = this.f2172g != f4;
        this.f2172g = f4;
        if (f4 != 0.0f) {
            if (this.f2174i == null) {
                this.f2174i = new Path();
            }
            if (this.f2176k == null) {
                this.f2176k = new RectF();
            }
            if (this.f2175j == null) {
                a aVar = new a();
                this.f2175j = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f2172g) / 2.0f;
            this.f2176k.set(0.0f, 0.0f, width, height);
            this.f2174i.reset();
            this.f2174i.addRoundRect(this.f2176k, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f4) {
        c cVar = this.f2169d;
        cVar.f2185e = f4;
        cVar.c(this);
    }

    public void setWarmth(float f4) {
        c cVar = this.f2169d;
        cVar.f2187g = f4;
        cVar.c(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2169d = new c();
        this.f2170e = true;
        this.f2171f = 0.0f;
        this.f2172g = 0.0f;
        this.f2173h = Float.NaN;
        e(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f2169d = new c();
        this.f2170e = true;
        this.f2171f = 0.0f;
        this.f2172g = 0.0f;
        this.f2173h = Float.NaN;
        e(context, attributeSet);
    }
}
