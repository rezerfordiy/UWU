package org.dcm4che3.net;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ApplicationEntityInfo implements Serializable {
    private String aet;
    private Boolean associationAcceptor;
    private Boolean associationInitiator;
    private String description;
    private String deviceName;
    private String hl7ApplicationName;
    private Boolean installed;
    private String[] otherAETitle;
    private String[] applicationCluster = new String[0];
    private final List<Connection> conns = new ArrayList(1);

    public String getAETitle() {
        return this.aet;
    }

    public String[] getApplicationCluster() {
        return this.applicationCluster;
    }

    public Boolean getAssociationAcceptor() {
        return this.associationAcceptor;
    }

    public Boolean getAssociationInitiator() {
        return this.associationInitiator;
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

    public Boolean getInstalled() {
        return this.installed;
    }

    public String[] getOtherAETitle() {
        return this.otherAETitle;
    }

    public void setAETitle(String str) {
        this.aet = str;
    }

    public void setApplicationCluster(String[] strArr) {
        this.applicationCluster = strArr;
    }

    public void setAssociationAcceptor(Boolean bool) {
        this.associationAcceptor = bool;
    }

    public void setAssociationInitiator(Boolean bool) {
        this.associationInitiator = bool;
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

    public void setInstalled(Boolean bool) {
        this.installed = bool;
    }

    public void setOtherAETitle(String[] strArr) {
        this.otherAETitle = strArr;
    }

    public String toString() {
        return "ApplicationEntityInfo[dicomAETitle=" + this.aet + "]";
    }
}
