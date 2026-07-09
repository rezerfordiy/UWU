package z1;

import android.hardware.usb.UsbDevice;
import java.util.List;
import o2.b;
import z1.m0;

/* JADX INFO: loaded from: classes.dex */
public class r7 implements i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13837a = s0.a.f11071l;

    public final String a(UsbDevice usbDevice) {
        StringBuilder sb;
        String str;
        int vendorId = usbDevice.getVendorId();
        int productId = usbDevice.getProductId();
        String strJ = o2.b.j();
        String strK = o2.b.k();
        String strSubstring = (strK.isEmpty() || strK.length() <= 3) ? "BGCA001" : strK.substring(3);
        String str2 = strJ + " " + strSubstring;
        if (vendorId == 1204 && productId == 48129) {
            sb = new StringBuilder();
            str = "UL-1C";
        } else if (vendorId == 1204 && productId == 48140) {
            sb = new StringBuilder();
            str = "US-1C";
        } else if (vendorId == 1204 && productId == 48156) {
            sb = new StringBuilder();
            str = "UX-1C";
        } else {
            if (vendorId != 1204 || productId != 48136) {
                return str2;
            }
            sb = new StringBuilder();
            str = "UW-1C";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(strSubstring);
        return sb.toString();
    }

    @Override // z1.i6
    public void b() {
        this.f13837a = s0.a.f11071l;
    }

    @Override // z1.i6
    public m0 c(List<String> list, m0 m0Var, boolean z3, boolean z4) {
        b.a aVarH;
        m0 m0Var2 = m0.f13621f;
        if (z4 || (aVarH = o2.b.g(null).h()) == null) {
            return m0Var2;
        }
        String strA = a(aVarH.f9938a);
        String string = m0.c.USB.toString();
        String strSubstring = strA.substring(0, strA.indexOf(" "));
        if (!list.contains(strSubstring)) {
            return m0Var2;
        }
        m0 m0VarC = m0.c(strA, string, m0.b.USB.toString(), strSubstring);
        this.f13837a = aVarH.f9940c;
        return m0VarC;
    }
}
