package m2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f8872f = 307200;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static s f8873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ boolean f8874h = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8875a = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f8878d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f8879e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, b> f8876b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f8877c = null;

    public static synchronized s c() {
        if (f8873g == null) {
            f8873g = new s();
        }
        return f8873g;
    }

    public q a(l lVar) {
        byte[] bArrC;
        byte[] bArrA;
        byte[] bArrB;
        if (lVar instanceof i) {
            i iVar = (i) lVar;
            bArrC = this.f8877c.c(iVar.f8822a, iVar.f8823b, iVar.f8824c);
        } else {
            bArrC = null;
        }
        if (lVar instanceof f) {
            f fVar = (f) lVar;
            bArrA = this.f8877c.a(fVar.f8807d, fVar.f8808e, fVar.f8809f, fVar.f8810g, fVar.f8811h, fVar.f8812i);
            bArrB = null;
        } else if (lVar instanceof g) {
            g gVar = (g) lVar;
            bArrB = this.f8877c.b(gVar.f8813d, gVar.f8814e, gVar.f8815f, gVar.f8816g, gVar.f8817h, gVar.f8818i);
            bArrA = null;
        } else {
            bArrA = null;
            bArrB = null;
        }
        e eVar = (e) this.f8877c;
        q qVar = this.f8878d;
        if (qVar == null) {
            this.f8878d = new r("NONE_DSC", bArrC, bArrA, bArrB, eVar.f8795b, eVar.f8796c, eVar.f8800g, eVar.f8801h, eVar.f8798e, eVar.f8799f, eVar.f8802i, eVar.f8804k);
        } else {
            qVar.C("NONE_DSC", bArrC, bArrA, bArrB, eVar.f8795b, eVar.f8796c, eVar.f8800g, eVar.f8801h, eVar.f8798e, eVar.f8799f, eVar.f8802i, eVar.f8804k);
        }
        return this.f8878d;
    }

    public b b(n nVar, h hVar) {
        b bVarA;
        synchronized (this.f8879e) {
            String strA = nVar.a();
            bVarA = this.f8876b.get(strA);
            if (bVarA == null) {
                if (hVar == null) {
                    hVar = new h(0);
                }
                bVarA = c.a(nVar, hVar);
                this.f8876b.put(strA, bVarA);
                if (this.f8876b.size() > 4) {
                    Iterator<String> it = this.f8876b.keySet().iterator();
                    it.next();
                    it.remove();
                }
            } else {
                if (this.f8877c != bVarA && (nVar instanceof p)) {
                    p pVar = (p) nVar;
                    bVarA.d(pVar.f8839a, pVar.f8840b, pVar.f8841c, pVar.f8842d, pVar.f8843e, pVar.f8844f, hVar);
                }
                if (hVar != null) {
                    bVarA.e(hVar);
                }
            }
        }
        return bVarA;
    }

    public void d() {
        synchronized (this.f8879e) {
            f8873g = null;
            this.f8876b.clear();
            this.f8876b = null;
        }
    }

    public void e(int i4) {
        f8872f = i4 == 1 ? 388800 : i4 == 2 ? 480000 : i4 == 3 ? 982800 : 307200;
        d();
    }

    public q f(n nVar, h hVar) {
        b bVarB = b(nVar, hVar);
        if (bVarB != this.f8877c) {
            this.f8877c = bVarB;
        }
        b bVar = this.f8877c;
        if (bVar instanceof e) {
            e eVar = (e) bVar;
            if (this.f8878d == null) {
                this.f8878d = new r("NONE_DSC", null, null, null, eVar.f8795b, eVar.f8796c, eVar.f8800g, eVar.f8801h, eVar.f8798e, eVar.f8799f, eVar.f8802i, eVar.f8804k);
            }
        }
        q qVar = this.f8878d;
        if (qVar != null) {
            qVar.H(hVar);
        }
        return this.f8878d;
    }
}
