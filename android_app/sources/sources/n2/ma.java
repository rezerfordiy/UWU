package n2;

import android.content.Context;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import java.util.ArrayList;
import o2.b;
import org.dcm4che3.imageio.codec.jpeg.JPEG;

/* JADX INFO: loaded from: classes.dex */
public class ma {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f9454r = 192;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f9455s = 196;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Context f9456t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f9457u = 512;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r0 f9464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public UsbDeviceConnection f9465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public UsbEndpoint f9466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UsbEndpoint f9467j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9458a = 193;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9459b = JPEG.SOF2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9460c = JPEG.SOF3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9461d = JPEG.SOF5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9462e = JPEG.SOF6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9463f = JPEG.SOF7;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9468k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f9469l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f9470m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f9471n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f9472o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9473p = 128;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9474q = false;

    public class b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<byte[]> f9476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9477d;

        public b() {
            this.f9475b = false;
            this.f9476c = new ArrayList<>();
            this.f9477d = 0;
        }

        public void a() {
            this.f9475b = true;
        }

        public boolean b() {
            boolean z3;
            synchronized (this.f9476c) {
                z3 = this.f9477d > 102400;
            }
            return z3;
        }

        public final byte[] c() {
            byte[] bArr;
            synchronized (this.f9476c) {
                if (this.f9476c.size() > 0) {
                    bArr = this.f9476c.get(0);
                    this.f9476c.remove(0);
                    int length = this.f9477d - bArr.length;
                    this.f9477d = length;
                    if (length < 0) {
                        this.f9477d = 0;
                    }
                } else {
                    bArr = null;
                }
            }
            return bArr;
        }

        public void d(byte[] bArr) {
            if (bArr != null) {
                synchronized (this.f9476c) {
                    this.f9476c.add(bArr);
                    this.f9477d += bArr.length;
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            while (!this.f9475b) {
                byte[] bArrC = c();
                if (bArrC == null) {
                    try {
                        Thread.sleep(5L);
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                } else if (ma.this.f9474q) {
                    ma.this.f9464g.w(bArrC);
                }
            }
        }
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f9481d;

        public c() {
            this.f9479b = false;
            this.f9480c = 100;
            this.f9481d = false;
        }

        public void a() {
            this.f9479b = true;
        }

        public final void b() {
            boolean zK = ma.this.k();
            boolean z3 = this.f9481d;
            if (z3 && !zK) {
                ma.this.f9464g.x(new byte[]{90, -91, 1, 0});
            } else if (!z3 && zK) {
                ma.this.f9464g.x(new byte[]{90, -91, 2, 0});
            }
            this.f9481d = zK;
        }

        public void c(int i4) {
            this.f9480c = i4;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            b bVar;
            super.run();
            r0 r0Var = ma.this.f9464g;
            if (r0Var != null) {
                r0Var.u(true);
            }
            this.f9481d = false;
            long jCurrentTimeMillis = 1;
            int i4 = 0;
            int i5 = 0;
            while (!this.f9479b) {
                b();
                try {
                    Thread.sleep(5L);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                if (ma.this.f9468k) {
                    ma.this.f9468k = false;
                    ma maVar = ma.this;
                    maVar.q(maVar.f9469l);
                    try {
                        Thread.sleep(800L);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    ma.this.n();
                    try {
                        Thread.sleep(800L);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    ma.this.i(true);
                    try {
                        Thread.sleep(100L);
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                }
                if (ma.this.f9474q && (bVar = ma.this.f9471n) != null && !bVar.b()) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    int i6 = this.f9480c;
                    if (jCurrentTimeMillis2 < i6) {
                        continue;
                    } else {
                        if (jCurrentTimeMillis != 0) {
                            long j4 = jCurrentTimeMillis2 - ((long) i6);
                            jCurrentTimeMillis = System.currentTimeMillis() - (j4 <= ((long) i6) ? j4 : 0L);
                        } else {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        i4++;
                        byte[] bArrV = ma.this.f9464g.v(i4);
                        if (ma.this.p(bArrV) < 0) {
                            try {
                                Thread.sleep(5L);
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                            if (ma.this.p(bArrV) < 0) {
                                continue;
                            }
                        }
                        byte[] bArrM = ma.this.m();
                        if (bArrM == null) {
                            i5++;
                            if (i5 >= 20) {
                                break;
                            }
                        } else {
                            b bVar2 = ma.this.f9471n;
                            if (bVar2 != null) {
                                bVar2.d(bArrM);
                            }
                            i5 = 0;
                        }
                    }
                }
            }
            r0 r0Var2 = ma.this.f9464g;
            if (r0Var2 != null) {
                r0Var2.u(false);
            }
        }
    }

    public ma(r0 r0Var) {
        this.f9464g = r0Var;
        b.a aVarH = o2.b.g(null).h();
        if (aVarH != null) {
            this.f9465h = aVarH.f9939b;
            UsbInterface usbInterface = aVarH.f9938a.getInterface(0);
            UsbEndpoint endpoint = usbInterface.getEndpoint(0);
            this.f9467j = endpoint;
            endpoint.getDirection();
            UsbEndpoint endpoint2 = usbInterface.getEndpoint(2);
            this.f9466i = endpoint2;
            endpoint2.getDirection();
        }
    }

    public static void l(Context context) {
        f9456t = context;
    }

    public void a(byte b4) {
        this.f9468k = true;
        this.f9469l = b4;
    }

    public void b(boolean z3) {
        this.f9474q = z3;
    }

    public final void g() {
        this.f9465h.bulkTransfer(this.f9466i, new byte[16384], 16384, 5);
    }

    public void h() {
        this.f9465h.bulkTransfer(this.f9466i, new byte[65536], 65536, 100);
    }

    public void i(boolean z3) {
        if (z3) {
            this.f9465h.controlTransfer(0, JPEG.SOF2, 1, 0, null, 0, 100);
        } else {
            this.f9465h.controlTransfer(0, JPEG.SOF2, 0, 0, null, 0, 100);
        }
    }

    public boolean j() {
        return o2.b.g(null).h() != null;
    }

    public boolean k() {
        byte[] bArr = new byte[1];
        this.f9465h.controlTransfer(128, JPEG.SOF3, 0, 0, bArr, 1, 100);
        return bArr[0] != 0;
    }

    public byte[] m() {
        int i4;
        byte[] bArr;
        boolean z3;
        synchronized (this.f9472o) {
            i4 = this.f9473p;
            bArr = new byte[i4 * 512];
        }
        byte[] bArr2 = new byte[16384];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4 && i6 <= 20) {
            i6++;
            int iBulkTransfer = this.f9465h.bulkTransfer(this.f9466i, bArr2, 16384, 100);
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
                                this.f9465h.bulkTransfer(this.f9466i, bArr2, 16384, 100);
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

    public void n() {
        UsbDeviceConnection usbDeviceConnection = this.f9465h;
        if (usbDeviceConnection != null) {
            usbDeviceConnection.controlTransfer(0, 193, 0, 0, null, 0, 100);
        }
    }

    public void o() {
        if (this.f9471n == null) {
            b bVar = new b();
            this.f9471n = bVar;
            bVar.start();
        }
        if (this.f9470m == null) {
            n();
            i(true);
            c cVar = new c();
            this.f9470m = cVar;
            cVar.start();
        }
    }

    public int p(byte[] bArr) {
        return this.f9465h.bulkTransfer(this.f9467j, bArr, bArr.length, 10);
    }

    public int q(byte b4) {
        byte[] bArr = new byte[512];
        bArr[24] = b4;
        return this.f9465h.bulkTransfer(this.f9467j, bArr, 512, 10);
    }

    public void r(int i4) {
        synchronized (this.f9472o) {
            this.f9473p = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0004 A[PHI: r0
      0x0004: PHI (r0v3 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0002, B:6:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(int r2) {
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
            n2.ma$c r0 = r1.f9470m
            if (r0 == 0) goto L12
            r0.c(r2)
        L12:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.ma.s(int):void");
    }

    public void t() {
        c cVar = this.f9470m;
        if (cVar != null) {
            cVar.a();
            this.f9470m = null;
            i(false);
        }
        b bVar = this.f9471n;
        if (bVar != null) {
            bVar.a();
            this.f9471n = null;
        }
    }

    public void u(byte[] bArr) {
        UsbDeviceConnection usbDeviceConnection = this.f9465h;
        if (usbDeviceConnection == null || bArr == null || bArr.length != 32) {
            return;
        }
        usbDeviceConnection.controlTransfer(0, JPEG.SOF5, 0, 0, bArr, 32, 100);
    }
}
