package org.dcm4che3.io;

/* JADX INFO: loaded from: classes.dex */
public class DicomEncodingOptions {
    public static final DicomEncodingOptions DEFAULT = new DicomEncodingOptions(false, true, false, true, false);
    public final boolean groupLength;
    public final boolean undefEmptyItemLength;
    public final boolean undefEmptySequenceLength;
    public final boolean undefItemLength;
    public final boolean undefSequenceLength;

    public DicomEncodingOptions(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (z5 && !z4) {
            throw new IllegalArgumentException("undefEmptySeqLength && !undefSeqLength");
        }
        if (z7 && !z6) {
            throw new IllegalArgumentException("undefEmptyItemLength && !undefItemLength");
        }
        this.groupLength = z3;
        this.undefSequenceLength = z4;
        this.undefEmptySequenceLength = z5;
        this.undefItemLength = z6;
        this.undefEmptyItemLength = z7;
    }
}
