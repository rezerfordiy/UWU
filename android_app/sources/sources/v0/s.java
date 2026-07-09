package v0;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f12152a;

    public interface a {
        void a(GestureDetector.OnDoubleTapListener onDoubleTapListener);

        void b(boolean z3);

        boolean c(MotionEvent motionEvent);

        boolean d();
    }

    public static class b implements a {
        public static final int A = 3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f12153v = ViewConfiguration.getLongPressTimeout();

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f12154w = ViewConfiguration.getTapTimeout();

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f12155x = ViewConfiguration.getDoubleTapTimeout();

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f12156y = 1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f12157z = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12160c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12161d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Handler f12162e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final GestureDetector.OnGestureListener f12163f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public GestureDetector.OnDoubleTapListener f12164g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f12165h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f12166i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f12167j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f12168k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f12169l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public MotionEvent f12170m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public MotionEvent f12171n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f12172o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f12173p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f12174q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f12175r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f12176s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f12177t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public VelocityTracker f12178u;

        public class a extends Handler {
            public a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i4 = message.what;
                if (i4 == 1) {
                    b bVar = b.this;
                    bVar.f12163f.onShowPress(bVar.f12170m);
                    return;
                }
                if (i4 == 2) {
                    b.this.g();
                    return;
                }
                if (i4 != 3) {
                    throw new RuntimeException("Unknown message " + message);
                }
                b bVar2 = b.this;
                GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.f12164g;
                if (onDoubleTapListener != null) {
                    if (bVar2.f12165h) {
                        bVar2.f12166i = true;
                    } else {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.f12170m);
                    }
                }
            }

            public a(Handler handler) {
                super(handler.getLooper());
            }
        }

        public b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f12162e = new a(handler);
            } else {
                this.f12162e = new a();
            }
            this.f12163f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                a((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            h(context);
        }

        @Override // v0.s.a
        public void a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f12164g = onDoubleTapListener;
        }

        @Override // v0.s.a
        public void b(boolean z3) {
            this.f12177t = z3;
        }

        @Override // v0.s.a
        public boolean c(MotionEvent motionEvent) {
            boolean zOnDoubleTap;
            MotionEvent motionEvent2;
            boolean zOnFling;
            GestureDetector.OnDoubleTapListener onDoubleTapListener;
            int action = motionEvent.getAction();
            if (this.f12178u == null) {
                this.f12178u = VelocityTracker.obtain();
            }
            this.f12178u.addMovement(motionEvent);
            int i4 = action & 255;
            boolean z3 = i4 == 6;
            int actionIndex = z3 ? motionEvent.getActionIndex() : -1;
            int pointerCount = motionEvent.getPointerCount();
            float x3 = 0.0f;
            float y3 = 0.0f;
            for (int i5 = 0; i5 < pointerCount; i5++) {
                if (actionIndex != i5) {
                    x3 += motionEvent.getX(i5);
                    y3 += motionEvent.getY(i5);
                }
            }
            float f4 = z3 ? pointerCount - 1 : pointerCount;
            float f5 = x3 / f4;
            float f6 = y3 / f4;
            if (i4 == 0) {
                if (this.f12164g == null) {
                    zOnDoubleTap = false;
                } else {
                    boolean zHasMessages = this.f12162e.hasMessages(3);
                    if (zHasMessages) {
                        this.f12162e.removeMessages(3);
                    }
                    MotionEvent motionEvent3 = this.f12170m;
                    if (motionEvent3 == null || (motionEvent2 = this.f12171n) == null || !zHasMessages || !i(motionEvent3, motionEvent2, motionEvent)) {
                        this.f12162e.sendEmptyMessageDelayed(3, f12155x);
                        zOnDoubleTap = false;
                    } else {
                        this.f12172o = true;
                        zOnDoubleTap = this.f12164g.onDoubleTap(this.f12170m) | false | this.f12164g.onDoubleTapEvent(motionEvent);
                    }
                }
                this.f12173p = f5;
                this.f12175r = f5;
                this.f12174q = f6;
                this.f12176s = f6;
                MotionEvent motionEvent4 = this.f12170m;
                if (motionEvent4 != null) {
                    motionEvent4.recycle();
                }
                this.f12170m = MotionEvent.obtain(motionEvent);
                this.f12168k = true;
                this.f12169l = true;
                this.f12165h = true;
                this.f12167j = false;
                this.f12166i = false;
                if (this.f12177t) {
                    this.f12162e.removeMessages(2);
                    this.f12162e.sendEmptyMessageAtTime(2, this.f12170m.getDownTime() + ((long) f12154w) + ((long) f12153v));
                }
                this.f12162e.sendEmptyMessageAtTime(1, this.f12170m.getDownTime() + ((long) f12154w));
                return zOnDoubleTap | this.f12163f.onDown(motionEvent);
            }
            if (i4 == 1) {
                this.f12165h = false;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                if (this.f12172o) {
                    zOnFling = this.f12164g.onDoubleTapEvent(motionEvent) | false;
                } else {
                    if (this.f12167j) {
                        this.f12162e.removeMessages(3);
                        this.f12167j = false;
                    } else if (this.f12168k) {
                        boolean zOnSingleTapUp = this.f12163f.onSingleTapUp(motionEvent);
                        if (this.f12166i && (onDoubleTapListener = this.f12164g) != null) {
                            onDoubleTapListener.onSingleTapConfirmed(motionEvent);
                        }
                        zOnFling = zOnSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.f12178u;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, this.f12161d);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) > this.f12160c || Math.abs(xVelocity) > this.f12160c) {
                            zOnFling = this.f12163f.onFling(this.f12170m, motionEvent, xVelocity, yVelocity);
                        }
                    }
                    zOnFling = false;
                }
                MotionEvent motionEvent5 = this.f12171n;
                if (motionEvent5 != null) {
                    motionEvent5.recycle();
                }
                this.f12171n = motionEventObtain;
                VelocityTracker velocityTracker2 = this.f12178u;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f12178u = null;
                }
                this.f12172o = false;
                this.f12166i = false;
                this.f12162e.removeMessages(1);
                this.f12162e.removeMessages(2);
            } else {
                if (i4 != 2) {
                    if (i4 == 3) {
                        e();
                        return false;
                    }
                    if (i4 == 5) {
                        this.f12173p = f5;
                        this.f12175r = f5;
                        this.f12174q = f6;
                        this.f12176s = f6;
                        f();
                        return false;
                    }
                    if (i4 != 6) {
                        return false;
                    }
                    this.f12173p = f5;
                    this.f12175r = f5;
                    this.f12174q = f6;
                    this.f12176s = f6;
                    this.f12178u.computeCurrentVelocity(1000, this.f12161d);
                    int actionIndex2 = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex2);
                    float xVelocity2 = this.f12178u.getXVelocity(pointerId2);
                    float yVelocity2 = this.f12178u.getYVelocity(pointerId2);
                    for (int i6 = 0; i6 < pointerCount; i6++) {
                        if (i6 != actionIndex2) {
                            int pointerId3 = motionEvent.getPointerId(i6);
                            if ((this.f12178u.getXVelocity(pointerId3) * xVelocity2) + (this.f12178u.getYVelocity(pointerId3) * yVelocity2) < 0.0f) {
                                this.f12178u.clear();
                                return false;
                            }
                        }
                    }
                    return false;
                }
                if (this.f12167j) {
                    return false;
                }
                float f7 = this.f12173p - f5;
                float f8 = this.f12174q - f6;
                if (this.f12172o) {
                    return false | this.f12164g.onDoubleTapEvent(motionEvent);
                }
                if (!this.f12168k) {
                    if (Math.abs(f7) < 1.0f && Math.abs(f8) < 1.0f) {
                        return false;
                    }
                    boolean zOnScroll = this.f12163f.onScroll(this.f12170m, motionEvent, f7, f8);
                    this.f12173p = f5;
                    this.f12174q = f6;
                    return zOnScroll;
                }
                int i7 = (int) (f5 - this.f12175r);
                int i8 = (int) (f6 - this.f12176s);
                int i9 = (i7 * i7) + (i8 * i8);
                if (i9 > this.f12158a) {
                    zOnFling = this.f12163f.onScroll(this.f12170m, motionEvent, f7, f8);
                    this.f12173p = f5;
                    this.f12174q = f6;
                    this.f12168k = false;
                    this.f12162e.removeMessages(3);
                    this.f12162e.removeMessages(1);
                    this.f12162e.removeMessages(2);
                } else {
                    zOnFling = false;
                }
                if (i9 > this.f12158a) {
                    this.f12169l = false;
                }
            }
            return zOnFling;
        }

        @Override // v0.s.a
        public boolean d() {
            return this.f12177t;
        }

        public final void e() {
            this.f12162e.removeMessages(1);
            this.f12162e.removeMessages(2);
            this.f12162e.removeMessages(3);
            this.f12178u.recycle();
            this.f12178u = null;
            this.f12172o = false;
            this.f12165h = false;
            this.f12168k = false;
            this.f12169l = false;
            this.f12166i = false;
            if (this.f12167j) {
                this.f12167j = false;
            }
        }

        public final void f() {
            this.f12162e.removeMessages(1);
            this.f12162e.removeMessages(2);
            this.f12162e.removeMessages(3);
            this.f12172o = false;
            this.f12168k = false;
            this.f12169l = false;
            this.f12166i = false;
            if (this.f12167j) {
                this.f12167j = false;
            }
        }

        public void g() {
            this.f12162e.removeMessages(3);
            this.f12166i = false;
            this.f12167j = true;
            this.f12163f.onLongPress(this.f12170m);
        }

        public final void h(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            }
            if (this.f12163f == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            this.f12177t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f12160c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f12161d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f12158a = scaledTouchSlop * scaledTouchSlop;
            this.f12159b = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }

        public final boolean i(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f12169l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > f12155x) {
                return false;
            }
            int x3 = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y3 = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x3 * x3) + (y3 * y3) < this.f12159b;
        }
    }

    public static class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureDetector f12180a;

        public c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f12180a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // v0.s.a
        public void a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f12180a.setOnDoubleTapListener(onDoubleTapListener);
        }

        @Override // v0.s.a
        public void b(boolean z3) {
            this.f12180a.setIsLongpressEnabled(z3);
        }

        @Override // v0.s.a
        public boolean c(MotionEvent motionEvent) {
            return this.f12180a.onTouchEvent(motionEvent);
        }

        @Override // v0.s.a
        public boolean d() {
            return this.f12180a.isLongpressEnabled();
        }
    }

    public s(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a() {
        return this.f12152a.d();
    }

    public boolean b(MotionEvent motionEvent) {
        return this.f12152a.c(motionEvent);
    }

    public void c(boolean z3) {
        this.f12152a.b(z3);
    }

    public void d(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f12152a.a(onDoubleTapListener);
    }

    public s(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f12152a = new c(context, onGestureListener, handler);
    }
}
