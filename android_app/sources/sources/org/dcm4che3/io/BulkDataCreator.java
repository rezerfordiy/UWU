package org.dcm4che3.io;

import java.io.IOException;
import org.dcm4che3.data.BulkData;

/* JADX INFO: loaded from: classes.dex */
public interface BulkDataCreator {
    BulkData createBulkData(DicomInputStream dicomInputStream) throws IOException;
}
