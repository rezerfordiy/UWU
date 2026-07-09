package c0;

import c.r0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@c.r0({r0.a.LIBRARY_GROUP_PREFIX})
public abstract class t0<T> {

    @c.r0({r0.a.LIBRARY})
    public static class a extends t0<Void> {
        @Override // c0.t0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void a(List<s0> list) {
            return null;
        }

        @Override // c0.t0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void c() {
            return null;
        }

        @Override // c0.t0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void d(List<String> list) {
            return null;
        }
    }

    @c.d
    public abstract T a(List<s0> list);

    @c.a1
    public List<s0> b() throws Exception {
        return new ArrayList();
    }

    @c.d
    public abstract T c();

    @c.d
    public abstract T d(List<String> list);
}
