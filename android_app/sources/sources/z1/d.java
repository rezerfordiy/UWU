package z1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Selector f12972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SocketChannel f12973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ExecutorService f12974g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f12977j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f12975h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Queue<byte[]> f12976i = new LinkedList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12978k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f12979l = new byte[1024];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12980m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12968a = 0;

    public d(g gVar) {
        this.f12977j = gVar;
        try {
            this.f12972e = Selector.open();
            this.f12974g = Executors.newSingleThreadExecutor();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(String str, int i4) {
        try {
            SocketChannel socketChannelOpen = SocketChannel.open();
            this.f12973f = socketChannelOpen;
            socketChannelOpen.configureBlocking(false);
            this.f12973f.connect(new InetSocketAddress(str, i4));
            this.f12973f.register(this.f12972e, 8);
            this.f12975h = true;
            while (this.f12975h) {
                if (this.f12972e.select(200L) > 0) {
                    Iterator<SelectionKey> it = this.f12972e.selectedKeys().iterator();
                    while (it.hasNext()) {
                        SelectionKey next = it.next();
                        it.remove();
                        if (next.isConnectable()) {
                            e(next);
                        } else if (next.isReadable()) {
                            f(next);
                        } else if (next.isWritable()) {
                            g(next);
                        }
                    }
                }
            }
            d();
        } catch (Exception e4) {
            e4.printStackTrace();
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        try {
            SocketChannel socketChannel = this.f12973f;
            if (socketChannel != null) {
                socketChannel.close();
            }
            this.f12972e.wakeup();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        this.f12977j.b();
    }

    public synchronized void c(final String str, final int i4, int i5) {
        this.f12970c = str;
        this.f12969b = i4;
        this.f12974g.execute(new Runnable() { // from class: z1.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f12947b.i(str, i4);
            }
        });
    }

    public synchronized void d() {
        this.f12975h = false;
        this.f12974g.execute(new Runnable() { // from class: z1.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f12901b.j();
            }
        });
    }

    public final void e(SelectionKey selectionKey) {
        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
        try {
            if (socketChannel.finishConnect()) {
                socketChannel.register(this.f12972e, 1);
                this.f12977j.a();
            } else {
                d();
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void f(SelectionKey selectionKey) {
        try {
            SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(131072);
            int i4 = socketChannel.read(byteBufferAllocate);
            if (i4 > 0) {
                this.f12978k = 0;
                byte[] bArr = new byte[i4];
                byteBufferAllocate.flip();
                byteBufferAllocate.get(bArr);
                this.f12977j.f(bArr, this.f12968a, i4);
            } else if (i4 == -1) {
                int i5 = this.f12978k + 1;
                this.f12978k = i5;
                if (i5 > 5) {
                    socketChannel.close();
                    this.f12975h = false;
                }
            }
            selectionKey.interestOps(1);
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    public final void g(SelectionKey selectionKey) {
        synchronized (this.f12976i) {
            int length = 0;
            while (!this.f12976i.isEmpty()) {
                byte[] bArrPeek = this.f12976i.peek();
                System.arraycopy(bArrPeek, 0, this.f12979l, length, bArrPeek.length);
                length += bArrPeek.length;
                this.f12976i.poll();
            }
            byte[] bArr = new byte[length];
            System.arraycopy(this.f12979l, 0, bArr, 0, length);
            try {
                int iWrite = this.f12973f.write(ByteBuffer.wrap(bArr));
                if (iWrite < length) {
                    int i4 = length - iWrite;
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, iWrite, bArr2, 0, i4);
                    this.f12976i.add(bArr2);
                    int i5 = this.f12980m + 1;
                    this.f12980m = i5;
                    if (i5 > 5) {
                        this.f12975h = false;
                    }
                } else {
                    this.f12980m = 0;
                }
                selectionKey.interestOps(1);
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
    }

    public boolean h() {
        SocketChannel socketChannel = this.f12973f;
        return socketChannel != null && socketChannel.isConnected();
    }

    public void k(int i4) {
    }

    public void l(byte[] bArr, int i4) {
        synchronized (this.f12976i) {
            this.f12976i.add(bArr);
            this.f12973f.keyFor(this.f12972e).interestOps(5);
            this.f12972e.wakeup();
        }
    }
}
