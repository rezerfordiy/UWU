package org.dcm4che3.io;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.BulkData;
import org.dcm4che3.data.ElementDictionary;
import org.dcm4che3.data.Fragments;
import org.dcm4che3.data.ItemPointer;
import org.dcm4che3.data.Sequence;
import org.dcm4che3.data.Tag;
import org.dcm4che3.data.UID;
import org.dcm4che3.data.VR;
import org.dcm4che3.util.ByteUtils;
import org.dcm4che3.util.SafeClose;
import org.dcm4che3.util.StreamUtils;
import org.dcm4che3.util.TagUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public class DicomInputStream extends FilterInputStream implements DicomInputHandler, BulkDataCreator {
    private static final int BYTE_BUF_LENGTH = 8192;
    private static final String DEFLATED_WITH_ZLIB_HEADER = "Deflated DICOM Stream with ZLIB Header";
    private static final int DEF_ALLOCATE_LIMIT = 67108864;
    private static final String IMPLICIT_VR_BIG_ENDIAN = "Implicit VR Big Endian encoded DICOM Stream";
    private static final Logger LOG = LoggerFactory.getLogger(DicomInputStream.class);
    private static final String MISSING_FMI_LENGTH = "Missing or wrong File Meta Information Group Length (0002,0000)";
    private static final String MISSING_TRANSFER_SYNTAX = "Missing Transfer Syntax (0002,0010) - assume Explicit VR Little Endian";
    private static final String NOT_A_DICOM_STREAM = "Not a DICOM Stream";
    private static final String UNEXPECTED_ATTRIBUTE = "Unexpected attribute {} #{} @ {}";
    private static final String UNEXPECTED_NON_ZERO_ITEM_LENGTH = "Unexpected item value of {} #{} @ {}";
    private static final int ZLIB_HEADER = 30876;
    private int allocateLimit;
    private boolean bigEndian;
    private File blkDirectory;
    private String blkFilePrefix;
    private String blkFileSuffix;
    private ArrayList<File> blkFiles;
    private FileOutputStream blkOut;
    private long blkOutPos;
    private String blkURI;
    private final byte[] buffer;
    private BulkDataCreator bulkDataCreator;
    private BulkDataDescriptor bulkDataDescriptor;
    private byte[] byteBuf;
    private boolean catBlkFiles;
    private boolean decodeUNWithIVRLE;
    private boolean excludeBulkData;
    private boolean explicitVR;
    private Attributes fileMetaInformation;
    private long fmiEndPos;
    private DicomInputHandler handler;
    private boolean hasfmi;
    private IncludeBulkData includeBulkData;
    private boolean includeBulkDataURI;
    private List<ItemPointer> itemPointers;
    private int length;
    private long markPos;
    private long pos;
    private byte[] preamble;
    private int tag;
    private long tagPos;
    private String tsuid;
    private String uri;
    private VR vr;

    public enum IncludeBulkData {
        NO,
        YES,
        URI
    }

    public DicomInputStream(File file) throws IOException {
        this(new FileInputStream(file));
        this.uri = file.toURI().toString();
    }

    private void addItemPointer(int i4, String str, int i5) {
        this.itemPointers.add(new ItemPointer(i4, str, i5));
    }

    private void checkIsThis(DicomInputStream dicomInputStream) {
        if (dicomInputStream != this) {
            throw new IllegalArgumentException("dis != this");
        }
    }

    private void guessTransferSyntax() throws IOException {
        byte[] bArr = new byte[132];
        mark(132);
        int available = StreamUtils.readAvailable(this, bArr, 0, 132);
        if (available == 132 && bArr[128] == 68 && bArr[129] == 73 && bArr[130] == 67 && bArr[131] == 77) {
            byte[] bArr2 = new byte[128];
            this.preamble = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, 128);
            if (!markSupported()) {
                this.hasfmi = true;
                this.tsuid = UID.ExplicitVRLittleEndian;
                this.bigEndian = false;
                this.explicitVR = true;
                return;
            }
            mark(132);
            available = StreamUtils.readAvailable(this, bArr, 0, 132);
        }
        if (available < 8 || !(guessTransferSyntax(bArr, available, false) || guessTransferSyntax(bArr, available, true))) {
            throw new DicomStreamException(NOT_A_DICOM_STREAM);
        }
        reset();
        this.hasfmi = TagUtils.isFileMetaInformation(ByteUtils.bytesToTag(bArr, 0, this.bigEndian));
    }

    private boolean hasZLIBHeader() throws IOException {
        if (!markSupported()) {
            return false;
        }
        byte[] bArr = this.buffer;
        mark(2);
        read(bArr, 0, 2);
        reset();
        return ByteUtils.bytesToUShortBE(bArr, 0) == ZLIB_HEADER;
    }

    private boolean isBulkData(Attributes attributes) {
        return this.bulkDataDescriptor.isBulkData(this.itemPointers, attributes.getPrivateCreator(this.tag), this.tag, this.vr, this.length);
    }

    private void readFragments(Attributes attributes, int i4, VR vr) throws IOException {
        Fragments fragments = new Fragments(vr, attributes.bigEndian(), 10);
        String privateCreator = attributes.getPrivateCreator(i4);
        int i5 = 0;
        while (readItemHeader()) {
            addItemPointer(i4, privateCreator, i5);
            this.handler.readValue(this, fragments);
            removeItemPointer();
            i5++;
        }
        if (fragments.isEmpty()) {
            attributes.setNull(i4, vr);
        } else {
            fragments.trimToSize();
            attributes.setValue(i4, vr, fragments);
        }
    }

    private void readSequence(int i4, Attributes attributes, int i5) throws IOException {
        if (i4 == 0) {
            attributes.setNull(i5, VR.SQ);
            return;
        }
        Sequence sequenceNewSequence = attributes.newSequence(i5, 10);
        String privateCreator = attributes.getPrivateCreator(i5);
        int i6 = 0;
        boolean z3 = i4 == -1;
        long j4 = this.pos + (((long) i4) & 4294967295L);
        while (true) {
            if ((!z3 && this.pos >= j4) || !readItemHeader()) {
                break;
            }
            addItemPointer(i5, privateCreator, i6);
            this.handler.readValue(this, sequenceNewSequence);
            removeItemPointer();
            i6++;
        }
        if (sequenceNewSequence.isEmpty()) {
            attributes.setNull(i5, VR.SQ);
        } else {
            sequenceNewSequence.trimToSize();
        }
    }

    private void removeItemPointer() {
        this.itemPointers.remove(r0.size() - 1);
    }

    private void skipAttribute(String str) throws IOException {
        LOG.warn(str, TagUtils.toString(this.tag), Integer.valueOf(this.length), Long.valueOf(this.tagPos));
        skip(this.length);
    }

    private void switchTransferSyntax(String str) throws IOException {
        InflaterInputStream inflaterInputStream;
        this.tsuid = str;
        this.bigEndian = str.equals(UID.ExplicitVRBigEndianRetired);
        this.explicitVR = !str.equals(UID.ImplicitVRLittleEndian);
        if (str.equals(UID.DeflatedExplicitVRLittleEndian) || str.equals(UID.JPIPReferencedDeflate)) {
            if (hasZLIBHeader()) {
                LOG.warn(DEFLATED_WITH_ZLIB_HEADER);
                inflaterInputStream = new InflaterInputStream(((FilterInputStream) this).in);
            } else {
                inflaterInputStream = new InflaterInputStream(((FilterInputStream) this).in, new Inflater(true));
            }
            ((FilterInputStream) this).in = inflaterInputStream;
        }
    }

    public static String toAttributePath(List<ItemPointer> list, int i4) {
        StringBuilder sb = new StringBuilder();
        for (ItemPointer itemPointer : list) {
            sb.append('/');
            sb.append(TagUtils.toHexString(itemPointer.sequenceTag));
            sb.append('/');
            sb.append(itemPointer.itemIndex);
        }
        sb.append('/');
        sb.append(TagUtils.toHexString(i4));
        return sb.toString();
    }

    public final boolean bigEndian() {
        return this.bigEndian;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SafeClose.close(this.blkOut);
        super.close();
    }

    @Override // org.dcm4che3.io.BulkDataCreator
    public BulkData createBulkData(DicomInputStream dicomInputStream) throws IOException {
        if (this.uri != null && !(((FilterInputStream) this).in instanceof InflaterInputStream)) {
            BulkData bulkData = new BulkData(this.uri, this.pos, this.length, this.bigEndian);
            skipFully(this.length);
            return bulkData;
        }
        if (this.blkOut == null) {
            File fileCreateTempFile = File.createTempFile(this.blkFilePrefix, this.blkFileSuffix, this.blkDirectory);
            if (this.blkFiles == null) {
                this.blkFiles = new ArrayList<>();
            }
            this.blkFiles.add(fileCreateTempFile);
            this.blkURI = fileCreateTempFile.toURI().toString();
            this.blkOut = new FileOutputStream(fileCreateTempFile);
            this.blkOutPos = 0L;
        }
        try {
            StreamUtils.copy(this, this.blkOut, this.length);
            BulkData bulkData2 = new BulkData(this.blkURI, this.blkOutPos, this.length, this.bigEndian);
            this.blkOutPos += (long) this.length;
            return bulkData2;
        } finally {
            if (!this.catBlkFiles) {
                SafeClose.close(this.blkOut);
                this.blkOut = null;
            }
        }
    }

    @Override // org.dcm4che3.io.DicomInputHandler
    public void endDataset(DicomInputStream dicomInputStream) {
    }

    public final boolean explicitVR() {
        return this.explicitVR;
    }

    public final int getAllocateLimit() {
        return this.allocateLimit;
    }

    public String getAttributePath() {
        return toAttributePath(this.itemPointers, this.tag);
    }

    public final BulkDataDescriptor getBulkDataDescriptor() {
        return this.bulkDataDescriptor;
    }

    public final File getBulkDataDirectory() {
        return this.blkDirectory;
    }

    public final String getBulkDataFilePrefix() {
        return this.blkFilePrefix;
    }

    public final String getBulkDataFileSuffix() {
        return this.blkFileSuffix;
    }

    public final List<File> getBulkDataFiles() {
        ArrayList<File> arrayList = this.blkFiles;
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    public Attributes getFileMetaInformation() throws IOException {
        readFileMetaInformation();
        return this.fileMetaInformation;
    }

    public final IncludeBulkData getIncludeBulkData() {
        return this.includeBulkData;
    }

    public final long getPosition() {
        return this.pos;
    }

    public final byte[] getPreamble() {
        return this.preamble;
    }

    public long getTagPosition() {
        return this.tagPos;
    }

    public final String getTransferSyntax() {
        return this.tsuid;
    }

    public final String getURI() {
        return this.uri;
    }

    public final boolean isConcatenateBulkDataFiles() {
        return this.catBlkFiles;
    }

    public boolean isDecodeUNWithIVRLE() {
        return this.decodeUNWithIVRLE;
    }

    public boolean isExcludeBulkData() {
        return this.excludeBulkData;
    }

    public boolean isIncludeBulkDataURI() {
        return this.includeBulkDataURI;
    }

    public final int length() {
        return this.length;
    }

    public final int level() {
        return this.itemPointers.size();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i4) {
        super.mark(i4);
        this.markPos = this.pos;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i4 = super.read();
        if (i4 >= 0) {
            this.pos++;
        }
        return i4;
    }

    public void readAttributes(Attributes attributes, int i4, int i5) throws IOException {
        boolean z3 = i4 == -1;
        boolean z4 = i5 != -1;
        long j4 = this.pos + (((long) i4) & 4294967295L);
        while (true) {
            if (!z3 && this.pos >= j4) {
                return;
            }
            try {
                readHeader();
                if (z4 && this.tag == i5) {
                    return;
                }
                VR vr = this.vr;
                if (vr != null) {
                    boolean z5 = this.bigEndian;
                    boolean z6 = this.explicitVR;
                    try {
                        VR vr2 = VR.UN;
                        if (vr == vr2) {
                            if (this.decodeUNWithIVRLE) {
                                this.bigEndian = false;
                                this.explicitVR = false;
                            }
                            int i6 = this.tag;
                            VR vrVrOf = ElementDictionary.vrOf(i6, attributes.getPrivateCreator(i6));
                            this.vr = vrVrOf;
                            if (vrVrOf == vr2 && this.length == -1) {
                                this.vr = VR.SQ;
                            }
                        }
                        this.excludeBulkData = this.includeBulkData == IncludeBulkData.NO && isBulkData(attributes);
                        this.includeBulkDataURI = this.includeBulkData == IncludeBulkData.URI && isBulkData(attributes);
                        this.handler.readValue(this, attributes);
                    } finally {
                        this.bigEndian = z5;
                        this.explicitVR = z6;
                    }
                } else {
                    skipAttribute(UNEXPECTED_ATTRIBUTE);
                }
            } catch (EOFException e4) {
                if (!z3 || this.pos != this.tagPos) {
                    throw e4;
                }
                return;
            }
        }
    }

    public Attributes readCommand() throws IOException {
        if (!this.bigEndian && !this.explicitVR) {
            Attributes attributes = new Attributes(9);
            readAttributes(attributes, -1, -1);
            return attributes;
        }
        throw new IllegalStateException("bigEndian=" + this.bigEndian + ", explicitVR=" + this.explicitVR);
    }

    public Attributes readDataset(int i4, int i5) throws IOException {
        this.handler.startDataset(this);
        readFileMetaInformation();
        Attributes attributes = new Attributes(this.bigEndian, 64);
        readAttributes(attributes, i4, i5);
        attributes.trimToSize();
        this.handler.endDataset(this);
        return attributes;
    }

    public Attributes readFileMetaInformation() throws IOException {
        if (!this.hasfmi) {
            return null;
        }
        Attributes attributes = this.fileMetaInformation;
        if (attributes != null) {
            return attributes;
        }
        Attributes attributes2 = new Attributes(this.bigEndian, 9);
        while (true) {
            if (this.pos == this.fmiEndPos) {
                break;
            }
            mark(12);
            readHeader();
            if (TagUtils.groupNumber(this.tag) != 2) {
                LOG.warn(MISSING_FMI_LENGTH);
                reset();
                break;
            }
            VR vr = this.vr;
            if (vr != null) {
                if (vr == VR.UN) {
                    this.vr = ElementDictionary.getStandardElementDictionary().vrOf(this.tag);
                }
                this.handler.readValue(this, attributes2);
            } else {
                skipAttribute(UNEXPECTED_ATTRIBUTE);
            }
        }
        this.fileMetaInformation = attributes2;
        String string = attributes2.getString(Tag.TransferSyntaxUID, (String) null);
        if (string == null) {
            LOG.warn(MISSING_TRANSFER_SYNTAX);
            string = UID.ExplicitVRLittleEndian;
        }
        switchTransferSyntax(string);
        return attributes2;
    }

    public void readFully(byte[] bArr) throws IOException {
        readFully(bArr, 0, bArr.length);
    }

    public void readHeader() throws IOException {
        VR vr;
        int iBytesToInt;
        byte[] bArr = this.buffer;
        this.tagPos = this.pos;
        readFully(bArr, 0, 8);
        int iBytesToTag = ByteUtils.bytesToTag(bArr, 0, this.bigEndian);
        this.tag = iBytesToTag;
        if (iBytesToTag == -73728 || iBytesToTag == -73715 || iBytesToTag == -73507) {
            vr = null;
        } else {
            if (this.explicitVR) {
                VR vrValueOf = VR.valueOf(ByteUtils.bytesToVR(bArr, 4));
                this.vr = vrValueOf;
                if (vrValueOf.headerLength() == 8) {
                    iBytesToInt = ByteUtils.bytesToUShort(bArr, 6, this.bigEndian);
                    this.length = iBytesToInt;
                } else {
                    readFully(bArr, 4, 4);
                    iBytesToInt = ByteUtils.bytesToInt(bArr, 4, this.bigEndian);
                    this.length = iBytesToInt;
                }
            }
            vr = VR.UN;
        }
        this.vr = vr;
        iBytesToInt = ByteUtils.bytesToInt(bArr, 4, this.bigEndian);
        this.length = iBytesToInt;
    }

    public Attributes readItem() throws IOException {
        readHeader();
        if (this.tag == -73728) {
            Attributes attributes = new Attributes(this.bigEndian);
            attributes.setItemPosition(this.tagPos);
            readAttributes(attributes, this.length, Tag.ItemDelimitationItem);
            attributes.trimToSize();
            return attributes;
        }
        throw new IOException("Unexpected attribute " + TagUtils.toString(this.tag) + " #" + this.length + " @ " + this.pos);
    }

    public boolean readItemHeader() throws IOException {
        while (true) {
            readHeader();
            int i4 = this.tag;
            if (i4 == -73728) {
                return true;
            }
            if (i4 == -73507) {
                if (this.length == 0) {
                    return false;
                }
                skipAttribute(UNEXPECTED_NON_ZERO_ITEM_LENGTH);
                return false;
            }
            skipAttribute(UNEXPECTED_ATTRIBUTE);
        }
    }

    @Override // org.dcm4che3.io.DicomInputHandler
    public void readValue(DicomInputStream dicomInputStream, Attributes attributes) throws IOException {
        int i4;
        VR vr;
        Object objCreateBulkData;
        checkIsThis(dicomInputStream);
        if (this.excludeBulkData) {
            skipFully(this.length);
            return;
        }
        int i5 = this.length;
        if (i5 == 0) {
            attributes.setNull(this.tag, this.vr);
            return;
        }
        VR vr2 = this.vr;
        if (vr2 == VR.SQ) {
            readSequence(i5, attributes, this.tag);
            return;
        }
        if (i5 == -1) {
            readFragments(attributes, this.tag, vr2);
            return;
        }
        if (i5 == 64507 && (((FilterInputStream) this).in instanceof ObjectInputStream)) {
            i4 = this.tag;
            vr = this.vr;
            objCreateBulkData = BulkData.deserializeFrom((ObjectInputStream) ((FilterInputStream) this).in);
        } else {
            if (!this.includeBulkDataURI) {
                byte[] value = readValue();
                if (TagUtils.isGroupLength(this.tag)) {
                    if (this.tag == 131072) {
                        setFileMetaInformationGroupLength(value);
                        return;
                    }
                    return;
                } else {
                    if (this.bigEndian != attributes.bigEndian()) {
                        this.vr.toggleEndian(value, false);
                    }
                    attributes.setBytes(this.tag, this.vr, value);
                    return;
                }
            }
            i4 = this.tag;
            vr = this.vr;
            objCreateBulkData = this.bulkDataCreator.createBulkData(this);
        }
        attributes.setValue(i4, vr, objCreateBulkData);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.pos = this.markPos;
    }

    public final void setAllocateLimit(int i4) {
        this.allocateLimit = i4;
    }

    public void setBulkDataCreator(BulkDataCreator bulkDataCreator) {
        if (bulkDataCreator == null) {
            throw new NullPointerException("bulkDataCreator");
        }
        this.bulkDataCreator = bulkDataCreator;
    }

    public final void setBulkDataDescriptor(BulkDataDescriptor bulkDataDescriptor) {
        this.bulkDataDescriptor = bulkDataDescriptor;
    }

    public final void setBulkDataDirectory(File file) {
        this.blkDirectory = file;
    }

    public final void setBulkDataFilePrefix(String str) {
        this.blkFilePrefix = str;
    }

    public final void setBulkDataFileSuffix(String str) {
        this.blkFileSuffix = str;
    }

    public final void setConcatenateBulkDataFiles(boolean z3) {
        this.catBlkFiles = z3;
    }

    public void setDecodeUNWithIVRLE(boolean z3) {
        this.decodeUNWithIVRLE = z3;
    }

    public final void setDicomInputHandler(DicomInputHandler dicomInputHandler) {
        if (dicomInputHandler == null) {
            throw new NullPointerException("handler");
        }
        this.handler = dicomInputHandler;
    }

    public final void setFileMetaInformationGroupLength(byte[] bArr) {
        this.fmiEndPos = this.pos + ((long) ByteUtils.bytesToInt(bArr, 0, this.bigEndian));
    }

    public final void setIncludeBulkData(IncludeBulkData includeBulkData) {
        includeBulkData.getClass();
        this.includeBulkData = includeBulkData;
    }

    public void setPosition(long j4) {
        this.pos = j4;
    }

    public final void setURI(String str) {
        this.uri = str;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j4) throws IOException {
        long jSkip = super.skip(j4);
        this.pos += jSkip;
        return jSkip;
    }

    public void skipFully(long j4) throws IOException {
        StreamUtils.skipFully(this, j4);
    }

    @Override // org.dcm4che3.io.DicomInputHandler
    public void startDataset(DicomInputStream dicomInputStream) {
    }

    public final int tag() {
        return this.tag;
    }

    public final VR vr() {
        return this.vr;
    }

    public DicomInputStream(InputStream inputStream) throws IOException {
        super(inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream));
        this.allocateLimit = DEF_ALLOCATE_LIMIT;
        this.includeBulkData = IncludeBulkData.YES;
        this.fmiEndPos = -1L;
        this.handler = this;
        this.bulkDataCreator = this;
        this.bulkDataDescriptor = BulkDataDescriptor.DEFAULT;
        this.buffer = new byte[12];
        this.itemPointers = new ArrayList(4);
        this.decodeUNWithIVRLE = true;
        this.blkFilePrefix = "blk";
        guessTransferSyntax();
    }

    private boolean guessTransferSyntax(byte[] bArr, int i4, boolean z3) throws DicomStreamException {
        VR vrVrOf = ElementDictionary.vrOf(ByteUtils.bytesToTag(bArr, 0, z3), null);
        if (vrVrOf == VR.UN) {
            return false;
        }
        if (ByteUtils.bytesToVR(bArr, 4) == vrVrOf.code()) {
            this.tsuid = z3 ? UID.ExplicitVRBigEndianRetired : UID.ExplicitVRLittleEndian;
            this.bigEndian = z3;
            this.explicitVR = true;
            return true;
        }
        int iBytesToInt = ByteUtils.bytesToInt(bArr, 4, z3);
        if (iBytesToInt < 0 || iBytesToInt + 8 > i4) {
            return false;
        }
        if (z3) {
            throw new DicomStreamException(IMPLICIT_VR_BIG_ENDIAN);
        }
        this.tsuid = UID.ImplicitVRLittleEndian;
        this.bigEndian = false;
        this.explicitVR = false;
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public void readFully(byte[] bArr, int i4, int i5) throws IOException {
        StreamUtils.readFully(this, bArr, i4, i5);
    }

    @Override // org.dcm4che3.io.DicomInputHandler
    public void readValue(DicomInputStream dicomInputStream, Fragments fragments) throws IOException {
        checkIsThis(dicomInputStream);
        if (this.excludeBulkData) {
            skipFully(this.length);
            return;
        }
        int i4 = this.length;
        if (i4 == 0) {
            fragments.add(ByteUtils.EMPTY_BYTES);
            return;
        }
        if (i4 == 64507 && (((FilterInputStream) this).in instanceof ObjectInputStream)) {
            fragments.add(BulkData.deserializeFrom((ObjectInputStream) ((FilterInputStream) this).in));
            return;
        }
        if (this.includeBulkDataURI) {
            fragments.add(this.bulkDataCreator.createBulkData(this));
            return;
        }
        byte[] value = readValue();
        if (this.bigEndian != fragments.bigEndian()) {
            fragments.vr().toggleEndian(value, false);
        }
        fragments.add(value);
    }

    public DicomInputStream(InputStream inputStream, String str) throws IOException {
        super(inputStream);
        this.allocateLimit = DEF_ALLOCATE_LIMIT;
        this.includeBulkData = IncludeBulkData.YES;
        this.fmiEndPos = -1L;
        this.handler = this;
        this.bulkDataCreator = this;
        this.bulkDataDescriptor = BulkDataDescriptor.DEFAULT;
        this.buffer = new byte[12];
        this.itemPointers = new ArrayList(4);
        this.decodeUNWithIVRLE = true;
        this.blkFilePrefix = "blk";
        switchTransferSyntax(str);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) throws IOException {
        int i6 = super.read(bArr, i4, i5);
        if (i6 > 0) {
            this.pos += (long) i6;
        }
        return i6;
    }

    public void readFully(short[] sArr, int i4, int i5) throws IOException {
        int i6;
        if (i4 < 0 || i5 < 0 || (i6 = i4 + i5) > sArr.length || i6 < 0) {
            throw new IndexOutOfBoundsException("off < 0 || len < 0 || off + len > s.length!");
        }
        if (this.byteBuf == null) {
            this.byteBuf = new byte[8192];
        }
        while (i5 > 0) {
            int iMin = Math.min(i5, this.byteBuf.length / 2);
            readFully(this.byteBuf, 0, iMin * 2);
            ByteUtils.bytesToShorts(this.byteBuf, sArr, i4, iMin, this.bigEndian);
            i4 += iMin;
            i5 -= iMin;
        }
    }

    @Override // org.dcm4che3.io.DicomInputHandler
    public void readValue(DicomInputStream dicomInputStream, Sequence sequence) throws IOException {
        checkIsThis(dicomInputStream);
        if (this.length == 0) {
            sequence.add(new Attributes(sequence.getParent().bigEndian(), 0));
            return;
        }
        Attributes attributes = new Attributes(sequence.getParent().bigEndian());
        sequence.add(attributes);
        readAttributes(attributes, this.length, Tag.ItemDelimitationItem);
        attributes.trimToSize();
    }

    public byte[] readValue() throws IOException {
        int i4 = this.length;
        try {
            if (i4 < 0) {
                throw new EOFException();
            }
            int i5 = this.allocateLimit;
            int iMin = i5 >= 0 ? Math.min(i4, i5) : i4;
            byte[] bArrCopyOf = new byte[iMin];
            readFully(bArrCopyOf, 0, iMin);
            while (iMin < i4) {
                int iMin2 = Math.min(i4, iMin << 1);
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, iMin2);
                readFully(bArrCopyOf, iMin, iMin2 - iMin);
                iMin = iMin2;
            }
            return bArrCopyOf;
        } catch (IOException e4) {
            LOG.warn("IOException during read of {} #{} @ {}", TagUtils.toString(this.tag), Integer.valueOf(this.length), Long.valueOf(this.tagPos), e4);
            throw e4;
        }
    }
}
