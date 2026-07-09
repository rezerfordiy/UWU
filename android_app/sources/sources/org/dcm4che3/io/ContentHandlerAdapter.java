package org.dcm4che3.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.BulkData;
import org.dcm4che3.data.ElementDictionary;
import org.dcm4che3.data.Fragments;
import org.dcm4che3.data.PersonName;
import org.dcm4che3.data.Sequence;
import org.dcm4che3.data.VR;
import org.dcm4che3.util.Base64;
import org.dcm4che3.util.ByteUtils;
import org.dcm4che3.util.TagUtils;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes.dex */
public class ContentHandlerAdapter extends DefaultHandler {
    private final boolean bigEndian;
    private final ByteArrayOutputStream bout;
    private BulkData bulkData;
    private final char[] carry;
    private int carryLen;
    private Fragments dataFragments;
    private Attributes fmi;
    private boolean inlineBinary;
    private final LinkedList<Attributes> items;
    private PersonName pn;
    private PersonName.Group pnGroup;
    private String privateCreator;
    private boolean processCharacters;
    private final StringBuilder sb;
    private final LinkedList<Sequence> seqs;
    private int tag;
    private final ArrayList<String> values;
    private VR vr;

    public ContentHandlerAdapter(Attributes attributes) {
        LinkedList<Attributes> linkedList = new LinkedList<>();
        this.items = linkedList;
        this.seqs = new LinkedList<>();
        this.bout = new ByteArrayOutputStream(64);
        this.carry = new char[4];
        this.sb = new StringBuilder(64);
        this.values = new ArrayList<>();
        attributes.getClass();
        linkedList.add(attributes);
        this.bigEndian = attributes.bigEndian();
    }

    private void bulkData(String str, String str2) {
        this.bulkData = new BulkData(str, str2, this.items.getLast().bigEndian());
    }

    private void endDataFragment() {
        BulkData bulkData = this.bulkData;
        if (bulkData == null) {
            this.dataFragments.add(getBytes());
        } else {
            this.dataFragments.add(bulkData);
            this.bulkData = null;
        }
    }

    private void endDicomAttribute() {
        if (this.vr == VR.SQ) {
            this.seqs.removeLast().trimToSize();
            return;
        }
        Fragments fragments = this.dataFragments;
        if (fragments != null) {
            fragments.trimToSize();
            this.dataFragments = null;
            return;
        }
        Attributes last = this.items.getLast();
        if (TagUtils.isFileMetaInformation(this.tag)) {
            if (this.fmi == null) {
                this.fmi = new Attributes();
            }
            last = this.fmi;
        }
        BulkData bulkData = this.bulkData;
        if (bulkData != null) {
            last.setValue(this.privateCreator, this.tag, this.vr, bulkData);
            this.bulkData = null;
        } else if (this.inlineBinary) {
            last.setBytes(this.privateCreator, this.tag, this.vr, getBytes());
        } else {
            last.setString(this.privateCreator, this.tag, this.vr, getStrings());
        }
    }

    private void endItem() {
        this.items.removeLast().trimToSize();
        this.vr = VR.SQ;
    }

    private void endPNComponent(PersonName.Component component) {
        this.pn.set(this.pnGroup, component, getString());
    }

    private void endPersonName() {
        this.values.add(this.pn.toString());
        this.pn = null;
    }

    private void endValue() {
        this.values.add(getString());
    }

    private byte[] getBytes() {
        byte[] byteArray = this.bout.toByteArray();
        return this.bigEndian ? this.vr.toggleEndian(byteArray, false) : byteArray;
    }

    private String getString() {
        return this.sb.toString();
    }

    private String[] getStrings() {
        try {
            ArrayList<String> arrayList = this.values;
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } finally {
            this.values.clear();
        }
    }

    private void startDataFragment(int i4) {
        if (this.dataFragments == null) {
            this.dataFragments = this.items.getLast().newFragments(this.privateCreator, this.tag, this.vr, 10);
        }
        while (this.dataFragments.size() < i4 - 1) {
            this.dataFragments.add(ByteUtils.EMPTY_BYTES);
        }
    }

    private void startDicomAttribute(int i4, String str, String str2) {
        this.tag = i4;
        this.privateCreator = str;
        VR vrValueOf = str2 != null ? VR.valueOf(str2) : ElementDictionary.vrOf(i4, str);
        this.vr = vrValueOf;
        if (vrValueOf == VR.SQ) {
            this.seqs.add(this.items.getLast().newSequence(str, i4, 10));
        }
    }

    private void startInlineBinary() {
        this.processCharacters = true;
        this.inlineBinary = true;
        this.bout.reset();
    }

    private void startItem(int i4) {
        Sequence last = this.seqs.getLast();
        while (last.size() < i4 - 1) {
            last.add(new Attributes(0));
        }
        Attributes attributes = new Attributes();
        last.add(attributes);
        this.items.add(attributes);
    }

    private void startPNGroup(PersonName.Group group) {
        this.pnGroup = group;
    }

    private void startPersonName(int i4) {
        startValue(i4);
        this.pn = new PersonName();
    }

    private void startText() {
        this.processCharacters = true;
        this.inlineBinary = false;
        this.sb.setLength(0);
    }

    private void startValue(int i4) {
        while (this.values.size() < i4 - 1) {
            this.values.add(null);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i4, int i5) throws SAXException {
        if (this.processCharacters) {
            if (!this.inlineBinary) {
                this.sb.append(cArr, i4, i5);
                return;
            }
            try {
                int i6 = this.carryLen;
                if (i6 != 0) {
                    int i7 = 4 - i6;
                    System.arraycopy(cArr, i4, this.carry, i6, i7);
                    Base64.decode(this.carry, 0, 4, this.bout);
                    i4 += i7;
                    i5 -= i7;
                }
                int i8 = i5 & 3;
                this.carryLen = i8;
                if (i8 != 0) {
                    i5 -= i8;
                    System.arraycopy(cArr, i4 + i5, this.carry, 0, i8);
                }
                Base64.decode(cArr, i4, i5, this.bout);
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        Attributes attributes = this.fmi;
        if (attributes != null) {
            attributes.trimToSize();
        }
        this.items.getFirst().trimToSize();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        PersonName.Component component;
        char cCharAt = str3.charAt(0);
        if (cCharAt != 'D') {
            if (cCharAt != 'I') {
                if (cCharAt != 'P') {
                    if (cCharAt != 'V') {
                        if (cCharAt != 'F') {
                            if (cCharAt != 'G') {
                                if (cCharAt != 'M') {
                                    if (cCharAt == 'N') {
                                        if (str3.equals("NamePrefix")) {
                                            component = PersonName.Component.NamePrefix;
                                        } else if (str3.equals("NameSuffix")) {
                                            component = PersonName.Component.NameSuffix;
                                        }
                                        endPNComponent(component);
                                    }
                                } else if (str3.equals("MiddleName")) {
                                    component = PersonName.Component.MiddleName;
                                    endPNComponent(component);
                                }
                            } else if (str3.equals("GivenName")) {
                                component = PersonName.Component.GivenName;
                                endPNComponent(component);
                            }
                        } else if (str3.equals("FamilyName")) {
                            component = PersonName.Component.FamilyName;
                            endPNComponent(component);
                        }
                    } else if (str3.equals("Value")) {
                        endValue();
                    }
                } else if (str3.equals("PersonName")) {
                    endPersonName();
                }
            } else if (str3.equals("Item")) {
                endItem();
            }
        } else if (str3.equals("DicomAttribute")) {
            endDicomAttribute();
        } else if (str3.equals("DataFragment")) {
            endDataFragment();
        }
        this.processCharacters = false;
    }

    public Attributes getFileMetaInformation() {
        return this.fmi;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, org.xml.sax.Attributes attributes) throws SAXException {
        PersonName.Group group;
        switch (str3.charAt(0)) {
            case 'A':
                if (str3.equals("Alphabetic")) {
                    group = PersonName.Group.Alphabetic;
                    startPNGroup(group);
                    return;
                }
                return;
            case 'B':
                if (str3.equals("BulkData")) {
                    bulkData(attributes.getValue("uuid"), attributes.getValue("uri"));
                    return;
                }
                return;
            case 'C':
            case 'E':
            case 'H':
            case 'J':
            case 'K':
            case 'Q':
            case 'R':
            case 'S':
            default:
                return;
            case 'D':
                if (str3.equals("DicomAttribute")) {
                    startDicomAttribute((int) Long.parseLong(attributes.getValue("tag"), 16), attributes.getValue("privateCreator"), attributes.getValue("vr"));
                    return;
                } else {
                    if (str3.equals("DataFragment")) {
                        startDataFragment(Integer.parseInt(attributes.getValue("number")));
                        return;
                    }
                    return;
                }
            case 'F':
                if (!str3.equals("FamilyName")) {
                    return;
                }
                break;
            case 'G':
                if (!str3.equals("GivenName")) {
                    return;
                }
                break;
            case 'I':
                if (str3.equals("Item")) {
                    startItem(Integer.parseInt(attributes.getValue("number")));
                    return;
                }
                if (str3.equals("InlineBinary")) {
                    startInlineBinary();
                    return;
                } else {
                    if (str3.equals("Ideographic")) {
                        group = PersonName.Group.Ideographic;
                        startPNGroup(group);
                        return;
                    }
                    return;
                }
            case 'L':
                if (!str3.equals("Length")) {
                    return;
                }
                break;
            case 'M':
                if (!str3.equals("MiddleName")) {
                    return;
                }
                break;
            case 'N':
                if (!str3.equals("NamePrefix") && !str3.equals("NameSuffix")) {
                    return;
                }
                break;
            case 'O':
                if (!str3.equals("Offset")) {
                    return;
                }
                break;
            case 'P':
                if (str3.equals("PersonName")) {
                    startPersonName(Integer.parseInt(attributes.getValue("number")));
                    return;
                } else {
                    if (str3.equals("Phonetic")) {
                        group = PersonName.Group.Phonetic;
                        startPNGroup(group);
                        return;
                    }
                    return;
                }
            case 'T':
                if (!str3.equals("TransferSyntax")) {
                    return;
                }
                break;
            case 'U':
                if (!str3.equals("URI")) {
                    return;
                }
                break;
            case 'V':
                if (!str3.equals("Value")) {
                    return;
                } else {
                    startValue(Integer.parseInt(attributes.getValue("number")));
                }
                break;
        }
        startText();
    }
}
