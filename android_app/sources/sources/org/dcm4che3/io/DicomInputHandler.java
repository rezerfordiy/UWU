package org.dcm4che3.io;

import java.io.IOException;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.Fragments;
import org.dcm4che3.data.Sequence;

/* JADX INFO: loaded from: classes.dex */
public interface DicomInputHandler {
    void endDataset(DicomInputStream dicomInputStream) throws IOException;

    void readValue(DicomInputStream dicomInputStream, Attributes attributes) throws IOException;

    void readValue(DicomInputStream dicomInputStream, Fragments fragments) throws IOException;

    void readValue(DicomInputStream dicomInputStream, Sequence sequence) throws IOException;

    void startDataset(DicomInputStream dicomInputStream) throws IOException;
}
