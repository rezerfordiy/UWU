package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import c.g0;
import c.j0;
import c.k0;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @k0
    public final Runnable f550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<b> f551b;

    public class LifecycleOnBackPressedCancellable implements j, androidx.activity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @k0
        public androidx.activity.a f554c;

        public LifecycleOnBackPressedCancellable(@j0 i iVar, @j0 b bVar) {
            this.f552a = iVar;
            this.f553b = bVar;
            iVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f552a.c(this);
            this.f553b.e(this);
            androidx.activity.a aVar = this.f554c;
            if (aVar != null) {
                aVar.cancel();
                this.f554c = null;
            }
        }

        @Override // androidx.lifecycle.j
        public void d(@j0 l lVar, @j0 i.b bVar) {
            if (bVar == i.b.ON_START) {
                this.f554c = OnBackPressedDispatcher.this.c(this.f553b);
                return;
            }
            if (bVar != i.b.ON_STOP) {
                if (bVar == i.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar = this.f554c;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }
    }

    public class a implements androidx.activity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f556a;

        public a(b bVar) {
            this.f556a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f551b.remove(this.f556a);
            this.f556a.e(this);
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    @g0
    public void a(@j0 b bVar) {
        c(bVar);
    }

    @g0
    @SuppressLint({"LambdaLast"})
    public void b(@j0 l lVar, @j0 b bVar) {
        i iVarA = lVar.a();
        if (iVarA.b() == i.c.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(iVarA, bVar));
    }

    @g0
    @j0
    public androidx.activity.a c(@j0 b bVar) {
        this.f551b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    @g0
    public boolean d() {
        Iterator<b> itDescendingIterator = this.f551b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (itDescendingIterator.next().c()) {
                return true;
            }
        }
        return false;
    }

    @g0
    public void e() {
        Iterator<b> itDescendingIterator = this.f551b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            b next = itDescendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f550a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public OnBackPressedDispatcher(@k0 Runnable runnable) {
        this.f551b = new ArrayDeque<>();
        this.f550a = runnable;
    }
}
