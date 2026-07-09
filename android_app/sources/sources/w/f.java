package w;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f12323d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12326g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f12320a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12321b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12322c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f12324e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12327h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f12328i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12329j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<d> f12330k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<f> f12331l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f12323d = pVar;
    }

    @Override // w.d
    public void a(d dVar) {
        Iterator<f> it = this.f12331l.iterator();
        while (it.hasNext()) {
            if (!it.next().f12329j) {
                return;
            }
        }
        this.f12322c = true;
        d dVar2 = this.f12320a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f12321b) {
            this.f12323d.a(this);
            return;
        }
        f fVar = null;
        int i4 = 0;
        for (f fVar2 : this.f12331l) {
            if (!(fVar2 instanceof g)) {
                i4++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i4 == 1 && fVar.f12329j) {
            g gVar = this.f12328i;
            if (gVar != null) {
                if (!gVar.f12329j) {
                    return;
                } else {
                    this.f12325f = this.f12327h * gVar.f12326g;
                }
            }
            e(fVar.f12326g + this.f12325f);
        }
        d dVar3 = this.f12320a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f12330k.add(dVar);
        if (this.f12329j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f12331l.clear();
        this.f12330k.clear();
        this.f12329j = false;
        this.f12326g = 0;
        this.f12322c = false;
        this.f12321b = false;
    }

    public String d() {
        StringBuilder sb;
        String str;
        String strY = this.f12323d.f12380b.y();
        a aVar = this.f12324e;
        if (aVar == a.LEFT || aVar == a.RIGHT) {
            sb = new StringBuilder();
            sb.append(strY);
            str = "_HORIZONTAL";
        } else {
            sb = new StringBuilder();
            sb.append(strY);
            str = "_VERTICAL";
        }
        sb.append(str);
        return sb.toString() + ":" + this.f12324e.name();
    }

    public void e(int i4) {
        if (this.f12329j) {
            return;
        }
        this.f12329j = true;
        this.f12326g = i4;
        for (d dVar : this.f12330k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12323d.f12380b.y());
        sb.append(":");
        sb.append(this.f12324e);
        sb.append("(");
        sb.append(this.f12329j ? Integer.valueOf(this.f12326g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f12331l.size());
        sb.append(":d=");
        sb.append(this.f12330k.size());
        sb.append(">");
        return sb.toString();
    }
}
