package org.dcm4che3.imageio.codec.jpeg;

/* JADX INFO: loaded from: classes.dex */
public enum PatchJPEGLS {
    JAI2ISO,
    ISO2JAI,
    ISO2JAI_IF_APP_OR_COM;

    public JPEGLSCodingParam createJPEGLSCodingParam(byte[] bArr) {
        int i4;
        JPEGHeader jPEGHeader = new JPEGHeader(bArr, JPEG.SOS);
        int iOffsetOf = jPEGHeader.offsetOf(JPEG.SOI);
        int iOffsetOf2 = jPEGHeader.offsetOf(JPEG.SOF55);
        int iOffsetOf3 = jPEGHeader.offsetOf(JPEG.LSE);
        int iOffsetOf4 = jPEGHeader.offsetOf(JPEG.SOS);
        if (iOffsetOf == -1 || iOffsetOf2 == -1 || iOffsetOf3 != -1 || iOffsetOf4 == -1) {
            return null;
        }
        if ((this == ISO2JAI_IF_APP_OR_COM && jPEGHeader.numberOfMarkers() == 3) || (i4 = bArr[iOffsetOf2 + 3] & 255) <= 12) {
            return null;
        }
        JPEGLSCodingParam jAIJPEGLSCodingParam = this == JAI2ISO ? JPEGLSCodingParam.getJAIJPEGLSCodingParam(i4) : JPEGLSCodingParam.getDefaultJPEGLSCodingParam(i4, bArr[iOffsetOf4 + 6] & 255);
        jAIJPEGLSCodingParam.setOffset(iOffsetOf4 - 1);
        return jAIJPEGLSCodingParam;
    }
}
