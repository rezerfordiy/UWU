package m2;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public class p extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f8839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f8840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f8841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f8845g = b();

    public p(float f4, float f5, float f6, int i4, int i5, int i6) {
        this.f8839a = f4;
        this.f8840b = f5;
        this.f8841c = f6;
        this.f8842d = i4;
        this.f8843e = i5;
        this.f8844f = i6;
    }

    @Override // m2.n
    public String a() {
        return this.f8845g;
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("##0.0000");
        return "SCSMGENERAL_DR" + decimalFormat.format(this.f8839a) + "_SA" + decimalFormat.format(this.f8840b) + "_SR" + decimalFormat.format(this.f8841c) + "_L" + this.f8842d + "_S" + this.f8843e + "_U" + this.f8844f + "_ST" + ((Object) sb);
    }
}
