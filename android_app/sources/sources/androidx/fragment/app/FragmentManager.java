package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.v;
import androidx.fragment.app.w;
import androidx.lifecycle.i;
import b.b;
import c.g0;
import c.j0;
import c.k0;
import c.r0;
import c.u0;
import e1.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager implements androidx.fragment.app.q {
    public static boolean O = false;
    public static final String P = "FragmentManager";
    public static boolean Q = true;
    public static final int R = 1;
    public static final String S = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    public androidx.activity.result.c<IntentSenderRequest> A;
    public androidx.activity.result.c<String[]> B;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList<androidx.fragment.app.a> I;
    public ArrayList<Boolean> J;
    public ArrayList<Fragment> K;
    public ArrayList<r> L;
    public androidx.fragment.app.m M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3690b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<androidx.fragment.app.a> f3692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<Fragment> f3693e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OnBackPressedDispatcher f3695g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<o> f3700l;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.fragment.app.h<?> f3706r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public androidx.fragment.app.e f3707s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Fragment f3708t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @k0
    public Fragment f3709u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public androidx.activity.result.c<Intent> f3714z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<p> f3689a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f3691c = new u();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.fragment.app.i f3694f = new androidx.fragment.app.i(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.activity.b f3696h = new c(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f3697i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<String, Bundle> f3698j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map<String, n> f3699k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Map<Fragment, HashSet<p0.b>> f3701m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w.g f3702n = new d();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.fragment.app.j f3703o = new androidx.fragment.app.j(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList<androidx.fragment.app.n> f3704p = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3705q = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.fragment.app.g f3710v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public androidx.fragment.app.g f3711w = new e();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d0 f3712x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d0 f3713y = new f();
    public ArrayDeque<LaunchedFragmentInfo> C = new ArrayDeque<>();
    public Runnable N = new g();

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3720b;

        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i4) {
                return new LaunchedFragmentInfo[i4];
            }
        }

        public LaunchedFragmentInfo(@j0 Parcel parcel) {
            this.f3719a = parcel.readString();
            this.f3720b = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeString(this.f3719a);
            parcel.writeInt(this.f3720b);
        }

        public LaunchedFragmentInfo(@j0 String str, int i4) {
            this.f3719a = str;
            this.f3720b = i4;
        }
    }

    public class a implements androidx.activity.result.a<ActivityResult> {
        public a() {
        }

        @Override // androidx.activity.result.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.C.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f3719a;
            int i4 = launchedFragmentInfoPollFirst.f3720b;
            Fragment fragmentI = FragmentManager.this.f3691c.i(str);
            if (fragmentI != null) {
                fragmentI.C0(i4, activityResult.b(), activityResult.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public class b implements androidx.activity.result.a<Map<String, Boolean>> {
        public b() {
        }

        @Override // androidx.activity.result.a
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            StringBuilder sb;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                iArr[i4] = ((Boolean) arrayList.get(i4)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.C.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                String str = launchedFragmentInfoPollFirst.f3719a;
                int i5 = launchedFragmentInfoPollFirst.f3720b;
                Fragment fragmentI = FragmentManager.this.f3691c.i(str);
                if (fragmentI != null) {
                    fragmentI.b1(i5, strArr, iArr);
                    return;
                } else {
                    sb = new StringBuilder();
                    sb.append("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    public class c extends androidx.activity.b {
        public c(boolean z3) {
            super(z3);
        }

        @Override // androidx.activity.b
        public void b() {
            FragmentManager.this.P0();
        }
    }

    public class d implements w.g {
        public d() {
        }

        @Override // androidx.fragment.app.w.g
        public void a(@j0 Fragment fragment, @j0 p0.b bVar) {
            if (bVar.c()) {
                return;
            }
            FragmentManager.this.w1(fragment, bVar);
        }

        @Override // androidx.fragment.app.w.g
        public void b(@j0 Fragment fragment, @j0 p0.b bVar) {
            FragmentManager.this.j(fragment, bVar);
        }
    }

    public class e extends androidx.fragment.app.g {
        public e() {
        }

        @Override // androidx.fragment.app.g
        @j0
        public Fragment a(@j0 ClassLoader classLoader, @j0 String str) {
            return FragmentManager.this.H0().c(FragmentManager.this.H0().j(), str, null);
        }
    }

    public class f implements d0 {
        public f() {
        }

        @Override // androidx.fragment.app.d0
        @j0
        public c0 a(@j0 ViewGroup viewGroup) {
            return new androidx.fragment.app.b(viewGroup);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.h0(true);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f3729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Fragment f3730c;

        public h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f3728a = viewGroup;
            this.f3729b = view;
            this.f3730c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3728a.endViewTransition(this.f3729b);
            animator.removeListener(this);
            Fragment fragment = this.f3730c;
            View view = fragment.I;
            if (view == null || !fragment.A) {
                return;
            }
            view.setVisibility(8);
        }
    }

    public class i implements androidx.fragment.app.n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f3732b;

        public i(Fragment fragment) {
            this.f3732b = fragment;
        }

        @Override // androidx.fragment.app.n
        public void b(@j0 FragmentManager fragmentManager, @j0 Fragment fragment) {
            this.f3732b.F0(fragment);
        }
    }

    public class j implements androidx.activity.result.a<ActivityResult> {
        public j() {
        }

        @Override // androidx.activity.result.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.C.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f3719a;
            int i4 = launchedFragmentInfoPollFirst.f3720b;
            Fragment fragmentI = FragmentManager.this.f3691c.i(str);
            if (fragmentI != null) {
                fragmentI.C0(i4, activityResult.b(), activityResult.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    public interface k {
        int a();

        @k0
        @Deprecated
        CharSequence c();

        @u0
        @Deprecated
        int d();

        @u0
        @Deprecated
        int e();

        @k0
        @Deprecated
        CharSequence f();

        @k0
        String getName();
    }

    public static class l extends b.a<IntentSenderRequest, ActivityResult> {
        @Override // b.a
        @j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@j0 Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent(b.k.f4323a);
            Intent intentA = intentSenderRequest.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra(b.j.f4322a)) != null) {
                intent.putExtra(b.j.f4322a, bundleExtra);
                intentA.removeExtra(b.j.f4322a);
                if (intentA.getBooleanExtra(FragmentManager.S, false)) {
                    intentSenderRequest = new IntentSenderRequest.b(intentSenderRequest.d()).b(null).c(intentSenderRequest.c(), intentSenderRequest.b()).a();
                }
            }
            intent.putExtra(b.k.f4324b, intentSenderRequest);
            if (FragmentManager.T0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // b.a
        @j0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult c(int i4, @k0 Intent intent) {
            return new ActivityResult(i4, intent);
        }
    }

    public static abstract class m {
        @Deprecated
        public void a(@j0 FragmentManager fragmentManager, @j0 Fragment fragment, @k0 Bundle bundle) {
        }

        public void b(@j0 FragmentManager fragmentManager, @j0 Fragment fragment, @j0 Context context) {
        }

        public void c(@j0 FragmentManager fragmentManager, @j0 Fragment fragment, @k0 Bundle bundle) {
        }

        public void d(@j0 FragmentManager fragmentManager, @j0 Fragment fragment) {
        }

        public void e(@j0 FragmentManager fragmentManager, @j0 Fragment fragment) {
        }

        public void f(@j0 FragmentManager fragmentManager, @j0 Fragment fragment) {
        }

        public void g(@j0 FragmentManager fragmentManager, @j0 Fragment fragment, @j0 Context context) {
        }

        public void h(@j0 FragmentManager fragmentManager, @j0 Fragment fragment, @k0 Bundle bundle) {
        }

        public void i(@j0 FragmentManager fragmentManager, @j0 Fragment fragment) {
        }

        public void j(@j0 FragmentManager fragmentManager, @j0 Fragment fragment, @j0 Bundle bundle) {
        }

        public void k(@j0 FragmentManager fragmentManager, @j0 Fragment fragment) {
        }

        public void l(@j0 FragmentManager fragmentManager, @j0 Fragment fragment) {
        }

        public void m(@j0 FragmentManager fragmentManager, @j0 Fragment fragment, @j0 View view, @k0 Bundle bundle) {
        }

        public void n(@j0 FragmentManager fragmentManager, @j0 Fragment fragment) {
        }
    }

    public static class n implements androidx.fragment.app.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.lifecycle.i f3735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.fragment.app.p f3736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.lifecycle.j f3737c;

        public n(@j0 androidx.lifecycle.i iVar, @j0 androidx.fragment.app.p pVar, @j0 androidx.lifecycle.j jVar) {
            this.f3735a = iVar;
            this.f3736b = pVar;
            this.f3737c = jVar;
        }

        @Override // androidx.fragment.app.p
        public void a(@j0 String str, @j0 Bundle bundle) {
            this.f3736b.a(str, bundle);
        }

        public boolean b(i.c cVar) {
            return this.f3735a.b().a(cVar);
        }

        public void c() {
            this.f3735a.c(this.f3737c);
        }
    }

    public interface o {
        @g0
        void a();
    }

    public interface p {
        boolean b(@j0 ArrayList<androidx.fragment.app.a> arrayList, @j0 ArrayList<Boolean> arrayList2);
    }

    public class q implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3740c;

        public q(@k0 String str, int i4, int i5) {
            this.f3738a = str;
            this.f3739b = i4;
            this.f3740c = i5;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public boolean b(@j0 ArrayList<androidx.fragment.app.a> arrayList, @j0 ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f3709u;
            if (fragment == null || this.f3739b >= 0 || this.f3738a != null || !fragment.t().o1()) {
                return FragmentManager.this.s1(arrayList, arrayList2, this.f3738a, this.f3739b, this.f3740c);
            }
            return false;
        }
    }

    public static class r implements Fragment.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.fragment.app.a f3743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3744c;

        public r(@j0 androidx.fragment.app.a aVar, boolean z3) {
            this.f3742a = z3;
            this.f3743b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.l
        public void a() {
            int i4 = this.f3744c - 1;
            this.f3744c = i4;
            if (i4 != 0) {
                return;
            }
            this.f3743b.L.J1();
        }

        @Override // androidx.fragment.app.Fragment.l
        public void b() {
            this.f3744c++;
        }

        public void c() {
            androidx.fragment.app.a aVar = this.f3743b;
            aVar.L.y(aVar, this.f3742a, false, false);
        }

        public void d() {
            boolean z3 = this.f3744c > 0;
            for (Fragment fragment : this.f3743b.L.G0()) {
                fragment.m2(null);
                if (z3 && fragment.u0()) {
                    fragment.D2();
                }
            }
            androidx.fragment.app.a aVar = this.f3743b;
            aVar.L.y(aVar, this.f3742a, !z3, true);
        }

        public boolean e() {
            return this.f3744c == 0;
        }
    }

    public static int G1(int i4) {
        if (i4 != 4097) {
            return i4 != 4099 ? i4 != 8194 ? 0 : 4097 : v.K;
        }
        return 8194;
    }

    @k0
    public static Fragment N0(@j0 View view) {
        Object tag = view.getTag(a.g.R);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean T0(int i4) {
        return O || Log.isLoggable("FragmentManager", i4);
    }

    @Deprecated
    public static void c0(boolean z3) {
        O = z3;
    }

    @s
    public static void d0(boolean z3) {
        Q = z3;
    }

    public static void j0(@j0 ArrayList<androidx.fragment.app.a> arrayList, @j0 ArrayList<Boolean> arrayList2, int i4, int i5) {
        while (i4 < i5) {
            androidx.fragment.app.a aVar = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                aVar.V(-1);
                aVar.a0(i4 == i5 + (-1));
            } else {
                aVar.V(1);
                aVar.Z();
            }
            i4++;
        }
    }

    @j0
    public static <F extends Fragment> F o0(@j0 View view) {
        F f4 = (F) t0(view);
        if (f4 != null) {
            return f4;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    @j0
    public static FragmentManager s0(@j0 View view) {
        FragmentActivity fragmentActivity;
        Fragment fragmentT0 = t0(view);
        if (fragmentT0 != null) {
            if (fragmentT0.n0()) {
                return fragmentT0.t();
            }
            throw new IllegalStateException("The Fragment " + fragmentT0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                fragmentActivity = null;
                break;
            }
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (fragmentActivity != null) {
            return fragmentActivity.A();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    @k0
    public static Fragment t0(@j0 View view) {
        while (view != null) {
            Fragment fragmentN0 = N0(view);
            if (fragmentN0 != null) {
                return fragmentN0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @j0
    public androidx.fragment.app.r A(@j0 Fragment fragment) {
        androidx.fragment.app.r rVarN = this.f3691c.n(fragment.f3613g);
        if (rVarN != null) {
            return rVarN;
        }
        androidx.fragment.app.r rVar = new androidx.fragment.app.r(this.f3703o, this.f3691c, fragment);
        rVar.o(this.f3706r.j().getClassLoader());
        rVar.u(this.f3705q);
        return rVar;
    }

    @j0
    public final androidx.fragment.app.m A0(@j0 Fragment fragment) {
        return this.M.i(fragment);
    }

    public final void A1(@j0 ArrayList<androidx.fragment.app.a> arrayList, @j0 ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m0(arrayList, arrayList2);
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            if (!arrayList.get(i4).f3997r) {
                if (i5 != i4) {
                    k0(arrayList, arrayList2, i5, i4);
                }
                i5 = i4 + 1;
                if (arrayList2.get(i4).booleanValue()) {
                    while (i5 < size && arrayList2.get(i5).booleanValue() && !arrayList.get(i5).f3997r) {
                        i5++;
                    }
                }
                k0(arrayList, arrayList2, i4, i5);
                i4 = i5 - 1;
            }
            i4++;
        }
        if (i5 != size) {
            k0(arrayList, arrayList2, i5, size);
        }
    }

    public final void B(@j0 Fragment fragment) {
        fragment.q1();
        this.f3703o.n(fragment, false);
        fragment.H = null;
        fragment.I = null;
        fragment.U = null;
        fragment.V.q(null);
        fragment.f3622p = false;
    }

    @j0
    public androidx.fragment.app.e B0() {
        return this.f3707s;
    }

    public void B1(@j0 Fragment fragment) {
        this.M.o(fragment);
    }

    public void C(@j0 Fragment fragment) {
        if (T0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.B) {
            return;
        }
        fragment.B = true;
        if (fragment.f3619m) {
            if (T0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f3691c.t(fragment);
            if (U0(fragment)) {
                this.D = true;
            }
            P1(fragment);
        }
    }

    @k0
    public Fragment C0(@j0 Bundle bundle, @j0 String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentN0 = n0(string);
        if (fragmentN0 == null) {
            S1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentN0;
    }

    public final void C1() {
        if (this.f3700l != null) {
            for (int i4 = 0; i4 < this.f3700l.size(); i4++) {
                this.f3700l.get(i4).a();
            }
        }
    }

    public void D() {
        this.E = false;
        this.F = false;
        this.M.q(false);
        X(4);
    }

    public final ViewGroup D0(@j0 Fragment fragment) {
        ViewGroup viewGroup = fragment.H;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f3631y > 0 && this.f3707s.g()) {
            View viewF = this.f3707s.f(fragment.f3631y);
            if (viewF instanceof ViewGroup) {
                return (ViewGroup) viewF;
            }
        }
        return null;
    }

    public void D1(@k0 Parcelable parcelable, @k0 androidx.fragment.app.l lVar) {
        if (this.f3706r instanceof androidx.lifecycle.b0) {
            S1(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.M.p(lVar);
        E1(parcelable);
    }

    public void E() {
        this.E = false;
        this.F = false;
        this.M.q(false);
        X(0);
    }

    @j0
    public androidx.fragment.app.g E0() {
        androidx.fragment.app.g gVar = this.f3710v;
        if (gVar != null) {
            return gVar;
        }
        Fragment fragment = this.f3708t;
        return fragment != null ? fragment.f3626t.E0() : this.f3711w;
    }

    public void E1(@k0 Parcelable parcelable) {
        androidx.fragment.app.r rVar;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f3745a == null) {
            return;
        }
        this.f3691c.u();
        for (FragmentState fragmentState : fragmentManagerState.f3745a) {
            if (fragmentState != null) {
                Fragment fragmentH = this.M.h(fragmentState.f3754b);
                if (fragmentH != null) {
                    if (T0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentH);
                    }
                    rVar = new androidx.fragment.app.r(this.f3703o, this.f3691c, fragmentH, fragmentState);
                } else {
                    rVar = new androidx.fragment.app.r(this.f3703o, this.f3691c, this.f3706r.j().getClassLoader(), E0(), fragmentState);
                }
                Fragment fragmentK = rVar.k();
                fragmentK.f3626t = this;
                if (T0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentK.f3613g + "): " + fragmentK);
                }
                rVar.o(this.f3706r.j().getClassLoader());
                this.f3691c.q(rVar);
                rVar.u(this.f3705q);
            }
        }
        for (Fragment fragment : this.M.k()) {
            if (!this.f3691c.c(fragment.f3613g)) {
                if (T0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f3745a);
                }
                this.M.o(fragment);
                fragment.f3626t = this;
                androidx.fragment.app.r rVar2 = new androidx.fragment.app.r(this.f3703o, this.f3691c, fragment);
                rVar2.u(1);
                rVar2.m();
                fragment.f3620n = true;
                rVar2.m();
            }
        }
        this.f3691c.v(fragmentManagerState.f3746b);
        if (fragmentManagerState.f3747c != null) {
            this.f3692d = new ArrayList<>(fragmentManagerState.f3747c.length);
            int i4 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f3747c;
                if (i4 >= backStackStateArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarA = backStackStateArr[i4].a(this);
                if (T0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i4 + " (index " + aVarA.N + "): " + aVarA);
                    PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
                    aVarA.Y("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3692d.add(aVarA);
                i4++;
            }
        } else {
            this.f3692d = null;
        }
        this.f3697i.set(fragmentManagerState.f3748d);
        String str = fragmentManagerState.f3749e;
        if (str != null) {
            Fragment fragmentN0 = n0(str);
            this.f3709u = fragmentN0;
            Q(fragmentN0);
        }
        ArrayList<String> arrayList = fragmentManagerState.f3750f;
        if (arrayList != null) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                Bundle bundle = fragmentManagerState.f3751g.get(i5);
                bundle.setClassLoader(this.f3706r.j().getClassLoader());
                this.f3698j.put(arrayList.get(i5), bundle);
            }
        }
        this.C = new ArrayDeque<>(fragmentManagerState.f3752h);
    }

    public void F(@j0 Configuration configuration) {
        for (Fragment fragment : this.f3691c.o()) {
            if (fragment != null) {
                fragment.k1(configuration);
            }
        }
    }

    @j0
    public u F0() {
        return this.f3691c;
    }

    @Deprecated
    public androidx.fragment.app.l F1() {
        if (this.f3706r instanceof androidx.lifecycle.b0) {
            S1(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.M.l();
    }

    public boolean G(@j0 MenuItem menuItem) {
        if (this.f3705q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3691c.o()) {
            if (fragment != null && fragment.l1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @j0
    public List<Fragment> G0() {
        return this.f3691c.o();
    }

    public void H() {
        this.E = false;
        this.F = false;
        this.M.q(false);
        X(1);
    }

    @j0
    public androidx.fragment.app.h<?> H0() {
        return this.f3706r;
    }

    public Parcelable H1() {
        int size;
        u0();
        e0();
        h0(true);
        this.E = true;
        this.M.q(true);
        ArrayList<FragmentState> arrayListW = this.f3691c.w();
        BackStackState[] backStackStateArr = null;
        if (arrayListW.isEmpty()) {
            if (T0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> arrayListX = this.f3691c.x();
        ArrayList<androidx.fragment.app.a> arrayList = this.f3692d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i4 = 0; i4 < size; i4++) {
                backStackStateArr[i4] = new BackStackState(this.f3692d.get(i4));
                if (T0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.f3692d.get(i4));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f3745a = arrayListW;
        fragmentManagerState.f3746b = arrayListX;
        fragmentManagerState.f3747c = backStackStateArr;
        fragmentManagerState.f3748d = this.f3697i.get();
        Fragment fragment = this.f3709u;
        if (fragment != null) {
            fragmentManagerState.f3749e = fragment.f3613g;
        }
        fragmentManagerState.f3750f.addAll(this.f3698j.keySet());
        fragmentManagerState.f3751g.addAll(this.f3698j.values());
        fragmentManagerState.f3752h = new ArrayList<>(this.C);
        return fragmentManagerState;
    }

    public boolean I(@j0 Menu menu, @j0 MenuInflater menuInflater) {
        if (this.f3705q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z3 = false;
        for (Fragment fragment : this.f3691c.o()) {
            if (fragment != null && V0(fragment) && fragment.n1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z3 = true;
            }
        }
        if (this.f3693e != null) {
            for (int i4 = 0; i4 < this.f3693e.size(); i4++) {
                Fragment fragment2 = this.f3693e.get(i4);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.N0();
                }
            }
        }
        this.f3693e = arrayList;
        return z3;
    }

    @j0
    public LayoutInflater.Factory2 I0() {
        return this.f3694f;
    }

    @k0
    public Fragment.SavedState I1(@j0 Fragment fragment) {
        androidx.fragment.app.r rVarN = this.f3691c.n(fragment.f3613g);
        if (rVarN == null || !rVarN.k().equals(fragment)) {
            S1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return rVarN.r();
    }

    public void J() {
        this.G = true;
        h0(true);
        e0();
        X(-1);
        this.f3706r = null;
        this.f3707s = null;
        this.f3708t = null;
        if (this.f3695g != null) {
            this.f3696h.d();
            this.f3695g = null;
        }
        androidx.activity.result.c<Intent> cVar = this.f3714z;
        if (cVar != null) {
            cVar.d();
            this.A.d();
            this.B.d();
        }
    }

    @j0
    public androidx.fragment.app.j J0() {
        return this.f3703o;
    }

    public void J1() {
        synchronized (this.f3689a) {
            ArrayList<r> arrayList = this.L;
            boolean z3 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z4 = this.f3689a.size() == 1;
            if (z3 || z4) {
                this.f3706r.k().removeCallbacks(this.N);
                this.f3706r.k().post(this.N);
                U1();
            }
        }
    }

    public void K() {
        X(1);
    }

    @k0
    public Fragment K0() {
        return this.f3708t;
    }

    public void K1(@j0 Fragment fragment, boolean z3) {
        ViewGroup viewGroupD0 = D0(fragment);
        if (viewGroupD0 == null || !(viewGroupD0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupD0).setDrawDisappearingViewsLast(!z3);
    }

    public void L() {
        for (Fragment fragment : this.f3691c.o()) {
            if (fragment != null) {
                fragment.t1();
            }
        }
    }

    @k0
    public Fragment L0() {
        return this.f3709u;
    }

    public void L1(@j0 androidx.fragment.app.g gVar) {
        this.f3710v = gVar;
    }

    public void M(boolean z3) {
        for (Fragment fragment : this.f3691c.o()) {
            if (fragment != null) {
                fragment.u1(z3);
            }
        }
    }

    @j0
    public d0 M0() {
        d0 d0Var = this.f3712x;
        if (d0Var != null) {
            return d0Var;
        }
        Fragment fragment = this.f3708t;
        return fragment != null ? fragment.f3626t.M0() : this.f3713y;
    }

    public void M1(@j0 Fragment fragment, @j0 i.c cVar) {
        if (fragment.equals(n0(fragment.f3613g)) && (fragment.f3627u == null || fragment.f3626t == this)) {
            fragment.S = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void N(@j0 Fragment fragment) {
        Iterator<androidx.fragment.app.n> it = this.f3704p.iterator();
        while (it.hasNext()) {
            it.next().b(this, fragment);
        }
    }

    public void N1(@k0 Fragment fragment) {
        if (fragment == null || (fragment.equals(n0(fragment.f3613g)) && (fragment.f3627u == null || fragment.f3626t == this))) {
            Fragment fragment2 = this.f3709u;
            this.f3709u = fragment;
            Q(fragment2);
            Q(this.f3709u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public boolean O(@j0 MenuItem menuItem) {
        if (this.f3705q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3691c.o()) {
            if (fragment != null && fragment.v1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @j0
    public androidx.lifecycle.a0 O0(@j0 Fragment fragment) {
        return this.M.m(fragment);
    }

    public void O1(@j0 d0 d0Var) {
        this.f3712x = d0Var;
    }

    public void P(@j0 Menu menu) {
        if (this.f3705q < 1) {
            return;
        }
        for (Fragment fragment : this.f3691c.o()) {
            if (fragment != null) {
                fragment.w1(menu);
            }
        }
    }

    public void P0() {
        h0(true);
        if (this.f3696h.c()) {
            o1();
        } else {
            this.f3695g.e();
        }
    }

    public final void P1(@j0 Fragment fragment) {
        ViewGroup viewGroupD0 = D0(fragment);
        if (viewGroupD0 == null || fragment.v() + fragment.y() + fragment.N() + fragment.O() <= 0) {
            return;
        }
        int i4 = a.g.f7570u0;
        if (viewGroupD0.getTag(i4) == null) {
            viewGroupD0.setTag(i4, fragment);
        }
        ((Fragment) viewGroupD0.getTag(i4)).n2(fragment.M());
    }

    public final void Q(@k0 Fragment fragment) {
        if (fragment == null || !fragment.equals(n0(fragment.f3613g))) {
            return;
        }
        fragment.A1();
    }

    public void Q0(@j0 Fragment fragment) {
        if (T0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.A) {
            return;
        }
        fragment.A = true;
        fragment.O = true ^ fragment.O;
        P1(fragment);
    }

    public void Q1(@j0 Fragment fragment) {
        if (T0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            fragment.O = !fragment.O;
        }
    }

    public void R() {
        X(5);
    }

    public void R0(@j0 Fragment fragment) {
        if (fragment.f3619m && U0(fragment)) {
            this.D = true;
        }
    }

    public final void R1() {
        Iterator<androidx.fragment.app.r> it = this.f3691c.l().iterator();
        while (it.hasNext()) {
            k1(it.next());
        }
    }

    public void S(boolean z3) {
        for (Fragment fragment : this.f3691c.o()) {
            if (fragment != null) {
                fragment.y1(z3);
            }
        }
    }

    public boolean S0() {
        return this.G;
    }

    public final void S1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
        androidx.fragment.app.h<?> hVar = this.f3706r;
        try {
            if (hVar != null) {
                hVar.l("  ", null, printWriter, new String[0]);
            } else {
                b0("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e4) {
            Log.e("FragmentManager", "Failed dumping state", e4);
            throw runtimeException;
        }
    }

    public boolean T(@j0 Menu menu) {
        boolean z3 = false;
        if (this.f3705q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3691c.o()) {
            if (fragment != null && V0(fragment) && fragment.z1(menu)) {
                z3 = true;
            }
        }
        return z3;
    }

    public void T1(@j0 m mVar) {
        this.f3703o.p(mVar);
    }

    public void U() {
        U1();
        Q(this.f3709u);
    }

    public final boolean U0(@j0 Fragment fragment) {
        return (fragment.E && fragment.F) || fragment.f3628v.t();
    }

    public final void U1() {
        synchronized (this.f3689a) {
            if (this.f3689a.isEmpty()) {
                this.f3696h.f(z0() > 0 && W0(this.f3708t));
            } else {
                this.f3696h.f(true);
            }
        }
    }

    public void V() {
        this.E = false;
        this.F = false;
        this.M.q(false);
        X(7);
    }

    public boolean V0(@k0 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.t0();
    }

    public void W() {
        this.E = false;
        this.F = false;
        this.M.q(false);
        X(5);
    }

    public boolean W0(@k0 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.f3626t;
        return fragment.equals(fragmentManager.L0()) && W0(fragmentManager.f3708t);
    }

    public final void X(int i4) {
        try {
            this.f3690b = true;
            this.f3691c.d(i4);
            e1(i4, false);
            if (Q) {
                Iterator<c0> it = w().iterator();
                while (it.hasNext()) {
                    it.next().j();
                }
            }
            this.f3690b = false;
            h0(true);
        } catch (Throwable th) {
            this.f3690b = false;
            throw th;
        }
    }

    public boolean X0(int i4) {
        return this.f3705q >= i4;
    }

    public void Y() {
        this.F = true;
        this.M.q(true);
        X(4);
    }

    public boolean Y0() {
        return this.E || this.F;
    }

    public void Z() {
        X(2);
    }

    public void Z0(@j0 Fragment fragment, @j0 String[] strArr, int i4) {
        if (this.B == null) {
            this.f3706r.r(fragment, strArr, i4);
            return;
        }
        this.C.addLast(new LaunchedFragmentInfo(fragment.f3613g, i4));
        this.B.b(strArr);
    }

    @Override // androidx.fragment.app.q
    public final void a(@j0 String str, @j0 Bundle bundle) {
        n nVar = this.f3699k.get(str);
        if (nVar == null || !nVar.b(i.c.STARTED)) {
            this.f3698j.put(str, bundle);
        } else {
            nVar.a(str, bundle);
        }
    }

    public final void a0() {
        if (this.H) {
            this.H = false;
            R1();
        }
    }

    public void a1(@j0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i4, @k0 Bundle bundle) {
        if (this.f3714z == null) {
            this.f3706r.v(fragment, intent, i4, bundle);
            return;
        }
        this.C.addLast(new LaunchedFragmentInfo(fragment.f3613g, i4));
        if (intent != null && bundle != null) {
            intent.putExtra(b.j.f4322a, bundle);
        }
        this.f3714z.b(intent);
    }

    @Override // androidx.fragment.app.q
    @SuppressLint({"SyntheticAccessor"})
    public final void b(@j0 final String str, @j0 androidx.lifecycle.l lVar, @j0 final androidx.fragment.app.p pVar) {
        final androidx.lifecycle.i iVarA = lVar.a();
        if (iVarA.b() == i.c.DESTROYED) {
            return;
        }
        androidx.lifecycle.j jVar = new androidx.lifecycle.j() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.j
            public void d(@j0 androidx.lifecycle.l lVar2, @j0 i.b bVar) {
                Bundle bundle;
                if (bVar == i.b.ON_START && (bundle = (Bundle) FragmentManager.this.f3698j.get(str)) != null) {
                    pVar.a(str, bundle);
                    FragmentManager.this.d(str);
                }
                if (bVar == i.b.ON_DESTROY) {
                    iVarA.c(this);
                    FragmentManager.this.f3699k.remove(str);
                }
            }
        };
        iVarA.a(jVar);
        n nVarPut = this.f3699k.put(str, new n(iVarA, pVar, jVar));
        if (nVarPut != null) {
            nVarPut.c();
        }
    }

    public void b0(@j0 String str, @k0 FileDescriptor fileDescriptor, @j0 PrintWriter printWriter, @k0 String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3691c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f3693e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size2; i4++) {
                Fragment fragment = this.f3693e.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f3692d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size; i5++) {
                androidx.fragment.app.a aVar = this.f3692d.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.X(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3697i.get());
        synchronized (this.f3689a) {
            int size3 = this.f3689a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i6 = 0; i6 < size3; i6++) {
                    p pVar = this.f3689a.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(pVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3706r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3707s);
        if (this.f3708t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3708t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3705q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public void b1(@j0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, @k0 Intent intent, int i5, int i6, int i7, @k0 Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.A == null) {
            this.f3706r.w(fragment, intentSender, i4, intent, i5, i6, i7, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra(S, true);
            } else {
                intent2 = intent;
            }
            if (T0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
            }
            intent2.putExtra(b.j.f4322a, bundle);
        } else {
            intent2 = intent;
        }
        IntentSenderRequest intentSenderRequestA = new IntentSenderRequest.b(intentSender).b(intent2).c(i6, i5).a();
        this.C.addLast(new LaunchedFragmentInfo(fragment.f3613g, i4));
        if (T0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.A.b(intentSenderRequestA);
    }

    @Override // androidx.fragment.app.q
    public final void c(@j0 String str) {
        n nVarRemove = this.f3699k.remove(str);
        if (nVarRemove != null) {
            nVarRemove.c();
        }
    }

    public final void c1(@j0 p.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragmentJ = bVar.j(i4);
            if (!fragmentJ.f3619m) {
                View viewS1 = fragmentJ.S1();
                fragmentJ.P = viewS1.getAlpha();
                viewS1.setAlpha(0.0f);
            }
        }
    }

    @Override // androidx.fragment.app.q
    public final void d(@j0 String str) {
        this.f3698j.remove(str);
    }

    public void d1(@j0 Fragment fragment) {
        if (!this.f3691c.c(fragment.f3613g)) {
            if (T0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f3705q + "since it is not added to " + this);
                return;
            }
            return;
        }
        f1(fragment);
        View view = fragment.I;
        if (view != null && fragment.N && fragment.H != null) {
            float f4 = fragment.P;
            if (f4 > 0.0f) {
                view.setAlpha(f4);
            }
            fragment.P = 0.0f;
            fragment.N = false;
            d.C0022d c0022dC = androidx.fragment.app.d.c(this.f3706r.j(), fragment, true, fragment.M());
            if (c0022dC != null) {
                Animation animation = c0022dC.f3901a;
                if (animation != null) {
                    fragment.I.startAnimation(animation);
                } else {
                    c0022dC.f3902b.setTarget(fragment.I);
                    c0022dC.f3902b.start();
                }
            }
        }
        if (fragment.O) {
            z(fragment);
        }
    }

    public final void e0() {
        if (Q) {
            Iterator<c0> it = w().iterator();
            while (it.hasNext()) {
                it.next().j();
            }
        } else {
            if (this.f3701m.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f3701m.keySet()) {
                s(fragment);
                f1(fragment);
            }
        }
    }

    public void e1(int i4, boolean z3) {
        androidx.fragment.app.h<?> hVar;
        if (this.f3706r == null && i4 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z3 || i4 != this.f3705q) {
            this.f3705q = i4;
            if (Q) {
                this.f3691c.s();
            } else {
                Iterator<Fragment> it = this.f3691c.o().iterator();
                while (it.hasNext()) {
                    d1(it.next());
                }
                for (androidx.fragment.app.r rVar : this.f3691c.l()) {
                    Fragment fragmentK = rVar.k();
                    if (!fragmentK.N) {
                        d1(fragmentK);
                    }
                    if (fragmentK.f3620n && !fragmentK.r0()) {
                        this.f3691c.r(rVar);
                    }
                }
            }
            R1();
            if (this.D && (hVar = this.f3706r) != null && this.f3705q == 7) {
                hVar.x();
                this.D = false;
            }
        }
    }

    public void f0(@j0 p pVar, boolean z3) {
        if (!z3) {
            if (this.f3706r == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            u();
        }
        synchronized (this.f3689a) {
            if (this.f3706r == null) {
                if (!z3) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f3689a.add(pVar);
                J1();
            }
        }
    }

    public void f1(@j0 Fragment fragment) {
        g1(fragment, this.f3705q);
    }

    public final void g0(boolean z3) {
        if (this.f3690b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f3706r == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f3706r.k().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z3) {
            u();
        }
        if (this.I == null) {
            this.I = new ArrayList<>();
            this.J = new ArrayList<>();
        }
        this.f3690b = true;
        try {
            m0(null, null);
        } finally {
            this.f3690b = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g1(@c.j0 androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.g1(androidx.fragment.app.Fragment, int):void");
    }

    public final void h(@j0 p.b<Fragment> bVar) {
        int i4 = this.f3705q;
        if (i4 < 1) {
            return;
        }
        int iMin = Math.min(i4, 5);
        for (Fragment fragment : this.f3691c.o()) {
            if (fragment.f3608b < iMin) {
                g1(fragment, iMin);
                if (fragment.I != null && !fragment.A && fragment.N) {
                    bVar.add(fragment);
                }
            }
        }
    }

    public boolean h0(boolean z3) {
        g0(z3);
        boolean z4 = false;
        while (v0(this.I, this.J)) {
            z4 = true;
            this.f3690b = true;
            try {
                A1(this.I, this.J);
            } finally {
                v();
            }
        }
        U1();
        a0();
        this.f3691c.b();
        return z4;
    }

    public void h1() {
        if (this.f3706r == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.M.q(false);
        for (Fragment fragment : this.f3691c.o()) {
            if (fragment != null) {
                fragment.A0();
            }
        }
    }

    public void i(androidx.fragment.app.a aVar) {
        if (this.f3692d == null) {
            this.f3692d = new ArrayList<>();
        }
        this.f3692d.add(aVar);
    }

    public void i0(@j0 p pVar, boolean z3) {
        if (z3 && (this.f3706r == null || this.G)) {
            return;
        }
        g0(z3);
        if (pVar.b(this.I, this.J)) {
            this.f3690b = true;
            try {
                A1(this.I, this.J);
            } finally {
                v();
            }
        }
        U1();
        a0();
        this.f3691c.b();
    }

    public void i1(@j0 FragmentContainerView fragmentContainerView) {
        View view;
        for (androidx.fragment.app.r rVar : this.f3691c.l()) {
            Fragment fragmentK = rVar.k();
            if (fragmentK.f3631y == fragmentContainerView.getId() && (view = fragmentK.I) != null && view.getParent() == null) {
                fragmentK.H = fragmentContainerView;
                rVar.b();
            }
        }
    }

    public void j(@j0 Fragment fragment, @j0 p0.b bVar) {
        if (this.f3701m.get(fragment) == null) {
            this.f3701m.put(fragment, new HashSet<>());
        }
        this.f3701m.get(fragment).add(bVar);
    }

    @j0
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public v j1() {
        return r();
    }

    public androidx.fragment.app.r k(@j0 Fragment fragment) {
        if (T0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        androidx.fragment.app.r rVarA = A(fragment);
        fragment.f3626t = this;
        this.f3691c.q(rVarA);
        if (!fragment.B) {
            this.f3691c.a(fragment);
            fragment.f3620n = false;
            if (fragment.I == null) {
                fragment.O = false;
            }
            if (U0(fragment)) {
                this.D = true;
            }
        }
        return rVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [androidx.fragment.app.FragmentManager] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    public final void k0(@j0 ArrayList<androidx.fragment.app.a> arrayList, @j0 ArrayList<Boolean> arrayList2, int i4, int i5) {
        ?? r12;
        ?? r14;
        boolean z3;
        int i6;
        int i7;
        ArrayList<Boolean> arrayList3;
        int iT1;
        ArrayList<Boolean> arrayList4;
        int i8;
        ?? r13;
        boolean z4 = arrayList.get(i4).f3997r;
        ArrayList<Fragment> arrayList5 = this.K;
        if (arrayList5 == null) {
            this.K = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.K.addAll(this.f3691c.o());
        Fragment fragmentL0 = L0();
        boolean z5 = false;
        for (int i9 = i4; i9 < i5; i9++) {
            androidx.fragment.app.a aVar = arrayList.get(i9);
            fragmentL0 = !arrayList2.get(i9).booleanValue() ? aVar.b0(this.K, fragmentL0) : aVar.i0(this.K, fragmentL0);
            z5 = z5 || aVar.f3988i;
        }
        this.K.clear();
        if (z4 || this.f3705q < 1) {
            r12 = 1;
        } else if (Q) {
            for (int i10 = i4; i10 < i5; i10++) {
                Iterator<v.a> it = arrayList.get(i10).f3982c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f4000b;
                    if (fragment != null && fragment.f3626t != null) {
                        this.f3691c.q(A(fragment));
                    }
                }
            }
            r12 = 1;
        } else {
            r12 = 1;
            w.C(this.f3706r.j(), this.f3707s, arrayList, arrayList2, i4, i5, false, this.f3702n);
        }
        j0(arrayList, arrayList2, i4, i5);
        if (Q) {
            boolean zBooleanValue = arrayList2.get(i5 - 1).booleanValue();
            for (int i11 = i4; i11 < i5; i11++) {
                androidx.fragment.app.a aVar2 = arrayList.get(i11);
                if (zBooleanValue) {
                    for (int size = aVar2.f3982c.size() - r12; size >= 0; size--) {
                        Fragment fragment2 = aVar2.f3982c.get(size).f4000b;
                        if (fragment2 != null) {
                            A(fragment2).m();
                        }
                    }
                } else {
                    Iterator<v.a> it2 = aVar2.f3982c.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment3 = it2.next().f4000b;
                        if (fragment3 != null) {
                            A(fragment3).m();
                        }
                    }
                }
            }
            e1(this.f3705q, r12);
            for (c0 c0Var : x(arrayList, i4, i5)) {
                c0Var.r(zBooleanValue);
                c0Var.p();
                c0Var.g();
            }
            i8 = i5;
            arrayList4 = arrayList2;
        } else {
            if (z4) {
                p.b bVar = new p.b();
                h(bVar);
                r14 = r12;
                z3 = z4;
                i6 = i5;
                i7 = i4;
                arrayList3 = arrayList2;
                iT1 = t1(arrayList, arrayList2, i4, i5, bVar);
                c1(bVar);
            } else {
                r14 = r12;
                z3 = z4;
                i6 = i5;
                i7 = i4;
                arrayList3 = arrayList2;
                iT1 = i6;
            }
            if (iT1 == i7 || !z3) {
                arrayList4 = arrayList3;
                i8 = i6;
            } else {
                if (this.f3705q >= r14) {
                    arrayList4 = arrayList3;
                    int i12 = iT1;
                    i8 = i6;
                    r13 = r14;
                    w.C(this.f3706r.j(), this.f3707s, arrayList, arrayList2, i4, i12, true, this.f3702n);
                } else {
                    arrayList4 = arrayList3;
                    i8 = i6;
                    r13 = r14;
                }
                e1(this.f3705q, r13);
            }
        }
        for (int i13 = i4; i13 < i8; i13++) {
            androidx.fragment.app.a aVar3 = arrayList.get(i13);
            if (arrayList4.get(i13).booleanValue() && aVar3.N >= 0) {
                aVar3.N = -1;
            }
            aVar3.g0();
        }
        if (z5) {
            C1();
        }
    }

    public void k1(@j0 androidx.fragment.app.r rVar) {
        Fragment fragmentK = rVar.k();
        if (fragmentK.J) {
            if (this.f3690b) {
                this.H = true;
                return;
            }
            fragmentK.J = false;
            if (Q) {
                rVar.m();
            } else {
                f1(fragmentK);
            }
        }
    }

    public void l(@j0 androidx.fragment.app.n nVar) {
        this.f3704p.add(nVar);
    }

    public boolean l0() {
        boolean zH0 = h0(true);
        u0();
        return zH0;
    }

    public void l1() {
        f0(new q(null, -1, 0), false);
    }

    public void m(@j0 o oVar) {
        if (this.f3700l == null) {
            this.f3700l = new ArrayList<>();
        }
        this.f3700l.add(oVar);
    }

    public final void m0(@k0 ArrayList<androidx.fragment.app.a> arrayList, @k0 ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<r> arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i4 = 0;
        while (i4 < size) {
            r rVar = this.L.get(i4);
            if (arrayList == null || rVar.f3742a || (iIndexOf2 = arrayList.indexOf(rVar.f3743b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf2).booleanValue()) {
                if (rVar.e() || (arrayList != null && rVar.f3743b.d0(arrayList, 0, arrayList.size()))) {
                    this.L.remove(i4);
                    i4--;
                    size--;
                    if (arrayList == null || rVar.f3742a || (iIndexOf = arrayList.indexOf(rVar.f3743b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf).booleanValue()) {
                        rVar.d();
                    }
                }
                i4++;
            } else {
                this.L.remove(i4);
                i4--;
                size--;
            }
            rVar.c();
            i4++;
        }
    }

    public void m1(int i4, int i5) {
        if (i4 >= 0) {
            f0(new q(null, i4, i5), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i4);
    }

    public void n(@j0 Fragment fragment) {
        this.M.f(fragment);
    }

    @k0
    public Fragment n0(@j0 String str) {
        return this.f3691c.f(str);
    }

    public void n1(@k0 String str, int i4) {
        f0(new q(str, -1, i4), false);
    }

    public int o() {
        return this.f3697i.getAndIncrement();
    }

    public boolean o1() {
        return r1(null, -1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(@c.j0 androidx.fragment.app.h<?> r3, @c.j0 androidx.fragment.app.e r4, @c.k0 androidx.fragment.app.Fragment r5) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.p(androidx.fragment.app.h, androidx.fragment.app.e, androidx.fragment.app.Fragment):void");
    }

    @k0
    public Fragment p0(@c.y int i4) {
        return this.f3691c.g(i4);
    }

    public boolean p1(int i4, int i5) {
        if (i4 >= 0) {
            return r1(null, i4, i5);
        }
        throw new IllegalArgumentException("Bad id: " + i4);
    }

    public void q(@j0 Fragment fragment) {
        if (T0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.B) {
            fragment.B = false;
            if (fragment.f3619m) {
                return;
            }
            this.f3691c.a(fragment);
            if (T0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (U0(fragment)) {
                this.D = true;
            }
        }
    }

    @k0
    public Fragment q0(@k0 String str) {
        return this.f3691c.h(str);
    }

    public boolean q1(@k0 String str, int i4) {
        return r1(str, -1, i4);
    }

    @j0
    public v r() {
        return new androidx.fragment.app.a(this);
    }

    public Fragment r0(@j0 String str) {
        return this.f3691c.i(str);
    }

    public final boolean r1(@k0 String str, int i4, int i5) {
        h0(false);
        g0(true);
        Fragment fragment = this.f3709u;
        if (fragment != null && i4 < 0 && str == null && fragment.t().o1()) {
            return true;
        }
        boolean zS1 = s1(this.I, this.J, str, i4, i5);
        if (zS1) {
            this.f3690b = true;
            try {
                A1(this.I, this.J);
            } finally {
                v();
            }
        }
        U1();
        a0();
        this.f3691c.b();
        return zS1;
    }

    public final void s(@j0 Fragment fragment) {
        HashSet<p0.b> hashSet = this.f3701m.get(fragment);
        if (hashSet != null) {
            Iterator<p0.b> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            B(fragment);
            this.f3701m.remove(fragment);
        }
    }

    public boolean s1(@j0 ArrayList<androidx.fragment.app.a> arrayList, @j0 ArrayList<Boolean> arrayList2, @k0 String str, int i4, int i5) {
        int i6;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f3692d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i4 < 0 && (i5 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3692d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i4 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f3692d.get(size2);
                    if ((str != null && str.equals(aVar.getName())) || (i4 >= 0 && i4 == aVar.N)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i5 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f3692d.get(size2);
                        if (str == null || !str.equals(aVar2.getName())) {
                            if (i4 < 0 || i4 != aVar2.N) {
                                break;
                            }
                        }
                    }
                }
                i6 = size2;
            } else {
                i6 = -1;
            }
            if (i6 == this.f3692d.size() - 1) {
                return false;
            }
            for (int size3 = this.f3692d.size() - 1; size3 > i6; size3--) {
                arrayList.add(this.f3692d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public boolean t() {
        boolean zU0 = false;
        for (Fragment fragment : this.f3691c.m()) {
            if (fragment != null) {
                zU0 = U0(fragment);
            }
            if (zU0) {
                return true;
            }
        }
        return false;
    }

    public final int t1(@j0 ArrayList<androidx.fragment.app.a> arrayList, @j0 ArrayList<Boolean> arrayList2, int i4, int i5, @j0 p.b<Fragment> bVar) {
        int i6 = i5;
        for (int i7 = i5 - 1; i7 >= i4; i7--) {
            androidx.fragment.app.a aVar = arrayList.get(i7);
            boolean zBooleanValue = arrayList2.get(i7).booleanValue();
            if (aVar.f0() && !aVar.d0(arrayList, i7 + 1, i5)) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                r rVar = new r(aVar, zBooleanValue);
                this.L.add(rVar);
                aVar.h0(rVar);
                if (zBooleanValue) {
                    aVar.Z();
                } else {
                    aVar.a0(false);
                }
                i6--;
                if (i7 != i6) {
                    arrayList.remove(i7);
                    arrayList.add(i6, aVar);
                }
                h(bVar);
            }
        }
        return i6;
    }

    @j0
    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3708t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.f3708t;
        } else {
            androidx.fragment.app.h<?> hVar = this.f3706r;
            if (hVar == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(hVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.f3706r;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (Y0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final void u0() {
        if (Q) {
            Iterator<c0> it = w().iterator();
            while (it.hasNext()) {
                it.next().k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }

    public void u1(@j0 Bundle bundle, @j0 String str, @j0 Fragment fragment) {
        if (fragment.f3626t != this) {
            S1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.f3613g);
    }

    public final void v() {
        this.f3690b = false;
        this.J.clear();
        this.I.clear();
    }

    public final boolean v0(@j0 ArrayList<androidx.fragment.app.a> arrayList, @j0 ArrayList<Boolean> arrayList2) {
        synchronized (this.f3689a) {
            if (this.f3689a.isEmpty()) {
                return false;
            }
            int size = this.f3689a.size();
            boolean zB = false;
            for (int i4 = 0; i4 < size; i4++) {
                zB |= this.f3689a.get(i4).b(arrayList, arrayList2);
            }
            this.f3689a.clear();
            this.f3706r.k().removeCallbacks(this.N);
            return zB;
        }
    }

    public void v1(@j0 m mVar, boolean z3) {
        this.f3703o.o(mVar, z3);
    }

    public final Set<c0> w() {
        HashSet hashSet = new HashSet();
        Iterator<androidx.fragment.app.r> it = this.f3691c.l().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().H;
            if (viewGroup != null) {
                hashSet.add(c0.o(viewGroup, M0()));
            }
        }
        return hashSet;
    }

    public int w0() {
        return this.f3691c.k();
    }

    public void w1(@j0 Fragment fragment, @j0 p0.b bVar) {
        HashSet<p0.b> hashSet = this.f3701m.get(fragment);
        if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
            this.f3701m.remove(fragment);
            if (fragment.f3608b < 5) {
                B(fragment);
                f1(fragment);
            }
        }
    }

    public final Set<c0> x(@j0 ArrayList<androidx.fragment.app.a> arrayList, int i4, int i5) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i4 < i5) {
            Iterator<v.a> it = arrayList.get(i4).f3982c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f4000b;
                if (fragment != null && (viewGroup = fragment.H) != null) {
                    hashSet.add(c0.n(viewGroup, this));
                }
            }
            i4++;
        }
        return hashSet;
    }

    @j0
    public List<Fragment> x0() {
        return this.f3691c.m();
    }

    public void x1(@j0 Fragment fragment) {
        if (T0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f3625s);
        }
        boolean z3 = !fragment.r0();
        if (!fragment.B || z3) {
            this.f3691c.t(fragment);
            if (U0(fragment)) {
                this.D = true;
            }
            fragment.f3620n = true;
            P1(fragment);
        }
    }

    public void y(@j0 androidx.fragment.app.a aVar, boolean z3, boolean z4, boolean z5) {
        if (z3) {
            aVar.a0(z5);
        } else {
            aVar.Z();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z3));
        if (z4 && this.f3705q >= 1) {
            w.C(this.f3706r.j(), this.f3707s, arrayList, arrayList2, 0, 1, true, this.f3702n);
        }
        if (z5) {
            e1(this.f3705q, true);
        }
        for (Fragment fragment : this.f3691c.m()) {
            if (fragment != null && fragment.I != null && fragment.N && aVar.c0(fragment.f3631y)) {
                float f4 = fragment.P;
                if (f4 > 0.0f) {
                    fragment.I.setAlpha(f4);
                }
                if (z5) {
                    fragment.P = 0.0f;
                } else {
                    fragment.P = -1.0f;
                    fragment.N = false;
                }
            }
        }
    }

    @j0
    public k y0(int i4) {
        return this.f3692d.get(i4);
    }

    public void y1(@j0 androidx.fragment.app.n nVar) {
        this.f3704p.remove(nVar);
    }

    public final void z(@j0 Fragment fragment) {
        Animator animator;
        if (fragment.I != null) {
            d.C0022d c0022dC = androidx.fragment.app.d.c(this.f3706r.j(), fragment, !fragment.A, fragment.M());
            if (c0022dC == null || (animator = c0022dC.f3902b) == null) {
                if (c0022dC != null) {
                    fragment.I.startAnimation(c0022dC.f3901a);
                    c0022dC.f3901a.start();
                }
                fragment.I.setVisibility((!fragment.A || fragment.q0()) ? 0 : 8);
                if (fragment.q0()) {
                    fragment.i2(false);
                }
            } else {
                animator.setTarget(fragment.I);
                if (!fragment.A) {
                    fragment.I.setVisibility(0);
                } else if (fragment.q0()) {
                    fragment.i2(false);
                } else {
                    ViewGroup viewGroup = fragment.H;
                    View view = fragment.I;
                    viewGroup.startViewTransition(view);
                    c0022dC.f3902b.addListener(new h(viewGroup, view, fragment));
                }
                c0022dC.f3902b.start();
            }
        }
        R0(fragment);
        fragment.O = false;
        fragment.R0(fragment.A);
    }

    public int z0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f3692d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void z1(@j0 o oVar) {
        ArrayList<o> arrayList = this.f3700l;
        if (arrayList != null) {
            arrayList.remove(oVar);
        }
    }
}
