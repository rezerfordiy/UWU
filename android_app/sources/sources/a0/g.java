package a0;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.core.app.CoreComponentFactory;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
@c.o0(28)
public class g extends AppComponentFactory {
    @c.j0
    public Activity a(@c.j0 ClassLoader classLoader, @c.j0 String str, @c.k0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException("Couldn't call constructor", e4);
        }
    }

    @c.j0
    public Application b(@c.j0 ClassLoader classLoader, @c.j0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException("Couldn't call constructor", e4);
        }
    }

    @c.j0
    public ContentProvider c(@c.j0 ClassLoader classLoader, @c.j0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException("Couldn't call constructor", e4);
        }
    }

    @c.j0
    public BroadcastReceiver d(@c.j0 ClassLoader classLoader, @c.j0 String str, @c.k0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException("Couldn't call constructor", e4);
        }
    }

    @c.j0
    public Service e(@c.j0 ClassLoader classLoader, @c.j0 String str, @c.k0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException("Couldn't call constructor", e4);
        }
    }

    @c.j0
    public final Activity instantiateActivity(@c.j0 ClassLoader classLoader, @c.j0 String str, @c.k0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Activity) CoreComponentFactory.a(a(classLoader, str, intent));
    }

    @c.j0
    public final Application instantiateApplication(@c.j0 ClassLoader classLoader, @c.j0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Application) CoreComponentFactory.a(b(classLoader, str));
    }

    @c.j0
    public final ContentProvider instantiateProvider(@c.j0 ClassLoader classLoader, @c.j0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (ContentProvider) CoreComponentFactory.a(c(classLoader, str));
    }

    @c.j0
    public final BroadcastReceiver instantiateReceiver(@c.j0 ClassLoader classLoader, @c.j0 String str, @c.k0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (BroadcastReceiver) CoreComponentFactory.a(d(classLoader, str, intent));
    }

    @c.j0
    public final Service instantiateService(@c.j0 ClassLoader classLoader, @c.j0 String str, @c.k0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Service) CoreComponentFactory.a(e(classLoader, str, intent));
    }
}
