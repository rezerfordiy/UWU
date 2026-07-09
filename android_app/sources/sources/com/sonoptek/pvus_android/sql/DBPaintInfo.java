package com.sonoptek.pvus_android.sql;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class DBPaintInfo implements Parcelable {
    public static final Parcelable.Creator<DBPaintInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f6195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f6197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f6199k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6200l;

    public class a implements Parcelable.Creator<DBPaintInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBPaintInfo createFromParcel(Parcel parcel) {
            return new DBPaintInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBPaintInfo[] newArray(int i4) {
            return new DBPaintInfo[i4];
        }
    }

    public DBPaintInfo() {
        this.f6199k = s0.a.f11071l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f6189a);
        parcel.writeString(this.f6190b);
        parcel.writeString(this.f6191c);
        parcel.writeInt(this.f6192d);
        parcel.writeInt(this.f6193e);
        parcel.writeString(this.f6194f);
        parcel.writeString(this.f6195g);
        parcel.writeInt(this.f6196h);
        parcel.writeString(this.f6197i);
        parcel.writeByte(this.f6198j ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f6199k);
        parcel.writeLong(this.f6200l);
    }

    public DBPaintInfo(Parcel parcel) {
        this.f6199k = s0.a.f11071l;
        this.f6189a = parcel.readInt();
        this.f6190b = parcel.readString();
        this.f6191c = parcel.readString();
        this.f6192d = parcel.readInt();
        this.f6193e = parcel.readInt();
        this.f6194f = parcel.readString();
        this.f6195g = parcel.readString();
        this.f6196h = parcel.readInt();
        this.f6197i = parcel.readString();
        this.f6198j = parcel.readByte() != 0;
        this.f6199k = parcel.readString();
        this.f6200l = parcel.readLong();
    }
}
