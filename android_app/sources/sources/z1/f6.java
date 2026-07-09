package z1;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import java.util.ArrayList;
import java.util.HashMap;
import o2.b;
import org.dcm4che3.imageio.codec.jpeg.JPEG;
import z1.u5;

/* JADX INFO: loaded from: classes.dex */
public class f6 extends u5 implements b.InterfaceC0091b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f13146v = 512;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f13147w = 192;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t0 f13151e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public UsbDeviceConnection f13154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public UsbEndpoint f13155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UsbEndpoint f13156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u5.b f13157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u5.c f13158l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13160n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13148b = 193;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13149c = JPEG.SOF2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13150d = JPEG.SOF3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13152f = 100;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13153g = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13161o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f13162p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f13163q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13164r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte f13165s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f13166t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13167u = 128;

    public class b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f13168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<byte[]> f13169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13170d;

        public b() {
            this.f13168b = false;
            this.f13169c = new ArrayList<>();
            this.f13170d = 0;
        }

        public void a() {
            this.f13168b = true;
        }

        public boolean b() {
            boolean z3;
            synchronized (this.f13169c) {
                z3 = this.f13170d > 102400;
            }
            return z3;
        }

        public final byte[] c() {
            byte[] bArr;
            synchronized (this.f13169c) {
                if (this.f13169c.size() > 0) {
                    bArr = this.f13169c.get(0);
                    this.f13169c.remove(0);
                    int length = this.f13170d - bArr.length;
                    this.f13170d = length;
                    if (length < 0) {
                        this.f13170d = 0;
                    }
                } else {
                    bArr = null;
                }
            }
            return bArr;
        }

        public void d(byte[] bArr) {
            if (bArr != null) {
                synchronized (this.f13169c) {
                    this.f13169c.add(bArr);
                    this.f13170d += bArr.length;
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            while (!this.f13168b) {
                byte[] bArrC = c();
                if (bArrC == null) {
                    try {
                        Thread.sleep(5L);
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                } else if (f6.this.f13161o) {
                    HashMap map = new HashMap();
                    map.put("socket", bArrC);
                    f6.this.f13158l.a(map);
                }
            }
        }
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f13172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f13174d;

        public c() {
            this.f13172b = false;
            this.f13173c = 100;
            this.f13174d = false;
        }

        public void a() {
            this.f13172b = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[PHI: r3
          0x004b: PHI (r3v2 java.util.HashMap) = (r3v1 java.util.HashMap), (r3v3 java.util.HashMap) binds: [B:11:0x0049, B:6:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b() {
            /*
                r9 = this;
                z1.f6 r0 = z1.f6.this
                boolean r0 = r0.z()
                boolean r1 = r9.f13174d
                java.lang.String r2 = "socket_data"
                r3 = -91
                r4 = 90
                r5 = 0
                r6 = 4
                r7 = 2
                r8 = 1
                if (r1 == 0) goto L2f
                if (r0 != 0) goto L2f
                byte[] r1 = new byte[r6]
                r1[r5] = r4
                r1[r8] = r3
                r1[r7] = r8
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                r3.put(r2, r1)
                z1.f6 r1 = z1.f6.this
                z1.u5$c r1 = z1.f6.q(r1)
                if (r1 == 0) goto L54
                goto L4b
            L2f:
                if (r1 != 0) goto L54
                if (r0 == 0) goto L54
                byte[] r1 = new byte[r6]
                r1[r5] = r4
                r1[r8] = r3
                r1[r7] = r7
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                r3.put(r2, r1)
                z1.f6 r1 = z1.f6.this
                z1.u5$c r1 = z1.f6.q(r1)
                if (r1 == 0) goto L54
            L4b:
                z1.f6 r1 = z1.f6.this
                z1.u5$c r1 = z1.f6.q(r1)
                r1.a(r3)
            L54:
                r9.f13174d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.f6.c.b():void");
        }

        public void c(int i4) {
            this.f13173c = i4;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            b bVar;
            super.run();
            f6.this.f13160n = true;
            f6.this.f13159m = false;
            if (f6.this.f13157k != null) {
                f6.this.f13157k.a();
            }
            this.f13174d = false;
            long jCurrentTimeMillis = 1;
            loop0: while (true) {
                int i4 = 0;
                while (!this.f13172b) {
                    b();
                    try {
                        Thread.sleep(5L);
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                    if (f6.this.f13164r) {
                        f6.this.f13164r = false;
                        f6 f6Var = f6.this;
                        f6Var.D(f6Var.f13165s);
                        try {
                            Thread.sleep(800L);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        f6.this.B();
                        try {
                            Thread.sleep(800L);
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                        f6.this.x(true);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                    }
                    f6 f6Var2 = f6.this;
                    if (f6Var2.f13161o && (bVar = f6Var2.f13163q) != null && !bVar.b()) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        int i5 = this.f13173c;
                        if (jCurrentTimeMillis2 < i5) {
                            continue;
                        } else {
                            if (jCurrentTimeMillis != 0) {
                                long j4 = jCurrentTimeMillis2 - ((long) i5);
                                jCurrentTimeMillis = System.currentTimeMillis() - (j4 <= ((long) i5) ? j4 : 0L);
                            } else {
                                jCurrentTimeMillis = System.currentTimeMillis();
                            }
                            byte[] bArrB = f6.this.f13158l.b(s0.a.f11071l);
                            if (f6.this.C(bArrB) < 0) {
                                try {
                                    Thread.sleep(5L);
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                                if (f6.this.C(bArrB) < 0) {
                                    continue;
                                }
                            }
                            byte[] bArrA = f6.this.A();
                            if (bArrA == null) {
                                i4++;
                                if (i4 >= 20) {
                                    break loop0;
                                }
                            } else {
                                b bVar2 = f6.this.f13163q;
                                if (bVar2 != null) {
                                    bVar2.d(bArrA);
                                }
                            }
                        }
                    }
                }
                break loop0;
            }
            f6.this.f13160n = false;
            if (f6.this.f13157k != null) {
                f6.this.f13157k.d();
            }
        }
    }

    public f6() {
        b.a aVarH = o2.b.g(null).h();
        if (aVarH != null) {
            this.f13154h = aVarH.f9939b;
            UsbInterface usbInterface = aVarH.f9938a.getInterface(0);
            UsbEndpoint endpoint = usbInterface.getEndpoint(0);
            this.f13156j = endpoint;
            endpoint.getDirection();
            UsbEndpoint endpoint2 = usbInterface.getEndpoint(2);
            this.f13155i = endpoint2;
            endpoint2.getDirection();
        }
    }

    public byte[] A() {
        int i4;
        byte[] bArr;
        boolean z3;
        synchronized (this.f13166t) {
            i4 = this.f13167u;
            bArr = new byte[i4 * 512];
        }
        byte[] bArr2 = new byte[16384];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4 && i6 <= 20) {
            i6++;
            int iBulkTransfer = this.f13154h.bulkTransfer(this.f13155i, bArr2, 16384, 100);
            if (iBulkTransfer >= 0) {
                if (iBulkTransfer != 16384) {
                    break;
                }
                int i7 = 0;
                while (true) {
                    if (i7 < 32) {
                        for (int i8 = 0; i8 < 256; i8 += 64) {
                            int i9 = (i7 * 512) + i8;
                            if (bArr2[i9] != -86 || bArr2[i9 + 1] != 85) {
                                z3 = true;
                                break;
                            }
                        }
                        z3 = false;
                        if (z3) {
                            if (i5 < i4) {
                                System.arraycopy(bArr2, i7 * 512, bArr, i5 * 512, 512);
                            }
                            i5++;
                            if (i5 >= i4) {
                                this.f13154h.bulkTransfer(this.f13155i, bArr2, 16384, 100);
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
        return bArr;
    }

    public void B() {
        UsbDeviceConnection usbDeviceConnection = this.f13154h;
        if (usbDeviceConnection != null) {
            usbDeviceConnection.controlTransfer(0, 193, 0, 0, null, 0, 100);
        }
    }

    public int C(byte[] bArr) {
        return this.f13154h.bulkTransfer(this.f13156j, bArr, bArr.length, 10);
    }

    public int D(byte b4) {
        byte[] bArr = new byte[512];
        bArr[24] = b4;
        return this.f13154h.bulkTransfer(this.f13156j, bArr, 512, 10);
    }

    public void E(t0 t0Var) {
        this.f13151e = t0Var;
    }

    public void F(int i4) {
        synchronized (this.f13166t) {
            this.f13167u = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0004 A[PHI: r0
      0x0004: PHI (r0v2 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0002, B:6:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void G(int r2) {
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
            r1.f13152f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.f6.G(int):void");
    }

    @Override // o2.b.InterfaceC0091b
    public void c() {
        i();
    }

    @Override // o2.b.InterfaceC0091b
    public void d() {
    }

    @Override // z1.u5
    public void h(int i4) {
        super.h(i4);
    }

    @Override // z1.u5
    public void i() {
        c cVar = this.f13162p;
        if (cVar != null) {
            cVar.a();
            this.f13162p = null;
            x(false);
        }
        b bVar = this.f13163q;
        if (bVar != null) {
            bVar.a();
            this.f13163q = null;
        }
        this.f13154h.close();
        this.f13154h = null;
        this.f13155i = null;
        this.f13156j = null;
    }

    @Override // z1.u5
    public boolean j() {
        return this.f13160n;
    }

    @Override // z1.u5
    public boolean k() {
        return this.f13159m;
    }

    @Override // z1.u5
    public void l() {
        if (this.f13163q == null) {
            b bVar = new b();
            this.f13163q = bVar;
            bVar.start();
        }
        if (this.f13162p == null) {
            B();
            x(true);
            c cVar = new c();
            this.f13162p = cVar;
            cVar.start();
        }
        this.f13159m = true;
        this.f13160n = false;
    }

    @Override // z1.u5
    public void m(u5.b bVar) {
        this.f13157k = bVar;
    }

    @Override // z1.u5
    public void n(u5.c cVar) {
        this.f13158l = cVar;
    }

    @Override // z1.u5
    public void o() {
        c cVar = this.f13162p;
        if (cVar != null) {
            cVar.a();
            this.f13162p = null;
            x(false);
        }
        b bVar = this.f13163q;
        if (bVar != null) {
            bVar.a();
            this.f13163q = null;
        }
    }

    public void p(byte b4) {
        this.f13164r = true;
        this.f13165s = b4;
    }

    public void x(boolean z3) {
        if (z3) {
            this.f13154h.controlTransfer(0, JPEG.SOF2, 1, 0, null, 0, 100);
        } else {
            this.f13154h.controlTransfer(0, JPEG.SOF2, 0, 0, null, 0, 100);
        }
    }

    public t0 y() {
        return this.f13151e;
    }

    public boolean z() {
        byte[] bArr = new byte[1];
        this.f13154h.controlTransfer(128, JPEG.SOF3, 0, 0, bArr, 1, 100);
        return bArr[0] != 0;
    }
}
