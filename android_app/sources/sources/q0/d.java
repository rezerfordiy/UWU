package q0;

import android.util.Base64;
import c.j0;
import c.k0;
import c.r0;
import java.util.List;
import u0.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f10228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10230f;

    public d(@j0 String str, @j0 String str2, @j0 String str3, @c.e int i4) {
        this.f10225a = (String) i.g(str);
        this.f10226b = (String) i.g(str2);
        this.f10227c = (String) i.g(str3);
        this.f10228d = null;
        i.a(i4 != 0);
        this.f10229e = i4;
        this.f10230f = a(str, str2, str3);
    }

    public final String a(@j0 String str, @j0 String str2, @j0 String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    @k0
    public List<List<byte[]>> b() {
        return this.f10228d;
    }

    @c.e
    public int c() {
        return this.f10229e;
    }

    @j0
    @r0({r0.a.LIBRARY})
    public String d() {
        return this.f10230f;
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public String e() {
        return this.f10230f;
    }

    @j0
    public String f() {
        return this.f10225a;
    }

    @j0
    public String g() {
        return this.f10226b;
    }

    @j0
    public String h() {
        return this.f10227c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f10225a + ", mProviderPackage: " + this.f10226b + ", mQuery: " + this.f10227c + ", mCertificates:");
        for (int i4 = 0; i4 < this.f10228d.size(); i4++) {
            sb.append(" [");
            List<byte[]> list = this.f10228d.get(i4);
            for (int i5 = 0; i5 < list.size(); i5++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i5), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f10229e);
        return sb.toString();
    }

    public d(@j0 String str, @j0 String str2, @j0 String str3, @j0 List<List<byte[]>> list) {
        this.f10225a = (String) i.g(str);
        this.f10226b = (String) i.g(str2);
        this.f10227c = (String) i.g(str3);
        this.f10228d = (List) i.g(list);
        this.f10229e = 0;
        this.f10230f = a(str, str2, str3);
    }
}
