package org.dcm4che3.net;

import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.Tag;
import org.dcm4che3.util.StringUtils;
import org.dcm4che3.util.TagUtils;
import org.dcm4che3.util.UIDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public enum Dimse {
    C_STORE_RQ(1, 2, 4096, 272, ":C-STORE-RQ[pcid="),
    C_STORE_RSP(32769, 2, 4096, 288, ":C-STORE-RSP[pcid="),
    C_GET_RQ(16, 2, 0, 272, ":C-GET-RQ[pcid="),
    C_GET_RSP(32784, 2, 0, 288, ":C-GET-RSP[pcid="),
    C_FIND_RQ(32, 2, 0, 272, ":C-FIND-RQ[pcid="),
    C_FIND_RSP(32800, 2, 0, 288, ":C-FIND-RSP[pcid="),
    C_MOVE_RQ(33, 2, 0, 272, ":C-MOVE-RQ[pcid="),
    C_MOVE_RSP(32801, 2, 0, 288, ":C-MOVE-RSP[pcid="),
    C_ECHO_RQ(48, 2, 0, 272, ":C-ECHO-RQ[pcid="),
    C_ECHO_RSP(32816, 2, 0, 288, ":C-ECHO-RSP[pcid="),
    N_EVENT_REPORT_RQ(256, 2, 4096, 272, ":N-EVENT-REPORT-RQ[pcid="),
    N_EVENT_REPORT_RSP(33024, 2, 4096, 288, ":N-EVENT-REPORT-RSP[pcid="),
    N_GET_RQ(272, 3, 4097, 272, ":N-GET-RQ[pcid="),
    N_GET_RSP(33040, 2, 4096, 288, ":N-GET-RSP[pcid="),
    N_SET_RQ(288, 3, 4097, 272, ":N-SET-RQ[pcid="),
    N_SET_RSP(33056, 2, 4096, 288, ":N-SET-RSP[pcid="),
    N_ACTION_RQ(304, 3, 4097, 272, ":N-ACTION-RQ[pcid="),
    N_ACTION_RSP(33072, 2, 4096, 288, ":N-ACTION-RSP[pcid="),
    N_CREATE_RQ(320, 2, 4096, 272, ":N-CREATE-RQ[pcid="),
    N_CREATE_RSP(33088, 2, 4096, 288, ":N-CREATE-RSP[pcid="),
    N_DELETE_RQ(336, 3, 4097, 272, ":N-DELETE-RQ[pcid="),
    N_DELETE_RSP(33104, 2, 4096, 288, ":N-DELETE-RSP[pcid="),
    C_CANCEL_RQ(4095, 0, 0, 288, ":C-CANCEL-RQ[pcid=");

    public static final Logger LOG = LoggerFactory.getLogger(Dimse.class);
    private final int commandField;
    private final String prompt;
    private final int tagOfMessageID;
    private final int tagOfSOPClassUID;
    private final int tagOfSOPInstanceUID;

    /* JADX INFO: renamed from: org.dcm4che3.net.Dimse$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$dcm4che3$net$Dimse;

        static {
            int[] iArr = new int[Dimse.values().length];
            $SwitchMap$org$dcm4che3$net$Dimse = iArr;
            try {
                iArr[Dimse.C_STORE_RQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$dcm4che3$net$Dimse[Dimse.C_GET_RQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$dcm4che3$net$Dimse[Dimse.C_FIND_RQ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$dcm4che3$net$Dimse[Dimse.C_MOVE_RQ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$dcm4che3$net$Dimse[Dimse.C_GET_RSP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$dcm4che3$net$Dimse[Dimse.C_MOVE_RSP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$dcm4che3$net$Dimse[Dimse.N_EVENT_REPORT_RQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$dcm4che3$net$Dimse[Dimse.N_EVENT_REPORT_RSP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$dcm4che3$net$Dimse[Dimse.N_ACTION_RQ.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$dcm4che3$net$Dimse[Dimse.N_ACTION_RSP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    Dimse(int i4, int i5, int i6, int i7, String str) {
        this.commandField = i4;
        this.tagOfSOPClassUID = i5;
        this.tagOfSOPInstanceUID = i6;
        this.tagOfMessageID = i7;
        this.prompt = str;
    }

    private static void promptAttributeIdentifierListTo(Attributes attributes, StringBuilder sb) {
        int[] ints = attributes.getInts(Tag.AttributeIdentifierList);
        if (ints == null) {
            return;
        }
        sb.append(StringUtils.LINE_SEPARATOR);
        sb.append("  tags=[");
        if (ints.length > 0) {
            for (int i4 : ints) {
                sb.append(TagUtils.toString(i4));
                sb.append(", ");
            }
            sb.setLength(sb.length() - 2);
        }
        sb.append(']');
    }

    private static void promptIntTo(Attributes attributes, String str, int i4, StringBuilder sb) {
        int i5 = attributes.getInt(i4, 0);
        if (i5 != 0 || attributes.containsValue(i4)) {
            sb.append(str);
            sb.append(i5);
        }
    }

    private static void promptMoveOriginatorTo(Attributes attributes, StringBuilder sb) {
        String string = attributes.getString(Tag.MoveOriginatorApplicationEntityTitle, (String) null);
        if (string != null) {
            sb.append(StringUtils.LINE_SEPARATOR);
            sb.append("  orig=");
            sb.append(string);
            sb.append(" >> ");
            sb.append(attributes.getInt(Tag.MoveOriginatorMessageID, -1));
            sb.append(":C-MOVE-RQ");
        }
    }

    private static void promptNumberOfSubOpsTo(Attributes attributes, StringBuilder sb) {
        promptIntTo(attributes, ", remaining=", Tag.NumberOfRemainingSuboperations, sb);
        promptIntTo(attributes, ", completed=", Tag.NumberOfCompletedSuboperations, sb);
        promptIntTo(attributes, ", failed=", Tag.NumberOfFailedSuboperations, sb);
        promptIntTo(attributes, ", warning=", Tag.NumberOfWarningSuboperations, sb);
    }

    private static void promptStringTo(Attributes attributes, String str, int i4, StringBuilder sb) {
        String string = attributes.getString(i4, (String) null);
        if (string != null) {
            sb.append(str);
            sb.append(string);
        }
    }

    private static void promptUIDTo(String str, String str2, StringBuilder sb) {
        sb.append(StringUtils.LINE_SEPARATOR);
        sb.append(str);
        UIDUtils.promptTo(str2, sb);
    }

    public static Dimse valueOf(int i4) {
        switch (i4) {
            case 1:
                return C_STORE_RQ;
            case 16:
                return C_GET_RQ;
            case 32:
                return C_FIND_RQ;
            case 33:
                return C_MOVE_RQ;
            case 48:
                return C_ECHO_RQ;
            case 256:
                return N_EVENT_REPORT_RQ;
            case 272:
                return N_GET_RQ;
            case 288:
                return N_SET_RQ;
            case 304:
                return N_ACTION_RQ;
            case 320:
                return N_CREATE_RQ;
            case 336:
                return N_DELETE_RQ;
            case 4095:
                return C_CANCEL_RQ;
            case 32769:
                return C_STORE_RSP;
            case 32784:
                return C_GET_RSP;
            case 32800:
                return C_FIND_RSP;
            case 32801:
                return C_MOVE_RSP;
            case 32816:
                return C_ECHO_RSP;
            case 33024:
                return N_EVENT_REPORT_RSP;
            case 33040:
                return N_GET_RSP;
            case 33056:
                return N_SET_RSP;
            case 33072:
                return N_ACTION_RSP;
            case 33088:
                return N_CREATE_RSP;
            case 33104:
                return N_DELETE_RSP;
            default:
                throw new IllegalArgumentException("commandField: " + i4);
        }
    }

    public int commandField() {
        return this.commandField;
    }

    public int commandFieldOfRSP() {
        return this.commandField | 32768;
    }

    public boolean isCService() {
        return (this.commandField & 256) == 0;
    }

    public boolean isRSP() {
        return (this.commandField & 32768) != 0;
    }

    public boolean isRetrieveRQ() {
        return this == C_GET_RQ || this == C_MOVE_RQ;
    }

    public boolean isRetrieveRSP() {
        return this == C_GET_RSP || this == C_MOVE_RSP;
    }

    public int tagOfSOPClassUID() {
        return this.tagOfSOPClassUID;
    }

    public int tagOfSOPInstanceUID() {
        return this.tagOfSOPInstanceUID;
    }

    public String toString(Attributes attributes, int i4, String str) {
        String str2;
        int i5;
        StringBuilder sb = new StringBuilder();
        sb.append(attributes.getInt(this.tagOfMessageID, -1));
        sb.append(this.prompt);
        sb.append(i4);
        switch (AnonymousClass1.$SwitchMap$org$dcm4che3$net$Dimse[ordinal()]) {
            case 1:
                promptIntTo(attributes, ", prior=", 1792, sb);
                promptMoveOriginatorTo(attributes, sb);
                break;
            case 2:
                promptIntTo(attributes, ", prior=", 1792, sb);
                promptAttributeIdentifierListTo(attributes, sb);
                break;
            case 3:
            case 4:
                promptIntTo(attributes, ", prior=", 1792, sb);
                break;
            case 5:
            case 6:
                promptNumberOfSubOpsTo(attributes, sb);
                break;
            case 7:
            case 8:
                str2 = ", eventID=";
                i5 = 4098;
                promptIntTo(attributes, str2, i5, sb);
                break;
            case 9:
            case 10:
                str2 = ", actionID=";
                i5 = Tag.ActionTypeID;
                promptIntTo(attributes, str2, i5, sb);
                break;
        }
        if (isRSP()) {
            sb.append(", status=");
            sb.append(Integer.toHexString(attributes.getInt(Tag.Status, -1)));
            sb.append('H');
            promptIntTo(attributes, ", errorID=", Tag.ErrorID, sb);
            promptStringTo(attributes, ", errorComment=", Tag.ErrorComment, sb);
            promptAttributeIdentifierListTo(attributes, sb);
        }
        promptUIDTo(attributes, "  cuid=", this.tagOfSOPClassUID, sb);
        promptUIDTo(attributes, "  iuid=", this.tagOfSOPInstanceUID, sb);
        promptUIDTo("  tsuid=", str, sb);
        return sb.toString();
    }

    private static void promptUIDTo(Attributes attributes, String str, int i4, StringBuilder sb) {
        String string;
        if (i4 == 0 || (string = attributes.getString(i4, (String) null)) == null) {
            return;
        }
        promptUIDTo(str, string, sb);
    }
}
