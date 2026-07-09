package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.e;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f2362h = "ConstraintLayoutStates";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f2363i = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f2364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f2365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2366c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2367d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SparseArray<a> f2368e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray<d> f2369f = new SparseArray<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x.a f2370g = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<C0016b> f2372b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f2374d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f2373c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.m.Tg);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == e.m.Ug) {
                    this.f2371a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2371a);
                } else if (index == e.m.Vg) {
                    this.f2373c = typedArrayObtainStyledAttributes.getResourceId(index, this.f2373c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2373c);
                    context.getResources().getResourceName(this.f2373c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f2374d = dVar;
                        dVar.z(context, this.f2373c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(C0016b c0016b) {
            this.f2372b.add(c0016b);
        }

        public int b(float f4, float f5) {
            for (int i4 = 0; i4 < this.f2372b.size(); i4++) {
                if (this.f2372b.get(i4).a(f4, f5)) {
                    return i4;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    public static class C0016b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f2376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f2378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f2379e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2380f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public d f2381g;

        public C0016b(Context context, XmlPullParser xmlPullParser) {
            this.f2376b = Float.NaN;
            this.f2377c = Float.NaN;
            this.f2378d = Float.NaN;
            this.f2379e = Float.NaN;
            this.f2380f = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.m.Qi);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == e.m.Ri) {
                    this.f2380f = typedArrayObtainStyledAttributes.getResourceId(index, this.f2380f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2380f);
                    context.getResources().getResourceName(this.f2380f);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f2381g = dVar;
                        dVar.z(context, this.f2380f);
                    }
                } else if (index == e.m.Si) {
                    this.f2379e = typedArrayObtainStyledAttributes.getDimension(index, this.f2379e);
                } else if (index == e.m.Ti) {
                    this.f2377c = typedArrayObtainStyledAttributes.getDimension(index, this.f2377c);
                } else if (index == e.m.Ui) {
                    this.f2378d = typedArrayObtainStyledAttributes.getDimension(index, this.f2378d);
                } else if (index == e.m.Vi) {
                    this.f2376b = typedArrayObtainStyledAttributes.getDimension(index, this.f2376b);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean a(float f4, float f5) {
            if (!Float.isNaN(this.f2376b) && f4 < this.f2376b) {
                return false;
            }
            if (!Float.isNaN(this.f2377c) && f5 < this.f2377c) {
                return false;
            }
            if (Float.isNaN(this.f2378d) || f4 <= this.f2378d) {
                return Float.isNaN(this.f2379e) || f5 <= this.f2379e;
            }
            return false;
        }
    }

    public b(Context context, ConstraintLayout constraintLayout, int i4) {
        this.f2364a = constraintLayout;
        a(context, i4);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r8, int r9) {
        /*
            r7 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            r1 = 0
        Ld:
            r2 = 1
            if (r0 == r2) goto La7
            if (r0 == 0) goto L95
            r3 = 2
            if (r0 == r3) goto L17
            goto L98
        L17:
            java.lang.String r0 = r9.getName()     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            int r4 = r0.hashCode()     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L4d;
                case 80204913: goto L43;
                case 1382829617: goto L39;
                case 1657696882: goto L2f;
                case 1901439077: goto L25;
                default: goto L24;
            }     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
        L24:
            goto L57
        L25:
            java.lang.String r4 = "Variant"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            if (r4 == 0) goto L57
            r4 = r6
            goto L58
        L2f:
            java.lang.String r4 = "layoutDescription"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            if (r4 == 0) goto L57
            r4 = 0
            goto L58
        L39:
            java.lang.String r4 = "StateSet"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            if (r4 == 0) goto L57
            r4 = r2
            goto L58
        L43:
            java.lang.String r4 = "State"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            if (r4 == 0) goto L57
            r4 = r3
            goto L58
        L4d:
            java.lang.String r4 = "ConstraintSet"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            if (r4 == 0) goto L57
            r4 = r5
            goto L58
        L57:
            r4 = -1
        L58:
            if (r4 == 0) goto L98
            if (r4 == r2) goto L98
            if (r4 == r3) goto L88
            if (r4 == r6) goto L7d
            if (r4 == r5) goto L79
            java.lang.String r2 = "ConstraintLayoutStates"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            r3.<init>()     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            java.lang.String r4 = "unknown tag "
            r3.append(r4)     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            r3.append(r0)     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            java.lang.String r0 = r3.toString()     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            android.util.Log.v(r2, r0)     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            goto L98
        L79:
            r7.c(r8, r9)     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            goto L98
        L7d:
            androidx.constraintlayout.widget.b$b r0 = new androidx.constraintlayout.widget.b$b     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            r0.<init>(r8, r9)     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            if (r1 == 0) goto L98
            r1.a(r0)     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            goto L98
        L88:
            androidx.constraintlayout.widget.b$a r1 = new androidx.constraintlayout.widget.b$a     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            r1.<init>(r8, r9)     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            android.util.SparseArray<androidx.constraintlayout.widget.b$a> r0 = r7.f2368e     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            int r2 = r1.f2371a     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            r0.put(r2, r1)     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            goto L98
        L95:
            r9.getName()     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
        L98:
            int r0 = r9.next()     // Catch: java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> La3
            goto Ld
        L9e:
            r8 = move-exception
            r8.printStackTrace()
            goto La7
        La3:
            r8 = move-exception
            r8.printStackTrace()
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.a(android.content.Context, int):void");
    }

    public boolean b(int i4, float f4, float f5) {
        int i5 = this.f2366c;
        if (i5 != i4) {
            return true;
        }
        a aVarValueAt = i4 == -1 ? this.f2368e.valueAt(0) : this.f2368e.get(i5);
        int i6 = this.f2367d;
        return (i6 == -1 || !aVarValueAt.f2372b.get(i6).a(f4, f5)) && this.f2367d != aVarValueAt.b(f4, f5);
    }

    public final void c(Context context, XmlPullParser xmlPullParser) {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i4 = 0; i4 < attributeCount; i4++) {
            if (j2.a.f8286f.equals(xmlPullParser.getAttributeName(i4))) {
                String attributeValue = xmlPullParser.getAttributeValue(i4);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), j2.a.f8286f, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.o0(context, xmlPullParser);
                this.f2369f.put(identifier, dVar);
                return;
            }
        }
    }

    public void d(x.a aVar) {
        this.f2370g = aVar;
    }

    public void e(int i4, float f4, float f5) {
        int iB;
        int i5 = this.f2366c;
        if (i5 == i4) {
            a aVarValueAt = i4 == -1 ? this.f2368e.valueAt(0) : this.f2368e.get(i5);
            int i6 = this.f2367d;
            if ((i6 == -1 || !aVarValueAt.f2372b.get(i6).a(f4, f5)) && this.f2367d != (iB = aVarValueAt.b(f4, f5))) {
                d dVar = iB == -1 ? this.f2365b : aVarValueAt.f2372b.get(iB).f2381g;
                int i7 = iB == -1 ? aVarValueAt.f2373c : aVarValueAt.f2372b.get(iB).f2380f;
                if (dVar == null) {
                    return;
                }
                this.f2367d = iB;
                x.a aVar = this.f2370g;
                if (aVar != null) {
                    aVar.b(-1, i7);
                }
                dVar.l(this.f2364a);
                x.a aVar2 = this.f2370g;
                if (aVar2 != null) {
                    aVar2.a(-1, i7);
                    return;
                }
                return;
            }
            return;
        }
        this.f2366c = i4;
        a aVar3 = this.f2368e.get(i4);
        int iB2 = aVar3.b(f4, f5);
        d dVar2 = iB2 == -1 ? aVar3.f2374d : aVar3.f2372b.get(iB2).f2381g;
        int i8 = iB2 == -1 ? aVar3.f2373c : aVar3.f2372b.get(iB2).f2380f;
        if (dVar2 == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i4 + ", dim =" + f4 + ", " + f5);
            return;
        }
        this.f2367d = iB2;
        x.a aVar4 = this.f2370g;
        if (aVar4 != null) {
            aVar4.b(i4, i8);
        }
        dVar2.l(this.f2364a);
        x.a aVar5 = this.f2370g;
        if (aVar5 != null) {
            aVar5.a(i4, i8);
        }
    }
}
