package d;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface a {

    /* JADX INFO: renamed from: d.a$a, reason: collision with other inner class name */
    public enum EnumC0052a {
        WARNING,
        ERROR
    }

    EnumC0052a level() default EnumC0052a.ERROR;
}
