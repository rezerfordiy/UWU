package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c extends DataSetObservable {
    public static final Object A = new Object();
    public static final Map<String, c> B = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f1619n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f1620o = "c";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f1621p = "historical-records";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f1622q = "historical-record";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f1623r = "activity";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f1624s = "time";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f1625t = "weight";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f1626u = "activity_choser_model_history.xml";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f1627v = 50;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f1628w = 5;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final float f1629x = 1.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f1630y = ".xml";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f1631z = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f1635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Intent f1637f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f1644m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1632a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f1633b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<e> f1634c = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC0011c f1638g = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1639h = 50;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1640i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1641j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1642k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1643l = false;

    public interface a {
        void setActivityChooserModel(c cVar);
    }

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ResolveInfo f1645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1646c;

        public b(ResolveInfo resolveInfo) {
            this.f1645b = resolveInfo;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Float.floatToIntBits(bVar.f1646c) - Float.floatToIntBits(this.f1646c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && b.class == obj.getClass() && Float.floatToIntBits(this.f1646c) == Float.floatToIntBits(((b) obj).f1646c);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f1646c) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.f1645b.toString() + "; weight:" + new BigDecimal(this.f1646c) + "]";
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    public interface InterfaceC0011c {
        void a(Intent intent, List<b> list, List<e> list2);
    }

    public static final class d implements InterfaceC0011c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final float f1647b = 0.95f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<ComponentName, b> f1648a = new HashMap();

        @Override // androidx.appcompat.widget.c.InterfaceC0011c
        public void a(Intent intent, List<b> list, List<e> list2) {
            Map<ComponentName, b> map = this.f1648a;
            map.clear();
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                b bVar = list.get(i4);
                bVar.f1646c = 0.0f;
                ActivityInfo activityInfo = bVar.f1645b.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), bVar);
            }
            float f4 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                e eVar = list2.get(size2);
                b bVar2 = map.get(eVar.f1649a);
                if (bVar2 != null) {
                    bVar2.f1646c += eVar.f1651c * f4;
                    f4 *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f1649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f1650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f1651c;

        public e(ComponentName componentName, long j4, float f4) {
            this.f1649a = componentName;
            this.f1650b = j4;
            this.f1651c = f4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            ComponentName componentName = this.f1649a;
            if (componentName == null) {
                if (eVar.f1649a != null) {
                    return false;
                }
            } else if (!componentName.equals(eVar.f1649a)) {
                return false;
            }
            return this.f1650b == eVar.f1650b && Float.floatToIntBits(this.f1651c) == Float.floatToIntBits(eVar.f1651c);
        }

        public int hashCode() {
            ComponentName componentName = this.f1649a;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j4 = this.f1650b;
            return ((((iHashCode + 31) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + Float.floatToIntBits(this.f1651c);
        }

        public String toString() {
            return "[; activity:" + this.f1649a + "; time:" + this.f1650b + "; weight:" + new BigDecimal(this.f1651c) + "]";
        }

        public e(String str, long j4, float f4) {
            this(ComponentName.unflattenFromString(str), j4, f4);
        }
    }

    public interface f {
        boolean a(c cVar, Intent intent);
    }

    public final class g extends AsyncTask<Object, Void, Void> {
        public g() {
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
                Method dump skipped, instruction units count: 244
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.g.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    public c(Context context, String str) {
        this.f1635d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(f1630y)) {
            this.f1636e = str;
            return;
        }
        this.f1636e = str + f1630y;
    }

    public static c d(Context context, String str) {
        c cVar;
        synchronized (A) {
            Map<String, c> map = B;
            cVar = map.get(str);
            if (cVar == null) {
                cVar = new c(context, str);
                map.put(str, cVar);
            }
        }
        return cVar;
    }

    public final boolean a(e eVar) {
        boolean zAdd = this.f1634c.add(eVar);
        if (zAdd) {
            this.f1642k = true;
            n();
            m();
            v();
            notifyChanged();
        }
        return zAdd;
    }

    public Intent b(int i4) {
        synchronized (this.f1632a) {
            if (this.f1637f == null) {
                return null;
            }
            c();
            ActivityInfo activityInfo = this.f1633b.get(i4).f1645b.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            Intent intent = new Intent(this.f1637f);
            intent.setComponent(componentName);
            if (this.f1644m != null) {
                if (this.f1644m.a(this, new Intent(intent))) {
                    return null;
                }
            }
            a(new e(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public final void c() {
        boolean zL = l() | o();
        n();
        if (zL) {
            v();
            notifyChanged();
        }
    }

    public ResolveInfo e(int i4) {
        ResolveInfo resolveInfo;
        synchronized (this.f1632a) {
            c();
            resolveInfo = this.f1633b.get(i4).f1645b;
        }
        return resolveInfo;
    }

    public int f() {
        int size;
        synchronized (this.f1632a) {
            c();
            size = this.f1633b.size();
        }
        return size;
    }

    public int g(ResolveInfo resolveInfo) {
        synchronized (this.f1632a) {
            c();
            List<b> list = this.f1633b;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (list.get(i4).f1645b == resolveInfo) {
                    return i4;
                }
            }
            return -1;
        }
    }

    public ResolveInfo h() {
        synchronized (this.f1632a) {
            c();
            if (this.f1633b.isEmpty()) {
                return null;
            }
            return this.f1633b.get(0).f1645b;
        }
    }

    public int i() {
        int i4;
        synchronized (this.f1632a) {
            i4 = this.f1639h;
        }
        return i4;
    }

    public int j() {
        int size;
        synchronized (this.f1632a) {
            c();
            size = this.f1634c.size();
        }
        return size;
    }

    public Intent k() {
        Intent intent;
        synchronized (this.f1632a) {
            intent = this.f1637f;
        }
        return intent;
    }

    public final boolean l() {
        if (!this.f1643l || this.f1637f == null) {
            return false;
        }
        this.f1643l = false;
        this.f1633b.clear();
        List<ResolveInfo> listQueryIntentActivities = this.f1635d.getPackageManager().queryIntentActivities(this.f1637f, 0);
        int size = listQueryIntentActivities.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f1633b.add(new b(listQueryIntentActivities.get(i4)));
        }
        return true;
    }

    public final void m() {
        if (!this.f1641j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f1642k) {
            this.f1642k = false;
            if (TextUtils.isEmpty(this.f1636e)) {
                return;
            }
            new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f1634c), this.f1636e);
        }
    }

    public final void n() {
        int size = this.f1634c.size() - this.f1639h;
        if (size <= 0) {
            return;
        }
        this.f1642k = true;
        for (int i4 = 0; i4 < size; i4++) {
            this.f1634c.remove(0);
        }
    }

    public final boolean o() {
        if (!this.f1640i || !this.f1642k || TextUtils.isEmpty(this.f1636e)) {
            return false;
        }
        this.f1640i = false;
        this.f1641j = true;
        p();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            r10 = this;
            java.lang.String r0 = "Error reading historical recrod file: "
            android.content.Context r1 = r10.f1635d     // Catch: java.io.FileNotFoundException -> Lc2
            java.lang.String r2 = r10.f1636e     // Catch: java.io.FileNotFoundException -> Lc2
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch: java.io.FileNotFoundException -> Lc2
            org.xmlpull.v1.XmlPullParser r2 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r3 = "UTF-8"
            r2.setInput(r1, r3)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            r3 = 0
        L14:
            r4 = 1
            if (r3 == r4) goto L1f
            r5 = 2
            if (r3 == r5) goto L1f
            int r3 = r2.next()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            goto L14
        L1f:
            java.lang.String r3 = "historical-records"
            java.lang.String r5 = r2.getName()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            if (r3 == 0) goto L7c
            java.util.List<androidx.appcompat.widget.c$e> r3 = r10.f1634c     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            r3.clear()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
        L30:
            int r5 = r2.next()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            if (r5 != r4) goto L3d
            if (r1 == 0) goto Lbb
        L38:
            r1.close()     // Catch: java.io.IOException -> Lbb
            goto Lbb
        L3d:
            r6 = 3
            if (r5 == r6) goto L30
            r6 = 4
            if (r5 != r6) goto L44
            goto L30
        L44:
            java.lang.String r5 = r2.getName()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r6 = "historical-record"
            boolean r5 = r6.equals(r5)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            if (r5 == 0) goto L74
            java.lang.String r5 = "activity"
            r6 = 0
            java.lang.String r5 = r2.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r7 = "time"
            java.lang.String r7 = r2.getAttributeValue(r6, r7)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            long r7 = java.lang.Long.parseLong(r7)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r9 = "weight"
            java.lang.String r6 = r2.getAttributeValue(r6, r9)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            androidx.appcompat.widget.c$e r9 = new androidx.appcompat.widget.c$e     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            r9.<init>(r5, r7, r6)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            r3.add(r9)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            goto L30
        L74:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r3 = "Share records file not well-formed."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            throw r2     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
        L7c:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r3 = "Share records file does not start with historical-records tag."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            throw r2     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
        L84:
            r0 = move-exception
            goto Lbc
        L86:
            r2 = move-exception
            java.lang.String r3 = androidx.appcompat.widget.c.f1620o     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r4.<init>()     // Catch: java.lang.Throwable -> L84
            r4.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r10.f1636e     // Catch: java.lang.Throwable -> L84
            r4.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L84
            android.util.Log.e(r3, r0, r2)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto Lbb
            goto L38
        La0:
            r2 = move-exception
            java.lang.String r3 = androidx.appcompat.widget.c.f1620o     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r4.<init>()     // Catch: java.lang.Throwable -> L84
            r4.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r10.f1636e     // Catch: java.lang.Throwable -> L84
            r4.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L84
            android.util.Log.e(r3, r0, r2)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto Lbb
            goto L38
        Lbb:
            return
        Lbc:
            if (r1 == 0) goto Lc1
            r1.close()     // Catch: java.io.IOException -> Lc1
        Lc1:
            throw r0
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.p():void");
    }

    public void q(InterfaceC0011c interfaceC0011c) {
        synchronized (this.f1632a) {
            if (this.f1638g == interfaceC0011c) {
                return;
            }
            this.f1638g = interfaceC0011c;
            if (v()) {
                notifyChanged();
            }
        }
    }

    public void r(int i4) {
        synchronized (this.f1632a) {
            c();
            b bVar = this.f1633b.get(i4);
            b bVar2 = this.f1633b.get(0);
            float f4 = bVar2 != null ? (bVar2.f1646c - bVar.f1646c) + 5.0f : 1.0f;
            ActivityInfo activityInfo = bVar.f1645b.activityInfo;
            a(new e(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f4));
        }
    }

    public void s(int i4) {
        synchronized (this.f1632a) {
            if (this.f1639h == i4) {
                return;
            }
            this.f1639h = i4;
            n();
            if (v()) {
                notifyChanged();
            }
        }
    }

    public void t(Intent intent) {
        synchronized (this.f1632a) {
            if (this.f1637f == intent) {
                return;
            }
            this.f1637f = intent;
            this.f1643l = true;
            c();
        }
    }

    public void u(f fVar) {
        synchronized (this.f1632a) {
            this.f1644m = fVar;
        }
    }

    public final boolean v() {
        if (this.f1638g == null || this.f1637f == null || this.f1633b.isEmpty() || this.f1634c.isEmpty()) {
            return false;
        }
        this.f1638g.a(this.f1637f, this.f1633b, Collections.unmodifiableList(this.f1634c));
        return true;
    }
}
