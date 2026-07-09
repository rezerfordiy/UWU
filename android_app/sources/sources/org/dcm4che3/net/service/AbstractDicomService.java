package org.dcm4che3.net.service;

import java.io.IOException;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.net.Association;
import org.dcm4che3.net.Dimse;
import org.dcm4che3.net.PDVInputStream;
import org.dcm4che3.net.pdu.PresentationContext;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDicomService implements DicomService {
    private final String[] sopClasses;

    public AbstractDicomService(String... strArr) {
        this.sopClasses = (String[]) strArr.clone();
    }

    private Attributes readDataset(PresentationContext presentationContext, PDVInputStream pDVInputStream) throws IOException {
        if (pDVInputStream == null) {
            return null;
        }
        Attributes dataset = pDVInputStream.readDataset(presentationContext.getTransferSyntax());
        Dimse.LOG.debug("Dataset:\n{}", dataset);
        return dataset;
    }

    @Override // org.dcm4che3.net.service.DicomService
    public final String[] getSOPClasses() {
        return this.sopClasses;
    }

    @Override // org.dcm4che3.net.DimseRQHandler
    public void onClose(Association association) {
    }

    public abstract void onDimseRQ(Association association, PresentationContext presentationContext, Dimse dimse, Attributes attributes, Attributes attributes2) throws IOException;

    @Override // org.dcm4che3.net.DimseRQHandler
    public void onDimseRQ(Association association, PresentationContext presentationContext, Dimse dimse, Attributes attributes, PDVInputStream pDVInputStream) throws IOException {
        onDimseRQ(association, presentationContext, dimse, attributes, readDataset(presentationContext, pDVInputStream));
    }
}
