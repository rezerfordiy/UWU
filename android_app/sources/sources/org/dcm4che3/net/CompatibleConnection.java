package org.dcm4che3.net;

/* JADX INFO: loaded from: classes.dex */
public class CompatibleConnection {
    private final Connection localConn;
    private final Connection remoteConn;

    public CompatibleConnection(Connection connection, Connection connection2) {
        this.localConn = connection;
        this.remoteConn = connection2;
    }

    public final Connection getLocalConnection() {
        return this.localConn;
    }

    public final Connection getRemoteConnection() {
        return this.remoteConn;
    }
}
