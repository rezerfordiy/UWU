package org.dcm4che3.io;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class DicomStreamException extends IOException {
    private static final long serialVersionUID = -6502979077324809342L;

    public DicomStreamException() {
    }

    public DicomStreamException(String str) {
        super(str);
    }

    public DicomStreamException(String str, Throwable th) {
        super(str, th);
    }

    public DicomStreamException(Throwable th) {
        super(th);
    }
}
