package d0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import c.j0;
import c.k0;
import c.r0;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y.a;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f6579a = 400;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f6580b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f6581c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f6582d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f6583e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f6584f = 500;

    public interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @j0
        public final C0053d[] f6585a;

        public c(@j0 C0053d[] c0053dArr) {
            this.f6585a = c0053dArr;
        }

        @j0
        public C0053d[] a() {
            return this.f6585a;
        }
    }

    /* JADX INFO: renamed from: d0.d$d, reason: collision with other inner class name */
    public static final class C0053d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @j0
        public final String f6586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f6588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f6589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6591f;

        public C0053d(@j0 String str, int i4, boolean z3, @k0 String str2, int i5, int i6) {
            this.f6586a = str;
            this.f6587b = i4;
            this.f6588c = z3;
            this.f6589d = str2;
            this.f6590e = i5;
            this.f6591f = i6;
        }

        @j0
        public String a() {
            return this.f6586a;
        }

        public int b() {
            return this.f6591f;
        }

        public int c() {
            return this.f6590e;
        }

        @k0
        public String d() {
            return this.f6589d;
        }

        public int e() {
            return this.f6587b;
        }

        public boolean f() {
            return this.f6588c;
        }
    }

    public static final class e implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @j0
        public final q0.d f6592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @k0
        public final String f6595d;

        public e(@j0 q0.d dVar, int i4, int i5) {
            this(dVar, i4, i5, null);
        }

        public int a() {
            return this.f6594c;
        }

        @j0
        public q0.d b() {
            return this.f6592a;
        }

        @k0
        @r0({r0.a.LIBRARY})
        public String c() {
            return this.f6595d;
        }

        public int d() {
            return this.f6593b;
        }

        @r0({r0.a.LIBRARY})
        public e(@j0 q0.d dVar, int i4, int i5, @k0 String str) {
            this.f6592a = dVar;
            this.f6594c = i4;
            this.f6593b = i5;
            this.f6595d = str;
        }
    }

    public static int a(TypedArray typedArray, int i4) {
        return typedArray.getType(i4);
    }

    @k0
    public static a b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, @c.e int i4) {
        if (i4 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i4);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i5 = 0; i5 < typedArrayObtainTypedArray.length(); i5++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i5, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i4)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    @k0
    public static a d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    @k0
    public static a e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.j.f12772e);
        String string = typedArrayObtainAttributes.getString(a.j.f12773f);
        String string2 = typedArrayObtainAttributes.getString(a.j.f12777j);
        String string3 = typedArrayObtainAttributes.getString(a.j.f12778k);
        int resourceId = typedArrayObtainAttributes.getResourceId(a.j.f12774g, 0);
        int integer = typedArrayObtainAttributes.getInteger(a.j.f12775h, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(a.j.f12776i, 500);
        String string4 = typedArrayObtainAttributes.getString(a.j.f12779l);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new e(new q0.d(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((C0053d[]) arrayList.toArray(new C0053d[arrayList.size()]));
    }

    public static C0053d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.j.f12780m);
        int i4 = a.j.f12789v;
        if (!typedArrayObtainAttributes.hasValue(i4)) {
            i4 = a.j.f12782o;
        }
        int i5 = typedArrayObtainAttributes.getInt(i4, 400);
        int i6 = a.j.f12787t;
        if (!typedArrayObtainAttributes.hasValue(i6)) {
            i6 = a.j.f12783p;
        }
        boolean z3 = 1 == typedArrayObtainAttributes.getInt(i6, 0);
        int i7 = a.j.f12790w;
        if (!typedArrayObtainAttributes.hasValue(i7)) {
            i7 = a.j.f12784q;
        }
        int i8 = a.j.f12788u;
        if (!typedArrayObtainAttributes.hasValue(i8)) {
            i8 = a.j.f12785r;
        }
        String string = typedArrayObtainAttributes.getString(i8);
        int i9 = typedArrayObtainAttributes.getInt(i7, 0);
        int i10 = a.j.f12786s;
        if (!typedArrayObtainAttributes.hasValue(i10)) {
            i10 = a.j.f12781n;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i10, 0);
        String string2 = typedArrayObtainAttributes.getString(i10);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0053d(string2, i5, z3, string, i9, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i4 = 1;
        while (i4 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i4++;
            } else if (next == 3) {
                i4--;
            }
        }
    }

    public static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
