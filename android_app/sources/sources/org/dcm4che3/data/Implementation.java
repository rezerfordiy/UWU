package org.dcm4che3.data;

/* JADX INFO: loaded from: classes.dex */
public class Implementation {
    private static final String IMPL_CLASS_UID = "1.2.40.0.13.1.3";
    private static final String IMPL_VERS_NAME = versionName();

    public static String getClassUID() {
        return IMPL_CLASS_UID;
    }

    public static String getVersionName() {
        return IMPL_VERS_NAME;
    }

    private static String versionName() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("dcm4che-");
        sb.append(Implementation.class.getPackage().getImplementationVersion());
        return sb.substring(0, Math.min(16, sb.length()));
    }
}
