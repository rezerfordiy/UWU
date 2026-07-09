package j3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r3.c f8297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f8298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p3.c f8299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f8300d;

    public a(r3.c cVar, j jVar, p3.c cVar2, Runnable runnable) {
        this.f8297a = cVar;
        this.f8298b = jVar;
        this.f8299c = cVar2;
        this.f8300d = runnable;
    }

    public void a(Throwable th) {
        this.f8297a.e(new r3.a(this.f8299c, th));
    }

    public final void b() {
        Iterator<Method> it = this.f8298b.a().iterator();
        while (it.hasNext()) {
            try {
                it.next().invoke(null, new Object[0]);
            } catch (InvocationTargetException e4) {
                th = e4.getTargetException();
                a(th);
            } catch (Throwable th) {
                th = th;
                a(th);
            }
        }
    }

    public final void c() throws c {
        try {
            try {
                Iterator<Method> it = this.f8298b.c().iterator();
                while (it.hasNext()) {
                    it.next().invoke(null, new Object[0]);
                }
            } catch (f3.b unused) {
                throw new c();
            } catch (Throwable th) {
                a(th);
                throw new c();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getTargetException();
        }
    }

    public void d() {
        try {
            c();
            e();
        } catch (c unused) {
        } catch (Throwable th) {
            b();
            throw th;
        }
        b();
    }

    public void e() {
        this.f8300d.run();
    }
}
