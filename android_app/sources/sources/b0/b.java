package b0;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import p0.n;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, p0.b bVar) throws Exception {
        Object objB;
        if (bVar != null) {
            try {
                objB = bVar.b();
            } catch (Exception e4) {
                if (e4 instanceof OperationCanceledException) {
                    throw new n();
                }
                throw e4;
            }
        } else {
            objB = null;
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) objB);
    }
}
