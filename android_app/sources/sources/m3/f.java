package m3;

import java.util.Iterator;
import java.util.List;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public class f extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f8945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<t3.c> f8947c;

    public f(i iVar, List<t3.c> list, Object obj) {
        this.f8945a = iVar;
        this.f8947c = list;
        this.f8946b = obj;
    }

    @Override // t3.i
    public void a() throws Throwable {
        Iterator<t3.c> it = this.f8947c.iterator();
        while (it.hasNext()) {
            it.next().h(this.f8946b, new Object[0]);
        }
        this.f8945a.a();
    }
}
