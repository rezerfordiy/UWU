package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import c.g0;
import c.j0;
import c.k0;
import c.r0;
import c.v0;

/* JADX INFO: loaded from: classes.dex */
public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public static final int B0 = 0;
    public static final int C0 = 1;
    public static final int D0 = 2;
    public static final int E0 = 3;
    public static final String F0 = "android:savedDialogState";
    public static final String G0 = "android:style";
    public static final String H0 = "android:theme";
    public static final String I0 = "android:cancelable";
    public static final String J0 = "android:showsDialog";
    public static final String K0 = "android:backStackId";
    public static final String L0 = "android:dialogShowing";
    public boolean A0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Handler f3840l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public Runnable f3841m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f3842n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public DialogInterface.OnDismissListener f3843o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f3844p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f3845q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f3846r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f3847s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f3848t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f3849u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public androidx.lifecycle.r<androidx.lifecycle.l> f3850v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @k0
    public Dialog f3851w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f3852x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f3853y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f3854z0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            c.this.f3843o0.onDismiss(c.this.f3851w0);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(@k0 DialogInterface dialogInterface) {
            if (c.this.f3851w0 != null) {
                c cVar = c.this;
                cVar.onCancel(cVar.f3851w0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    public class DialogInterfaceOnDismissListenerC0021c implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC0021c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(@k0 DialogInterface dialogInterface) {
            if (c.this.f3851w0 != null) {
                c cVar = c.this;
                cVar.onDismiss(cVar.f3851w0);
            }
        }
    }

    public class d implements androidx.lifecycle.r<androidx.lifecycle.l> {
        public d() {
        }

        @Override // androidx.lifecycle.r
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.lifecycle.l lVar) {
            if (lVar == null || !c.this.f3847s0) {
                return;
            }
            View viewS1 = c.this.S1();
            if (viewS1.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (c.this.f3851w0 != null) {
                if (FragmentManager.T0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + c.this.f3851w0);
                }
                c.this.f3851w0.setContentView(viewS1);
            }
        }
    }

    public class e extends androidx.fragment.app.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.e f3859b;

        public e(androidx.fragment.app.e eVar) {
            this.f3859b = eVar;
        }

        @Override // androidx.fragment.app.e
        @k0
        public View f(int i4) {
            return this.f3859b.g() ? this.f3859b.f(i4) : c.this.Q2(i4);
        }

        @Override // androidx.fragment.app.e
        public boolean g() {
            return this.f3859b.g() || c.this.R2();
        }
    }

    public c() {
        this.f3841m0 = new a();
        this.f3842n0 = new b();
        this.f3843o0 = new DialogInterfaceOnDismissListenerC0021c();
        this.f3844p0 = 0;
        this.f3845q0 = 0;
        this.f3846r0 = true;
        this.f3847s0 = true;
        this.f3848t0 = -1;
        this.f3850v0 = new d();
        this.A0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    @g0
    public void E0(@j0 Context context) {
        super.E0(context);
        h0().k(this.f3850v0);
        if (this.f3854z0) {
            return;
        }
        this.f3853y0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    @g0
    public void H0(@k0 Bundle bundle) {
        super.H0(bundle);
        this.f3840l0 = new Handler();
        this.f3847s0 = this.f3631y == 0;
        if (bundle != null) {
            this.f3844p0 = bundle.getInt(G0, 0);
            this.f3845q0 = bundle.getInt(H0, 0);
            this.f3846r0 = bundle.getBoolean(I0, true);
            this.f3847s0 = bundle.getBoolean(J0, this.f3847s0);
            this.f3848t0 = bundle.getInt(K0, -1);
        }
    }

    public void I2() {
        K2(false, false);
    }

    public void J2() {
        K2(true, false);
    }

    public final void K2(boolean z3, boolean z4) {
        if (this.f3853y0) {
            return;
        }
        this.f3853y0 = true;
        this.f3854z0 = false;
        Dialog dialog = this.f3851w0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f3851w0.dismiss();
            if (!z4) {
                if (Looper.myLooper() == this.f3840l0.getLooper()) {
                    onDismiss(this.f3851w0);
                } else {
                    this.f3840l0.post(this.f3841m0);
                }
            }
        }
        this.f3852x0 = true;
        if (this.f3848t0 >= 0) {
            L().m1(this.f3848t0, 1);
            this.f3848t0 = -1;
            return;
        }
        v vVarR = L().r();
        vVarR.C(this);
        if (z3) {
            vVarR.s();
        } else {
            vVarR.r();
        }
    }

    @k0
    public Dialog L2() {
        return this.f3851w0;
    }

    public boolean M2() {
        return this.f3847s0;
    }

    @v0
    public int N2() {
        return this.f3845q0;
    }

    @Override // androidx.fragment.app.Fragment
    @g0
    public void O0() {
        super.O0();
        Dialog dialog = this.f3851w0;
        if (dialog != null) {
            this.f3852x0 = true;
            dialog.setOnDismissListener(null);
            this.f3851w0.dismiss();
            if (!this.f3853y0) {
                onDismiss(this.f3851w0);
            }
            this.f3851w0 = null;
            this.A0 = false;
        }
    }

    public boolean O2() {
        return this.f3846r0;
    }

    @Override // androidx.fragment.app.Fragment
    @g0
    public void P0() {
        super.P0();
        if (!this.f3854z0 && !this.f3853y0) {
            this.f3853y0 = true;
        }
        h0().o(this.f3850v0);
    }

    @g0
    @j0
    public Dialog P2(@k0 Bundle bundle) {
        if (FragmentManager.T0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(O1(), N2());
    }

    @Override // androidx.fragment.app.Fragment
    @j0
    public LayoutInflater Q0(@k0 Bundle bundle) {
        StringBuilder sb;
        String str;
        LayoutInflater layoutInflaterQ0 = super.Q0(bundle);
        if (this.f3847s0 && !this.f3849u0) {
            S2(bundle);
            if (FragmentManager.T0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f3851w0;
            return dialog != null ? layoutInflaterQ0.cloneInContext(dialog.getContext()) : layoutInflaterQ0;
        }
        if (FragmentManager.T0(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (this.f3847s0) {
                sb = new StringBuilder();
                str = "mCreatingDialog = true: ";
            } else {
                sb = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            sb.append(str);
            sb.append(str2);
            Log.d("FragmentManager", sb.toString());
        }
        return layoutInflaterQ0;
    }

    @k0
    public View Q2(int i4) {
        Dialog dialog = this.f3851w0;
        if (dialog != null) {
            return dialog.findViewById(i4);
        }
        return null;
    }

    public boolean R2() {
        return this.A0;
    }

    public final void S2(@k0 Bundle bundle) {
        if (this.f3847s0 && !this.A0) {
            try {
                this.f3849u0 = true;
                Dialog dialogP2 = P2(bundle);
                this.f3851w0 = dialogP2;
                if (this.f3847s0) {
                    X2(dialogP2, this.f3844p0);
                    Context contextU = u();
                    if (contextU instanceof Activity) {
                        this.f3851w0.setOwnerActivity((Activity) contextU);
                    }
                    this.f3851w0.setCancelable(this.f3846r0);
                    this.f3851w0.setOnCancelListener(this.f3842n0);
                    this.f3851w0.setOnDismissListener(this.f3843o0);
                    this.A0 = true;
                } else {
                    this.f3851w0 = null;
                }
            } finally {
                this.f3849u0 = false;
            }
        }
    }

    @j0
    public final Dialog T2() {
        Dialog dialogL2 = L2();
        if (dialogL2 != null) {
            return dialogL2;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void U2(boolean z3) {
        this.f3846r0 = z3;
        Dialog dialog = this.f3851w0;
        if (dialog != null) {
            dialog.setCancelable(z3);
        }
    }

    public void V2(boolean z3) {
        this.f3847s0 = z3;
    }

    public void W2(int i4, @v0 int i5) {
        if (FragmentManager.T0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i4 + ", " + i5);
        }
        this.f3844p0 = i4;
        if (i4 == 2 || i4 == 3) {
            this.f3845q0 = R.style.Theme.Panel;
        }
        if (i5 != 0) {
            this.f3845q0 = i5;
        }
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void X2(@j0 Dialog dialog, int i4) {
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int Y2(@j0 v vVar, @k0 String str) {
        this.f3853y0 = false;
        this.f3854z0 = true;
        vVar.l(this, str);
        this.f3852x0 = false;
        int iR = vVar.r();
        this.f3848t0 = iR;
        return iR;
    }

    public void Z2(@j0 FragmentManager fragmentManager, @k0 String str) {
        this.f3853y0 = false;
        this.f3854z0 = true;
        v vVarR = fragmentManager.r();
        vVarR.l(this, str);
        vVarR.r();
    }

    public void a3(@j0 FragmentManager fragmentManager, @k0 String str) {
        this.f3853y0 = false;
        this.f3854z0 = true;
        v vVarR = fragmentManager.r();
        vVarR.l(this, str);
        vVarR.t();
    }

    @Override // androidx.fragment.app.Fragment
    @j0
    public androidx.fragment.app.e c() {
        return new e(super.c());
    }

    @Override // androidx.fragment.app.Fragment
    @g0
    public void d1(@j0 Bundle bundle) {
        super.d1(bundle);
        Dialog dialog = this.f3851w0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(L0, false);
            bundle.putBundle(F0, bundleOnSaveInstanceState);
        }
        int i4 = this.f3844p0;
        if (i4 != 0) {
            bundle.putInt(G0, i4);
        }
        int i5 = this.f3845q0;
        if (i5 != 0) {
            bundle.putInt(H0, i5);
        }
        boolean z3 = this.f3846r0;
        if (!z3) {
            bundle.putBoolean(I0, z3);
        }
        boolean z4 = this.f3847s0;
        if (!z4) {
            bundle.putBoolean(J0, z4);
        }
        int i6 = this.f3848t0;
        if (i6 != -1) {
            bundle.putInt(K0, i6);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @g0
    public void e1() {
        super.e1();
        Dialog dialog = this.f3851w0;
        if (dialog != null) {
            this.f3852x0 = false;
            dialog.show();
            View decorView = this.f3851w0.getWindow().getDecorView();
            androidx.lifecycle.c0.b(decorView, this);
            androidx.lifecycle.d0.b(decorView, this);
            androidx.savedstate.d.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @g0
    public void f1() {
        super.f1();
        Dialog dialog = this.f3851w0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @g0
    public void h1(@k0 Bundle bundle) {
        Bundle bundle2;
        super.h1(bundle);
        if (this.f3851w0 == null || bundle == null || (bundle2 = bundle.getBundle(F0)) == null) {
            return;
        }
        this.f3851w0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(@j0 LayoutInflater layoutInflater, @k0 ViewGroup viewGroup, @k0 Bundle bundle) {
        Bundle bundle2;
        super.o1(layoutInflater, viewGroup, bundle);
        if (this.I != null || this.f3851w0 == null || bundle == null || (bundle2 = bundle.getBundle(F0)) == null) {
            return;
        }
        this.f3851w0.onRestoreInstanceState(bundle2);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@j0 DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(@j0 DialogInterface dialogInterface) {
        if (this.f3852x0) {
            return;
        }
        if (FragmentManager.T0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        K2(true, true);
    }

    public c(@c.e0 int i4) {
        super(i4);
        this.f3841m0 = new a();
        this.f3842n0 = new b();
        this.f3843o0 = new DialogInterfaceOnDismissListenerC0021c();
        this.f3844p0 = 0;
        this.f3845q0 = 0;
        this.f3846r0 = true;
        this.f3847s0 = true;
        this.f3848t0 = -1;
        this.f3850v0 = new d();
        this.A0 = false;
    }
}
