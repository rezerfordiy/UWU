package com.sonoptek.pvus_android.measure;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import c.k0;
import com.sonoptek.pvus_android.MyApplication;
import i2.b;
import i2.e;
import i2.f;

/* JADX INFO: loaded from: classes.dex */
public class USMarkView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f6184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f6185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f6186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f6187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f6188f;

    public USMarkView(Context context) {
        super(context);
        this.f6184b = new e();
        this.f6185c = null;
        this.f6186d = null;
        this.f6187e = null;
        this.f6188f = null;
    }

    public static Bitmap a(int i4, boolean z3) {
        return z3 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? MyApplication.o() : MyApplication.D() : MyApplication.A() : MyApplication.w() : MyApplication.r() : i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? MyApplication.n() : MyApplication.C() : MyApplication.z() : MyApplication.v() : MyApplication.q();
    }

    public void b(e eVar) {
        this.f6184b = eVar;
        this.f6185c = null;
        this.f6186d = null;
        this.f6187e = null;
        this.f6188f = null;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f6184b.b(canvas);
    }

    public USMarkView(Context context, @k0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6184b = new e();
        this.f6185c = null;
        this.f6186d = null;
        this.f6187e = null;
        this.f6188f = null;
    }

    public USMarkView(Context context, @k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6184b = new e();
        this.f6185c = null;
        this.f6186d = null;
        this.f6187e = null;
        this.f6188f = null;
    }
}
