package org.dcm4che3.imageio.stream;

import java.io.IOException;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageInputStreamImpl;
import org.dcm4che3.data.BulkData;
import org.dcm4che3.data.Fragments;

/* JADX INFO: loaded from: classes.dex */
public class SegmentedInputImageStream extends ImageInputStreamImpl {
    private int curSegment;
    private long curSegmentEnd;
    private final int[] segmentLengths;
    private final long[] segmentPositionsList;
    private final ImageInputStream stream;

    public SegmentedInputImageStream(ImageInputStream imageInputStream, Fragments fragments, int i4) throws IOException {
        int size = fragments.size() - (i4 + 1);
        long[] jArr = new long[size];
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            BulkData bulkData = (BulkData) fragments.get(i5 + i4 + 1);
            jArr[i5] = bulkData.offset();
            iArr[i5] = bulkData.length();
        }
        this.stream = imageInputStream;
        this.segmentPositionsList = jArr;
        this.segmentLengths = iArr;
        seek(0L);
    }

    private int offsetOf(int i4) {
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += this.segmentLengths[i6];
        }
        return i5;
    }

    private boolean prepareRead() throws IOException {
        if (this.curSegment < 0) {
            return false;
        }
        if (this.streamPos < this.curSegmentEnd) {
            return true;
        }
        if (this.curSegment >= this.segmentPositionsList.length) {
            return false;
        }
        seek(offsetOf(r0 + 1));
        return true;
    }

    public int read() throws IOException {
        if (!prepareRead()) {
            return -1;
        }
        this.bitOffset = 0;
        int i4 = this.stream.read();
        if (i4 != -1) {
            this.streamPos++;
        }
        return i4;
    }

    public void seek(long j4) throws IOException {
        super.seek(j4);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.segmentLengths;
            if (i4 >= iArr.length) {
                this.curSegment = -1;
                return;
            }
            int i6 = iArr[i4] + i5;
            long j5 = i6;
            if (j4 < j5) {
                this.stream.seek((this.segmentPositionsList[i4] + j4) - ((long) i5));
                this.curSegment = i4;
                this.curSegmentEnd = j5;
                return;
            }
            i4++;
            i5 = i6;
        }
    }

    public SegmentedInputImageStream(ImageInputStream imageInputStream, long[] jArr, int[] iArr) throws IOException {
        this.stream = imageInputStream;
        this.segmentPositionsList = (long[]) jArr.clone();
        this.segmentLengths = (int[]) iArr.clone();
        seek(0L);
    }

    public int read(byte[] bArr, int i4, int i5) throws IOException {
        if (!prepareRead()) {
            return -1;
        }
        this.bitOffset = 0;
        int i6 = this.stream.read(bArr, i4, Math.min(i5, (int) (this.curSegmentEnd - this.streamPos)));
        if (i6 != -1) {
            this.streamPos += (long) i6;
        }
        return i6;
    }
}
