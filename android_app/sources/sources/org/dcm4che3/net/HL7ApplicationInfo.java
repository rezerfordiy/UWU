package org.dcm4che3.net;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class HL7ApplicationInfo implements Serializable {
    private String[] applicationClusters = new String[0];
    private final List<Connection> conns = new ArrayList(1);
    private String description;
    private String deviceName;
    private String hl7ApplicationName;
    private String[] hl7OtherApplicationName;
    private Boolean installed;

    public String[] getApplicationClusters() {
        return this.applicationClusters;
    }

    public List<Connection> getConnections() {
        return this.conns;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getHl7ApplicationName() {
        return this.hl7ApplicationName;
    }

    public String[] getHl7OtherApplicationName() {
        return this.hl7OtherApplicationName;
    }

    public Boolean getInstalled() {
        return this.installed;
    }

    public void setApplicationClusters(String[] strArr) {
        this.applicationClusters = strArr;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setHl7ApplicationName(String str) {
        this.hl7ApplicationName = str;
    }

    public void setHl7OtherApplicationName(String[] strArr) {
        this.hl7OtherApplicationName = strArr;
    }

    public void setInstalled(Boolean bool) {
        this.installed = bool;
    }

    public String toString() {
        return "HL7ApplicationInfo[hl7ApplicationName=" + this.hl7ApplicationName + "]";
    }
}
