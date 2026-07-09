package org.dcm4che3.net;

import org.dcm4che3.net.pdu.AAssociateRJ;
import org.dcm4che3.net.pdu.UserIdentityAC;
import org.dcm4che3.net.pdu.UserIdentityRQ;

/* JADX INFO: loaded from: classes.dex */
public interface UserIdentityNegotiator {
    UserIdentityAC negotiate(Association association, UserIdentityRQ userIdentityRQ) throws AAssociateRJ;
}
