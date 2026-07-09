package org.dcm4che3.imageio.plugins.dcm;

import c2.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import javax.imageio.ImageReader;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.ImageInputStream;
import org.dcm4che3.data.Implementation;

/* JADX INFO: loaded from: classes.dex */
public class DicomImageReaderSpi extends ImageReaderSpi {
    private static final String vendorName = "org.dcm4che";
    private static final String version = Implementation.getVersionName();
    private static final String[] formatNames = {a.C0034a.f4620a, "DICOM"};
    private static final String[] suffixes = {"dcm", "dic", "dicm", a.C0034a.f4620a};
    private static final String[] MIMETypes = {"application/dicom"};
    private static final Class<?>[] inputTypes = {ImageInputStream.class, InputStream.class, DicomMetaData.class};

    public DicomImageReaderSpi() {
        super(vendorName, version, formatNames, suffixes, MIMETypes, DicomImageReader.class.getName(), inputTypes, (String[]) null, false, (String) null, (String) null, (String[]) null, (String[]) null, false, (String) null, (String) null, (String[]) null, (String[]) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean canDecodeInput(java.lang.Object r3) throws java.io.IOException {
        /*
            r2 = this;
            javax.imageio.stream.ImageInputStream r3 = (javax.imageio.stream.ImageInputStream) r3
            r3.mark()
            int r0 = r3.read()     // Catch: java.lang.Throwable -> L56
            int r1 = r3.read()     // Catch: java.lang.Throwable -> L56
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3.read()     // Catch: java.lang.Throwable -> L56
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r3.read()     // Catch: java.lang.Throwable -> L56
            int r1 = r1 << 24
            r0 = r0 | r1
            r1 = 524288(0x80000, float:7.34684E-40)
            if (r0 < r1) goto L27
            r1 = 524310(0x80016, float:7.34715E-40)
            if (r0 <= r1) goto L4f
        L27:
            r0 = 124(0x7c, float:1.74E-43)
            int r1 = r3.skipBytes(r0)     // Catch: java.lang.Throwable -> L56
            if (r1 != r0) goto L51
            int r0 = r3.read()     // Catch: java.lang.Throwable -> L56
            r1 = 68
            if (r0 != r1) goto L51
            int r0 = r3.read()     // Catch: java.lang.Throwable -> L56
            r1 = 73
            if (r0 != r1) goto L51
            int r0 = r3.read()     // Catch: java.lang.Throwable -> L56
            r1 = 67
            if (r0 != r1) goto L51
            int r0 = r3.read()     // Catch: java.lang.Throwable -> L56
            r1 = 77
            if (r0 != r1) goto L51
        L4f:
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            r3.reset()
            return r0
        L56:
            r0 = move-exception
            r3.reset()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dcm4che3.imageio.plugins.dcm.DicomImageReaderSpi.canDecodeInput(java.lang.Object):boolean");
    }

    public ImageReader createReaderInstance(Object obj) throws IOException {
        return new DicomImageReader(this);
    }

    public String getDescription(Locale locale) {
        return "DICOM Image Reader";
    }
}
