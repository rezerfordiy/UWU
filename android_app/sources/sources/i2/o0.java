package i2;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.sonoHealth.microVUE.R;
import i2.f;
import java.io.Serializable;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public class o0 extends f implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d0 f8167v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d0 f8168w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d0 f8169x;

    public final float M() {
        return (((this.f8167v.M() * this.f8168w.M()) * this.f8169x.M()) * 0.52f) / 1000.0f;
    }

    public void N(f fVar) {
        d0 d0Var = (d0) fVar;
        d0 d0Var2 = this.f8167v;
        if (d0Var2 == null || d0Var2 == fVar) {
            this.f8167v = d0Var;
            return;
        }
        d0 d0Var3 = this.f8168w;
        if (d0Var3 == null || d0Var3 == fVar) {
            this.f8168w = d0Var;
            return;
        }
        d0 d0Var4 = this.f8169x;
        if (d0Var4 == null || d0Var4 == fVar) {
            this.f8169x = d0Var;
        }
    }

    @Override // i2.d
    public void b(Canvas canvas) {
        super.b(canvas);
        if (this.f8167v == null || this.f8168w == null || this.f8169x == null) {
            return;
        }
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStrokeWidth(2.0f);
        paint.setTextSize(f.f8083s);
        String str = d.f8064e.getResources().getString(R.string.measure_volume) + ": " + new DecimalFormat("##0.00").format(M()) + "ml";
        f.b bVar = this.f8088h;
        canvas.drawText(str, bVar.f8109b + (f.f8085u / 2.0f), bVar.f8110c + f.f8084t, paint);
    }

    @Override // i2.f
    public boolean y() {
        return true;
    }
}
