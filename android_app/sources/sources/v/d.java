package v;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import s.i;
import w.o;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f11760j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f11761k = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f11765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f11766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f11767f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s.i f11770i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet<d> f11762a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11768g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11769h = -1;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11771a;

        static {
            int[] iArr = new int[b.values().length];
            f11771a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11771a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11771a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11771a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11771a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11771a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11771a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11771a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11771a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f11765d = eVar;
        this.f11766e = bVar;
    }

    public void A(int i4) {
        this.f11763b = i4;
        this.f11764c = true;
    }

    public void B(int i4) {
        if (p()) {
            this.f11769h = i4;
        }
    }

    public void C(int i4) {
        if (p()) {
            this.f11768g = i4;
        }
    }

    public boolean a(d dVar, int i4) {
        return b(dVar, i4, -1, false);
    }

    public boolean b(d dVar, int i4, int i5, boolean z3) {
        if (dVar == null) {
            x();
            return true;
        }
        if (!z3 && !v(dVar)) {
            return false;
        }
        this.f11767f = dVar;
        if (dVar.f11762a == null) {
            dVar.f11762a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f11767f.f11762a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i4 > 0) {
            this.f11768g = i4;
        } else {
            this.f11768g = 0;
        }
        this.f11769h = i5;
        return true;
    }

    public void c(d dVar, HashMap<e, e> map) {
        HashSet<d> hashSet;
        d dVar2 = this.f11767f;
        if (dVar2 != null && (hashSet = dVar2.f11762a) != null) {
            hashSet.remove(this);
        }
        d dVar3 = dVar.f11767f;
        this.f11767f = dVar3 != null ? map.get(dVar.f11767f.f11765d).r(dVar3.l()) : null;
        d dVar4 = this.f11767f;
        if (dVar4 != null) {
            if (dVar4.f11762a == null) {
                dVar4.f11762a = new HashSet<>();
            }
            this.f11767f.f11762a.add(this);
        }
        this.f11768g = dVar.f11768g;
        this.f11769h = dVar.f11769h;
    }

    public void d(int i4, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f11762a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                w.i.a(it.next().f11765d, i4, arrayList, oVar);
            }
        }
    }

    public HashSet<d> e() {
        return this.f11762a;
    }

    public int f() {
        if (this.f11764c) {
            return this.f11763b;
        }
        return 0;
    }

    public int g() {
        d dVar;
        if (this.f11765d.i0() == 8) {
            return 0;
        }
        return (this.f11769h <= -1 || (dVar = this.f11767f) == null || dVar.f11765d.i0() != 8) ? this.f11768g : this.f11769h;
    }

    public final d h() {
        switch (a.f11771a[this.f11766e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f11765d.L;
            case 3:
                return this.f11765d.J;
            case 4:
                return this.f11765d.M;
            case 5:
                return this.f11765d.K;
            default:
                throw new AssertionError(this.f11766e.name());
        }
    }

    public e i() {
        return this.f11765d;
    }

    public s.i j() {
        return this.f11770i;
    }

    public d k() {
        return this.f11767f;
    }

    public b l() {
        return this.f11766e;
    }

    public boolean m() {
        HashSet<d> hashSet = this.f11762a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().h().p()) {
                return true;
            }
        }
        return false;
    }

    public boolean n() {
        HashSet<d> hashSet = this.f11762a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean o() {
        return this.f11764c;
    }

    public boolean p() {
        return this.f11767f != null;
    }

    public boolean q(e eVar) {
        if (s(eVar, new HashSet<>())) {
            return false;
        }
        e eVarU = i().U();
        return eVarU == eVar || eVar.U() == eVarU;
    }

    public boolean r(e eVar, d dVar) {
        return q(eVar);
    }

    public final boolean s(e eVar, HashSet<e> hashSet) {
        if (hashSet.contains(eVar)) {
            return false;
        }
        hashSet.add(eVar);
        if (eVar == i()) {
            return true;
        }
        ArrayList<d> arrayListS = eVar.s();
        int size = arrayListS.size();
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = arrayListS.get(i4);
            if (dVar.u(this) && dVar.p() && s(dVar.k().i(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public boolean t() {
        switch (a.f11771a[this.f11766e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.f11766e.name());
        }
    }

    public String toString() {
        return this.f11765d.y() + ":" + this.f11766e.toString();
    }

    public boolean u(d dVar) {
        b bVarL = dVar.l();
        b bVar = this.f11766e;
        if (bVarL == bVar) {
            return true;
        }
        switch (a.f11771a[bVar.ordinal()]) {
            case 1:
                return bVarL != b.BASELINE;
            case 2:
            case 3:
            case 7:
                return bVarL == b.LEFT || bVarL == b.RIGHT || bVarL == b.CENTER_X;
            case 4:
            case 5:
            case 6:
            case 8:
                return bVarL == b.TOP || bVarL == b.BOTTOM || bVarL == b.CENTER_Y || bVarL == b.BASELINE;
            case 9:
                return false;
            default:
                throw new AssertionError(this.f11766e.name());
        }
    }

    public boolean v(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarL = dVar.l();
        b bVar = this.f11766e;
        if (bVarL == bVar) {
            return bVar != b.BASELINE || (dVar.i().m0() && i().m0());
        }
        switch (a.f11771a[bVar.ordinal()]) {
            case 1:
                return (bVarL == b.BASELINE || bVarL == b.CENTER_X || bVarL == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z3 = bVarL == b.LEFT || bVarL == b.RIGHT;
                if (dVar.i() instanceof h) {
                    return z3 || bVarL == b.CENTER_X;
                }
                return z3;
            case 4:
            case 5:
                boolean z4 = bVarL == b.TOP || bVarL == b.BOTTOM;
                if (dVar.i() instanceof h) {
                    return z4 || bVarL == b.CENTER_Y;
                }
                return z4;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f11766e.name());
        }
    }

    public boolean w() {
        switch (a.f11771a[this.f11766e.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.f11766e.name());
        }
    }

    public void x() {
        HashSet<d> hashSet;
        d dVar = this.f11767f;
        if (dVar != null && (hashSet = dVar.f11762a) != null) {
            hashSet.remove(this);
            if (this.f11767f.f11762a.size() == 0) {
                this.f11767f.f11762a = null;
            }
        }
        this.f11762a = null;
        this.f11767f = null;
        this.f11768g = 0;
        this.f11769h = -1;
        this.f11764c = false;
        this.f11763b = 0;
    }

    public void y() {
        this.f11764c = false;
        this.f11763b = 0;
    }

    public void z(s.c cVar) {
        s.i iVar = this.f11770i;
        if (iVar == null) {
            this.f11770i = new s.i(i.b.UNRESTRICTED, (String) null);
        } else {
            iVar.g();
        }
    }
}
