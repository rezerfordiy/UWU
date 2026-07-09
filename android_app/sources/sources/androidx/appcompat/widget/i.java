package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f1720c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProgressBar f1721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f1722b;

    public i(ProgressBar progressBar) {
        this.f1721a = progressBar;
    }

    public final Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    public Bitmap b() {
        return this.f1722b;
    }

    public void c(AttributeSet attributeSet, int i4) {
        e1 e1VarG = e1.G(this.f1721a.getContext(), attributeSet, f1720c, i4, 0);
        Drawable drawableI = e1VarG.i(0);
        if (drawableI != null) {
            this.f1721a.setIndeterminateDrawable(e(drawableI));
        }
        Drawable drawableI2 = e1VarG.i(1);
        if (drawableI2 != null) {
            this.f1721a.setProgressDrawable(d(drawableI2, false));
        }
        e1VarG.I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable d(Drawable drawable, boolean z3) {
        if (drawable instanceof h0.n) {
            h0.n nVar = (h0.n) drawable;
            Drawable drawableA = nVar.a();
            if (drawableA != null) {
                nVar.b(d(drawableA, z3));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i4 = 0; i4 < numberOfLayers; i4++) {
                    int id = layerDrawable.getId(i4);
                    drawableArr[i4] = d(layerDrawable.getDrawable(i4), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i5 = 0; i5 < numberOfLayers; i5++) {
                    layerDrawable2.setId(i5, layerDrawable.getId(i5));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f1722b == null) {
                    this.f1722b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z3 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public final Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i4 = 0; i4 < numberOfFrames; i4++) {
            Drawable drawableD = d(animationDrawable.getFrame(i4), true);
            drawableD.setLevel(10000);
            animationDrawable2.addFrame(drawableD, animationDrawable.getDuration(i4));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }
}
