package org.dcm4che3.media;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import l0.a;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.Tag;
import org.dcm4che3.data.UID;
import org.dcm4che3.data.VR;
import org.dcm4che3.io.DicomEncodingOptions;
import org.dcm4che3.io.DicomOutputStream;
import org.dcm4che3.io.RAFOutputStreamAdapter;
import org.dcm4che3.util.ByteUtils;
import org.dcm4che3.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import z1.l1;

/* JADX INFO: loaded from: classes.dex */
public class DicomDirWriter extends DicomDirReader {
    private static final int INACTIVE = 0;
    private static final int IN_USE = 65535;
    private static final int KNOWN_INCONSISTENCIES = 65535;
    private static final int NO_KNOWN_INCONSISTENCIES = 0;
    private final byte[] dirInfoHeader;
    private final byte[] dirRecordHeader;
    private final ArrayList<Attributes> dirtyRecords;
    private final int firstRecordPos;
    private IdentityHashMap<Attributes, Attributes> lastChildRecords;
    private int nextRecordPos;
    private final DicomOutputStream out;
    private int rollbackLen;
    private static final Logger LOG = LoggerFactory.getLogger(DicomDirWriter.class);
    private static final Comparator<Attributes> offsetComparator = new Comparator<Attributes>() { // from class: org.dcm4che3.media.DicomDirWriter.1
        @Override // java.util.Comparator
        public int compare(Attributes attributes, Attributes attributes2) {
            long itemPosition = attributes.getItemPosition() - attributes2.getItemPosition();
            if (itemPosition < 0) {
                return -1;
            }
            return itemPosition > 0 ? 1 : 0;
        }
    };

    private DicomDirWriter(File file) throws IOException {
        super(file, "rw");
        this.dirInfoHeader = new byte[]{4, 0, 0, l1.f13564r, 85, 76, 4, 0, 0, 0, 0, 0, 4, 0, 2, l1.f13564r, 85, 76, 4, 0, 0, 0, 0, 0, 4, 0, l1.f13564r, l1.f13564r, 85, 83, 2, 0, 0, 0, 4, 0, 32, l1.f13564r, 83, 81, 0, 0, 0, 0, 0, 0};
        this.dirRecordHeader = new byte[]{4, 0, 0, 20, 85, 76, 4, 0, 0, 0, 0, 0, 4, 0, l1.f13562p, 20, 85, 83, 2, 0, 0, 0, 4, 0, 32, 20, 85, 76, 4, 0, 0, 0, 0, 0};
        this.rollbackLen = -1;
        this.lastChildRecords = new IdentityHashMap<>();
        this.dirtyRecords = new ArrayList<>();
        this.out = new DicomOutputStream(new RAFOutputStreamAdapter(this.raf), super.getTransferSyntaxUID());
        int length = this.in.length();
        boolean z3 = length <= 0;
        setEncodingOptions(new DicomEncodingOptions(false, z3, false, z3, false));
        int position = (int) this.in.getPosition();
        this.firstRecordPos = position;
        this.nextRecordPos = position;
        if (!isEmpty()) {
            if (length > 0) {
                this.nextRecordPos += length;
            } else {
                this.nextRecordPos = (int) (this.raf.length() - 12);
            }
        }
        updateDirInfoHeader();
    }

    private void addRecord(int i4, Attributes attributes, Attributes attributes2) throws IOException {
        attributes.setInt(i4, VR.UL, this.nextRecordPos);
        markAsDirty(attributes);
        writeRecord(this.nextRecordPos, attributes2);
    }

    public static void createEmptyDirectory(File file, String str, String str2, File file2, String str3) throws IOException {
        createEmptyDirectory(file, Attributes.createFileMetaInformation(str, UID.MediaStorageDirectoryStorage, UID.ExplicitVRLittleEndian), str2, file2, str3);
    }

    private static Attributes createFileSetInformation(File file, String str, File file2, String str2) {
        Attributes attributes = new Attributes(7);
        VR vr = VR.CS;
        attributes.setString(Tag.FileSetID, vr, str);
        if (file2 != null) {
            attributes.setString(Tag.FileSetDescriptorFileID, vr, toFileIDs(file, file2));
            if (str2 != null && !str2.isEmpty()) {
                attributes.setString(Tag.SpecificCharacterSetOfFileSetDescriptorFile, vr, str2);
            }
        }
        VR vr2 = VR.UL;
        attributes.setInt(Tag.OffsetOfTheFirstDirectoryRecordOfTheRootDirectoryEntity, vr2, 0);
        attributes.setInt(Tag.OffsetOfTheLastDirectoryRecordOfTheRootDirectoryEntity, vr2, 0);
        attributes.setInt(Tag.FileSetConsistencyFlag, VR.US, 0);
        attributes.setNull(Tag.DirectoryRecordSequence, VR.SQ);
        return attributes;
    }

    private void markAsDirty(Attributes attributes) {
        int iBinarySearch = Collections.binarySearch(this.dirtyRecords, attributes, offsetComparator);
        if (iBinarySearch < 0) {
            this.dirtyRecords.add(-(iBinarySearch + 1), attributes);
        }
    }

    public static DicomDirWriter open(File file) throws IOException {
        if (file.isFile()) {
            return new DicomDirWriter(file);
        }
        throw new FileNotFoundException();
    }

    private void restoreDirInfo() {
        setOffsetOfFirstRootDirectoryRecord(ByteUtils.bytesToIntLE(this.dirInfoHeader, 8));
        setOffsetOfLastRootDirectoryRecord(ByteUtils.bytesToIntLE(this.dirInfoHeader, 20));
    }

    private void updateDirInfoHeader() {
        ByteUtils.intToBytesLE(getOffsetOfFirstRootDirectoryRecord(), this.dirInfoHeader, 8);
        ByteUtils.intToBytesLE(getOffsetOfLastRootDirectoryRecord(), this.dirInfoHeader, 20);
        ByteUtils.intToBytesLE(getEncodingOptions().undefSequenceLength ? -1 : this.nextRecordPos - this.firstRecordPos, this.dirInfoHeader, 42);
    }

    private void writeDirInfoHeader() throws IOException {
        updateDirInfoHeader();
        this.raf.seek(this.firstRecordPos - this.dirInfoHeader.length);
        this.raf.write(this.dirInfoHeader);
    }

    private void writeDirRecordHeader(Attributes attributes) throws IOException {
        ByteUtils.intToBytesLE(attributes.getInt(Tag.OffsetOfTheNextDirectoryRecord, 0), this.dirRecordHeader, 8);
        ByteUtils.shortToBytesLE(attributes.getInt(Tag.RecordInUseFlag, 0), this.dirRecordHeader, 20);
        ByteUtils.intToBytesLE(attributes.getInt(Tag.OffsetOfReferencedLowerLevelDirectoryEntity, 0), this.dirRecordHeader, 30);
        this.raf.seek(attributes.getItemPosition() + 8);
        this.raf.write(this.dirRecordHeader);
    }

    private void writeFileSetConsistencyFlag(int i4) throws IOException {
        this.raf.seek(this.firstRecordPos - 14);
        this.raf.writeShort(i4);
        setFileSetConsistencyFlag(i4);
    }

    private void writeRecord(int i4, Attributes attributes) throws IOException {
        Logger logger = LOG;
        if (logger.isInfoEnabled()) {
            logger.info("M-UPDATE {}: add {} Record", this.file, attributes.getString(Tag.DirectoryRecordType, (String) null));
        }
        logger.debug("Directory Record:\n{}", attributes);
        long j4 = i4;
        attributes.setItemPosition(j4);
        if (this.rollbackLen == -1) {
            this.rollbackLen = i4;
            writeFileSetConsistencyFlag(a.f8427a);
        }
        this.raf.seek(j4);
        VR vr = VR.UL;
        attributes.setInt(Tag.OffsetOfTheNextDirectoryRecord, vr, 0);
        attributes.setInt(Tag.RecordInUseFlag, VR.US, a.f8427a);
        attributes.setInt(Tag.OffsetOfReferencedLowerLevelDirectoryEntity, vr, 0);
        attributes.writeItemTo(this.out);
        this.nextRecordPos = (int) this.raf.getFilePointer();
        this.cache.put(i4, attributes);
    }

    private void writeSequenceDelimitationItem() throws IOException {
        this.raf.seek(this.nextRecordPos);
        this.out.writeHeader(Tag.SequenceDelimitationItem, null, 0);
    }

    public synchronized Attributes addLowerDirectoryRecord(Attributes attributes, Attributes attributes2) throws IOException {
        Attributes attributesFindLastLowerDirectoryRecord = this.lastChildRecords.get(attributes);
        if (attributesFindLastLowerDirectoryRecord == null) {
            attributesFindLastLowerDirectoryRecord = findLastLowerDirectoryRecord(attributes);
        }
        if (attributesFindLastLowerDirectoryRecord != null) {
            addRecord(Tag.OffsetOfTheNextDirectoryRecord, attributesFindLastLowerDirectoryRecord, attributes2);
        } else {
            addRecord(Tag.OffsetOfReferencedLowerLevelDirectoryEntity, attributes, attributes2);
        }
        this.lastChildRecords.put(attributes, attributes2);
        return attributes2;
    }

    public synchronized Attributes addRootDirectoryRecord(Attributes attributes) throws IOException {
        Attributes lastRootDirectoryRecord = readLastRootDirectoryRecord();
        if (lastRootDirectoryRecord == null) {
            writeRecord(this.firstRecordPos, attributes);
            setOffsetOfFirstRootDirectoryRecord(this.firstRecordPos);
        } else {
            addRecord(Tag.OffsetOfTheNextDirectoryRecord, lastRootDirectoryRecord, attributes);
        }
        setOffsetOfLastRootDirectoryRecord((int) attributes.getItemPosition());
        return attributes;
    }

    @Override // org.dcm4che3.media.DicomDirReader
    public void clearCache() {
        this.lastChildRecords.clear();
        super.clearCache();
    }

    @Override // org.dcm4che3.media.DicomDirReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        commit();
        super.close();
    }

    public synchronized void commit() throws IOException {
        if (this.dirtyRecords.isEmpty()) {
            return;
        }
        if (this.rollbackLen == -1) {
            writeFileSetConsistencyFlag(a.f8427a);
        }
        Iterator<Attributes> it = this.dirtyRecords.iterator();
        while (it.hasNext()) {
            writeDirRecordHeader(it.next());
        }
        this.dirtyRecords.clear();
        if (this.rollbackLen != -1 && getEncodingOptions().undefSequenceLength) {
            writeSequenceDelimitationItem();
        }
        writeDirInfoHeader();
        this.rollbackLen = -1;
    }

    public synchronized boolean deleteRecord(Attributes attributes) throws IOException {
        if (attributes.getInt(Tag.RecordInUseFlag, 0) == 0) {
            return false;
        }
        Attributes lowerDirectoryRecord = readLowerDirectoryRecord(attributes);
        while (lowerDirectoryRecord != null) {
            deleteRecord(lowerDirectoryRecord);
            lowerDirectoryRecord = readNextDirectoryRecord(lowerDirectoryRecord);
        }
        attributes.setInt(Tag.RecordInUseFlag, VR.US, 0);
        markAsDirty(attributes);
        return true;
    }

    public synchronized Attributes findOrAddPatientRecord(Attributes attributes) throws IOException {
        Attributes attributesFindPatientRecord;
        attributesFindPatientRecord = super.findPatientRecord(attributes.getString(Tag.PatientID));
        if (attributesFindPatientRecord == null) {
            attributesFindPatientRecord = addRootDirectoryRecord(attributes);
        }
        return attributesFindPatientRecord;
    }

    public synchronized Attributes findOrAddSeriesRecord(Attributes attributes, Attributes attributes2) throws IOException {
        Attributes attributesFindSeriesRecord;
        attributesFindSeriesRecord = super.findSeriesRecord(attributes, attributes2.getString(Tag.SeriesInstanceUID));
        if (attributesFindSeriesRecord == null) {
            attributesFindSeriesRecord = addLowerDirectoryRecord(attributes, attributes2);
        }
        return attributesFindSeriesRecord;
    }

    public synchronized Attributes findOrAddStudyRecord(Attributes attributes, Attributes attributes2) throws IOException {
        Attributes attributesFindStudyRecord;
        attributesFindStudyRecord = super.findStudyRecord(attributes, attributes2.getString(Tag.StudyInstanceUID));
        if (attributesFindStudyRecord == null) {
            attributesFindStudyRecord = addLowerDirectoryRecord(attributes, attributes2);
        }
        return attributesFindStudyRecord;
    }

    public DicomEncodingOptions getEncodingOptions() {
        return this.out.getEncodingOptions();
    }

    public synchronized int purge() throws IOException {
        int[] iArr;
        iArr = new int[]{0};
        purge(findFirstRootDirectoryRecordInUse(false), iArr);
        return iArr[0];
    }

    public synchronized void rollback() throws IOException {
        if (this.dirtyRecords.isEmpty()) {
            return;
        }
        clearCache();
        this.dirtyRecords.clear();
        if (this.rollbackLen != -1) {
            restoreDirInfo();
            this.nextRecordPos = this.rollbackLen;
            if (getEncodingOptions().undefSequenceLength) {
                writeSequenceDelimitationItem();
                RandomAccessFile randomAccessFile = this.raf;
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
            } else {
                this.raf.setLength(this.rollbackLen);
            }
            writeFileSetConsistencyFlag(0);
            this.rollbackLen = -1;
        }
    }

    public void setEncodingOptions(DicomEncodingOptions dicomEncodingOptions) {
        this.out.setEncodingOptions(dicomEncodingOptions);
    }

    public String[] toFileIDs(File file) {
        return toFileIDs(this.file, file);
    }

    public static void createEmptyDirectory(File file, Attributes attributes, String str, File file2, String str2) throws IOException {
        Attributes attributesCreateFileSetInformation = createFileSetInformation(file, str, file2, str2);
        DicomOutputStream dicomOutputStream = new DicomOutputStream(file);
        try {
            dicomOutputStream.writeDataset(attributes, attributesCreateFileSetInformation);
        } finally {
            dicomOutputStream.close();
        }
    }

    private boolean purge(Attributes attributes, int[] iArr) throws IOException {
        boolean z3 = true;
        while (attributes != null) {
            if (!purge(findLowerDirectoryRecordInUse(attributes, false), iArr) || attributes.containsValue(Tag.ReferencedFileID)) {
                z3 = false;
            } else {
                deleteRecord(attributes);
                iArr[0] = iArr[0] + 1;
            }
            attributes = readNextDirectoryRecord(attributes);
        }
        return z3;
    }

    private static String[] toFileIDs(File file, File file2) {
        String absolutePath = file.getAbsolutePath();
        int iLastIndexOf = absolutePath.lastIndexOf(File.separatorChar) + 1;
        String strSubstring = absolutePath.substring(0, iLastIndexOf);
        String absolutePath2 = file2.getAbsolutePath();
        if (iLastIndexOf != 0 && absolutePath2.startsWith(strSubstring)) {
            return StringUtils.split(absolutePath2.substring(iLastIndexOf), File.separatorChar);
        }
        throw new IllegalArgumentException("file: " + absolutePath2 + " not in directory: " + file.getAbsoluteFile());
    }
}
