package g2;

import android.os.Handler;
import com.sonoptek.pvus_android.loop_view.LoopView;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class a extends TimerTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f7836b = 2.1474836E9f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LoopView f7838d;

    public a(LoopView loopView, float f4) {
        this.f7838d = loopView;
        this.f7837c = f4;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Handler handler;
        int i4;
        float f4;
        if (this.f7836b == 2.1474836E9f) {
            if (Math.abs(this.f7837c) <= 2000.0f) {
                f4 = this.f7837c;
            } else if (this.f7837c > 0.0f) {
                this.f7836b = 2000.0f;
            } else {
                f4 = -2000.0f;
            }
            this.f7836b = f4;
        }
        if (Math.abs(this.f7836b) < 0.0f || Math.abs(this.f7836b) > 20.0f) {
            int i5 = (int) ((this.f7836b * 10.0f) / 1000.0f);
            LoopView loopView = this.f7838d;
            int i6 = loopView.D - i5;
            loopView.D = i6;
            if (!loopView.A) {
                float f5 = loopView.f6114z * loopView.f6104p;
                int i7 = loopView.E;
                if (i6 <= ((int) ((-i7) * f5))) {
                    this.f7836b = 40.0f;
                    loopView.D = (int) ((-i7) * f5);
                } else {
                    int size = loopView.f6100l.size() - 1;
                    LoopView loopView2 = this.f7838d;
                    if (i6 >= ((int) ((size - loopView2.E) * f5))) {
                        loopView2.D = (int) (((loopView2.f6100l.size() - 1) - this.f7838d.E) * f5);
                        this.f7836b = -40.0f;
                    }
                }
            }
            float f6 = this.f7836b;
            this.f7836b = f6 < 0.0f ? f6 + 20.0f : f6 - 20.0f;
            handler = this.f7838d.f6091c;
            i4 = 1000;
        } else {
            this.f7838d.a();
            handler = this.f7838d.f6091c;
            i4 = com.sonoptek.pvus_android.loop_view.a.f6120c;
        }
        handler.sendEmptyMessage(i4);
    }
}
