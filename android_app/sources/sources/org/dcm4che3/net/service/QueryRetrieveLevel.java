package org.dcm4che3.net.service;

import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.IOD;
import org.dcm4che3.data.Tag;
import org.dcm4che3.data.VR;
import org.dcm4che3.data.ValidationResult;

/* JADX INFO: loaded from: classes.dex */
public enum QueryRetrieveLevel {
    PATIENT { // from class: org.dcm4che3.net.service.QueryRetrieveLevel.1
        @Override // org.dcm4che3.net.service.QueryRetrieveLevel
        public IOD queryKeysIOD(QueryRetrieveLevel queryRetrieveLevel, boolean z3) {
            IOD iod = new IOD();
            VR vr = VR.UI;
            IOD.DataElementType dataElementType = IOD.DataElementType.TYPE_0;
            iod.add(new IOD.DataElement(Tag.StudyInstanceUID, vr, dataElementType, -1, -1, 0));
            iod.add(new IOD.DataElement(Tag.SeriesInstanceUID, vr, dataElementType, -1, -1, 0));
            iod.add(new IOD.DataElement(Tag.SOPInstanceUID, vr, dataElementType, -1, -1, 0));
            return iod;
        }

        @Override // org.dcm4che3.net.service.QueryRetrieveLevel
        public IOD retrieveKeysIOD(QueryRetrieveLevel queryRetrieveLevel, boolean z3) {
            IOD iodQueryKeysIOD = queryKeysIOD(queryRetrieveLevel, z3);
            iodQueryKeysIOD.add(new IOD.DataElement(Tag.PatientID, VR.LO, IOD.DataElementType.TYPE_1, 1, 1, 0));
            return iodQueryKeysIOD;
        }
    },
    STUDY { // from class: org.dcm4che3.net.service.QueryRetrieveLevel.2
        @Override // org.dcm4che3.net.service.QueryRetrieveLevel
        public IOD queryKeysIOD(QueryRetrieveLevel queryRetrieveLevel, boolean z3) {
            IOD iod = new IOD();
            iod.add(new IOD.DataElement(Tag.PatientID, VR.LO, (z3 || queryRetrieveLevel != QueryRetrieveLevel.PATIENT) ? IOD.DataElementType.TYPE_3 : IOD.DataElementType.TYPE_1, 1, 1, 0));
            VR vr = VR.UI;
            IOD.DataElementType dataElementType = IOD.DataElementType.TYPE_0;
            iod.add(new IOD.DataElement(Tag.SeriesInstanceUID, vr, dataElementType, -1, -1, 0));
            iod.add(new IOD.DataElement(Tag.SOPInstanceUID, vr, dataElementType, -1, -1, 0));
            return iod;
        }

        @Override // org.dcm4che3.net.service.QueryRetrieveLevel
        public IOD retrieveKeysIOD(QueryRetrieveLevel queryRetrieveLevel, boolean z3) {
            IOD iodQueryKeysIOD = queryKeysIOD(queryRetrieveLevel, z3);
            iodQueryKeysIOD.add(new IOD.DataElement(Tag.StudyInstanceUID, VR.UI, IOD.DataElementType.TYPE_1, -1, -1, 0));
            return iodQueryKeysIOD;
        }
    },
    SERIES { // from class: org.dcm4che3.net.service.QueryRetrieveLevel.3
        @Override // org.dcm4che3.net.service.QueryRetrieveLevel
        public IOD queryKeysIOD(QueryRetrieveLevel queryRetrieveLevel, boolean z3) {
            IOD iod = new IOD();
            iod.add(new IOD.DataElement(Tag.PatientID, VR.LO, (z3 || queryRetrieveLevel != QueryRetrieveLevel.PATIENT) ? IOD.DataElementType.TYPE_3 : IOD.DataElementType.TYPE_1, 1, 1, 0));
            VR vr = VR.UI;
            iod.add(new IOD.DataElement(Tag.StudyInstanceUID, vr, !z3 ? IOD.DataElementType.TYPE_1 : IOD.DataElementType.TYPE_3, 1, 1, 0));
            iod.add(new IOD.DataElement(Tag.SOPInstanceUID, vr, IOD.DataElementType.TYPE_0, -1, -1, 0));
            return iod;
        }

        @Override // org.dcm4che3.net.service.QueryRetrieveLevel
        public IOD retrieveKeysIOD(QueryRetrieveLevel queryRetrieveLevel, boolean z3) {
            IOD iodQueryKeysIOD = queryKeysIOD(queryRetrieveLevel, z3);
            iodQueryKeysIOD.add(new IOD.DataElement(Tag.SeriesInstanceUID, VR.UI, IOD.DataElementType.TYPE_1, -1, -1, 0));
            return iodQueryKeysIOD;
        }
    },
    IMAGE { // from class: org.dcm4che3.net.service.QueryRetrieveLevel.4
        @Override // org.dcm4che3.net.service.QueryRetrieveLevel
        public IOD queryKeysIOD(QueryRetrieveLevel queryRetrieveLevel, boolean z3) {
            IOD iod = new IOD();
            iod.add(new IOD.DataElement(Tag.PatientID, VR.LO, (z3 || queryRetrieveLevel != QueryRetrieveLevel.PATIENT) ? IOD.DataElementType.TYPE_3 : IOD.DataElementType.TYPE_1, 1, 1, 0));
            VR vr = VR.UI;
            iod.add(new IOD.DataElement(Tag.StudyInstanceUID, vr, !z3 ? IOD.DataElementType.TYPE_1 : IOD.DataElementType.TYPE_3, 1, 1, 0));
            iod.add(new IOD.DataElement(Tag.SeriesInstanceUID, vr, !z3 ? IOD.DataElementType.TYPE_1 : IOD.DataElementType.TYPE_3, 1, 1, 0));
            return iod;
        }

        @Override // org.dcm4che3.net.service.QueryRetrieveLevel
        public IOD retrieveKeysIOD(QueryRetrieveLevel queryRetrieveLevel, boolean z3) {
            IOD iodQueryKeysIOD = queryKeysIOD(queryRetrieveLevel, z3);
            iodQueryKeysIOD.add(new IOD.DataElement(Tag.SOPInstanceUID, VR.UI, IOD.DataElementType.TYPE_1, -1, -1, 0));
            return iodQueryKeysIOD;
        }
    },
    FRAME { // from class: org.dcm4che3.net.service.QueryRetrieveLevel.5
        @Override // org.dcm4che3.net.service.QueryRetrieveLevel
        public IOD queryKeysIOD(QueryRetrieveLevel queryRetrieveLevel, boolean z3) {
            throw new UnsupportedOperationException();
        }

        @Override // org.dcm4che3.net.service.QueryRetrieveLevel
        public IOD retrieveKeysIOD(QueryRetrieveLevel queryRetrieveLevel, boolean z3) {
            return QueryRetrieveLevel.IMAGE.retrieveKeysIOD(queryRetrieveLevel, z3);
        }
    };

    private static void check(ValidationResult validationResult) throws DicomServiceException {
        if (!validationResult.isValid()) {
            throw new DicomServiceException(43264, validationResult.getErrorComment()).setOffendingElements(validationResult.getOffendingElements());
        }
    }

    public abstract IOD queryKeysIOD(QueryRetrieveLevel queryRetrieveLevel, boolean z3);

    public abstract IOD retrieveKeysIOD(QueryRetrieveLevel queryRetrieveLevel, boolean z3);

    public void validateQueryKeys(Attributes attributes, QueryRetrieveLevel queryRetrieveLevel, boolean z3) throws DicomServiceException {
        check(attributes.validate(queryKeysIOD(queryRetrieveLevel, z3)));
    }

    public void validateRetrieveKeys(Attributes attributes, QueryRetrieveLevel queryRetrieveLevel, boolean z3) throws DicomServiceException {
        check(attributes.validate(retrieveKeysIOD(queryRetrieveLevel, z3)));
    }

    public static QueryRetrieveLevel valueOf(Attributes attributes, String[] strArr) throws DicomServiceException {
        ValidationResult validationResult = new ValidationResult();
        attributes.validate(new IOD.DataElement(Tag.QueryRetrieveLevel, VR.LO, IOD.DataElementType.TYPE_1, 1, 1, 0).setValues(strArr), validationResult);
        check(validationResult);
        return valueOf(attributes.getString(Tag.QueryRetrieveLevel));
    }
}
