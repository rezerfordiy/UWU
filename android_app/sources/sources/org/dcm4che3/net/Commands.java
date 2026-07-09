package org.dcm4che3.net;

import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.Tag;
import org.dcm4che3.data.VR;
import org.dcm4che3.util.UIDUtils;

/* JADX INFO: loaded from: classes.dex */
public class Commands {
    public static final int NO_DATASET = 257;
    private static int withDatasetType;

    public static int getWithDatasetType() {
        return withDatasetType;
    }

    public static boolean hasDataset(Attributes attributes) {
        return attributes.getInt(2048, 0) != 257;
    }

    public static void incNumberOfSuboperations(int i4, Attributes attributes) {
        synchronized (attributes) {
            VR vr = VR.US;
            attributes.setInt(i4, vr, attributes.getInt(i4, 0) + 1);
            attributes.setInt(Tag.NumberOfRemainingSuboperations, vr, attributes.getInt(Tag.NumberOfRemainingSuboperations, 1) - 1);
        }
    }

    public static void initNumberOfSuboperations(Attributes attributes, int i4) {
        VR vr = VR.US;
        attributes.setInt(Tag.NumberOfRemainingSuboperations, vr, i4);
        attributes.setInt(Tag.NumberOfCompletedSuboperations, vr, 0);
        attributes.setInt(Tag.NumberOfFailedSuboperations, vr, 0);
        attributes.setInt(Tag.NumberOfWarningSuboperations, vr, 0);
    }

    public static Attributes mkCCancelRQ(int i4) {
        Attributes attributes = new Attributes();
        VR vr = VR.US;
        attributes.setInt(256, vr, Dimse.C_CANCEL_RQ.commandField());
        attributes.setInt(2048, vr, 257);
        attributes.setInt(288, vr, i4);
        return attributes;
    }

    public static Attributes mkCEchoRQ(int i4, String str) {
        Attributes attributesMkRQ = mkRQ(i4, 48, 257);
        attributesMkRQ.setString(2, VR.UI, str);
        return attributesMkRQ;
    }

    public static Attributes mkCFindRQ(int i4, String str, int i5) {
        Attributes attributesMkRQ = mkRQ(i4, 32, withDatasetType);
        attributesMkRQ.setString(2, VR.UI, str);
        attributesMkRQ.setInt(1792, VR.US, i5);
        return attributesMkRQ;
    }

    public static Attributes mkCFindRSP(Attributes attributes, int i4) {
        return mkRSP(attributes, i4, Dimse.C_FIND_RQ);
    }

    public static Attributes mkCGetRQ(int i4, String str, int i5) {
        Attributes attributesMkRQ = mkRQ(i4, 16, withDatasetType);
        attributesMkRQ.setString(2, VR.UI, str);
        attributesMkRQ.setInt(1792, VR.US, i5);
        return attributesMkRQ;
    }

    public static Attributes mkCGetRSP(Attributes attributes, int i4) {
        return mkRSP(attributes, i4, Dimse.C_GET_RQ);
    }

    public static Attributes mkCMoveRQ(int i4, String str, int i5, String str2) {
        Attributes attributesMkRQ = mkRQ(i4, 33, withDatasetType);
        attributesMkRQ.setString(2, VR.UI, str);
        attributesMkRQ.setInt(1792, VR.US, i5);
        attributesMkRQ.setString(Tag.MoveDestination, VR.AE, str2);
        return attributesMkRQ;
    }

    public static Attributes mkCMoveRSP(Attributes attributes, int i4) {
        return mkRSP(attributes, i4, Dimse.C_MOVE_RQ);
    }

    public static Attributes mkCStoreRQ(int i4, String str, String str2, int i5) {
        Attributes attributesMkRQ = mkRQ(i4, 1, withDatasetType);
        VR vr = VR.UI;
        attributesMkRQ.setString(2, vr, str);
        attributesMkRQ.setString(4096, vr, str2);
        attributesMkRQ.setInt(1792, VR.US, i5);
        return attributesMkRQ;
    }

    public static Attributes mkCStoreRSP(Attributes attributes, int i4) {
        return mkRSP(attributes, i4, Dimse.C_STORE_RQ);
    }

    public static Attributes mkEchoRSP(Attributes attributes, int i4) {
        return mkRSP(attributes, i4, Dimse.C_ECHO_RQ);
    }

    public static Attributes mkNActionRQ(int i4, String str, String str2, int i5, Attributes attributes) {
        Attributes attributesMkRQ = mkRQ(i4, 304, attributes == null ? 257 : withDatasetType);
        VR vr = VR.UI;
        attributesMkRQ.setString(3, vr, str);
        attributesMkRQ.setString(4097, vr, str2);
        attributesMkRQ.setInt(Tag.ActionTypeID, VR.US, i5);
        return attributesMkRQ;
    }

    public static Attributes mkNActionRSP(Attributes attributes, int i4) {
        return mkRSP(attributes, i4, Dimse.N_ACTION_RQ);
    }

    public static Attributes mkNCreateRQ(int i4, String str, String str2) {
        Attributes attributesMkRQ = mkRQ(i4, 320, withDatasetType);
        VR vr = VR.UI;
        attributesMkRQ.setString(2, vr, str);
        if (str2 != null) {
            attributesMkRQ.setString(4096, vr, str2);
        }
        return attributesMkRQ;
    }

    public static Attributes mkNCreateRSP(Attributes attributes, int i4) {
        if (attributes.getString(4096) == null) {
            attributes.setString(4096, VR.UI, UIDUtils.createUID());
        }
        return mkRSP(attributes, i4, Dimse.N_CREATE_RQ);
    }

    public static Attributes mkNDeleteRQ(int i4, String str, String str2) {
        Attributes attributesMkRQ = mkRQ(i4, 336, 257);
        VR vr = VR.UI;
        attributesMkRQ.setString(3, vr, str);
        attributesMkRQ.setString(4097, vr, str2);
        return attributesMkRQ;
    }

    public static Attributes mkNDeleteRSP(Attributes attributes, int i4) {
        return mkRSP(attributes, i4, Dimse.N_DELETE_RQ);
    }

    public static Attributes mkNEventReportRQ(int i4, String str, String str2, int i5, Attributes attributes) {
        Attributes attributesMkRQ = mkRQ(i4, 256, attributes == null ? 257 : withDatasetType);
        VR vr = VR.UI;
        attributesMkRQ.setString(2, vr, str);
        attributesMkRQ.setString(4096, vr, str2);
        attributesMkRQ.setInt(4098, VR.US, i5);
        return attributesMkRQ;
    }

    public static Attributes mkNEventReportRSP(Attributes attributes, int i4) {
        return mkRSP(attributes, i4, Dimse.N_EVENT_REPORT_RQ);
    }

    public static Attributes mkNGetRQ(int i4, String str, String str2, int[] iArr) {
        Attributes attributesMkRQ = mkRQ(i4, 272, 257);
        VR vr = VR.UI;
        attributesMkRQ.setString(3, vr, str);
        attributesMkRQ.setString(4097, vr, str2);
        if (iArr != null) {
            attributesMkRQ.setInt(Tag.AttributeIdentifierList, VR.AT, iArr);
        }
        return attributesMkRQ;
    }

    public static Attributes mkNGetRSP(Attributes attributes, int i4) {
        return mkRSP(attributes, i4, Dimse.N_GET_RQ);
    }

    public static Attributes mkNSetRQ(int i4, String str, String str2) {
        Attributes attributesMkRQ = mkRQ(i4, 288, withDatasetType);
        VR vr = VR.UI;
        attributesMkRQ.setString(3, vr, str);
        attributesMkRQ.setString(4097, vr, str2);
        return attributesMkRQ;
    }

    public static Attributes mkNSetRSP(Attributes attributes, int i4) {
        return mkRSP(attributes, i4, Dimse.N_SET_RQ);
    }

    private static Attributes mkRQ(int i4, int i5, int i6) {
        Attributes attributes = new Attributes();
        VR vr = VR.US;
        attributes.setInt(272, vr, i4);
        attributes.setInt(256, vr, i5);
        attributes.setInt(2048, vr, i6);
        return attributes;
    }

    public static Attributes mkRSP(Attributes attributes, int i4, Dimse dimse) {
        Attributes attributes2 = new Attributes();
        VR vr = VR.US;
        attributes2.setInt(256, vr, dimse.commandFieldOfRSP());
        attributes2.setInt(Tag.Status, vr, i4);
        attributes2.setInt(288, vr, attributes.getInt(272, 0));
        VR vr2 = VR.UI;
        attributes2.setString(2, vr2, attributes.getString(dimse.tagOfSOPClassUID()));
        int iTagOfSOPInstanceUID = dimse.tagOfSOPInstanceUID();
        if (iTagOfSOPInstanceUID != 0) {
            attributes2.setString(4096, vr2, attributes.getString(iTagOfSOPInstanceUID));
        }
        return attributes2;
    }

    public static void setWithDatasetType(int i4) {
        if (i4 != 257 && ((-65536) & i4) == 0) {
            withDatasetType = i4;
            return;
        }
        throw new IllegalArgumentException("withDatasetType: " + Integer.toHexString(i4) + "H");
    }

    public static Attributes mkCStoreRQ(int i4, String str, String str2, int i5, String str3, int i6) {
        Attributes attributesMkCStoreRQ = mkCStoreRQ(i4, str, str2, i5);
        attributesMkCStoreRQ.setString(Tag.MoveOriginatorApplicationEntityTitle, VR.AE, str3);
        attributesMkCStoreRQ.setInt(Tag.MoveOriginatorMessageID, VR.US, i6);
        return attributesMkCStoreRQ;
    }
}
