package a0;

import a0.o4;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.DragEvent;
import android.view.View;
import c.r0;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b extends b0.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static e f3d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String[] f4b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f5c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f6d;

        public a(String[] strArr, Activity activity, int i4) {
            this.f4b = strArr;
            this.f5c = activity;
            this.f6d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f4b.length];
            PackageManager packageManager = this.f5c.getPackageManager();
            String packageName = this.f5c.getPackageName();
            int length = this.f4b.length;
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = packageManager.checkPermission(this.f4b[i4], packageName);
            }
            ((d) this.f5c).onRequestPermissionsResult(this.f6d, this.f4b, iArr);
        }
    }

    /* JADX INFO: renamed from: a0.b$b, reason: collision with other inner class name */
    public class RunnableC0000b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f7b;

        public RunnableC0000b(Activity activity) {
            this.f7b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7b.isFinishing() || a0.e.i(this.f7b)) {
                return;
            }
            this.f7b.recreate();
        }
    }

    @c.o0(30)
    public static class c {
        public static void a(@c.j0 Activity activity, @c.k0 b0.g gVar, @c.k0 Bundle bundle) {
            activity.setLocusContext(gVar == null ? null : gVar.c(), bundle);
        }
    }

    public interface d {
        void onRequestPermissionsResult(int i4, @c.j0 String[] strArr, @c.j0 int[] iArr);
    }

    public interface e {
        boolean a(@c.j0 Activity activity, @c.j0 String[] strArr, @c.b0(from = 0) int i4);

        boolean b(@c.j0 Activity activity, @c.b0(from = 0) int i4, int i5, @c.k0 Intent intent);
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public interface f {
        void b(int i4);
    }

    @c.o0(21)
    public static class g extends SharedElementCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o4 f8a;

        public class a implements o4.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SharedElementCallback.OnSharedElementsReadyListener f9a;

            public a(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
                this.f9a = onSharedElementsReadyListener;
            }

            @Override // a0.o4.a
            public void a() {
                this.f9a.onSharedElementsReady();
            }
        }

        public g(o4 o4Var) {
            this.f8a = o4Var;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f8a.b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f8a.c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f8a.d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f8a.e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f8a.f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f8a.g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        @c.o0(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f8a.h(list, list2, new a(onSharedElementsReadyListener));
        }
    }

    public static void A(@c.j0 Activity activity) {
        if (Build.VERSION.SDK_INT < 28 && a0.e.i(activity)) {
            return;
        }
        activity.recreate();
    }

    @c.k0
    public static v0.q B(Activity activity, DragEvent dragEvent) {
        return v0.q.b(activity, dragEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void C(@c.j0 Activity activity, @c.j0 String[] strArr, @c.b0(from = 0) int i4) {
        e eVar = f3d;
        if (eVar == null || !eVar.a(activity, strArr, i4)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (activity instanceof f) {
                ((f) activity).b(i4);
            }
            activity.requestPermissions(strArr, i4);
        }
    }

    @c.j0
    public static <T extends View> T D(@c.j0 Activity activity, @c.y int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) activity.requireViewById(i4);
        }
        T t4 = (T) activity.findViewById(i4);
        if (t4 != null) {
            return t4;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void E(@c.j0 Activity activity, @c.k0 o4 o4Var) {
        activity.setEnterSharedElementCallback(o4Var != null ? new g(o4Var) : null);
    }

    public static void F(@c.j0 Activity activity, @c.k0 o4 o4Var) {
        activity.setExitSharedElementCallback(o4Var != null ? new g(o4Var) : null);
    }

    public static void G(@c.j0 Activity activity, @c.k0 b0.g gVar, @c.k0 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(activity, gVar, bundle);
        }
    }

    public static void H(@c.k0 e eVar) {
        f3d = eVar;
    }

    public static boolean I(@c.j0 Activity activity, @c.j0 String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static void J(@c.j0 Activity activity, @c.j0 Intent intent, int i4, @c.k0 Bundle bundle) {
        activity.startActivityForResult(intent, i4, bundle);
    }

    public static void K(@c.j0 Activity activity, @c.j0 IntentSender intentSender, int i4, @c.k0 Intent intent, int i5, int i6, int i7, @c.k0 Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
    }

    public static void L(@c.j0 Activity activity) {
        activity.startPostponedEnterTransition();
    }

    public static void u(@c.j0 Activity activity) {
        activity.finishAffinity();
    }

    public static void v(@c.j0 Activity activity) {
        activity.finishAfterTransition();
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static e w() {
        return f3d;
    }

    @c.k0
    public static Uri x(@c.j0 Activity activity) {
        return activity.getReferrer();
    }

    @Deprecated
    public static boolean y(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static void z(@c.j0 Activity activity) {
        activity.postponeEnterTransition();
    }
}
