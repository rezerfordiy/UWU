package com.sonoptek.pvus_android.ndk;

/* JADX INFO: loaded from: classes.dex */
public class util {
    public static native int[] GenCurve(int[] iArr, int i4, int i5);

    public static native void dealloc();

    public static native int[] findPeak();

    public static native int[] findSD();

    public static native float getAngle();

    public static native int getEndCenterX();

    public static native int getEndCenterY();

    public static native int getStartCenterX();

    public static native int getStartCenterY();

    public static native boolean setROI(byte[] bArr, int i4, int i5, int i6, int i7);
}
