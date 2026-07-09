package p0;

import android.os.Environment;
import c.j0;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10050a = "EnvironmentCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f10051b = "unknown";

    @j0
    public static String a(@j0 File file) {
        return Environment.getExternalStorageState(file);
    }
}
