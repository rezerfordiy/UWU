package k2;

import android.content.Context;
import java.io.File;
import n2.o1;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f8386a = 13;

    public static void a(Context context) {
        File dataDir;
        o1 o1VarD = o1.d(context);
        int iE = o1VarD.e("Sonoptek_Version_Code", 0);
        o1VarD.i("Sonoptek_Version_Code", f8386a);
        if (iE < f8386a && (dataDir = context.getDataDir()) != null && dataDir.exists()) {
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
