package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import c.j0;
import c.k0;
import c.r0;
import c.s;
import c.u0;
import c.v0;
import e.a;

/* JADX INFO: loaded from: classes.dex */
public class c extends h implements DialogInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f933e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f934f = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlertController f935d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AlertController.f f936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f937b;

        public a(@j0 Context context) {
            this(context, c.i(context, 0));
        }

        public a A(DialogInterface.OnKeyListener onKeyListener) {
            this.f936a.f808u = onKeyListener;
            return this;
        }

        public a B(@u0 int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f936a;
            fVar.f796i = fVar.f788a.getText(i4);
            this.f936a.f798k = onClickListener;
            return this;
        }

        public a C(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f936a;
            fVar.f796i = charSequence;
            fVar.f798k = onClickListener;
            return this;
        }

        public a D(Drawable drawable) {
            this.f936a.f797j = drawable;
            return this;
        }

        @r0({r0.a.LIBRARY_GROUP_PREFIX})
        public a E(boolean z3) {
            this.f936a.Q = z3;
            return this;
        }

        public a F(@c.e int i4, int i5, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f936a;
            fVar.f809v = fVar.f788a.getResources().getTextArray(i4);
            AlertController.f fVar2 = this.f936a;
            fVar2.f811x = onClickListener;
            fVar2.I = i5;
            fVar2.H = true;
            return this;
        }

        public a G(Cursor cursor, int i4, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f936a;
            fVar.K = cursor;
            fVar.f811x = onClickListener;
            fVar.I = i4;
            fVar.L = str;
            fVar.H = true;
            return this;
        }

        public a H(ListAdapter listAdapter, int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f936a;
            fVar.f810w = listAdapter;
            fVar.f811x = onClickListener;
            fVar.I = i4;
            fVar.H = true;
            return this;
        }

        public a I(CharSequence[] charSequenceArr, int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f936a;
            fVar.f809v = charSequenceArr;
            fVar.f811x = onClickListener;
            fVar.I = i4;
            fVar.H = true;
            return this;
        }

        public a J(@u0 int i4) {
            AlertController.f fVar = this.f936a;
            fVar.f793f = fVar.f788a.getText(i4);
            return this;
        }

        public a K(@k0 CharSequence charSequence) {
            this.f936a.f793f = charSequence;
            return this;
        }

        public a L(int i4) {
            AlertController.f fVar = this.f936a;
            fVar.f813z = null;
            fVar.f812y = i4;
            fVar.E = false;
            return this;
        }

        public a M(View view) {
            AlertController.f fVar = this.f936a;
            fVar.f813z = view;
            fVar.f812y = 0;
            fVar.E = false;
            return this;
        }

        @r0({r0.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public a N(View view, int i4, int i5, int i6, int i7) {
            AlertController.f fVar = this.f936a;
            fVar.f813z = view;
            fVar.f812y = 0;
            fVar.E = true;
            fVar.A = i4;
            fVar.B = i5;
            fVar.C = i6;
            fVar.D = i7;
            return this;
        }

        public c O() {
            c cVarA = a();
            cVarA.show();
            return cVarA;
        }

        @j0
        public c a() {
            c cVar = new c(this.f936a.f788a, this.f937b);
            this.f936a.a(cVar.f935d);
            cVar.setCancelable(this.f936a.f805r);
            if (this.f936a.f805r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f936a.f806s);
            cVar.setOnDismissListener(this.f936a.f807t);
            DialogInterface.OnKeyListener onKeyListener = this.f936a.f808u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        @j0
        public Context b() {
            return this.f936a.f788a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f936a;
            fVar.f810w = listAdapter;
            fVar.f811x = onClickListener;
            return this;
        }

        public a d(boolean z3) {
            this.f936a.f805r = z3;
            return this;
        }

        public a e(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.f fVar = this.f936a;
            fVar.K = cursor;
            fVar.L = str;
            fVar.f811x = onClickListener;
            return this;
        }

        public a f(@k0 View view) {
            this.f936a.f794g = view;
            return this;
        }

        public a g(@s int i4) {
            this.f936a.f790c = i4;
            return this;
        }

        public a h(@k0 Drawable drawable) {
            this.f936a.f791d = drawable;
            return this;
        }

        public a i(@c.f int i4) {
            TypedValue typedValue = new TypedValue();
            this.f936a.f788a.getTheme().resolveAttribute(i4, typedValue, true);
            this.f936a.f790c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a j(boolean z3) {
            this.f936a.N = z3;
            return this;
        }

        public a k(@c.e int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f936a;
            fVar.f809v = fVar.f788a.getResources().getTextArray(i4);
            this.f936a.f811x = onClickListener;
            return this;
        }

        public a l(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f936a;
            fVar.f809v = charSequenceArr;
            fVar.f811x = onClickListener;
            return this;
        }

        public a m(@u0 int i4) {
            AlertController.f fVar = this.f936a;
            fVar.f795h = fVar.f788a.getText(i4);
            return this;
        }

        public a n(@k0 CharSequence charSequence) {
            this.f936a.f795h = charSequence;
            return this;
        }

        public a o(@c.e int i4, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f936a;
            fVar.f809v = fVar.f788a.getResources().getTextArray(i4);
            AlertController.f fVar2 = this.f936a;
            fVar2.J = onMultiChoiceClickListener;
            fVar2.F = zArr;
            fVar2.G = true;
            return this;
        }

        public a p(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f936a;
            fVar.K = cursor;
            fVar.J = onMultiChoiceClickListener;
            fVar.M = str;
            fVar.L = str2;
            fVar.G = true;
            return this;
        }

        public a q(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f936a;
            fVar.f809v = charSequenceArr;
            fVar.J = onMultiChoiceClickListener;
            fVar.F = zArr;
            fVar.G = true;
            return this;
        }

        public a r(@u0 int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f936a;
            fVar.f799l = fVar.f788a.getText(i4);
            this.f936a.f801n = onClickListener;
            return this;
        }

        public a s(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f936a;
            fVar.f799l = charSequence;
            fVar.f801n = onClickListener;
            return this;
        }

        public a t(Drawable drawable) {
            this.f936a.f800m = drawable;
            return this;
        }

        public a u(@u0 int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f936a;
            fVar.f802o = fVar.f788a.getText(i4);
            this.f936a.f804q = onClickListener;
            return this;
        }

        public a v(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f936a;
            fVar.f802o = charSequence;
            fVar.f804q = onClickListener;
            return this;
        }

        public a w(Drawable drawable) {
            this.f936a.f803p = drawable;
            return this;
        }

        public a x(DialogInterface.OnCancelListener onCancelListener) {
            this.f936a.f806s = onCancelListener;
            return this;
        }

        public a y(DialogInterface.OnDismissListener onDismissListener) {
            this.f936a.f807t = onDismissListener;
            return this;
        }

        public a z(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f936a.O = onItemSelectedListener;
            return this;
        }

        public a(@j0 Context context, @v0 int i4) {
            this.f936a = new AlertController.f(new ContextThemeWrapper(context, c.i(context, i4)));
            this.f937b = i4;
        }
    }

    public c(@j0 Context context) {
        this(context, 0);
    }

    public static int i(@j0 Context context, @v0 int i4) {
        if (((i4 >>> 24) & 255) >= 1) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.c.N, typedValue, true);
        return typedValue.resourceId;
    }

    public Button f(int i4) {
        return this.f935d.c(i4);
    }

    public ListView h() {
        return this.f935d.e();
    }

    public void j(int i4, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f935d.l(i4, charSequence, onClickListener, null, null);
    }

    public void l(int i4, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f935d.l(i4, charSequence, onClickListener, null, drawable);
    }

    public void m(int i4, CharSequence charSequence, Message message) {
        this.f935d.l(i4, charSequence, null, message, null);
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void n(int i4) {
        this.f935d.m(i4);
    }

    public void o(View view) {
        this.f935d.n(view);
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f935d.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (this.f935d.h(i4, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        if (this.f935d.i(i4, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i4, keyEvent);
    }

    public void q(int i4) {
        this.f935d.o(i4);
    }

    public void r(Drawable drawable) {
        this.f935d.p(drawable);
    }

    public void s(int i4) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i4, typedValue, true);
        this.f935d.o(typedValue.resourceId);
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f935d.s(charSequence);
    }

    public void t(CharSequence charSequence) {
        this.f935d.q(charSequence);
    }

    public void u(View view) {
        this.f935d.u(view);
    }

    public void v(View view, int i4, int i5, int i6, int i7) {
        this.f935d.v(view, i4, i5, i6, i7);
    }

    public c(@j0 Context context, @v0 int i4) {
        super(context, i(context, i4));
        this.f935d = new AlertController(getContext(), this, getWindow());
    }

    public c(@j0 Context context, boolean z3, @k0 DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z3);
        setOnCancelListener(onCancelListener);
    }
}
