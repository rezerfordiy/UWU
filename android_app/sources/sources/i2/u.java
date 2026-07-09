package i2;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.sonoHealth.microVUE.R;
import i2.f;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public class u extends t {
    @Override // i2.t, i2.d0
    public void N(Canvas canvas) {
        String str;
        super.N(canvas);
        if (this.f8092l) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(1879113472);
            f.b bVar = this.f8088h;
            float f4 = bVar.f8109b;
            float f5 = bVar.f8110c;
            canvas.drawRect(f4, f5, f4 + bVar.f8111d, f5 + bVar.f8112e, paint);
        }
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setStrokeWidth(2.0f);
        paint2.setTextSize(f.f8083s);
        DecimalFormat decimalFormat = new DecimalFormat("##0.00");
        float fM = M();
        float fP = P(fM / 10.0f);
        d.f8064e.getResources().getString(R.string.human_fl1);
        decimalFormat.format(fM);
        if (fP > 0.0f) {
            str = d.f8064e.getResources().getString(R.string.human_efw) + ": " + decimalFormat.format(fP) + "g";
        } else {
            str = "--";
        }
        f.b bVar2 = this.f8088h;
        canvas.drawText(str, bVar2.f8109b + (f.f8085u / 2.0f), bVar2.f8110c + (f.f8084t * 4.0f), paint2);
    }

    public final float P(float f4) {
        return (f4 * 747.42f) - 2232.56f;
    }

    @Override // i2.t, i2.f
    public int i() {
        return 4;
    }
}
