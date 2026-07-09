package org.dcm4che3.tool.common;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class FilesetInfo {
    private File descFile;
    private String descFileCharset;
    private String id;
    private String uid;

    public final File getDescriptorFile() {
        return this.descFile;
    }

    public final String getDescriptorFileCharset() {
        return this.descFileCharset;
    }

    public final String getFilesetID() {
        return this.id;
    }

    public final String getFilesetUID() {
        return this.uid;
    }

    public final void setDescriptorFile(File file) {
        this.descFile = file;
    }

    public final void setDescriptorFileCharset(String str) {
        this.descFileCharset = str;
    }

    public final void setFilesetID(String str) {
        this.id = str;
    }

    public final void setFilesetUID(String str) {
        this.uid = str;
    }
}
