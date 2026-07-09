package z1;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o2.b;
import org.dcm4che3.imageio.codec.jpeg.JPEG;
import z1.n0;
import z1.v;

/* JADX INFO: loaded from: classes.dex */
public class j6 {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f13412i0 = 192;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f13413j0 = 196;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Object f13414k0 = new Object();
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;
    public int N;
    public byte[] P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f13416a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f13418b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f13420c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f13422d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f13424e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f13426f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f13428g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f13430h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k6 f13431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<String, v> f13432j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public UsbDeviceConnection f13435m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public UsbEndpoint f13436n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public UsbEndpoint f13437o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13438p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13440r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte[] f13442t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13443u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f13445w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13415a = 193;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13417b = JPEG.SOF2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13419c = JPEG.SOF3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13421d = JPEG.SOF5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13423e = JPEG.SOF6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13425f = JPEG.SOF7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13427g = 512;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<Integer, c> f13429h = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13433k = 5000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13434l = 1000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte f13439q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13441s = 200;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f13444v = new byte[512];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f13446x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a f13447y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public byte[] f13448z = new byte[512];
    public int A = 160;
    public byte[] B = new byte[81920];
    public boolean C = false;
    public int D = 16384;
    public byte[] E = new byte[16384];
    public int O = 0;

    public class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f13449b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<byte[]> f13450c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13451d = 0;

        public a() {
        }

        public void a() {
            this.f13449b = true;
        }

        public boolean b() {
            boolean z3;
            synchronized (this.f13450c) {
                z3 = this.f13451d > 102400;
            }
            return z3;
        }

        public final byte[] c() {
            byte[] bArr;
            synchronized (this.f13450c) {
                if (this.f13450c.size() > 0) {
                    bArr = this.f13450c.get(0);
                    this.f13450c.remove(0);
                    int length = this.f13451d - bArr.length;
                    this.f13451d = length;
                    if (length < 0) {
                        this.f13451d = 0;
                    }
                } else {
                    bArr = null;
                }
            }
            return bArr;
        }

        public void d(byte[] bArr) {
            if (bArr != null) {
                synchronized (this.f13450c) {
                    this.f13450c.add(bArr);
                    this.f13451d += bArr.length;
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            while (!this.f13449b) {
                byte[] bArrC = c();
                if (bArrC == null) {
                    try {
                        Thread.sleep(5L);
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                } else {
                    j6.this.p0(bArrC);
                }
            }
        }
    }

    public class b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f13453b = false;

        public b() {
        }

        public void a() {
            this.f13453b = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a aVar;
            a aVar2;
            super.run();
            j6.this.C = false;
            long jCurrentTimeMillis = 1;
            int i4 = 0;
            while (!this.f13453b) {
                j6.this.I();
                try {
                    Thread.sleep(5L);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                j6 j6Var = j6.this;
                if (j6Var.f13438p) {
                    j6Var.f13438p = false;
                    j6Var.w0(j6Var.f13439q);
                    try {
                        Thread.sleep(800L);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    j6.this.s0();
                    try {
                        Thread.sleep(2000L);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    j6.this.n(true);
                    try {
                        Thread.sleep(100L);
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                }
                if (j6.this.d0() && (aVar = j6.this.f13447y) != null && !aVar.b()) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    int i5 = j6.this.f13441s;
                    if (jCurrentTimeMillis2 < i5) {
                        continue;
                    } else {
                        if (jCurrentTimeMillis != 0) {
                            long j4 = jCurrentTimeMillis2 - ((long) i5);
                            jCurrentTimeMillis = System.currentTimeMillis() - (j4 <= ((long) i5) ? j4 : 0L);
                        } else {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        byte[] bArrR = j6.this.R();
                        if (j6.this.P0(bArrR) < 0) {
                            try {
                                Thread.sleep(5L);
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                            if (j6.this.P0(bArrR) < 0) {
                                i4++;
                                if (i4 >= 10) {
                                    break;
                                }
                            }
                        } else {
                            i4 = 0;
                        }
                        byte[] bArrQ0 = j6.this.q0();
                        if (bArrQ0 != null && (aVar2 = j6.this.f13447y) != null) {
                            aVar2.d(bArrQ0);
                        }
                    }
                }
            }
            j6.this.l0();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte f13455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f13456b;

        public c(byte b4, String str) {
            this.f13455a = b4;
            this.f13456b = str;
        }
    }

    public j6() {
        c();
    }

    public int A() {
        return this.f13424e0;
    }

    public void A0(int i4) {
        this.X = i4;
    }

    public int B() {
        return this.f13426f0;
    }

    public void B0(int i4) {
        this.T = i4;
    }

    public int C() {
        return this.f13428g0;
    }

    public void C0(int i4) {
        this.V = i4;
    }

    public int D() {
        return this.f13416a0;
    }

    public void D0(int i4) {
        this.Q = i4;
    }

    public int E() {
        return this.f13430h0;
    }

    public void E0(int i4) {
        this.Z = i4;
    }

    public int F() {
        return this.f13420c0;
    }

    public void F0(int i4) {
        this.R = i4;
    }

    public int G() {
        return this.f13418b0;
    }

    public void G0(int i4) {
        this.W = i4;
    }

    public int H() {
        return this.f13422d0;
    }

    public void H0(int i4) {
        this.f13424e0 = i4;
    }

    public void I() {
        boolean zF0 = f0();
        boolean z3 = this.C;
        if (z3 && !zF0) {
            byte[] bArr = {90, -91, 1, 0};
            this.f13442t = bArr;
            i0(bArr);
        } else if (!z3 && zF0) {
            byte[] bArr2 = {90, -91, 2, 0};
            this.f13442t = bArr2;
            i0(bArr2);
        }
        this.C = zF0;
    }

    public void I0(int i4) {
        this.f13426f0 = i4;
    }

    public int J() {
        return this.F;
    }

    public void J0(int i4) {
        this.f13428g0 = i4;
    }

    public Map<String, v> K() {
        return this.f13432j;
    }

    public void K0(int i4) {
        this.f13416a0 = i4;
    }

    public int L() {
        return this.K;
    }

    public void L0(int i4) {
        this.f13430h0 = i4;
    }

    public int M() {
        return this.N;
    }

    public void M0(int i4) {
        this.f13420c0 = i4;
    }

    public int N() {
        return this.I;
    }

    public void N0(int i4) {
        this.f13418b0 = i4;
    }

    public byte[] O() {
        return this.P;
    }

    public void O0(int i4) {
        this.f13422d0 = i4;
    }

    public boolean P() {
        k6 k6Var = this.f13431i;
        if (k6Var != null) {
            return k6Var.o();
        }
        return false;
    }

    public int P0(byte[] bArr) {
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

    public int Q() {
        return this.A;
    }

    public void Q0(boolean z3) {
        this.L = z3;
    }

    public byte[] R() {
        k6 k6Var = this.f13431i;
        return k6Var != null ? k6Var.a() : new byte[0];
    }

    public void R0(int i4) {
        this.F = i4;
    }

    public UsbDeviceConnection S() {
        if (this.f13435m == null) {
            try {
                throw new Exception("CyControlEndPoint _theConnection; 获取为null");
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        return this.f13435m;
    }

    public void S0(Map<String, v> map) {
        this.f13432j = map;
    }

    public Map<Integer, c> T() {
        return this.f13429h;
    }

    public void T0(int i4) {
        this.K = i4;
    }

    public byte U() {
        return this.f13439q;
    }

    public void U0(boolean z3) {
        this.f13440r = z3;
    }

    public int V() {
        k6 k6Var = this.f13431i;
        if (k6Var != null) {
            return k6Var.e();
        }
        return 0;
    }

    public void V0(int i4) {
        this.N = i4;
    }

    public int W() {
        return this.O;
    }

    public void W0(int i4) {
        this.I = i4;
    }

    public int X() {
        return this.f13441s;
    }

    public void X0(boolean z3) {
        this.M = z3;
    }

    public int Y(int i4, boolean z3) {
        if (i4 == 0 || i4 == 1) {
            return z3 ? 83 : 66;
        }
        return 142;
    }

    public void Y0(k6 k6Var) {
        this.f13431i = k6Var;
    }

    public int Z() {
        return this.H;
    }

    public void Z0(byte[] bArr) {
        this.P = bArr;
    }

    public void a() {
    }

    public boolean a0() {
        return this.L;
    }

    public void a1(boolean z3) {
        this.J = z3;
    }

    public v b(int i4) {
        return K().get(this.f13429h.get(Integer.valueOf(i4)).f13456b);
    }

    public boolean b0() {
        return this.f13440r;
    }

    public void b1(int i4) {
        synchronized (f13414k0) {
            this.A = i4;
            if (this.B.length != i4 * 512) {
                this.B = new byte[i4 * 512];
            }
        }
    }

    public void c() {
        b.a aVarH = o2.b.g(null).h();
        if (aVarH != null) {
            this.f13435m = aVarH.f9939b;
            UsbInterface usbInterface = aVarH.f9938a.getInterface(0);
            UsbEndpoint endpoint = usbInterface.getEndpoint(0);
            this.f13437o = endpoint;
            endpoint.getDirection();
            UsbEndpoint endpoint2 = usbInterface.getEndpoint(2);
            this.f13436n = endpoint2;
            endpoint2.getDirection();
        }
    }

    public boolean c0() {
        return this.M;
    }

    public void c1(boolean z3) {
        this.G = z3;
    }

    public void d() {
    }

    public boolean d0() {
        k6 k6Var = this.f13431i;
        if (k6Var != null) {
            return k6Var.b();
        }
        return false;
    }

    public void d1(UsbDeviceConnection usbDeviceConnection) {
        this.f13435m = usbDeviceConnection;
    }

    public String e(byte b4) {
        return b4 != 7 ? b4 != 15 ? s0.a.f11071l : "R60(C5-2) SS-6C" : "4D(V6-2) SL-6C";
    }

    public boolean e0() {
        return this.J;
    }

    public void e1(boolean z3) {
        this.f13438p = z3;
    }

    public void f(byte[] bArr, int i4) {
        byte[] bArr2 = new byte[512];
        int i5 = i4 * 512;
        int i6 = i5 + 512;
        if (i6 <= bArr.length) {
            for (int i7 = i5; i7 < i6; i7++) {
                bArr[i7] = -96;
            }
            System.arraycopy(bArr, i5, bArr2, 0, 512);
            for (int i8 = 0; i8 < 512; i8++) {
                byte b4 = bArr2[i8];
                StringBuilder sb = new StringBuilder();
                sb.append((int) b4);
                sb.append(" , ");
            }
        }
    }

    public boolean f0() {
        byte[] bArr = new byte[1];
        this.f13435m.controlTransfer(128, JPEG.SOF3, 0, 0, bArr, 1, 100);
        return bArr[0] != 0;
    }

    public void f1(Map<Integer, c> map) {
        this.f13429h = map;
    }

    public void g() {
    }

    public boolean g0() {
        return this.G;
    }

    public void g1(byte b4) {
        this.f13439q = b4;
    }

    public void h() {
    }

    public boolean h0() {
        return this.f13438p;
    }

    public void h1(int i4) {
        this.O = i4;
    }

    public void i() {
    }

    public void i0(byte[] bArr) {
        k6 k6Var = this.f13431i;
        if (k6Var != null) {
            k6Var.n(bArr);
        }
    }

    public void i1(int i4) {
        k6 k6Var = this.f13431i;
        if (k6Var != null) {
            k6Var.c(i4);
        }
    }

    public void j() {
    }

    public void j0() {
        k6 k6Var = this.f13431i;
        if (k6Var != null) {
            k6Var.l();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0004 A[PHI: r0
      0x0004: PHI (r0v2 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0002, B:6:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j1(int r2) {
        /*
            r1 = this;
            r0 = 20
            if (r2 >= r0) goto L6
        L4:
            r2 = r0
            goto Lb
        L6:
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 <= r0) goto Lb
            goto L4
        Lb:
            r1.f13441s = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.j6.j1(int):void");
    }

    public int k(double d4) {
        if (d4 <= 1.0d) {
            d4 = 1.0d;
        }
        if (d4 >= 25.0d) {
            d4 = 25.0d;
        }
        return (int) (1000.0d / d4);
    }

    public void k0(byte[] bArr) {
        k6 k6Var = this.f13431i;
        if (k6Var != null) {
            k6Var.g(bArr);
        }
    }

    public void k1(int i4) {
        this.H = i4;
    }

    public void l() {
        s0();
        n(true);
        j0();
    }

    public void l0() {
        k6 k6Var = this.f13431i;
        if (k6Var != null) {
            k6Var.i();
        }
    }

    public void l1(int i4) {
        k6 k6Var = this.f13431i;
        if (k6Var != null) {
            k6Var.h(i4);
        }
    }

    public void m() {
        try {
            this.f13440r = true;
            this.f13435m = null;
            this.f13436n = null;
            this.f13437o = null;
            b bVar = this.f13446x;
            if (bVar != null) {
                bVar.a();
                this.f13446x = null;
                n(false);
            }
            a aVar = this.f13447y;
            if (aVar != null) {
                aVar.a();
                this.f13447y = null;
            }
        } catch (Exception unused) {
        }
    }

    public void m0(byte[] bArr) {
        k6 k6Var = this.f13431i;
        if (k6Var != null) {
            k6Var.j(bArr);
        }
    }

    public void m1() {
        if (this.f13447y == null) {
            a aVar = new a();
            this.f13447y = aVar;
            aVar.start();
        }
        if (this.f13446x == null) {
            s0();
            n(true);
            b bVar = new b();
            this.f13446x = bVar;
            bVar.start();
        }
    }

    public void n(boolean z3) {
        UsbDeviceConnection usbDeviceConnection = this.f13435m;
        if (usbDeviceConnection != null) {
            usbDeviceConnection.controlTransfer(0, JPEG.SOF2, z3 ? 1 : 0, 0, null, 0, 100);
        }
    }

    public void n0() {
        k6 k6Var = this.f13431i;
        if (k6Var != null) {
            k6Var.m();
        }
    }

    public void n1() {
        synchronized (this) {
            this.f13443u = false;
        }
    }

    public String o(int i4) {
        n0.e eVar;
        n0.e eVar2 = n0.e.MODE_B;
        String string = eVar2.toString();
        if (i4 == 0 || i4 == 1) {
            return eVar2.toString();
        }
        if (i4 == 2) {
            eVar = n0.e.MODE_BC;
        } else if (i4 == 3) {
            eVar = n0.e.MODE_BP;
        } else {
            if (i4 != 4) {
                return string;
            }
            eVar = n0.e.MODE_BD;
        }
        return eVar.toString();
    }

    public void o0(Map<String, Object> map) {
        k6 k6Var = this.f13431i;
        if (k6Var != null) {
            k6Var.f(map);
        }
    }

    public void o1() {
        n0.e eVar = n0.e.MODE_B;
        eVar.toString();
        int i4 = this.F;
        if (i4 == 0 || i4 == 1) {
            eVar.toString();
        } else {
            if (i4 == 2) {
                eVar = n0.e.MODE_BC;
            } else if (i4 == 3) {
                eVar = n0.e.MODE_BP;
            } else if (i4 == 4) {
                eVar = n0.e.MODE_BD;
            }
            eVar.toString();
        }
        Map<Integer, v.a> map = b(this.O).f13971a;
        if (map != null) {
            map.containsKey(Integer.valueOf(this.F));
            v.a aVar = map.get(Integer.valueOf(this.F));
            if (aVar != null) {
                b1(aVar.f13972a + aVar.f13974c);
            }
        }
        j1(Y(this.F, this.M));
    }

    public void p(byte b4, String str, String str2) {
        k6 k6Var = this.f13431i;
        if (k6Var != null) {
            k6Var.k(b4, str, str2);
        }
    }

    public void p0(byte[] bArr) {
        HashMap map = new HashMap();
        map.put("socket_data", bArr);
        o0(map);
    }

    public void p1(byte b4, byte b5) {
        k6 k6Var = this.f13431i;
        if (k6Var != null) {
            k6Var.d(b4, b5);
        }
    }

    public int q() {
        return this.S;
    }

    public byte[] q0() {
        boolean z3;
        int i4 = this.A;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4 && i6 <= 20) {
            i6++;
            int iBulkTransfer = this.f13435m.bulkTransfer(this.f13436n, this.E, this.D, 5);
            if (iBulkTransfer >= 0) {
                if (iBulkTransfer != this.D) {
                    break;
                }
                int i7 = 0;
                while (true) {
                    if (i7 < this.D / 512) {
                        for (int i8 = 0; i8 < 256; i8 += 64) {
                            byte[] bArr = this.E;
                            int i9 = (i7 * 512) + i8;
                            if (bArr[i9] != -86 || bArr[i9 + 1] != 85) {
                                z3 = true;
                                break;
                            }
                        }
                        z3 = false;
                        if (z3) {
                            if (i5 < i4) {
                                System.arraycopy(this.E, i7 * 512, this.B, i5 * 512, 512);
                            }
                            i5++;
                            if (i5 >= i4) {
                                this.f13435m.bulkTransfer(this.f13436n, this.E, this.D, 100);
                                break;
                            }
                        }
                        i7++;
                    }
                }
            }
        }
        if (i5 < i4) {
            return null;
        }
        return this.B;
    }

    public int r() {
        return this.U;
    }

    public byte[] r0() {
        byte[] bArr = new byte[512];
        UsbEndpoint usbEndpoint = this.f13436n;
        if (usbEndpoint == null || this.f13435m.bulkTransfer(usbEndpoint, bArr, 512, 100) >= 0) {
            return bArr;
        }
        return null;
    }

    public int s() {
        return this.Y;
    }

    public void s0() {
        UsbDeviceConnection usbDeviceConnection = this.f13435m;
        if (usbDeviceConnection != null) {
            usbDeviceConnection.controlTransfer(0, 193, 0, 0, null, 0, 100);
        }
    }

    public int t() {
        return this.X;
    }

    public void t0() {
        this.f13445w = null;
    }

    public int u() {
        return this.T;
    }

    public void u0() {
    }

    public int v() {
        return this.V;
    }

    public int v0(byte[] bArr) {
        UsbEndpoint usbEndpoint;
        UsbDeviceConnection usbDeviceConnection = this.f13435m;
        if (usbDeviceConnection == null || (usbEndpoint = this.f13437o) == null) {
            return -1;
        }
        return usbDeviceConnection.bulkTransfer(usbEndpoint, bArr, bArr.length, 1000);
    }

    public int w() {
        return this.Q;
    }

    public int w0(byte b4) {
        byte[] bArr = new byte[512];
        bArr[24] = b4;
        return this.f13435m.bulkTransfer(this.f13437o, bArr, 512, 10);
    }

    public int x() {
        return this.Z;
    }

    public void x0(int i4) {
        this.S = i4;
    }

    public int y() {
        return this.R;
    }

    public void y0(int i4) {
        this.U = i4;
    }

    public int z() {
        return this.W;
    }

    public void z0(int i4) {
        this.Y = i4;
    }
}
