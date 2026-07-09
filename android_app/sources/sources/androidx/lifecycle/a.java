package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.z;
import androidx.savedstate.SavedStateRegistry;
import c.j0;
import c.k0;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends z.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f4121d = "androidx.lifecycle.savedstate.vm.tag";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavedStateRegistry f4122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f4123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f4124c;

    public a(@j0 androidx.savedstate.c cVar, @k0 Bundle bundle) {
        this.f4122a = cVar.e();
        this.f4123b = cVar.a();
        this.f4124c = bundle;
    }

    @Override // androidx.lifecycle.z.c, androidx.lifecycle.z.b
    @j0
    public final <T extends y> T a(@j0 Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.z.e
    public void b(@j0 y yVar) {
        SavedStateHandleController.h(yVar, this.f4122a, this.f4123b);
    }

    @Override // androidx.lifecycle.z.c
    @j0
    @r0({r0.a.LIBRARY_GROUP})
    public final <T extends y> T c(@j0 String str, @j0 Class<T> cls) {
        SavedStateHandleController savedStateHandleControllerJ = SavedStateHandleController.j(this.f4122a, this.f4123b, str, this.f4124c);
        T t4 = (T) d(str, cls, savedStateHandleControllerJ.k());
        t4.e("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerJ);
        return t4;
    }

    @j0
    public abstract <T extends y> T d(@j0 String str, @j0 Class<T> cls, @j0 v vVar);
}
