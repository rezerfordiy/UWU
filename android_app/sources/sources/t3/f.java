package t3;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f11516a;

    public f(Method method) {
        this.f11516a = method;
    }

    public void a(List<Throwable> list) {
        for (Type type : this.f11516a.getGenericParameterTypes()) {
            d(type, list);
        }
    }

    public final void b(GenericArrayType genericArrayType, List<Throwable> list) {
        d(genericArrayType.getGenericComponentType(), list);
    }

    public final void c(ParameterizedType parameterizedType, List<Throwable> list) {
        for (Type type : parameterizedType.getActualTypeArguments()) {
            d(type, list);
        }
    }

    public final void d(Type type, List<Throwable> list) {
        if (type instanceof TypeVariable) {
            list.add(new Exception("Method " + this.f11516a.getName() + "() contains unresolved type variable " + type));
            return;
        }
        if (type instanceof ParameterizedType) {
            c((ParameterizedType) type, list);
        } else if (type instanceof WildcardType) {
            e((WildcardType) type, list);
        } else if (type instanceof GenericArrayType) {
            b((GenericArrayType) type, list);
        }
    }

    public final void e(WildcardType wildcardType, List<Throwable> list) {
        for (Type type : wildcardType.getUpperBounds()) {
            d(type, list);
        }
        for (Type type2 : wildcardType.getLowerBounds()) {
            d(type2, list);
        }
    }
}
