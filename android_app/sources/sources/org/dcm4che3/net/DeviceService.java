package org.dcm4che3.net;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class DeviceService implements DeviceServiceInterface {
    protected Device device;
    protected ExecutorService executor;
    protected ScheduledExecutorService scheduledExecutor;

    public ExecutorService executerService() {
        return Executors.newCachedThreadPool();
    }

    @Override // org.dcm4che3.net.DeviceServiceInterface
    public Device getDevice() {
        return this.device;
    }

    public void init(Device device) {
        setDevice(device);
    }

    @Override // org.dcm4che3.net.DeviceServiceInterface
    public boolean isRunning() {
        return this.executor != null;
    }

    public ScheduledExecutorService scheduledExecuterService() {
        return Executors.newSingleThreadScheduledExecutor();
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override // org.dcm4che3.net.DeviceServiceInterface
    public void start() throws Exception {
        if (this.device == null) {
            throw new IllegalStateException("Not initialized");
        }
        if (this.executor != null) {
            throw new IllegalStateException("Already started");
        }
        this.executor = executerService();
        this.scheduledExecutor = scheduledExecuterService();
        try {
            this.device.setExecutor(this.executor);
            this.device.setScheduledExecutor(this.scheduledExecutor);
            this.device.bindConnections();
        } catch (Exception e4) {
            stop();
            throw e4;
        }
    }

    @Override // org.dcm4che3.net.DeviceServiceInterface
    public void stop() {
        Device device = this.device;
        if (device != null) {
            device.unbindConnections();
        }
        ScheduledExecutorService scheduledExecutorService = this.scheduledExecutor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        ExecutorService executorService = this.executor;
        if (executorService != null) {
            executorService.shutdown();
        }
        this.executor = null;
        this.scheduledExecutor = null;
    }
}
