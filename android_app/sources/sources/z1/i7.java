package z1;

import android.content.Context;
import android.net.wifi.WifiManager;
import java.util.Date;
import java.util.List;
import z1.h;
import z1.m0;

/* JADX INFO: loaded from: classes.dex */
public class i7 implements i6, h.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ boolean f13339j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f13340a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13344e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f13348i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13341b = s0.a.f11071l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13342c = s0.a.f11071l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13343d = s0.a.f11071l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Date f13345f = new Date();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m0 f13346g = m0.f13621f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13347h = false;

    public i7(Context context) {
        this.f13348i = context;
    }

    @Override // z1.h.b
    public void a(byte[] bArr) {
        Date date;
        if (f(bArr)) {
            int i4 = bArr[7] & 255;
            if (i4 == 128) {
                byte[] bArr2 = new byte[16];
                System.arraycopy(bArr, 16, bArr2, 0, 16);
                this.f13342c = e(bArr2);
                byte[] bArr3 = new byte[24];
                System.arraycopy(bArr, 32, bArr3, 0, 24);
                this.f13341b = e(bArr3);
                date = new Date();
            } else {
                if (i4 != 0) {
                    if (i4 == 129) {
                        byte[] bArr4 = new byte[16];
                        System.arraycopy(bArr, 16, bArr4, 0, 16);
                        this.f13342c = e(bArr4);
                        byte[] bArr5 = new byte[24];
                        System.arraycopy(bArr, 32, bArr5, 0, 24);
                        this.f13341b = e(bArr5);
                        byte[] bArr6 = new byte[6];
                        System.arraycopy(bArr, 8, bArr6, 0, 6);
                        this.f13343d = h(bArr6);
                        date = new Date();
                    }
                    this.f13340a.f();
                }
                this.f13344e = bArr[11] & 255;
                byte[] bArr7 = new byte[16];
                System.arraycopy(bArr, 48, bArr7, 0, 16);
                this.f13342c = e(bArr7);
                byte[] bArr8 = new byte[32];
                System.arraycopy(bArr, 64, bArr8, 0, 32);
                this.f13341b = e(bArr8);
                date = new Date();
            }
            this.f13345f = date;
            this.f13340a.f();
        }
    }

    @Override // z1.i6
    public void b() {
        h hVar = this.f13340a;
        if (hVar != null) {
            hVar.f();
        }
    }

    @Override // z1.i6
    public m0 c(List<String> list, m0 m0Var, boolean z3, boolean z4) {
        j();
        m0 m0Var2 = m0.f13621f;
        return (m0Var == m0Var2 || !z4) ? i(list) : m0Var2;
    }

    public final void d() {
        k().d(52012);
        k().c();
    }

    public final String e(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b4 : bArr) {
            if (b4 != 0) {
                sb.append((char) b4);
            }
        }
        return sb.toString();
    }

    public final boolean f(byte[] bArr) {
        if (bArr != null && (bArr[0] == 85 || bArr[1] == -86 || bArr[2] == -1 || bArr[3] == 0)) {
            int i4 = 0;
            for (int i5 = 0; i5 < bArr.length - 1; i5++) {
                i4 += bArr[i5] & 255;
            }
            if ((((byte) i4) & 255) == 0) {
                return true;
            }
        }
        return false;
    }

    public final synchronized String g() {
        Context context = this.f13348i;
        if (context == null) {
            return s0.a.f11071l;
        }
        return ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getSSID().replace("\"", s0.a.f11071l);
    }

    public final String h(byte[] bArr) {
        return s0.a.f11071l;
    }

    public final m0 i(List<String> list) {
        String strG = this.f13341b;
        String string = m0.c.UDP.toString();
        String str = this.f13343d;
        if (strG.length() == 0) {
            strG = g();
            string = m0.c.SSID.toString();
        }
        int iIndexOf = strG.indexOf(" ");
        String strSubstring = iIndexOf > 0 ? strG.substring(0, iIndexOf) : s0.a.f11071l;
        if (!list.contains(strSubstring)) {
            return m0.f13621f;
        }
        String string2 = m0.b.WIFI_AP.toString();
        if (this.f13344e == 2) {
            string2 = m0.b.WIFI_DIRECT.toString();
        }
        return (str == null || str.length() <= 0) ? strG.length() > 0 ? m0.c(strG, string, string2, strSubstring) : m0.f13621f : m0.d(strG, string, string2, strSubstring, str);
    }

    public final void j() {
        d();
    }

    public final h k() {
        if (this.f13340a == null) {
            h hVarE = h.e(this);
            this.f13340a = hVarE;
            hVarE.d(52012);
        }
        return this.f13340a;
    }
}
