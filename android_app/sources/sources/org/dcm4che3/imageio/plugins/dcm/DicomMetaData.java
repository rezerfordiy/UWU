package org.dcm4che3.imageio.plugins.dcm;

import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.metadata.IIOMetadata;
import org.dcm4che3.data.Attributes;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes.dex */
public class DicomMetaData extends IIOMetadata {
    private final Attributes attributes;
    private final Attributes fileMetaInformation;

    public DicomMetaData(Attributes attributes, Attributes attributes2) {
        this.fileMetaInformation = attributes;
        this.attributes = attributes2;
    }

    public Node getAsTree(String str) {
        throw new UnsupportedOperationException();
    }

    public final Attributes getAttributes() {
        return this.attributes;
    }

    public final Attributes getFileMetaInformation() {
        return this.fileMetaInformation;
    }

    public boolean isReadOnly() {
        return true;
    }

    public void mergeTree(String str, Node node) throws IIOInvalidTreeException {
        throw new UnsupportedOperationException();
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }
}
