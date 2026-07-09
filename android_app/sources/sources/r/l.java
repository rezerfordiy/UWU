package r;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends e {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final float f10613z = 20.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10614y = e.f10497f;

    @Override // r.e
    public void b(HashSet<String> hashSet) {
    }

    public abstract void j(int i4, int i5, float f4, float f5, float f6, float f7);

    public abstract float k();

    public abstract float l();

    public abstract boolean m(int i4, int i5, RectF rectF, RectF rectF2, float f4, float f5);

    public abstract void n(View view, RectF rectF, RectF rectF2, float f4, float f5, String[] strArr, float[] fArr);
}
