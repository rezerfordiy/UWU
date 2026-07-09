package org.dcm4che3.imageio.codec;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.imageio.spi.ImageReaderWriterSpi;

/* JADX INFO: loaded from: classes.dex */
final class FormatNameFilterIterator<T extends ImageReaderWriterSpi> implements Iterator<T> {
    private final String formatName;
    private final Iterator<T> iter;
    private T next = null;

    public FormatNameFilterIterator(Iterator<T> it, String str) {
        this.iter = it;
        this.formatName = str;
        advance();
    }

    private void advance() {
        while (this.iter.hasNext()) {
            T next = this.iter.next();
            if (contains(next.getFormatNames(), this.formatName)) {
                this.next = next;
                return;
            }
        }
        this.next = null;
    }

    private static boolean contains(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public T next() {
        T t4 = this.next;
        if (t4 == null) {
            throw new NoSuchElementException();
        }
        advance();
        return t4;
    }
}
