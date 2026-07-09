package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {

    @j0
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k0
    public final Intent f697b;

    public class a implements Parcelable.Creator<ActivityResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResult createFromParcel(@j0 Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult[] newArray(int i4) {
            return new ActivityResult[i4];
        }
    }

    public ActivityResult(int i4, @k0 Intent intent) {
        this.f696a = i4;
        this.f697b = intent;
    }

    @j0
    public static String c(int i4) {
        return i4 != -1 ? i4 != 0 ? String.valueOf(i4) : "RESULT_CANCELED" : "RESULT_OK";
    }

    @k0
    public Intent a() {
        return this.f697b;
    }

    public int b() {
        return this.f696a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f696a) + ", data=" + this.f697b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@j0 Parcel parcel, int i4) {
        parcel.writeInt(this.f696a);
        parcel.writeInt(this.f697b == null ? 0 : 1);
        Intent intent = this.f697b;
        if (intent != null) {
            intent.writeToParcel(parcel, i4);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f696a = parcel.readInt();
        this.f697b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
