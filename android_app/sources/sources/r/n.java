package r;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.e;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class n extends e {
    public static final String S = "KeyTrigger";
    public static final String T = "KeyTrigger";
    public static final int U = 5;
    public int A;
    public String B;
    public String C;
    public int D;
    public int E;
    public View F;
    public float G;
    public boolean H;
    public boolean I;
    public boolean J;
    public float K;
    public Method L;
    public Method M;
    public Method N;
    public float O;
    public boolean P;
    public RectF Q;
    public RectF R;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10637y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f10638z = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f10639a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f10640b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f10641c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f10642d = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f10643e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f10644f = 7;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f10645g = 8;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f10646h = 9;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f10647i = 10;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f10648j = 11;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static SparseIntArray f10649k;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f10649k = sparseIntArray;
            sparseIntArray.append(e.m.Dc, 8);
            f10649k.append(e.m.Hc, 4);
            f10649k.append(e.m.Ic, 1);
            f10649k.append(e.m.Jc, 2);
            f10649k.append(e.m.Ec, 7);
            f10649k.append(e.m.Kc, 6);
            f10649k.append(e.m.Mc, 5);
            f10649k.append(e.m.Gc, 9);
            f10649k.append(e.m.Fc, 10);
            f10649k.append(e.m.Lc, 11);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(r.n r4, android.content.res.TypedArray r5, android.content.Context r6) {
            /*
                Method dump skipped, instruction units count: 238
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r.n.a.a(r.n, android.content.res.TypedArray, android.content.Context):void");
        }
    }

    public n() {
        int i4 = e.f10497f;
        this.A = i4;
        this.B = null;
        this.C = null;
        this.D = i4;
        this.E = i4;
        this.F = null;
        this.G = 0.1f;
        this.H = true;
        this.I = true;
        this.J = true;
        this.K = Float.NaN;
        this.P = false;
        this.Q = new RectF();
        this.R = new RectF();
        this.f10519d = 5;
        this.f10520e = new HashMap<>();
    }

    @Override // r.e
    public void a(HashMap<String, t> map) {
    }

    @Override // r.e
    public void b(HashSet<String> hashSet) {
    }

    @Override // r.e
    public void c(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, e.m.Cc), context);
    }

    @Override // r.e
    public void f(String str, Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v(float r11, android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r.n.v(float, android.view.View):void");
    }

    public int w() {
        return this.f10637y;
    }

    public final void x(RectF rectF, View view, boolean z3) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z3) {
            view.getMatrix().mapRect(rectF);
        }
    }
}
