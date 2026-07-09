package q;

import android.util.Log;
import r.q;

/* JADX INFO: loaded from: classes.dex */
public class h extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f10195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f10196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f10198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f10199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f10200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f10201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f10202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f10203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f10205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10206l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f10207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f10208n;

    @Override // r.q
    public float a() {
        return this.f10206l ? -e(this.f10208n) : e(this.f10208n);
    }

    public final float b(float f4) {
        float f5 = this.f10198d;
        if (f4 <= f5) {
            float f6 = this.f10195a;
            return (f6 * f4) + ((((this.f10196b - f6) * f4) * f4) / (f5 * 2.0f));
        }
        int i4 = this.f10204j;
        if (i4 == 1) {
            return this.f10201g;
        }
        float f7 = f4 - f5;
        float f8 = this.f10199e;
        if (f7 < f8) {
            float f9 = this.f10201g;
            float f10 = this.f10196b;
            return f9 + (f10 * f7) + ((((this.f10197c - f10) * f7) * f7) / (f8 * 2.0f));
        }
        if (i4 == 2) {
            return this.f10202h;
        }
        float f11 = f7 - f8;
        float f12 = this.f10200f;
        if (f11 >= f12) {
            return this.f10203i;
        }
        float f13 = this.f10202h;
        float f14 = this.f10197c;
        return (f13 + (f14 * f11)) - (((f14 * f11) * f11) / (f12 * 2.0f));
    }

    public void c(float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10;
        h hVar;
        float f11;
        this.f10207m = f4;
        boolean z3 = f4 > f5;
        this.f10206l = z3;
        if (z3) {
            f11 = -f6;
            f10 = f4 - f5;
            hVar = this;
        } else {
            f10 = f5 - f4;
            hVar = this;
            f11 = f6;
        }
        hVar.f(f11, f10, f8, f9, f7);
    }

    public void d(String str, String str2, float f4) {
        StringBuilder sb;
        String str3;
        Log.v(str, str2 + " ===== " + this.f10205k);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(this.f10206l ? "backwards" : "forward ");
        sb2.append(" time = ");
        sb2.append(f4);
        sb2.append("  stages ");
        sb2.append(this.f10204j);
        Log.v(str, sb2.toString());
        Log.v(str, str2 + " dur " + this.f10198d + " vel " + this.f10195a + " pos " + this.f10201g);
        if (this.f10204j > 1) {
            Log.v(str, str2 + " dur " + this.f10199e + " vel " + this.f10196b + " pos " + this.f10202h);
        }
        if (this.f10204j > 2) {
            Log.v(str, str2 + " dur " + this.f10200f + " vel " + this.f10197c + " pos " + this.f10203i);
        }
        float f5 = this.f10198d;
        if (f4 <= f5) {
            sb = new StringBuilder();
            sb.append(str2);
            str3 = "stage 0";
        } else {
            int i4 = this.f10204j;
            if (i4 == 1) {
                sb = new StringBuilder();
                sb.append(str2);
                str3 = "end stage 0";
            } else {
                float f6 = f4 - f5;
                float f7 = this.f10199e;
                if (f6 < f7) {
                    sb = new StringBuilder();
                    sb.append(str2);
                    str3 = " stage 1";
                } else if (i4 == 2) {
                    sb = new StringBuilder();
                    sb.append(str2);
                    str3 = "end stage 1";
                } else if (f6 - f7 < this.f10200f) {
                    sb = new StringBuilder();
                    sb.append(str2);
                    str3 = " stage 2";
                } else {
                    sb = new StringBuilder();
                    sb.append(str2);
                    str3 = " end stage 2";
                }
            }
        }
        sb.append(str3);
        Log.v(str, sb.toString());
    }

    public float e(float f4) {
        float f5 = this.f10198d;
        if (f4 <= f5) {
            float f6 = this.f10195a;
            return f6 + (((this.f10196b - f6) * f4) / f5);
        }
        int i4 = this.f10204j;
        if (i4 == 1) {
            return 0.0f;
        }
        float f7 = f4 - f5;
        float f8 = this.f10199e;
        if (f7 < f8) {
            float f9 = this.f10196b;
            return f9 + (((this.f10197c - f9) * f7) / f8);
        }
        if (i4 == 2) {
            return this.f10202h;
        }
        float f10 = f7 - f8;
        float f11 = this.f10200f;
        if (f10 >= f11) {
            return this.f10203i;
        }
        float f12 = this.f10197c;
        return f12 - ((f10 * f12) / f11);
    }

    public final void f(float f4, float f5, float f6, float f7, float f8) {
        if (f4 == 0.0f) {
            f4 = 1.0E-4f;
        }
        this.f10195a = f4;
        float f9 = f4 / f6;
        float f10 = (f9 * f4) / 2.0f;
        if (f4 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f5 - ((((-f4) / f6) * f4) / 2.0f)) * f6);
            if (fSqrt < f7) {
                this.f10205k = "backward accelerate, decelerate";
                this.f10204j = 2;
                this.f10195a = f4;
                this.f10196b = fSqrt;
                this.f10197c = 0.0f;
                float f11 = (fSqrt - f4) / f6;
                this.f10198d = f11;
                this.f10199e = fSqrt / f6;
                this.f10201g = ((f4 + fSqrt) * f11) / 2.0f;
                this.f10202h = f5;
                this.f10203i = f5;
                return;
            }
            this.f10205k = "backward accelerate cruse decelerate";
            this.f10204j = 3;
            this.f10195a = f4;
            this.f10196b = f7;
            this.f10197c = f7;
            float f12 = (f7 - f4) / f6;
            this.f10198d = f12;
            float f13 = f7 / f6;
            this.f10200f = f13;
            float f14 = ((f4 + f7) * f12) / 2.0f;
            float f15 = (f13 * f7) / 2.0f;
            this.f10199e = ((f5 - f14) - f15) / f7;
            this.f10201g = f14;
            this.f10202h = f5 - f15;
            this.f10203i = f5;
            return;
        }
        if (f10 >= f5) {
            this.f10205k = "hard stop";
            this.f10204j = 1;
            this.f10195a = f4;
            this.f10196b = 0.0f;
            this.f10201g = f5;
            this.f10198d = (2.0f * f5) / f4;
            return;
        }
        float f16 = f5 - f10;
        float f17 = f16 / f4;
        if (f17 + f9 < f8) {
            this.f10205k = "cruse decelerate";
            this.f10204j = 2;
            this.f10195a = f4;
            this.f10196b = f4;
            this.f10197c = 0.0f;
            this.f10201g = f16;
            this.f10202h = f5;
            this.f10198d = f17;
            this.f10199e = f9;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f6 * f5) + ((f4 * f4) / 2.0f));
        float f18 = (fSqrt2 - f4) / f6;
        this.f10198d = f18;
        float f19 = fSqrt2 / f6;
        this.f10199e = f19;
        if (fSqrt2 < f7) {
            this.f10205k = "accelerate decelerate";
            this.f10204j = 2;
            this.f10195a = f4;
            this.f10196b = fSqrt2;
            this.f10197c = 0.0f;
            this.f10198d = f18;
            this.f10199e = f19;
            this.f10201g = ((f4 + fSqrt2) * f18) / 2.0f;
            this.f10202h = f5;
            return;
        }
        this.f10205k = "accelerate cruse decelerate";
        this.f10204j = 3;
        this.f10195a = f4;
        this.f10196b = f7;
        this.f10197c = f7;
        float f20 = (f7 - f4) / f6;
        this.f10198d = f20;
        float f21 = f7 / f6;
        this.f10200f = f21;
        float f22 = ((f4 + f7) * f20) / 2.0f;
        float f23 = (f21 * f7) / 2.0f;
        this.f10199e = ((f5 - f22) - f23) / f7;
        this.f10201g = f22;
        this.f10202h = f5 - f23;
        this.f10203i = f5;
    }

    @Override // r.q, android.animation.TimeInterpolator
    public float getInterpolation(float f4) {
        float fB = b(f4);
        this.f10208n = f4;
        return this.f10206l ? this.f10207m - fB : this.f10207m + fB;
    }
}
