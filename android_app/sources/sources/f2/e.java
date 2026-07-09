package f2;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<View> f7646a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f7648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f7649d;

    public e(Context context, ViewGroup viewGroup, int i4, int i5) {
        this.f7649d = context;
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i4, viewGroup, false);
        this.f7648c = viewInflate;
        viewInflate.setTag(this);
    }

    public static e a(View view, ViewGroup viewGroup, int i4, int i5) {
        return view == null ? new e(viewGroup.getContext(), viewGroup, i4, i5) : (e) view.getTag();
    }

    public View b() {
        return this.f7648c;
    }

    public int c() {
        return this.f7647b;
    }

    public <T extends View> T d(int i4) {
        T t4 = (T) this.f7646a.get(i4);
        if (t4 != null) {
            return t4;
        }
        T t5 = (T) this.f7648c.findViewById(i4);
        this.f7646a.put(i4, t5);
        return t5;
    }

    public e e(int i4, Bitmap bitmap) {
        ((ImageView) b().findViewById(i4)).setImageBitmap(bitmap);
        return this;
    }

    public e f(int i4, String str) {
        return this;
    }

    public e g(int i4, int i5) {
        ((ImageView) d(i4)).setImageResource(i5);
        return this;
    }

    public e h(int i4, String str) {
        ((TextView) d(i4)).setText(str);
        return this;
    }
}
