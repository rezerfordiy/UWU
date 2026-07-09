package org.dcm4che3.net;

import java.io.IOException;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.net.pdu.PresentationContext;

/* JADX INFO: loaded from: classes.dex */
public interface DimseRQHandler {
    void onClose(Association association);

    void onDimseRQ(Association association, PresentationContext presentationContext, Dimse dimse, Attributes attributes, PDVInputStream pDVInputStream) throws IOException;
}
