package c0;

import a0.v3;
import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import c.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class s0 {
    public static final String A = "extraPersonCount";
    public static final String B = "extraPerson_";
    public static final String C = "extraLocusId";
    public static final String D = "extraLongLived";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f4544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Intent[] f4547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ComponentName f4548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f4549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f4550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f4551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IconCompat f4552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v3[] f4554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Set<String> f4555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @c.k0
    public b0.g f4556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PersistableBundle f4559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f4560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public UserHandle f4561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4563t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4564u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4565v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4566w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4567x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f4568y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4569z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s0 f4570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f4571b;

        @c.o0(25)
        @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
        public a(@c.j0 Context context, @c.j0 ShortcutInfo shortcutInfo) {
            s0 s0Var = new s0();
            this.f4570a = s0Var;
            s0Var.f4544a = context;
            s0Var.f4545b = shortcutInfo.getId();
            s0Var.f4546c = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            s0Var.f4547d = (Intent[]) Arrays.copyOf(intents, intents.length);
            s0Var.f4548e = shortcutInfo.getActivity();
            s0Var.f4549f = shortcutInfo.getShortLabel();
            s0Var.f4550g = shortcutInfo.getLongLabel();
            s0Var.f4551h = shortcutInfo.getDisabledMessage();
            int i4 = Build.VERSION.SDK_INT;
            s0Var.f4569z = i4 >= 28 ? shortcutInfo.getDisabledReason() : shortcutInfo.isEnabled() ? 0 : 3;
            s0Var.f4555l = shortcutInfo.getCategories();
            s0Var.f4554k = s0.t(shortcutInfo.getExtras());
            s0Var.f4561r = shortcutInfo.getUserHandle();
            s0Var.f4560q = shortcutInfo.getLastChangedTimestamp();
            if (i4 >= 30) {
                s0Var.f4562s = shortcutInfo.isCached();
            }
            s0Var.f4563t = shortcutInfo.isDynamic();
            s0Var.f4564u = shortcutInfo.isPinned();
            s0Var.f4565v = shortcutInfo.isDeclaredInManifest();
            s0Var.f4566w = shortcutInfo.isImmutable();
            s0Var.f4567x = shortcutInfo.isEnabled();
            s0Var.f4568y = shortcutInfo.hasKeyFieldsOnly();
            s0Var.f4556m = s0.o(shortcutInfo);
            s0Var.f4558o = shortcutInfo.getRank();
            s0Var.f4559p = shortcutInfo.getExtras();
        }

        @c.j0
        public s0 a() {
            if (TextUtils.isEmpty(this.f4570a.f4549f)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            s0 s0Var = this.f4570a;
            Intent[] intentArr = s0Var.f4547d;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.f4571b) {
                if (s0Var.f4556m == null) {
                    s0Var.f4556m = new b0.g(s0Var.f4545b);
                }
                this.f4570a.f4557n = true;
            }
            return this.f4570a;
        }

        @c.j0
        public a b(@c.j0 ComponentName componentName) {
            this.f4570a.f4548e = componentName;
            return this;
        }

        @c.j0
        public a c() {
            this.f4570a.f4553j = true;
            return this;
        }

        @c.j0
        public a d(@c.j0 Set<String> set) {
            this.f4570a.f4555l = set;
            return this;
        }

        @c.j0
        public a e(@c.j0 CharSequence charSequence) {
            this.f4570a.f4551h = charSequence;
            return this;
        }

        @c.j0
        public a f(@c.j0 PersistableBundle persistableBundle) {
            this.f4570a.f4559p = persistableBundle;
            return this;
        }

        @c.j0
        public a g(IconCompat iconCompat) {
            this.f4570a.f4552i = iconCompat;
            return this;
        }

        @c.j0
        public a h(@c.j0 Intent intent) {
            return i(new Intent[]{intent});
        }

        @c.j0
        public a i(@c.j0 Intent[] intentArr) {
            this.f4570a.f4547d = intentArr;
            return this;
        }

        @c.j0
        public a j() {
            this.f4571b = true;
            return this;
        }

        @c.j0
        public a k(@c.k0 b0.g gVar) {
            this.f4570a.f4556m = gVar;
            return this;
        }

        @c.j0
        public a l(@c.j0 CharSequence charSequence) {
            this.f4570a.f4550g = charSequence;
            return this;
        }

        @c.j0
        @Deprecated
        public a m() {
            this.f4570a.f4557n = true;
            return this;
        }

        @c.j0
        public a n(boolean z3) {
            this.f4570a.f4557n = z3;
            return this;
        }

        @c.j0
        public a o(@c.j0 v3 v3Var) {
            return p(new v3[]{v3Var});
        }

        @c.j0
        public a p(@c.j0 v3[] v3VarArr) {
            this.f4570a.f4554k = v3VarArr;
            return this;
        }

        @c.j0
        public a q(int i4) {
            this.f4570a.f4558o = i4;
            return this;
        }

        @c.j0
        public a r(@c.j0 CharSequence charSequence) {
            this.f4570a.f4549f = charSequence;
            return this;
        }

        public a(@c.j0 Context context, @c.j0 String str) {
            s0 s0Var = new s0();
            this.f4570a = s0Var;
            s0Var.f4544a = context;
            s0Var.f4545b = str;
        }

        @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
        public a(@c.j0 s0 s0Var) {
            s0 s0Var2 = new s0();
            this.f4570a = s0Var2;
            s0Var2.f4544a = s0Var.f4544a;
            s0Var2.f4545b = s0Var.f4545b;
            s0Var2.f4546c = s0Var.f4546c;
            Intent[] intentArr = s0Var.f4547d;
            s0Var2.f4547d = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            s0Var2.f4548e = s0Var.f4548e;
            s0Var2.f4549f = s0Var.f4549f;
            s0Var2.f4550g = s0Var.f4550g;
            s0Var2.f4551h = s0Var.f4551h;
            s0Var2.f4569z = s0Var.f4569z;
            s0Var2.f4552i = s0Var.f4552i;
            s0Var2.f4553j = s0Var.f4553j;
            s0Var2.f4561r = s0Var.f4561r;
            s0Var2.f4560q = s0Var.f4560q;
            s0Var2.f4562s = s0Var.f4562s;
            s0Var2.f4563t = s0Var.f4563t;
            s0Var2.f4564u = s0Var.f4564u;
            s0Var2.f4565v = s0Var.f4565v;
            s0Var2.f4566w = s0Var.f4566w;
            s0Var2.f4567x = s0Var.f4567x;
            s0Var2.f4556m = s0Var.f4556m;
            s0Var2.f4557n = s0Var.f4557n;
            s0Var2.f4568y = s0Var.f4568y;
            s0Var2.f4558o = s0Var.f4558o;
            v3[] v3VarArr = s0Var.f4554k;
            if (v3VarArr != null) {
                s0Var2.f4554k = (v3[]) Arrays.copyOf(v3VarArr, v3VarArr.length);
            }
            if (s0Var.f4555l != null) {
                s0Var2.f4555l = new HashSet(s0Var.f4555l);
            }
            PersistableBundle persistableBundle = s0Var.f4559p;
            if (persistableBundle != null) {
                s0Var2.f4559p = persistableBundle;
            }
        }
    }

    @c.o0(25)
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static List<s0> c(@c.j0 Context context, @c.j0 List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(context, r.a(it.next())).a());
        }
        return arrayList;
    }

    @c.k0
    @c.o0(25)
    public static b0.g o(@c.j0 ShortcutInfo shortcutInfo) {
        if (Build.VERSION.SDK_INT < 29) {
            return p(shortcutInfo.getExtras());
        }
        if (shortcutInfo.getLocusId() == null) {
            return null;
        }
        return b0.g.d(shortcutInfo.getLocusId());
    }

    @c.k0
    @c.o0(25)
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static b0.g p(@c.k0 PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString(C)) == null) {
            return null;
        }
        return new b0.g(string);
    }

    @c.o0(25)
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    @c.z0
    public static boolean r(@c.k0 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(D)) {
            return false;
        }
        return persistableBundle.getBoolean(D);
    }

    @c.o0(25)
    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    @c.z0
    public static v3[] t(@c.j0 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(A)) {
            return null;
        }
        int i4 = persistableBundle.getInt(A);
        v3[] v3VarArr = new v3[i4];
        int i5 = 0;
        while (i5 < i4) {
            StringBuilder sb = new StringBuilder();
            sb.append(B);
            int i6 = i5 + 1;
            sb.append(i6);
            v3VarArr[i5] = v3.c(persistableBundle.getPersistableBundle(sb.toString()));
            i5 = i6;
        }
        return v3VarArr;
    }

    public boolean A() {
        return this.f4563t;
    }

    public boolean B() {
        return this.f4567x;
    }

    public boolean C() {
        return this.f4566w;
    }

    public boolean D() {
        return this.f4564u;
    }

    @c.o0(25)
    public ShortcutInfo E() {
        p.a();
        ShortcutInfo.Builder intents = o.a(this.f4544a, this.f4545b).setShortLabel(this.f4549f).setIntents(this.f4547d);
        IconCompat iconCompat = this.f4552i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.K(this.f4544a));
        }
        if (!TextUtils.isEmpty(this.f4550g)) {
            intents.setLongLabel(this.f4550g);
        }
        if (!TextUtils.isEmpty(this.f4551h)) {
            intents.setDisabledMessage(this.f4551h);
        }
        ComponentName componentName = this.f4548e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f4555l;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f4558o);
        PersistableBundle persistableBundle = this.f4559p;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            v3[] v3VarArr = this.f4554k;
            if (v3VarArr != null && v3VarArr.length > 0) {
                int length = v3VarArr.length;
                Person[] personArr = new Person[length];
                for (int i4 = 0; i4 < length; i4++) {
                    personArr[i4] = this.f4554k[i4].k();
                }
                intents.setPersons(personArr);
            }
            b0.g gVar = this.f4556m;
            if (gVar != null) {
                intents.setLocusId(gVar.c());
            }
            intents.setLongLived(this.f4557n);
        } else {
            intents.setExtras(b());
        }
        return intents.build();
    }

    public Intent a(Intent intent) {
        intent.putExtra("android.intent.extra.shortcut.INTENT", this.f4547d[r0.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f4549f.toString());
        if (this.f4552i != null) {
            Drawable activityIcon = null;
            if (this.f4553j) {
                PackageManager packageManager = this.f4544a.getPackageManager();
                ComponentName componentName = this.f4548e;
                if (componentName != null) {
                    try {
                        activityIcon = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (activityIcon == null) {
                    activityIcon = this.f4544a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f4552i.c(intent, activityIcon, this.f4544a);
        }
        return intent;
    }

    @c.o0(22)
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public final PersistableBundle b() {
        if (this.f4559p == null) {
            this.f4559p = new PersistableBundle();
        }
        v3[] v3VarArr = this.f4554k;
        if (v3VarArr != null && v3VarArr.length > 0) {
            this.f4559p.putInt(A, v3VarArr.length);
            int i4 = 0;
            while (i4 < this.f4554k.length) {
                PersistableBundle persistableBundle = this.f4559p;
                StringBuilder sb = new StringBuilder();
                sb.append(B);
                int i5 = i4 + 1;
                sb.append(i5);
                persistableBundle.putPersistableBundle(sb.toString(), this.f4554k[i4].n());
                i4 = i5;
            }
        }
        b0.g gVar = this.f4556m;
        if (gVar != null) {
            this.f4559p.putString(C, gVar.a());
        }
        this.f4559p.putBoolean(D, this.f4557n);
        return this.f4559p;
    }

    @c.k0
    public ComponentName d() {
        return this.f4548e;
    }

    @c.k0
    public Set<String> e() {
        return this.f4555l;
    }

    @c.k0
    public CharSequence f() {
        return this.f4551h;
    }

    public int g() {
        return this.f4569z;
    }

    @c.k0
    public PersistableBundle h() {
        return this.f4559p;
    }

    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public IconCompat i() {
        return this.f4552i;
    }

    @c.j0
    public String j() {
        return this.f4545b;
    }

    @c.j0
    public Intent k() {
        return this.f4547d[r0.length - 1];
    }

    @c.j0
    public Intent[] l() {
        Intent[] intentArr = this.f4547d;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    public long m() {
        return this.f4560q;
    }

    @c.k0
    public b0.g n() {
        return this.f4556m;
    }

    @c.k0
    public CharSequence q() {
        return this.f4550g;
    }

    @c.j0
    public String s() {
        return this.f4546c;
    }

    public int u() {
        return this.f4558o;
    }

    @c.j0
    public CharSequence v() {
        return this.f4549f;
    }

    @c.k0
    public UserHandle w() {
        return this.f4561r;
    }

    public boolean x() {
        return this.f4568y;
    }

    public boolean y() {
        return this.f4562s;
    }

    public boolean z() {
        return this.f4565v;
    }
}
