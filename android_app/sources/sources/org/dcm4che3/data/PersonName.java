package org.dcm4che3.data;

import java.util.Arrays;
import java.util.StringTokenizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public class PersonName {
    private static final Logger LOG = LoggerFactory.getLogger(PersonName.class);
    private final String[] fields;

    public enum Component {
        FamilyName,
        GivenName,
        MiddleName,
        NamePrefix,
        NameSuffix
    }

    public enum Group {
        Alphabetic,
        Ideographic,
        Phonetic
    }

    public PersonName() {
        this.fields = new String[15];
    }

    private void parse(String str, boolean z3) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "^=", true);
        int i4 = 0;
        int i5 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            char cCharAt = strNextToken.charAt(0);
            if (cCharAt == '=') {
                i4++;
                if (i4 > 2) {
                    if (!z3) {
                        throw new IllegalArgumentException(str);
                    }
                    LOG.info("illegal PN: {} - truncate illegal component group(s)", str);
                    return;
                }
                i5 = 0;
            } else if (cCharAt == '^') {
                i5++;
                if (i5 <= 4) {
                    continue;
                } else {
                    if (!z3) {
                        throw new IllegalArgumentException(str);
                    }
                    LOG.info("illegal PN: {} - ignore illegal component(s)", str);
                }
            } else if (i5 <= 4) {
                set(i4, i5, strNextToken);
            }
        }
    }

    private void set(int i4, int i5, String str) {
        this.fields[(i4 * 5) + i5] = trim(str);
    }

    private static String trim(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (!strTrim.isEmpty()) {
                return strTrim;
            }
        }
        return null;
    }

    public boolean contains(Component component) {
        return contains(Group.Alphabetic, component);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PersonName) {
            return Arrays.equals(this.fields, ((PersonName) obj).fields);
        }
        return false;
    }

    public String get(Component component) {
        return get(Group.Alphabetic, component);
    }

    public int hashCode() {
        return Arrays.hashCode(this.fields);
    }

    public boolean isEmpty() {
        for (Group group : Group.values()) {
            if (contains(group)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        Group group = Group.Alphabetic;
        int iOrdinal = 0;
        for (Group group2 : Group.values()) {
            Component component = Component.FamilyName;
            for (Component component2 : Component.values()) {
                String str = get(group2, component2);
                if (str != null) {
                    iOrdinal += str.length();
                    group = group2;
                    component = component2;
                }
            }
            iOrdinal += component.ordinal();
        }
        char[] cArr = new char[iOrdinal + group.ordinal()];
        Group[] groupArrValues = Group.values();
        int length = groupArrValues.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            Group group3 = groupArrValues[i4];
            Component component3 = Component.FamilyName;
            for (Component component4 : Component.values()) {
                String str2 = get(group3, component4);
                if (str2 != null) {
                    int iOrdinal2 = component4.ordinal() - component3.ordinal();
                    while (true) {
                        int i6 = iOrdinal2 - 1;
                        if (iOrdinal2 <= 0) {
                            break;
                        }
                        cArr[i5] = '^';
                        i5++;
                        iOrdinal2 = i6;
                    }
                    int length2 = str2.length();
                    str2.getChars(0, length2, cArr, i5);
                    i5 += length2;
                    component3 = component4;
                }
            }
            if (group3 == group) {
                break;
            }
            cArr[i5] = '=';
            i4++;
            i5++;
        }
        return new String(cArr);
    }

    public PersonName(String str) {
        this(str, false);
    }

    public boolean contains(Group group) {
        for (Component component : Component.values()) {
            if (contains(group, component)) {
                return true;
            }
        }
        return false;
    }

    public String get(Group group, Component component) {
        return this.fields[(group.ordinal() * 5) + component.ordinal()];
    }

    public void set(Component component, String str) {
        set(Group.Alphabetic, component, str);
    }

    public String toString(Group group, boolean z3) {
        Component component = Component.FamilyName;
        int length = 0;
        for (Component component2 : Component.values()) {
            String str = get(group, component2);
            if (str != null) {
                length += str.length();
                component = component2;
            }
        }
        int iOrdinal = length + (z3 ? component.ordinal() : 4);
        char[] cArr = new char[iOrdinal];
        int i4 = 0;
        for (Component component3 : Component.values()) {
            String str2 = get(group, component3);
            if (str2 != null) {
                int length2 = str2.length();
                str2.getChars(0, length2, cArr, i4);
                i4 += length2;
            }
            if (z3 && component3 == component) {
                break;
            }
            if (i4 < iOrdinal) {
                cArr[i4] = '^';
                i4++;
            }
        }
        return new String(cArr);
    }

    public PersonName(String str, boolean z3) {
        this.fields = new String[15];
        if (str != null) {
            parse(str, z3);
        }
    }

    public boolean contains(Group group, Component component) {
        return get(group, component) != null;
    }

    public void set(Group group, Component component, String str) {
        set(group.ordinal(), component.ordinal(), str);
    }
}
