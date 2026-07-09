package r;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import r.t;
import z1.l1;

/* JADX INFO: loaded from: classes.dex */
public class f extends e {
    public static final String P = "KeyAttribute";
    public static final String Q = "KeyAttribute";
    public static final int R = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f10521y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10522z = -1;
    public boolean A = false;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public float I = Float.NaN;
    public float J = Float.NaN;
    public float K = Float.NaN;
    public float L = Float.NaN;
    public float M = Float.NaN;
    public float N = Float.NaN;
    public float O = Float.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f10523a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f10524b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f10525c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f10526d = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f10527e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f10528f = 8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f10529g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f10530h = 9;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f10531i = 10;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f10532j = 12;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f10533k = 13;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f10534l = 14;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f10535m = 15;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f10536n = 16;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f10537o = 17;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f10538p = 18;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f10539q = 19;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f10540r = 20;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static SparseIntArray f10541s;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f10541s = sparseIntArray;
            sparseIntArray.append(e.m.hb, 1);
            f10541s.append(e.m.sb, 2);
            f10541s.append(e.m.ob, 4);
            f10541s.append(e.m.pb, 5);
            f10541s.append(e.m.qb, 6);
            f10541s.append(e.m.ib, 19);
            f10541s.append(e.m.jb, 20);
            f10541s.append(e.m.mb, 7);
            f10541s.append(e.m.yb, 8);
            f10541s.append(e.m.xb, 9);
            f10541s.append(e.m.wb, 10);
            f10541s.append(e.m.ub, 12);
            f10541s.append(e.m.tb, 13);
            f10541s.append(e.m.nb, 14);
            f10541s.append(e.m.kb, 15);
            f10541s.append(e.m.lb, 16);
            f10541s.append(e.m.rb, 17);
            f10541s.append(e.m.vb, 18);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(r.f r5, android.content.res.TypedArray r6) {
            /*
                Method dump skipped, instruction units count: 358
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r.f.a.a(r.f, android.content.res.TypedArray):void");
        }
    }

    public f() {
        this.f10519d = 1;
        this.f10520e = new HashMap<>();
    }

    public int O() {
        return this.f10522z;
    }

    @Override // r.e
    public void a(HashMap<String, t> map) {
        int i4;
        float f4;
        for (String str : map.keySet()) {
            t tVar = map.get(str);
            if (str.startsWith(e.f10515x)) {
                androidx.constraintlayout.widget.a aVar = this.f10520e.get(str.substring(7));
                if (aVar != null) {
                    ((t.b) tVar).j(this.f10516a, aVar);
                }
            } else {
                switch (str) {
                    case "rotationX":
                        if (Float.isNaN(this.E)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.E;
                            break;
                        }
                        break;
                    case "rotationY":
                        if (Float.isNaN(this.F)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.F;
                            break;
                        }
                        break;
                    case "translationX":
                        if (Float.isNaN(this.L)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.L;
                            break;
                        }
                        break;
                    case "translationY":
                        if (Float.isNaN(this.M)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.M;
                            break;
                        }
                        break;
                    case "translationZ":
                        if (Float.isNaN(this.N)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.N;
                            break;
                        }
                        break;
                    case "progress":
                        if (Float.isNaN(this.O)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.O;
                            break;
                        }
                        break;
                    case "scaleX":
                        if (Float.isNaN(this.J)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.J;
                            break;
                        }
                        break;
                    case "scaleY":
                        if (Float.isNaN(this.K)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.K;
                            break;
                        }
                        break;
                    case "transformPivotX":
                        if (Float.isNaN(this.E)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.G;
                            break;
                        }
                        break;
                    case "transformPivotY":
                        if (Float.isNaN(this.F)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.H;
                            break;
                        }
                        break;
                    case "rotation":
                        if (Float.isNaN(this.D)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.D;
                            break;
                        }
                        break;
                    case "elevation":
                        if (Float.isNaN(this.C)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.C;
                            break;
                        }
                        break;
                    case "transitionPathRotate":
                        if (Float.isNaN(this.I)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.I;
                            break;
                        }
                        break;
                    case "alpha":
                        if (Float.isNaN(this.B)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.B;
                            break;
                        }
                        break;
                    default:
                        Log.v("KeyAttributes", "UNKNOWN addValues \"" + str + "\"");
                        continue;
                        break;
                }
                tVar.f(i4, f4);
            }
        }
    }

    @Override // r.e
    public void b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.B)) {
            hashSet.add(e.f10498g);
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add(e.f10499h);
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add(e.f10500i);
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add(e.f10501j);
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add(e.f10502k);
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add(e.f10503l);
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add(e.f10504m);
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add(e.f10511t);
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add(e.f10512u);
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add(e.f10513v);
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add(e.f10505n);
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add(e.f10506o);
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add(e.f10507p);
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("progress");
        }
        if (this.f10520e.size() > 0) {
            Iterator<String> it = this.f10520e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // r.e
    public void c(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, e.m.gb));
    }

    @Override // r.e
    public void e(HashMap<String, Integer> map) {
        if (this.f10522z == -1) {
            return;
        }
        if (!Float.isNaN(this.B)) {
            map.put(e.f10498g, Integer.valueOf(this.f10522z));
        }
        if (!Float.isNaN(this.C)) {
            map.put(e.f10499h, Integer.valueOf(this.f10522z));
        }
        if (!Float.isNaN(this.D)) {
            map.put(e.f10500i, Integer.valueOf(this.f10522z));
        }
        if (!Float.isNaN(this.E)) {
            map.put(e.f10501j, Integer.valueOf(this.f10522z));
        }
        if (!Float.isNaN(this.F)) {
            map.put(e.f10502k, Integer.valueOf(this.f10522z));
        }
        if (!Float.isNaN(this.G)) {
            map.put(e.f10503l, Integer.valueOf(this.f10522z));
        }
        if (!Float.isNaN(this.H)) {
            map.put(e.f10504m, Integer.valueOf(this.f10522z));
        }
        if (!Float.isNaN(this.L)) {
            map.put(e.f10511t, Integer.valueOf(this.f10522z));
        }
        if (!Float.isNaN(this.M)) {
            map.put(e.f10512u, Integer.valueOf(this.f10522z));
        }
        if (!Float.isNaN(this.N)) {
            map.put(e.f10513v, Integer.valueOf(this.f10522z));
        }
        if (!Float.isNaN(this.I)) {
            map.put(e.f10505n, Integer.valueOf(this.f10522z));
        }
        if (!Float.isNaN(this.J)) {
            map.put(e.f10506o, Integer.valueOf(this.f10522z));
        }
        if (!Float.isNaN(this.K)) {
            map.put(e.f10507p, Integer.valueOf(this.f10522z));
        }
        if (!Float.isNaN(this.O)) {
            map.put("progress", Integer.valueOf(this.f10522z));
        }
        if (this.f10520e.size() > 0) {
            Iterator<String> it = this.f10520e.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.f10522z));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // r.e
    public void f(String str, Object obj) {
        str.hashCode();
        byte b4 = -1;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    b4 = 0;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    b4 = 1;
                }
                break;
            case -1249320806:
                if (str.equals(e.f10501j)) {
                    b4 = 2;
                }
                break;
            case -1249320805:
                if (str.equals(e.f10502k)) {
                    b4 = 3;
                }
                break;
            case -1225497657:
                if (str.equals(e.f10511t)) {
                    b4 = 4;
                }
                break;
            case -1225497656:
                if (str.equals(e.f10512u)) {
                    b4 = 5;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    b4 = 6;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    b4 = 7;
                }
                break;
            case -908189618:
                if (str.equals(e.f10506o)) {
                    b4 = 8;
                }
                break;
            case -908189617:
                if (str.equals(e.f10507p)) {
                    b4 = 9;
                }
                break;
            case -40300674:
                if (str.equals(e.f10500i)) {
                    b4 = 10;
                }
                break;
            case -4379043:
                if (str.equals(e.f10499h)) {
                    b4 = 11;
                }
                break;
            case 37232917:
                if (str.equals(e.f10505n)) {
                    b4 = 12;
                }
                break;
            case 92909918:
                if (str.equals(e.f10498g)) {
                    b4 = 13;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    b4 = 14;
                }
                break;
            case 1317633238:
                if (str.equals("mTranslationZ")) {
                    b4 = 15;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b4 = l1.f13562p;
                }
                break;
        }
        switch (b4) {
            case 0:
                this.O = h(obj);
                break;
            case 1:
                this.f10521y = obj.toString();
                break;
            case 2:
                this.E = h(obj);
                break;
            case 3:
                this.F = h(obj);
                break;
            case 4:
                this.L = h(obj);
                break;
            case 5:
                this.M = h(obj);
                break;
            case 6:
                this.G = h(obj);
                break;
            case 7:
                this.H = h(obj);
                break;
            case 8:
                this.J = h(obj);
                break;
            case 9:
                this.K = h(obj);
                break;
            case 10:
                this.D = h(obj);
                break;
            case 11:
                this.C = h(obj);
                break;
            case 12:
                this.I = h(obj);
                break;
            case 13:
                this.B = h(obj);
                break;
            case 14:
                this.f10522z = i(obj);
                break;
            case 15:
                this.N = h(obj);
                break;
            case 16:
                this.A = g(obj);
                break;
        }
    }
}
