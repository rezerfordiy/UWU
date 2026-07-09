package com.sonoptek.vulkan;

import android.content.res.AssetManager;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
public class VKEnhJni {
    static {
        System.loadLibrary("enh");
    }

    @Keep
    public static native boolean InitEnhancer(int[] iArr, int i4);

    @Keep
    public static native void dispose();

    @Keep
    public static native byte[] enhance(byte[] bArr, int i4, int i5);

    @Keep
    public static native int getEnhanceLevel();

    @Keep
    public static native int getEnhanceMode();

    @Keep
    public static native void initVulkanEI(AssetManager assetManager, boolean z3);

    @Keep
    public static native void setEnhanceLevel(int i4);

    @Keep
    public static native void setEnhanceMode(int i4);
}
