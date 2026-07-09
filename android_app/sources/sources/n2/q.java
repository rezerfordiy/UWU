package n2;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f9557a = 7;

    public static void a(Context context) {
        File dataDir;
        o1 o1VarD = o1.d(context);
        int iE = o1VarD.e("Sonoptek_Version_Code", 0);
        o1VarD.i("Sonoptek_Version_Code", f9557a);
        if (iE < f9557a && (dataDir = context.getDataDir()) != null && dataDir.exists()) {
            b(dataDir);
        }
    }

    public static void b(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    b(file2);
                }
            }
            if (file.getName().endsWith(".so") || file.getName().endsWith(".bc") || file.getName().endsWith(".o")) {
                file.delete();
            }
        }
    }
}
