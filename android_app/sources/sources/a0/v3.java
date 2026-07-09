package a0;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
public class v3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f223g = "name";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f224h = "icon";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f225i = "uri";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f226j = "key";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f227k = "isBot";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f228l = "isImportant";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @c.k0
    public CharSequence f229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @c.k0
    public IconCompat f230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @c.k0
    public String f231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @c.k0
    public String f232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f234f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @c.k0
        public CharSequence f235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @c.k0
        public IconCompat f236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @c.k0
        public String f237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @c.k0
        public String f238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f240f;

        public a() {
        }

        @c.j0
        public v3 a() {
            return new v3(this);
        }

        @c.j0
        public a b(boolean z3) {
            this.f239e = z3;
            return this;
        }

        @c.j0
        public a c(@c.k0 IconCompat iconCompat) {
            this.f236b = iconCompat;
            return this;
        }

        @c.j0
        public a d(boolean z3) {
            this.f240f = z3;
            return this;
        }

        @c.j0
        public a e(@c.k0 String str) {
            this.f238d = str;
            return this;
        }

        @c.j0
        public a f(@c.k0 CharSequence charSequence) {
            this.f235a = charSequence;
            return this;
        }

        @c.j0
        public a g(@c.k0 String str) {
            this.f237c = str;
            return this;
        }

        public a(v3 v3Var) {
            this.f235a = v3Var.f229a;
            this.f236b = v3Var.f230b;
            this.f237c = v3Var.f231c;
            this.f238d = v3Var.f232d;
            this.f239e = v3Var.f233e;
            this.f240f = v3Var.f234f;
        }
    }

    public v3(a aVar) {
        this.f229a = aVar.f235a;
        this.f230b = aVar.f236b;
        this.f231c = aVar.f237c;
        this.f232d = aVar.f238d;
        this.f233e = aVar.f239e;
        this.f234f = aVar.f240f;
    }

    @c.o0(28)
    @c.j0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static v3 a(@c.j0 Person person) {
        return new a().f(person.getName()).c(person.getIcon() != null ? IconCompat.g(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
    }

    @c.j0
    public static v3 b(@c.j0 Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new a().f(bundle.getCharSequence("name")).c(bundle2 != null ? IconCompat.e(bundle2) : null).g(bundle.getString("uri")).e(bundle.getString(f226j)).b(bundle.getBoolean(f227k)).d(bundle.getBoolean(f228l)).a();
    }

    @c.o0(22)
    @c.j0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static v3 c(@c.j0 PersistableBundle persistableBundle) {
        return new a().f(persistableBundle.getString("name")).g(persistableBundle.getString("uri")).e(persistableBundle.getString(f226j)).b(persistableBundle.getBoolean(f227k)).d(persistableBundle.getBoolean(f228l)).a();
    }

    @c.k0
    public IconCompat d() {
        return this.f230b;
    }

    @c.k0
    public String e() {
        return this.f232d;
    }

    @c.k0
    public CharSequence f() {
        return this.f229a;
    }

    @c.k0
    public String g() {
        return this.f231c;
    }

    public boolean h() {
        return this.f233e;
    }

    public boolean i() {
        return this.f234f;
    }

    @c.j0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public String j() {
        String str = this.f231c;
        if (str != null) {
            return str;
        }
        if (this.f229a == null) {
            return s0.a.f11071l;
        }
        return "name:" + ((Object) this.f229a);
    }

    @c.o0(28)
    @c.j0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public Person k() {
        return l3.a().setName(f()).setIcon(d() != null ? d().J() : null).setUri(g()).setKey(e()).setBot(h()).setImportant(i()).build();
    }

    @c.j0
    public a l() {
        return new a(this);
    }

    @c.j0
    public Bundle m() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f229a);
        IconCompat iconCompat = this.f230b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.I() : null);
        bundle.putString("uri", this.f231c);
        bundle.putString(f226j, this.f232d);
        bundle.putBoolean(f227k, this.f233e);
        bundle.putBoolean(f228l, this.f234f);
        return bundle;
    }

    @c.o0(22)
    @c.j0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public PersistableBundle n() {
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = this.f229a;
        persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString("uri", this.f231c);
        persistableBundle.putString(f226j, this.f232d);
        persistableBundle.putBoolean(f227k, this.f233e);
        persistableBundle.putBoolean(f228l, this.f234f);
        return persistableBundle;
    }
}
