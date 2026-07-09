package t3;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f11512c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Throwable> f11513b;

    public d(String str) {
        this(new Exception(str));
    }

    public List<Throwable> a() {
        return this.f11513b;
    }

    public d(Throwable th) {
        this((List<Throwable>) Arrays.asList(th));
    }

    public d(List<Throwable> list) {
        this.f11513b = list;
    }
}
