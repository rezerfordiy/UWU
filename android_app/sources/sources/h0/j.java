package h0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import c.j0;
import c.o0;

/* JADX INFO: loaded from: classes.dex */
@o0(21)
public class j extends k {
    public j(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // h0.k
    public void f(int i4, int i5, int i6, Rect rect, Rect rect2) {
        Gravity.apply(i4, i5, i6, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@j0 Outline outline) {
        t();
        outline.setRoundRect(this.f8007h, c());
    }

    @Override // h0.k
    public boolean h() {
        Bitmap bitmap = this.f8000a;
        return bitmap != null && bitmap.hasMipMap();
    }

    @Override // h0.k
    public void o(boolean z3) {
        Bitmap bitmap = this.f8000a;
        if (bitmap != null) {
            bitmap.setHasMipMap(z3);
            invalidateSelf();
        }
    }
}
