package q2;

/* JADX INFO: loaded from: classes.dex */
public class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f10454e = 20;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f10455f = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10457d;

    public d(String str, String str2, String str3) {
        super(str);
        this.f10456c = str2;
        this.f10457d = str3;
    }

    public String b() {
        return this.f10457d;
    }

    public String c() {
        return this.f10456c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return new c(20, this.f10456c, this.f10457d).b(super.getMessage());
    }
}
