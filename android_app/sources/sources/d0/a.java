package d0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import c.b1;
import c.j0;
import c.k0;
import c.l;
import c.r0;
import c.t;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public final class a {
    @j0
    public static ColorStateList a(@j0 Resources resources, @j0 XmlPullParser xmlPullParser, @k0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @j0
    public static ColorStateList b(@j0 Resources resources, @j0 XmlPullParser xmlPullParser, @j0 AttributeSet attributeSet, @k0 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return d(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @k0
    public static ColorStateList c(@j0 Resources resources, @b1 int i4, @k0 Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i4), theme);
        } catch (Exception e4) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e4);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[PHI: r11
      0x004f: PHI (r11v4 int) = (r11v1 int), (r11v2 int) binds: [B:16:0x004d, B:19:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList d(@c.j0 android.content.res.Resources r17, @c.j0 org.xmlpull.v1.XmlPullParser r18, @c.j0 android.util.AttributeSet r19, @c.k0 android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r19
            int r1 = r18.getDepth()
            r2 = 1
            int r1 = r1 + r2
            r3 = 20
            int[][] r4 = new int[r3][]
            int[] r3 = new int[r3]
            r5 = 0
            r6 = r5
        L10:
            int r7 = r18.next()
            if (r7 == r2) goto Laa
            int r8 = r18.getDepth()
            if (r8 >= r1) goto L1f
            r9 = 3
            if (r7 == r9) goto Laa
        L1f:
            r9 = 2
            if (r7 != r9) goto La3
            if (r8 > r1) goto La3
            java.lang.String r7 = r18.getName()
            java.lang.String r8 = "item"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L32
            goto La3
        L32:
            int[] r7 = y.a.j.f12768a
            r8 = r17
            r9 = r20
            android.content.res.TypedArray r7 = f(r8, r9, r0, r7)
            int r10 = y.a.j.f12769b
            r11 = -65281(0xffffffffffff00ff, float:NaN)
            int r10 = r7.getColor(r10, r11)
            int r11 = y.a.j.f12770c
            boolean r12 = r7.hasValue(r11)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L54
        L4f:
            float r13 = r7.getFloat(r11, r13)
            goto L5d
        L54:
            int r11 = y.a.j.f12771d
            boolean r12 = r7.hasValue(r11)
            if (r12 == 0) goto L5d
            goto L4f
        L5d:
            r7.recycle()
            int r7 = r19.getAttributeCount()
            int[] r11 = new int[r7]
            r12 = r5
            r14 = r12
        L68:
            if (r12 >= r7) goto L8d
            int r15 = r0.getAttributeNameResource(r12)
            r2 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r2) goto L89
            r2 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r2) goto L89
            int r2 = y.a.C0129a.f12655a
            if (r15 == r2) goto L89
            int r2 = r14 + 1
            boolean r16 = r0.getAttributeBooleanValue(r12, r5)
            if (r16 == 0) goto L85
            goto L86
        L85:
            int r15 = -r15
        L86:
            r11[r14] = r15
            r14 = r2
        L89:
            int r12 = r12 + 1
            r2 = 1
            goto L68
        L8d:
            int[] r2 = android.util.StateSet.trimStateSet(r11, r14)
            int r7 = e(r10, r13)
            int[] r3 = d0.f.a(r3, r6, r7)
            java.lang.Object[] r2 = d0.f.c(r4, r6, r2)
            r4 = r2
            int[][] r4 = (int[][]) r4
            int r6 = r6 + 1
            goto La7
        La3:
            r8 = r17
            r9 = r20
        La7:
            r2 = 1
            goto L10
        Laa:
            int[] r0 = new int[r6]
            int[][] r1 = new int[r6][]
            java.lang.System.arraycopy(r3, r5, r0, r5, r6)
            java.lang.System.arraycopy(r4, r5, r1, r5, r6)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.a.d(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    @l
    public static int e(@l int i4, @t(from = 0.0d, to = 1.0d) float f4) {
        return (i4 & z1.f12255s) | (Math.round(Color.alpha(i4) * f4) << 24);
    }

    public static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
