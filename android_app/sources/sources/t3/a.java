package t3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public class a extends b<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f11507a;

    public a(Field field) {
        this.f11507a = field;
    }

    @Override // t3.b
    public Annotation[] a() {
        return this.f11507a.getAnnotations();
    }

    public Object d(Object obj) throws IllegalAccessException, IllegalArgumentException {
        return this.f11507a.get(obj);
    }

    public Field e() {
        return this.f11507a;
    }

    public String f() {
        return e().getName();
    }

    public Class<?> g() {
        return this.f11507a.getType();
    }

    public boolean h() {
        return Modifier.isPublic(this.f11507a.getModifiers());
    }

    @Override // t3.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(a aVar) {
        return aVar.f().equals(f());
    }

    public boolean j() {
        return Modifier.isStatic(this.f11507a.getModifiers());
    }
}
