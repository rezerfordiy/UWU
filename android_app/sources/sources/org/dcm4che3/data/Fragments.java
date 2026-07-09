package org.dcm4che3.data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.dcm4che3.io.DicomEncodingOptions;
import org.dcm4che3.io.DicomOutputStream;
import s0.a;

/* JADX INFO: loaded from: classes.dex */
public class Fragments extends ArrayList<Object> implements Value {
    private static final long serialVersionUID = -6667210062541083610L;
    private final boolean bigEndian;
    private final VR vr;

    public Fragments(VR vr, boolean z3, int i4) {
        super(i4);
        this.vr = vr;
        this.bigEndian = z3;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i4, Object obj) {
        if (obj == null || ((obj instanceof byte[]) && ((byte[]) obj).length == 0)) {
            obj = Value.NULL;
        }
        super.add(i4, obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i4, Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            add(i4, it.next());
            i4++;
        }
        return !collection.isEmpty();
    }

    public final boolean bigEndian() {
        return this.bigEndian;
    }

    @Override // org.dcm4che3.data.Value
    public int calcLength(DicomEncodingOptions dicomEncodingOptions, boolean z3, VR vr) {
        int iCalcLength = 0;
        for (Object obj : this) {
            iCalcLength = iCalcLength + 8 + (obj instanceof Value ? ((Value) obj).calcLength(dicomEncodingOptions, z3, vr) : (((byte[]) obj).length + 1) & (-2));
        }
        return iCalcLength;
    }

    @Override // org.dcm4che3.data.Value
    public int getEncodedLength(DicomEncodingOptions dicomEncodingOptions, boolean z3, VR vr) {
        return -1;
    }

    @Override // org.dcm4che3.data.Value
    public byte[] toBytes(VR vr, boolean z3) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return a.f11071l + size() + " Fragments";
    }

    public final VR vr() {
        return this.vr;
    }

    @Override // org.dcm4che3.data.Value
    public void writeTo(DicomOutputStream dicomOutputStream, VR vr) throws IOException {
        Iterator<Object> it = iterator();
        while (it.hasNext()) {
            dicomOutputStream.writeAttribute(Tag.Item, vr, it.next(), null);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        add(size(), obj);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Object> collection) {
        return addAll(size(), collection);
    }
}
