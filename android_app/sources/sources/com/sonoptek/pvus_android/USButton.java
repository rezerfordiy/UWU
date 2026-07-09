package com.sonoptek.pvus_android;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;

/* JADX INFO: loaded from: classes.dex */
public class USButton extends AppCompatButton implements View.OnTouchListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f5225e;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            USButton.this.performClick();
            super.handleMessage(message);
        }
    }

    public class b extends Thread {
        public b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i4 = 0;
            while (USButton.this.f5224d) {
                try {
                    Thread.sleep(20L);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                i4++;
                if (i4 % 10 == 9) {
                    Message message = new Message();
                    message.what = 4096;
                    USButton.this.f5225e.sendMessage(message);
                }
            }
            super.run();
        }
    }

    public USButton(Context context) {
        super(context);
        this.f5224d = false;
        this.f5225e = new a();
        setOnTouchListener(this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5224d = true;
            new b().start();
        } else if (action == 1 || action != 2) {
            this.f5224d = false;
        }
        return false;
    }

    public USButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5224d = false;
        this.f5225e = new a();
        setOnTouchListener(this);
    }

    public USButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f5224d = false;
        this.f5225e = new a();
        setOnTouchListener(this);
    }
}
