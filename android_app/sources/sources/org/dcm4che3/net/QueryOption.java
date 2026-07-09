package org.dcm4che3.net;

import java.util.EnumSet;
import java.util.Iterator;
import org.dcm4che3.net.pdu.ExtendedNegotiation;

/* JADX INFO: loaded from: classes.dex */
public enum QueryOption {
    RELATIONAL,
    DATETIME,
    FUZZY,
    TIMEZONE;

    public static byte[] toExtendedNegotiationInformation(EnumSet<QueryOption> enumSet) {
        byte[] bArr = new byte[enumSet.contains(TIMEZONE) ? 4 : (enumSet.contains(FUZZY) || enumSet.contains(DATETIME)) ? 3 : 1];
        Iterator<QueryOption> it = enumSet.iterator();
        while (it.hasNext()) {
            bArr[it.next().ordinal()] = 1;
        }
        return bArr;
    }

    private static void toOption(ExtendedNegotiation extendedNegotiation, QueryOption queryOption, EnumSet<QueryOption> enumSet) {
        if (extendedNegotiation.getField(queryOption.ordinal(), (byte) 0) == 1) {
            enumSet.add(queryOption);
        }
    }

    public static EnumSet<QueryOption> toOptions(ExtendedNegotiation extendedNegotiation) {
        EnumSet<QueryOption> enumSetNoneOf = EnumSet.noneOf(QueryOption.class);
        if (extendedNegotiation != null) {
            toOption(extendedNegotiation, RELATIONAL, enumSetNoneOf);
            toOption(extendedNegotiation, DATETIME, enumSetNoneOf);
            toOption(extendedNegotiation, FUZZY, enumSetNoneOf);
            toOption(extendedNegotiation, TIMEZONE, enumSetNoneOf);
        }
        return enumSetNoneOf;
    }
}
