package org.dcm4che3.data;

import j2.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.dcm4che3.util.ByteUtils;
import org.dcm4che3.util.ResourceLocator;
import org.dcm4che3.util.StringUtils;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes.dex */
public class IOD extends ArrayList<DataElement> {
    private static final long serialVersionUID = -5065822488885801576L;
    private Condition condition;
    private int lineNumber = -1;
    private DataElementType type;

    public static class And extends CompositeCondition {
        @Override // org.dcm4che3.data.IOD.CompositeCondition, org.dcm4che3.data.IOD.Condition
        public /* bridge */ /* synthetic */ void addChild(Condition condition) {
            super.addChild(condition);
        }

        @Override // org.dcm4che3.data.IOD.CompositeCondition, org.dcm4che3.data.IOD.Condition
        public /* bridge */ /* synthetic */ boolean isEmpty() {
            return super.isEmpty();
        }

        @Override // org.dcm4che3.data.IOD.CompositeCondition, org.dcm4che3.data.IOD.Condition
        public boolean match(Attributes attributes) {
            Iterator<Condition> it = this.childs.iterator();
            while (it.hasNext()) {
                if (!it.next().match(attributes)) {
                    return this.not;
                }
            }
            return !this.not;
        }

        @Override // org.dcm4che3.data.IOD.CompositeCondition, org.dcm4che3.data.IOD.Condition
        public /* bridge */ /* synthetic */ Condition trim() {
            return super.trim();
        }
    }

    public static abstract class CompositeCondition extends Condition {
        protected final ArrayList<Condition> childs = new ArrayList<>();

        @Override // org.dcm4che3.data.IOD.Condition
        public void addChild(Condition condition) {
            this.childs.add(condition);
        }

        @Override // org.dcm4che3.data.IOD.Condition
        public boolean isEmpty() {
            return this.childs.isEmpty();
        }

        @Override // org.dcm4che3.data.IOD.Condition
        public abstract boolean match(Attributes attributes);

        @Override // org.dcm4che3.data.IOD.Condition
        public Condition trim() {
            if (this.childs.size() == 1) {
                Condition conditionId = this.childs.get(0).id(this.id);
                return this.not ? conditionId.not() : conditionId;
            }
            this.childs.trimToSize();
            return this;
        }
    }

    public static abstract class Condition {
        protected String id;
        protected boolean not;

        public void addChild(Condition condition) {
            throw new UnsupportedOperationException();
        }

        public final String id() {
            return this.id;
        }

        public boolean isEmpty() {
            return false;
        }

        public abstract boolean match(Attributes attributes);

        public final Condition not() {
            this.not = !this.not;
            return this;
        }

        public Condition trim() {
            return this;
        }

        public Condition id(String str) {
            this.id = str;
            return this;
        }
    }

    public static class DataElement implements Serializable {
        private static final long serialVersionUID = -7460474415381086525L;
        private Condition condition;
        private int lineNumber = -1;
        public final int maxVM;
        public final int minVM;
        public final int tag;
        public final DataElementType type;
        public final int valueNumber;
        private Object values;
        public final VR vr;

        public DataElement(int i4, VR vr, DataElementType dataElementType, int i5, int i6, int i7) {
            this.tag = i4;
            this.vr = vr;
            this.type = dataElementType;
            this.minVM = i5;
            this.maxVM = i6;
            this.valueNumber = i7;
        }

        public DataElement addItemIOD(IOD iod) {
            Object obj = this.values;
            if (obj == null) {
                this.values = new IOD[]{iod};
            } else {
                IOD[] iodArr = (IOD[]) obj;
                IOD[] iodArr2 = (IOD[]) Arrays.copyOf(iodArr, iodArr.length + 1);
                iodArr2[iodArr2.length - 1] = iod;
                this.values = iodArr2;
            }
            return this;
        }

        public Condition getCondition() {
            return this.condition;
        }

        public int getLineNumber() {
            return this.lineNumber;
        }

        public int getValueNumber() {
            return this.valueNumber;
        }

        public Object getValues() {
            return this.values;
        }

        public DataElement setCondition(Condition condition) {
            this.condition = condition;
            return this;
        }

        public DataElement setLineNumber(int i4) {
            this.lineNumber = i4;
            return this;
        }

        public DataElement setValues(int... iArr) {
            if (this.vr.isIntType()) {
                this.values = iArr;
                return this;
            }
            throw new IllegalStateException("vr=" + this.vr);
        }

        public DataElement setValues(String... strArr) {
            if (this.vr == VR.SQ) {
                throw new IllegalStateException("vr=SQ");
            }
            this.values = strArr;
            return this;
        }

        public DataElement setValues(Code... codeArr) {
            if (this.vr == VR.SQ) {
                this.values = codeArr;
                return this;
            }
            throw new IllegalStateException("vr=" + this.vr);
        }
    }

    public enum DataElementType {
        TYPE_0,
        TYPE_1,
        TYPE_2,
        TYPE_3
    }

    public static class MemberOf extends Present {
        private final boolean matchNotPresent;
        private final int valueIndex;
        private Object values;
        private final VR vr;

        public MemberOf(int i4, VR vr, int i5, boolean z3, int... iArr) {
            super(i4, iArr);
            this.vr = vr;
            this.valueIndex = i5;
            this.matchNotPresent = z3;
        }

        @Override // org.dcm4che3.data.IOD.Present, org.dcm4che3.data.IOD.Condition
        public boolean match(Attributes attributes) {
            if (this.values == null) {
                throw new IllegalStateException("values not initialized");
            }
            Attributes attributesItem = item(attributes);
            if (attributesItem == null) {
                return this.matchNotPresent;
            }
            Object obj = this.values;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                return this.not ? !match(attributesItem, iArr) : match(attributesItem, iArr);
            }
            if (obj instanceof Code[]) {
                Code[] codeArr = (Code[]) obj;
                return this.not ? !match(attributesItem, codeArr) : match(attributesItem, codeArr);
            }
            String[] strArr = (String[]) obj;
            return this.not ? !match(attributesItem, strArr) : match(attributesItem, strArr);
        }

        public MemberOf setValues(int... iArr) {
            if (this.vr.isIntType()) {
                this.values = iArr;
                return this;
            }
            throw new IllegalStateException("vr=" + this.vr);
        }

        public VR vr() {
            return this.vr;
        }

        private boolean match(Attributes attributes, int[] iArr) {
            int i4 = attributes.getInt(this.tag, this.valueIndex, Integer.MIN_VALUE);
            if (i4 == Integer.MIN_VALUE) {
                return this.matchNotPresent;
            }
            for (int i5 : iArr) {
                if (i5 == i4) {
                    return true;
                }
            }
            return false;
        }

        public MemberOf setValues(String... strArr) {
            if (this.vr == VR.SQ) {
                throw new IllegalStateException("vr=SQ");
            }
            this.values = strArr;
            return this;
        }

        private boolean match(Attributes attributes, String[] strArr) {
            String string = attributes.getString(this.tag, this.valueIndex);
            if (string == null) {
                return this.not ? !this.matchNotPresent : this.matchNotPresent;
            }
            for (String str : strArr) {
                if (str.equals(string)) {
                    return !this.not;
                }
            }
            return this.not;
        }

        public MemberOf setValues(Code... codeArr) {
            if (this.vr == VR.SQ) {
                this.values = codeArr;
                return this;
            }
            throw new IllegalStateException("vr=" + this.vr);
        }

        private boolean match(Attributes attributes, Code[] codeArr) {
            Code code;
            int i4;
            Sequence sequence = attributes.getSequence(this.tag);
            if (sequence != null) {
                Iterator<Attributes> it = sequence.iterator();
                while (it.hasNext()) {
                    try {
                        code = new Code(it.next());
                    } catch (NullPointerException unused) {
                    }
                    for (Code code2 : codeArr) {
                        if (code2.equals(code)) {
                            return !this.not;
                        }
                    }
                }
            }
            return this.not;
        }
    }

    public static class Or extends CompositeCondition {
        @Override // org.dcm4che3.data.IOD.CompositeCondition, org.dcm4che3.data.IOD.Condition
        public /* bridge */ /* synthetic */ void addChild(Condition condition) {
            super.addChild(condition);
        }

        @Override // org.dcm4che3.data.IOD.CompositeCondition, org.dcm4che3.data.IOD.Condition
        public /* bridge */ /* synthetic */ boolean isEmpty() {
            return super.isEmpty();
        }

        @Override // org.dcm4che3.data.IOD.CompositeCondition, org.dcm4che3.data.IOD.Condition
        public boolean match(Attributes attributes) {
            Iterator<Condition> it = this.childs.iterator();
            while (it.hasNext()) {
                if (it.next().match(attributes)) {
                    return !this.not;
                }
            }
            return this.not;
        }

        @Override // org.dcm4che3.data.IOD.CompositeCondition, org.dcm4che3.data.IOD.Condition
        public /* bridge */ /* synthetic */ Condition trim() {
            return super.trim();
        }
    }

    public static class Present extends Condition {
        protected final int[] itemPath;
        protected final int tag;

        public Present(int i4, int... iArr) {
            this.tag = i4;
            this.itemPath = iArr;
        }

        public Attributes item(Attributes attributes) {
            int[] iArr = this.itemPath;
            int length = iArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = iArr[i4];
                if (i5 == -1) {
                    attributes = i5 == -1 ? attributes.getParent() : attributes.getNestedDataset(i5);
                }
            }
            return attributes;
        }

        @Override // org.dcm4che3.data.IOD.Condition
        public boolean match(Attributes attributes) {
            boolean z3 = this.not;
            Attributes attributesItem = item(attributes);
            return z3 ? !attributesItem.containsValue(this.tag) : attributesItem.containsValue(this.tag);
        }
    }

    public static class SAXHandler extends DefaultHandler {
        private boolean elementConditions;
        private String idref;
        private boolean itemConditions;
        private Locator locator;
        private boolean processCharacters;
        private StringBuilder sb = new StringBuilder();
        private List<String> values = new ArrayList();
        private List<Code> codes = new ArrayList();
        private LinkedList<IOD> iodStack = new LinkedList<>();
        private LinkedList<Condition> conditionStack = new LinkedList<>();
        private Map<String, IOD> id2iod = new HashMap();
        private Map<String, Condition> id2cond = new HashMap();

        public SAXHandler(IOD iod) {
            this.iodStack.add(iod);
        }

        private void endCondition(String str) throws SAXException {
            Condition conditionRemoveLast = this.conditionStack.removeLast();
            if (conditionRemoveLast.isEmpty()) {
                throw new SAXException('<' + str + "> must not be empty");
            }
            if (!this.values.isEmpty()) {
                try {
                    MemberOf memberOf = (MemberOf) conditionRemoveLast;
                    if (memberOf.vr.isIntType()) {
                        memberOf.setValues(parseInts(this.values));
                    } else {
                        List<String> list = this.values;
                        memberOf.setValues((String[]) list.toArray(new String[list.size()]));
                    }
                    this.values.clear();
                } catch (Exception unused) {
                    throw new SAXException("unexpected <Value> contained by <" + str + ">");
                }
            }
            if (!this.codes.isEmpty()) {
                try {
                    List<Code> list2 = this.codes;
                    ((MemberOf) conditionRemoveLast).setValues((Code[]) list2.toArray(new Code[list2.size()]));
                    this.codes.clear();
                } catch (Exception unused2) {
                    throw new SAXException("unexpected <Code> contained by <" + str + ">");
                }
            }
            if (!this.conditionStack.isEmpty()) {
                this.conditionStack.getLast().addChild(conditionRemoveLast.trim());
                return;
            }
            if (this.elementConditions) {
                getLastDataElement().setCondition(conditionRemoveLast.trim());
            } else {
                this.iodStack.getLast().setCondition(conditionRemoveLast.trim());
            }
            this.elementConditions = false;
            this.itemConditions = false;
        }

        private void endDataElement() throws SAXException {
            DataElement lastDataElement = getLastDataElement();
            if (!this.values.isEmpty()) {
                try {
                    if (lastDataElement.vr.isIntType()) {
                        lastDataElement.setValues(parseInts(this.values));
                    } else {
                        List<String> list = this.values;
                        lastDataElement.setValues((String[]) list.toArray(new String[list.size()]));
                    }
                    this.values.clear();
                } catch (IllegalStateException unused) {
                    throw new SAXException("unexpected <Value>");
                }
            }
            if (!this.codes.isEmpty()) {
                try {
                    List<Code> list2 = this.codes;
                    lastDataElement.setValues((Code[]) list2.toArray(new Code[list2.size()]));
                    this.codes.clear();
                } catch (IllegalStateException unused2) {
                    throw new SAXException("unexpected <Code>");
                }
            }
            this.elementConditions = false;
        }

        private void endItem() {
            this.iodStack.removeLast().trimToSize();
            this.itemConditions = false;
        }

        private void endValue() {
            this.values.add(this.sb.toString());
        }

        private DataElement getLastDataElement() {
            return this.iodStack.getLast().get(r0.size() - 1);
        }

        private boolean matchNotPresentOf(String str) {
            return str != null && str.equalsIgnoreCase("true");
        }

        private MemberOf memberOf(org.xml.sax.Attributes attributes) throws SAXException {
            int[] iArrTagPathOf = tagPathOf(attributes.getValue("tag"));
            int length = iArrTagPathOf.length - 1;
            return new MemberOf(iArrTagPathOf[length], vrOf(attributes.getValue("vr")), valueNumberOf(attributes.getValue("valueNumber"), 1) - 1, matchNotPresentOf(attributes.getValue("matchNotPresent")), length > 0 ? Arrays.copyOf(iArrTagPathOf, length) : ByteUtils.EMPTY_INTS);
        }

        private int[] parseInts(List<String> list) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i4 = 0; i4 < size; i4++) {
                iArr[i4] = Integer.parseInt(list.get(i4));
            }
            return iArr;
        }

        private Present present(org.xml.sax.Attributes attributes) throws SAXException {
            int[] iArrTagPathOf = tagPathOf(attributes.getValue("tag"));
            int length = iArrTagPathOf.length - 1;
            return new Present(iArrTagPathOf[length], length > 0 ? Arrays.copyOf(iArrTagPathOf, length) : ByteUtils.EMPTY_INTS);
        }

        private void startCode(String str, String str2, String str3, String str4) throws SAXException {
            if (str == null) {
                throw new SAXException("missing codeValue attribute");
            }
            if (str2 == null) {
                throw new SAXException("missing codingSchemeDesignator attribute");
            }
            if (str4 == null) {
                throw new SAXException("missing codeMeaning attribute");
            }
            this.codes.add(new Code(str, str2, str3, str4));
        }

        private void startCondition(String str, Condition condition) throws SAXException {
            if (this.elementConditions || this.itemConditions) {
                this.conditionStack.add(condition);
                return;
            }
            throw new SAXException("unexpected <" + str + '>');
        }

        private void startDataElement(String str, String str2, String str3, String str4, String str5, String str6) throws SAXException {
            int i4;
            int i5;
            int i6;
            if (this.idref != null) {
                throw new SAXException("<Item> with idref must be empty");
            }
            IOD last = this.iodStack.getLast();
            int iTagOf = tagOf(str);
            VR vrVrOf = vrOf(str2);
            DataElementType dataElementTypeTypeOf = typeOf(str3);
            if (vrVrOf == VR.SQ) {
                str4 = str5;
            }
            if (str4 != null) {
                try {
                    String[] strArrSplit = StringUtils.split(str4, '-');
                    if (strArrSplit[0].charAt(0) != 'n') {
                        i6 = Integer.parseInt(strArrSplit[0]);
                        if (strArrSplit.length > 1) {
                            i6 = strArrSplit[1].charAt(0) != 'n' ? Integer.parseInt(strArrSplit[1]) : -1;
                            i = i6;
                        } else {
                            i = i6;
                        }
                    } else {
                        i6 = -1;
                    }
                    i4 = i;
                    i5 = i6;
                } catch (IllegalArgumentException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(vrVrOf == VR.SQ ? "invalid items=\"" : "invalid vm=\"");
                    sb.append(str4);
                    sb.append('\"');
                    throw new SAXException(sb.toString());
                }
            } else {
                i4 = -1;
                i5 = -1;
            }
            DataElement dataElement = new DataElement(iTagOf, vrVrOf, dataElementTypeTypeOf, i4, i5, valueNumberOf(str6, 0));
            Locator locator = this.locator;
            if (locator != null) {
                dataElement.setLineNumber(locator.getLineNumber());
            }
            last.add(dataElement);
            this.elementConditions = true;
            this.itemConditions = false;
        }

        private void startIf(String str, String str2) throws SAXException {
            Condition conditionId;
            if (!this.conditionStack.isEmpty()) {
                throw new SAXException("unexpected <If>");
            }
            if (str2 != null) {
                conditionId = this.id2cond.get(str2);
                if (conditionId == null) {
                    throw new SAXException("could not resolve <If idref:\"" + str2 + "\"/>");
                }
            } else {
                conditionId = new And().id(str);
            }
            this.conditionStack.add(conditionId);
            if (str != null) {
                this.id2cond.put(str, conditionId);
            }
            this.idref = str2;
        }

        private void startItem(String str, String str2, String str3) throws SAXException {
            IOD iod;
            if (str2 == null) {
                IOD iod2 = new IOD();
                if (str3 != null) {
                    iod2.setType(typeOf(str3));
                }
                Locator locator = this.locator;
                if (locator != null) {
                    iod2.setLineNumber(locator.getLineNumber());
                }
                iod = iod2;
            } else {
                if (str3 != null) {
                    throw new SAXException("<Item> with idref must not specify type");
                }
                iod = this.id2iod.get(str2);
                if (iod == null) {
                    throw new SAXException("could not resolve <Item idref:\"" + str2 + "\"/>");
                }
            }
            getLastDataElement().addItemIOD(iod);
            this.iodStack.add(iod);
            if (str != null) {
                this.id2iod.put(str, iod);
            }
            this.idref = str2;
            this.itemConditions = true;
            this.elementConditions = false;
        }

        private void startValue() {
            this.sb.setLength(0);
            this.processCharacters = true;
        }

        private int tagOf(String str) throws SAXException {
            try {
                return (int) Long.parseLong(str, 16);
            } catch (IllegalArgumentException unused) {
                throw new SAXException("invalid tag=\"" + str + '\"');
            } catch (NullPointerException unused2) {
                throw new SAXException("missing tag attribute");
            }
        }

        private int[] tagPathOf(String str) throws SAXException {
            String[] strArrSplit = StringUtils.split(str, '/');
            if (strArrSplit.length == 0) {
                throw new SAXException("missing tag attribute");
            }
            try {
                int length = strArrSplit.length;
                int[] iArr = new int[length];
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[i4] = strArrSplit[i4].equals("..") ? -1 : (int) Long.parseLong(str, 16);
                }
                return iArr;
            } catch (IllegalArgumentException unused) {
                throw new SAXException("invalid tag=\"" + str + '\"');
            }
        }

        private DataElementType typeOf(String str) throws SAXException {
            if (str == null) {
                throw new SAXException("missing type attribute");
            }
            try {
                return DataElementType.valueOf("TYPE_" + str);
            } catch (IllegalArgumentException unused) {
                throw new SAXException("unrecognized type=\"" + str + '\"');
            }
        }

        private int valueNumberOf(String str, int i4) throws SAXException {
            if (str == null) {
                return i4;
            }
            try {
                return Integer.parseInt(str);
            } catch (IllegalArgumentException unused) {
                throw new SAXException("invalid valueNumber=\"" + str + '\"');
            }
        }

        private VR vrOf(String str) throws SAXException {
            try {
                return VR.valueOf(str);
            } catch (IllegalArgumentException unused) {
                throw new SAXException("unrecognized vr=\"" + str + '\"');
            } catch (NullPointerException unused2) {
                throw new SAXException("missing vr attribute");
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i4, int i5) throws SAXException {
            if (this.processCharacters) {
                this.sb.append(cArr, i4, i5);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void endElement(java.lang.String r2, java.lang.String r3, java.lang.String r4) throws org.xml.sax.SAXException {
            /*
                r1 = this;
                r2 = 0
                char r3 = r4.charAt(r2)
                r0 = 65
                if (r3 == r0) goto L88
                r0 = 68
                if (r3 == r0) goto L7c
                r0 = 73
                if (r3 == r0) goto L67
                r0 = 86
                if (r3 == r0) goto L5b
                switch(r3) {
                    case 77: goto L52;
                    case 78: goto L2e;
                    case 79: goto L24;
                    case 80: goto L1a;
                    default: goto L18;
                }
            L18:
                goto L93
            L1a:
                java.lang.String r3 = "Present"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L93
                goto L90
            L24:
                java.lang.String r3 = "Or"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L93
                goto L90
            L2e:
                java.lang.String r3 = "NotAnd"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L37
                goto L90
            L37:
                java.lang.String r3 = "NotMemberOf"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L40
                goto L90
            L40:
                java.lang.String r3 = "NotOr"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L49
                goto L90
            L49:
                java.lang.String r3 = "NotPresent"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L93
                goto L90
            L52:
                java.lang.String r3 = "MemberOf"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L93
                goto L90
            L5b:
                java.lang.String r3 = "Value"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L93
                r1.endValue()
                goto L93
            L67:
                java.lang.String r3 = "If"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L70
                goto L90
            L70:
                java.lang.String r3 = "Item"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L93
                r1.endItem()
                goto L93
            L7c:
                java.lang.String r3 = "DataElement"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L93
                r1.endDataElement()
                goto L93
            L88:
                java.lang.String r3 = "And"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L93
            L90:
                r1.endCondition(r4)
            L93:
                r1.processCharacters = r2
                r2 = 0
                r1.idref = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.dcm4che3.data.IOD.SAXHandler.endElement(java.lang.String, java.lang.String, java.lang.String):void");
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void setDocumentLocator(Locator locator) {
            this.locator = locator;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, org.xml.sax.Attributes attributes) throws SAXException {
            Condition and;
            Condition conditionPresent;
            char cCharAt = str3.charAt(0);
            if (cCharAt != 'A') {
                if (cCharAt == 'I') {
                    if (str3.equals("If")) {
                        startIf(attributes.getValue(a.f8286f), attributes.getValue("idref"));
                        return;
                    } else {
                        if (str3.equals("Item")) {
                            startItem(attributes.getValue(a.f8286f), attributes.getValue("idref"), attributes.getValue("type"));
                            return;
                        }
                        return;
                    }
                }
                if (cCharAt == 'V') {
                    if (str3.equals("Value")) {
                        startValue();
                        return;
                    }
                    return;
                }
                if (cCharAt != 'C') {
                    if (cCharAt != 'D') {
                        switch (cCharAt) {
                            case 'M':
                                if (!str3.equals("MemberOf")) {
                                    return;
                                } else {
                                    and = memberOf(attributes);
                                }
                                break;
                            case 'N':
                                if (str3.equals("NotAnd")) {
                                    conditionPresent = new And();
                                } else if (str3.equals("NotMemberOf")) {
                                    conditionPresent = memberOf(attributes);
                                } else if (str3.equals("NotOr")) {
                                    conditionPresent = new Or();
                                } else if (!str3.equals("NotPresent")) {
                                    return;
                                } else {
                                    conditionPresent = present(attributes);
                                }
                                and = conditionPresent.not();
                                break;
                            case 'O':
                                if (!str3.equals("Or")) {
                                    return;
                                } else {
                                    and = new Or();
                                }
                                break;
                            case 'P':
                                if (!str3.equals("Present")) {
                                    return;
                                } else {
                                    and = present(attributes);
                                }
                                break;
                            default:
                                return;
                        }
                    }
                } else if (str3.equals("Code")) {
                    startCode(attributes.getValue("codeValue"), attributes.getValue("codingSchemeDesignator"), attributes.getValue("codingSchemeVersion"), attributes.getValue("codeMeaning"));
                }
                if (str3.equals("DataElement")) {
                    startDataElement(attributes.getValue("tag"), attributes.getValue("vr"), attributes.getValue("type"), attributes.getValue("vm"), attributes.getValue("items"), attributes.getValue("valueNumber"));
                    return;
                }
                return;
            }
            if (!str3.equals("And")) {
                return;
            } else {
                and = new And();
            }
            startCondition(str3, and);
        }
    }

    public static IOD load(String str) throws IOException {
        if (str.startsWith("resource:")) {
            try {
                str = ResourceLocator.getResource(str.substring(9), (Class<?>) IOD.class);
            } catch (NullPointerException unused) {
                throw new FileNotFoundException(str);
            }
        } else if (str.indexOf(58) < 2) {
            str = new File(str).toURI().toString();
        }
        IOD iod = new IOD();
        iod.parse(str);
        iod.trimToSize();
        return iod;
    }

    public static IOD valueOf(Code code) {
        IOD iod = new IOD();
        VR vr = VR.SH;
        DataElementType dataElementType = DataElementType.TYPE_1;
        iod.add(new DataElement(Tag.CodeValue, vr, dataElementType, 1, 1, 0).setValues(code.getCodeValue()));
        iod.add(new DataElement(Tag.CodingSchemeDesignator, vr, dataElementType, 1, 1, 0).setValues(code.getCodingSchemeDesignator()));
        iod.add(code.getCodingSchemeVersion() == null ? new DataElement(Tag.CodingSchemeVersion, vr, DataElementType.TYPE_0, -1, -1, 0) : new DataElement(Tag.CodingSchemeVersion, vr, dataElementType, 1, 1, 0));
        return iod;
    }

    public Condition getCondition() {
        return this.condition;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public DataElementType getType() {
        return this.type;
    }

    public void parse(String str) throws IOException {
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(str, new SAXHandler(this));
        } catch (ParserConfigurationException e4) {
            throw new RuntimeException(e4);
        } catch (SAXException e5) {
            throw new IOException("Failed to parse " + str, e5);
        }
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public void setLineNumber(int i4) {
        this.lineNumber = i4;
    }

    public void setType(DataElementType dataElementType) {
        this.type = dataElementType;
    }
}
