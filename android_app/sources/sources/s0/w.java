package s0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.appcompat.widget.ActivityChooserView;
import c.b0;
import c.j0;
import c.k0;
import c.o0;
import c.r0;
import c.y0;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public class w implements Spannable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char f11106e = '\n';

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f11107f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @c.w("sLock")
    @j0
    public static Executor f11108g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @j0
    public final Spannable f11109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @j0
    public final a f11110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @j0
    public final int[] f11111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @k0
    public final PrecomputedText f11112d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @j0
        public final TextPaint f11113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @k0
        public final TextDirectionHeuristic f11114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f11116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f11117e;

        /* JADX INFO: renamed from: s0.w$a$a, reason: collision with other inner class name */
        public static class C0109a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @j0
            public final TextPaint f11118a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f11120c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f11121d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public TextDirectionHeuristic f11119b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0109a(@j0 TextPaint textPaint) {
                this.f11118a = textPaint;
            }

            @j0
            public a a() {
                return new a(this.f11118a, this.f11119b, this.f11120c, this.f11121d);
            }

            @o0(23)
            public C0109a b(int i4) {
                this.f11120c = i4;
                return this;
            }

            @o0(23)
            public C0109a c(int i4) {
                this.f11121d = i4;
                return this;
            }

            @o0(18)
            public C0109a d(@j0 TextDirectionHeuristic textDirectionHeuristic) {
                this.f11119b = textDirectionHeuristic;
                return this;
            }
        }

        @o0(28)
        public a(@j0 PrecomputedText.Params params) {
            this.f11113a = params.getTextPaint();
            this.f11114b = params.getTextDirection();
            this.f11115c = params.getBreakStrategy();
            this.f11116d = params.getHyphenationFrequency();
            this.f11117e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        @r0({r0.a.LIBRARY_GROUP_PREFIX})
        public boolean a(@j0 a aVar) {
            if (this.f11115c == aVar.b() && this.f11116d == aVar.c() && this.f11113a.getTextSize() == aVar.e().getTextSize() && this.f11113a.getTextScaleX() == aVar.e().getTextScaleX() && this.f11113a.getTextSkewX() == aVar.e().getTextSkewX() && this.f11113a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f11113a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f11113a.getFlags() == aVar.e().getFlags() && this.f11113a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f11113a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f11113a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        @o0(23)
        public int b() {
            return this.f11115c;
        }

        @o0(23)
        public int c() {
            return this.f11116d;
        }

        @k0
        @o0(18)
        public TextDirectionHeuristic d() {
            return this.f11114b;
        }

        @j0
        public TextPaint e() {
            return this.f11113a;
        }

        public boolean equals(@k0 Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f11114b == aVar.d();
        }

        public int hashCode() {
            return u0.e.b(Float.valueOf(this.f11113a.getTextSize()), Float.valueOf(this.f11113a.getTextScaleX()), Float.valueOf(this.f11113a.getTextSkewX()), Float.valueOf(this.f11113a.getLetterSpacing()), Integer.valueOf(this.f11113a.getFlags()), this.f11113a.getTextLocales(), this.f11113a.getTypeface(), Boolean.valueOf(this.f11113a.isElegantTextHeight()), this.f11114b, Integer.valueOf(this.f11115c), Integer.valueOf(this.f11116d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f11113a.getTextSize());
            sb.append(", textScaleX=" + this.f11113a.getTextScaleX());
            sb.append(", textSkewX=" + this.f11113a.getTextSkewX());
            int i4 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f11113a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f11113a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f11113a.getTextLocales());
            sb.append(", typeface=" + this.f11113a.getTypeface());
            if (i4 >= 26) {
                sb.append(", variationSettings=" + this.f11113a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f11114b);
            sb.append(", breakStrategy=" + this.f11115c);
            sb.append(", hyphenationFrequency=" + this.f11116d);
            sb.append("}");
            return sb.toString();
        }

        @SuppressLint({"NewApi"})
        public a(@j0 TextPaint textPaint, @j0 TextDirectionHeuristic textDirectionHeuristic, int i4, int i5) {
            this.f11117e = Build.VERSION.SDK_INT >= 29 ? v.a(textPaint).setBreakStrategy(i4).setHyphenationFrequency(i5).setTextDirection(textDirectionHeuristic).build() : null;
            this.f11113a = textPaint;
            this.f11114b = textDirectionHeuristic;
            this.f11115c = i4;
            this.f11116d = i5;
        }
    }

    public static class b extends FutureTask<w> {

        public static class a implements Callable<w> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public a f11122a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public CharSequence f11123b;

            public a(@j0 a aVar, @j0 CharSequence charSequence) {
                this.f11122a = aVar;
                this.f11123b = charSequence;
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public w call() throws Exception {
                return w.a(this.f11123b, this.f11122a);
            }
        }

        public b(@j0 a aVar, @j0 CharSequence charSequence) {
            super(new a(aVar, charSequence));
        }
    }

    @o0(28)
    public w(@j0 PrecomputedText precomputedText, @j0 a aVar) {
        this.f11109a = precomputedText;
        this.f11110b = aVar;
        this.f11111c = null;
        this.f11112d = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    @SuppressLint({"NewApi"})
    public static w a(@j0 CharSequence charSequence, @j0 a aVar) {
        PrecomputedText.Params params;
        u0.i.g(charSequence);
        u0.i.g(aVar);
        try {
            p0.w.b("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = aVar.f11117e) != null) {
                return new w(PrecomputedText.create(charSequence, params), aVar);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i4 = 0;
            while (i4 < length) {
                int iIndexOf = TextUtils.indexOf(charSequence, '\n', i4, length);
                i4 = iIndexOf < 0 ? length : iIndexOf + 1;
                arrayList.add(Integer.valueOf(i4));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), aVar.e(), ActivityChooserView.f.f1331h).setBreakStrategy(aVar.b()).setHyphenationFrequency(aVar.c()).setTextDirection(aVar.d()).build();
            return new w(charSequence, aVar, iArr);
        } finally {
            p0.w.d();
        }
    }

    @y0
    public static Future<w> g(@j0 CharSequence charSequence, @j0 a aVar, @k0 Executor executor) {
        b bVar = new b(aVar, charSequence);
        if (executor == null) {
            synchronized (f11107f) {
                if (f11108g == null) {
                    f11108g = Executors.newFixedThreadPool(1);
                }
                executor = f11108g;
            }
        }
        executor.execute(bVar);
        return bVar;
    }

    @SuppressLint({"NewApi"})
    @b0(from = 0)
    public int b() {
        return Build.VERSION.SDK_INT >= 29 ? this.f11112d.getParagraphCount() : this.f11111c.length;
    }

    @SuppressLint({"NewApi"})
    @b0(from = 0)
    public int c(@b0(from = 0) int i4) {
        u0.i.c(i4, 0, b(), "paraIndex");
        return Build.VERSION.SDK_INT >= 29 ? this.f11112d.getParagraphEnd(i4) : this.f11111c[i4];
    }

    @Override // java.lang.CharSequence
    public char charAt(int i4) {
        return this.f11109a.charAt(i4);
    }

    @SuppressLint({"NewApi"})
    @b0(from = 0)
    public int d(@b0(from = 0) int i4) {
        u0.i.c(i4, 0, b(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f11112d.getParagraphStart(i4);
        }
        if (i4 == 0) {
            return 0;
        }
        return this.f11111c[i4 - 1];
    }

    @j0
    public a e() {
        return this.f11110b;
    }

    @k0
    @o0(28)
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public PrecomputedText f() {
        if (d.a(this.f11109a)) {
            return e.a(this.f11109a);
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f11109a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f11109a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f11109a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i4, int i5, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f11112d.getSpans(i4, i5, cls) : (T[]) this.f11109a.getSpans(i4, i5, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f11109a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i4, int i5, Class cls) {
        return this.f11109a.nextSpanTransition(i4, i5, cls);
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f11112d.removeSpan(obj);
        } else {
            this.f11109a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i4, int i5, int i6) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f11112d.setSpan(obj, i4, i5, i6);
        } else {
            this.f11109a.setSpan(obj, i4, i5, i6);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i4, int i5) {
        return this.f11109a.subSequence(i4, i5);
    }

    @Override // java.lang.CharSequence
    @j0
    public String toString() {
        return this.f11109a.toString();
    }

    public w(@j0 CharSequence charSequence, @j0 a aVar, @j0 int[] iArr) {
        this.f11109a = new SpannableString(charSequence);
        this.f11110b = aVar;
        this.f11111c = iArr;
        this.f11112d = null;
    }
}
