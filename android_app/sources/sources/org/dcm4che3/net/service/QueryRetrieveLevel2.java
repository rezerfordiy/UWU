package org.dcm4che3.net.service;

import java.util.EnumSet;
import java.util.Iterator;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.ElementDictionary;
import org.dcm4che3.data.Tag;
import org.dcm4che3.data.VR;
import org.dcm4che3.util.StringUtils;
import org.dcm4che3.util.TagUtils;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'STUDY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class QueryRetrieveLevel2 {
    private static final /* synthetic */ QueryRetrieveLevel2[] $VALUES;
    private static ElementDictionary DICT;
    public static final QueryRetrieveLevel2 IMAGE;
    public static final QueryRetrieveLevel2 PATIENT;
    public static final QueryRetrieveLevel2 SERIES;
    public static final QueryRetrieveLevel2 STUDY;
    private final int uniqueKey;
    private final VR vrOfUniqueKey;

    static {
        QueryRetrieveLevel2 queryRetrieveLevel2 = new QueryRetrieveLevel2("PATIENT", 0, Tag.PatientID, VR.LO);
        PATIENT = queryRetrieveLevel2;
        VR vr = VR.UI;
        QueryRetrieveLevel2 queryRetrieveLevel22 = new QueryRetrieveLevel2("STUDY", 1, Tag.StudyInstanceUID, vr);
        STUDY = queryRetrieveLevel22;
        QueryRetrieveLevel2 queryRetrieveLevel23 = new QueryRetrieveLevel2("SERIES", 2, Tag.SeriesInstanceUID, vr);
        SERIES = queryRetrieveLevel23;
        QueryRetrieveLevel2 queryRetrieveLevel24 = new QueryRetrieveLevel2("IMAGE", 3, Tag.SOPInstanceUID, vr);
        IMAGE = queryRetrieveLevel24;
        $VALUES = new QueryRetrieveLevel2[]{queryRetrieveLevel2, queryRetrieveLevel22, queryRetrieveLevel23, queryRetrieveLevel24};
        DICT = ElementDictionary.getStandardElementDictionary();
    }

    private QueryRetrieveLevel2(String str, int i4, int i5, VR vr) {
        this.uniqueKey = i5;
        this.vrOfUniqueKey = vr;
    }

    private void checkUniqueKey(Attributes attributes, boolean z3, boolean z4) throws DicomServiceException {
        String[] strings = attributes.getStrings(this.uniqueKey);
        if (strings == null || strings.length == 0) {
            if (!z3) {
                throw missingAttribute(this.uniqueKey);
            }
        } else if (!z4 && strings.length > 1) {
            throw invalidAttributeValue(this.uniqueKey, StringUtils.concat(strings, '\\'));
        }
    }

    private static DicomServiceException identifierDoesNotMatchSOPClass(String str, int i4) {
        return new DicomServiceException(43264, str).setOffendingElements(i4);
    }

    private static DicomServiceException invalidAttributeValue(int i4, String str) {
        return identifierDoesNotMatchSOPClass("Invalid " + DICT.keywordOf(i4) + " " + TagUtils.toString(i4) + " - " + str, Tag.QueryRetrieveLevel);
    }

    private static DicomServiceException missingAttribute(int i4) {
        return identifierDoesNotMatchSOPClass("Missing " + DICT.keywordOf(i4) + " " + TagUtils.toString(i4), i4);
    }

    private static QueryRetrieveLevel2 validateIdentifier(Attributes attributes, EnumSet<QueryRetrieveLevel2> enumSet, boolean z3, boolean z4) throws DicomServiceException {
        String string = attributes.getString(Tag.QueryRetrieveLevel);
        if (string == null) {
            throw missingAttribute(Tag.QueryRetrieveLevel);
        }
        try {
            QueryRetrieveLevel2 queryRetrieveLevel2ValueOf = valueOf(string);
            if (!enumSet.contains(queryRetrieveLevel2ValueOf)) {
                throw invalidAttributeValue(Tag.QueryRetrieveLevel, string);
            }
            if (queryRetrieveLevel2ValueOf == PATIENT) {
                queryRetrieveLevel2ValueOf.checkUniqueKey(attributes, z4, false);
                return queryRetrieveLevel2ValueOf;
            }
            Iterator<QueryRetrieveLevel2> it = enumSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                QueryRetrieveLevel2 next = it.next();
                if (next != queryRetrieveLevel2ValueOf) {
                    next.checkUniqueKey(attributes, z3, false);
                } else if (!z4) {
                    queryRetrieveLevel2ValueOf.checkUniqueKey(attributes, false, true);
                }
            }
            return queryRetrieveLevel2ValueOf;
        } catch (IllegalArgumentException unused) {
            throw invalidAttributeValue(Tag.QueryRetrieveLevel, string);
        }
    }

    public static QueryRetrieveLevel2 validateQueryIdentifier(Attributes attributes, EnumSet<QueryRetrieveLevel2> enumSet, boolean z3) throws DicomServiceException {
        return validateIdentifier(attributes, enumSet, z3, true);
    }

    public static QueryRetrieveLevel2 validateRetrieveIdentifier(Attributes attributes, EnumSet<QueryRetrieveLevel2> enumSet, boolean z3) throws DicomServiceException {
        return validateIdentifier(attributes, enumSet, z3, false);
    }

    public static QueryRetrieveLevel2 valueOf(String str) {
        return (QueryRetrieveLevel2) Enum.valueOf(QueryRetrieveLevel2.class, str);
    }

    public static QueryRetrieveLevel2[] values() {
        return (QueryRetrieveLevel2[]) $VALUES.clone();
    }

    public int uniqueKey() {
        return this.uniqueKey;
    }

    public VR vrOfUniqueKey() {
        return this.vrOfUniqueKey;
    }
}
