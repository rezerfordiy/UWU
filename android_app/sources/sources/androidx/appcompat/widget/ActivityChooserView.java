package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.c;
import c.r0;
import e.a;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public class ActivityChooserView extends ViewGroup implements c.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f1307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f1308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f1309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Drawable f1310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f1311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f1312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FrameLayout f1313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f1314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1315j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v0.b f1316k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DataSetObserver f1317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f1318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ListPopupWindow f1319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PopupWindow.OnDismissListener f1320o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1321p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1322q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1323r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1324s;

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f1325b = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            e1 e1VarF = e1.F(context, attributeSet, f1325b);
            setBackgroundDrawable(e1VarF.h(0));
            e1VarF.I();
        }
    }

    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f1307b.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f1307b.notifyDataSetInvalidated();
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.b()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().e();
                v0.b bVar = ActivityChooserView.this.f1316k;
                if (bVar != null) {
                    bVar.m(true);
                }
            }
        }
    }

    public class c extends View.AccessibilityDelegate {
        public c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            w0.e0.V1(accessibilityNodeInfo).R0(true);
        }
    }

    public class d extends k0 {
        public d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.k0
        public k.f b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.k0
        public boolean c() {
            ActivityChooserView.this.c();
            return true;
        }

        @Override // androidx.appcompat.widget.k0
        public boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.e();
        }
    }

    public class f extends BaseAdapter {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f1331h = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f1332i = 4;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f1333j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f1334k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f1335l = 3;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.appcompat.widget.c f1336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1337c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1338d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f1339e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1340f;

        public f() {
        }

        public int a() {
            return this.f1336b.f();
        }

        public androidx.appcompat.widget.c b() {
            return this.f1336b;
        }

        public ResolveInfo c() {
            return this.f1336b.h();
        }

        public int d() {
            return this.f1336b.j();
        }

        public boolean e() {
            return this.f1338d;
        }

        public int f() {
            int i4 = this.f1337c;
            this.f1337c = f1331h;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int iMax = 0;
            View view = null;
            for (int i5 = 0; i5 < count; i5++) {
                view = getView(i5, view, null);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredWidth());
            }
            this.f1337c = i4;
            return iMax;
        }

        public void g(androidx.appcompat.widget.c cVar) {
            androidx.appcompat.widget.c cVarB = ActivityChooserView.this.f1307b.b();
            if (cVarB != null && ActivityChooserView.this.isShown()) {
                cVarB.unregisterObserver(ActivityChooserView.this.f1317l);
            }
            this.f1336b = cVar;
            if (cVar != null && ActivityChooserView.this.isShown()) {
                cVar.registerObserver(ActivityChooserView.this.f1317l);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int iF = this.f1336b.f();
            if (!this.f1338d && this.f1336b.h() != null) {
                iF--;
            }
            int iMin = Math.min(iF, this.f1337c);
            return this.f1340f ? iMin + 1 : iMin;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            int itemViewType = getItemViewType(i4);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f1338d && this.f1336b.h() != null) {
                i4++;
            }
            return this.f1336b.e(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            return (this.f1340f && i4 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i4);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.k.f7179h, viewGroup, false);
                viewInflate.setId(1);
                ((TextView) viewInflate.findViewById(a.h.L1)).setText(ActivityChooserView.this.getContext().getString(a.l.f7202e));
                return viewInflate;
            }
            if (view == null || view.getId() != a.h.E0) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.k.f7179h, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(a.h.f7149w0);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i4);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(a.h.L1)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f1338d && i4 == 0 && this.f1339e) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        public void h(int i4) {
            if (this.f1337c != i4) {
                this.f1337c = i4;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z3, boolean z4) {
            if (this.f1338d == z3 && this.f1339e == z4) {
                return;
            }
            this.f1338d = z3;
            this.f1339e = z4;
            notifyDataSetChanged();
        }

        public void j(boolean z3) {
            if (this.f1340f != z3) {
                this.f1340f = z3;
                notifyDataSetChanged();
            }
        }
    }

    public class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public g() {
        }

        public final void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f1320o;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f1313h) {
                if (view != activityChooserView.f1311f) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.f1321p = false;
                activityChooserView.d(activityChooserView.f1322q);
                return;
            }
            activityChooserView.a();
            Intent intentB = ActivityChooserView.this.f1307b.b().b(ActivityChooserView.this.f1307b.b().g(ActivityChooserView.this.f1307b.c()));
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            a();
            v0.b bVar = ActivityChooserView.this.f1316k;
            if (bVar != null) {
                bVar.m(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i4);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.d(f.f1331h);
                return;
            }
            ActivityChooserView.this.a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.f1321p) {
                if (i4 > 0) {
                    activityChooserView.f1307b.b().r(i4);
                    return;
                }
                return;
            }
            if (!activityChooserView.f1307b.e()) {
                i4++;
            }
            Intent intentB = ActivityChooserView.this.f1307b.b().b(i4);
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f1313h) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.f1307b.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.f1321p = true;
                activityChooserView2.d(activityChooserView2.f1322q);
            }
            return true;
        }
    }

    public ActivityChooserView(@c.j0 Context context) {
        this(context, null);
    }

    public boolean a() {
        if (!b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f1318m);
        return true;
    }

    public boolean b() {
        return getListPopupWindow().c();
    }

    public boolean c() {
        if (b() || !this.f1323r) {
            return false;
        }
        this.f1321p = false;
        d(this.f1322q);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
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
    public void d(int i4) {
        f fVar;
        if (this.f1307b.b() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f1318m);
        ?? r02 = this.f1313h.getVisibility() == 0 ? 1 : 0;
        int iA = this.f1307b.a();
        if (i4 == Integer.MAX_VALUE || iA <= i4 + r02) {
            this.f1307b.j(false);
            fVar = this.f1307b;
        } else {
            this.f1307b.j(true);
            fVar = this.f1307b;
            i4--;
        }
        fVar.h(i4);
        ListPopupWindow listPopupWindow = getListPopupWindow();
        if (listPopupWindow.c()) {
            return;
        }
        if (this.f1321p || r02 == 0) {
            this.f1307b.i(true, r02);
        } else {
            this.f1307b.i(false, false);
        }
        listPopupWindow.U(Math.min(this.f1307b.f(), this.f1315j));
        listPopupWindow.e();
        v0.b bVar = this.f1316k;
        if (bVar != null) {
            bVar.m(true);
        }
        listPopupWindow.p().setContentDescription(getContext().getString(a.l.f7203f));
        listPopupWindow.p().setSelector(new ColorDrawable(0));
    }

    public void e() {
        View view;
        Drawable drawable;
        if (this.f1307b.getCount() > 0) {
            this.f1311f.setEnabled(true);
        } else {
            this.f1311f.setEnabled(false);
        }
        int iA = this.f1307b.a();
        int iD = this.f1307b.d();
        if (iA == 1 || (iA > 1 && iD > 0)) {
            this.f1313h.setVisibility(0);
            ResolveInfo resolveInfoC = this.f1307b.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f1314i.setImageDrawable(resolveInfoC.loadIcon(packageManager));
            if (this.f1324s != 0) {
                this.f1313h.setContentDescription(getContext().getString(this.f1324s, resolveInfoC.loadLabel(packageManager)));
            }
        } else {
            this.f1313h.setVisibility(8);
        }
        if (this.f1313h.getVisibility() == 0) {
            view = this.f1309d;
            drawable = this.f1310e;
        } else {
            view = this.f1309d;
            drawable = null;
        }
        view.setBackgroundDrawable(drawable);
    }

    @c.r0({r0.a.LIBRARY})
    public androidx.appcompat.widget.c getDataModel() {
        return this.f1307b.b();
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.f1319n == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f1319n = listPopupWindow;
            listPopupWindow.s(this.f1307b);
            this.f1319n.S(this);
            this.f1319n.d0(true);
            this.f1319n.f0(this.f1308c);
            this.f1319n.e0(this.f1308c);
        }
        return this.f1319n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.c cVarB = this.f1307b.b();
        if (cVarB != null) {
            cVarB.registerObserver(this.f1317l);
        }
        this.f1323r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.c cVarB = this.f1307b.b();
        if (cVarB != null) {
            cVarB.unregisterObserver(this.f1317l);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1318m);
        }
        if (b()) {
            a();
        }
        this.f1323r = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        this.f1309d.layout(0, 0, i6 - i4, i7 - i5);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        View view = this.f1309d;
        if (this.f1313h.getVisibility() != 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5), w.b.f12287g);
        }
        measureChild(view, i4, i5);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.c.a
    @c.r0({r0.a.LIBRARY})
    public void setActivityChooserModel(androidx.appcompat.widget.c cVar) {
        this.f1307b.g(cVar);
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i4) {
        this.f1324s = i4;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i4) {
        this.f1312g.setContentDescription(getContext().getString(i4));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1312g.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i4) {
        this.f1322q = i4;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1320o = onDismissListener;
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setProvider(v0.b bVar) {
        this.f1316k = bVar;
    }

    public ActivityChooserView(@c.j0 Context context, @c.k0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@c.j0 Context context, @c.k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1317l = new a();
        this.f1318m = new b();
        this.f1322q = 4;
        int[] iArr = a.n.Q;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        z1.x1(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i4, 0);
        this.f1322q = typedArrayObtainStyledAttributes.getInt(a.n.S, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(a.n.R);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(a.k.f7178g, (ViewGroup) this, true);
        g gVar = new g();
        this.f1308c = gVar;
        View viewFindViewById = findViewById(a.h.Z);
        this.f1309d = viewFindViewById;
        this.f1310e = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(a.h.f7122n0);
        this.f1313h = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i5 = a.h.f7155y0;
        this.f1314i = (ImageView) frameLayout.findViewById(i5);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(a.h.f7131q0);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.f1311f = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i5);
        this.f1312g = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.f1307b = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.f1315j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.f.f7024x));
    }
}
