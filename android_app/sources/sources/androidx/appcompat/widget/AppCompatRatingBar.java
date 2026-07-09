package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import e.a;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f1369b;

    public AppCompatRatingBar(@c.j0 Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        Bitmap bitmapB = this.f1369b.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i4, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(@c.j0 Context context, @c.k0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.P2);
    }

    public AppCompatRatingBar(@c.j0 Context context, @c.k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        z0.a(this, getContext());
        i iVar = new i(this);
        this.f1369b = iVar;
        iVar.c(attributeSet, i4);
    }
}
