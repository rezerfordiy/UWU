package d3;

import c3.d;
import c3.f;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import t3.j;

/* JADX INFO: loaded from: classes.dex */
public class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f6747a;

    public static class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t3.c f6748a;

        public b(t3.c cVar) {
            this.f6748a = cVar;
        }

        @Override // c3.f
        public String b() throws f.b {
            return this.f6748a.f();
        }

        @Override // c3.f
        public Object c() throws f.b {
            try {
                return this.f6748a.h(null, new Object[0]);
            } catch (IllegalAccessException unused) {
                throw new RuntimeException("unexpected: getMethods returned an inaccessible method");
            } catch (IllegalArgumentException unused2) {
                throw new RuntimeException("unexpected: argument length is checked");
            }
        }
    }

    public a(j jVar) {
        this.f6747a = jVar;
    }

    @Override // c3.d
    public List<f> a(c3.c cVar) {
        ArrayList arrayList = new ArrayList();
        c(cVar, arrayList);
        e(cVar, arrayList);
        d(arrayList);
        return arrayList;
    }

    public final void b(String str, List<f> list, Object obj) {
        for (int i4 = 0; i4 < Array.getLength(obj); i4++) {
            list.add(f.a(str + "[" + i4 + "]", Array.get(obj, i4)));
        }
    }

    public final void c(c3.c cVar, List<f> list) {
        for (Field field : this.f6747a.g().getFields()) {
            if (Modifier.isStatic(field.getModifiers())) {
                Class<?> type = field.getType();
                if (cVar.a(type) && field.getAnnotation(c3.b.class) != null) {
                    b(field.getName(), list, f(field));
                } else if (cVar.b(type) && field.getAnnotation(c3.a.class) != null) {
                    list.add(f.a(field.getName(), f(field)));
                }
            }
        }
    }

    public final void d(List<f> list) {
        for (t3.c cVar : this.f6747a.e(c3.b.class)) {
            try {
                b(cVar.f(), list, cVar.h(null, new Object[0]));
            } catch (Throwable unused) {
            }
        }
    }

    public final void e(c3.c cVar, List<f> list) {
        for (t3.c cVar2 : this.f6747a.e(c3.a.class)) {
            if (cVar2.j(cVar.g())) {
                list.add(new b(cVar2));
            }
        }
    }

    public final Object f(Field field) {
        try {
            return field.get(null);
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("unexpected: getFields returned an inaccessible field");
        } catch (IllegalArgumentException unused2) {
            throw new RuntimeException("unexpected: field from getClass doesn't exist on object");
        }
    }
}
