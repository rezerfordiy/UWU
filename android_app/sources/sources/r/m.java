package r;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import r.u;

/* JADX INFO: loaded from: classes.dex */
public class m extends e {
    public static final String P = "KeyTimeCycle";
    public static final String Q = "KeyTimeCycle";
    public static final int R = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f10615y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10616z = -1;
    public float A = Float.NaN;
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
    public int M = 0;
    public float N = Float.NaN;
    public float O = 0.0f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f10617a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f10618b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f10619c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f10620d = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f10621e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f10622f = 8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f10623g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f10624h = 9;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f10625i = 10;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f10626j = 12;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f10627k = 13;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f10628l = 14;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f10629m = 15;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f10630n = 16;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f10631o = 17;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f10632p = 18;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f10633q = 19;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f10634r = 20;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f10635s = 21;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static SparseIntArray f10636t;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f10636t = sparseIntArray;
            sparseIntArray.append(e.m.ic, 1);
            f10636t.append(e.m.rc, 2);
            f10636t.append(e.m.nc, 4);
            f10636t.append(e.m.oc, 5);
            f10636t.append(e.m.pc, 6);
            f10636t.append(e.m.lc, 7);
            f10636t.append(e.m.xc, 8);
            f10636t.append(e.m.wc, 9);
            f10636t.append(e.m.vc, 10);
            f10636t.append(e.m.tc, 12);
            f10636t.append(e.m.sc, 13);
            f10636t.append(e.m.mc, 14);
            f10636t.append(e.m.jc, 15);
            f10636t.append(e.m.kc, 16);
            f10636t.append(e.m.qc, 17);
            f10636t.append(e.m.uc, 18);
            f10636t.append(e.m.Ac, 20);
            f10636t.append(e.m.zc, 21);
            f10636t.append(e.m.Bc, 19);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(r.m r5, android.content.res.TypedArray r6) {
            /*
                Method dump skipped, instruction units count: 390
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r.m.a.a(r.m, android.content.res.TypedArray):void");
        }
    }

    public m() {
        this.f10519d = 3;
        this.f10520e = new HashMap<>();
    }

    public void Q(HashMap<String, u> map) {
        int i4;
        float f4;
        for (String str : map.keySet()) {
            u uVar = map.get(str);
            if (str.startsWith(e.f10515x)) {
                androidx.constraintlayout.widget.a aVar = this.f10520e.get(str.substring(7));
                if (aVar != null) {
                    ((u.b) uVar).k(this.f10516a, aVar, this.N, this.M, this.O);
                }
            } else {
                switch (str) {
                    case "rotationX":
                        if (Float.isNaN(this.D)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.D;
                            break;
                        }
                        break;
                    case "rotationY":
                        if (Float.isNaN(this.E)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.E;
                            break;
                        }
                        break;
                    case "translationX":
                        if (Float.isNaN(this.I)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.I;
                            break;
                        }
                        break;
                    case "translationY":
                        if (Float.isNaN(this.J)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.J;
                            break;
                        }
                        break;
                    case "translationZ":
                        if (Float.isNaN(this.K)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.K;
                            break;
                        }
                        break;
                    case "progress":
                        if (Float.isNaN(this.L)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.L;
                            break;
                        }
                        break;
                    case "scaleX":
                        if (Float.isNaN(this.G)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.G;
                            break;
                        }
                        break;
                    case "scaleY":
                        if (Float.isNaN(this.H)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.H;
                            break;
                        }
                        break;
                    case "rotation":
                        if (Float.isNaN(this.C)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.C;
                            break;
                        }
                        break;
                    case "elevation":
                        if (Float.isNaN(this.B)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.B;
                            break;
                        }
                        break;
                    case "transitionPathRotate":
                        if (Float.isNaN(this.F)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.F;
                            break;
                        }
                        break;
                    case "alpha":
                        if (Float.isNaN(this.A)) {
                            break;
                        } else {
                            i4 = this.f10516a;
                            f4 = this.A;
                            break;
                        }
                        break;
                    default:
                        Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                        continue;
                        break;
                }
                uVar.f(i4, f4, this.N, this.M, this.O);
            }
        }
    }

    @Override // r.e
    public void a(HashMap<String, t> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // r.e
    public void b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.A)) {
            hashSet.add(e.f10498g);
        }
        if (!Float.isNaN(this.B)) {
            hashSet.add(e.f10499h);
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add(e.f10500i);
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add(e.f10501j);
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add(e.f10502k);
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add(e.f10511t);
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add(e.f10512u);
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add(e.f10513v);
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add(e.f10505n);
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add(e.f10506o);
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add(e.f10507p);
        }
        if (!Float.isNaN(this.L)) {
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
        a.a(this, context.obtainStyledAttributes(attributeSet, e.m.hc));
    }

    @Override // r.e
    public void e(HashMap<String, Integer> map) {
        if (this.f10616z == -1) {
            return;
        }
        if (!Float.isNaN(this.A)) {
            map.put(e.f10498g, Integer.valueOf(this.f10616z));
        }
        if (!Float.isNaN(this.B)) {
            map.put(e.f10499h, Integer.valueOf(this.f10616z));
        }
        if (!Float.isNaN(this.C)) {
            map.put(e.f10500i, Integer.valueOf(this.f10616z));
        }
        if (!Float.isNaN(this.D)) {
            map.put(e.f10501j, Integer.valueOf(this.f10616z));
        }
        if (!Float.isNaN(this.E)) {
            map.put(e.f10502k, Integer.valueOf(this.f10616z));
        }
        if (!Float.isNaN(this.I)) {
            map.put(e.f10511t, Integer.valueOf(this.f10616z));
        }
        if (!Float.isNaN(this.J)) {
            map.put(e.f10512u, Integer.valueOf(this.f10616z));
        }
        if (!Float.isNaN(this.K)) {
            map.put(e.f10513v, Integer.valueOf(this.f10616z));
        }
        if (!Float.isNaN(this.F)) {
            map.put(e.f10505n, Integer.valueOf(this.f10616z));
        }
        if (!Float.isNaN(this.G)) {
            map.put(e.f10506o, Integer.valueOf(this.f10616z));
        }
        if (!Float.isNaN(this.G)) {
            map.put(e.f10507p, Integer.valueOf(this.f10616z));
        }
        if (!Float.isNaN(this.L)) {
            map.put("progress", Integer.valueOf(this.f10616z));
        }
        if (this.f10520e.size() > 0) {
            Iterator<String> it = this.f10520e.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.f10616z));
            }
        }
    }

    @Override // r.e
    public void f(String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "transitionEasing":
                this.f10615y = obj.toString();
                break;
            case "rotationX":
                this.D = h(obj);
                break;
            case "rotationY":
                this.E = h(obj);
                break;
            case "translationX":
                this.I = h(obj);
                break;
            case "translationY":
                this.J = h(obj);
                break;
            case "progress":
                this.L = h(obj);
                break;
            case "scaleX":
                this.G = h(obj);
                break;
            case "scaleY":
                this.H = h(obj);
                break;
            case "rotation":
                this.C = h(obj);
                break;
            case "elevation":
                this.B = h(obj);
                break;
            case "transitionPathRotate":
                this.F = h(obj);
                break;
            case "alpha":
                this.A = h(obj);
                break;
            case "curveFit":
                this.f10616z = i(obj);
                break;
            case "mTranslationZ":
                this.K = h(obj);
                break;
        }
    }
}
