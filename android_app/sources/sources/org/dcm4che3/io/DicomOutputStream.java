package org.dcm4che3.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.BulkData;
import org.dcm4che3.data.SpecificCharacterSet;
import org.dcm4che3.data.Tag;
import org.dcm4che3.data.UID;
import org.dcm4che3.data.VR;
import org.dcm4che3.data.Value;
import org.dcm4che3.util.ByteUtils;
import org.dcm4che3.util.TagUtils;

/* JADX INFO: loaded from: classes.dex */
public class DicomOutputStream extends FilterOutputStream {
    private static final byte[] DICM = {68, 73, 67, 77};
    private boolean bigEndian;
    private final byte[] buf;
    private DicomEncodingOptions encOpts;
    private boolean explicitVR;
    private byte[] preamble;

    public DicomOutputStream(File file) throws IOException {
        this(new BufferedOutputStream(new FileOutputStream(file)), UID.ExplicitVRLittleEndian);
    }

    private void switchTransferSyntax(String str) throws IOException {
        this.bigEndian = str.equals(UID.ExplicitVRBigEndianRetired);
        this.explicitVR = !str.equals(UID.ImplicitVRLittleEndian);
        if (str.equals(UID.DeflatedExplicitVRLittleEndian) || str.equals(UID.JPIPReferencedDeflate)) {
            ((FilterOutputStream) this).out = new DeflaterOutputStream(((FilterOutputStream) this).out, new Deflater(-1, true));
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            finish();
        } catch (IOException unused) {
        }
        super.close();
    }

    public void finish() throws IOException {
        OutputStream outputStream = ((FilterOutputStream) this).out;
        if (outputStream instanceof DeflaterOutputStream) {
            ((DeflaterOutputStream) outputStream).finish();
        }
    }

    public final DicomEncodingOptions getEncodingOptions() {
        return this.encOpts;
    }

    public final boolean isBigEndian() {
        return this.bigEndian;
    }

    public final boolean isExplicitVR() {
        return this.explicitVR;
    }

    public final void setEncodingOptions(DicomEncodingOptions dicomEncodingOptions) {
        dicomEncodingOptions.getClass();
        this.encOpts = dicomEncodingOptions;
    }

    public final void setPreamble(byte[] bArr) {
        if (bArr.length == 128) {
            this.preamble = (byte[]) bArr.clone();
            return;
        }
        throw new IllegalArgumentException("preamble.length=" + bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i4, i5);
    }

    public void writeAttribute(int i4, VR vr, Object obj, SpecificCharacterSet specificCharacterSet) throws IOException {
        if (obj instanceof Value) {
            writeAttribute(i4, vr, (Value) obj);
        } else {
            writeAttribute(i4, vr, obj instanceof byte[] ? (byte[]) obj : vr.toBytes(obj, specificCharacterSet));
        }
    }

    public void writeCommand(Attributes attributes) throws IOException {
        if (!this.explicitVR && !this.bigEndian) {
            attributes.writeGroupTo(this, 0);
            return;
        }
        throw new IllegalStateException("explicitVR=" + this.explicitVR + ", bigEndian=" + this.bigEndian);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writeDataset(org.dcm4che3.data.Attributes r2, org.dcm4che3.data.Attributes r3) throws java.io.IOException {
        /*
            r1 = this;
            if (r2 == 0) goto L5
            r1.writeFileMetaInformation(r2)
        L5:
            boolean r2 = r3.bigEndian()
            boolean r0 = r1.bigEndian
            if (r2 != r0) goto L1b
            org.dcm4che3.io.DicomEncodingOptions r2 = r1.encOpts
            boolean r0 = r2.groupLength
            if (r0 != 0) goto L1b
            boolean r0 = r2.undefSequenceLength
            if (r0 == 0) goto L1b
            boolean r2 = r2.undefItemLength
            if (r2 != 0) goto L23
        L1b:
            org.dcm4che3.data.Attributes r2 = new org.dcm4che3.data.Attributes
            boolean r0 = r1.bigEndian
            r2.<init>(r3, r0)
            r3 = r2
        L23:
            org.dcm4che3.io.DicomEncodingOptions r2 = r1.encOpts
            boolean r0 = r2.groupLength
            if (r0 == 0) goto L2e
            boolean r0 = r1.explicitVR
            r3.calcLength(r2, r0)
        L2e:
            r3.writeTo(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dcm4che3.io.DicomOutputStream.writeDataset(org.dcm4che3.data.Attributes, org.dcm4che3.data.Attributes):void");
    }

    public void writeFileMetaInformation(Attributes attributes) throws IOException {
        if (!this.explicitVR || this.bigEndian) {
            throw new IllegalStateException("explicitVR=" + this.explicitVR + ", bigEndian=" + this.bigEndian);
        }
        String string = attributes.getString(Tag.TransferSyntaxUID, (String) null);
        write(this.preamble);
        write(DICM);
        attributes.writeGroupTo(this, 131072);
        switchTransferSyntax(string);
    }

    public void writeGroupLength(int i4, int i5) throws IOException {
        byte[] bArr = this.buf;
        ByteUtils.tagToBytes(i4, bArr, 0, this.bigEndian);
        if (this.explicitVR) {
            ByteUtils.shortToBytesBE(VR.UL.code(), bArr, 4);
            ByteUtils.shortToBytes(4, bArr, 6, this.bigEndian);
        } else {
            ByteUtils.intToBytes(4, bArr, 4, this.bigEndian);
        }
        ByteUtils.intToBytes(i5, bArr, 8, this.bigEndian);
        ((FilterOutputStream) this).out.write(bArr, 0, 12);
    }

    public void writeHeader(int i4, VR vr, int i5) throws IOException {
        byte[] bArr = this.buf;
        ByteUtils.tagToBytes(i4, bArr, 0, this.bigEndian);
        int i6 = 8;
        if (TagUtils.isItem(i4) || !this.explicitVR) {
            ByteUtils.intToBytes(i5, bArr, 4, this.bigEndian);
        } else {
            ByteUtils.shortToBytesBE(vr.code(), bArr, 4);
            int iHeaderLength = vr.headerLength();
            if (iHeaderLength == 8) {
                ByteUtils.shortToBytes(i5, bArr, 6, this.bigEndian);
            } else {
                bArr[7] = 0;
                bArr[6] = 0;
                ByteUtils.intToBytes(i5, bArr, 8, this.bigEndian);
            }
            i6 = iHeaderLength;
        }
        ((FilterOutputStream) this).out.write(bArr, 0, i6);
    }

    public DicomOutputStream(OutputStream outputStream, String str) throws IOException {
        super(outputStream);
        this.preamble = new byte[128];
        this.encOpts = DicomEncodingOptions.DEFAULT;
        this.buf = new byte[12];
        switchTransferSyntax(str);
    }

    public void writeAttribute(int i4, VR vr, Value value) throws IOException {
        if ((value instanceof BulkData) && (((FilterOutputStream) this).out instanceof ObjectOutputStream)) {
            writeHeader(i4, vr, BulkData.MAGIC_LEN);
            ((BulkData) value).serializeTo((ObjectOutputStream) ((FilterOutputStream) this).out);
            return;
        }
        int encodedLength = value.getEncodedLength(this.encOpts, this.explicitVR, vr);
        writeHeader(i4, vr, encodedLength);
        value.writeTo(this, vr);
        if (encodedLength == -1) {
            writeHeader(Tag.SequenceDelimitationItem, null, 0);
        }
    }

    public void writeAttribute(int i4, VR vr, byte[] bArr) throws IOException {
        int length = bArr.length & 1;
        writeHeader(i4, vr, bArr.length + length);
        ((FilterOutputStream) this).out.write(bArr);
        if (length > 0) {
            ((FilterOutputStream) this).out.write(vr.paddingByte());
        }
    }
}
