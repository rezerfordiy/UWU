package z2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import p3.f;

/* JADX INFO: loaded from: classes.dex */
public class c implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f14254e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Long> f14255b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Long> f14256c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f14257d;

    public final class b extends r3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f14258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<p3.c, Long> f14259b;

        public b() {
            this.f14258a = System.currentTimeMillis();
            this.f14259b = new HashMap();
        }

        @Override // r3.b
        public void b(r3.a aVar) throws Exception {
            c.this.h(aVar.a(), this.f14258a);
        }

        @Override // r3.b
        public void c(p3.c cVar) throws Exception {
            c.this.g(cVar, System.nanoTime() - this.f14259b.get(cVar).longValue());
        }

        @Override // r3.b
        public void e(f fVar) throws Exception {
            c.this.j();
        }

        @Override // r3.b
        public void g(p3.c cVar) throws Exception {
            this.f14259b.put(cVar, Long.valueOf(System.nanoTime()));
        }
    }

    /* JADX INFO: renamed from: z2.c$c, reason: collision with other inner class name */
    public class C0133c implements Comparator<p3.c> {
        public C0133c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(p3.c cVar, p3.c cVar2) {
            if (c.this.e(cVar)) {
                return -1;
            }
            if (c.this.e(cVar2)) {
                return 1;
            }
            int iCompareTo = b(cVar2).compareTo(b(cVar));
            return iCompareTo != 0 ? iCompareTo : c.this.d(cVar).compareTo(c.this.d(cVar2));
        }

        public final Long b(p3.c cVar) {
            Long lC = c.this.c(cVar);
            if (lC == null) {
                return 0L;
            }
            return lC;
        }
    }

    public c(File file) {
        this.f14257d = file;
    }

    public static c b(File file) {
        if (file.exists()) {
            try {
                return i(file);
            } catch (z2.a e4) {
                e4.printStackTrace();
                file.delete();
            }
        }
        return new c(file);
    }

    public static c i(File file) throws z2.a {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    return (c) objectInputStream.readObject();
                } finally {
                    objectInputStream.close();
                }
            } finally {
                fileInputStream.close();
            }
        } catch (Exception e4) {
            throw new z2.a(e4);
        }
    }

    public Long c(p3.c cVar) {
        return this.f14256c.get(cVar.toString());
    }

    public Long d(p3.c cVar) {
        return this.f14255b.get(cVar.toString());
    }

    public boolean e(p3.c cVar) {
        return !this.f14255b.containsKey(cVar.toString());
    }

    public r3.b f() {
        return new b();
    }

    public void g(p3.c cVar, long j4) {
        this.f14255b.put(cVar.toString(), Long.valueOf(j4));
    }

    public void h(p3.c cVar, long j4) {
        this.f14256c.put(cVar.toString(), Long.valueOf(j4));
    }

    public final void j() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.f14257d));
        objectOutputStream.writeObject(this);
        objectOutputStream.close();
    }

    public Comparator<p3.c> k() {
        return new C0133c();
    }
}
