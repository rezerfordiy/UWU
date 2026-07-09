package org.dcm4che3.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class PDVOutputStream extends OutputStream {
    public abstract void copyFrom(InputStream inputStream) throws IOException;

    public abstract void copyFrom(InputStream inputStream, int i4) throws IOException;
}
