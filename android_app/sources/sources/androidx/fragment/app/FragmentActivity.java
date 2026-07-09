package androidx.fragment.app;

import a0.b;
import a0.o4;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.i;
import androidx.savedstate.SavedStateRegistry;
import c.g0;
import c.j0;
import c.k0;
import c.r0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements b.d, b.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f3676r = "android:support:fragments";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f3677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.lifecycle.m f3678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3681q;

    public class a implements SavedStateRegistry.b {
        public a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        @j0
        public Bundle a() {
            Bundle bundle = new Bundle();
            FragmentActivity.this.D();
            FragmentActivity.this.f3678n.j(i.b.ON_STOP);
            Parcelable parcelableP = FragmentActivity.this.f3677m.P();
            if (parcelableP != null) {
                bundle.putParcelable(FragmentActivity.f3676r, parcelableP);
            }
            return bundle;
        }
    }

    public class b implements a.c {
        public b() {
        }

        @Override // a.c
        public void a(@j0 Context context) {
            FragmentActivity.this.f3677m.a(null);
            Bundle bundleA = FragmentActivity.this.e().a(FragmentActivity.f3676r);
            if (bundleA != null) {
                FragmentActivity.this.f3677m.L(bundleA.getParcelable(FragmentActivity.f3676r));
            }
        }
    }

    public class c extends h<FragmentActivity> implements androidx.lifecycle.b0, androidx.activity.c, androidx.activity.result.d, n {
        public c() {
            super(FragmentActivity.this);
        }

        @Override // androidx.lifecycle.l
        @j0
        public androidx.lifecycle.i a() {
            return FragmentActivity.this.f3678n;
        }

        @Override // androidx.fragment.app.n
        public void b(@j0 FragmentManager fragmentManager, @j0 Fragment fragment) {
            FragmentActivity.this.F(fragment);
        }

        @Override // androidx.activity.c
        @j0
        public OnBackPressedDispatcher d() {
            return FragmentActivity.this.d();
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.e
        @k0
        public View f(int i4) {
            return FragmentActivity.this.findViewById(i4);
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.e
        public boolean g() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.result.d
        @j0
        public ActivityResultRegistry h() {
            return FragmentActivity.this.h();
        }

        @Override // androidx.fragment.app.h
        public void l(@j0 String str, @k0 FileDescriptor fileDescriptor, @j0 PrintWriter printWriter, @k0 String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.lifecycle.b0
        @j0
        public androidx.lifecycle.a0 n() {
            return FragmentActivity.this.n();
        }

        @Override // androidx.fragment.app.h
        @j0
        public LayoutInflater o() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.h
        public int p() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.h
        public boolean q() {
            return FragmentActivity.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.h
        public boolean s(@j0 Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // androidx.fragment.app.h
        public boolean t(@j0 String str) {
            return a0.b.I(FragmentActivity.this, str);
        }

        @Override // androidx.fragment.app.h
        public void x() {
            FragmentActivity.this.O();
        }

        @Override // androidx.fragment.app.h
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public FragmentActivity m() {
            return FragmentActivity.this;
        }
    }

    public FragmentActivity() {
        this.f3677m = f.b(new c());
        this.f3678n = new androidx.lifecycle.m(this);
        this.f3681q = true;
        C();
    }

    public static boolean E(FragmentManager fragmentManager, i.c cVar) {
        boolean zE = false;
        for (Fragment fragment : fragmentManager.G0()) {
            if (fragment != null) {
                if (fragment.D() != null) {
                    zE |= E(fragment.t(), cVar);
                }
                z zVar = fragment.U;
                if (zVar != null && zVar.a().b().a(i.c.STARTED)) {
                    fragment.U.i(cVar);
                    zE = true;
                }
                if (fragment.T.b().a(i.c.STARTED)) {
                    fragment.T.q(cVar);
                    zE = true;
                }
            }
        }
        return zE;
    }

    @j0
    public FragmentManager A() {
        return this.f3677m.D();
    }

    @j0
    @Deprecated
    public n1.a B() {
        return n1.a.d(this);
    }

    public final void C() {
        e().e(f3676r, new a());
        f(new b());
    }

    public void D() {
        while (E(A(), i.c.CREATED)) {
        }
    }

    @g0
    @Deprecated
    public void F(@j0 Fragment fragment) {
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public boolean G(@k0 View view, @j0 Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void H() {
        this.f3678n.j(i.b.ON_RESUME);
        this.f3677m.r();
    }

    public void I(@k0 o4 o4Var) {
        a0.b.E(this, o4Var);
    }

    public void J(@k0 o4 o4Var) {
        a0.b.F(this, o4Var);
    }

    public void K(@j0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i4) {
        L(fragment, intent, i4, null);
    }

    public void L(@j0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i4, @k0 Bundle bundle) {
        if (i4 == -1) {
            a0.b.J(this, intent, -1, bundle);
        } else {
            fragment.B2(intent, i4, bundle);
        }
    }

    @Deprecated
    public void M(@j0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, @k0 Intent intent, int i5, int i6, int i7, @k0 Bundle bundle) throws IntentSender.SendIntentException {
        if (i4 == -1) {
            a0.b.K(this, intentSender, i4, intent, i5, i6, i7, bundle);
        } else {
            fragment.C2(intentSender, i4, intent, i5, i6, i7, bundle);
        }
    }

    public void N() {
        a0.b.v(this);
    }

    @Deprecated
    public void O() {
        invalidateOptionsMenu();
    }

    public void P() {
        a0.b.z(this);
    }

    public void Q() {
        a0.b.L(this);
    }

    @Override // a0.b.f
    @Deprecated
    public final void b(int i4) {
    }

    @Override // android.app.Activity
    public void dump(@j0 String str, @k0 FileDescriptor fileDescriptor, @j0 PrintWriter printWriter, @k0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f3679o);
        printWriter.print(" mResumed=");
        printWriter.print(this.f3680p);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3681q);
        if (getApplication() != null) {
            n1.a.d(this).b(str2, fileDescriptor, printWriter, strArr);
        }
        this.f3677m.D().b0(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @c.i
    public void onActivityResult(int i4, int i5, @k0 Intent intent) {
        this.f3677m.F();
        super.onActivityResult(i4, i5, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@j0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3677m.F();
        this.f3677m.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@k0 Bundle bundle) {
        super.onCreate(bundle);
        this.f3678n.j(i.b.ON_CREATE);
        this.f3677m.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i4, @j0 Menu menu) {
        return i4 == 0 ? super.onCreatePanelMenu(i4, menu) | this.f3677m.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i4, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @k0
    public View onCreateView(@k0 View view, @j0 String str, @j0 Context context, @j0 AttributeSet attributeSet) {
        View viewZ = z(view, str, context, attributeSet);
        return viewZ == null ? super.onCreateView(view, str, context, attributeSet) : viewZ;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f3677m.h();
        this.f3678n.j(i.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f3677m.j();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, @j0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 0) {
            return this.f3677m.l(menuItem);
        }
        if (i4 != 6) {
            return false;
        }
        return this.f3677m.e(menuItem);
    }

    @Override // android.app.Activity
    @c.i
    public void onMultiWindowModeChanged(boolean z3) {
        this.f3677m.k(z3);
    }

    @Override // android.app.Activity
    @c.i
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f3677m.F();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, @j0 Menu menu) {
        if (i4 == 0) {
            this.f3677m.m(menu);
        }
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f3680p = false;
        this.f3677m.n();
        this.f3678n.j(i.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    @c.i
    public void onPictureInPictureModeChanged(boolean z3) {
        this.f3677m.o(z3);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        H();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i4, @k0 View view, @j0 Menu menu) {
        return i4 == 0 ? G(view, menu) | this.f3677m.p(menu) : super.onPreparePanel(i4, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @c.i
    public void onRequestPermissionsResult(int i4, @j0 String[] strArr, @j0 int[] iArr) {
        this.f3677m.F();
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f3680p = true;
        this.f3677m.F();
        this.f3677m.z();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f3681q = false;
        if (!this.f3679o) {
            this.f3679o = true;
            this.f3677m.c();
        }
        this.f3677m.F();
        this.f3677m.z();
        this.f3678n.j(i.b.ON_START);
        this.f3677m.s();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f3677m.F();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f3681q = true;
        D();
        this.f3677m.t();
        this.f3678n.j(i.b.ON_STOP);
    }

    @k0
    public final View z(@k0 View view, @j0 String str, @j0 Context context, @j0 AttributeSet attributeSet) {
        return this.f3677m.G(view, str, context, attributeSet);
    }

    @c.o
    public FragmentActivity(@c.e0 int i4) {
        super(i4);
        this.f3677m = f.b(new c());
        this.f3678n = new androidx.lifecycle.m(this);
        this.f3681q = true;
        C();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @k0
    public View onCreateView(@j0 String str, @j0 Context context, @j0 AttributeSet attributeSet) {
        View viewZ = z(null, str, context, attributeSet);
        return viewZ == null ? super.onCreateView(str, context, attributeSet) : viewZ;
    }
}
