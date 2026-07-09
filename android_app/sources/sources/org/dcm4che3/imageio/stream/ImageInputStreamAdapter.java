package org.dcm4che3.imageio.stream;

import java.io.IOException;
import java.io.InputStream;
import javax.imageio.stream.ImageInputStream;

/* JADX INFO: loaded from: classes.dex */
public class ImageInputStreamAdapter extends InputStream {
    private final ImageInputStream iis;
    private IOException markException;
    private long markedPos;

    public ImageInputStreamAdapter(ImageInputStream imageInputStream) {
        this.iis = imageInputStream;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i4) {
        try {
            this.markedPos = this.iis.getStreamPosition();
            this.markException = null;
        } catch (IOException e4) {
            this.markException = e4;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.iis.read();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        IOException iOException = this.markException;
        if (iOException != null) {
            throw iOException;
        }
        this.iis.seek(this.markedPos);
    }

    @Override // java.io.InputStream
    public long skip(long j4) throws IOException {
        return this.iis.skipBytes((int) j4);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        return this.iis.read(bArr, i4, i5);
    }
}
