package org.dcm4che3.net.pdu;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class AAssociateRQ extends AAssociateRQAC {
    public boolean addPresentationContextFor(String str, String str2) {
        if (containsPresentationContextFor(str, str2)) {
            return false;
        }
        addPresentationContext(new PresentationContext((getNumberOfPresentationContexts() * 2) + 1, str, str2));
        return true;
    }

    public boolean containsPresentationContextFor(String str) {
        Iterator<PresentationContext> it = this.pcs.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().getAbstractSyntax())) {
                return true;
            }
        }
        return false;
    }

    public StringBuilder promptTo(StringBuilder sb) {
        return promptTo("A-ASSOCIATE-RQ[", sb);
    }

    @Override // org.dcm4che3.net.pdu.AAssociateRQAC
    public void setUserIdentityAC(UserIdentityAC userIdentityAC) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return promptTo(new StringBuilder(512)).toString();
    }

    public boolean containsPresentationContextFor(String str, String str2) {
        for (PresentationContext presentationContext : this.pcs) {
            if (str.equals(presentationContext.getAbstractSyntax()) && presentationContext.containsTransferSyntax(str2)) {
                return true;
            }
        }
        return false;
    }
}
