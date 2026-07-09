package org.dcm4che3.imageio.codec.jpeg;

import java.io.IOException;
import java.util.Arrays;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageInputStreamImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public class PatchJPEGLSImageInputStream extends ImageInputStreamImpl {
    private static final Logger LOG = LoggerFactory.getLogger(PatchJPEGLSImageInputStream.class);
    private final ImageInputStream iis;
    private byte[] patch;
    private long patchPos;

    public PatchJPEGLSImageInputStream(ImageInputStream imageInputStream, PatchJPEGLS patchJPEGLS) throws IOException {
        JPEGLSCodingParam jPEGLSCodingParamCreateJPEGLSCodingParam;
        if (imageInputStream == null) {
            throw new NullPointerException("iis");
        }
        ((ImageInputStreamImpl) this).streamPos = imageInputStream.getStreamPosition();
        ((ImageInputStreamImpl) this).flushedPos = imageInputStream.getFlushedPosition();
        this.iis = imageInputStream;
        if (patchJPEGLS == null || (jPEGLSCodingParamCreateJPEGLSCodingParam = patchJPEGLS.createJPEGLSCodingParam(firstBytesOf(imageInputStream))) == null) {
            return;
        }
        LOG.debug("Patch JPEG-LS with {}", jPEGLSCodingParamCreateJPEGLSCodingParam);
        this.patchPos = this.streamPos + ((long) jPEGLSCodingParamCreateJPEGLSCodingParam.getOffset());
        this.patch = jPEGLSCodingParamCreateJPEGLSCodingParam.getBytes();
    }

    private long adjustStreamPosition(long j4) {
        byte[] bArr = this.patch;
        if (bArr == null) {
            return j4;
        }
        long j5 = this.patchPos;
        long j6 = j4 - j5;
        return j6 < 0 ? j4 : j6 < ((long) bArr.length) ? j5 : j4 - ((long) bArr.length);
    }

    private byte[] firstBytesOf(ImageInputStream imageInputStream) throws IOException {
        byte[] bArr = new byte[256];
        imageInputStream.mark();
        int i4 = 0;
        int i5 = 256;
        while (i5 > 0) {
            int i6 = imageInputStream.read(bArr, i4, i5);
            if (i6 <= 0) {
                break;
            }
            i4 += i6;
            i5 -= i6;
        }
        imageInputStream.reset();
        return i5 > 0 ? Arrays.copyOf(bArr, 256 - i5) : bArr;
    }

    public void close() throws IOException {
        super.close();
        this.iis.close();
    }

    public void flushBefore(long j4) throws IOException {
        super.flushBefore(j4);
        this.iis.flushBefore(adjustStreamPosition(j4));
    }

    public boolean isCached() {
        return this.iis.isCached();
    }

    public boolean isCachedFile() {
        return this.iis.isCachedFile();
    }

    public boolean isCachedMemory() {
        return this.iis.isCachedMemory();
    }

    public long length() {
        try {
            long length = this.iis.length();
            byte[] bArr = this.patch;
            if (bArr != null && length >= 0) {
                return length + ((long) bArr.length);
            }
            return length;
        } catch (IOException unused) {
            return -1L;
        }
    }

    public void mark() {
        super.mark();
        this.iis.mark();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read() throws java.io.IOException {
        /*
            r5 = this;
            byte[] r0 = r5.patch
            if (r0 == 0) goto L1b
            long r0 = r5.streamPos
            long r2 = r5.patchPos
            long r0 = r0 - r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L1b
            byte[] r2 = r5.patch
            int r3 = r2.length
            long r3 = (long) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L1b
            int r0 = (int) r0
            r0 = r2[r0]
            goto L21
        L1b:
            javax.imageio.stream.ImageInputStream r0 = r5.iis
            int r0 = r0.read()
        L21:
            if (r0 < 0) goto L2a
            long r1 = r5.streamPos
            r3 = 1
            long r1 = r1 + r3
            r5.streamPos = r1
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dcm4che3.imageio.codec.jpeg.PatchJPEGLSImageInputStream.read():int");
    }

    public void reset() throws IOException {
        super.reset();
        this.iis.reset();
    }

    public void seek(long j4) throws IOException {
        super.seek(j4);
        this.iis.seek(adjustStreamPosition(j4));
    }

    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int i6 = 0;
        if (this.patch != null && this.streamPos < this.patchPos + ((long) this.patch.length)) {
            long j4 = this.streamPos;
            long j5 = this.patchPos;
            if (j4 < j5) {
                i6 = this.iis.read(bArr, i4, (int) Math.min(j5 - this.streamPos, i5));
                if (i6 < 0) {
                    return i6;
                }
                this.streamPos += (long) i6;
                if (this.streamPos < this.patchPos) {
                    return i6;
                }
                i4 += i6;
                i5 -= i6;
            }
            int i7 = (int) (this.patchPos - this.streamPos);
            int iMin = Math.min(this.patch.length - i7, i5);
            System.arraycopy(this.patch, i7, bArr, i4, iMin);
            this.streamPos += (long) iMin;
            i6 += iMin;
            i4 += iMin;
            i5 -= iMin;
        }
        if (i5 <= 0) {
            return i6;
        }
        int i8 = this.iis.read(bArr, i4, i5);
        if (i8 < 0) {
            return i8;
        }
        this.streamPos += (long) i8;
        return i6 + i8;
    }
}
