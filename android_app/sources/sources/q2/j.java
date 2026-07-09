package q2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10466a;

    public j() {
        this.f10466a = null;
    }

    public m O() {
        return new m();
    }

    public String P() {
        return this.f10466a;
    }

    public m Q() {
        m mVarO = O();
        c(mVarO);
        return mVarO;
    }

    public void R() throws Throwable {
        U();
        try {
            S();
            try {
                V();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                V();
            } catch (Throwable unused) {
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public void S() throws Throwable {
        a.z("TestCase.fName cannot be null", this.f10466a);
        Method method = null;
        try {
            method = getClass().getMethod(this.f10466a, null);
        } catch (NoSuchMethodException unused) {
            a.J("Method \"" + this.f10466a + "\" not found");
        }
        if (!Modifier.isPublic(method.getModifiers())) {
            a.J("Method \"" + this.f10466a + "\" should be public");
        }
        try {
            method.invoke(this, new Object[0]);
        } catch (IllegalAccessException e4) {
            e4.fillInStackTrace();
            throw e4;
        } catch (InvocationTargetException e5) {
            e5.fillInStackTrace();
            throw e5.getTargetException();
        }
    }

    public void T(String str) {
        this.f10466a = str;
    }

    public void U() throws Exception {
    }

    public void V() throws Exception {
    }

    @Override // q2.i
    public int b() {
        return 1;
    }

    @Override // q2.i
    public void c(m mVar) {
        mVar.k(this);
    }

    public String toString() {
        return P() + "(" + getClass().getName() + ")";
    }

    public j(String str) {
        this.f10466a = str;
    }
}
