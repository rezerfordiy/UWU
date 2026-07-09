package com.sonoptek.pvus_android.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import c.k0;
import com.sonoHealth.microVUE.R;
import m2.d0;
import m2.u;
import m2.w;
import m2.z;

/* JADX INFO: loaded from: classes.dex */
public class USBMImageView extends USImageSurfaceView {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public PointF[] f6201r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public w f6202s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f6203t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public PointF f6204u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f6205v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Handler f6206w0;

    public class a implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6207b = false;

        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
            /*
                Method dump skipped, instruction units count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sonoptek.pvus_android.view.USBMImageView.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    public USBMImageView(Context context) {
        super(context);
        this.f6203t0 = -1;
        this.f6205v0 = false;
    }

    @Override // com.sonoptek.pvus_android.view.USImageSurfaceView
    public void M(b2.f fVar, z zVar, boolean z3, boolean z4) {
        w wVar;
        super.M(fVar, zVar, z3, z4);
        d0 d0Var = fVar.f4499a;
        if (this.f6203t0 < 0 || ((wVar = this.f6202s0) != null && !d0Var.f8784a.equals(wVar.f8784a))) {
            this.f6203t0 = ((w) d0Var).f8907h;
            this.f6204u0 = zVar.f(new PointF(this.f6203t0, ((u) d0Var.f8789f.get("b_data")).f8886d / 2));
        }
        this.f6202s0 = (w) d0Var;
    }

    @Override // com.sonoptek.pvus_android.view.USImageSurfaceView
    public void Q(Bitmap bitmap, float f4, boolean z3, boolean z4) {
        super.Q(bitmap, f4, z3, z4);
    }

    public void U() {
        setOnTouchListener(new a());
    }

    public void V() {
        this.f6203t0 = -1;
    }

    public void W(int i4) {
        if (i4 == 1) {
            this.f6205v0 = true;
            setClickable(true);
        } else {
            this.f6205v0 = false;
            setClickable(false);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint;
        Resources resources;
        int i4;
        super.onDraw(canvas);
        if (f.j()) {
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        if (f.k()) {
            canvas.scale(1.0f, -1.0f, getWidth() / 2, getHeight() / 2);
        }
        if (this.f6202s0 != null) {
            this.W.setStyle(Paint.Style.STROKE);
            this.W.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
            if (this.f6205v0) {
                paint = this.W;
                resources = getResources();
                i4 = R.color.colorGreenDark;
            } else {
                paint = this.W;
                resources = getResources();
                i4 = R.color.colorYellowDark;
            }
            paint.setColor(resources.getColor(i4));
            this.W.setStrokeWidth(2.0f);
            f.d();
            z zVarF = f.f();
            if (zVarF.n() == 0.0f) {
                return;
            }
            u uVar = (u) this.f6202s0.f8789f.get("b_data");
            int i5 = this.f6203t0;
            float f4 = i5;
            if (this.f6284p) {
                f4 = uVar.f8885c - i5;
            }
            PointF pointF = new PointF(f4, 0.0f);
            PointF pointF2 = new PointF(f4, uVar.f8886d);
            PointF pointFF = zVarF.f(pointF);
            PointF pointFF2 = zVarF.f(pointF2);
            this.f6276l.reset();
            this.f6276l.moveTo(pointFF.x, pointFF.y);
            this.f6276l.lineTo(pointFF2.x, pointFF2.y);
            canvas.drawPath(this.f6276l, this.W);
        }
    }

    public void setHandler(Handler handler) {
        this.f6206w0 = handler;
    }

    public USBMImageView(Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6203t0 = -1;
        this.f6205v0 = false;
    }

    public USBMImageView(Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6203t0 = -1;
        this.f6205v0 = false;
    }
}
