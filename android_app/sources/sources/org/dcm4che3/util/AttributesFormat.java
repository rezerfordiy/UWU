package org.dcm4che3.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.FieldPosition;
import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import org.dcm4che3.data.Attributes;
import s0.a;

/* JADX INFO: loaded from: classes.dex */
public class AttributesFormat extends Format {
    private static final long serialVersionUID = 1901510733531643054L;
    private final MessageFormat format;
    private final int[] index;
    private final String pattern;
    private final int[][] tagPaths;
    private final Type[] types;

    public enum Type {
        none { // from class: org.dcm4che3.util.AttributesFormat.Type.1
            @Override // org.dcm4che3.util.AttributesFormat.Type
            public Object toArg(Attributes attributes, int i4, int i5) {
                return attributes.getString(i4, i5);
            }
        },
        number { // from class: org.dcm4che3.util.AttributesFormat.Type.2
            @Override // org.dcm4che3.util.AttributesFormat.Type
            public Object toArg(Attributes attributes, int i4, int i5) {
                return Double.valueOf(attributes.getDouble(i4, i5, 0.0d));
            }
        },
        date { // from class: org.dcm4che3.util.AttributesFormat.Type.3
            @Override // org.dcm4che3.util.AttributesFormat.Type
            public Object toArg(Attributes attributes, int i4, int i5) {
                return i4 != 0 ? attributes.getDate(i4, i5) : new Date();
            }
        },
        time { // from class: org.dcm4che3.util.AttributesFormat.Type.4
            @Override // org.dcm4che3.util.AttributesFormat.Type
            public Object toArg(Attributes attributes, int i4, int i5) {
                return i4 != 0 ? attributes.getDate(i4, i5) : new Date();
            }
        },
        choice { // from class: org.dcm4che3.util.AttributesFormat.Type.5
            @Override // org.dcm4che3.util.AttributesFormat.Type
            public Object toArg(Attributes attributes, int i4, int i5) {
                return Double.valueOf(attributes.getDouble(i4, i5, 0.0d));
            }
        },
        hash { // from class: org.dcm4che3.util.AttributesFormat.Type.6
            @Override // org.dcm4che3.util.AttributesFormat.Type
            public Object toArg(Attributes attributes, int i4, int i5) {
                String string = attributes.getString(i4, i5);
                if (string != null) {
                    return TagUtils.toHexString(string.hashCode());
                }
                return null;
            }
        },
        urlencoded { // from class: org.dcm4che3.util.AttributesFormat.Type.7
            @Override // org.dcm4che3.util.AttributesFormat.Type
            public Object toArg(Attributes attributes, int i4, int i5) {
                String string = attributes.getString(i4, i5);
                if (string == null) {
                    return null;
                }
                try {
                    return URLEncoder.encode(string, "UTF-8");
                } catch (UnsupportedEncodingException e4) {
                    throw new AssertionError(e4);
                }
            }
        };

        public abstract Object toArg(Attributes attributes, int i4, int i5);
    }

    public AttributesFormat(String str) {
        ArrayList<String> arrayList = tokenize(str);
        int size = arrayList.size() / 2;
        this.pattern = str;
        this.tagPaths = new int[size][];
        this.index = new int[size];
        this.types = new Type[size];
        this.format = buildMessageFormat(arrayList);
    }

    private MessageFormat buildMessageFormat(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder(this.pattern.length());
        int i4 = 0;
        for (int i5 = 0; i5 < this.tagPaths.length; i5++) {
            int i6 = i4 + 1;
            sb.append(arrayList.get(i4));
            sb.append('{');
            sb.append(i5);
            i4 = i6 + 1;
            String strSubstring = arrayList.get(i6);
            int iIndexOf = strSubstring.indexOf(44) + 1;
            if (!strSubstring.startsWith("now")) {
                int length = iIndexOf != 0 ? iIndexOf - 1 : strSubstring.length();
                int i7 = length - 1;
                int iLastIndexOf = strSubstring.charAt(i7) == ']' ? strSubstring.lastIndexOf(91, length - 3) + 1 : 0;
                try {
                    int[][] iArr = this.tagPaths;
                    if (iLastIndexOf != 0) {
                        length = iLastIndexOf - 1;
                    }
                    iArr[i5] = TagUtils.parseTagPath(strSubstring.substring(0, length));
                    if (iLastIndexOf != 0) {
                        this.index[i5] = Integer.parseInt(strSubstring.substring(iLastIndexOf, i7));
                    }
                } catch (IllegalArgumentException unused) {
                    throw new IllegalArgumentException(this.pattern);
                }
            }
            if (iIndexOf != 0) {
                int iIndexOf2 = strSubstring.indexOf(44, iIndexOf);
                try {
                    Type[] typeArr = this.types;
                    if (iIndexOf2 < 0) {
                        iIndexOf2 = strSubstring.length();
                    }
                    typeArr[i5] = Type.valueOf(strSubstring.substring(iIndexOf, iIndexOf2));
                    Type type = this.types[i5];
                    if (type != Type.hash && type != Type.urlencoded) {
                        if (iIndexOf > 0) {
                            strSubstring = strSubstring.substring(iIndexOf - 1);
                        }
                        sb.append(strSubstring);
                    }
                } catch (IllegalArgumentException unused2) {
                    throw new IllegalArgumentException(this.pattern);
                }
            } else {
                this.types[i5] = Type.none;
            }
            sb.append('}');
        }
        if (i4 < arrayList.size()) {
            sb.append(arrayList.get(i4));
        }
        try {
            return new MessageFormat(sb.toString());
        } catch (IllegalArgumentException unused3) {
            throw new IllegalArgumentException(this.pattern);
        }
    }

    private Object[] toArgs(Attributes attributes) {
        int length = this.tagPaths.length;
        Object[] objArr = new Object[length];
        for (int i4 = 0; i4 < length; i4++) {
            int[] iArr = this.tagPaths[i4];
            if (iArr == null) {
                objArr[i4] = this.types[i4].toArg(attributes, 0, this.index[i4]);
            } else {
                int length2 = iArr.length - 1;
                Attributes nestedDataset = attributes;
                for (int i5 = 0; i5 < length2 && nestedDataset != null; i5++) {
                    nestedDataset = nestedDataset.getNestedDataset(iArr[i5]);
                }
                objArr[i4] = nestedDataset != null ? this.types[i4].toArg(nestedDataset, iArr[length2], this.index[i4]) : null;
            }
        }
        return objArr;
    }

    private ArrayList<String> tokenize(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(str, "{}", true);
        StringBuilder sb = new StringBuilder();
        char c4 = '}';
        int i4 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            char cCharAt = strNextToken.charAt(0);
            if (cCharAt == '{') {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(cCharAt);
                } else if (c4 == '}') {
                    arrayList.add(a.f11071l);
                }
                i4 = i5;
            } else if (cCharAt == '}') {
                i4--;
                if (i4 == 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                } else {
                    if (i4 <= 0) {
                        throw new IllegalArgumentException(str);
                    }
                    sb.append(cCharAt);
                }
            } else if (i4 == 0) {
                arrayList.add(strNextToken);
            } else {
                sb.append(strNextToken);
            }
            c4 = cCharAt;
        }
        return arrayList;
    }

    public static AttributesFormat valueOf(String str) {
        if (str != null) {
            return new AttributesFormat(str);
        }
        return null;
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.format.format(toArgs((Attributes) obj), stringBuffer, fieldPosition);
    }

    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return this.pattern;
    }
}
