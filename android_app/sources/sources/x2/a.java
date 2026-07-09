package x2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import s3.e;
import t3.d;
import t3.g;
import t3.h;

/* JADX INFO: loaded from: classes.dex */
public class a extends p3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12650b;

    /* JADX INFO: renamed from: x2.a$a, reason: collision with other inner class name */
    public static class C0127a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Future<Object>> f12651a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExecutorService f12652b = Executors.newCachedThreadPool();

        /* JADX INFO: renamed from: x2.a$a$a, reason: collision with other inner class name */
        public class CallableC0128a implements Callable<Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f12653a;

            public CallableC0128a(Runnable runnable) {
                this.f12653a = runnable;
            }

            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
                this.f12653a.run();
                return null;
            }
        }

        @Override // t3.h
        public void a(Runnable runnable) {
            this.f12651a.add(this.f12652b.submit(new CallableC0128a(runnable)));
        }

        @Override // t3.h
        public void b() {
            Iterator<Future<Object>> it = this.f12651a.iterator();
            while (it.hasNext()) {
                try {
                    it.next().get();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    public a(boolean z3, boolean z4) {
        this.f12649a = z3;
        this.f12650b = z4;
    }

    public static p3.a d() {
        return new a(true, false);
    }

    public static p3.a e() {
        return new a(false, true);
    }

    public static <T> p3.h f(p3.h hVar) {
        if (hVar instanceof e) {
            ((e) hVar).v(new C0127a());
        }
        return hVar;
    }

    @Override // p3.a
    public p3.h a(g gVar, Class<?> cls) throws Throwable {
        p3.h hVarA = super.a(gVar, cls);
        return this.f12650b ? f(hVarA) : hVarA;
    }

    @Override // p3.a
    public p3.h b(g gVar, Class<?>[] clsArr) throws d {
        p3.h hVarB = super.b(gVar, clsArr);
        return this.f12649a ? f(hVarB) : hVarB;
    }
}
