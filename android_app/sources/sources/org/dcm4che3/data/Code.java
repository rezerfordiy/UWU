package org.dcm4che3.data;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class Code implements Serializable {
    private static final String NO_CODE_MEANING = "<none>";
    private static final long serialVersionUID = 8807594793107889446L;
    private String codeMeaning;
    private String codeValue;
    private String codingSchemeDesignator;
    private String codingSchemeVersion;
    private transient int hashCode;
    private final transient Key key;

    public final class Key {
        private Key() {
        }

        private Code outer() {
            return Code.this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Key) {
                return outer().equalsIgnoreMeaning(((Key) obj).outer());
            }
            return false;
        }

        public int hashCode() {
            return outer().hashCode();
        }
    }

    public Code() {
        this.key = new Key();
    }

    private String trimsubstring(String str, int i4, int i5) {
        try {
            String strTrim = str.substring(i4, i5).trim();
            if (!strTrim.isEmpty()) {
                return strTrim;
            }
        } catch (StringIndexOutOfBoundsException unused) {
        }
        throw new IllegalArgumentException(str);
    }

    public boolean equals(Object obj) {
        return equals(obj, false);
    }

    public boolean equalsIgnoreMeaning(Code code) {
        return equals((Object) code, true);
    }

    public final String getCodeMeaning() {
        return this.codeMeaning;
    }

    public final String getCodeValue() {
        return this.codeValue;
    }

    public final String getCodingSchemeDesignator() {
        return this.codingSchemeDesignator;
    }

    public final String getCodingSchemeVersion() {
        return this.codingSchemeVersion;
    }

    public int hashCode() {
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int iHashCode = (((527 + this.codeValue.hashCode()) * 31) + this.codingSchemeDesignator.hashCode()) * 31;
        String str = this.codingSchemeVersion;
        int iHashCode2 = (str != null ? str.hashCode() : 0) + iHashCode;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    public final Key key() {
        return this.key;
    }

    public Attributes toItem() {
        Attributes attributes = new Attributes(this.codingSchemeVersion != null ? 4 : 3);
        VR vr = VR.SH;
        attributes.setString(Tag.CodeValue, vr, this.codeValue);
        attributes.setString(Tag.CodingSchemeDesignator, vr, this.codingSchemeDesignator);
        String str = this.codingSchemeVersion;
        if (str != null) {
            attributes.setString(Tag.CodingSchemeVersion, vr, str);
        }
        attributes.setString(Tag.CodeMeaning, VR.LO, this.codeMeaning);
        return attributes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.codeValue);
        sb.append(", ");
        sb.append(this.codingSchemeDesignator);
        if (this.codingSchemeVersion != null) {
            sb.append(" [");
            sb.append(this.codingSchemeVersion);
            sb.append(']');
        }
        sb.append(", \"");
        sb.append(this.codeMeaning);
        sb.append("\")");
        return sb.toString();
    }

    public Code(String str) {
        this.key = new Key();
        int length = str.length();
        if (length >= 9 && str.charAt(0) == '(') {
            int i4 = length - 2;
            if (str.charAt(i4) == '\"' && str.charAt(length - 1) == ')') {
                int iIndexOf = str.indexOf(44);
                int i5 = iIndexOf + 1;
                int iIndexOf2 = str.indexOf(44, i5);
                int iIndexOf3 = str.indexOf(34, iIndexOf2 + 1) + 1;
                this.codeValue = trimsubstring(str, 1, iIndexOf);
                this.codingSchemeDesignator = trimsubstring(str, i5, iIndexOf2);
                this.codeMeaning = trimsubstring(str, iIndexOf3, i4);
                if (this.codingSchemeDesignator.endsWith("]")) {
                    int iLastIndexOf = str.lastIndexOf(93, iIndexOf2 - 1);
                    int iLastIndexOf2 = str.lastIndexOf(91, iLastIndexOf - 1);
                    this.codingSchemeDesignator = trimsubstring(str, i5, iLastIndexOf2);
                    this.codingSchemeVersion = trimsubstring(str, iLastIndexOf2 + 1, iLastIndexOf);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException(str);
    }

    private boolean equals(Object obj, boolean z3) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Code)) {
            return false;
        }
        Code code = (Code) obj;
        return this.codeValue.equals(code.codeValue) && this.codingSchemeDesignator.equals(code.codingSchemeDesignator) && equals(this.codingSchemeVersion, code.codingSchemeVersion) && (z3 || this.codeMeaning.equals(code.codeMeaning));
    }

    public Code(String str, String str2, String str3, String str4) {
        this.key = new Key();
        if (str == null) {
            throw new NullPointerException("Missing Code Value");
        }
        if (str2 == null) {
            throw new NullPointerException("Missing Coding Scheme Designator");
        }
        if (str4 == null) {
            throw new NullPointerException("Missing Code Meaning");
        }
        this.codeValue = str;
        this.codingSchemeDesignator = str2;
        this.codingSchemeVersion = str3;
        this.codeMeaning = str4;
    }

    private boolean equals(String str, String str2) {
        return str == str2 || (str != null && str.equals(str2));
    }

    public Code(Attributes attributes) {
        this(attributes.getString(Tag.CodeValue, (String) null), attributes.getString(Tag.CodingSchemeDesignator, (String) null), attributes.getString(Tag.CodingSchemeVersion, (String) null), attributes.getString(Tag.CodeMeaning, NO_CODE_MEANING));
    }
}
