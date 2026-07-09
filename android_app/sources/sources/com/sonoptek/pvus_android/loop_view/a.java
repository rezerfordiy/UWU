package com.sonoptek.pvus_android.loop_view;

import android.os.Handler;
import android.os.Message;
import com.sonoptek.pvus_android.loop_view.LoopView;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Handler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f6119b = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f6120c = 2000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f6121d = 3000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoopView f6122a;

    public a(LoopView loopView) {
        this.f6122a = loopView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 1000) {
            this.f6122a.invalidate();
        } else if (i4 == 2000) {
            this.f6122a.k(LoopView.a.FLING);
        } else {
            if (i4 != 3000) {
                return;
            }
            this.f6122a.e();
        }
    }
}
