package org.dcm4che3.imageio.codec;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class CompressionVerificationException extends IOException {
    private static final long serialVersionUID = 658013036646826476L;
    private final int maxError;

    public CompressionVerificationException(int i4) {
        super("Decompressed pixel data differs up to " + i4 + " from original pixel data");
        this.maxError = i4;
    }

    public int getMaxError() {
        return this.maxError;
    }
}
