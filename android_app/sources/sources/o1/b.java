package o1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import c.j0;
import c.k0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import o1.c;
import p0.n;

/* JADX INFO: loaded from: classes.dex */
public class b extends a<Cursor> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c<Cursor>.a f9876r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Uri f9877s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String[] f9878t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f9879u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String[] f9880v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f9881w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Cursor f9882x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p0.b f9883y;

    public b(@j0 Context context) {
        super(context);
        this.f9876r = new c.a();
    }

    @Override // o1.a
    public void D() {
        super.D();
        synchronized (this) {
            p0.b bVar = this.f9883y;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    @Override // o1.c
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void f(Cursor cursor) {
        if (l()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f9882x;
        this.f9882x = cursor;
        if (m()) {
            super.f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @k0
    public String[] O() {
        return this.f9878t;
    }

    @k0
    public String P() {
        return this.f9879u;
    }

    @k0
    public String[] Q() {
        return this.f9880v;
    }

    @k0
    public String R() {
        return this.f9881w;
    }

    @j0
    public Uri S() {
        return this.f9877s;
    }

    @Override // o1.a
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Cursor I() {
        synchronized (this) {
            if (H()) {
                throw new n();
            }
            this.f9883y = new p0.b();
        }
        try {
            Cursor cursorA = b0.b.a(i().getContentResolver(), this.f9877s, this.f9878t, this.f9879u, this.f9880v, this.f9881w, this.f9883y);
            if (cursorA != null) {
                try {
                    cursorA.getCount();
                    cursorA.registerContentObserver(this.f9876r);
                } catch (RuntimeException e4) {
                    cursorA.close();
                    throw e4;
                }
            }
            synchronized (this) {
                this.f9883y = null;
            }
            return cursorA;
        } catch (Throwable th) {
            synchronized (this) {
                this.f9883y = null;
                throw th;
            }
        }
    }

    @Override // o1.a
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void J(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public void V(@k0 String[] strArr) {
        this.f9878t = strArr;
    }

    public void W(@k0 String str) {
        this.f9879u = str;
    }

    public void X(@k0 String[] strArr) {
        this.f9880v = strArr;
    }

    public void Y(@k0 String str) {
        this.f9881w = str;
    }

    public void Z(@j0 Uri uri) {
        this.f9877s = uri;
    }

    @Override // o1.a, o1.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f9877s);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f9878t));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f9879u);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f9880v));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f9881w);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f9882x);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f9891h);
    }

    @Override // o1.c
    public void r() {
        super.r();
        t();
        Cursor cursor = this.f9882x;
        if (cursor != null && !cursor.isClosed()) {
            this.f9882x.close();
        }
        this.f9882x = null;
    }

    @Override // o1.c
    public void s() {
        Cursor cursor = this.f9882x;
        if (cursor != null) {
            f(cursor);
        }
        if (A() || this.f9882x == null) {
            h();
        }
    }

    @Override // o1.c
    public void t() {
        b();
    }

    public b(@j0 Context context, @j0 Uri uri, @k0 String[] strArr, @k0 String str, @k0 String[] strArr2, @k0 String str2) {
        super(context);
        this.f9876r = new c.a();
        this.f9877s = uri;
        this.f9878t = strArr;
        this.f9879u = str;
        this.f9880v = strArr2;
        this.f9881w = str2;
    }
}
