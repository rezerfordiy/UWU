package com.sonoptek.vulkan;

import android.content.res.AssetManager;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
public class VKDSCJni {
    static {
        System.loadLibrary("dsc");
    }

    @Keep
    public static native void dispose();

    public static native void initDSCTableWithSteer(float f4, float f5, float f6, int i4, int i5, int i6, int i7, float f7, double d4, double d5, double d6);

    @Keep
    public static native void initVulkanDSC(AssetManager assetManager, boolean z3);

    @Keep
    public static native int[] init_VulkanDSCImage(int[] iArr, int i4, byte[] bArr, int i5, int i6, int i7, int i8, int i9);

    @Keep
    public static native void updateDscParams(int[] iArr, int i4, int i5, int i6, int i7, int i8, int i9);

    public static native byte[] vulkanColorDSCImage(int i4, int i5, int i6, int i7, float f4, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, byte[] bArr, int i16, int i17);

    @Keep
    public static native int[] vulkanDSCImage(byte[] bArr, int i4, int i5, int i6, int i7, int i8);

    @Keep
    public static native void vulkanInitDSC(int i4, int i5, int i6, float f4, float f5, float f6, float f7, int i7, int i8, float f8, float f9);

    public static native byte[] vulkanPowerDSCImage(int i4, int i5, int i6, int i7, float f4, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, byte[] bArr, int i16, int i17);
}
