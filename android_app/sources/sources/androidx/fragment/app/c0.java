package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import c.j0;
import c.k0;
import e1.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p0.b;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f3861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<e> f3862b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<e> f3863c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3864d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3865e = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f3866b;

        public a(d dVar) {
            this.f3866b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c0.this.f3862b.contains(this.f3866b)) {
                this.f3866b.e().a(this.f3866b.f().I);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f3868b;

        public b(d dVar) {
            this.f3868b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.f3862b.remove(this.f3868b);
            c0.this.f3863c.remove(this.f3868b);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f3871b;

        static {
            int[] iArr = new int[e.b.values().length];
            f3871b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3871b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3871b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f3870a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3870a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3870a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3870a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class d extends e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @j0
        public final r f3872h;

        public d(@j0 e.c cVar, @j0 e.b bVar, @j0 r rVar, @j0 p0.b bVar2) {
            super(cVar, bVar, rVar.k(), bVar2);
            this.f3872h = rVar;
        }

        @Override // androidx.fragment.app.c0.e
        public void c() {
            super.c();
            this.f3872h.m();
        }

        @Override // androidx.fragment.app.c0.e
        public void l() {
            if (g() == e.b.ADDING) {
                Fragment fragmentK = this.f3872h.k();
                View viewFindFocus = fragmentK.I.findFocus();
                if (viewFindFocus != null) {
                    fragmentK.g2(viewFindFocus);
                    if (FragmentManager.T0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK);
                    }
                }
                View viewS1 = f().S1();
                if (viewS1.getParent() == null) {
                    this.f3872h.b();
                    viewS1.setAlpha(0.0f);
                }
                if (viewS1.getAlpha() == 0.0f && viewS1.getVisibility() == 0) {
                    viewS1.setVisibility(4);
                }
                viewS1.setAlpha(fragmentK.P());
            }
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @j0
        public c f3873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @j0
        public b f3874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @j0
        public final Fragment f3875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @j0
        public final List<Runnable> f3876d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @j0
        public final HashSet<p0.b> f3877e = new HashSet<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f3878f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f3879g = false;

        public class a implements b.a {
            public a() {
            }

            @Override // p0.b.a
            public void a() {
                e.this.b();
            }
        }

        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            @j0
            public static c b(int i4) {
                if (i4 == 0) {
                    return VISIBLE;
                }
                if (i4 == 4) {
                    return INVISIBLE;
                }
                if (i4 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i4);
            }

            @j0
            public static c c(@j0 View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
            }

            public void a(@j0 View view) {
                int i4;
                int i5 = c.f3870a[ordinal()];
                if (i5 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.T0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i5 == 2) {
                    if (FragmentManager.T0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i4 = 0;
                } else {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            return;
                        }
                        if (FragmentManager.T0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    if (FragmentManager.T0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i4 = 8;
                }
                view.setVisibility(i4);
            }
        }

        public e(@j0 c cVar, @j0 b bVar, @j0 Fragment fragment, @j0 p0.b bVar2) {
            this.f3873a = cVar;
            this.f3874b = bVar;
            this.f3875c = fragment;
            bVar2.d(new a());
        }

        public final void a(@j0 Runnable runnable) {
            this.f3876d.add(runnable);
        }

        public final void b() {
            if (h()) {
                return;
            }
            this.f3878f = true;
            if (this.f3877e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f3877e).iterator();
            while (it.hasNext()) {
                ((p0.b) it.next()).a();
            }
        }

        @c.i
        public void c() {
            if (this.f3879g) {
                return;
            }
            if (FragmentManager.T0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f3879g = true;
            Iterator<Runnable> it = this.f3876d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        public final void d(@j0 p0.b bVar) {
            if (this.f3877e.remove(bVar) && this.f3877e.isEmpty()) {
                c();
            }
        }

        @j0
        public c e() {
            return this.f3873a;
        }

        @j0
        public final Fragment f() {
            return this.f3875c;
        }

        @j0
        public b g() {
            return this.f3874b;
        }

        public final boolean h() {
            return this.f3878f;
        }

        public final boolean i() {
            return this.f3879g;
        }

        public final void j(@j0 p0.b bVar) {
            l();
            this.f3877e.add(bVar);
        }

        public final void k(@j0 c cVar, @j0 b bVar) {
            b bVar2;
            int i4 = c.f3871b[bVar.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3 && this.f3873a != c.REMOVED) {
                        if (FragmentManager.T0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3875c + " mFinalState = " + this.f3873a + " -> " + cVar + ". ");
                        }
                        this.f3873a = cVar;
                        return;
                    }
                    return;
                }
                if (FragmentManager.T0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3875c + " mFinalState = " + this.f3873a + " -> REMOVED. mLifecycleImpact  = " + this.f3874b + " to REMOVING.");
                }
                this.f3873a = c.REMOVED;
                bVar2 = b.REMOVING;
            } else {
                if (this.f3873a != c.REMOVED) {
                    return;
                }
                if (FragmentManager.T0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3875c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f3874b + " to ADDING.");
                }
                this.f3873a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.f3874b = bVar2;
        }

        public void l() {
        }

        @j0
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f3873a + "} {mLifecycleImpact = " + this.f3874b + "} {mFragment = " + this.f3875c + "}";
        }
    }

    public c0(@j0 ViewGroup viewGroup) {
        this.f3861a = viewGroup;
    }

    @j0
    public static c0 n(@j0 ViewGroup viewGroup, @j0 FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.M0());
    }

    @j0
    public static c0 o(@j0 ViewGroup viewGroup, @j0 d0 d0Var) {
        int i4 = a.g.f7538e0;
        Object tag = viewGroup.getTag(i4);
        if (tag instanceof c0) {
            return (c0) tag;
        }
        c0 c0VarA = d0Var.a(viewGroup);
        viewGroup.setTag(i4, c0VarA);
        return c0VarA;
    }

    public final void a(@j0 e.c cVar, @j0 e.b bVar, @j0 r rVar) {
        synchronized (this.f3862b) {
            p0.b bVar2 = new p0.b();
            e eVarH = h(rVar.k());
            if (eVarH != null) {
                eVarH.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, rVar, bVar2);
            this.f3862b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    public void b(@j0 e.c cVar, @j0 r rVar) {
        if (FragmentManager.T0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + rVar.k());
        }
        a(cVar, e.b.ADDING, rVar);
    }

    public void c(@j0 r rVar) {
        if (FragmentManager.T0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + rVar.k());
        }
        a(e.c.GONE, e.b.NONE, rVar);
    }

    public void d(@j0 r rVar) {
        if (FragmentManager.T0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + rVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, rVar);
    }

    public void e(@j0 r rVar) {
        if (FragmentManager.T0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + rVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, rVar);
    }

    public abstract void f(@j0 List<e> list, boolean z3);

    public void g() {
        if (this.f3865e) {
            return;
        }
        if (!z1.N0(this.f3861a)) {
            j();
            this.f3864d = false;
            return;
        }
        synchronized (this.f3862b) {
            if (!this.f3862b.isEmpty()) {
                ArrayList<e> arrayList = new ArrayList(this.f3863c);
                this.f3863c.clear();
                for (e eVar : arrayList) {
                    if (FragmentManager.T0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.f3863c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.f3862b);
                this.f3862b.clear();
                this.f3863c.addAll(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).l();
                }
                f(arrayList2, this.f3864d);
                this.f3864d = false;
            }
        }
    }

    @k0
    public final e h(@j0 Fragment fragment) {
        for (e eVar : this.f3862b) {
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    @k0
    public final e i(@j0 Fragment fragment) {
        for (e eVar : this.f3863c) {
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    public void j() {
        boolean zN0 = z1.N0(this.f3861a);
        synchronized (this.f3862b) {
            q();
            Iterator<e> it = this.f3862b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            for (e eVar : new ArrayList(this.f3863c)) {
                if (FragmentManager.T0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(zN0 ? s0.a.f11071l : "Container " + this.f3861a + " is not attached to window. ");
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.b();
            }
            for (e eVar2 : new ArrayList(this.f3862b)) {
                if (FragmentManager.T0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(zN0 ? s0.a.f11071l : "Container " + this.f3861a + " is not attached to window. ");
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.b();
            }
        }
    }

    public void k() {
        if (this.f3865e) {
            this.f3865e = false;
            g();
        }
    }

    @k0
    public e.b l(@j0 r rVar) {
        e eVarH = h(rVar.k());
        if (eVarH != null) {
            return eVarH.g();
        }
        e eVarI = i(rVar.k());
        if (eVarI != null) {
            return eVarI.g();
        }
        return null;
    }

    @j0
    public ViewGroup m() {
        return this.f3861a;
    }

    public void p() {
        synchronized (this.f3862b) {
            q();
            this.f3865e = false;
            int size = this.f3862b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f3862b.get(size);
                e.c cVarC = e.c.c(eVar.f().I);
                e.c cVarE = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (cVarE == cVar && cVarC != cVar) {
                    this.f3865e = eVar.f().u0();
                    break;
                }
                size--;
            }
        }
    }

    public final void q() {
        for (e eVar : this.f3862b) {
            if (eVar.g() == e.b.ADDING) {
                eVar.k(e.c.b(eVar.f().S1().getVisibility()), e.b.NONE);
            }
        }
    }

    public void r(boolean z3) {
        this.f3864d = z3;
    }
}
