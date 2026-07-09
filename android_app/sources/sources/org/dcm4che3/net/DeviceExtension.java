package org.dcm4che3.net;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class DeviceExtension implements Serializable {
    private static final long serialVersionUID = -548874586138178220L;
    protected Device device;

    public final Device getDevice() {
        return this.device;
    }

    public void reconfigure(DeviceExtension deviceExtension) {
    }

    public void setDevice(Device device) {
        if (device == null || this.device == null) {
            this.device = device;
            return;
        }
        throw new IllegalStateException("already owned by Device: " + device.getDeviceName());
    }

    public void verifyNotUsed(Connection connection) {
    }
}
