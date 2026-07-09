package z1;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u5 f13966a = new a();

    public class a extends u5 {
    }

    public interface b {
        void a();

        void d();
    }

    public interface c {
        void a(Map<String, Object> map);

        byte[] b(String str);
    }

    public enum d {
        HEART_BEAT("heart_beat"),
        MAGNETIC_PARAMS_CONTROL("MAGNETIC_PARAMS_CONTROL");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f13970b;

        d(String str) {
            this.f13970b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13970b;
        }
    }

    public u5() {
    }

    public void h(int i4) {
    }

    public void i() {
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public void l() {
    }

    public void m(b bVar) {
    }

    public void n(c cVar) {
    }

    public void o() {
    }

    public u5(String str) {
    }
}
