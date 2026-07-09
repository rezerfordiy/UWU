package o2;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbManager;
import androidx.appcompat.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f9924l = 192;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f9925m = 196;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static b f9926n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f9927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, UsbDevice> f9928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public UsbManager f9929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f9930d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f9932f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f9935i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<d> f9931e = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9933g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9934h = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PendingIntent f9936j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<InterfaceC0091b> f9937k = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public UsbDevice f9938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public UsbDeviceConnection f9939b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9940c;
    }

    /* JADX INFO: renamed from: o2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0091b {
        void c();

        void d();
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (this) {
                int i4 = 0;
                if (intent.getAction().equals("android.hardware.usb.action.USB_DEVICE_DETACHED")) {
                    while (i4 < b.this.f9937k.size()) {
                        ((InterfaceC0091b) b.this.f9937k.get(i4)).c();
                        i4++;
                    }
                } else if (intent.getAction().equals("android.hardware.usb.action.USB_DEVICE_ATTACHED")) {
                    while (i4 < b.this.f9937k.size()) {
                        ((InterfaceC0091b) b.this.f9937k.get(i4)).d();
                        i4++;
                    }
                }
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9943b;
    }

    public b(Context context) {
        this.f9927a = context;
        m();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.setPriority(ActivityChooserView.f.f1331h);
        c cVar = new c();
        this.f9935i = cVar;
        this.f9927a.registerReceiver(cVar, intentFilter);
    }

    public static b g(Context context) {
        if (f9926n == null && context != null) {
            f9926n = new b(context);
        }
        return f9926n;
    }

    public static String j() {
        b bVarG = g(null);
        String str = s0.a.f11071l;
        if (bVarG == null) {
            return s0.a.f11071l;
        }
        a aVarH = g(null).h();
        if (aVarH != null) {
            byte[] bArr = new byte[16];
            aVarH.f9939b.controlTransfer(128, 192, 0, 0, bArr, 16, 100);
            for (int i4 = 0; i4 < 16; i4++) {
                if (bArr[i4] != 0) {
                    str = str + ((char) bArr[i4]);
                }
            }
        }
        return str;
    }

    public static String k() {
        b bVarG = g(null);
        String str = s0.a.f11071l;
        if (bVarG == null) {
            return s0.a.f11071l;
        }
        a aVarH = g(null).h();
        byte[] bArr = new byte[16];
        if (aVarH != null) {
            aVarH.f9939b.controlTransfer(128, 196, 0, 0, bArr, 16, 100);
            for (int i4 = 0; i4 < 16; i4++) {
                byte b4 = bArr[i4];
                if ((b4 < 48 || b4 > 57) && (b4 < 65 || b4 > 90)) {
                    break;
                }
                str = str + ((char) bArr[i4]);
            }
        }
        return str;
    }

    public void b(d dVar) {
        this.f9931e.add(dVar);
    }

    public boolean c(String str) {
        UsbDeviceConnection usbDeviceConnectionOpenDevice;
        a aVar;
        if (str == null) {
            return false;
        }
        if (this.f9936j == null) {
            this.f9936j = PendingIntent.getBroadcast(this.f9927a, 0, new Intent("com.sonoptek.USB_PERMISSION"), 67108864);
        }
        for (String str2 : this.f9928b.keySet()) {
            if (str.equals(str2)) {
                this.f9932f = str;
                UsbDevice usbDevice = this.f9928b.get(str2);
                if (this.f9934h) {
                    if (this.f9929c.hasPermission(usbDevice)) {
                        usbDeviceConnectionOpenDevice = this.f9929c.openDevice(usbDevice);
                        aVar = new a();
                        this.f9930d = aVar;
                        aVar.f9940c = str2;
                        aVar.f9938a = usbDevice;
                        aVar.f9939b = usbDeviceConnectionOpenDevice;
                        this.f9936j.cancel();
                        this.f9936j = null;
                        return true;
                    }
                    this.f9929c.requestPermission(usbDevice, this.f9936j);
                } else if (this.f9929c.hasPermission(usbDevice)) {
                    usbDeviceConnectionOpenDevice = this.f9929c.openDevice(usbDevice);
                    aVar = new a();
                    this.f9930d = aVar;
                    aVar.f9940c = str2;
                    aVar.f9938a = usbDevice;
                    aVar.f9939b = usbDeviceConnectionOpenDevice;
                    this.f9936j.cancel();
                    this.f9936j = null;
                    return true;
                }
            }
        }
        return false;
    }

    public synchronized void d(InterfaceC0091b interfaceC0091b) {
        this.f9937k.remove(interfaceC0091b);
    }

    public void e() {
        a aVar = this.f9930d;
        if (aVar != null) {
            aVar.f9939b.close();
        }
        this.f9930d = null;
        this.f9932f = null;
    }

    public void f() {
        c cVar = this.f9935i;
        if (cVar != null) {
            this.f9927a.unregisterReceiver(cVar);
        }
        f9926n = null;
        this.f9927a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o2.b.a h() {
        /*
            r9 = this;
            r9.m()
            java.util.Map<java.lang.String, android.hardware.usb.UsbDevice> r0 = r9.f9928b
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L11
        Ld:
            r9.f9930d = r1
            goto L7d
        L11:
            o2.b$a r0 = r9.f9930d
            if (r0 != 0) goto L72
            java.util.Map<java.lang.String, android.hardware.usb.UsbDevice> r0 = r9.f9928b
            java.lang.String r3 = r9.f9932f
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L25
            java.lang.String r0 = r9.f9932f
            r9.c(r0)
            goto L71
        L25:
            boolean r0 = r9.f9933g
            if (r0 == 0) goto L71
            java.util.Map<java.lang.String, android.hardware.usb.UsbDevice> r0 = r9.f9928b
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L71
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, android.hardware.usb.UsbDevice> r4 = r9.f9928b
            java.lang.Object r4 = r4.get(r3)
            android.hardware.usb.UsbDevice r4 = (android.hardware.usb.UsbDevice) r4
            java.util.List<o2.b$d> r5 = r9.f9931e
            java.util.Iterator r5 = r5.iterator()
        L4d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6e
            java.lang.Object r6 = r5.next()
            o2.b$d r6 = (o2.b.d) r6
            int r7 = r6.f9942a
            int r8 = r4.getVendorId()
            if (r7 != r8) goto L4d
            int r6 = r6.f9943b
            int r7 = r4.getProductId()
            if (r6 != r7) goto L4d
            r9.c(r3)
            r3 = r2
            goto L6f
        L6e:
            r3 = 0
        L6f:
            if (r3 == 0) goto L33
        L71:
            return r1
        L72:
            java.util.Map<java.lang.String, android.hardware.usb.UsbDevice> r2 = r9.f9928b
            java.lang.String r0 = r0.f9940c
            boolean r0 = r2.containsKey(r0)
            if (r0 != 0) goto L7d
            goto Ld
        L7d:
            o2.b$a r0 = r9.f9930d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.b.h():o2.b$a");
    }

    public Map<String, UsbDevice> i() {
        return this.f9928b;
    }

    public void l(InterfaceC0091b interfaceC0091b) {
        this.f9937k.add(interfaceC0091b);
    }

    public int m() {
        UsbManager usbManager = (UsbManager) this.f9927a.getSystemService("usb");
        this.f9929c = usbManager;
        HashMap<String, UsbDevice> deviceList = usbManager.getDeviceList();
        this.f9928b = deviceList;
        return deviceList.size();
    }

    public void n(boolean z3) {
        this.f9933g = z3;
    }

    public void o(boolean z3) {
        this.f9934h = z3;
    }
}
