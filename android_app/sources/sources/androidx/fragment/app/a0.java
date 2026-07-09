package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends Fragment {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f3780w0 = 16711681;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f3781x0 = 16711682;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f3782y0 = 16711683;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final Handler f3783l0 = new Handler();

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final Runnable f3784m0 = new a();

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f3785n0 = new b();

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ListAdapter f3786o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ListView f3787p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View f3788q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextView f3789r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public View f3790s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public View f3791t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public CharSequence f3792u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f3793v0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = a0.this.f3787p0;
            listView.focusableViewAvailable(listView);
        }
    }

    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            a0.this.K2((ListView) adapterView, view, i4, j4);
        }
    }

    public final void F2() {
        if (this.f3787p0 != null) {
            return;
        }
        View viewF0 = f0();
        if (viewF0 == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (viewF0 instanceof ListView) {
            this.f3787p0 = (ListView) viewF0;
        } else {
            TextView textView = (TextView) viewF0.findViewById(f3780w0);
            this.f3789r0 = textView;
            if (textView == null) {
                this.f3788q0 = viewF0.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f3790s0 = viewF0.findViewById(f3781x0);
            this.f3791t0 = viewF0.findViewById(f3782y0);
            View viewFindViewById = viewF0.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.f3787p0 = listView;
            View view = this.f3788q0;
            if (view == null) {
                CharSequence charSequence = this.f3792u0;
                if (charSequence != null) {
                    this.f3789r0.setText(charSequence);
                    listView = this.f3787p0;
                    view = this.f3789r0;
                    listView.setEmptyView(view);
                }
            } else {
                listView.setEmptyView(view);
            }
        }
        this.f3793v0 = true;
        this.f3787p0.setOnItemClickListener(this.f3785n0);
        ListAdapter listAdapter = this.f3786o0;
        if (listAdapter != null) {
            this.f3786o0 = null;
            N2(listAdapter);
        } else if (this.f3790s0 != null) {
            P2(false, false);
        }
        this.f3783l0.post(this.f3784m0);
    }

    @k0
    public ListAdapter G2() {
        return this.f3786o0;
    }

    @j0
    public ListView H2() {
        F2();
        return this.f3787p0;
    }

    public long I2() {
        F2();
        return this.f3787p0.getSelectedItemId();
    }

    public int J2() {
        F2();
        return this.f3787p0.getSelectedItemPosition();
    }

    public void K2(@j0 ListView listView, @j0 View view, int i4, long j4) {
    }

    @Override // androidx.fragment.app.Fragment
    @k0
    public View L0(@j0 LayoutInflater layoutInflater, @k0 ViewGroup viewGroup, @k0 Bundle bundle) {
        Context contextO1 = O1();
        FrameLayout frameLayout = new FrameLayout(contextO1);
        LinearLayout linearLayout = new LinearLayout(contextO1);
        linearLayout.setId(f3781x0);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextO1, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextO1);
        frameLayout2.setId(f3782y0);
        TextView textView = new TextView(contextO1);
        textView.setId(f3780w0);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextO1);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @j0
    public final ListAdapter L2() {
        ListAdapter listAdapterG2 = G2();
        if (listAdapterG2 != null) {
            return listAdapterG2;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    public void M2(@k0 CharSequence charSequence) {
        F2();
        TextView textView = this.f3789r0;
        if (textView == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        textView.setText(charSequence);
        if (this.f3792u0 == null) {
            this.f3787p0.setEmptyView(this.f3789r0);
        }
        this.f3792u0 = charSequence;
    }

    public void N2(@k0 ListAdapter listAdapter) {
        boolean z3 = this.f3786o0 != null;
        this.f3786o0 = listAdapter;
        ListView listView = this.f3787p0;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.f3793v0 || z3) {
                return;
            }
            P2(true, S1().getWindowToken() != null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void O0() {
        this.f3783l0.removeCallbacks(this.f3784m0);
        this.f3787p0 = null;
        this.f3793v0 = false;
        this.f3791t0 = null;
        this.f3790s0 = null;
        this.f3788q0 = null;
        this.f3789r0 = null;
        super.O0();
    }

    public void O2(boolean z3) {
        P2(z3, true);
    }

    public final void P2(boolean z3, boolean z4) {
        F2();
        View view = this.f3790s0;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f3793v0 == z3) {
            return;
        }
        this.f3793v0 = z3;
        if (z3) {
            if (z4) {
                view.startAnimation(AnimationUtils.loadAnimation(u(), R.anim.fade_out));
                this.f3791t0.startAnimation(AnimationUtils.loadAnimation(u(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.f3791t0.clearAnimation();
            }
            this.f3790s0.setVisibility(8);
            this.f3791t0.setVisibility(0);
            return;
        }
        if (z4) {
            view.startAnimation(AnimationUtils.loadAnimation(u(), R.anim.fade_in));
            this.f3791t0.startAnimation(AnimationUtils.loadAnimation(u(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.f3791t0.clearAnimation();
        }
        this.f3790s0.setVisibility(0);
        this.f3791t0.setVisibility(8);
    }

    public void Q2(boolean z3) {
        P2(z3, false);
    }

    public void R2(int i4) {
        F2();
        this.f3787p0.setSelection(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void g1(@j0 View view, @k0 Bundle bundle) {
        super.g1(view, bundle);
        F2();
    }
}
