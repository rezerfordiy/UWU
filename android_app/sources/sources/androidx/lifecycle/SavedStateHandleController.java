package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.savedstate.SavedStateRegistry;
import c.j0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class SavedStateHandleController implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f4114d = "androidx.lifecycle.savedstate.vm.tag";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4116b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f4117c;

    public static final class a implements SavedStateRegistry.a {
        @Override // androidx.savedstate.SavedStateRegistry.a
        public void a(@j0 androidx.savedstate.c cVar) {
            if (!(cVar instanceof b0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            a0 a0VarN = ((b0) cVar).n();
            SavedStateRegistry savedStateRegistryE = cVar.e();
            Iterator<String> it = a0VarN.c().iterator();
            while (it.hasNext()) {
                SavedStateHandleController.h(a0VarN.b(it.next()), savedStateRegistryE, cVar.a());
            }
            if (a0VarN.c().isEmpty()) {
                return;
            }
            savedStateRegistryE.f(a.class);
        }
    }

    public SavedStateHandleController(String str, v vVar) {
        this.f4115a = str;
        this.f4117c = vVar;
    }

    public static void h(y yVar, SavedStateRegistry savedStateRegistry, i iVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) yVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.l()) {
            return;
        }
        savedStateHandleController.i(savedStateRegistry, iVar);
        m(savedStateRegistry, iVar);
    }

    public static SavedStateHandleController j(SavedStateRegistry savedStateRegistry, i iVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, v.c(savedStateRegistry.a(str), bundle));
        savedStateHandleController.i(savedStateRegistry, iVar);
        m(savedStateRegistry, iVar);
        return savedStateHandleController;
    }

    public static void m(final SavedStateRegistry savedStateRegistry, final i iVar) {
        i.c cVarB = iVar.b();
        if (cVarB == i.c.INITIALIZED || cVarB.a(i.c.STARTED)) {
            savedStateRegistry.f(a.class);
        } else {
            iVar.a(new j() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.j
                public void d(@j0 l lVar, @j0 i.b bVar) {
                    if (bVar == i.b.ON_START) {
                        iVar.c(this);
                        savedStateRegistry.f(a.class);
                    }
                }
            });
        }
    }

    @Override // androidx.lifecycle.j
    public void d(@j0 l lVar, @j0 i.b bVar) {
        if (bVar == i.b.ON_DESTROY) {
            this.f4116b = false;
            lVar.a().c(this);
        }
    }

    public void i(SavedStateRegistry savedStateRegistry, i iVar) {
        if (this.f4116b) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f4116b = true;
        iVar.a(this);
        savedStateRegistry.e(this.f4115a, this.f4117c.j());
    }

    public v k() {
        return this.f4117c;
    }

    public boolean l() {
        return this.f4116b;
    }
}
