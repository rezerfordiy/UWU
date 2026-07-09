package org.dcm4che3.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.dcm4che3.data.Attributes;

/* JADX INFO: loaded from: classes.dex */
public abstract class PDVInputStream extends InputStream {
    public abstract void copyTo(OutputStream outputStream) throws IOException;

    public abstract void copyTo(OutputStream outputStream, int i4) throws IOException;

    public abstract Attributes readDataset(String str) throws IOException;

    public abstract long skipAll() throws IOException;
}
