package androidx.lifecycle;

import c.r0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, Integer> f4169a = new HashMap();

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public boolean a(String str, int i4) {
        Integer num = this.f4169a.get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z3 = (iIntValue & i4) != 0;
        this.f4169a.put(str, Integer.valueOf(i4 | iIntValue));
        return !z3;
    }
}
