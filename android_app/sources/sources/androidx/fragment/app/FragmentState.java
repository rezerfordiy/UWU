package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c.j0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Bundle f3762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f3763k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3764l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bundle f3765m;

    public class a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i4) {
            return new FragmentState[i4];
        }
    }

    public FragmentState(Parcel parcel) {
        this.f3753a = parcel.readString();
        this.f3754b = parcel.readString();
        this.f3755c = parcel.readInt() != 0;
        this.f3756d = parcel.readInt();
        this.f3757e = parcel.readInt();
        this.f3758f = parcel.readString();
        this.f3759g = parcel.readInt() != 0;
        this.f3760h = parcel.readInt() != 0;
        this.f3761i = parcel.readInt() != 0;
        this.f3762j = parcel.readBundle();
        this.f3763k = parcel.readInt() != 0;
        this.f3765m = parcel.readBundle();
        this.f3764l = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @j0
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3753a);
        sb.append(" (");
        sb.append(this.f3754b);
        sb.append(")}:");
        if (this.f3755c) {
            sb.append(" fromLayout");
        }
        if (this.f3757e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3757e));
        }
        String str = this.f3758f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3758f);
        }
        if (this.f3759g) {
            sb.append(" retainInstance");
        }
        if (this.f3760h) {
            sb.append(" removing");
        }
        if (this.f3761i) {
            sb.append(" detached");
        }
        if (this.f3763k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f3753a);
        parcel.writeString(this.f3754b);
        parcel.writeInt(this.f3755c ? 1 : 0);
        parcel.writeInt(this.f3756d);
        parcel.writeInt(this.f3757e);
        parcel.writeString(this.f3758f);
        parcel.writeInt(this.f3759g ? 1 : 0);
        parcel.writeInt(this.f3760h ? 1 : 0);
        parcel.writeInt(this.f3761i ? 1 : 0);
        parcel.writeBundle(this.f3762j);
        parcel.writeInt(this.f3763k ? 1 : 0);
        parcel.writeBundle(this.f3765m);
        parcel.writeInt(this.f3764l);
    }

    public FragmentState(Fragment fragment) {
        this.f3753a = fragment.getClass().getName();
        this.f3754b = fragment.f3613g;
        this.f3755c = fragment.f3621o;
        this.f3756d = fragment.f3630x;
        this.f3757e = fragment.f3631y;
        this.f3758f = fragment.f3632z;
        this.f3759g = fragment.C;
        this.f3760h = fragment.f3620n;
        this.f3761i = fragment.B;
        this.f3762j = fragment.f3614h;
        this.f3763k = fragment.A;
        this.f3764l = fragment.S.ordinal();
    }
}
