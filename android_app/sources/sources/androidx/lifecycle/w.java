package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.z;
import androidx.savedstate.SavedStateRegistry;
import c.j0;
import c.k0;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class w extends z.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class<?>[] f4182f = {Application.class, v.class};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Class<?>[] f4183g = {v.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f4184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z.b f4185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f4186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f4187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SavedStateRegistry f4188e;

    public w(@k0 Application application, @j0 androidx.savedstate.c cVar) {
        this(application, cVar, null);
    }

    public static <T> Constructor<T> d(Class<T> cls, Class<?>[] clsArr) {
        for (Object obj : cls.getConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.z.c, androidx.lifecycle.z.b
    @j0
    public <T extends y> T a(@j0 Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.z.e
    public void b(@j0 y yVar) {
        SavedStateHandleController.h(yVar, this.f4188e, this.f4187d);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[Catch: InvocationTargetException -> 0x0059, InstantiationException -> 0x0075, IllegalAccessException -> 0x0092, TryCatch #2 {IllegalAccessException -> 0x0092, InstantiationException -> 0x0075, InvocationTargetException -> 0x0059, blocks: (B:13:0x0030, B:15:0x0034, B:16:0x0043, B:18:0x0053, B:17:0x0046), top: B:29:0x0030 }] */
    @Override // androidx.lifecycle.z.c
    @c.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T extends androidx.lifecycle.y> T c(@c.j0 java.lang.String r6, @c.j0 java.lang.Class<T> r7) {
        /*
            r5 = this;
            java.lang.Class<androidx.lifecycle.b> r0 = androidx.lifecycle.b.class
            boolean r0 = r0.isAssignableFrom(r7)
            if (r0 == 0) goto L13
            android.app.Application r1 = r5.f4184a
            if (r1 == 0) goto L13
            java.lang.Class<?>[] r1 = androidx.lifecycle.w.f4182f
            java.lang.reflect.Constructor r1 = d(r7, r1)
            goto L19
        L13:
            java.lang.Class<?>[] r1 = androidx.lifecycle.w.f4183g
            java.lang.reflect.Constructor r1 = d(r7, r1)
        L19:
            if (r1 != 0) goto L22
            androidx.lifecycle.z$b r6 = r5.f4185b
            androidx.lifecycle.y r6 = r6.a(r7)
            return r6
        L22:
            androidx.savedstate.SavedStateRegistry r2 = r5.f4188e
            androidx.lifecycle.i r3 = r5.f4187d
            android.os.Bundle r4 = r5.f4186c
            androidx.lifecycle.SavedStateHandleController r6 = androidx.lifecycle.SavedStateHandleController.j(r2, r3, r6, r4)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L46
            android.app.Application r0 = r5.f4184a     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            if (r0 == 0) goto L46
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            r4[r2] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            androidx.lifecycle.v r0 = r6.k()     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            r4[r3] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            java.lang.Object r0 = r1.newInstance(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
        L43:
            androidx.lifecycle.y r0 = (androidx.lifecycle.y) r0     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            goto L53
        L46:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            androidx.lifecycle.v r3 = r6.k()     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            r0[r2] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            goto L43
        L53:
            java.lang.String r1 = "androidx.lifecycle.savedstate.vm.tag"
            r0.e(r1, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            return r0
        L59:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "An exception happened in constructor of "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.Throwable r6 = r6.getCause()
            r0.<init>(r7, r6)
            throw r0
        L75:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "A "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " cannot be instantiated."
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7, r6)
            throw r0
        L92:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to access "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.w.c(java.lang.String, java.lang.Class):androidx.lifecycle.y");
    }

    @SuppressLint({"LambdaLast"})
    public w(@k0 Application application, @j0 androidx.savedstate.c cVar, @k0 Bundle bundle) {
        this.f4188e = cVar.e();
        this.f4187d = cVar.a();
        this.f4186c = bundle;
        this.f4184a = application;
        this.f4185b = application != null ? z.a.c(application) : z.d.b();
    }
}
