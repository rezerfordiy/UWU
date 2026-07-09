package r;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import r.t;

/* JADX INFO: loaded from: classes.dex */
public class o implements Comparable<o> {
    public static final String D = "MotionPaths";
    public static final boolean E = false;
    public static final int F = 1;
    public static final int G = 2;
    public static String[] H = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10652d;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public q.c f10665q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f10667s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f10668t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f10669u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f10670v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f10671w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f10650b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10651c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10653e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f10654f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f10655g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f10656h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f10657i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f10658j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f10659k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f10660l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f10661m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f10662n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f10663o = 0.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f10664p = 0.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10666r = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f10672x = Float.NaN;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f10673y = Float.NaN;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LinkedHashMap<String, androidx.constraintlayout.widget.a> f10674z = new LinkedHashMap<>();
    public int A = 0;
    public double[] B = new double[18];
    public double[] C = new double[18];

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(HashMap<String, t> map, int i4) {
        String str;
        for (String str2 : map.keySet()) {
            t tVar = map.get(str2);
            str2.hashCode();
            byte b4 = -1;
            switch (str2.hashCode()) {
                case -1249320806:
                    if (str2.equals(e.f10501j)) {
                        b4 = 0;
                    }
                    break;
                case -1249320805:
                    if (str2.equals(e.f10502k)) {
                        b4 = 1;
                    }
                    break;
                case -1225497657:
                    if (str2.equals(e.f10511t)) {
                        b4 = 2;
                    }
                    break;
                case -1225497656:
                    if (str2.equals(e.f10512u)) {
                        b4 = 3;
                    }
                    break;
                case -1225497655:
                    if (str2.equals(e.f10513v)) {
                        b4 = 4;
                    }
                    break;
                case -1001078227:
                    if (str2.equals("progress")) {
                        b4 = 5;
                    }
                    break;
                case -908189618:
                    if (str2.equals(e.f10506o)) {
                        b4 = 6;
                    }
                    break;
                case -908189617:
                    if (str2.equals(e.f10507p)) {
                        b4 = 7;
                    }
                    break;
                case -760884510:
                    if (str2.equals(e.f10503l)) {
                        b4 = 8;
                    }
                    break;
                case -760884509:
                    if (str2.equals(e.f10504m)) {
                        b4 = 9;
                    }
                    break;
                case -40300674:
                    if (str2.equals(e.f10500i)) {
                        b4 = 10;
                    }
                    break;
                case -4379043:
                    if (str2.equals(e.f10499h)) {
                        b4 = 11;
                    }
                    break;
                case 37232917:
                    if (str2.equals(e.f10505n)) {
                        b4 = 12;
                    }
                    break;
                case 92909918:
                    if (str2.equals(e.f10498g)) {
                        b4 = 13;
                    }
                    break;
            }
            float f4 = 1.0f;
            float f5 = 0.0f;
            switch (b4) {
                case 0:
                    if (!Float.isNaN(this.f10656h)) {
                        f5 = this.f10656h;
                    }
                    tVar.f(i4, f5);
                    break;
                case 1:
                    if (!Float.isNaN(this.f10657i)) {
                        f5 = this.f10657i;
                    }
                    tVar.f(i4, f5);
                    break;
                case 2:
                    if (!Float.isNaN(this.f10662n)) {
                        f5 = this.f10662n;
                    }
                    tVar.f(i4, f5);
                    break;
                case 3:
                    if (!Float.isNaN(this.f10663o)) {
                        f5 = this.f10663o;
                    }
                    tVar.f(i4, f5);
                    break;
                case 4:
                    if (!Float.isNaN(this.f10664p)) {
                        f5 = this.f10664p;
                    }
                    tVar.f(i4, f5);
                    break;
                case 5:
                    if (!Float.isNaN(this.f10673y)) {
                        f5 = this.f10673y;
                    }
                    tVar.f(i4, f5);
                    break;
                case 6:
                    if (!Float.isNaN(this.f10658j)) {
                        f4 = this.f10658j;
                    }
                    tVar.f(i4, f4);
                    break;
                case 7:
                    if (!Float.isNaN(this.f10659k)) {
                        f4 = this.f10659k;
                    }
                    tVar.f(i4, f4);
                    break;
                case 8:
                    if (!Float.isNaN(this.f10660l)) {
                        f5 = this.f10660l;
                    }
                    tVar.f(i4, f5);
                    break;
                case 9:
                    if (!Float.isNaN(this.f10661m)) {
                        f5 = this.f10661m;
                    }
                    tVar.f(i4, f5);
                    break;
                case 10:
                    if (!Float.isNaN(this.f10655g)) {
                        f5 = this.f10655g;
                    }
                    tVar.f(i4, f5);
                    break;
                case 11:
                    if (!Float.isNaN(this.f10654f)) {
                        f5 = this.f10654f;
                    }
                    tVar.f(i4, f5);
                    break;
                case 12:
                    if (!Float.isNaN(this.f10672x)) {
                        f5 = this.f10672x;
                    }
                    tVar.f(i4, f5);
                    break;
                case 13:
                    if (!Float.isNaN(this.f10650b)) {
                        f4 = this.f10650b;
                    }
                    tVar.f(i4, f4);
                    break;
                default:
                    if (str2.startsWith(e.f10515x)) {
                        String str3 = str2.split(",")[1];
                        if (this.f10674z.containsKey(str3)) {
                            androidx.constraintlayout.widget.a aVar = this.f10674z.get(str3);
                            if (tVar instanceof t.b) {
                                ((t.b) tVar).j(i4, aVar);
                            } else {
                                str = str2 + " splineSet not a CustomSet frame = " + i4 + ", value" + aVar.e() + tVar;
                            }
                        } else {
                            str = "UNKNOWN customName " + str3;
                        }
                    } else {
                        str = "UNKNOWN spline " + str2;
                    }
                    Log.e("MotionPaths", str);
                    break;
            }
        }
    }

    public void b(View view) {
        this.f10652d = view.getVisibility();
        this.f10650b = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f10653e = false;
        this.f10654f = view.getElevation();
        this.f10655g = view.getRotation();
        this.f10656h = view.getRotationX();
        this.f10657i = view.getRotationY();
        this.f10658j = view.getScaleX();
        this.f10659k = view.getScaleY();
        this.f10660l = view.getPivotX();
        this.f10661m = view.getPivotY();
        this.f10662n = view.getTranslationX();
        this.f10663o = view.getTranslationY();
        this.f10664p = view.getTranslationZ();
    }

    public void c(d.a aVar) {
        d.C0017d c0017d = aVar.f2463b;
        int i4 = c0017d.f2547c;
        this.f10651c = i4;
        int i5 = c0017d.f2546b;
        this.f10652d = i5;
        this.f10650b = (i5 == 0 || i4 != 0) ? c0017d.f2548d : 0.0f;
        d.e eVar = aVar.f2466e;
        this.f10653e = eVar.f2573l;
        this.f10654f = eVar.f2574m;
        this.f10655g = eVar.f2563b;
        this.f10656h = eVar.f2564c;
        this.f10657i = eVar.f2565d;
        this.f10658j = eVar.f2566e;
        this.f10659k = eVar.f2567f;
        this.f10660l = eVar.f2568g;
        this.f10661m = eVar.f2569h;
        this.f10662n = eVar.f2570i;
        this.f10663o = eVar.f2571j;
        this.f10664p = eVar.f2572k;
        this.f10665q = q.c.c(aVar.f2464c.f2540c);
        d.c cVar = aVar.f2464c;
        this.f10672x = cVar.f2544g;
        this.f10666r = cVar.f2542e;
        this.f10673y = aVar.f2463b.f2549e;
        for (String str : aVar.f2467f.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = aVar.f2467f.get(str);
            if (aVar2.d() != a.b.STRING_TYPE) {
                this.f10674z.put(str, aVar2);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(o oVar) {
        return Float.compare(this.f10667s, oVar.f10667s);
    }

    public final boolean e(float f4, float f5) {
        return (Float.isNaN(f4) || Float.isNaN(f5)) ? Float.isNaN(f4) != Float.isNaN(f5) : Math.abs(f4 - f5) > 1.0E-6f;
    }

    public void f(o oVar, HashSet<String> hashSet) {
        if (e(this.f10650b, oVar.f10650b)) {
            hashSet.add(e.f10498g);
        }
        if (e(this.f10654f, oVar.f10654f)) {
            hashSet.add(e.f10499h);
        }
        int i4 = this.f10652d;
        int i5 = oVar.f10652d;
        if (i4 != i5 && this.f10651c == 0 && (i4 == 0 || i5 == 0)) {
            hashSet.add(e.f10498g);
        }
        if (e(this.f10655g, oVar.f10655g)) {
            hashSet.add(e.f10500i);
        }
        if (!Float.isNaN(this.f10672x) || !Float.isNaN(oVar.f10672x)) {
            hashSet.add(e.f10505n);
        }
        if (!Float.isNaN(this.f10673y) || !Float.isNaN(oVar.f10673y)) {
            hashSet.add("progress");
        }
        if (e(this.f10656h, oVar.f10656h)) {
            hashSet.add(e.f10501j);
        }
        if (e(this.f10657i, oVar.f10657i)) {
            hashSet.add(e.f10502k);
        }
        if (e(this.f10660l, oVar.f10660l)) {
            hashSet.add(e.f10503l);
        }
        if (e(this.f10661m, oVar.f10661m)) {
            hashSet.add(e.f10504m);
        }
        if (e(this.f10658j, oVar.f10658j)) {
            hashSet.add(e.f10506o);
        }
        if (e(this.f10659k, oVar.f10659k)) {
            hashSet.add(e.f10507p);
        }
        if (e(this.f10662n, oVar.f10662n)) {
            hashSet.add(e.f10511t);
        }
        if (e(this.f10663o, oVar.f10663o)) {
            hashSet.add(e.f10512u);
        }
        if (e(this.f10664p, oVar.f10664p)) {
            hashSet.add(e.f10513v);
        }
    }

    public void g(o oVar, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | e(this.f10667s, oVar.f10667s);
        zArr[1] = zArr[1] | e(this.f10668t, oVar.f10668t);
        zArr[2] = zArr[2] | e(this.f10669u, oVar.f10669u);
        zArr[3] = zArr[3] | e(this.f10670v, oVar.f10670v);
        zArr[4] = e(this.f10671w, oVar.f10671w) | zArr[4];
    }

    public void h(double[] dArr, int[] iArr) {
        float[] fArr = {this.f10667s, this.f10668t, this.f10669u, this.f10670v, this.f10671w, this.f10650b, this.f10654f, this.f10655g, this.f10656h, this.f10657i, this.f10658j, this.f10659k, this.f10660l, this.f10661m, this.f10662n, this.f10663o, this.f10664p, this.f10672x};
        int i4 = 0;
        for (int i5 : iArr) {
            if (i5 < 18) {
                dArr[i4] = fArr[r4];
                i4++;
            }
        }
    }

    public int i(String str, double[] dArr, int i4) {
        androidx.constraintlayout.widget.a aVar = this.f10674z.get(str);
        if (aVar.g() == 1) {
            dArr[i4] = aVar.e();
            return 1;
        }
        int iG = aVar.g();
        aVar.f(new float[iG]);
        int i5 = 0;
        while (i5 < iG) {
            dArr[i4] = r1[i5];
            i5++;
            i4++;
        }
        return iG;
    }

    public int j(String str) {
        return this.f10674z.get(str).g();
    }

    public boolean k(String str) {
        return this.f10674z.containsKey(str);
    }

    public void l(float f4, float f5, float f6, float f7) {
        this.f10668t = f4;
        this.f10669u = f5;
        this.f10670v = f6;
        this.f10671w = f7;
    }

    public void m(View view) {
        l(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        b(view);
    }

    public void n(v.e eVar, androidx.constraintlayout.widget.d dVar, int i4) {
        l(eVar.k0(), eVar.l0(), eVar.j0(), eVar.D());
        c(dVar.h0(i4));
    }
}
