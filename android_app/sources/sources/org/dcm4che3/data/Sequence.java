package org.dcm4che3.data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.dcm4che3.io.DicomEncodingOptions;
import org.dcm4che3.io.DicomOutputStream;
import s0.a;

/* JADX INFO: loaded from: classes.dex */
public class Sequence extends ArrayList<Attributes> implements Value {
    private static final long serialVersionUID = 7062970085409148066L;
    private int length;
    private final Attributes parent;

    public Sequence(Attributes attributes, int i4) {
        super(i4);
        this.length = -1;
        this.parent = attributes;
    }

    private void setParent(Collection<? extends Attributes> collection) {
        boolean zBigEndian = this.parent.bigEndian();
        for (Attributes attributes : collection) {
            if (attributes.bigEndian() != zBigEndian) {
                throw new IllegalArgumentException("Endian of Item must match Endian of parent Data Set");
            }
            if (!attributes.isRoot()) {
                throw new IllegalArgumentException("Item already contained by Sequence");
            }
        }
        Iterator<? extends Attributes> it = collection.iterator();
        while (it.hasNext()) {
            it.next().setParent(this.parent);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i4, Collection<? extends Attributes> collection) {
        setParent(collection);
        return super.addAll(i4, collection);
    }

    @Override // org.dcm4che3.data.Value
    public int calcLength(DicomEncodingOptions dicomEncodingOptions, boolean z3, VR vr) {
        int iCalcLength = 0;
        for (Attributes attributes : this) {
            iCalcLength += attributes.calcLength(dicomEncodingOptions, z3) + 8;
            if (attributes.isEmpty()) {
                if (dicomEncodingOptions.undefEmptyItemLength) {
                    iCalcLength += 8;
                }
            } else if (dicomEncodingOptions.undefItemLength) {
                iCalcLength += 8;
            }
        }
        if (!isEmpty() ? dicomEncodingOptions.undefSequenceLength : dicomEncodingOptions.undefEmptySequenceLength) {
            iCalcLength += 8;
        }
        this.length = iCalcLength;
        return iCalcLength;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        Iterator<Attributes> it = iterator();
        while (it.hasNext()) {
            it.next().setParent(null);
        }
        super.clear();
    }

    @Override // org.dcm4che3.data.Value
    public int getEncodedLength(DicomEncodingOptions dicomEncodingOptions, boolean z3, VR vr) {
        if (isEmpty()) {
            return dicomEncodingOptions.undefEmptySequenceLength ? -1 : 0;
        }
        if (dicomEncodingOptions.undefSequenceLength) {
            return -1;
        }
        if (this.length == -1) {
            calcLength(dicomEncodingOptions, z3, vr);
        }
        return this.length;
    }

    public final Attributes getParent() {
        return this.parent;
    }

    @Override // org.dcm4che3.data.Value
    public byte[] toBytes(VR vr, boolean z3) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return a.f11071l + size() + " Items";
    }

    public void trimToSize(boolean z3) {
        super.trimToSize();
        if (z3) {
            Iterator<Attributes> it = iterator();
            while (it.hasNext()) {
                it.next().trimToSize(z3);
            }
        }
    }

    @Override // org.dcm4che3.data.Value
    public void writeTo(DicomOutputStream dicomOutputStream, VR vr) throws IOException {
        Iterator<Attributes> it = iterator();
        while (it.hasNext()) {
            it.next().writeItemTo(dicomOutputStream);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i4, Attributes attributes) {
        super.add(i4, attributes.setParent(this.parent));
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Attributes> collection) {
        setParent(collection);
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Attributes remove(int i4) {
        return ((Attributes) super.remove(i4)).setParent(null);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Attributes set(int i4, Attributes attributes) {
        return (Attributes) super.set(i4, attributes.setParent(this.parent));
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        if (!(obj instanceof Attributes) || !super.remove(obj)) {
            return false;
        }
        ((Attributes) obj).setParent(null);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Attributes attributes) {
        return super.add(attributes.setParent(this.parent));
    }
}
