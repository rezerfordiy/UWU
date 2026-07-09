package org.dcm4che3.net;

/* JADX INFO: loaded from: classes.dex */
public interface DeviceServiceInterface {
    Device getDevice();

    boolean isRunning();

    void start() throws Exception;

    void stop();
}
