package org.dcm4che3.media;

/* JADX INFO: loaded from: classes.dex */
public enum RecordType {
    PATIENT,
    STUDY,
    SERIES,
    IMAGE,
    OVERLAY,
    VOI_LUT,
    CURVE,
    STORED_PRINT,
    RT_DOSE,
    RT_STRUCTURE_SET,
    RT_PLAN,
    RT_TREAT_RECORD,
    PRESENTATION,
    WAVEFORM,
    SR_DOCUMENT,
    KEY_OBJECT_DOC,
    SPECTROSCOPY,
    RAW_DATA,
    REGISTRATION,
    FIDUCIAL,
    HANGING_PROTOCOL,
    ENCAP_DOC,
    HL7_STRUC_DOC,
    VALUE_MAP,
    STEREOMETRIC,
    PALETTE,
    SURFACE,
    MEASUREMENT,
    PLAN,
    PRIVATE;

    public static RecordType forCode(String str) {
        try {
            return valueOf(str.replace(' ', '_'));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(str);
        }
    }

    public String code() {
        return name().replace('_', ' ');
    }
}
