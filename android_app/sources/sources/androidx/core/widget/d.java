package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import c.j0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EdgeEffect f3497a;

    @Deprecated
    public d(Context context) {
        this.f3497a = new EdgeEffect(context);
    }

    public static void e(@j0 EdgeEffect edgeEffect, float f4, float f5) {
        edgeEffect.onPull(f4, f5);
    }

    @Deprecated
    public boolean a(Canvas canvas) {
        return this.f3497a.draw(canvas);
    }

    @Deprecated
    public void b() {
        this.f3497a.finish();
    }

    @Deprecated
    public boolean c() {
        return this.f3497a.isFinished();
    }

    @Deprecated
    public boolean d(int i4) {
        this.f3497a.onAbsorb(i4);
        return true;
    }

    @Deprecated
    public boolean f(float f4) {
        this.f3497a.onPull(f4);
        return true;
    }

    @Deprecated
    public boolean g(float f4, float f5) {
        e(this.f3497a, f4, f5);
        return true;
    }

    @Deprecated
    public boolean h() {
        this.f3497a.onRelease();
        return this.f3497a.isFinished();
    }

    @Deprecated
    public void i(int i4, int i5) {
        this.f3497a.setSize(i4, i5);
    }
}
