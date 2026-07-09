package g2;

import com.sonoptek.pvus_android.loop_view.LoopView;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoopView f7840b;

    public d(LoopView loopView) {
        this.f7840b = loopView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LoopView loopView = this.f7840b;
        loopView.f6093e.a(loopView.getSelectedItem());
    }
}
