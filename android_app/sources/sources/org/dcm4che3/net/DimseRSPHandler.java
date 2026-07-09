package org.dcm4che3.net;

import java.io.IOException;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.net.pdu.PresentationContext;

/* JADX INFO: loaded from: classes.dex */
public class DimseRSPHandler {
    private final int msgId;
    private PresentationContext pc;
    private Timeout timeout;

    public DimseRSPHandler(int i4) {
        this.msgId = i4;
    }

    private void stopTimeout(Association association) {
        Timeout timeout = this.timeout;
        if (timeout != null) {
            timeout.stop();
            this.timeout = null;
        }
    }

    public void cancel(Association association) throws IOException {
        association.cancel(this.pc, this.msgId);
    }

    public final int getMessageID() {
        return this.msgId;
    }

    public void onClose(Association association) {
        stopTimeout(association);
    }

    public void onDimseRSP(Association association, Attributes attributes, Attributes attributes2) {
        stopTimeout(association);
    }

    public final void setPC(PresentationContext presentationContext) {
        this.pc = presentationContext;
    }

    public final void setTimeout(Timeout timeout) {
        this.timeout = timeout;
    }
}
