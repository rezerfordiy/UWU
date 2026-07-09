package w0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static final String f12395d = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f12397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12398c;

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public a(int i4, e0 e0Var, int i5) {
        this.f12396a = i4;
        this.f12397b = e0Var;
        this.f12398c = i5;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@c.j0 View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(f12395d, this.f12396a);
        this.f12397b.G0(this.f12398c, bundle);
    }
}
