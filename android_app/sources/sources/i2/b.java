package i2;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.sonoptek.pvus_android.MyApplication;
import i2.f;

/* JADX INFO: loaded from: classes.dex */
public class b extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f8053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f.b f8054g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8055h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f8056i = MyApplication.u() * 14.0f;

    @Override // i2.d
    public void a() {
        this.f8055h = false;
    }

    @Override // i2.d
    public void b(Canvas canvas) {
        if (this.f8054g == null || this.f8055h) {
            return;
        }
        String str = this.f8053f;
        String str2 = (str == null || str.length() <= 0) ? "ANNOTATE" : this.f8053f;
        TextPaint textPaint = new TextPaint();
        textPaint.setARGB(255, 255, 255, 255);
        textPaint.setTextSize(this.f8056i);
        textPaint.setAntiAlias(true);
        StaticLayout staticLayout = new StaticLayout(str2, textPaint, (int) this.f8054g.f8111d, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        canvas.save();
        f.b bVar = this.f8054g;
        canvas.translate(bVar.f8109b, bVar.f8110c);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    @Override // i2.d
    public d c(PointF pointF) {
        f.b bVar = this.f8054g;
        if (bVar == null || pointF == null || !bVar.b(pointF.x, pointF.y)) {
            return null;
        }
        this.f8055h = true;
        return this;
    }

    @Override // i2.d
    public boolean e() {
        return this.f8054g != null;
    }

    @Override // i2.d
    public int f() {
        return 2;
    }

    public f.b g() {
        return this.f8054g;
    }

    public String h() {
        return this.f8053f;
    }

    public void i() {
        this.f8055h = true;
    }

    public void j(float f4) {
        this.f8056i = f4;
    }

    public void k(f.b bVar) {
        this.f8054g = bVar;
    }

    public void l(String str) {
        this.f8053f = str;
    }
}
