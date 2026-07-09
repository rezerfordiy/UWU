package a0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import org.dcm4che3.data.Tag;

/* JADX INFO: loaded from: classes.dex */
public final class p4 implements Iterable<Intent> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f178d = "TaskStackBuilder";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<Intent> f179b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f180c;

    public interface a {
        @c.k0
        Intent j();
    }

    public p4(Context context) {
        this.f180c = context;
    }

    @c.j0
    public static p4 f(@c.j0 Context context) {
        return new p4(context);
    }

    @Deprecated
    public static p4 h(Context context) {
        return f(context);
    }

    @c.j0
    public p4 a(@c.j0 Intent intent) {
        this.f179b.add(intent);
        return this;
    }

    @c.j0
    public p4 b(@c.j0 Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f180c.getPackageManager());
        }
        if (component != null) {
            d(component);
        }
        a(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c.j0
    public p4 c(@c.j0 Activity activity) {
        Intent intentJ = activity instanceof a ? ((a) activity).j() : null;
        if (intentJ == null) {
            intentJ = t.a(activity);
        }
        if (intentJ != null) {
            ComponentName component = intentJ.getComponent();
            if (component == null) {
                component = intentJ.resolveActivity(this.f180c.getPackageManager());
            }
            d(component);
            a(intentJ);
        }
        return this;
    }

    public p4 d(ComponentName componentName) {
        int size = this.f179b.size();
        try {
            Context context = this.f180c;
            while (true) {
                Intent intentB = t.b(context, componentName);
                if (intentB == null) {
                    return this;
                }
                this.f179b.add(size, intentB);
                context = this.f180c;
                componentName = intentB.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e(f178d, "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e4);
        }
    }

    @c.j0
    public p4 e(@c.j0 Class<?> cls) {
        return d(new ComponentName(this.f180c, cls));
    }

    @c.k0
    public Intent g(int i4) {
        return this.f179b.get(i4);
    }

    @Deprecated
    public Intent i(int i4) {
        return g(i4);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f179b.iterator();
    }

    public int j() {
        return this.f179b.size();
    }

    @c.j0
    public Intent[] k() {
        int size = this.f179b.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.f179b.get(0)).addFlags(268484608);
        for (int i4 = 1; i4 < size; i4++) {
            intentArr[i4] = new Intent(this.f179b.get(i4));
        }
        return intentArr;
    }

    @c.k0
    public PendingIntent l(int i4, int i5) {
        return m(i4, i5, null);
    }

    @c.k0
    public PendingIntent m(int i4, int i5, @c.k0 Bundle bundle) {
        if (this.f179b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        ArrayList<Intent> arrayList = this.f179b;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.f180c, i4, intentArr, i5, bundle);
    }

    public void n() {
        o(null);
    }

    public void o(@c.k0 Bundle bundle) {
        if (this.f179b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f179b;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (b0.e.r(this.f180c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(Tag.EscapeTriplet);
        this.f180c.startActivity(intent);
    }
}
