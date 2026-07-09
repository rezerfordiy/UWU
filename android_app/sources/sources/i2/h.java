package i2;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.sonoHealth.microVUE.R;
import i2.f;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public class h extends g {
    @Override // i2.g, i2.j
    public void P(Canvas canvas) {
        String str;
        super.P(canvas);
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
        float fN = N();
        d.f8064e.getResources().getString(R.string.human_ac1);
        decimalFormat.format(fN);
        float fR = R(fN / 10.0f);
        if (fR > 0.0f) {
            str = d.f8064e.getResources().getString(R.string.human_efw) + ": " + decimalFormat.format(fR) + "g";
        } else {
            str = "--";
        }
        f.b bVar2 = this.f8088h;
        canvas.drawText(str, bVar2.f8109b + (f.f8085u / 2.0f), bVar2.f8110c + (f.f8084t * 4.0f), paint2);
    }

    public final float R(float f4) {
        return (f4 * 171.48f) - 2686.6f;
    }

    @Override // i2.g, i2.j, i2.f
    public int i() {
        return 4;
    }
}
