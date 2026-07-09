package com.sonoptek.pvus_android;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import c.k0;
import com.sonoHealth.microVUE.R;
import com.sonoptek.pvus_android.sql.DBPaintInfo;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class ReportActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GridView f5160v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ScrollView f5161w;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DBPaintInfo f5162b;

        public a(DBPaintInfo dBPaintInfo) {
            this.f5162b = dBPaintInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Bitmap bitmapK = k2.c.k(ReportActivity.this.f5161w);
            k2.c.q(ReportActivity.this, bitmapK, this.f5162b.f6191c + ".jpg");
            Toast.makeText(ReportActivity.this, R.string.save_report_success, 0).show();
            ReportActivity.this.finish();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ReportActivity.this.finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@k0 Bundle bundle) {
        StringBuilder sb;
        Resources resources;
        int i4;
        StringBuilder sb2;
        String string;
        super.onCreate(bundle);
        setContentView(R.layout.activity_report_new);
        this.f5161w = (ScrollView) findViewById(R.id.report_scroll);
        Bundle bundleExtra = getIntent().getBundleExtra("data");
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("images");
        DBPaintInfo dBPaintInfo = (DBPaintInfo) bundleExtra.getParcelable("patient");
        if (dBPaintInfo != null) {
            ((TextView) findViewById(R.id.report_name)).setText(getResources().getString(R.string.name) + dBPaintInfo.f6191c);
            TextView textView = (TextView) findViewById(R.id.report_gender);
            if (dBPaintInfo.f6193e == 1) {
                sb = new StringBuilder();
                sb.append(getResources().getString(R.string.sex));
                resources = getResources();
                i4 = R.string.Male;
            } else {
                sb = new StringBuilder();
                sb.append(getResources().getString(R.string.sex));
                resources = getResources();
                i4 = R.string.Female;
            }
            sb.append(resources.getString(i4));
            textView.setText(sb.toString());
            ((TextView) findViewById(R.id.report_age)).setText(getResources().getString(R.string.age) + dBPaintInfo.f6192d);
            ((TextView) findViewById(R.id.report_id)).setText(getResources().getString(R.string.id) + dBPaintInfo.f6190b);
            TextView textView2 = (TextView) findViewById(R.id.report_point);
            int identifier = getResources().getIdentifier(dBPaintInfo.f6199k, "string", getPackageName());
            if (identifier != 0) {
                sb2 = new StringBuilder();
                sb2.append(getResources().getString(R.string.point));
                string = getResources().getString(identifier);
            } else {
                sb2 = new StringBuilder();
                sb2.append(getResources().getString(R.string.point));
                string = dBPaintInfo.f6199k;
            }
            sb2.append(string);
            textView2.setText(sb2.toString());
            TextView textView3 = (TextView) findViewById(R.id.report_lmp);
            TextView textView4 = (TextView) findViewById(R.id.report_lmp_edd);
            if (identifier != R.string.obstetric || dBPaintInfo.f6200l <= 0) {
                textView3.setText(s0.a.f11071l);
                textView4.setText(s0.a.f11071l);
            } else {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = new Date(dBPaintInfo.f6200l);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(calendar.get(1), calendar.get(2) + 9, calendar.get(5) + 7);
                textView3.setText(getResources().getString(R.string.lmp) + simpleDateFormat.format(date));
                textView4.setText(getResources().getString(R.string.edd_lmp) + simpleDateFormat.format(calendar2.getTime()));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str : stringArrayList) {
            arrayList.add(BitmapFactory.decodeFile(str));
            new File(str).delete();
        }
        ImageView imageView = (ImageView) findViewById(R.id.report_img1);
        ImageView imageView2 = (ImageView) findViewById(R.id.report_img2);
        ImageView imageView3 = (ImageView) findViewById(R.id.report_img3);
        ImageView imageView4 = (ImageView) findViewById(R.id.report_img4);
        int i5 = 8;
        if (arrayList.size() == 1) {
            imageView.setImageBitmap((Bitmap) arrayList.get(0));
            imageView2.setVisibility(8);
        } else {
            if (arrayList.size() != 2) {
                i5 = 4;
                if (arrayList.size() == 3) {
                    float fY = (MyApplication.y() / 2.0f) / r8.getWidth();
                    imageView.setImageBitmap(k2.c.b((Bitmap) arrayList.get(0), fY));
                    imageView2.setImageBitmap(k2.c.b((Bitmap) arrayList.get(1), fY));
                    imageView3.setImageBitmap(k2.c.b((Bitmap) arrayList.get(2), fY));
                    imageView4.setVisibility(i5);
                    findViewById(R.id.save_report).setOnClickListener(new a(dBPaintInfo));
                    findViewById(R.id.report_back).setOnClickListener(new b());
                    ((TextView) findViewById(R.id.report_date)).setText(getResources().getString(R.string.report_date) + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                }
                if (arrayList.size() == 4) {
                    float fY2 = (MyApplication.y() / 2.0f) / r8.getWidth();
                    imageView.setImageBitmap(k2.c.b((Bitmap) arrayList.get(0), fY2));
                    imageView2.setImageBitmap(k2.c.b((Bitmap) arrayList.get(1), fY2));
                    imageView3.setImageBitmap(k2.c.b((Bitmap) arrayList.get(2), fY2));
                    imageView4.setImageBitmap(k2.c.b((Bitmap) arrayList.get(3), fY2));
                }
                findViewById(R.id.save_report).setOnClickListener(new a(dBPaintInfo));
                findViewById(R.id.report_back).setOnClickListener(new b());
                ((TextView) findViewById(R.id.report_date)).setText(getResources().getString(R.string.report_date) + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            }
            float fY3 = (MyApplication.y() / 2.0f) / r2.getWidth();
            imageView.setImageBitmap(k2.c.b((Bitmap) arrayList.get(0), fY3));
            imageView2.setImageBitmap(k2.c.b((Bitmap) arrayList.get(1), fY3));
        }
        imageView3.setVisibility(8);
        imageView4.setVisibility(i5);
        findViewById(R.id.save_report).setOnClickListener(new a(dBPaintInfo));
        findViewById(R.id.report_back).setOnClickListener(new b());
        ((TextView) findViewById(R.id.report_date)).setText(getResources().getString(R.string.report_date) + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }
}
