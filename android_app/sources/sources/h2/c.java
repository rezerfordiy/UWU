package h2;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f8035h = 120;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f8036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f8037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f8038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f8039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f8040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f8041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f8042g;

    public c(b bVar) {
        this.f8036a = bVar;
    }

    public final float a(MotionEvent motionEvent) {
        this.f8039d = motionEvent.getX(0);
        this.f8040e = motionEvent.getY(0);
        this.f8041f = motionEvent.getX(1);
        float y3 = motionEvent.getY(1);
        this.f8042g = y3;
        return (y3 - this.f8040e) / (this.f8041f - this.f8039d);
    }

    public void b(MotionEvent motionEvent) {
        float fA;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 2) {
            if ((actionMasked != 5 && actionMasked != 6) || motionEvent.getPointerCount() != 2) {
                return;
            } else {
                fA = a(motionEvent);
            }
        } else {
            if (motionEvent.getPointerCount() <= 1) {
                return;
            }
            float fA2 = a(motionEvent);
            this.f8038c = fA2;
            double degrees = Math.toDegrees(Math.atan(fA2)) - Math.toDegrees(Math.atan(this.f8037b));
            if (Math.abs(degrees) <= 120.0d) {
                this.f8036a.a((float) degrees, (this.f8041f + this.f8039d) / 2.0f, (this.f8042g + this.f8040e) / 2.0f);
            }
            fA = this.f8038c;
        }
        this.f8037b = fA;
    }
}
