package org.dcm4che3.imageio.plugins.dcm;

import javax.imageio.ImageReadParam;
import l0.a;
import org.dcm4che3.data.Attributes;

/* JADX INFO: loaded from: classes.dex */
public class DicomImageReadParam extends ImageReadParam {
    private Attributes presentationState;
    private int voiLUTIndex;
    private float windowCenter;
    private int windowIndex;
    private float windowWidth;
    private boolean autoWindowing = true;
    private boolean preferWindow = true;
    private int overlayActivationMask = 15;
    private int overlayGrayscaleValue = a.f8427a;

    public int getOverlayActivationMask() {
        return this.overlayActivationMask;
    }

    public int getOverlayGrayscaleValue() {
        return this.overlayGrayscaleValue;
    }

    public Attributes getPresentationState() {
        return this.presentationState;
    }

    public int getVOILUTIndex() {
        return this.voiLUTIndex;
    }

    public float getWindowCenter() {
        return this.windowCenter;
    }

    public int getWindowIndex() {
        return this.windowIndex;
    }

    public float getWindowWidth() {
        return this.windowWidth;
    }

    public boolean isAutoWindowing() {
        return this.autoWindowing;
    }

    public boolean isPreferWindow() {
        return this.preferWindow;
    }

    public void setAutoWindowing(boolean z3) {
        this.autoWindowing = z3;
    }

    public void setOverlayActivationMask(int i4) {
        this.overlayActivationMask = i4;
    }

    public void setOverlayGrayscaleValue(int i4) {
        this.overlayGrayscaleValue = i4;
    }

    public void setPreferWindow(boolean z3) {
        this.preferWindow = z3;
    }

    public void setPresentationState(Attributes attributes) {
        this.presentationState = attributes;
    }

    public void setVOILUTIndex(int i4) {
        this.voiLUTIndex = Math.max(i4, 0);
    }

    public void setWindowCenter(float f4) {
        this.windowCenter = f4;
    }

    public void setWindowIndex(int i4) {
        this.windowIndex = Math.max(i4, 0);
    }

    public void setWindowWidth(float f4) {
        this.windowWidth = f4;
    }
}
