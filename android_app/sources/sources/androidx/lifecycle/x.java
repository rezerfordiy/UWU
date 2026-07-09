package androidx.lifecycle;

import c.g0;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: Add missing generic type declarations: [X] */
    public static class a<X> implements r<X> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f4189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o.a f4190b;

        public a(o oVar, o.a aVar) {
            this.f4189a = oVar;
            this.f4190b = aVar;
        }

        @Override // androidx.lifecycle.r
        public void a(@k0 X x3) {
            this.f4189a.q(this.f4190b.a(x3));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    public static class b<X> implements r<X> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LiveData<Y> f4191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o.a f4192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f4193c;

        /* JADX INFO: Add missing generic type declarations: [Y] */
        public class a<Y> implements r<Y> {
            public a() {
            }

            @Override // androidx.lifecycle.r
            public void a(@k0 Y y3) {
                b.this.f4193c.q(y3);
            }
        }

        public b(o.a aVar, o oVar) {
            this.f4192b = aVar;
            this.f4193c = oVar;
        }

        @Override // androidx.lifecycle.r
        public void a(@k0 X x3) {
            LiveData<Y> liveData = (LiveData) this.f4192b.a(x3);
            Object obj = this.f4191a;
            if (obj == liveData) {
                return;
            }
            if (obj != null) {
                this.f4193c.s(obj);
            }
            this.f4191a = liveData;
            if (liveData != 0) {
                this.f4193c.r(liveData, new a());
            }
        }
    }

    @g0
    public static <X, Y> LiveData<Y> a(@j0 LiveData<X> liveData, @j0 o.a<X, Y> aVar) {
        o oVar = new o();
        oVar.r(liveData, new a(oVar, aVar));
        return oVar;
    }

    @g0
    public static <X, Y> LiveData<Y> b(@j0 LiveData<X> liveData, @j0 o.a<X, LiveData<Y>> aVar) {
        o oVar = new o();
        oVar.r(liveData, new b(aVar, oVar));
        return oVar;
    }
}
