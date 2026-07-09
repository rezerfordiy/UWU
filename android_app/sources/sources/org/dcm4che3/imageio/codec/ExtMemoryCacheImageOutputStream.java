package org.dcm4che3.imageio.codec;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.imageio.stream.MemoryCacheImageOutputStream;

/* JADX INFO: loaded from: classes.dex */
final class ExtMemoryCacheImageOutputStream extends MemoryCacheImageOutputStream {
    private final ExtFilterOutputStream stream;

    public static final class ExtFilterOutputStream extends FilterOutputStream {
        public ExtFilterOutputStream() {
            super(null);
        }

        public OutputStream getOutputStream() {
            return ((FilterOutputStream) this).out;
        }

        public void setOutputStream(OutputStream outputStream) {
            ((FilterOutputStream) this).out = outputStream;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i4, int i5) throws IOException {
            ((FilterOutputStream) this).out.write(bArr, i4, i5);
        }
    }

    public ExtMemoryCacheImageOutputStream() {
        this(new ExtFilterOutputStream());
    }

    public void flushBefore(long j4) throws IOException {
        if (this.stream.getOutputStream() != null) {
            super.flushBefore(j4);
        }
    }

    public void setOutputStream(OutputStream outputStream) {
        this.stream.setOutputStream(outputStream);
    }

    private ExtMemoryCacheImageOutputStream(ExtFilterOutputStream extFilterOutputStream) {
        super(extFilterOutputStream);
        this.stream = extFilterOutputStream;
    }
}
