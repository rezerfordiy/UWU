package org.dcm4che3.net;

import java.io.IOException;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.Tag;

/* JADX INFO: loaded from: classes.dex */
public class FutureDimseRSP extends DimseRSPHandler implements DimseRSP {
    private int autoCancel;
    private Entry entry;
    private IOException ex;
    private boolean finished;

    public static class Entry {
        final Attributes command;
        final Attributes dataset;
        Entry next;

        public Entry(Attributes attributes, Attributes attributes2) {
            this.command = attributes;
            this.dataset = attributes2;
        }
    }

    public FutureDimseRSP(int i4) {
        super(i4);
        this.entry = new Entry(null, null);
    }

    @Override // org.dcm4che3.net.DimseRSPHandler, org.dcm4che3.net.DimseRSP
    public void cancel(Association association) throws IOException {
        IOException iOException = this.ex;
        if (iOException != null) {
            throw iOException;
        }
        if (this.finished) {
            return;
        }
        super.cancel(association);
    }

    @Override // org.dcm4che3.net.DimseRSP
    public final Attributes getCommand() {
        return this.entry.command;
    }

    @Override // org.dcm4che3.net.DimseRSP
    public final Attributes getDataset() {
        return this.entry.dataset;
    }

    @Override // org.dcm4che3.net.DimseRSP
    public synchronized boolean next() throws InterruptedException, IOException {
        if (this.entry.next == null) {
            if (this.finished) {
                return false;
            }
            while (this.entry.next == null && this.ex == null) {
                wait();
            }
            IOException iOException = this.ex;
            if (iOException != null) {
                throw iOException;
            }
        }
        this.entry = this.entry.next;
        return true;
    }

    @Override // org.dcm4che3.net.DimseRSPHandler
    public synchronized void onClose(Association association) {
        super.onClose(association);
        if (!this.finished) {
            IOException exception = association.getException();
            this.ex = exception;
            if (exception == null) {
                this.ex = new IOException("Association to " + association.getRemoteAET() + " released before receive of outstanding DIMSE RSP");
            }
            notifyAll();
        }
    }

    @Override // org.dcm4che3.net.DimseRSPHandler
    public synchronized void onDimseRSP(Association association, Attributes attributes, Attributes attributes2) {
        super.onDimseRSP(association, attributes, attributes2);
        Entry entry = this.entry;
        while (true) {
            Entry entry2 = entry.next;
            if (entry2 == null) {
                break;
            } else {
                entry = entry2;
            }
        }
        entry.next = new Entry(attributes, attributes2);
        if (Status.isPending(attributes.getInt(Tag.Status, 0))) {
            int i4 = this.autoCancel;
            if (i4 > 0) {
                int i5 = i4 - 1;
                this.autoCancel = i5;
                if (i5 == 0) {
                    try {
                        super.cancel(association);
                    } catch (IOException e4) {
                        this.ex = e4;
                    }
                }
            }
        }
        this.finished = true;
        notifyAll();
    }

    public final void setAutoCancel(int i4) {
        this.autoCancel = i4;
    }
}
