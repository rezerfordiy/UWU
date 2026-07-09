package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import c.j0;

/* JADX INFO: loaded from: classes.dex */
public class b extends y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public Application f4126c;

    public b(@j0 Application application) {
        this.f4126c = application;
    }

    @j0
    public <T extends Application> T f() {
        return (T) this.f4126c;
    }
}
