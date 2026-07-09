package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.l;
import androidx.savedstate.Recreator;
import c.g0;
import c.j0;
import c.k0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f4207f = "androidx.lifecycle.BundlableSavedStateRegistry.key";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k0
    public Bundle f4209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Recreator.a f4211d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n.b<String, b> f4208a = new n.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4212e = true;

    public interface a {
        void a(@j0 c cVar);
    }

    public interface b {
        @j0
        Bundle a();
    }

    @g0
    @k0
    public Bundle a(@j0 String str) {
        if (!this.f4210c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f4209b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.f4209b.remove(str);
        if (this.f4209b.isEmpty()) {
            this.f4209b = null;
        }
        return bundle2;
    }

    @g0
    public boolean b() {
        return this.f4210c;
    }

    @g0
    public void c(@j0 i iVar, @k0 Bundle bundle) {
        if (this.f4210c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f4209b = bundle.getBundle(f4207f);
        }
        iVar.a(new g() { // from class: androidx.savedstate.SavedStateRegistry.1
            @Override // androidx.lifecycle.j
            public void d(l lVar, i.b bVar) {
                SavedStateRegistry savedStateRegistry;
                boolean z3;
                if (bVar == i.b.ON_START) {
                    savedStateRegistry = SavedStateRegistry.this;
                    z3 = true;
                } else {
                    if (bVar != i.b.ON_STOP) {
                        return;
                    }
                    savedStateRegistry = SavedStateRegistry.this;
                    z3 = false;
                }
                savedStateRegistry.f4212e = z3;
            }
        });
        this.f4210c = true;
    }

    @g0
    public void d(@j0 Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f4209b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.b<String, b>.d dVarD = this.f4208a.d();
        while (dVarD.hasNext()) {
            Map.Entry next = dVarD.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle(f4207f, bundle2);
    }

    @g0
    public void e(@j0 String str, @j0 b bVar) {
        if (this.f4208a.g(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    @g0
    public void f(@j0 Class<? extends a> cls) {
        if (!this.f4212e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f4211d == null) {
            this.f4211d = new Recreator.a(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            this.f4211d.b(cls.getName());
        } catch (NoSuchMethodException e4) {
            throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
        }
    }

    @g0
    public void g(@j0 String str) {
        this.f4208a.h(str);
    }
}
