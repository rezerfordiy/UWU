package c3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f4756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Annotation[] f4757b;

    public c(Class<?> cls, Annotation[] annotationArr) {
        this.f4756a = cls;
        this.f4757b = annotationArr;
    }

    public static ArrayList<c> i(Method method) {
        return j(method.getParameterTypes(), method.getParameterAnnotations());
    }

    public static ArrayList<c> j(Class<?>[] clsArr, Annotation[][] annotationArr) {
        ArrayList<c> arrayList = new ArrayList<>();
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            arrayList.add(new c(clsArr[i4], annotationArr[i4]));
        }
        return arrayList;
    }

    public static List<c> k(Constructor<?> constructor) {
        return j(constructor.getParameterTypes(), constructor.getParameterAnnotations());
    }

    public boolean a(Class<?> cls) {
        return cls.isArray() && b(cls.getComponentType());
    }

    public boolean b(Class<?> cls) {
        return this.f4756a.isAssignableFrom(cls);
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) d(this.f4757b, cls, 3);
    }

    public final <T extends Annotation> T d(Annotation[] annotationArr, Class<T> cls, int i4) {
        if (i4 == 0) {
            return null;
        }
        int length = annotationArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            Annotation annotationD = annotationArr[i5];
            if (cls.isInstance(annotationD) || (annotationD = d(annotationD.annotationType().getAnnotations(), cls, i4 - 1)) != null) {
                return cls.cast(annotationD);
            }
        }
        return null;
    }

    public <T extends Annotation> T e(Class<T> cls) {
        for (Annotation annotation : f()) {
            if (cls.isInstance(annotation)) {
                return cls.cast(annotation);
            }
        }
        return null;
    }

    public List<Annotation> f() {
        return Arrays.asList(this.f4757b);
    }

    public Class<?> g() {
        return this.f4756a;
    }

    public boolean h(Class<? extends Annotation> cls) {
        return e(cls) != null;
    }
}
