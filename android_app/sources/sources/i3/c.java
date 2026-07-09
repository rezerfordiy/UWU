package i3;

import java.util.Comparator;
import p3.e;
import p3.h;

/* JADX INFO: loaded from: classes.dex */
public class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f8201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator<p3.c> f8202b;

    public c(e eVar, Comparator<p3.c> comparator) {
        this.f8201a = eVar;
        this.f8202b = comparator;
    }

    @Override // p3.e
    public h h() {
        h hVarH = this.f8201a.h();
        new q3.e(this.f8202b).a(hVarH);
        return hVarH;
    }
}
