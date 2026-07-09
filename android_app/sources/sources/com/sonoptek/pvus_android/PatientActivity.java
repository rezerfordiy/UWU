package com.sonoptek.pvus_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sonoHealth.microVUE.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class PatientActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DatePicker f5083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f5084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f5085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f5086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f5087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EditText f5088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EditText f5089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f5090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f5091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DatePicker f5092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f5093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f5094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f5095n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f5096o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f5097p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public EditText f5098q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public EditText f5099r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public EditText f5100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f5101t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b2.c f5102u;

    public class a implements DatePicker.OnDateChangedListener {
        public a() {
        }

        @Override // android.widget.DatePicker.OnDateChangedListener
        public void onDateChanged(DatePicker datePicker, int i4, int i5, int i6) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(i4, i5 + 9, i6 + 7);
            PatientActivity.this.f5093l.setText(new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));
        }
    }

    public final void b(View view) {
        this.f5094m.setBackground(null);
        this.f5094m.setTextColor(getResources().getColor(R.color.colorTextBlue));
        this.f5095n.setBackground(null);
        this.f5095n.setTextColor(getResources().getColor(R.color.colorTextBlue));
        TextView textView = this.f5096o;
        if (textView != null) {
            textView.setBackground(null);
            this.f5096o.setTextColor(getResources().getColor(R.color.colorTextBlue));
            this.f5097p.setBackground(null);
            this.f5097p.setTextColor(getResources().getColor(R.color.colorTextBlue));
        }
        view.setBackgroundResource(R.drawable.bg_shape_blue);
        ((TextView) view).setTextColor(getResources().getColor(R.color.colorTextWhite));
    }

    public void c() {
        this.f5102u = (b2.c) getIntent().getSerializableExtra("Patient");
        d();
    }

    public void d() {
        TextView textView;
        this.f5087f.setText(this.f5102u.c());
        this.f5087f.setSelection(this.f5102u.c().length());
        this.f5088g.setText(this.f5102u.getName());
        this.f5088g.setSelection(this.f5102u.getName().length());
        Date dateB = this.f5102u.b();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateB);
        this.f5083b.updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
        calendar.setTime(this.f5102u.f4486d);
        this.f5092k.updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(calendar.get(1), calendar.get(2) + 9, calendar.get(5) + 7);
        this.f5093l.setText(new SimpleDateFormat("yyyy-MM-dd").format(calendar2.getTime()));
        b(this.f5102u.g() == 1 ? this.f5094m : this.f5095n);
        EditText editText = this.f5089h;
        if (editText != null) {
            editText.setText(this.f5102u.f4489g);
            if (this.f5102u.g() == 1) {
                textView = this.f5094m;
            } else if (this.f5102u.g() == 0) {
                textView = this.f5095n;
            } else if (this.f5102u.g() == 2) {
                textView = this.f5096o;
            } else if (this.f5102u.g() == 3) {
                textView = this.f5097p;
            }
            b(textView);
        }
        this.f5098q.setText(this.f5102u.e());
        this.f5099r.setText(this.f5102u.h());
        this.f5100s.setText(this.f5102u.d());
        this.f5101t.setText(this.f5102u.a());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        TextView textView;
        int id = view.getId();
        if (id != R.id.patient_cancel) {
            if (id != R.id.patient_sure) {
                if (id == R.id.patient_reset) {
                    this.f5102u.k(s0.a.f11071l);
                    this.f5102u.m(s0.a.f11071l);
                    this.f5102u.p(1);
                    this.f5102u.j(new Date());
                    this.f5102u.n(s0.a.f11071l);
                    this.f5102u.r(s0.a.f11071l);
                    this.f5102u.l(s0.a.f11071l);
                    this.f5102u.i(s0.a.f11071l);
                    d();
                    return;
                }
                if (id == R.id.patient_male) {
                    this.f5102u.p(1);
                    textView = this.f5094m;
                } else if (id == R.id.patient_female) {
                    this.f5102u.p(0);
                    textView = this.f5095n;
                } else if (id == R.id.patient_mc) {
                    this.f5102u.p(2);
                    textView = this.f5096o;
                } else {
                    if (id != R.id.patient_fs) {
                        return;
                    }
                    this.f5102u.p(3);
                    textView = this.f5097p;
                }
                b(textView);
                return;
            }
            this.f5102u.m(this.f5088g.getText().toString());
            this.f5102u.k(this.f5087f.getText().toString());
            Calendar calendar = Calendar.getInstance();
            calendar.set(this.f5083b.getYear(), this.f5083b.getMonth(), this.f5083b.getDayOfMonth());
            this.f5102u.j(calendar.getTime());
            calendar.set(this.f5092k.getYear(), this.f5092k.getMonth(), this.f5092k.getDayOfMonth());
            this.f5102u.f4486d = calendar.getTime();
            this.f5102u.n(this.f5098q.getText().toString());
            this.f5102u.r(this.f5099r.getText().toString());
            this.f5102u.l(this.f5100s.getText().toString());
            this.f5102u.i(this.f5101t.getText().toString());
            Intent intent = getIntent();
            intent.putExtra("Patient", this.f5102u);
            setResult(-1, intent);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        LinearLayout linearLayout;
        super.onCreate(bundle);
        if (d2.a.i(null).j() == 2) {
            setContentView(R.layout.activity_patient_vet);
            this.f5089h = (EditText) findViewById(R.id.patient_owner);
            TextView textView = (TextView) findViewById(R.id.patient_mc);
            this.f5096o = textView;
            textView.setOnClickListener(this);
            TextView textView2 = (TextView) findViewById(R.id.patient_fs);
            this.f5097p = textView2;
            textView2.setOnClickListener(this);
        } else {
            setContentView(R.layout.activity_patient);
        }
        this.f5087f = (EditText) findViewById(R.id.patient_id);
        this.f5088g = (EditText) findViewById(R.id.patient_name);
        this.f5098q = (EditText) findViewById(R.id.patient_ordered_by);
        this.f5099r = (EditText) findViewById(R.id.patient_work_order);
        this.f5100s = (EditText) findViewById(R.id.patient_modality);
        this.f5101t = (EditText) findViewById(R.id.patient_area);
        this.f5083b = (DatePicker) findViewById(R.id.patient_datepicker);
        TextView textView3 = (TextView) findViewById(R.id.patient_cancel);
        this.f5084c = textView3;
        textView3.setOnClickListener(this);
        TextView textView4 = (TextView) findViewById(R.id.patient_sure);
        this.f5085d = textView4;
        textView4.setOnClickListener(this);
        TextView textView5 = (TextView) findViewById(R.id.patient_reset);
        this.f5086e = textView5;
        textView5.setOnClickListener(this);
        TextView textView6 = (TextView) findViewById(R.id.patient_male);
        this.f5094m = textView6;
        textView6.setOnClickListener(this);
        TextView textView7 = (TextView) findViewById(R.id.patient_female);
        this.f5095n = textView7;
        textView7.setOnClickListener(this);
        this.f5090i = (LinearLayout) findViewById(R.id.patient_sex_ly);
        this.f5091j = (LinearLayout) findViewById(R.id.lmp_date_ly);
        DatePicker datePicker = (DatePicker) findViewById(R.id.patient_lmp_date_picker);
        this.f5092k = datePicker;
        if (Build.VERSION.SDK_INT >= 26) {
            datePicker.setOnDateChangedListener(new a());
        }
        this.f5093l = (TextView) findViewById(R.id.patient_lmp_edd);
        String strD = d2.a.i(null).d(h.g0());
        int i4 = 8;
        if (strD == null || !strD.equals("obstetric")) {
            linearLayout = this.f5091j;
        } else {
            linearLayout = this.f5091j;
            i4 = 0;
        }
        linearLayout.setVisibility(i4);
        c();
    }
}
