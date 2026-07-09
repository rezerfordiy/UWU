package n2;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public class f1 extends Handler {
    public void a(m2.d0 d0Var) {
    }

    public void b(boolean z3) {
    }

    public void c(p1 p1Var) {
    }

    public void d(boolean z3) {
    }

    public void e(int i4) {
    }

    public void f(String str) {
    }

    public void g(String str) {
    }

    public void h() {
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        switch (message.what) {
            case e1.f9194m /* 8001 */:
                c((p1) message.obj);
                break;
            case e1.f9195n /* 8002 */:
                b(message.arg1 > 0);
                break;
            case e1.f9196o /* 8003 */:
                d(message.arg1 > 0);
                break;
            case e1.f9197p /* 8004 */:
                e(message.arg1);
                break;
            case e1.f9198q /* 8005 */:
                f((String) message.obj);
                break;
            case e1.f9199r /* 8006 */:
                a((m2.d0) message.obj);
                break;
            case e1.f9200s /* 8007 */:
                h();
                break;
            case e1.f9201t /* 8008 */:
                g((String) message.obj);
                break;
        }
    }
}
