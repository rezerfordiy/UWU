package l2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sonoHealth.microVUE.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.sonoptek.pvus_android.view.f {
    public final int T;
    public TextView U;
    public TextView V;
    public Handler W;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 100001) {
                return;
            }
            e.this.J();
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Message message = new Message();
            message.what = 100001;
            e.this.W.sendMessage(message);
        }
    }

    public e(Activity activity) {
        super(activity);
        this.T = 100001;
        this.W = new a();
    }

    public static synchronized e G(Activity activity) {
        return new e(activity);
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void B(boolean z3) {
        super.B(z3);
        H(z3 ? 10 : 0);
    }

    public void H(int i4) {
        this.U.setTextColor(Color.argb(i, 255, 255, 255));
        this.V.setTextColor(Color.argb(i, 255, 255, 255));
    }

    public void I() {
        new Timer().schedule(new b(), 0L, 1000L);
    }

    public void J() {
        this.U.setText(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void a() {
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void h(Activity activity) {
        super.h(activity);
        View viewInflate = this.f6548f.getLayoutInflater().inflate(R.layout.null_viewer, (ViewGroup) null);
        this.f6549g = viewInflate;
        this.U = (TextView) viewInflate.findViewById(R.id.null_timelabel);
        this.V = (TextView) this.f6549g.findViewById(R.id.null_gainlabel);
        this.f6554l = (TextView) this.f6549g.findViewById(R.id.null_live_label);
        this.f6555m = (TextView) this.f6549g.findViewById(R.id.null_count_label);
        this.f6566x = (LinearLayout) this.f6549g.findViewById(R.id.null_information);
        this.V.setText("--");
        this.f6554l.setText(this.f6549g.getResources().getString(R.string.freeze));
        this.f6555m.setText("0/0");
    }

    @Override // com.sonoptek.pvus_android.view.f
    public void o(b2.f fVar) {
    }
}
