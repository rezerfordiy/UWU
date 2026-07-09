package k2;

import android.media.AudioTrack;
import android.os.AsyncTask;
import m2.b0;
import m2.d0;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static e f8387l = new e();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f8388m = 4000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f8389n = 16384;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ boolean f8390o = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioTrack f8395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8397g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8391a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public short[] f8392b = new short[16384];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8393c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8394d = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8398h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8399i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8400j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8401k = 0;

    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            e.this.f8399i = true;
            try {
                Thread.sleep(1000L);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            e.this.f8399i = false;
        }
    }

    public class b extends AsyncTask<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f8403a;

        public b() {
            this.f8403a = null;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Integer... numArr) {
            e.this.d(this.f8403a);
            return 0;
        }

        public void b(byte[] bArr) {
            this.f8403a = bArr;
        }

        public /* synthetic */ b(e eVar, a aVar) {
            this();
        }
    }

    public static e c() {
        return f8387l;
    }

    public void b(boolean z3) {
        if (!z3) {
            g();
        }
        this.f8391a = z3;
    }

    public synchronized void d(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i5 * 2;
            int i7 = ((short) (65535 & ((bArr[i6] & 255) + ((bArr[i6 + 1] & 255) << 8)))) * 2;
            int i8 = 32767;
            if (i7 > 32767) {
                i7 = i8;
            } else {
                i8 = -32767;
                if (i7 < -32767) {
                    i7 = i8;
                }
            }
            sArr[i5] = (short) i7;
        }
        int i9 = this.f8398h;
        if (i9 <= 1) {
            e(sArr);
        } else {
            int i10 = (length / 2) * 2;
            short[] sArr2 = new short[i10 * i9];
            if (i9 == 2) {
                while (i4 < i10 / 2) {
                    int i11 = i4 * 2;
                    short s4 = sArr[i11];
                    short s5 = sArr[i11 + 1];
                    int i12 = this.f8398h;
                    sArr2[i11 * i12] = (short) ((this.f8400j + s4) >> 1);
                    sArr2[(i11 * i12) + 1] = (short) ((this.f8401k + s5) >> 1);
                    sArr2[(i11 * i12) + 2] = s4;
                    sArr2[(i11 * i12) + 3] = s5;
                    this.f8400j = s4;
                    this.f8401k = s5;
                    i4++;
                }
            } else if (i9 == 4) {
                while (i4 < i10 / 2) {
                    int i13 = i4 * 2;
                    short s6 = sArr[i13];
                    short s7 = sArr[i13 + 1];
                    int i14 = this.f8400j;
                    int i15 = (i14 + s6) >> 1;
                    int i16 = this.f8401k;
                    int i17 = (i16 + s7) >> 1;
                    int i18 = this.f8398h;
                    sArr2[i13 * i18] = (short) ((i14 + i15) >> 1);
                    sArr2[(i13 * i18) + 1] = (short) ((i16 + i17) >> 1);
                    sArr2[(i13 * i18) + 2] = (short) i15;
                    sArr2[(i13 * i18) + 3] = (short) i17;
                    sArr2[(i13 * i18) + 4] = (short) ((i15 + s6) >> 1);
                    sArr2[(i13 * i18) + 5] = (short) ((i17 + s7) >> 1);
                    sArr2[(i13 * i18) + 6] = s6;
                    sArr2[(i13 * i18) + 7] = s7;
                    this.f8400j = s6;
                    this.f8401k = s7;
                    i4++;
                }
            }
            e(sArr2);
        }
    }

    public void e(short[] sArr) {
        AudioTrack audioTrack;
        if (this.f8399i || (audioTrack = this.f8395e) == null) {
            return;
        }
        if (this.f8394d) {
            audioTrack.write(sArr, 0, sArr.length);
            return;
        }
        System.arraycopy(sArr, 0, this.f8392b, this.f8393c, sArr.length);
        int length = this.f8393c + sArr.length;
        this.f8393c = length;
        if (length > 4000) {
            this.f8394d = true;
            this.f8395e.write(this.f8392b, 0, length);
        }
    }

    public void f(d0 d0Var) {
        a aVar = null;
        b0 b0Var = d0Var.f8789f.containsKey("pw_data") ? (b0) d0Var.f8789f.get("pw_data") : null;
        if (b0Var != null && this.f8391a) {
            int i4 = b0Var.f8718i;
            if (i4 != this.f8396f || this.f8395e == null) {
                g();
                new a().start();
                h(i4);
            }
            b bVar = new b(this, aVar);
            bVar.b(b0Var.f8724o);
            bVar.execute(0);
        }
    }

    public synchronized void g() {
        if (this.f8391a) {
            this.f8394d = false;
            this.f8393c = 0;
            AudioTrack audioTrack = this.f8395e;
            if (audioTrack != null) {
                audioTrack.stop();
                this.f8395e.release();
                this.f8395e = null;
            }
        }
    }

    public synchronized void h(int i4) {
        int i5;
        int i6;
        if (i4 > 0) {
            if (this.f8395e == null) {
                this.f8396f = i4;
                this.f8398h = 1;
                if (i4 < 4000) {
                    while (true) {
                        i5 = this.f8396f;
                        i6 = this.f8398h;
                        if (i5 * i6 >= 4000) {
                            break;
                        } else {
                            this.f8398h = i6 * 2;
                        }
                    }
                    this.f8397g = i5 * i6;
                } else if (i4 > 192000) {
                    this.f8397g = 192000;
                } else {
                    this.f8397g = i4;
                }
                int i7 = this.f8397g;
                AudioTrack audioTrack = new AudioTrack(3, i7, 12, 2, i7, 1);
                this.f8395e = audioTrack;
                audioTrack.play();
            }
        }
    }
}
