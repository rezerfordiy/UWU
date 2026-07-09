package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.v;
import androidx.lifecycle.i;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f3582o = "FragmentManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f3583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<String> f3584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f3585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f3586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f3591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CharSequence f3593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<String> f3594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList<String> f3595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f3596n;

    public class a implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i4) {
            return new BackStackState[i4];
        }
    }

    public BackStackState(Parcel parcel) {
        this.f3583a = parcel.createIntArray();
        this.f3584b = parcel.createStringArrayList();
        this.f3585c = parcel.createIntArray();
        this.f3586d = parcel.createIntArray();
        this.f3587e = parcel.readInt();
        this.f3588f = parcel.readString();
        this.f3589g = parcel.readInt();
        this.f3590h = parcel.readInt();
        this.f3591i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3592j = parcel.readInt();
        this.f3593k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3594l = parcel.createStringArrayList();
        this.f3595m = parcel.createStringArrayList();
        this.f3596n = parcel.readInt() != 0;
    }

    public androidx.fragment.app.a a(FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.f3583a.length) {
            v.a aVar2 = new v.a();
            int i6 = i4 + 1;
            aVar2.f3999a = this.f3583a[i4];
            if (FragmentManager.T0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i5 + " base fragment #" + this.f3583a[i6]);
            }
            String str = this.f3584b.get(i5);
            aVar2.f4000b = str != null ? fragmentManager.n0(str) : null;
            aVar2.f4005g = i.c.values()[this.f3585c[i5]];
            aVar2.f4006h = i.c.values()[this.f3586d[i5]];
            int[] iArr = this.f3583a;
            int i7 = i6 + 1;
            int i8 = iArr[i6];
            aVar2.f4001c = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            aVar2.f4002d = i10;
            int i11 = i9 + 1;
            int i12 = iArr[i9];
            aVar2.f4003e = i12;
            int i13 = iArr[i11];
            aVar2.f4004f = i13;
            aVar.f3983d = i8;
            aVar.f3984e = i10;
            aVar.f3985f = i12;
            aVar.f3986g = i13;
            aVar.n(aVar2);
            i5++;
            i4 = i11 + 1;
        }
        aVar.f3987h = this.f3587e;
        aVar.f3990k = this.f3588f;
        aVar.N = this.f3589g;
        aVar.f3988i = true;
        aVar.f3991l = this.f3590h;
        aVar.f3992m = this.f3591i;
        aVar.f3993n = this.f3592j;
        aVar.f3994o = this.f3593k;
        aVar.f3995p = this.f3594l;
        aVar.f3996q = this.f3595m;
        aVar.f3997r = this.f3596n;
        aVar.V(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeIntArray(this.f3583a);
        parcel.writeStringList(this.f3584b);
        parcel.writeIntArray(this.f3585c);
        parcel.writeIntArray(this.f3586d);
        parcel.writeInt(this.f3587e);
        parcel.writeString(this.f3588f);
        parcel.writeInt(this.f3589g);
        parcel.writeInt(this.f3590h);
        TextUtils.writeToParcel(this.f3591i, parcel, 0);
        parcel.writeInt(this.f3592j);
        TextUtils.writeToParcel(this.f3593k, parcel, 0);
        parcel.writeStringList(this.f3594l);
        parcel.writeStringList(this.f3595m);
        parcel.writeInt(this.f3596n ? 1 : 0);
    }

    public BackStackState(androidx.fragment.app.a aVar) {
        int size = aVar.f3982c.size();
        this.f3583a = new int[size * 5];
        if (!aVar.f3988i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f3584b = new ArrayList<>(size);
        this.f3585c = new int[size];
        this.f3586d = new int[size];
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            v.a aVar2 = aVar.f3982c.get(i4);
            int i6 = i5 + 1;
            this.f3583a[i5] = aVar2.f3999a;
            ArrayList<String> arrayList = this.f3584b;
            Fragment fragment = aVar2.f4000b;
            arrayList.add(fragment != null ? fragment.f3613g : null);
            int[] iArr = this.f3583a;
            int i7 = i6 + 1;
            iArr[i6] = aVar2.f4001c;
            int i8 = i7 + 1;
            iArr[i7] = aVar2.f4002d;
            int i9 = i8 + 1;
            iArr[i8] = aVar2.f4003e;
            iArr[i9] = aVar2.f4004f;
            this.f3585c[i4] = aVar2.f4005g.ordinal();
            this.f3586d[i4] = aVar2.f4006h.ordinal();
            i4++;
            i5 = i9 + 1;
        }
        this.f3587e = aVar.f3987h;
        this.f3588f = aVar.f3990k;
        this.f3589g = aVar.N;
        this.f3590h = aVar.f3991l;
        this.f3591i = aVar.f3992m;
        this.f3592j = aVar.f3993n;
        this.f3593k = aVar.f3994o;
        this.f3594l = aVar.f3995p;
        this.f3595m = aVar.f3996q;
        this.f3596n = aVar.f3997r;
    }
}
