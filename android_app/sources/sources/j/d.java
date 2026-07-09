package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import c.v0;
import e.a;

/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f8207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f8208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f8209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f8210e;

    public d() {
        super(null);
    }

    public void a(Configuration configuration) {
        if (this.f8210e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f8209d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f8209d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        if (this.f8210e == null) {
            Configuration configuration = this.f8209d;
            this.f8210e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f8210e;
    }

    public int c() {
        return this.f8206a;
    }

    public final void d() {
        boolean z3 = this.f8207b == null;
        if (z3) {
            this.f8207b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f8207b.setTo(theme);
            }
        }
        e(this.f8207b, this.f8206a, z3);
    }

    public void e(Resources.Theme theme, int i4, boolean z3) {
        theme.applyStyle(i4, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f8208c == null) {
            this.f8208c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f8208c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f8207b;
        if (theme != null) {
            return theme;
        }
        if (this.f8206a == 0) {
            this.f8206a = a.m.h4;
        }
        d();
        return this.f8207b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i4) {
        if (this.f8206a != i4) {
            this.f8206a = i4;
            d();
        }
    }

    public d(Context context, @v0 int i4) {
        super(context);
        this.f8206a = i4;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f8207b = theme;
    }
}
