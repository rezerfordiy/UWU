package org.dcm4che3.data;

import java.io.IOException;
import org.dcm4che3.io.DicomEncodingOptions;
import org.dcm4che3.io.DicomOutputStream;
import org.dcm4che3.util.ByteUtils;
import s0.a;

/* JADX INFO: loaded from: classes.dex */
public interface Value {
    public static final Value NULL = new Value() { // from class: org.dcm4che3.data.Value.1
        @Override // org.dcm4che3.data.Value
        public int calcLength(DicomEncodingOptions dicomEncodingOptions, boolean z3, VR vr) {
            return (vr == VR.SQ && dicomEncodingOptions.undefEmptySequenceLength) ? 8 : 0;
        }

        @Override // org.dcm4che3.data.Value
        public int getEncodedLength(DicomEncodingOptions dicomEncodingOptions, boolean z3, VR vr) {
            return (vr == VR.SQ && dicomEncodingOptions.undefEmptySequenceLength) ? -1 : 0;
        }

        @Override // org.dcm4che3.data.Value
        public boolean isEmpty() {
            return true;
        }

        @Override // org.dcm4che3.data.Value
        public byte[] toBytes(VR vr, boolean z3) {
            return ByteUtils.EMPTY_BYTES;
        }

        public String toString() {
            return a.f11071l;
        }

        @Override // org.dcm4che3.data.Value
        public void writeTo(DicomOutputStream dicomOutputStream, VR vr) throws IOException {
        }
    };

    int calcLength(DicomEncodingOptions dicomEncodingOptions, boolean z3, VR vr);

    int getEncodedLength(DicomEncodingOptions dicomEncodingOptions, boolean z3, VR vr);

    boolean isEmpty();

    byte[] toBytes(VR vr, boolean z3) throws IOException;

    void writeTo(DicomOutputStream dicomOutputStream, VR vr) throws IOException;
}
