package q0;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import c.j0;
import c.k0;
import c.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import q0.f;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator<byte[]> f10224a = new a();

    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i4 = 0; i4 < bArr.length; i4++) {
                byte b4 = bArr[i4];
                byte b5 = bArr2[i4];
                if (b4 != b5) {
                    return b4 - b5;
                }
            }
            return 0;
        }
    }

    public static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!Arrays.equals(list.get(i4), list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public static List<List<byte[]>> c(d dVar, Resources resources) {
        return dVar.b() != null ? dVar.b() : d0.d.c(resources, dVar.c());
    }

    @j0
    public static f.b d(@j0 Context context, @j0 d dVar, @k0 CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoE = e(context.getPackageManager(), dVar, context.getResources());
        return providerInfoE == null ? f.b.a(1, null) : f.b.a(0, f(context, dVar, providerInfoE.authority, cancellationSignal));
    }

    @k0
    @z0
    public static ProviderInfo e(@j0 PackageManager packageManager, @j0 d dVar, @k0 Resources resources) throws PackageManager.NameNotFoundException {
        String strF = dVar.f();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strF, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strF);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(dVar.g())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strF + ", but package was not " + dVar.g());
        }
        List<byte[]> listA = a(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listA, f10224a);
        List<List<byte[]>> listC = c(dVar, resources);
        for (int i4 = 0; i4 < listC.size(); i4++) {
            ArrayList arrayList = new ArrayList(listC.get(i4));
            Collections.sort(arrayList, f10224a);
            if (b(listA, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    @j0
    @z0
    public static f.c[] f(Context context, d dVar, String str, CancellationSignal cancellationSignal) throws Throwable {
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uriBuild, new String[]{"_id", f.a.f10250a, f.a.f10251b, f.a.f10252c, f.a.f10253d, f.a.f10254e, f.a.f10255f}, "query = ?", new String[]{dVar.h()}, null, cancellationSignal);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex(f.a.f10255f);
                        arrayList = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex(f.a.f10250a);
                        int columnIndex4 = cursorQuery.getColumnIndex(f.a.f10251b);
                        int columnIndex5 = cursorQuery.getColumnIndex(f.a.f10253d);
                        int columnIndex6 = cursorQuery.getColumnIndex(f.a.f10254e);
                        while (cursorQuery.moveToNext()) {
                            int i4 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList.add(f.c.a(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i4));
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return (f.c[]) arrayList.toArray(new f.c[0]);
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
