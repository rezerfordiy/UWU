package z1;

import android.hardware.usb.UsbEndpoint;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.dcm4che3.imageio.codec.jpeg.JPEG;
import z1.j6;
import z1.v;

/* JADX INFO: loaded from: classes.dex */
public class l6 extends j6 {
    public static final int D0 = 192;
    public static final int E0 = 196;
    public long A0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public byte[] f13593u0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public long f13598z0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final int f13584l0 = 193;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final int f13585m0 = JPEG.SOF2;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final int f13586n0 = JPEG.SOF3;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final int f13587o0 = JPEG.SOF5;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f13588p0 = JPEG.SOF6;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f13589q0 = JPEG.SOF7;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f13590r0 = 512;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public c f13591s0 = null;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f13592t0 = 0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f13594v0 = 500;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f13595w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f13596x0 = false;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f13597y0 = true;
    public byte B0 = 0;
    public byte C0 = 0;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f13600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte f13601c;

        public b(boolean z3, boolean z4, byte b4) {
            this.f13599a = z3;
            this.f13600b = z4;
            this.f13601c = b4;
        }
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f13602b;

        public c() {
            this.f13602b = false;
        }

        public void a() {
            this.f13602b = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            j6.a aVar;
            super.run();
            l6.this.f13598z0 = System.currentTimeMillis();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
            l6 l6Var = l6.this;
            l6Var.C = false;
            l6Var.A0 = System.currentTimeMillis();
            l6.this.f13597y0 = true;
            int i4 = 0;
            long jCurrentTimeMillis = 1;
            while (!this.f13602b) {
                l6.this.I();
                int iV = l6.this.V();
                byte b4 = (iV < 0 || l6.this.f13429h.size() <= iV) ? (byte) -1 : l6.this.f13429h.get(Integer.valueOf(iV)).f13455a;
                boolean zP = l6.this.P();
                l6 l6Var2 = l6.this;
                if (zP != l6Var2.J && b4 != -1) {
                    l6Var2.J = zP;
                    l6Var2.w1(b4);
                }
                if (l6.this.d0()) {
                    if (b4 == -1) {
                        b4 = (byte) l6.this.O;
                    }
                    l6 l6Var3 = l6.this;
                    if (l6Var3.O != b4) {
                        l6Var3.w1(b4);
                    }
                    if (System.currentTimeMillis() - jCurrentTimeMillis < l6.this.f13441s) {
                        continue;
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis();
                        byte[] bArrR = l6.this.R();
                        if (l6.this.P0(bArrR) < 0) {
                            try {
                                Thread.sleep(5L);
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                            if (l6.this.P0(bArrR) < 0) {
                                i4++;
                                if (i4 >= 10) {
                                    break;
                                }
                            }
                        } else {
                            i4 = 0;
                        }
                        byte[] bArrQ0 = l6.this.q0();
                        if (bArrQ0 != null && (aVar = l6.this.f13447y) != null) {
                            aVar.d(bArrQ0);
                        }
                    }
                } else {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    l6 l6Var4 = l6.this;
                    if (jCurrentTimeMillis2 - l6Var4.f13598z0 > l6Var4.f13594v0 || l6Var4.f13596x0) {
                        l6Var4.f13598z0 = System.currentTimeMillis();
                        l6 l6Var5 = l6.this;
                        l6Var5.f13596x0 = false;
                        b bVarQ1 = l6Var5.q1(new byte[10]);
                        l6 l6Var6 = l6.this;
                        l6Var6.m0(l6Var6.f13593u0);
                        Iterator<Integer> it = l6.this.f13429h.keySet().iterator();
                        boolean z3 = true;
                        while (it.hasNext()) {
                            byte b5 = l6.this.f13429h.get(Integer.valueOf(it.next().intValue())).f13455a;
                            if (b5 != -1 && b5 == bVarQ1.f13601c) {
                                z3 = false;
                            }
                        }
                        if (z3) {
                            Iterator<Integer> it2 = l6.this.f13429h.keySet().iterator();
                            while (it2.hasNext()) {
                                int iIntValue = it2.next().intValue();
                                j6.c cVar = l6.this.f13429h.get(Integer.valueOf(iIntValue));
                                if (cVar.f13455a != -1 && cVar.f13456b != null) {
                                    l6.this.i1(iIntValue);
                                    l6.this.w1(cVar.f13455a);
                                }
                            }
                        }
                        l6.this.p1((l6.this.f13429h.size() <= 0 || l6.this.f13429h.get(0).f13455a == -1) ? (byte) 0 : l6.this.f13429h.get(0).f13455a, (l6.this.f13429h.size() <= 1 || l6.this.f13429h.get(1).f13455a == -1) ? (byte) 0 : l6.this.f13429h.get(1).f13455a);
                    }
                    if (b4 != -1) {
                        l6 l6Var7 = l6.this;
                        if (b4 != l6Var7.O) {
                            l6Var7.w1(b4);
                            l6.this.n0();
                        }
                    }
                    try {
                        Thread.sleep(1L);
                    } catch (InterruptedException e6) {
                        e6.printStackTrace();
                    }
                }
            }
            j6.a aVar2 = l6.this.f13447y;
            if (aVar2 != null) {
                aVar2.a();
            }
            l6.this.l0();
        }
    }

    @Override // z1.j6
    public Map<String, v> K() {
        if (this.f13432j == null) {
            HashMap map = new HashMap();
            this.f13432j = map;
            map.put(o7.f13792a, new v(512, 128, 32));
            v vVar = new v();
            vVar.d(0, 512, 256, 0);
            vVar.d(2, 512, 128, 32);
            vVar.d(3, 512, 128, 32);
            vVar.d(4, 512, 128, 32);
            this.f13432j.put(o7.f13793b, vVar);
            v vVar2 = new v();
            vVar2.d(0, 512, 256, 0);
            vVar2.d(2, 512, 128, 32);
            vVar2.d(3, 512, 128, 32);
            vVar2.d(4, 512, 128, 32);
            this.f13432j.put(o7.f13794c, vVar2);
            v vVar3 = new v();
            vVar3.d(0, 512, 256, 0);
            vVar3.d(2, 512, 128, 32);
            vVar3.d(3, 512, 128, 32);
            vVar3.d(4, 512, 128, 32);
            this.f13432j.put(o7.f13795d, vVar3);
            v vVar4 = new v();
            vVar4.d(0, 512, 128, 0);
            vVar4.d(2, 512, 128, 32);
            vVar4.d(3, 512, 128, 32);
            vVar4.d(4, 512, 128, 32);
            this.f13432j.put(o7.f13796e, vVar4);
            v vVar5 = new v();
            vVar5.d(0, 512, 256, 0);
            vVar5.d(2, 512, 128, 32);
            vVar5.d(3, 512, 128, 32);
            vVar5.d(4, 512, 128, 32);
            this.f13432j.put(o7.f13797f, vVar5);
            this.f13432j.put(o7.f13798g, new v(512, 128, 32));
            this.f13432j.put(o7.f13799h, new v(512, 128, 32));
            this.f13432j.put(o7.f13800i, new v(512, 128, 32));
            this.f13432j.put(o7.f13801j, new v(512, 128, 32));
            this.f13432j.put("PA", new v(512, 128, 32));
        }
        return this.f13432j;
    }

    @Override // z1.j6
    public int P0(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        byte[] bArr2 = this.f13444v;
        if (length <= bArr2.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        } else {
            this.f13444v = bArr;
        }
        byte[] bArr3 = this.f13444v;
        byte b4 = bArr3[2];
        this.H = bArr3[3];
        if (bArr3[16] == 1) {
            this.M = true;
        } else {
            this.M = false;
        }
        byte b5 = bArr3[60];
        if (b5 == 0) {
            this.F = 0;
        } else if (b5 == 2) {
            this.F = 4;
        } else {
            this.F = 2;
        }
        this.f13430h0 = bArr3[73];
        if (this.O == 5 && bArr3[37] == 2) {
            bArr3[37] = 3;
        }
        bArr3[6] = 0;
        o1();
        return v0(this.f13444v);
    }

    @Override // z1.j6
    public void S0(Map<String, v> map) {
        this.f13432j = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
    
        return 161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
    
        return 172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r1 == 2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006f, code lost:
    
        if (r1 == 2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00d1, code lost:
    
        if (r1 == 2) goto L84;
     */
    @Override // z1.j6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int Y(int r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.l6.Y(int, boolean):int");
    }

    @Override // z1.j6
    public String e(byte b4) {
        switch (b4) {
            case 1:
                return o7.f13799h;
            case 2:
            case 4:
            case 8:
            case 12:
            default:
                return s0.a.f11071l;
            case 3:
                return o7.f13795d;
            case 5:
                return o7.f13797f;
            case 6:
                return o7.f13801j;
            case 7:
                return o7.f13793b;
            case 9:
                return o7.f13798g;
            case 10:
                return o7.f13802k;
            case 11:
                return o7.f13794c;
            case 13:
                return o7.f13796e;
            case 14:
                return o7.f13800i;
            case 15:
                return o7.f13792a;
        }
    }

    @Override // z1.j6
    public void l() {
        try {
            s0();
            n(true);
            byte b4 = -1;
            for (int i4 = 0; i4 < 5; i4++) {
                b4 = q1(new byte[10]).f13601c;
                Thread.sleep(400L);
            }
            r1();
            j0();
            if (this.f13429h.size() <= 0 || b4 == -1) {
                return;
            }
            Iterator<Integer> it = this.f13429h.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (this.f13429h.get(Integer.valueOf(iIntValue)).f13455a == b4) {
                    i1(iIntValue);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // z1.j6
    public void m() {
        try {
            this.f13440r = true;
            this.f13435m = null;
            this.f13436n = null;
            this.f13437o = null;
            c cVar = this.f13591s0;
            if (cVar != null) {
                cVar.a();
                this.f13591s0 = null;
                n(false);
            }
            j6.a aVar = this.f13447y;
            if (aVar != null) {
                aVar.a();
                this.f13447y = null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // z1.j6
    public void m1() {
        if (this.f13447y == null) {
            j6.a aVar = new j6.a();
            this.f13447y = aVar;
            aVar.start();
        }
        if (this.f13591s0 == null) {
            s0();
            n(true);
            c cVar = new c();
            this.f13591s0 = cVar;
            cVar.start();
        }
    }

    @Override // z1.j6
    public void o1() {
        v.a aVar;
        String strE = e((byte) this.O);
        if (K().containsKey(strE)) {
            Map<Integer, v.a> map = this.f13432j.get(strE).f13971a;
            if (map != null && (aVar = map.get(Integer.valueOf(this.F))) != null) {
                b1(aVar.f13972a + aVar.f13974c);
            }
            j1(Y(this.F, this.M));
        }
    }

    public b q1(byte[] bArr) {
        byte b4;
        byte[] bArr2 = new byte[512];
        bArr2[6] = 1;
        if (this.f13592t0 < 1) {
            v0(bArr2);
            this.f13592t0++;
        }
        this.f13593u0 = r0();
        for (int i4 = 0; i4 < 10; i4++) {
            byte[] bArr3 = this.f13593u0;
            if (bArr3 != null && bArr2[6] == 1) {
                byte b5 = bArr3[0];
                if ((b5 == -86 && bArr3[1] == 85) || (b5 == -1 && bArr3[1] == -1)) {
                    v0(bArr2);
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e4) {
                        e4.printStackTrace();
                    }
                    this.f13593u0 = r0();
                } else {
                    if (b5 == bArr3[2] && bArr3[1] == bArr3[3]) {
                        break;
                    }
                    v0(bArr2);
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e5) {
                        e5.printStackTrace();
                    }
                    this.f13593u0 = r0();
                }
            }
        }
        byte[] bArr4 = this.f13593u0;
        if (bArr4 == null || bArr2[6] != 1) {
            return new b(true, false, (byte) -1);
        }
        byte b6 = bArr4[0];
        if (b6 == -86 && bArr4[1] == 85) {
            v0(bArr2);
            return new b(true, false, (byte) -1);
        }
        if (b6 == -1 && bArr4[1] == -1) {
            return new b(true, false, (byte) -1);
        }
        if (b6 == 0 && bArr4[1] == 0) {
            return new b(true, false, (byte) -1);
        }
        int i5 = (b6 & 255) | ((bArr4[1] & 255) << 8);
        try {
            Integer.toBinaryString(i5);
        } catch (Exception unused) {
        }
        if (i5 != 0 && (b4 = (byte) (i5 & 15)) != 0) {
            int i6 = i5 >> 6;
            if ((i6 & 1) == 0) {
                byte b7 = (byte) ((i6 >> 1) & 15);
                String strE = e(b7);
                if (this.f13429h.size() > 0) {
                    this.f13429h.remove(0);
                }
                this.f13429h.put(0, new j6.c(b7, strE));
            } else {
                if (this.f13429h.size() > 0) {
                    this.f13429h.remove(0);
                }
                this.f13429h.put(0, new j6.c((byte) -1, s0.a.f11071l));
            }
            if ((i6 & 32) == 0) {
                byte b8 = (byte) ((i6 >> 6) & 15);
                String strE2 = e(b8);
                if (this.f13429h.size() > 1) {
                    this.f13429h.remove(1);
                }
                this.f13429h.put(1, new j6.c(b8, strE2));
            } else {
                if (this.f13429h.size() > 1) {
                    this.f13429h.remove(1);
                }
                this.f13429h.put(1, new j6.c((byte) -1, s0.a.f11071l));
            }
            return new b(true, true, b4);
        }
        return new b(true, false, (byte) -1);
    }

    public void r1() {
        byte b4 = this.f13429h.size() > 0 ? this.f13429h.get(0).f13455a : (byte) -1;
        if (b4 != -1) {
            w1(b4);
        }
    }

    public byte s1(byte b4) {
        return (byte) (((byte) ((b4 & 8) >> 3)) | ((byte) ((b4 & 1) << 3)) | ((byte) ((b4 & 2) << 1)) | ((byte) ((b4 & 4) >> 1)));
    }

    public byte[] t1() {
        return this.f13593u0;
    }

    public boolean u1() {
        return this.f13597y0;
    }

    public boolean v1() {
        return this.f13596x0;
    }

    @Override // z1.j6
    public int w0(byte b4) {
        byte[] bArr = new byte[512];
        byte b5 = (byte) (((byte) (b4 << 1)) | ((this.J && b4 == 15) ? (byte) 32 : (byte) 0) | 1);
        k0(new byte[]{b5});
        bArr[24] = b5;
        UsbEndpoint usbEndpoint = this.f13437o;
        if (usbEndpoint != null) {
            return this.f13435m.bulkTransfer(usbEndpoint, bArr, 512, 10);
        }
        return 512;
    }

    public void w1(int i4) {
        if (i4 == 0) {
            return;
        }
        this.O = i4;
        byte b4 = (byte) i4;
        this.f13439q = b4;
        w0(b4);
        s0();
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e4) {
            e4.printStackTrace();
        }
        n(true);
    }

    public void x1(boolean z3) {
        this.f13597y0 = z3;
    }

    public void y1(boolean z3) {
        this.f13596x0 = z3;
    }

    public void z1(byte[] bArr) {
        this.f13593u0 = bArr;
    }
}
