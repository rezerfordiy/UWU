package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry;
import c.g0;
import c.j0;
import c.k0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f4172e = "values";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f4173f = "keys";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Class[] f4174g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f4175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, SavedStateRegistry.b> f4176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, b<?>> f4177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SavedStateRegistry.b f4178d;

    public class a implements SavedStateRegistry.b {
        public a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        @j0
        public Bundle a() {
            for (Map.Entry entry : new HashMap(v.this.f4176b).entrySet()) {
                v.this.k((String) entry.getKey(), ((SavedStateRegistry.b) entry.getValue()).a());
            }
            Set<String> setKeySet = v.this.f4175a.keySet();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(setKeySet.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            for (String str : setKeySet) {
                arrayList.add(str);
                arrayList2.add(v.this.f4175a.get(str));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList(v.f4173f, arrayList);
            bundle.putParcelableArrayList(v.f4172e, arrayList2);
            return bundle;
        }
    }

    public static class b<T> extends q<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f4180m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public v f4181n;

        public b(v vVar, String str) {
            this.f4180m = str;
            this.f4181n = vVar;
        }

        @Override // androidx.lifecycle.q, androidx.lifecycle.LiveData
        public void q(T t4) {
            v vVar = this.f4181n;
            if (vVar != null) {
                vVar.f4175a.put(this.f4180m, t4);
            }
            super.q(t4);
        }

        public void r() {
            this.f4181n = null;
        }

        public b(v vVar, String str, T t4) {
            super(t4);
            this.f4180m = str;
            this.f4181n = vVar;
        }
    }

    public v() {
        this.f4176b = new HashMap();
        this.f4177c = new HashMap();
        this.f4178d = new a();
        this.f4175a = new HashMap();
    }

    public static v c(@k0 Bundle bundle, @k0 Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new v();
        }
        HashMap map = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                map.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new v(map);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f4173f);
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f4172e);
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
            map.put((String) parcelableArrayList.get(i4), parcelableArrayList2.get(i4));
        }
        return new v(map);
    }

    public static void m(Object obj) {
        if (obj == null) {
            return;
        }
        for (Class cls : f4174g) {
            if (cls.isInstance(obj)) {
                return;
            }
        }
        throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
    }

    @g0
    public void a(@j0 String str) {
        this.f4176b.remove(str);
    }

    @g0
    public boolean b(@j0 String str) {
        return this.f4175a.containsKey(str);
    }

    @g0
    @k0
    public <T> T d(@j0 String str) {
        return (T) this.f4175a.get(str);
    }

    @g0
    @j0
    public <T> q<T> e(@j0 String str) {
        return g(str, false, null);
    }

    @g0
    @j0
    public <T> q<T> f(@j0 String str, @SuppressLint({"UnknownNullness"}) T t4) {
        return g(str, true, t4);
    }

    @j0
    public final <T> q<T> g(@j0 String str, boolean z3, @k0 T t4) {
        b<?> bVar = this.f4177c.get(str);
        if (bVar != null) {
            return bVar;
        }
        b<?> bVar2 = this.f4175a.containsKey(str) ? new b<>(this, str, this.f4175a.get(str)) : z3 ? new b<>(this, str, t4) : new b<>(this, str);
        this.f4177c.put(str, bVar2);
        return bVar2;
    }

    @g0
    @j0
    public Set<String> h() {
        HashSet hashSet = new HashSet(this.f4175a.keySet());
        hashSet.addAll(this.f4176b.keySet());
        hashSet.addAll(this.f4177c.keySet());
        return hashSet;
    }

    @g0
    @k0
    public <T> T i(@j0 String str) {
        T t4 = (T) this.f4175a.remove(str);
        b<?> bVarRemove = this.f4177c.remove(str);
        if (bVarRemove != null) {
            bVarRemove.r();
        }
        return t4;
    }

    @j0
    public SavedStateRegistry.b j() {
        return this.f4178d;
    }

    @g0
    public <T> void k(@j0 String str, @k0 T t4) {
        m(t4);
        b<?> bVar = this.f4177c.get(str);
        if (bVar != null) {
            bVar.q(t4);
        } else {
            this.f4175a.put(str, t4);
        }
    }

    @g0
    public void l(@j0 String str, @j0 SavedStateRegistry.b bVar) {
        this.f4176b.put(str, bVar);
    }

    public v(@j0 Map<String, Object> map) {
        this.f4176b = new HashMap();
        this.f4177c = new HashMap();
        this.f4178d = new a();
        this.f4175a = new HashMap(map);
    }
}
