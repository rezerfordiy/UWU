package org.dcm4che3.net;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class AEExtension implements Serializable {
    private static final long serialVersionUID = -8287458555186708798L;
    protected ApplicationEntity ae;

    public final ApplicationEntity getApplicationEntity() {
        return this.ae;
    }

    public void reconfigure(AEExtension aEExtension) {
    }

    public void setApplicationEntity(ApplicationEntity applicationEntity) {
        if (applicationEntity == null || this.ae == null) {
            this.ae = applicationEntity;
            return;
        }
        throw new IllegalStateException("already owned by AE: " + applicationEntity.getAETitle());
    }
}
