package com.sonoptek.pvus_android;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import c.k0;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class VerticalSeekBar extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f5237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f5239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f5240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f5241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f5242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f5243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f5244n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f5245o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f5246p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f5247q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f5248r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearGradient f5249s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Paint f5250t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f5251u;

    public interface a {
        void a(View view, float f4);

        void b(View view, float f4);
    }

    public VerticalSeekBar(Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5232b = z1.f12256t;
        this.f5233c = -7829368;
        this.f5234d = -1;
        this.f5235e = -1;
        this.f5236f = -1;
        this.f5237g = new int[]{z1.f12256t, -7829368, -1};
        this.f5242l = 100.0f;
        this.f5250t = new Paint();
    }

    public final void a(Canvas canvas) {
        RectF rectF = new RectF(this.f5243m, this.f5244n, this.f5245o, this.f5246p);
        this.f5250t.setAntiAlias(true);
        this.f5250t.setStyle(Paint.Style.FILL);
        this.f5250t.setColor(Color.parseColor("#336699FF"));
        float f4 = this.f5247q;
        canvas.drawRoundRect(rectF, f4 / 2.0f, f4 / 2.0f, this.f5250t);
        float f5 = this.f5239i;
        float f6 = this.f5240j;
        if (f5 < f6) {
            f5 = f6;
        }
        this.f5239i = f5;
        float f7 = this.f5248r;
        if (f5 > f7 - f6) {
            f5 = f7 - f6;
        }
        this.f5239i = f5;
        RectF rectF2 = new RectF(this.f5243m, this.f5239i, this.f5245o, this.f5246p);
        this.f5250t.setColor(Color.parseColor("#6699FF"));
        float f8 = this.f5247q;
        canvas.drawRoundRect(rectF2, f8 / 2.0f, f8 / 2.0f, this.f5250t);
    }

    public final void b(Canvas canvas) {
        Paint paint = new Paint();
        float f4 = this.f5239i;
        float f5 = this.f5240j;
        if (f4 < f5) {
            f4 = f5;
        }
        this.f5239i = f4;
        float f6 = this.f5248r;
        if (f4 > f6 - f5) {
            f4 = f6 - f5;
        }
        this.f5239i = f4;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f5235e);
        canvas.drawCircle(this.f5238h, this.f5239i, this.f5240j, paint);
    }

    public void c(int i4, int i5, int i6, int i7, int i8) {
        this.f5232b = i4;
        this.f5233c = i5;
        this.f5234d = i6;
        this.f5235e = i7;
        this.f5236f = i8;
        int[] iArr = this.f5237g;
        iArr[0] = i4;
        iArr[1] = i5;
        iArr[2] = i6;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredHeight = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        float f4 = measuredWidth / 2.0f;
        this.f5240j = f4;
        float f5 = 0.25f * measuredWidth;
        this.f5243m = f5;
        float f6 = measuredWidth * 0.75f;
        this.f5245o = f6;
        this.f5244n = 0.0f;
        float f7 = measuredHeight;
        this.f5246p = f7;
        this.f5247q = f6 - f5;
        float f8 = f7 - 0.0f;
        this.f5248r = f8;
        this.f5238h = f4;
        this.f5239i = (1.0f - ((1.0f / this.f5242l) * this.f5241k)) * f8;
        a(canvas);
        b(canvas);
        this.f5250t.reset();
    }

    @Override // android.view.View
    public synchronized void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float y3 = motionEvent.getY();
        this.f5239i = y3;
        float f4 = this.f5248r;
        this.f5241k = ((f4 - y3) / f4) * this.f5242l;
        int action = motionEvent.getAction();
        if (action == 1) {
            a aVar = this.f5251u;
            if (aVar != null) {
                aVar.a(this, this.f5241k);
            }
        } else if (action == 2) {
            a aVar2 = this.f5251u;
            if (aVar2 != null) {
                aVar2.b(this, this.f5241k);
            }
            setProgress(this.f5241k);
            invalidate();
        }
        return true;
    }

    public void setMaxCount(float f4) {
        this.f5242l = f4;
    }

    public void setOnStateChangeListener(a aVar) {
        this.f5251u = aVar;
    }

    public void setProgress(float f4) {
        this.f5241k = f4;
        invalidate();
    }

    public VerticalSeekBar(Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f5232b = z1.f12256t;
        this.f5233c = -7829368;
        this.f5234d = -1;
        this.f5235e = -1;
        this.f5236f = -1;
        this.f5237g = new int[]{z1.f12256t, -7829368, -1};
        this.f5242l = 100.0f;
        this.f5250t = new Paint();
    }
}
