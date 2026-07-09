package org.dcm4che3.imageio.codec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class CompressionRules implements Iterable<CompressionRule>, Serializable {
    private static final long serialVersionUID = 5027417735779753342L;
    private final ArrayList<CompressionRule> list = new ArrayList<>();

    public void add(CompressionRule compressionRule) {
        if (findByCommonName(compressionRule.getCommonName()) == null) {
            int iBinarySearch = Collections.binarySearch(this.list, compressionRule);
            if (iBinarySearch < 0) {
                iBinarySearch = -(iBinarySearch + 1);
            }
            this.list.add(iBinarySearch, compressionRule);
            return;
        }
        throw new IllegalStateException("CompressionRule with cn: '" + compressionRule.getCommonName() + "' already exists");
    }

    public void clear() {
        this.list.clear();
    }

    public CompressionRule findByCommonName(String str) {
        for (CompressionRule compressionRule : this.list) {
            if (str.equals(compressionRule.getCommonName())) {
                return compressionRule;
            }
        }
        return null;
    }

    public CompressionRule findCompressionRule(String str, ImageDescriptor imageDescriptor) {
        for (CompressionRule compressionRule : this.list) {
            if (compressionRule.matchesCondition(str, imageDescriptor)) {
                return compressionRule;
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<CompressionRule> iterator() {
        return this.list.iterator();
    }

    public boolean remove(CompressionRule compressionRule) {
        return this.list.remove(compressionRule);
    }

    public void add(CompressionRules compressionRules) {
        Iterator<CompressionRule> it = compressionRules.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }
}
