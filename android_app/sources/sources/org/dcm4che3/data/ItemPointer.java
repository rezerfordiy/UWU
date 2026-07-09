package org.dcm4che3.data;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ItemPointer implements Serializable {
    private static final long serialVersionUID = 5183950023496022964L;
    public final int itemIndex;
    public final String privateCreator;
    public final int sequenceTag;

    public ItemPointer(int i4) {
        this(i4, null, 0);
    }

    public ItemPointer(int i4, int i5) {
        this(i4, null, i5);
    }

    public ItemPointer(int i4, String str) {
        this(i4, str, 0);
    }

    public ItemPointer(int i4, String str, int i5) {
        this.sequenceTag = i4;
        this.privateCreator = str;
        this.itemIndex = i5;
    }
}
