package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import c.j0;
import c.k0;
import c.o0;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
@o0(api = 28)
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class CoreComponentFactory extends AppComponentFactory {

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        Object a();
    }

    public static <T> T a(T t4) {
        T t5;
        return (!(t4 instanceof a) || (t5 = (T) ((a) t4).a()) == null) ? t4 : t5;
    }

    @j0
    public Activity instantiateActivity(@j0 ClassLoader classLoader, @j0 String str, @k0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Activity) a(super.instantiateActivity(classLoader, str, intent));
    }

    @j0
    public Application instantiateApplication(@j0 ClassLoader classLoader, @j0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Application) a(super.instantiateApplication(classLoader, str));
    }

    @j0
    public ContentProvider instantiateProvider(@j0 ClassLoader classLoader, @j0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (ContentProvider) a(super.instantiateProvider(classLoader, str));
    }

    @j0
    public BroadcastReceiver instantiateReceiver(@j0 ClassLoader classLoader, @j0 String str, @k0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (BroadcastReceiver) a(super.instantiateReceiver(classLoader, str, intent));
    }

    @j0
    public Service instantiateService(@j0 ClassLoader classLoader, @j0 String str, @k0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Service) a(super.instantiateService(classLoader, str, intent));
    }
}
