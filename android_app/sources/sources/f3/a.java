package f3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends AssertionError {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f7652e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<Integer> f7653b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AssertionError f7655d;

    public a(String str, AssertionError assertionError, int i4) {
        this.f7654c = str;
        this.f7655d = assertionError;
        a(i4);
    }

    public void a(int i4) {
        this.f7653b.add(0, Integer.valueOf(i4));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        String str = this.f7654c;
        if (str != null) {
            sb.append(str);
        }
        sb.append("arrays first differed at element ");
        Iterator<Integer> it = this.f7653b.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            sb.append("[");
            sb.append(iIntValue);
            sb.append("]");
        }
        sb.append("; ");
        sb.append(this.f7655d.getMessage());
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }
}
