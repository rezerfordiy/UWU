package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import c.r0;
import e.a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.dcm4che3.data.Tag;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements j.c {
    public static final boolean D0 = false;
    public static final String E0 = "SearchView";
    public static final String F0 = "nm";
    public static final n G0;
    public final AdapterView.OnItemClickListener A0;
    public final AdapterView.OnItemSelectedListener B0;
    public final SearchAutoComplete C;
    public TextWatcher C0;
    public final View D;
    public final View E;
    public final View F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;
    public final ImageView J;
    public final View K;
    public o L;
    public Rect M;
    public Rect N;
    public int[] O;
    public int[] P;
    public final ImageView Q;
    public final Drawable R;
    public final int S;
    public final int T;
    public final Intent U;
    public final Intent V;
    public final CharSequence W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public l f1479a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public k f1480b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public View.OnFocusChangeListener f1481c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public m f1482d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public View.OnClickListener f1483e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f1484f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f1485g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public a1.a f1486h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f1487i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public CharSequence f1488j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f1489k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f1490l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f1491m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f1492n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public CharSequence f1493o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CharSequence f1494p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f1495q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f1496r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public SearchableInfo f1497s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Bundle f1498t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Runnable f1499u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Runnable f1500v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f1501w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final View.OnClickListener f1502x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public View.OnKeyListener f1503y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final TextView.OnEditorActionListener f1504z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1505c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1505c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1505c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeValue(Boolean.valueOf(this.f1505c));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SearchView f1507f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f1508g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Runnable f1509h;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i4 = configuration.screenWidthDp;
            int i5 = configuration.screenHeightDp;
            if (i4 >= 960 && i5 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i4 < 600) {
                return (i4 < 640 || i5 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void a() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.G0.c(this);
                return;
            }
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void c() {
            if (this.f1508g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1508g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1506e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1508g) {
                removeCallbacks(this.f1509h);
                post(this.f1509h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z3, int i4, Rect rect) {
            super.onFocusChanged(z3, i4, rect);
            this.f1507f.c0();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
            if (i4 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1507f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i4, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z3) {
            super.onWindowFocusChanged(z3);
            if (z3 && this.f1507f.hasFocus() && getVisibility() == 0) {
                this.f1508g = true;
                if (SearchView.N(getContext())) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z3) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z3) {
                this.f1508g = false;
                removeCallbacks(this.f1509h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1508g = true;
                    return;
                }
                this.f1508g = false;
                removeCallbacks(this.f1509h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1507f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i4) {
            super.setThreshold(i4);
            this.f1506e = i4;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, a.c.T);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i4) {
            super(context, attributeSet, i4);
            this.f1509h = new a();
            this.f1506e = getThreshold();
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            SearchView.this.b0(charSequence);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.i0();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a1.a aVar = SearchView.this.f1486h0;
            if (aVar instanceof y0) {
                aVar.b(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z3) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1481c0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z3);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            SearchView.this.B();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.G) {
                searchView.Y();
                return;
            }
            if (view == searchView.I) {
                searchView.U();
                return;
            }
            if (view == searchView.H) {
                searchView.Z();
            } else if (view == searchView.J) {
                searchView.d0();
            } else if (view == searchView.C) {
                searchView.H();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1497s0 == null) {
                return false;
            }
            if (searchView.C.isPopupShowing() && SearchView.this.C.getListSelection() != -1) {
                return SearchView.this.a0(view, i4, keyEvent);
            }
            if (SearchView.this.C.b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i4 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.S(0, null, searchView2.C.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
            SearchView.this.Z();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            SearchView.this.V(i4, 0, null);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
            SearchView.this.W(i4);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean a();
    }

    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    public interface m {
        boolean a(int i4);

        boolean b(int i4);
    }

    public static class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f1521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f1522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Method f1523c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public n() {
            this.f1521a = null;
            this.f1522b = null;
            this.f1523c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1521a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1522b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1523c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1522b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1521a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1523c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class o extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f1524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f1525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f1526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f1527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f1528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1529f;

        public o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1528e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1525b = new Rect();
            this.f1527d = new Rect();
            this.f1526c = new Rect();
            a(rect, rect2);
            this.f1524a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1525b.set(rect);
            this.f1527d.set(rect);
            Rect rect3 = this.f1527d;
            int i4 = this.f1528e;
            rect3.inset(-i4, -i4);
            this.f1526c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z3;
            float width;
            int height;
            boolean z4;
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z5 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z4 = this.f1529f;
                    if (z4 && !this.f1527d.contains(x3, y3)) {
                        z5 = z4;
                        z3 = false;
                    }
                } else {
                    if (action == 3) {
                        z4 = this.f1529f;
                        this.f1529f = false;
                    }
                    z3 = true;
                    z5 = false;
                }
                z5 = z4;
                z3 = true;
            } else if (this.f1525b.contains(x3, y3)) {
                this.f1529f = true;
                z3 = true;
            } else {
                z3 = true;
                z5 = false;
            }
            if (!z5) {
                return false;
            }
            if (!z3 || this.f1526c.contains(x3, y3)) {
                Rect rect = this.f1526c;
                width = x3 - rect.left;
                height = y3 - rect.top;
            } else {
                width = this.f1524a.getWidth() / 2;
                height = this.f1524a.getHeight() / 2;
            }
            motionEvent.setLocation(width, height);
            return this.f1524a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        G0 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(@c.j0 Context context) {
        this(context, null);
    }

    public static boolean N(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(a.f.f6969c0);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(a.f.f6972d0);
    }

    private void setQuery(CharSequence charSequence) {
        this.C.setText(charSequence);
        this.C.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void B() {
        if (this.K.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.E.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = l1.b(this);
            int dimensionPixelSize = this.f1484f0 ? resources.getDimensionPixelSize(a.f.P) + resources.getDimensionPixelSize(a.f.Q) : 0;
            this.C.getDropDownBackground().getPadding(rect);
            int i4 = rect.left;
            this.C.setDropDownHorizontalOffset(zB ? -i4 : paddingLeft - (i4 + dimensionPixelSize));
            this.C.setDropDownWidth((((this.K.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public final Intent C(String str, Uri uri, String str2, String str3, int i4, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(Tag.EscapeTriplet);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1494p0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1498t0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i4 != 0) {
            intent.putExtra("action_key", i4);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1497s0.getSearchActivity());
        return intent;
    }

    public final Intent D(Cursor cursor, int i4, String str) {
        int position;
        String strU;
        try {
            String strU2 = y0.u(cursor, "suggest_intent_action");
            if (strU2 == null) {
                strU2 = this.f1497s0.getSuggestIntentAction();
            }
            if (strU2 == null) {
                strU2 = "android.intent.action.SEARCH";
            }
            String str2 = strU2;
            String strU3 = y0.u(cursor, "suggest_intent_data");
            if (strU3 == null) {
                strU3 = this.f1497s0.getSuggestIntentData();
            }
            if (strU3 != null && (strU = y0.u(cursor, "suggest_intent_data_id")) != null) {
                strU3 = strU3 + "/" + Uri.encode(strU);
            }
            return C(str2, strU3 == null ? null : Uri.parse(strU3), y0.u(cursor, "suggest_intent_extra_data"), y0.u(cursor, "suggest_intent_query"), i4, str);
        } catch (RuntimeException e4) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w(E0, "Search suggestions cursor at row " + position + " returned exception.", e4);
            return null;
        }
    }

    public final Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, w.b.f12287g);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1498t0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void G() {
        this.C.dismissDropDown();
    }

    public void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.C.refreshAutoCompleteResults();
            return;
        }
        n nVar = G0;
        nVar.b(this.C);
        nVar.a(this.C);
    }

    public final void I(View view, Rect rect) {
        view.getLocationInWindow(this.O);
        getLocationInWindow(this.P);
        int[] iArr = this.O;
        int i4 = iArr[1];
        int[] iArr2 = this.P;
        int i5 = i4 - iArr2[1];
        int i6 = iArr[0] - iArr2[0];
        rect.set(i6, i5, view.getWidth() + i6, view.getHeight() + i5);
    }

    public final CharSequence J(CharSequence charSequence) {
        if (!this.f1484f0 || this.R == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.C.getTextSize()) * 1.25d);
        this.R.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.R), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean K() {
        SearchableInfo searchableInfo = this.f1497s0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f1497s0.getVoiceSearchLaunchWebSearch() ? this.U : this.f1497s0.getVoiceSearchLaunchRecognizer() ? this.V : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    public boolean L() {
        return this.f1484f0;
    }

    public boolean M() {
        return this.f1485g0;
    }

    public boolean O() {
        return this.f1489k0;
    }

    public final boolean P() {
        return (this.f1487i0 || this.f1492n0) && !M();
    }

    public boolean Q() {
        return this.f1487i0;
    }

    public final void R(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e4) {
            Log.e(E0, "Failed launch activity: " + intent, e4);
        }
    }

    public void S(int i4, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i4, str));
    }

    public final boolean T(int i4, int i5, String str) {
        Cursor cursorC = this.f1486h0.c();
        if (cursorC == null || !cursorC.moveToPosition(i4)) {
            return false;
        }
        R(D(cursorC, i5, str));
        return true;
    }

    public void U() {
        if (!TextUtils.isEmpty(this.C.getText())) {
            this.C.setText(s0.a.f11071l);
            this.C.requestFocus();
            this.C.setImeVisibility(true);
        } else if (this.f1484f0) {
            k kVar = this.f1480b0;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                n0(true);
            }
        }
    }

    public boolean V(int i4, int i5, String str) {
        m mVar = this.f1482d0;
        if (mVar != null && mVar.b(i4)) {
            return false;
        }
        T(i4, 0, null);
        this.C.setImeVisibility(false);
        G();
        return true;
    }

    public boolean W(int i4) {
        m mVar = this.f1482d0;
        if (mVar != null && mVar.a(i4)) {
            return false;
        }
        f0(i4);
        return true;
    }

    public void X(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void Y() {
        n0(false);
        this.C.requestFocus();
        this.C.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1483e0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void Z() {
        Editable text = this.C.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.f1479a0;
        if (lVar == null || !lVar.b(text.toString())) {
            if (this.f1497s0 != null) {
                S(0, null, text.toString());
            }
            this.C.setImeVisibility(false);
            G();
        }
    }

    public boolean a0(View view, int i4, KeyEvent keyEvent) {
        if (this.f1497s0 != null && this.f1486h0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i4 == 66 || i4 == 84 || i4 == 61) {
                return V(this.C.getListSelection(), 0, null);
            }
            if (i4 == 21 || i4 == 22) {
                this.C.setSelection(i4 == 21 ? 0 : this.C.length());
                this.C.setListSelection(0);
                this.C.clearListSelection();
                this.C.a();
                return true;
            }
            if (i4 == 19) {
                this.C.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void b0(CharSequence charSequence) {
        Editable text = this.C.getText();
        this.f1494p0 = text;
        boolean z3 = !TextUtils.isEmpty(text);
        m0(z3);
        o0(!z3);
        h0();
        l0();
        if (this.f1479a0 != null && !TextUtils.equals(charSequence, this.f1493o0)) {
            this.f1479a0.a(charSequence.toString());
        }
        this.f1493o0 = charSequence.toString();
    }

    @Override // j.c
    public void c() {
        if (this.f1495q0) {
            return;
        }
        this.f1495q0 = true;
        int imeOptions = this.C.getImeOptions();
        this.f1496r0 = imeOptions;
        this.C.setImeOptions(imeOptions | 33554432);
        this.C.setText(s0.a.f11071l);
        setIconified(false);
    }

    public void c0() {
        n0(M());
        e0();
        if (this.C.hasFocus()) {
            H();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1490l0 = true;
        super.clearFocus();
        this.C.clearFocus();
        this.C.setImeVisibility(false);
        this.f1490l0 = false;
    }

    @Override // j.c
    public void d() {
        g0(s0.a.f11071l, false);
        clearFocus();
        n0(true);
        this.C.setImeOptions(this.f1496r0);
        this.f1495q0 = false;
    }

    public void d0() {
        Intent intentE;
        SearchableInfo searchableInfo = this.f1497s0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                intentE = F(this.U, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                intentE = E(this.V, searchableInfo);
            }
            getContext().startActivity(intentE);
        } catch (ActivityNotFoundException unused) {
            Log.w(E0, "Could not find voice search activity");
        }
    }

    public final void e0() {
        post(this.f1499u0);
    }

    public final void f0(int i4) {
        CharSequence charSequenceA;
        Editable text = this.C.getText();
        Cursor cursorC = this.f1486h0.c();
        if (cursorC == null) {
            return;
        }
        if (!cursorC.moveToPosition(i4) || (charSequenceA = this.f1486h0.a(cursorC)) == null) {
            setQuery(text);
        } else {
            setQuery(charSequenceA);
        }
    }

    public void g0(CharSequence charSequence, boolean z3) {
        this.C.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.C;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1494p0 = charSequence;
        }
        if (!z3 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        Z();
    }

    public int getImeOptions() {
        return this.C.getImeOptions();
    }

    public int getInputType() {
        return this.C.getInputType();
    }

    public int getMaxWidth() {
        return this.f1491m0;
    }

    public CharSequence getQuery() {
        return this.C.getText();
    }

    @c.k0
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1488j0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1497s0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.W : getContext().getText(this.f1497s0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.T;
    }

    public int getSuggestionRowLayout() {
        return this.S;
    }

    public a1.a getSuggestionsAdapter() {
        return this.f1486h0;
    }

    public final void h0() {
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.C.getText());
        if (!z4 && (!this.f1484f0 || this.f1495q0)) {
            z3 = false;
        }
        this.I.setVisibility(z3 ? 0 : 8);
        Drawable drawable = this.I.getDrawable();
        if (drawable != null) {
            drawable.setState(z4 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void i0() {
        int[] iArr = this.C.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.E.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.F.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void j0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.C;
        if (queryHint == null) {
            queryHint = s0.a.f11071l;
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    public final void k0() {
        this.C.setThreshold(this.f1497s0.getSuggestThreshold());
        this.C.setImeOptions(this.f1497s0.getImeOptions());
        int inputType = this.f1497s0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1497s0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.C.setInputType(inputType);
        a1.a aVar = this.f1486h0;
        if (aVar != null) {
            aVar.b(null);
        }
        if (this.f1497s0.getSuggestAuthority() != null) {
            y0 y0Var = new y0(getContext(), this, this.f1497s0, this.f1501w0);
            this.f1486h0 = y0Var;
            this.C.setAdapter(y0Var);
            ((y0) this.f1486h0).E(this.f1489k0 ? 2 : 1);
        }
    }

    public final void l0() {
        this.F.setVisibility((P() && (this.H.getVisibility() == 0 || this.J.getVisibility() == 0)) ? 0 : 8);
    }

    public final void m0(boolean z3) {
        this.H.setVisibility((this.f1487i0 && P() && hasFocus() && (z3 || !this.f1492n0)) ? 0 : 8);
    }

    public final void n0(boolean z3) {
        this.f1485g0 = z3;
        int i4 = z3 ? 0 : 8;
        boolean z4 = !TextUtils.isEmpty(this.C.getText());
        this.G.setVisibility(i4);
        m0(z4);
        this.D.setVisibility(z3 ? 8 : 0);
        this.Q.setVisibility((this.Q.getDrawable() == null || this.f1484f0) ? 8 : 0);
        h0();
        o0(!z4);
        l0();
    }

    public final void o0(boolean z3) {
        int i4 = 8;
        if (this.f1492n0 && !M() && z3) {
            this.H.setVisibility(8);
            i4 = 0;
        }
        this.J.setVisibility(i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1499u0);
        post(this.f1500v0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        if (z3) {
            I(this.C, this.M);
            Rect rect = this.N;
            Rect rect2 = this.M;
            rect.set(rect2.left, 0, rect2.right, i7 - i5);
            o oVar = this.L;
            if (oVar != null) {
                oVar.a(this.N, this.M);
                return;
            }
            o oVar2 = new o(this.N, this.M, this.C);
            this.L = oVar2;
            setTouchDelegate(oVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.M()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.f1491m0
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.f1491m0
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.f1491m0
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        n0(savedState.f1505c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1505c = M();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        e0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i4, Rect rect) {
        if (this.f1490l0 || !isFocusable()) {
            return false;
        }
        if (M()) {
            return super.requestFocus(i4, rect);
        }
        boolean zRequestFocus = this.C.requestFocus(i4, rect);
        if (zRequestFocus) {
            n0(false);
        }
        return zRequestFocus;
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.f1498t0 = bundle;
    }

    public void setIconified(boolean z3) {
        if (z3) {
            U();
        } else {
            Y();
        }
    }

    public void setIconifiedByDefault(boolean z3) {
        if (this.f1484f0 == z3) {
            return;
        }
        this.f1484f0 = z3;
        n0(z3);
        j0();
    }

    public void setImeOptions(int i4) {
        this.C.setImeOptions(i4);
    }

    public void setInputType(int i4) {
        this.C.setInputType(i4);
    }

    public void setMaxWidth(int i4) {
        this.f1491m0 = i4;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.f1480b0 = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1481c0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.f1479a0 = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1483e0 = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.f1482d0 = mVar;
    }

    public void setQueryHint(@c.k0 CharSequence charSequence) {
        this.f1488j0 = charSequence;
        j0();
    }

    public void setQueryRefinementEnabled(boolean z3) {
        this.f1489k0 = z3;
        a1.a aVar = this.f1486h0;
        if (aVar instanceof y0) {
            ((y0) aVar).E(z3 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1497s0 = searchableInfo;
        if (searchableInfo != null) {
            k0();
            j0();
        }
        boolean zK = K();
        this.f1492n0 = zK;
        if (zK) {
            this.C.setPrivateImeOptions(F0);
        }
        n0(M());
    }

    public void setSubmitButtonEnabled(boolean z3) {
        this.f1487i0 = z3;
        n0(M());
    }

    public void setSuggestionsAdapter(a1.a aVar) {
        this.f1486h0 = aVar;
        this.C.setAdapter(aVar);
    }

    public SearchView(@c.j0 Context context, @c.k0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.U2);
    }

    public SearchView(@c.j0 Context context, @c.k0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.M = new Rect();
        this.N = new Rect();
        this.O = new int[2];
        this.P = new int[2];
        this.f1499u0 = new b();
        this.f1500v0 = new c();
        this.f1501w0 = new WeakHashMap<>();
        f fVar = new f();
        this.f1502x0 = fVar;
        this.f1503y0 = new g();
        h hVar = new h();
        this.f1504z0 = hVar;
        i iVar = new i();
        this.A0 = iVar;
        j jVar = new j();
        this.B0 = jVar;
        this.C0 = new a();
        e1 e1VarG = e1.G(context, attributeSet, a.n.d6, i4, 0);
        LayoutInflater.from(context).inflate(e1VarG.u(a.n.n6, a.k.f7197z), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(a.h.f7102g1);
        this.C = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.D = findViewById(a.h.f7090c1);
        View viewFindViewById = findViewById(a.h.f7099f1);
        this.E = viewFindViewById;
        View viewFindViewById2 = findViewById(a.h.f7135r1);
        this.F = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(a.h.f7084a1);
        this.G = imageView;
        ImageView imageView2 = (ImageView) findViewById(a.h.f7093d1);
        this.H = imageView2;
        ImageView imageView3 = (ImageView) findViewById(a.h.f7087b1);
        this.I = imageView3;
        ImageView imageView4 = (ImageView) findViewById(a.h.f7105h1);
        this.J = imageView4;
        ImageView imageView5 = (ImageView) findViewById(a.h.f7096e1);
        this.Q = imageView5;
        z1.G1(viewFindViewById, e1VarG.h(a.n.o6));
        z1.G1(viewFindViewById2, e1VarG.h(a.n.s6));
        int i5 = a.n.r6;
        imageView.setImageDrawable(e1VarG.h(i5));
        imageView2.setImageDrawable(e1VarG.h(a.n.l6));
        imageView3.setImageDrawable(e1VarG.h(a.n.i6));
        imageView4.setImageDrawable(e1VarG.h(a.n.u6));
        imageView5.setImageDrawable(e1VarG.h(i5));
        this.R = e1VarG.h(a.n.q6);
        h1.a(imageView, getResources().getString(a.l.f7219v));
        this.S = e1VarG.u(a.n.t6, a.k.f7196y);
        this.T = e1VarG.u(a.n.j6, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.C0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1503y0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(e1VarG.a(a.n.m6, true));
        int iG = e1VarG.g(a.n.f6, -1);
        if (iG != -1) {
            setMaxWidth(iG);
        }
        this.W = e1VarG.x(a.n.k6);
        this.f1488j0 = e1VarG.x(a.n.p6);
        int iO = e1VarG.o(a.n.h6, -1);
        if (iO != -1) {
            setImeOptions(iO);
        }
        int iO2 = e1VarG.o(a.n.g6, -1);
        if (iO2 != -1) {
            setInputType(iO2);
        }
        setFocusable(e1VarG.a(a.n.e6, true));
        e1VarG.I();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.U = intent;
        intent.addFlags(Tag.EscapeTriplet);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.V = intent2;
        intent2.addFlags(Tag.EscapeTriplet);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.K = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        n0(this.f1484f0);
        j0();
    }
}
