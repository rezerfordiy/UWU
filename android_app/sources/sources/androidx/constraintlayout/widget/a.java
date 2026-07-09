package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f2345h = "TransitionLayout";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f2347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2352g;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0015a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2353a;

        static {
            int[] iArr = new int[b.values().length];
            f2353a = iArr;
            try {
                iArr[b.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2353a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2353a[b.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2353a[b.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2353a[b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2353a[b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2353a[b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public a(a aVar, Object obj) {
        this.f2346a = aVar.f2346a;
        this.f2347b = aVar.f2347b;
        o(obj);
    }

    public static int a(int i4) {
        int i5 = (i4 & (~(i4 >> 31))) - 255;
        return (i5 & (i5 >> 31)) + 255;
    }

    public static HashMap<String, a> c(HashMap<String, a> map, View view) {
        HashMap<String, a> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            try {
                map2.put(str, str.equals("BackgroundColor") ? new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())) : new a(aVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
        return map2;
    }

    public static void h(Context context, XmlPullParser xmlPullParser, HashMap<String, a> map) {
        b bVar;
        Object string;
        int integer;
        float dimension;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.m.U9);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        b bVar2 = null;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            if (index == e.m.V9) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == e.m.W9) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == e.m.Y9) {
                    bVar = b.COLOR_TYPE;
                } else if (index == e.m.X9) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == e.m.ca) {
                        bVar = b.DIMENSION_TYPE;
                        dimension = TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == e.m.Z9) {
                        bVar = b.DIMENSION_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == e.m.aa) {
                        bVar = b.FLOAT_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == e.m.ba) {
                        bVar = b.INT_TYPE;
                        integer = typedArrayObtainStyledAttributes.getInteger(index, -1);
                        string = Integer.valueOf(integer);
                        Object obj = string;
                        bVar2 = bVar;
                        objValueOf = obj;
                    } else if (index == e.m.da) {
                        bVar = b.STRING_TYPE;
                        string = typedArrayObtainStyledAttributes.getString(index);
                        Object obj2 = string;
                        bVar2 = bVar;
                        objValueOf = obj2;
                    }
                    string = Float.valueOf(dimension);
                    Object obj22 = string;
                    bVar2 = bVar;
                    objValueOf = obj22;
                }
                integer = typedArrayObtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                Object obj222 = string;
                bVar2 = bVar;
                objValueOf = obj222;
            }
        }
        if (string2 != null && objValueOf != null) {
            map.put(string2, new a(string2, bVar2, objValueOf));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void i(View view, HashMap<String, a> map) {
        StringBuilder sb;
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            String str2 = "set" + str;
            try {
                switch (C0015a.f2353a[aVar.f2347b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f2352g));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f2352g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f2348c));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f2349d));
                        break;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, aVar.f2350e);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f2351f));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f2349d));
                        break;
                }
            } catch (IllegalAccessException e4) {
                e = e4;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e(f2345h, sb.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e5) {
                Log.e(f2345h, e5.getMessage());
                Log.e(f2345h, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str2);
                Log.e(f2345h, sb2.toString());
            } catch (InvocationTargetException e6) {
                e = e6;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e(f2345h, sb.toString());
                e.printStackTrace();
            }
        }
    }

    public boolean b(a aVar) {
        b bVar;
        if (aVar == null || (bVar = this.f2347b) != aVar.f2347b) {
            return false;
        }
        switch (C0015a.f2353a[bVar.ordinal()]) {
            case 1:
            case 2:
                return this.f2352g == aVar.f2352g;
            case 3:
                return this.f2348c == aVar.f2348c;
            case 4:
                return this.f2349d == aVar.f2349d;
            case 5:
                return this.f2348c == aVar.f2348c;
            case 6:
                return this.f2351f == aVar.f2351f;
            case 7:
                return this.f2349d == aVar.f2349d;
            default:
                return false;
        }
    }

    public b d() {
        return this.f2347b;
    }

    public float e() {
        switch (C0015a.f2353a[this.f2347b.ordinal()]) {
            case 1:
            case 2:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 3:
                return this.f2348c;
            case 4:
                return this.f2349d;
            case 5:
                throw new RuntimeException("Cannot interpolate String");
            case 6:
                return this.f2351f ? 1.0f : 0.0f;
            case 7:
                return this.f2349d;
            default:
                return Float.NaN;
        }
    }

    public void f(float[] fArr) {
        switch (C0015a.f2353a[this.f2347b.ordinal()]) {
            case 1:
            case 2:
                int i4 = (this.f2352g >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i4 / 255.0f;
                return;
            case 3:
                fArr[0] = this.f2348c;
                return;
            case 4:
                fArr[0] = this.f2349d;
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                fArr[0] = this.f2351f ? 1.0f : 0.0f;
                return;
            case 7:
                fArr[0] = this.f2349d;
                return;
            default:
                return;
        }
    }

    public int g() {
        int i4 = C0015a.f2353a[this.f2347b.ordinal()];
        return (i4 == 1 || i4 == 2) ? 4 : 1;
    }

    public void j(int i4) {
        this.f2352g = i4;
    }

    public void k(float f4) {
        this.f2349d = f4;
    }

    public void l(int i4) {
        this.f2348c = i4;
    }

    public void m(View view, float[] fArr) {
        StringBuilder sb;
        String str;
        Class<?> cls = view.getClass();
        String str2 = "set" + this.f2346a;
        try {
            boolean z3 = true;
            switch (C0015a.f2353a[this.f2347b.ordinal()]) {
                case 1:
                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf((a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 2:
                    Method method = cls.getMethod(str2, Drawable.class);
                    int iA = (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iA);
                    method.invoke(view, colorDrawable);
                    return;
                case 3:
                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 4:
                    cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + this.f2346a);
                case 6:
                    Method method2 = cls.getMethod(str2, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z3 = false;
                    }
                    objArr[0] = Boolean.valueOf(z3);
                    method2.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e4) {
            e = e4;
            sb = new StringBuilder();
            str = "cannot access method ";
            sb.append(str);
            sb.append(str2);
            sb.append("on View \"");
            sb.append(r.c.k(view));
            sb.append("\"");
            Log.e(f2345h, sb.toString());
            e.printStackTrace();
        } catch (NoSuchMethodException e5) {
            e = e5;
            sb = new StringBuilder();
            str = "no method ";
            sb.append(str);
            sb.append(str2);
            sb.append("on View \"");
            sb.append(r.c.k(view));
            sb.append("\"");
            Log.e(f2345h, sb.toString());
            e.printStackTrace();
        } catch (InvocationTargetException e6) {
            e = e6;
            e.printStackTrace();
        }
    }

    public void n(String str) {
        this.f2350e = str;
    }

    public void o(Object obj) {
        switch (C0015a.f2353a[this.f2347b.ordinal()]) {
            case 1:
            case 2:
                this.f2352g = ((Integer) obj).intValue();
                break;
            case 3:
                this.f2348c = ((Integer) obj).intValue();
                break;
            case 4:
            case 7:
                this.f2349d = ((Float) obj).floatValue();
                break;
            case 5:
                this.f2350e = (String) obj;
                break;
            case 6:
                this.f2351f = ((Boolean) obj).booleanValue();
                break;
        }
    }

    public void p(float[] fArr) {
        float f4;
        switch (C0015a.f2353a[this.f2347b.ordinal()]) {
            case 1:
            case 2:
                int iHSVToColor = Color.HSVToColor(fArr);
                this.f2352g = iHSVToColor;
                this.f2352g = (a((int) (fArr[3] * 255.0f)) << 24) | (iHSVToColor & z1.f12255s);
                return;
            case 3:
                this.f2348c = (int) fArr[0];
                return;
            case 4:
                f4 = fArr[0];
                break;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                this.f2351f = ((double) fArr[0]) > 0.5d;
                return;
            case 7:
                f4 = fArr[0];
                break;
            default:
                return;
        }
        this.f2349d = f4;
    }

    public a(String str, b bVar) {
        this.f2346a = str;
        this.f2347b = bVar;
    }

    public a(String str, b bVar, Object obj) {
        this.f2346a = str;
        this.f2347b = bVar;
        o(obj);
    }
}
