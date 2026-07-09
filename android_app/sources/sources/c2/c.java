package c2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import c.k0;

/* JADX INFO: loaded from: classes.dex */
public class c extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4625a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f4626b = "dcmData.db";

    public c(@k0 Context context) {
        super(context, f4626b, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table dicom(_id integer primary key autoincrement, name text)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }
}
