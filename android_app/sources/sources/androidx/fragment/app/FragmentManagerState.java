package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<FragmentState> f3745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<String> f3746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BackStackState[] f3747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<String> f3750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<Bundle> f3751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f3752h;

    public class a implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i4) {
            return new FragmentManagerState[i4];
        }
    }

    public FragmentManagerState() {
        this.f3749e = null;
        this.f3750f = new ArrayList<>();
        this.f3751g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeTypedList(this.f3745a);
        parcel.writeStringList(this.f3746b);
        parcel.writeTypedArray(this.f3747c, i4);
        parcel.writeInt(this.f3748d);
        parcel.writeString(this.f3749e);
        parcel.writeStringList(this.f3750f);
        parcel.writeTypedList(this.f3751g);
        parcel.writeTypedList(this.f3752h);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f3749e = null;
        this.f3750f = new ArrayList<>();
        this.f3751g = new ArrayList<>();
        this.f3745a = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f3746b = parcel.createStringArrayList();
        this.f3747c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f3748d = parcel.readInt();
        this.f3749e = parcel.readString();
        this.f3750f = parcel.createStringArrayList();
        this.f3751g = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f3752h = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
