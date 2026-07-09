package g2;

import androidx.appcompat.widget.ActivityChooserView;
import com.sonoptek.pvus_android.loop_view.LoopView;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class e extends TimerTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7841b = ActivityChooserView.f.f1331h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7842c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LoopView f7844e;

    public e(LoopView loopView, int i4) {
        this.f7844e = loopView;
        this.f7843d = i4;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f7841b == Integer.MAX_VALUE) {
            this.f7841b = this.f7843d;
        }
        int i4 = this.f7841b;
        int i5 = (int) (i4 * 0.1f);
        this.f7842c = i5;
        if (i5 == 0) {
            this.f7842c = i4 < 0 ? -1 : 1;
        }
        if (Math.abs(i4) <= 0) {
            this.f7844e.a();
            this.f7844e.f6091c.sendEmptyMessage(3000);
        } else {
            LoopView loopView = this.f7844e;
            loopView.D += this.f7842c;
            loopView.f6091c.sendEmptyMessage(1000);
            this.f7841b -= this.f7842c;
        }
    }
}
