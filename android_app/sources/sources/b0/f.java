package b0;

import android.annotation.SuppressLint;
import android.content.Intent;
import c.j0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4331a = "android.intent.action.CREATE_REMINDER";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f4332b = "android.intent.extra.HTML_TEXT";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f4333c = "android.intent.extra.START_PLAYBACK";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4334d = "android.intent.extra.TIME";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f4335e = "android.intent.category.LEANBACK_LAUNCHER";

    @j0
    public static Intent a(@j0 String str, @j0 String str2) {
        return Intent.makeMainSelectorActivity(str, str2);
    }
}
