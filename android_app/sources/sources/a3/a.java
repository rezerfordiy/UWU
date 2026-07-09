package a3;

import java.util.Iterator;
import java.util.List;
import p3.f;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<r3.a> f515a;

    public a(List<r3.a> list) {
        this.f515a = list;
    }

    public f a() {
        f fVar = new f();
        r3.b bVarG = fVar.g();
        Iterator<r3.a> it = this.f515a.iterator();
        while (it.hasNext()) {
            try {
                bVarG.b(it.next());
            } catch (Exception unused) {
                throw new RuntimeException("I can't believe this happened");
            }
        }
        return fVar;
    }
}
