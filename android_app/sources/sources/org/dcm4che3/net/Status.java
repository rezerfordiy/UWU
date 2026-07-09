package org.dcm4che3.net;

/* JADX INFO: loaded from: classes.dex */
public class Status {
    public static final int AttributeListError = 263;
    public static final int AttributeValueOutOfRange = 278;
    public static final int Cancel = 65024;
    public static final int CannotUnderstand = 49152;
    public static final int ClassInstanceConflict = 281;
    public static final int CoercionOfDataElements = 45056;
    public static final int DataSetDoesNotMatchSOPClassError = 43264;
    public static final int DataSetDoesNotMatchSOPClassWarning = 45063;
    public static final int DuplicateInvocation = 528;
    public static final int DuplicateSOPinstance = 273;
    public static final int ElementsDiscarded = 45062;
    public static final int IdentifierDoesNotMatchSOPClass = 43264;
    public static final int InvalidArgumentValue = 277;
    public static final int InvalidAttributeValue = 262;
    public static final int InvalidObjectInstance = 279;
    public static final int MissingAttribute = 288;
    public static final int MissingAttributeValue = 289;
    public static final int MistypedArgument = 530;
    public static final int MoveDestinationUnknown = 43009;
    public static final int NoSuchActionType = 291;
    public static final int NoSuchArgument = 276;
    public static final int NoSuchAttribute = 261;
    public static final int NoSuchEventType = 275;
    public static final int NoSuchObjectInstance = 274;
    public static final int NoSuchSOPclass = 280;
    public static final int NotAuthorized = 292;
    public static final int OneOrMoreFailures = 45056;
    public static final int OutOfResources = 42752;
    public static final int Pending = 65280;
    public static final int PendingWarning = 65281;
    public static final int ProcessingFailure = 272;
    public static final int ResourceLimitation = 531;
    public static final int SOPclassNotSupported = 290;
    public static final int Success = 0;
    public static final int UnableToCalculateNumberOfMatches = 42753;
    public static final int UnableToPerformSubOperations = 42754;
    public static final int UnableToProcess = 49152;
    public static final int UnrecognizedOperation = 529;

    public static boolean isPending(int i4) {
        return (i4 & 65280) == 65280;
    }
}
