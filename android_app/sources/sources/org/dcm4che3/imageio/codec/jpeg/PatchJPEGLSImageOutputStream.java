package org.dcm4che3.imageio.codec.jpeg;

import java.io.IOException;
import javax.imageio.stream.ImageOutputStream;
import javax.imageio.stream.ImageOutputStreamImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public class PatchJPEGLSImageOutputStream extends ImageOutputStreamImpl {
    private static final Logger LOG = LoggerFactory.getLogger(PatchJPEGLSImageOutputStream.class);
    private final ImageOutputStream ios;
    private byte[] jpegheader;
    private int jpegheaderIndex;
    private final PatchJPEGLS patchJpegLS;

    public PatchJPEGLSImageOutputStream(ImageOutputStream imageOutputStream, PatchJPEGLS patchJPEGLS) throws IOException {
        if (imageOutputStream == null) {
            throw new NullPointerException("ios");
        }
        ((ImageOutputStreamImpl) this).streamPos = imageOutputStream.getStreamPosition();
        ((ImageOutputStreamImpl) this).flushedPos = imageOutputStream.getFlushedPosition();
        this.ios = imageOutputStream;
        this.patchJpegLS = patchJPEGLS;
        this.jpegheader = patchJPEGLS != null ? new byte[256] : null;
    }

    public int read() throws IOException {
        return this.ios.read();
    }

    public void write(int i4) throws IOException {
        if (this.jpegheader != null) {
            write(new byte[]{(byte) i4}, 0, 1);
        } else {
            this.ios.write(i4);
            this.streamPos++;
        }
    }

    public int read(byte[] bArr, int i4, int i5) throws IOException {
        return this.ios.read(bArr, i4, i5);
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i4, int i5) throws IOException {
        byte[] bArr2 = this.jpegheader;
        if (bArr2 == null) {
            this.ios.write(bArr, i4, i5);
        } else {
            int iMin = Math.min(bArr2.length - this.jpegheaderIndex, i5);
            System.arraycopy(bArr, i4, this.jpegheader, this.jpegheaderIndex, iMin);
            int i6 = this.jpegheaderIndex + iMin;
            this.jpegheaderIndex = i6;
            byte[] bArr3 = this.jpegheader;
            if (i6 >= bArr3.length) {
                JPEGLSCodingParam jPEGLSCodingParamCreateJPEGLSCodingParam = this.patchJpegLS.createJPEGLSCodingParam(bArr3);
                if (jPEGLSCodingParamCreateJPEGLSCodingParam == null) {
                    this.ios.write(this.jpegheader);
                } else {
                    LOG.debug("Patch JPEG-LS with {}", jPEGLSCodingParamCreateJPEGLSCodingParam);
                    int offset = jPEGLSCodingParamCreateJPEGLSCodingParam.getOffset();
                    this.ios.write(this.jpegheader, 0, offset);
                    this.ios.write(jPEGLSCodingParamCreateJPEGLSCodingParam.getBytes());
                    ImageOutputStream imageOutputStream = this.ios;
                    byte[] bArr4 = this.jpegheader;
                    imageOutputStream.write(bArr4, offset, bArr4.length - offset);
                }
                this.ios.write(bArr, i4 + iMin, i5 - iMin);
                this.jpegheader = null;
            }
        }
        this.streamPos += (long) i5;
    }
}
