package p2;

import q2.h;
import q2.i;
import q2.m;

/* JADX INFO: loaded from: classes.dex */
public class d extends c {

    public class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f10090a;

        public a(m mVar) {
            this.f10090a = mVar;
        }

        @Override // q2.h
        public void a() throws Exception {
            d.this.Q();
            d.this.O(this.f10090a);
            d.this.R();
        }
    }

    public d(i iVar) {
        super(iVar);
    }

    public void Q() throws Exception {
    }

    public void R() throws Exception {
    }

    @Override // p2.c, q2.i
    public void c(m mVar) {
        mVar.m(this, new a(mVar));
    }
}
