package org.dcm4che3.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public class RAFOutputStreamAdapter extends OutputStream {
    private final RandomAccessFile raf;

    public RAFOutputStreamAdapter(RandomAccessFile randomAccessFile) {
        this.raf = randomAccessFile;
    }

    @Override // java.io.OutputStream
    public void write(int i4) throws IOException {
        this.raf.write(i4);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        this.raf.write(bArr, i4, i5);
    }
}
