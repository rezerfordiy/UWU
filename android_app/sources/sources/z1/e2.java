package z1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import z1.c1;
import z1.u5;

/* JADX INFO: loaded from: classes.dex */
public class e2 implements u5.b, c1.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static e2 f13048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static ExecutorService f13049o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f13050a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f3 f13054e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Timer f13057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<String> f13059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13060k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i6 f13061l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i6 f13062m = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<b> f13051b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m0 f13052c = m0.f13621f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u5 f13053d = u5.f13966a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13056g = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c1 f13055f = c1.f12950d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (e2.this.f13060k) {
                try {
                    Thread.sleep(androidx.appcompat.widget.i1.f1742l);
                    e2.this.q();
                } catch (InterruptedException e4) {
                    throw new RuntimeException(e4);
                }
            }
        }
    }

    public interface b {
        void a(Map<String, Object> map);

        void b(List<String> list);

        void c(m2.d0 d0Var);

        void d(boolean z3, c1 c1Var);

        void e(m0 m0Var);

        void f(boolean z3);
    }

    public e2(Context context) {
        this.f13050a = context;
    }

    public static ExecutorService o() {
        return f13049o;
    }

    public static void r(ExecutorService executorService) {
        f13049o = executorService;
    }

    public static synchronized e2 s(Context context) {
        if (f13048n == null) {
            f13048n = new e2(context);
        }
        return f13048n;
    }

    @Override // z1.u5.b
    public void a() {
        synchronized (this) {
            if (!this.f13056g) {
                this.f13056g = true;
                c1 c1VarL = this.f13054e.l(this.f13053d);
                this.f13055f = c1VarL;
                c1VarL.k(this);
                Iterator<b> it = this.f13051b.iterator();
                while (it.hasNext()) {
                    it.next().d(true, this.f13055f);
                }
            }
        }
    }

    @Override // z1.c1.b
    public void b(boolean z3) {
        Iterator<b> it = this.f13051b.iterator();
        while (it.hasNext()) {
            it.next().f(z3);
        }
    }

    @Override // z1.c1.b
    public void c(List<String> list) {
        Iterator<b> it = this.f13051b.iterator();
        while (it.hasNext()) {
            it.next().b(list);
        }
    }

    @Override // z1.u5.b
    public void d() {
        synchronized (this) {
            this.f13053d.i();
            this.f13053d = u5.f13966a;
            this.f13052c = m0.f13621f;
            if (this.f13056g) {
                this.f13056g = false;
                this.f13055f = c1.f12950d;
                Iterator<b> it = this.f13051b.iterator();
                while (it.hasNext()) {
                    it.next().d(false, this.f13055f);
                }
            }
        }
    }

    @Override // z1.c1.b
    public void e(Map<String, Object> map) {
        if (map.containsKey("notice")) {
            Map<String, Object> map2 = (Map) map.get("notice");
            Iterator<b> it = this.f13051b.iterator();
            while (it.hasNext()) {
                it.next().a(map2);
            }
        }
        if (map.containsKey("raw_image")) {
            m2.d0 d0Var = (m2.d0) map.get("raw_image");
            Iterator<b> it2 = this.f13051b.iterator();
            while (it2.hasNext()) {
                it2.next().c(d0Var);
            }
        }
    }

    public m0 h() {
        return this.f13052c;
    }

    public c1 i() {
        return !this.f13056g ? c1.f12950d : this.f13055f;
    }

    public void j(b bVar) {
        this.f13051b.remove(bVar);
    }

    public boolean k(b bVar) {
        if (this.f13051b.contains(bVar)) {
            return true;
        }
        this.f13051b.add(bVar);
        return true;
    }

    public void l() {
        f13048n = null;
        u();
        this.f13051b.clear();
    }

    public synchronized void m() {
        f3 f3Var = this.f13054e;
        if (f3Var != null) {
            f3Var.i();
        }
        u5 u5Var = this.f13053d;
        if (u5Var != null) {
            u5Var.i();
        }
    }

    public Context n() {
        return this.f13050a;
    }

    public boolean p() {
        boolean z3;
        synchronized (this) {
            z3 = this.f13056g;
        }
        return z3;
    }

    public final void q() {
        f3 f3VarC;
        if (this.f13062m == null) {
            this.f13062m = new r7();
        }
        if (this.f13061l == null) {
            this.f13061l = new i7(this.f13050a);
        }
        if (o2.b.g(null) == null) {
            o2.b.g(this.f13050a);
        }
        synchronized (this) {
            if (!this.f13053d.k() && !this.f13053d.j()) {
                m0 m0VarC = this.f13062m.c(this.f13059j, this.f13052c, this.f13056g, this.f13055f.i());
                this.f13052c = m0VarC;
                if (m0VarC == m0.f13621f) {
                    this.f13052c = this.f13061l.c(this.f13059j, m0VarC, this.f13056g, this.f13055f.i());
                    f3VarC = a3.a().b(this.f13052c);
                } else {
                    f3VarC = a3.a().c(this.f13052c);
                }
                this.f13054e = f3VarC;
                Iterator<b> it = this.f13051b.iterator();
                while (it.hasNext()) {
                    it.next().e(this.f13052c);
                }
                u5 u5VarN = this.f13054e.n();
                this.f13053d = u5VarN;
                u5VarN.m(this);
                this.f13053d.h(10000);
                return;
            }
            this.f13061l.b();
        }
    }

    public synchronized void t(String[] strArr) {
        Timer timer = this.f13057h;
        if (timer != null) {
            timer.cancel();
            this.f13057h = null;
        }
        this.f13059j = Arrays.asList(strArr);
        if (!this.f13060k && !f13049o.isShutdown()) {
            this.f13060k = true;
            f13049o.execute(new a());
        }
    }

    public synchronized void u() {
        this.f13060k = false;
        Timer timer = this.f13057h;
        if (timer != null) {
            timer.cancel();
            this.f13057h = null;
        }
        i6 i6Var = this.f13061l;
        if (i6Var != null) {
            i6Var.b();
        }
        i6 i6Var2 = this.f13062m;
        if (i6Var2 != null) {
            i6Var2.b();
        }
    }
}
