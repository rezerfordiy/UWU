package com.sonoptek.pvus_android;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes.dex */
public class MyScrollView extends ScrollView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5082b;

    public MyScrollView(Context context) {
        super(context);
        this.f5082b = true;
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f5082b) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setScroll(boolean z3) {
        this.f5082b = z3;
    }

    public MyScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5082b = true;
    }

    public MyScrollView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f5082b = true;
    }
}
