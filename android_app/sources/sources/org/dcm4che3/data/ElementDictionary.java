package org.dcm4che3.data;

import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes.dex */
public abstract class ElementDictionary {
    private static final ServiceLoader<ElementDictionary> loader = ServiceLoader.load(ElementDictionary.class);
    private final String privateCreator;
    private final Class<?> tagClass;

    public ElementDictionary(String str, Class<?> cls) {
        this.privateCreator = str;
        this.tagClass = cls;
    }

    public static ElementDictionary getElementDictionary(String str) {
        if (str != null) {
            ServiceLoader<ElementDictionary> serviceLoader = loader;
            synchronized (serviceLoader) {
                for (ElementDictionary elementDictionary : serviceLoader) {
                    if (str.equals(elementDictionary.getPrivateCreator())) {
                        return elementDictionary;
                    }
                }
            }
        }
        return getStandardElementDictionary();
    }

    public static ElementDictionary getStandardElementDictionary() {
        return StandardElementDictionary.INSTANCE;
    }

    public static String keywordOf(int i4, String str) {
        return getElementDictionary(str).keywordOf(i4);
    }

    public static void reload() {
        ServiceLoader<ElementDictionary> serviceLoader = loader;
        synchronized (serviceLoader) {
            serviceLoader.reload();
        }
    }

    public static VR vrOf(int i4, String str) {
        return getElementDictionary(str).vrOf(i4);
    }

    public int daTagOf(int i4) {
        return 0;
    }

    public final String getPrivateCreator() {
        return this.privateCreator;
    }

    public abstract String keywordOf(int i4);

    public int tagForKeyword(String str) {
        Class<?> cls = this.tagClass;
        if (cls == null) {
            return -1;
        }
        try {
            return cls.getField(str).getInt(null);
        } catch (Exception unused) {
            return -1;
        }
    }

    public int tmTagOf(int i4) {
        return 0;
    }

    public abstract VR vrOf(int i4);

    public static int tagForKeyword(String str, String str2) {
        return getElementDictionary(str2).tagForKeyword(str);
    }
}
