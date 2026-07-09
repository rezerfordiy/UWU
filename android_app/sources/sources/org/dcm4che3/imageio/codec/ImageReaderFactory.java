package org.dcm4che3.imageio.codec;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TreeMap;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.spi.ImageReaderSpi;
import org.dcm4che3.imageio.codec.jpeg.PatchJPEGLS;
import org.dcm4che3.util.ResourceLocator;
import org.dcm4che3.util.SafeClose;
import org.dcm4che3.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class ImageReaderFactory implements Serializable {
    private static final Logger LOG = LoggerFactory.getLogger(ImageReaderFactory.class);
    private static ImageReaderFactory defaultFactory = null;
    private static final long serialVersionUID = -2881173333124498212L;
    private final TreeMap<String, ImageReaderParam> map = new TreeMap<>();

    public static class ImageReaderParam implements Serializable {
        private static final long serialVersionUID = 6593724836340684578L;
        public final String className;
        public final String formatName;
        public final PatchJPEGLS patchJPEGLS;

        public ImageReaderParam(String str, String str2, String str3) {
            this.formatName = str;
            this.className = ImageReaderFactory.nullify(str2);
            this.patchJPEGLS = (str3 == null || str3.isEmpty()) ? null : PatchJPEGLS.valueOf(str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ImageReaderParam imageReaderParam = (ImageReaderParam) obj;
            if (!this.formatName.equals(imageReaderParam.formatName)) {
                return false;
            }
            String str = this.className;
            if (str == null ? imageReaderParam.className == null : str.equals(imageReaderParam.className)) {
                return this.patchJPEGLS == imageReaderParam.patchJPEGLS;
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = this.formatName.hashCode() * 31;
            String str = this.className;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            PatchJPEGLS patchJPEGLS = this.patchJPEGLS;
            return iHashCode2 + (patchJPEGLS != null ? patchJPEGLS.hashCode() : 0);
        }

        public String toString() {
            return "ImageReaderParam{formatName='" + this.formatName + "', className='" + this.className + "', patchJPEGLS=" + this.patchJPEGLS + '}';
        }
    }

    public static boolean canDecompress(String str) {
        return getDefault().contains(str);
    }

    public static ImageReaderFactory getDefault() {
        if (defaultFactory == null) {
            defaultFactory = initDefault();
        }
        return defaultFactory;
    }

    public static ImageReader getImageReader(ImageReaderParam imageReaderParam) {
        return Boolean.getBoolean("org.dcm4che3.imageio.codec.useServiceLoader") ? getImageReaderFromServiceLoader(imageReaderParam) : getImageReaderFromImageIOServiceRegistry(imageReaderParam);
    }

    public static ImageReader getImageReaderFromImageIOServiceRegistry(ImageReaderParam imageReaderParam) {
        Iterator imageReadersByFormatName = ImageIO.getImageReadersByFormatName(imageReaderParam.formatName);
        if (!imageReadersByFormatName.hasNext()) {
            throw new RuntimeException("No Reader for format: " + imageReaderParam.formatName + " registered");
        }
        ImageReader imageReader = (ImageReader) imageReadersByFormatName.next();
        if (imageReaderParam.className != null) {
            while (true) {
                if (!imageReaderParam.className.equals(imageReader.getClass().getName())) {
                    if (!imageReadersByFormatName.hasNext()) {
                        LOG.warn("No preferred Reader {} for format: {} - use {}", imageReaderParam.className, imageReaderParam.formatName, imageReader.getClass().getName());
                        break;
                    }
                    imageReader = (ImageReader) imageReadersByFormatName.next();
                } else {
                    break;
                }
            }
        }
        return imageReader;
    }

    public static ImageReader getImageReaderFromServiceLoader(ImageReaderParam imageReaderParam) {
        try {
            return getImageReaderSpi(imageReaderParam).createReaderInstance();
        } catch (IOException e4) {
            throw new RuntimeException("Error instantiating Reader for format: " + imageReaderParam.formatName, e4);
        }
    }

    public static ImageReaderParam getImageReaderParam(String str) {
        return getDefault().get(str);
    }

    private static ImageReaderSpi getImageReaderSpi(ImageReaderParam imageReaderParam) {
        FormatNameFilterIterator formatNameFilterIterator = new FormatNameFilterIterator(ServiceLoader.load(ImageReaderSpi.class).iterator(), imageReaderParam.formatName);
        if (!formatNameFilterIterator.hasNext()) {
            throw new RuntimeException("No Reader for format: " + imageReaderParam.formatName + " registered");
        }
        ImageReaderSpi imageReaderSpi = (ImageReaderSpi) formatNameFilterIterator.next();
        if (imageReaderParam.className != null) {
            while (true) {
                if (!imageReaderParam.className.equals(imageReaderSpi.getPluginClassName())) {
                    if (!formatNameFilterIterator.hasNext()) {
                        LOG.warn("No preferred Reader {} for format: {} - use {}", imageReaderParam.className, imageReaderParam.formatName, imageReaderSpi.getPluginClassName());
                        break;
                    }
                    imageReaderSpi = (ImageReaderSpi) formatNameFilterIterator.next();
                } else {
                    break;
                }
            }
        }
        return imageReaderSpi;
    }

    private static ImageReaderFactory initDefault() {
        ImageReaderFactory imageReaderFactory = new ImageReaderFactory();
        String property = System.getProperty(ImageReaderFactory.class.getName(), "org/dcm4che3/imageio/codec/ImageReaderFactory.properties");
        try {
            imageReaderFactory.load(property);
            return imageReaderFactory;
        } catch (Exception e4) {
            throw new RuntimeException("Failed to load Image Reader Factory configuration from: " + property, e4);
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

    public static void setDefault(ImageReaderFactory imageReaderFactory) {
        imageReaderFactory.getClass();
        defaultFactory = imageReaderFactory;
    }

    public void clear() {
        this.map.clear();
    }

    public boolean contains(String str) {
        return this.map.containsKey(str);
    }

    public ImageReaderParam get(String str) {
        return this.map.get(str);
    }

    public Set<Map.Entry<String, ImageReaderParam>> getEntries() {
        return Collections.unmodifiableMap(this.map).entrySet();
    }

    public void load(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        for (Map.Entry entry : properties.entrySet()) {
            String[] strArrSplit = StringUtils.split((String) entry.getValue(), ':');
            this.map.put((String) entry.getKey(), new ImageReaderParam(strArrSplit[0], strArrSplit[1], strArrSplit[2]));
        }
    }

    public ImageReaderParam put(String str, ImageReaderParam imageReaderParam) {
        return this.map.put(str, imageReaderParam);
    }

    public ImageReaderParam remove(String str) {
        return this.map.remove(str);
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
