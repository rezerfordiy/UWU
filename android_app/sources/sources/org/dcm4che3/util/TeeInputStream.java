package org.dcm4che3.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class TeeInputStream extends FilterInputStream {
    private final OutputStream out;

    public TeeInputStream(InputStream inputStream, OutputStream outputStream) {
        super(inputStream);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.out = outputStream;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i4 = super.read();
        if (i4 >= 0) {
            this.out.write(i4);
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int i6 = super.read(bArr, i4, i5);
        if (i6 > 0) {
            this.out.write(bArr, i4, i6);
        }
        return i6;
    }
}
