package t1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import c.r0;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;
import t1.e;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY})
public class g extends e {
    public static final Charset C = Charset.forName("UTF-16");
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;
    public static final int J = 6;
    public static final int K = 7;
    public static final int L = 8;
    public static final int M = 9;
    public static final int N = 10;
    public static final int O = 11;
    public static final int P = 12;
    public static final int Q = 13;
    public static final int R = 14;
    public int A;
    public int B;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DataInputStream f11494t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DataOutputStream f11495u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public DataInputStream f11496v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public DataOutputStream f11497w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f11498x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11499y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f11500z;

    public class a extends FilterInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            g gVar = g.this;
            int i4 = gVar.B;
            if (i4 != -1 && gVar.f11500z >= i4) {
                throw new IOException();
            }
            int i5 = super.read();
            g.this.f11500z++;
            return i5;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j4) throws IOException {
            g gVar = g.this;
            int i4 = gVar.B;
            if (i4 != -1 && gVar.f11500z >= i4) {
                throw new IOException();
            }
            long jSkip = super.skip(j4);
            if (jSkip > 0) {
                g.this.f11500z += (int) jSkip;
            }
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            g gVar = g.this;
            int i6 = gVar.B;
            if (i6 != -1 && gVar.f11500z >= i6) {
                throw new IOException();
            }
            int i7 = super.read(bArr, i4, i5);
            if (i7 > 0) {
                g.this.f11500z += i7;
            }
            return i7;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteArrayOutputStream f11502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DataOutputStream f11503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DataOutputStream f11505d;

        public b(int i4, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f11502a = byteArrayOutputStream;
            this.f11503b = new DataOutputStream(byteArrayOutputStream);
            this.f11504c = i4;
            this.f11505d = dataOutputStream;
        }

        public void a() throws IOException {
            this.f11503b.flush();
            int size = this.f11502a.size();
            this.f11505d.writeInt((this.f11504c << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.f11505d.writeInt(size);
            }
            this.f11502a.writeTo(this.f11505d);
        }
    }

    public g(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new p.a(), new p.a(), new p.a());
    }

    @Override // t1.e
    public void C0(double d4) {
        try {
            this.f11497w.writeDouble(d4);
        } catch (IOException e4) {
            throw new e.b(e4);
        }
    }

    @Override // t1.e
    public boolean F(int i4) {
        while (true) {
            try {
                int i5 = this.A;
                if (i5 == i4) {
                    return true;
                }
                if (String.valueOf(i5).compareTo(String.valueOf(i4)) > 0) {
                    return false;
                }
                if (this.f11500z < this.B) {
                    this.f11494t.skip(r2 - r1);
                }
                this.B = -1;
                int i6 = this.f11494t.readInt();
                this.f11500z = 0;
                int i7 = i6 & l0.a.f8427a;
                if (i7 == 65535) {
                    i7 = this.f11494t.readInt();
                }
                this.A = (i6 >> 16) & l0.a.f8427a;
                this.B = i7;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // t1.e
    public float G() {
        try {
            return this.f11496v.readFloat();
        } catch (IOException e4) {
            throw new e.b(e4);
        }
    }

    @Override // t1.e
    public void H0(float f4) {
        try {
            this.f11497w.writeFloat(f4);
        } catch (IOException e4) {
            throw new e.b(e4);
        }
    }

    @Override // t1.e
    public int L() {
        try {
            return this.f11496v.readInt();
        } catch (IOException e4) {
            throw new e.b(e4);
        }
    }

    @Override // t1.e
    public void L0(int i4) {
        try {
            this.f11497w.writeInt(i4);
        } catch (IOException e4) {
            throw new e.b(e4);
        }
    }

    @Override // t1.e
    public long Q() {
        try {
            return this.f11496v.readLong();
        } catch (IOException e4) {
            throw new e.b(e4);
        }
    }

    @Override // t1.e
    public void Q0(long j4) {
        try {
            this.f11497w.writeLong(j4);
        } catch (IOException e4) {
            throw new e.b(e4);
        }
    }

    @Override // t1.e
    public <T extends Parcelable> T V() {
        return null;
    }

    @Override // t1.e
    public void W0(Parcelable parcelable) {
        if (!this.f11499y) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // t1.e
    public void a() {
        b bVar = this.f11498x;
        if (bVar != null) {
            try {
                if (bVar.f11502a.size() != 0) {
                    this.f11498x.a();
                }
                this.f11498x = null;
            } catch (IOException e4) {
                throw new e.b(e4);
            }
        }
    }

    @Override // t1.e
    public e c() {
        return new g(this.f11496v, this.f11497w, this.f11483a, this.f11484b, this.f11485c);
    }

    @Override // t1.e
    public String c0() {
        try {
            int i4 = this.f11496v.readInt();
            if (i4 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i4];
            this.f11496v.readFully(bArr);
            return new String(bArr, C);
        } catch (IOException e4) {
            throw new e.b(e4);
        }
    }

    @Override // t1.e
    public IBinder e0() {
        return null;
    }

    @Override // t1.e
    public void e1(String str) {
        try {
            if (str != null) {
                byte[] bytes = str.getBytes(C);
                this.f11497w.writeInt(bytes.length);
                this.f11497w.write(bytes);
            } else {
                this.f11497w.writeInt(-1);
            }
        } catch (IOException e4) {
            throw new e.b(e4);
        }
    }

    @Override // t1.e
    public void g1(IBinder iBinder) {
        if (!this.f11499y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // t1.e
    public boolean i() {
        return true;
    }

    @Override // t1.e
    public void i0(int i4) {
        a();
        b bVar = new b(i4, this.f11495u);
        this.f11498x = bVar;
        this.f11497w = bVar.f11503b;
    }

    @Override // t1.e
    public void i1(IInterface iInterface) {
        if (!this.f11499y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // t1.e
    public void j0(boolean z3, boolean z4) {
        if (!z3) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f11499y = z4;
    }

    @Override // t1.e
    public boolean l() {
        try {
            return this.f11496v.readBoolean();
        } catch (IOException e4) {
            throw new e.b(e4);
        }
    }

    @Override // t1.e
    public void m0(boolean z3) {
        try {
            this.f11497w.writeBoolean(z3);
        } catch (IOException e4) {
            throw new e.b(e4);
        }
    }

    public final void o1(int i4, String str, Bundle bundle) {
        switch (i4) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
            case 2:
                bundle.putBundle(str, p());
                return;
            case 3:
                bundle.putString(str, c0());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) j(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, l());
                return;
            case 6:
                bundle.putBooleanArray(str, n());
                return;
            case 7:
                bundle.putDouble(str, y());
                return;
            case 8:
                bundle.putDoubleArray(str, A());
                return;
            case 9:
                bundle.putInt(str, L());
                return;
            case 10:
                bundle.putIntArray(str, N());
                return;
            case 11:
                bundle.putLong(str, Q());
                return;
            case 12:
                bundle.putLongArray(str, S());
                return;
            case 13:
                bundle.putFloat(str, G());
                return;
            case 14:
                bundle.putFloatArray(str, I());
                return;
            default:
                throw new RuntimeException("Unknown type " + i4);
        }
    }

    @Override // t1.e
    public Bundle p() {
        int iL = L();
        if (iL < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i4 = 0; i4 < iL; i4++) {
            o1(L(), c0(), bundle);
        }
        return bundle;
    }

    public final void p1(Object obj) {
        int iIntValue;
        if (obj == null) {
            iIntValue = 0;
        } else {
            if (obj instanceof Bundle) {
                L0(1);
                q0((Bundle) obj);
                return;
            }
            if (obj instanceof String) {
                L0(3);
                e1((String) obj);
                return;
            }
            if (obj instanceof String[]) {
                L0(4);
                k0((String[]) obj);
                return;
            }
            if (obj instanceof Boolean) {
                L0(5);
                m0(((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof boolean[]) {
                L0(6);
                o0((boolean[]) obj);
                return;
            }
            if (obj instanceof Double) {
                L0(7);
                C0(((Double) obj).doubleValue());
                return;
            }
            if (obj instanceof double[]) {
                L0(8);
                E0((double[]) obj);
                return;
            }
            if (!(obj instanceof Integer)) {
                if (obj instanceof int[]) {
                    L0(10);
                    N0((int[]) obj);
                    return;
                }
                if (obj instanceof Long) {
                    L0(11);
                    Q0(((Long) obj).longValue());
                    return;
                }
                if (obj instanceof long[]) {
                    L0(12);
                    S0((long[]) obj);
                    return;
                }
                if (obj instanceof Float) {
                    L0(13);
                    H0(((Float) obj).floatValue());
                    return;
                } else if (obj instanceof float[]) {
                    L0(14);
                    J0((float[]) obj);
                    return;
                } else {
                    throw new IllegalArgumentException("Unsupported type " + obj.getClass());
                }
            }
            L0(9);
            iIntValue = ((Integer) obj).intValue();
        }
        L0(iIntValue);
    }

    @Override // t1.e
    public void q0(Bundle bundle) {
        try {
            if (bundle == null) {
                this.f11497w.writeInt(-1);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            this.f11497w.writeInt(setKeySet.size());
            for (String str : setKeySet) {
                e1(str);
                p1(bundle.get(str));
            }
        } catch (IOException e4) {
            throw new e.b(e4);
        }
    }

    @Override // t1.e
    public byte[] s() {
        try {
            int i4 = this.f11496v.readInt();
            if (i4 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i4];
            this.f11496v.readFully(bArr);
            return bArr;
        } catch (IOException e4) {
            throw new e.b(e4);
        }
    }

    @Override // t1.e
    public void t0(byte[] bArr) {
        try {
            if (bArr != null) {
                this.f11497w.writeInt(bArr.length);
                this.f11497w.write(bArr);
            } else {
                this.f11497w.writeInt(-1);
            }
        } catch (IOException e4) {
            throw new e.b(e4);
        }
    }

    @Override // t1.e
    public CharSequence v() {
        return null;
    }

    @Override // t1.e
    public void v0(byte[] bArr, int i4, int i5) {
        try {
            if (bArr != null) {
                this.f11497w.writeInt(i5);
                this.f11497w.write(bArr, i4, i5);
            } else {
                this.f11497w.writeInt(-1);
            }
        } catch (IOException e4) {
            throw new e.b(e4);
        }
    }

    @Override // t1.e
    public double y() {
        try {
            return this.f11496v.readDouble();
        } catch (IOException e4) {
            throw new e.b(e4);
        }
    }

    @Override // t1.e
    public void y0(CharSequence charSequence) {
        if (!this.f11499y) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    public g(InputStream inputStream, OutputStream outputStream, p.a<String, Method> aVar, p.a<String, Method> aVar2, p.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f11500z = 0;
        this.A = -1;
        this.B = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new a(inputStream)) : null;
        this.f11494t = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f11495u = dataOutputStream;
        this.f11496v = dataInputStream;
        this.f11497w = dataOutputStream;
    }
}
