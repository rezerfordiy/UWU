package org.dcm4che3.data;

import java.io.UnsupportedEncodingException;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public class SpecificCharacterSet {
    public static final SpecificCharacterSet ASCII;
    private static SpecificCharacterSet DEFAULT;
    private static ThreadLocal<SoftReference<Encoder>> cachedEncoder1;
    private static ThreadLocal<SoftReference<Encoder>> cachedEncoder2;
    protected final Codec[] codecs;
    protected final String[] dicomCodes;

    public enum Codec {
        ISO_646("US-ASCII", true, 10306, 0, 1),
        ISO_8859_1("ISO-8859-1", true, 10306, 11585, 1),
        ISO_8859_2("ISO-8859-2", true, 10306, 11586, 1),
        ISO_8859_3("ISO-8859-3", true, 10306, 11587, 1),
        ISO_8859_4("ISO-8859-4", true, 10306, 11588, 1),
        ISO_8859_5("ISO-8859-5", true, 10306, 11596, 1),
        ISO_8859_6("ISO-8859-6", true, 10306, 11591, 1),
        ISO_8859_7("ISO-8859-7", true, 10306, 11590, 1),
        ISO_8859_8("ISO-8859-8", true, 10306, 11592, 1),
        ISO_8859_9("ISO-8859-9", true, 10306, 11597, 1),
        JIS_X_201("JIS_X0201", true, 10314, 10569, 1) { // from class: org.dcm4che3.data.SpecificCharacterSet.Codec.1
            @Override // org.dcm4che3.data.SpecificCharacterSet.Codec
            public String toText(String str) {
                return str.replace('\\', (char) 165);
            }
        },
        TIS_620("TIS-620", true, 10306, 11604, 1),
        JIS_X_208("x-JIS0208", false, 9282, 0, 1),
        JIS_X_212("JIS_X0212-1990", false, 2369604, 0, 2),
        KS_X_1001("EUC-KR", false, 10306, 2369859, -1),
        GB2312("GB2312", false, 10306, 2369857, -1),
        UTF_8("UTF-8", true, 0, 0, -1),
        GB18030("GB18030", false, 0, 0, -1);

        private final int bytesPerChar;
        private final String charsetName;
        private final boolean containsASCII;
        private final int escSeq0;
        private final int escSeq1;

        Codec(String str, boolean z3, int i4, int i5, int i6) {
            this.charsetName = str;
            this.containsASCII = z3;
            this.escSeq0 = i4;
            this.escSeq1 = i5;
            this.bytesPerChar = i6;
        }

        public static Codec forCode(String str) {
            if (str == null) {
                return ISO_646;
            }
            int iLast2digits = last2digits(str);
            if (iLast2digits != 0) {
                if (iLast2digits != 1) {
                    if (iLast2digits != 6) {
                        if (iLast2digits != 13) {
                            if (iLast2digits != 38) {
                                if (iLast2digits != 44) {
                                    if (iLast2digits != 66) {
                                        if (iLast2digits != 87) {
                                            if (iLast2digits != 92) {
                                                if (iLast2digits != 9) {
                                                    if (iLast2digits != 10) {
                                                        if (iLast2digits != 26) {
                                                            if (iLast2digits != 27) {
                                                                if (iLast2digits != 30) {
                                                                    if (iLast2digits != 31) {
                                                                        if (iLast2digits != 48) {
                                                                            if (iLast2digits != 49) {
                                                                                if (iLast2digits != 58) {
                                                                                    if (iLast2digits == 59 && str.equals("ISO 2022 IR 159")) {
                                                                                        return JIS_X_212;
                                                                                    }
                                                                                } else if (str.equals("ISO 2022 IR 58")) {
                                                                                    return GB2312;
                                                                                }
                                                                            } else if (str.equals("ISO 2022 IR 149")) {
                                                                                return KS_X_1001;
                                                                            }
                                                                        } else if (str.equals("ISO_IR 148") || str.equals("ISO 2022 IR 148")) {
                                                                            return ISO_8859_9;
                                                                        }
                                                                    } else if (str.equals("GBK")) {
                                                                        return GB18030;
                                                                    }
                                                                } else if (str.equals("GB18030")) {
                                                                    return GB18030;
                                                                }
                                                            } else if (str.equals("ISO_IR 127") || str.equals("ISO 2022 IR 127")) {
                                                                return ISO_8859_6;
                                                            }
                                                        } else if (str.equals("ISO_IR 126") || str.equals("ISO 2022 IR 126")) {
                                                            return ISO_8859_7;
                                                        }
                                                    } else if (str.equals("ISO_IR 110") || str.equals("ISO 2022 IR 110")) {
                                                        return ISO_8859_4;
                                                    }
                                                } else if (str.equals("ISO_IR 109") || str.equals("ISO 2022 IR 109")) {
                                                    return ISO_8859_3;
                                                }
                                            } else if (str.equals("ISO_IR 192")) {
                                                return UTF_8;
                                            }
                                        } else if (str.equals("ISO 2022 IR 87")) {
                                            return JIS_X_208;
                                        }
                                    } else if (str.equals("ISO_IR 166") || str.equals("ISO 2022 IR 166")) {
                                        return TIS_620;
                                    }
                                } else if (str.equals("ISO_IR 144") || str.equals("ISO 2022 IR 144")) {
                                    return ISO_8859_5;
                                }
                            } else if (str.equals("ISO_IR 138") || str.equals("ISO 2022 IR 138")) {
                                return ISO_8859_8;
                            }
                        } else if (str.equals("ISO_IR 13") || str.equals("ISO 2022 IR 13")) {
                            return JIS_X_201;
                        }
                    } else if (str.equals("ISO 2022 IR 6")) {
                        return ISO_646;
                    }
                } else if (str.equals("ISO_IR 101") || str.equals("ISO 2022 IR 101")) {
                    return ISO_8859_2;
                }
            } else if (str.equals("ISO_IR 100") || str.equals("ISO 2022 IR 100")) {
                return ISO_8859_1;
            }
            return ISO_646;
        }

        private static int last2digits(String str) {
            int length = str.length();
            if (length < 2) {
                return -1;
            }
            return ((str.charAt(length - 2) & 15) * 10) + (str.charAt(length - 1) & 15);
        }

        public boolean containsASCII() {
            return this.containsASCII;
        }

        public String decode(byte[] bArr, int i4, int i5) {
            try {
                return new String(bArr, i4, i5, this.charsetName);
            } catch (UnsupportedEncodingException e4) {
                throw new AssertionError(e4);
            }
        }

        public byte[] encode(String str) {
            try {
                return str.getBytes(this.charsetName);
            } catch (UnsupportedEncodingException e4) {
                throw new AssertionError(e4);
            }
        }

        public int getBytesPerChar() {
            return this.bytesPerChar;
        }

        public int getEscSeq0() {
            return this.escSeq0;
        }

        public int getEscSeq1() {
            return this.escSeq1;
        }

        public String toText(String str) {
            return str;
        }
    }

    public static final class Encoder {
        final Codec codec;
        final CharsetEncoder encoder;

        public Encoder(Codec codec) {
            this.codec = codec;
            this.encoder = Charset.forName(codec.charsetName).newEncoder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void escSeq(ByteBuffer byteBuffer, int i4) {
            if (i4 == 0) {
                return;
            }
            byteBuffer.put((byte) 27);
            int i5 = i4 >> 16;
            if (i5 != 0) {
                byteBuffer.put((byte) i5);
            }
            byteBuffer.put((byte) (i4 >> 8));
            byteBuffer.put((byte) i4);
        }

        public boolean encode(CharBuffer charBuffer, ByteBuffer byteBuffer, int i4, CodingErrorAction codingErrorAction) {
            this.encoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).reset();
            int iPosition = charBuffer.position();
            int iPosition2 = byteBuffer.position();
            try {
                escSeq(byteBuffer, i4);
                CoderResult coderResultEncode = this.encoder.encode(charBuffer, byteBuffer, true);
                if (!coderResultEncode.isUnderflow()) {
                    coderResultEncode.throwException();
                }
                CoderResult coderResultFlush = this.encoder.flush(byteBuffer);
                if (!coderResultFlush.isUnderflow()) {
                    coderResultFlush.throwException();
                }
                return true;
            } catch (CharacterCodingException unused) {
                charBuffer.position(iPosition);
                byteBuffer.position(iPosition2);
                return false;
            }
        }

        public byte[] replacement() {
            return this.encoder.replacement();
        }
    }

    public static final class ISO2022 extends SpecificCharacterSet {
        private ISO2022(Codec[] codecArr, String... strArr) {
            super(codecArr, strArr);
        }

        private void activateInitialCharacterSet(ByteBuffer byteBuffer, int[] iArr) {
            if (iArr[0] != 0) {
                Encoder.escSeq(byteBuffer, this.codecs[0].getEscSeq0());
                iArr[0] = 0;
            }
            if (iArr[1] != 0) {
                Encoder.escSeq(byteBuffer, this.codecs[0].getEscSeq1());
                iArr[1] = 0;
            }
        }

        private void encodeComponent(Encoder[] encoderArr, CharBuffer charBuffer, ByteBuffer byteBuffer, int[] iArr) {
            int i4 = 0;
            if (this.codecs[iArr[1]].getEscSeq1() == 0 || !encoderArr[iArr[1]].encode(charBuffer, byteBuffer, 0, CodingErrorAction.REPORT)) {
                if ((this.codecs[iArr[1]].getEscSeq1() == 0 || this.codecs[iArr[1]].getEscSeq0() != this.codecs[iArr[0]].getEscSeq0()) && encoderArr[iArr[0]].encode(charBuffer, byteBuffer, 0, CodingErrorAction.REPORT)) {
                    return;
                }
                int length = encoderArr.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    if (encoderArr[length] == null) {
                        encoderArr[length] = new Encoder(this.codecs[length]);
                    }
                    if (this.codecs[length].getEscSeq1() != 0) {
                        if (encoderArr[length].encode(charBuffer, byteBuffer, this.codecs[length].getEscSeq1(), CodingErrorAction.REPORT)) {
                            iArr[1] = length;
                            break;
                        }
                    } else if (encoderArr[length].encode(charBuffer, byteBuffer, this.codecs[length].getEscSeq0(), CodingErrorAction.REPORT)) {
                        iArr[0] = length;
                        break;
                    }
                }
                if (length < 0) {
                    if (charBuffer.length() <= 1) {
                        byteBuffer.put(encoderArr[iArr[0]].replacement());
                        return;
                    }
                    while (i4 < charBuffer.length()) {
                        int i5 = i4 + 1;
                        encodeComponent(encoderArr, charBuffer.subSequence(i4, i5), byteBuffer, iArr);
                        i4 = i5;
                    }
                }
            }
        }

        private void switchCodec(Codec[] codecArr, int i4, Codec codec) {
            codecArr[i4] = codec;
            if (codecArr[0].getEscSeq0() == codecArr[1].getEscSeq0()) {
                codecArr[0] = codecArr[1];
            }
        }

        @Override // org.dcm4che3.data.SpecificCharacterSet
        public String decode(byte[] bArr) {
            Codec codec;
            Codec codec2;
            Codec codec3;
            Codec[] codecArr = this.codecs;
            Codec[] codecArr2 = {codecArr[0], codecArr[0]};
            StringBuilder sb = new StringBuilder(bArr.length);
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < bArr.length) {
                byte b4 = bArr[i4];
                if (b4 == 27) {
                    if (i5 < i4) {
                        sb.append(codecArr2[i6].decode(bArr, i5, i4 - i5));
                    }
                    int i7 = i4 + 3;
                    int i8 = ((bArr[i7 - 2] & 255) << 8) + (bArr[i7 - 1] & 255);
                    if (i8 != 9256) {
                        if (i8 != 9257) {
                            if (i8 == 9282) {
                                codecArr2[0] = Codec.JIS_X_208;
                            } else if (i8 == 10306) {
                                switchCodec(codecArr2, 0, Codec.ISO_646);
                            } else if (i8 == 10314) {
                                codecArr2[0] = Codec.JIS_X_201;
                                if (codecArr2[1].getEscSeq1() == 0) {
                                    codecArr2[1] = codecArr2[0];
                                }
                            } else if (i8 != 10569) {
                                if (i8 == 11604) {
                                    codec3 = Codec.TIS_620;
                                } else if (i8 == 11596) {
                                    codec3 = Codec.ISO_8859_5;
                                } else if (i8 != 11597) {
                                    switch (i8) {
                                        case 11585:
                                            codec3 = Codec.ISO_8859_1;
                                            break;
                                        case 11586:
                                            codec3 = Codec.ISO_8859_2;
                                            break;
                                        case 11587:
                                            codec3 = Codec.ISO_8859_3;
                                            break;
                                        case 11588:
                                            codec3 = Codec.ISO_8859_4;
                                            break;
                                        default:
                                            switch (i8) {
                                                case 11590:
                                                    codec3 = Codec.ISO_8859_7;
                                                    break;
                                                case 11591:
                                                    codec3 = Codec.ISO_8859_6;
                                                    break;
                                                case 11592:
                                                    codec3 = Codec.ISO_8859_8;
                                                    break;
                                                default:
                                                    sb.append(codecArr2[0].decode(bArr, i7 - 3, 3));
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    codec3 = Codec.ISO_8859_9;
                                }
                                switchCodec(codecArr2, 1, codec3);
                            } else {
                                codecArr2[1] = Codec.JIS_X_201;
                            }
                            i5 = i7;
                        } else {
                            i5 = i7 + 1;
                            byte b5 = bArr[i7];
                            if (b5 == 65) {
                                codec2 = Codec.GB2312;
                            } else if (b5 != 67) {
                                codec = codecArr2[0];
                                sb.append(codec.decode(bArr, i5 - 4, 4));
                            } else {
                                codec2 = Codec.KS_X_1001;
                            }
                            switchCodec(codecArr2, 1, codec2);
                        }
                        i4 = i5;
                    } else {
                        i5 = i7 + 1;
                        if (bArr[i7] == 68) {
                            codecArr2[0] = Codec.JIS_X_212;
                            i4 = i5;
                        } else {
                            codec = codecArr2[0];
                            sb.append(codec.decode(bArr, i5 - 4, 4));
                            i4 = i5;
                        }
                    }
                } else {
                    if (codecArr2[0] != codecArr2[1]) {
                        if (i6 == (b4 < 0 ? 0 : 1)) {
                            if (i5 < i4) {
                                sb.append(codecArr2[i6].decode(bArr, i5, i4 - i5));
                            }
                            i6 = 1 - i6;
                            i5 = i4;
                        }
                    }
                    int bytesPerChar = codecArr2[i6].getBytesPerChar();
                    if (bytesPerChar <= 0) {
                        bytesPerChar = bArr[i4] < 0 ? 2 : 1;
                    }
                    i4 += bytesPerChar;
                }
            }
            if (i5 < i4) {
                sb.append(codecArr2[i6].decode(bArr, i5, i4 - i5));
            }
            return sb.toString();
        }

        @Override // org.dcm4che3.data.SpecificCharacterSet
        public byte[] encode(String str, String str2) {
            int length = str.length();
            CharBuffer charBufferWrap = CharBuffer.wrap(str.toCharArray());
            Encoder encoder = SpecificCharacterSet.encoder(SpecificCharacterSet.cachedEncoder1, this.codecs[0]);
            byte[] bArr = new byte[length];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            if (!encoder.encode(charBufferWrap, byteBufferWrap, 0, CodingErrorAction.REPORT)) {
                Encoder[] encoderArr = new Encoder[this.codecs.length];
                encoderArr[0] = encoder;
                encoderArr[1] = SpecificCharacterSet.encoder(SpecificCharacterSet.cachedEncoder2, this.codecs[1]);
                StringTokenizer stringTokenizer = new StringTokenizer(str, str2, true);
                bArr = new byte[(length * 2) + ((stringTokenizer.countTokens() + 1) * 4)];
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
                int[] iArr = {0, 0};
                while (stringTokenizer.hasMoreTokens()) {
                    String strNextToken = stringTokenizer.nextToken();
                    if (strNextToken.length() != 1 || str2.indexOf(strNextToken.charAt(0)) < 0) {
                        encodeComponent(encoderArr, CharBuffer.wrap(strNextToken.toCharArray()), byteBufferWrap2, iArr);
                    } else {
                        activateInitialCharacterSet(byteBufferWrap2, iArr);
                        byteBufferWrap2.put((byte) strNextToken.charAt(0));
                    }
                }
                activateInitialCharacterSet(byteBufferWrap2, iArr);
                byteBufferWrap = byteBufferWrap2;
            }
            return Arrays.copyOf(bArr, byteBufferWrap.position());
        }
    }

    static {
        SpecificCharacterSet specificCharacterSet = new SpecificCharacterSet(new Codec[]{Codec.ISO_646}, new String[0]);
        ASCII = specificCharacterSet;
        DEFAULT = specificCharacterSet;
        cachedEncoder1 = new ThreadLocal<>();
        cachedEncoder2 = new ThreadLocal<>();
    }

    public SpecificCharacterSet(Codec[] codecArr, String... strArr) {
        this.codecs = codecArr;
        this.dicomCodes = strArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Encoder encoder(ThreadLocal<SoftReference<Encoder>> threadLocal, Codec codec) {
        Encoder encoder;
        SoftReference<Encoder> softReference = threadLocal.get();
        if (softReference != null && (encoder = softReference.get()) != null && encoder.codec == codec) {
            return encoder;
        }
        Encoder encoder2 = new Encoder(codec);
        threadLocal.set(new SoftReference<>(encoder2));
        return encoder2;
    }

    public static SpecificCharacterSet getDefaultCharacterSet() {
        return DEFAULT;
    }

    public static void setDefaultCharacterSet(String str) {
        SpecificCharacterSet specificCharacterSetValueOf = str != null ? valueOf(str) : ASCII;
        if (specificCharacterSetValueOf.containsASCII()) {
            DEFAULT = specificCharacterSetValueOf;
            return;
        }
        throw new IllegalArgumentException("Default Character Set must contain ASCII - " + str);
    }

    public static SpecificCharacterSet valueOf(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return DEFAULT;
        }
        Codec[] codecArr = new Codec[strArr.length];
        for (int i4 = 0; i4 < strArr.length; i4++) {
            codecArr[i4] = Codec.forCode(strArr[i4]);
        }
        return strArr.length > 1 ? new ISO2022(codecArr, strArr) : new SpecificCharacterSet(codecArr, strArr);
    }

    public boolean containsASCII() {
        return this.codecs[0].containsASCII();
    }

    public String decode(byte[] bArr) {
        return this.codecs[0].decode(bArr, 0, bArr.length);
    }

    public byte[] encode(String str, String str2) {
        return this.codecs[0].encode(str);
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.codecs, ((SpecificCharacterSet) obj).codecs);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.codecs);
    }

    public boolean isASCII() {
        return this.codecs[0].equals(Codec.ISO_646);
    }

    public boolean isUTF8() {
        return this.codecs[0].equals(Codec.UTF_8);
    }

    public String[] toCodes() {
        return this.dicomCodes;
    }

    public String toText(String str) {
        return this.codecs[0].toText(str);
    }
}
