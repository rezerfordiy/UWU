package p0;

import android.os.Parcel;
import c.j0;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static boolean a(@j0 Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void b(@j0 Parcel parcel, boolean z3) {
        parcel.writeInt(z3 ? 1 : 0);
    }
}
