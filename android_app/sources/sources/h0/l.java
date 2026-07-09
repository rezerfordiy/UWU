package h0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import c.j0;
import c.k0;
import java.io.InputStream;
import v0.t;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8013a = "RoundedBitmapDrawableFa";

    public static class a extends k {
        public a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // h0.k
        public void f(int i4, int i5, int i6, Rect rect, Rect rect2) {
            t.b(i4, i5, i6, rect, rect2, 0);
        }

        @Override // h0.k
        public boolean h() {
            Bitmap bitmap = this.f8000a;
            return bitmap != null && g0.a.b(bitmap);
        }

        @Override // h0.k
        public void o(boolean z3) {
            Bitmap bitmap = this.f8000a;
            if (bitmap != null) {
                g0.a.c(bitmap, z3);
                invalidateSelf();
            }
        }
    }

    @j0
    public static k a(@j0 Resources resources, @k0 Bitmap bitmap) {
        return new j(resources, bitmap);
    }

    @j0
    public static k b(@j0 Resources resources, @j0 InputStream inputStream) {
        k kVarA = a(resources, BitmapFactory.decodeStream(inputStream));
        if (kVarA.b() == null) {
            Log.w(f8013a, "RoundedBitmapDrawable cannot decode " + inputStream);
        }
        return kVarA;
    }

    @j0
    public static k c(@j0 Resources resources, @j0 String str) {
        k kVarA = a(resources, BitmapFactory.decodeFile(str));
        if (kVarA.b() == null) {
            Log.w(f8013a, "RoundedBitmapDrawable cannot decode " + str);
        }
        return kVarA;
    }
}
