package g2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.sonoptek.pvus_android.loop_view.LoopView;

/* JADX INFO: loaded from: classes.dex */
public final class b extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoopView f7839a;

    public b(LoopView loopView) {
        this.f7839a = loopView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f4, float f5) {
        this.f7839a.g(f5);
        return true;
    }
}
