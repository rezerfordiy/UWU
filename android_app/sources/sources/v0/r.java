package v0;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f12141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f12142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View.OnLongClickListener f12146f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View.OnTouchListener f12147g = new b();

    public class a implements View.OnLongClickListener {
        public a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return r.this.d(view);
        }
    }

    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return r.this.e(view, motionEvent);
        }
    }

    public interface c {
        boolean a(View view, r rVar);
    }

    public r(View view, c cVar) {
        this.f12141a = view;
        this.f12142b = cVar;
    }

    public void a() {
        this.f12141a.setOnLongClickListener(this.f12146f);
        this.f12141a.setOnTouchListener(this.f12147g);
    }

    public void b() {
        this.f12141a.setOnLongClickListener(null);
        this.f12141a.setOnTouchListener(null);
    }

    public void c(Point point) {
        point.set(this.f12143c, this.f12144d);
    }

    public boolean d(View view) {
        return this.f12142b.a(view, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 0
            if (r2 == 0) goto L49
            r4 = 1
            if (r2 == r4) goto L46
            r5 = 2
            if (r2 == r5) goto L1b
            r7 = 3
            if (r2 == r7) goto L46
            goto L4d
        L1b:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = v0.p0.l(r8, r2)
            if (r2 == 0) goto L4d
            int r8 = r8.getButtonState()
            r8 = r8 & r4
            if (r8 != 0) goto L2b
            goto L4d
        L2b:
            boolean r8 = r6.f12145e
            if (r8 == 0) goto L30
            goto L4d
        L30:
            int r8 = r6.f12143c
            if (r8 != r0) goto L39
            int r8 = r6.f12144d
            if (r8 != r1) goto L39
            goto L4d
        L39:
            r6.f12143c = r0
            r6.f12144d = r1
            v0.r$c r8 = r6.f12142b
            boolean r7 = r8.a(r7, r6)
            r6.f12145e = r7
            return r7
        L46:
            r6.f12145e = r3
            goto L4d
        L49:
            r6.f12143c = r0
            r6.f12144d = r1
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.r.e(android.view.View, android.view.MotionEvent):boolean");
    }
}
