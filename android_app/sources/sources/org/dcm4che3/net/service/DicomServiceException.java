package org.dcm4che3.net.service;

import java.io.IOException;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.Tag;
import org.dcm4che3.data.VR;
import org.dcm4che3.data.ValidationResult;
import org.dcm4che3.net.Status;
import org.dcm4che3.util.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class DicomServiceException extends IOException {
    private static final long serialVersionUID = -8680017798403768406L;
    private Attributes data;
    private final Attributes rsp;

    public DicomServiceException(int i4) {
        this.rsp = new Attributes();
        setStatus(i4);
    }

    public static Throwable initialCauseOf(Throwable th) {
        if (th == null) {
            return null;
        }
        while (true) {
            Throwable cause = th.getCause();
            if (cause == null) {
                return th;
            }
            th = cause;
        }
    }

    private void setStatus(int i4) {
        this.rsp.setInt(Tag.Status, VR.US, i4);
    }

    public static DicomServiceException valueOf(ValidationResult validationResult, Attributes attributes) {
        if (validationResult.hasNotAllowedAttributes()) {
            return new DicomServiceException(Status.NoSuchAttribute).setAttributeIdentifierList(validationResult.tagsOfNotAllowedAttributes());
        }
        if (validationResult.hasMissingAttributes()) {
            return new DicomServiceException(288).setAttributeIdentifierList(validationResult.tagsOfMissingAttributes());
        }
        if (validationResult.hasMissingAttributeValues()) {
            return new DicomServiceException(Status.MissingAttributeValue).setDataset(new Attributes(attributes, validationResult.tagsOfMissingAttributeValues()));
        }
        if (validationResult.hasInvalidAttributeValues()) {
            return new DicomServiceException(Status.InvalidAttributeValue).setDataset(new Attributes(attributes, validationResult.tagsOfInvalidAttributeValues()));
        }
        return null;
    }

    public final Attributes getDataset() {
        return this.data;
    }

    public int getStatus() {
        return this.rsp.getInt(Tag.Status, 0);
    }

    public Attributes mkRSP(int i4, int i5) {
        Attributes attributes = this.rsp;
        VR vr = VR.US;
        attributes.setInt(256, vr, i4);
        this.rsp.setInt(288, vr, i5);
        return this.rsp;
    }

    public DicomServiceException setActionTypeID(int i4) {
        this.rsp.setInt(Tag.ActionTypeID, VR.US, i4);
        return this;
    }

    public DicomServiceException setAttributeIdentifierList(int... iArr) {
        this.rsp.setInt(Tag.AttributeIdentifierList, VR.AT, iArr);
        return this;
    }

    public final DicomServiceException setDataset(Attributes attributes) {
        this.data = attributes;
        return this;
    }

    public DicomServiceException setErrorComment(String str) {
        if (str != null) {
            this.rsp.setString(Tag.ErrorComment, VR.LO, StringUtils.truncate(str, 64));
        }
        return this;
    }

    public DicomServiceException setErrorID(int i4) {
        this.rsp.setInt(Tag.ErrorID, VR.US, i4);
        return this;
    }

    public DicomServiceException setEventTypeID(int i4) {
        this.rsp.setInt(4098, VR.US, i4);
        return this;
    }

    public DicomServiceException setOffendingElements(int... iArr) {
        this.rsp.setInt(Tag.OffendingElement, VR.AT, iArr);
        return this;
    }

    public DicomServiceException setUID(int i4, String str) {
        this.rsp.setString(i4, VR.UI, str);
        return this;
    }

    public DicomServiceException(int i4, String str) {
        super(str);
        this.rsp = new Attributes();
        setStatus(i4);
        setErrorComment(getMessage());
    }

    public DicomServiceException(int i4, Throwable th) {
        super(th);
        this.rsp = new Attributes();
        setStatus(i4);
        setErrorComment(getMessage());
    }
}
