package com.sonoptek.pvus_android.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.sonoHealth.microVUE.R;
import i2.o0;
import m2.b0;
import m2.c0;
import m2.d0;
import m2.u;
import m2.w;
import m2.y;

/* JADX INFO: loaded from: classes.dex */
public class b extends f {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f6424e0 = 0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f6425f0 = 1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static b f6426g0;
    public c T;
    public d0 U;
    public d0 V;
    public f W;
    public f X;
    public f Y;
    public f Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public f f6427a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public LinearLayout f6428b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public LinearLayout f6429c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f6430d0;

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Message message = new Message();
            message.what = com.sonoptek.pvus_android.view.c.I0;
            b.this.A.sendMessage(message);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.sonoptek.pvus_android.view.b$b, reason: collision with other inner class name */
    public class ViewOnTouchListenerC0049b implements View.OnTouchListener {
        public ViewOnTouchListenerC0049b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Message message = new Message();
            message.what = com.sonoptek.pvus_android.view.c.J0;
            b.this.A.sendMessage(message);
            return false;
        }
    }

    public class c implements d {
        public c() {
        }

        @Override // com.sonoptek.pvus_android.view.b.d
        public void a(i2.f fVar) {
            if (b.this.W.f6550h.f6184b.t() != null) {
                ((o0) b.this.W.f6550h.f6184b.t()).N(fVar);
                b.this.W.f6550h.invalidate();
            }
        }

        @Override // com.sonoptek.pvus_android.view.b.d
        public void b() {
            if (b.this.W.f6550h.f6184b.t() != null) {
                b.this.W.f6550h.f6184b.v(b.this.W.f6550h.f6184b.t());
                b.this.W.f6550h.invalidate();
            }
        }

        public /* synthetic */ c(b bVar, a aVar) {
            this();
        }
    }

    public interface d {
        void a(i2.f fVar);

        void b();
    }

    public b(Activity activity) {
        super(activity);
        this.f6430d0 = 0;
        this.T = new c(this, null);
    }

    public static synchronized b I(Activity activity) {
        if (f6426g0 == null) {
            f6426g0 = new b(activity);
        }
        return f6426g0;
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void A(boolean z3, boolean z4) {
        f fVar = this.W;
        if (fVar != null) {
            fVar.A(z3, z4);
        }
        f fVar2 = this.X;
        if (fVar2 != null) {
            fVar2.A(z3, z4);
        }
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void E(int i4, int i5) {
        f fVar = this.Y;
        if (fVar != null) {
            fVar.E(i4, i5);
        }
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void F(int i4) {
        f fVar = this.Y;
        if (fVar != null) {
            fVar.F(i4);
        }
    }

    public f H() {
        return this.Y;
    }

    public f J() {
        return this.W;
    }

    public f K() {
        return this.X;
    }

    public int L() {
        return this.f6430d0;
    }

    public void M() {
        this.f6428b0.removeAllViews();
        this.f6429c0.removeAllViews();
        this.Z = null;
        this.f6427a0 = null;
    }

    public void N(int i4) {
        f fVar;
        this.f6430d0 = i4;
        if (i4 == 0) {
            this.Y = this.W;
            this.f6428b0.setForeground(this.f6548f.getResources().getDrawable(R.drawable.bg_green_box));
            this.f6429c0.setForeground(null);
            fVar = this.X;
            if (fVar == null) {
                return;
            }
        } else {
            this.f6429c0.setForeground(this.f6548f.getResources().getDrawable(R.drawable.bg_green_box));
            this.f6428b0.setForeground(null);
            this.Y = this.X;
            fVar = this.W;
            if (fVar == null) {
                return;
            }
        }
        fVar.E(-1, -1);
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void a() {
        f fVar = this.W;
        if (fVar != null) {
            fVar.a();
        }
        f fVar2 = this.X;
        if (fVar2 != null) {
            fVar2.a();
        }
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void b(i2.d dVar) {
        f fVar = this.W;
        int iU = (fVar == null || !(fVar instanceof com.sonoptek.pvus_android.view.c)) ? 0 : fVar.f6550h.f6184b.u(1);
        f fVar2 = this.X;
        if (fVar2 != null && (fVar2 instanceof com.sonoptek.pvus_android.view.c)) {
            iU += fVar2.f6550h.f6184b.u(1);
        }
        if (iU >= 3 && dVar.f() == 1) {
            Activity activity = this.f6548f;
            Toast.makeText(activity, activity.getString(R.string.measure_max_3), 1).show();
            return;
        }
        f fVar3 = this.Y;
        if (fVar3 != null) {
            fVar3.b(dVar);
        }
        f fVar4 = this.W;
        int iU2 = (fVar4 == null || !(fVar4 instanceof com.sonoptek.pvus_android.view.c)) ? 0 : fVar4.f6550h.f6184b.u(1);
        f fVar5 = this.X;
        int iU3 = (fVar5 == null || !(fVar5 instanceof com.sonoptek.pvus_android.view.c)) ? 0 : fVar5.f6550h.f6184b.u(1);
        if (iU2 <= 0 || iU3 <= 0 || iU2 + iU3 != 3) {
            return;
        }
        o0 o0Var = new o0();
        if (this.W.f6550h.f6184b.f8067f.f8194v != null) {
            for (int i4 = 0; i4 < this.W.f6550h.f6184b.f8067f.f8194v.size(); i4++) {
                o0Var.N(this.W.f6550h.f6184b.f8067f.f8194v.get(i4));
            }
        }
        if (this.X.f6550h.f6184b.f8067f.f8194v != null) {
            for (int i5 = 0; i5 < this.X.f6550h.f6184b.f8067f.f8194v.size(); i5++) {
                o0Var.N(this.X.f6550h.f6184b.f8067f.f8194v.get(i5));
            }
        }
        this.W.b(o0Var);
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void h(Activity activity) {
        super.h(activity);
        View viewInflate = View.inflate(this.f6548f, R.layout.double_viewer, null);
        this.f6549g = viewInflate;
        this.f6428b0 = (LinearLayout) viewInflate.findViewById(R.id.double_left_ly);
        this.f6429c0 = (LinearLayout) this.f6549g.findViewById(R.id.double_right_ly);
        this.f6428b0.setOnTouchListener(new a());
        this.f6429c0.setOnTouchListener(new ViewOnTouchListenerC0049b());
        this.f6428b0.setForeground(this.f6548f.getResources().getDrawable(R.drawable.bg_green_box));
    }

    @Override // com.sonoptek.pvus_android.view.f
    public boolean i() {
        return this.Y.D;
    }

    @Override // com.sonoptek.pvus_android.view.f
    public boolean l() {
        f fVar = this.Y;
        if (fVar != null) {
            return fVar.l();
        }
        return false;
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void n() {
        f fVar = this.Y;
        if (fVar != null) {
            fVar.n();
        }
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void o(b2.f fVar) {
        f fVar2;
        d0 d0Var = fVar.f4499a;
        u uVar = (u) d0Var.f8789f.get("b_data");
        y yVar = (y) d0Var.f8789f.get("color_data");
        c0 c0Var = (c0) d0Var.f8789f.get("power_data");
        b0 b0Var = (b0) d0Var.f8789f.get("pw_data");
        boolean z3 = d0Var instanceof w;
        if (this.f6430d0 == 0) {
            this.W = z3 ? com.sonoptek.pvus_android.view.a.G(this.f6548f, true, true) : fVar.f4499a instanceof b2.e ? l2.a.a0(this.f6548f, true, true) : (b0Var == null || b0Var.f8710a) ? b0Var != null ? e.H(this.f6548f, true, true) : ((yVar == null || yVar.f8914a) && (c0Var == null || c0Var.f8727a)) ? (yVar == null && c0Var == null) ? uVar.f8894l ? l2.d.S(this.f6548f, true, true) : com.sonoptek.pvus_android.view.c.I(this.f6548f, true, true) : l2.c.V(this.f6548f, true, true) : l2.b.V(this.f6548f, true, true) : com.sonoptek.pvus_android.view.d.K(this.f6548f, true, true);
            f fVar3 = this.Z;
            fVar2 = this.W;
            if (fVar3 != fVar2) {
                this.f6428b0.removeAllViews();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f6428b0.getLayoutParams());
                layoutParams.height = -1;
                layoutParams.width = -1;
                this.f6428b0.addView(this.W.D(), layoutParams);
                this.W.A(true, f.P);
                f fVar4 = this.Z;
                if (fVar4 != null) {
                    fVar4.n();
                }
                this.Z = this.W;
                return;
            }
        } else {
            this.X = z3 ? com.sonoptek.pvus_android.view.a.G(this.f6548f, true, false) : fVar.f4499a instanceof b2.e ? l2.a.a0(this.f6548f, true, false) : (b0Var == null || b0Var.f8710a) ? b0Var != null ? e.H(this.f6548f, true, false) : ((yVar == null || yVar.f8914a) && (c0Var == null || c0Var.f8727a)) ? (yVar == null && c0Var == null) ? uVar.f8894l ? l2.d.S(this.f6548f, true, false) : com.sonoptek.pvus_android.view.c.I(this.f6548f, true, false) : l2.c.V(this.f6548f, true, false) : l2.b.V(this.f6548f, true, false) : com.sonoptek.pvus_android.view.d.K(this.f6548f, true, false);
            f fVar5 = this.f6427a0;
            fVar2 = this.X;
            if (fVar5 != fVar2) {
                this.f6429c0.removeAllViews();
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f6429c0.getLayoutParams());
                layoutParams2.height = -1;
                layoutParams2.width = -1;
                this.f6429c0.addView(this.X.D(), layoutParams2);
                this.X.A(true, f.P);
                f fVar6 = this.f6427a0;
                if (fVar6 != null) {
                    fVar6.n();
                }
                this.f6427a0 = this.X;
                return;
            }
        }
        this.Y = fVar2;
        f fVar7 = this.W;
        if (fVar7 != null) {
            fVar7.s(this.T);
        }
        f fVar8 = this.X;
        if (fVar8 != null) {
            fVar8.s(this.T);
        }
        this.Y.o(fVar);
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void p(i2.e eVar) {
        f fVar = this.Y;
        if (fVar != null) {
            fVar.p(eVar);
        }
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void u(boolean z3) {
        this.Y.u(z3);
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void x(Handler handler) {
        this.A = handler;
        f fVar = this.W;
        if (fVar != null) {
            fVar.x(handler);
        }
        f fVar2 = this.X;
        if (fVar2 != null) {
            fVar2.x(handler);
        }
    }
}
