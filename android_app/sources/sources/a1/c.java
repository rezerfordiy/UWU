package a1;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f507n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LayoutInflater f508o;

    @Deprecated
    public c(Context context, int i4, Cursor cursor) {
        super(context, cursor);
        this.f507n = i4;
        this.f506m = i4;
        this.f508o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // a1.a
    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f508o.inflate(this.f507n, viewGroup, false);
    }

    @Override // a1.a
    public View j(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f508o.inflate(this.f506m, viewGroup, false);
    }

    public void n(int i4) {
        this.f507n = i4;
    }

    public void o(int i4) {
        this.f506m = i4;
    }

    public c(Context context, int i4, Cursor cursor, int i5) {
        super(context, cursor, i5);
        this.f507n = i4;
        this.f506m = i4;
        this.f508o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Deprecated
    public c(Context context, int i4, Cursor cursor, boolean z3) {
        super(context, cursor, z3);
        this.f507n = i4;
        this.f506m = i4;
        this.f508o = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
