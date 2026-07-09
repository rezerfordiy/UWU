package z1;

import androidx.constraintlayout.widget.e;
import java.util.HashMap;
import java.util.Map;
import z1.j6;

/* JADX INFO: loaded from: classes.dex */
public class z6 extends j6 {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public b f14244l0;

    public class b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f14245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f14246c;

        public b() {
            this.f14245b = false;
        }

        public void a(boolean z3) {
            this.f14245b = z3;
        }

        public void b(long j4) {
            this.f14246c = j4;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            while (!this.f14245b) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                }
                if (this.f14246c == 0) {
                    this.f14246c = System.currentTimeMillis();
                } else if (System.currentTimeMillis() - this.f14246c > 1000) {
                    z6 z6Var = z6.this;
                    if (z6Var.O == 0) {
                        z6Var.g1((byte) 3);
                        z6.this.e1(true);
                        z6.this.h1(1);
                        z6.this.i1(1);
                    } else {
                        z6Var.g1((byte) 2);
                        z6.this.e1(true);
                        z6.this.h1(0);
                        z6.this.i1(0);
                    }
                    this.f14245b = true;
                }
            }
        }
    }

    @Override // z1.j6
    public void I() {
        b bVar;
        boolean zF0 = f0();
        boolean z3 = this.C;
        byte b4 = 0;
        if (z3 && !zF0) {
            this.f13442t = new byte[]{90, -91, 1, 0};
        } else if (!z3 && zF0) {
            this.f13442t = new byte[]{90, -91, 2, 0};
        }
        this.C = zF0;
        byte[] bArr = this.f13442t;
        if (bArr != null) {
            if (bArr[0] == 90 && bArr[1] == -91) {
                b4 = bArr[2];
            }
            if (b4 == 2) {
                if (this.f14244l0 == null) {
                    b bVar2 = new b();
                    this.f14244l0 = bVar2;
                    bVar2.b(System.currentTimeMillis());
                    this.f14244l0.start();
                }
            } else if (b4 == 1 && (bVar = this.f14244l0) != null) {
                bVar.a(true);
                this.f14244l0 = null;
            }
            i0(this.f13442t);
        }
    }

    @Override // z1.j6
    public Map<String, v> K() {
        if (this.f13432j == null) {
            HashMap map = new HashMap();
            this.f13432j = map;
            map.put("UX-8LA", new v(512, 192, 32));
            this.f13429h.put(0, new j6.c((byte) 0, "UX-8LA"));
            this.f13432j.put("UX-8LB", new v(512, 192, 32));
            this.f13429h.put(1, new j6.c((byte) 0, "UX-8LB"));
        }
        return this.f13432j;
    }

    @Override // z1.j6
    public int Y(int i4, boolean z3) {
        return this.O == 0 ? (i4 == 0 || i4 == 1) ? 110 : 140 : (i4 == 0 || i4 == 1) ? z3 ? 83 : 66 : (i4 == 2 || i4 == 3) ? e.m.A3 : E() < 4 ? 100 : 50;
    }

    @Override // z1.j6
    public v b(int i4) {
        return K().get(this.f13429h.get(Integer.valueOf(i4)).f13456b);
    }
}
