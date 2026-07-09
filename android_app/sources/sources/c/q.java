package c;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4510a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4511b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4512c = 2;

    int unit() default 1;
}
