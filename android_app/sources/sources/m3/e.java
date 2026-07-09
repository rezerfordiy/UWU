package m3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public class e extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f8942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<t3.c> f8944c;

    public e(i iVar, List<t3.c> list, Object obj) {
        this.f8942a = iVar;
        this.f8944c = list;
        this.f8943b = obj;
    }

    @Override // t3.i
    public void a() throws Throwable {
        ArrayList arrayList = new ArrayList();
        try {
            this.f8942a.a();
            Iterator<t3.c> it = this.f8944c.iterator();
            while (it.hasNext()) {
                try {
                    it.next().h(this.f8943b, new Object[0]);
                } catch (Throwable th) {
                    arrayList.add(th);
                }
            }
        } catch (Throwable th2) {
            try {
                arrayList.add(th2);
                Iterator<t3.c> it2 = this.f8944c.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().h(this.f8943b, new Object[0]);
                    } catch (Throwable th3) {
                        arrayList.add(th3);
                    }
                }
            } catch (Throwable th4) {
                Iterator<t3.c> it3 = this.f8944c.iterator();
                while (it3.hasNext()) {
                    try {
                        it3.next().h(this.f8943b, new Object[0]);
                    } catch (Throwable th5) {
                        arrayList.add(th5);
                    }
                }
                throw th4;
            }
        }
        t3.e.a(arrayList);
    }
}
