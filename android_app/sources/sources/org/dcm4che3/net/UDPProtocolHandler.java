package org.dcm4che3.net;

import java.net.DatagramPacket;

/* JADX INFO: loaded from: classes.dex */
public interface UDPProtocolHandler {
    void onReceive(Connection connection, DatagramPacket datagramPacket);
}
