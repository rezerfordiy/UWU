package org.dcm4che3.net;

import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public interface ConnectionMonitor {
    void onConnectionAccepted(Connection connection, Socket socket);

    void onConnectionEstablished(Connection connection, Connection connection2, Socket socket);

    void onConnectionFailed(Connection connection, Connection connection2, Socket socket, Throwable th);

    void onConnectionRejected(Connection connection, Socket socket, Throwable th);

    void onConnectionRejectedBlacklisted(Connection connection, Socket socket);
}
