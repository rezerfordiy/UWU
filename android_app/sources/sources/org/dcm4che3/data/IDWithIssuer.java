package org.dcm4che3.data;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.dcm4che3.util.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class IDWithIssuer {
    public static final IDWithIssuer[] EMPTY = new IDWithIssuer[0];
    private final String id;
    private String identifierTypeCode;
    private Issuer issuer;

    public IDWithIssuer(String str) {
        String[] strArrSplit = StringUtils.split(str, '^');
        this.id = strArrSplit[0];
        setIdentifierTypeCode(strArrSplit.length > 4 ? strArrSplit[4] : null);
        setIssuer(strArrSplit.length > 3 ? new Issuer(strArrSplit[3], '&') : null);
    }

    private static String identifierTypeCodeOf(Attributes attributes) {
        Attributes nestedDataset = attributes.getNestedDataset(Tag.IssuerOfPatientIDQualifiersSequence);
        if (nestedDataset != null) {
            return nestedDataset.getString(Tag.IdentifierTypeCode);
        }
        return null;
    }

    public static IDWithIssuer pidOf(Attributes attributes) {
        String string = attributes.getString(Tag.PatientID);
        if (string == null) {
            return null;
        }
        IDWithIssuer iDWithIssuer = new IDWithIssuer(string, Issuer.fromIssuerOfPatientID(attributes));
        iDWithIssuer.setIdentifierTypeCode(identifierTypeCodeOf(attributes));
        return iDWithIssuer;
    }

    public static Set<IDWithIssuer> pidsOf(Attributes attributes) {
        IDWithIssuer iDWithIssuerPidOf = pidOf(attributes);
        Sequence sequence = attributes.getSequence(Tag.OtherPatientIDsSequence);
        if (sequence == null) {
            return iDWithIssuerPidOf == null ? Collections.emptySet() : Collections.singleton(iDWithIssuerPidOf);
        }
        HashSet hashSet = new HashSet((sequence.size() + 1) << 1);
        if (iDWithIssuerPidOf != null) {
            hashSet.add(iDWithIssuerPidOf);
        }
        Iterator<Attributes> it = sequence.iterator();
        while (it.hasNext()) {
            IDWithIssuer iDWithIssuerPidOf2 = pidOf(it.next());
            if (iDWithIssuerPidOf2 != null) {
                hashSet.add(iDWithIssuerPidOf2);
            }
        }
        return hashSet;
    }

    public static IDWithIssuer valueOf(Attributes attributes, int i4, int i5) {
        String string = attributes.getString(i4);
        if (string == null) {
            return null;
        }
        return new IDWithIssuer(string, Issuer.valueOf(attributes.getNestedDataset(i5)));
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IDWithIssuer)) {
            return false;
        }
        IDWithIssuer iDWithIssuer = (IDWithIssuer) obj;
        if (this.id.equals(iDWithIssuer.id) && ((str = this.identifierTypeCode) != null ? str.equals(str) : iDWithIssuer.identifierTypeCode == null)) {
            Issuer issuer = this.issuer;
            Issuer issuer2 = iDWithIssuer.issuer;
            if (issuer == null) {
                if (issuer2 == null) {
                    return true;
                }
            } else if (issuer.equals(issuer2)) {
                return true;
            }
        }
        return false;
    }

    public Attributes exportPatientIDWithIssuer(Attributes attributes) {
        if (attributes == null) {
            attributes = new Attributes(3);
        }
        attributes.setString(Tag.PatientID, VR.LO, this.id);
        Issuer issuer = this.issuer;
        if (issuer == null && this.identifierTypeCode == null) {
            return attributes;
        }
        if (issuer != null) {
            issuer.toIssuerOfPatientID(attributes);
        }
        if (this.identifierTypeCode != null) {
            Attributes nestedDataset = attributes.getNestedDataset(Tag.IssuerOfPatientIDQualifiersSequence);
            if (nestedDataset == null) {
                nestedDataset = new Attributes(1);
                attributes.newSequence(Tag.IssuerOfPatientIDQualifiersSequence, 1).add(nestedDataset);
            }
            nestedDataset.setString(Tag.IdentifierTypeCode, VR.CS, this.identifierTypeCode);
        }
        return attributes;
    }

    public final String getID() {
        return this.id;
    }

    public final String getIdentifierTypeCode() {
        return this.identifierTypeCode;
    }

    public final Issuer getIssuer() {
        return this.issuer;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode();
        String str = this.identifierTypeCode;
        if (str != null) {
            iHashCode += str.hashCode() * 31;
        }
        Issuer issuer = this.issuer;
        return issuer != null ? iHashCode + (issuer.hashCode() * 31) : iHashCode;
    }

    public boolean matches(IDWithIssuer iDWithIssuer) {
        if (this.id.equals(iDWithIssuer.id)) {
            Issuer issuer = this.issuer;
            Issuer issuer2 = iDWithIssuer.issuer;
            if (issuer != null ? issuer.matches(issuer2) : issuer2 == null) {
                return true;
            }
        }
        return false;
    }

    public final void setIdentifierTypeCode(String str) {
        this.identifierTypeCode = str;
    }

    public final void setIssuer(Issuer issuer) {
        this.issuer = issuer;
    }

    public String toString() {
        if (this.issuer == null && this.identifierTypeCode == null) {
            return this.id;
        }
        StringBuilder sb = new StringBuilder(this.id);
        sb.append("^^^");
        Issuer issuer = this.issuer;
        if (issuer != null) {
            sb.append(issuer.toString('&'));
        }
        if (this.identifierTypeCode != null) {
            sb.append('^');
            sb.append(this.identifierTypeCode);
        }
        return sb.toString();
    }

    public IDWithIssuer(String str, String str2) {
        this.id = str;
        setIssuer(str2 != null ? new Issuer(str2, '&') : null);
    }

    public IDWithIssuer(String str, Issuer issuer) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("empty id");
        }
        this.id = str;
        setIssuer(issuer);
    }
}
