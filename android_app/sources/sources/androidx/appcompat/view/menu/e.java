package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import c.j0;
import c.r0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class e implements l0.a {
    public static final String L = "MenuBuilder";
    public static final String M = "android:menu:presenters";
    public static final String N = "android:menu:actionviewstates";
    public static final String O = "android:menu:expandedactionview";
    public static final int[] P = {1, 4, 5, 3, 2, 0};
    public View A;
    public h I;
    public boolean K;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f1151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Resources f1152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1154o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f1155p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f1163x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f1164y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f1165z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1162w = 0;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public ArrayList<h> G = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<j>> H = new CopyOnWriteArrayList<>();
    public boolean J = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<h> f1156q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList<h> f1157r = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1158s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList<h> f1159t = new ArrayList<>();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<h> f1160u = new ArrayList<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1161v = true;

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        boolean a(@j0 e eVar, @j0 MenuItem menuItem);

        void b(@j0 e eVar);
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public interface b {
        boolean a(h hVar);
    }

    public e(Context context) {
        this.f1151l = context;
        this.f1152m = context.getResources();
        k0(true);
    }

    public static int E(int i4) {
        int i5 = ((-65536) & i4) >> 16;
        if (i5 >= 0) {
            int[] iArr = P;
            if (i5 < iArr.length) {
                return (i4 & l0.a.f8427a) | (iArr[i5] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public static int q(ArrayList<h> arrayList, int i4) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).i() <= i4) {
                return size + 1;
            }
        }
        return 0;
    }

    public CharSequence A() {
        return this.f1164y;
    }

    public View B() {
        return this.A;
    }

    public ArrayList<h> C() {
        u();
        return this.f1160u;
    }

    public boolean D() {
        return this.E;
    }

    public Resources F() {
        return this.f1152m;
    }

    public e G() {
        return this;
    }

    @j0
    public ArrayList<h> H() {
        if (!this.f1158s) {
            return this.f1157r;
        }
        this.f1157r.clear();
        int size = this.f1156q.size();
        for (int i4 = 0; i4 < size; i4++) {
            h hVar = this.f1156q.get(i4);
            if (hVar.isVisible()) {
                this.f1157r.add(hVar);
            }
        }
        this.f1158s = false;
        this.f1161v = true;
        return this.f1157r;
    }

    public boolean I() {
        return this.J;
    }

    public boolean J() {
        return this.f1153n;
    }

    public boolean K() {
        return this.f1154o;
    }

    public void L(h hVar) {
        this.f1161v = true;
        N(true);
    }

    public void M(h hVar) {
        this.f1158s = true;
        N(true);
    }

    public void N(boolean z3) {
        if (this.B) {
            this.C = true;
            if (z3) {
                this.D = true;
                return;
            }
            return;
        }
        if (z3) {
            this.f1158s = true;
            this.f1161v = true;
        }
        j(z3);
    }

    public boolean O(MenuItem menuItem, int i4) {
        return P(menuItem, null, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[PHI: r1
      0x002d: PHI (r1v4 boolean) = (r1v2 boolean), (r1v1 boolean), (r1v5 boolean) binds: [B:35:0x0068, B:23:0x003c, B:16:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean P(android.view.MenuItem r7, androidx.appcompat.view.menu.j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.h r7 = (androidx.appcompat.view.menu.h) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.n()
            v0.b r2 = r7.c()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.b()
            if (r4 == 0) goto L1f
            r4 = r3
            goto L20
        L1f:
            r4 = r0
        L20:
            boolean r5 = r7.m()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.f(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.f(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r0 = r6.x()
            r9.<init>(r0, r6, r7)
            r7.A(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.m r7 = (androidx.appcompat.view.menu.m) r7
            if (r4 == 0) goto L63
            r2.g(r7)
        L63:
            boolean r7 = r6.m(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.P(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    public void Q(int i4) {
        R(i4, true);
    }

    public final void R(int i4, boolean z3) {
        if (i4 < 0 || i4 >= this.f1156q.size()) {
            return;
        }
        this.f1156q.remove(i4);
        if (z3) {
            N(true);
        }
    }

    public void S(j jVar) {
        for (WeakReference<j> weakReference : this.H) {
            j jVar2 = weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.H.remove(weakReference);
            }
        }
    }

    public void T(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(w());
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).T(bundle);
            }
        }
        int i5 = bundle.getInt(O);
        if (i5 <= 0 || (menuItemFindItem = findItem(i5)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void U(Bundle bundle) {
        k(bundle);
    }

    public void V(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(O, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).V(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(w(), sparseArray);
        }
    }

    public void W(Bundle bundle) {
        l(bundle);
    }

    public void X(a aVar) {
        this.f1155p = aVar;
    }

    public void Y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1163x = contextMenuInfo;
    }

    public e Z(int i4) {
        this.f1162w = i4;
        return this;
    }

    public MenuItem a(int i4, int i5, int i6, CharSequence charSequence) {
        int iE = E(i6);
        h hVarH = h(i4, i5, i6, iE, charSequence, this.f1162w);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1163x;
        if (contextMenuInfo != null) {
            hVarH.y(contextMenuInfo);
        }
        ArrayList<h> arrayList = this.f1156q;
        arrayList.add(q(arrayList, iE), hVarH);
        N(true);
        return hVarH;
    }

    public void a0(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1156q.size();
        m0();
        for (int i4 = 0; i4 < size; i4++) {
            h hVar = this.f1156q.get(i4);
            if (hVar.getGroupId() == groupId && hVar.p() && hVar.isCheckable()) {
                hVar.v(hVar == menuItem);
            }
        }
        l0();
    }

    @Override // android.view.Menu
    public MenuItem add(int i4) {
        return a(0, 0, 0, this.f1152m.getString(i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.f1151l.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i4);
        }
        for (int i9 = 0; i9 < size; i9++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i10 < 0 ? intent : intentArr[i10]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i4, i5, i6, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, this.f1152m.getString(i4));
    }

    public void b(j jVar) {
        c(jVar, this.f1151l);
    }

    public e b0(int i4) {
        d0(0, null, i4, null, null);
        return this;
    }

    public void c(j jVar, Context context) {
        this.H.add(new WeakReference<>(jVar));
        jVar.h(context, this);
        this.f1161v = true;
    }

    public e c0(Drawable drawable) {
        d0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        h hVar = this.I;
        if (hVar != null) {
            g(hVar);
        }
        this.f1156q.clear();
        N(true);
    }

    public void clearHeader() {
        this.f1165z = null;
        this.f1164y = null;
        this.A = null;
        N(false);
    }

    @Override // android.view.Menu
    public void close() {
        f(true);
    }

    public void d() {
        a aVar = this.f1155p;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public final void d0(int i4, CharSequence charSequence, int i5, Drawable drawable, View view) {
        Resources resourcesF = F();
        if (view != null) {
            this.A = view;
            this.f1164y = null;
            this.f1165z = null;
        } else {
            if (i4 > 0) {
                this.f1164y = resourcesF.getText(i4);
            } else if (charSequence != null) {
                this.f1164y = charSequence;
            }
            if (i5 > 0) {
                this.f1165z = b0.e.h(x(), i5);
            } else if (drawable != null) {
                this.f1165z = drawable;
            }
            this.A = null;
        }
        N(false);
    }

    public void e() {
        this.B = true;
        clear();
        clearHeader();
        this.H.clear();
        this.B = false;
        this.C = false;
        this.D = false;
        N(true);
    }

    public e e0(int i4) {
        d0(i4, null, 0, null, null);
        return this;
    }

    public final void f(boolean z3) {
        if (this.F) {
            return;
        }
        this.F = true;
        for (WeakReference<j> weakReference : this.H) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.H.remove(weakReference);
            } else {
                jVar.b(this, z3);
            }
        }
        this.F = false;
    }

    public e f0(CharSequence charSequence) {
        d0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i4) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            h hVar = this.f1156q.get(i5);
            if (hVar.getItemId() == i4) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (menuItemFindItem = hVar.getSubMenu().findItem(i4)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public boolean g(h hVar) {
        boolean zJ = false;
        if (!this.H.isEmpty() && this.I == hVar) {
            m0();
            for (WeakReference<j> weakReference : this.H) {
                j jVar = weakReference.get();
                if (jVar != null) {
                    zJ = jVar.j(this, hVar);
                    if (zJ) {
                        break;
                    }
                } else {
                    this.H.remove(weakReference);
                }
            }
            l0();
            if (zJ) {
                this.I = null;
            }
        }
        return zJ;
    }

    public e g0(View view) {
        d0(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i4) {
        return this.f1156q.get(i4);
    }

    public final h h(int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        return new h(this, i4, i5, i6, i7, charSequence, i8);
    }

    public void h0(boolean z3) {
        this.E = z3;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.K) {
            return true;
        }
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (this.f1156q.get(i4).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean i(@j0 e eVar, @j0 MenuItem menuItem) {
        a aVar = this.f1155p;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public void i0(boolean z3) {
        this.K = z3;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return s(i4, keyEvent) != null;
    }

    public final void j(boolean z3) {
        if (this.H.isEmpty()) {
            return;
        }
        m0();
        for (WeakReference<j> weakReference : this.H) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.H.remove(weakReference);
            } else {
                jVar.n(z3);
            }
        }
        l0();
    }

    public void j0(boolean z3) {
        if (this.f1154o == z3) {
            return;
        }
        k0(z3);
        N(false);
    }

    public final void k(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(M);
        if (sparseParcelableArray == null || this.H.isEmpty()) {
            return;
        }
        for (WeakReference<j> weakReference : this.H) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.H.remove(weakReference);
            } else {
                int iA = jVar.a();
                if (iA > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(iA)) != null) {
                    jVar.i(parcelable);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f1152m
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f1151l
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f1151l
            boolean r3 = v0.p2.g(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f1154o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.k0(boolean):void");
    }

    public final void l(Bundle bundle) {
        Parcelable parcelableG;
        if (this.H.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<j> weakReference : this.H) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.H.remove(weakReference);
            } else {
                int iA = jVar.a();
                if (iA > 0 && (parcelableG = jVar.g()) != null) {
                    sparseArray.put(iA, parcelableG);
                }
            }
        }
        bundle.putSparseParcelableArray(M, sparseArray);
    }

    public void l0() {
        this.B = false;
        if (this.C) {
            this.C = false;
            N(this.D);
        }
    }

    public final boolean m(m mVar, j jVar) {
        if (this.H.isEmpty()) {
            return false;
        }
        boolean zM = jVar != null ? jVar.m(mVar) : false;
        for (WeakReference<j> weakReference : this.H) {
            j jVar2 = weakReference.get();
            if (jVar2 == null) {
                this.H.remove(weakReference);
            } else if (!zM) {
                zM = jVar2.m(mVar);
            }
        }
        return zM;
    }

    public void m0() {
        if (this.B) {
            return;
        }
        this.B = true;
        this.C = false;
        this.D = false;
    }

    public boolean n(h hVar) {
        boolean zK = false;
        if (this.H.isEmpty()) {
            return false;
        }
        m0();
        for (WeakReference<j> weakReference : this.H) {
            j jVar = weakReference.get();
            if (jVar != null) {
                zK = jVar.k(this, hVar);
                if (zK) {
                    break;
                }
            } else {
                this.H.remove(weakReference);
            }
        }
        l0();
        if (zK) {
            this.I = hVar;
        }
        return zK;
    }

    public int o(int i4) {
        return p(i4, 0);
    }

    public int p(int i4, int i5) {
        int size = size();
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < size) {
            if (this.f1156q.get(i5).getGroupId() == i4) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i4, int i5) {
        return O(findItem(i4), i5);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        h hVarS = s(i4, keyEvent);
        boolean zO = hVarS != null ? O(hVarS, i5) : false;
        if ((i5 & 2) != 0) {
            f(true);
        }
        return zO;
    }

    public int r(int i4) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            if (this.f1156q.get(i5).getItemId() == i4) {
                return i5;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public void removeGroup(int i4) {
        int iO = o(i4);
        if (iO >= 0) {
            int size = this.f1156q.size() - iO;
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i5 >= size || this.f1156q.get(iO).getGroupId() != i4) {
                    break;
                }
                R(iO, false);
                i5 = i6;
            }
            N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i4) {
        R(r(i4), true);
    }

    public h s(int i4, KeyEvent keyEvent) {
        ArrayList<h> arrayList = this.G;
        arrayList.clear();
        t(arrayList, i4, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zJ = J();
        for (int i5 = 0; i5 < size; i5++) {
            h hVar = arrayList.get(i5);
            char alphabeticShortcut = zJ ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zJ && alphabeticShortcut == '\b' && i4 == 67))) {
                return hVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i4, boolean z3, boolean z4) {
        int size = this.f1156q.size();
        for (int i5 = 0; i5 < size; i5++) {
            h hVar = this.f1156q.get(i5);
            if (hVar.getGroupId() == i4) {
                hVar.w(z4);
                hVar.setCheckable(z3);
            }
        }
    }

    @Override // l0.a, android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.J = z3;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i4, boolean z3) {
        int size = this.f1156q.size();
        for (int i5 = 0; i5 < size; i5++) {
            h hVar = this.f1156q.get(i5);
            if (hVar.getGroupId() == i4) {
                hVar.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i4, boolean z3) {
        int size = this.f1156q.size();
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            h hVar = this.f1156q.get(i5);
            if (hVar.getGroupId() == i4 && hVar.B(z3)) {
                z4 = true;
            }
        }
        if (z4) {
            N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f1153n = z3;
        N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1156q.size();
    }

    public void t(List<h> list, int i4, KeyEvent keyEvent) {
        boolean zJ = J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i4 == 67) {
            int size = this.f1156q.size();
            for (int i5 = 0; i5 < size; i5++) {
                h hVar = this.f1156q.get(i5);
                if (hVar.hasSubMenu()) {
                    ((e) hVar.getSubMenu()).t(list, i4, keyEvent);
                }
                char alphabeticShortcut = zJ ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
                if (((modifiers & l0.a.f8431e) == ((zJ ? hVar.getAlphabeticModifiers() : hVar.getNumericModifiers()) & l0.a.f8431e)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zJ && alphabeticShortcut == '\b' && i4 == 67)) && hVar.isEnabled()) {
                        list.add(hVar);
                    }
                }
            }
        }
    }

    public void u() {
        ArrayList<h> arrayListH = H();
        if (this.f1161v) {
            boolean zF = false;
            for (WeakReference<j> weakReference : this.H) {
                j jVar = weakReference.get();
                if (jVar == null) {
                    this.H.remove(weakReference);
                } else {
                    zF |= jVar.f();
                }
            }
            if (zF) {
                this.f1159t.clear();
                this.f1160u.clear();
                int size = arrayListH.size();
                for (int i4 = 0; i4 < size; i4++) {
                    h hVar = arrayListH.get(i4);
                    (hVar.o() ? this.f1159t : this.f1160u).add(hVar);
                }
            } else {
                this.f1159t.clear();
                this.f1160u.clear();
                this.f1160u.addAll(H());
            }
            this.f1161v = false;
        }
    }

    public ArrayList<h> v() {
        u();
        return this.f1159t;
    }

    public String w() {
        return N;
    }

    public Context x() {
        return this.f1151l;
    }

    public h y() {
        return this.I;
    }

    public Drawable z() {
        return this.f1165z;
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, int i7) {
        return a(i4, i5, i6, this.f1152m.getString(i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return addSubMenu(i4, i5, i6, this.f1152m.getString(i7));
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return a(i4, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        h hVar = (h) a(i4, i5, i6, charSequence);
        m mVar = new m(this.f1151l, this, hVar);
        hVar.A(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }
}
