package org.dcm4che3.net;

import java.io.IOException;
import org.dcm4che3.data.Attributes;

/* JADX INFO: loaded from: classes.dex */
public interface DimseRSP {
    void cancel(Association association) throws IOException;

    Attributes getCommand();

    Attributes getDataset();

    boolean next() throws InterruptedException, IOException;
}
