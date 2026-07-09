package androidx.core.widget;

import android.os.Build;
import c.j0;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static final boolean f3493a;

    static {
        f3493a = Build.VERSION.SDK_INT >= 27;
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) throws IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(@j0 int[] iArr, int i4) throws IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int i4);
}
