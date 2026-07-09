package androidx.fragment.app;

import a0.o4;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.z;
import androidx.savedstate.SavedStateRegistry;
import c.g0;
import c.j0;
import c.k0;
import c.r0;
import c.u0;
import c.y0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.l, androidx.lifecycle.b0, androidx.lifecycle.h, androidx.savedstate.c, androidx.activity.result.b {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Object f3597b0 = new Object();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f3598c0 = -1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f3599d0 = 0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f3600e0 = 1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f3601f0 = 2;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f3602g0 = 3;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f3603h0 = 4;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f3604i0 = 5;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f3605j0 = 6;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f3606k0 = 7;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public ViewGroup H;
    public View I;
    public boolean J;
    public boolean K;
    public i L;
    public Runnable M;
    public boolean N;
    public boolean O;
    public float P;
    public LayoutInflater Q;
    public boolean R;
    public i.c S;
    public androidx.lifecycle.m T;

    @k0
    public z U;
    public androidx.lifecycle.q<androidx.lifecycle.l> V;
    public z.b W;
    public androidx.savedstate.b X;

    @c.e0
    public int Y;
    public final AtomicInteger Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ArrayList<k> f3607a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f3609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray<Parcelable> f3610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f3611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @k0
    public Boolean f3612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @j0
    public String f3613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bundle f3614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Fragment f3615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f3616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3617k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Boolean f3618l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3619m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3620n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3621o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3622p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3623q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3624r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3625s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public FragmentManager f3626t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public androidx.fragment.app.h<?> f3627u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @j0
    public FragmentManager f3628v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Fragment f3629w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3630x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3631y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f3632z;

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {

        @j0
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f3634a;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public SavedState(Bundle bundle) {
            this.f3634a = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@j0 Parcel parcel, int i4) {
            parcel.writeBundle(this.f3634a);
        }

        public SavedState(@j0 Parcel parcel, @k0 ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f3634a = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.D2();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.b(false);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c0 f3637b;

        public c(c0 c0Var) {
            this.f3637b = c0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3637b.g();
        }
    }

    public class d extends androidx.fragment.app.e {
        public d() {
        }

        @Override // androidx.fragment.app.e
        @k0
        public View f(int i4) {
            View view = Fragment.this.I;
            if (view != null) {
                return view.findViewById(i4);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.e
        public boolean g() {
            return Fragment.this.I != null;
        }
    }

    public class e implements o.a<Void, ActivityResultRegistry> {
        public e() {
        }

        @Override // o.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry a(Void r32) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.f3627u;
            return obj instanceof androidx.activity.result.d ? ((androidx.activity.result.d) obj).h() : fragment.M1().h();
        }
    }

    public class f implements o.a<Void, ActivityResultRegistry> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActivityResultRegistry f3641a;

        public f(ActivityResultRegistry activityResultRegistry) {
            this.f3641a = activityResultRegistry;
        }

        @Override // o.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry a(Void r12) {
            return this.f3641a;
        }
    }

    public class g extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o.a f3643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f3644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b.a f3645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.a f3646d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(o.a aVar, AtomicReference atomicReference, b.a aVar2, androidx.activity.result.a aVar3) {
            super(null);
            this.f3643a = aVar;
            this.f3644b = atomicReference;
            this.f3645c = aVar2;
            this.f3646d = aVar3;
        }

        @Override // androidx.fragment.app.Fragment.k
        public void a() {
            String strI = Fragment.this.i();
            this.f3644b.set(((ActivityResultRegistry) this.f3643a.a(null)).i(strI, Fragment.this, this.f3645c, this.f3646d));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class h<I> extends androidx.activity.result.c<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f3648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.a f3649b;

        public h(AtomicReference atomicReference, b.a aVar) {
            this.f3648a = atomicReference;
            this.f3649b = aVar;
        }

        @Override // androidx.activity.result.c
        @j0
        public b.a<I, ?> a() {
            return this.f3649b;
        }

        @Override // androidx.activity.result.c
        public void c(I i4, @k0 a0.d dVar) {
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f3648a.get();
            if (cVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            cVar.c(i4, dVar);
        }

        @Override // androidx.activity.result.c
        public void d() {
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f3648a.getAndSet(null);
            if (cVar != null) {
                cVar.d();
            }
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f3651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Animator f3652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3654d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3656f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f3657g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f3658h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ArrayList<String> f3659i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ArrayList<String> f3660j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f3661k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f3662l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f3663m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f3664n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f3665o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f3666p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Boolean f3667q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Boolean f3668r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public o4 f3669s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public o4 f3670t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f3671u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public View f3672v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f3673w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public l f3674x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f3675y;

        public i() {
            Object obj = Fragment.f3597b0;
            this.f3662l = obj;
            this.f3663m = null;
            this.f3664n = obj;
            this.f3665o = null;
            this.f3666p = obj;
            this.f3669s = null;
            this.f3670t = null;
            this.f3671u = 1.0f;
            this.f3672v = null;
        }
    }

    public static class j extends RuntimeException {
        public j(@j0 String str, @k0 Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class k {
        public k() {
        }

        public abstract void a();

        public /* synthetic */ k(a aVar) {
            this();
        }
    }

    public interface l {
        void a();

        void b();
    }

    public Fragment() {
        this.f3608b = -1;
        this.f3613g = UUID.randomUUID().toString();
        this.f3616j = null;
        this.f3618l = null;
        this.f3628v = new androidx.fragment.app.k();
        this.F = true;
        this.K = true;
        this.M = new a();
        this.S = i.c.RESUMED;
        this.V = new androidx.lifecycle.q<>();
        this.Z = new AtomicInteger();
        this.f3607a0 = new ArrayList<>();
        j0();
    }

    @j0
    @Deprecated
    public static Fragment l0(@j0 Context context, @j0 String str) {
        return m0(context, str, null);
    }

    @j0
    @Deprecated
    public static Fragment m0(@j0 Context context, @j0 String str, @k0 Bundle bundle) {
        try {
            Fragment fragmentNewInstance = androidx.fragment.app.g.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.b2(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e4) {
            throw new j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (InstantiationException e5) {
            throw new j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e5);
        } catch (NoSuchMethodException e6) {
            throw new j("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e6);
        } catch (InvocationTargetException e7) {
            throw new j("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e7);
        }
    }

    public o4 A() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        return iVar.f3670t;
    }

    public void A0() {
        this.f3628v.h1();
    }

    public void A1() {
        boolean zW0 = this.f3626t.W0(this);
        Boolean bool = this.f3618l;
        if (bool == null || bool.booleanValue() != zW0) {
            this.f3618l = Boolean.valueOf(zW0);
            a1(zW0);
            this.f3628v.U();
        }
    }

    @Deprecated
    public void A2(@SuppressLint({"UnknownNullness"}) Intent intent, int i4) {
        B2(intent, i4, null);
    }

    public View B() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        return iVar.f3672v;
    }

    @g0
    @c.i
    @Deprecated
    public void B0(@k0 Bundle bundle) {
        this.G = true;
    }

    public void B1() {
        this.f3628v.h1();
        this.f3628v.h0(true);
        this.f3608b = 7;
        this.G = false;
        c1();
        if (!this.G) {
            throw new e0("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.m mVar = this.T;
        i.b bVar = i.b.ON_RESUME;
        mVar.j(bVar);
        if (this.I != null) {
            this.U.b(bVar);
        }
        this.f3628v.V();
    }

    @Deprecated
    public void B2(@SuppressLint({"UnknownNullness"}) Intent intent, int i4, @k0 Bundle bundle) {
        if (this.f3627u != null) {
            L().a1(this, intent, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @k0
    @Deprecated
    public final FragmentManager C() {
        return this.f3626t;
    }

    @Deprecated
    public void C0(int i4, int i5, @k0 Intent intent) {
        if (FragmentManager.T0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i4 + " resultCode: " + i5 + " data: " + intent);
        }
    }

    public void C1(Bundle bundle) {
        d1(bundle);
        this.X.d(bundle);
        Parcelable parcelableH1 = this.f3628v.H1();
        if (parcelableH1 != null) {
            bundle.putParcelable(FragmentActivity.f3676r, parcelableH1);
        }
    }

    @Deprecated
    public void C2(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, @k0 Intent intent, int i5, int i6, int i7, @k0 Bundle bundle) throws IntentSender.SendIntentException {
        if (this.f3627u == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (FragmentManager.T0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i4 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        L().b1(this, intentSender, i4, intent, i5, i6, i7, bundle);
    }

    @k0
    public final Object D() {
        androidx.fragment.app.h<?> hVar = this.f3627u;
        if (hVar == null) {
            return null;
        }
        return hVar.m();
    }

    @g0
    @c.i
    @Deprecated
    public void D0(@j0 Activity activity) {
        this.G = true;
    }

    public void D1() {
        this.f3628v.h1();
        this.f3628v.h0(true);
        this.f3608b = 5;
        this.G = false;
        e1();
        if (!this.G) {
            throw new e0("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.m mVar = this.T;
        i.b bVar = i.b.ON_START;
        mVar.j(bVar);
        if (this.I != null) {
            this.U.b(bVar);
        }
        this.f3628v.W();
    }

    public void D2() {
        if (this.L == null || !g().f3673w) {
            return;
        }
        if (this.f3627u == null) {
            g().f3673w = false;
        } else if (Looper.myLooper() != this.f3627u.k().getLooper()) {
            this.f3627u.k().postAtFrontOfQueue(new b());
        } else {
            b(true);
        }
    }

    public final int E() {
        return this.f3630x;
    }

    @g0
    @c.i
    public void E0(@j0 Context context) {
        this.G = true;
        androidx.fragment.app.h<?> hVar = this.f3627u;
        Activity activityI = hVar == null ? null : hVar.i();
        if (activityI != null) {
            this.G = false;
            D0(activityI);
        }
    }

    public void E1() {
        this.f3628v.Y();
        if (this.I != null) {
            this.U.b(i.b.ON_STOP);
        }
        this.T.j(i.b.ON_STOP);
        this.f3608b = 4;
        this.G = false;
        f1();
        if (this.G) {
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onStop()");
    }

    public void E2(@j0 View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @j0
    public final LayoutInflater F() {
        LayoutInflater layoutInflater = this.Q;
        return layoutInflater == null ? s1(null) : layoutInflater;
    }

    @g0
    @Deprecated
    public void F0(@j0 Fragment fragment) {
    }

    public void F1() {
        g1(this.I, this.f3609c);
        this.f3628v.Z();
    }

    @j0
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public LayoutInflater G(@k0 Bundle bundle) {
        androidx.fragment.app.h<?> hVar = this.f3627u;
        if (hVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterO = hVar.o();
        v0.w.d(layoutInflaterO, this.f3628v.I0());
        return layoutInflaterO;
    }

    @g0
    public boolean G0(@j0 MenuItem menuItem) {
        return false;
    }

    public void G1() {
        g().f3673w = true;
    }

    @j0
    @Deprecated
    public n1.a H() {
        return n1.a.d(this);
    }

    @g0
    @c.i
    public void H0(@k0 Bundle bundle) {
        this.G = true;
        T1(bundle);
        if (this.f3628v.X0(1)) {
            return;
        }
        this.f3628v.H();
    }

    public final void H1(long j4, @j0 TimeUnit timeUnit) {
        g().f3673w = true;
        FragmentManager fragmentManager = this.f3626t;
        Handler handlerK = fragmentManager != null ? fragmentManager.H0().k() : new Handler(Looper.getMainLooper());
        handlerK.removeCallbacks(this.M);
        handlerK.postDelayed(this.M, timeUnit.toMillis(j4));
    }

    public final int I() {
        i.c cVar = this.S;
        return (cVar == i.c.INITIALIZED || this.f3629w == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.f3629w.I());
    }

    @g0
    @k0
    public Animation I0(int i4, boolean z3, int i5) {
        return null;
    }

    @j0
    public final <I, O> androidx.activity.result.c<I> I1(@j0 b.a<I, O> aVar, @j0 o.a<Void, ActivityResultRegistry> aVar2, @j0 androidx.activity.result.a<O> aVar3) {
        if (this.f3608b <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            K1(new g(aVar2, atomicReference, aVar, aVar3));
            return new h(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    public int J() {
        i iVar = this.L;
        if (iVar == null) {
            return 0;
        }
        return iVar.f3658h;
    }

    @g0
    @k0
    public Animator J0(int i4, boolean z3, int i5) {
        return null;
    }

    public void J1(@j0 View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @k0
    public final Fragment K() {
        return this.f3629w;
    }

    @g0
    public void K0(@j0 Menu menu, @j0 MenuInflater menuInflater) {
    }

    public final void K1(@j0 k kVar) {
        if (this.f3608b >= 0) {
            kVar.a();
        } else {
            this.f3607a0.add(kVar);
        }
    }

    @j0
    public final FragmentManager L() {
        FragmentManager fragmentManager = this.f3626t;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @g0
    @k0
    public View L0(@j0 LayoutInflater layoutInflater, @k0 ViewGroup viewGroup, @k0 Bundle bundle) {
        int i4 = this.Y;
        if (i4 != 0) {
            return layoutInflater.inflate(i4, viewGroup, false);
        }
        return null;
    }

    @Deprecated
    public final void L1(@j0 String[] strArr, int i4) {
        if (this.f3627u != null) {
            L().Z0(this, strArr, i4);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public boolean M() {
        i iVar = this.L;
        if (iVar == null) {
            return false;
        }
        return iVar.f3653c;
    }

    @g0
    @c.i
    public void M0() {
        this.G = true;
    }

    @j0
    public final FragmentActivity M1() {
        FragmentActivity fragmentActivityJ = j();
        if (fragmentActivityJ != null) {
            return fragmentActivityJ;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public int N() {
        i iVar = this.L;
        if (iVar == null) {
            return 0;
        }
        return iVar.f3656f;
    }

    @g0
    public void N0() {
    }

    @j0
    public final Bundle N1() {
        Bundle bundleS = s();
        if (bundleS != null) {
            return bundleS;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public int O() {
        i iVar = this.L;
        if (iVar == null) {
            return 0;
        }
        return iVar.f3657g;
    }

    @g0
    @c.i
    public void O0() {
        this.G = true;
    }

    @j0
    public final Context O1() {
        Context contextU = u();
        if (contextU != null) {
            return contextU;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public float P() {
        i iVar = this.L;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.f3671u;
    }

    @g0
    @c.i
    public void P0() {
        this.G = true;
    }

    @j0
    @Deprecated
    public final FragmentManager P1() {
        return L();
    }

    @k0
    public Object Q() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f3664n;
        return obj == f3597b0 ? z() : obj;
    }

    @j0
    public LayoutInflater Q0(@k0 Bundle bundle) {
        return G(bundle);
    }

    @j0
    public final Object Q1() {
        Object objD = D();
        if (objD != null) {
            return objD;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    @j0
    public final Resources R() {
        return O1().getResources();
    }

    @g0
    public void R0(boolean z3) {
    }

    @j0
    public final Fragment R1() {
        Fragment fragmentK = K();
        if (fragmentK != null) {
            return fragmentK;
        }
        if (u() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + u());
    }

    @Deprecated
    public final boolean S() {
        return this.C;
    }

    @c.i
    @y0
    @Deprecated
    public void S0(@j0 Activity activity, @j0 AttributeSet attributeSet, @k0 Bundle bundle) {
        this.G = true;
    }

    @j0
    public final View S1() {
        View viewF0 = f0();
        if (viewF0 != null) {
            return viewF0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @k0
    public Object T() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f3662l;
        return obj == f3597b0 ? w() : obj;
    }

    @c.i
    @y0
    public void T0(@j0 Context context, @j0 AttributeSet attributeSet, @k0 Bundle bundle) {
        this.G = true;
        androidx.fragment.app.h<?> hVar = this.f3627u;
        Activity activityI = hVar == null ? null : hVar.i();
        if (activityI != null) {
            this.G = false;
            S0(activityI, attributeSet, bundle);
        }
    }

    public void T1(@k0 Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable(FragmentActivity.f3676r)) == null) {
            return;
        }
        this.f3628v.E1(parcelable);
        this.f3628v.H();
    }

    @k0
    public Object U() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        return iVar.f3665o;
    }

    public void U0(boolean z3) {
    }

    public final void U1() {
        if (FragmentManager.T0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.I != null) {
            V1(this.f3609c);
        }
        this.f3609c = null;
    }

    @k0
    public Object V() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f3666p;
        return obj == f3597b0 ? U() : obj;
    }

    @g0
    public boolean V0(@j0 MenuItem menuItem) {
        return false;
    }

    public final void V1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f3610d;
        if (sparseArray != null) {
            this.I.restoreHierarchyState(sparseArray);
            this.f3610d = null;
        }
        if (this.I != null) {
            this.U.g(this.f3611e);
            this.f3611e = null;
        }
        this.G = false;
        h1(bundle);
        if (this.G) {
            if (this.I != null) {
                this.U.b(i.b.ON_CREATE);
            }
        } else {
            throw new e0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    @j0
    public ArrayList<String> W() {
        ArrayList<String> arrayList;
        i iVar = this.L;
        return (iVar == null || (arrayList = iVar.f3659i) == null) ? new ArrayList<>() : arrayList;
    }

    @g0
    public void W0(@j0 Menu menu) {
    }

    public void W1(boolean z3) {
        g().f3668r = Boolean.valueOf(z3);
    }

    @j0
    public ArrayList<String> X() {
        ArrayList<String> arrayList;
        i iVar = this.L;
        return (iVar == null || (arrayList = iVar.f3660j) == null) ? new ArrayList<>() : arrayList;
    }

    @g0
    @c.i
    public void X0() {
        this.G = true;
    }

    public void X1(boolean z3) {
        g().f3667q = Boolean.valueOf(z3);
    }

    @j0
    public final String Y(@u0 int i4) {
        return R().getString(i4);
    }

    public void Y0(boolean z3) {
    }

    public void Y1(View view) {
        g().f3651a = view;
    }

    @j0
    public final String Z(@u0 int i4, @k0 Object... objArr) {
        return R().getString(i4, objArr);
    }

    @g0
    public void Z0(@j0 Menu menu) {
    }

    public void Z1(int i4, int i5, int i6, int i7) {
        if (this.L == null && i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            return;
        }
        g().f3654d = i4;
        g().f3655e = i5;
        g().f3656f = i6;
        g().f3657g = i7;
    }

    @Override // androidx.lifecycle.l
    @j0
    public androidx.lifecycle.i a() {
        return this.T;
    }

    @k0
    public final String a0() {
        return this.f3632z;
    }

    @g0
    public void a1(boolean z3) {
    }

    public void a2(Animator animator) {
        g().f3652b = animator;
    }

    public void b(boolean z3) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        i iVar = this.L;
        l lVar = null;
        if (iVar != null) {
            iVar.f3673w = false;
            l lVar2 = iVar.f3674x;
            iVar.f3674x = null;
            lVar = lVar2;
        }
        if (lVar != null) {
            lVar.a();
            return;
        }
        if (!FragmentManager.Q || this.I == null || (viewGroup = this.H) == null || (fragmentManager = this.f3626t) == null) {
            return;
        }
        c0 c0VarN = c0.n(viewGroup, fragmentManager);
        c0VarN.p();
        if (z3) {
            this.f3627u.k().post(new c(c0VarN));
        } else {
            c0VarN.g();
        }
    }

    @k0
    @Deprecated
    public final Fragment b0() {
        String str;
        Fragment fragment = this.f3615i;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.f3626t;
        if (fragmentManager == null || (str = this.f3616j) == null) {
            return null;
        }
        return fragmentManager.n0(str);
    }

    @Deprecated
    public void b1(int i4, @j0 String[] strArr, @j0 int[] iArr) {
    }

    public void b2(@k0 Bundle bundle) {
        if (this.f3626t != null && y0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f3614h = bundle;
    }

    @j0
    public androidx.fragment.app.e c() {
        return new d();
    }

    @Deprecated
    public final int c0() {
        return this.f3617k;
    }

    @g0
    @c.i
    public void c1() {
        this.G = true;
    }

    public void c2(@k0 o4 o4Var) {
        g().f3669s = o4Var;
    }

    @j0
    public final CharSequence d0(@u0 int i4) {
        return R().getText(i4);
    }

    @g0
    public void d1(@j0 Bundle bundle) {
    }

    public void d2(@k0 Object obj) {
        g().f3661k = obj;
    }

    @Override // androidx.savedstate.c
    @j0
    public final SavedStateRegistry e() {
        return this.X.b();
    }

    @Deprecated
    public boolean e0() {
        return this.K;
    }

    @g0
    @c.i
    public void e1() {
        this.G = true;
    }

    public void e2(@k0 o4 o4Var) {
        g().f3670t = o4Var;
    }

    public final boolean equals(@k0 Object obj) {
        return super.equals(obj);
    }

    public void f(@j0 String str, @k0 FileDescriptor fileDescriptor, @j0 PrintWriter printWriter, @k0 String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f3630x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f3631y));
        printWriter.print(" mTag=");
        printWriter.println(this.f3632z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f3608b);
        printWriter.print(" mWho=");
        printWriter.print(this.f3613g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f3625s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f3619m);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f3620n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f3621o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f3622p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.A);
        printWriter.print(" mDetached=");
        printWriter.print(this.B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.K);
        if (this.f3626t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f3626t);
        }
        if (this.f3627u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f3627u);
        }
        if (this.f3629w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f3629w);
        }
        if (this.f3614h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f3614h);
        }
        if (this.f3609c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f3609c);
        }
        if (this.f3610d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f3610d);
        }
        if (this.f3611e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f3611e);
        }
        Fragment fragmentB0 = b0();
        if (fragmentB0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentB0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f3617k);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(M());
        if (v() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(v());
        }
        if (y() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(y());
        }
        if (N() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(N());
        }
        if (O() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(O());
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.I);
        }
        if (p() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(p());
        }
        if (u() != null) {
            n1.a.d(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f3628v + ":");
        this.f3628v.b0(str + "  ", fileDescriptor, printWriter, strArr);
    }

    @k0
    public View f0() {
        return this.I;
    }

    @g0
    @c.i
    public void f1() {
        this.G = true;
    }

    public void f2(@k0 Object obj) {
        g().f3663m = obj;
    }

    public final i g() {
        if (this.L == null) {
            this.L = new i();
        }
        return this.L;
    }

    @g0
    @j0
    public androidx.lifecycle.l g0() {
        z zVar = this.U;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @g0
    public void g1(@j0 View view, @k0 Bundle bundle) {
    }

    public void g2(View view) {
        g().f3672v = view;
    }

    @k0
    public Fragment h(@j0 String str) {
        return str.equals(this.f3613g) ? this : this.f3628v.r0(str);
    }

    @j0
    public LiveData<androidx.lifecycle.l> h0() {
        return this.V;
    }

    @g0
    @c.i
    public void h1(@k0 Bundle bundle) {
        this.G = true;
    }

    public void h2(boolean z3) {
        if (this.E != z3) {
            this.E = z3;
            if (!n0() || p0()) {
                return;
            }
            this.f3627u.x();
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @j0
    public String i() {
        return "fragment_" + this.f3613g + "_rq#" + this.Z.getAndIncrement();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public final boolean i0() {
        return this.E;
    }

    public void i1(Bundle bundle) {
        this.f3628v.h1();
        this.f3608b = 3;
        this.G = false;
        B0(bundle);
        if (this.G) {
            U1();
            this.f3628v.D();
        } else {
            throw new e0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public void i2(boolean z3) {
        g().f3675y = z3;
    }

    @k0
    public final FragmentActivity j() {
        androidx.fragment.app.h<?> hVar = this.f3627u;
        if (hVar == null) {
            return null;
        }
        return (FragmentActivity) hVar.i();
    }

    public final void j0() {
        this.T = new androidx.lifecycle.m(this);
        this.X = androidx.savedstate.b.a(this);
        this.W = null;
    }

    public void j1() {
        Iterator<k> it = this.f3607a0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f3607a0.clear();
        this.f3628v.p(this.f3627u, c(), this);
        this.f3608b = 0;
        this.G = false;
        E0(this.f3627u.j());
        if (this.G) {
            this.f3626t.N(this);
            this.f3628v.E();
        } else {
            throw new e0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public void j2(@k0 SavedState savedState) {
        Bundle bundle;
        if (this.f3626t != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f3634a) == null) {
            bundle = null;
        }
        this.f3609c = bundle;
    }

    public boolean k() {
        Boolean bool;
        i iVar = this.L;
        if (iVar == null || (bool = iVar.f3668r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void k0() {
        j0();
        this.f3613g = UUID.randomUUID().toString();
        this.f3619m = false;
        this.f3620n = false;
        this.f3621o = false;
        this.f3622p = false;
        this.f3623q = false;
        this.f3625s = 0;
        this.f3626t = null;
        this.f3628v = new androidx.fragment.app.k();
        this.f3627u = null;
        this.f3630x = 0;
        this.f3631y = 0;
        this.f3632z = null;
        this.A = false;
        this.B = false;
    }

    public void k1(@j0 Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f3628v.F(configuration);
    }

    public void k2(boolean z3) {
        if (this.F != z3) {
            this.F = z3;
            if (this.E && n0() && !p0()) {
                this.f3627u.x();
            }
        }
    }

    @Override // androidx.activity.result.b
    @g0
    @j0
    public final <I, O> androidx.activity.result.c<I> l(@j0 b.a<I, O> aVar, @j0 ActivityResultRegistry activityResultRegistry, @j0 androidx.activity.result.a<O> aVar2) {
        return I1(aVar, new f(activityResultRegistry), aVar2);
    }

    public boolean l1(@j0 MenuItem menuItem) {
        if (this.A) {
            return false;
        }
        if (G0(menuItem)) {
            return true;
        }
        return this.f3628v.G(menuItem);
    }

    public void l2(int i4) {
        if (this.L == null && i4 == 0) {
            return;
        }
        g();
        this.L.f3658h = i4;
    }

    public boolean m() {
        Boolean bool;
        i iVar = this.L;
        if (iVar == null || (bool = iVar.f3667q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void m1(Bundle bundle) {
        this.f3628v.h1();
        this.f3608b = 1;
        this.G = false;
        this.T.a(new androidx.lifecycle.j() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.j
            public void d(@j0 androidx.lifecycle.l lVar, @j0 i.b bVar) {
                View view;
                if (bVar != i.b.ON_STOP || (view = Fragment.this.I) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.X.c(bundle);
        H0(bundle);
        this.R = true;
        if (this.G) {
            this.T.j(i.b.ON_CREATE);
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public void m2(l lVar) {
        g();
        i iVar = this.L;
        l lVar2 = iVar.f3674x;
        if (lVar == lVar2) {
            return;
        }
        if (lVar != null && lVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (iVar.f3673w) {
            iVar.f3674x = lVar;
        }
        if (lVar != null) {
            lVar.b();
        }
    }

    @Override // androidx.lifecycle.b0
    @j0
    public androidx.lifecycle.a0 n() {
        if (this.f3626t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (I() != i.c.INITIALIZED.ordinal()) {
            return this.f3626t.O0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public final boolean n0() {
        return this.f3627u != null && this.f3619m;
    }

    public boolean n1(@j0 Menu menu, @j0 MenuInflater menuInflater) {
        boolean z3 = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            K0(menu, menuInflater);
            z3 = true;
        }
        return z3 | this.f3628v.I(menu, menuInflater);
    }

    public void n2(boolean z3) {
        if (this.L == null) {
            return;
        }
        g().f3653c = z3;
    }

    @Override // androidx.activity.result.b
    @g0
    @j0
    public final <I, O> androidx.activity.result.c<I> o(@j0 b.a<I, O> aVar, @j0 androidx.activity.result.a<O> aVar2) {
        return I1(aVar, new e(), aVar2);
    }

    public final boolean o0() {
        return this.B;
    }

    public void o1(@j0 LayoutInflater layoutInflater, @k0 ViewGroup viewGroup, @k0 Bundle bundle) {
        this.f3628v.h1();
        this.f3624r = true;
        this.U = new z(this, n());
        View viewL0 = L0(layoutInflater, viewGroup, bundle);
        this.I = viewL0;
        if (viewL0 == null) {
            if (this.U.f()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.U = null;
        } else {
            this.U.c();
            androidx.lifecycle.c0.b(this.I, this.U);
            androidx.lifecycle.d0.b(this.I, this.U);
            androidx.savedstate.d.b(this.I, this.U);
            this.V.q(this.U);
        }
    }

    public void o2(float f4) {
        g().f3671u = f4;
    }

    @Override // android.content.ComponentCallbacks
    @c.i
    public void onConfigurationChanged(@j0 Configuration configuration) {
        this.G = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @g0
    public void onCreateContextMenu(@j0 ContextMenu contextMenu, @j0 View view, @k0 ContextMenu.ContextMenuInfo contextMenuInfo) {
        M1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    @g0
    @c.i
    public void onLowMemory() {
        this.G = true;
    }

    public View p() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        return iVar.f3651a;
    }

    public final boolean p0() {
        return this.A;
    }

    public void p1() {
        this.f3628v.J();
        this.T.j(i.b.ON_DESTROY);
        this.f3608b = 0;
        this.G = false;
        this.R = false;
        M0();
        if (this.G) {
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void p2(@k0 Object obj) {
        g().f3664n = obj;
    }

    public Animator q() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        return iVar.f3652b;
    }

    public boolean q0() {
        i iVar = this.L;
        if (iVar == null) {
            return false;
        }
        return iVar.f3675y;
    }

    public void q1() {
        this.f3628v.K();
        if (this.I != null && this.U.a().b().a(i.c.CREATED)) {
            this.U.b(i.b.ON_DESTROY);
        }
        this.f3608b = 1;
        this.G = false;
        O0();
        if (this.G) {
            n1.a.d(this).h();
            this.f3624r = false;
        } else {
            throw new e0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    @Deprecated
    public void q2(boolean z3) {
        this.C = z3;
        FragmentManager fragmentManager = this.f3626t;
        if (fragmentManager == null) {
            this.D = true;
        } else if (z3) {
            fragmentManager.n(this);
        } else {
            fragmentManager.B1(this);
        }
    }

    @Override // androidx.lifecycle.h
    @j0
    public z.b r() {
        Application application;
        if (this.f3626t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.W == null) {
            Context applicationContext = O1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.T0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + O1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.W = new androidx.lifecycle.w(application, this, s());
        }
        return this.W;
    }

    public final boolean r0() {
        return this.f3625s > 0;
    }

    public void r1() {
        this.f3608b = -1;
        this.G = false;
        P0();
        this.Q = null;
        if (this.G) {
            if (this.f3628v.S0()) {
                return;
            }
            this.f3628v.J();
            this.f3628v = new androidx.fragment.app.k();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onDetach()");
    }

    public void r2(@k0 Object obj) {
        g().f3662l = obj;
    }

    @k0
    public final Bundle s() {
        return this.f3614h;
    }

    public final boolean s0() {
        return this.f3622p;
    }

    @j0
    public LayoutInflater s1(@k0 Bundle bundle) {
        LayoutInflater layoutInflaterQ0 = Q0(bundle);
        this.Q = layoutInflaterQ0;
        return layoutInflaterQ0;
    }

    public void s2(@k0 Object obj) {
        g().f3665o = obj;
    }

    @j0
    public final FragmentManager t() {
        if (this.f3627u != null) {
            return this.f3628v;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public final boolean t0() {
        FragmentManager fragmentManager;
        return this.F && ((fragmentManager = this.f3626t) == null || fragmentManager.V0(this.f3629w));
    }

    public void t1() {
        onLowMemory();
        this.f3628v.L();
    }

    public void t2(@k0 ArrayList<String> arrayList, @k0 ArrayList<String> arrayList2) {
        g();
        i iVar = this.L;
        iVar.f3659i = arrayList;
        iVar.f3660j = arrayList2;
    }

    @j0
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f3613g);
        if (this.f3630x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3630x));
        }
        if (this.f3632z != null) {
            sb.append(" tag=");
            sb.append(this.f3632z);
        }
        sb.append(")");
        return sb.toString();
    }

    @k0
    public Context u() {
        androidx.fragment.app.h<?> hVar = this.f3627u;
        if (hVar == null) {
            return null;
        }
        return hVar.j();
    }

    public boolean u0() {
        i iVar = this.L;
        if (iVar == null) {
            return false;
        }
        return iVar.f3673w;
    }

    public void u1(boolean z3) {
        U0(z3);
        this.f3628v.M(z3);
    }

    public void u2(@k0 Object obj) {
        g().f3666p = obj;
    }

    public int v() {
        i iVar = this.L;
        if (iVar == null) {
            return 0;
        }
        return iVar.f3654d;
    }

    public final boolean v0() {
        return this.f3620n;
    }

    public boolean v1(@j0 MenuItem menuItem) {
        if (this.A) {
            return false;
        }
        if (this.E && this.F && V0(menuItem)) {
            return true;
        }
        return this.f3628v.O(menuItem);
    }

    @Deprecated
    public void v2(@k0 Fragment fragment, int i4) {
        FragmentManager fragmentManager = this.f3626t;
        FragmentManager fragmentManager2 = fragment != null ? fragment.f3626t : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragmentB0 = fragment; fragmentB0 != null; fragmentB0 = fragmentB0.b0()) {
            if (fragmentB0.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.f3616j = null;
        } else {
            if (this.f3626t == null || fragment.f3626t == null) {
                this.f3616j = null;
                this.f3615i = fragment;
                this.f3617k = i4;
            }
            this.f3616j = fragment.f3613g;
        }
        this.f3615i = null;
        this.f3617k = i4;
    }

    @k0
    public Object w() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        return iVar.f3661k;
    }

    public final boolean w0() {
        Fragment fragmentK = K();
        return fragmentK != null && (fragmentK.v0() || fragmentK.w0());
    }

    public void w1(@j0 Menu menu) {
        if (this.A) {
            return;
        }
        if (this.E && this.F) {
            W0(menu);
        }
        this.f3628v.P(menu);
    }

    @Deprecated
    public void w2(boolean z3) {
        if (!this.K && z3 && this.f3608b < 5 && this.f3626t != null && n0() && this.R) {
            FragmentManager fragmentManager = this.f3626t;
            fragmentManager.k1(fragmentManager.A(this));
        }
        this.K = z3;
        this.J = this.f3608b < 5 && !z3;
        if (this.f3609c != null) {
            this.f3612f = Boolean.valueOf(z3);
        }
    }

    public o4 x() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        return iVar.f3669s;
    }

    public final boolean x0() {
        return this.f3608b >= 7;
    }

    public void x1() {
        this.f3628v.R();
        if (this.I != null) {
            this.U.b(i.b.ON_PAUSE);
        }
        this.T.j(i.b.ON_PAUSE);
        this.f3608b = 6;
        this.G = false;
        X0();
        if (this.G) {
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onPause()");
    }

    public boolean x2(@j0 String str) {
        androidx.fragment.app.h<?> hVar = this.f3627u;
        if (hVar != null) {
            return hVar.t(str);
        }
        return false;
    }

    public int y() {
        i iVar = this.L;
        if (iVar == null) {
            return 0;
        }
        return iVar.f3655e;
    }

    public final boolean y0() {
        FragmentManager fragmentManager = this.f3626t;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.Y0();
    }

    public void y1(boolean z3) {
        Y0(z3);
        this.f3628v.S(z3);
    }

    public void y2(@SuppressLint({"UnknownNullness"}) Intent intent) {
        z2(intent, null);
    }

    @k0
    public Object z() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        return iVar.f3663m;
    }

    public final boolean z0() {
        View view;
        return (!n0() || p0() || (view = this.I) == null || view.getWindowToken() == null || this.I.getVisibility() != 0) ? false : true;
    }

    public boolean z1(@j0 Menu menu) {
        boolean z3 = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            Z0(menu);
            z3 = true;
        }
        return z3 | this.f3628v.T(menu);
    }

    public void z2(@SuppressLint({"UnknownNullness"}) Intent intent, @k0 Bundle bundle) {
        androidx.fragment.app.h<?> hVar = this.f3627u;
        if (hVar != null) {
            hVar.v(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @c.o
    public Fragment(@c.e0 int i4) {
        this();
        this.Y = i4;
    }
}
