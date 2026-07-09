package org.dcm4che3.net;

import java.io.IOException;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.io.DicomOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class DataWriterAdapter implements DataWriter {
    private final Attributes data;

    public DataWriterAdapter(Attributes attributes) {
        attributes.getClass();
        this.data = attributes;
    }

    public static DataWriterAdapter forAttributes(Attributes attributes) {
        if (attributes != null) {
            return new DataWriterAdapter(attributes);
        }
        return null;
    }

    public final Attributes getDataset() {
        return this.data;
    }

    @Override // org.dcm4che3.net.DataWriter
    public void writeTo(PDVOutputStream pDVOutputStream, String str) throws IOException {
        new DicomOutputStream(pDVOutputStream, str).writeDataset(null, this.data);
    }
}
