package org.dcm4che3.net;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class DeviceInfo implements Serializable {
    private static final long serialVersionUID = 5456917095404357064L;
    private Boolean arcDevExt;
    private String description;
    private String deviceName;
    private Boolean installed;
    private String manufacturer;
    private String manufacturerModelName;
    private String stationName;
    private String[] softwareVersions = new String[0];
    private String[] primaryDeviceTypes = new String[0];
    private String[] institutionNames = new String[0];
    private String[] institutionalDepartmentNames = new String[0];

    public Boolean getArcDevExt() {
        return this.arcDevExt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final Boolean getInstalled() {
        return this.installed;
    }

    public final String[] getInstitutionNames() {
        return this.institutionNames;
    }

    public final String[] getInstitutionalDepartmentNames() {
        return this.institutionalDepartmentNames;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getManufacturerModelName() {
        return this.manufacturerModelName;
    }

    public final String[] getPrimaryDeviceTypes() {
        return this.primaryDeviceTypes;
    }

    public final String[] getSoftwareVersions() {
        return this.softwareVersions;
    }

    public final String getStationName() {
        return this.stationName;
    }

    public void setArcDevExt(Boolean bool) {
        this.arcDevExt = bool;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDeviceName(String str) {
        this.deviceName = str;
    }

    public final void setInstalled(Boolean bool) {
        this.installed = bool;
    }

    public final void setInstitutionNames(String[] strArr) {
        this.institutionNames = strArr;
    }

    public final void setInstitutionalDepartmentNames(String[] strArr) {
        this.institutionalDepartmentNames = strArr;
    }

    public final void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public final void setManufacturerModelName(String str) {
        this.manufacturerModelName = str;
    }

    public final void setPrimaryDeviceTypes(String[] strArr) {
        this.primaryDeviceTypes = strArr;
    }

    public final void setSoftwareVersions(String[] strArr) {
        this.softwareVersions = strArr;
    }

    public final void setStationName(String str) {
        this.stationName = str;
    }

    public String toString() {
        return "DeviceInfo[name=" + this.deviceName + ", installed=" + this.installed + "]";
    }
}
