package z1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static h f13285d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f13287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f13288c;

    public interface b {
        void a(byte[] bArr);
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DatagramSocket f13289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Date f13290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f13291d;

        public c() {
            this.f13290c = new Date();
            this.f13291d = false;
        }

        public void a() {
            this.f13291d = true;
            DatagramSocket datagramSocket = this.f13289b;
            if (datagramSocket != null) {
                datagramSocket.close();
                this.f13289b = null;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            DatagramSocket datagramSocket = this.f13289b;
            if (datagramSocket != null) {
                datagramSocket.close();
                this.f13289b = null;
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                }
            }
            try {
                DatagramSocket datagramSocket2 = new DatagramSocket(h.this.f13286a);
                this.f13289b = datagramSocket2;
                datagramSocket2.setSoTimeout(500);
            } catch (SocketException e5) {
                e5.printStackTrace();
            }
            while (!this.f13291d) {
                byte[] bArr = new byte[1024];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 1024);
                boolean z3 = false;
                try {
                    DatagramSocket datagramSocket3 = this.f13289b;
                    if (datagramSocket3 != null) {
                        datagramSocket3.receive(datagramPacket);
                        z3 = true;
                    }
                } catch (IOException unused) {
                }
                if (z3) {
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, datagramPacket.getLength());
                    if (h.this.f13288c != null) {
                        h.this.f13288c.a(bArrCopyOf);
                    }
                    this.f13290c = new Date();
                } else if (System.currentTimeMillis() - this.f13290c.getTime() > androidx.appcompat.widget.i1.f1744n && h.this.f13288c != null) {
                    h.this.f13288c.a(null);
                }
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e6) {
                    e6.printStackTrace();
                }
            }
        }
    }

    public h(b bVar) {
        this.f13288c = bVar;
    }

    public static h e(b bVar) {
        if (f13285d == null) {
            f13285d = new h(bVar);
        }
        return f13285d;
    }

    public void c() {
        if (this.f13287b == null) {
            c cVar = new c();
            this.f13287b = cVar;
            cVar.start();
        }
    }

    public void d(int i4) {
        this.f13286a = i4;
    }

    public void f() {
        c cVar = this.f13287b;
        if (cVar != null) {
            cVar.a();
            this.f13287b = null;
        }
    }
}
