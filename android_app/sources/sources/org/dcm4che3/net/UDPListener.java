package org.dcm4che3.net;

import java.io.IOException;
import java.net.BindException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes.dex */
class UDPListener implements Listener {
    private static final int MAX_PACKAGE_LEN = 65536;
    private final Connection conn;
    private final DatagramSocket ds;
    private final UDPProtocolHandler handler;

    public UDPListener(Connection connection, UDPProtocolHandler uDPProtocolHandler) throws GeneralSecurityException, IOException {
        this.conn = connection;
        this.handler = uDPProtocolHandler;
        try {
            DatagramSocket datagramSocket = new DatagramSocket(connection.getBindPoint());
            this.ds = datagramSocket;
            connection.setReceiveBufferSize(datagramSocket);
            connection.getDevice().execute(new Runnable() { // from class: org.dcm4che3.net.UDPListener.1
                @Override // java.lang.Runnable
                public void run() {
                    UDPListener.this.listen();
                }
            });
        } catch (BindException e4) {
            throw new IOException("Cannot start UDP listener on " + connection.getBindPoint().getHostName() + ":" + connection.getBindPoint().getPort(), e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void listen() {
        SocketAddress localSocketAddress = this.ds.getLocalSocketAddress();
        Connection.LOG.info("Start UDP listener on {}", localSocketAddress);
        byte[] bArr = new byte[65536];
        while (!this.ds.isClosed()) {
            try {
                Logger logger = Connection.LOG;
                logger.debug("Wait for UDP datagram package on {}", localSocketAddress);
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 65536);
                this.ds.receive(datagramPacket);
                InetAddress address = datagramPacket.getAddress();
                if (this.conn.isBlackListed(datagramPacket.getAddress())) {
                    logger.info("Ignore UDP datagram package received from blacklisted {}", address);
                } else {
                    logger.info("Received UDP datagram package from {}", address);
                    try {
                        this.handler.onReceive(this.conn, datagramPacket);
                    } catch (Throwable th) {
                        Connection.LOG.warn("Exception processing UDP received from {}:", address, th);
                    }
                }
            } catch (Throwable th2) {
                if (!this.ds.isClosed()) {
                    Connection.LOG.error("Exception on listing on {}:", localSocketAddress, th2);
                }
            }
        }
        Connection.LOG.info("Stop UDP listener on {}", localSocketAddress);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.ds.close();
        } catch (Throwable unused) {
        }
    }

    @Override // org.dcm4che3.net.Listener
    public SocketAddress getEndPoint() {
        return this.ds.getLocalSocketAddress();
    }
}
