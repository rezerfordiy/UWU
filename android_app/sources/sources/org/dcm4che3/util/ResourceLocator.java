package org.dcm4che3.util;

import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class ResourceLocator {
    public static String getResource(String str, Class<?> cls) {
        URL resourceURL = getResourceURL(str, cls);
        if (resourceURL != null) {
            return resourceURL.toString();
        }
        return null;
    }

    public static URL getResourceURL(String str, Class<?> cls) {
        ClassLoader classLoader;
        if (cls != null && (classLoader = cls.getClassLoader()) != null) {
            return classLoader.getResource(str);
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader.getResource(str) : ClassLoader.getSystemResource(str);
    }

    public static String resourceURL(String str) {
        URL resource = Thread.currentThread().getContextClassLoader().getResource(str);
        if (resource != null) {
            return resource.toString();
        }
        return null;
    }

    public static String getResource(String str, Object obj) {
        return getResource(str, obj == null ? null : obj.getClass());
    }

    public static URL getResourceURL(String str, Object obj) {
        return getResourceURL(str, obj == null ? null : obj.getClass());
    }
}
