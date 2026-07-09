package org.dcm4che3.data;

/* JADX INFO: loaded from: classes.dex */
public class StandardElementDictionary extends ElementDictionary {
    public static final ElementDictionary INSTANCE = new StandardElementDictionary();

    private StandardElementDictionary() {
        super(null, Tag.class);
    }

    @Override // org.dcm4che3.data.ElementDictionary
    public int daTagOf(int i4) {
        switch (i4) {
            case Tag.InstanceCreationTime /* 524307 */:
                return Tag.InstanceCreationDate;
            case Tag.PatientBirthTime /* 1048626 */:
                return Tag.PatientBirthDate;
            case Tag.TimeOfSecondaryCapture /* 1576980 */:
                return Tag.DateOfSecondaryCapture;
            case Tag.TimeOfLastCalibration /* 1577473 */:
                return Tag.DateOfLastCalibration;
            case Tag.TimeOfLastDetectorCalibration /* 1601550 */:
                return Tag.DateOfLastDetectorCalibration;
            case Tag.ModifiedImageTime /* 2110469 */:
                return Tag.ModifiedImageDate;
            case Tag.StudyVerifiedTime /* 3276851 */:
                return Tag.StudyVerifiedDate;
            case Tag.StudyReadTime /* 3276853 */:
                return Tag.StudyReadDate;
            case Tag.ScheduledStudyStartTime /* 3280897 */:
                return Tag.ScheduledStudyStartDate;
            case Tag.ScheduledStudyStopTime /* 3280913 */:
                return Tag.ScheduledStudyStopDate;
            case Tag.StudyArrivalTime /* 3280961 */:
                return Tag.StudyArrivalDate;
            case Tag.StudyCompletionTime /* 3280977 */:
                return Tag.StudyCompletionDate;
            case Tag.ScheduledAdmissionTime /* 3670043 */:
                return Tag.ScheduledAdmissionDate;
            case Tag.ScheduledDischargeTime /* 3670045 */:
                return Tag.ScheduledDischargeDate;
            case Tag.AdmittingTime /* 3670049 */:
                return Tag.AdmittingDate;
            case Tag.DischargeTime /* 3670066 */:
                return Tag.DischargeDate;
            case Tag.ScheduledProcedureStepStartTime /* 4194307 */:
                return Tag.ScheduledProcedureStepStartDate;
            case Tag.ScheduledProcedureStepEndTime /* 4194309 */:
                return Tag.ScheduledProcedureStepEndDate;
            case Tag.PerformedProcedureStepStartTime /* 4194885 */:
                return Tag.PerformedProcedureStepStartDate;
            case Tag.PerformedProcedureStepEndTime /* 4194897 */:
                return Tag.PerformedProcedureStepEndDate;
            case Tag.IssueTimeOfImagingServiceRequest /* 4202501 */:
                return Tag.IssueDateOfImagingServiceRequest;
            case Tag.Time /* 4235554 */:
                return Tag.Date;
            case Tag.PresentationCreationTime /* 7340163 */:
                return Tag.PresentationCreationDate;
            case Tag.CreationTime /* 553648208 */:
                return Tag.CreationDate;
            case Tag.StructureSetTime /* 805699593 */:
                return Tag.StructureSetDate;
            case Tag.TreatmentControlPointTime /* 805830693 */:
                return Tag.TreatmentControlPointDate;
            case Tag.SafePositionExitTime /* 805831012 */:
                return Tag.SafePositionExitDate;
            case Tag.SafePositionReturnTime /* 805831016 */:
                return Tag.SafePositionReturnDate;
            case Tag.TreatmentTime /* 805831249 */:
                return Tag.TreatmentDate;
            case Tag.RTPlanTime /* 805961735 */:
                return Tag.RTPlanDate;
            case Tag.SourceStrengthReferenceTime /* 805962286 */:
                return Tag.SourceStrengthReferenceDate;
            case Tag.ReviewTime /* 806223877 */:
                return Tag.ReviewDate;
            case Tag.InterpretationRecordedTime /* 1074266369 */:
                return Tag.InterpretationRecordedDate;
            case Tag.InterpretationTranscriptionTime /* 1074266377 */:
                return Tag.InterpretationTranscriptionDate;
            case Tag.InterpretationApprovalTime /* 1074266387 */:
                return Tag.InterpretationApprovalDate;
            default:
                switch (i4) {
                    case Tag.StudyTime /* 524336 */:
                        return Tag.StudyDate;
                    case Tag.SeriesTime /* 524337 */:
                        return Tag.SeriesDate;
                    case Tag.AcquisitionTime /* 524338 */:
                        return Tag.AcquisitionDate;
                    case Tag.ContentTime /* 524339 */:
                        return Tag.ContentDate;
                    case Tag.OverlayTime /* 524340 */:
                        return Tag.OverlayDate;
                    case Tag.CurveTime /* 524341 */:
                        return Tag.CurveDate;
                    default:
                        return 0;
                }
        }
    }

    @Override // org.dcm4che3.data.ElementDictionary
    public String keywordOf(int i4) {
        return Keyword.valueOf(i4);
    }

    @Override // org.dcm4che3.data.ElementDictionary
    public int tmTagOf(int i4) {
        switch (i4) {
            case Tag.InstanceCreationDate /* 524306 */:
                return Tag.InstanceCreationTime;
            case Tag.PatientBirthDate /* 1048624 */:
                return Tag.PatientBirthTime;
            case Tag.DateOfSecondaryCapture /* 1576978 */:
                return Tag.TimeOfSecondaryCapture;
            case Tag.DateOfLastCalibration /* 1577472 */:
                return Tag.TimeOfLastCalibration;
            case Tag.DateOfLastDetectorCalibration /* 1601548 */:
                return Tag.TimeOfLastDetectorCalibration;
            case Tag.ModifiedImageDate /* 2110467 */:
                return Tag.ModifiedImageTime;
            case Tag.StudyVerifiedDate /* 3276850 */:
                return Tag.StudyVerifiedTime;
            case Tag.StudyReadDate /* 3276852 */:
                return Tag.StudyReadTime;
            case Tag.ScheduledStudyStartDate /* 3280896 */:
                return Tag.ScheduledStudyStartTime;
            case Tag.ScheduledStudyStopDate /* 3280912 */:
                return Tag.ScheduledStudyStopTime;
            case Tag.StudyArrivalDate /* 3280960 */:
                return Tag.StudyArrivalTime;
            case Tag.StudyCompletionDate /* 3280976 */:
                return Tag.StudyCompletionTime;
            case Tag.ScheduledAdmissionDate /* 3670042 */:
                return Tag.ScheduledAdmissionTime;
            case Tag.ScheduledDischargeDate /* 3670044 */:
                return Tag.ScheduledDischargeTime;
            case Tag.AdmittingDate /* 3670048 */:
                return Tag.AdmittingTime;
            case Tag.DischargeDate /* 3670064 */:
                return Tag.DischargeTime;
            case Tag.ScheduledProcedureStepStartDate /* 4194306 */:
                return Tag.ScheduledProcedureStepStartTime;
            case Tag.ScheduledProcedureStepEndDate /* 4194308 */:
                return Tag.ScheduledProcedureStepEndTime;
            case Tag.PerformedProcedureStepStartDate /* 4194884 */:
                return Tag.PerformedProcedureStepStartTime;
            case Tag.PerformedProcedureStepEndDate /* 4194896 */:
                return Tag.PerformedProcedureStepEndTime;
            case Tag.IssueDateOfImagingServiceRequest /* 4202500 */:
                return Tag.IssueTimeOfImagingServiceRequest;
            case Tag.Date /* 4235553 */:
                return Tag.Time;
            case Tag.PresentationCreationDate /* 7340162 */:
                return Tag.PresentationCreationTime;
            case Tag.CreationDate /* 553648192 */:
                return Tag.CreationTime;
            case Tag.StructureSetDate /* 805699592 */:
                return Tag.StructureSetTime;
            case Tag.TreatmentControlPointDate /* 805830692 */:
                return Tag.TreatmentControlPointTime;
            case Tag.SafePositionExitDate /* 805831010 */:
                return Tag.SafePositionExitTime;
            case Tag.SafePositionReturnDate /* 805831014 */:
                return Tag.SafePositionReturnTime;
            case Tag.TreatmentDate /* 805831248 */:
                return Tag.TreatmentTime;
            case Tag.RTPlanDate /* 805961734 */:
                return Tag.RTPlanTime;
            case Tag.SourceStrengthReferenceDate /* 805962284 */:
                return Tag.SourceStrengthReferenceTime;
            case Tag.ReviewDate /* 806223876 */:
                return Tag.ReviewTime;
            case Tag.InterpretationRecordedDate /* 1074266368 */:
                return Tag.InterpretationRecordedTime;
            case Tag.InterpretationTranscriptionDate /* 1074266376 */:
                return Tag.InterpretationTranscriptionTime;
            case Tag.InterpretationApprovalDate /* 1074266386 */:
                return Tag.InterpretationApprovalTime;
            default:
                switch (i4) {
                    case Tag.StudyDate /* 524320 */:
                        return Tag.StudyTime;
                    case Tag.SeriesDate /* 524321 */:
                        return Tag.SeriesTime;
                    case Tag.AcquisitionDate /* 524322 */:
                        return Tag.AcquisitionTime;
                    case Tag.ContentDate /* 524323 */:
                        return Tag.ContentTime;
                    case Tag.OverlayDate /* 524324 */:
                        return Tag.OverlayTime;
                    case Tag.CurveDate /* 524325 */:
                        return Tag.CurveTime;
                    default:
                        return 0;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a7  */
    @Override // org.dcm4che3.data.ElementDictionary
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.dcm4che3.data.VR vrOf(int r3) {
        /*
            Method dump skipped, instruction units count: 17440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dcm4che3.data.StandardElementDictionary.vrOf(int):org.dcm4che3.data.VR");
    }
}
