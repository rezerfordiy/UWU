package org.dcm4che3.imageio.codec.jpeg;

/* JADX INFO: loaded from: classes.dex */
public class JPEGLSCodingParam {
    private final int maxVal;
    private int offset;
    private final int reset;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private final int f9970t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    private final int f9971t2;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private final int f9972t3;

    public JPEGLSCodingParam(int i4, int i5, int i6, int i7, int i8) {
        this.maxVal = i4;
        this.f9970t1 = i5;
        this.f9971t2 = i6;
        this.f9972t3 = i7;
        this.reset = i8;
    }

    public static JPEGLSCodingParam getDefaultJPEGLSCodingParam(int i4, int i5) {
        int i6 = (1 << i4) - 1;
        return getDefaultJPEGLSEncodingParam(i6, Math.min(i6, 4095), i5);
    }

    private static JPEGLSCodingParam getDefaultJPEGLSEncodingParam(int i4, int i5, int i6) {
        int i7 = (i5 + 128) >> 8;
        int i8 = i7 + 2 + (i6 * 3);
        if (i8 > i4 || i8 < i6 + 1) {
            i8 = i6 + 1;
        }
        int i9 = i8;
        int i10 = (i7 * 4) + 3 + (i6 * 5);
        int i11 = (i10 > i4 || i10 < i9) ? i9 : i10;
        int i12 = (i7 * 17) + 4 + (i6 * 7);
        return new JPEGLSCodingParam(i4, i9, i11, (i12 > i4 || i12 < i11) ? i11 : i12, 64);
    }

    public static JPEGLSCodingParam getJAIJPEGLSCodingParam(int i4) {
        int i5 = (1 << i4) - 1;
        return getDefaultJPEGLSEncodingParam(i5, i5, 0);
    }

    public byte[] getBytes() {
        int i4 = this.maxVal;
        int i5 = this.f9970t1;
        int i6 = this.f9971t2;
        int i7 = this.f9972t3;
        int i8 = this.reset;
        return new byte[]{-1, -8, 0, 13, 1, (byte) (i4 >> 8), (byte) i4, (byte) (i5 >> 8), (byte) i5, (byte) (i6 >> 8), (byte) i6, (byte) (i7 >> 8), (byte) i7, (byte) (i8 >> 8), (byte) i8};
    }

    public final int getMaxVal() {
        return this.maxVal;
    }

    public int getOffset() {
        return this.offset;
    }

    public final int getReset() {
        return this.reset;
    }

    public final int getT1() {
        return this.f9970t1;
    }

    public final int getT2() {
        return this.f9971t2;
    }

    public final int getT3() {
        return this.f9972t3;
    }

    public void setOffset(int i4) {
        this.offset = i4;
    }

    public String toString() {
        return "JPEGLSCodingParam[MAXVAL=" + this.maxVal + ", T1=" + this.f9970t1 + ", T2=" + this.f9971t2 + ", T3=" + this.f9972t3 + ", RESET=" + this.reset + "]";
    }
}
