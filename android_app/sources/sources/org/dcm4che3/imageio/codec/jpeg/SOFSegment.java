package org.dcm4che3.imageio.codec.jpeg;

import org.dcm4che3.util.ByteUtils;

/* JADX INFO: loaded from: classes.dex */
public class SOFSegment {
    private final byte[] data;
    private final int numComponents;
    private final int offset;

    public SOFSegment(byte[] bArr, int i4) {
        this.data = bArr;
        this.offset = i4;
        int i5 = bArr[i4 + 8] & 255;
        this.numComponents = i5;
        getQTableSelector(i5 - 1);
    }

    public int getComponentID(int i4) {
        return this.data[this.offset + 9 + (i4 * 3)] & 255;
    }

    public int getHeaderLength() {
        return ByteUtils.bytesToUShortBE(this.data, this.offset + 1);
    }

    public int getMarker() {
        return this.data[this.offset] & 255;
    }

    public int getNumComponents() {
        return this.numComponents;
    }

    public int getPrecision() {
        return this.data[this.offset + 3] & 255;
    }

    public int getQTableSelector(int i4) {
        return this.data[this.offset + 11 + (i4 * 3)] & 255;
    }

    public int getX() {
        return ByteUtils.bytesToUShortBE(this.data, this.offset + 6);
    }

    public int getXSubsampling(int i4) {
        return (this.data[(this.offset + 10) + (i4 * 3)] >> 4) & 15;
    }

    public int getY() {
        return ByteUtils.bytesToUShortBE(this.data, this.offset + 4);
    }

    public int getYSubsampling(int i4) {
        return this.data[this.offset + 10 + (i4 * 3)] & 15;
    }

    public int offset() {
        return this.offset;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SOF");
        sb.append(getMarker() - 192);
        sb.append("[Lf=");
        sb.append(getHeaderLength());
        sb.append(", P=");
        sb.append(getPrecision());
        sb.append(", Y=");
        sb.append(getY());
        sb.append(", X=");
        sb.append(getX());
        sb.append(", Nf=");
        sb.append(this.numComponents);
        int i4 = 0;
        while (i4 < this.numComponents) {
            sb.append(", C");
            int i5 = i4 + 1;
            sb.append(i5);
            sb.append('=');
            sb.append(getComponentID(i4));
            sb.append(", H");
            sb.append(i5);
            sb.append('=');
            sb.append(getXSubsampling(i4));
            sb.append(", V");
            sb.append(i5);
            sb.append('=');
            sb.append(getYSubsampling(i4));
            sb.append(", Tq");
            sb.append(i5);
            sb.append('=');
            sb.append(getQTableSelector(i4));
            i4 = i5;
        }
        sb.append(']');
        return sb.toString();
    }
}
