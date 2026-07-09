package m;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c.j0;
import c.k0;
import c.r0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8522a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f8523b = Executors.newFixedThreadPool(4, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @k0
    public volatile Handler f8524c;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f8525c = "arch_disk_io_%d";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f8526a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(f8525c, Integer.valueOf(this.f8526a.getAndIncrement())));
            return thread;
        }
    }

    public static Handler e(@j0 Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // m.d
    public void a(Runnable runnable) {
        this.f8523b.execute(runnable);
    }

    @Override // m.d
    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // m.d
    public void d(Runnable runnable) {
        if (this.f8524c == null) {
            synchronized (this.f8522a) {
                if (this.f8524c == null) {
                    this.f8524c = e(Looper.getMainLooper());
                }
            }
        }
        this.f8524c.post(runnable);
    }
}
