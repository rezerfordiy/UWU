package org.dcm4che3.tool.common;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.SAXParser;
import org.dcm4che3.data.Attributes;

/* JADX INFO: loaded from: classes.dex */
public abstract class DicomFiles {
    private static SAXParser saxParser;

    public interface Callback {
        boolean dicomFile(File file, Attributes attributes, long j4, Attributes attributes2) throws Exception;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0 A[Catch: all -> 0x00ee, Exception -> 0x00f1, TryCatch #5 {Exception -> 0x00f1, all -> 0x00ee, blocks: (B:28:0x009e, B:30:0x00b5, B:32:0x00be, B:34:0x00c7, B:37:0x00d8, B:39:0x00e1, B:43:0x00e7, B:36:0x00d0), top: B:63:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1 A[Catch: all -> 0x00ee, Exception -> 0x00f1, TryCatch #5 {Exception -> 0x00f1, all -> 0x00ee, blocks: (B:28:0x009e, B:30:0x00b5, B:32:0x00be, B:34:0x00c7, B:37:0x00d8, B:39:0x00e1, B:43:0x00e7, B:36:0x00d0), top: B:63:0x009e }] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void scan(java.io.File r11, boolean r12, org.dcm4che3.tool.common.DicomFiles.Callback r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dcm4che3.tool.common.DicomFiles.scan(java.io.File, boolean, org.dcm4che3.tool.common.DicomFiles$Callback):void");
    }

    public static void scan(List<String> list, Callback callback) throws Throwable {
        scan(list, true, callback);
    }

    public static void scan(List<String> list, boolean z3, Callback callback) throws Throwable {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            scan(new File(it.next()), z3, callback);
        }
    }
}
