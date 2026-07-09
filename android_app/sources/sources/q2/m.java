package q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<k> f10469a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<k> f10470b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<l> f10471c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10472d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10473e = false;

    public class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f10474a;

        public a(j jVar) {
            this.f10474a = jVar;
        }

        @Override // q2.h
        public void a() throws Throwable {
            this.f10474a.R();
        }
    }

    public synchronized void a(i iVar, Throwable th) {
        this.f10470b.add(new k(iVar, th));
        Iterator<l> it = d().iterator();
        while (it.hasNext()) {
            it.next().b(iVar, th);
        }
    }

    public synchronized void b(i iVar, b bVar) {
        this.f10469a.add(new k(iVar, bVar));
        Iterator<l> it = d().iterator();
        while (it.hasNext()) {
            it.next().d(iVar, bVar);
        }
    }

    public synchronized void c(l lVar) {
        this.f10471c.add(lVar);
    }

    public final synchronized List<l> d() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.f10471c);
        return arrayList;
    }

    public void e(i iVar) {
        Iterator<l> it = d().iterator();
        while (it.hasNext()) {
            it.next().c(iVar);
        }
    }

    public synchronized int f() {
        return this.f10470b.size();
    }

    public synchronized Enumeration<k> g() {
        return Collections.enumeration(this.f10470b);
    }

    public synchronized int h() {
        return this.f10469a.size();
    }

    public synchronized Enumeration<k> i() {
        return Collections.enumeration(this.f10469a);
    }

    public synchronized void j(l lVar) {
        this.f10471c.remove(lVar);
    }

    public void k(j jVar) {
        o(jVar);
        m(jVar, new a(jVar));
        e(jVar);
    }

    public synchronized int l() {
        return this.f10472d;
    }

    public void m(i iVar, h hVar) {
        try {
            hVar.a();
        } catch (ThreadDeath e4) {
            throw e4;
        } catch (b e5) {
            b(iVar, e5);
        } catch (Throwable th) {
            a(iVar, th);
        }
    }

    public synchronized boolean n() {
        return this.f10473e;
    }

    public void o(i iVar) {
        int iB = iVar.b();
        synchronized (this) {
            this.f10472d += iB;
        }
        Iterator<l> it = d().iterator();
        while (it.hasNext()) {
            it.next().a(iVar);
        }
    }

    public synchronized void p() {
        this.f10473e = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean q() {
        /*
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.h()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto Lf
            int r0 = r1.f()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            monitor-exit(r1)
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.m.q():boolean");
    }
}
