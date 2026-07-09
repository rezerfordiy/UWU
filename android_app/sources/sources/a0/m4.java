package a0;

import android.app.Service;
import c.r0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f152a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f153b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f154c = 2;

    @Retention(RetentionPolicy.SOURCE)
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    public static void a(@c.j0 Service service, int i4) {
        service.stopForeground(i4);
    }
}
