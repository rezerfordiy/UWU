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
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
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

/* JADX INFO: loaded from: classes.dex */
public class USImageView extends View {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static boolean f6310o0;
    public boolean A;
    public d0 B;
    public b0 C;
    public float D;
    public int E;
    public Path F;
    public w G;
    public Bitmap H;
    public Date I;
    public float[] J;
    public float K;
    public float L;
    public int M;
    public float N;
    public float O;
    public int P;
    public int Q;
    public boolean R;
    public int S;
    public Handler T;
    public final Paint U;
    public boolean V;
    public boolean W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public PointF f6311a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6312b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public PointF f6313b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6314c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public PointF f6315c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f6316d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public PointF f6317d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f6318e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public PointF f6319e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6320f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f6321f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6322g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f6323g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<d> f6324h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f6325h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Path f6326i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f6327i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Bitmap f6328j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f6329j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Matrix f6330k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f6331k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f6332l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f6333l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6334m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f6335m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6336n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public long f6337n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f6338o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PathEffect f6339p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Needle.c f6340q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6341r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z f6342s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b2.f f6343t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f6344u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6345v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6346w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Bitmap f6347x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f6348y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6349z;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@j0 Message message) {
            super.handleMessage(message);
            USImageView.this.invalidate();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f6351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f6352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f6353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f6354e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f6355f;

        public b(float f4, float f5, float f6, float f7, boolean z3) {
            this.f6351b = f4;
            this.f6352c = f5;
            this.f6353d = f6;
            this.f6354e = f7;
            this.f6355f = z3;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.S0((int) this.f6351b, (int) this.f6352c, (int) this.f6353d, (int) this.f6354e);
            if (this.f6355f) {
                h.o1(USImageView.this.f6331k0, USImageView.this.f6333l0);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(400L);
                if (USImageView.this.R) {
                    return;
                }
                USImageView.this.S = 0;
            } catch (InterruptedException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PointF f6358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PointF f6359b;

        public d() {
        }

        public /* synthetic */ d(USImageView uSImageView, a aVar) {
            this();
        }
    }

    public class e extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6361b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<b2.f> f6362c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6363d = 0;

        public e() {
        }

        public void a() {
            this.f6361b = true;
        }

        public void b(b2.f fVar) {
            this.f6362c.add(fVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v30, types: [int] */
        /* JADX WARN: Type inference failed for: r4v37 */
        /* JADX WARN: Type inference failed for: r4v55 */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z3;
            USImageView uSImageView;
            ?? r4;
            PointF pointF;
            float height;
            super.run();
            while (!this.f6361b) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f6362c.size() > 0) {
                    if (USImageView.this.f6342s.n() == 0.0f) {
                        try {
                            Thread.sleep(10L);
                        } catch (InterruptedException e4) {
                            throw new RuntimeException(e4);
                        }
                    } else {
                        d0 d0Var = this.f6362c.get(0).f4499a;
                        Bitmap bitmapE = USImageView.this.f6342s.e(d0Var);
                        u uVar = (u) d0Var.f8789f.get("b_data");
                        if (bitmapE != null) {
                            USImageView.this.f6345v = uVar.f8885c;
                            USImageView.this.f6346w = uVar.f8886d;
                            USImageView uSImageView2 = USImageView.this;
                            uSImageView2.W = uVar.f8889g >= 100000.0f;
                            uSImageView2.f6319e0 = uSImageView2.f6342s.l();
                            boolean z4 = d0Var instanceof w;
                            if (z4 || d0Var.f8789f.containsKey("color_data") || d0Var.f8789f.containsKey("power_data") || d0Var.f8789f.containsKey("pw_data")) {
                                USImageView.setEnableBLine(false);
                                USImageView.this.f6341r = false;
                                h.t1(false);
                            } else {
                                USImageView.this.f6341r = true;
                            }
                            if (USImageView.f6310o0) {
                                int i4 = uVar.f8892j;
                                int i5 = i4 > 80 ? 80 : i4;
                                int iG = 20 - (h.G() * 5);
                                int iG2 = 512 - ((h.G() * h.G()) * 20);
                                byte[] bArr = uVar.f8883a;
                                ArrayList<Integer> arrayListB = i2.a.b(i2.a.a(bArr, bArr.length / 512, 512, i5, 1500, iG, iG2), 5, 5);
                                USImageView uSImageView3 = USImageView.this;
                                uSImageView3.Q(uSImageView3.f6342s, arrayListB);
                            } else {
                                USImageView.this.f6324h = null;
                            }
                            USImageView uSImageView4 = USImageView.this;
                            uSImageView4.M = (int) uVar.f8891i;
                            uSImageView4.K = uSImageView4.f6342s.A();
                            USImageView uSImageView5 = USImageView.this;
                            uSImageView5.L = uSImageView5.f6342s.s();
                            PointF pointF2 = new PointF();
                            pointF2.x = 0.0f;
                            pointF2.y = 0.0f;
                            USImageView uSImageView6 = USImageView.this;
                            uSImageView6.f6332l = uSImageView6.f6342s.f(pointF2);
                            USImageView.this.f6332l.x -= 70.0f;
                            if (USImageView.this.f6332l.x < 40.0f) {
                                USImageView.this.f6332l.x = 40.0f;
                            }
                            USImageView.this.f6332l.y += USImageView.this.f6338o * 2.0f;
                            USImageView uSImageView7 = USImageView.this;
                            if (uSImageView7.f6334m) {
                                uSImageView7.f6332l.x = USImageView.this.getWidth() - USImageView.this.f6332l.x;
                            }
                            USImageView uSImageView8 = USImageView.this;
                            if (uSImageView8.f6336n) {
                                if (uSImageView8.G == null && uSImageView8.C == null) {
                                    pointF = USImageView.this.f6332l;
                                    height = USImageView.this.getHeight();
                                } else {
                                    pointF = USImageView.this.f6332l;
                                    height = USImageView.this.getHeight() * 0.7f;
                                }
                                pointF.y = height - USImageView.this.f6332l.y;
                            }
                            Matrix matrix = USImageView.this.f6330k;
                            float f4 = USImageView.this.L;
                            matrix.setScale(f4, f4);
                            USImageView uSImageView9 = USImageView.this;
                            uSImageView9.f6328j = k2.c.h(bitmapE, uSImageView9.f6334m, uSImageView9.f6336n);
                            if (d0Var instanceof b2.e) {
                                b2.e eVar = (b2.e) d0Var;
                                USImageView.this.setColorValue(eVar.a());
                                d0 d0VarB = eVar.b();
                                if (USImageView.this.S == 1 && USImageView.this.f6331k0 > 0) {
                                    b0 b0Var = (b0) d0VarB.f8789f.get("pw_data");
                                    b0Var.f8712c = USImageView.this.f6331k0;
                                    int i6 = b0Var.f8714e - b0Var.f8713d;
                                    b0Var.f8713d = USImageView.this.f6333l0;
                                    b0Var.f8714e = USImageView.this.f6333l0 + i6;
                                }
                                USImageView.this.setPwValue(d0VarB);
                                USImageView.this.A = true;
                                USImageView.this.G = null;
                                r4 = 0;
                            } else {
                                if (d0Var.f8789f.containsKey("color_data")) {
                                    USImageView.this.setColorValue(d0Var);
                                    USImageView.this.C = null;
                                    uSImageView = USImageView.this;
                                    uSImageView.G = null;
                                } else {
                                    z3 = false;
                                    if (d0Var.f8789f.containsKey("power_data")) {
                                        USImageView.this.setPowerValue(d0Var);
                                        USImageView.this.C = null;
                                        uSImageView = USImageView.this;
                                    } else if (d0Var.f8789f.containsKey("pw_data")) {
                                        USImageView.this.setPwValue(d0Var);
                                        uSImageView = USImageView.this;
                                        uSImageView.f6347x = null;
                                    } else if (z4) {
                                        USImageView uSImageView10 = USImageView.this;
                                        w wVar = (w) d0Var;
                                        uSImageView10.G = wVar;
                                        uSImageView10.E = wVar.f8907h;
                                        uSImageView10.H = wVar.f8906g.a();
                                        USImageView uSImageView11 = USImageView.this;
                                        uSImageView11.f6347x = null;
                                        uSImageView11.C = null;
                                        uSImageView = USImageView.this;
                                    } else {
                                        z3 = false;
                                        USImageView uSImageView12 = USImageView.this;
                                        uSImageView12.J = uVar.f8897o;
                                        uSImageView12.G = null;
                                        uSImageView12.f6347x = null;
                                        uSImageView12.C = null;
                                        uSImageView = USImageView.this;
                                        uSImageView.A = z3;
                                        r4 = z3;
                                    }
                                    uSImageView.G = null;
                                    uSImageView.A = z3;
                                    r4 = z3;
                                }
                                z3 = false;
                                uSImageView.A = z3;
                                r4 = z3;
                            }
                            this.f6362c.remove((int) r4);
                            Handler handler = USImageView.this.T;
                            handler.sendMessage(handler.obtainMessage());
                        }
                    }
                }
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
                this.f6363d = iCurrentTimeMillis < 2 ? this.f6363d + 1 : 0;
                if (this.f6363d > 100) {
                    USImageView.this.K();
                }
                if (iCurrentTimeMillis < 20) {
                    try {
                        Thread.sleep(20 - iCurrentTimeMillis);
                    } catch (InterruptedException e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }
    }

    public USImageView(Context context) {
        super(context);
        this.f6314c = true;
        this.f6318e = new Object();
        this.f6330k = new Matrix();
        this.f6334m = false;
        this.f6336n = false;
        this.f6338o = MyApplication.t() * 0.5f;
        this.f6339p = new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f);
        this.f6344u = MyApplication.u() * 6.0f;
        this.f6345v = 128;
        this.f6346w = 512;
        this.f6349z = true;
        this.E = -1;
        this.F = new Path();
        this.K = 0.1f;
        this.L = 0.1f;
        this.M = 200;
        this.N = MyApplication.s();
        this.O = MyApplication.s() * 20.0f;
        this.R = false;
        this.S = 0;
        this.T = new a();
        this.U = new Paint(3);
        this.f6311a0 = new PointF();
        this.f6313b0 = new PointF();
        this.f6315c0 = new PointF();
        this.f6317d0 = new PointF();
        this.f6319e0 = new PointF();
        this.f6331k0 = -1;
        H();
    }

    public static boolean I() {
        return f6310o0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorValue(d0 d0Var) {
        if (d0Var != null) {
            y yVar = (y) d0Var.f8789f.get("color_data");
            Bitmap bitmapB = this.f6342s.b(d0Var, this.f6348y);
            if (bitmapB == null) {
                return;
            }
            this.f6329j0 = yVar.f8921h;
            if (!this.A) {
                this.J = yVar.f8923j;
            }
            this.f6347x = k2.c.h(bitmapB, this.f6334m, this.f6336n);
            int i4 = yVar.f8917d;
            float f4 = i4;
            int i5 = yVar.f8918e;
            float f5 = i5;
            int i6 = yVar.f8919f;
            int i7 = yVar.f8920g;
            if (f4 == 0.0f || f5 - f4 == 0.0f) {
                h.S0((r9 / 2) - 16, (this.f6345v / 2) + 16, (r1 / 2) - 16, (this.f6346w / 2) + 16);
            } else {
                if (this.S == 1) {
                    return;
                }
                float f6 = i4;
                this.f6321f0 = f6;
                float f7 = i5;
                this.f6323g0 = f7;
                float f8 = i6;
                this.f6325h0 = f8;
                float f9 = i7;
                this.f6327i0 = f9;
                if (f6 != 0.0f && f7 - f6 != 0.0f) {
                    N(this.f6342s.F(new PointF(this.f6321f0, this.f6325h0), (int) this.f6329j0), this.f6342s.F(new PointF(this.f6323g0, this.f6325h0), (int) this.f6329j0), this.f6342s.F(new PointF(this.f6321f0, this.f6327i0), (int) this.f6329j0), this.f6342s.F(new PointF(this.f6323g0, this.f6327i0), (int) this.f6329j0));
                    return;
                }
                h.S0((r9 / 2) - 16, (this.f6345v / 2) + 16, (int) f8, (int) f9);
            }
            this.f6347x = null;
        }
    }

    public static void setEnableBLine(boolean z3) {
        f6310o0 = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPowerValue(d0 d0Var) {
        c0 c0Var = (c0) d0Var.f8789f.get("power_data");
        Bitmap bitmapG = this.f6342s.g(d0Var);
        if (bitmapG == null) {
            return;
        }
        this.f6329j0 = c0Var.f8734h;
        this.f6347x = k2.c.h(bitmapG, this.f6334m, this.f6336n);
        this.J = c0Var.f8736j;
        L(this.f6342s.l());
        if (this.S != 1) {
            float f4 = c0Var.f8730d;
            this.f6321f0 = f4;
            float f5 = c0Var.f8731e;
            this.f6323g0 = f5;
            float f6 = c0Var.f8732f;
            this.f6325h0 = f6;
            float f7 = c0Var.f8733g;
            this.f6327i0 = f7;
            if (f4 == 0.0f || f5 - f4 == 0.0f) {
                h.S0((r7 / 2) - 16, (this.f6345v / 2) + 16, (int) f6, (int) f7);
            }
            int i4 = (int) c0Var.f8734h;
            N(this.f6342s.F(new PointF(this.f6321f0, this.f6325h0), i4), this.f6342s.F(new PointF(this.f6323g0, this.f6325h0), i4), this.f6342s.F(new PointF(this.f6321f0, this.f6327i0), i4), this.f6342s.F(new PointF(this.f6323g0, this.f6327i0), i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPwValue(d0 d0Var) {
        if (d0Var != null) {
            b0 b0Var = (b0) d0Var.f8789f.get("pw_data");
            this.C = b0Var;
            this.J = b0Var.f8717h;
            this.D = (((int) h.p(b0Var.f8718i)) * 154000.0f) / (((this.C.f8719j * 1000000.0f) * 4.0f) * ((float) Math.cos((float) (((double) (r0.f8720k / 180.0f)) * 3.141592653589793d))));
        }
    }

    public final void A(Canvas canvas) {
        if (this.f6347x != null) {
            this.U.setStyle(Paint.Style.STROKE);
            this.U.setStrokeWidth(2.0f);
            this.U.setColor(getResources().getColor(R.color.colorGreenDark));
            if (this.W) {
                PointF pointF = this.f6311a0;
                float f4 = pointF.x;
                float f5 = pointF.y;
                PointF pointF2 = this.f6315c0;
                canvas.drawLine(f4, f5, pointF2.x, pointF2.y, this.U);
                PointF pointF3 = this.f6313b0;
                float f6 = pointF3.x;
                float f7 = pointF3.y;
                PointF pointF4 = this.f6317d0;
                canvas.drawLine(f6, f7, pointF4.x, pointF4.y, this.U);
                PointF pointF5 = this.f6311a0;
                float f8 = pointF5.x;
                float f9 = pointF5.y;
                PointF pointF6 = this.f6313b0;
                canvas.drawLine(f8, f9, pointF6.x, pointF6.y, this.U);
                PointF pointF7 = this.f6315c0;
                float f10 = pointF7.x;
                float f11 = pointF7.y;
                PointF pointF8 = this.f6317d0;
                canvas.drawLine(f10, f11, pointF8.x, pointF8.y, this.U);
            } else {
                PointF pointF9 = this.f6311a0;
                float f12 = pointF9.x;
                float f13 = pointF9.y;
                PointF pointF10 = this.f6315c0;
                canvas.drawLine(f12, f13, pointF10.x, pointF10.y, this.U);
                PointF pointF11 = this.f6313b0;
                float f14 = pointF11.x;
                float f15 = pointF11.y;
                PointF pointF12 = this.f6317d0;
                canvas.drawLine(f14, f15, pointF12.x, pointF12.y, this.U);
                w(this.f6319e0, this.f6311a0, this.f6313b0, canvas);
                w(this.f6319e0, this.f6315c0, this.f6317d0, canvas);
            }
            if (this.f6349z) {
                this.U.setStrokeWidth(2.0f);
                PointF[] pointFArr = {this.f6311a0, this.f6313b0, this.f6315c0, this.f6317d0};
                for (int i4 = 0; i4 < 4; i4++) {
                    PointF pointF13 = pointFArr[i4];
                    float f16 = 10;
                    PointF pointF14 = new PointF(pointF13.x - f16, pointF13.y - f16);
                    float f17 = 20;
                    PointF pointF15 = new PointF(pointF14.x, pointF14.y + f17);
                    PointF pointF16 = new PointF(pointF14.x + f17, pointF14.y + f17);
                    PointF pointF17 = new PointF(pointF14.x + f17, pointF14.y);
                    canvas.drawLine(pointF14.x, pointF14.y, pointF15.x, pointF15.y, this.U);
                    canvas.drawLine(pointF15.x, pointF15.y, pointF16.x, pointF16.y, this.U);
                    canvas.drawLine(pointF16.x, pointF16.y, pointF17.x, pointF17.y, this.U);
                    canvas.drawLine(pointF17.x, pointF17.y, pointF14.x, pointF14.y, this.U);
                }
            }
            if (this.S != 1) {
                canvas.drawBitmap(this.f6347x, this.f6330k, this.U);
            }
        }
    }

    public final void B(Canvas canvas) {
        PointF pointF;
        float f4;
        float f5;
        z zVar = this.f6342s;
        if (zVar == null || zVar.n() == 0.0f || !h.w0() || !this.f6341r) {
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
        Needle.c cVar = this.f6340q;
        if (cVar == null || cVar.f4806b == null) {
            pointF = pointFF2;
            f4 = 5.0f;
        } else {
            this.U.setColor(getResources().getColor(R.color.colorGreenDark));
            this.U.setStyle(Paint.Style.STROKE);
            double d4 = pointFF.x;
            y1.f fVar = this.f6340q.f4806b;
            double d5 = fA;
            PointF pointF4 = new PointF((float) (d4 + (fVar.f12843a / d5)), (float) (((double) pointFF.y) + (fVar.f12845c / d5)));
            double d6 = pointFF.x;
            y1.f fVar2 = this.f6340q.f4807c;
            PointF pointF5 = new PointF((float) (d6 + (fVar2.f12843a / d5)), (float) (((double) pointFF.y) + (fVar2.f12845c / d5)));
            this.U.setPathEffect(this.f6339p);
            y1.b bVar = new y1.b(pointF4, pointF5);
            canvas.drawLine(bVar.c(0.0f), 0.0f, bVar.c(getHeight()), getHeight(), this.U);
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
            this.U.setPathEffect(null);
            this.U.setStrokeWidth(1.0f);
            canvas.drawLine(pointF4.x, pointF4.y, pointF5.x, pointF5.y, this.U);
            canvas.drawLine(f10, fD2, f11, f12, this.U);
            canvas.drawLine(f7, fD, f8, f9, this.U);
            this.U.setStrokeWidth(2.0f);
            Needle.c cVar5 = this.f6340q;
            float fAbs = (float) Math.abs(cVar5.f4806b.f12844b - cVar5.f4807c.f12844b);
            Needle.c cVar6 = this.f6340q;
            if (((float) Math.atan(fAbs / ((float) Math.abs(cVar6.f4806b.f12843a - cVar6.f4807c.f12843a)))) > 1.0471975511965976d) {
                y1.f fVar3 = this.f6340q.f4808d;
                float f13 = (((float) fVar3.f12843a) / fA) + pointFF.x;
                float f14 = (((float) fVar3.f12845c) / fA) + pointFF.y;
                RectF rectF = new RectF(f13 - f6, f14 - f6, f13 + f6, f14 + f6);
                if (((float) Math.sqrt(Math.pow(f13 - pointF4.x, 2.0d) + Math.pow(f14 - pointF4.y, 2.0d))) < f6) {
                    this.U.setColor(getResources().getColor(R.color.colorGreenDark));
                } else {
                    this.U.setColor(v0.u.f12223u);
                }
                this.U.setPathEffect(null);
                canvas.drawRect(rectF, this.U);
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
                canvas.drawPath(path, this.U);
            }
            this.U.setColor(v0.u.f12223u);
            this.U.setStyle(Paint.Style.FILL);
            this.U.setPathEffect(null);
            f4 = 5.0f;
            canvas.drawCircle(pointF4.x, pointF4.y, 5.0f, this.U);
        }
        float fS = MyApplication.s() * 150.0f;
        float fS2 = MyApplication.s() * 3.0f;
        float fS3 = MyApplication.s() * f4;
        float f15 = (fS - (fS3 * 2.0f)) / (pointF.x - pointFF.x);
        float fS4 = MyApplication.s() * 25.0f;
        float fS5 = MyApplication.s() * 20.0f;
        float f16 = fS5 + fS;
        RectF rectF2 = new RectF((getWidth() - 80.0f) - fS4, fS5, getWidth() - 80.0f, f16);
        this.U.setColor(-16711936);
        canvas.drawCircle(rectF2.left + (fS4 / 2.0f), rectF2.top, 8.0f, this.U);
        this.U.setColor(-1);
        canvas.drawRoundRect(rectF2, 10.0f, 10.0f, this.U);
        RectF rectF3 = new RectF(((getWidth() - 80.0f) - fS4) + fS2, fS5 + fS3, (getWidth() - 80.0f) - fS2, f16 - fS3);
        float f17 = rectF3.right - rectF3.left;
        this.U.setColor(Color.parseColor("#7d9ec0"));
        canvas.drawRect(rectF3, this.U);
        this.U.setColor(Color.parseColor("#87cefa"));
        this.U.setStrokeWidth(4.0f);
        float f18 = rectF3.left;
        float f19 = f17 / 2.0f;
        canvas.drawLine(f18 + f19, rectF3.top, f18 + f19, rectF3.bottom, this.U);
        Needle.c cVar7 = this.f6340q;
        if (cVar7 == null || cVar7.f4806b == null) {
            f5 = f16;
        } else {
            this.U.setStrokeWidth(3.0f);
            Needle.c cVar8 = this.f6340q;
            double d10 = fA;
            float f20 = ((float) (cVar8.f4806b.f12844b / d10)) * f15;
            float f21 = ((float) (cVar8.f4807c.f12844b / d10)) * f15;
            if (Math.abs(f21 - f20) > fS) {
                f21 = f20 > f21 ? f20 - fS : f20 + fS;
            }
            Path path2 = new Path();
            Needle.c cVar9 = this.f6340q;
            float f22 = ((float) (cVar9.f4806b.f12843a / d10)) * f15;
            f5 = f16;
            float f23 = ((float) (cVar9.f4807c.f12843a / d10)) * f15;
            if (Math.abs(f23 - f22) > fS) {
                f23 = f22 > f23 ? f22 - fS : f22 + fS;
            }
            path2.moveTo(rectF3.left + f19 + f21, rectF3.top + f23);
            path2.lineTo(rectF3.left + f19 + f20, rectF3.top + f22);
            this.U.setColor(getResources().getColor(R.color.colorGreenDark));
            this.U.setStyle(Paint.Style.STROKE);
            canvas.drawPath(path2, this.U);
            this.U.setColor(-16776961);
            this.U.setStyle(Paint.Style.FILL);
            canvas.drawCircle(rectF3.left + f19 + f20, rectF3.top + f22, 5.0f, this.U);
        }
        this.U.setStyle(Paint.Style.FILL);
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
            this.U.setColor(iArr[i4]);
            float f25 = i4;
            float f26 = ((0.5f * f25) + 1.0f) * fS7;
            float f27 = (f25 * fS6) + width;
            canvas.drawRect(new RectF(f27, f24 - f26, f27 + fS6, f24), this.U);
            i4++;
        }
    }

    public final void C(Canvas canvas) {
        b0 b0Var = this.C;
        if (b0Var != null) {
            int i4 = b0Var.f8712c;
            int i5 = b0Var.f8714e;
            int i6 = b0Var.f8713d;
            int i7 = i5 - i6;
            this.f6335m0 = i7;
            if (this.S == 1) {
                i4 = this.f6331k0;
                i6 = this.f6333l0;
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
            b0 b0Var2 = this.C;
            int i8 = (int) b0Var2.f8711b;
            int i9 = b0Var2.f8720k;
            PointF pointFF = this.f6342s.f(pointF);
            if (pointFF == null) {
                return;
            }
            PointF pointFF2 = this.f6342s.F(pointF2, i8);
            PointF pointFF3 = this.f6342s.F(pointF3, i8);
            PointF pointFF4 = this.f6342s.F(pointF4, i8);
            PointF pointFF5 = this.f6342s.F(pointF5, i8);
            PointF pointFF6 = this.f6342s.f(pointF6);
            PointF pointFF7 = this.f6342s.f(pointF8);
            PointF pointFF8 = this.f6342s.f(pointF7);
            PointF pointFF9 = this.f6342s.f(pointF9);
            PointF pointFF10 = this.f6342s.f(pointF10);
            PointF pointFF11 = this.f6342s.f(pointF11);
            float f7 = i8;
            PointF pointFP = P(pointFF6, f7, pointFF);
            PointF pointFP2 = P(pointFF8, f7, pointFF);
            PointF pointFP3 = P(pointFF7, f7, pointFF);
            PointF pointFP4 = P(pointFF9, f7, pointFF);
            PointF pointFP5 = P(pointFF10, f7, pointFF);
            PointF pointFP6 = P(pointFF11, f7, pointFF);
            pointFF.x = (pointFP5.x + pointFP6.x) / 2.0f;
            pointFF.y = (pointFP5.y + pointFP6.y) / 2.0f;
            PointF pointFP7 = P(pointFP5, this.C.f8720k - 90, pointFF);
            PointF pointFP8 = P(pointFP6, this.C.f8720k - 90, pointFF);
            if (this.f6334m) {
                int i10 = this.f6320f;
                pointFF2.x = i10 - pointFF2.x;
                pointFF4.x = i10 - pointFF4.x;
                pointFP2.x = i10 - pointFP2.x;
                pointFP.x = i10 - pointFP.x;
                pointFP4.x = i10 - pointFP4.x;
                pointFP3.x = i10 - pointFP3.x;
                pointFF5.x = i10 - pointFF5.x;
                pointFF3.x = i10 - pointFF3.x;
                pointFP8.x = i10 - pointFP8.x;
                pointFP7.x = i10 - pointFP7.x;
            }
            if (this.f6336n) {
                int i11 = this.f6322g;
                pointFF2.y = (i11 * 0.7f) - pointFF2.y;
                pointFF4.y = (i11 * 0.7f) - pointFF4.y;
                pointFP2.y = (i11 * 0.7f) - pointFP2.y;
                pointFP.y = (i11 * 0.7f) - pointFP.y;
                pointFP4.y = (i11 * 0.7f) - pointFP4.y;
                pointFP3.y = (i11 * 0.7f) - pointFP3.y;
                pointFF5.y = (i11 * 0.7f) - pointFF5.y;
                pointFF3.y = (i11 * 0.7f) - pointFF3.y;
                pointFP8.y = (i11 * 0.7f) - pointFP8.y;
                pointFP7.y = (i11 * 0.7f) - pointFP7.y;
            }
            this.U.setColor(getResources().getColor(R.color.colorGreenDark));
            canvas.drawLine(pointFF2.x, pointFF2.y, pointFF4.x, pointFF4.y, this.U);
            canvas.drawLine(pointFP2.x, pointFP2.y, pointFP.x, pointFP.y, this.U);
            canvas.drawLine(pointFP4.x, pointFP4.y, pointFP3.x, pointFP3.y, this.U);
            canvas.drawLine(pointFF5.x, pointFF5.y, pointFF3.x, pointFF3.y, this.U);
            if (i9 != 0) {
                canvas.drawLine(pointFP8.x, pointFP8.y, pointFP7.x, pointFP7.y, this.U);
            }
        }
    }

    public final void D(Canvas canvas) {
        float width;
        float f4;
        float f5;
        float f6;
        b0 b0Var = this.C;
        if (b0Var == null || b0Var.f8718i <= 0) {
            return;
        }
        this.U.setColor(-1);
        this.U.setStrokeWidth(2.0f);
        int width2 = getWidth() - 160;
        int height = (int) (getHeight() * 0.3f);
        int height2 = (int) (getHeight() * 0.7f);
        Bitmap bitmapA = g.a(this.f6343t.f4501c, h.q() == 0 ? 4 : h.q());
        if (bitmapA != null) {
            width = bitmapA.getWidth();
            canvas.drawBitmap(k2.c.o(bitmapA, width2, height), 0.0f, height2, this.U);
        } else {
            width = 624.0f;
        }
        float f7 = width;
        float f8 = height;
        float f9 = width2;
        this.U.setColor(-1);
        this.U.setTextSize(this.f6344u);
        this.U.setStyle(Paint.Style.FILL);
        float f10 = height2;
        canvas.drawLine(0.0f, f10 + ((h.q() * f8) / 4.0f), f9 + 40.0f, f10 + ((h.q() * f8) / 4.0f), this.U);
        canvas.drawText("cm/s", 50.0f + f9, ((h.q() * f8) / 4.0f) + f10, this.U);
        float f11 = this.D;
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
            canvas.drawLine(f14 - 5.0f, f15, f14 + 5.0f, f15, this.U);
        }
        for (int i7 = 1; i7 <= ((int) (fQ3 / f6)); i7++) {
            float f16 = f10 + fQ + (i7 * f6 * f12);
            canvas.drawLine(f14 - 5.0f, f16, f14 + 5.0f, f16, this.U);
        }
        int i8 = 1;
        while (i8 <= ((int) (fQ2 / f5))) {
            float f17 = i8 * f5;
            float f18 = (f10 + fQ) - (f17 * f12);
            canvas.drawLine(f14 - 10.0f, f18, f14 + 10.0f, f18, this.U);
            canvas.drawText(s0.a.f11071l + ((int) f17), f14 + 30.0f, f18, this.U);
            i8++;
            f8 = f8;
        }
        float f19 = f8;
        for (int i9 = 1; i9 <= ((int) (fQ3 / f5)); i9++) {
            float f20 = f10 + fQ + (i9 * f5 * f12);
            canvas.drawLine(f14 - 10.0f, f20, f14 + 10.0f, f20, this.U);
            canvas.drawText(s0.a.f11071l + ((int) ((-i9) * f5)), f14 + 30.0f, f20, this.U);
        }
        float f21 = f9 / f4;
        float f22 = 0.2f * (this.C.f8718i / 8.0f);
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
            canvas.drawLine(f25, f10 + f19, f25, f10 + f26, this.U);
            i10++;
        }
    }

    public final void E(Canvas canvas) {
        this.U.setColor(-1);
        this.U.setStrokeWidth(this.N);
        this.U.setTextSize(this.f6344u);
        this.U.setStyle(Paint.Style.FILL);
        this.U.setPathEffect(null);
        int i4 = (int) this.O;
        int i5 = 0;
        for (int i6 = 0; i6 <= this.M; i6 += 5) {
            float f4 = i6 / this.K;
            int i7 = this.f6322g;
            if (f4 > i7) {
                f4 = i7 - 1;
            }
            if (i6 % 10 == 0) {
                float f5 = i4;
                canvas.drawLine(0.0f, f4, 0.0f + (0.4f * f5), f4, this.U);
                canvas.drawText(s0.a.f11071l + i6, 0.0f + (f5 * 0.5f), f4 + this.N + 3.0f, this.U);
            } else {
                canvas.drawLine(0.0f, f4, 0.0f + (i4 * 0.25f), f4, this.U);
            }
        }
        if (this.J == null) {
            return;
        }
        if (this.f6347x != null || this.C != null) {
            this.U.setColor(getResources().getColor(R.color.colorGreenDark));
        }
        float fS = MyApplication.s() * 8.0f;
        float fS2 = MyApplication.s() * 4.0f;
        while (true) {
            float[] fArr = this.J;
            if (i5 >= fArr.length) {
                return;
            }
            if (fArr[i5] > 0.0f) {
                Path path = new Path();
                float f6 = i4 + 0.0f;
                path.moveTo(f6 - fS, this.J[i5] / this.K);
                path.lineTo(f6, (this.J[i5] / this.K) - fS2);
                path.lineTo(f6 - (fS / 4.0f), this.J[i5] / this.K);
                path.lineTo(f6, (this.J[i5] / this.K) + fS2);
                path.close();
                canvas.drawPath(path, this.U);
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
            this.V = false;
            e eVar = this.f6316d;
            if (eVar != null) {
                eVar.a();
                this.f6316d = null;
            }
        } else {
            this.V = true;
        }
        this.f6314c = true;
    }

    public final void H() {
        this.f6326i = new Path();
    }

    public void J(boolean z3) {
        this.f6348y = z3;
    }

    public void K() {
        e eVar = this.f6316d;
        if (eVar != null) {
            eVar.a();
            this.f6316d = null;
        }
    }

    public void L(PointF pointF) {
        this.f6319e0 = pointF;
    }

    public void M(b2.f fVar, z zVar, boolean z3, boolean z4) {
        this.f6342s = zVar;
        this.f6334m = z3;
        this.f6336n = z4;
        this.f6343t = fVar;
        O(fVar.f4499a);
    }

    public void N(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        float f4;
        if (this.f6334m) {
            int i4 = this.f6320f;
            pointF.x = i4 - pointF.x;
            pointF2.x = i4 - pointF2.x;
            pointF3.x = i4 - pointF3.x;
            pointF4.x = i4 - pointF4.x;
        }
        if (this.f6336n) {
            if (this.A) {
                int i5 = this.f6322g;
                pointF.y = (i5 * 0.7f) - pointF.y;
                pointF2.y = (i5 * 0.7f) - pointF2.y;
                pointF3.y = (i5 * 0.7f) - pointF3.y;
                f4 = i5 * 0.7f;
            } else {
                int i6 = this.f6322g;
                pointF.y = i6 - pointF.y;
                pointF2.y = i6 - pointF2.y;
                pointF3.y = i6 - pointF3.y;
                f4 = i6;
            }
            pointF4.y = f4 - pointF4.y;
        }
        this.f6311a0 = pointF;
        this.f6313b0 = pointF2;
        this.f6315c0 = pointF3;
        this.f6317d0 = pointF4;
    }

    public void O(d0 d0Var) {
        Bitmap bitmapE;
        PointF pointF;
        float height;
        if (this.f6342s.n() == 0.0f || (bitmapE = this.f6342s.e(d0Var)) == null) {
            return;
        }
        u uVar = (u) d0Var.f8789f.get("b_data");
        this.f6345v = uVar.f8885c;
        this.f6346w = uVar.f8886d;
        this.W = uVar.f8889g >= 100000.0f;
        this.f6319e0 = this.f6342s.l();
        boolean z3 = d0Var instanceof w;
        if (z3 || d0Var.f8789f.containsKey("color_data") || d0Var.f8789f.containsKey("power_data") || d0Var.f8789f.containsKey("pw_data")) {
            setEnableBLine(false);
            this.f6341r = false;
            h.t1(false);
        } else {
            this.f6341r = true;
        }
        if (f6310o0) {
            int i4 = uVar.f8892j;
            int i5 = i4 > 80 ? 80 : i4;
            int iG = 20 - (h.G() * 5);
            int iG2 = 512 - ((h.G() * h.G()) * 20);
            byte[] bArr = uVar.f8883a;
            Q(this.f6342s, i2.a.b(i2.a.a(bArr, bArr.length / 512, 512, i5, 1500, iG, iG2), 5, 5));
        } else {
            this.f6324h = null;
        }
        this.M = (int) uVar.f8891i;
        this.K = this.f6342s.A();
        this.L = this.f6342s.s();
        PointF pointF2 = new PointF();
        pointF2.x = 0.0f;
        pointF2.y = 0.0f;
        PointF pointFF = this.f6342s.f(pointF2);
        this.f6332l = pointFF;
        float f4 = pointFF.x - 70.0f;
        pointFF.x = f4;
        if (f4 < 40.0f) {
            pointFF.x = 40.0f;
        }
        pointFF.y += this.f6338o * 2.0f;
        if (this.f6334m) {
            pointFF.x = getWidth() - this.f6332l.x;
        }
        if (this.f6336n) {
            if (this.G == null && this.C == null) {
                pointF = this.f6332l;
                height = getHeight();
            } else {
                pointF = this.f6332l;
                height = getHeight() * 0.7f;
            }
            pointF.y = height - this.f6332l.y;
        }
        Matrix matrix = this.f6330k;
        float f5 = this.L;
        matrix.setScale(f5, f5);
        this.f6328j = k2.c.h(bitmapE, this.f6334m, this.f6336n);
        if (d0Var instanceof b2.e) {
            b2.e eVar = (b2.e) d0Var;
            setColorValue(eVar.a());
            d0 d0VarB = eVar.b();
            if (this.S == 1 && this.f6331k0 > 0) {
                b0 b0Var = (b0) d0VarB.f8789f.get("pw_data");
                b0Var.f8712c = this.f6331k0;
                int i6 = b0Var.f8714e - b0Var.f8713d;
                int i7 = this.f6333l0;
                b0Var.f8713d = i7;
                b0Var.f8714e = i7 + i6;
            }
            setPwValue(d0VarB);
            this.A = true;
            this.G = null;
        } else {
            if (d0Var.f8789f.containsKey("color_data")) {
                setColorValue(d0Var);
            } else if (d0Var.f8789f.containsKey("power_data")) {
                setPowerValue(d0Var);
            } else if (d0Var.f8789f.containsKey("pw_data")) {
                setPwValue(d0Var);
                this.f6347x = null;
                this.G = null;
                this.A = false;
            } else {
                if (z3) {
                    w wVar = (w) d0Var;
                    this.G = wVar;
                    this.E = wVar.f8907h;
                    this.H = wVar.f8906g.a();
                } else {
                    this.J = uVar.f8897o;
                    this.G = null;
                }
                this.f6347x = null;
                this.C = null;
                this.A = false;
            }
            this.C = null;
            this.G = null;
            this.A = false;
        }
        invalidate();
    }

    public final PointF P(PointF pointF, float f4, PointF pointF2) {
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

    public final void Q(z zVar, ArrayList<Integer> arrayList) {
        a aVar = null;
        if (arrayList == null || arrayList.size() == 0) {
            this.f6324h = null;
            return;
        }
        this.f6324h = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            int iIntValue = arrayList.get(i4).intValue();
            d dVar = new d(this, aVar);
            float f4 = iIntValue;
            PointF pointF = new PointF(f4, 0.0f);
            PointF pointF2 = new PointF(f4, 512.0f);
            dVar.f6358a = zVar.f(pointF);
            dVar.f6359b = zVar.f(pointF2);
            this.f6324h.add(dVar);
        }
    }

    public void R(Bitmap bitmap, float f4, boolean z3, boolean z4) {
    }

    public void S(Bitmap bitmap, float f4, float f5) {
    }

    public void T(float f4, float f5, boolean z3) {
        this.R = true;
        float f6 = this.f6321f0 + f4;
        float f7 = this.f6323g0 + f4;
        float f8 = this.f6325h0 + f5;
        float f9 = this.f6327i0 + f5;
        if (f6 >= 1.0f && f7 <= this.f6345v - 1 && f8 >= 1.0f && f9 <= this.f6346w - 1) {
            PointF pointF = new PointF(f6, f8);
            PointF pointF2 = new PointF(f7, f8);
            PointF pointF3 = new PointF(f6, f9);
            PointF pointF4 = new PointF(f7, f9);
            PointF pointFF = this.f6342s.F(pointF, (int) this.f6329j0);
            PointF pointFF2 = this.f6342s.F(pointF2, (int) this.f6329j0);
            PointF pointFF3 = this.f6342s.F(pointF3, (int) this.f6329j0);
            PointF pointFF4 = this.f6342s.F(pointF4, (int) this.f6329j0);
            L(this.f6342s.l());
            N(pointFF, pointFF2, pointFF3, pointFF4);
            this.f6314c = true;
            this.S = 1;
            this.f6321f0 = f6;
            this.f6323g0 = f7;
            this.f6325h0 = f8;
            this.f6327i0 = f9;
            if (z3) {
                int i4 = (int) ((f6 + f7) / 2.0f);
                int i5 = this.f6345v;
                if (i4 > i5 - 1) {
                    i4 = i5 - 1;
                }
                int i6 = ((int) ((f8 + f9) / 2.0f)) - (this.f6335m0 / 2);
                int i7 = this.f6346w;
                if (i6 > i7 - 1) {
                    i6 = i7 - 1;
                }
                if (i6 < 5) {
                    i6 = 5;
                }
                this.f6331k0 = i4;
                this.f6333l0 = i6;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f6337n0 > 20) {
                this.f6337n0 = jCurrentTimeMillis;
                new Thread(new b(f6, f7, f8, f9, z3)).start();
            }
        }
    }

    public void U(int i4, int i5) {
        this.Q = i4;
        this.P = i5;
    }

    @Override // android.view.View
    public void onDraw(@j0 Canvas canvas) {
        String string;
        float fS;
        Paint paint;
        super.onDraw(canvas);
        if (canvas != null) {
            try {
                x(canvas);
                A(canvas);
                C(canvas);
                D(canvas);
                y(canvas);
                z(canvas);
                B(canvas);
                this.U.setTextSize(MyApplication.u() * 18.0f);
                this.U.setColor(-1);
                this.U.setStyle(Paint.Style.FILL);
                String str = this.Q + "/" + this.P;
                float fMeasureText = this.U.measureText(str) + 25.0f;
                if (this.G == null && this.C == null) {
                    canvas.drawText(str, this.f6320f - fMeasureText, this.f6322g - (MyApplication.s() * 10.0f), this.U);
                    if (this.V) {
                        string = getResources().getString(R.string.live);
                        fS = this.f6322g - (MyApplication.s() * 30.0f);
                        paint = this.U;
                    } else {
                        string = getResources().getString(R.string.freeze);
                        fS = this.f6322g - (MyApplication.s() * 30.0f);
                        paint = this.U;
                    }
                } else {
                    canvas.drawText(str, this.f6320f - fMeasureText, (this.f6322g * 0.7f) - (MyApplication.s() * 30.0f), this.U);
                    if (this.V) {
                        string = getResources().getString(R.string.live);
                        fS = (this.f6322g * 0.7f) - (MyApplication.s() * 30.0f);
                        paint = this.U;
                    } else {
                        string = getResources().getString(R.string.freeze);
                        fS = (this.f6322g * 0.7f) - (MyApplication.s() * 30.0f);
                        paint = this.U;
                    }
                }
                canvas.drawText(string, 10.0f, fS, paint);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.f6320f = i4;
        this.f6322g = i5;
    }

    public void setNeedleLine(Needle.c cVar) {
        this.f6340q = cVar;
    }

    public void setShowSize(boolean z3) {
        this.f6349z = z3;
    }

    public void v(boolean z3) {
        h.S0((int) this.f6321f0, (int) this.f6323g0, (int) this.f6325h0, (int) this.f6327i0);
        if (z3) {
            h.o1(this.f6331k0, this.f6333l0);
        }
        this.R = false;
        new Thread(new c()).start();
    }

    public void w(PointF pointF, PointF pointF2, PointF pointF3, Canvas canvas) {
        PointF pointF4 = new PointF(pointF.x, pointF.y);
        if (this.f6336n) {
            pointF4.y = (this.A ? this.f6322g * 0.7f : this.f6322g) - pointF4.y;
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
        canvas.drawArc(rectF, f9, f13 > 300.0f ? (f12 - 360.0f) - f9 : f13, false, this.U);
    }

    public final void x(Canvas canvas) {
        this.U.setColor(getResources().getColor(R.color.black));
        Bitmap bitmap = this.f6328j;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f6330k, this.U);
        }
        this.U.setColor(getResources().getColor(R.color.colorGreenDark));
        this.U.setStyle(Paint.Style.FILL);
        PointF pointF = this.f6332l;
        if (pointF != null) {
            canvas.drawCircle(pointF.x, pointF.y, this.f6338o, this.U);
        }
        if (h.F0()) {
            this.U.setStrokeWidth(MyApplication.s());
            this.U.setStyle(Paint.Style.STROKE);
            this.U.setPathEffect(this.f6339p);
            this.f6326i.reset();
            this.f6326i.moveTo(getWidth() / 2.0f, 0.0f);
            this.f6326i.lineTo(getWidth() / 2.0f, getHeight());
            canvas.drawPath(this.f6326i, this.U);
        }
        if (this.f6324h != null) {
            this.U.setStrokeWidth(MyApplication.t());
            for (int i4 = 0; i4 < this.f6324h.size(); i4++) {
                d dVar = this.f6324h.get(i4);
                PointF pointF2 = dVar.f6358a;
                float f4 = pointF2.x;
                float f5 = pointF2.y;
                PointF pointF3 = dVar.f6359b;
                canvas.drawLine(f4, f5, pointF3.x, pointF3.y, this.U);
            }
            if (this.V) {
                return;
            }
            this.U.setTextSize(MyApplication.u() * 16.0f);
            this.U.setColor(-1);
            canvas.drawText("B-Line: " + this.f6324h.size(), getWidth() / 2, getHeight() - 150, this.U);
        }
    }

    public final void y(Canvas canvas) {
        if (this.G != null) {
            PointF pointF = new PointF(this.E, 0.0f);
            PointF pointF2 = new PointF(this.E, this.f6346w);
            PointF pointFF = this.f6342s.f(pointF);
            PointF pointFF2 = this.f6342s.f(pointF2);
            this.U.setStyle(Paint.Style.STROKE);
            this.U.setColor(getResources().getColor(R.color.colorGreenDark));
            this.U.setStrokeWidth(2.0f);
            this.U.setPathEffect(this.f6339p);
            if (this.f6334m) {
                int i4 = this.f6320f;
                pointFF.x = i4 - pointFF.x;
                pointFF2.x = i4 - pointFF2.x;
            }
            if (this.f6336n) {
                int i5 = this.f6322g;
                pointFF.y = i5 - pointFF.y;
                pointFF2.y = i5 - pointFF2.y;
            }
            this.F.reset();
            this.F.moveTo(pointFF.x, pointFF.y);
            this.F.lineTo(pointFF2.x, pointFF2.y);
            canvas.drawPath(this.F, this.U);
        }
    }

    public final void z(Canvas canvas) {
        if (this.G != null) {
            float height = getHeight();
            float f4 = 0.0f;
            canvas.drawBitmap(k2.c.o(this.H, getWidth(), height * 0.3f), 0.0f, 0.7f * height, this.U);
            this.U.setStyle(Paint.Style.FILL);
            this.U.setStrokeWidth(1.0f);
            this.U.setColor(-1);
            this.U.setPathEffect(null);
            float width = getWidth() / this.H.getWidth();
            int size = this.G.f8906g.c().size();
            if (size < 1) {
                return;
            }
            if (size < 10) {
                this.I = this.G.f8906g.d((100 - size) + 1);
            }
            if (this.I == null) {
                return;
            }
            if (size < 99) {
                float f5 = size * width;
                canvas.drawLine((getWidth() - f5) + 0.0f, getHeight(), (getWidth() - f5) + 0.0f, getHeight() - 20, this.U);
            }
            int i4 = 1;
            int i5 = 0;
            while (i4 < size && this.G.f8906g.d(100 - (size - i4)) != null) {
                int i6 = 1;
                while (true) {
                    int i7 = i4 + i6;
                    if (i7 > size) {
                        break;
                    }
                    Date dateD = this.G.f8906g.d(100 - (size - i7));
                    Date dateD2 = this.G.f8906g.d(100 - (size - (i7 - 1)));
                    if (dateD == null) {
                        break;
                    }
                    long j4 = i5 * 1000;
                    float time = dateD.getTime() - (this.I.getTime() + j4);
                    float time2 = dateD2.getTime() - (this.I.getTime() + j4);
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
                                canvas.drawLine((getWidth() - f8) + f4 + f11, getHeight(), (getWidth() - f8) + f4 + f11, getHeight() - f10, this.U);
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

    public USImageView(Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6314c = true;
        this.f6318e = new Object();
        this.f6330k = new Matrix();
        this.f6334m = false;
        this.f6336n = false;
        this.f6338o = MyApplication.t() * 0.5f;
        this.f6339p = new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f);
        this.f6344u = MyApplication.u() * 6.0f;
        this.f6345v = 128;
        this.f6346w = 512;
        this.f6349z = true;
        this.E = -1;
        this.F = new Path();
        this.K = 0.1f;
        this.L = 0.1f;
        this.M = 200;
        this.N = MyApplication.s();
        this.O = MyApplication.s() * 20.0f;
        this.R = false;
        this.S = 0;
        this.T = new a();
        this.U = new Paint(3);
        this.f6311a0 = new PointF();
        this.f6313b0 = new PointF();
        this.f6315c0 = new PointF();
        this.f6317d0 = new PointF();
        this.f6319e0 = new PointF();
        this.f6331k0 = -1;
        H();
    }

    public USImageView(Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6314c = true;
        this.f6318e = new Object();
        this.f6330k = new Matrix();
        this.f6334m = false;
        this.f6336n = false;
        this.f6338o = MyApplication.t() * 0.5f;
        this.f6339p = new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 2.0f);
        this.f6344u = MyApplication.u() * 6.0f;
        this.f6345v = 128;
        this.f6346w = 512;
        this.f6349z = true;
        this.E = -1;
        this.F = new Path();
        this.K = 0.1f;
        this.L = 0.1f;
        this.M = 200;
        this.N = MyApplication.s();
        this.O = MyApplication.s() * 20.0f;
        this.R = false;
        this.S = 0;
        this.T = new a();
        this.U = new Paint(3);
        this.f6311a0 = new PointF();
        this.f6313b0 = new PointF();
        this.f6315c0 = new PointF();
        this.f6317d0 = new PointF();
        this.f6319e0 = new PointF();
        this.f6331k0 = -1;
        H();
    }
}
