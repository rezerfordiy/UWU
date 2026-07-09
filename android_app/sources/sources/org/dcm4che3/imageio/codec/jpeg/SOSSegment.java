package org.dcm4che3.imageio.codec.jpeg;

import org.dcm4che3.util.ByteUtils;

/* JADX INFO: loaded from: classes.dex */
public class SOSSegment {
    private final byte[] data;
    private final int numComponents;
    private final int offset;

    public SOSSegment(byte[] bArr, int i4) {
        this.data = bArr;
        this.offset = i4;
        this.numComponents = bArr[i4 + 3] & 255;
        getAl();
    }

    public int getAh() {
        return (this.data[(this.offset + 6) + (this.numComponents * 2)] >> 4) & 15;
    }

    public int getAl() {
        return this.data[this.offset + 6 + (this.numComponents * 2)] & 15;
    }

    public int getComponentID(int i4) {
        return this.data[this.offset + 4 + (i4 * 2)] & 255;
    }

    public int getHeaderLength() {
        return ByteUtils.bytesToUShortBE(this.data, this.offset + 1);
    }

    public int getILV() {
        return getSe();
    }

    public int getMarker() {
        return this.data[this.offset] & 255;
    }

    public int getNear() {
        return getSs();
    }

    public int getNumComponents() {
        return this.numComponents;
    }

    public int getSe() {
        return this.data[this.offset + 5 + (this.numComponents * 2)] & 255;
    }

    public int getSs() {
        return this.data[this.offset + 4 + (this.numComponents * 2)] & 255;
    }

    public int getTa(int i4) {
        return (this.data[(this.offset + 5) + (i4 * 2)] >> 4) & 15;
    }

    public int getTd(int i4) {
        return this.data[this.offset + 5 + (i4 * 2)] & 15;
    }

    public int offset() {
        return this.offset;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SOS=[Ls=");
        sb.append(getHeaderLength());
        sb.append(", Ns=");
        sb.append(this.numComponents);
        int i4 = 0;
        while (i4 < this.numComponents) {
            sb.append(", C");
            int i5 = i4 + 1;
            sb.append(i5);
            sb.append('=');
            sb.append(getComponentID(i4));
            sb.append(", Td");
            sb.append(i5);
            sb.append('=');
            sb.append(getTd(i4));
            sb.append(", Ta");
            sb.append(i5);
            sb.append('=');
            sb.append(getTa(i4));
            i4 = i5;
        }
        sb.append(", Ss=");
        sb.append(getSs());
        sb.append(", Se=");
        sb.append(getSe());
        sb.append(", Ah=");
        sb.append(getAh());
        sb.append(", Al=");
        sb.append(getAl());
        sb.append(']');
        return sb.toString();
    }
}
