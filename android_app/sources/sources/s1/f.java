package s1;

import android.animation.TypeEvaluator;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class f implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f11225a = new f();

    public static f a() {
        return f11225a;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f4, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f5 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f6 = f5 + (((((iIntValue2 >> 24) & 255) / 255.0f) - f5) * f4);
        float fPow5 = fPow2 + ((((float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f4);
        float fPow6 = fPow3 + (f4 * (((float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3));
        return Integer.valueOf((Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f4), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f6 * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
    }
}
