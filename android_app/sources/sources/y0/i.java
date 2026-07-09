package y0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import c.j0;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f12804a = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f12805b = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f12806c = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f12807d = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f12808e = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f12809f = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f12810g = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f12811h = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f12812i = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f12813j = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f12814k = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f12815l = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f12816m = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f12817n = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f12818o = 1;

    public class a extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f12819a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputConnection inputConnection, boolean z3, c cVar) {
            super(inputConnection, z3);
            this.f12819a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i4, Bundle bundle) {
            if (this.f12819a.a(j.g(inputContentInfo), i4, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i4, bundle);
        }
    }

    public class b extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f12820a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InputConnection inputConnection, boolean z3, c cVar) {
            super(inputConnection, z3);
            this.f12820a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (i.c(str, bundle, this.f12820a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    public interface c {
        boolean a(j jVar, int i4, Bundle bundle);
    }

    @Deprecated
    public i() {
    }

    public static boolean a(@j0 InputConnection inputConnection, @j0 EditorInfo editorInfo, @j0 j jVar, int i4, @k0 Bundle bundle) {
        boolean z3;
        ClipDescription clipDescriptionB = jVar.b();
        String[] strArrA = g.a(editorInfo);
        int length = strArrA.length;
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                z3 = false;
                break;
            }
            if (clipDescriptionB.hasMimeType(strArrA[i5])) {
                z3 = true;
                break;
            }
            i5++;
        }
        if (!z3) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 25) {
            return inputConnection.commitContent(androidx.appcompat.widget.j.a(jVar.f()), i4, bundle);
        }
        int iE = g.e(editorInfo);
        if (iE == 2) {
            z4 = true;
        } else if (iE != 3 && iE != 4) {
            return false;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(z4 ? f12807d : f12806c, jVar.a());
        bundle2.putParcelable(z4 ? f12809f : f12808e, jVar.b());
        bundle2.putParcelable(z4 ? f12811h : f12810g, jVar.c());
        bundle2.putInt(z4 ? f12815l : f12814k, i4);
        bundle2.putParcelable(z4 ? f12813j : f12812i, bundle);
        return inputConnection.performPrivateCommand(z4 ? f12805b : f12804a, bundle2);
    }

    @j0
    public static InputConnection b(@j0 InputConnection inputConnection, @j0 EditorInfo editorInfo, @j0 c cVar) {
        if (inputConnection == null) {
            throw new IllegalArgumentException("inputConnection must be non-null");
        }
        if (editorInfo == null) {
            throw new IllegalArgumentException("editorInfo must be non-null");
        }
        if (cVar != null) {
            return Build.VERSION.SDK_INT >= 25 ? new a(inputConnection, false, cVar) : g.a(editorInfo).length == 0 ? inputConnection : new b(inputConnection, false, cVar);
        }
        throw new IllegalArgumentException("onCommitContentListener must be non-null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static boolean c(@k0 String str, @j0 Bundle bundle, @j0 c cVar) throws Throwable {
        boolean z3;
        ResultReceiver resultReceiver;
        ?? A = 0;
        A = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals(f12804a, str)) {
            z3 = false;
        } else {
            if (!TextUtils.equals(f12805b, str)) {
                return false;
            }
            z3 = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z3 ? f12817n : f12816m);
        } catch (Throwable th) {
            th = th;
            resultReceiver = 0;
        }
        try {
            Uri uri = (Uri) bundle.getParcelable(z3 ? f12807d : f12806c);
            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z3 ? f12809f : f12808e);
            Uri uri2 = (Uri) bundle.getParcelable(z3 ? f12811h : f12810g);
            int i4 = bundle.getInt(z3 ? f12815l : f12814k);
            Bundle bundle2 = (Bundle) bundle.getParcelable(z3 ? f12813j : f12812i);
            if (uri != null && clipDescription != null) {
                A = cVar.a(new j(uri, clipDescription, uri2), i4, bundle2);
            }
            if (resultReceiver != 0) {
                resultReceiver.send(A, null);
            }
            return A;
        } catch (Throwable th2) {
            th = th2;
            if (resultReceiver != 0) {
                resultReceiver.send(0, null);
            }
            throw th;
        }
    }
}
