package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.l;
import androidx.savedstate.SavedStateRegistry;
import c.j0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
final class Recreator implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f4203b = "classes_to_restore";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f4204c = "androidx.savedstate.Restarter";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f4205a;

    public static final class a implements SavedStateRegistry.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<String> f4206a = new HashSet();

        public a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.e(Recreator.f4204c, this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        @j0
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.f4203b, new ArrayList<>(this.f4206a));
            return bundle;
        }

        public void b(String str) {
            this.f4206a.add(str);
        }
    }

    public Recreator(c cVar) {
        this.f4205a = cVar;
    }

    @Override // androidx.lifecycle.j
    public void d(l lVar, i.b bVar) {
        if (bVar != i.b.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        lVar.a().c(this);
        Bundle bundleA = this.f4205a.e().a(f4204c);
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList(f4203b);
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            h(it.next());
        }
    }

    public final void h(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.a.class);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.a) declaredConstructor.newInstance(new Object[0])).a(this.f4205a);
                } catch (Exception e4) {
                    throw new RuntimeException("Failed to instantiate " + str, e4);
                }
            } catch (NoSuchMethodException e5) {
                throw new IllegalStateException("Class" + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("Class " + str + " wasn't found", e6);
        }
    }
}
