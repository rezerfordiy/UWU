package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import c.r0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public abstract class a implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f1087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f1088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f1089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f1090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LayoutInflater f1091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j.a f1092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f1095j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1096k;

    public a(Context context, int i4, int i5) {
        this.f1087b = context;
        this.f1090e = LayoutInflater.from(context);
        this.f1093h = i4;
        this.f1094i = i5;
    }

    @Override // androidx.appcompat.view.menu.j
    public int a() {
        return this.f1096k;
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z3) {
        j.a aVar = this.f1092g;
        if (aVar != null) {
            aVar.b(eVar, z3);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public k d(ViewGroup viewGroup) {
        if (this.f1095j == null) {
            k kVar = (k) this.f1090e.inflate(this.f1093h, viewGroup, false);
            this.f1095j = kVar;
            kVar.b(this.f1089d);
            n(true);
        }
        return this.f1095j;
    }

    public void e(View view, int i4) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1095j).addView(view, i4);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(Context context, e eVar) {
        this.f1088c = context;
        this.f1091f = LayoutInflater.from(context);
        this.f1089d = eVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j(e eVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(e eVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(j.a aVar) {
        this.f1092g = aVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.j
    public boolean m(m mVar) {
        j.a aVar = this.f1092g;
        e eVar = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            eVar = this.f1089d;
        }
        return aVar.c(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void n(boolean z3) {
        ViewGroup viewGroup = (ViewGroup) this.f1095j;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f1089d;
        int i4 = 0;
        if (eVar != null) {
            eVar.u();
            ArrayList<h> arrayListH = this.f1089d.H();
            int size = arrayListH.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                h hVar = arrayListH.get(i6);
                if (u(i5, hVar)) {
                    View childAt = viewGroup.getChildAt(i5);
                    h itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View viewS = s(hVar, childAt, viewGroup);
                    if (hVar != itemData) {
                        viewS.setPressed(false);
                        viewS.jumpDrawablesToCurrentState();
                    }
                    if (viewS != childAt) {
                        e(viewS, i5);
                    }
                    i5++;
                }
            }
            i4 = i5;
        }
        while (i4 < viewGroup.getChildCount()) {
            if (!q(viewGroup, i4)) {
                i4++;
            }
        }
    }

    public abstract void o(h hVar, k.a aVar);

    public k.a p(ViewGroup viewGroup) {
        return (k.a) this.f1090e.inflate(this.f1094i, viewGroup, false);
    }

    public boolean q(ViewGroup viewGroup, int i4) {
        viewGroup.removeViewAt(i4);
        return true;
    }

    public j.a r() {
        return this.f1092g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View s(h hVar, View view, ViewGroup viewGroup) {
        k.a aVarP = view instanceof k.a ? (k.a) view : p(viewGroup);
        o(hVar, aVarP);
        return (View) aVarP;
    }

    public void t(int i4) {
        this.f1096k = i4;
    }

    public boolean u(int i4, h hVar) {
        return true;
    }
}
