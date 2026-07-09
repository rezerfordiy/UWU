package t1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import c.r0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY})
public class f extends e {
    public static final boolean B = false;
    public static final String C = "VersionedParcelParcel";
    public int A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SparseIntArray f11487t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Parcel f11488u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f11489v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f11490w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f11491x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11492y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f11493z;

    public f(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), s0.a.f11071l, new p.a(), new p.a(), new p.a());
    }

    @Override // t1.e
    public void C0(double d4) {
        this.f11488u.writeDouble(d4);
    }

    @Override // t1.e
    public boolean F(int i4) {
        while (this.f11493z < this.f11490w) {
            int i5 = this.A;
            if (i5 == i4) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i4)) > 0) {
                return false;
            }
            this.f11488u.setDataPosition(this.f11493z);
            int i6 = this.f11488u.readInt();
            this.A = this.f11488u.readInt();
            this.f11493z += i6;
        }
        return this.A == i4;
    }

    @Override // t1.e
    public float G() {
        return this.f11488u.readFloat();
    }

    @Override // t1.e
    public void H0(float f4) {
        this.f11488u.writeFloat(f4);
    }

    @Override // t1.e
    public int L() {
        return this.f11488u.readInt();
    }

    @Override // t1.e
    public void L0(int i4) {
        this.f11488u.writeInt(i4);
    }

    @Override // t1.e
    public long Q() {
        return this.f11488u.readLong();
    }

    @Override // t1.e
    public void Q0(long j4) {
        this.f11488u.writeLong(j4);
    }

    @Override // t1.e
    public <T extends Parcelable> T V() {
        return (T) this.f11488u.readParcelable(getClass().getClassLoader());
    }

    @Override // t1.e
    public void W0(Parcelable parcelable) {
        this.f11488u.writeParcelable(parcelable, 0);
    }

    @Override // t1.e
    public void a() {
        int i4 = this.f11492y;
        if (i4 >= 0) {
            int i5 = this.f11487t.get(i4);
            int iDataPosition = this.f11488u.dataPosition();
            this.f11488u.setDataPosition(i5);
            this.f11488u.writeInt(iDataPosition - i5);
            this.f11488u.setDataPosition(iDataPosition);
        }
    }

    @Override // t1.e
    public e c() {
        Parcel parcel = this.f11488u;
        int iDataPosition = parcel.dataPosition();
        int i4 = this.f11493z;
        if (i4 == this.f11489v) {
            i4 = this.f11490w;
        }
        return new f(parcel, iDataPosition, i4, this.f11491x + "  ", this.f11483a, this.f11484b, this.f11485c);
    }

    @Override // t1.e
    public String c0() {
        return this.f11488u.readString();
    }

    @Override // t1.e
    public IBinder e0() {
        return this.f11488u.readStrongBinder();
    }

    @Override // t1.e
    public void e1(String str) {
        this.f11488u.writeString(str);
    }

    @Override // t1.e
    public void g1(IBinder iBinder) {
        this.f11488u.writeStrongBinder(iBinder);
    }

    @Override // t1.e
    public void i0(int i4) {
        a();
        this.f11492y = i4;
        this.f11487t.put(i4, this.f11488u.dataPosition());
        L0(0);
        L0(i4);
    }

    @Override // t1.e
    public void i1(IInterface iInterface) {
        this.f11488u.writeStrongInterface(iInterface);
    }

    @Override // t1.e
    public boolean l() {
        return this.f11488u.readInt() != 0;
    }

    @Override // t1.e
    public void m0(boolean z3) {
        this.f11488u.writeInt(z3 ? 1 : 0);
    }

    @Override // t1.e
    public Bundle p() {
        return this.f11488u.readBundle(getClass().getClassLoader());
    }

    @Override // t1.e
    public void q0(Bundle bundle) {
        this.f11488u.writeBundle(bundle);
    }

    @Override // t1.e
    public byte[] s() {
        int i4 = this.f11488u.readInt();
        if (i4 < 0) {
            return null;
        }
        byte[] bArr = new byte[i4];
        this.f11488u.readByteArray(bArr);
        return bArr;
    }

    @Override // t1.e
    public void t0(byte[] bArr) {
        if (bArr == null) {
            this.f11488u.writeInt(-1);
        } else {
            this.f11488u.writeInt(bArr.length);
            this.f11488u.writeByteArray(bArr);
        }
    }

    @Override // t1.e
    public CharSequence v() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f11488u);
    }

    @Override // t1.e
    public void v0(byte[] bArr, int i4, int i5) {
        if (bArr == null) {
            this.f11488u.writeInt(-1);
        } else {
            this.f11488u.writeInt(bArr.length);
            this.f11488u.writeByteArray(bArr, i4, i5);
        }
    }

    @Override // t1.e
    public double y() {
        return this.f11488u.readDouble();
    }

    @Override // t1.e
    public void y0(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f11488u, 0);
    }

    public f(Parcel parcel, int i4, int i5, String str, p.a<String, Method> aVar, p.a<String, Method> aVar2, p.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f11487t = new SparseIntArray();
        this.f11492y = -1;
        this.A = -1;
        this.f11488u = parcel;
        this.f11489v = i4;
        this.f11490w = i5;
        this.f11493z = i4;
        this.f11491x = str;
    }
}
