package o0;

import android.net.TrafficStats;
import c.j0;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    @Deprecated
    public static void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    public static int b() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    public static void c(int i4) {
        TrafficStats.incrementOperationCount(i4);
    }

    @Deprecated
    public static void d(int i4, int i5) {
        TrafficStats.incrementOperationCount(i4, i5);
    }

    @Deprecated
    public static void e(int i4) {
        TrafficStats.setThreadStatsTag(i4);
    }

    public static void f(@j0 DatagramSocket datagramSocket) throws SocketException {
        TrafficStats.tagDatagramSocket(datagramSocket);
    }

    @Deprecated
    public static void g(Socket socket) throws SocketException {
        TrafficStats.tagSocket(socket);
    }

    public static void h(@j0 DatagramSocket datagramSocket) throws SocketException {
        TrafficStats.untagDatagramSocket(datagramSocket);
    }

    @Deprecated
    public static void i(Socket socket) throws SocketException {
        TrafficStats.untagSocket(socket);
    }
}
