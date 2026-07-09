package com.sonoptek.pvus_android.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sonoptek.magneticpositiondemo.jni.Needle;
import com.sonoptek.pvus_android.MyApplication;
import com.sonoptek.pvus_android.measure.USMarkView;
import com.sonoptek.pvus_android.view.b;
import m2.z;
import org.dcm4che3.imageio.codec.jpeg.JPEG;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 2;
    public static final int I = 20003;
    public static final int J = 20004;
    public static final String K = "viewer_left";
    public static final String L = "viewer_right";
    public static f M = null;
    public static boolean N = false;
    public static ViewGroup O = null;
    public static boolean P = true;
    public static z Q = z.p(c.f6434x0);
    public static boolean R = false;
    public static boolean S = false;
    public Handler A;
    public b.d C;
    public boolean D;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Activity f6548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f6549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public USMarkView f6550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public USScaleView f6551i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public USImageView f6552j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f6553k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f6554l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f6555m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f6556n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f6557o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f6558p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f6559q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public USBiopsyView f6560r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b2.f f6562t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6563u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6564v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LinearLayout f6566x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6544b = 245;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6545c = 245;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6546d = JPEG.DNL;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f6547e = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6561s = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6565w = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f6567y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b f6568z = null;
    public String B = c.f6434x0;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 20003) {
                return;
            }
            f fVar = f.this;
            fVar.f6567y = true;
            if (f.P) {
                return;
            }
            fVar.B(false);
        }
    }

    public class b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6570b = true;

        public b() {
        }

        public void a() {
            this.f6570b = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            f.this.f6567y = false;
            try {
                Thread.sleep(1500L);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            if (this.f6570b) {
                Message message = new Message();
                message.what = f.I;
                f.this.f6547e.sendMessage(message);
            }
        }
    }

    public f(Activity activity) {
        if (this.f6549g == null) {
            h(activity);
        }
    }

    public static void C(ViewGroup viewGroup, f fVar) {
        ViewGroup viewGroup2;
        if (viewGroup == null) {
            return;
        }
        f fVar2 = M;
        if (fVar2 == fVar && (viewGroup2 = O) != null && viewGroup2 == viewGroup) {
            return;
        }
        O = viewGroup;
        if (fVar2 != null) {
            fVar2.n();
        }
        viewGroup.removeAllViews();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(viewGroup.getLayoutParams());
        layoutParams.weight = 1.0f;
        layoutParams.height = -1;
        layoutParams.width = 0;
        viewGroup.addView(fVar.D(), layoutParams);
        M = fVar;
        if (fVar instanceof com.sonoptek.pvus_android.view.b) {
            N = true;
        } else {
            N = false;
        }
        if (fVar.f6566x != null) {
            if (MyApplication.F()) {
                M.f6566x.setVisibility(8);
            } else {
                M.f6566x.setVisibility(0);
            }
        }
    }

    public static f d() {
        return M;
    }

    public static z f() {
        return Q;
    }

    public static boolean j() {
        return R;
    }

    public static boolean k() {
        return S;
    }

    public static void v(boolean z3) {
        R = z3;
    }

    public static void w(boolean z3) {
        S = z3;
    }

    public void A(boolean z3, boolean z4) {
        boolean z5;
        if (z4) {
            P = z3;
        }
        if (this.f6566x != null) {
            if (z3) {
                z5 = true;
                if (!z4) {
                    if (this.f6567y) {
                        B(true);
                    }
                    g(true);
                    return;
                }
            } else {
                z5 = false;
            }
            B(z5);
        }
    }

    public void B(boolean z3) {
    }

    public View D() {
        return this.f6549g;
    }

    public void E(int i4, int i5) {
        TextView textView = this.f6555m;
        if (textView != null) {
            if (i5 < 0) {
                if (this.f6563u == 1) {
                    this.f6564v = true;
                    textView.setText("--/--");
                    return;
                }
                return;
            }
            this.f6564v = false;
            textView.setVisibility(8);
        }
        USImageView uSImageView = this.f6552j;
        if (uSImageView != null) {
            uSImageView.U(i4, i5);
        }
    }

    public void F(int i4) {
        this.f6563u = i4;
        this.f6554l.setVisibility(8);
        USImageView uSImageView = this.f6552j;
        if (uSImageView != null) {
            uSImageView.G(i4);
        }
    }

    public abstract void a();

    public void b(i2.d dVar) {
    }

    public int c() {
        return -1;
    }

    public String e() {
        return this.B;
    }

    public void g(boolean z3) {
        if (!z3) {
            b bVar = this.f6568z;
            if (bVar != null) {
                bVar.a();
                this.f6568z = null;
                return;
            }
            return;
        }
        b bVar2 = this.f6568z;
        if (bVar2 != null) {
            bVar2.a();
        }
        b bVar3 = new b();
        this.f6568z = bVar3;
        bVar3.start();
    }

    public void h(Activity activity) {
        this.f6548f = activity;
    }

    public boolean i() {
        return this.D;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public void n() {
    }

    public abstract void o(b2.f fVar);

    public void p(i2.e eVar) {
    }

    public void q(Needle.c cVar) {
    }

    public void r() {
    }

    public void s(b.d dVar) {
        this.C = dVar;
    }

    public void t(boolean z3) {
        this.f6561s = z3;
    }

    public void u(boolean z3) {
        this.D = z3;
    }

    public void x(Handler handler) {
        this.A = handler;
    }

    public void y(boolean z3) {
        this.f6565w = z3;
    }

    public void z(boolean z3) {
    }
}
