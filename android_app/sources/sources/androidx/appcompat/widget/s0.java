package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class s0 extends Resources {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f1821a;

    public s0(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1821a = resources;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i4) throws Resources.NotFoundException {
        return this.f1821a.getAnimation(i4);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i4) throws Resources.NotFoundException {
        return this.f1821a.getBoolean(i4);
    }

    @Override // android.content.res.Resources
    public int getColor(int i4) throws Resources.NotFoundException {
        return this.f1821a.getColor(i4);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i4) throws Resources.NotFoundException {
        return this.f1821a.getColorStateList(i4);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f1821a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i4) throws Resources.NotFoundException {
        return this.f1821a.getDimension(i4);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i4) throws Resources.NotFoundException {
        return this.f1821a.getDimensionPixelOffset(i4);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i4) throws Resources.NotFoundException {
        return this.f1821a.getDimensionPixelSize(i4);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f1821a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i4) throws Resources.NotFoundException {
        return this.f1821a.getDrawable(i4);
    }

    @Override // android.content.res.Resources
    @c.o0(15)
    public Drawable getDrawableForDensity(int i4, int i5) throws Resources.NotFoundException {
        return this.f1821a.getDrawableForDensity(i4, i5);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i4, int i5, int i6) {
        return this.f1821a.getFraction(i4, i5, i6);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f1821a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i4) throws Resources.NotFoundException {
        return this.f1821a.getIntArray(i4);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i4) throws Resources.NotFoundException {
        return this.f1821a.getInteger(i4);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i4) throws Resources.NotFoundException {
        return this.f1821a.getLayout(i4);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i4) throws Resources.NotFoundException {
        return this.f1821a.getMovie(i4);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i4, int i5) throws Resources.NotFoundException {
        return this.f1821a.getQuantityString(i4, i5);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i4, int i5) throws Resources.NotFoundException {
        return this.f1821a.getQuantityText(i4, i5);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i4) throws Resources.NotFoundException {
        return this.f1821a.getResourceEntryName(i4);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i4) throws Resources.NotFoundException {
        return this.f1821a.getResourceName(i4);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i4) throws Resources.NotFoundException {
        return this.f1821a.getResourcePackageName(i4);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i4) throws Resources.NotFoundException {
        return this.f1821a.getResourceTypeName(i4);
    }

    @Override // android.content.res.Resources
    public String getString(int i4) throws Resources.NotFoundException {
        return this.f1821a.getString(i4);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i4) throws Resources.NotFoundException {
        return this.f1821a.getStringArray(i4);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i4) throws Resources.NotFoundException {
        return this.f1821a.getText(i4);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i4) throws Resources.NotFoundException {
        return this.f1821a.getTextArray(i4);
    }

    @Override // android.content.res.Resources
    public void getValue(int i4, TypedValue typedValue, boolean z3) throws Resources.NotFoundException {
        this.f1821a.getValue(i4, typedValue, z3);
    }

    @Override // android.content.res.Resources
    @c.o0(15)
    public void getValueForDensity(int i4, int i5, TypedValue typedValue, boolean z3) throws Resources.NotFoundException {
        this.f1821a.getValueForDensity(i4, i5, typedValue, z3);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i4) throws Resources.NotFoundException {
        return this.f1821a.getXml(i4);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f1821a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i4) throws Resources.NotFoundException {
        return this.f1821a.obtainTypedArray(i4);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i4) throws Resources.NotFoundException {
        return this.f1821a.openRawResource(i4);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i4) throws Resources.NotFoundException {
        return this.f1821a.openRawResourceFd(i4);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f1821a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f1821a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f1821a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    @c.o0(21)
    public Drawable getDrawable(int i4, Resources.Theme theme) throws Resources.NotFoundException {
        return this.f1821a.getDrawable(i4, theme);
    }

    @Override // android.content.res.Resources
    @c.o0(21)
    public Drawable getDrawableForDensity(int i4, int i5, Resources.Theme theme) {
        return this.f1821a.getDrawableForDensity(i4, i5, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i4, int i5, Object... objArr) throws Resources.NotFoundException {
        return this.f1821a.getQuantityString(i4, i5, objArr);
    }

    @Override // android.content.res.Resources
    public String getString(int i4, Object... objArr) throws Resources.NotFoundException {
        return this.f1821a.getString(i4, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i4, CharSequence charSequence) {
        return this.f1821a.getText(i4, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z3) throws Resources.NotFoundException {
        this.f1821a.getValue(str, typedValue, z3);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i4, TypedValue typedValue) throws Resources.NotFoundException {
        return this.f1821a.openRawResource(i4, typedValue);
    }
}
