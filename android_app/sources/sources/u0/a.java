package u0;

import android.util.Log;
import c.j0;
import c.k0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f11554d = "AtomicFile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f11555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f11556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f11557c;

    public a(@j0 File file) {
        this.f11555a = file;
        this.f11556b = new File(file.getPath() + ".new");
        this.f11557c = new File(file.getPath() + ".bak");
    }

    public static void g(@j0 File file, @j0 File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e(f11554d, "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e(f11554d, "Failed to rename " + file + " to " + file2);
    }

    public static boolean i(@j0 FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a() {
        this.f11555a.delete();
        this.f11556b.delete();
        this.f11557c.delete();
    }

    public void b(@k0 FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!i(fileOutputStream)) {
            Log.e(f11554d, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e4) {
            Log.e(f11554d, "Failed to close file output stream", e4);
        }
        if (this.f11556b.delete()) {
            return;
        }
        Log.e(f11554d, "Failed to delete new file " + this.f11556b);
    }

    public void c(@k0 FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!i(fileOutputStream)) {
            Log.e(f11554d, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e4) {
            Log.e(f11554d, "Failed to close file output stream", e4);
        }
        g(this.f11556b, this.f11555a);
    }

    @j0
    public File d() {
        return this.f11555a;
    }

    @j0
    public FileInputStream e() throws FileNotFoundException {
        if (this.f11557c.exists()) {
            g(this.f11557c, this.f11555a);
        }
        if (this.f11556b.exists() && this.f11555a.exists() && !this.f11556b.delete()) {
            Log.e(f11554d, "Failed to delete outdated new file " + this.f11556b);
        }
        return new FileInputStream(this.f11555a);
    }

    @j0
    public byte[] f() throws IOException {
        FileInputStream fileInputStreamE = e();
        try {
            byte[] bArr = new byte[fileInputStreamE.available()];
            int i4 = 0;
            while (true) {
                int i5 = fileInputStreamE.read(bArr, i4, bArr.length - i4);
                if (i5 <= 0) {
                    return bArr;
                }
                i4 += i5;
                int iAvailable = fileInputStreamE.available();
                if (iAvailable > bArr.length - i4) {
                    byte[] bArr2 = new byte[iAvailable + i4];
                    System.arraycopy(bArr, 0, bArr2, 0, i4);
                    bArr = bArr2;
                }
            }
        } finally {
            fileInputStreamE.close();
        }
    }

    @j0
    public FileOutputStream h() throws IOException {
        if (this.f11557c.exists()) {
            g(this.f11557c, this.f11555a);
        }
        try {
            return new FileOutputStream(this.f11556b);
        } catch (FileNotFoundException unused) {
            if (!this.f11556b.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + this.f11556b);
            }
            try {
                return new FileOutputStream(this.f11556b);
            } catch (FileNotFoundException e4) {
                throw new IOException("Failed to create new file " + this.f11556b, e4);
            }
        }
    }
}
