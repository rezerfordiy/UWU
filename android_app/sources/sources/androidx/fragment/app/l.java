package androidx.fragment.app;

import c.k0;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @k0
    public final Collection<Fragment> f3923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k0
    public final Map<String, l> f3924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @k0
    public final Map<String, androidx.lifecycle.a0> f3925c;

    public l(@k0 Collection<Fragment> collection, @k0 Map<String, l> map, @k0 Map<String, androidx.lifecycle.a0> map2) {
        this.f3923a = collection;
        this.f3924b = map;
        this.f3925c = map2;
    }

    @k0
    public Map<String, l> a() {
        return this.f3924b;
    }

    @k0
    public Collection<Fragment> b() {
        return this.f3923a;
    }

    @k0
    public Map<String, androidx.lifecycle.a0> c() {
        return this.f3925c;
    }

    public boolean d(Fragment fragment) {
        Collection<Fragment> collection = this.f3923a;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }
}
