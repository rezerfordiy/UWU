package t2;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d {
    @Override // t2.d
    public d a(String str) {
        h(str);
        return this;
    }

    @Override // t2.d
    public <T> d b(String str, String str2, String str3, T... tArr) {
        return e(str, str2, str3, Arrays.asList(tArr));
    }

    @Override // t2.d
    public d c(Object obj) {
        String str;
        if (obj != null) {
            if (obj instanceof String) {
                l((String) obj);
            } else if (obj instanceof Character) {
                g('\"');
                k(((Character) obj).charValue());
                g('\"');
            } else if (obj instanceof Short) {
                g('<');
                h(String.valueOf(obj));
                str = "s>";
            } else if (obj instanceof Long) {
                g('<');
                h(String.valueOf(obj));
                str = "L>";
            } else if (obj instanceof Float) {
                g('<');
                h(String.valueOf(obj));
                str = "F>";
            } else if (obj.getClass().isArray()) {
                j("[", ", ", "]", new v2.a(obj));
            } else {
                g('<');
                h(String.valueOf(obj));
                g('>');
            }
            return this;
        }
        str = "null";
        h(str);
        return this;
    }

    @Override // t2.d
    public d d(String str, String str2, String str3, Iterable<? extends g> iterable) {
        return i(str, str2, str3, iterable.iterator());
    }

    @Override // t2.d
    public <T> d e(String str, String str2, String str3, Iterable<T> iterable) {
        return j(str, str2, str3, iterable.iterator());
    }

    @Override // t2.d
    public d f(g gVar) {
        gVar.b(this);
        return this;
    }

    public abstract void g(char c4);

    public void h(String str) {
        for (int i4 = 0; i4 < str.length(); i4++) {
            g(str.charAt(i4));
        }
    }

    public final d i(String str, String str2, String str3, Iterator<? extends g> it) {
        h(str);
        boolean z3 = false;
        while (it.hasNext()) {
            if (z3) {
                h(str2);
            }
            f(it.next());
            z3 = true;
        }
        h(str3);
        return this;
    }

    public final <T> d j(String str, String str2, String str3, Iterator<T> it) {
        return i(str, str2, str3, new v2.c(it));
    }

    public final void k(char c4) {
        String str;
        if (c4 == '\t') {
            str = "\\t";
        } else if (c4 == '\n') {
            str = "\\n";
        } else if (c4 == '\r') {
            str = "\\r";
        } else {
            if (c4 != '\"') {
                g(c4);
                return;
            }
            str = "\\\"";
        }
        h(str);
    }

    public final void l(String str) {
        g('\"');
        for (int i4 = 0; i4 < str.length(); i4++) {
            k(str.charAt(i4));
        }
        g('\"');
    }
}
