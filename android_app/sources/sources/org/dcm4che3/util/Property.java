package org.dcm4che3.util;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class Property implements Serializable {
    private static final long serialVersionUID = 6618989493749845502L;
    private final String name;
    private final Object value;

    public Property(String str) {
        int iIndexOf = str.indexOf(61);
        this.name = str.substring(0, iIndexOf);
        this.value = valueOf(str.substring(iIndexOf + 1));
    }

    private static Object valueOf(String str) {
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return str.equalsIgnoreCase("true") ? Boolean.TRUE : str.equalsIgnoreCase("false") ? Boolean.FALSE : str;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Property property = (Property) obj;
        return this.name.equals(property.name) && this.value.equals(property.value);
    }

    public final String getName() {
        return this.name;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public void setAt(Object obj) {
        String str = "set" + this.name.substring(0, 1).toUpperCase(Locale.ENGLISH) + this.name.substring(1);
        try {
            try {
                Class<?> cls = obj.getClass();
                Object obj2 = this.value;
                if (obj2 instanceof String) {
                    cls.getMethod(str, String.class).invoke(obj, this.value);
                    return;
                }
                if (obj2 instanceof Boolean) {
                    cls.getMethod(str, Boolean.TYPE).invoke(obj, this.value);
                    return;
                }
                try {
                    cls.getMethod(str, Double.TYPE).invoke(obj, Double.valueOf(((Number) this.value).doubleValue()));
                } catch (NoSuchMethodException e4) {
                    try {
                        try {
                            cls.getMethod(str, Float.TYPE).invoke(obj, Float.valueOf(((Number) this.value).floatValue()));
                        } catch (NoSuchMethodException unused) {
                            cls.getMethod(str, Integer.TYPE).invoke(obj, Integer.valueOf(((Number) this.value).intValue()));
                        }
                    } catch (NoSuchMethodException unused2) {
                        throw e4;
                    }
                }
            } catch (IllegalAccessException e5) {
                throw new IllegalArgumentException(e5.getMessage());
            } catch (InvocationTargetException e6) {
                throw new IllegalArgumentException(e6.getMessage());
            }
        } catch (NoSuchMethodException e7) {
            throw new IllegalArgumentException(e7.getMessage());
        }
    }

    public String toString() {
        return this.name + '=' + this.value;
    }

    public Property(String str, Object obj) {
        if (str == null) {
            throw new NullPointerException("name");
        }
        if (obj == null) {
            throw new NullPointerException("value");
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number)) {
            this.name = str;
            this.value = obj;
        } else {
            throw new IllegalArgumentException("value: " + obj.getClass());
        }
    }

    public static Property[] valueOf(String[] strArr) {
        int length = strArr.length;
        Property[] propertyArr = new Property[length];
        for (int i4 = 0; i4 < length; i4++) {
            propertyArr[i4] = new Property(strArr[i4]);
        }
        return propertyArr;
    }
}
