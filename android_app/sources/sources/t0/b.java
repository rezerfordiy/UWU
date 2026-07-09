package t0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import c.j0;
import c.k0;
import c.r0;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u0.g;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f11460a = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Comparator<C0116b> f11461b = new a();

    public class a implements Comparator<C0116b> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0116b c0116b, C0116b c0116b2) {
            int i4;
            int i5;
            int i6 = c0116b.f11464c;
            int i7 = c0116b2.f11464c;
            if (i6 < i7) {
                return -1;
            }
            if (i6 <= i7 && (i4 = c0116b.f11465d) >= (i5 = c0116b2.f11465d)) {
                return i4 > i5 ? -1 : 0;
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: t0.b$b, reason: collision with other inner class name */
    public static class C0116b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public URLSpan f11462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f11463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f11465d;
    }

    @Retention(RetentionPolicy.SOURCE)
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public static void a(@j0 TextView textView) {
        if ((textView.getMovementMethod() instanceof LinkMovementMethod) || !textView.getLinksClickable()) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void b(@j0 TextView textView, @j0 Pattern pattern, @k0 String str) {
        if (p()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            d(textView, pattern, str, null, null, null);
        }
    }

    public static void c(@j0 TextView textView, @j0 Pattern pattern, @k0 String str, @k0 Linkify.MatchFilter matchFilter, @k0 Linkify.TransformFilter transformFilter) {
        if (p()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            d(textView, pattern, str, null, matchFilter, transformFilter);
        }
    }

    @SuppressLint({"NewApi"})
    public static void d(@j0 TextView textView, @j0 Pattern pattern, @k0 String str, @k0 String[] strArr, @k0 Linkify.MatchFilter matchFilter, @k0 Linkify.TransformFilter transformFilter) {
        if (p()) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString spannableStringValueOf = SpannableString.valueOf(textView.getText());
        if (h(spannableStringValueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(spannableStringValueOf);
            a(textView);
        }
    }

    public static boolean e(@j0 Spannable spannable, int i4) {
        if (p()) {
            return Linkify.addLinks(spannable, i4);
        }
        if (i4 == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i4 & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList<C0116b> arrayList = new ArrayList();
        if ((i4 & 1) != 0) {
            l(arrayList, spannable, g.f11584w, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((i4 & 2) != 0) {
            l(arrayList, spannable, g.A, new String[]{o0.c.f9856b}, null, null);
        }
        if ((i4 & 8) != 0) {
            m(arrayList, spannable);
        }
        o(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        for (C0116b c0116b : arrayList) {
            if (c0116b.f11462a == null) {
                j(c0116b.f11463b, c0116b.f11464c, c0116b.f11465d, spannable);
            }
        }
        return true;
    }

    public static boolean f(@j0 Spannable spannable, @j0 Pattern pattern, @k0 String str) {
        return p() ? Linkify.addLinks(spannable, pattern, str) : h(spannable, pattern, str, null, null, null);
    }

    public static boolean g(@j0 Spannable spannable, @j0 Pattern pattern, @k0 String str, @k0 Linkify.MatchFilter matchFilter, @k0 Linkify.TransformFilter transformFilter) {
        return p() ? Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter) : h(spannable, pattern, str, null, matchFilter, transformFilter);
    }

    @SuppressLint({"NewApi"})
    public static boolean h(@j0 Spannable spannable, @j0 Pattern pattern, @k0 String str, @k0 String[] strArr, @k0 Linkify.MatchFilter matchFilter, @k0 Linkify.TransformFilter transformFilter) {
        if (p()) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = s0.a.f11071l;
        }
        if (strArr == null || strArr.length < 1) {
            strArr = f11460a;
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i4 = 0;
        while (i4 < strArr.length) {
            String str2 = strArr[i4];
            i4++;
            strArr2[i4] = str2 == null ? s0.a.f11071l : str2.toLowerCase(Locale.ROOT);
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z3 = false;
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (matchFilter != null ? matchFilter.acceptMatch(spannable, iStart, iEnd) : true) {
                j(n(matcher.group(0), strArr2, matcher, transformFilter), iStart, iEnd, spannable);
                z3 = true;
            }
        }
        return z3;
    }

    public static boolean i(@j0 TextView textView, int i4) {
        if (p()) {
            return Linkify.addLinks(textView, i4);
        }
        if (i4 == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            if (!e((Spannable) text, i4)) {
                return false;
            }
            a(textView);
            return true;
        }
        SpannableString spannableStringValueOf = SpannableString.valueOf(text);
        if (!e(spannableStringValueOf, i4)) {
            return false;
        }
        a(textView);
        textView.setText(spannableStringValueOf);
        return true;
    }

    public static void j(String str, int i4, int i5, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i4, i5, 33);
    }

    public static String k(String str) {
        return Build.VERSION.SDK_INT >= 28 ? WebView.findAddress(str) : t0.a.c(str);
    }

    public static void l(ArrayList<C0116b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                C0116b c0116b = new C0116b();
                c0116b.f11463b = n(matcher.group(0), strArr, matcher, transformFilter);
                c0116b.f11464c = iStart;
                c0116b.f11465d = iEnd;
                arrayList.add(c0116b);
            }
        }
    }

    public static void m(ArrayList<C0116b> arrayList, Spannable spannable) {
        int iIndexOf;
        String string = spannable.toString();
        int i4 = 0;
        while (true) {
            try {
                String strK = k(string);
                if (strK != null && (iIndexOf = string.indexOf(strK)) >= 0) {
                    C0116b c0116b = new C0116b();
                    int length = strK.length() + iIndexOf;
                    c0116b.f11464c = iIndexOf + i4;
                    i4 += length;
                    c0116b.f11465d = i4;
                    string = string.substring(length);
                    try {
                        c0116b.f11463b = "geo:0,0?q=" + URLEncoder.encode(strK, "UTF-8");
                        arrayList.add(c0116b);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    public static String n(@j0 String str, @j0 String[] strArr, Matcher matcher, @k0 Linkify.TransformFilter transformFilter) {
        boolean z3;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int i4 = 0;
        while (true) {
            if (i4 >= strArr.length) {
                z3 = false;
                break;
            }
            String str2 = strArr[i4];
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                String str3 = strArr[i4];
                z3 = true;
                if (!str.regionMatches(false, 0, str3, 0, str3.length())) {
                    str = strArr[i4] + str.substring(strArr[i4].length());
                }
            } else {
                i4++;
            }
        }
        if (z3 || strArr.length <= 0) {
            return str;
        }
        return strArr[0] + str;
    }

    public static void o(ArrayList<C0116b> arrayList, Spannable spannable) {
        int i4;
        int i5 = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int i6 = 0; i6 < uRLSpanArr.length; i6++) {
            C0116b c0116b = new C0116b();
            URLSpan uRLSpan = uRLSpanArr[i6];
            c0116b.f11462a = uRLSpan;
            c0116b.f11464c = spannable.getSpanStart(uRLSpan);
            c0116b.f11465d = spannable.getSpanEnd(uRLSpanArr[i6]);
            arrayList.add(c0116b);
        }
        Collections.sort(arrayList, f11461b);
        int size = arrayList.size();
        while (i5 < size - 1) {
            C0116b c0116b2 = arrayList.get(i5);
            int i7 = i5 + 1;
            C0116b c0116b3 = arrayList.get(i7);
            int i8 = c0116b2.f11464c;
            int i9 = c0116b3.f11464c;
            if (i8 <= i9 && (i4 = c0116b2.f11465d) > i9) {
                int i10 = c0116b3.f11465d;
                int i11 = (i10 > i4 && i4 - i8 <= i10 - i9) ? i4 - i8 < i10 - i9 ? i5 : -1 : i7;
                if (i11 != -1) {
                    Object obj = arrayList.get(i11).f11462a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i11);
                    size--;
                }
            }
            i5 = i7;
        }
    }

    public static boolean p() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
