package g0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import c.r0;
import d0.d;
import java.io.IOException;
import java.io.InputStream;
import q0.f;

/* JADX INFO: loaded from: classes.dex */
@c.o0(29)
@c.r0({r0.a.LIBRARY_GROUP})
public class d1 extends e1 {
    @Override // g0.e1
    @c.k0
    public Typeface b(Context context, d.c cVar, Resources resources, int i4) {
        try {
            d.C0053d[] c0053dArrA = cVar.a();
            int length = c0053dArrA.length;
            FontFamily.Builder builder = null;
            int i5 = 0;
            while (true) {
                int i6 = 1;
                if (i5 >= length) {
                    break;
                }
                d.C0053d c0053d = c0053dArrA[i5];
                try {
                    Font.Builder weight = new Font.Builder(resources, c0053d.b()).setWeight(c0053d.e());
                    if (!c0053d.f()) {
                        i6 = 0;
                    }
                    Font fontBuild = weight.setSlant(i6).setTtcIndex(c0053d.c()).setFontVariationSettings(c0053d.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
                i5++;
            }
            if (builder == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i4 & 1) != 0 ? 700 : 400, (i4 & 2) != 0 ? 1 : 0)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // g0.e1
    @c.k0
    public Typeface c(Context context, @c.k0 CancellationSignal cancellationSignal, @c.j0 f.c[] cVarArr, int i4) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = cVarArr.length;
            FontFamily.Builder builder = null;
            int i5 = 0;
            while (true) {
                int i6 = 1;
                if (i5 >= length) {
                    if (builder == null) {
                        return null;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i4 & 1) != 0 ? 700 : 400, (i4 & 2) != 0 ? 1 : 0)).build();
                }
                f.c cVar = cVarArr[i5];
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(cVar.d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                    i5++;
                } else {
                    try {
                        Font.Builder weight = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(cVar.e());
                        if (!cVar.f()) {
                            i6 = 0;
                        }
                        Font fontBuild = weight.setSlant(i6).setTtcIndex(cVar.c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                i5++;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // g0.e1
    public Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // g0.e1
    @c.k0
    public Typeface e(Context context, Resources resources, int i4, String str, int i5) {
        try {
            Font fontBuild = new Font.Builder(resources, i4).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // g0.e1
    public f.c h(f.c[] cVarArr, int i4) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
