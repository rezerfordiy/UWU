package d0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import c.j0;
import c.k0;
import c.l;
import c.r0;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y.a;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f6596a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f6597b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f6598c = 2;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f6599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f6600b;

        public a(@l int i4, @l int i5) {
            this.f6599a = new int[]{i4, i5};
            this.f6600b = new float[]{0.0f, 1.0f};
        }

        public a(@l int i4, @l int i5, @l int i6) {
            this.f6599a = new int[]{i4, i5, i6};
            this.f6600b = new float[]{0.0f, 0.5f, 1.0f};
        }

        public a(@j0 List<Integer> list, @j0 List<Float> list2) {
            int size = list.size();
            this.f6599a = new int[size];
            this.f6600b = new float[size];
            for (int i4 = 0; i4 < size; i4++) {
                this.f6599a[i4] = list.get(i4).intValue();
                this.f6600b[i4] = list2.get(i4).floatValue();
            }
        }
    }

    public static a a(@k0 a aVar, @l int i4, @l int i5, boolean z3, @l int i6) {
        return aVar != null ? aVar : z3 ? new a(i4, i6, i5) : new a(i4, i5);
    }

    public static Shader b(@j0 Resources resources, @j0 XmlPullParser xmlPullParser, @k0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return c(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static Shader c(@j0 Resources resources, @j0 XmlPullParser xmlPullParser, @j0 AttributeSet attributeSet, @k0 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayS = i.s(resources, theme, attributeSet, a.j.f12791x);
        float fJ = i.j(typedArrayS, xmlPullParser, "startX", a.j.G, 0.0f);
        float fJ2 = i.j(typedArrayS, xmlPullParser, "startY", a.j.H, 0.0f);
        float fJ3 = i.j(typedArrayS, xmlPullParser, "endX", a.j.I, 0.0f);
        float fJ4 = i.j(typedArrayS, xmlPullParser, "endY", a.j.J, 0.0f);
        float fJ5 = i.j(typedArrayS, xmlPullParser, "centerX", a.j.B, 0.0f);
        float fJ6 = i.j(typedArrayS, xmlPullParser, "centerY", a.j.C, 0.0f);
        int iK = i.k(typedArrayS, xmlPullParser, "type", a.j.A, 0);
        int iF = i.f(typedArrayS, xmlPullParser, "startColor", a.j.f12792y, 0);
        boolean zR = i.r(xmlPullParser, "centerColor");
        int iF2 = i.f(typedArrayS, xmlPullParser, "centerColor", a.j.F, 0);
        int iF3 = i.f(typedArrayS, xmlPullParser, "endColor", a.j.f12793z, 0);
        int iK2 = i.k(typedArrayS, xmlPullParser, "tileMode", a.j.E, 0);
        float fJ7 = i.j(typedArrayS, xmlPullParser, "gradientRadius", a.j.D, 0.0f);
        typedArrayS.recycle();
        a aVarA = a(d(resources, xmlPullParser, attributeSet, theme), iF, iF3, zR, iF2);
        if (iK != 1) {
            return iK != 2 ? new LinearGradient(fJ, fJ2, fJ3, fJ4, aVarA.f6599a, aVarA.f6600b, e(iK2)) : new SweepGradient(fJ5, fJ6, aVarA.f6599a, aVarA.f6600b);
        }
        if (fJ7 > 0.0f) {
            return new RadialGradient(fJ5, fJ6, fJ7, aVarA.f6599a, aVarA.f6600b, e(iK2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        return new d0.e.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static d0.e.a d(@c.j0 android.content.res.Resources r9, @c.j0 org.xmlpull.v1.XmlPullParser r10, @c.j0 android.util.AttributeSet r11, @c.k0 android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = y.a.j.K
            android.content.res.TypedArray r3 = d0.i.s(r9, r12, r11, r3)
            int r5 = y.a.j.L
            boolean r6 = r3.hasValue(r5)
            int r7 = y.a.j.M
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            d0.e$a r9 = new d0.e$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.e.d(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):d0.e$a");
    }

    public static Shader.TileMode e(int i4) {
        return i4 != 1 ? i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
