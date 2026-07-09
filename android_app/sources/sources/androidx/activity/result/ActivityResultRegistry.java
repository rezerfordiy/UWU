package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import c.g0;
import c.j0;
import c.k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f698i = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f699j = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f700k = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f701l = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f702m = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f703n = "ActivityResultRegistry";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f704o = 65536;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Random f705a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Integer, String> f706b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Integer> f707c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, d> f708d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<String> f709e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Map<String, c<?>> f710f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<String, Object> f711g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bundle f712h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class a<I> extends androidx.activity.result.c<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b.a f719c;

        public a(String str, int i4, b.a aVar) {
            this.f717a = str;
            this.f718b = i4;
            this.f719c = aVar;
        }

        @Override // androidx.activity.result.c
        @j0
        public b.a<I, ?> a() {
            return this.f719c;
        }

        @Override // androidx.activity.result.c
        public void c(I i4, @k0 a0.d dVar) {
            ActivityResultRegistry.this.f709e.add(this.f717a);
            ActivityResultRegistry.this.f(this.f718b, this.f719c, i4, dVar);
        }

        @Override // androidx.activity.result.c
        public void d() {
            ActivityResultRegistry.this.l(this.f717a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class b<I> extends androidx.activity.result.c<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b.a f723c;

        public b(String str, int i4, b.a aVar) {
            this.f721a = str;
            this.f722b = i4;
            this.f723c = aVar;
        }

        @Override // androidx.activity.result.c
        @j0
        public b.a<I, ?> a() {
            return this.f723c;
        }

        @Override // androidx.activity.result.c
        public void c(I i4, @k0 a0.d dVar) {
            ActivityResultRegistry.this.f709e.add(this.f721a);
            ActivityResultRegistry.this.f(this.f722b, this.f723c, i4, dVar);
        }

        @Override // androidx.activity.result.c
        public void d() {
            ActivityResultRegistry.this.l(this.f721a);
        }
    }

    public static class c<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.activity.result.a<O> f725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b.a<?, O> f726b;

        public c(androidx.activity.result.a<O> aVar, b.a<?, O> aVar2) {
            this.f725a = aVar;
            this.f726b = aVar2;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<j> f728b = new ArrayList<>();

        public d(@j0 i iVar) {
            this.f727a = iVar;
        }

        public void a(@j0 j jVar) {
            this.f727a.a(jVar);
            this.f728b.add(jVar);
        }

        public void b() {
            Iterator<j> it = this.f728b.iterator();
            while (it.hasNext()) {
                this.f727a.c(it.next());
            }
            this.f728b.clear();
        }
    }

    public final void a(int i4, String str) {
        this.f706b.put(Integer.valueOf(i4), str);
        this.f707c.put(str, Integer.valueOf(i4));
    }

    @g0
    public final boolean b(int i4, int i5, @k0 Intent intent) {
        String str = this.f706b.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        this.f709e.remove(str);
        d(str, i5, intent, this.f710f.get(str));
        return true;
    }

    @g0
    public final <O> boolean c(int i4, @SuppressLint({"UnknownNullness"}) O o4) {
        androidx.activity.result.a<?> aVar;
        String str = this.f706b.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        this.f709e.remove(str);
        c<?> cVar = this.f710f.get(str);
        if (cVar != null && (aVar = cVar.f725a) != null) {
            aVar.a(o4);
            return true;
        }
        this.f712h.remove(str);
        this.f711g.put(str, o4);
        return true;
    }

    public final <O> void d(String str, int i4, @k0 Intent intent, @k0 c<O> cVar) {
        androidx.activity.result.a<O> aVar;
        if (cVar != null && (aVar = cVar.f725a) != null) {
            aVar.a(cVar.f726b.c(i4, intent));
        } else {
            this.f711g.remove(str);
            this.f712h.putParcelable(str, new ActivityResult(i4, intent));
        }
    }

    public final int e() {
        int iNextInt = this.f705a.nextInt(2147418112);
        while (true) {
            int i4 = iNextInt + 65536;
            if (!this.f706b.containsKey(Integer.valueOf(i4))) {
                return i4;
            }
            iNextInt = this.f705a.nextInt(2147418112);
        }
    }

    @g0
    public abstract <I, O> void f(int i4, @j0 b.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i5, @k0 a0.d dVar);

    public final void g(@k0 Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f698i);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f699j);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        int size = stringArrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            a(integerArrayList.get(i4).intValue(), stringArrayList.get(i4));
        }
        this.f709e = bundle.getStringArrayList(f700k);
        this.f705a = (Random) bundle.getSerializable(f702m);
        this.f712h.putAll(bundle.getBundle(f701l));
    }

    public final void h(@j0 Bundle bundle) {
        bundle.putIntegerArrayList(f698i, new ArrayList<>(this.f706b.keySet()));
        bundle.putStringArrayList(f699j, new ArrayList<>(this.f706b.values()));
        bundle.putStringArrayList(f700k, new ArrayList<>(this.f709e));
        bundle.putBundle(f701l, (Bundle) this.f712h.clone());
        bundle.putSerializable(f702m, this.f705a);
    }

    @j0
    public final <I, O> androidx.activity.result.c<I> i(@j0 final String str, @j0 l lVar, @j0 final b.a<I, O> aVar, @j0 final androidx.activity.result.a<O> aVar2) {
        i iVarA = lVar.a();
        if (iVarA.b().a(i.c.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + lVar + " is attempting to register while current state is " + iVarA.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        int iK = k(str);
        d dVar = this.f708d.get(str);
        if (dVar == null) {
            dVar = new d(iVarA);
        }
        dVar.a(new j() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.j
            public void d(@j0 l lVar2, @j0 i.b bVar) {
                if (!i.b.ON_START.equals(bVar)) {
                    if (i.b.ON_STOP.equals(bVar)) {
                        ActivityResultRegistry.this.f710f.remove(str);
                        return;
                    } else {
                        if (i.b.ON_DESTROY.equals(bVar)) {
                            ActivityResultRegistry.this.l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f710f.put(str, new c<>(aVar2, aVar));
                if (ActivityResultRegistry.this.f711g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f711g.get(str);
                    ActivityResultRegistry.this.f711g.remove(str);
                    aVar2.a(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f712h.getParcelable(str);
                if (activityResult != null) {
                    ActivityResultRegistry.this.f712h.remove(str);
                    aVar2.a(aVar.c(activityResult.b(), activityResult.a()));
                }
            }
        });
        this.f708d.put(str, dVar);
        return new a(str, iK, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j0
    public final <I, O> androidx.activity.result.c<I> j(@j0 String str, @j0 b.a<I, O> aVar, @j0 androidx.activity.result.a<O> aVar2) {
        int iK = k(str);
        this.f710f.put(str, new c<>(aVar2, aVar));
        if (this.f711g.containsKey(str)) {
            Object obj = this.f711g.get(str);
            this.f711g.remove(str);
            aVar2.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f712h.getParcelable(str);
        if (activityResult != null) {
            this.f712h.remove(str);
            aVar2.a(aVar.c(activityResult.b(), activityResult.a()));
        }
        return new b(str, iK, aVar);
    }

    public final int k(String str) {
        Integer num = this.f707c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int iE = e();
        a(iE, str);
        return iE;
    }

    @g0
    public final void l(@j0 String str) {
        Integer numRemove;
        if (!this.f709e.contains(str) && (numRemove = this.f707c.remove(str)) != null) {
            this.f706b.remove(numRemove);
        }
        this.f710f.remove(str);
        if (this.f711g.containsKey(str)) {
            Log.w(f703n, "Dropping pending result for request " + str + ": " + this.f711g.get(str));
            this.f711g.remove(str);
        }
        if (this.f712h.containsKey(str)) {
            Log.w(f703n, "Dropping pending result for request " + str + ": " + this.f712h.getParcelable(str));
            this.f712h.remove(str);
        }
        d dVar = this.f708d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f708d.remove(str);
        }
    }
}
