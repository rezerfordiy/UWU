package org.dcm4che3.tool.storescu.test;

/* JADX INFO: loaded from: classes.dex */
public class StoreResult {
    private int failures;
    private String fileName;
    private int filesSent;
    private long size;
    private String testDescription;
    private long time;
    private int warnings;

    public StoreResult(String str, String str2, long j4, long j5, int i4, int i5, int i6) {
        this.testDescription = str;
        this.fileName = str2;
        this.size = j4;
        this.time = j5;
        this.filesSent = i4;
        this.warnings = i5;
        this.failures = i6;
    }

    public int getFailures() {
        return this.failures;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getFilesSent() {
        return this.filesSent;
    }

    public long getSize() {
        return this.size;
    }

    public String getTestDescription() {
        return this.testDescription;
    }

    public long getTime() {
        return this.time;
    }

    public int getWarnings() {
        return this.warnings;
    }
}
