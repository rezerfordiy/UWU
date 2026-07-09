package org.dcm4che3.imageio.stream;

import java.io.IOException;
import javax.imageio.stream.MemoryCacheImageInputStream;
import org.dcm4che3.io.DicomInputStream;

/* JADX INFO: loaded from: classes.dex */
public class EncapsulatedPixelDataImageInputStream extends MemoryCacheImageInputStream {
    private final byte[] basicOffsetTable;
    private final DicomInputStream dis;
    private boolean endOfStream;
    private long fragmEndPos;
    private int fragmStartWord;
    private long frameEndPos;
    private long frameStartPos;
    private final int frameStartWord;
    private final int frames;

    public EncapsulatedPixelDataImageInputStream(DicomInputStream dicomInputStream, int i4) throws IOException {
        super(dicomInputStream);
        this.frameEndPos = -1L;
        this.dis = dicomInputStream;
        this.frames = i4;
        dicomInputStream.readItemHeader();
        byte[] bArr = new byte[dicomInputStream.length()];
        dicomInputStream.readFully(bArr);
        this.basicOffsetTable = bArr;
        readItemHeader();
        this.frameStartWord = this.fragmStartWord;
    }

    private boolean endOfFrame() throws IOException {
        long j4 = this.frameEndPos;
        long j5 = this.streamPos;
        if (j4 >= 0) {
            return j5 >= this.frameEndPos;
        }
        if (j5 < this.fragmEndPos) {
            return false;
        }
        if (readItemHeader() && (this.frames <= 1 || this.fragmStartWord != this.frameStartWord)) {
            return false;
        }
        this.frameEndPos = this.streamPos;
        return true;
    }

    private boolean readItemHeader() throws IOException {
        if (!this.dis.readItemHeader()) {
            this.endOfStream = true;
            return false;
        }
        this.fragmEndPos = this.streamPos + ((long) this.dis.length());
        mark();
        this.fragmStartWord = (super.read() << 8) | super.read();
        reset();
        return true;
    }

    public boolean isEndOfStream() {
        return this.endOfStream;
    }

    public int read() throws IOException {
        if (endOfFrame()) {
            return -1;
        }
        return super.read();
    }

    public void seekCurrentFrame() throws IOException {
        seek(this.frameStartPos);
    }

    public boolean seekNextFrame() throws IOException {
        if (this.endOfStream) {
            return false;
        }
        long j4 = this.frameEndPos;
        if (j4 >= 0) {
            seek(j4);
            flush();
        } else {
            while (!endOfFrame()) {
                seek(this.fragmEndPos - 1);
                super.read();
                flush();
            }
        }
        this.frameStartPos = this.streamPos;
        this.frameEndPos = -1L;
        return !this.endOfStream;
    }

    public int read(byte[] bArr, int i4, int i5) throws IOException {
        if (endOfFrame()) {
            return -1;
        }
        long j4 = this.frameEndPos;
        if (j4 < 0) {
            j4 = this.fragmEndPos;
        }
        return super.read(bArr, i4, Math.min(i5, (int) (j4 - this.streamPos)));
    }
}
