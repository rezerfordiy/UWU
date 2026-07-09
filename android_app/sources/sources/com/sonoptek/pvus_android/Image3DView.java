package com.sonoptek.pvus_android;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.sonoptek.pvus_android.e;

/* JADX INFO: loaded from: classes.dex */
public class Image3DView extends ImageView {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f4864q = 50.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f4865r = 150.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Camera f4867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f4868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bitmap f4869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4874j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4875k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f4877m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f4878n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f4879o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f4880p;

    public Image3DView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4866b = false;
        this.f4867c = new Camera();
        this.f4868d = new Matrix();
        b(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r2 > r0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        if (r2 < (-r0)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cb, code lost:
    
        if (r2 > r0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ce, code lost:
    
        r0 = r0 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0133, code lost:
    
        if (r2 < (-r0)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0138, code lost:
    
        r0 = r0 + r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sonoptek.pvus_android.Image3DView.a():void");
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f5910c);
        this.f4866b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void c() {
        if (this.f4869e == null) {
            setDrawingCacheEnabled(true);
            buildDrawingCache();
            this.f4869e = getDrawingCache();
        }
        this.f4873i = Image3DSwitchView.f4846z;
        this.f4875k = getWidth() + 10;
        this.f4874j = Image3DSwitchView.A;
        this.f4876l = getHeight() + 10;
    }

    public final boolean d() {
        if (this.f4866b) {
            int i4 = this.f4870f;
            if (i4 == 0) {
                int i5 = this.f4872h;
                int i6 = this.f4874j;
                int i7 = this.f4876l;
                if (i5 < ((i6 - i7) / 2) - i7) {
                    return true;
                }
            } else if (i4 != 1) {
                if (i4 == 2) {
                    int i8 = this.f4872h;
                    int i9 = this.f4874j;
                    int i10 = this.f4876l;
                    if (i8 <= (i9 / 2) + (i10 / 2) && i8 >= ((-i9) / 2) - (i10 / 2)) {
                        return true;
                    }
                } else if (i4 != 3) {
                    if (i4 == 4) {
                        int i11 = this.f4872h;
                        int i12 = this.f4876l;
                        if (i11 > i12 - ((this.f4874j - i12) / 2)) {
                            return true;
                        }
                    }
                } else if (this.f4872h >= (-(this.f4874j - this.f4876l)) / 2) {
                    return true;
                }
            } else if (this.f4872h <= (this.f4874j - this.f4876l) / 2) {
                return true;
            }
            return false;
        }
        int i13 = this.f4870f;
        if (i13 == 0) {
            int i14 = this.f4871g;
            int i15 = this.f4873i;
            int i16 = this.f4875k;
            if (i14 < ((i15 - i16) / 2) - i16) {
                return true;
            }
        } else if (i13 != 1) {
            if (i13 == 2) {
                int i17 = this.f4871g;
                int i18 = this.f4873i;
                int i19 = this.f4875k;
                if (i17 <= (i18 / 2) + (i19 / 2) && i17 >= ((-i18) / 2) - (i19 / 2)) {
                    return true;
                }
            } else if (i13 != 3) {
                if (i13 == 4) {
                    int i20 = this.f4871g;
                    int i21 = this.f4875k;
                    if (i20 > i21 - ((this.f4873i - i21) / 2)) {
                        return true;
                    }
                }
            } else if (this.f4871g >= (-(this.f4873i - this.f4875k)) / 2) {
                return true;
            }
        } else if (this.f4871g <= (this.f4873i - this.f4875k) / 2) {
            return true;
        }
        return false;
    }

    public void e() {
        Bitmap bitmap = this.f4869e;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f4869e.recycle();
    }

    public void f(int i4, int i5) {
        this.f4870f = i4;
        this.f4871g = i5;
        this.f4872h = i5;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Matrix matrix;
        float width;
        float height;
        if (this.f4869e == null) {
            super.onDraw(canvas);
            return;
        }
        if (d()) {
            a();
            this.f4867c.save();
            this.f4867c.translate(0.0f, 0.0f, this.f4880p);
            if (this.f4866b) {
                this.f4867c.rotateX(-this.f4877m);
            } else {
                this.f4867c.rotateY(this.f4877m);
            }
            this.f4867c.getMatrix(this.f4868d);
            this.f4867c.restore();
            if (this.f4866b) {
                this.f4868d.preTranslate((-getWidth()) / 2, -this.f4879o);
                matrix = this.f4868d;
                width = getWidth() / 2;
                height = this.f4879o;
            } else {
                this.f4868d.preTranslate(-this.f4878n, (-getHeight()) / 2);
                matrix = this.f4868d;
                width = this.f4878n;
                height = getHeight() / 2;
            }
            matrix.postTranslate(width, height);
            canvas.drawBitmap(this.f4869e, this.f4868d, null);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f4869e = null;
        c();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f4869e = null;
        c();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        super.setImageResource(i4);
        this.f4869e = null;
        c();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.f4869e = null;
        c();
    }

    public void setVertical(boolean z3) {
        this.f4866b = z3;
    }
}
