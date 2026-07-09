package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {

    @j0
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @j0
    public final IntentSender f729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k0
    public final Intent f730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f732d;

    public class a implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i4) {
            return new IntentSenderRequest[i4];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public IntentSender f733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Intent f734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f736d;

        public b(@j0 PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }

        @j0
        public IntentSenderRequest a() {
            return new IntentSenderRequest(this.f733a, this.f734b, this.f735c, this.f736d);
        }

        @j0
        public b b(@k0 Intent intent) {
            this.f734b = intent;
            return this;
        }

        @j0
        public b c(int i4, int i5) {
            this.f736d = i4;
            this.f735c = i5;
            return this;
        }

        public b(@j0 IntentSender intentSender) {
            this.f733a = intentSender;
        }
    }

    public IntentSenderRequest(@j0 IntentSender intentSender, @k0 Intent intent, int i4, int i5) {
        this.f729a = intentSender;
        this.f730b = intent;
        this.f731c = i4;
        this.f732d = i5;
    }

    @k0
    public Intent a() {
        return this.f730b;
    }

    public int b() {
        return this.f731c;
    }

    public int c() {
        return this.f732d;
    }

    @j0
    public IntentSender d() {
        return this.f729a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@j0 Parcel parcel, int i4) {
        parcel.writeParcelable(this.f729a, i4);
        parcel.writeParcelable(this.f730b, i4);
        parcel.writeInt(this.f731c);
        parcel.writeInt(this.f732d);
    }

    public IntentSenderRequest(@j0 Parcel parcel) {
        this.f729a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f730b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f731c = parcel.readInt();
        this.f732d = parcel.readInt();
    }
}
