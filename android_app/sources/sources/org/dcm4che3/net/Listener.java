package org.dcm4che3.net;

import java.io.Closeable;
import java.net.SocketAddress;

/* JADX INFO: loaded from: classes.dex */
public interface Listener extends Closeable {
    SocketAddress getEndPoint();
}
