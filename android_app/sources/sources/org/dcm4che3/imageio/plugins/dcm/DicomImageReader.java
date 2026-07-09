package org.dcm4che3.imageio.plugins.dcm;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.ImageInputStream;
import l0.a;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.BulkData;
import org.dcm4che3.data.Fragments;
import org.dcm4che3.data.Sequence;
import org.dcm4che3.data.Tag;
import org.dcm4che3.data.UID;
import org.dcm4che3.data.VR;
import org.dcm4che3.image.LookupTableFactory;
import org.dcm4che3.image.Overlays;
import org.dcm4che3.image.PhotometricInterpretation;
import org.dcm4che3.image.StoredValue;
import org.dcm4che3.imageio.codec.ImageReaderFactory;
import org.dcm4che3.imageio.codec.jpeg.PatchJPEGLS;
import org.dcm4che3.imageio.stream.EncapsulatedPixelDataImageInputStream;
import org.dcm4che3.imageio.stream.ImageInputStreamAdapter;
import org.dcm4che3.io.BulkDataDescriptor;
import org.dcm4che3.io.DicomInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public class DicomImageReader extends ImageReader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Logger LOG = LoggerFactory.getLogger(DicomImageReader.class);
    private boolean banded;
    private int bitsAllocated;
    private int bitsStored;
    private int dataType;
    private ImageReader decompressor;
    private DicomInputStream dis;
    private EncapsulatedPixelDataImageInputStream epdiis;
    private int flushedFrames;
    private int frameLength;
    private int frames;
    private int height;
    private ImageInputStream iis;
    private DicomMetaData metadata;
    private PatchJPEGLS patchJpegLS;
    private BulkData pixelData;
    private File pixelDataFile;
    private Fragments pixelDataFragments;
    private int pixelDataLength;
    private VR pixelDataVR;
    private PhotometricInterpretation pmi;
    private boolean rle;
    private int samples;
    private int width;

    public DicomImageReader(ImageReaderSpi imageReaderSpi) {
        super(imageReaderSpi);
    }

    private WritableRaster applyLUTs(WritableRaster writableRaster, int i4, ImageReadParam imageReadParam, SampleModel sampleModel, int i5) {
        WritableRaster writableRasterCreateWritableRaster = sampleModel.getDataType() == writableRaster.getSampleModel().getDataType() ? writableRaster : Raster.createWritableRaster(sampleModel, (Point) null);
        Attributes attributes = this.metadata.getAttributes();
        LookupTableFactory lookupTableFactory = new LookupTableFactory(StoredValue.valueOf(attributes));
        DicomImageReadParam dicomImageReadParam = imageReadParam instanceof DicomImageReadParam ? (DicomImageReadParam) imageReadParam : new DicomImageReadParam();
        Attributes presentationState = dicomImageReadParam.getPresentationState();
        if (presentationState != null) {
            lookupTableFactory.setModalityLUT(presentationState);
            lookupTableFactory.setVOI(selectVOILUT(presentationState, attributes.getString(Tag.SOPInstanceUID), i4 + 1), 0, 0, false);
            lookupTableFactory.setPresentationLUT(presentationState);
        } else {
            Attributes nestedDataset = attributes.getNestedDataset(Tag.SharedFunctionalGroupsSequence);
            Attributes nestedDataset2 = attributes.getNestedDataset(Tag.PerFrameFunctionalGroupsSequence, i4);
            lookupTableFactory.setModalityLUT(selectFctGroup(attributes, nestedDataset, nestedDataset2, Tag.PixelValueTransformationSequence));
            if (dicomImageReadParam.getWindowWidth() != 0.0f) {
                lookupTableFactory.setWindowCenter(dicomImageReadParam.getWindowCenter());
                lookupTableFactory.setWindowWidth(dicomImageReadParam.getWindowWidth());
            } else {
                lookupTableFactory.setVOI(selectFctGroup(attributes, nestedDataset, nestedDataset2, Tag.FrameVOILUTSequence), dicomImageReadParam.getWindowIndex(), dicomImageReadParam.getVOILUTIndex(), dicomImageReadParam.isPreferWindow());
            }
            if (dicomImageReadParam.isAutoWindowing()) {
                lookupTableFactory.autoWindowing(attributes, writableRaster);
            }
            lookupTableFactory.setPresentationLUT(attributes);
        }
        lookupTableFactory.createLUT(i5).lookup(writableRaster, writableRasterCreateWritableRaster);
        return writableRasterCreateWritableRaster;
    }

    private void applyOverlay(int i4, WritableRaster writableRaster, int i5, ImageReadParam imageReadParam, int i6, byte[] bArr) {
        int overlayGrayscaleValue;
        Attributes attributes = this.metadata.getAttributes();
        if (imageReadParam instanceof DicomImageReadParam) {
            DicomImageReadParam dicomImageReadParam = (DicomImageReadParam) imageReadParam;
            Attributes presentationState = dicomImageReadParam.getPresentationState();
            if (presentationState != null) {
                if (presentationState.containsValue(1610625024 | i4)) {
                    attributes = presentationState;
                }
                overlayGrayscaleValue = Overlays.getRecommendedDisplayGrayscaleValue(presentationState, i4);
            } else {
                overlayGrayscaleValue = dicomImageReadParam.getOverlayGrayscaleValue();
            }
        } else {
            overlayGrayscaleValue = a.f8427a;
        }
        Attributes attributes2 = attributes;
        if (bArr != null) {
            i5 = 0;
        }
        Overlays.applyOverlay(i5, writableRaster, attributes2, i4, overlayGrayscaleValue >>> (16 - i6), bArr);
    }

    private boolean bigEndian() {
        return this.metadata.getAttributes().bigEndian();
    }

    private void checkIndex(int i4) {
        int i5 = this.frames;
        if (i5 == 0) {
            throw new IllegalStateException("Missing Pixel Data");
        }
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException("imageIndex: " + i4);
        }
        if (this.dis == null || i4 >= this.flushedFrames) {
            return;
        }
        throw new IllegalStateException("input stream position already after requested frame #" + (i4 + 1));
    }

    private void closeiis() throws IOException {
        ImageInputStream imageInputStream;
        if (this.pixelDataFile == null || (imageInputStream = this.iis) == null) {
            return;
        }
        imageInputStream.close();
        this.iis = null;
    }

    private ColorModel createColorModel(int i4, int i5) {
        return this.pmi.createColorModel(i4, i5, this.metadata.getAttributes());
    }

    private ImageTypeSpecifier createImageType(int i4, int i5, boolean z3) {
        return new ImageTypeSpecifier(createColorModel(i4, i5), createSampleModel(i5, z3));
    }

    private SampleModel createSampleModel(int i4, boolean z3) {
        return this.pmi.createSampleModel(i4, this.width, this.height, this.samples, z3);
    }

    private ImageReadParam decompressParam(ImageReadParam imageReadParam) {
        ImageReadParam defaultReadParam = this.decompressor.getDefaultReadParam();
        ImageTypeSpecifier destinationType = imageReadParam.getDestinationType();
        BufferedImage destination = imageReadParam.getDestination();
        if (this.rle && destinationType == null && destination == null) {
            destinationType = createImageType(this.bitsStored, this.dataType, true);
        }
        defaultReadParam.setDestinationType(destinationType);
        defaultReadParam.setDestination(destination);
        return defaultReadParam;
    }

    private byte[] extractOverlay(int i4, WritableRaster writableRaster) {
        Attributes attributes = this.metadata.getAttributes();
        if (attributes.getInt(1610612992 | i4, 1) == 1) {
            return null;
        }
        int i5 = attributes.getInt(1610612752 | i4, 0);
        int i6 = attributes.getInt(1610612753 | i4, 0);
        int i7 = attributes.getInt(1610612994 | i4, 0);
        int i8 = 1 << i7;
        int i9 = i5 * i6;
        byte[] bArr = new byte[(((i9 + 7) >>> 3) + 1) & (-2)];
        if (i7 < this.bitsStored) {
            LOG.info("Ignore embedded overlay #{} from bit #{} < bits stored: {}", Integer.valueOf((i4 >>> 17) + 1), Integer.valueOf(i7), Integer.valueOf(this.bitsStored));
        } else {
            Overlays.extractFromPixeldata(writableRaster, i8, bArr, 0, i9);
        }
        return bArr;
    }

    private int[] getActiveOverlayGroupOffsets(ImageReadParam imageReadParam) {
        if (!(imageReadParam instanceof DicomImageReadParam)) {
            return Overlays.getActiveOverlayGroupOffsets(this.metadata.getAttributes(), a.f8427a);
        }
        DicomImageReadParam dicomImageReadParam = (DicomImageReadParam) imageReadParam;
        Attributes presentationState = dicomImageReadParam.getPresentationState();
        return presentationState != null ? Overlays.getActiveOverlayGroupOffsets(presentationState) : Overlays.getActiveOverlayGroupOffsets(this.metadata.getAttributes(), dicomImageReadParam.getOverlayActivationMask());
    }

    private ImageInputStream iisOfFrame(int i4) throws IOException {
        throw null;
    }

    private void initPixelData(Attributes attributes) {
        int length;
        VR.Holder holder = new VR.Holder();
        Object value = attributes.getValue(Tag.PixelData, holder);
        if (value != null) {
            this.pixelDataVR = holder.vr;
            if (value instanceof BulkData) {
                BulkData bulkData = (BulkData) value;
                this.pixelData = bulkData;
                length = bulkData.length();
            } else {
                this.pixelDataFragments = (Fragments) value;
                length = -1;
            }
            this.pixelDataLength = length;
        }
    }

    private void initPixelDataFile() {
        BulkData bulkData = this.pixelData;
        if (bulkData == null) {
            Fragments fragments = this.pixelDataFragments;
            if (fragments == null || fragments.size() <= 1) {
                return;
            } else {
                bulkData = (BulkData) this.pixelDataFragments.get(1);
            }
        }
        this.pixelDataFile = bulkData.getFile();
    }

    private void openiis() throws IOException {
        if (this.pixelDataFile == null || this.iis != null) {
            return;
        }
        this.iis = new FileImageInputStream(this.pixelDataFile);
    }

    private void readMetadata() throws IOException {
        DicomMetaData dicomMetaData;
        if (this.metadata != null) {
            return;
        }
        DicomInputStream dicomInputStream = this.dis;
        if (dicomInputStream != null) {
            Attributes fileMetaInformation = dicomInputStream.readFileMetaInformation();
            Attributes dataset = this.dis.readDataset(-1, Tag.PixelData);
            if (this.dis.tag() == 2145386512) {
                this.pixelDataVR = this.dis.vr();
                int length = this.dis.length();
                this.pixelDataLength = length;
                if (length == -1) {
                    this.epdiis = new EncapsulatedPixelDataImageInputStream(this.dis, dataset.getInt(Tag.NumberOfFrames, 1));
                }
            }
            dicomMetaData = new DicomMetaData(fileMetaInformation, dataset);
        } else {
            if (this.iis == null) {
                throw new IllegalStateException("Input not set");
            }
            DicomInputStream dicomInputStream2 = new DicomInputStream(new ImageInputStreamAdapter(this.iis));
            dicomInputStream2.setIncludeBulkData(DicomInputStream.IncludeBulkData.URI);
            dicomInputStream2.setBulkDataDescriptor(BulkDataDescriptor.PIXELDATA);
            dicomInputStream2.setURI("java:iis");
            Attributes fileMetaInformation2 = dicomInputStream2.readFileMetaInformation();
            Attributes dataset2 = dicomInputStream2.readDataset(-1, -1);
            initPixelData(dataset2);
            dicomMetaData = new DicomMetaData(fileMetaInformation2, dataset2);
        }
        setMetadata(dicomMetaData);
    }

    private void resetInternalState() {
        this.dis = null;
        this.metadata = null;
        this.pixelData = null;
        this.pixelDataFragments = null;
        this.pixelDataVR = null;
        this.pixelDataLength = 0;
        this.pixelDataFile = null;
        this.frames = 0;
        this.flushedFrames = 0;
        this.width = 0;
        this.height = 0;
        ImageReader imageReader = this.decompressor;
        if (imageReader != null) {
            imageReader.dispose();
            this.decompressor = null;
        }
        this.patchJpegLS = null;
        this.pmi = null;
    }

    private void seekFrame(int i4) throws IOException {
        if (i4 == this.flushedFrames) {
            this.epdiis.seekCurrentFrame();
            return;
        }
        while (i4 > this.flushedFrames) {
            if (!this.epdiis.seekNextFrame()) {
                throw new IOException("Data Fragments only contains " + (this.flushedFrames + 1) + " frames");
            }
            this.flushedFrames++;
        }
    }

    private Attributes selectFctGroup(Attributes attributes, Attributes attributes2, Attributes attributes3, int i4) {
        if (attributes3 == null) {
            return attributes;
        }
        Attributes nestedDataset = attributes3.getNestedDataset(i4);
        if (nestedDataset == null && attributes2 != null) {
            nestedDataset = attributes2.getNestedDataset(i4);
        }
        return nestedDataset != null ? nestedDataset : attributes;
    }

    private Attributes selectVOILUT(Attributes attributes, String str, int i4) {
        Sequence sequence = attributes.getSequence(Tag.SoftcopyVOILUTSequence);
        if (sequence == null) {
            return null;
        }
        for (Attributes attributes2 : sequence) {
            Sequence sequence2 = attributes2.getSequence(Tag.ReferencedImageSequence);
            if (sequence2 == null || sequence2.isEmpty()) {
                return attributes2;
            }
            for (Attributes attributes3 : sequence2) {
                if (str.equals(attributes3.getString(Tag.ReferencedSOPInstanceUID))) {
                    int[] ints = attributes3.getInts(Tag.ReferencedFrameNumber);
                    if (ints == null) {
                        return attributes2;
                    }
                    for (int i5 : ints) {
                        if (i5 == i4) {
                            return attributes2;
                        }
                    }
                }
            }
        }
        return null;
    }

    private void setMetadata(DicomMetaData dicomMetaData) {
        this.metadata = dicomMetaData;
        Attributes attributes = dicomMetaData.getAttributes();
        if (this.pixelDataLength != 0) {
            this.frames = attributes.getInt(Tag.NumberOfFrames, 1);
            this.width = attributes.getInt(Tag.Columns, 0);
            this.height = attributes.getInt(Tag.Rows, 0);
            int i4 = attributes.getInt(Tag.SamplesPerPixel, 1);
            this.samples = i4;
            this.banded = i4 > 1 && attributes.getInt(Tag.PlanarConfiguration, 0) != 0;
            int i5 = attributes.getInt(Tag.BitsAllocated, 8);
            this.bitsAllocated = i5;
            this.bitsStored = attributes.getInt(Tag.BitsStored, i5);
            this.dataType = this.bitsAllocated <= 8 ? 0 : 1;
            PhotometricInterpretation photometricInterpretationFromString = PhotometricInterpretation.fromString(attributes.getString(Tag.PhotometricInterpretation, "MONOCHROME2"));
            this.pmi = photometricInterpretationFromString;
            if (this.pixelDataLength != -1) {
                this.frameLength = photometricInterpretationFromString.frameLength(this.width, this.height, this.samples, this.bitsAllocated);
                return;
            }
            Attributes fileMetaInformation = dicomMetaData.getFileMetaInformation();
            if (fileMetaInformation == null) {
                throw new IllegalArgumentException("Missing File Meta Information for Data Set with compressed Pixel Data");
            }
            String string = fileMetaInformation.getString(Tag.TransferSyntaxUID);
            ImageReaderFactory.ImageReaderParam imageReaderParam = ImageReaderFactory.getImageReaderParam(string);
            if (imageReaderParam != null) {
                this.rle = string.equals(UID.RLELossless);
                this.decompressor = ImageReaderFactory.getImageReader(imageReaderParam);
                this.patchJpegLS = imageReaderParam.patchJPEGLS;
            } else {
                throw new UnsupportedOperationException("Unsupported Transfer Syntax: " + string);
            }
        }
    }

    public boolean canReadRaster() {
        return true;
    }

    public void dispose() {
        resetInternalState();
    }

    public ImageReadParam getDefaultReadParam() {
        return new DicomImageReadParam();
    }

    public int getHeight(int i4) throws IOException {
        readMetadata();
        checkIndex(i4);
        return this.height;
    }

    public IIOMetadata getImageMetadata(int i4) throws IOException {
        return null;
    }

    public Iterator<ImageTypeSpecifier> getImageTypes(int i4) throws IOException {
        int i5;
        int i6;
        boolean z3;
        ImageTypeSpecifier imageTypeSpecifierCreateImageType;
        readMetadata();
        checkIndex(i4);
        if (this.pmi.isMonochrome()) {
            imageTypeSpecifierCreateImageType = createImageType(8, 0, false);
        } else {
            if (this.decompressor == null) {
                i5 = this.bitsStored;
                i6 = this.dataType;
                z3 = this.banded;
            } else {
                if (!this.rle) {
                    openiis();
                    try {
                        iisOfFrame(0);
                        throw null;
                    } catch (Throwable th) {
                        closeiis();
                        throw th;
                    }
                }
                i5 = this.bitsStored;
                i6 = this.dataType;
                z3 = true;
            }
            imageTypeSpecifierCreateImageType = createImageType(i5, i6, z3);
        }
        return Collections.singletonList(imageTypeSpecifierCreateImageType).iterator();
    }

    public int getNumImages(boolean z3) throws IOException {
        readMetadata();
        return this.frames;
    }

    public ImageTypeSpecifier getRawImageType(int i4) throws IOException {
        int i5;
        int i6;
        boolean z3;
        readMetadata();
        checkIndex(i4);
        if (this.decompressor == null) {
            i5 = this.bitsStored;
            i6 = this.dataType;
            z3 = this.banded;
        } else {
            if (!this.rle) {
                openiis();
                try {
                    iisOfFrame(0);
                    throw null;
                } catch (Throwable th) {
                    closeiis();
                    throw th;
                }
            }
            i5 = this.bitsStored;
            i6 = this.dataType;
            z3 = true;
        }
        return createImageType(i5, i6, z3);
    }

    public IIOMetadata getStreamMetadata() throws IOException {
        readMetadata();
        return this.metadata;
    }

    public int getWidth(int i4) throws IOException {
        readMetadata();
        checkIndex(i4);
        return this.width;
    }

    public BufferedImage read(int i4, ImageReadParam imageReadParam) throws IOException {
        ColorModel colorModelCreateColorModel;
        readMetadata();
        checkIndex(i4);
        if (this.decompressor != null) {
            openiis();
            try {
                iisOfFrame(i4);
                throw null;
            } catch (Throwable th) {
                closeiis();
                throw th;
            }
        }
        WritableRaster writableRaster = (WritableRaster) readRaster(i4, imageReadParam);
        if (this.pmi.isMonochrome()) {
            int[] activeOverlayGroupOffsets = getActiveOverlayGroupOffsets(imageReadParam);
            byte[][] bArr = new byte[activeOverlayGroupOffsets.length][];
            for (int i5 = 0; i5 < activeOverlayGroupOffsets.length; i5++) {
                bArr[i5] = extractOverlay(activeOverlayGroupOffsets[i5], writableRaster);
            }
            colorModelCreateColorModel = createColorModel(8, 0);
            WritableRaster writableRasterApplyLUTs = applyLUTs(writableRaster, i4, imageReadParam, createSampleModel(0, false), 8);
            for (int i6 = 0; i6 < activeOverlayGroupOffsets.length; i6++) {
                applyOverlay(activeOverlayGroupOffsets[i6], writableRasterApplyLUTs, i4, imageReadParam, 8, bArr[i6]);
            }
            writableRaster = writableRasterApplyLUTs;
        } else {
            colorModelCreateColorModel = createColorModel(this.bitsStored, this.dataType);
        }
        return new BufferedImage(colorModelCreateColorModel, writableRaster, false, (Hashtable) null);
    }

    public Raster readRaster(int i4, ImageReadParam imageReadParam) throws IOException {
        throw null;
    }

    public void setInput(Object obj, boolean z3, boolean z4) {
        super.setInput(obj, z3, z4);
        resetInternalState();
        if (obj instanceof InputStream) {
            try {
                this.dis = obj instanceof DicomInputStream ? (DicomInputStream) obj : new DicomInputStream((InputStream) obj);
            } catch (IOException e4) {
                throw new IllegalArgumentException(e4.getMessage());
            }
        } else {
            if (!(obj instanceof DicomMetaData)) {
                this.iis = (ImageInputStream) obj;
                return;
            }
            DicomMetaData dicomMetaData = (DicomMetaData) obj;
            initPixelData(dicomMetaData.getAttributes());
            initPixelDataFile();
            setMetadata(dicomMetaData);
        }
    }
}
