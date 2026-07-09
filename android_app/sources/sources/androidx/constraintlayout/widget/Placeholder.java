package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import org.dcm4che3.imageio.codec.jpeg.JPEG;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f2341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2342d;

    public Placeholder(Context context) {
        super(context);
        this.f2340b = -1;
        this.f2341c = null;
        this.f2342d = 4;
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        super.setVisibility(this.f2342d);
        this.f2340b = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.I7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == e.m.J7) {
                    this.f2340b = typedArrayObtainStyledAttributes.getResourceId(index, this.f2340b);
                } else if (index == e.m.K7) {
                    this.f2342d = typedArrayObtainStyledAttributes.getInt(index, this.f2342d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f2341c == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f2341c.getLayoutParams();
        layoutParams2.f2288n0.G1(0);
        e.b bVarH = layoutParams.f2288n0.H();
        e.b bVar = e.b.FIXED;
        if (bVarH != bVar) {
            layoutParams.f2288n0.H1(layoutParams2.f2288n0.j0());
        }
        if (layoutParams.f2288n0.g0() != bVar) {
            layoutParams.f2288n0.d1(layoutParams2.f2288n0.D());
        }
        layoutParams2.f2288n0.G1(8);
    }

    public void c(ConstraintLayout constraintLayout) {
        if (this.f2340b == -1 && !isInEditMode()) {
            setVisibility(this.f2342d);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f2340b);
        this.f2341c = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.LayoutParams) viewFindViewById.getLayoutParams()).f2264b0 = true;
            this.f2341c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2341c;
    }

    public int getEmptyVisibility() {
        return this.f2342d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(JPEG.EXP, JPEG.EXP, JPEG.EXP);
            Paint paint = new Paint();
            paint.setARGB(255, JPEG.RST2, JPEG.RST2, JPEG.RST2);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i4) {
        View viewFindViewById;
        if (this.f2340b == i4) {
            return;
        }
        View view = this.f2341c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f2341c.getLayoutParams()).f2264b0 = false;
            this.f2341c = null;
        }
        this.f2340b = i4;
        if (i4 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i4)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i4) {
        this.f2342d = i4;
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2340b = -1;
        this.f2341c = null;
        this.f2342d = 4;
        a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f2340b = -1;
        this.f2341c = null;
        this.f2342d = 4;
        a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4);
        this.f2340b = -1;
        this.f2341c = null;
        this.f2342d = 4;
        a(attributeSet);
    }
}
