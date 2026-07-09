package org.dcm4che3.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.dcm4che3.util.Base64;
import org.dcm4che3.util.SafeClose;
import org.dcm4che3.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s0.a;

/* JADX INFO: loaded from: classes.dex */
public class Connection implements Serializable {
    public static final int DEF_BACKLOG = 50;
    public static final int DEF_BUFFERSIZE = 0;
    public static final int DEF_MAX_PDU_LENGTH = 16378;
    public static final int DEF_SOCKETDELAY = 50;
    public static final int NOT_LISTENING = -1;
    public static final int NO_TIMEOUT = 0;
    public static final int SYNCHRONOUS_MODE = 1;
    public static final String TLS_RSA_WITH_3DES_EDE_CBC_SHA = "SSL_RSA_WITH_3DES_EDE_CBC_SHA";
    public static final String TLS_RSA_WITH_AES_128_CBC_SHA = "TLS_RSA_WITH_AES_128_CBC_SHA";
    public static final String TLS_RSA_WITH_NULL_SHA = "SSL_RSA_WITH_NULL_SHA";
    private static final long serialVersionUID = -7814748788035232055L;
    private int acceptTimeout;
    private int backlog;
    private transient InetAddress bindAddr;
    private String bindAddress;
    private String[] blacklist;
    private transient List<InetAddress> blacklistAddrs;
    private transient InetAddress clientBindAddr;
    private String clientBindAddress;
    private String commonName;
    private int connectTimeout;
    private Device device;
    private transient InetAddress hostAddr;
    private String hostname;
    private String httpProxy;
    private int idleTimeout;
    private Boolean installed;
    private volatile transient Listener listener;
    private int maxOpsInvoked;
    private int maxOpsPerformed;
    private boolean packPDV;
    private int port;
    private Protocol protocol;
    private transient boolean rebindNeeded;
    private int receiveBufferSize;
    private int receivePDULength;
    private int releaseTimeout;
    private int requestTimeout;
    private int responseTimeout;
    private int retrieveTimeout;
    private int sendBufferSize;
    private int sendPDULength;
    private int socketCloseDelay;
    private boolean tcpNoDelay;
    private String[] tlsCipherSuites;
    private boolean tlsNeedClientAuth;
    private String[] tlsProtocols;
    public static final Logger LOG = LoggerFactory.getLogger(Connection.class);
    public static final String[] DEFAULT_TLS_PROTOCOLS = {"TLSv1.2", "TLSv1.1", "TLSv1"};
    private static final EnumMap<Protocol, TCPProtocolHandler> tcpHandlers = new EnumMap<>(Protocol.class);
    private static final EnumMap<Protocol, UDPProtocolHandler> udpHandlers = new EnumMap<>(Protocol.class);

    public static class HTTPResponse extends ByteArrayOutputStream {
        private final String rsp;

        public HTTPResponse(Socket socket) throws IOException {
            super(64);
            InputStream inputStream = socket.getInputStream();
            while (true) {
                boolean z3 = false;
                while (true) {
                    int i4 = inputStream.read();
                    if (i4 == -1) {
                        throw new IOException("Unexpected EOF from " + socket);
                    }
                    write(i4);
                    if (i4 == 10) {
                        if (z3) {
                            this.rsp = new String(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, "US-ASCII");
                            return;
                        }
                        z3 = true;
                    } else if (i4 != 13) {
                        break;
                    }
                }
            }
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            return this.rsp;
        }
    }

    public enum Protocol {
        DICOM,
        HL7,
        SYSLOG_TLS,
        SYSLOG_UDP;

        public boolean isSyslog() {
            return this == SYSLOG_TLS || this == SYSLOG_UDP;
        }

        public boolean isTCP() {
            return this != SYSLOG_UDP;
        }
    }

    static {
        registerTCPProtocolHandler(Protocol.DICOM, DicomProtocolHandler.INSTANCE);
    }

    public Connection() {
        this.port = -1;
        this.backlog = 50;
        this.socketCloseDelay = 50;
        this.sendPDULength = DEF_MAX_PDU_LENGTH;
        this.receivePDULength = DEF_MAX_PDU_LENGTH;
        this.maxOpsPerformed = 1;
        this.maxOpsInvoked = 1;
        this.packPDV = true;
        this.tcpNoDelay = true;
        this.tlsNeedClientAuth = true;
        this.tlsCipherSuites = new String[0];
        this.tlsProtocols = DEFAULT_TLS_PROTOCOLS;
        this.blacklist = new String[0];
        this.protocol = Protocol.DICOM;
    }

    private InetAddress bindAddr() throws UnknownHostException {
        String str = this.bindAddress;
        if (str == null) {
            return hostAddr();
        }
        if (this.bindAddr == null) {
            this.bindAddr = InetAddress.getByName(str);
        }
        return this.bindAddr;
    }

    private List<InetAddress> blacklistAddrs() {
        if (this.blacklistAddrs == null) {
            this.blacklistAddrs = new ArrayList(this.blacklist.length);
            for (String str : this.blacklist) {
                try {
                    this.blacklistAddrs.add(InetAddress.getByName(str));
                } catch (UnknownHostException e4) {
                    LOG.warn("Failed to lookup InetAddress of " + str, (Throwable) e4);
                }
            }
        }
        return this.blacklistAddrs;
    }

    private void checkCompatible(Connection connection) throws IncompatibleConnectionException {
        if (!isCompatible(connection)) {
            throw new IncompatibleConnectionException(connection.toString());
        }
    }

    private void checkInstalled() {
        if (!isInstalled()) {
            throw new IllegalStateException("Not installed");
        }
    }

    private InetAddress clientBindAddr() throws UnknownHostException {
        String str = this.clientBindAddress;
        if (str == null) {
            return hostAddr();
        }
        if (this.clientBindAddr == null) {
            this.clientBindAddr = InetAddress.getByName(str);
        }
        return this.clientBindAddr;
    }

    private SSLSocket createTLSSocket(Socket socket, Connection connection) throws GeneralSecurityException, IOException {
        SSLSocket sSLSocket = (SSLSocket) this.device.sslContext().getSocketFactory().createSocket(socket, connection.getHostname(), connection.getPort(), true);
        sSLSocket.setEnabledProtocols(intersect(connection.getTlsProtocols(), getTlsProtocols()));
        sSLSocket.setEnabledCipherSuites(intersect(connection.tlsCipherSuites, this.tlsCipherSuites));
        sSLSocket.startHandshake();
        return sSLSocket;
    }

    private void doProxyHandshake(Socket socket, String str, int i4, String str2, int i5) throws IOException {
        StringBuilder sb = new StringBuilder(128);
        sb.append("CONNECT ");
        sb.append(str);
        sb.append(':');
        sb.append(i4);
        sb.append(" HTTP/1.1\r\nHost: ");
        sb.append(str);
        sb.append(':');
        sb.append(i4);
        if (str2 != null) {
            byte[] bytes = str2.getBytes("UTF-8");
            char[] cArr = new char[((bytes.length + 2) / 3) * 4];
            Base64.encode(bytes, 0, bytes.length, cArr, 0);
            sb.append("\r\nProxy-Authorization: basic ");
            sb.append(cArr);
        }
        sb.append("\r\n\r\n");
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(sb.toString().getBytes("US-ASCII"));
        outputStream.flush();
        socket.setSoTimeout(i5);
        String string = new HTTPResponse(socket).toString();
        socket.setSoTimeout(0);
        if (string.startsWith("HTTP/1.1 2")) {
            return;
        }
        throw new IOException("Unable to tunnel through " + socket + ". Proxy returns \"" + string + '\"');
    }

    private boolean hasCommon(String[] strArr, String[] strArr2) {
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private InetAddress hostAddr() throws UnknownHostException {
        String str;
        if (this.hostAddr == null && (str = this.hostname) != null) {
            this.hostAddr = InetAddress.getByName(str);
        }
        return this.hostAddr;
    }

    private static String[] intersect(String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        String[] strArr3 = new String[iMin];
        int i4 = 0;
        for (String str : strArr) {
            int length = strArr2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (str.equals(strArr2[i5])) {
                    strArr3[i4] = str;
                    i4++;
                    break;
                }
                i5++;
            }
        }
        if (i4 == iMin) {
            return strArr3;
        }
        String[] strArr4 = new String[i4];
        System.arraycopy(strArr3, 0, strArr4, 0, i4);
        return strArr4;
    }

    public static TCPProtocolHandler registerTCPProtocolHandler(Protocol protocol, TCPProtocolHandler tCPProtocolHandler) {
        return tcpHandlers.put(protocol, tCPProtocolHandler);
    }

    public static UDPProtocolHandler registerUDPProtocolHandler(Protocol protocol, UDPProtocolHandler uDPProtocolHandler) {
        return udpHandlers.put(protocol, uDPProtocolHandler);
    }

    public static TCPProtocolHandler unregisterTCPProtocolHandler(Protocol protocol) {
        return tcpHandlers.remove(protocol);
    }

    public static UDPProtocolHandler unregisterUDPProtocolHandler(Protocol protocol) {
        return udpHandlers.remove(protocol);
    }

    public synchronized boolean bind() throws GeneralSecurityException, IOException {
        Listener uDPListener;
        if (isInstalled() && isServer()) {
            if (this.device == null) {
                throw new IllegalStateException("Not attached to Device");
            }
            if (isListening()) {
                throw new IllegalStateException("Already listening - " + this.listener);
            }
            if (this.protocol.isTCP()) {
                TCPProtocolHandler tCPProtocolHandler = tcpHandlers.get(this.protocol);
                if (tCPProtocolHandler == null) {
                    throw new IllegalStateException("No TCP Protocol Handler for protocol " + this.protocol);
                }
                uDPListener = new TCPListener(this, tCPProtocolHandler);
            } else {
                UDPProtocolHandler uDPProtocolHandler = udpHandlers.get(this.protocol);
                if (uDPProtocolHandler == null) {
                    throw new IllegalStateException("No UDP Protocol Handler for protocol " + this.protocol);
                }
                uDPListener = new UDPListener(this, uDPProtocolHandler);
            }
            this.listener = uDPListener;
            this.rebindNeeded = false;
            return true;
        }
        this.rebindNeeded = false;
        return false;
    }

    public void close(Socket socket) {
        LOG.info("Close connection {}", socket);
        SafeClose.close(socket);
    }

    public Socket connect(Connection connection) throws GeneralSecurityException, IOException, IncompatibleConnectionException {
        String str;
        checkInstalled();
        if (!this.protocol.isTCP()) {
            throw new IllegalStateException("Not a TCP Connection");
        }
        checkCompatible(connection);
        InetSocketAddress clientBindPoint = getClientBindPoint();
        String hostname = connection.getHostname();
        int port = connection.getPort();
        Logger logger = LOG;
        logger.info("Initiate connection from {} to {}:{}", clientBindPoint, hostname, Integer.valueOf(port));
        Socket socket = new Socket();
        Device device = this.device;
        ConnectionMonitor connectionMonitor = device != null ? device.getConnectionMonitor() : null;
        try {
            try {
                socket.bind(clientBindPoint);
                setReceiveBufferSize(socket);
                setSocketSendOptions(socket);
                String httpProxy = connection.getHttpProxy();
                if (httpProxy != null) {
                    String[] strArrSplit = StringUtils.split(httpProxy, '@');
                    if (strArrSplit.length > 1) {
                        str = strArrSplit[0];
                        httpProxy = strArrSplit[1];
                    } else {
                        str = null;
                    }
                    String[] strArrSplit2 = StringUtils.split(httpProxy, ':');
                    socket.connect(new InetSocketAddress(strArrSplit2[0], strArrSplit2.length > 1 ? Integer.parseInt(strArrSplit2[1]) : 8080), this.connectTimeout);
                    try {
                        doProxyHandshake(socket, hostname, port, str, this.connectTimeout);
                    } catch (IOException e4) {
                        SafeClose.close(socket);
                        throw e4;
                    }
                } else {
                    socket.connect(connection.getEndPoint(), this.connectTimeout);
                }
                if (isTls()) {
                    socket = createTLSSocket(socket, connection);
                }
                if (connectionMonitor != null) {
                    connectionMonitor.onConnectionEstablished(this, connection, socket);
                }
                logger.info("Established connection {}", socket);
                return socket;
            } catch (GeneralSecurityException e5) {
                if (connectionMonitor != null) {
                    connectionMonitor.onConnectionFailed(this, connection, socket, e5);
                }
                SafeClose.close(socket);
                throw e5;
            }
        } catch (IOException e6) {
            if (connectionMonitor != null) {
                connectionMonitor.onConnectionFailed(this, connection, socket, e6);
            }
            SafeClose.close(socket);
            throw e6;
        }
    }

    public DatagramSocket createDatagramSocket() throws IOException {
        checkInstalled();
        if (this.protocol.isTCP()) {
            throw new IllegalStateException("Not a UDP Connection");
        }
        DatagramSocket datagramSocket = new DatagramSocket(getClientBindPoint());
        int sendBufferSize = datagramSocket.getSendBufferSize();
        int i4 = this.sendBufferSize;
        if (i4 == 0) {
            this.sendBufferSize = sendBufferSize;
        } else if (i4 != sendBufferSize) {
            datagramSocket.setSendBufferSize(i4);
            sendBufferSize = datagramSocket.getSendBufferSize();
            this.sendBufferSize = sendBufferSize;
        }
        return datagramSocket;
    }

    public boolean equalsRDN(Connection connection) {
        String str = this.commonName;
        return str != null ? str.equals(connection.commonName) : connection.commonName == null && this.hostname.equals(connection.hostname) && this.port == connection.port && this.protocol == connection.protocol;
    }

    public final int getAcceptTimeout() {
        return this.acceptTimeout;
    }

    public final int getBacklog() {
        return this.backlog;
    }

    public final String getBindAddress() {
        return this.bindAddress;
    }

    public InetSocketAddress getBindPoint() throws UnknownHostException {
        return new InetSocketAddress(bindAddr(), this.port);
    }

    public final String[] getBlacklist() {
        return this.blacklist;
    }

    public String getClientBindAddress() {
        return this.clientBindAddress;
    }

    public InetSocketAddress getClientBindPoint() throws UnknownHostException {
        return new InetSocketAddress(clientBindAddr(), 0);
    }

    public final String getCommonName() {
        return this.commonName;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final Device getDevice() {
        return this.device;
    }

    public InetSocketAddress getEndPoint() throws UnknownHostException {
        return new InetSocketAddress(hostAddr(), this.port);
    }

    public final String getHostname() {
        return this.hostname;
    }

    public final String getHttpProxy() {
        return this.httpProxy;
    }

    public final int getIdleTimeout() {
        return this.idleTimeout;
    }

    public Boolean getInstalled() {
        return this.installed;
    }

    public Listener getListener() {
        return this.listener;
    }

    public final int getMaxOpsInvoked() {
        return this.maxOpsInvoked;
    }

    public final int getMaxOpsPerformed() {
        return this.maxOpsPerformed;
    }

    public final int getPort() {
        return this.port;
    }

    public Protocol getProtocol() {
        return this.protocol;
    }

    public final int getReceiveBufferSize() {
        return this.receiveBufferSize;
    }

    public final int getReceivePDULength() {
        return this.receivePDULength;
    }

    public final int getReleaseTimeout() {
        return this.releaseTimeout;
    }

    public final int getRequestTimeout() {
        return this.requestTimeout;
    }

    public final int getResponseTimeout() {
        return this.responseTimeout;
    }

    public final int getRetrieveTimeout() {
        return this.retrieveTimeout;
    }

    public final int getSendBufferSize() {
        return this.sendBufferSize;
    }

    public final int getSendPDULength() {
        return this.sendPDULength;
    }

    public final int getSocketCloseDelay() {
        return this.socketCloseDelay;
    }

    public String[] getTlsCipherSuites() {
        return this.tlsCipherSuites;
    }

    public final String[] getTlsProtocols() {
        return this.tlsProtocols;
    }

    public boolean isBlackListed(InetAddress inetAddress) {
        return blacklistAddrs().contains(inetAddress);
    }

    public boolean isCompatible(Connection connection) {
        Protocol protocol = connection.protocol;
        Protocol protocol2 = this.protocol;
        if (protocol != protocol2) {
            return false;
        }
        if (protocol2.isTCP()) {
            return !isTls() ? !connection.isTls() : hasCommon(connection.getTlsProtocols(), getTlsProtocols()) && hasCommon(connection.tlsCipherSuites, this.tlsCipherSuites);
        }
        return true;
    }

    public boolean isInstalled() {
        Boolean bool;
        Device device = this.device;
        return device != null && device.isInstalled() && ((bool = this.installed) == null || bool.booleanValue());
    }

    public final boolean isListening() {
        return this.listener != null;
    }

    public final boolean isPackPDV() {
        return this.packPDV;
    }

    public boolean isRebindNeeded() {
        return this.rebindNeeded;
    }

    public final boolean isServer() {
        return this.port > 0;
    }

    public final boolean isTcpNoDelay() {
        return this.tcpNoDelay;
    }

    public final boolean isTls() {
        return this.tlsCipherSuites.length > 0;
    }

    public final boolean isTlsNeedClientAuth() {
        return this.tlsNeedClientAuth;
    }

    public void needRebind() {
        this.rebindNeeded = true;
    }

    public StringBuilder promptTo(StringBuilder sb, String str) {
        String str2 = str + "  ";
        StringUtils.appendLine(sb, str, "Connection[cn: ", this.commonName);
        StringUtils.appendLine(sb, str2, "host: ", this.hostname);
        StringUtils.appendLine(sb, str2, "port: ", Integer.valueOf(this.port));
        StringUtils.appendLine(sb, str2, "ciphers: ", Arrays.toString(this.tlsCipherSuites));
        StringUtils.appendLine(sb, str2, "installed: ", getInstalled());
        sb.append(str);
        sb.append(']');
        return sb;
    }

    public synchronized void rebind() throws GeneralSecurityException, IOException {
        unbind();
        bind();
    }

    public void reconfigure(Connection connection) {
        setCommonName(connection.commonName);
        setHostname(connection.hostname);
        setPort(connection.port);
        setBindAddress(connection.bindAddress);
        setClientBindAddress(connection.clientBindAddress);
        setProtocol(connection.protocol);
        setHttpProxy(connection.httpProxy);
        setBacklog(connection.backlog);
        setConnectTimeout(connection.connectTimeout);
        setRequestTimeout(connection.requestTimeout);
        setAcceptTimeout(connection.acceptTimeout);
        setReleaseTimeout(connection.releaseTimeout);
        setResponseTimeout(connection.responseTimeout);
        setRetrieveTimeout(connection.retrieveTimeout);
        setIdleTimeout(connection.idleTimeout);
        setSocketCloseDelay(connection.socketCloseDelay);
        setSendBufferSize(connection.sendBufferSize);
        setReceiveBufferSize(connection.receiveBufferSize);
        setSendPDULength(connection.sendPDULength);
        setReceivePDULength(connection.receivePDULength);
        setMaxOpsPerformed(connection.maxOpsPerformed);
        setMaxOpsPerformed(connection.maxOpsInvoked);
        setPackPDV(connection.packPDV);
        setTcpNoDelay(connection.tcpNoDelay);
        setTlsNeedClientAuth(connection.tlsNeedClientAuth);
        setTlsCipherSuites(connection.tlsCipherSuites);
        setTlsProtocols(connection.tlsProtocols);
        setBlacklist(connection.blacklist);
        setInstalled(connection.installed);
    }

    public final void setAcceptTimeout(int i4) {
        if (i4 >= 0) {
            this.acceptTimeout = i4;
            return;
        }
        throw new IllegalArgumentException("timeout: " + i4);
    }

    public final void setBacklog(int i4) {
        if (this.backlog == i4) {
            return;
        }
        if (i4 >= 1) {
            this.backlog = i4;
            needRebind();
        } else {
            throw new IllegalArgumentException("backlog: " + i4);
        }
    }

    public final void setBindAddress(String str) {
        String str2 = this.bindAddress;
        if (str != null) {
            if (str.equals(str2)) {
                return;
            }
        } else if (str2 == null) {
            return;
        }
        this.bindAddress = str;
        this.bindAddr = null;
        needRebind();
    }

    public final void setBlacklist(String[] strArr) {
        this.blacklist = strArr;
        this.blacklistAddrs = null;
    }

    public void setClientBindAddress(String str) {
        String str2 = this.clientBindAddress;
        if (str != null) {
            if (str.equals(str2)) {
                return;
            }
        } else if (str2 == null) {
            return;
        }
        this.clientBindAddress = str;
        this.clientBindAddr = null;
    }

    public final void setCommonName(String str) {
        this.commonName = str;
    }

    public final void setConnectTimeout(int i4) {
        if (i4 >= 0) {
            this.connectTimeout = i4;
            return;
        }
        throw new IllegalArgumentException("timeout: " + i4);
    }

    public final void setDevice(Device device) {
        if (device == null || this.device == null) {
            this.device = device;
            return;
        }
        throw new IllegalStateException("already owned by " + device);
    }

    public final void setHostname(String str) {
        String str2 = this.hostname;
        if (str != null) {
            if (str.equals(str2)) {
                return;
            }
        } else if (str2 == null) {
            return;
        }
        this.hostname = str;
        needRebind();
    }

    public final void setHttpProxy(String str) {
        this.httpProxy = str;
    }

    public final void setIdleTimeout(int i4) {
        this.idleTimeout = i4;
    }

    public void setInstalled(Boolean bool) {
        if (this.installed == bool) {
            return;
        }
        boolean zIsInstalled = isInstalled();
        this.installed = bool;
        if (isInstalled() != zIsInstalled) {
            needRebind();
        }
    }

    public final void setMaxOpsInvoked(int i4) {
        this.maxOpsInvoked = i4;
    }

    public final void setMaxOpsPerformed(int i4) {
        this.maxOpsPerformed = i4;
    }

    public final void setPackPDV(boolean z3) {
        this.packPDV = z3;
    }

    public final void setPort(int i4) {
        if (this.port == i4) {
            return;
        }
        if ((i4 > 0 && i4 <= 65535) || i4 == -1) {
            this.port = i4;
            needRebind();
        } else {
            throw new IllegalArgumentException("port out of range:" + i4);
        }
    }

    public void setProtocol(Protocol protocol) {
        protocol.getClass();
        if (this.protocol == protocol) {
            return;
        }
        this.protocol = protocol;
        needRebind();
    }

    public final void setReceiveBufferSize(int i4) {
        if (i4 >= 0) {
            this.receiveBufferSize = i4;
            return;
        }
        throw new IllegalArgumentException("size: " + i4);
    }

    public final void setReceivePDULength(int i4) {
        this.receivePDULength = i4;
    }

    public final void setReleaseTimeout(int i4) {
        if (i4 >= 0) {
            this.releaseTimeout = i4;
            return;
        }
        throw new IllegalArgumentException("timeout: " + i4);
    }

    public final void setRequestTimeout(int i4) {
        if (i4 >= 0) {
            this.requestTimeout = i4;
            return;
        }
        throw new IllegalArgumentException("timeout: " + i4);
    }

    public final void setResponseTimeout(int i4) {
        this.responseTimeout = i4;
    }

    public final void setRetrieveTimeout(int i4) {
        this.retrieveTimeout = i4;
    }

    public final void setSendBufferSize(int i4) {
        if (i4 >= 0) {
            this.sendBufferSize = i4;
            return;
        }
        throw new IllegalArgumentException("size: " + i4);
    }

    public final void setSendPDULength(int i4) {
        this.sendPDULength = i4;
    }

    public final void setSocketCloseDelay(int i4) {
        if (i4 >= 0) {
            this.socketCloseDelay = i4;
            return;
        }
        throw new IllegalArgumentException("delay: " + i4);
    }

    public void setSocketSendOptions(Socket socket) throws SocketException {
        int sendBufferSize = socket.getSendBufferSize();
        int i4 = this.sendBufferSize;
        if (i4 == 0) {
            this.sendBufferSize = sendBufferSize;
        } else if (i4 != sendBufferSize) {
            socket.setSendBufferSize(i4);
            sendBufferSize = socket.getSendBufferSize();
            this.sendBufferSize = sendBufferSize;
        }
        boolean tcpNoDelay = socket.getTcpNoDelay();
        boolean z3 = this.tcpNoDelay;
        if (tcpNoDelay != z3) {
            socket.setTcpNoDelay(z3);
        }
    }

    public final void setTcpNoDelay(boolean z3) {
        this.tcpNoDelay = z3;
    }

    public void setTlsCipherSuites(String... strArr) {
        if (Arrays.equals(this.tlsCipherSuites, strArr)) {
            return;
        }
        this.tlsCipherSuites = strArr;
        needRebind();
    }

    public final void setTlsNeedClientAuth(boolean z3) {
        if (this.tlsNeedClientAuth == z3) {
            return;
        }
        this.tlsNeedClientAuth = z3;
        needRebind();
    }

    public final void setTlsProtocols(String... strArr) {
        if (Arrays.equals(this.tlsProtocols, strArr)) {
            return;
        }
        this.tlsProtocols = strArr;
        needRebind();
    }

    public String toString() {
        return promptTo(new StringBuilder(), a.f11071l).toString();
    }

    public synchronized void unbind() {
        Listener listener = this.listener;
        if (listener == null) {
            return;
        }
        this.listener = null;
        try {
            listener.close();
        } catch (Throwable unused) {
        }
    }

    public final boolean useHttpProxy() {
        return this.httpProxy != null;
    }

    public Connection(String str, String str2) {
        this(str, str2, -1);
    }

    public void setReceiveBufferSize(DatagramSocket datagramSocket) throws SocketException {
        int receiveBufferSize = datagramSocket.getReceiveBufferSize();
        int i4 = this.receiveBufferSize;
        if (i4 == 0) {
            this.receiveBufferSize = receiveBufferSize;
        } else if (i4 != receiveBufferSize) {
            datagramSocket.setReceiveBufferSize(i4);
            this.receiveBufferSize = datagramSocket.getReceiveBufferSize();
        }
    }

    public Connection(String str, String str2, int i4) {
        this.port = -1;
        this.backlog = 50;
        this.socketCloseDelay = 50;
        this.sendPDULength = DEF_MAX_PDU_LENGTH;
        this.receivePDULength = DEF_MAX_PDU_LENGTH;
        this.maxOpsPerformed = 1;
        this.maxOpsInvoked = 1;
        this.packPDV = true;
        this.tcpNoDelay = true;
        this.tlsNeedClientAuth = true;
        this.tlsCipherSuites = new String[0];
        this.tlsProtocols = DEFAULT_TLS_PROTOCOLS;
        this.blacklist = new String[0];
        this.protocol = Protocol.DICOM;
        this.commonName = str;
        this.hostname = str2;
        this.port = i4;
    }

    public void setReceiveBufferSize(ServerSocket serverSocket) throws SocketException {
        int receiveBufferSize = serverSocket.getReceiveBufferSize();
        int i4 = this.receiveBufferSize;
        if (i4 == 0) {
            this.receiveBufferSize = receiveBufferSize;
        } else if (i4 != receiveBufferSize) {
            serverSocket.setReceiveBufferSize(i4);
            this.receiveBufferSize = serverSocket.getReceiveBufferSize();
        }
    }

    private void setReceiveBufferSize(Socket socket) throws SocketException {
        int receiveBufferSize = socket.getReceiveBufferSize();
        int i4 = this.receiveBufferSize;
        if (i4 == 0) {
            this.receiveBufferSize = receiveBufferSize;
        } else if (i4 != receiveBufferSize) {
            socket.setReceiveBufferSize(i4);
            this.receiveBufferSize = socket.getReceiveBufferSize();
        }
    }
}
