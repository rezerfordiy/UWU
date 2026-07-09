package org.dcm4che3.net.pdu;

/* JADX INFO: loaded from: classes.dex */
public class AAssociateAC extends AAssociateRQAC {
    public StringBuilder promptTo(StringBuilder sb) {
        return promptTo("A-ASSOCIATE-AC[", sb);
    }

    @Override // org.dcm4che3.net.pdu.AAssociateRQAC
    public void setUserIdentityRQ(UserIdentityRQ userIdentityRQ) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return promptTo(new StringBuilder(512)).toString();
    }
}
