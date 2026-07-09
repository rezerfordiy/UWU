package org.dcm4che3.media;

import java.io.IOException;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.Sequence;
import org.dcm4che3.data.Tag;
import org.dcm4che3.data.VR;
import org.dcm4che3.io.ContentHandlerAdapter;
import org.dcm4che3.util.ResourceLocator;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes.dex */
public class RecordFactory {
    private static final int IN_USE = 65535;
    private HashMap<String, int[]> privateRecordKeys;
    private HashMap<String, String> privateRecordUIDs;
    private EnumMap<RecordType, int[]> recordKeys;
    private HashMap<String, RecordType> recordTypes;

    private void copyConceptMod(Sequence sequence, Attributes attributes) {
        Sequence sequenceNewSequence = null;
        for (Attributes attributes2 : sequence) {
            if ("HAS CONCEPT MOD".equals(attributes2.getString(Tag.RelationshipType, (String) null))) {
                if (sequenceNewSequence == null) {
                    sequenceNewSequence = attributes.newSequence(Tag.ContentSequence, 1);
                }
                sequenceNewSequence.add(new Attributes(attributes2, false));
            }
        }
    }

    private void lazyLoadDefaultConfiguration() {
        if (this.recordTypes == null) {
            loadDefaultConfiguration();
        }
    }

    private Attributes parseXML(String str) throws ParserConfigurationException, SAXException, IOException {
        Attributes attributes = new Attributes();
        SAXParserFactory.newInstance().newSAXParser().parse(str, new ContentHandlerAdapter(attributes));
        return attributes;
    }

    public Attributes createRecord(Attributes attributes, Attributes attributes2, String[] strArr) {
        String string = attributes2.getString(Tag.MediaStorageSOPClassUID, (String) null);
        RecordType recordType = getRecordType(string);
        return createRecord(recordType, recordType == RecordType.PRIVATE ? getPrivateRecordUID(string) : null, attributes, attributes2, strArr);
    }

    public String getPrivateRecordUID(String str) {
        str.getClass();
        lazyLoadDefaultConfiguration();
        String str2 = this.privateRecordUIDs.get(str);
        return str2 != null ? str2 : str;
    }

    public int[] getRecordKeys(RecordType recordType) {
        lazyLoadDefaultConfiguration();
        return this.recordKeys.get(recordType);
    }

    public RecordType getRecordType(String str) {
        str.getClass();
        lazyLoadDefaultConfiguration();
        RecordType recordType = this.recordTypes.get(str);
        return recordType != null ? recordType : RecordType.PRIVATE;
    }

    public void loadConfiguration(String str) throws ParserConfigurationException, SAXException, IOException {
        Sequence sequence = parseXML(str).getSequence(Tag.DirectoryRecordSequence);
        if (sequence == null) {
            throw new IllegalArgumentException("Missing Directory Record Sequence in " + str);
        }
        EnumMap<RecordType, int[]> enumMap = new EnumMap<>(RecordType.class);
        HashMap<String, RecordType> map = new HashMap<>(134);
        HashMap<String, String> map2 = new HashMap<>();
        HashMap<String, int[]> map3 = new HashMap<>();
        for (Attributes attributes : sequence) {
            RecordType recordTypeForCode = RecordType.forCode(attributes.getString(Tag.DirectoryRecordType, (String) null));
            RecordType recordType = RecordType.PRIVATE;
            String string = recordTypeForCode == recordType ? attributes.getString(Tag.PrivateRecordUID, (String) null) : null;
            String[] strings = attributes.getStrings(Tag.ReferencedSOPClassUIDInFile);
            if (strings != null) {
                int i4 = 0;
                if (recordTypeForCode != recordType) {
                    int length = strings.length;
                    while (i4 < length) {
                        map.put(strings[i4], recordTypeForCode);
                        i4++;
                    }
                } else if (string != null) {
                    int length2 = strings.length;
                    while (i4 < length2) {
                        map2.put(strings[i4], string);
                        i4++;
                    }
                }
            }
            attributes.remove(Tag.DirectoryRecordType);
            attributes.remove(Tag.PrivateRecordUID);
            attributes.remove(Tag.ReferencedSOPClassUIDInFile);
            int[] iArrTags = attributes.tags();
            if (string != null) {
                if (map3.put(string, iArrTags) != null) {
                    throw new IllegalArgumentException("Duplicate Private Record UID: " + string);
                }
            } else if (enumMap.put(recordTypeForCode, iArrTags) != null) {
                throw new IllegalArgumentException("Duplicate Record Type: " + recordTypeForCode);
            }
        }
        EnumSet enumSetAllOf = EnumSet.allOf(RecordType.class);
        enumSetAllOf.removeAll(enumMap.keySet());
        if (!enumSetAllOf.isEmpty()) {
            throw new IllegalArgumentException("Missing Record Types: " + enumSetAllOf);
        }
        this.recordTypes = map;
        this.recordKeys = enumMap;
        this.privateRecordUIDs = map2;
        this.privateRecordKeys = map3;
    }

    public void loadDefaultConfiguration() {
        try {
            loadConfiguration(ResourceLocator.getResource("org/dcm4che3/media/RecordFactory.xml", getClass()));
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }

    public int[] setPrivateRecordKeys(String str, int[] iArr) {
        str.getClass();
        int[] iArr2 = (int[]) iArr.clone();
        Arrays.sort(iArr2);
        lazyLoadDefaultConfiguration();
        return this.privateRecordKeys.put(str, iArr2);
    }

    public String setPrivateRecordUID(String str, String str2) {
        if (str == null || str2 == null) {
            throw null;
        }
        lazyLoadDefaultConfiguration();
        return this.privateRecordUIDs.put(str, str2);
    }

    public void setRecordKeys(RecordType recordType, int[] iArr) {
        recordType.getClass();
        Arrays.sort((int[]) iArr.clone());
        lazyLoadDefaultConfiguration();
        this.recordKeys.put(recordType, iArr);
    }

    public RecordType setRecordType(String str, RecordType recordType) {
        if (str == null || recordType == null) {
            throw null;
        }
        lazyLoadDefaultConfiguration();
        return this.recordTypes.put(str, recordType);
    }

    public Attributes createRecord(RecordType recordType, String str, Attributes attributes, Attributes attributes2, String[] strArr) {
        int[] iArr;
        if (recordType == null) {
            throw new NullPointerException("type");
        }
        if (attributes == null) {
            throw new NullPointerException("dataset");
        }
        lazyLoadDefaultConfiguration();
        if (recordType == RecordType.PRIVATE) {
            if (str == null) {
                throw new NullPointerException("privRecUID must not be null for type = PRIVATE");
            }
            iArr = this.privateRecordKeys.get(str);
        } else {
            if (str != null) {
                throw new IllegalArgumentException("privRecUID must be null for type != PRIVATE");
            }
            iArr = null;
        }
        if (iArr == null) {
            iArr = this.recordKeys.get(recordType);
        }
        Attributes attributes3 = new Attributes(iArr.length + (strArr != null ? 9 : 5));
        VR vr = VR.UL;
        attributes3.setInt(Tag.OffsetOfTheNextDirectoryRecord, vr, 0);
        attributes3.setInt(Tag.RecordInUseFlag, VR.US, 65535);
        attributes3.setInt(Tag.OffsetOfReferencedLowerLevelDirectoryEntity, vr, 0);
        VR vr2 = VR.CS;
        attributes3.setString(Tag.DirectoryRecordType, vr2, recordType.code());
        if (str != null) {
            attributes3.setString(Tag.PrivateRecordUID, VR.UI, str);
        }
        if (strArr != null) {
            attributes3.setString(Tag.ReferencedFileID, vr2, strArr);
            VR vr3 = VR.UI;
            attributes3.setString(Tag.ReferencedSOPClassUIDInFile, vr3, attributes2.getString(Tag.MediaStorageSOPClassUID, (String) null));
            attributes3.setString(Tag.ReferencedSOPInstanceUIDInFile, vr3, attributes2.getString(Tag.MediaStorageSOPInstanceUID, (String) null));
            attributes3.setString(Tag.ReferencedTransferSyntaxUIDInFile, vr3, attributes2.getString(Tag.TransferSyntaxUID, (String) null));
        }
        attributes3.addSelected(attributes, iArr, 0, iArr.length);
        Sequence sequence = attributes.getSequence(Tag.ContentSequence);
        if (sequence != null) {
            copyConceptMod(sequence, attributes3);
        }
        return attributes3;
    }
}
