package org.dcm4che3.util;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public class SafeClose {
    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void close(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }
}
