package p3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class f implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f10102g = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicInteger f10103b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AtomicInteger f10104c = new AtomicInteger();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<r3.a> f10105d = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10106e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10107f;

    public class b extends r3.b {
        public b() {
        }

        @Override // r3.b
        public void a(r3.a aVar) {
        }

        @Override // r3.b
        public void b(r3.a aVar) throws Exception {
            f.this.f10105d.add(aVar);
        }

        @Override // r3.b
        public void c(c cVar) throws Exception {
            f.this.f10103b.getAndIncrement();
        }

        @Override // r3.b
        public void d(c cVar) throws Exception {
            f.this.f10104c.getAndIncrement();
        }

        @Override // r3.b
        public void e(f fVar) throws Exception {
            long jCurrentTimeMillis = System.currentTimeMillis();
            f fVar2 = f.this;
            f.c(fVar2, jCurrentTimeMillis - fVar2.f10107f);
        }

        @Override // r3.b
        public void f(c cVar) throws Exception {
            f.this.f10107f = System.currentTimeMillis();
        }
    }

    public static /* synthetic */ long c(f fVar, long j4) {
        long j5 = fVar.f10106e + j4;
        fVar.f10106e = j5;
        return j5;
    }

    public r3.b g() {
        return new b();
    }

    public int h() {
        return this.f10105d.size();
    }

    public List<r3.a> i() {
        return this.f10105d;
    }

    public int j() {
        return this.f10104c.get();
    }

    public int k() {
        return this.f10103b.get();
    }

    public long l() {
        return this.f10106e;
    }

    public boolean m() {
        return h() == 0;
    }
}
