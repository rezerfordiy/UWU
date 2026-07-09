package a0;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f11a = "android.activity.usage_time";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f12b = "android.usage_time_packages";

    @c.o0(16)
    public static class a extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ActivityOptions f13c;

        public a(ActivityOptions activityOptions) {
            this.f13c = activityOptions;
        }

        @Override // a0.d
        public Rect a() {
            return this.f13c.getLaunchBounds();
        }

        @Override // a0.d
        public void j(@c.j0 PendingIntent pendingIntent) {
            this.f13c.requestUsageTimeReport(pendingIntent);
        }

        @Override // a0.d
        @c.j0
        public d k(@c.k0 Rect rect) {
            return new a(this.f13c.setLaunchBounds(rect));
        }

        @Override // a0.d
        public Bundle l() {
            return this.f13c.toBundle();
        }

        @Override // a0.d
        public void m(@c.j0 d dVar) {
            if (dVar instanceof a) {
                this.f13c.update(((a) dVar).f13c);
            }
        }
    }

    @c.j0
    public static d b() {
        return new a(ActivityOptions.makeBasic());
    }

    @c.j0
    public static d c(@c.j0 View view, int i4, int i5, int i6, int i7) {
        return new a(ActivityOptions.makeClipRevealAnimation(view, i4, i5, i6, i7));
    }

    @c.j0
    public static d d(@c.j0 Context context, int i4, int i5) {
        return new a(ActivityOptions.makeCustomAnimation(context, i4, i5));
    }

    @c.j0
    public static d e(@c.j0 View view, int i4, int i5, int i6, int i7) {
        return new a(ActivityOptions.makeScaleUpAnimation(view, i4, i5, i6, i7));
    }

    @c.j0
    public static d f(@c.j0 Activity activity, @c.j0 View view, @c.j0 String str) {
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    @c.j0
    public static d g(@c.j0 Activity activity, u0.f<View, String>... fVarArr) {
        Pair[] pairArr;
        if (fVarArr != null) {
            pairArr = new Pair[fVarArr.length];
            for (int i4 = 0; i4 < fVarArr.length; i4++) {
                u0.f<View, String> fVar = fVarArr[i4];
                pairArr[i4] = Pair.create(fVar.f11560a, fVar.f11561b);
            }
        } else {
            pairArr = null;
        }
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    @c.j0
    public static d h() {
        return new a(ActivityOptions.makeTaskLaunchBehind());
    }

    @c.j0
    public static d i(@c.j0 View view, @c.j0 Bitmap bitmap, int i4, int i5) {
        return new a(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i4, i5));
    }

    @c.k0
    public Rect a() {
        return null;
    }

    public void j(@c.j0 PendingIntent pendingIntent) {
    }

    @c.j0
    public d k(@c.k0 Rect rect) {
        return this;
    }

    @c.k0
    public Bundle l() {
        return null;
    }

    public void m(@c.j0 d dVar) {
    }
}
