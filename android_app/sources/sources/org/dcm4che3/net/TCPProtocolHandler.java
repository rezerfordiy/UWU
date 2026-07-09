package org.dcm4che3.net;

import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public interface TCPProtocolHandler {
    void onAccept(Connection connection, Socket socket) throws IOException;
}
