package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.e;
import c.o0;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageFilterView.c f2157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Path f2161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewOutlineProvider f2162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f2163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable[] f2164k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LayerDrawable f2165l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2166m;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), (Math.min(r3, r4) * ImageFilterButton.this.f2159f) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f2160g);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        this.f2157d = new ImageFilterView.c();
        this.f2158e = 0.0f;
        this.f2159f = 0.0f;
        this.f2160g = Float.NaN;
        this.f2166m = true;
        c(context, null);
    }

    private void setOverlay(boolean z3) {
        this.f2166m = z3;
    }

    public final void c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.Wa);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(e.m.Xa);
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == e.m.ab) {
                    this.f2158e = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
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
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f2166m));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f2164k = drawableArr;
                drawableArr[0] = getDrawable();
                this.f2164k[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f2164k);
                this.f2165l = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f2158e * 255.0f));
                super.setImageDrawable(this.f2165l);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.f2157d.f2186f;
    }

    public float getCrossfade() {
        return this.f2158e;
    }

    public float getRound() {
        return this.f2160g;
    }

    public float getRoundPercent() {
        return this.f2159f;
    }

    public float getSaturation() {
        return this.f2157d.f2185e;
    }

    public float getWarmth() {
        return this.f2157d.f2187g;
    }

    public void setBrightness(float f4) {
        ImageFilterView.c cVar = this.f2157d;
        cVar.f2184d = f4;
        cVar.c(this);
    }

    public void setContrast(float f4) {
        ImageFilterView.c cVar = this.f2157d;
        cVar.f2186f = f4;
        cVar.c(this);
    }

    public void setCrossfade(float f4) {
        this.f2158e = f4;
        if (this.f2164k != null) {
            if (!this.f2166m) {
                this.f2165l.getDrawable(0).setAlpha((int) ((1.0f - this.f2158e) * 255.0f));
            }
            this.f2165l.getDrawable(1).setAlpha((int) (this.f2158e * 255.0f));
            super.setImageDrawable(this.f2165l);
        }
    }

    @o0(21)
    public void setRound(float f4) {
        if (Float.isNaN(f4)) {
            this.f2160g = f4;
            float f5 = this.f2159f;
            this.f2159f = -1.0f;
            setRoundPercent(f5);
            return;
        }
        boolean z3 = this.f2160g != f4;
        this.f2160g = f4;
        if (f4 != 0.0f) {
            if (this.f2161h == null) {
                this.f2161h = new Path();
            }
            if (this.f2163j == null) {
                this.f2163j = new RectF();
            }
            if (this.f2162i == null) {
                b bVar = new b();
                this.f2162i = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2163j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f2161h.reset();
            Path path = this.f2161h;
            RectF rectF = this.f2163j;
            float f6 = this.f2160g;
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
        boolean z3 = this.f2159f != f4;
        this.f2159f = f4;
        if (f4 != 0.0f) {
            if (this.f2161h == null) {
                this.f2161h = new Path();
            }
            if (this.f2163j == null) {
                this.f2163j = new RectF();
            }
            if (this.f2162i == null) {
                a aVar = new a();
                this.f2162i = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f2159f) / 2.0f;
            this.f2163j.set(0.0f, 0.0f, width, height);
            this.f2161h.reset();
            this.f2161h.addRoundRect(this.f2163j, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f4) {
        ImageFilterView.c cVar = this.f2157d;
        cVar.f2185e = f4;
        cVar.c(this);
    }

    public void setWarmth(float f4) {
        ImageFilterView.c cVar = this.f2157d;
        cVar.f2187g = f4;
        cVar.c(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2157d = new ImageFilterView.c();
        this.f2158e = 0.0f;
        this.f2159f = 0.0f;
        this.f2160g = Float.NaN;
        this.f2166m = true;
        c(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f2157d = new ImageFilterView.c();
        this.f2158e = 0.0f;
        this.f2159f = 0.0f;
        this.f2160g = Float.NaN;
        this.f2166m = true;
        c(context, attributeSet);
    }
}
