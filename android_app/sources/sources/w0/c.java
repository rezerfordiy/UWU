package w0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import c.o0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    @Deprecated
    public interface a {
        @Deprecated
        void onAccessibilityStateChanged(boolean z3);
    }

    @Deprecated
    public static abstract class b implements a {
    }

    /* JADX INFO: renamed from: w0.c$c, reason: collision with other inner class name */
    public static class AccessibilityManagerAccessibilityStateChangeListenerC0125c implements AccessibilityManager.AccessibilityStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f12425a;

        public AccessibilityManagerAccessibilityStateChangeListenerC0125c(@c.j0 a aVar) {
            this.f12425a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerAccessibilityStateChangeListenerC0125c) {
                return this.f12425a.equals(((AccessibilityManagerAccessibilityStateChangeListenerC0125c) obj).f12425a);
            }
            return false;
        }

        public int hashCode() {
            return this.f12425a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z3) {
            this.f12425a.onAccessibilityStateChanged(z3);
        }
    }

    public interface d {
        void onTouchExplorationStateChanged(boolean z3);
    }

    @o0(19)
    public static final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f12426a;

        public e(@c.j0 d dVar) {
            this.f12426a = dVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                return this.f12426a.equals(((e) obj).f12426a);
            }
            return false;
        }

        public int hashCode() {
            return this.f12426a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z3) {
            this.f12426a.onTouchExplorationStateChanged(z3);
        }
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0125c(aVar));
    }

    public static boolean b(AccessibilityManager accessibilityManager, d dVar) {
        if (dVar == null) {
            return false;
        }
        return accessibilityManager.addTouchExplorationStateChangeListener(new e(dVar));
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> c(AccessibilityManager accessibilityManager, int i4) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i4);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> d(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    @Deprecated
    public static boolean e(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean f(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0125c(aVar));
    }

    public static boolean g(AccessibilityManager accessibilityManager, d dVar) {
        if (dVar == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new e(dVar));
    }
}
