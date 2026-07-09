package s0;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f11092a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11093b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f11094c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f11095d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f11096e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f11097f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f11098g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f11099h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f11100i = 256;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f11101j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f11102k = 63;

    @j0
    public static Spanned a(@j0 String str, int i4) {
        return Html.fromHtml(str, i4);
    }

    @j0
    public static Spanned b(@j0 String str, int i4, @k0 Html.ImageGetter imageGetter, @k0 Html.TagHandler tagHandler) {
        return Html.fromHtml(str, i4, imageGetter, tagHandler);
    }

    @j0
    public static String c(@j0 Spanned spanned, int i4) {
        return Html.toHtml(spanned, i4);
    }
}
