package q3;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class e implements Comparator<p3.c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e f10485b = new e(new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator<p3.c> f10486a;

    public static class a implements Comparator<p3.c> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(p3.c cVar, p3.c cVar2) {
            return 0;
        }
    }

    public e(Comparator<p3.c> comparator) {
        this.f10486a = comparator;
    }

    public void a(Object obj) {
        if (obj instanceof d) {
            ((d) obj).d(this);
        }
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(p3.c cVar, p3.c cVar2) {
        return this.f10486a.compare(cVar, cVar2);
    }
}
