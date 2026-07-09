package org.dcm4che3.data;

import java.util.ArrayList;
import java.util.List;
import org.dcm4che3.data.IOD;
import org.dcm4che3.data.VR;
import org.dcm4che3.util.ByteUtils;
import org.dcm4che3.util.StringUtils;
import org.dcm4che3.util.TagUtils;

/* JADX INFO: loaded from: classes.dex */
public class ValidationResult {
    private ArrayList<InvalidAttributeValue> invalidAttributeValues;
    private ArrayList<IOD.DataElement> missingAttributeValues;
    private ArrayList<IOD.DataElement> missingAttributes;
    private ArrayList<IOD.DataElement> notAllowedAttributes;

    public enum Invalid {
        VR,
        VM,
        Value,
        Item,
        MultipleItems,
        Code
    }

    public class InvalidAttributeValue {
        public final IOD.DataElement dataElement;
        public final ValidationResult[] itemValidationResults;
        public final IOD[] missingItems;
        public final Invalid reason;

        public InvalidAttributeValue(IOD.DataElement dataElement, Invalid invalid, ValidationResult[] validationResultArr, IOD[] iodArr) {
            this.dataElement = dataElement;
            this.reason = invalid;
            this.itemValidationResults = validationResultArr;
            this.missingItems = iodArr;
        }
    }

    private void appendAttribute(int i4, int i5, StringBuilder sb) {
        appendPrefixTo(i4, sb);
        sb.append(TagUtils.toString(i5));
        sb.append(' ');
        sb.append(ElementDictionary.keywordOf(i5, null));
    }

    private void appendIODRef(int i4, StringBuilder sb) {
        if (i4 > 0) {
            sb.append(" // IOD line #");
            sb.append(i4);
        }
    }

    private void appendInvalidAttributeValues(int i4, Attributes attributes, String str, StringBuilder sb) {
        appendPrefixTo(i4, sb);
        sb.append(str);
        sb.append(StringUtils.LINE_SEPARATOR);
        for (InvalidAttributeValue invalidAttributeValue : this.invalidAttributeValues) {
            int i5 = invalidAttributeValue.dataElement.tag;
            appendAttribute(i4, i5, sb);
            VR.Holder holder = new VR.Holder();
            Object value = attributes.getValue(i5, holder);
            sb.append(' ');
            sb.append(holder.vr);
            sb.append(" [");
            holder.vr.prompt(value, attributes.bigEndian(), attributes.getSpecificCharacterSet(holder.vr), 200, sb);
            sb.append(']');
            if (invalidAttributeValue.reason != Invalid.Item) {
                sb.append(" Invalid ");
                sb.append(invalidAttributeValue.reason);
                appendIODRef(invalidAttributeValue.dataElement.getLineNumber(), sb);
            }
            sb.append(StringUtils.LINE_SEPARATOR);
            IOD[] iodArr = invalidAttributeValue.missingItems;
            int i6 = 0;
            if (iodArr != null) {
                for (IOD iod : iodArr) {
                    appendPrefixTo(i4 + 1, sb);
                    sb.append("Missing Item");
                    appendIODRef(iod.getLineNumber(), sb);
                    sb.append(StringUtils.LINE_SEPARATOR);
                }
            }
            if (invalidAttributeValue.itemValidationResults != null) {
                Sequence sequence = (Sequence) value;
                while (true) {
                    ValidationResult[] validationResultArr = invalidAttributeValue.itemValidationResults;
                    if (i6 < validationResultArr.length) {
                        ValidationResult validationResult = validationResultArr[i6];
                        if (!validationResult.isValid()) {
                            int i7 = i4 + 1;
                            appendPrefixTo(i7, sb);
                            sb.append("Invalid Item ");
                            sb.append(i6 + 1);
                            sb.append(':');
                            sb.append(StringUtils.LINE_SEPARATOR);
                            validationResult.appendTextTo(i7, sequence.get(i6), sb);
                        }
                        i6++;
                    }
                }
            }
        }
    }

    private void appendPrefixTo(int i4, StringBuilder sb) {
        while (true) {
            int i5 = i4 - 1;
            if (i4 <= 0) {
                return;
            }
            sb.append('>');
            i4 = i5;
        }
    }

    private void appendTextTo(int i4, Attributes attributes, String str, List<IOD.DataElement> list, StringBuilder sb) {
        appendPrefixTo(i4, sb);
        sb.append(str);
        sb.append(StringUtils.LINE_SEPARATOR);
        for (IOD.DataElement dataElement : list) {
            appendAttribute(i4, dataElement.tag, sb);
            appendIODRef(dataElement.getLineNumber(), sb);
            sb.append(StringUtils.LINE_SEPARATOR);
        }
    }

    private int[] cat(int[]... iArr) {
        int length = 0;
        for (int[] iArr2 : iArr) {
            length += iArr2.length;
        }
        int[] iArr3 = new int[length];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return iArr3;
    }

    private static StringBuilder errorComment(StringBuilder sb, String str, int[] iArr) {
        sb.append(str);
        String str2 = iArr.length > 1 ? "s: " : ": ";
        int length = iArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = iArr[i4];
            sb.append(str2);
            sb.append(TagUtils.toString(i5));
            i4++;
            str2 = ", ";
        }
        return sb;
    }

    private int[] tagsOf(List<IOD.DataElement> list) {
        if (list == null) {
            return ByteUtils.EMPTY_INTS;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = list.get(i4).tag;
        }
        return iArr;
    }

    public void addInvalidAttributeValue(IOD.DataElement dataElement, Invalid invalid) {
        addInvalidAttributeValue(dataElement, invalid, null, null);
    }

    public void addMissingAttribute(IOD.DataElement dataElement) {
        if (this.missingAttributes == null) {
            this.missingAttributes = new ArrayList<>();
        }
        this.missingAttributes.add(dataElement);
    }

    public void addMissingAttributeValue(IOD.DataElement dataElement) {
        if (this.missingAttributeValues == null) {
            this.missingAttributeValues = new ArrayList<>();
        }
        this.missingAttributeValues.add(dataElement);
    }

    public void addNotAllowedAttribute(IOD.DataElement dataElement) {
        if (this.notAllowedAttributes == null) {
            this.notAllowedAttributes = new ArrayList<>();
        }
        this.notAllowedAttributes.add(dataElement);
    }

    public String asText(Attributes attributes) {
        if (isValid()) {
            return "VALID";
        }
        StringBuilder sb = new StringBuilder();
        appendTextTo(0, attributes, sb);
        return sb.substring(0, sb.length() - 1);
    }

    public String getErrorComment() {
        StringBuilder sbErrorComment;
        StringBuilder sb = new StringBuilder();
        if (this.notAllowedAttributes != null) {
            sbErrorComment = errorComment(sb, "Not allowed Attribute", tagsOfNotAllowedAttributes());
        } else if (this.missingAttributes != null) {
            sbErrorComment = errorComment(sb, "Missing Attribute", tagsOfMissingAttributes());
        } else if (this.missingAttributeValues != null) {
            sbErrorComment = errorComment(sb, "Missing Value of Attribute", tagsOfMissingAttributeValues());
        } else {
            if (this.invalidAttributeValues == null) {
                return null;
            }
            sbErrorComment = errorComment(sb, "Invalid Attribute", tagsOfInvalidAttributeValues());
        }
        return sbErrorComment.toString();
    }

    public int[] getOffendingElements() {
        return cat(tagsOfMissingAttributes(), tagsOfMissingAttributeValues(), tagsOfInvalidAttributeValues(), tagsOfNotAllowedAttributes());
    }

    public boolean hasInvalidAttributeValues() {
        return this.invalidAttributeValues != null;
    }

    public boolean hasMissingAttributeValues() {
        return this.missingAttributeValues != null;
    }

    public boolean hasMissingAttributes() {
        return this.missingAttributes != null;
    }

    public boolean hasNotAllowedAttributes() {
        return this.notAllowedAttributes != null;
    }

    public boolean isValid() {
        return (hasMissingAttributes() || hasMissingAttributeValues() || hasInvalidAttributeValues() || hasNotAllowedAttributes()) ? false : true;
    }

    public int[] tagsOfInvalidAttributeValues() {
        ArrayList<InvalidAttributeValue> arrayList = this.invalidAttributeValues;
        if (arrayList == null) {
            return ByteUtils.EMPTY_INTS;
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = arrayList.get(i4).dataElement.tag;
        }
        return iArr;
    }

    public int[] tagsOfMissingAttributeValues() {
        return tagsOf(this.missingAttributeValues);
    }

    public int[] tagsOfMissingAttributes() {
        return tagsOf(this.missingAttributes);
    }

    public int[] tagsOfNotAllowedAttributes() {
        return tagsOf(this.notAllowedAttributes);
    }

    public String toString() {
        if (isValid()) {
            return "VALID";
        }
        StringBuilder sb = new StringBuilder();
        if (this.notAllowedAttributes != null) {
            errorComment(sb, "Not allowed Attribute", tagsOfNotAllowedAttributes()).append(StringUtils.LINE_SEPARATOR);
        }
        if (this.missingAttributes != null) {
            errorComment(sb, "Missing Attribute", tagsOfMissingAttributes()).append(StringUtils.LINE_SEPARATOR);
        }
        if (this.missingAttributeValues != null) {
            errorComment(sb, "Missing Value of Attribute", tagsOfMissingAttributeValues()).append(StringUtils.LINE_SEPARATOR);
        }
        if (this.invalidAttributeValues != null) {
            errorComment(sb, "Invalid Attribute", tagsOfInvalidAttributeValues()).append(StringUtils.LINE_SEPARATOR);
        }
        return sb.substring(0, sb.length() - 1);
    }

    private void appendTextTo(int i4, Attributes attributes, StringBuilder sb) {
        ArrayList<IOD.DataElement> arrayList = this.notAllowedAttributes;
        if (arrayList != null) {
            appendTextTo(i4, attributes, "Not allowed Attributes:", arrayList, sb);
        }
        ArrayList<IOD.DataElement> arrayList2 = this.missingAttributes;
        if (arrayList2 != null) {
            appendTextTo(i4, attributes, "Missing Attributes:", arrayList2, sb);
        }
        ArrayList<IOD.DataElement> arrayList3 = this.missingAttributeValues;
        if (arrayList3 != null) {
            appendTextTo(i4, attributes, "Missing Attribute Values:", arrayList3, sb);
        }
        if (this.invalidAttributeValues != null) {
            appendInvalidAttributeValues(i4, attributes, "Invalid Attribute Values:", sb);
        }
    }

    public void addInvalidAttributeValue(IOD.DataElement dataElement, Invalid invalid, ValidationResult[] validationResultArr, IOD[] iodArr) {
        if (this.invalidAttributeValues == null) {
            this.invalidAttributeValues = new ArrayList<>();
        }
        this.invalidAttributeValues.add(new InvalidAttributeValue(dataElement, invalid, validationResultArr, iodArr));
    }
}
