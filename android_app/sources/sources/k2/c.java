package k2;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.ScrollView;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.MyApplication;
import com.sonoptek.pvus_android.view.USImageView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8385a = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getPath();

    public static Bitmap a(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static Bitmap b(Bitmap bitmap, float f4) {
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f4);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap c(Bitmap bitmap, float f4, float f5) {
        float width = bitmap.getWidth();
        Matrix matrix = new Matrix();
        matrix.setScale(f4 / width, f5 / bitmap.getHeight());
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0038: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:20:0x0038 */
    public static String d(Bitmap bitmap) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        String strEncodeToString;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            if (bitmap != null) {
                try {
                    byteArrayOutputStream2 = new ByteArrayOutputStream();
                } catch (IOException e4) {
                    e = e4;
                    byteArrayOutputStream2 = null;
                } catch (Throwable th) {
                    th = th;
                    if (byteArrayOutputStream3 != null) {
                        try {
                            byteArrayOutputStream3.flush();
                            byteArrayOutputStream3.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
                    byteArrayOutputStream2.flush();
                    byteArrayOutputStream2.close();
                    strEncodeToString = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 2);
                    byteArrayOutputStream3 = byteArrayOutputStream2;
                } catch (IOException e6) {
                    e = e6;
                    e.printStackTrace();
                    if (byteArrayOutputStream2 == null) {
                        return null;
                    }
                    try {
                        byteArrayOutputStream2.flush();
                        byteArrayOutputStream2.close();
                        return null;
                    } catch (IOException e7) {
                        e7.printStackTrace();
                        return null;
                    }
                }
            } else {
                strEncodeToString = null;
            }
            if (byteArrayOutputStream3 != null) {
                try {
                    byteArrayOutputStream3.flush();
                    byteArrayOutputStream3.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            return strEncodeToString;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream3 = byteArrayOutputStream;
        }
    }

    public static void e(File file, File file2) {
        if (file.getAbsolutePath().equals(file2.getAbsolutePath())) {
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int i4 = fileInputStream.read(bArr);
                if (i4 < 0) {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i4);
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    public static void f() {
        File file = new File(f8385a);
        if (file.exists()) {
            return;
        }
        try {
            file.mkdirs();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static Bitmap g(Bitmap bitmap, float f4, float f5) {
        int iT = (int) (MyApplication.t() * 5.0f);
        float f6 = iT / 2.0f;
        int iMin = (int) (Math.min((int) f4, (bitmap.getWidth() - iT) - 1) - f6);
        int iMin2 = (int) (Math.min((int) f5, (bitmap.getHeight() - iT) - 1) - f6);
        return Bitmap.createBitmap(bitmap, iMin < 0 ? 0 : iMin, iMin2 < 0 ? 0 : iMin2, iT, iT, (Matrix) null, false);
    }

    public static Bitmap h(Bitmap bitmap, boolean z3, boolean z4) {
        Matrix matrix = new Matrix();
        matrix.preScale(z3 ? -1.0f : 1.0f, z4 ? -1.0f : 1.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap i(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap j(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap k(ScrollView scrollView) {
        int height = 0;
        for (int i4 = 0; i4 < scrollView.getChildCount(); i4++) {
            height += scrollView.getChildAt(i4).getHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(scrollView.getWidth(), height, Bitmap.Config.ARGB_8888);
        scrollView.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static Bitmap l(Bitmap bitmap) {
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        float f4 = iMin / 2;
        canvas.drawCircle(f4, f4, f4, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap m(View view) {
        USImageView uSImageView;
        USImageView uSImageView2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(z1.f12256t);
        }
        view.draw(canvas);
        if (com.sonoptek.pvus_android.view.f.d() instanceof com.sonoptek.pvus_android.view.b) {
            com.sonoptek.pvus_android.view.b bVar = (com.sonoptek.pvus_android.view.b) com.sonoptek.pvus_android.view.f.d();
            com.sonoptek.pvus_android.view.f fVarJ = bVar.J();
            if (fVarJ != null && (uSImageView2 = fVarJ.f6552j) != null && uSImageView2.getWidth() > 0) {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(uSImageView2.getWidth() - 2, uSImageView2.getHeight() - 4, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                uSImageView2.draw(canvas2);
                fVarJ.f6550h.draw(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap2, canvas.getWidth() - (bitmapCreateBitmap2.getWidth() * 2), 2.0f, new Paint(3));
            }
            com.sonoptek.pvus_android.view.f fVarK = bVar.K();
            if (fVarK != null && (uSImageView = fVarK.f6552j) != null && uSImageView.getWidth() > 0) {
                Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(uSImageView.getWidth() - 2, uSImageView.getHeight() - 4, Bitmap.Config.ARGB_8888);
                Canvas canvas3 = new Canvas(bitmapCreateBitmap3);
                uSImageView.draw(canvas3);
                fVarK.f6550h.draw(canvas3);
                canvas.drawBitmap(bitmapCreateBitmap3, canvas.getWidth() - bitmapCreateBitmap3.getWidth(), 2.0f, new Paint(3));
            }
        } else {
            USImageView uSImageView3 = com.sonoptek.pvus_android.view.f.d().f6552j;
            if (uSImageView3 != null && uSImageView3.getWidth() > 0) {
                Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(uSImageView3.getWidth(), uSImageView3.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas4 = new Canvas(bitmapCreateBitmap4);
                uSImageView3.draw(canvas4);
                com.sonoptek.pvus_android.view.f.d().f6550h.draw(canvas4);
                canvas.drawBitmap(bitmapCreateBitmap4, canvas.getWidth() - bitmapCreateBitmap4.getWidth(), 0.0f, new Paint(3));
            }
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap n(Bitmap bitmap, float f4) {
        Matrix matrix = new Matrix();
        matrix.postScale(f4, f4);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
    }

    public static Bitmap o(Bitmap bitmap, float f4, float f5) {
        Matrix matrix = new Matrix();
        matrix.postScale(f4 / bitmap.getWidth(), f5 / bitmap.getHeight());
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap p(Bitmap bitmap, float f4, float f5) {
        Matrix matrix = new Matrix();
        matrix.postScale(f4, f5);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
    }

    public static String q(Context context, Bitmap bitmap, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        Uri uriInsert = context.getApplicationContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null) {
            return null;
        }
        try {
            OutputStream outputStreamOpenOutputStream = context.getApplicationContext().getContentResolver().openOutputStream(uriInsert);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
            outputStreamOpenOutputStream.flush();
            outputStreamOpenOutputStream.close();
        } catch (FileNotFoundException | IOException e4) {
            e4.printStackTrace();
        }
        return uriInsert.toString();
    }

    public static String r(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        f();
        String str2 = str.endsWith("mp4") ? "/movies" : "/images";
        File file2 = new File(f8385a, context.getResources().getString(R.string.app_name_mic) + str2);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(file2, file.getName());
        e(file, file3);
        MediaScannerConnection.scanFile(context, new String[]{file3.getPath()}, null, null);
        return file3.getPath();
    }

    public static String s(Context context, String str, String str2) {
        OutputStream outputStreamOpenOutputStream;
        FileInputStream fileInputStream;
        byte[] bArr;
        if (Build.VERSION.SDK_INT < 29) {
            String strR = r(context, str);
            new File(str).delete();
            return strR;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str2);
        contentValues.put("relative_path", "DCIM/microVUE/images");
        Uri uriInsert = context.getApplicationContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null) {
            return null;
        }
        try {
            outputStreamOpenOutputStream = context.getApplicationContext().getContentResolver().openOutputStream(uriInsert);
            fileInputStream = new FileInputStream(new File(str));
            bArr = new byte[1024];
        } catch (FileNotFoundException | IOException e4) {
            e4.printStackTrace();
        }
        while (true) {
            int i4 = fileInputStream.read(bArr);
            if (i4 == -1) {
                break;
            }
            outputStreamOpenOutputStream.write(bArr, 0, i4);
            new File(str).delete();
            return uriInsert.toString();
        }
        outputStreamOpenOutputStream.flush();
        outputStreamOpenOutputStream.close();
        fileInputStream.close();
        new File(str).delete();
        return uriInsert.toString();
    }

    public static String t(Context context, Bitmap bitmap, String str) {
        f();
        File file = new File(f8385a, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException | IOException e4) {
            e4.printStackTrace();
        }
        try {
            MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, str, "description");
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + file.getAbsolutePath())));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return file.getPath();
    }

    public static String u(Context context, String str, String str2) {
        OutputStream outputStreamOpenOutputStream;
        FileInputStream fileInputStream;
        byte[] bArr;
        if (Build.VERSION.SDK_INT < 29) {
            String strR = r(context, str);
            new File(str).delete();
            return strR;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str2);
        contentValues.put("relative_path", "DCIM/microVUE/movies");
        Uri uriInsert = context.getApplicationContext().getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null) {
            return null;
        }
        try {
            outputStreamOpenOutputStream = context.getApplicationContext().getContentResolver().openOutputStream(uriInsert);
            fileInputStream = new FileInputStream(new File(str));
            bArr = new byte[1024];
        } catch (FileNotFoundException | IOException e4) {
            e4.printStackTrace();
        }
        while (true) {
            int i4 = fileInputStream.read(bArr);
            if (i4 == -1) {
                break;
            }
            outputStreamOpenOutputStream.write(bArr, 0, i4);
            new File(str).delete();
            return uriInsert.toString();
        }
        outputStreamOpenOutputStream.flush();
        outputStreamOpenOutputStream.close();
        fileInputStream.close();
        new File(str).delete();
        return uriInsert.toString();
    }

    public static Bitmap v(View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(z1.f12256t);
        }
        view.draw(canvas);
        return bitmapCreateBitmap;
    }
}
