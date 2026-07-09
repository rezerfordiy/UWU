package org.dcm4che3.imageio.codec;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TreeMap;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.imageio.spi.ImageWriterSpi;
import org.dcm4che3.imageio.codec.jpeg.PatchJPEGLS;
import org.dcm4che3.util.Property;
import org.dcm4che3.util.ResourceLocator;
import org.dcm4che3.util.SafeClose;
import org.dcm4che3.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class ImageWriterFactory implements Serializable {
    private static final Logger LOG = LoggerFactory.getLogger(ImageWriterFactory.class);
    private static ImageWriterFactory defaultFactory = null;
    private static final long serialVersionUID = 6328126996969794374L;
    private final TreeMap<String, ImageWriterParam> map = new TreeMap<>();
    private PatchJPEGLS patchJPEGLS;

    public static class ImageWriterParam implements Serializable {
        private static final long serialVersionUID = 3521737269113651910L;
        public final String className;
        public final String formatName;
        public final Property[] imageWriteParams;
        public final PatchJPEGLS patchJPEGLS;

        public ImageWriterParam(String str, String str2, String str3, String[] strArr) {
            this(str, str2, (str3 == null || str3.isEmpty()) ? null : PatchJPEGLS.valueOf(str3), Property.valueOf(strArr));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ImageWriterParam imageWriterParam = (ImageWriterParam) obj;
            if (!this.formatName.equals(imageWriterParam.formatName)) {
                return false;
            }
            String str = this.className;
            if (str == null ? imageWriterParam.className != null : !str.equals(imageWriterParam.className)) {
                return false;
            }
            if (this.patchJPEGLS != imageWriterParam.patchJPEGLS) {
                return false;
            }
            return Arrays.equals(this.imageWriteParams, imageWriterParam.imageWriteParams);
        }

        public Property[] getImageWriteParams() {
            return this.imageWriteParams;
        }

        public int hashCode() {
            int iHashCode = this.formatName.hashCode() * 31;
            String str = this.className;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            PatchJPEGLS patchJPEGLS = this.patchJPEGLS;
            return ((iHashCode2 + (patchJPEGLS != null ? patchJPEGLS.hashCode() : 0)) * 31) + Arrays.hashCode(this.imageWriteParams);
        }

        public String toString() {
            return "ImageWriterParam{formatName='" + this.formatName + "', className='" + this.className + "', patchJPEGLS=" + this.patchJPEGLS + ", imageWriteParams=" + Arrays.toString(this.imageWriteParams) + '}';
        }

        public ImageWriterParam(String str, String str2, PatchJPEGLS patchJPEGLS, Property[] propertyArr) {
            this.formatName = str;
            this.className = ImageWriterFactory.nullify(str2);
            this.patchJPEGLS = patchJPEGLS;
            this.imageWriteParams = propertyArr;
        }
    }

    public static ImageWriterFactory getDefault() {
        if (defaultFactory == null) {
            defaultFactory = initDefault();
        }
        return defaultFactory;
    }

    public static ImageWriter getImageWriter(ImageWriterParam imageWriterParam) {
        return Boolean.getBoolean("org.dcm4che3.imageio.codec.useServiceLoader") ? getImageWriterFromServiceLoader(imageWriterParam) : getImageWriterFromImageIOServiceRegistry(imageWriterParam);
    }

    public static ImageWriter getImageWriterFromImageIOServiceRegistry(ImageWriterParam imageWriterParam) {
        Iterator imageWritersByFormatName = ImageIO.getImageWritersByFormatName(imageWriterParam.formatName);
        if (!imageWritersByFormatName.hasNext()) {
            throw new RuntimeException("No Writer for format: " + imageWriterParam.formatName + " registered");
        }
        ImageWriter imageWriter = (ImageWriter) imageWritersByFormatName.next();
        if (imageWriterParam.className != null) {
            while (true) {
                if (!imageWriterParam.className.equals(imageWriter.getClass().getName())) {
                    if (!imageWritersByFormatName.hasNext()) {
                        LOG.warn("No preferred Writer {} for format: {} - use {}", imageWriterParam.className, imageWriterParam.formatName, imageWriter.getClass().getName());
                        break;
                    }
                    imageWriter = (ImageWriter) imageWritersByFormatName.next();
                } else {
                    break;
                }
            }
        }
        return imageWriter;
    }

    public static ImageWriter getImageWriterFromServiceLoader(ImageWriterParam imageWriterParam) {
        try {
            return getImageWriterSpi(imageWriterParam).createWriterInstance();
        } catch (IOException e4) {
            throw new RuntimeException("Error instantiating Writer for format: " + imageWriterParam.formatName, e4);
        }
    }

    public static ImageWriterParam getImageWriterParam(String str) {
        return getDefault().get(str);
    }

    private static ImageWriterSpi getImageWriterSpi(ImageWriterParam imageWriterParam) {
        FormatNameFilterIterator formatNameFilterIterator = new FormatNameFilterIterator(ServiceLoader.load(ImageWriterSpi.class).iterator(), imageWriterParam.formatName);
        if (!formatNameFilterIterator.hasNext()) {
            throw new RuntimeException("No Writer for format: " + imageWriterParam.formatName + " registered");
        }
        ImageWriterSpi imageWriterSpi = (ImageWriterSpi) formatNameFilterIterator.next();
        if (imageWriterParam.className != null) {
            while (true) {
                if (!imageWriterParam.className.equals(imageWriterSpi.getPluginClassName())) {
                    if (!formatNameFilterIterator.hasNext()) {
                        LOG.warn("No preferred Writer {} for format: {} - use {}", imageWriterParam.className, imageWriterParam.formatName, imageWriterSpi.getPluginClassName());
                        break;
                    }
                    imageWriterSpi = (ImageWriterSpi) formatNameFilterIterator.next();
                } else {
                    break;
                }
            }
        }
        return imageWriterSpi;
    }

    private static ImageWriterFactory initDefault() {
        ImageWriterFactory imageWriterFactory = new ImageWriterFactory();
        String property = System.getProperty(ImageWriterFactory.class.getName(), "org/dcm4che3/imageio/codec/ImageWriterFactory.properties");
        try {
            imageWriterFactory.load(property);
            return imageWriterFactory;
        } catch (Exception e4) {
            throw new RuntimeException("Failed to load Image Writer Factory configuration from: " + property, e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String nullify(String str) {
        if (str == null || str.isEmpty() || str.equals(Marker.ANY_MARKER)) {
            return null;
        }
        return str;
    }

    public static void resetDefault() {
        defaultFactory = null;
    }

    public static void setDefault(ImageWriterFactory imageWriterFactory) {
        imageWriterFactory.getClass();
        defaultFactory = imageWriterFactory;
    }

    public void clear() {
        this.map.clear();
    }

    public ImageWriterParam get(String str) {
        return this.map.get(str);
    }

    public Set<Map.Entry<String, ImageWriterParam>> getEntries() {
        return Collections.unmodifiableMap(this.map).entrySet();
    }

    public final PatchJPEGLS getPatchJPEGLS() {
        return this.patchJPEGLS;
    }

    public void load(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        for (Map.Entry entry : properties.entrySet()) {
            String[] strArrSplit = StringUtils.split((String) entry.getValue(), ':');
            this.map.put((String) entry.getKey(), new ImageWriterParam(strArrSplit[0], strArrSplit[1], strArrSplit[2], StringUtils.split(strArrSplit[3], ';')));
        }
    }

    public ImageWriterParam put(String str, ImageWriterParam imageWriterParam) {
        return this.map.put(str, imageWriterParam);
    }

    public ImageWriterParam remove(String str) {
        return this.map.remove(str);
    }

    public final void setPatchJPEGLS(PatchJPEGLS patchJPEGLS) {
        this.patchJPEGLS = patchJPEGLS;
    }

    public void load(String str) throws IOException {
        URL resourceURL;
        try {
            resourceURL = new URL(str);
        } catch (MalformedURLException unused) {
            resourceURL = ResourceLocator.getResourceURL(str, getClass());
            if (resourceURL == null) {
                throw new IOException("No such resource: " + str);
            }
        }
        InputStream inputStreamOpenStream = resourceURL.openStream();
        try {
            load(inputStreamOpenStream);
        } finally {
            SafeClose.close(inputStreamOpenStream);
        }
    }
}
