package j3;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class d extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f8304c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Throwable> f8305b;

    public d(String str) {
        this(new Exception(str));
    }

    public List<Throwable> a() {
        return this.f8305b;
    }

    public d(List<Throwable> list) {
        this.f8305b = list;
    }

    public d(Throwable... thArr) {
        this((List<Throwable>) Arrays.asList(thArr));
    }
}
