package b0;

import android.content.ContentProvider;
import android.content.Context;
import c.j0;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    @j0
    public static Context a(@j0 ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}
