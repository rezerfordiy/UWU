package org.dcm4che3.data;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class IODCache {
    private final HashMap<String, IOD> map = new HashMap<>();

    public void clear() {
        this.map.clear();
    }

    public IOD get(String str) throws IOException {
        IOD iod = this.map.get(str);
        if (iod != null) {
            return iod;
        }
        HashMap<String, IOD> map = this.map;
        IOD iodLoad = IOD.load(str);
        map.put(str, iodLoad);
        return iodLoad;
    }
}
