package b2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.provider.MediaStore;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static Bitmap a(Context context, ContentResolver contentResolver, String str) {
        int i4;
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_data", "_id"}, "_data = '" + str + "'", null, null);
        if (cursorQuery == null || cursorQuery.getCount() == 0) {
            return null;
        }
        if (cursorQuery.moveToFirst()) {
            int columnIndex = cursorQuery.getColumnIndex("_id");
            int columnIndex2 = cursorQuery.getColumnIndex("_data");
            do {
                i4 = cursorQuery.getInt(columnIndex);
                cursorQuery.getString(columnIndex2);
            } while (cursorQuery.moveToNext());
        } else {
            i4 = 0;
        }
        cursorQuery.close();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return MediaStore.Images.Thumbnails.getThumbnail(contentResolver, i4, 1, options);
    }

    public static Bitmap b(Context context, ContentResolver contentResolver, String str) {
        int i4;
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_data", "_id"}, "_data = '" + str + "'", null, null);
        if (cursorQuery == null || cursorQuery.getCount() == 0) {
            return null;
        }
        if (cursorQuery.moveToFirst()) {
            int columnIndex = cursorQuery.getColumnIndex("_id");
            int columnIndex2 = cursorQuery.getColumnIndex("_data");
            do {
                i4 = cursorQuery.getInt(columnIndex);
                cursorQuery.getString(columnIndex2);
            } while (cursorQuery.moveToNext());
        } else {
            i4 = 0;
        }
        cursorQuery.close();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return MediaStore.Video.Thumbnails.getThumbnail(contentResolver, i4, 1, options);
    }

    public static Bitmap c(String str, int i4, int i5, int i6) {
        return ThumbnailUtils.extractThumbnail(ThumbnailUtils.createVideoThumbnail(str, i6), i4, i5, 2);
    }
}
