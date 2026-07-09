package s1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import c.j0;
import c.k0;
import c.l;
import c.o0;
import c.r0;
import c.s;
import g0.u0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class i extends s1.h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f11232l = "VectorDrawableCompat";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final PorterDuff.Mode f11233m = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f11234n = "clip-path";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f11235o = "group";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f11236p = "path";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f11237q = "vector";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f11238r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f11239s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f11240t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f11241u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f11242v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f11243w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f11244x = 2048;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final boolean f11245y = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f11246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuffColorFilter f11247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorFilter f11248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable.ConstantState f11251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f11252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f11253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rect f11254k;

    public static class b extends f {
        public b() {
        }

        @Override // s1.i.f
        public boolean e() {
            return true;
        }

        public void i(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (d0.i.r(xmlPullParser, "pathData")) {
                TypedArray typedArrayS = d0.i.s(resources, theme, attributeSet, s1.a.I);
                j(typedArrayS, xmlPullParser);
                typedArrayS.recycle();
            }
        }

        public final void j(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f11282b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f11281a = u0.d(string2);
            }
            this.f11283c = d0.i.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    public static class c extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f11255f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public d0.b f11256g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f11257h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d0.b f11258i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f11259j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f11260k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f11261l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f11262m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f11263n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Paint.Cap f11264o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Paint.Join f11265p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f11266q;

        public c() {
            this.f11257h = 0.0f;
            this.f11259j = 1.0f;
            this.f11260k = 1.0f;
            this.f11261l = 0.0f;
            this.f11262m = 1.0f;
            this.f11263n = 0.0f;
            this.f11264o = Paint.Cap.BUTT;
            this.f11265p = Paint.Join.MITER;
            this.f11266q = 4.0f;
        }

        @Override // s1.i.e
        public boolean a() {
            return this.f11258i.i() || this.f11256g.i();
        }

        @Override // s1.i.e
        public boolean b(int[] iArr) {
            return this.f11256g.j(iArr) | this.f11258i.j(iArr);
        }

        @Override // s1.i.f
        public void c(Resources.Theme theme) {
        }

        @Override // s1.i.f
        public boolean d() {
            return this.f11255f != null;
        }

        public float getFillAlpha() {
            return this.f11260k;
        }

        @l
        public int getFillColor() {
            return this.f11258i.e();
        }

        public float getStrokeAlpha() {
            return this.f11259j;
        }

        @l
        public int getStrokeColor() {
            return this.f11256g.e();
        }

        public float getStrokeWidth() {
            return this.f11257h;
        }

        public float getTrimPathEnd() {
            return this.f11262m;
        }

        public float getTrimPathOffset() {
            return this.f11263n;
        }

        public float getTrimPathStart() {
            return this.f11261l;
        }

        public final Paint.Cap i(int i4, Paint.Cap cap) {
            return i4 != 0 ? i4 != 1 ? i4 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        public final Paint.Join j(int i4, Paint.Join join) {
            return i4 != 0 ? i4 != 1 ? i4 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        public void k(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = d0.i.s(resources, theme, attributeSet, s1.a.f11180t);
            l(typedArrayS, xmlPullParser, theme);
            typedArrayS.recycle();
        }

        public final void l(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f11255f = null;
            if (d0.i.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f11282b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f11281a = u0.d(string2);
                }
                this.f11258i = d0.i.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f11260k = d0.i.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f11260k);
                this.f11264o = i(d0.i.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f11264o);
                this.f11265p = j(d0.i.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f11265p);
                this.f11266q = d0.i.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f11266q);
                this.f11256g = d0.i.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f11259j = d0.i.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f11259j);
                this.f11257h = d0.i.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f11257h);
                this.f11262m = d0.i.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f11262m);
                this.f11263n = d0.i.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f11263n);
                this.f11261l = d0.i.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f11261l);
                this.f11283c = d0.i.k(typedArray, xmlPullParser, "fillType", 13, this.f11283c);
            }
        }

        public void setFillAlpha(float f4) {
            this.f11260k = f4;
        }

        public void setFillColor(int i4) {
            this.f11258i.k(i4);
        }

        public void setStrokeAlpha(float f4) {
            this.f11259j = f4;
        }

        public void setStrokeColor(int i4) {
            this.f11256g.k(i4);
        }

        public void setStrokeWidth(float f4) {
            this.f11257h = f4;
        }

        public void setTrimPathEnd(float f4) {
            this.f11262m = f4;
        }

        public void setTrimPathOffset(float f4) {
            this.f11263n = f4;
        }

        public void setTrimPathStart(float f4) {
            this.f11261l = f4;
        }

        public c(c cVar) {
            super(cVar);
            this.f11257h = 0.0f;
            this.f11259j = 1.0f;
            this.f11260k = 1.0f;
            this.f11261l = 0.0f;
            this.f11262m = 1.0f;
            this.f11263n = 0.0f;
            this.f11264o = Paint.Cap.BUTT;
            this.f11265p = Paint.Join.MITER;
            this.f11266q = 4.0f;
            this.f11255f = cVar.f11255f;
            this.f11256g = cVar.f11256g;
            this.f11257h = cVar.f11257h;
            this.f11259j = cVar.f11259j;
            this.f11258i = cVar.f11258i;
            this.f11283c = cVar.f11283c;
            this.f11260k = cVar.f11260k;
            this.f11261l = cVar.f11261l;
            this.f11262m = cVar.f11262m;
            this.f11263n = cVar.f11263n;
            this.f11264o = cVar.f11264o;
            this.f11265p = cVar.f11265p;
            this.f11266q = cVar.f11266q;
        }
    }

    public static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f11267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<e> f11268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f11269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f11270d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f11271e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f11272f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f11273g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f11274h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f11275i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Matrix f11276j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f11277k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int[] f11278l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f11279m;

        public d() {
            super();
            this.f11267a = new Matrix();
            this.f11268b = new ArrayList<>();
            this.f11269c = 0.0f;
            this.f11270d = 0.0f;
            this.f11271e = 0.0f;
            this.f11272f = 1.0f;
            this.f11273g = 1.0f;
            this.f11274h = 0.0f;
            this.f11275i = 0.0f;
            this.f11276j = new Matrix();
            this.f11279m = null;
        }

        @Override // s1.i.e
        public boolean a() {
            for (int i4 = 0; i4 < this.f11268b.size(); i4++) {
                if (this.f11268b.get(i4).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // s1.i.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i4 = 0; i4 < this.f11268b.size(); i4++) {
                zB |= this.f11268b.get(i4).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = d0.i.s(resources, theme, attributeSet, s1.a.f11162k);
            e(typedArrayS, xmlPullParser);
            typedArrayS.recycle();
        }

        public final void d() {
            this.f11276j.reset();
            this.f11276j.postTranslate(-this.f11270d, -this.f11271e);
            this.f11276j.postScale(this.f11272f, this.f11273g);
            this.f11276j.postRotate(this.f11269c, 0.0f, 0.0f);
            this.f11276j.postTranslate(this.f11274h + this.f11270d, this.f11275i + this.f11271e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f11278l = null;
            this.f11269c = d0.i.j(typedArray, xmlPullParser, r.e.f10500i, 5, this.f11269c);
            this.f11270d = typedArray.getFloat(1, this.f11270d);
            this.f11271e = typedArray.getFloat(2, this.f11271e);
            this.f11272f = d0.i.j(typedArray, xmlPullParser, r.e.f10506o, 3, this.f11272f);
            this.f11273g = d0.i.j(typedArray, xmlPullParser, r.e.f10507p, 4, this.f11273g);
            this.f11274h = d0.i.j(typedArray, xmlPullParser, "translateX", 6, this.f11274h);
            this.f11275i = d0.i.j(typedArray, xmlPullParser, "translateY", 7, this.f11275i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f11279m = string;
            }
            d();
        }

        public String getGroupName() {
            return this.f11279m;
        }

        public Matrix getLocalMatrix() {
            return this.f11276j;
        }

        public float getPivotX() {
            return this.f11270d;
        }

        public float getPivotY() {
            return this.f11271e;
        }

        public float getRotation() {
            return this.f11269c;
        }

        public float getScaleX() {
            return this.f11272f;
        }

        public float getScaleY() {
            return this.f11273g;
        }

        public float getTranslateX() {
            return this.f11274h;
        }

        public float getTranslateY() {
            return this.f11275i;
        }

        public void setPivotX(float f4) {
            if (f4 != this.f11270d) {
                this.f11270d = f4;
                d();
            }
        }

        public void setPivotY(float f4) {
            if (f4 != this.f11271e) {
                this.f11271e = f4;
                d();
            }
        }

        public void setRotation(float f4) {
            if (f4 != this.f11269c) {
                this.f11269c = f4;
                d();
            }
        }

        public void setScaleX(float f4) {
            if (f4 != this.f11272f) {
                this.f11272f = f4;
                d();
            }
        }

        public void setScaleY(float f4) {
            if (f4 != this.f11273g) {
                this.f11273g = f4;
                d();
            }
        }

        public void setTranslateX(float f4) {
            if (f4 != this.f11274h) {
                this.f11274h = f4;
                d();
            }
        }

        public void setTranslateY(float f4) {
            if (f4 != this.f11275i) {
                this.f11275i = f4;
                d();
            }
        }

        public d(d dVar, p.a<String, Object> aVar) {
            f bVar;
            super();
            this.f11267a = new Matrix();
            this.f11268b = new ArrayList<>();
            this.f11269c = 0.0f;
            this.f11270d = 0.0f;
            this.f11271e = 0.0f;
            this.f11272f = 1.0f;
            this.f11273g = 1.0f;
            this.f11274h = 0.0f;
            this.f11275i = 0.0f;
            Matrix matrix = new Matrix();
            this.f11276j = matrix;
            this.f11279m = null;
            this.f11269c = dVar.f11269c;
            this.f11270d = dVar.f11270d;
            this.f11271e = dVar.f11271e;
            this.f11272f = dVar.f11272f;
            this.f11273g = dVar.f11273g;
            this.f11274h = dVar.f11274h;
            this.f11275i = dVar.f11275i;
            this.f11278l = dVar.f11278l;
            String str = dVar.f11279m;
            this.f11279m = str;
            this.f11277k = dVar.f11277k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f11276j);
            ArrayList<e> arrayList = dVar.f11268b;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                e eVar = arrayList.get(i4);
                if (eVar instanceof d) {
                    this.f11268b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f11268b.add(bVar);
                    String str2 = bVar.f11282b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }
    }

    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public static abstract class f extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f11280e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u0.b[] f11281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f11282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f11284d;

        public f() {
            super();
            this.f11281a = null;
            this.f11283c = 0;
        }

        public void c(Resources.Theme theme) {
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            return false;
        }

        public String f(u0.b[] bVarArr) {
            String str = " ";
            for (int i4 = 0; i4 < bVarArr.length; i4++) {
                str = str + bVarArr[i4].f7813a + ":";
                for (float f4 : bVarArr[i4].f7814b) {
                    str = str + f4 + ",";
                }
            }
            return str;
        }

        public void g(int i4) {
            String str = s0.a.f11071l;
            for (int i5 = 0; i5 < i4; i5++) {
                str = str + "    ";
            }
            Log.v(i.f11232l, str + "current path is :" + this.f11282b + " pathData is " + f(this.f11281a));
        }

        public u0.b[] getPathData() {
            return this.f11281a;
        }

        public String getPathName() {
            return this.f11282b;
        }

        public void h(Path path) {
            path.reset();
            u0.b[] bVarArr = this.f11281a;
            if (bVarArr != null) {
                u0.b.e(bVarArr, path);
            }
        }

        public void setPathData(u0.b[] bVarArr) {
            if (u0.b(this.f11281a, bVarArr)) {
                u0.k(this.f11281a, bVarArr);
            } else {
                this.f11281a = u0.f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f11281a = null;
            this.f11283c = 0;
            this.f11282b = fVar.f11282b;
            this.f11284d = fVar.f11284d;
            this.f11281a = u0.f(fVar.f11281a);
        }
    }

    public static class g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Matrix f11285q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Path f11286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f11287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Matrix f11288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Paint f11289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f11290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public PathMeasure f11291f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f11292g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final d f11293h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f11294i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f11295j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f11296k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f11297l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f11298m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f11299n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f11300o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final p.a<String, Object> f11301p;

        public g() {
            this.f11288c = new Matrix();
            this.f11294i = 0.0f;
            this.f11295j = 0.0f;
            this.f11296k = 0.0f;
            this.f11297l = 0.0f;
            this.f11298m = 255;
            this.f11299n = null;
            this.f11300o = null;
            this.f11301p = new p.a<>();
            this.f11293h = new d();
            this.f11286a = new Path();
            this.f11287b = new Path();
        }

        public static float a(float f4, float f5, float f6, float f7) {
            return (f4 * f7) - (f5 * f6);
        }

        public void b(Canvas canvas, int i4, int i5, ColorFilter colorFilter) {
            c(this.f11293h, f11285q, canvas, i4, i5, colorFilter);
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i4, int i5, ColorFilter colorFilter) {
            dVar.f11267a.set(matrix);
            dVar.f11267a.preConcat(dVar.f11276j);
            canvas.save();
            for (int i6 = 0; i6 < dVar.f11268b.size(); i6++) {
                e eVar = dVar.f11268b.get(i6);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f11267a, canvas, i4, i5, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i4, i5, colorFilter);
                }
            }
            canvas.restore();
        }

        public final void d(d dVar, f fVar, Canvas canvas, int i4, int i5, ColorFilter colorFilter) {
            float f4 = i4 / this.f11296k;
            float f5 = i5 / this.f11297l;
            float fMin = Math.min(f4, f5);
            Matrix matrix = dVar.f11267a;
            this.f11288c.set(matrix);
            this.f11288c.postScale(f4, f5);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.h(this.f11286a);
            Path path = this.f11286a;
            this.f11287b.reset();
            if (fVar.e()) {
                this.f11287b.setFillType(fVar.f11283c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f11287b.addPath(path, this.f11288c);
                canvas.clipPath(this.f11287b);
                return;
            }
            c cVar = (c) fVar;
            float f6 = cVar.f11261l;
            if (f6 != 0.0f || cVar.f11262m != 1.0f) {
                float f7 = cVar.f11263n;
                float f8 = (f6 + f7) % 1.0f;
                float f9 = (cVar.f11262m + f7) % 1.0f;
                if (this.f11291f == null) {
                    this.f11291f = new PathMeasure();
                }
                this.f11291f.setPath(this.f11286a, false);
                float length = this.f11291f.getLength();
                float f10 = f8 * length;
                float f11 = f9 * length;
                path.reset();
                if (f10 > f11) {
                    this.f11291f.getSegment(f10, length, path, true);
                    this.f11291f.getSegment(0.0f, f11, path, true);
                } else {
                    this.f11291f.getSegment(f10, f11, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f11287b.addPath(path, this.f11288c);
            if (cVar.f11258i.l()) {
                d0.b bVar = cVar.f11258i;
                if (this.f11290e == null) {
                    Paint paint = new Paint(1);
                    this.f11290e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f11290e;
                if (bVar.h()) {
                    Shader shaderF = bVar.f();
                    shaderF.setLocalMatrix(this.f11288c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f11260k * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(i.d(bVar.e(), cVar.f11260k));
                }
                paint2.setColorFilter(colorFilter);
                this.f11287b.setFillType(cVar.f11283c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f11287b, paint2);
            }
            if (cVar.f11256g.l()) {
                d0.b bVar2 = cVar.f11256g;
                if (this.f11289d == null) {
                    Paint paint3 = new Paint(1);
                    this.f11289d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f11289d;
                Paint.Join join = cVar.f11265p;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f11264o;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f11266q);
                if (bVar2.h()) {
                    Shader shaderF2 = bVar2.f();
                    shaderF2.setLocalMatrix(this.f11288c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f11259j * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(i.d(bVar2.e(), cVar.f11259j));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f11257h * fMin * fE);
                canvas.drawPath(this.f11287b, paint4);
            }
        }

        public final float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public boolean f() {
            if (this.f11300o == null) {
                this.f11300o = Boolean.valueOf(this.f11293h.a());
            }
            return this.f11300o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f11293h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f11298m;
        }

        public void setAlpha(float f4) {
            setRootAlpha((int) (f4 * 255.0f));
        }

        public void setRootAlpha(int i4) {
            this.f11298m = i4;
        }

        public g(g gVar) {
            this.f11288c = new Matrix();
            this.f11294i = 0.0f;
            this.f11295j = 0.0f;
            this.f11296k = 0.0f;
            this.f11297l = 0.0f;
            this.f11298m = 255;
            this.f11299n = null;
            this.f11300o = null;
            p.a<String, Object> aVar = new p.a<>();
            this.f11301p = aVar;
            this.f11293h = new d(gVar.f11293h, aVar);
            this.f11286a = new Path(gVar.f11286a);
            this.f11287b = new Path(gVar.f11287b);
            this.f11294i = gVar.f11294i;
            this.f11295j = gVar.f11295j;
            this.f11296k = gVar.f11296k;
            this.f11297l = gVar.f11297l;
            this.f11292g = gVar.f11292g;
            this.f11298m = gVar.f11298m;
            this.f11299n = gVar.f11299n;
            String str = gVar.f11299n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f11300o = gVar.f11300o;
        }
    }

    public static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f11303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorStateList f11304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f11305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f11306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Bitmap f11307f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int[] f11308g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ColorStateList f11309h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public PorterDuff.Mode f11310i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f11311j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f11312k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f11313l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Paint f11314m;

        public h() {
            this.f11304c = null;
            this.f11305d = i.f11233m;
            this.f11303b = new g();
        }

        public boolean a(int i4, int i5) {
            return i4 == this.f11307f.getWidth() && i5 == this.f11307f.getHeight();
        }

        public boolean b() {
            return !this.f11313l && this.f11309h == this.f11304c && this.f11310i == this.f11305d && this.f11312k == this.f11306e && this.f11311j == this.f11303b.getRootAlpha();
        }

        public void c(int i4, int i5) {
            if (this.f11307f == null || !a(i4, i5)) {
                this.f11307f = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
                this.f11313l = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f11307f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f11314m == null) {
                Paint paint = new Paint();
                this.f11314m = paint;
                paint.setFilterBitmap(true);
            }
            this.f11314m.setAlpha(this.f11303b.getRootAlpha());
            this.f11314m.setColorFilter(colorFilter);
            return this.f11314m;
        }

        public boolean f() {
            return this.f11303b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f11303b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11302a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f11303b.g(iArr);
            this.f11313l |= zG;
            return zG;
        }

        public void i() {
            this.f11309h = this.f11304c;
            this.f11310i = this.f11305d;
            this.f11311j = this.f11303b.getRootAlpha();
            this.f11312k = this.f11306e;
            this.f11313l = false;
        }

        public void j(int i4, int i5) {
            this.f11307f.eraseColor(0);
            this.f11303b.b(new Canvas(this.f11307f), i4, i5, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @j0
        public Drawable newDrawable() {
            return new i(this);
        }

        public h(h hVar) {
            this.f11304c = null;
            this.f11305d = i.f11233m;
            if (hVar != null) {
                this.f11302a = hVar.f11302a;
                g gVar = new g(hVar.f11303b);
                this.f11303b = gVar;
                if (hVar.f11303b.f11290e != null) {
                    gVar.f11290e = new Paint(hVar.f11303b.f11290e);
                }
                if (hVar.f11303b.f11289d != null) {
                    this.f11303b.f11289d = new Paint(hVar.f11303b.f11289d);
                }
                this.f11304c = hVar.f11304c;
                this.f11305d = hVar.f11305d;
                this.f11306e = hVar.f11306e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @j0
        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }
    }

    /* JADX INFO: renamed from: s1.i$i, reason: collision with other inner class name */
    @o0(24)
    public static class C0112i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f11315a;

        public C0112i(Drawable.ConstantState constantState) {
            this.f11315a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f11315a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11315a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f11231b = (VectorDrawable) this.f11315a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f11231b = (VectorDrawable) this.f11315a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f11231b = (VectorDrawable) this.f11315a.newDrawable(resources, theme);
            return iVar;
        }
    }

    public i() {
        this.f11250g = true;
        this.f11252i = new float[9];
        this.f11253j = new Matrix();
        this.f11254k = new Rect();
        this.f11246c = new h();
    }

    public static int d(int i4, float f4) {
        return (i4 & z1.f12255s) | (((int) (Color.alpha(i4) * f4)) << 24);
    }

    @k0
    public static i e(@j0 Resources resources, @s int i4, @k0 Resources.Theme theme) {
        i iVar = new i();
        iVar.f11231b = d0.g.d(resources, i4, theme);
        iVar.f11251h = new C0112i(iVar.f11231b.getConstantState());
        return iVar;
    }

    public static i f(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    public static PorterDuff.Mode k(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f11231b;
        if (drawable == null) {
            return false;
        }
        h0.a.b(drawable);
        return false;
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f11254k);
        if (this.f11254k.width() <= 0 || this.f11254k.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f11248e;
        if (colorFilter == null) {
            colorFilter = this.f11247d;
        }
        canvas.getMatrix(this.f11253j);
        this.f11253j.getValues(this.f11252i);
        float fAbs = Math.abs(this.f11252i[0]);
        float fAbs2 = Math.abs(this.f11252i[4]);
        float fAbs3 = Math.abs(this.f11252i[1]);
        float fAbs4 = Math.abs(this.f11252i[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f11254k.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f11254k.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f11254k;
        canvas.translate(rect.left, rect.top);
        if (j()) {
            canvas.translate(this.f11254k.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f11254k.offsetTo(0, 0);
        this.f11246c.c(iMin, iMin2);
        if (!this.f11250g) {
            this.f11246c.j(iMin, iMin2);
        } else if (!this.f11246c.b()) {
            this.f11246c.j(iMin, iMin2);
            this.f11246c.i();
        }
        this.f11246c.d(canvas, colorFilter, this.f11254k);
        canvas.restoreToCount(iSave);
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public float g() {
        g gVar;
        h hVar = this.f11246c;
        if (hVar == null || (gVar = hVar.f11303b) == null) {
            return 1.0f;
        }
        float f4 = gVar.f11294i;
        if (f4 == 0.0f) {
            return 1.0f;
        }
        float f5 = gVar.f11295j;
        if (f5 == 0.0f) {
            return 1.0f;
        }
        float f6 = gVar.f11297l;
        if (f6 == 0.0f) {
            return 1.0f;
        }
        float f7 = gVar.f11296k;
        if (f7 == 0.0f) {
            return 1.0f;
        }
        return Math.min(f7 / f4, f6 / f5);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f11231b;
        return drawable != null ? h0.a.d(drawable) : this.f11246c.f11303b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f11231b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f11246c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f11231b;
        return drawable != null ? h0.a.e(drawable) : this.f11248e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f11231b != null) {
            return new C0112i(this.f11231b.getConstantState());
        }
        this.f11246c.f11302a = getChangingConfigurations();
        return this.f11246c;
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f11231b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f11246c.f11303b.f11295j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f11231b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f11246c.f11303b.f11294i;
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public Object h(String str) {
        return this.f11246c.f11303b.f11301p.get(str);
    }

    public final void i(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i4;
        int i5;
        h hVar = this.f11246c;
        g gVar = hVar.f11303b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f11293h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z3 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.k(resources, attributeSet, theme, xmlPullParser);
                    dVar.f11268b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f11301p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f11302a = cVar.f11284d | hVar.f11302a;
                    z3 = false;
                } else {
                    if (f11234n.equals(name)) {
                        b bVar = new b();
                        bVar.i(resources, attributeSet, theme, xmlPullParser);
                        dVar.f11268b.add(bVar);
                        if (bVar.getPathName() != null) {
                            gVar.f11301p.put(bVar.getPathName(), bVar);
                        }
                        i4 = hVar.f11302a;
                        i5 = bVar.f11284d;
                    } else if ("group".equals(name)) {
                        d dVar2 = new d();
                        dVar2.c(resources, attributeSet, theme, xmlPullParser);
                        dVar.f11268b.add(dVar2);
                        arrayDeque.push(dVar2);
                        if (dVar2.getGroupName() != null) {
                            gVar.f11301p.put(dVar2.getGroupName(), dVar2);
                        }
                        i4 = hVar.f11302a;
                        i5 = dVar2.f11277k;
                    }
                    hVar.f11302a = i5 | i4;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z3) {
            throw new XmlPullParserException("no path defined");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f11231b;
        return drawable != null ? h0.a.h(drawable) : this.f11246c.f11306e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f11231b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f11246c) != null && (hVar.g() || ((colorStateList = this.f11246c.f11304c) != null && colorStateList.isStateful())));
    }

    public final boolean j() {
        return isAutoMirrored() && h0.a.f(this) == 1;
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final void l(d dVar, int i4) {
        String str = s0.a.f11071l;
        for (int i5 = 0; i5 < i4; i5++) {
            str = str + "    ";
        }
        Log.v(f11232l, str + "current group is :" + dVar.getGroupName() + " rotation is " + dVar.f11269c);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("matrix is :");
        sb.append(dVar.getLocalMatrix().toString());
        Log.v(f11232l, sb.toString());
        for (int i6 = 0; i6 < dVar.f11268b.size(); i6++) {
            e eVar = dVar.f11268b.get(i6);
            if (eVar instanceof d) {
                l((d) eVar, i4 + 1);
            } else {
                ((f) eVar).g(i4 + 1);
            }
        }
    }

    public void m(boolean z3) {
        this.f11250g = z3;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f11249f && super.mutate() == this) {
            this.f11246c = new h(this.f11246c);
            this.f11249f = true;
        }
        return this;
    }

    public final void n(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f11246c;
        g gVar = hVar.f11303b;
        hVar.f11305d = k(d0.i.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListG = d0.i.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListG != null) {
            hVar.f11304c = colorStateListG;
        }
        hVar.f11306e = d0.i.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f11306e);
        gVar.f11296k = d0.i.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f11296k);
        float fJ = d0.i.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f11297l);
        gVar.f11297l = fJ;
        if (gVar.f11296k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fJ <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f11294i = typedArray.getDimension(3, gVar.f11294i);
        float dimension = typedArray.getDimension(2, gVar.f11295j);
        gVar.f11295j = dimension;
        if (gVar.f11294i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(d0.i.j(typedArray, xmlPullParser, r.e.f10498g, 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f11299n = string;
            gVar.f11301p.put(string, gVar);
        }
    }

    public PorterDuffColorFilter o(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z3;
        PorterDuff.Mode mode;
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f11246c;
        ColorStateList colorStateList = hVar.f11304c;
        if (colorStateList == null || (mode = hVar.f11305d) == null) {
            z3 = false;
        } else {
            this.f11247d = o(this.f11247d, colorStateList, mode);
            invalidateSelf();
            z3 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z3;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j4) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j4);
        } else {
            super.scheduleSelf(runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else if (this.f11246c.f11303b.getRootAlpha() != i4) {
            this.f11246c.f11303b.setRootAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            h0.a.j(drawable, z3);
        } else {
            this.f11246c.f11306e = z3;
        }
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i4) {
        super.setChangingConfigurations(i4);
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i4, PorterDuff.Mode mode) {
        super.setColorFilter(i4, mode);
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z3) {
        super.setFilterBitmap(z3);
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f4, float f5) {
        super.setHotspot(f4, f5);
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i4, int i5, int i6, int i7) {
        super.setHotspotBounds(i4, i5, i6, i7);
    }

    @Override // s1.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, h0.m
    public void setTint(int i4) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            h0.a.n(drawable, i4);
        } else {
            setTintList(ColorStateList.valueOf(i4));
        }
    }

    @Override // android.graphics.drawable.Drawable, h0.m
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            h0.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f11246c;
        if (hVar.f11304c != colorStateList) {
            hVar.f11304c = colorStateList;
            this.f11247d = o(this.f11247d, colorStateList, hVar.f11305d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, h0.m
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            h0.a.p(drawable, mode);
            return;
        }
        h hVar = this.f11246c;
        if (hVar.f11305d != mode) {
            hVar.f11305d = mode;
            this.f11247d = o(this.f11247d, hVar.f11304c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f11231b;
        return drawable != null ? drawable.setVisible(z3, z4) : super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public i(@j0 h hVar) {
        this.f11250g = true;
        this.f11252i = new float[9];
        this.f11253j = new Matrix();
        this.f11254k = new Rect();
        this.f11246c = hVar;
        this.f11247d = o(this.f11247d, hVar.f11304c, hVar.f11305d);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            h0.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f11246c;
        hVar.f11303b = new g();
        TypedArray typedArrayS = d0.i.s(resources, theme, attributeSet, s1.a.f11142a);
        n(typedArrayS, xmlPullParser, theme);
        typedArrayS.recycle();
        hVar.f11302a = getChangingConfigurations();
        hVar.f11313l = true;
        i(resources, xmlPullParser, attributeSet, theme);
        this.f11247d = o(this.f11247d, hVar.f11304c, hVar.f11305d);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11231b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11248e = colorFilter;
            invalidateSelf();
        }
    }
}
