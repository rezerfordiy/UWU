package d3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class c extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f6752b = 1;

    public c(Throwable th, String str, Object... objArr) {
        super(String.format("%s(%s)", str, b(", ", objArr)), th);
    }

    public static String a(String str, Collection<Object> collection) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<Object> it = collection.iterator();
        while (it.hasNext()) {
            stringBuffer.append(c(it.next()));
            if (it.hasNext()) {
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }

    public static String b(String str, Object... objArr) {
        return a(str, Arrays.asList(objArr));
    }

    public static String c(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Throwable unused) {
            return "[toString failed]";
        }
    }

    public boolean equals(Object obj) {
        return toString().equals(obj.toString());
    }
}
