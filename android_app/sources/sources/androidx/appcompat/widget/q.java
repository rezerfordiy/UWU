package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @c.j0
    public TextView f1795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @c.k0
    public TextClassifier f1796b;

    public q(@c.j0 TextView textView) {
        this.f1795a = (TextView) u0.i.g(textView);
    }

    @c.o0(api = 26)
    @c.j0
    public TextClassifier a() {
        TextClassifier textClassifier = this.f1796b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManagerA = n.a(this.f1795a.getContext().getSystemService(m.a()));
        return textClassificationManagerA != null ? textClassificationManagerA.getTextClassifier() : TextClassifier.NO_OP;
    }

    @c.o0(api = 26)
    public void b(@c.k0 TextClassifier textClassifier) {
        this.f1796b = textClassifier;
    }
}
