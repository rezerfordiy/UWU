package w0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import c.o0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12497b = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12498a;

    @o0(16)
    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0 f12499a;

        public a(j0 j0Var) {
            this.f12499a = j0Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
            e0 e0VarB = this.f12499a.b(i4);
            if (e0VarB == null) {
                return null;
            }
            return e0VarB.U1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i4) {
            List<e0> listC = this.f12499a.c(str, i4);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(listC.get(i5).U1());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i4, int i5, Bundle bundle) {
            return this.f12499a.f(i4, i5, bundle);
        }
    }

    @o0(19)
    public static class b extends a {
        public b(j0 j0Var) {
            super(j0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i4) {
            e0 e0VarD = this.f12499a.d(i4);
            if (e0VarD == null) {
                return null;
            }
            return e0VarD.U1();
        }
    }

    @o0(26)
    public static class c extends b {
        public c(j0 j0Var) {
            super(j0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i4, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f12499a.a(i4, e0.V1(accessibilityNodeInfo), str, bundle);
        }
    }

    public j0() {
        this.f12498a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public void a(int i4, @c.j0 e0 e0Var, @c.j0 String str, @c.k0 Bundle bundle) {
    }

    @c.k0
    public e0 b(int i4) {
        return null;
    }

    @c.k0
    public List<e0> c(String str, int i4) {
        return null;
    }

    @c.k0
    public e0 d(int i4) {
        return null;
    }

    public Object e() {
        return this.f12498a;
    }

    public boolean f(int i4, int i5, Bundle bundle) {
        return false;
    }

    public j0(Object obj) {
        this.f12498a = obj;
    }
}
