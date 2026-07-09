package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f3527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbsSavedState f3526b = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new a();

    public static class a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f3526b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbsSavedState[] newArray(int i4) {
            return new AbsSavedState[i4];
        }
    }

    public AbsSavedState() {
        this.f3527a = null;
    }

    @k0
    public final Parcelable a() {
        return this.f3527a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f3527a, i4);
    }

    public AbsSavedState(@j0 Parcel parcel) {
        this(parcel, null);
    }

    public AbsSavedState(@j0 Parcel parcel, @k0 ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f3527a = parcelable == null ? f3526b : parcelable;
    }

    public AbsSavedState(@j0 Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f3527a = parcelable == f3526b ? null : parcelable;
    }
}
