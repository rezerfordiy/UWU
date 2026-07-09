package org.dcm4che3.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public class RAFInputStreamAdapter extends InputStream {
    private IOException markException;
    private long markedPos;
    private final RandomAccessFile raf;

    public RAFInputStreamAdapter(RandomAccessFile randomAccessFile) {
        randomAccessFile.getClass();
        this.raf = randomAccessFile;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i4) {
        try {
            this.markedPos = this.raf.getFilePointer();
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
        return this.raf.read();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        IOException iOException = this.markException;
        if (iOException != null) {
            throw iOException;
        }
        this.raf.seek(this.markedPos);
    }

    @Override // java.io.InputStream
    public long skip(long j4) throws IOException {
        return this.raf.skipBytes((int) j4);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        return this.raf.read(bArr, i4, i5);
    }
}
