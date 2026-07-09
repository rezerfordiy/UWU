package o3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class a extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<Throwable> f9944a = new ArrayList();

    /* JADX INFO: renamed from: o3.a$a, reason: collision with other inner class name */
    public class CallableC0092a implements Callable<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f9945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f9946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t2.f f9947c;

        public CallableC0092a(String str, Object obj, t2.f fVar) {
            this.f9945a = str;
            this.f9946b = obj;
            this.f9947c = fVar;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            w2.c.L(this.f9945a, this.f9946b, this.f9947c);
            return this.f9946b;
        }
    }

    @Override // o3.m
    public void b() throws Throwable {
        t3.e.a(this.f9944a);
    }

    public void c(Throwable th) {
        this.f9944a.add(th);
    }

    public Object d(Callable<Object> callable) {
        try {
            return callable.call();
        } catch (Throwable th) {
            c(th);
            return null;
        }
    }

    public <T> void e(T t4, t2.f<T> fVar) {
        f(s0.a.f11071l, t4, fVar);
    }

    public <T> void f(String str, T t4, t2.f<T> fVar) {
        d(new CallableC0092a(str, t4, fVar));
    }
}
