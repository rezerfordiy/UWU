package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.e;

/* JADX INFO: loaded from: classes.dex */
public class MockView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f2188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f2189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f2190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Rect f2194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2198l;

    public MockView(Context context) {
        super(context);
        this.f2188b = new Paint();
        this.f2189c = new Paint();
        this.f2190d = new Paint();
        this.f2191e = true;
        this.f2192f = true;
        this.f2193g = null;
        this.f2194h = new Rect();
        this.f2195i = Color.argb(255, 0, 0, 0);
        this.f2196j = Color.argb(255, 200, 200, 200);
        this.f2197k = Color.argb(255, 50, 50, 50);
        this.f2198l = 4;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.lf);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == e.m.nf) {
                    this.f2193g = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == e.m.qf) {
                    this.f2191e = typedArrayObtainStyledAttributes.getBoolean(index, this.f2191e);
                } else if (index == e.m.mf) {
                    this.f2195i = typedArrayObtainStyledAttributes.getColor(index, this.f2195i);
                } else if (index == e.m.of) {
                    this.f2197k = typedArrayObtainStyledAttributes.getColor(index, this.f2197k);
                } else if (index == e.m.pf) {
                    this.f2196j = typedArrayObtainStyledAttributes.getColor(index, this.f2196j);
                } else if (index == e.m.rf) {
                    this.f2192f = typedArrayObtainStyledAttributes.getBoolean(index, this.f2192f);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f2193g == null) {
            try {
                this.f2193g = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f2188b.setColor(this.f2195i);
        this.f2188b.setAntiAlias(true);
        this.f2189c.setColor(this.f2196j);
        this.f2189c.setAntiAlias(true);
        this.f2190d.setColor(this.f2197k);
        this.f2198l = Math.round(this.f2198l * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f2191e) {
            width--;
            height--;
            float f4 = width;
            float f5 = height;
            canvas.drawLine(0.0f, 0.0f, f4, f5, this.f2188b);
            canvas.drawLine(0.0f, f5, f4, 0.0f, this.f2188b);
            canvas.drawLine(0.0f, 0.0f, f4, 0.0f, this.f2188b);
            canvas.drawLine(f4, 0.0f, f4, f5, this.f2188b);
            canvas.drawLine(f4, f5, 0.0f, f5, this.f2188b);
            canvas.drawLine(0.0f, f5, 0.0f, 0.0f, this.f2188b);
        }
        String str = this.f2193g;
        if (str == null || !this.f2192f) {
            return;
        }
        this.f2189c.getTextBounds(str, 0, str.length(), this.f2194h);
        float fWidth = (width - this.f2194h.width()) / 2.0f;
        float fHeight = ((height - this.f2194h.height()) / 2.0f) + this.f2194h.height();
        this.f2194h.offset((int) fWidth, (int) fHeight);
        Rect rect = this.f2194h;
        int i4 = rect.left;
        int i5 = this.f2198l;
        rect.set(i4 - i5, rect.top - i5, rect.right + i5, rect.bottom + i5);
        canvas.drawRect(this.f2194h, this.f2190d);
        canvas.drawText(this.f2193g, fWidth, fHeight, this.f2189c);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2188b = new Paint();
        this.f2189c = new Paint();
        this.f2190d = new Paint();
        this.f2191e = true;
        this.f2192f = true;
        this.f2193g = null;
        this.f2194h = new Rect();
        this.f2195i = Color.argb(255, 0, 0, 0);
        this.f2196j = Color.argb(255, 200, 200, 200);
        this.f2197k = Color.argb(255, 50, 50, 50);
        this.f2198l = 4;
        a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f2188b = new Paint();
        this.f2189c = new Paint();
        this.f2190d = new Paint();
        this.f2191e = true;
        this.f2192f = true;
        this.f2193g = null;
        this.f2194h = new Rect();
        this.f2195i = Color.argb(255, 0, 0, 0);
        this.f2196j = Color.argb(255, 200, 200, 200);
        this.f2197k = Color.argb(255, 50, 50, 50);
        this.f2198l = 4;
        a(context, attributeSet);
    }
}
