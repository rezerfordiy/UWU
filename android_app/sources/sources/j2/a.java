package j2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes.dex */
public class a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8281a = "microVUE.db";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f8282b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f8283c = "save_data";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f8284d = "real_id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f8285e = "name";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f8286f = "id";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f8287g = "age";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f8288h = "sex";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f8289i = "checkpoint";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f8290j = "file_path";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f8291k = "login_type";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f8292l = "time";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f8293m = "image_base64";

    public a(Context context) {
        super(context, f8281a, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        sQLiteDatabase.execSQL("CREATE TABLE if not exists [save_data](real_id integer primary key autoincrement,id varchar,name varchar,age integer,sex integer,file_path text,login_type integer,time varchar,image_base64 text)");
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }
}
