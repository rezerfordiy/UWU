package a0;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import c.r0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class l4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f98h = "RemoteInput";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f99i = "android.remoteinput.results";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f100j = "android.remoteinput.resultsData";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f101k = "android.remoteinput.dataTypeResultsData";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f102l = "android.remoteinput.resultsSource";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f103m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f104n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f105o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f106p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f107q = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence[] f110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<String> f114g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f115a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence[] f119e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set<String> f116b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f117c = new Bundle();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f120f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f121g = 0;

        public a(@c.j0 String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f115a = str;
        }

        @c.j0
        public a a(@c.j0 Bundle bundle) {
            if (bundle != null) {
                this.f117c.putAll(bundle);
            }
            return this;
        }

        @c.j0
        public l4 b() {
            return new l4(this.f115a, this.f118d, this.f119e, this.f120f, this.f121g, this.f117c, this.f116b);
        }

        @c.j0
        public Bundle c() {
            return this.f117c;
        }

        @c.j0
        public a d(@c.j0 String str, boolean z3) {
            if (z3) {
                this.f116b.add(str);
            } else {
                this.f116b.remove(str);
            }
            return this;
        }

        @c.j0
        public a e(boolean z3) {
            this.f120f = z3;
            return this;
        }

        @c.j0
        public a f(@c.k0 CharSequence[] charSequenceArr) {
            this.f119e = charSequenceArr;
            return this;
        }

        @c.j0
        public a g(int i4) {
            this.f121g = i4;
            return this;
        }

        @c.j0
        public a h(@c.k0 CharSequence charSequence) {
            this.f118d = charSequence;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public l4(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z3, int i4, Bundle bundle, Set<String> set) {
        this.f108a = str;
        this.f109b = charSequence;
        this.f110c = charSequenceArr;
        this.f111d = z3;
        this.f112e = i4;
        this.f113f = bundle;
        this.f114g = set;
        if (k() == 2 && !f()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void a(l4 l4Var, Intent intent, Map<String, Uri> map) {
        if (Build.VERSION.SDK_INT >= 26) {
            RemoteInput.addDataResultToIntent(c(l4Var), intent, map);
            return;
        }
        Intent intentI = i(intent);
        if (intentI == null) {
            intentI = new Intent();
        }
        for (Map.Entry<String, Uri> entry : map.entrySet()) {
            String key = entry.getKey();
            Uri value = entry.getValue();
            if (key != null) {
                Bundle bundleExtra = intentI.getBundleExtra(l(key));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(l4Var.o(), value.toString());
                intentI.putExtra(l(key), bundleExtra);
            }
        }
        intent.setClipData(ClipData.newIntent(f99i, intentI));
    }

    public static void b(l4[] l4VarArr, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            RemoteInput.addResultsToIntent(d(l4VarArr), intent, bundle);
            return;
        }
        Bundle bundleP = p(intent);
        int iQ = q(intent);
        if (bundleP != null) {
            bundleP.putAll(bundle);
            bundle = bundleP;
        }
        for (l4 l4Var : l4VarArr) {
            Map<String, Uri> mapJ = j(intent, l4Var.o());
            RemoteInput.addResultsToIntent(d(new l4[]{l4Var}), intent, bundle);
            if (mapJ != null) {
                a(l4Var, intent, mapJ);
            }
        }
        s(intent, iQ);
    }

    @c.o0(20)
    public static RemoteInput c(l4 l4Var) {
        RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(l4Var.o()).setLabel(l4Var.n()).setChoices(l4Var.h()).setAllowFreeFormInput(l4Var.f()).addExtras(l4Var.m());
        if (Build.VERSION.SDK_INT >= 29) {
            builderAddExtras.setEditChoicesBeforeSending(l4Var.k());
        }
        return builderAddExtras.build();
    }

    @c.o0(20)
    public static RemoteInput[] d(l4[] l4VarArr) {
        if (l4VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[l4VarArr.length];
        for (int i4 = 0; i4 < l4VarArr.length; i4++) {
            remoteInputArr[i4] = c(l4VarArr[i4]);
        }
        return remoteInputArr;
    }

    @c.o0(20)
    public static l4 e(RemoteInput remoteInput) {
        a aVarA = new a(remoteInput.getResultKey()).h(remoteInput.getLabel()).f(remoteInput.getChoices()).e(remoteInput.getAllowFreeFormInput()).a(remoteInput.getExtras());
        if (Build.VERSION.SDK_INT >= 29) {
            aVarA.g(remoteInput.getEditChoicesBeforeSending());
        }
        return aVarA.b();
    }

    @c.o0(16)
    public static Intent i(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(f99i)) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }

    public static Map<String, Uri> j(Intent intent, String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }
        Intent intentI = i(intent);
        if (intentI == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : intentI.getExtras().keySet()) {
            if (str2.startsWith(f101k)) {
                String strSubstring = str2.substring(39);
                if (!strSubstring.isEmpty() && (string = intentI.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    map.put(strSubstring, Uri.parse(string));
                }
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public static String l(String str) {
        return f101k + str;
    }

    public static Bundle p(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }

    public static int q(@c.j0 Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return RemoteInput.getResultsSource(intent);
        }
        Intent intentI = i(intent);
        if (intentI == null) {
            return 0;
        }
        return intentI.getExtras().getInt(f102l, 0);
    }

    public static void s(@c.j0 Intent intent, int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            RemoteInput.setResultsSource(intent, i4);
            return;
        }
        Intent intentI = i(intent);
        if (intentI == null) {
            intentI = new Intent();
        }
        intentI.putExtra(f102l, i4);
        intent.setClipData(ClipData.newIntent(f99i, intentI));
    }

    public boolean f() {
        return this.f111d;
    }

    public Set<String> g() {
        return this.f114g;
    }

    public CharSequence[] h() {
        return this.f110c;
    }

    public int k() {
        return this.f112e;
    }

    public Bundle m() {
        return this.f113f;
    }

    public CharSequence n() {
        return this.f109b;
    }

    public String o() {
        return this.f108a;
    }

    public boolean r() {
        return (f() || (h() != null && h().length != 0) || g() == null || g().isEmpty()) ? false : true;
    }
}
