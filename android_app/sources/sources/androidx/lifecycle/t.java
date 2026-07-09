package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.i;
import c.j0;
import c.k0;
import c.o0;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class t extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f4170c = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f4171b;

    public interface a {
        void a();

        void b();

        void c();
    }

    @o0(29)
    public static class b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@j0 Activity activity, @k0 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@j0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@j0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@j0 Activity activity, @k0 Bundle bundle) {
            t.a(activity, i.b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@j0 Activity activity) {
            t.a(activity, i.b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@j0 Activity activity) {
            t.a(activity, i.b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@j0 Activity activity) {
            t.a(activity, i.b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@j0 Activity activity) {
            t.a(activity, i.b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@j0 Activity activity) {
            t.a(activity, i.b.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@j0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@j0 Activity activity, @j0 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@j0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@j0 Activity activity) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@j0 Activity activity, @j0 i.b bVar) {
        if (activity instanceof n) {
            ((n) activity).a().j(bVar);
        } else if (activity instanceof l) {
            i iVarA = ((l) activity).a();
            if (iVarA instanceof m) {
                ((m) iVarA).j(bVar);
            }
        }
    }

    public static t f(Activity activity) {
        return (t) activity.getFragmentManager().findFragmentByTag(f4170c);
    }

    public static void g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag(f4170c) == null) {
            fragmentManager.beginTransaction().add(new t(), f4170c).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void b(@j0 i.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), bVar);
        }
    }

    public final void c(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void d(a aVar) {
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void e(a aVar) {
        if (aVar != null) {
            aVar.c();
        }
    }

    public void h(a aVar) {
        this.f4171b = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.f4171b);
        b(i.b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        b(i.b.ON_DESTROY);
        this.f4171b = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        b(i.b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        d(this.f4171b);
        b(i.b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        e(this.f4171b);
        b(i.b.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        b(i.b.ON_STOP);
    }
}
