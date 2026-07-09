package org.dcm4che3.data;

import java.io.Serializable;
import org.dcm4che3.util.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class Issuer implements Serializable {
    private static final long serialVersionUID = 5350502680059507981L;
    private String localNamespaceEntityID;
    private String universalEntityID;
    private String universalEntityIDType;

    public Issuer() {
    }

    private String emptyToNull(String str) {
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static Issuer fromIssuerOfPatientID(Attributes attributes) {
        String string = attributes.getString(Tag.IssuerOfPatientID);
        Attributes nestedDataset = attributes.getNestedDataset(Tag.IssuerOfPatientIDQualifiersSequence);
        if (string != null || (nestedDataset != null && nestedDataset.containsValue(Tag.UniversalEntityID) && nestedDataset.containsValue(Tag.UniversalEntityIDType))) {
            return new Issuer(string, nestedDataset);
        }
        return null;
    }

    private void validate() {
        if (this.localNamespaceEntityID == null && this.universalEntityID == null) {
            throw new IllegalArgumentException("Missing Local Namespace Entity ID or Universal Entity ID");
        }
        if (this.universalEntityID != null && this.universalEntityIDType == null) {
            throw new IllegalArgumentException("Missing Universal Entity ID Type");
        }
    }

    public static Issuer valueOf(Attributes attributes) {
        if (attributes == null || attributes.isEmpty()) {
            return null;
        }
        return new Issuer(attributes);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Issuer)) {
            return false;
        }
        Issuer issuer = (Issuer) obj;
        return equals(this.localNamespaceEntityID, issuer.localNamespaceEntityID) && equals(this.universalEntityID, issuer.universalEntityID) && equals(this.universalEntityIDType, issuer.universalEntityIDType);
    }

    public final String getLocalNamespaceEntityID() {
        return this.localNamespaceEntityID;
    }

    public final String getUniversalEntityID() {
        return this.universalEntityID;
    }

    public final String getUniversalEntityIDType() {
        return this.universalEntityIDType;
    }

    public int hashCode() {
        return (((hashCode(this.localNamespaceEntityID) * 37) + hashCode(this.universalEntityID)) * 37) + hashCode(this.universalEntityIDType);
    }

    public boolean matches(Issuer issuer) {
        if (this == issuer || issuer == null) {
            return true;
        }
        String str = this.localNamespaceEntityID;
        boolean z3 = (str == null || issuer.localNamespaceEntityID == null) ? false : true;
        boolean z4 = (this.universalEntityID == null || issuer.universalEntityID == null) ? false : true;
        if ((z3 || z4) && (!z3 || str.equals(issuer.localNamespaceEntityID))) {
            if (!z4) {
                return true;
            }
            if (this.universalEntityID.equals(issuer.universalEntityID) && this.universalEntityIDType.equals(issuer.universalEntityIDType)) {
                return true;
            }
        }
        return false;
    }

    public boolean merge(Issuer issuer) {
        if (!matches(issuer)) {
            throw new IllegalArgumentException("other=" + issuer);
        }
        boolean z3 = this.localNamespaceEntityID == null && issuer.localNamespaceEntityID != null;
        if (z3) {
            this.localNamespaceEntityID = issuer.localNamespaceEntityID;
        }
        boolean z4 = this.universalEntityID == null && issuer.universalEntityID != null;
        if (z4) {
            this.universalEntityID = issuer.universalEntityID;
            this.universalEntityIDType = issuer.universalEntityIDType;
        }
        return z3 || z4;
    }

    public Attributes toIssuerOfPatientID(Attributes attributes) {
        if (attributes == null) {
            attributes = new Attributes(2);
        }
        String str = this.localNamespaceEntityID;
        if (str != null) {
            attributes.setString(Tag.IssuerOfPatientID, VR.LO, str);
        }
        if (this.universalEntityID != null) {
            Attributes attributes2 = new Attributes(2);
            attributes2.setString(Tag.UniversalEntityID, VR.UT, this.universalEntityID);
            attributes2.setString(Tag.UniversalEntityIDType, VR.CS, this.universalEntityIDType);
            attributes.newSequence(Tag.IssuerOfPatientIDQualifiersSequence, 1).add(attributes2);
        }
        return attributes;
    }

    public Attributes toItem() {
        int i4 = this.localNamespaceEntityID != null ? 1 : 0;
        if (this.universalEntityID != null) {
            i4++;
        }
        if (this.universalEntityIDType != null) {
            i4++;
        }
        Attributes attributes = new Attributes(i4);
        String str = this.localNamespaceEntityID;
        if (str != null) {
            attributes.setString(Tag.LocalNamespaceEntityID, VR.UT, str);
        }
        String str2 = this.universalEntityID;
        if (str2 != null) {
            attributes.setString(Tag.UniversalEntityID, VR.UT, str2);
        }
        String str3 = this.universalEntityIDType;
        if (str3 != null) {
            attributes.setString(Tag.UniversalEntityIDType, VR.CS, str3);
        }
        return attributes;
    }

    public String toString() {
        return toString('&');
    }

    public Issuer(String str) {
        this(str, '&');
    }

    private boolean equals(String str, String str2) {
        return str == str2 || (str != null && str.equals(str2));
    }

    private int hashCode(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString(char c4) {
        if (this.universalEntityID == null) {
            return this.localNamespaceEntityID;
        }
        StringBuilder sb = new StringBuilder();
        String str = this.localNamespaceEntityID;
        if (str != null) {
            sb.append(str);
        }
        sb.append(c4);
        sb.append(this.universalEntityID);
        sb.append(c4);
        sb.append(this.universalEntityIDType);
        return sb.toString();
    }

    public Issuer(String str, char c4) {
        String[] strArrSplit = StringUtils.split(str, c4);
        if (strArrSplit.length > 3) {
            throw new IllegalArgumentException(str);
        }
        this.localNamespaceEntityID = emptyToNull(strArrSplit[0]);
        this.universalEntityID = strArrSplit.length > 1 ? emptyToNull(strArrSplit[1]) : null;
        this.universalEntityIDType = strArrSplit.length > 2 ? emptyToNull(strArrSplit[2]) : null;
        validate();
    }

    public Issuer(String str, String str2, String str3) {
        this.localNamespaceEntityID = str;
        this.universalEntityID = str2;
        this.universalEntityIDType = str3;
        validate();
    }

    public Issuer(String str, Attributes attributes) {
        this(str, attributes != null ? attributes.getString(Tag.UniversalEntityID) : null, attributes != null ? attributes.getString(Tag.UniversalEntityIDType) : null);
    }

    public Issuer(Attributes attributes) {
        this(attributes.getString(Tag.LocalNamespaceEntityID), attributes.getString(Tag.UniversalEntityID), attributes.getString(Tag.UniversalEntityIDType));
    }

    public Issuer(Issuer issuer) {
        this(issuer.getLocalNamespaceEntityID(), issuer.getUniversalEntityID(), issuer.getUniversalEntityIDType());
    }
}
