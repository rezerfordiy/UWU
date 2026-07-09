package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import c.r0;
import t1.e;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY})
public class IconCompatParcelizer {
    public static IconCompat read(e eVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3410a = eVar.M(iconCompat.f3410a, 1);
        iconCompat.f3412c = eVar.t(iconCompat.f3412c, 2);
        iconCompat.f3413d = eVar.W(iconCompat.f3413d, 3);
        iconCompat.f3414e = eVar.M(iconCompat.f3414e, 4);
        iconCompat.f3415f = eVar.M(iconCompat.f3415f, 5);
        iconCompat.f3416g = (ColorStateList) eVar.W(iconCompat.f3416g, 6);
        iconCompat.f3418i = eVar.d0(iconCompat.f3418i, 7);
        iconCompat.f3419j = eVar.d0(iconCompat.f3419j, 8);
        iconCompat.a();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, e eVar) {
        eVar.j0(true, true);
        iconCompat.b(eVar.i());
        int i4 = iconCompat.f3410a;
        if (-1 != i4) {
            eVar.M0(i4, 1);
        }
        byte[] bArr = iconCompat.f3412c;
        if (bArr != null) {
            eVar.u0(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3413d;
        if (parcelable != null) {
            eVar.X0(parcelable, 3);
        }
        int i5 = iconCompat.f3414e;
        if (i5 != 0) {
            eVar.M0(i5, 4);
        }
        int i6 = iconCompat.f3415f;
        if (i6 != 0) {
            eVar.M0(i6, 5);
        }
        ColorStateList colorStateList = iconCompat.f3416g;
        if (colorStateList != null) {
            eVar.X0(colorStateList, 6);
        }
        String str = iconCompat.f3418i;
        if (str != null) {
            eVar.f1(str, 7);
        }
        String str2 = iconCompat.f3419j;
        if (str2 != null) {
            eVar.f1(str2, 8);
        }
    }
}
