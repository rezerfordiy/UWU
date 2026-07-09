package org.dcm4che3.net.service;

import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes.dex */
public class InstanceLocator implements Serializable {
    private static final long serialVersionUID = -5744253220472580137L;
    public final String cuid;
    public final String iuid;
    private Object obj;
    public final String tsuid;
    public final String uri;

    public InstanceLocator(String str, String str2, String str3, String str4) {
        this.cuid = str;
        this.iuid = str2;
        this.tsuid = str3;
        this.uri = str4;
    }

    public File getFile() {
        try {
            return new File(new URI(this.uri));
        } catch (URISyntaxException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public final Object getObject() {
        return this.obj;
    }

    public final InstanceLocator setObject(Object obj) {
        this.obj = obj;
        return this;
    }
}
