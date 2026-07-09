package o3;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class g extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f9959a;

    @Override // o3.c
    public void b() {
        f();
    }

    @Override // o3.c
    public void c() throws Throwable {
        e();
    }

    public void e() throws IOException {
        this.f9959a = j();
    }

    public void f() {
        l(this.f9959a);
    }

    public File g() {
        File file = this.f9959a;
        if (file != null) {
            return file;
        }
        throw new IllegalStateException("the temporary folder has not yet been created");
    }

    public File h() throws IOException {
        return File.createTempFile("junit", null, this.f9959a);
    }

    public File i(String str) throws IOException {
        File file = new File(g(), str);
        file.createNewFile();
        return file;
    }

    public File j() throws IOException {
        File fileCreateTempFile = File.createTempFile("junit", s0.a.f11071l, this.f9959a);
        fileCreateTempFile.delete();
        fileCreateTempFile.mkdir();
        return fileCreateTempFile;
    }

    public File k(String... strArr) {
        File fileG = g();
        int length = strArr.length;
        int i4 = 0;
        while (i4 < length) {
            File file = new File(fileG, strArr[i4]);
            file.mkdir();
            i4++;
            fileG = file;
        }
        return fileG;
    }

    public final void l(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                l(file2);
            }
        }
        file.delete();
    }
}
