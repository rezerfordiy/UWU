package com.sonoptek.pvus_android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import c.k0;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.MyApplication;
import com.sonoptek.pvus_android.h;
import m2.a0;
import m2.d0;
import m2.u;
import m2.z;
import n2.o1;

/* JADX INFO: loaded from: classes.dex */
public class USBiopsyView extends View {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f6211j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f6212k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f6213l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f6214m = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f6216o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f6217p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f6218q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f6219r = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f6220s = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f6221t = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f6222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d0 f6225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static b f6209h = new b(-40.0f, -80);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static c f6210i = new c(50.0f, 5.0f, 0.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f6215n = 0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PointF f6228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PointF f6229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f6230c;

        public a(PointF pointF, PointF pointF2, float f4) {
            this.f6228a = pointF;
            this.f6229b = pointF2;
            this.f6230c = f4;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f6231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f6233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f6234d;

        public b(float f4, int i4) {
            this.f6231a = f4;
            this.f6232b = i4;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f6235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f6236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f6237c;

        public c(float f4, float f5, float f6) {
            this.f6235a = f4;
            this.f6236b = f5;
            this.f6237c = f6;
        }
    }

    public USBiopsyView(Context context) {
        super(context);
        this.f6222b = null;
        this.f6223c = false;
        this.f6224d = false;
        this.f6225e = null;
        this.f6226f = false;
        this.f6227g = false;
    }

    public static void b() {
        o1 o1VarD = o1.d(null);
        f6215n = o1VarD.e("BIOPSY_MODE", 0);
        f6209h.f6232b = o1VarD.e("BIOPSY_IN_PLANE_ANGLE", -30);
        f6209h.f6231a = o1VarD.c("BIOPSY_IN_PLANE_POSITION", -20.0f);
        f6210i.f6235a = o1VarD.c("BIOPSY_OUT_PLANE_POSITION", 30.0f);
        f6210i.f6236b = o1VarD.c("BIOPSY_OUT_PLANE_RADIUS", 5.0f);
        f6210i.f6237c = o1VarD.c("BIOPSY_OUT_PLANE_LEFT_POSITION", 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x015b A[PHI: r9
      0x015b: PHI (r9v5 com.sonoptek.pvus_android.view.USBiopsyView$c) = (r9v2 com.sonoptek.pvus_android.view.USBiopsyView$c), (r9v11 com.sonoptek.pvus_android.view.USBiopsyView$c) binds: [B:100:0x0159, B:89:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083 A[PHI: r9
      0x0083: PHI (r9v28 com.sonoptek.pvus_android.view.USBiopsyView$b) = (r9v27 com.sonoptek.pvus_android.view.USBiopsyView$b), (r9v34 com.sonoptek.pvus_android.view.USBiopsyView$b) binds: [B:40:0x0081, B:35:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f A[PHI: r9
      0x008f: PHI (r9v29 com.sonoptek.pvus_android.view.USBiopsyView$b) = (r9v26 com.sonoptek.pvus_android.view.USBiopsyView$b), (r9v35 com.sonoptek.pvus_android.view.USBiopsyView$b) binds: [B:43:0x008d, B:32:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014d A[PHI: r9
      0x014d: PHI (r9v4 com.sonoptek.pvus_android.view.USBiopsyView$c) = (r9v3 com.sonoptek.pvus_android.view.USBiopsyView$c), (r9v10 com.sonoptek.pvus_android.view.USBiopsyView$c) binds: [B:97:0x014b, B:92:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r9) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sonoptek.pvus_android.view.USBiopsyView.a(int):void");
    }

    public void c(d0 d0Var) {
        this.f6225e = d0Var;
        f.d();
        z zVarF = f.f();
        if (a0.c().d() == null) {
            return;
        }
        u uVar = (u) d0Var.f8789f.get("b_data");
        PointF pointF = new PointF(uVar.f8885c - 1, 0.0f);
        PointF pointF2 = new PointF(0.0f, 0.0f);
        PointF pointF3 = new PointF((zVarF.f(pointF2).x + zVarF.f(pointF).x) / 2.0f, 0.0f);
        float fA = zVarF.A();
        float f4 = ((int) ((((r4.x - pointF3.x) * fA) - 0.5f) / 0.5f)) * 0.5f;
        b bVar = f6209h;
        bVar.f6234d = f4;
        if (bVar.f6231a > f4) {
            bVar.f6231a = f4;
        }
        if (f6215n == 3) {
            this.f6222b = new a(zVarF.f(pointF2), zVarF.f(new PointF(uVar.f8885c - 1, uVar.f8886d)), fA);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        PointF pointF;
        float f4;
        Paint paint;
        if (f.j()) {
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        if (f.k()) {
            canvas.scale(1.0f, -1.0f, getWidth() / 2, getHeight() / 2);
        }
        if (this.f6225e == null) {
            return;
        }
        f.d();
        z zVarF = f.f();
        if (zVarF == null || zVarF.n() == 0.0f) {
            return;
        }
        u uVar = (u) this.f6225e.f8789f.get("b_data");
        int i4 = f6215n;
        if (i4 == 1) {
            PointF pointF2 = new PointF(uVar.f8885c - 1, 0.0f);
            PointF pointFF = zVarF.f(new PointF(0.0f, 0.0f));
            PointF pointFF2 = zVarF.f(pointF2);
            PointF pointF3 = new PointF((pointFF.x + pointFF2.x) / 2.0f, 0.0f);
            float fA = zVarF.A();
            int iM = (int) zVarF.m();
            pointF3.x += f6209h.f6231a / fA;
            float f5 = iM;
            PointF pointF4 = new PointF(0.0f, f5);
            pointF4.x = pointF3.x + (((float) Math.tan(-((((double) f6209h.f6232b) / 180.0d) * 3.141592653589793d))) * f5);
            float f6 = f5 * fA;
            float f7 = (f6 <= 100.0f || f6 > 180.0f) ? f6 > 180.0f ? 15.0f : 5.0f : 10.0f;
            Paint paint2 = new Paint();
            paint2.setColor(Color.parseColor("#1EB446"));
            paint2.setStyle(Paint.Style.FILL);
            float f8 = pointF4.x - pointF3.x;
            float f9 = pointF4.y - pointF3.y;
            int iSqrt = (int) ((((float) Math.sqrt((f8 * f8) + (f9 * f9))) * f7) / f7);
            float f10 = ((-f6209h.f6232b) / 180.0f) * 3.1415927f;
            int i5 = 0;
            while (true) {
                float f11 = i5;
                if (f11 > iSqrt / f7) {
                    break;
                }
                float f12 = (f11 * f7) / fA;
                double d4 = f10;
                canvas.drawCircle(pointF3.x + (((float) Math.sin(d4)) * f12), pointF3.y + (f12 * ((float) Math.cos(d4))), 2.0f, paint2);
                i5++;
                f7 = f7;
                iSqrt = iSqrt;
                fA = fA;
            }
            PointF pointF5 = null;
            if (uVar.f8894l && h.a()) {
                f4 = uVar.f8902t;
                float f13 = (float) ((((double) f4) * 3.141592653589793d) / 180.0d);
                if (!this.f6224d || f4 <= 0.0f) {
                    pointF = pointFF2;
                } else {
                    PointF pointFF3 = zVarF.f(new PointF(uVar.f8885c - 1, uVar.f8886d));
                    float fTan = (float) (((double) pointFF3.x) - (((double) pointFF3.y) * Math.tan(f13)));
                    pointFF3.x = fTan;
                    pointF = pointFF2;
                    canvas.drawLine(pointFF2.x, pointFF2.y, fTan, pointFF3.y, paint2);
                    pointF5 = pointFF3;
                }
            } else {
                pointF = pointFF2;
                f4 = 0.0f;
            }
            PointF pointF6 = new PointF(0.0f, 0.0f);
            if (pointF5 != null) {
                float f14 = pointF6.x;
                float f15 = pointF4.y;
                float f16 = pointF3.y;
                float f17 = pointF5.x;
                float f18 = pointF.x;
                float f19 = pointF3.x;
                float f20 = pointF5.y;
                float f21 = pointF.y;
                paint = paint2;
                float f22 = pointF4.x;
                float f23 = f14 + (((((f15 - f16) * (f17 - f18)) * f19) - (((f20 - f21) * (f22 - f19)) * f18)) / (((f15 - f16) * (f17 - f18)) - ((f20 - f21) * (f22 - f19))));
                pointF6.x = f23;
                float f24 = pointF6.y;
                float f25 = pointF3.x;
                pointF6.y = f24 + (((f23 - f25) * (f15 - f16)) / (pointF4.x - f25));
            } else {
                paint = paint2;
            }
            float fB = (zVarF.B() * 24.0f) / zVarF.A();
            if (!this.f6224d || f4 <= 0.0f) {
                return;
            }
            PointF pointF7 = new PointF(0.0f, 0.0f);
            double d5 = fB;
            double d6 = f10;
            pointF7.x = (float) (((double) pointF3.x) + (Math.tan(d6) * d5));
            PointF pointF8 = new PointF(pointF6.x, pointF6.y);
            pointF8.x = (float) (((double) pointF8.x) + (Math.tan(d6) * d5 * Math.cos(d6) * Math.cos(d6)));
            float fTan2 = (float) (((double) pointF8.y) - (((Math.tan(d6) * d5) * Math.cos(d6)) * Math.sin(d6)));
            pointF8.y = fTan2;
            float f26 = pointF8.x - pointF7.x;
            float f27 = fTan2 - pointF7.y;
            int iSqrt2 = (int) (((float) Math.sqrt((f26 * f26) + (f27 * f27))) / 20.0f);
            for (int i6 = 0; i6 <= iSqrt2; i6++) {
                float f28 = i6 * 20;
                canvas.drawCircle(pointF7.x + (((float) Math.sin(d6)) * f28), pointF7.y + (f28 * ((float) Math.cos(d6))), 1.0f, paint);
            }
            Paint paint3 = paint;
            PointF pointF9 = new PointF(0.0f, 0.0f);
            pointF9.x = (float) (((double) pointF3.x) - (Math.tan(d6) * d5));
            PointF pointF10 = new PointF(pointF6.x, pointF6.y);
            pointF10.x = (float) (((double) pointF10.x) - (((Math.tan(d6) * d5) * Math.cos(d6)) * Math.cos(d6)));
            float fTan3 = (float) (((double) pointF10.y) + (d5 * Math.tan(d6) * Math.cos(d6) * Math.sin(d6)));
            pointF10.y = fTan3;
            float f29 = pointF10.x - pointF9.x;
            float f30 = fTan3 - pointF9.y;
            int iSqrt3 = (int) (((float) Math.sqrt((f29 * f29) + (f30 * f30))) / 20.0f);
            for (int i7 = 0; i7 <= iSqrt3; i7++) {
                float f31 = i7 * 20;
                canvas.drawCircle(pointF9.x + (((float) Math.sin(d6)) * f31), pointF9.y + (f31 * ((float) Math.cos(d6))), 1.0f, paint3);
            }
            return;
        }
        if (i4 == 2) {
            PointF pointF11 = new PointF((zVarF.f(new PointF(0.0f, 0.0f)).x + zVarF.f(new PointF(uVar.f8885c - 1, 0.0f)).x) / 2.0f, 0.0f);
            float fA2 = zVarF.A();
            float fM = ((int) zVarF.m()) * fA2;
            float f32 = fM > 180.0f ? 15.0f : (fM <= 100.0f || fM > 180.0f) ? (fM < 60.0f || fM > 100.0f) ? 1.0f : 5.0f : 10.0f;
            int i8 = (int) (fM / f32);
            Paint paint4 = new Paint();
            paint4.setColor(Color.parseColor("#1EB446"));
            paint4.setStyle(Paint.Style.FILL);
            paint4.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 1.0f));
            float f33 = pointF11.x + (f6210i.f6237c / fA2);
            for (int i9 = 1; i9 <= i8; i9++) {
                float f34 = i9 * f32;
                c cVar = f6210i;
                float f35 = cVar.f6235a;
                float f36 = cVar.f6236b;
                if (f34 < f35 - f36 || f34 > f35 + f36) {
                    canvas.drawCircle(f33, f34 / fA2, 1.5f, paint4);
                }
            }
            paint4.setStrokeWidth(1.0f);
            paint4.setStyle(Paint.Style.STROKE);
            c cVar2 = f6210i;
            canvas.drawCircle(f33, cVar2.f6235a / fA2, cVar2.f6236b / fA2, paint4);
            return;
        }
        if (i4 != 3) {
            return;
        }
        if (!this.f6223c) {
            canvas.drawColor(0);
            return;
        }
        if (this.f6222b == null) {
            return;
        }
        Paint paint5 = new Paint();
        paint5.setStrokeWidth(MyApplication.s() * 0.5f);
        paint5.setStyle(Paint.Style.FILL);
        paint5.setColor(getResources().getColor(R.color.colorGreenDark));
        a aVar = this.f6222b;
        PointF pointF12 = aVar.f6229b;
        float f37 = pointF12.x;
        PointF pointF13 = aVar.f6228a;
        float f38 = pointF13.x;
        float f39 = pointF12.y - pointF13.y;
        float f40 = 10.0f / aVar.f6230c;
        int i10 = 1;
        while (true) {
            a aVar2 = this.f6222b;
            PointF pointF14 = aVar2.f6228a;
            float f41 = pointF14.y;
            float f42 = i10 * f40;
            if (f41 + f42 >= f39) {
                break;
            }
            canvas.drawLine(pointF14.x, f41 + f42, aVar2.f6229b.x, f41 + f42, paint5);
            i10++;
        }
        int i11 = 1;
        while (true) {
            a aVar3 = this.f6222b;
            float f43 = aVar3.f6228a.x;
            float f44 = i11 * f40;
            if (f43 + f44 >= aVar3.f6229b.x) {
                return;
            }
            canvas.drawLine(f43 + f44, 0.0f, f43 + f44, getHeight(), paint5);
            i11++;
        }
    }

    public void setBiopsy(int i4) {
        if (i4 == 1) {
            f6215n = 1;
        } else if (i4 == 2) {
            f6215n = 2;
        } else if (i4 == 3) {
            f6215n = 3;
            this.f6223c = !this.f6223c;
        } else {
            f6215n = 0;
        }
        o1.d(null).i("BIOPSY_MODE", f6215n);
    }

    public void setBiopsyEnhance(boolean z3) {
        this.f6224d = z3;
        b bVar = f6209h;
        h.P0(z3, bVar.f6231a, bVar.f6232b);
    }

    public void setBiopsyR(boolean z3) {
        this.f6226f = z3;
    }

    public void setRevert(boolean z3) {
        this.f6227g = z3;
    }

    public USBiopsyView(Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6222b = null;
        this.f6223c = false;
        this.f6224d = false;
        this.f6225e = null;
        this.f6226f = false;
        this.f6227g = false;
    }

    public USBiopsyView(Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6222b = null;
        this.f6223c = false;
        this.f6224d = false;
        this.f6225e = null;
        this.f6226f = false;
        this.f6227g = false;
    }
}
