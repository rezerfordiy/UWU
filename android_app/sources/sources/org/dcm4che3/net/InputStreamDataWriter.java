package org.dcm4che3.net;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class InputStreamDataWriter implements DataWriter {
    private final InputStream in;

    public InputStreamDataWriter(InputStream inputStream) {
        inputStream.getClass();
        this.in = inputStream;
    }

    @Override // org.dcm4che3.net.DataWriter
    public void writeTo(PDVOutputStream pDVOutputStream, String str) throws IOException {
        pDVOutputStream.copyFrom(this.in);
        this.in.close();
    }
}
