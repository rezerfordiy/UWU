package org.dcm4che3.imageio.stream;

import java.io.IOException;
import java.io.OutputStream;
import javax.imageio.stream.ImageOutputStreamImpl;

/* JADX INFO: loaded from: classes.dex */
public class OutputStreamAdapter extends ImageOutputStreamImpl {
    private final OutputStream out;

    public OutputStreamAdapter(OutputStream outputStream) {
        this.out = outputStream;
    }

    public int read() throws IOException {
        throw new UnsupportedOperationException();
    }

    public void write(int i4) throws IOException {
        this.out.write(i4);
    }

    public int read(byte[] bArr, int i4, int i5) throws IOException {
        throw new UnsupportedOperationException();
    }

    public void write(byte[] bArr, int i4, int i5) throws IOException {
        this.out.write(bArr, i4, i5);
    }
}
