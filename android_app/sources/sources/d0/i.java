package d0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import c.j0;
import c.k0;
import c.l;
import c.r0;
import c.w0;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f6610a = "http://schemas.android.com/apk/res/android";

    public static int a(@j0 Context context, int i4, int i5) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i4, typedValue, true);
        return typedValue.resourceId != 0 ? i4 : i5;
    }

    public static boolean b(@j0 TypedArray typedArray, @w0 int i4, @w0 int i5, boolean z3) {
        return typedArray.getBoolean(i4, typedArray.getBoolean(i5, z3));
    }

    @k0
    public static Drawable c(@j0 TypedArray typedArray, @w0 int i4, @w0 int i5) {
        Drawable drawable = typedArray.getDrawable(i4);
        return drawable == null ? typedArray.getDrawable(i5) : drawable;
    }

    public static int d(@j0 TypedArray typedArray, @w0 int i4, @w0 int i5, int i6) {
        return typedArray.getInt(i4, typedArray.getInt(i5, i6));
    }

    public static boolean e(@j0 TypedArray typedArray, @j0 XmlPullParser xmlPullParser, @j0 String str, @w0 int i4, boolean z3) {
        return !r(xmlPullParser, str) ? z3 : typedArray.getBoolean(i4, z3);
    }

    @l
    public static int f(@j0 TypedArray typedArray, @j0 XmlPullParser xmlPullParser, @j0 String str, @w0 int i4, @l int i5) {
        return !r(xmlPullParser, str) ? i5 : typedArray.getColor(i4, i5);
    }

    @k0
    public static ColorStateList g(@j0 TypedArray typedArray, @j0 XmlPullParser xmlPullParser, @k0 Resources.Theme theme, @j0 String str, @w0 int i4) {
        if (!r(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i4, typedValue);
        int i5 = typedValue.type;
        if (i5 != 2) {
            return (i5 < 28 || i5 > 31) ? a.c(typedArray.getResources(), typedArray.getResourceId(i4, 0), theme) : h(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i4 + ": " + typedValue);
    }

    @j0
    public static ColorStateList h(@j0 TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static b i(@j0 TypedArray typedArray, @j0 XmlPullParser xmlPullParser, @k0 Resources.Theme theme, @j0 String str, @w0 int i4, @l int i5) {
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i4, typedValue);
            int i6 = typedValue.type;
            if (i6 >= 28 && i6 <= 31) {
                return b.b(typedValue.data);
            }
            b bVarG = b.g(typedArray.getResources(), typedArray.getResourceId(i4, 0), theme);
            if (bVarG != null) {
                return bVarG;
            }
        }
        return b.b(i5);
    }

    public static float j(@j0 TypedArray typedArray, @j0 XmlPullParser xmlPullParser, @j0 String str, @w0 int i4, float f4) {
        return !r(xmlPullParser, str) ? f4 : typedArray.getFloat(i4, f4);
    }

    public static int k(@j0 TypedArray typedArray, @j0 XmlPullParser xmlPullParser, @j0 String str, @w0 int i4, int i5) {
        return !r(xmlPullParser, str) ? i5 : typedArray.getInt(i4, i5);
    }

    @c.c
    public static int l(@j0 TypedArray typedArray, @j0 XmlPullParser xmlPullParser, @j0 String str, @w0 int i4, @c.c int i5) {
        return !r(xmlPullParser, str) ? i5 : typedArray.getResourceId(i4, i5);
    }

    @k0
    public static String m(@j0 TypedArray typedArray, @j0 XmlPullParser xmlPullParser, @j0 String str, @w0 int i4) {
        if (r(xmlPullParser, str)) {
            return typedArray.getString(i4);
        }
        return null;
    }

    @c.c
    public static int n(@j0 TypedArray typedArray, @w0 int i4, @w0 int i5, @c.c int i6) {
        return typedArray.getResourceId(i4, typedArray.getResourceId(i5, i6));
    }

    @k0
    public static String o(@j0 TypedArray typedArray, @w0 int i4, @w0 int i5) {
        String string = typedArray.getString(i4);
        return string == null ? typedArray.getString(i5) : string;
    }

    @k0
    public static CharSequence p(@j0 TypedArray typedArray, @w0 int i4, @w0 int i5) {
        CharSequence text = typedArray.getText(i4);
        return text == null ? typedArray.getText(i5) : text;
    }

    @k0
    public static CharSequence[] q(@j0 TypedArray typedArray, @w0 int i4, @w0 int i5) {
        CharSequence[] textArray = typedArray.getTextArray(i4);
        return textArray == null ? typedArray.getTextArray(i5) : textArray;
    }

    public static boolean r(@j0 XmlPullParser xmlPullParser, @j0 String str) {
        return xmlPullParser.getAttributeValue(f6610a, str) != null;
    }

    @j0
    public static TypedArray s(@j0 Resources resources, @k0 Resources.Theme theme, @j0 AttributeSet attributeSet, @j0 int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @k0
    public static TypedValue t(@j0 TypedArray typedArray, @j0 XmlPullParser xmlPullParser, @j0 String str, int i4) {
        if (r(xmlPullParser, str)) {
            return typedArray.peekValue(i4);
        }
        return null;
    }
}
