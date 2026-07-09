package androidx.lifecycle;

import c.g0;
import c.j0;
import c.k0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class o<T> extends q<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n.b<LiveData<?>, a<?>> f4165m = new n.b<>();

    public static class a<V> implements r<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LiveData<V> f4166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r<? super V> f4167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4168c = -1;

        public a(LiveData<V> liveData, r<? super V> rVar) {
            this.f4166a = liveData;
            this.f4167b = rVar;
        }

        @Override // androidx.lifecycle.r
        public void a(@k0 V v3) {
            if (this.f4168c != this.f4166a.g()) {
                this.f4168c = this.f4166a.g();
                this.f4167b.a(v3);
            }
        }

        public void b() {
            this.f4166a.k(this);
        }

        public void c() {
            this.f4166a.o(this);
        }
    }

    @Override // androidx.lifecycle.LiveData
    @c.i
    public void l() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f4165m.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    @Override // androidx.lifecycle.LiveData
    @c.i
    public void m() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f4165m.iterator();
        while (it.hasNext()) {
            it.next().getValue().c();
        }
    }

    @g0
    public <S> void r(@j0 LiveData<S> liveData, @j0 r<? super S> rVar) {
        a<?> aVar = new a<>(liveData, rVar);
        a<?> aVarG = this.f4165m.g(liveData, aVar);
        if (aVarG != null && aVarG.f4167b != rVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarG == null && h()) {
            aVar.b();
        }
    }

    @g0
    public <S> void s(@j0 LiveData<S> liveData) {
        a<?> aVarH = this.f4165m.h(liveData);
        if (aVarH != null) {
            aVarH.c();
        }
    }
}
