package org.dcm4che3.imageio.codec;

import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.Tag;
import org.dcm4che3.image.Overlays;
import org.dcm4che3.image.PhotometricInterpretation;

/* JADX INFO: loaded from: classes.dex */
public final class ImageDescriptor {
    private final int bitsAllocated;
    private final int bitsStored;
    private final String bodyPartExamined;
    private final int columns;
    private final int[] embeddedOverlays;
    private final int frames;
    private final PhotometricInterpretation photometricInterpretation;
    private final int pixelRepresentation;
    private final int planarConfiguration;
    private final int rows;
    private final int samples;
    private final String sopClassUID;

    public ImageDescriptor(Attributes attributes) {
        this.rows = attributes.getInt(Tag.Rows, 0);
        this.columns = attributes.getInt(Tag.Columns, 0);
        this.samples = attributes.getInt(Tag.SamplesPerPixel, 0);
        this.photometricInterpretation = PhotometricInterpretation.fromString(attributes.getString(Tag.PhotometricInterpretation, "MONOCHROME2"));
        int i4 = attributes.getInt(Tag.BitsAllocated, 8);
        this.bitsAllocated = i4;
        this.bitsStored = attributes.getInt(Tag.BitsStored, i4);
        this.pixelRepresentation = attributes.getInt(Tag.PixelRepresentation, 0);
        this.planarConfiguration = attributes.getInt(Tag.PlanarConfiguration, 0);
        this.sopClassUID = attributes.getString(Tag.SOPClassUID);
        this.bodyPartExamined = attributes.getString(Tag.BodyPartExamined);
        this.frames = attributes.getInt(Tag.NumberOfFrames, 1);
        this.embeddedOverlays = Overlays.getEmbeddedOverlayGroupOffsets(attributes);
    }

    public int getBitsAllocated() {
        return this.bitsAllocated;
    }

    public int getBitsStored() {
        return this.bitsStored;
    }

    public String getBodyPartExamined() {
        return this.bodyPartExamined;
    }

    public int getColumns() {
        return this.columns;
    }

    public int[] getEmbeddedOverlays() {
        return this.embeddedOverlays;
    }

    public int getFrameLength() {
        return this.rows * this.columns * this.samples * (this.bitsAllocated >>> 3);
    }

    public int getFrames() {
        return this.frames;
    }

    public int getLength() {
        return getFrameLength() * this.frames;
    }

    public PhotometricInterpretation getPhotometricInterpretation() {
        return this.photometricInterpretation;
    }

    public int getPixelRepresentation() {
        return this.pixelRepresentation;
    }

    public int getPlanarConfiguration() {
        return this.planarConfiguration;
    }

    public int getRows() {
        return this.rows;
    }

    public int getSamples() {
        return this.samples;
    }

    public String getSopClassUID() {
        return this.sopClassUID;
    }

    public boolean isBanded() {
        return this.planarConfiguration != 0;
    }

    public boolean isMultiframeWithEmbeddedOverlays() {
        return this.embeddedOverlays.length > 0 && this.frames > 1;
    }

    public boolean isSigned() {
        return this.pixelRepresentation != 0;
    }
}
