package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import e.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class y0 extends a1.c implements View.OnClickListener {
    public static final boolean D = false;
    public static final String E = "SuggestionsAdapter";
    public static final int F = 50;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = -1;
    public int A;
    public int B;
    public int C;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SearchView f1914p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SearchableInfo f1915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f1916r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f1917s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1918t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1919u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1920v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ColorStateList f1921w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1922x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1923y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1924z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f1925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f1926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f1927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f1928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f1929e;

        public a(View view) {
            this.f1925a = (TextView) view.findViewById(R.id.text1);
            this.f1926b = (TextView) view.findViewById(R.id.text2);
            this.f1927c = (ImageView) view.findViewById(R.id.icon1);
            this.f1928d = (ImageView) view.findViewById(R.id.icon2);
            this.f1929e = (ImageView) view.findViewById(a.h.f7128p0);
        }
    }

    public y0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1919u = false;
        this.f1920v = 1;
        this.f1922x = -1;
        this.f1923y = -1;
        this.f1924z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.f1914p = searchView;
        this.f1915q = searchableInfo;
        this.f1918t = searchView.getSuggestionCommitIconResId();
        this.f1916r = context;
        this.f1917s = weakHashMap;
    }

    public static String D(Cursor cursor, int i4) {
        if (i4 == -1) {
            return null;
        }
        try {
            return cursor.getString(i4);
        } catch (Exception e4) {
            Log.e(E, "unexpected error retrieving valid column from cursor, did the remote process die?", e4);
            return null;
        }
    }

    public static String u(Cursor cursor, String str) {
        return D(cursor, cursor.getColumnIndex(str));
    }

    public final Drawable A(Cursor cursor) {
        int i4 = this.B;
        if (i4 == -1) {
            return null;
        }
        return y(cursor.getString(i4));
    }

    public int B() {
        return this.f1920v;
    }

    public Cursor C(SearchableInfo searchableInfo, String str, int i4) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(s0.a.f11071l).fragment(s0.a.f11071l);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i4 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i4));
        }
        return this.f1916r.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void E(int i4) {
        this.f1920v = i4;
    }

    public final void F(ImageView imageView, Drawable drawable, int i4) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i4);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void G(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public final void H(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1917s.put(str, drawable.getConstantState());
        }
    }

    public final void I(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // a1.a, a1.b.a
    public CharSequence a(Cursor cursor) {
        String strU;
        String strU2;
        if (cursor == null) {
            return null;
        }
        String strU3 = u(cursor, "suggest_intent_query");
        if (strU3 != null) {
            return strU3;
        }
        if (this.f1915q.shouldRewriteQueryFromData() && (strU2 = u(cursor, "suggest_intent_data")) != null) {
            return strU2;
        }
        if (!this.f1915q.shouldRewriteQueryFromText() || (strU = u(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strU;
    }

    @Override // a1.a, a1.b.a
    public void b(Cursor cursor) {
        if (this.f1919u) {
            Log.w(E, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f1922x = cursor.getColumnIndex("suggest_text_1");
                this.f1923y = cursor.getColumnIndex("suggest_text_2");
                this.f1924z = cursor.getColumnIndex("suggest_text_2_url");
                this.A = cursor.getColumnIndex("suggest_icon_1");
                this.B = cursor.getColumnIndex("suggest_icon_2");
                this.C = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e4) {
            Log.e(E, "error changing cursor and caching columns", e4);
        }
    }

    @Override // a1.a, a1.b.a
    public Cursor d(CharSequence charSequence) {
        String string = charSequence == null ? s0.a.f11071l : charSequence.toString();
        if (this.f1914p.getVisibility() == 0 && this.f1914p.getWindowVisibility() == 0) {
            try {
                Cursor cursorC = C(this.f1915q, string, 50);
                if (cursorC != null) {
                    cursorC.getCount();
                    return cursorC;
                }
            } catch (RuntimeException e4) {
                Log.w(E, "Search suggestions query threw an exception.", e4);
            }
        }
        return null;
    }

    @Override // a1.a
    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i4 = this.C;
        int i5 = i4 != -1 ? cursor.getInt(i4) : 0;
        if (aVar.f1925a != null) {
            G(aVar.f1925a, D(cursor, this.f1922x));
        }
        if (aVar.f1926b != null) {
            String strD = D(cursor, this.f1924z);
            CharSequence charSequenceR = strD != null ? r(strD) : D(cursor, this.f1923y);
            if (TextUtils.isEmpty(charSequenceR)) {
                TextView textView = aVar.f1925a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1925a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1925a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1925a.setMaxLines(1);
                }
            }
            G(aVar.f1926b, charSequenceR);
        }
        ImageView imageView = aVar.f1927c;
        if (imageView != null) {
            F(imageView, z(cursor), 4);
        }
        ImageView imageView2 = aVar.f1928d;
        if (imageView2 != null) {
            F(imageView2, A(cursor), 8);
        }
        int i6 = this.f1920v;
        if (i6 != 2 && (i6 != 1 || (i5 & 1) == 0)) {
            aVar.f1929e.setVisibility(8);
            return;
        }
        aVar.f1929e.setVisibility(0);
        aVar.f1929e.setTag(aVar.f1925a.getText());
        aVar.f1929e.setOnClickListener(this);
    }

    @Override // a1.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w(E, "Search suggestions cursor threw exception.", e4);
            View viewI = i(this.f1916r, c(), viewGroup);
            if (viewI != null) {
                ((a) viewI.getTag()).f1925a.setText(e4.toString());
            }
            return viewI;
        }
    }

    @Override // a1.a, android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w(E, "Search suggestions cursor threw exception.", e4);
            View viewJ = j(this.f1916r, c(), viewGroup);
            if (viewJ != null) {
                ((a) viewJ.getTag()).f1925a.setText(e4.toString());
            }
            return viewJ;
        }
    }

    @Override // a1.a, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // a1.c, a1.a
    public View j(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewJ = super.j(context, cursor, viewGroup);
        viewJ.setTag(new a(viewJ));
        ((ImageView) viewJ.findViewById(a.h.f7128p0)).setImageResource(this.f1918t);
        return viewJ;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        I(c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        I(c());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1914p.X((CharSequence) tag);
        }
    }

    public final Drawable p(String str) {
        Drawable.ConstantState constantState = this.f1917s.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public void q() {
        b(null);
        this.f1919u = true;
    }

    public final CharSequence r(CharSequence charSequence) {
        if (this.f1921w == null) {
            TypedValue typedValue = new TypedValue();
            this.f1916r.getTheme().resolveAttribute(a.c.E3, typedValue, true);
            this.f1921w = this.f1916r.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1921w, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable s(ComponentName componentName) {
        String string;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f1916r.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e4) {
            string = e4.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable != null) {
            return drawable;
        }
        string = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
        Log.w(E, string);
        return null;
    }

    public final Drawable t(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f1917s.containsKey(strFlattenToShortString)) {
            Drawable drawableS = s(componentName);
            this.f1917s.put(strFlattenToShortString, drawableS != null ? drawableS.getConstantState() : null);
            return drawableS;
        }
        Drawable.ConstantState constantState = this.f1917s.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1916r.getResources());
    }

    public final Drawable v() {
        Drawable drawableT = t(this.f1915q.getSearchActivity());
        return drawableT != null ? drawableT : this.f1916r.getPackageManager().getDefaultActivityIcon();
    }

    public final Drawable w(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return x(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f1916r.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e4) {
                    Log.e(E, "Error closing icon stream for " + uri, e4);
                }
            }
        } catch (FileNotFoundException e5) {
            Log.w(E, "Icon not found: " + uri + ", " + e5.getMessage());
            return null;
        }
        Log.w(E, "Icon not found: " + uri + ", " + e5.getMessage());
        return null;
    }

    public Drawable x(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1916r.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public final Drawable y(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i4 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1916r.getPackageName() + "/" + i4;
            Drawable drawableP = p(str2);
            if (drawableP != null) {
                return drawableP;
            }
            Drawable drawableH = b0.e.h(this.f1916r, i4);
            H(str2, drawableH);
            return drawableH;
        } catch (Resources.NotFoundException unused) {
            Log.w(E, "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableP2 = p(str);
            if (drawableP2 != null) {
                return drawableP2;
            }
            Drawable drawableW = w(Uri.parse(str));
            H(str, drawableW);
            return drawableW;
        }
    }

    public final Drawable z(Cursor cursor) {
        int i4 = this.A;
        if (i4 == -1) {
            return null;
        }
        Drawable drawableY = y(cursor.getString(i4));
        return drawableY != null ? drawableY : v();
    }
}
