package com.sonoptek.pvus_android;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;

/* JADX INFO: loaded from: classes.dex */
public class USImageButton extends AppCompatImageButton implements View.OnTouchListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f5229e;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            USImageButton.this.performClick();
            super.handleMessage(message);
        }
    }

    public class b extends Thread {
        public b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i4 = 0;
            while (USImageButton.this.f5228d) {
                try {
                    Thread.sleep(15L);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                i4++;
                if (i4 % 10 == 9) {
                    Message message = new Message();
                    message.what = 4096;
                    USImageButton.this.f5229e.sendMessage(message);
                }
            }
            super.run();
        }
    }

    public USImageButton(Context context) {
        super(context);
        this.f5228d = false;
        this.f5229e = new a();
        setOnTouchListener(this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5228d = true;
            new b().start();
        } else if (action == 1 || action != 2) {
            this.f5228d = false;
        }
        return false;
    }

    public USImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5228d = false;
        this.f5229e = new a();
        setOnTouchListener(this);
    }

    public USImageButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f5228d = false;
        this.f5229e = new a();
        setOnTouchListener(this);
    }
}
