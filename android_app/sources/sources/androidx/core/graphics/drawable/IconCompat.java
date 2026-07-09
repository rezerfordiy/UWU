package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.c;
import androidx.versionedparcelable.CustomVersionedParcelable;
import b0.e;
import c.j0;
import c.k0;
import c.l;
import c.o0;
import c.r0;
import c.s;
import c.y;
import c.z0;
import d0.g;
import h0.h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import u0.i;
import v0.z1;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    @z0
    public static final String A = "obj";

    @z0
    public static final String B = "int1";

    @z0
    public static final String C = "int2";

    @z0
    public static final String D = "tint_list";

    @z0
    public static final String E = "tint_mode";

    @z0
    public static final String F = "string1";
    public static final PorterDuff.Mode G = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f3394k = "IconCompat";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f3395l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f3396m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f3397n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f3398o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f3399p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f3400q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f3401r = 6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f3402s = 0.25f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f3403t = 0.6666667f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f3404u = 0.9166667f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final float f3405v = 0.010416667f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final float f3406w = 0.020833334f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f3407x = 61;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f3408y = 30;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @z0
    public static final String f3409z = "type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public int f3410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @r0({r0.a.LIBRARY})
    public byte[] f3412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @r0({r0.a.LIBRARY})
    public Parcelable f3413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @r0({r0.a.LIBRARY})
    public int f3414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @r0({r0.a.LIBRARY})
    public int f3415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @r0({r0.a.LIBRARY})
    public ColorStateList f3416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f3417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @r0({r0.a.LIBRARY})
    public String f3418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @r0({r0.a.LIBRARY})
    public String f3419j;

    @Retention(RetentionPolicy.SOURCE)
    @r0({r0.a.LIBRARY})
    public @interface a {
    }

    @r0({r0.a.LIBRARY})
    public IconCompat() {
        this.f3410a = -1;
        this.f3412c = null;
        this.f3413d = null;
        this.f3414e = 0;
        this.f3415f = 0;
        this.f3416g = null;
        this.f3417h = G;
        this.f3418i = null;
    }

    @k0
    @o0(23)
    public static Uri B(@j0 Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e4) {
            Log.e(f3394k, "Unable to get icon uri", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            Log.e(f3394k, "Unable to get icon uri", e5);
            return null;
        } catch (InvocationTargetException e6) {
            Log.e(f3394k, "Unable to get icon uri", e6);
            return null;
        }
    }

    public static String L(int i4) {
        switch (i4) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @k0
    public static IconCompat e(@j0 Bundle bundle) {
        Object parcelable;
        int i4 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i4);
        iconCompat.f3414e = bundle.getInt(B);
        iconCompat.f3415f = bundle.getInt(C);
        iconCompat.f3419j = bundle.getString(F);
        if (bundle.containsKey(D)) {
            iconCompat.f3416g = (ColorStateList) bundle.getParcelable(D);
        }
        if (bundle.containsKey(E)) {
            iconCompat.f3417h = PorterDuff.Mode.valueOf(bundle.getString(E));
        }
        switch (i4) {
            case -1:
            case 1:
            case 5:
                parcelable = bundle.getParcelable(A);
                iconCompat.f3411b = parcelable;
                return iconCompat;
            case 0:
            default:
                Log.w(f3394k, "Unknown type " + i4);
                return null;
            case 2:
            case 4:
            case 6:
                parcelable = bundle.getString(A);
                iconCompat.f3411b = parcelable;
                return iconCompat;
            case 3:
                iconCompat.f3411b = bundle.getByteArray(A);
                return iconCompat;
        }
    }

    @k0
    @o0(23)
    public static IconCompat f(@j0 Context context, @j0 Icon icon) {
        i.g(icon);
        int iZ = z(icon);
        if (iZ == 2) {
            String strW = w(icon);
            try {
                return r(x(context, strW), strW, u(icon));
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        }
        if (iZ == 4) {
            return n(B(icon));
        }
        if (iZ == 6) {
            return k(B(icon));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.f3411b = icon;
        return iconCompat;
    }

    @k0
    @o0(23)
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static IconCompat g(@j0 Icon icon) {
        i.g(icon);
        int iZ = z(icon);
        if (iZ == 2) {
            return r(null, w(icon), u(icon));
        }
        if (iZ == 4) {
            return n(B(icon));
        }
        if (iZ == 6) {
            return k(B(icon));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.f3411b = icon;
        return iconCompat;
    }

    @k0
    @o0(23)
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static IconCompat h(@j0 Icon icon) {
        if (z(icon) == 2 && u(icon) == 0) {
            return null;
        }
        return g(icon);
    }

    @z0
    public static Bitmap i(Bitmap bitmap, boolean z3) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f4 = iMin;
        float f5 = 0.5f * f4;
        float f6 = 0.9166667f * f5;
        if (z3) {
            float f7 = 0.010416667f * f4;
            paint.setColor(0);
            paint.setShadowLayer(f7, 0.0f, f4 * 0.020833334f, 1023410176);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.setShadowLayer(f7, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(z1.f12256t);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2, (-(bitmap.getHeight() - iMin)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f5, f5, f6, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat j(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f3411b = bitmap;
        return iconCompat;
    }

    @j0
    public static IconCompat k(@j0 Uri uri) {
        if (uri != null) {
            return l(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    @j0
    public static IconCompat l(@j0 String str) {
        if (str == null) {
            throw new IllegalArgumentException("Uri must not be null.");
        }
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f3411b = str;
        return iconCompat;
    }

    public static IconCompat m(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f3411b = bitmap;
        return iconCompat;
    }

    public static IconCompat n(Uri uri) {
        if (uri != null) {
            return o(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat o(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Uri must not be null.");
        }
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f3411b = str;
        return iconCompat;
    }

    public static IconCompat p(byte[] bArr, int i4, int i5) {
        if (bArr == null) {
            throw new IllegalArgumentException("Data must not be null.");
        }
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f3411b = bArr;
        iconCompat.f3414e = i4;
        iconCompat.f3415f = i5;
        return iconCompat;
    }

    public static IconCompat q(Context context, @s int i4) {
        if (context != null) {
            return r(context.getResources(), context.getPackageName(), i4);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static IconCompat r(Resources resources, String str, @s int i4) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (i4 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f3414e = i4;
        if (resources != null) {
            try {
                iconCompat.f3411b = resources.getResourceName(i4);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f3411b = str;
        }
        iconCompat.f3419j = str;
        return iconCompat;
    }

    @o0(23)
    @s
    @y
    public static int u(@j0 Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e4) {
            Log.e(f3394k, "Unable to get icon resource", e4);
            return 0;
        } catch (NoSuchMethodException e5) {
            Log.e(f3394k, "Unable to get icon resource", e5);
            return 0;
        } catch (InvocationTargetException e6) {
            Log.e(f3394k, "Unable to get icon resource", e6);
            return 0;
        }
    }

    @k0
    @o0(23)
    public static String w(@j0 Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e4) {
            Log.e(f3394k, "Unable to get icon package", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            Log.e(f3394k, "Unable to get icon package", e5);
            return null;
        } catch (InvocationTargetException e6) {
            Log.e(f3394k, "Unable to get icon package", e6);
            return null;
        }
    }

    public static Resources x(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e(f3394k, String.format("Unable to find pkg=%s for icon", str), e4);
            return null;
        }
    }

    @o0(23)
    public static int z(@j0 Icon icon) {
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e4) {
            e = e4;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e(f3394k, sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e5) {
            e = e5;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e(f3394k, sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e6) {
            e = e6;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e(f3394k, sb.toString(), e);
            return -1;
        }
    }

    @j0
    public Uri A() {
        int i4 = this.f3410a;
        if (i4 == -1) {
            return B((Icon) this.f3411b);
        }
        if (i4 == 4 || i4 == 6) {
            return Uri.parse((String) this.f3411b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @k0
    @r0({r0.a.LIBRARY_GROUP})
    public InputStream C(@j0 Context context) {
        StringBuilder sb;
        String str;
        Uri uriA = A();
        String scheme = uriA.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriA);
            } catch (Exception e4) {
                e = e4;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f3411b));
            } catch (FileNotFoundException e5) {
                e = e5;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(uriA);
        Log.w(f3394k, sb.toString(), e);
        return null;
    }

    @k0
    public Drawable D(@j0 Context context) {
        d(context);
        return K(context).loadDrawable(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Drawable E(Context context) {
        switch (this.f3410a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f3411b);
            case 2:
                String strV = v();
                if (TextUtils.isEmpty(strV)) {
                    strV = context.getPackageName();
                }
                try {
                    return g.d(x(context, strV), this.f3414e, context.getTheme());
                } catch (RuntimeException e4) {
                    Log.e(f3394k, String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f3414e), this.f3411b), e4);
                }
                break;
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f3411b, this.f3414e, this.f3415f));
            case 4:
                InputStream inputStreamC = C(context);
                if (inputStreamC != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamC));
                }
                return null;
            case 5:
                return new BitmapDrawable(context.getResources(), i((Bitmap) this.f3411b, false));
            case 6:
                InputStream inputStreamC2 = C(context);
                if (inputStreamC2 != null) {
                    if (Build.VERSION.SDK_INT < 26) {
                        return new BitmapDrawable(context.getResources(), i(BitmapFactory.decodeStream(inputStreamC2), false));
                    }
                    h0.i.a();
                    return h.a(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamC2)));
                }
                return null;
            default:
                return null;
        }
    }

    public IconCompat F(@l int i4) {
        return G(ColorStateList.valueOf(i4));
    }

    public IconCompat G(ColorStateList colorStateList) {
        this.f3416g = colorStateList;
        return this;
    }

    public IconCompat H(PorterDuff.Mode mode) {
        this.f3417h = mode;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    @c.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle I() {
        /*
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            int r1 = r3.f3410a
            java.lang.String r2 = "obj"
            switch(r1) {
                case -1: goto L29;
                case 0: goto Lc;
                case 1: goto L24;
                case 2: goto L1c;
                case 3: goto L14;
                case 4: goto L1c;
                case 5: goto L24;
                case 6: goto L1c;
                default: goto Lc;
            }
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid icon"
            r0.<init>(r1)
            throw r0
        L14:
            java.lang.Object r1 = r3.f3411b
            byte[] r1 = (byte[]) r1
            r0.putByteArray(r2, r1)
            goto L30
        L1c:
            java.lang.Object r1 = r3.f3411b
            java.lang.String r1 = (java.lang.String) r1
            r0.putString(r2, r1)
            goto L30
        L24:
            java.lang.Object r1 = r3.f3411b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            goto L2d
        L29:
            java.lang.Object r1 = r3.f3411b
            android.os.Parcelable r1 = (android.os.Parcelable) r1
        L2d:
            r0.putParcelable(r2, r1)
        L30:
            java.lang.String r1 = "type"
            int r2 = r3.f3410a
            r0.putInt(r1, r2)
            java.lang.String r1 = "int1"
            int r2 = r3.f3414e
            r0.putInt(r1, r2)
            java.lang.String r1 = "int2"
            int r2 = r3.f3415f
            r0.putInt(r1, r2)
            java.lang.String r1 = "string1"
            java.lang.String r2 = r3.f3419j
            r0.putString(r1, r2)
            android.content.res.ColorStateList r1 = r3.f3416g
            if (r1 == 0) goto L55
            java.lang.String r2 = "tint_list"
            r0.putParcelable(r2, r1)
        L55:
            android.graphics.PorterDuff$Mode r1 = r3.f3417h
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.G
            if (r1 == r2) goto L64
            java.lang.String r2 = "tint_mode"
            java.lang.String r1 = r1.name()
            r0.putString(r2, r1)
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.I():android.os.Bundle");
    }

    @o0(23)
    @j0
    @Deprecated
    public Icon J() {
        return K(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    @c.o0(23)
    @c.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.drawable.Icon K(@c.k0 android.content.Context r5) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.K(android.content.Context):android.graphics.drawable.Icon");
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void a() {
        Parcelable parcelable;
        this.f3417h = PorterDuff.Mode.valueOf(this.f3418i);
        switch (this.f3410a) {
            case -1:
                parcelable = this.f3413d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f3413d;
                if (parcelable == null) {
                    byte[] bArr = this.f3412c;
                    this.f3411b = bArr;
                    this.f3410a = 3;
                    this.f3414e = 0;
                    this.f3415f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3412c, Charset.forName("UTF-16"));
                this.f3411b = str;
                if (this.f3410a == 2 && this.f3419j == null) {
                    this.f3419j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3411b = this.f3412c;
                return;
        }
        this.f3411b = parcelable;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void b(boolean z3) {
        this.f3418i = this.f3417h.name();
        switch (this.f3410a) {
            case -1:
                if (z3) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z3) {
                    Bitmap bitmap = (Bitmap) this.f3411b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f3412c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f3412c = ((String) this.f3411b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f3412c = (byte[]) this.f3411b;
                return;
            case 4:
            case 6:
                this.f3412c = this.f3411b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f3413d = (Parcelable) this.f3411b;
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void c(@j0 Intent intent, @k0 Drawable drawable, @j0 Context context) {
        Bitmap bitmapCopy;
        d(context);
        int i4 = this.f3410a;
        if (i4 == 1) {
            bitmapCopy = (Bitmap) this.f3411b;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i4 == 2) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(v(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.f3414e));
                    return;
                }
                Drawable drawableH = e.h(contextCreatePackageContext, this.f3414e);
                if (drawableH.getIntrinsicWidth() <= 0 || drawableH.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService(c.f1623r)).getLauncherLargeIconSize();
                    bitmapCopy = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCopy = Bitmap.createBitmap(drawableH.getIntrinsicWidth(), drawableH.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                }
                drawableH.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                drawableH.draw(new Canvas(bitmapCopy));
            } catch (PackageManager.NameNotFoundException e4) {
                throw new IllegalArgumentException("Can't find package " + this.f3411b, e4);
            }
        } else {
            if (i4 != 5) {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            bitmapCopy = i((Bitmap) this.f3411b, true);
        }
        if (drawable != null) {
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmapCopy));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapCopy);
    }

    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public void d(@j0 Context context) {
        Object obj;
        if (this.f3410a != 2 || (obj = this.f3411b) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i(f3394k, "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String strV = v();
            int identifier = x(context, strV).getIdentifier(str4, str3, str5);
            if (this.f3414e != identifier) {
                Log.i(f3394k, "Id has changed for " + strV + " " + str);
                this.f3414e = identifier;
            }
        }
    }

    @k0
    @r0({r0.a.LIBRARY_GROUP_PREFIX})
    public Bitmap s() {
        int i4 = this.f3410a;
        if (i4 == -1) {
            Object obj = this.f3411b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i4 == 1) {
            return (Bitmap) this.f3411b;
        }
        if (i4 == 5) {
            return i((Bitmap) this.f3411b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    @y
    public int t() {
        int i4 = this.f3410a;
        if (i4 == -1) {
            return u((Icon) this.f3411b);
        }
        if (i4 == 2) {
            return this.f3414e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @j0
    public String toString() {
        int height;
        if (this.f3410a == -1) {
            return String.valueOf(this.f3411b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(L(this.f3410a));
        switch (this.f3410a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3411b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f3411b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f3419j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(t())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f3414e);
                if (this.f3415f != 0) {
                    sb.append(" off=");
                    height = this.f3415f;
                    sb.append(height);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3411b);
                break;
        }
        if (this.f3416g != null) {
            sb.append(" tint=");
            sb.append(this.f3416g);
        }
        if (this.f3417h != G) {
            sb.append(" mode=");
            sb.append(this.f3417h);
        }
        sb.append(")");
        return sb.toString();
    }

    @j0
    public String v() {
        int i4 = this.f3410a;
        if (i4 == -1) {
            return w((Icon) this.f3411b);
        }
        if (i4 == 2) {
            return TextUtils.isEmpty(this.f3419j) ? ((String) this.f3411b).split(":", -1)[0] : this.f3419j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int y() {
        int i4 = this.f3410a;
        return i4 == -1 ? z((Icon) this.f3411b) : i4;
    }

    public IconCompat(int i4) {
        this.f3412c = null;
        this.f3413d = null;
        this.f3414e = 0;
        this.f3415f = 0;
        this.f3416g = null;
        this.f3417h = G;
        this.f3418i = null;
        this.f3410a = i4;
    }
}
