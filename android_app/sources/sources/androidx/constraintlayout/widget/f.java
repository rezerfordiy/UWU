package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.e;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f3316h = "ConstraintLayoutStates";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f3317i = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f3319b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3318a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3320c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3321d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SparseArray<a> f3322e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray<d> f3323f = new SparseArray<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x.a f3324g = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<b> f3326b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f3328d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f3327c = -1;
            this.f3328d = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.m.Tg);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == e.m.Ug) {
                    this.f3325a = typedArrayObtainStyledAttributes.getResourceId(index, this.f3325a);
                } else if (index == e.m.Vg) {
                    this.f3327c = typedArrayObtainStyledAttributes.getResourceId(index, this.f3327c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3327c);
                    context.getResources().getResourceName(this.f3327c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f3328d = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.f3326b.add(bVar);
        }

        public int b(float f4, float f5) {
            for (int i4 = 0; i4 < this.f3326b.size(); i4++) {
                if (this.f3326b.get(i4).a(f4, f5)) {
                    return i4;
                }
            }
            return -1;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f3330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f3331c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f3332d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f3333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3334f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f3335g;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f3330b = Float.NaN;
            this.f3331c = Float.NaN;
            this.f3332d = Float.NaN;
            this.f3333e = Float.NaN;
            this.f3334f = -1;
            this.f3335g = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.m.Qi);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == e.m.Ri) {
                    this.f3334f = typedArrayObtainStyledAttributes.getResourceId(index, this.f3334f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3334f);
                    context.getResources().getResourceName(this.f3334f);
                    if ("layout".equals(resourceTypeName)) {
                        this.f3335g = true;
                    }
                } else if (index == e.m.Si) {
                    this.f3333e = typedArrayObtainStyledAttributes.getDimension(index, this.f3333e);
                } else if (index == e.m.Ti) {
                    this.f3331c = typedArrayObtainStyledAttributes.getDimension(index, this.f3331c);
                } else if (index == e.m.Ui) {
                    this.f3332d = typedArrayObtainStyledAttributes.getDimension(index, this.f3332d);
                } else if (index == e.m.Vi) {
                    this.f3330b = typedArrayObtainStyledAttributes.getDimension(index, this.f3330b);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean a(float f4, float f5) {
            if (!Float.isNaN(this.f3330b) && f4 < this.f3330b) {
                return false;
            }
            if (!Float.isNaN(this.f3331c) && f5 < this.f3331c) {
                return false;
            }
            if (Float.isNaN(this.f3332d) || f4 <= this.f3332d) {
                return Float.isNaN(this.f3333e) || f5 <= this.f3333e;
            }
            return false;
        }
    }

    public f(Context context, XmlPullParser xmlPullParser) {
        b(context, xmlPullParser);
    }

    public int a(int i4, int i5, float f4, float f5) {
        a aVar = this.f3322e.get(i5);
        if (aVar == null) {
            return i5;
        }
        if (f4 == -1.0f || f5 == -1.0f) {
            if (aVar.f3327c == i4) {
                return i4;
            }
            Iterator<b> it = aVar.f3326b.iterator();
            while (it.hasNext()) {
                if (i4 == it.next().f3334f) {
                    return i4;
                }
            }
            return aVar.f3327c;
        }
        b bVar = null;
        for (b bVar2 : aVar.f3326b) {
            if (bVar2.a(f4, f5)) {
                if (i4 == bVar2.f3334f) {
                    return i4;
                }
                bVar = bVar2;
            }
        }
        return bVar != null ? bVar.f3334f : aVar.f3327c;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.f.b(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public boolean c(int i4, float f4, float f5) {
        int i5 = this.f3320c;
        if (i5 != i4) {
            return true;
        }
        a aVarValueAt = i4 == -1 ? this.f3322e.valueAt(0) : this.f3322e.get(i5);
        int i6 = this.f3321d;
        return (i6 == -1 || !aVarValueAt.f3326b.get(i6).a(f4, f5)) && this.f3321d != aVarValueAt.b(f4, f5);
    }

    public void d(x.a aVar) {
        this.f3324g = aVar;
    }

    public int e(int i4, int i5, int i6) {
        return f(-1, i4, i5, i6);
    }

    public int f(int i4, int i5, float f4, float f5) {
        int iB;
        if (i4 == i5) {
            a aVarValueAt = i5 == -1 ? this.f3322e.valueAt(0) : this.f3322e.get(this.f3320c);
            if (aVarValueAt == null) {
                return -1;
            }
            return ((this.f3321d == -1 || !aVarValueAt.f3326b.get(i4).a(f4, f5)) && i4 != (iB = aVarValueAt.b(f4, f5))) ? iB == -1 ? aVarValueAt.f3327c : aVarValueAt.f3326b.get(iB).f3334f : i4;
        }
        a aVar = this.f3322e.get(i5);
        if (aVar == null) {
            return -1;
        }
        int iB2 = aVar.b(f4, f5);
        return iB2 == -1 ? aVar.f3327c : aVar.f3326b.get(iB2).f3334f;
    }
}
