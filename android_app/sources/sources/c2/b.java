package c2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import c2.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static b f4622c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f4623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SQLiteDatabase f4624b;

    public b(Context context) {
        c cVar = new c(context);
        this.f4623a = cVar;
        this.f4624b = cVar.getWritableDatabase();
    }

    public static b c(Context context) {
        if (f4622c == null && context != null) {
            f4622c = new b(context);
        }
        return f4622c;
    }

    public void a() {
        f4622c = null;
    }

    public List<String> b() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = this.f4624b.rawQuery("select * from dicom", null);
        if (cursorRawQuery != null) {
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("name")));
            }
        }
        return arrayList;
    }

    public void d(String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", str);
        this.f4624b.insert(a.C0034a.f4620a, null, contentValues);
    }
}
