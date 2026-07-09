package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import c.k0;
import e.a;
import java.lang.ref.WeakReference;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public Handler R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.app.h f748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ListView f753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f759m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f761o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f762p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f763q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f764r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Button f765s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f766t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Message f767u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f768v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Button f769w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f770x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Message f771y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f772z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f760n = false;
    public int B = 0;
    public int I = -1;
    public int Q = 0;
    public final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f774c;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void a(boolean z3, boolean z4) {
            if (z4 && z3) {
                return;
            }
            setPadding(getPaddingLeft(), z3 ? getPaddingTop() : this.f773b, getPaddingRight(), z4 ? getPaddingBottom() : this.f774c);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.a6);
            this.f774c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.n.b6, -1);
            this.f773b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.n.c6, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message messageObtain = ((view != alertController.f761o || (message2 = alertController.f763q) == null) && (view != alertController.f765s || (message2 = alertController.f767u) == null)) ? (view != alertController.f769w || (message = alertController.f771y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f748b).sendToTarget();
        }
    }

    public class b implements NestedScrollView.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f777b;

        public b(View view, View view2) {
            this.f776a = view;
            this.f777b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.b
        public void a(NestedScrollView nestedScrollView, int i4, int i5, int i6, int i7) {
            AlertController.g(nestedScrollView, this.f776a, this.f777b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f780c;

        public c(View view, View view2) {
            this.f779b = view;
            this.f780c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.A, this.f779b, this.f780c);
        }
    }

    public class d implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f783c;

        public d(View view, View view2) {
            this.f782b = view;
            this.f783c = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
            AlertController.g(absListView, this.f782b, this.f783c);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i4) {
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f786c;

        public e(View view, View view2) {
            this.f785b = view;
            this.f786c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.f753g, this.f785b, this.f786c);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public boolean N;
        public AdapterView.OnItemSelectedListener O;
        public e P;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f789b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f791d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f793f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f794g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f795h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f796i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f797j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f798k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f799l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f800m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f801n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f802o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f803p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f804q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f806s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f807t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f808u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f809v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f810w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f811x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f812y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f813z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f790c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f792e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean Q = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f805r = true;

        public class a extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f814b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i4, int i5, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i4, i5, charSequenceArr);
                this.f814b = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i4, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i4, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i4]) {
                    this.f814b.setItemChecked(i4, true);
                }
                return view2;
            }
        }

        public class b extends CursorAdapter {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f816b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f817c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f818d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AlertController f819e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context, Cursor cursor, boolean z3, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z3);
                this.f818d = recycleListView;
                this.f819e = alertController;
                Cursor cursor2 = getCursor();
                this.f816b = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f817c = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f816b));
                this.f818d.setItemChecked(cursor.getPosition(), cursor.getInt(this.f817c) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f789b.inflate(this.f819e.M, viewGroup, false);
            }
        }

        public class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlertController f821b;

            public c(AlertController alertController) {
                this.f821b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                f.this.f811x.onClick(this.f821b.f748b, i4);
                if (f.this.H) {
                    return;
                }
                this.f821b.f748b.dismiss();
            }
        }

        public class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f823b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AlertController f824c;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.f823b = recycleListView;
                this.f824c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i4] = this.f823b.isItemChecked(i4);
                }
                f.this.J.onClick(this.f824c.f748b, i4, this.f823b.isItemChecked(i4));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f788a = context;
            this.f789b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController alertController) {
            View view = this.f794g;
            if (view != null) {
                alertController.n(view);
            } else {
                CharSequence charSequence = this.f793f;
                if (charSequence != null) {
                    alertController.s(charSequence);
                }
                Drawable drawable = this.f791d;
                if (drawable != null) {
                    alertController.p(drawable);
                }
                int i4 = this.f790c;
                if (i4 != 0) {
                    alertController.o(i4);
                }
                int i5 = this.f792e;
                if (i5 != 0) {
                    alertController.o(alertController.d(i5));
                }
            }
            CharSequence charSequence2 = this.f795h;
            if (charSequence2 != null) {
                alertController.q(charSequence2);
            }
            CharSequence charSequence3 = this.f796i;
            if (charSequence3 != null || this.f797j != null) {
                alertController.l(-1, charSequence3, this.f798k, null, this.f797j);
            }
            CharSequence charSequence4 = this.f799l;
            if (charSequence4 != null || this.f800m != null) {
                alertController.l(-2, charSequence4, this.f801n, null, this.f800m);
            }
            CharSequence charSequence5 = this.f802o;
            if (charSequence5 != null || this.f803p != null) {
                alertController.l(-3, charSequence5, this.f804q, null, this.f803p);
            }
            if (this.f809v != null || this.K != null || this.f810w != null) {
                b(alertController);
            }
            View view2 = this.f813z;
            if (view2 != null) {
                if (this.E) {
                    alertController.v(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.u(view2);
                    return;
                }
            }
            int i6 = this.f812y;
            if (i6 != 0) {
                alertController.t(i6);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(androidx.appcompat.app.AlertController r10) {
            /*
                r9 = this;
                android.view.LayoutInflater r0 = r9.f789b
                int r1 = r10.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r9.G
                if (r1 == 0) goto L34
                android.database.Cursor r1 = r9.K
                if (r1 != 0) goto L25
                androidx.appcompat.app.AlertController$f$a r8 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r9.f788a
                int r4 = r10.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r9.f809v
                r1 = r8
                r2 = r9
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L68
            L25:
                androidx.appcompat.app.AlertController$f$b r8 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r9.f788a
                android.database.Cursor r4 = r9.K
                r5 = 0
                r1 = r8
                r2 = r9
                r6 = r0
                r7 = r10
                r1.<init>(r3, r4, r5, r6, r7)
                goto L68
            L34:
                boolean r1 = r9.H
                if (r1 == 0) goto L3b
                int r1 = r10.N
                goto L3d
            L3b:
                int r1 = r10.O
            L3d:
                r4 = r1
                android.database.Cursor r1 = r9.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5a
                android.widget.SimpleCursorAdapter r8 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r9.f788a
                android.database.Cursor r5 = r9.K
                java.lang.String r1 = r9.L
                java.lang.String[] r6 = new java.lang.String[]{r1}
                int[] r7 = new int[]{r2}
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                goto L68
            L5a:
                android.widget.ListAdapter r8 = r9.f810w
                if (r8 == 0) goto L5f
                goto L68
            L5f:
                androidx.appcompat.app.AlertController$h r8 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r9.f788a
                java.lang.CharSequence[] r3 = r9.f809v
                r8.<init>(r1, r4, r2, r3)
            L68:
                androidx.appcompat.app.AlertController$f$e r1 = r9.P
                if (r1 == 0) goto L6f
                r1.a(r0)
            L6f:
                r10.H = r8
                int r1 = r9.I
                r10.I = r1
                android.content.DialogInterface$OnClickListener r1 = r9.f811x
                if (r1 == 0) goto L82
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r10)
            L7e:
                r0.setOnItemClickListener(r1)
                goto L8c
            L82:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r9.J
                if (r1 == 0) goto L8c
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r10)
                goto L7e
            L8c:
                android.widget.AdapterView$OnItemSelectedListener r1 = r9.O
                if (r1 == 0) goto L93
                r0.setOnItemSelectedListener(r1)
            L93:
                boolean r1 = r9.H
                if (r1 == 0) goto L9c
                r1 = 1
            L98:
                r0.setChoiceMode(r1)
                goto La2
            L9c:
                boolean r1 = r9.G
                if (r1 == 0) goto La2
                r1 = 2
                goto L98
            La2:
                r10.f753g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.f.b(androidx.appcompat.app.AlertController):void");
        }
    }

    public static final class g extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f826b = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<DialogInterface> f827a;

        public g(DialogInterface dialogInterface) {
            this.f827a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == -3 || i4 == -2 || i4 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f827a.get(), message.what);
            } else {
                if (i4 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i4, int i5, CharSequence[] charSequenceArr) {
            super(context, i4, i5, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, androidx.appcompat.app.h hVar, Window window) {
        this.f747a = context;
        this.f748b = hVar;
        this.f749c = window;
        this.R = new g(hVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, a.n.T, a.c.M, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(a.n.U, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(a.n.W, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(a.n.Y, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(a.n.Z, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(a.n.f7354b0, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(a.n.X, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(a.n.f7349a0, true);
        this.f750d = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.n.V, 0);
        typedArrayObtainStyledAttributes.recycle();
        hVar.e(1);
    }

    public static boolean B(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.c.L, typedValue, true);
        return typedValue.data != 0;
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void g(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f A[PHI: r1
      0x009f: PHI (r1v6 android.view.View) = (r1v5 android.view.View), (r1v13 android.view.View) binds: [B:36:0x009d, B:32:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A() {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.A():void");
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public Button c(int i4) {
        if (i4 == -3) {
            return this.f769w;
        }
        if (i4 == -2) {
            return this.f765s;
        }
        if (i4 != -1) {
            return null;
        }
        return this.f761o;
    }

    public int d(int i4) {
        TypedValue typedValue = new TypedValue();
        this.f747a.getTheme().resolveAttribute(i4, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f753g;
    }

    public void f() {
        this.f748b.setContentView(k());
        A();
    }

    public boolean h(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.u(keyEvent);
    }

    public boolean i(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.u(keyEvent);
    }

    @k0
    public final ViewGroup j(@k0 View view, @k0 View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final int k() {
        int i4 = this.K;
        return (i4 != 0 && this.Q == 1) ? i4 : this.J;
    }

    public void l(int i4, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i4, onClickListener);
        }
        if (i4 == -3) {
            this.f770x = charSequence;
            this.f771y = message;
            this.f772z = drawable;
        } else if (i4 == -2) {
            this.f766t = charSequence;
            this.f767u = message;
            this.f768v = drawable;
        } else {
            if (i4 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f762p = charSequence;
            this.f763q = message;
            this.f764r = drawable;
        }
    }

    public void m(int i4) {
        this.Q = i4;
    }

    public void n(View view) {
        this.G = view;
    }

    public void o(int i4) {
        this.C = null;
        this.B = i4;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i4 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void p(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void q(CharSequence charSequence) {
        this.f752f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void r(ViewGroup viewGroup, View view, int i4, int i5) {
        View viewFindViewById = this.f749c.findViewById(a.h.W0);
        View viewFindViewById2 = this.f749c.findViewById(a.h.V0);
        z1.n2(view, i4, i5);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    public void s(CharSequence charSequence) {
        this.f751e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void t(int i4) {
        this.f754h = null;
        this.f755i = i4;
        this.f760n = false;
    }

    public void u(View view) {
        this.f754h = view;
        this.f755i = 0;
        this.f760n = false;
    }

    public void v(View view, int i4, int i5, int i6, int i7) {
        this.f754h = view;
        this.f755i = 0;
        this.f760n = true;
        this.f756j = i4;
        this.f757k = i5;
        this.f758l = i6;
        this.f759m = i7;
    }

    public final void w(ViewGroup viewGroup) {
        int i4;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(R.id.button1);
        this.f761o = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f762p) && this.f764r == null) {
            this.f761o.setVisibility(8);
            i4 = 0;
        } else {
            this.f761o.setText(this.f762p);
            Drawable drawable = this.f764r;
            if (drawable != null) {
                int i5 = this.f750d;
                drawable.setBounds(0, 0, i5, i5);
                this.f761o.setCompoundDrawables(this.f764r, null, null, null);
            }
            this.f761o.setVisibility(0);
            i4 = 1;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button2);
        this.f765s = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f766t) && this.f768v == null) {
            this.f765s.setVisibility(8);
        } else {
            this.f765s.setText(this.f766t);
            Drawable drawable2 = this.f768v;
            if (drawable2 != null) {
                int i6 = this.f750d;
                drawable2.setBounds(0, 0, i6, i6);
                this.f765s.setCompoundDrawables(this.f768v, null, null, null);
            }
            this.f765s.setVisibility(0);
            i4 |= 2;
        }
        Button button4 = (Button) viewGroup.findViewById(R.id.button3);
        this.f769w = button4;
        button4.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f770x) && this.f772z == null) {
            this.f769w.setVisibility(8);
        } else {
            this.f769w.setText(this.f770x);
            Drawable drawable3 = this.f772z;
            if (drawable3 != null) {
                int i7 = this.f750d;
                drawable3.setBounds(0, 0, i7, i7);
                this.f769w.setCompoundDrawables(this.f772z, null, null, null);
            }
            this.f769w.setVisibility(0);
            i4 |= 4;
        }
        if (B(this.f747a)) {
            if (i4 == 1) {
                button = this.f761o;
            } else if (i4 == 2) {
                button = this.f765s;
            } else if (i4 == 4) {
                button = this.f769w;
            }
            b(button);
        }
        if (i4 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void x(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f749c.findViewById(a.h.X0);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f752f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f753g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f753g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void y(ViewGroup viewGroup) {
        View viewInflate = this.f754h;
        if (viewInflate == null) {
            viewInflate = this.f755i != 0 ? LayoutInflater.from(this.f747a).inflate(this.f755i, viewGroup, false) : null;
        }
        boolean z3 = viewInflate != null;
        if (!z3 || !a(viewInflate)) {
            this.f749c.setFlags(131072, 131072);
        }
        if (!z3) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f749c.findViewById(a.h.f7113k0);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f760n) {
            frameLayout.setPadding(this.f756j, this.f757k, this.f758l, this.f759m);
        }
        if (this.f753g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    public final void z(ViewGroup viewGroup) {
        View viewFindViewById;
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            viewFindViewById = this.f749c.findViewById(a.h.N1);
        } else {
            this.D = (ImageView) this.f749c.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(this.f751e)) && this.P) {
                TextView textView = (TextView) this.f749c.findViewById(a.h.f7086b0);
                this.E = textView;
                textView.setText(this.f751e);
                int i4 = this.B;
                if (i4 != 0) {
                    this.D.setImageResource(i4);
                    return;
                }
                Drawable drawable = this.C;
                if (drawable != null) {
                    this.D.setImageDrawable(drawable);
                    return;
                } else {
                    this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
                    this.D.setVisibility(8);
                    return;
                }
            }
            this.f749c.findViewById(a.h.N1).setVisibility(8);
            this.D.setVisibility(8);
            viewFindViewById = viewGroup;
        }
        viewFindViewById.setVisibility(8);
    }
}
