package com.sonoptek.pvus_android.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.MyApplication;
import com.sonoptek.pvus_android.h;
import com.sonoptek.pvus_android.measure.USMarkView;
import i2.f;
import i2.z;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import m2.d0;
import m2.u;
import org.dcm4che3.imageio.codec.jpeg.JPEG;

/* JADX INFO: loaded from: classes.dex */
public class a extends f implements View.OnClickListener {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f6403e0 = "BM_VIEW_DSCOR";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f6404f0 = "BM_VIEW_DOUBLE_DSCOR";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f6405g0 = "BM_VIEW_DOUBLE_DSCOR_1";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f6406h0 = "BM_VIEW_DOUBLE_DSCOR_2";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f6407i0 = "BM_VIEW_DSCOR_VERTICAL";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f6408j0 = "BM_VIEW_DSCOR_FULL";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f6409k0 = "BM_VIEW_DSCOR_VERTICAL_FULL";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static a f6410l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static Map<String, a> f6411m0;
    public TextView T;
    public TextView U;
    public LinearLayout V;
    public TextView W;
    public TextView X;
    public TextView Y;
    public d0 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ImageButton f6412a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @SuppressLint({"HandlerLeak"})
    public Handler f6413b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public d f6414c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public PointF f6415d0;

    /* JADX INFO: renamed from: com.sonoptek.pvus_android.view.a$a, reason: collision with other inner class name */
    public class HandlerC0048a extends Handler {
        public HandlerC0048a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 20004) {
                return;
            }
            a.this.J(((Integer) message.obj).intValue());
        }
    }

    public class b implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f6417b;

        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x0188 A[PHI: r7
          0x0188: PHI (r7v16 i2.d) = (r7v13 i2.d), (r7v70 i2.d) binds: [B:53:0x0186, B:48:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01e2  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0217  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.view.View r7, android.view.MotionEvent r8) {
            /*
                Method dump skipped, instruction units count: 539
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sonoptek.pvus_android.view.a.b.a(android.view.View, android.view.MotionEvent):boolean");
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return a(view, motionEvent);
        }
    }

    public class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6419b = false;

        public c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
            /*
                Method dump skipped, instruction units count: 265
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sonoptek.pvus_android.view.a.c.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    public class d extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6421b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f6422c = true;

        public d() {
        }

        public void a() {
            this.f6422c = false;
        }

        public void b(boolean z3) {
            this.f6421b = z3;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i4 = 0;
            while (this.f6422c && i4 < 10) {
                try {
                    Thread.sleep(100L);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                i4++;
                if (this.f6422c) {
                    Message message = new Message();
                    message.what = f.J;
                    message.obj = this.f6421b ? Integer.valueOf(i4) : Integer.valueOf(10 - i4);
                    a.this.f6413b0.sendMessage(message);
                }
            }
        }
    }

    public a(Activity activity) {
        super(activity);
        this.f6413b0 = new HandlerC0048a();
        this.f6414c0 = null;
        this.f6415d0 = new PointF();
    }

    public static synchronized a G(Activity activity, boolean z3, boolean z4) {
        a aVar;
        if (f6411m0 == null) {
            f6411m0 = new HashMap();
        }
        String str = f.K;
        if (z3) {
            str = z4 ? f.K : f.L;
        }
        aVar = f6411m0.get(str);
        if (aVar == null) {
            aVar = new a(activity);
            f6411m0.put(str, aVar);
        }
        return aVar;
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void B(boolean z3) {
        super.B(z3);
        H(z3);
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void F(int i4) {
        USImageView uSImageView;
        boolean z3 = true;
        if (i4 == 1) {
            this.f6554l.setText(this.f6549g.getResources().getString(R.string.live));
            this.f6552j.G(i4);
            uSImageView = this.f6552j;
        } else {
            this.f6554l.setText(this.f6549g.getResources().getString(R.string.freeze));
            this.f6552j.G(i4);
            uSImageView = this.f6552j;
            z3 = false;
        }
        uSImageView.setClickable(z3);
    }

    public void H(boolean z3) {
        d dVar;
        boolean z4;
        if (z3) {
            d dVar2 = this.f6414c0;
            if (dVar2 != null) {
                dVar2.a();
            }
            dVar = new d();
            this.f6414c0 = dVar;
            z4 = true;
        } else {
            d dVar3 = this.f6414c0;
            if (dVar3 != null) {
                dVar3.a();
            }
            dVar = new d();
            this.f6414c0 = dVar;
            z4 = false;
        }
        dVar.b(z4);
        this.f6414c0.start();
    }

    public void I() {
        this.f6552j.setOnTouchListener(new c());
    }

    public void J(int i4) {
        this.U.setTextColor(Color.argb(i, 245, 245, JPEG.DNL));
        this.T.setTextColor(Color.argb(i, 245, 245, JPEG.DNL));
        this.X.setTextColor(Color.argb(i, 245, 245, JPEG.DNL));
        this.W.setTextColor(Color.argb(i, 245, 245, JPEG.DNL));
        this.Y.setTextColor(Color.argb(i, 245, 245, JPEG.DNL));
        TextView textView = this.f6556n;
        if (textView != null) {
            textView.setTextColor(Color.argb(i, 245, 245, JPEG.DNL));
            this.f6557o.setTextColor(Color.argb(i, 245, 245, JPEG.DNL));
        }
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void a() {
        i2.e eVar = this.f6550h.f6184b;
        if (eVar != null) {
            eVar.h();
            this.f6550h.invalidate();
            i2.e eVar2 = this.f6550h.f6184b;
            eVar2.f8069h = false;
            eVar2.f8070i = false;
            eVar2.f8071j = false;
            eVar2.f8072k = false;
        }
    }

    @Override // com.sonoptek.pvus_android.view.f
    @SuppressLint({"ClickableViewAccessibility"})
    public void b(i2.d dVar) {
        USMarkView uSMarkView = this.f6550h;
        if (uSMarkView != null && uSMarkView.f6187e == null) {
            i2.b bVar = uSMarkView.f6188f;
            if (uSMarkView.f6185c != null) {
                Activity activity = this.f6548f;
                Toast.makeText(activity, activity.getResources().getString(R.string.finish_measure), 1).show();
                return;
            }
            if (dVar.f() == 1) {
                if (this.f6550h.f6184b.f8069h && ((i2.f) dVar).x() && this.f6550h.f6184b.s() != null) {
                    i2.e eVar = this.f6550h.f6184b;
                    eVar.v(eVar.s());
                    this.f6550h.f6184b.f8069h = false;
                }
                if (this.f6550h.f6184b.f8070i && ((i2.f) dVar).m() && this.f6550h.f6184b.i() != null) {
                    i2.e eVar2 = this.f6550h.f6184b;
                    eVar2.v(eVar2.i());
                    this.f6550h.f6184b.f8070i = false;
                }
                if (this.f6550h.f6184b.f8071j && ((i2.f) dVar).n() && this.f6550h.f6184b.j() != null) {
                    i2.e eVar3 = this.f6550h.f6184b;
                    eVar3.v(eVar3.j());
                    this.f6550h.f6184b.f8071j = false;
                }
                if (this.f6550h.f6184b.f8072k && ((i2.f) dVar).p() && this.f6550h.f6184b.l() != null) {
                    i2.e eVar4 = this.f6550h.f6184b;
                    eVar4.v(eVar4.l());
                    this.f6550h.f6184b.f8072k = false;
                }
                if (this.f6550h.f6184b.f8073l && ((i2.f) dVar).o() && this.f6550h.f6184b.k() != null) {
                    i2.e eVar5 = this.f6550h.f6184b;
                    eVar5.v(eVar5.k());
                    this.f6550h.f6184b.f8073l = false;
                }
            }
            this.f6550h.f6184b.a();
            this.f6550h.f6184b.g(dVar);
            if (dVar.f() == 1) {
                i2.f fVar = (i2.f) dVar;
                PointF pointF = new PointF(63.0f, 0.0f);
                PointF pointF2 = new PointF(63.0f, 512.0f);
                PointF pointFF = f.Q.f(pointF);
                PointF pointFF2 = f.Q.f(pointF2);
                fVar.F(f.Q.A() / (((this.f6552j.getHeight() * 0.3f) + 0.0f) / ((float) (Math.sqrt(Math.pow(pointFF2.x - pointFF.x, 2.0d) + Math.pow(pointFF2.y - pointFF.y, 2.0d)) + 0.0d))));
                fVar.D(this.f6565w);
                if (fVar.x()) {
                    this.f6550h.f6185c = fVar;
                    this.f6550h.f6185c.A(USMarkView.a(4, false), USMarkView.a(4, false));
                } else {
                    fVar.A(USMarkView.a(fVar.j(), false), USMarkView.a(fVar.j(), true));
                }
                this.f6550h.f6186d = null;
            } else if (dVar.f() == 2) {
                i2.b bVar2 = (i2.b) dVar;
                this.f6550h.f6187e = bVar2;
                bVar2.i();
                this.f6550h.f6188f = null;
            }
            this.f6550h.invalidate();
            this.f6550h.setClickable(true);
            this.f6550h.setOnTouchListener(new b());
        }
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void h(Activity activity) {
        super.h(activity);
        View viewInflate = this.f6548f.getLayoutInflater().inflate(R.layout.bm_viewer, (ViewGroup) null);
        this.f6549g = viewInflate;
        this.f6552j = (USImageView) viewInflate.findViewById(R.id.bm_image);
        I();
        this.f6551i = (USScaleView) this.f6549g.findViewById(R.id.bm_scale);
        this.f6553k = (ImageView) this.f6549g.findViewById(R.id.bm_grayBars);
        this.f6556n = (TextView) this.f6549g.findViewById(R.id.bm_mi_label);
        this.f6557o = (TextView) this.f6549g.findViewById(R.id.bm_tis_label);
        this.f6558p = (TextView) this.f6549g.findViewById(R.id.bm_tis);
        this.f6559q = (TextView) this.f6549g.findViewById(R.id.bm_tib_label);
        this.U = (TextView) this.f6549g.findViewById(R.id.bm_gainlabel);
        this.T = (TextView) this.f6549g.findViewById(R.id.bm_timelabel);
        this.V = (LinearLayout) this.f6549g.findViewById(R.id.bm_enhance_lay);
        this.X = (TextView) this.f6549g.findViewById(R.id.bm_enhance_dr);
        this.W = (TextView) this.f6549g.findViewById(R.id.bm_enhance_enh);
        this.Y = (TextView) this.f6549g.findViewById(R.id.bm_enhance_f);
        this.f6554l = (TextView) this.f6549g.findViewById(R.id.bm_livelabel);
        this.f6555m = (TextView) this.f6549g.findViewById(R.id.bm_countlabel);
        this.f6550h = (USMarkView) this.f6549g.findViewById(R.id.bm_measure);
        ImageButton imageButton = (ImageButton) this.f6549g.findViewById(R.id.bm_clean);
        this.f6412a0 = imageButton;
        imageButton.setOnClickListener(this);
        this.f6566x = (LinearLayout) this.f6549g.findViewById(R.id.bm_information);
    }

    @Override // com.sonoptek.pvus_android.view.f
    public boolean l() {
        return true;
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void n() {
        USImageView uSImageView = this.f6552j;
        if (uSImageView != null) {
            uSImageView.K();
        }
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void o(b2.f fVar) {
        TextView textView;
        StringBuilder sb;
        float f4;
        USImageView uSImageView = this.f6552j;
        if (uSImageView == null || uSImageView.getWidth() == 0) {
            return;
        }
        this.f6562t = fVar;
        d0 d0Var = fVar.f4499a;
        this.Z = d0Var;
        if (f.Q.C(this.f6552j.getWidth(), (int) (this.f6552j.getHeight() * 0.7f))) {
            u uVar = (u) d0Var.f8789f.get("b_data");
            if (f.Q.s() != 1.0d) {
                this.f6551i.setDepth((int) uVar.f8891i);
                this.f6551i.setRevert(Boolean.valueOf(f.k()));
                this.f6551i.setScale(f.Q.A());
            }
            this.f6552j.M(fVar, f.Q, f.j(), f.k());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            this.T.setText(s0.a.f11071l + simpleDateFormat.format(d0Var.f8788e));
            this.U.setText(s0.a.f11071l + uVar.f8892j + "dB");
            if (uVar.f8884b != null) {
                this.V.setVisibility(0);
                this.W.setText(s0.a.f11071l + uVar.f8895m);
                this.X.setText(s0.a.f11071l + uVar.f8896n);
                this.Y.setText(s0.a.f11071l + l2.f.a(h.g0(), uVar.f8898p) + " MHz");
                this.f6551i.b(uVar.f8897o, -1);
            } else {
                this.V.setVisibility(4);
            }
            if (this.f6556n != null) {
                h.c cVarI0 = h.i0(h.b.BM, uVar.f8898p, uVar.f8899q);
                this.f6556n.setText(s0.a.f11071l + cVarI0.f5979c);
                if (h.G0()) {
                    this.f6558p.setText("TIB");
                    textView = this.f6557o;
                    sb = new StringBuilder();
                    sb.append(s0.a.f11071l);
                    f4 = cVarI0.f5981e;
                } else {
                    this.f6558p.setText("TIS");
                    textView = this.f6557o;
                    sb = new StringBuilder();
                    sb.append(s0.a.f11071l);
                    f4 = cVarI0.f5980d;
                }
                sb.append(f4);
                textView.setText(sb.toString());
                this.f6559q.setText(s0.a.f11071l + cVarI0.f5981e);
            }
            Bitmap bitmapO = f.Q.o();
            float width = bitmapO.getWidth();
            float height = bitmapO.getHeight();
            float width2 = this.f6553k.getWidth();
            float height2 = this.f6553k.getHeight();
            if (height2 <= 0.0f || width2 <= 0.0f) {
                return;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(width2 / width, height2 / height);
            this.f6553k.setImageBitmap(Bitmap.createBitmap(bitmapO, 0, 0, bitmapO.getWidth(), bitmapO.getHeight(), matrix, true));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.bm_clean) {
            USMarkView uSMarkView = this.f6550h;
            i2.d dVar = uSMarkView.f6186d;
            if (dVar == null && (dVar = uSMarkView.f6188f) == null) {
                return;
            }
            uSMarkView.f6184b.v(dVar);
            this.f6412a0.setVisibility(4);
            this.f6550h.invalidate();
        }
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void p(i2.e eVar) {
        float fS;
        float fS2;
        float f4;
        int width = this.f6550h.getWidth();
        this.f6550h.getHeight();
        if (this.f6565w) {
            fS = MyApplication.s() * 160.0f;
            fS2 = MyApplication.s();
            f4 = 50.0f;
        } else {
            fS = MyApplication.s() * 120.0f;
            fS2 = MyApplication.s();
            f4 = 60.0f;
        }
        f.b bVar = new f.b(width - fS, 20.0f, fS, fS2 * f4);
        z.e0(bVar);
        z.e0(bVar);
        this.f6550h.b(eVar);
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void r() {
    }
}
