package z1;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import z1.n0;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13611a = "_master_compounder";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13612b = "line_count";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13613c = "sample_count";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13614d = "dead_region";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13615e = "sector_angle";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13616f = "steer_degree";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13617g = "sample_scales";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13618h = "len_thick";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, Bundle> f13619i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<String, j0> f13620j = new HashMap();

    public j0 a(String str) {
        if (str.equals(n0.e.MODE_BM.toString())) {
            str = n0.e.MODE_B.toString();
        }
        if (this.f13620j.containsKey(str)) {
            return this.f13620j.get(str);
        }
        Bundle bundle = this.f13619i.containsKey(str) ? this.f13619i.get(str) : this.f13619i.get("_master_compounder");
        j0 j0Var = new j0(bundle.getInt("line_count"), bundle.getInt("sample_count"), bundle.getFloat("dead_region"), bundle.getFloat("sector_angle"), bundle.getFloat("steer_degree"), bundle.getFloatArray("sample_scales"), bundle.getFloat("len_thick"));
        this.f13620j.put(str, j0Var);
        return j0Var;
    }

    public void b(String str, int i4, int i5, float f4, float f5, float f6, float[] fArr, float f7) {
        Bundle bundle = new Bundle();
        bundle.putInt("line_count", i4);
        bundle.putInt("sample_count", i5);
        bundle.putFloat("dead_region", f4);
        bundle.putFloat("sector_angle", f5);
        bundle.putFloat("steer_degree", f6);
        bundle.putFloatArray("sample_scales", fArr);
        bundle.putFloat("len_thick", f7);
        this.f13619i.put(str, bundle);
    }

    public void c(int i4, int i5, float f4, float f5, float f6, float[] fArr, float f7) {
        Bundle bundle = new Bundle();
        bundle.putInt("line_count", i4);
        bundle.putInt("sample_count", i5);
        bundle.putFloat("dead_region", f4);
        bundle.putFloat("sector_angle", f5);
        bundle.putFloat("steer_degree", f6);
        bundle.putFloatArray("sample_scales", fArr);
        bundle.putFloat("len_thick", f7);
        this.f13619i.put("_master_compounder", bundle);
    }
}
