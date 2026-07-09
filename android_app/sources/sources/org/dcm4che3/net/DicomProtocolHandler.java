package org.dcm4che3.net;

import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
enum DicomProtocolHandler implements TCPProtocolHandler {
    INSTANCE;

    @Override // org.dcm4che3.net.TCPProtocolHandler
    public void onAccept(Connection connection, Socket socket) throws IOException {
        new Association(null, connection, socket);
    }
}
