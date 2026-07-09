package j2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.sonoptek.pvus_android.sql.DBPaintInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static b f8294c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f8295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8296b = 101;

    public b(Context context) {
        this.f8295a = new a(context);
    }

    public static synchronized b d(Context context) {
        if (context != null) {
            if (f8294c == null) {
                f8294c = new b(context);
            }
        }
        return f8294c;
    }

    public void a() {
        SQLiteDatabase writableDatabase = this.f8295a.getWritableDatabase();
        writableDatabase.execSQL("delete from save_data");
        writableDatabase.close();
    }

    public void b() {
        f8294c = null;
    }

    public void c(int i4) {
        this.f8295a.getWritableDatabase().delete(a.f8283c, "real_id =?", new String[]{Integer.toString(i4)});
    }

    public void e(DBPaintInfo dBPaintInfo) {
        SQLiteDatabase writableDatabase = this.f8295a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.f8286f, dBPaintInfo.f6190b);
        contentValues.put("name", dBPaintInfo.f6191c);
        contentValues.put(a.f8288h, Integer.valueOf(dBPaintInfo.f6193e));
        contentValues.put(a.f8287g, Integer.valueOf(dBPaintInfo.f6192d));
        contentValues.put(a.f8290j, dBPaintInfo.f6195g);
        contentValues.put("time", dBPaintInfo.f6194f);
        contentValues.put(a.f8291k, Integer.valueOf(dBPaintInfo.f6196h));
        contentValues.put(a.f8293m, dBPaintInfo.f6197i + "_P_" + dBPaintInfo.f6199k + "_LMP_" + dBPaintInfo.f6200l);
        writableDatabase.insert(a.f8283c, null, contentValues);
        writableDatabase.close();
    }

    public List<DBPaintInfo> f() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = this.f8295a.getReadableDatabase().rawQuery("select * from save_data", null);
        if (cursorRawQuery != null) {
            while (cursorRawQuery.moveToNext()) {
                DBPaintInfo dBPaintInfo = new DBPaintInfo();
                dBPaintInfo.f6189a = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(a.f8284d));
                dBPaintInfo.f6190b = cursorRawQuery.getString(cursorRawQuery.getColumnIndex(a.f8286f));
                dBPaintInfo.f6191c = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("name"));
                dBPaintInfo.f6193e = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(a.f8288h));
                dBPaintInfo.f6192d = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(a.f8287g));
                dBPaintInfo.f6195g = cursorRawQuery.getString(cursorRawQuery.getColumnIndex(a.f8290j));
                dBPaintInfo.f6194f = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("time"));
                dBPaintInfo.f6196h = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(a.f8291k));
                String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex(a.f8293m));
                int iLastIndexOf = string.lastIndexOf("_P_");
                int iLastIndexOf2 = string.lastIndexOf("_LMP_");
                if (iLastIndexOf > 0) {
                    String strSubstring = string.substring(0, iLastIndexOf);
                    String strSubstring2 = string.substring(iLastIndexOf + 3, iLastIndexOf2);
                    long j4 = Long.parseLong(string.substring(iLastIndexOf2 + 5));
                    dBPaintInfo.f6197i = strSubstring;
                    dBPaintInfo.f6199k = strSubstring2;
                    dBPaintInfo.f6200l = j4;
                } else {
                    dBPaintInfo.f6197i = string;
                    dBPaintInfo.f6199k = s0.a.f11071l;
                }
                if (this.f8296b == 101 || dBPaintInfo.f6196h == 102) {
                    arrayList.add(dBPaintInfo);
                }
            }
        }
        return arrayList;
    }

    public void g(int i4) {
        this.f8296b = i4;
    }
}
