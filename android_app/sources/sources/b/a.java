package b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<I, O> {

    /* JADX INFO: renamed from: b.a$a, reason: collision with other inner class name */
    public static final class C0024a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SuppressLint({"UnknownNullness"})
        public final T f4318a;

        public C0024a(@SuppressLint({"UnknownNullness"}) T t4) {
            this.f4318a = t4;
        }

        @SuppressLint({"UnknownNullness"})
        public T a() {
            return this.f4318a;
        }
    }

    @j0
    public abstract Intent a(@j0 Context context, @SuppressLint({"UnknownNullness"}) I i4);

    @k0
    public C0024a<O> b(@j0 Context context, @SuppressLint({"UnknownNullness"}) I i4) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract O c(int i4, @k0 Intent intent);
}
