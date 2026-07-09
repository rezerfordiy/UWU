package a1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
public class d extends c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP})
    public int[] f509p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP})
    public int[] f510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f512s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f513t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String[] f514u;

    public interface a {
        CharSequence a(Cursor cursor);
    }

    public interface b {
        boolean a(View view, Cursor cursor, int i4);
    }

    @Deprecated
    public d(Context context, int i4, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i4, cursor);
        this.f511r = -1;
        this.f510q = iArr;
        this.f514u = strArr;
        q(cursor, strArr);
    }

    @Override // a1.a, a1.b.a
    public CharSequence a(Cursor cursor) {
        a aVar = this.f512s;
        if (aVar != null) {
            return aVar.a(cursor);
        }
        int i4 = this.f511r;
        return i4 > -1 ? cursor.getString(i4) : super.a(cursor);
    }

    @Override // a1.a
    public void e(View view, Context context, Cursor cursor) {
        b bVar = this.f513t;
        int[] iArr = this.f510q;
        int length = iArr.length;
        int[] iArr2 = this.f509p;
        for (int i4 = 0; i4 < length; i4++) {
            View viewFindViewById = view.findViewById(iArr[i4]);
            if (viewFindViewById != null) {
                if (bVar != null ? bVar.a(viewFindViewById, cursor, iArr2[i4]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i4]);
                    if (string == null) {
                        string = s0.a.f11071l;
                    }
                    if (viewFindViewById instanceof TextView) {
                        y((TextView) viewFindViewById, string);
                    } else {
                        if (!(viewFindViewById instanceof ImageView)) {
                            throw new IllegalStateException(viewFindViewById.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                        }
                        x((ImageView) viewFindViewById, string);
                    }
                }
            }
        }
    }

    @Override // a1.a
    public Cursor m(Cursor cursor) {
        q(cursor, this.f514u);
        return super.m(cursor);
    }

    public void p(Cursor cursor, String[] strArr, int[] iArr) {
        this.f514u = strArr;
        this.f510q = iArr;
        q(cursor, strArr);
        super.b(cursor);
    }

    public final void q(Cursor cursor, String[] strArr) {
        if (cursor == null) {
            this.f509p = null;
            return;
        }
        int length = strArr.length;
        int[] iArr = this.f509p;
        if (iArr == null || iArr.length != length) {
            this.f509p = new int[length];
        }
        for (int i4 = 0; i4 < length; i4++) {
            this.f509p[i4] = cursor.getColumnIndexOrThrow(strArr[i4]);
        }
    }

    public a r() {
        return this.f512s;
    }

    public int s() {
        return this.f511r;
    }

    public b t() {
        return this.f513t;
    }

    public void u(a aVar) {
        this.f512s = aVar;
    }

    public void v(int i4) {
        this.f511r = i4;
    }

    public void w(b bVar) {
        this.f513t = bVar;
    }

    public void x(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void y(TextView textView, String str) {
        textView.setText(str);
    }

    public d(Context context, int i4, Cursor cursor, String[] strArr, int[] iArr, int i5) {
        super(context, i4, cursor, i5);
        this.f511r = -1;
        this.f510q = iArr;
        this.f514u = strArr;
        q(cursor, strArr);
    }
}
