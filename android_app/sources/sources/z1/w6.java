package z1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import z1.j6;

/* JADX INFO: loaded from: classes.dex */
public class w6 extends j6 {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f14120l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f14121m0;

    public w6() {
        c();
    }

    @Override // z1.j6
    public Map<String, v> K() {
        if (this.f13432j == null) {
            this.f13432j = new HashMap();
            v vVar = new v();
            vVar.d(0, 512, 256, 0);
            vVar.d(2, 512, 128, 32);
            vVar.d(3, 512, 128, 32);
            vVar.d(4, 512, 128, 32);
            this.f13432j.put("UX-2H_A", vVar);
            this.f13429h.put(0, new j6.c((byte) 0, "UX-2H_A"));
            v vVar2 = new v();
            vVar2.d(0, 512, 256, 0);
            vVar2.d(2, 512, 128, 32);
            vVar2.d(3, 512, 128, 32);
            vVar2.d(4, 512, 128, 32);
            this.f13432j.put("UX-2H_B", vVar2);
            this.f13429h.put(1, new j6.c((byte) 1, "UX-2H_B"));
        }
        return this.f13432j;
    }

    @Override // z1.j6
    public int P0(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        this.f13444v = bArr;
        if (bArr[2] == 1) {
            this.G = true;
        } else {
            this.G = false;
        }
        this.H = bArr[3];
        if (bArr[16] == 1) {
            this.M = true;
        } else {
            this.M = false;
        }
        this.f14121m0 = bArr[21] > 0 ? bArr[20] : (byte) -1;
        this.f14120l0 = bArr[24];
        byte b4 = bArr[60];
        if (b4 == 0) {
            this.F = 0;
        } else {
            this.F = b4 == 2 ? 4 : 2;
        }
        this.f13430h0 = bArr[73];
        bArr[6] = 0;
        o1();
        return v0(bArr);
    }

    @Override // z1.j6
    public int Y(int i4, boolean z3) {
        if (i4 == 0 || i4 == 1) {
            return 62;
        }
        if (i4 == 4) {
            return (E() == 0 || E() == 4) ? 120 : 90;
        }
        return 161;
    }

    @Override // z1.j6
    public void p0(byte[] bArr) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("socket_data", bArr);
        treeMap.put("compound_steer", new byte[]{(byte) this.f14121m0});
        treeMap.put("trans_tag", new byte[]{(byte) this.f14120l0});
        o0(treeMap);
    }
}
