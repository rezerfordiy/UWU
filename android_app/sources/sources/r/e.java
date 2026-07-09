package r;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f10497f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f10498g = "alpha";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f10499h = "elevation";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f10500i = "rotation";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f10501j = "rotationX";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f10502k = "rotationY";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f10503l = "transformPivotX";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f10504m = "transformPivotY";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f10505n = "transitionPathRotate";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f10506o = "scaleX";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f10507p = "scaleY";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f10508q = "wavePeriod";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f10509r = "waveOffset";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f10510s = "waveVariesBy";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f10511t = "translationX";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f10512u = "translationY";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f10513v = "translationZ";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f10514w = "progress";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f10515x = "CUSTOM";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.widget.a> f10520e;

    public e() {
        int i4 = f10497f;
        this.f10516a = i4;
        this.f10517b = i4;
        this.f10518c = null;
    }

    public abstract void a(HashMap<String, t> map);

    public abstract void b(HashSet<String> hashSet);

    public abstract void c(Context context, AttributeSet attributeSet);

    public boolean d(String str) {
        String str2 = this.f10518c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void e(HashMap<String, Integer> map) {
    }

    public abstract void f(String str, Object obj);

    public boolean g(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    public float h(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public int i(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
