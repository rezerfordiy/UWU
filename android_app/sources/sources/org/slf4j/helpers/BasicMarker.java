package org.slf4j.helpers;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class BasicMarker implements Marker {
    private static String CLOSE = " ]";
    private static String OPEN = "[ ";
    private static String SEP = ", ";
    private static final long serialVersionUID = 1803952589649545191L;
    private final String name;
    private List refereceList;

    public BasicMarker(String str) {
        if (str == null) {
            throw new IllegalArgumentException("A marker name cannot be null");
        }
        this.name = str;
    }

    @Override // org.slf4j.Marker
    public synchronized void add(Marker marker) {
        if (marker == null) {
            throw new IllegalArgumentException("A null value cannot be added to a Marker as reference.");
        }
        if (contains(marker)) {
            return;
        }
        if (marker.contains(this)) {
            return;
        }
        if (this.refereceList == null) {
            this.refereceList = new Vector();
        }
        this.refereceList.add(marker);
    }

    @Override // org.slf4j.Marker
    public boolean contains(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if (this.name.equals(str)) {
            return true;
        }
        if (hasReferences()) {
            for (int i4 = 0; i4 < this.refereceList.size(); i4++) {
                if (((Marker) this.refereceList.get(i4)).contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.slf4j.Marker
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Marker)) {
            return this.name.equals(((Marker) obj).getName());
        }
        return false;
    }

    @Override // org.slf4j.Marker
    public String getName() {
        return this.name;
    }

    @Override // org.slf4j.Marker
    public boolean hasChildren() {
        return hasReferences();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    @Override // org.slf4j.Marker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean hasReferences() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.List r0 = r1.refereceList     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Ld
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L10
            if (r0 <= 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            monitor-exit(r1)
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.slf4j.helpers.BasicMarker.hasReferences():boolean");
    }

    @Override // org.slf4j.Marker
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override // org.slf4j.Marker
    public synchronized Iterator iterator() {
        List list = this.refereceList;
        if (list != null) {
            return list.iterator();
        }
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // org.slf4j.Marker
    public synchronized boolean remove(Marker marker) {
        List list = this.refereceList;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (marker.equals((Marker) this.refereceList.get(i4))) {
                this.refereceList.remove(i4);
                return true;
            }
        }
        return false;
    }

    public String toString() {
        if (!hasReferences()) {
            return getName();
        }
        Iterator it = iterator();
        StringBuffer stringBuffer = new StringBuffer(getName());
        stringBuffer.append(' ');
        String str = OPEN;
        while (true) {
            stringBuffer.append(str);
            while (it.hasNext()) {
                stringBuffer.append(((Marker) it.next()).getName());
                if (it.hasNext()) {
                    break;
                }
            }
            stringBuffer.append(CLOSE);
            return stringBuffer.toString();
            str = SEP;
        }
    }

    @Override // org.slf4j.Marker
    public boolean contains(Marker marker) {
        if (marker == null) {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if (equals(marker)) {
            return true;
        }
        if (hasReferences()) {
            for (int i4 = 0; i4 < this.refereceList.size(); i4++) {
                if (((Marker) this.refereceList.get(i4)).contains(marker)) {
                    return true;
                }
            }
        }
        return false;
    }
}
