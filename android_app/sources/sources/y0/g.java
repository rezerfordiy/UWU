package y0;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import c.j0;
import c.k0;
import c.o0;
import c.z0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12794a = 16777216;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12795b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f12796c = new String[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f12797d = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f12798e = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f12799f = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f12800g = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f12801h = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @z0
    public static final int f12802i = 2048;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @z0
    public static final int f12803j = 1024;

    @o0(30)
    public static class a {
        public static CharSequence a(@j0 EditorInfo editorInfo, int i4) {
            return editorInfo.getInitialSelectedText(i4);
        }

        public static CharSequence b(@j0 EditorInfo editorInfo, int i4, int i5) {
            return editorInfo.getInitialTextAfterCursor(i4, i5);
        }

        public static CharSequence c(@j0 EditorInfo editorInfo, int i4, int i5) {
            return editorInfo.getInitialTextBeforeCursor(i4, i5);
        }

        public static void d(@j0 EditorInfo editorInfo, CharSequence charSequence, int i4) {
            editorInfo.setInitialSurroundingSubText(charSequence, i4);
        }
    }

    @Deprecated
    public g() {
    }

    @j0
    public static String[] a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f12796c;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f12796c;
        }
        String[] stringArray = bundle.getStringArray(f12797d);
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray(f12798e);
        }
        return stringArray != null ? stringArray : f12796c;
    }

    @k0
    public static CharSequence b(@j0 EditorInfo editorInfo, int i4) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a(editorInfo, i4);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return null;
        }
        int i5 = editorInfo.initialSelStart;
        int i6 = editorInfo.initialSelEnd;
        int i7 = i5 > i6 ? i6 : i5;
        if (i5 <= i6) {
            i5 = i6;
        }
        int i8 = bundle.getInt(f12800g);
        int i9 = editorInfo.extras.getInt(f12801h);
        int i10 = i5 - i7;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i9 - i8 != i10 || (charSequence = editorInfo.extras.getCharSequence(f12799f)) == null) {
            return null;
        }
        return (i4 & 1) != 0 ? charSequence.subSequence(i8, i9) : TextUtils.substring(charSequence, i8, i9);
    }

    @k0
    public static CharSequence c(@j0 EditorInfo editorInfo, int i4, int i5) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.b(editorInfo, i4, i5);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f12799f)) == null) {
            return null;
        }
        int i6 = editorInfo.extras.getInt(f12801h);
        int i7 = i5 & 1;
        int iMin = Math.min(i4, charSequence.length() - i6) + i6;
        return i7 != 0 ? charSequence.subSequence(i6, iMin) : TextUtils.substring(charSequence, i6, iMin);
    }

    @k0
    public static CharSequence d(@j0 EditorInfo editorInfo, int i4, int i5) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.c(editorInfo, i4, i5);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f12799f)) == null) {
            return null;
        }
        int i6 = editorInfo.extras.getInt(f12800g);
        int i7 = i5 & 1;
        int iMin = i6 - Math.min(i4, i6);
        return i7 != 0 ? charSequence.subSequence(iMin, i6) : TextUtils.substring(charSequence, iMin, i6);
    }

    public static int e(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            return 1;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return 0;
        }
        boolean zContainsKey = bundle.containsKey(f12797d);
        boolean zContainsKey2 = editorInfo.extras.containsKey(f12798e);
        if (zContainsKey && zContainsKey2) {
            return 4;
        }
        if (zContainsKey) {
            return 3;
        }
        return zContainsKey2 ? 2 : 0;
    }

    public static boolean f(CharSequence charSequence, int i4, int i5) {
        if (i5 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i4));
        }
        if (i5 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i4));
    }

    public static boolean g(int i4) {
        int i5 = i4 & 4095;
        return i5 == 129 || i5 == 225 || i5 == 18;
    }

    public static void h(@j0 EditorInfo editorInfo, @k0 String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray(f12797d, strArr);
        editorInfo.extras.putStringArray(f12798e, strArr);
    }

    public static void i(@j0 EditorInfo editorInfo, @j0 CharSequence charSequence, int i4) {
        u0.i.g(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, i4);
            return;
        }
        int i5 = editorInfo.initialSelStart;
        int i6 = editorInfo.initialSelEnd;
        int i7 = i5 > i6 ? i6 - i4 : i5 - i4;
        int i8 = i5 > i6 ? i5 - i4 : i6 - i4;
        int length = charSequence.length();
        if (i4 < 0 || i7 < 0 || i8 > length) {
            k(editorInfo, null, 0, 0);
            return;
        }
        if (g(editorInfo.inputType)) {
            k(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            k(editorInfo, charSequence, i7, i8);
        } else {
            l(editorInfo, charSequence, i7, i8);
        }
    }

    public static void j(@j0 EditorInfo editorInfo, @j0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, 0);
        } else {
            i(editorInfo, charSequence, 0);
        }
    }

    public static void k(EditorInfo editorInfo, CharSequence charSequence, int i4, int i5) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence(f12799f, charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt(f12800g, i4);
        editorInfo.extras.putInt(f12801h, i5);
    }

    public static void l(EditorInfo editorInfo, CharSequence charSequence, int i4, int i5) {
        int i6 = i5 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i5, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (f(charSequence, i9, 0)) {
            i9++;
            iMin2--;
        }
        if (f(charSequence, (i5 + iMin) - 1, 1)) {
            iMin--;
        }
        CharSequence charSequenceConcat = i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i5, iMin + i5)) : charSequence.subSequence(i9, iMin2 + i7 + iMin + i9);
        int i10 = iMin2 + 0;
        k(editorInfo, charSequenceConcat, i10, i7 + i10);
    }
}
