package org.dcm4che3.media;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.Tag;
import org.dcm4che3.data.VR;
import org.dcm4che3.io.DicomInputStream;
import org.dcm4che3.io.RAFInputStreamAdapter;
import org.dcm4che3.util.IntHashMap;
import org.dcm4che3.util.SafeClose;
import org.dcm4che3.util.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class DicomDirReader implements Closeable {
    protected final IntHashMap<Attributes> cache;
    protected final File file;
    protected final Attributes fmi;
    protected final Attributes fsInfo;
    protected final DicomInputStream in;
    protected final RandomAccessFile raf;

    public DicomDirReader(File file) throws IOException {
        this(file, "r");
    }

    private Attributes findRecordInUse(int i4, boolean z3, Attributes attributes, boolean z4, boolean z5) throws IOException {
        while (i4 != 0) {
            Attributes record = readRecord(i4);
            if (inUse(record) && ((!z3 || !isPrivate(record)) && (attributes == null || record.matches(attributes, z4, z5)))) {
                return record;
            }
            i4 = record.getInt(Tag.OffsetOfTheNextDirectoryRecord, 0);
        }
        return null;
    }

    public static boolean inUse(Attributes attributes) {
        return attributes.getInt(Tag.RecordInUseFlag, 0) != 0;
    }

    public static boolean isPrivate(Attributes attributes) {
        return "PRIVATE".equals(attributes.getString(Tag.DirectoryRecordType));
    }

    private Attributes keys(Attributes attributes, RecordFactory recordFactory) {
        int[] recordKeys = recordFactory.getRecordKeys(RecordType.SR_DOCUMENT);
        Attributes attributes2 = new Attributes(recordKeys.length + 1);
        String[] strings = attributes2.getStrings(Tag.SOPInstanceUID);
        if (strings != null && strings.length > 0) {
            attributes2.setString(Tag.ReferencedSOPInstanceUIDInFile, VR.CS, strings);
        }
        attributes2.addSelected(attributes, recordKeys);
        return attributes2;
    }

    private Attributes pk(String str, int i4, VR vr, String... strArr) {
        Attributes attributes = new Attributes(2);
        attributes.setString(Tag.DirectoryRecordType, VR.CS, str);
        if (strArr != null && strArr.length != 0) {
            attributes.setString(i4, vr, strArr);
        }
        return attributes;
    }

    private synchronized Attributes readRecord(int i4) throws IOException {
        if (i4 == 0) {
            return null;
        }
        Attributes item = this.cache.get(i4);
        if (item == null) {
            long j4 = ((long) i4) & 4294967295L;
            this.raf.seek(j4);
            this.in.setPosition(j4);
            item = this.in.readItem();
            this.cache.put(i4, item);
        }
        return item;
    }

    public void clearCache() {
        this.cache.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.raf.close();
    }

    public Attributes findFirstRootDirectoryRecordInUse(boolean z3) throws IOException {
        return findRootDirectoryRecord(z3, (Attributes) null, false, false);
    }

    public Attributes findLastLowerDirectoryRecord(Attributes attributes) throws IOException {
        Attributes lowerDirectoryRecord = readLowerDirectoryRecord(attributes);
        if (lowerDirectoryRecord == null) {
            return null;
        }
        while (true) {
            Attributes nextDirectoryRecord = readNextDirectoryRecord(lowerDirectoryRecord);
            if (nextDirectoryRecord == null) {
                return lowerDirectoryRecord;
            }
            lowerDirectoryRecord = nextDirectoryRecord;
        }
    }

    public Attributes findLowerDirectoryRecord(Attributes attributes, boolean z3, Attributes attributes2, boolean z4, boolean z5) throws IOException {
        return findRecordInUse(attributes.getInt(Tag.OffsetOfReferencedLowerLevelDirectoryEntity, 0), z3, attributes2, z4, z5);
    }

    public Attributes findLowerDirectoryRecordInUse(Attributes attributes, boolean z3) throws IOException {
        return findLowerDirectoryRecord(attributes, z3, null, false, false);
    }

    public Attributes findLowerInstanceRecord(Attributes attributes, Attributes attributes2, RecordFactory recordFactory, boolean z3, boolean z4) throws IOException {
        return findLowerDirectoryRecord(attributes, false, keys(attributes2, recordFactory), z3, z4);
    }

    public Attributes findNextDirectoryRecord(Attributes attributes, boolean z3, Attributes attributes2, boolean z4, boolean z5) throws IOException {
        return findRecordInUse(attributes.getInt(Tag.OffsetOfTheNextDirectoryRecord, 0), z3, attributes2, z4, z5);
    }

    public Attributes findNextDirectoryRecordInUse(Attributes attributes, boolean z3) throws IOException {
        return findNextDirectoryRecord(attributes, z3, null, false, false);
    }

    public Attributes findNextInstanceRecord(Attributes attributes, Attributes attributes2, RecordFactory recordFactory, boolean z3, boolean z4) throws IOException {
        return findNextDirectoryRecord(attributes, false, keys(attributes2, recordFactory), z3, z4);
    }

    public Attributes findNextPatientRecord(Attributes attributes, Attributes attributes2, RecordFactory recordFactory, boolean z3, boolean z4) throws IOException {
        return findNextDirectoryRecord(attributes, false, keys(RecordType.PATIENT, attributes2, recordFactory), z3, z4);
    }

    public Attributes findNextSeriesRecord(Attributes attributes, Attributes attributes2, RecordFactory recordFactory, boolean z3, boolean z4) throws IOException {
        return findNextDirectoryRecord(attributes, false, keys(RecordType.SERIES, attributes2, recordFactory), z3, z4);
    }

    public Attributes findNextStudyRecord(Attributes attributes, Attributes attributes2, RecordFactory recordFactory, boolean z3, boolean z4) throws IOException {
        return findNextDirectoryRecord(attributes, false, keys(RecordType.STUDY, attributes2, recordFactory), z3, z4);
    }

    public Attributes findPatientRecord(Attributes attributes, RecordFactory recordFactory, boolean z3, boolean z4) throws IOException {
        return findRootDirectoryRecord(false, keys(RecordType.PATIENT, attributes, recordFactory), z3, z4);
    }

    public Attributes findRootDirectoryRecord(Attributes attributes, boolean z3, boolean z4, boolean z5) throws IOException {
        return findRecordInUse(getOffsetOfFirstRootDirectoryRecord(), z3, attributes, z4, z5);
    }

    public Attributes findRootInstanceRecord(boolean z3, String... strArr) throws IOException {
        return findRootDirectoryRecord(z3, pk(strArr), false, false);
    }

    public Attributes findSeriesRecord(Attributes attributes, Attributes attributes2, RecordFactory recordFactory, boolean z3, boolean z4) throws IOException {
        return findLowerDirectoryRecord(attributes, false, keys(RecordType.SERIES, attributes2, recordFactory), z3, z4);
    }

    public Attributes findStudyRecord(Attributes attributes, Attributes attributes2, RecordFactory recordFactory, boolean z3, boolean z4) throws IOException {
        return findLowerDirectoryRecord(attributes, false, keys(RecordType.STUDY, attributes2, recordFactory), z3, z4);
    }

    public File getDescriptorFile() {
        return toFile(this.fsInfo.getStrings(Tag.FileSetDescriptorFileID));
    }

    public String getDescriptorFileCharacterSet() {
        return this.fsInfo.getString(Tag.SpecificCharacterSetOfFileSetDescriptorFile, (String) null);
    }

    public final File getFile() {
        return this.file;
    }

    public final Attributes getFileMetaInformation() {
        return this.fmi;
    }

    public int getFileSetConsistencyFlag() {
        return this.fsInfo.getInt(Tag.FileSetConsistencyFlag, 0);
    }

    public String getFileSetID() {
        return this.fsInfo.getString(Tag.FileSetID, (String) null);
    }

    public final Attributes getFileSetInformation() {
        return this.fsInfo;
    }

    public String getFileSetUID() {
        return this.fmi.getString(Tag.MediaStorageSOPInstanceUID, (String) null);
    }

    public int getOffsetOfFirstRootDirectoryRecord() {
        return this.fsInfo.getInt(Tag.OffsetOfTheFirstDirectoryRecordOfTheRootDirectoryEntity, 0);
    }

    public int getOffsetOfLastRootDirectoryRecord() {
        return this.fsInfo.getInt(Tag.OffsetOfTheLastDirectoryRecordOfTheRootDirectoryEntity, 0);
    }

    public String getTransferSyntaxUID() {
        return this.fmi.getString(Tag.TransferSyntaxUID, (String) null);
    }

    public boolean isEmpty() {
        return getOffsetOfFirstRootDirectoryRecord() == 0;
    }

    public boolean knownInconsistencies() {
        return getFileSetConsistencyFlag() != 0;
    }

    public Attributes readFirstRootDirectoryRecord() throws IOException {
        return readRecord(getOffsetOfFirstRootDirectoryRecord());
    }

    public Attributes readLastRootDirectoryRecord() throws IOException {
        return readRecord(getOffsetOfLastRootDirectoryRecord());
    }

    public Attributes readLowerDirectoryRecord(Attributes attributes) throws IOException {
        return readRecord(attributes.getInt(Tag.OffsetOfReferencedLowerLevelDirectoryEntity, 0));
    }

    public Attributes readNextDirectoryRecord(Attributes attributes) throws IOException {
        return readRecord(attributes.getInt(Tag.OffsetOfTheNextDirectoryRecord, 0));
    }

    public void setFileSetConsistencyFlag(int i4) {
        this.fsInfo.setInt(Tag.FileSetConsistencyFlag, VR.US, i4);
    }

    public void setOffsetOfFirstRootDirectoryRecord(int i4) {
        this.fsInfo.setInt(Tag.OffsetOfTheFirstDirectoryRecordOfTheRootDirectoryEntity, VR.UL, i4);
    }

    public void setOffsetOfLastRootDirectoryRecord(int i4) {
        this.fsInfo.setInt(Tag.OffsetOfTheLastDirectoryRecordOfTheRootDirectoryEntity, VR.UL, i4);
    }

    public File toFile(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return new File(this.file.getParent(), StringUtils.concat(strArr, File.separatorChar));
    }

    public DicomDirReader(File file, String str) throws IOException {
        this.cache = new IntHashMap<>();
        this.file = file;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, str);
        this.raf = randomAccessFile;
        try {
            DicomInputStream dicomInputStream = new DicomInputStream(new RAFInputStreamAdapter(randomAccessFile));
            this.in = dicomInputStream;
            this.fmi = dicomInputStream.readFileMetaInformation();
            this.fsInfo = dicomInputStream.readDataset(-1, Tag.DirectoryRecordSequence);
            if (dicomInputStream.tag() == 266784) {
            } else {
                throw new IOException("Missing Directory Record Sequence");
            }
        } catch (IOException e4) {
            SafeClose.close(this.raf);
            throw e4;
        }
    }

    private Attributes keys(RecordType recordType, Attributes attributes, RecordFactory recordFactory) {
        int[] recordKeys = recordFactory.getRecordKeys(recordType);
        Attributes attributes2 = new Attributes(recordKeys.length + 1);
        attributes2.setString(Tag.DirectoryRecordType, VR.CS, recordType.name());
        attributes2.addSelected(attributes, recordKeys);
        return attributes2;
    }

    private Attributes pk(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        Attributes attributes = new Attributes(1);
        attributes.setString(Tag.ReferencedSOPInstanceUIDInFile, VR.UI, strArr);
        return attributes;
    }

    public Attributes findLowerInstanceRecord(Attributes attributes, boolean z3, String... strArr) throws IOException {
        return findLowerDirectoryRecord(attributes, z3, pk(strArr), false, false);
    }

    public Attributes findNextInstanceRecord(Attributes attributes, boolean z3, String... strArr) throws IOException {
        return findNextDirectoryRecord(attributes, z3, pk(strArr), false, false);
    }

    public Attributes findNextPatientRecord(Attributes attributes, String... strArr) throws IOException {
        return findNextDirectoryRecord(attributes, false, pk("PATIENT", Tag.PatientID, VR.LO, strArr), false, false);
    }

    public Attributes findNextSeriesRecord(Attributes attributes, String... strArr) throws IOException {
        return findNextDirectoryRecord(attributes, false, pk("SERIES", Tag.SeriesInstanceUID, VR.UI, strArr), false, false);
    }

    public Attributes findNextStudyRecord(Attributes attributes, String... strArr) throws IOException {
        return findNextDirectoryRecord(attributes, false, pk("STUDY", Tag.StudyInstanceUID, VR.UI, strArr), false, false);
    }

    public Attributes findPatientRecord(String... strArr) throws IOException {
        return findRootDirectoryRecord(false, pk("PATIENT", Tag.PatientID, VR.LO, strArr), false, false);
    }

    public Attributes findRootDirectoryRecord(boolean z3, Attributes attributes, boolean z4, boolean z5) throws IOException {
        return findRootDirectoryRecord(attributes, z3, z4, z5);
    }

    public Attributes findSeriesRecord(Attributes attributes, String... strArr) throws IOException {
        return findLowerDirectoryRecord(attributes, false, pk("SERIES", Tag.SeriesInstanceUID, VR.UI, strArr), false, false);
    }

    public Attributes findStudyRecord(Attributes attributes, String... strArr) throws IOException {
        return findLowerDirectoryRecord(attributes, false, pk("STUDY", Tag.StudyInstanceUID, VR.UI, strArr), false, false);
    }
}
