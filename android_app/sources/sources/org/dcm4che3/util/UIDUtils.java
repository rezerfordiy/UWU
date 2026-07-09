package org.dcm4che3.util;

import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.UID;
import org.dcm4che3.data.VR;
import org.dcm4che3.data.Value;

/* JADX INFO: loaded from: classes.dex */
public class UIDUtils {
    private static final Pattern PATTERN = Pattern.compile("[012]((\\.0)|(\\.[1-9]\\d*))+");
    private static final String UUID_ROOT = "2.25";
    private static String root = UUID_ROOT;

    public static class Visitor implements Attributes.Visitor {
        private int replaced;
        private final Map<String, String> uidMap;

        public Visitor(Map<String, String> map) {
            this.uidMap = map;
        }

        @Override // org.dcm4che3.data.Attributes.Visitor
        public boolean visit(Attributes attributes, int i4, VR vr, Object obj) {
            VR vr2 = VR.UI;
            if (vr == vr2 && obj != Value.NULL) {
                boolean z3 = obj instanceof byte[];
                Object obj2 = obj;
                if (z3) {
                    String[] strings = attributes.getStrings(i4);
                    int length = strings.length;
                    String[] strArr = strings;
                    if (length == 1) {
                        strArr = strings[0];
                    }
                    obj2 = strArr;
                }
                if (obj2 instanceof String[]) {
                    String[] strArr2 = (String[]) obj2;
                    for (int i5 = 0; i5 < strArr2.length; i5++) {
                        String str = this.uidMap.get(strArr2[i5]);
                        if (str != null) {
                            strArr2[i5] = str;
                            this.replaced++;
                        }
                    }
                } else {
                    String str2 = this.uidMap.get(obj2);
                    if (str2 != null) {
                        attributes.setString(i4, vr2, str2);
                        this.replaced++;
                    }
                }
            }
            return true;
        }
    }

    private static void checkRoot(String str) {
        if (str.length() > 24) {
            throw new IllegalArgumentException("root length > 24");
        }
        if (!isValid(str)) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String createNameBasedUID(byte[] bArr) {
        return nameBasedUID(bArr, root);
    }

    public static String createNameUID(byte[] bArr, String str) {
        checkRoot(str);
        return nameBasedUID(bArr, str);
    }

    public static String createUID() {
        return randomUID(root);
    }

    public static String createUIDIfNull(String str) {
        return str == null ? randomUID(root) : str;
    }

    public static String[] findUIDs(String str) {
        Pattern patternCompile = Pattern.compile(str);
        Field[] fields = UID.class.getFields();
        String[] strArr = new String[fields.length];
        int i4 = 0;
        for (Field field : fields) {
            if (patternCompile.matcher(field.getName()).matches()) {
                int i5 = i4 + 1;
                try {
                    strArr[i4] = (String) field.get(null);
                } catch (Exception unused) {
                }
                i4 = i5;
            }
        }
        return (String[]) Arrays.copyOf(strArr, i4);
    }

    public static final String getRoot() {
        return root;
    }

    public static boolean isValid(String str) {
        return str.length() <= 64 && PATTERN.matcher(str).matches();
    }

    private static String nameBasedUID(byte[] bArr, String str) {
        return toUID(str, UUID.nameUUIDFromBytes(bArr));
    }

    public static StringBuilder promptTo(String str, StringBuilder sb) {
        sb.append(str);
        sb.append(" - ");
        sb.append(UID.nameOf(str));
        return sb;
    }

    private static String randomUID(String str) {
        return toUID(str, UUID.randomUUID());
    }

    public static int remapUIDs(Attributes attributes, Map<String, String> map) {
        Visitor visitor = new Visitor(map);
        try {
            attributes.accept(visitor, true);
            return visitor.replaced;
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }

    public static final void setRoot(String str) {
        checkRoot(str);
        root = str;
    }

    private static String toUID(String str, UUID uuid) {
        byte[] bArr = new byte[17];
        ByteUtils.longToBytesBE(uuid.getMostSignificantBits(), bArr, 1);
        ByteUtils.longToBytesBE(uuid.getLeastSignificantBits(), bArr, 9);
        String string = new BigInteger(bArr).toString();
        int length = str.length();
        int length2 = string.length();
        char[] cArr = new char[length + length2 + 1];
        str.getChars(0, length, cArr, 0);
        cArr[length] = '.';
        string.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static String createUID(String str) {
        checkRoot(str);
        return randomUID(str);
    }

    public static String createUIDIfNull(String str, String str2) {
        checkRoot(str2);
        return str == null ? randomUID(str2) : str;
    }
}
