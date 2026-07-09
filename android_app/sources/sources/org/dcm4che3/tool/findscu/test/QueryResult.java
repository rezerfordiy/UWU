package org.dcm4che3.tool.findscu.test;

/* JADX INFO: loaded from: classes.dex */
public class QueryResult {
    private int expectedResult;
    private int numMatches;
    private String testDescription;
    private long time;
    private long timeFirst;

    public QueryResult(String str, int i4, int i5, long j4, long j5) {
        this.testDescription = str;
        this.expectedResult = i4;
        this.numMatches = i5;
        this.time = j4;
        this.timeFirst = j5;
    }

    public int getExpectedResult() {
        return this.expectedResult;
    }

    public int getNumMatches() {
        return this.numMatches;
    }

    public String getTestDescription() {
        return this.testDescription;
    }

    public long getTime() {
        return this.time;
    }

    public long getTimeFirst() {
        return this.timeFirst;
    }

    public void setExpectedResult(int i4) {
        this.expectedResult = i4;
    }

    public void setNumMatches(int i4) {
        this.numMatches = i4;
    }

    public void setTestDescription(String str) {
        this.testDescription = str;
    }

    public void setTime(long j4) {
        this.time = j4;
    }

    public void setTimeFirst(long j4) {
        this.timeFirst = j4;
    }
}
