package k2;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.appcompat.widget.i1;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import o2.b;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f8366i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f8367j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static b f8368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ boolean f8369l = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f8370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f8371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f8372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0071b f8373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f8374e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f8375f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f8376g = s0.a.f11071l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f8377h = s0.a.f11071l;

    /* JADX INFO: renamed from: k2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0071b {
        void a(int i4);
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DatagramSocket f8378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Date f8379c = new Date();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f8380d = false;

        public c() {
            try {
                this.f8378b = new DatagramSocket();
            } catch (SocketException e4) {
                e4.printStackTrace();
            }
        }

        public synchronized void a() {
            this.f8380d = true;
            DatagramSocket datagramSocket = this.f8378b;
            if (datagramSocket != null) {
                datagramSocket.disconnect();
                this.f8378b.close();
                this.f8378b = null;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z3;
            super.run();
            DatagramSocket datagramSocket = this.f8378b;
            if (datagramSocket != null) {
                datagramSocket.close();
                this.f8378b = null;
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                }
            }
            while (!this.f8380d) {
                byte[] bArr = new byte[1024];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 1024);
                try {
                    if (this.f8378b == null) {
                        DatagramSocket datagramSocket2 = new DatagramSocket(52012);
                        this.f8378b = datagramSocket2;
                        datagramSocket2.setSoTimeout(500);
                    }
                    this.f8378b.receive(datagramPacket);
                    z3 = true;
                } catch (IOException unused) {
                    z3 = false;
                }
                if (z3) {
                    b.this.p(Arrays.copyOf(bArr, datagramPacket.getLength()));
                    this.f8379c = new Date();
                } else if (System.currentTimeMillis() - this.f8379c.getTime() > i1.f1744n) {
                    b bVar = b.this;
                    bVar.f8376g = s0.a.f11071l;
                    bVar.f8377h = s0.a.f11071l;
                }
            }
        }
    }

    public class d extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f8383c;

        public d() {
            this.f8382b = true;
            this.f8383c = s0.a.f11071l;
        }

        public void a() {
            this.f8382b = false;
            if (b.this.f8375f != null) {
                b.this.f8375f.a();
                b.this.f8375f = null;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            String strJ;
            int iIndexOf;
            if (b.this.f8375f == null) {
                b bVar = b.this;
                bVar.f8375f = bVar.new c();
                b.this.f8375f.start();
            }
            while (this.f8382b) {
                try {
                    Thread.sleep(1000L);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                b.a aVarH = o2.b.g(b.this.f8370a).h();
                String strJ2 = aVarH != null ? o2.b.j() : null;
                if (strJ2 == null && (iIndexOf = (strJ = b.this.j()).indexOf(" ")) > 0) {
                    strJ2 = strJ.substring(0, iIndexOf);
                }
                if (strJ2 != null) {
                    if (b.this.f8372c.contains(strJ2)) {
                        if (b.this.f8373d != null) {
                            b.this.m(false);
                            b.this.f8373d.a(2);
                        }
                    } else if (b.this.f8371b.contains(strJ2)) {
                        if (b.this.f8373d != null) {
                            b.this.m(false);
                            if (!b.this.f8376g.isEmpty()) {
                                try {
                                    Thread.sleep(500L);
                                } catch (InterruptedException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            b.this.f8373d.a(1);
                        }
                    } else if (aVarH != null && b.this.f8373d != null) {
                        b.this.m(false);
                        b.this.f8373d.a(1);
                    }
                }
            }
        }
    }

    public b(Context context) {
        this.f8370a = context;
    }

    public static b n(Context context) {
        if (context != null && f8368k == null) {
            f8368k = new b(context);
        }
        return f8368k;
    }

    public final String i(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b4 : bArr) {
            if (b4 != 0) {
                sb.append((char) b4);
            }
        }
        return sb.toString();
    }

    public String j() {
        if (this.f8370a == null) {
            return s0.a.f11071l;
        }
        String strK = k();
        return !strK.isEmpty() ? strK : l();
    }

    public String k() {
        return this.f8376g;
    }

    public final String l() {
        return ((WifiManager) this.f8370a.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getSSID().replace("\"", s0.a.f11071l);
    }

    public void m(boolean z3) {
        this.f8376g = s0.a.f11071l;
        this.f8377h = s0.a.f11071l;
        if (z3) {
            if (this.f8374e == null) {
                d dVar = new d();
                this.f8374e = dVar;
                dVar.start();
                return;
            }
            return;
        }
        d dVar2 = this.f8374e;
        if (dVar2 != null) {
            dVar2.a();
            this.f8374e = null;
        }
        c cVar = this.f8375f;
        if (cVar != null) {
            cVar.a();
            this.f8375f = null;
        }
    }

    public void o(InterfaceC0071b interfaceC0071b) {
        this.f8373d = interfaceC0071b;
    }

    public final void p(byte[] bArr) {
        String strI;
        if (bArr[0] == 85 || bArr[1] == -86 || bArr[2] == -1 || bArr[3] == 0) {
            for (int i4 = 0; i4 < bArr.length - 1; i4++) {
                byte b4 = bArr[i4];
            }
            int i5 = bArr[7] & 255;
            if (i5 == 0) {
                byte b5 = bArr[8];
                byte b6 = bArr[11];
                byte b7 = bArr[12];
                byte[] bArr2 = new byte[16];
                System.arraycopy(bArr, 16, bArr2, 0, 16);
                i(bArr2);
                byte[] bArr3 = new byte[16];
                System.arraycopy(bArr, 32, bArr3, 0, 16);
                i(bArr3);
                byte[] bArr4 = new byte[16];
                System.arraycopy(bArr, 48, bArr4, 0, 16);
                this.f8377h = i(bArr4);
                byte[] bArr5 = new byte[32];
                System.arraycopy(bArr, 64, bArr5, 0, 32);
                strI = i(bArr5);
            } else {
                if (i5 != 128) {
                    if (i5 == 129) {
                        byte[] bArr6 = new byte[16];
                        System.arraycopy(bArr, 16, bArr6, 0, 16);
                        this.f8377h = i(bArr6);
                        byte[] bArr7 = new byte[24];
                        System.arraycopy(bArr, 32, bArr7, 0, 24);
                        this.f8376g = i(bArr7);
                        System.arraycopy(bArr, 8, new byte[6], 0, 6);
                        return;
                    }
                    return;
                }
                byte[] bArr8 = new byte[16];
                System.arraycopy(bArr, 16, bArr8, 0, 16);
                this.f8377h = i(bArr8);
                byte[] bArr9 = new byte[24];
                System.arraycopy(bArr, 32, bArr9, 0, 24);
                strI = i(bArr9);
            }
            this.f8376g = strI;
        }
    }

    public void q(List list) {
        this.f8372c = list;
    }

    public void r(List list) {
        this.f8371b = list;
    }
}
