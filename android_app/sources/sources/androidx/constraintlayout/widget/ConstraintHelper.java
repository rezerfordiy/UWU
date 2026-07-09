package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.e;
import java.util.Arrays;
import java.util.HashMap;
import v.i;
import v.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f2216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f2218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f2219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f2222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View[] f2223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HashMap<Integer, String> f2224j;

    public ConstraintHelper(Context context) {
        super(context);
        this.f2216b = new int[32];
        this.f2220f = false;
        this.f2223i = null;
        this.f2224j = new HashMap<>();
        this.f2218d = context;
        o(null);
    }

    public final void e(String str) {
        if (str == null || str.length() == 0 || this.f2218d == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iM = m(strTrim);
        if (iM != 0) {
            this.f2224j.put(Integer.valueOf(iM), strTrim);
            f(iM);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    public final void f(int i4) {
        if (i4 == getId()) {
            return;
        }
        int i5 = this.f2217c + 1;
        int[] iArr = this.f2216b;
        if (i5 > iArr.length) {
            this.f2216b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2216b;
        int i6 = this.f2217c;
        iArr2[i6] = i4;
        this.f2217c = i6 + 1;
    }

    public final void g(String str) {
        if (str == null || str.length() == 0 || this.f2218d == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).V)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    f(childAt.getId());
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2216b, this.f2217c);
    }

    public void h(View view) {
        if (view == this) {
            return;
        }
        if (view.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else {
            if (view.getParent() == null) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
                return;
            }
            this.f2221g = null;
            f(view.getId());
            requestLayout();
        }
    }

    public void i() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        j((ConstraintLayout) parent);
    }

    public void j(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i4 = 0; i4 < this.f2217c; i4++) {
            View viewJ = constraintLayout.j(this.f2216b[i4]);
            if (viewJ != null) {
                viewJ.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewJ.setTranslationZ(viewJ.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int[] k(View view, String str) {
        String[] strArrSplit = str.split(",");
        view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i4 = 0;
        for (String str2 : strArrSplit) {
            int iM = m(str2.trim());
            if (iM != 0) {
                iArr[i4] = iM;
                i4++;
            }
        }
        return i4 != strArrSplit.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    public final int l(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f2218d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int m(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iL = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objG = constraintLayout.g(0, str);
            if (objG instanceof Integer) {
                iL = ((Integer) objG).intValue();
            }
        }
        if (iL == 0 && constraintLayout != null) {
            iL = l(constraintLayout, str);
        }
        if (iL == 0) {
            try {
                iL = e.g.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iL == 0 ? this.f2218d.getResources().getIdentifier(str, j2.a.f8286f, this.f2218d.getPackageName()) : iL;
    }

    public View[] n(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f2223i;
        if (viewArr == null || viewArr.length != this.f2217c) {
            this.f2223i = new View[this.f2217c];
        }
        for (int i4 = 0; i4 < this.f2217c; i4++) {
            this.f2223i[i4] = constraintLayout.j(this.f2216b[i4]);
        }
        return this.f2223i;
    }

    public void o(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.U5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == e.m.o6) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f2221g = string;
                    setIds(string);
                } else if (index == e.m.p6) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f2222h = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2221g;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2222h;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        if (this.f2220f) {
            super.onMeasure(i4, i5);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(d.a aVar, j jVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<v.e> sparseArray) {
        d.b bVar = aVar.f2465d;
        int[] iArr = bVar.f2504e0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.f2506f0;
            if (str != null && str.length() > 0) {
                d.b bVar2 = aVar.f2465d;
                bVar2.f2504e0 = k(this, bVar2.f2506f0);
            }
        }
        jVar.b();
        if (aVar.f2465d.f2504e0 == null) {
            return;
        }
        int i4 = 0;
        while (true) {
            int[] iArr2 = aVar.f2465d.f2504e0;
            if (i4 >= iArr2.length) {
                return;
            }
            v.e eVar = sparseArray.get(iArr2[i4]);
            if (eVar != null) {
                jVar.a(eVar);
            }
            i4++;
        }
    }

    public void q(View view) {
        int i4;
        int id = view.getId();
        if (id == -1) {
            return;
        }
        this.f2221g = null;
        int i5 = 0;
        while (true) {
            if (i5 >= this.f2217c) {
                break;
            }
            if (this.f2216b[i5] == id) {
                while (true) {
                    i4 = this.f2217c;
                    if (i5 >= i4 - 1) {
                        break;
                    }
                    int[] iArr = this.f2216b;
                    int i6 = i5 + 1;
                    iArr[i5] = iArr[i6];
                    i5 = i6;
                }
                this.f2216b[i4 - 1] = 0;
                this.f2217c = i4 - 1;
            } else {
                i5++;
            }
        }
        requestLayout();
    }

    public void r(v.e eVar, boolean z3) {
    }

    public void s(ConstraintLayout constraintLayout) {
    }

    public void setIds(String str) {
        this.f2221g = str;
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.f2217c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i4);
            if (iIndexOf == -1) {
                e(str.substring(i4));
                return;
            } else {
                e(str.substring(i4, iIndexOf));
                i4 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f2222h = str;
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.f2217c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i4);
            if (iIndexOf == -1) {
                g(str.substring(i4));
                return;
            } else {
                g(str.substring(i4, iIndexOf));
                i4 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2221g = null;
        this.f2217c = 0;
        for (int i4 : iArr) {
            f(i4);
        }
    }

    @Override // android.view.View
    public void setTag(int i4, Object obj) {
        super.setTag(i4, obj);
        if (obj == null && this.f2221g == null) {
            f(i4);
        }
    }

    public void t(ConstraintLayout constraintLayout) {
    }

    public void u(ConstraintLayout constraintLayout) {
    }

    public void v(ConstraintLayout constraintLayout) {
    }

    public void w(ConstraintLayout constraintLayout) {
        String str;
        int iL;
        if (isInEditMode()) {
            setIds(this.f2221g);
        }
        i iVar = this.f2219e;
        if (iVar == null) {
            return;
        }
        iVar.b();
        for (int i4 = 0; i4 < this.f2217c; i4++) {
            int i5 = this.f2216b[i4];
            View viewJ = constraintLayout.j(i5);
            if (viewJ == null && (iL = l(constraintLayout, (str = this.f2224j.get(Integer.valueOf(i5))))) != 0) {
                this.f2216b[i4] = iL;
                this.f2224j.put(Integer.valueOf(iL), str);
                viewJ = constraintLayout.j(iL);
            }
            if (viewJ != null) {
                this.f2219e.a(constraintLayout.m(viewJ));
            }
        }
        this.f2219e.c(constraintLayout.f2227d);
    }

    public void x(v.f fVar, i iVar, SparseArray<v.e> sparseArray) {
        iVar.b();
        for (int i4 = 0; i4 < this.f2217c; i4++) {
            iVar.a(sparseArray.get(this.f2216b[i4]));
        }
    }

    public void y() {
        if (this.f2219e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f2288n0 = (v.e) this.f2219e;
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2216b = new int[32];
        this.f2220f = false;
        this.f2223i = null;
        this.f2224j = new HashMap<>();
        this.f2218d = context;
        o(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f2216b = new int[32];
        this.f2220f = false;
        this.f2223i = null;
        this.f2224j = new HashMap<>();
        this.f2218d = context;
        o(attributeSet);
    }
}
