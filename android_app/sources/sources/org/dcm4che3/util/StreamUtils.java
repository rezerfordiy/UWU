package org.dcm4che3.util;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class StreamUtils {
    private static final int COPY_BUFFER_SIZE = 2048;

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        copy(inputStream, outputStream, new byte[2048]);
    }

    public static InputStream openFileOrURL(String str) throws IOException {
        if (!str.startsWith("resource:")) {
            return str.indexOf(58) < 2 ? new FileInputStream(str) : new URL(str).openStream();
        }
        URL resourceURL = ResourceLocator.getResourceURL(str.substring(9), (Class<?>) StreamUtils.class);
        if (resourceURL != null) {
            return resourceURL.openStream();
        }
        throw new FileNotFoundException(str);
    }

    public static int readAvailable(InputStream inputStream, byte[] bArr, int i4, int i5) throws IOException {
        if (i4 < 0 || i5 < 0 || i4 + i5 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i6 = i4;
        while (i5 > 0) {
            int i7 = inputStream.read(bArr, i6, i5);
            if (i7 < 0) {
                break;
            }
            i6 += i7;
            i5 -= i7;
        }
        return i6 - i4;
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i4, int i5) throws IOException {
        if (readAvailable(inputStream, bArr, i4, i5) < i5) {
            throw new EOFException();
        }
    }

    public static void skipFully(InputStream inputStream, long j4) throws IOException {
        while (j4 > 0) {
            long jSkip = inputStream.skip(j4);
            if (jSkip <= 0) {
                throw new EOFException();
            }
            j4 -= jSkip;
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, int i4) throws IOException {
        copy(inputStream, outputStream, i4, new byte[Math.min(i4, 2048)]);
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, int i4, int i5) throws IOException {
        copy(inputStream, outputStream, i4, i5, new byte[Math.min(i4, 2048)]);
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, int i4, int i5, byte[] bArr) throws IOException {
        if (i5 == 1) {
            copy(inputStream, outputStream, i4, bArr);
            return;
        }
        if (i5 != 2 && i5 != 4) {
            throw new IllegalArgumentException("swapBytes: " + i5);
        }
        if (i4 < 0 || i4 % i5 != 0) {
            throw new IllegalArgumentException("length: " + i4);
        }
        int i6 = 0;
        while (i4 > 0) {
            int i7 = inputStream.read(bArr, i6, Math.min(i4, bArr.length - i6));
            if (i7 < 0) {
                throw new EOFException();
            }
            i4 -= i7;
            int i8 = i7 + i6;
            i6 = i8 % i5;
            int i9 = i8 - i6;
            if (i5 == 2) {
                ByteUtils.swapShorts(bArr, 0, i9);
            } else if (i5 == 4) {
                ByteUtils.swapInts(bArr, 0, i9);
            } else if (i5 == 8) {
                ByteUtils.swapLongs(bArr, 0, i9);
            }
            outputStream.write(bArr, 0, i9);
            if (i6 > 0) {
                System.arraycopy(bArr, i9, bArr, 0, i6);
            }
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, int i4, byte[] bArr) throws IOException {
        if (i4 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (i4 > 0) {
            int i5 = inputStream.read(bArr, 0, Math.min(i4, bArr.length));
            if (i5 < 0) {
                throw new EOFException();
            }
            outputStream.write(bArr, 0, i5);
            i4 -= i5;
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int i4 = inputStream.read(bArr, 0, bArr.length);
            if (i4 <= 0) {
                return;
            }
            if (outputStream != null) {
                outputStream.write(bArr, 0, i4);
            }
        }
    }
}
