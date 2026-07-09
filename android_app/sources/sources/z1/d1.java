package z1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import z1.b0;
import z1.c0;
import z1.c1;
import z1.n0;
import z1.v0;

/* JADX INFO: loaded from: classes.dex */
public class d1 extends c1 implements q, v0.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i1 f12981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v0 f12982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f3 f12983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z1 f12984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u5 f12986j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q0 f12987k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d1 f12989m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f12990n = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Map<String, n0> f12988l = new HashMap();

    public d1(u5 u5Var) {
        this.f12986j = u5Var;
        u5Var.n(this);
        u5Var.l();
    }

    @Override // z1.c1, z1.u5.c
    public void a(Map<String, Object> map) {
        for (String str : map.keySet()) {
            byte[] bArr = (byte[]) map.get(str);
            v0 v0Var = this.f12982f;
            if (v0Var != null && bArr != null) {
                v0Var.b(bArr, str);
            }
        }
    }

    @Override // z1.c1, z1.u5.c
    public byte[] b(String str) {
        w wVar;
        z1 z1VarP = p();
        if (z1VarP == null || (wVar = z1VarP.f14216c) == null) {
            return null;
        }
        return ((x) wVar).f14132j.b(this, str);
    }

    @Override // z1.v0.b
    public void c(Map<String, Object> map) {
        Map<String, Object> map2 = (Map) map.get("state");
        v(map2);
        if (map.containsKey("raw")) {
            u((byte[]) map.get("raw"), map2);
        }
    }

    @Override // z1.q
    public void d(p0 p0Var) {
        if (p0Var.R2().equals(n0.a.LIVE.toString())) {
            boolean zH2 = ((b0.k) p0Var).H2();
            c1.b bVar = this.f12951a;
            if (bVar != null) {
                bVar.b(zH2);
            }
        }
        String strR2 = p0Var.R2();
        if (this.f12951a != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(strR2);
            this.f12951a.c(arrayList);
        }
    }

    @Override // z1.c1
    public n0 e(String str) {
        if (this.f12987k == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f12990n > 5) {
            this.f12990n = jCurrentTimeMillis;
            this.f12987k.h();
        }
        return this.f12987k.a(str);
    }

    @Override // z1.c1
    public n0 f(String str, int i4) {
        return this.f12987k.b(str, i4);
    }

    @Override // z1.c1
    public boolean i() {
        c0.h hVar = (c0.h) e(n0.a.LIVE.toString());
        if (hVar != null) {
            return hVar.H2();
        }
        return false;
    }

    @Override // z1.c1
    public String m() {
        return p().a();
    }

    public Map<String, n0> n(int i4) {
        return this.f12987k.d(o(), i4);
    }

    public String[] o() {
        String string = n0.a.BUILD_IN_PA.toString();
        n0.a aVar = n0.a.MODE;
        return new String[]{string, aVar.toString(), n0.a.LIVE.toString(), n0.a.ZOOM.toString(), n0.a.GAIN.toString(), n0.d.WIFI_CHANNEL.toString(), n0.a.TRANSDUCER.toString(), n0.c.DYNAMIC_RANGE.toString(), n0.c.HARMONIC.toString(), n0.c.FOCUS.toString(), n0.c.COMPOUND.toString(), n0.c.VGAIN.toString(), aVar.toString(), n0.b.COLOR_POWER_GAIN.toString(), n0.b.COLOR_POWER_FOCUS.toString(), n0.b.COLOR_POWER_PRF.toString(), n0.b.COLOR_POWER_WF.toString(), n0.b.COLOR_POWER_QUADRANGLE.toString(), n0.f.PW_VOLUME.toString(), n0.f.PW_STEER.toString(), n0.f.PW_GAIN.toString(), n0.f.PW_PRF.toString(), n0.f.PW_DYNAMIC_RANGE.toString(), n0.f.PW_FOCUS.toString()};
    }

    public synchronized z1 p() {
        b0.h hVar;
        HashSet hashSet = new HashSet();
        g7 g7VarS = s();
        if (g7VarS != null) {
            hashSet.addAll(g7VarS.a());
        }
        if (hashSet.size() > 1 && (hVar = (b0.h) e(n0.a.BUILD_IN_PA.toString())) != null && hVar.S1()) {
            return (z1) g7VarS.b();
        }
        if (g7VarS != null) {
            return (z1) g7VarS.c();
        }
        return null;
    }

    public String q() {
        b0.n nVar = (b0.n) e(n0.a.MODE.toString());
        return nVar != null ? nVar.j2() : n0.e.MODE_B.toString();
    }

    public f3 r() {
        return (f3) this.f12952b;
    }

    public g7 s() {
        b0.o oVar;
        if (r() != null) {
            return r().q((r().p() <= 1 || (oVar = (b0.o) e(n0.a.TRANSDUCER.toString())) == null) ? 0 : oVar.o1());
        }
        return null;
    }

    public z1 t(int i4) {
        b0.h hVar;
        if (i4 >= r().p()) {
            return p();
        }
        g7 g7VarQ = r().q(i4);
        return (z1) ((g7VarQ.a().size() <= 1 || (hVar = (b0.h) f(n0.a.BUILD_IN_PA.toString(), i4)) == null || !hVar.S1()) ? g7VarQ.c() : g7VarQ.b());
    }

    public void u(byte[] bArr, Map<String, Object> map) {
        z1 z1VarP = p();
        if (z1VarP == null) {
            return;
        }
        z1VarP.f14216c.a(bArr, map, this);
    }

    public void v(Map<String, Object> map) {
        b0.b bVarD3;
        b0.r rVarD3;
        b0.q qVarD3;
        b0.c cVarD3;
        if (map == null) {
            return;
        }
        if (map.containsKey("live")) {
            boolean zBooleanValue = ((Boolean) map.get("live")).booleanValue();
            b0.k kVar = (b0.k) this.f12987k.a(n0.a.LIVE.toString());
            if (kVar != null && (cVarD3 = kVar.d3()) != null) {
                cVarD3.L2(zBooleanValue);
            }
        }
        if (map.containsKey("trans")) {
            int iIntValue = ((Integer) map.get("trans")).intValue();
            b0.o oVar = (b0.o) this.f12987k.a(n0.a.TRANSDUCER.toString());
            if (oVar != null && (qVarD3 = oVar.d3()) != null) {
                qVarD3.s1(iIntValue);
            }
        }
        if (map.containsKey("zoom")) {
            int iIntValue2 = ((Integer) map.get("zoom")).intValue();
            b0.p pVar = (b0.p) this.f12987k.a(n0.a.ZOOM.toString());
            if (pVar != null && (rVarD3 = pVar.d3()) != null) {
                rVarD3.C1(iIntValue2);
            }
        }
        if (map.containsKey("gain")) {
            int iIntValue3 = ((Integer) map.get("gain")).intValue();
            b0.i iVar = (b0.i) this.f12987k.a(n0.a.GAIN.toString());
            if (iVar != null && (bVarD3 = iVar.d3()) != null) {
                bVarD3.c(iIntValue3);
            }
        }
        byte[] bArr = (byte[]) map.get("calibrationData");
        if (bArr != null) {
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map3.put(n0.a.MAGNETIC_CALIBRATION.toString(), bArr);
            map2.put("notice", map3);
            c1.b bVar = this.f12951a;
            if (bVar != null) {
                bVar.e(map2);
            }
        }
    }

    public void w(q0 q0Var) {
        this.f12987k = q0Var;
        q0Var.f(this);
    }

    public void x(v0 v0Var) {
        this.f12982f = v0Var;
        v0Var.f13977a = this;
    }

    public void y() {
        q0 q0Var = this.f12987k;
        if (q0Var != null) {
            q0Var.h();
        }
    }
}
