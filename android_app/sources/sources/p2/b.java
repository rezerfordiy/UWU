package p2;

import q2.i;
import q2.m;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10088b;

    public b(i iVar, int i4) {
        super(iVar);
        if (i4 < 0) {
            throw new IllegalArgumentException("Repetition count must be >= 0");
        }
        this.f10088b = i4;
    }

    @Override // p2.c, q2.i
    public int b() {
        return super.b() * this.f10088b;
    }

    @Override // p2.c, q2.i
    public void c(m mVar) {
        for (int i4 = 0; i4 < this.f10088b && !mVar.n(); i4++) {
            super.c(mVar);
        }
    }

    @Override // p2.c
    public String toString() {
        return super.toString() + "(repeated)";
    }
}
