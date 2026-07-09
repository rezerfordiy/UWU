package r;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h extends e {
    public static final String Q = "KeyCycle";
    public static final String R = "KeyCycle";
    public static final int S = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f10543y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10544z = 0;
    public int A = -1;
    public float B = Float.NaN;
    public float C = 0.0f;
    public float D = Float.NaN;
    public int E = -1;
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
    public float P = Float.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f10545a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f10546b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f10547c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f10548d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f10549e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f10550f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f10551g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f10552h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f10553i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f10554j = 10;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f10555k = 11;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f10556l = 12;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f10557m = 13;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f10558n = 14;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f10559o = 15;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f10560p = 16;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f10561q = 17;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f10562r = 18;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f10563s = 19;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f10564t = 20;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static SparseIntArray f10565u;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f10565u = sparseIntArray;
            sparseIntArray.append(e.m.Nb, 1);
            f10565u.append(e.m.Lb, 2);
            f10565u.append(e.m.Ob, 3);
            f10565u.append(e.m.Kb, 4);
            f10565u.append(e.m.Sb, 5);
            f10565u.append(e.m.Rb, 6);
            f10565u.append(e.m.Qb, 7);
            f10565u.append(e.m.Tb, 8);
            f10565u.append(e.m.Ab, 9);
            f10565u.append(e.m.Jb, 10);
            f10565u.append(e.m.Fb, 11);
            f10565u.append(e.m.Gb, 12);
            f10565u.append(e.m.Hb, 13);
            f10565u.append(e.m.Pb, 14);
            f10565u.append(e.m.Db, 15);
            f10565u.append(e.m.Eb, 16);
            f10565u.append(e.m.Bb, 17);
            f10565u.append(e.m.Cb, 18);
            f10565u.append(e.m.Ib, 19);
            f10565u.append(e.m.Mb, 20);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0153  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void b(r.h r5, android.content.res.TypedArray r6) {
            /*
                Method dump skipped, instruction units count: 404
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r.h.a.b(r.h, android.content.res.TypedArray):void");
        }
    }

    public h() {
        this.f10519d = 4;
        this.f10520e = new HashMap<>();
    }

    public void S(HashMap<String, i> map) {
        for (String str : map.keySet()) {
            if (str.startsWith(e.f10515x)) {
                androidx.constraintlayout.widget.a aVar = this.f10520e.get(str.substring(7));
                if (aVar != null && aVar.d() == a.b.FLOAT_TYPE) {
                    map.get(str).f(this.f10516a, this.A, this.E, this.B, this.C, aVar.e(), aVar);
                }
            } else {
                float fT = T(str);
                if (!Float.isNaN(fT)) {
                    map.get(str).e(this.f10516a, this.A, this.E, this.B, this.C, fT);
                }
            }
        }
    }

    public float T(String str) {
        str.hashCode();
        switch (str) {
            case "rotationX":
                return this.J;
            case "rotationY":
                return this.K;
            case "translationX":
                return this.N;
            case "translationY":
                return this.O;
            case "translationZ":
                return this.P;
            case "progress":
                return this.D;
            case "scaleX":
                return this.L;
            case "scaleY":
                return this.M;
            case "rotation":
                return this.H;
            case "elevation":
                return this.G;
            case "transitionPathRotate":
                return this.I;
            case "alpha":
                return this.F;
            case "waveOffset":
                return this.C;
            default:
                Log.v("KeyCycle", "WARNING! KeyCycle UNKNOWN  " + str);
                return Float.NaN;
        }
    }

    @Override // r.e
    public void a(HashMap<String, t> map) {
        int i4;
        float f4;
        c.m("KeyCycle", "add " + map.size() + " values", 2);
        for (String str : map.keySet()) {
            t tVar = map.get(str);
            str.hashCode();
            switch (str) {
                case "rotationX":
                    i4 = this.f10516a;
                    f4 = this.J;
                    break;
                case "rotationY":
                    i4 = this.f10516a;
                    f4 = this.K;
                    break;
                case "translationX":
                    i4 = this.f10516a;
                    f4 = this.N;
                    break;
                case "translationY":
                    i4 = this.f10516a;
                    f4 = this.O;
                    break;
                case "translationZ":
                    i4 = this.f10516a;
                    f4 = this.P;
                    break;
                case "progress":
                    i4 = this.f10516a;
                    f4 = this.D;
                    break;
                case "scaleX":
                    i4 = this.f10516a;
                    f4 = this.L;
                    break;
                case "scaleY":
                    i4 = this.f10516a;
                    f4 = this.M;
                    break;
                case "rotation":
                    i4 = this.f10516a;
                    f4 = this.H;
                    break;
                case "elevation":
                    i4 = this.f10516a;
                    f4 = this.G;
                    break;
                case "transitionPathRotate":
                    i4 = this.f10516a;
                    f4 = this.I;
                    break;
                case "alpha":
                    i4 = this.f10516a;
                    f4 = this.F;
                    break;
                case "waveOffset":
                    i4 = this.f10516a;
                    f4 = this.C;
                    break;
                default:
                    Log.v("KeyCycle", "WARNING KeyCycle UNKNOWN  " + str);
                    continue;
                    break;
            }
            tVar.f(i4, f4);
        }
    }

    @Override // r.e
    public void b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.F)) {
            hashSet.add(e.f10498g);
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add(e.f10499h);
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add(e.f10500i);
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add(e.f10501j);
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add(e.f10502k);
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add(e.f10506o);
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add(e.f10507p);
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add(e.f10505n);
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add(e.f10511t);
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add(e.f10512u);
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add(e.f10513v);
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
        a.b(this, context.obtainStyledAttributes(attributeSet, e.m.zb));
    }

    @Override // r.e
    public void f(String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "transitionEasing":
                this.f10543y = obj.toString();
                break;
            case "rotationX":
                this.J = h(obj);
                break;
            case "rotationY":
                this.K = h(obj);
                break;
            case "translationX":
                this.N = h(obj);
                break;
            case "translationY":
                this.O = h(obj);
                break;
            case "progress":
                this.D = h(obj);
                break;
            case "scaleX":
                this.L = h(obj);
                break;
            case "scaleY":
                this.M = h(obj);
                break;
            case "rotation":
                this.H = h(obj);
                break;
            case "elevation":
                this.G = h(obj);
                break;
            case "transitionPathRotate":
                this.I = h(obj);
                break;
            case "alpha":
                this.F = h(obj);
                break;
            case "waveOffset":
                this.C = h(obj);
                break;
            case "wavePeriod":
                this.B = h(obj);
                break;
            case "curveFit":
                this.f10544z = i(obj);
                break;
            case "mTranslationZ":
                this.P = h(obj);
                break;
        }
    }
}
