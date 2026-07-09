package com.sonoptek.pvus_android.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import c.j0;
import c.k0;
import com.sonoHealth.microVUE.R;
import com.sonoptek.magneticpositiondemo.jni.Needle;
import com.sonoptek.pvus_android.MyApplication;
import com.sonoptek.pvus_android.h;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import k2.g;
import m2.b0;
import m2.c0;
import m2.d0;
import m2.u;
import m2.w;
import m2.y;
import m2.z;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class USImageSurfaceView extends SurfaceView implements SurfaceHolder.Callback, Runnable {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static boolean f6254q0;
    public Bitmap A;
    public boolean B;
    public boolean C;
    public boolean D;
    public d0 E;
    public b0 F;
    public float G;
    public int H;
    public Path I;
    public w J;
    public Bitmap K;
    public Date L;
    public float[] M;
    public float N;
    public float O;
    public int P;
    public float Q;
    public float R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public final Paint W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f6255a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SurfaceHolder f6256b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f6257b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Thread f6258c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public PointF f6259c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Canvas f6260d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public PointF f6261d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6262e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public PointF f6263e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6264f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public PointF f6265f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f6266g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public PointF f6267g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f6268h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f6269h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6270i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f6271i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6272j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f6273j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<c> f6274k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f6275k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Path f6276l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f6277l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bitmap f6278m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f6279m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Matrix f6280n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f6281n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f6282o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f6283o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6284p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f6285p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6286q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f6287r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final PathEffect f6288s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Needle.c f6289t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6290u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public z f6291v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b2.f f6292w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f6293x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6294y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f6295z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f6296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f6297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f6298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f6299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f6300f;

        public a(float f4, float f5, float f6, float f7, boolean z3) {
            this.f6296b = f4;
            this.f6297c = f5;
            this.f6298d = f6;
            this.f6299e = f7;
            this.f6300f = z3;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.S0((int) this.f6296b, (int) this.f6297c, (int) this.f6298d, (int) this.f6299e);
            if (this.f6300f) {
                h.o1(USImageSurfaceView.this.f6279m0, USImageSurfaceView.this.f6281n0);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(400L);
                if (USImageSurfaceView.this.U) {
                    return;
                }
                USImageSurfaceView.this.V = 0;
            } catch (InterruptedException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PointF f6303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PointF f6304b;

        public c() {
        }

        public /* synthetic */ c(USImageSurfaceView uSImageSurfaceView, a aVar) {
            this();
        }
    }

    public class d extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<b2.f> f6307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b2.f f6308d;

        public d() {
            this.f6306b = false;
            this.f6307c = new ArrayList();
        }

        public void a() {
            this.f6306b = true;
        }

        public void b(b2.f fVar) {
            this.f6307c.add(fVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v22 */
        /* JADX WARN: Type inference failed for: r5v24, types: [int] */
        /* JADX WARN: Type inference failed for: r5v25 */
        /* JADX WARN: Type inference failed for: r5v40 */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            d0 d0Var;
            Bitmap bitmapE;
            float f4;
            b2.f fVar;
            boolean z3;
            boolean z4;
            USImageSurfaceView uSImageSurfaceView;
            USImageSurfaceView uSImageSurfaceView2;
            ?? r5;
            PointF pointF;
            float height;
            super.run();
            while (!this.f6306b) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f6307c.size() > 0) {
                    if (USImageSurfaceView.this.f6291v.n() == 0.0f || (bitmapE = USImageSurfaceView.this.f6291v.e((d0Var = this.f6307c.get(0).f4499a))) == null) {
                        return;
                    }
                    u uVar = (u) d0Var.f8789f.get("b_data");
                    USImageSurfaceView.this.f6294y = uVar.f8885c;
                    USImageSurfaceView.this.f6295z = uVar.f8886d;
                    USImageSurfaceView uSImageSurfaceView3 = USImageSurfaceView.this;
                    uSImageSurfaceView3.f6257b0 = uVar.f8889g >= 100000.0f;
                    uSImageSurfaceView3.f6267g0 = uSImageSurfaceView3.f6291v.l();
                    boolean z5 = d0Var instanceof w;
                    if (z5 || d0Var.f8789f.containsKey("color_data") || d0Var.f8789f.containsKey("power_data") || d0Var.f8789f.containsKey("pw_data")) {
                        USImageSurfaceView.setEnableBLine(false);
                        USImageSurfaceView.this.f6290u = false;
                        h.t1(false);
                    } else {
                        USImageSurfaceView.this.f6290u = true;
                    }
                    if (USImageSurfaceView.f6254q0) {
                        int i4 = uVar.f8892j;
                        int i5 = i4 > 80 ? 80 : i4;
                        int iG = 20 - (h.G() * 5);
                        int iG2 = 512 - ((h.G() * h.G()) * 20);
                        byte[] bArr = uVar.f8883a;
                        ArrayList<Integer> arrayListB = i2.a.b(i2.a.a(bArr, bArr.length / 512, 512, i5, 1500, iG, iG2), 5, 5);
                        USImageSurfaceView uSImageSurfaceView4 = USImageSurfaceView.this;
                        uSImageSurfaceView4.P(uSImageSurfaceView4.f6291v, arrayListB);
                    } else {
                        USImageSurfaceView.this.f6274k = null;
                    }
                    USImageSurfaceView uSImageSurfaceView5 = USImageSurfaceView.this;
                    uSImageSurfaceView5.P = (int) uVar.f8891i;
                    uSImageSurfaceView5.N = uSImageSurfaceView5.f6291v.A();
                    USImageSurfaceView uSImageSurfaceView6 = USImageSurfaceView.this;
                    uSImageSurfaceView6.O = uSImageSurfaceView6.f6291v.s();
                    PointF pointF2 = new PointF();
                    pointF2.x = 0.0f;
                    pointF2.y = 0.0f;
                    USImageSurfaceView uSImageSurfaceView7 = USImageSurfaceView.this;
                    uSImageSurfaceView7.f6282o = uSImageSurfaceView7.f6291v.f(pointF2);
                    USImageSurfaceView.this.f6282o.x -= 70.0f;
                    if (USImageSurfaceView.this.f6282o.x < 40.0f) {
                        USImageSurfaceView.this.f6282o.x = 40.0f;
                    }
                    USImageSurfaceView.this.f6282o.y += USImageSurfaceView.this.f6287r * 2.0f;
                    USImageSurfaceView uSImageSurfaceView8 = USImageSurfaceView.this;
                    float f5 = -1.0f;
                    if (uSImageSurfaceView8.f6284p) {
                        uSImageSurfaceView8.f6282o.x = USImageSurfaceView.this.getWidth() - USImageSurfaceView.this.f6282o.x;
                        f4 = -1.0f;
                    } else {
                        f4 = 1.0f;
                    }
                    USImageSurfaceView uSImageSurfaceView9 = USImageSurfaceView.this;
                    if (uSImageSurfaceView9.f6286q) {
                        if (uSImageSurfaceView9.J == null && uSImageSurfaceView9.F == null) {
                            pointF = USImageSurfaceView.this.f6282o;
                            height = USImageSurfaceView.this.getHeight();
                        } else {
                            pointF = USImageSurfaceView.this.f6282o;
                            height = USImageSurfaceView.this.getHeight() * 0.7f;
                        }
                        pointF.y = height - USImageSurfaceView.this.f6282o.y;
                    } else {
                        f5 = 1.0f;
                    }
                    USImageSurfaceView.this.f6280n.reset();
                    Matrix matrix = USImageSurfaceView.this.f6280n;
                    float f6 = USImageSurfaceView.this.O;
                    matrix.preScale(f4 * f6, f5 * f6);
                    USImageSurfaceView.this.f6278m = Bitmap.createBitmap(bitmapE, 0, 0, bitmapE.getWidth(), bitmapE.getHeight(), USImageSurfaceView.this.f6280n, true);
                    if (d0Var instanceof b2.e) {
                        b2.e eVar = (b2.e) d0Var;
                        USImageSurfaceView.this.setColorValue(eVar.a());
                        d0 d0VarB = eVar.b();
                        if (USImageSurfaceView.this.V == 1 && USImageSurfaceView.this.f6279m0 > 0) {
                            b0 b0Var = (b0) d0VarB.f8789f.get("pw_data");
                            b0Var.f8712c = USImageSurfaceView.this.f6279m0;
                            int i6 = b0Var.f8714e - b0Var.f8713d;
                            b0Var.f8713d = USImageSurfaceView.this.f6281n0;
                            b0Var.f8714e = USImageSurfaceView.this.f6281n0 + i6;
                        }
                        USImageSurfaceView.this.setPwValue(d0VarB);
                        USImageSurfaceView.this.D = true;
                        fVar = null;
                        USImageSurfaceView.this.J = null;
                        r5 = 0;
                    } else {
                        fVar = null;
                        if (d0Var.f8789f.containsKey("color_data")) {
                            USImageSurfaceView.this.setColorValue(d0Var);
                            USImageSurfaceView.this.F = null;
                            uSImageSurfaceView2 = USImageSurfaceView.this;
                            uSImageSurfaceView2.J = null;
                            z3 = false;
                        } else {
                            z3 = false;
                            if (d0Var.f8789f.containsKey("power_data")) {
                                USImageSurfaceView.this.setPowerValue(d0Var);
                                USImageSurfaceView.this.F = null;
                                uSImageSurfaceView2 = USImageSurfaceView.this;
                            } else if (d0Var.f8789f.containsKey("pw_data")) {
                                USImageSurfaceView.this.setPwValue(d0Var);
                                uSImageSurfaceView2 = USImageSurfaceView.this;
                                uSImageSurfaceView2.A = null;
                            } else {
                                if (z5) {
                                    USImageSurfaceView uSImageSurfaceView10 = USImageSurfaceView.this;
                                    w wVar = (w) d0Var;
                                    uSImageSurfaceView10.J = wVar;
                                    uSImageSurfaceView10.H = wVar.f8907h;
                                    uSImageSurfaceView10.K = wVar.f8906g.a();
                                    USImageSurfaceView uSImageSurfaceView11 = USImageSurfaceView.this;
                                    uSImageSurfaceView11.A = null;
                                    uSImageSurfaceView11.F = null;
                                    uSImageSurfaceView = USImageSurfaceView.this;
                                    z4 = false;
                                } else {
                                    z4 = false;
                                    USImageSurfaceView uSImageSurfaceView12 = USImageSurfaceView.this;
                                    uSImageSurfaceView12.M = uVar.f8897o;
                                    uSImageSurfaceView12.J = null;
                                    uSImageSurfaceView12.A = null;
                                    uSImageSurfaceView12.F = null;
                                    uSImageSurfaceView = USImageSurfaceView.this;
                                }
                                uSImageSurfaceView.D = z4;
                                r5 = z4;
                            }
                            uSImageSurfaceView2.J = null;
                        }
                        uSImageSurfaceView2.D = z3;
                        r5 = z3;
                    }
                    this.f6307c.remove((int) r5);
                    this.f6308d = fVar;
                    USImageSurfaceView.this.f6264f = true;
                }
                if (((int) (System.currentTimeMillis() - jCurrentTimeMillis)) < 20) {
                    try {
                        Thread.sleep(20 - r0);
                    } catch (InterruptedException e4) {
                        e4.printStackTrace();
                    }
                }
            }
        }

        public /* synthetic */ d(USImageSurfaceView uSImageSurfaceView, a aVar) {
            this();
        }
    }

    public USImageSurfaceView(Context context) {
        super(context);
        this.f6264f = true;
        this.f6268h = new Object();
        this.f6280n = new Matrix();
        this.f6284p = false;
        this.f6286q = false;
        this.f6287r = MyApplication.t() * 0.5f;
        this.f6288s = new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f);
        this.f6293x = MyApplication.u() * 6.0f;
        this.f6294y = 128;
        this.f6295z = 512;
        this.C = true;
        this.H = -1;
        this.I = new Path();
        this.N = 0.1f;
        this.O = 0.1f;
        this.P = 200;
        this.Q = MyApplication.s();
        this.R = MyApplication.s() * 20.0f;
        this.U = false;
        this.V = 0;
        this.W = new Paint(3);
        this.f6259c0 = new PointF();
        this.f6261d0 = new PointF();
        this.f6263e0 = new PointF();
        this.f6265f0 = new PointF();
        this.f6267g0 = new PointF();
        this.f6279m0 = -1;
        H();
    }

    public static boolean I() {
        return f6254q0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorValue(d0 d0Var) {
        if (d0Var != null) {
            y yVar = (y) d0Var.f8789f.get("color_data");
            Bitmap bitmapB = this.f6291v.b(d0Var, this.B);
            if (bitmapB == null) {
                return;
            }
            this.f6277l0 = yVar.f8921h;
            if (!this.D) {
                this.M = yVar.f8923j;
            }
            this.A = Bitmap.createBitmap(bitmapB, 0, 0, bitmapB.getWidth(), bitmapB.getHeight(), this.f6280n, true);
            int i4 = yVar.f8917d;
            float f4 = i4;
            int i5 = yVar.f8918e;
            float f5 = i5;
            int i6 = yVar.f8919f;
            int i7 = yVar.f8920g;
            if (f4 == 0.0f || f5 - f4 == 0.0f) {
                h.S0((r11 / 2) - 16, (this.f6294y / 2) + 16, (r1 / 2) - 16, (this.f6295z / 2) + 16);
            } else {
                if (this.V == 1) {
                    return;
                }
                float f6 = i4;
                this.f6269h0 = f6;
                float f7 = i5;
                this.f6271i0 = f7;
                float f8 = i6;
                this.f6273j0 = f8;
                float f9 = i7;
                this.f6275k0 = f9;
                if (f6 != 0.0f && f7 - f6 != 0.0f) {
                    N(this.f6291v.F(new PointF(this.f6269h0, this.f6273j0), (int) this.f6277l0), this.f6291v.F(new PointF(this.f6271i0, this.f6273j0), (int) this.f6277l0), this.f6291v.F(new PointF(this.f6269h0, this.f6275k0), (int) this.f6277l0), this.f6291v.F(new PointF(this.f6271i0, this.f6275k0), (int) this.f6277l0));
                    return;
                }
                h.S0((r11 / 2) - 16, (this.f6294y / 2) + 16, (int) f8, (int) f9);
            }
            this.A = null;
        }
    }

    public static void setEnableBLine(boolean z3) {
        f6254q0 = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPowerValue(d0 d0Var) {
        c0 c0Var = (c0) d0Var.f8789f.get("power_data");
        Bitmap bitmapG = this.f6291v.g(d0Var);
        if (bitmapG == null) {
            return;
        }
        this.f6277l0 = c0Var.f8734h;
        this.A = Bitmap.createBitmap(bitmapG, 0, 0, bitmapG.getWidth(), bitmapG.getHeight(), this.f6280n, true);
        this.M = c0Var.f8736j;
        L(this.f6291v.l());
        if (this.V != 1) {
            float f4 = c0Var.f8730d;
            this.f6269h0 = f4;
            float f5 = c0Var.f8731e;
            this.f6271i0 = f5;
            float f6 = c0Var.f8732f;
            this.f6273j0 = f6;
            float f7 = c0Var.f8733g;
            this.f6275k0 = f7;
            if (f4 == 0.0f || f5 - f4 == 0.0f) {
                h.S0((r10 / 2) - 16, (this.f6294y / 2) + 16, (int) f6, (int) f7);
            }
            int i4 = (int) c0Var.f8734h;
            N(this.f6291v.F(new PointF(this.f6269h0, this.f6273j0), i4), this.f6291v.F(new PointF(this.f6271i0, this.f6273j0), i4), this.f6291v.F(new PointF(this.f6269h0, this.f6275k0), i4), this.f6291v.F(new PointF(this.f6271i0, this.f6275k0), i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPwValue(d0 d0Var) {
        if (d0Var != null) {
            b0 b0Var = (b0) d0Var.f8789f.get("pw_data");
            this.F = b0Var;
            this.M = b0Var.f8717h;
            this.G = (((int) h.p(b0Var.f8718i)) * 154000.0f) / (((this.F.f8719j * 1000000.0f) * 4.0f) * ((float) Math.cos((float) (((double) (r0.f8720k / 180.0f)) * 3.141592653589793d))));
        }
    }

    public final void A(Canvas canvas) {
        if (this.A != null) {
            this.W.setStyle(Paint.Style.STROKE);
            this.W.setStrokeWidth(2.0f);
            this.W.setColor(getResources().getColor(R.color.colorGreenDark));
            if (this.f6257b0) {
                PointF pointF = this.f6259c0;
                float f4 = pointF.x;
                float f5 = pointF.y;
                PointF pointF2 = this.f6263e0;
                canvas.drawLine(f4, f5, pointF2.x, pointF2.y, this.W);
                PointF pointF3 = this.f6261d0;
                float f6 = pointF3.x;
                float f7 = pointF3.y;
                PointF pointF4 = this.f6265f0;
                canvas.drawLine(f6, f7, pointF4.x, pointF4.y, this.W);
                PointF pointF5 = this.f6259c0;
                float f8 = pointF5.x;
                float f9 = pointF5.y;
                PointF pointF6 = this.f6261d0;
                canvas.drawLine(f8, f9, pointF6.x, pointF6.y, this.W);
                PointF pointF7 = this.f6263e0;
                float f10 = pointF7.x;
                float f11 = pointF7.y;
                PointF pointF8 = this.f6265f0;
                canvas.drawLine(f10, f11, pointF8.x, pointF8.y, this.W);
            } else {
                PointF pointF9 = this.f6259c0;
                float f12 = pointF9.x;
                float f13 = pointF9.y;
                PointF pointF10 = this.f6263e0;
                canvas.drawLine(f12, f13, pointF10.x, pointF10.y, this.W);
                PointF pointF11 = this.f6261d0;
                float f14 = pointF11.x;
                float f15 = pointF11.y;
                PointF pointF12 = this.f6265f0;
                canvas.drawLine(f14, f15, pointF12.x, pointF12.y, this.W);
                w(this.f6267g0, this.f6259c0, this.f6261d0, canvas);
                w(this.f6267g0, this.f6263e0, this.f6265f0, canvas);
            }
            if (this.C) {
                this.W.setStrokeWidth(2.0f);
                PointF[] pointFArr = {this.f6259c0, this.f6261d0, this.f6263e0, this.f6265f0};
                for (int i4 = 0; i4 < 4; i4++) {
                    PointF pointF13 = pointFArr[i4];
                    float f16 = 10;
                    PointF pointF14 = new PointF(pointF13.x - f16, pointF13.y - f16);
                    float f17 = 20;
                    PointF pointF15 = new PointF(pointF14.x, pointF14.y + f17);
                    PointF pointF16 = new PointF(pointF14.x + f17, pointF14.y + f17);
                    PointF pointF17 = new PointF(pointF14.x + f17, pointF14.y);
                    canvas.drawLine(pointF14.x, pointF14.y, pointF15.x, pointF15.y, this.W);
                    canvas.drawLine(pointF15.x, pointF15.y, pointF16.x, pointF16.y, this.W);
                    canvas.drawLine(pointF16.x, pointF16.y, pointF17.x, pointF17.y, this.W);
                    canvas.drawLine(pointF17.x, pointF17.y, pointF14.x, pointF14.y, this.W);
                }
            }
            if (this.V != 1) {
                canvas.drawBitmap(this.A, 0.0f, 0.0f, this.W);
            }
        }
    }

    public final void B(Canvas canvas) {
        PointF pointF;
        float f4;
        float f5;
        z zVar = this.f6291v;
        if (zVar == null || zVar.n() == 0.0f || !h.w0() || !this.f6290u) {
            return;
        }
        f.d();
        z zVarF = f.f();
        if (zVarF == null || zVarF.n() == 0.0f) {
            return;
        }
        float fA = zVarF.A();
        PointF pointF2 = new PointF(0.0f, 0.0f);
        PointF pointF3 = new PointF(256.0f, 512.0f);
        PointF pointFF = zVarF.f(pointF2);
        PointF pointFF2 = zVarF.f(pointF3);
        Needle.c cVar = this.f6289t;
        if (cVar == null || cVar.f4806b == null) {
            pointF = pointFF2;
            f4 = 5.0f;
        } else {
            this.W.setColor(getResources().getColor(R.color.colorGreenDark));
            this.W.setStyle(Paint.Style.STROKE);
            double d4 = pointFF.x;
            y1.f fVar = this.f6289t.f4806b;
            double d5 = fA;
            PointF pointF4 = new PointF((float) (d4 + (fVar.f12843a / d5)), (float) (((double) pointFF.y) + (fVar.f12845c / d5)));
            double d6 = pointFF.x;
            y1.f fVar2 = this.f6289t.f4807c;
            PointF pointF5 = new PointF((float) (d6 + (fVar2.f12843a / d5)), (float) (((double) pointFF.y) + (fVar2.f12845c / d5)));
            this.W.setPathEffect(this.f6288s);
            y1.b bVar = new y1.b(pointF4, pointF5);
            canvas.drawLine(bVar.c(0.0f), 0.0f, bVar.c(getHeight()), getHeight(), this.W);
            y1.c cVar2 = new y1.c(pointF4, (-1.0f) / bVar.b());
            float f6 = 3.0f / fA;
            double dAtan = Math.atan(bVar.b());
            double d7 = f6;
            float fCos = (float) (d7 / Math.cos(dAtan));
            pointF = pointFF2;
            PointF pointFF3 = F(bVar.b(), bVar.a() + fCos, cVar2.b(), cVar2.a());
            PointF pointFF4 = F(bVar.b(), bVar.a() - fCos, cVar2.b(), cVar2.a());
            y1.c cVar3 = new y1.c(pointFF3, bVar.b());
            y1.c cVar4 = new y1.c(pointFF4, bVar.b());
            float fSin = (float) (Math.sin(dAtan) * d7);
            float f7 = pointF5.x - fSin;
            float fD = cVar3.d(f7);
            float f8 = pointFF3.x;
            float f9 = pointFF3.y;
            float f10 = pointF5.x + fSin;
            float fD2 = cVar4.d(f10);
            float f11 = pointFF4.x;
            float f12 = pointFF4.y;
            this.W.setPathEffect(null);
            this.W.setStrokeWidth(1.0f);
            canvas.drawLine(pointF4.x, pointF4.y, pointF5.x, pointF5.y, this.W);
            canvas.drawLine(f10, fD2, f11, f12, this.W);
            canvas.drawLine(f7, fD, f8, f9, this.W);
            this.W.setStrokeWidth(2.0f);
            Needle.c cVar5 = this.f6289t;
            float fAbs = (float) Math.abs(cVar5.f4806b.f12844b - cVar5.f4807c.f12844b);
            Needle.c cVar6 = this.f6289t;
            if (((float) Math.atan(fAbs / ((float) Math.abs(cVar6.f4806b.f12843a - cVar6.f4807c.f12843a)))) > 1.0471975511965976d) {
                y1.f fVar3 = this.f6289t.f4808d;
                float f13 = (((float) fVar3.f12843a) / fA) + pointFF.x;
                float f14 = (((float) fVar3.f12845c) / fA) + pointFF.y;
                RectF rectF = new RectF(f13 - f6, f14 - f6, f13 + f6, f14 + f6);
                if (((float) Math.sqrt(Math.pow(f13 - pointF4.x, 2.0d) + Math.pow(f14 - pointF4.y, 2.0d))) < f6) {
                    this.W.setColor(getResources().getColor(R.color.colorGreenDark));
                } else {
                    this.W.setColor(v0.u.f12223u);
                }
                this.W.setPathEffect(null);
                canvas.drawRect(rectF, this.W);
            } else {
                double d8 = f11;
                float fCos2 = (float) (d8 - (Math.cos(dAtan) * d7));
                float fD3 = cVar4.d(fCos2);
                float fCos3 = (float) (d8 + (Math.cos(dAtan) * d7));
                float fD4 = cVar4.d(fCos3);
                double d9 = f8;
                float fCos4 = (float) (d9 - (Math.cos(dAtan) * d7));
                float fD5 = cVar3.d(fCos4);
                float fCos5 = (float) (d9 + (Math.cos(dAtan) * d7));
                float fD6 = cVar3.d(fCos5);
                Path path = new Path();
                path.moveTo(fCos2, fD3);
                path.lineTo(fCos3, fD4);
                path.lineTo(fCos5, fD6);
                path.lineTo(fCos4, fD5);
                path.lineTo(fCos2, fD3);
                canvas.drawPath(path, this.W);
            }
            this.W.setColor(v0.u.f12223u);
            this.W.setStyle(Paint.Style.FILL);
            this.W.setPathEffect(null);
            f4 = 5.0f;
            canvas.drawCircle(pointF4.x, pointF4.y, 5.0f, this.W);
        }
        float fS = MyApplication.s() * 150.0f;
        float fS2 = MyApplication.s() * 3.0f;
        float fS3 = MyApplication.s() * f4;
        float f15 = (fS - (fS3 * 2.0f)) / (pointF.x - pointFF.x);
        float fS4 = MyApplication.s() * 25.0f;
        float fS5 = MyApplication.s() * 20.0f;
        float f16 = fS5 + fS;
        RectF rectF2 = new RectF((getWidth() - 80.0f) - fS4, fS5, getWidth() - 80.0f, f16);
        this.W.setColor(-16711936);
        canvas.drawCircle(rectF2.left + (fS4 / 2.0f), rectF2.top, 8.0f, this.W);
        this.W.setColor(-1);
        canvas.drawRoundRect(rectF2, 10.0f, 10.0f, this.W);
        RectF rectF3 = new RectF(((getWidth() - 80.0f) - fS4) + fS2, fS5 + fS3, (getWidth() - 80.0f) - fS2, f16 - fS3);
        float f17 = rectF3.right - rectF3.left;
        this.W.setColor(Color.parseColor("#7d9ec0"));
        canvas.drawRect(rectF3, this.W);
        this.W.setColor(Color.parseColor("#87cefa"));
        this.W.setStrokeWidth(4.0f);
        float f18 = rectF3.left;
        float f19 = f17 / 2.0f;
        canvas.drawLine(f18 + f19, rectF3.top, f18 + f19, rectF3.bottom, this.W);
        Needle.c cVar7 = this.f6289t;
        if (cVar7 == null || cVar7.f4806b == null) {
            f5 = f16;
        } else {
            this.W.setStrokeWidth(3.0f);
            Needle.c cVar8 = this.f6289t;
            double d10 = fA;
            float f20 = ((float) (cVar8.f4806b.f12844b / d10)) * f15;
            float f21 = ((float) (cVar8.f4807c.f12844b / d10)) * f15;
            if (Math.abs(f21 - f20) > fS) {
                f21 = f20 > f21 ? f20 - fS : f20 + fS;
            }
            Path path2 = new Path();
            Needle.c cVar9 = this.f6289t;
            float f22 = ((float) (cVar9.f4806b.f12843a / d10)) * f15;
            f5 = f16;
            float f23 = ((float) (cVar9.f4807c.f12843a / d10)) * f15;
            if (Math.abs(f23 - f22) > fS) {
                f23 = f22 > f23 ? f22 - fS : f22 + fS;
            }
            path2.moveTo(rectF3.left + f19 + f21, rectF3.top + f23);
            path2.lineTo(rectF3.left + f19 + f20, rectF3.top + f22);
            this.W.setColor(getResources().getColor(R.color.colorGreenDark));
            this.W.setStyle(Paint.Style.STROKE);
            canvas.drawPath(path2, this.W);
            this.W.setColor(-16776961);
            this.W.setStyle(Paint.Style.FILL);
            canvas.drawCircle(rectF3.left + f19 + f20, rectF3.top + f22, 5.0f, this.W);
        }
        this.W.setStyle(Paint.Style.FILL);
        Needle.a aVarG = Needle.g();
        if (aVarG == null) {
            return;
        }
        float fS6 = MyApplication.s() * 6.0f;
        float fS7 = MyApplication.s() * 12.0f;
        float width = (getWidth() - (aVarG.f4802a.length * fS6)) - 80.0f;
        float f24 = f5 + (fS7 * 3.0f) + 20.0f;
        int i4 = 0;
        while (true) {
            int[] iArr = aVarG.f4802a;
            if (i4 >= iArr.length) {
                return;
            }
            this.W.setColor(iArr[i4]);
            float f25 = i4;
            float f26 = ((0.5f * f25) + 1.0f) * fS7;
            float f27 = (f25 * fS6) + width;
            canvas.drawRect(new RectF(f27, f24 - f26, f27 + fS6, f24), this.W);
            i4++;
        }
    }

    public final void C(Canvas canvas) {
        b0 b0Var = this.F;
        if (b0Var != null) {
            int i4 = b0Var.f8712c;
            int i5 = b0Var.f8714e;
            int i6 = b0Var.f8713d;
            int i7 = i5 - i6;
            this.f6283o0 = i7;
            if (this.V == 1) {
                i4 = this.f6279m0;
                i6 = this.f6281n0;
                i5 = i6 + i7;
            }
            float f4 = i4;
            PointF pointF = new PointF(f4, 0.0f);
            PointF pointF2 = new PointF(f4, 1.0f);
            PointF pointF3 = new PointF(f4, 510.0f);
            PointF pointF4 = new PointF(f4, i6 + 0.0f);
            PointF pointF5 = new PointF(f4, i5 + 0.0f);
            float f5 = f4 - 4.0f;
            PointF pointF6 = new PointF(f5, pointF4.y);
            float f6 = 4.0f + f4;
            PointF pointF7 = new PointF(f6, pointF4.y);
            PointF pointF8 = new PointF(f5, pointF5.y);
            PointF pointF9 = new PointF(f6, pointF5.y);
            PointF pointF10 = new PointF(f4, (i6 + i5) / 2.0f);
            PointF pointF11 = new PointF(pointF10.x + 8.0f, pointF10.y);
            pointF10.x -= 8.0f;
            b0 b0Var2 = this.F;
            int i8 = (int) b0Var2.f8711b;
            int i9 = b0Var2.f8720k;
            PointF pointFF = this.f6291v.f(pointF);
            if (pointFF == null) {
                return;
            }
            PointF pointFF2 = this.f6291v.F(pointF2, i8);
            PointF pointFF3 = this.f6291v.F(pointF3, i8);
            PointF pointFF4 = this.f6291v.F(pointF4, i8);
            PointF pointFF5 = this.f6291v.F(pointF5, i8);
            PointF pointFF6 = this.f6291v.f(pointF6);
            PointF pointFF7 = this.f6291v.f(pointF8);
            PointF pointFF8 = this.f6291v.f(pointF7);
            PointF pointFF9 = this.f6291v.f(pointF9);
            PointF pointFF10 = this.f6291v.f(pointF10);
            PointF pointFF11 = this.f6291v.f(pointF11);
            float f7 = i8;
            PointF pointFO = O(pointFF6, f7, pointFF);
            PointF pointFO2 = O(pointFF8, f7, pointFF);
            PointF pointFO3 = O(pointFF7, f7, pointFF);
            PointF pointFO4 = O(pointFF9, f7, pointFF);
            PointF pointFO5 = O(pointFF10, f7, pointFF);
            PointF pointFO6 = O(pointFF11, f7, pointFF);
            pointFF.x = (pointFO5.x + pointFO6.x) / 2.0f;
            pointFF.y = (pointFO5.y + pointFO6.y) / 2.0f;
            PointF pointFO7 = O(pointFO5, this.F.f8720k - 90, pointFF);
            PointF pointFO8 = O(pointFO6, this.F.f8720k - 90, pointFF);
            if (this.f6284p) {
                int i10 = this.f6270i;
                pointFF2.x = i10 - pointFF2.x;
                pointFF4.x = i10 - pointFF4.x;
                pointFO2.x = i10 - pointFO2.x;
                pointFO.x = i10 - pointFO.x;
                pointFO4.x = i10 - pointFO4.x;
                pointFO3.x = i10 - pointFO3.x;
                pointFF5.x = i10 - pointFF5.x;
                pointFF3.x = i10 - pointFF3.x;
                pointFO8.x = i10 - pointFO8.x;
                pointFO7.x = i10 - pointFO7.x;
            }
            if (this.f6286q) {
                int i11 = this.f6272j;
                pointFF2.y = (i11 * 0.7f) - pointFF2.y;
                pointFF4.y = (i11 * 0.7f) - pointFF4.y;
                pointFO2.y = (i11 * 0.7f) - pointFO2.y;
                pointFO.y = (i11 * 0.7f) - pointFO.y;
                pointFO4.y = (i11 * 0.7f) - pointFO4.y;
                pointFO3.y = (i11 * 0.7f) - pointFO3.y;
                pointFF5.y = (i11 * 0.7f) - pointFF5.y;
                pointFF3.y = (i11 * 0.7f) - pointFF3.y;
                pointFO8.y = (i11 * 0.7f) - pointFO8.y;
                pointFO7.y = (i11 * 0.7f) - pointFO7.y;
            }
            this.W.setColor(getResources().getColor(R.color.colorGreenDark));
            canvas.drawLine(pointFF2.x, pointFF2.y, pointFF4.x, pointFF4.y, this.W);
            canvas.drawLine(pointFO2.x, pointFO2.y, pointFO.x, pointFO.y, this.W);
            canvas.drawLine(pointFO4.x, pointFO4.y, pointFO3.x, pointFO3.y, this.W);
            canvas.drawLine(pointFF5.x, pointFF5.y, pointFF3.x, pointFF3.y, this.W);
            if (i9 != 0) {
                canvas.drawLine(pointFO8.x, pointFO8.y, pointFO7.x, pointFO7.y, this.W);
            }
        }
    }

    public final void D(Canvas canvas) {
        float width;
        float f4;
        float f5;
        float f6;
        b0 b0Var = this.F;
        if (b0Var == null || b0Var.f8718i <= 0) {
            return;
        }
        this.W.setColor(-1);
        this.W.setStrokeWidth(2.0f);
        int width2 = getWidth() - 160;
        int height = (int) (getHeight() * 0.3f);
        int height2 = (int) (getHeight() * 0.7f);
        Bitmap bitmapA = g.a(this.f6292w.f4501c, h.q() == 0 ? 4 : h.q());
        if (bitmapA != null) {
            width = bitmapA.getWidth();
            canvas.drawBitmap(k2.c.o(bitmapA, width2, height), 0.0f, height2, this.W);
        } else {
            width = 624.0f;
        }
        float f7 = width;
        float f8 = height;
        float f9 = width2;
        this.W.setColor(-1);
        this.W.setTextSize(this.f6293x);
        this.W.setStyle(Paint.Style.FILL);
        float f10 = height2;
        canvas.drawLine(0.0f, f10 + ((h.q() * f8) / 4.0f), f9 + 40.0f, f10 + ((h.q() * f8) / 4.0f), this.W);
        canvas.drawText("cm/s", 50.0f + f9, ((h.q() * f8) / 4.0f) + f10, this.W);
        float f11 = this.G;
        float f12 = (f8 / 2.0f) / f11;
        int i4 = 7;
        float[] fArr = {2.0f, 4.0f, 10.0f, 20.0f, 50.0f, 100.0f, 200.0f};
        float[] fArr2 = {1.0f, 2.0f, 5.0f, 10.0f, 10.0f, 20.0f, 50.0f};
        float f13 = 10.0f;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                f4 = f7;
                f5 = f13;
                f6 = 5.0f;
                break;
            }
            f13 = fArr[i5];
            f4 = f7;
            if (f11 / f13 <= 3.0d) {
                f6 = fArr2[i5];
                f5 = f13;
                break;
            } else {
                i5++;
                f7 = f4;
                i4 = 7;
            }
        }
        float f14 = f9 + 30.0f;
        float fQ = (h.q() * f8) / 4.0f;
        float fQ2 = (h.q() / 4.0f) * f11 * 2.0f;
        float fQ3 = f11 * (1.0f - (h.q() / 4.0f)) * 2.0f;
        for (int i6 = 1; i6 <= ((int) (fQ2 / f6)); i6++) {
            float f15 = (f10 + fQ) - ((i6 * f6) * f12);
            canvas.drawLine(f14 - 5.0f, f15, f14 + 5.0f, f15, this.W);
        }
        for (int i7 = 1; i7 <= ((int) (fQ3 / f6)); i7++) {
            float f16 = f10 + fQ + (i7 * f6 * f12);
            canvas.drawLine(f14 - 5.0f, f16, f14 + 5.0f, f16, this.W);
        }
        int i8 = 1;
        while (i8 <= ((int) (fQ2 / f5))) {
            float f17 = i8 * f5;
            float f18 = (f10 + fQ) - (f17 * f12);
            canvas.drawLine(f14 - 10.0f, f18, f14 + 10.0f, f18, this.W);
            canvas.drawText(s0.a.f11071l + ((int) f17), f14 + 30.0f, f18, this.W);
            i8++;
            f8 = f8;
        }
        float f19 = f8;
        for (int i9 = 1; i9 <= ((int) (fQ3 / f5)); i9++) {
            float f20 = f10 + fQ + (i9 * f5 * f12);
            canvas.drawLine(f14 - 10.0f, f20, f14 + 10.0f, f20, this.W);
            canvas.drawText(s0.a.f11071l + ((int) ((-i9) * f5)), f14 + 30.0f, f20, this.W);
        }
        float f21 = f9 / f4;
        float f22 = 0.2f * (this.F.f8718i / 8.0f);
        float f23 = f4 / f22;
        int i10 = 0;
        while (true) {
            float f24 = i10;
            if (f24 >= f23) {
                return;
            }
            float f25 = f9 - ((f24 * f22) * f21);
            float f26 = f19 - 10.0f;
            if (i10 % 5 == 0) {
                f26 = f19 - 20.0f;
            }
            canvas.drawLine(f25, f10 + f19, f25, f10 + f26, this.W);
            i10++;
        }
    }

    public final void E(Canvas canvas) {
        this.W.setColor(-1);
        this.W.setStrokeWidth(this.Q);
        this.W.setTextSize(this.f6293x);
        this.W.setStyle(Paint.Style.FILL);
        this.W.setPathEffect(null);
        int i4 = (int) this.R;
        int i5 = 0;
        for (int i6 = 0; i6 <= this.P; i6 += 5) {
            float f4 = i6 / this.N;
            int i7 = this.f6272j;
            if (f4 > i7) {
                f4 = i7 - 1;
            }
            if (i6 % 10 == 0) {
                float f5 = i4;
                canvas.drawLine(0.0f, f4, 0.0f + (0.4f * f5), f4, this.W);
                canvas.drawText(s0.a.f11071l + i6, 0.0f + (f5 * 0.5f), f4 + this.Q + 3.0f, this.W);
            } else {
                canvas.drawLine(0.0f, f4, 0.0f + (i4 * 0.25f), f4, this.W);
            }
        }
        if (this.M == null) {
            return;
        }
        if (this.A != null || this.F != null) {
            this.W.setColor(getResources().getColor(R.color.colorGreenDark));
        }
        float fS = MyApplication.s() * 8.0f;
        float fS2 = MyApplication.s() * 4.0f;
        while (true) {
            float[] fArr = this.M;
            if (i5 >= fArr.length) {
                return;
            }
            if (fArr[i5] > 0.0f) {
                Path path = new Path();
                float f6 = i4 + 0.0f;
                path.moveTo(f6 - fS, this.M[i5] / this.N);
                path.lineTo(f6, (this.M[i5] / this.N) - fS2);
                path.lineTo(f6 - (fS / 4.0f), this.M[i5] / this.N);
                path.lineTo(f6, (this.M[i5] / this.N) + fS2);
                path.close();
                canvas.drawPath(path, this.W);
            }
            i5++;
        }
    }

    public PointF F(float f4, float f5, float f6, float f7) {
        float f8 = (f7 - f5) / (f4 - f6);
        return new PointF(f8, (f4 * f8) + f5);
    }

    public void G(int i4) {
        if (i4 == 0) {
            this.f6255a0 = false;
            d dVar = this.f6266g;
            if (dVar != null) {
                dVar.a();
                this.f6266g = null;
            }
        } else {
            this.f6255a0 = true;
        }
        this.f6264f = true;
    }

    public final void H() {
        this.f6276l = new Path();
        SurfaceHolder holder = getHolder();
        this.f6256b = holder;
        holder.addCallback(this);
        this.f6256b.setFormat(-2);
    }

    public void J(boolean z3) {
        this.B = z3;
    }

    public void K() {
        d dVar = this.f6266g;
        if (dVar != null) {
            dVar.a();
            this.f6266g = null;
        }
    }

    public void L(PointF pointF) {
        this.f6267g0 = pointF;
    }

    public void M(b2.f fVar, z zVar, boolean z3, boolean z4) {
        this.f6291v = zVar;
        this.f6284p = z3;
        this.f6286q = z4;
        this.f6292w = fVar;
        if (this.f6266g == null) {
            d dVar = new d(this, null);
            this.f6266g = dVar;
            dVar.start();
        }
        this.f6266g.b(fVar);
    }

    public void N(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        float f4;
        if (this.f6284p) {
            int i4 = this.f6270i;
            pointF.x = i4 - pointF.x;
            pointF2.x = i4 - pointF2.x;
            pointF3.x = i4 - pointF3.x;
            pointF4.x = i4 - pointF4.x;
        }
        if (this.f6286q) {
            if (this.D) {
                int i5 = this.f6272j;
                pointF.y = (i5 * 0.7f) - pointF.y;
                pointF2.y = (i5 * 0.7f) - pointF2.y;
                pointF3.y = (i5 * 0.7f) - pointF3.y;
                f4 = i5 * 0.7f;
            } else {
                int i6 = this.f6272j;
                pointF.y = i6 - pointF.y;
                pointF2.y = i6 - pointF2.y;
                pointF3.y = i6 - pointF3.y;
                f4 = i6;
            }
            pointF4.y = f4 - pointF4.y;
        }
        this.f6259c0 = pointF;
        this.f6261d0 = pointF2;
        this.f6263e0 = pointF3;
        this.f6265f0 = pointF4;
    }

    public final PointF O(PointF pointF, float f4, PointF pointF2) {
        PointF pointF3 = new PointF();
        double d4 = (float) (((double) (f4 / 180.0f)) * 3.141592653589793d);
        double d5 = pointF.x - pointF2.x;
        double d6 = pointF.y - pointF2.y;
        float fCos = (float) ((Math.cos(d4) * d5) - (Math.sin(d4) * d6));
        float fSin = (float) ((Math.sin(d4) * d5) + (Math.cos(d4) * d6));
        pointF3.x = fCos + pointF2.x;
        pointF3.y = fSin + pointF2.y;
        return pointF3;
    }

    public final void P(z zVar, ArrayList<Integer> arrayList) {
        a aVar = null;
        if (arrayList == null || arrayList.size() == 0) {
            this.f6274k = null;
            return;
        }
        this.f6274k = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            int iIntValue = arrayList.get(i4).intValue();
            c cVar = new c(this, aVar);
            float f4 = iIntValue;
            PointF pointF = new PointF(f4, 0.0f);
            PointF pointF2 = new PointF(f4, 512.0f);
            cVar.f6303a = zVar.f(pointF);
            cVar.f6304b = zVar.f(pointF2);
            this.f6274k.add(cVar);
        }
    }

    public void Q(Bitmap bitmap, float f4, boolean z3, boolean z4) {
    }

    public void R(Bitmap bitmap, float f4, float f5) {
    }

    public void S(float f4, float f5, boolean z3) {
        this.U = true;
        float f6 = this.f6269h0 + f4;
        float f7 = this.f6271i0 + f4;
        float f8 = this.f6273j0 + f5;
        float f9 = this.f6275k0 + f5;
        if (f6 >= 1.0f && f7 <= this.f6294y - 1 && f8 >= 1.0f && f9 <= this.f6295z - 1) {
            PointF pointF = new PointF(f6, f8);
            PointF pointF2 = new PointF(f7, f8);
            PointF pointF3 = new PointF(f6, f9);
            PointF pointF4 = new PointF(f7, f9);
            PointF pointFF = this.f6291v.F(pointF, (int) this.f6277l0);
            PointF pointFF2 = this.f6291v.F(pointF2, (int) this.f6277l0);
            PointF pointFF3 = this.f6291v.F(pointF3, (int) this.f6277l0);
            PointF pointFF4 = this.f6291v.F(pointF4, (int) this.f6277l0);
            L(this.f6291v.l());
            N(pointFF, pointFF2, pointFF3, pointFF4);
            this.f6264f = true;
            this.V = 1;
            this.f6269h0 = f6;
            this.f6271i0 = f7;
            this.f6273j0 = f8;
            this.f6275k0 = f9;
            if (z3) {
                int i4 = (int) ((f6 + f7) / 2.0f);
                int i5 = this.f6294y;
                if (i4 > i5 - 1) {
                    i4 = i5 - 1;
                }
                int i6 = ((int) ((f8 + f9) / 2.0f)) - (this.f6283o0 / 2);
                int i7 = this.f6295z;
                if (i6 > i7 - 1) {
                    i6 = i7 - 1;
                }
                if (i6 < 5) {
                    i6 = 5;
                }
                this.f6279m0 = i4;
                this.f6281n0 = i6;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f6285p0 > 20) {
                this.f6285p0 = jCurrentTimeMillis;
                new Thread(new a(f6, f7, f8, f9, z3)).start();
            }
        }
    }

    public void T(int i4, int i5) {
        this.T = i4;
        this.S = i5;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void draw(Canvas canvas) {
        String string;
        float fS;
        Paint paint;
        super.draw(canvas);
        if (canvas != null) {
            try {
                canvas.drawColor(z1.f12256t);
                x(canvas);
                A(canvas);
                C(canvas);
                D(canvas);
                y(canvas);
                z(canvas);
                B(canvas);
                this.W.setTextSize(MyApplication.u() * 18.0f);
                this.W.setColor(-1);
                this.W.setStyle(Paint.Style.FILL);
                String str = this.T + "/" + this.S;
                float fMeasureText = this.W.measureText(str) + 25.0f;
                if (this.J == null && this.F == null) {
                    canvas.drawText(str, this.f6270i - fMeasureText, this.f6272j - (MyApplication.s() * 10.0f), this.W);
                    if (this.f6255a0) {
                        string = getResources().getString(R.string.live);
                        fS = this.f6272j - (MyApplication.s() * 30.0f);
                        paint = this.W;
                    } else {
                        string = getResources().getString(R.string.freeze);
                        fS = this.f6272j - (MyApplication.s() * 30.0f);
                        paint = this.W;
                    }
                } else {
                    canvas.drawText(str, this.f6270i - fMeasureText, (this.f6272j * 0.7f) - (MyApplication.s() * 30.0f), this.W);
                    if (this.f6255a0) {
                        string = getResources().getString(R.string.live);
                        fS = (this.f6272j * 0.7f) - (MyApplication.s() * 30.0f);
                        paint = this.W;
                    } else {
                        string = getResources().getString(R.string.freeze);
                        fS = (this.f6272j * 0.7f) - (MyApplication.s() * 30.0f);
                        paint = this.W;
                    }
                }
                canvas.drawText(string, 10.0f, fS, paint);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.f6262e) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f6264f) {
                Canvas canvasLockCanvas = this.f6256b.lockCanvas();
                this.f6260d = canvasLockCanvas;
                if (canvasLockCanvas != null) {
                    draw(canvasLockCanvas);
                    this.f6256b.unlockCanvasAndPost(this.f6260d);
                }
                this.f6264f = false;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (jCurrentTimeMillis2 < 20) {
                try {
                    Thread.sleep(20 - jCurrentTimeMillis2);
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    public void setNeedleLine(Needle.c cVar) {
        this.f6289t = cVar;
    }

    public void setShowSize(boolean z3) {
        this.C = z3;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@j0 SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
        this.f6264f = true;
        this.f6270i = i5;
        this.f6272j = i6;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@j0 SurfaceHolder surfaceHolder) {
        this.f6262e = true;
        Thread thread = new Thread(this);
        this.f6258c = thread;
        thread.start();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@j0 SurfaceHolder surfaceHolder) {
        this.f6262e = false;
        try {
            this.f6258c.join();
            this.f6258c = null;
            d dVar = this.f6266g;
            if (dVar != null) {
                dVar.a();
                this.f6266g = null;
            }
        } catch (InterruptedException e4) {
            e4.printStackTrace();
        }
    }

    public void v(boolean z3) {
        h.S0((int) this.f6269h0, (int) this.f6271i0, (int) this.f6273j0, (int) this.f6275k0);
        if (z3) {
            h.o1(this.f6279m0, this.f6281n0);
        }
        this.U = false;
        new Thread(new b()).start();
    }

    public void w(PointF pointF, PointF pointF2, PointF pointF3, Canvas canvas) {
        PointF pointF4 = new PointF(pointF.x, pointF.y);
        if (this.f6286q) {
            pointF4.y = (this.D ? this.f6272j * 0.7f : this.f6272j) - pointF4.y;
        }
        float f4 = pointF3.x - pointF4.x;
        float f5 = pointF3.y - pointF4.y;
        float fSqrt = (float) Math.sqrt((f4 * f4) + (f5 * f5));
        float f6 = pointF4.x - fSqrt;
        float f7 = pointF4.y - fSqrt;
        float f8 = 2.0f * fSqrt;
        RectF rectF = new RectF(f6, f7, f6 + f8, f8 + f7);
        float fAsin = (float) Math.asin(f5 / fSqrt);
        if (f4 < 0.0f) {
            fAsin = 3.1415927f - fAsin;
        }
        float f9 = (fAsin / 3.1415927f) * 180.0f;
        float f10 = pointF2.x - pointF4.x;
        float f11 = (pointF2.y - pointF4.y) / fSqrt;
        if (f11 > 1.0f) {
            f11 = 1.0f / f11;
        }
        float fAsin2 = (float) Math.asin(f11);
        if (f10 < 0.0f) {
            fAsin2 = 3.1415927f - fAsin2;
        }
        float f12 = (fAsin2 / 3.1415927f) * 180.0f;
        float f13 = f12 - f9;
        canvas.drawArc(rectF, f9, f13 > 300.0f ? (f12 - 360.0f) - f9 : f13, false, this.W);
    }

    public final void x(Canvas canvas) {
        this.W.setColor(getResources().getColor(R.color.black));
        Bitmap bitmap = this.f6278m;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.W);
        }
        this.W.setColor(getResources().getColor(R.color.colorGreenDark));
        this.W.setStyle(Paint.Style.FILL);
        PointF pointF = this.f6282o;
        if (pointF != null) {
            canvas.drawCircle(pointF.x, pointF.y, this.f6287r, this.W);
        }
        if (h.F0()) {
            this.W.setStrokeWidth(MyApplication.s());
            this.W.setStyle(Paint.Style.STROKE);
            this.W.setPathEffect(this.f6288s);
            this.f6276l.reset();
            this.f6276l.moveTo(getWidth() / 2.0f, 0.0f);
            this.f6276l.lineTo(getWidth() / 2.0f, getHeight());
            canvas.drawPath(this.f6276l, this.W);
        }
        if (this.f6274k != null) {
            this.W.setStrokeWidth(MyApplication.t());
            for (int i4 = 0; i4 < this.f6274k.size(); i4++) {
                c cVar = this.f6274k.get(i4);
                PointF pointF2 = cVar.f6303a;
                float f4 = pointF2.x;
                float f5 = pointF2.y;
                PointF pointF3 = cVar.f6304b;
                canvas.drawLine(f4, f5, pointF3.x, pointF3.y, this.W);
            }
            if (this.f6255a0) {
                return;
            }
            this.W.setTextSize(MyApplication.u() * 16.0f);
            this.W.setColor(-1);
            canvas.drawText("B-Line: " + this.f6274k.size(), getWidth() / 2, getHeight() - 150, this.W);
        }
    }

    public final void y(Canvas canvas) {
        if (this.J != null) {
            PointF pointF = new PointF(this.H, 0.0f);
            PointF pointF2 = new PointF(this.H, this.f6295z);
            PointF pointFF = this.f6291v.f(pointF);
            PointF pointFF2 = this.f6291v.f(pointF2);
            this.W.setStyle(Paint.Style.STROKE);
            this.W.setColor(getResources().getColor(R.color.colorGreenDark));
            this.W.setStrokeWidth(2.0f);
            this.W.setPathEffect(this.f6288s);
            if (this.f6284p) {
                int i4 = this.f6270i;
                pointFF.x = i4 - pointFF.x;
                pointFF2.x = i4 - pointFF2.x;
            }
            if (this.f6286q) {
                int i5 = this.f6272j;
                pointFF.y = i5 - pointFF.y;
                pointFF2.y = i5 - pointFF2.y;
            }
            this.I.reset();
            this.I.moveTo(pointFF.x, pointFF.y);
            this.I.lineTo(pointFF2.x, pointFF2.y);
            canvas.drawPath(this.I, this.W);
        }
    }

    public final void z(Canvas canvas) {
        if (this.J != null) {
            float height = getHeight();
            float f4 = 0.0f;
            canvas.drawBitmap(k2.c.o(this.K, getWidth(), height * 0.3f), 0.0f, 0.7f * height, this.W);
            this.W.setStyle(Paint.Style.FILL);
            this.W.setStrokeWidth(1.0f);
            this.W.setColor(-1);
            this.W.setPathEffect(null);
            float width = getWidth() / this.K.getWidth();
            int size = this.J.f8906g.c().size();
            if (size < 1) {
                return;
            }
            if (size < 10) {
                this.L = this.J.f8906g.d((100 - size) + 1);
            }
            if (this.L == null) {
                return;
            }
            if (size < 99) {
                float f5 = size * width;
                canvas.drawLine((getWidth() - f5) + 0.0f, getHeight(), (getWidth() - f5) + 0.0f, getHeight() - 20, this.W);
            }
            int i4 = 1;
            int i5 = 0;
            while (i4 < size && this.J.f8906g.d(100 - (size - i4)) != null) {
                int i6 = 1;
                while (true) {
                    int i7 = i4 + i6;
                    if (i7 > size) {
                        break;
                    }
                    Date dateD = this.J.f8906g.d(100 - (size - i7));
                    Date dateD2 = this.J.f8906g.d(100 - (size - (i7 - 1)));
                    if (dateD == null) {
                        break;
                    }
                    long j4 = i5 * 1000;
                    float time = dateD.getTime() - (this.L.getTime() + j4);
                    float time2 = dateD2.getTime() - (this.L.getTime() + j4);
                    if (time >= 1000.0f) {
                        if (time - 1000.0f > Math.abs(time2 - 1000.0f)) {
                            i6--;
                        }
                        int i8 = i6;
                        float f6 = i8 * width;
                        float f7 = f6 / 5.0f;
                        float f8 = size * width;
                        if ((getWidth() - f8) + f4 > 5.0f) {
                            float f9 = 10.0f;
                            int i9 = 1;
                            while (i9 < 6) {
                                if (i9 % 5 == 0) {
                                    f9 = 25.0f;
                                }
                                float f10 = f9;
                                float f11 = i9 * f7;
                                canvas.drawLine((getWidth() - f8) + f4 + f11, getHeight(), (getWidth() - f8) + f4 + f11, getHeight() - f10, this.W);
                                i9++;
                                f9 = f10;
                            }
                        }
                        f4 += f6;
                        i5++;
                        i4 += i8 - 1;
                    } else {
                        i6++;
                    }
                }
                i4++;
            }
        }
    }

    public USImageSurfaceView(Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6264f = true;
        this.f6268h = new Object();
        this.f6280n = new Matrix();
        this.f6284p = false;
        this.f6286q = false;
        this.f6287r = MyApplication.t() * 0.5f;
        this.f6288s = new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f);
        this.f6293x = MyApplication.u() * 6.0f;
        this.f6294y = 128;
        this.f6295z = 512;
        this.C = true;
        this.H = -1;
        this.I = new Path();
        this.N = 0.1f;
        this.O = 0.1f;
        this.P = 200;
        this.Q = MyApplication.s();
        this.R = MyApplication.s() * 20.0f;
        this.U = false;
        this.V = 0;
        this.W = new Paint(3);
        this.f6259c0 = new PointF();
        this.f6261d0 = new PointF();
        this.f6263e0 = new PointF();
        this.f6265f0 = new PointF();
        this.f6267g0 = new PointF();
        this.f6279m0 = -1;
        H();
    }

    public USImageSurfaceView(Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6264f = true;
        this.f6268h = new Object();
        this.f6280n = new Matrix();
        this.f6284p = false;
        this.f6286q = false;
        this.f6287r = MyApplication.t() * 0.5f;
        this.f6288s = new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f);
        this.f6293x = MyApplication.u() * 6.0f;
        this.f6294y = 128;
        this.f6295z = 512;
        this.C = true;
        this.H = -1;
        this.I = new Path();
        this.N = 0.1f;
        this.O = 0.1f;
        this.P = 200;
        this.Q = MyApplication.s();
        this.R = MyApplication.s() * 20.0f;
        this.U = false;
        this.V = 0;
        this.W = new Paint(3);
        this.f6259c0 = new PointF();
        this.f6261d0 = new PointF();
        this.f6263e0 = new PointF();
        this.f6265f0 = new PointF();
        this.f6267g0 = new PointF();
        this.f6279m0 = -1;
        H();
    }
}
