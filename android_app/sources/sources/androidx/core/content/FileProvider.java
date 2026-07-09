package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import b0.e;
import c.j0;
import c.k0;
import c.w;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.dcm4che3.data.Tag;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f3378d = "android.support.FILE_PROVIDER_PATHS";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f3379e = "root-path";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f3380f = "files-path";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f3381g = "cache-path";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f3382h = "external-path";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f3383i = "external-files-path";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f3384j = "external-cache-path";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f3385k = "external-media-path";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f3386l = "name";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f3387m = "path";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f3388n = "displayName";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f3391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f3377c = {"_display_name", "_size"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final File f3389o = new File("/");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @w("sCache")
    public static HashMap<String, a> f3390p = new HashMap<>();

    public interface a {
        File a(Uri uri);

        Uri b(File file);
    }

    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap<String, File> f3393b = new HashMap<>();

        public b(String str) {
            this.f3392a = str;
        }

        @Override // androidx.core.content.FileProvider.a
        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = this.f3393b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // androidx.core.content.FileProvider.a
        public Uri b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f3393b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = entry.getValue().getPath();
                boolean zEndsWith = path2.endsWith("/");
                int length = path2.length();
                if (!zEndsWith) {
                    length++;
                }
                return new Uri.Builder().scheme("content").authority(this.f3392a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(canonicalPath.substring(length), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        public void c(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f3393b.put(str, file.getCanonicalFile());
            } catch (IOException e4) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e4);
            }
        }
    }

    public static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static Object[] b(Object[] objArr, int i4) {
        Object[] objArr2 = new Object[i4];
        System.arraycopy(objArr, 0, objArr2, 0, i4);
        return objArr2;
    }

    public static String[] c(String[] strArr, int i4) {
        String[] strArr2 = new String[i4];
        System.arraycopy(strArr, 0, strArr2, 0, i4);
        return strArr2;
    }

    public static a d(Context context, String str) {
        a aVarH;
        synchronized (f3390p) {
            aVarH = f3390p.get(str);
            if (aVarH == null) {
                try {
                    aVarH = h(context, str);
                    f3390p.put(str, aVarH);
                } catch (IOException e4) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e4);
                } catch (XmlPullParserException e5) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e5);
                }
            }
        }
        return aVarH;
    }

    public static Uri e(@j0 Context context, @j0 String str, @j0 File file) {
        return d(context, str).b(file);
    }

    @SuppressLint({"StreamFiles"})
    @j0
    public static Uri f(@j0 Context context, @j0 String str, @j0 File file, @j0 String str2) {
        return e(context, str, file).buildUpon().appendQueryParameter(f3388n, str2).build();
    }

    public static int g(String str) {
        if ("r".equals(str)) {
            return Tag.EscapeTriplet;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    public static a h(Context context, String str) throws XmlPullParserException, IOException {
        b bVar = new b(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (providerInfoResolveContentProvider == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), f3378d);
        if (xmlResourceParserLoadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return bVar;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path");
                if (f3379e.equals(name)) {
                    externalStorageDirectory = f3389o;
                } else if (f3380f.equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if (f3381g.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (f3382h.equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if (f3383i.equals(name)) {
                    File[] fileArrJ = e.j(context, null);
                    if (fileArrJ.length > 0) {
                        externalStorageDirectory = fileArrJ[0];
                    }
                } else if (f3384j.equals(name)) {
                    File[] fileArrI = e.i(context);
                    if (fileArrI.length > 0) {
                        externalStorageDirectory = fileArrI[0];
                    }
                } else if (f3385k.equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        externalStorageDirectory = externalMediaDirs[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    bVar.c(attributeValue, a(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@j0 Context context, @j0 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        this.f3391b = d(context, providerInfo.authority.split(";")[0]);
    }

    @Override // android.content.ContentProvider
    public int delete(@j0 Uri uri, @k0 String str, @k0 String[] strArr) {
        return this.f3391b.a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(@j0 Uri uri) {
        File fileA = this.f3391b.a(uri);
        int iLastIndexOf = fileA.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileA.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(@j0 Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@j0 Uri uri, @j0 String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f3391b.a(uri), g(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(@j0 Uri uri, @k0 String[] strArr, @k0 String str, @k0 String[] strArr2, @k0 String str2) {
        int i4;
        File fileA = this.f3391b.a(uri);
        String queryParameter = uri.getQueryParameter(f3388n);
        if (strArr == null) {
            strArr = f3377c;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i5 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i5] = "_display_name";
                i4 = i5 + 1;
                objArr[i5] = queryParameter == null ? fileA.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i5] = "_size";
                i4 = i5 + 1;
                objArr[i5] = Long.valueOf(fileA.length());
            }
            i5 = i4;
        }
        String[] strArrC = c(strArr3, i5);
        Object[] objArrB = b(objArr, i5);
        MatrixCursor matrixCursor = new MatrixCursor(strArrC, 1);
        matrixCursor.addRow(objArrB);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@j0 Uri uri, ContentValues contentValues, @k0 String str, @k0 String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
