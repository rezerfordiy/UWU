package androidx.lifecycle;

import c.g0;
import c.k0;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @k0
    public final Map<String, Object> f4195a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f4196b = false;

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    @g0
    public final void a() {
        this.f4196b = true;
        Map<String, Object> map = this.f4195a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f4195a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }
        d();
    }

    public <T> T c(String str) {
        T t4;
        Map<String, Object> map = this.f4195a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t4 = (T) this.f4195a.get(str);
        }
        return t4;
    }

    public void d() {
    }

    public <T> T e(String str, T t4) {
        Object obj;
        synchronized (this.f4195a) {
            obj = this.f4195a.get(str);
            if (obj == null) {
                this.f4195a.put(str, t4);
            }
        }
        if (obj != null) {
            t4 = (T) obj;
        }
        if (this.f4196b) {
            b(t4);
        }
        return t4;
    }
}
