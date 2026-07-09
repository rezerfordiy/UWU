package t1;

import c.r0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public @interface b {
    String defaultValue() default "";

    int value();
}
