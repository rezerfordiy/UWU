package org.dcm4che3.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes.dex */
class TCPListener implements Listener {
    private final Connection conn;
    private final TCPProtocolHandler handler;
    private final ServerSocket ss;

    public TCPListener(Connection connection, TCPProtocolHandler tCPProtocolHandler) throws GeneralSecurityException, IOException {
        try {
            this.conn = connection;
            this.handler = tCPProtocolHandler;
            ServerSocket serverSocketCreateTLSServerSocket = connection.isTls() ? createTLSServerSocket(connection) : new ServerSocket();
            this.ss = serverSocketCreateTLSServerSocket;
            connection.setReceiveBufferSize(serverSocketCreateTLSServerSocket);
            serverSocketCreateTLSServerSocket.bind(connection.getBindPoint(), connection.getBacklog());
            connection.getDevice().execute(new Runnable() { // from class: org.dcm4che3.net.TCPListener.1
                @Override // java.lang.Runnable
                public void run() {
                    TCPListener.this.listen();
                }
            });
        } catch (IOException e4) {
            throw new IOException("Unable to start TCPListener on " + connection.getHostname() + ":" + connection.getPort(), e4);
        }
    }

    private ServerSocket createTLSServerSocket(Connection connection) throws GeneralSecurityException, IOException {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) connection.getDevice().sslContext().getServerSocketFactory().createServerSocket();
        sSLServerSocket.setEnabledProtocols(connection.getTlsProtocols());
        sSLServerSocket.setEnabledCipherSuites(connection.getTlsCipherSuites());
        sSLServerSocket.setNeedClientAuth(connection.isTlsNeedClientAuth());
        return sSLServerSocket;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void listen() {
        Connection connection;
        SocketAddress localSocketAddress = this.ss.getLocalSocketAddress();
        Connection.LOG.info("Start TCP Listener on {}", localSocketAddress);
        while (!this.ss.isClosed()) {
            try {
                Logger logger = Connection.LOG;
                logger.debug("Wait for connection on {}", localSocketAddress);
                Socket socketAccept = this.ss.accept();
                ConnectionMonitor connectionMonitor = this.conn.getDevice() != null ? this.conn.getDevice().getConnectionMonitor() : null;
                if (this.conn.isBlackListed(socketAccept.getInetAddress())) {
                    if (connectionMonitor != null) {
                        connectionMonitor.onConnectionRejectedBlacklisted(this.conn, socketAccept);
                    }
                    logger.info("Reject blacklisted connection {}", socketAccept);
                    connection = this.conn;
                } else {
                    try {
                        this.conn.setSocketSendOptions(socketAccept);
                        if (socketAccept instanceof SSLSocket) {
                            ((SSLSocket) socketAccept).startHandshake();
                        }
                        if (connectionMonitor != null) {
                            connectionMonitor.onConnectionAccepted(this.conn, socketAccept);
                        }
                        logger.info("Accept connection {}", socketAccept);
                        try {
                            this.handler.onAccept(this.conn, socketAccept);
                        } catch (Throwable th) {
                            Connection.LOG.warn("Exception on accepted connection {}:", socketAccept, th);
                            connection = this.conn;
                            connection.close(socketAccept);
                        }
                    } catch (Throwable th2) {
                        if (connectionMonitor != null) {
                            connectionMonitor.onConnectionRejected(this.conn, socketAccept, th2);
                        }
                        Connection.LOG.warn("Reject connection {}:", socketAccept, th2);
                        connection = this.conn;
                    }
                }
                connection.close(socketAccept);
            } catch (Throwable th3) {
                if (!this.ss.isClosed()) {
                    Connection.LOG.error("Exception on listing on {}:", localSocketAddress, th3);
                }
            }
        }
        Connection.LOG.info("Stop TCP Listener on {}", localSocketAddress);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.ss.close();
        } catch (Throwable unused) {
        }
    }

    @Override // org.dcm4che3.net.Listener
    public SocketAddress getEndPoint() {
        return this.ss.getLocalSocketAddress();
    }
}
