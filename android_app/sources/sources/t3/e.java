package t3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f11514c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Throwable> f11515b;

    public e(List<Throwable> list) {
        this.f11515b = new ArrayList(list);
    }

    public static void a(List<Throwable> list) throws Throwable {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() != 1) {
            throw new k3.b(list);
        }
        throw list.get(0);
    }

    public List<Throwable> b() {
        return Collections.unmodifiableList(this.f11515b);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(String.format("There were %d errors:", Integer.valueOf(this.f11515b.size())));
        for (Throwable th : this.f11515b) {
            sb.append(String.format("\n  %s(%s)", th.getClass().getName(), th.getMessage()));
        }
        return sb.toString();
    }
}
