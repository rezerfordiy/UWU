package c2;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.ElementDictionary;
import org.dcm4che3.data.Tag;
import org.dcm4che3.data.UID;
import org.dcm4che3.data.VR;
import org.dcm4che3.imageio.codec.jpeg.JPEG;
import org.dcm4che3.imageio.codec.jpeg.JPEGHeader;
import org.dcm4che3.imageio.codec.mpeg.MPEGHeader;
import org.dcm4che3.io.DicomOutputStream;
import org.dcm4che3.util.StreamUtils;
import org.dcm4che3.util.UIDUtils;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f4700j = 8192;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f4701k = 10485768;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f4702l = 2147483646;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Attributes f4708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JPEGHeader f4710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f4711d = new byte[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Attributes f4714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ElementDictionary f4698h = ElementDictionary.getStandardElementDictionary();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ResourceBundle f4699i = ResourceBundle.getBundle("org.dcm4che3.tool.jpg2dcm.messages");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f4703m = {Tag.StudyInstanceUID, Tag.SeriesInstanceUID, Tag.SOPInstanceUID};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long[] f4704n = {Tag.ContentDateAndTime, Tag.InstanceCreationDateAndTime};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f4705o = {Tag.StudyID, Tag.StudyDate, Tag.StudyTime, Tag.AccessionNumber, Tag.Manufacturer, Tag.ReferringPhysicianName, Tag.PatientID, Tag.PatientName, Tag.PatientBirthDate, Tag.PatientSex};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f4706p = 50001;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f4707q = 50002;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f4715d = new a("jpeg", 0, UID.UltrasoundImageStorage, UID.JPEGBaseline1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f4716e = new C0037b("mpeg", 1, UID.VideoPhotographicImageStorage, UID.MPEG4AVCH264HighProfileLevel41);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ b[] f4717f = a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f4718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f4719c;

        public enum a extends b {
            public a(String str, int i4, String str2, String str3) {
                super(str, i4, str2, str3);
            }

            @Override // c2.i.b
            public boolean d(i iVar) {
                return iVar.f4710c = new JPEGHeader(iVar.f4711d, JPEG.SOS).toAttributes(iVar.f4708a) != null;
            }
        }

        /* JADX INFO: renamed from: c2.i$b$b, reason: collision with other inner class name */
        public enum C0037b extends b {
            public C0037b(String str, int i4, String str2, String str3) {
                super(str, i4, str2, str3);
            }

            @Override // c2.i.b
            public boolean d(i iVar) {
                return new MPEGHeader(iVar.f4711d).toAttributes(iVar.f4708a, iVar.f4713f) != null;
            }
        }

        public b(String str, int i4, String str2, String str3) {
            this.f4718b = str2;
            this.f4719c = str3;
        }

        public static /* synthetic */ b[] a() {
            return new b[]{f4715d, f4716e};
        }

        public static b e(int i4) {
            return i4 == i.f4707q ? f4716e : f4715d;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f4717f.clone();
        }

        public String b() {
            return this.f4718b;
        }

        public String c() {
            return this.f4719c;
        }

        public abstract boolean d(i iVar);
    }

    public i() {
        try {
            this.f4708a = new Attributes();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static void p(Attributes attributes) {
        Date date = new Date();
        for (long j4 : f4704n) {
            if (!attributes.containsValue((int) (j4 >>> 32))) {
                attributes.setDate(j4, date);
            }
        }
    }

    public static void q(Attributes attributes) {
        for (int i4 : f4705o) {
            if (!attributes.contains(i4)) {
                attributes.setNull(i4, f4698h.vrOf(i4));
            }
        }
    }

    public static void r(Attributes attributes) {
        for (int i4 : f4703m) {
            if (!attributes.containsValue(i4)) {
                attributes.setString(i4, VR.UI, UIDUtils.createUID());
            }
        }
    }

    public static void s(Attributes attributes, int i4, String str) {
        if (attributes.containsValue(i4)) {
            return;
        }
        attributes.setString(i4, f4698h.vrOf(i4), str);
    }

    public void e(Attributes attributes) {
    }

    public void f(int i4, byte[] bArr) {
        this.f4708a.setBytes(i4, ElementDictionary.vrOf(i4, null), bArr);
    }

    public void g(int i4) {
        this.f4708a.setNull(i4, ElementDictionary.vrOf(i4, null));
    }

    public void h(int i4, String str) {
        this.f4708a.setString(i4, ElementDictionary.vrOf(i4, null), str);
    }

    public void i(int i4, Object obj) {
        this.f4708a.setValue(i4, ElementDictionary.vrOf(i4, null), obj);
    }

    public String j(List<Bitmap> list, File file, int i4) throws IOException {
        Attributes attributes = this.f4708a;
        VR vr = VR.IS;
        attributes.setInt(Tag.StartTrim, vr, 1);
        this.f4708a.setInt(Tag.StopTrim, vr, list.size());
        this.f4708a.getString(Tag.FrameTime, 0, "33.33");
        this.f4708a.getString(Tag.FrameDelay, "0.0");
        this.f4708a.setInt(Tag.NumberOfFrames, vr, list.size());
        this.f4708a.setInt(Tag.RecommendedDisplayFrameRate, vr, 3);
        this.f4708a.setInt(Tag.FrameIncrementPointer, vr, Tag.FrameTime);
        this.f4708a.setString(Tag.SpecificCharacterSet, VR.CS, "GB18030");
        this.f4708a.setDate(Tag.StudyDate, VR.DA, new Date());
        try {
            b bVarE = b.e(i4);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            list.get(0).compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream);
            if (!k(bVarE, byteArrayInputStream)) {
                throw new IOException(MessageFormat.format(f4699i.getString("failed-to-parse"), bVarE, "bitmap"));
            }
            long jAvailable = bufferedInputStream.available();
            this.f4713f = jAvailable;
            if (jAvailable > 2147483646) {
                throw new IllegalArgumentException(MessageFormat.format(f4699i.getString("file-too-large"), "bitmap"));
            }
            DicomOutputStream dicomOutputStream = new DicomOutputStream(file);
            dicomOutputStream.writeDataset(this.f4708a.createFileMetaInformation(bVarE.c()), this.f4708a);
            dicomOutputStream.writeHeader(Tag.PixelData, VR.OB, -1);
            dicomOutputStream.writeHeader(Tag.Item, null, 0);
            for (int i5 = 0; i5 < list.size(); i5++) {
                try {
                    Bitmap bitmap = list.get(i5);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new ByteArrayInputStream(byteArrayOutputStream2.toByteArray()));
                    int iAvailable = bufferedInputStream2.available();
                    try {
                        dicomOutputStream.writeHeader(Tag.Item, null, (iAvailable + 1) & (-2));
                        StreamUtils.copy(bufferedInputStream2, dicomOutputStream);
                        if (iAvailable % 2 != 0) {
                            dicomOutputStream.write(0);
                        }
                        bufferedInputStream2.close();
                    } catch (Throwable th) {
                        try {
                            bufferedInputStream2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                } finally {
                }
            }
            dicomOutputStream.writeHeader(Tag.SequenceDelimitationItem, null, 0);
            dicomOutputStream.close();
            return file.getAbsolutePath();
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(MessageFormat.format(f4699i.getString("invalid-file-ext"), "bitmap"));
        }
    }

    public final boolean k(b bVar, InputStream inputStream) throws IOException {
        int i4 = 8192;
        do {
            int i5 = this.f4712e;
            byte[] bArr = this.f4711d;
            if (i5 != bArr.length || i5 >= 10485768) {
                return false;
            }
            i4 += i5;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i4);
            this.f4711d = bArrCopyOf;
            int i6 = this.f4712e;
            this.f4712e = i6 + StreamUtils.readAvailable(inputStream, bArrCopyOf, i6, bArrCopyOf.length - i6);
        } while (!bVar.d(this));
        s(this.f4708a, Tag.SOPClassUID, bVar.b());
        return true;
    }

    public void l(Attributes attributes) {
        this.f4708a = attributes;
    }

    public void m(boolean z3) {
        this.f4709b = z3;
    }

    public void n(b2.c cVar) {
        Attributes attributes = this.f4708a;
        VR vr = VR.PN;
        attributes.setString(Tag.PatientName, vr, cVar.getName());
        this.f4708a.setString(Tag.PatientID, VR.LO, cVar.c());
        this.f4708a.setDate(Tag.PatientBirthDate, VR.DA, cVar.b());
        String str = cVar.g() == 1 ? "M" : "F";
        Attributes attributes2 = this.f4708a;
        VR vr2 = VR.CS;
        attributes2.setString(Tag.PatientSex, vr2, str);
        this.f4708a.setString(Tag.ReferringPhysicianName, vr, cVar.e());
        this.f4708a.setString(Tag.AccessionNumber, VR.SH, cVar.h());
        this.f4708a.setString(Tag.Modality, vr2, cVar.d());
        this.f4708a.setString(Tag.BodyPartExamined, vr2, cVar.a());
    }

    public void o(int i4, Attributes attributes) {
        this.f4708a.setNull(i4, ElementDictionary.vrOf(i4, null));
        this.f4708a.getSequence(i4).add(attributes);
    }
}
