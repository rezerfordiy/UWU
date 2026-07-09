package p0;

import android.os.Handler;
import c.j0;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    public static class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f10052a;

        public a(@j0 Handler handler) {
            this.f10052a = (Handler) u0.i.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@j0 Runnable runnable) {
            if (this.f10052a.post((Runnable) u0.i.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f10052a + " is shutting down");
        }
    }

    @j0
    public static Executor a(@j0 Handler handler) {
        return new a(handler);
    }
}
