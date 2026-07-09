package org.dcm4che3.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.dcm4che3.io.DicomEncodingOptions;
import org.dcm4che3.io.DicomOutputStream;
import org.dcm4che3.util.ByteUtils;
import org.dcm4che3.util.StreamUtils;
import org.dcm4che3.util.StringUtils;
import s0.a;

/* JADX INFO: loaded from: classes.dex */
public class BulkData implements Value {
    public static final int MAGIC_LEN = 64507;
    private final boolean bigEndian;
    private int length;
    private long offset;
    private String uri;
    private int uriPathEnd;
    private final String uuid;

    public BulkData(String str, long j4, int i4, boolean z3) {
        this.offset = 0L;
        this.length = -1;
        this.uuid = null;
        this.uriPathEnd = str.length();
        this.uri = str + "?offset=" + j4 + "&length=" + i4;
        this.offset = j4;
        this.length = i4;
        this.bigEndian = z3;
    }

    public static Value deserializeFrom(ObjectInputStream objectInputStream) throws IOException {
        return new BulkData(StringUtils.maskEmpty(objectInputStream.readUTF(), null), StringUtils.maskEmpty(objectInputStream.readUTF(), null), objectInputStream.readBoolean());
    }

    public boolean bigEndian() {
        return this.bigEndian;
    }

    @Override // org.dcm4che3.data.Value
    public int calcLength(DicomEncodingOptions dicomEncodingOptions, boolean z3, VR vr) {
        int i4 = this.length;
        if (i4 != -1) {
            return (i4 + 1) & (-2);
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.dcm4che3.data.Value
    public int getEncodedLength(DicomEncodingOptions dicomEncodingOptions, boolean z3, VR vr) {
        int i4 = this.length;
        if (i4 == -1) {
            return -1;
        }
        return (i4 + 1) & (-2);
    }

    public File getFile() {
        try {
            return new File(new URI(uriWithoutOffsetAndLength()));
        } catch (IllegalArgumentException unused) {
            throw new IllegalStateException("uri: " + this.uri);
        } catch (URISyntaxException unused2) {
            throw new IllegalStateException("uri: " + this.uri);
        }
    }

    public String getURI() {
        return this.uri;
    }

    public String getUUID() {
        return this.uuid;
    }

    @Override // org.dcm4che3.data.Value
    public boolean isEmpty() {
        return this.length == 0;
    }

    public int length() {
        return this.length;
    }

    public long offset() {
        return this.offset;
    }

    public InputStream openStream() throws IOException {
        String str = this.uri;
        if (str == null) {
            throw new IllegalStateException("uri: null");
        }
        if (!str.startsWith("file:")) {
            return new URL(this.uri).openStream();
        }
        FileInputStream fileInputStream = new FileInputStream(getFile());
        StreamUtils.skipFully(fileInputStream, this.offset);
        return fileInputStream;
    }

    public void serializeTo(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF((String) StringUtils.maskNull(this.uuid, a.f11071l));
        objectOutputStream.writeUTF((String) StringUtils.maskNull(this.uri, a.f11071l));
        objectOutputStream.writeBoolean(this.bigEndian);
    }

    public void setURI(String str) {
        int i4;
        int iIndexOf;
        this.uri = str;
        this.uriPathEnd = str.length();
        this.offset = 0L;
        this.length = -1;
        int iIndexOf2 = str.indexOf(63);
        if (iIndexOf2 < 0) {
            return;
        }
        this.uriPathEnd = iIndexOf2;
        if (str.startsWith("?offset=", iIndexOf2) && (iIndexOf = str.indexOf("&length=", (i4 = iIndexOf2 + 8))) >= 0) {
            try {
                this.offset = Integer.parseInt(str.substring(i4, iIndexOf));
                this.length = Integer.parseInt(str.substring(iIndexOf + 8));
            } catch (NumberFormatException unused) {
            }
        }
    }

    @Override // org.dcm4che3.data.Value
    public byte[] toBytes(VR vr, boolean z3) throws IOException {
        int i4 = this.length;
        if (i4 == -1) {
            throw new UnsupportedOperationException();
        }
        if (i4 == 0) {
            return ByteUtils.EMPTY_BYTES;
        }
        InputStream inputStreamOpenStream = openStream();
        try {
            int i5 = this.length;
            byte[] bArr = new byte[i5];
            StreamUtils.readFully(inputStreamOpenStream, bArr, 0, i5);
            if (this.bigEndian != z3) {
                vr.toggleEndian(bArr, false);
            }
            return bArr;
        } finally {
            inputStreamOpenStream.close();
        }
    }

    public String toString() {
        return "BulkData[uuid=" + this.uuid + ", uri=" + this.uri + ", bigEndian=" + this.bigEndian + "]";
    }

    public String uriWithoutOffsetAndLength() {
        String str = this.uri;
        if (str != null) {
            return str.substring(0, this.uriPathEnd);
        }
        throw new IllegalStateException("uri: null");
    }

    @Override // org.dcm4che3.data.Value
    public void writeTo(DicomOutputStream dicomOutputStream, VR vr) throws IOException {
        InputStream inputStreamOpenStream = openStream();
        try {
            if (this.bigEndian != dicomOutputStream.isBigEndian()) {
                StreamUtils.copy(inputStreamOpenStream, dicomOutputStream, this.length, vr.numEndianBytes());
            } else {
                StreamUtils.copy(inputStreamOpenStream, dicomOutputStream, this.length);
            }
            if ((this.length & 1) != 0) {
                dicomOutputStream.write(vr.paddingByte());
            }
        } finally {
            inputStreamOpenStream.close();
        }
    }

    public BulkData(String str, String str2, boolean z3) {
        this.offset = 0L;
        this.length = -1;
        this.uuid = str;
        setURI(str2);
        this.bigEndian = z3;
    }
}
