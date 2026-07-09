package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import e.a;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f1370b;

    public AppCompatSeekBar(@c.j0 Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1370b.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1370b.l();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1370b.g(canvas);
    }

    public AppCompatSeekBar(@c.j0 Context context, @c.k0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.V2);
    }

    public AppCompatSeekBar(@c.j0 Context context, @c.k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        z0.a(this, getContext());
        l lVar = new l(this);
        this.f1370b = lVar;
        lVar.c(attributeSet, i4);
    }
}
