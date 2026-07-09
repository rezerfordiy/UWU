package b;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import b.a;
import c.j0;
import c.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @TargetApi(19)
    public static class a extends b.a<String, Uri> {
        @Override // b.a
        @c.i
        @j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@j0 Context context, @j0 String str) {
            return new Intent("android.intent.action.CREATE_DOCUMENT").setType("*/*").putExtra("android.intent.extra.TITLE", str);
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0024a<Uri> b(@j0 Context context, @j0 String str) {
            return null;
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i4, @k0 Intent intent) {
            if (intent == null || i4 != -1) {
                return null;
            }
            return intent.getData();
        }
    }

    /* JADX INFO: renamed from: b.b$b, reason: collision with other inner class name */
    public static class C0025b extends b.a<String, Uri> {
        @Override // b.a
        @c.i
        @j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@j0 Context context, @j0 String str) {
            return new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0024a<Uri> b(@j0 Context context, @j0 String str) {
            return null;
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i4, @k0 Intent intent) {
            if (intent == null || i4 != -1) {
                return null;
            }
            return intent.getData();
        }
    }

    @TargetApi(18)
    public static class c extends b.a<String, List<Uri>> {
        @j0
        public static List<Uri> e(@j0 Intent intent) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (intent.getData() != null) {
                linkedHashSet.add(intent.getData());
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                return Collections.emptyList();
            }
            if (clipData != null) {
                for (int i4 = 0; i4 < clipData.getItemCount(); i4++) {
                    Uri uri = clipData.getItemAt(i4).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            return new ArrayList(linkedHashSet);
        }

        @Override // b.a
        @c.i
        @j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@j0 Context context, @j0 String str) {
            return new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final a.C0024a<List<Uri>> b(@j0 Context context, @j0 String str) {
            return null;
        }

        @Override // b.a
        @j0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int i4, @k0 Intent intent) {
            return (intent == null || i4 != -1) ? Collections.emptyList() : e(intent);
        }
    }

    @TargetApi(19)
    public static class d extends b.a<String[], Uri> {
        @Override // b.a
        @c.i
        @j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@j0 Context context, @j0 String[] strArr) {
            return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0024a<Uri> b(@j0 Context context, @j0 String[] strArr) {
            return null;
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i4, @k0 Intent intent) {
            if (intent == null || i4 != -1) {
                return null;
            }
            return intent.getData();
        }
    }

    @TargetApi(21)
    public static class e extends b.a<Uri, Uri> {
        @Override // b.a
        @c.i
        @j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@j0 Context context, @k0 Uri uri) {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0024a<Uri> b(@j0 Context context, @k0 Uri uri) {
            return null;
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i4, @k0 Intent intent) {
            if (intent == null || i4 != -1) {
                return null;
            }
            return intent.getData();
        }
    }

    @TargetApi(19)
    public static class f extends b.a<String[], List<Uri>> {
        @Override // b.a
        @c.i
        @j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@j0 Context context, @j0 String[] strArr) {
            return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0024a<List<Uri>> b(@j0 Context context, @j0 String[] strArr) {
            return null;
        }

        @Override // b.a
        @j0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int i4, @k0 Intent intent) {
            return (i4 != -1 || intent == null) ? Collections.emptyList() : c.e(intent);
        }
    }

    public static final class g extends b.a<Void, Uri> {
        @Override // b.a
        @j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@j0 Context context, @k0 Void r22) {
            return new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Uri c(int i4, @k0 Intent intent) {
            if (intent == null || i4 != -1) {
                return null;
            }
            return intent.getData();
        }
    }

    public static final class h extends b.a<String[], Map<String, Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f4319a = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f4320b = "androidx.activity.result.contract.extra.PERMISSIONS";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f4321c = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        @j0
        public static Intent e(@j0 String[] strArr) {
            return new Intent(f4319a).putExtra(f4320b, strArr);
        }

        @Override // b.a
        @j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@j0 Context context, @j0 String[] strArr) {
            return e(strArr);
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a.C0024a<Map<String, Boolean>> b(@j0 Context context, @k0 String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return new a.C0024a<>(Collections.emptyMap());
            }
            p.a aVar = new p.a();
            boolean z3 = true;
            for (String str : strArr) {
                boolean z4 = b0.e.a(context, str) == 0;
                aVar.put(str, Boolean.valueOf(z4));
                if (!z4) {
                    z3 = false;
                }
            }
            if (z3) {
                return new a.C0024a<>(aVar);
            }
            return null;
        }

        @Override // b.a
        @j0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map<String, Boolean> c(int i4, @k0 Intent intent) {
            if (i4 == -1 && intent != null) {
                String[] stringArrayExtra = intent.getStringArrayExtra(f4320b);
                int[] intArrayExtra = intent.getIntArrayExtra(f4321c);
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return Collections.emptyMap();
                }
                HashMap map = new HashMap();
                int length = stringArrayExtra.length;
                for (int i5 = 0; i5 < length; i5++) {
                    map.put(stringArrayExtra[i5], Boolean.valueOf(intArrayExtra[i5] == 0));
                }
                return map;
            }
            return Collections.emptyMap();
        }
    }

    public static final class i extends b.a<String, Boolean> {
        @Override // b.a
        @j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@j0 Context context, @j0 String str) {
            return h.e(new String[]{str});
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a.C0024a<Boolean> b(@j0 Context context, @k0 String str) {
            if (str == null) {
                return new a.C0024a<>(Boolean.FALSE);
            }
            if (b0.e.a(context, str) == 0) {
                return new a.C0024a<>(Boolean.TRUE);
            }
            return null;
        }

        @Override // b.a
        @j0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean c(int i4, @k0 Intent intent) {
            if (intent == null || i4 != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(h.f4321c);
            if (intArrayExtra == null || intArrayExtra.length == 0) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(intArrayExtra[0] == 0);
        }
    }

    public static final class j extends b.a<Intent, ActivityResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f4322a = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        @Override // b.a
        @j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@j0 Context context, @j0 Intent intent) {
            return intent;
        }

        @Override // b.a
        @j0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult c(int i4, @k0 Intent intent) {
            return new ActivityResult(i4, intent);
        }
    }

    public static final class k extends b.a<IntentSenderRequest, ActivityResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f4323a = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f4324b = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f4325c = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        @Override // b.a
        @j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@j0 Context context, @j0 IntentSenderRequest intentSenderRequest) {
            return new Intent(f4323a).putExtra(f4324b, intentSenderRequest);
        }

        @Override // b.a
        @j0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult c(int i4, @k0 Intent intent) {
            return new ActivityResult(i4, intent);
        }
    }

    public static class l extends b.a<Uri, Boolean> {
        @Override // b.a
        @c.i
        @j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@j0 Context context, @j0 Uri uri) {
            return new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0024a<Boolean> b(@j0 Context context, @j0 Uri uri) {
            return null;
        }

        @Override // b.a
        @j0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Boolean c(int i4, @k0 Intent intent) {
            return Boolean.valueOf(i4 == -1);
        }
    }

    public static class m extends b.a<Void, Bitmap> {
        @Override // b.a
        @c.i
        @j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@j0 Context context, @k0 Void r22) {
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0024a<Bitmap> b(@j0 Context context, @k0 Void r22) {
            return null;
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Bitmap c(int i4, @k0 Intent intent) {
            if (intent == null || i4 != -1) {
                return null;
            }
            return (Bitmap) intent.getParcelableExtra("data");
        }
    }

    public static class n extends b.a<Uri, Bitmap> {
        @Override // b.a
        @c.i
        @j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@j0 Context context, @j0 Uri uri) {
            return new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0024a<Bitmap> b(@j0 Context context, @j0 Uri uri) {
            return null;
        }

        @Override // b.a
        @k0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Bitmap c(int i4, @k0 Intent intent) {
            if (intent == null || i4 != -1) {
                return null;
            }
            return (Bitmap) intent.getParcelableExtra("data");
        }
    }
}
