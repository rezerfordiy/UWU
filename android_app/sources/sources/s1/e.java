package s1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import c.r0;
import g0.u0;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f11215a = "AnimatorInflater";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11216b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f11217c = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f11218d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f11219e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f11220f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f11221g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f11222h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f11223i = false;

    public static class a implements TypeEvaluator<u0.b[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u0.b[] f11224a;

        public a() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u0.b[] evaluate(float f4, u0.b[] bVarArr, u0.b[] bVarArr2) {
            if (!u0.b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!u0.b(this.f11224a, bVarArr)) {
                this.f11224a = u0.f(bVarArr);
            }
            for (int i4 = 0; i4 < bVarArr.length; i4++) {
                this.f11224a[i4].d(bVarArr[i4], bVarArr2[i4], f4);
            }
            return this.f11224a;
        }

        public a(u0.b[] bVarArr) {
            this.f11224a = bVarArr;
        }
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f4) throws XmlPullParserException, IOException {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        if (r23 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        if (r13 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
    
        if (r2.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
    
        if (r24 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        r23.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        r23.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0106, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.e.b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Keyframe c(Keyframe keyframe, float f4) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f4) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f4) : Keyframe.ofObject(f4);
    }

    public static void d(Keyframe[] keyframeArr, float f4, int i4, int i5) {
        float f5 = f4 / ((i5 - i4) + 2);
        while (i4 <= i5) {
            keyframeArr[i4].setFraction(keyframeArr[i4 - 1].getFraction() + f5);
            i4++;
        }
    }

    public static void e(Object[] objArr, String str) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        Log.d(f11215a, str);
        int length = objArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            Keyframe keyframe = (Keyframe) objArr[i4];
            StringBuilder sb = new StringBuilder();
            sb.append("Keyframe ");
            sb.append(i4);
            sb.append(": fraction ");
            Object value = "null";
            sb.append(keyframe.getFraction() < 0.0f ? "null" : Float.valueOf(keyframe.getFraction()));
            sb.append(", , value : ");
            if (keyframe.hasValue()) {
                value = keyframe.getValue();
            }
            sb.append(value);
            Log.d(f11215a, sb.toString());
        }
    }

    public static PropertyValuesHolder f(TypedArray typedArray, int i4, int i5, int i6, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i5);
        boolean z3 = typedValuePeekValue != null;
        int i7 = z3 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i6);
        boolean z4 = typedValuePeekValue2 != null;
        int i8 = z4 ? typedValuePeekValue2.type : 0;
        if (i4 == 4) {
            i4 = ((z3 && i(i7)) || (z4 && i(i8))) ? 3 : 0;
        }
        boolean z5 = i4 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i4 != 2) {
            f fVarA = i4 == 3 ? f.a() : null;
            if (z5) {
                if (z3) {
                    float dimension = i7 == 5 ? typedArray.getDimension(i5, 0.0f) : typedArray.getFloat(i5, 0.0f);
                    if (z4) {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i8 == 5 ? typedArray.getDimension(i6, 0.0f) : typedArray.getFloat(i6, 0.0f));
                    } else {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i8 == 5 ? typedArray.getDimension(i6, 0.0f) : typedArray.getFloat(i6, 0.0f));
                }
                propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
            } else if (z3) {
                int dimension2 = i7 == 5 ? (int) typedArray.getDimension(i5, 0.0f) : i(i7) ? typedArray.getColor(i5, 0) : typedArray.getInt(i5, 0);
                if (z4) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i8 == 5 ? (int) typedArray.getDimension(i6, 0.0f) : i(i8) ? typedArray.getColor(i6, 0) : typedArray.getInt(i6, 0));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z4) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i8 == 5 ? (int) typedArray.getDimension(i6, 0.0f) : i(i8) ? typedArray.getColor(i6, 0) : typedArray.getInt(i6, 0));
            }
            if (propertyValuesHolderOfInt == null || fVarA == null) {
                return propertyValuesHolderOfInt;
            }
            propertyValuesHolderOfInt.setEvaluator(fVarA);
            return propertyValuesHolderOfInt;
        }
        String string = typedArray.getString(i5);
        String string2 = typedArray.getString(i6);
        u0.b[] bVarArrD = u0.d(string);
        u0.b[] bVarArrD2 = u0.d(string2);
        if (bVarArrD == null && bVarArrD2 == null) {
            return null;
        }
        if (bVarArrD == null) {
            if (bVarArrD2 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), bVarArrD2);
            }
            return null;
        }
        a aVar = new a();
        if (bVarArrD2 == null) {
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, bVarArrD);
        } else {
            if (!u0.b(bVarArrD, bVarArrD2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, bVarArrD, bVarArrD2);
        }
        return propertyValuesHolderOfObject;
    }

    public static int g(TypedArray typedArray, int i4, int i5) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i4);
        boolean z3 = typedValuePeekValue != null;
        int i6 = z3 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i5);
        boolean z4 = typedValuePeekValue2 != null;
        return ((z3 && i(i6)) || (z4 && i(z4 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
    }

    public static int h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayS = d0.i.s(resources, theme, attributeSet, s1.a.f11157h0);
        int i4 = 0;
        TypedValue typedValueT = d0.i.t(typedArrayS, xmlPullParser, "value", 0);
        if ((typedValueT != null) && i(typedValueT.type)) {
            i4 = 3;
        }
        typedArrayS.recycle();
        return i4;
    }

    public static boolean i(int i4) {
        return i4 >= 28 && i4 <= 31;
    }

    public static Animator j(Context context, @c.b int i4) throws Resources.NotFoundException {
        return AnimatorInflater.loadAnimator(context, i4);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, @c.b int i4) throws Resources.NotFoundException {
        return l(context, resources, theme, i4, 1.0f);
    }

    public static Animator l(Context context, Resources resources, Resources.Theme theme, @c.b int i4, float f4) throws Resources.NotFoundException {
        XmlResourceParser animation = null;
        try {
            try {
                try {
                    animation = resources.getAnimation(i4);
                    return a(context, resources, theme, animation, f4);
                } catch (IOException e4) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i4));
                    notFoundException.initCause(e4);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e5) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i4));
                notFoundException2.initCause(e5);
                throw notFoundException2;
            }
        } finally {
            if (animation != null) {
                animation.close();
            }
        }
    }

    public static ValueAnimator m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f4, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray typedArrayS = d0.i.s(resources, theme, attributeSet, s1.a.R);
        TypedArray typedArrayS2 = d0.i.s(resources, theme, attributeSet, s1.a.f11167m0);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        r(valueAnimator, typedArrayS, typedArrayS2, f4, xmlPullParser);
        int iL = d0.i.l(typedArrayS, xmlPullParser, "interpolator", 0, 0);
        if (iL > 0) {
            valueAnimator.setInterpolator(d.b(context, iL));
        }
        typedArrayS.recycle();
        if (typedArrayS2 != null) {
            typedArrayS2.recycle();
        }
        return valueAnimator;
    }

    public static Keyframe n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i4, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        TypedArray typedArrayS = d0.i.s(resources, theme, attributeSet, s1.a.f11157h0);
        float fJ = d0.i.j(typedArrayS, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue typedValueT = d0.i.t(typedArrayS, xmlPullParser, "value", 0);
        boolean z3 = typedValueT != null;
        if (i4 == 4) {
            i4 = (z3 && i(typedValueT.type)) ? 3 : 0;
        }
        Keyframe keyframeOfInt = z3 ? i4 != 0 ? (i4 == 1 || i4 == 3) ? Keyframe.ofInt(fJ, d0.i.k(typedArrayS, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(fJ, d0.i.j(typedArrayS, xmlPullParser, "value", 0, 0.0f)) : i4 == 0 ? Keyframe.ofFloat(fJ) : Keyframe.ofInt(fJ);
        int iL = d0.i.l(typedArrayS, xmlPullParser, "interpolator", 1, 0);
        if (iL > 0) {
            keyframeOfInt.setInterpolator(d.b(context, iL));
        }
        typedArrayS.recycle();
        return keyframeOfInt;
    }

    public static ObjectAnimator o(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f4, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m(context, resources, theme, attributeSet, objectAnimator, f4, xmlPullParser);
        return objectAnimator;
    }

    public static PropertyValuesHolder p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i4) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolderOfKeyframe = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i4 == 4) {
                    i4 = h(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe keyframeN = n(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i4, xmlPullParser);
                if (keyframeN != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(keyframeN);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i5 = 0; i5 < size; i5++) {
                Keyframe keyframe3 = keyframeArr[i5];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i5 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i6 = size - 1;
                        if (i5 == i6) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i7 = i5;
                            for (int i8 = i5 + 1; i8 < i6 && keyframeArr[i8].getFraction() < 0.0f; i8++) {
                                i7 = i8;
                            }
                            d(keyframeArr, keyframeArr[i7 + 1].getFraction() - keyframeArr[i5 - 1].getFraction(), i5, i7);
                        }
                    }
                }
            }
            propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i4 == 3) {
                propertyValuesHolderOfKeyframe.setEvaluator(f.a());
            }
        }
        return propertyValuesHolderOfKeyframe;
    }

    public static PropertyValuesHolder[] q(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i4;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("propertyValuesHolder")) {
                TypedArray typedArrayS = d0.i.s(resources, theme, attributeSet, s1.a.f11147c0);
                String strM = d0.i.m(typedArrayS, xmlPullParser, "propertyName", 3);
                int iK = d0.i.k(typedArrayS, xmlPullParser, "valueType", 2, 4);
                PropertyValuesHolder propertyValuesHolderP = p(context, resources, theme, xmlPullParser, strM, iK);
                if (propertyValuesHolderP == null) {
                    propertyValuesHolderP = f(typedArrayS, iK, 0, 1, strM);
                }
                if (propertyValuesHolderP != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(propertyValuesHolderP);
                }
                typedArrayS.recycle();
            }
            xmlPullParser.next();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i4 = 0; i4 < size; i4++) {
                propertyValuesHolderArr[i4] = (PropertyValuesHolder) arrayList.get(i4);
            }
        }
        return propertyValuesHolderArr;
    }

    public static void r(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f4, XmlPullParser xmlPullParser) {
        long jK = d0.i.k(typedArray, xmlPullParser, "duration", 1, 300);
        long jK2 = d0.i.k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int iK = d0.i.k(typedArray, xmlPullParser, "valueType", 7, 4);
        if (d0.i.r(xmlPullParser, "valueFrom") && d0.i.r(xmlPullParser, "valueTo")) {
            if (iK == 4) {
                iK = g(typedArray, 5, 6);
            }
            PropertyValuesHolder propertyValuesHolderF = f(typedArray, iK, 5, 6, s0.a.f11071l);
            if (propertyValuesHolderF != null) {
                valueAnimator.setValues(propertyValuesHolderF);
            }
        }
        valueAnimator.setDuration(jK);
        valueAnimator.setStartDelay(jK2);
        valueAnimator.setRepeatCount(d0.i.k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(d0.i.k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            s(valueAnimator, typedArray2, iK, f4, xmlPullParser);
        }
    }

    public static void s(ValueAnimator valueAnimator, TypedArray typedArray, int i4, float f4, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String strM = d0.i.m(typedArray, xmlPullParser, "pathData", 1);
        if (strM == null) {
            objectAnimator.setPropertyName(d0.i.m(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String strM2 = d0.i.m(typedArray, xmlPullParser, "propertyXName", 2);
        String strM3 = d0.i.m(typedArray, xmlPullParser, "propertyYName", 3);
        if (i4 != 2) {
        }
        if (strM2 != null || strM3 != null) {
            t(u0.e(strM), objectAnimator, f4 * 0.5f, strM2, strM3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    public static void t(Path path, ObjectAnimator objectAnimator, float f4, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f5 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float length = 0.0f;
        do {
            length += pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int iMin = Math.min(100, ((int) (length / f4)) + 1);
        float[] fArr = new float[iMin];
        float[] fArr2 = new float[iMin];
        float[] fArr3 = new float[2];
        float f6 = length / (iMin - 1);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= iMin) {
                break;
            }
            pathMeasure2.getPosTan(f5 - ((Float) arrayList.get(i5)).floatValue(), fArr3, null);
            fArr[i4] = fArr3[0];
            fArr2[i4] = fArr3[1];
            f5 += f6;
            int i6 = i5 + 1;
            if (i6 < arrayList.size() && f5 > ((Float) arrayList.get(i6)).floatValue()) {
                pathMeasure2.nextContour();
                i5 = i6;
            }
            i4++;
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (propertyValuesHolderOfFloat == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat2);
        } else if (propertyValuesHolderOfFloat2 == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat);
        } else {
            objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        }
    }
}
