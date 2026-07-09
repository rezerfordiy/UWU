package a0;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f155a = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f156b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f157c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f158d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f159e = ".sharecompat_";

    @c.o0(16)
    public static class a {
        public static void a(@c.j0 Intent intent, @c.j0 ArrayList<Uri> arrayList) {
            ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(b0.f.f4332b), null, arrayList.get(0)));
            int size = arrayList.size();
            for (int i4 = 1; i4 < size; i4++) {
                clipData.addItem(new ClipData.Item(arrayList.get(i4)));
            }
            intent.setClipData(clipData);
            intent.addFlags(1);
        }

        public static void b(@c.j0 Intent intent) {
            intent.setClipData(null);
            intent.setFlags(intent.getFlags() & (-2));
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @c.j0
        public final Context f160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @c.j0
        public final Intent f161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @c.k0
        public CharSequence f162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @c.k0
        public ArrayList<String> f163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @c.k0
        public ArrayList<String> f164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @c.k0
        public ArrayList<String> f165f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @c.k0
        public ArrayList<Uri> f166g;

        public b(@c.j0 Context context) {
            Activity activity;
            this.f160a = (Context) u0.i.g(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f161b = action;
            action.putExtra(n4.f155a, context.getPackageName());
            action.putExtra(n4.f156b, context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f161b.putExtra(n4.f157c, componentName);
                this.f161b.putExtra(n4.f158d, componentName);
            }
        }

        @c.j0
        @Deprecated
        public static b k(@c.j0 Activity activity) {
            return new b(activity);
        }

        @c.j0
        public b a(@c.j0 String str) {
            if (this.f165f == null) {
                this.f165f = new ArrayList<>();
            }
            this.f165f.add(str);
            return this;
        }

        @c.j0
        public b b(@c.j0 String[] strArr) {
            i("android.intent.extra.BCC", strArr);
            return this;
        }

        @c.j0
        public b c(@c.j0 String str) {
            if (this.f164e == null) {
                this.f164e = new ArrayList<>();
            }
            this.f164e.add(str);
            return this;
        }

        @c.j0
        public b d(@c.j0 String[] strArr) {
            i("android.intent.extra.CC", strArr);
            return this;
        }

        @c.j0
        public b e(@c.j0 String str) {
            if (this.f163d == null) {
                this.f163d = new ArrayList<>();
            }
            this.f163d.add(str);
            return this;
        }

        @c.j0
        public b f(@c.j0 String[] strArr) {
            i("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @c.j0
        public b g(@c.j0 Uri uri) {
            if (this.f166g == null) {
                this.f166g = new ArrayList<>();
            }
            this.f166g.add(uri);
            return this;
        }

        public final void h(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f161b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f161b.putExtra(str, strArr);
        }

        public final void i(@c.k0 String str, @c.j0 String[] strArr) {
            Intent intentM = m();
            String[] stringArrayExtra = intentM.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[strArr.length + length];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            intentM.putExtra(str, strArr2);
        }

        @c.j0
        public Intent j() {
            return Intent.createChooser(m(), this.f162c);
        }

        @c.j0
        public Context l() {
            return this.f160a;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
        @c.j0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.content.Intent m() {
            /*
                r4 = this;
                java.util.ArrayList<java.lang.String> r0 = r4.f163d
                r1 = 0
                if (r0 == 0) goto Lc
                java.lang.String r2 = "android.intent.extra.EMAIL"
                r4.h(r2, r0)
                r4.f163d = r1
            Lc:
                java.util.ArrayList<java.lang.String> r0 = r4.f164e
                if (r0 == 0) goto L17
                java.lang.String r2 = "android.intent.extra.CC"
                r4.h(r2, r0)
                r4.f164e = r1
            L17:
                java.util.ArrayList<java.lang.String> r0 = r4.f165f
                if (r0 == 0) goto L22
                java.lang.String r2 = "android.intent.extra.BCC"
                r4.h(r2, r0)
                r4.f165f = r1
            L22:
                java.util.ArrayList<android.net.Uri> r0 = r4.f166g
                r1 = 0
                if (r0 == 0) goto L2f
                int r0 = r0.size()
                r2 = 1
                if (r0 <= r2) goto L2f
                goto L30
            L2f:
                r2 = r1
            L30:
                java.lang.String r0 = "android.intent.extra.STREAM"
                if (r2 != 0) goto L5e
                android.content.Intent r2 = r4.f161b
                java.lang.String r3 = "android.intent.action.SEND"
                r2.setAction(r3)
                java.util.ArrayList<android.net.Uri> r2 = r4.f166g
                if (r2 == 0) goto L53
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L53
                android.content.Intent r2 = r4.f161b
                java.util.ArrayList<android.net.Uri> r3 = r4.f166g
                java.lang.Object r1 = r3.get(r1)
                android.os.Parcelable r1 = (android.os.Parcelable) r1
                r2.putExtra(r0, r1)
                goto L6c
            L53:
                android.content.Intent r1 = r4.f161b
                r1.removeExtra(r0)
                android.content.Intent r0 = r4.f161b
                a0.n4.a.b(r0)
                goto L73
            L5e:
                android.content.Intent r1 = r4.f161b
                java.lang.String r2 = "android.intent.action.SEND_MULTIPLE"
                r1.setAction(r2)
                android.content.Intent r1 = r4.f161b
                java.util.ArrayList<android.net.Uri> r2 = r4.f166g
                r1.putParcelableArrayListExtra(r0, r2)
            L6c:
                android.content.Intent r0 = r4.f161b
                java.util.ArrayList<android.net.Uri> r1 = r4.f166g
                a0.n4.a.a(r0, r1)
            L73:
                android.content.Intent r0 = r4.f161b
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a0.n4.b.m():android.content.Intent");
        }

        @c.j0
        public b n(@c.u0 int i4) {
            return o(this.f160a.getText(i4));
        }

        @c.j0
        public b o(@c.k0 CharSequence charSequence) {
            this.f162c = charSequence;
            return this;
        }

        @c.j0
        public b p(@c.k0 String[] strArr) {
            this.f161b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @c.j0
        public b q(@c.k0 String[] strArr) {
            this.f161b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @c.j0
        public b r(@c.k0 String[] strArr) {
            if (this.f163d != null) {
                this.f163d = null;
            }
            this.f161b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @c.j0
        public b s(@c.k0 String str) {
            this.f161b.putExtra(b0.f.f4332b, str);
            if (!this.f161b.hasExtra("android.intent.extra.TEXT")) {
                v(Html.fromHtml(str));
            }
            return this;
        }

        @c.j0
        public b t(@c.k0 Uri uri) {
            this.f166g = null;
            if (uri != null) {
                g(uri);
            }
            return this;
        }

        @c.j0
        public b u(@c.k0 String str) {
            this.f161b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        @c.j0
        public b v(@c.k0 CharSequence charSequence) {
            this.f161b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @c.j0
        public b w(@c.k0 String str) {
            this.f161b.setType(str);
            return this;
        }

        public void x() {
            this.f160a.startActivity(j());
        }
    }

    public static class c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f167f = "IntentReader";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @c.j0
        public final Context f168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @c.j0
        public final Intent f169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @c.k0
        public final String f170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @c.k0
        public final ComponentName f171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @c.k0
        public ArrayList<Uri> f172e;

        public c(@c.j0 Activity activity) {
            this((Context) u0.i.g(activity), activity.getIntent());
        }

        @c.j0
        @Deprecated
        public static c a(@c.j0 Activity activity) {
            return new c(activity);
        }

        public static void t(StringBuilder sb, CharSequence charSequence, int i4, int i5) {
            String str;
            while (i4 < i5) {
                char cCharAt = charSequence.charAt(i4);
                if (cCharAt == '<') {
                    str = "&lt;";
                } else if (cCharAt == '>') {
                    str = "&gt;";
                } else if (cCharAt == '&') {
                    str = "&amp;";
                } else if (cCharAt > '~' || cCharAt < ' ') {
                    sb.append("&#");
                    sb.append((int) cCharAt);
                    str = ";";
                } else {
                    if (cCharAt == ' ') {
                        while (true) {
                            int i6 = i4 + 1;
                            if (i6 >= i5 || charSequence.charAt(i6) != ' ') {
                                break;
                            }
                            sb.append("&nbsp;");
                            i4 = i6;
                        }
                        sb.append(' ');
                    } else {
                        sb.append(cCharAt);
                    }
                    i4++;
                }
                sb.append(str);
                i4++;
            }
        }

        @c.k0
        public ComponentName b() {
            return this.f171d;
        }

        @c.k0
        public Drawable c() {
            if (this.f171d == null) {
                return null;
            }
            try {
                return this.f168a.getPackageManager().getActivityIcon(this.f171d);
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e(f167f, "Could not retrieve icon for calling activity", e4);
                return null;
            }
        }

        @c.k0
        public Drawable d() {
            if (this.f170c == null) {
                return null;
            }
            try {
                return this.f168a.getPackageManager().getApplicationIcon(this.f170c);
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e(f167f, "Could not retrieve icon for calling application", e4);
                return null;
            }
        }

        @c.k0
        public CharSequence e() {
            if (this.f170c == null) {
                return null;
            }
            PackageManager packageManager = this.f168a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f170c, 0));
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e(f167f, "Could not retrieve label for calling application", e4);
                return null;
            }
        }

        @c.k0
        public String f() {
            return this.f170c;
        }

        @c.k0
        public String[] g() {
            return this.f169b.getStringArrayExtra("android.intent.extra.BCC");
        }

        @c.k0
        public String[] h() {
            return this.f169b.getStringArrayExtra("android.intent.extra.CC");
        }

        @c.k0
        public String[] i() {
            return this.f169b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @c.k0
        public String j() {
            String stringExtra = this.f169b.getStringExtra(b0.f.f4332b);
            if (stringExtra != null) {
                return stringExtra;
            }
            CharSequence charSequenceO = o();
            return charSequenceO instanceof Spanned ? Html.toHtml((Spanned) charSequenceO) : charSequenceO != null ? Html.escapeHtml(charSequenceO) : stringExtra;
        }

        @c.k0
        public Uri k() {
            return (Uri) this.f169b.getParcelableExtra("android.intent.extra.STREAM");
        }

        @c.k0
        public Uri l(int i4) {
            Object parcelableExtra;
            if (this.f172e == null && q()) {
                this.f172e = this.f169b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f172e;
            if (arrayList != null) {
                parcelableExtra = arrayList.get(i4);
            } else {
                if (i4 != 0) {
                    throw new IndexOutOfBoundsException("Stream items available: " + m() + " index requested: " + i4);
                }
                parcelableExtra = this.f169b.getParcelableExtra("android.intent.extra.STREAM");
            }
            return (Uri) parcelableExtra;
        }

        public int m() {
            if (this.f172e == null && q()) {
                this.f172e = this.f169b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f172e;
            return arrayList != null ? arrayList.size() : this.f169b.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @c.k0
        public String n() {
            return this.f169b.getStringExtra("android.intent.extra.SUBJECT");
        }

        @c.k0
        public CharSequence o() {
            return this.f169b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @c.k0
        public String p() {
            return this.f169b.getType();
        }

        public boolean q() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f169b.getAction());
        }

        public boolean r() {
            String action = this.f169b.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        public boolean s() {
            return "android.intent.action.SEND".equals(this.f169b.getAction());
        }

        public c(@c.j0 Context context, @c.j0 Intent intent) {
            this.f168a = (Context) u0.i.g(context);
            this.f169b = (Intent) u0.i.g(intent);
            this.f170c = n4.f(intent);
            this.f171d = n4.d(intent);
        }
    }

    @Deprecated
    public static void a(@c.j0 Menu menu, @c.y int i4, @c.j0 b bVar) {
        MenuItem menuItemFindItem = menu.findItem(i4);
        if (menuItemFindItem != null) {
            b(menuItemFindItem, bVar);
            return;
        }
        throw new IllegalArgumentException("Could not find menu item with id " + i4 + " in the supplied menu");
    }

    @Deprecated
    public static void b(@c.j0 MenuItem menuItem, @c.j0 b bVar) {
        ActionProvider actionProvider = menuItem.getActionProvider();
        ShareActionProvider shareActionProvider = !(actionProvider instanceof ShareActionProvider) ? new ShareActionProvider(bVar.l()) : (ShareActionProvider) actionProvider;
        shareActionProvider.setShareHistoryFileName(f159e + bVar.l().getClass().getName());
        shareActionProvider.setShareIntent(bVar.m());
        menuItem.setActionProvider(shareActionProvider);
    }

    @c.k0
    public static ComponentName c(@c.j0 Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? d(intent) : callingActivity;
    }

    @c.k0
    public static ComponentName d(@c.j0 Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(f157c);
        return componentName == null ? (ComponentName) intent.getParcelableExtra(f158d) : componentName;
    }

    @c.k0
    public static String e(@c.j0 Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        return (callingPackage != null || intent == null) ? callingPackage : f(intent);
    }

    @c.k0
    public static String f(@c.j0 Intent intent) {
        String stringExtra = intent.getStringExtra(f155a);
        return stringExtra == null ? intent.getStringExtra(f156b) : stringExtra;
    }
}
