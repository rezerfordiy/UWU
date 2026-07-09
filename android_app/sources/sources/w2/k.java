package w2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface k {

    public static class a extends Throwable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f12631b = 1;
    }

    Class<? extends Throwable> expected() default a.class;

    long timeout() default 0;
}
