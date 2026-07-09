package k2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f8405h = 4000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f8406i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f8407j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f8408k = 128;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static f f8409l = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f8415f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8410a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8411b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8412c = com.sonoptek.pvus_android.loop_view.a.f6120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8413d = 4000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<byte[]> f8414e = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8416g = false;

    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            try {
                Thread.sleep(1000L);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            f.this.f8416g = false;
        }
    }

    public static f d() {
        return f8409l;
    }

    public byte[] b(byte[] bArr) {
        boolean z3;
        if (!this.f8416g) {
            for (int i4 = 0; i4 < 96; i4++) {
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 >= 128) {
                        z3 = true;
                        break;
                    }
                    if (bArr[(i4 * 128) + i5] == -1 && (i6 = i6 + 1) >= 32) {
                        z3 = false;
                        break;
                    }
                    i5++;
                }
                if (z3) {
                    synchronized (this.f8414e) {
                        byte[] bArr2 = new byte[128];
                        System.arraycopy(bArr, i4 * 128, bArr2, 0, 128);
                        this.f8414e.add(bArr2);
                        if (this.f8414e.size() > this.f8412c) {
                            this.f8414e.remove(0);
                        }
                    }
                }
            }
        }
        byte[] bArr3 = new byte[this.f8412c * 128];
        synchronized (this.f8414e) {
            for (int i7 = 0; i7 < this.f8414e.size(); i7++) {
                System.arraycopy(this.f8414e.get(i7), 0, bArr3, i7 * 128, 128);
            }
        }
        return bArr3;
    }

    public byte[] c(byte[] bArr) {
        boolean z3;
        int i4;
        if (!this.f8416g) {
            int length = bArr.length / 512;
            boolean z4 = false;
            for (int i5 = 0; i5 < length * 4; i5++) {
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    if (i6 >= 128) {
                        z3 = true;
                        break;
                    }
                    if (bArr[(i5 * 128) + i6] == -1 && (i7 = i7 + 1) >= 120) {
                        z3 = false;
                        break;
                    }
                    i6++;
                }
                if (z3) {
                    byte[] bArr2 = new byte[128];
                    synchronized (this.f8414e) {
                        i4 = i5 * 128;
                        System.arraycopy(bArr, i4, bArr2, 0, 128);
                        this.f8414e.add(bArr2);
                        if (this.f8414e.size() > this.f8412c) {
                            this.f8414e.remove(0);
                        }
                    }
                    if (z4) {
                        continue;
                    } else {
                        synchronized (this.f8414e) {
                            for (int i8 = 0; i8 < 4; i8++) {
                                byte[] bArr3 = new byte[128];
                                System.arraycopy(bArr, i4, bArr3, 0, 128);
                                this.f8414e.add(bArr3);
                                if (this.f8414e.size() > this.f8412c) {
                                    this.f8414e.remove(0);
                                }
                            }
                        }
                        z4 = true;
                    }
                }
            }
        }
        this.f8415f = new byte[this.f8412c * 128];
        synchronized (this.f8414e) {
            for (int i9 = 0; i9 < this.f8414e.size(); i9++) {
                System.arraycopy(this.f8414e.get(i9), 0, this.f8415f, i9 * 128, 128);
            }
        }
        return this.f8415f;
    }

    public byte[] e() {
        return this.f8415f;
    }

    public int f() {
        return this.f8412c;
    }

    public void g() {
        synchronized (this.f8414e) {
            this.f8414e.clear();
            this.f8412c = (this.f8413d / this.f8410a) * this.f8411b;
            for (int i4 = 0; i4 < this.f8412c; i4++) {
                this.f8414e.add(new byte[128]);
            }
        }
    }

    public void h(int i4) {
        int i5 = this.f8412c;
        this.f8413d = i4;
        int i6 = (i4 / this.f8410a) * this.f8411b;
        this.f8412c = i6;
        if (i5 == i6) {
            return;
        }
        this.f8416g = true;
        g();
        new a().start();
    }

    public synchronized void i(int i4, int i5) {
        int i6 = this.f8412c;
        this.f8410a = i4;
        this.f8411b = i5;
        int i7 = (this.f8413d / i4) * i4;
        this.f8412c = i7;
        if (i6 != i7) {
            g();
        }
    }
}
