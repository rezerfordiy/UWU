package d0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import c.j0;
import c.k0;
import c.l;
import c.n;
import c.r0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f6575d = "ComplexColorCompat";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Shader f6576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f6577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6578c;

    public b(Shader shader, ColorStateList colorStateList, @l int i4) {
        this.f6576a = shader;
        this.f6577b = colorStateList;
        this.f6578c = i4;
    }

    @j0
    public static b a(@j0 Resources resources, @n int i4, @k0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i4);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return d(e.c(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(a.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    public static b b(@l int i4) {
        return new b(null, null, i4);
    }

    public static b c(@j0 ColorStateList colorStateList) {
        return new b(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static b d(@j0 Shader shader) {
        return new b(shader, null, 0);
    }

    @k0
    public static b g(@j0 Resources resources, @n int i4, @k0 Resources.Theme theme) {
        try {
            return a(resources, i4, theme);
        } catch (Exception e4) {
            Log.e(f6575d, "Failed to inflate ComplexColor.", e4);
            return null;
        }
    }

    @l
    public int e() {
        return this.f6578c;
    }

    @k0
    public Shader f() {
        return this.f6576a;
    }

    public boolean h() {
        return this.f6576a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f6576a == null && (colorStateList = this.f6577b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f6577b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f6578c) {
                this.f6578c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(@l int i4) {
        this.f6578c = i4;
    }

    public boolean l() {
        return h() || this.f6578c != 0;
    }
}
