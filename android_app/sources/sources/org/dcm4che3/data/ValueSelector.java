package org.dcm4che3.data;

import java.io.Serializable;
import java.util.ArrayList;
import org.dcm4che3.util.TagUtils;

/* JADX INFO: loaded from: classes.dex */
public class ValueSelector implements Serializable {
    private static final int MIN_ITEM_POINTER_STR_LEN = 43;
    private static final ItemPointer[] NO_ITEMPOINTERS = new ItemPointer[0];
    private static final long serialVersionUID = 8346808223314626639L;
    public final ItemPointer[] itemPointers;
    public final String privateCreator;
    public String str;
    public final int tag;
    public final int valueIndex;
    public final VR vr;

    public ValueSelector(int i4, String str, VR vr, int i5, ItemPointer... itemPointerArr) {
        this.tag = i4;
        this.privateCreator = str;
        this.vr = vr;
        this.valueIndex = i5;
        this.itemPointers = (ItemPointer[]) itemPointerArr.clone();
    }

    private void appendTo(int i4, String str, int i5, String str2, String str3, StringBuilder sb) {
        sb.append("DicomAttribute[@tag=\"");
        sb.append(TagUtils.toHexString(i4));
        if (str != null) {
            sb.append("\" and @privateCreator=\"");
            sb.append(str);
        }
        if (this.vr != null) {
            sb.append("\" and @vr=\"");
            sb.append(this.vr);
        }
        sb.append(str2);
        sb.append(i5 + 1);
        sb.append(str3);
    }

    private String buildString() {
        StringBuilder sb = new StringBuilder(32);
        for (ItemPointer itemPointer : this.itemPointers) {
            appendTo(itemPointer.sequenceTag, itemPointer.privateCreator, itemPointer.itemIndex, "\"]/Item[@number=\"", "\"]/", sb);
        }
        appendTo(this.tag, this.privateCreator, this.valueIndex, "\"]/Value[@number=\"", "\"]", sb);
        return sb.toString();
    }

    private static ItemPointer[] itemPointersOf(String str, int i4) {
        if (i4 == 0) {
            return NO_ITEMPOINTERS;
        }
        ArrayList arrayList = new ArrayList();
        int iIndexOf = 0;
        while (iIndexOf < i4) {
            arrayList.add(new ItemPointer(selectTag(str, iIndexOf), selectPrivateCreator(str, iIndexOf), selectNumber(str, iIndexOf) - 1));
            iIndexOf = str.indexOf("DicomAttribute", iIndexOf + 43);
        }
        return (ItemPointer[]) arrayList.toArray(new ItemPointer[arrayList.size()]);
    }

    private static String select(String str, String str2, int i4) {
        int iIndexOf = str2.indexOf(str, i4);
        if (iIndexOf < 0) {
            return null;
        }
        int length = iIndexOf + str.length();
        int i5 = length + 1;
        return str2.substring(i5, str2.indexOf(str2.charAt(length), i5));
    }

    private static int selectNumber(String str, int i4) {
        return Integer.parseInt(select("@number=", str, i4));
    }

    private static String selectPrivateCreator(String str, int i4) {
        return select("@privateCreator=", str, i4);
    }

    private static int selectTag(String str, int i4) {
        return Integer.parseInt(select("@tag=", str, i4), 16);
    }

    private static VR selectVR(String str, int i4) {
        String strSelect = select("@vr=", str, i4);
        if (strSelect != null) {
            return VR.valueOf(strSelect);
        }
        return null;
    }

    public static ValueSelector valueOf(String str) {
        int iLastIndexOf = str.lastIndexOf("DicomAttribute");
        try {
            return new ValueSelector(selectTag(str, iLastIndexOf), selectPrivateCreator(str, iLastIndexOf), selectVR(str, iLastIndexOf), selectNumber(str, iLastIndexOf) - 1, itemPointersOf(str, iLastIndexOf));
        } catch (Exception unused) {
            throw new IllegalArgumentException(str);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof ValueSelector) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String selectStringValue(Attributes attributes, String str) {
        Attributes nestedDataset = attributes.getNestedDataset(this.itemPointers);
        return nestedDataset != null ? nestedDataset.getString(this.privateCreator, this.tag, this.vr, this.valueIndex, str) : str;
    }

    public String toString() {
        if (this.str == null) {
            this.str = buildString();
        }
        return this.str;
    }
}
