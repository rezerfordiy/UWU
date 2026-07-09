package org.dcm4che3.net;

import java.io.IOException;
import org.dcm4che3.net.pdu.AAbort;
import org.dcm4che3.net.pdu.AAssociateAC;
import org.dcm4che3.net.pdu.AAssociateRJ;
import org.dcm4che3.net.pdu.AAssociateRQ;

/* JADX INFO: loaded from: classes.dex */
public enum State {
    Sta1("Sta1 - Idle") { // from class: org.dcm4che3.net.State.1
        @Override // org.dcm4che3.net.State
        public void closeSocket(Association association) {
        }

        @Override // org.dcm4che3.net.State
        public void closeSocketDelayed(Association association) {
        }

        @Override // org.dcm4che3.net.State
        public void write(Association association, AAbort aAbort) {
        }
    },
    Sta2("Sta2 - Transport connection open") { // from class: org.dcm4che3.net.State.2
        @Override // org.dcm4che3.net.State
        public void onAAssociateRQ(Association association, AAssociateRQ aAssociateRQ) throws IOException {
            association.handle(aAssociateRQ);
        }
    },
    Sta3("Sta3 - Awaiting local A-ASSOCIATE response primitive"),
    Sta4("Sta4 - Awaiting transport connection opening to complete"),
    Sta5("Sta5 - Awaiting A-ASSOCIATE-AC or A-ASSOCIATE-RJ PDU") { // from class: org.dcm4che3.net.State.3
        @Override // org.dcm4che3.net.State
        public void onAAssociateAC(Association association, AAssociateAC aAssociateAC) throws IOException {
            association.handle(aAssociateAC);
        }

        @Override // org.dcm4che3.net.State
        public void onAAssociateRJ(Association association, AAssociateRJ aAssociateRJ) throws IOException {
            association.handle(aAssociateRJ);
        }
    },
    Sta6("Sta6 - Association established and ready for data transfer") { // from class: org.dcm4che3.net.State.4
        @Override // org.dcm4che3.net.State
        public void onAReleaseRQ(Association association) throws IOException {
            association.handleAReleaseRQ();
        }

        @Override // org.dcm4che3.net.State
        public void onPDataTF(Association association) throws IOException {
            association.handlePDataTF();
        }

        @Override // org.dcm4che3.net.State
        public void writeAReleaseRQ(Association association) throws IOException {
            association.writeAReleaseRQ();
        }

        @Override // org.dcm4che3.net.State
        public void writePDataTF(Association association) throws IOException {
            association.doWritePDataTF();
        }
    },
    Sta7("Sta7 - Awaiting A-RELEASE-RP PDU") { // from class: org.dcm4che3.net.State.5
        @Override // org.dcm4che3.net.State
        public void onAReleaseRP(Association association) throws IOException {
            association.handleAReleaseRP();
        }

        @Override // org.dcm4che3.net.State
        public void onAReleaseRQ(Association association) throws IOException {
            association.handleAReleaseRQCollision();
        }

        @Override // org.dcm4che3.net.State
        public void onPDataTF(Association association) throws IOException {
            association.handlePDataTF();
        }
    },
    Sta8("Sta8 - Awaiting local A-RELEASE response primitive") { // from class: org.dcm4che3.net.State.6
        @Override // org.dcm4che3.net.State
        public void writePDataTF(Association association) throws IOException {
            association.doWritePDataTF();
        }
    },
    Sta9("Sta9 - Release collision requestor side; awaiting A-RELEASE response"),
    Sta10("Sta10 - Release collision acceptor side; awaiting A-RELEASE-RP PDU") { // from class: org.dcm4che3.net.State.7
        @Override // org.dcm4che3.net.State
        public void onAReleaseRP(Association association) throws IOException {
            association.handleAReleaseRPCollision();
        }
    },
    Sta11("Sta11 - Release collision requestor side; awaiting A-RELEASE-RP PDU") { // from class: org.dcm4che3.net.State.8
        @Override // org.dcm4che3.net.State
        public void onAReleaseRP(Association association) throws IOException {
            association.handleAReleaseRP();
        }
    },
    Sta12("Sta12 - Release collision acceptor side; awaiting A-RELEASE response primitive"),
    Sta13("Sta13 - Awaiting Transport Connection Close Indication") { // from class: org.dcm4che3.net.State.9
        @Override // org.dcm4che3.net.State
        public void closeSocketDelayed(Association association) {
        }

        @Override // org.dcm4che3.net.State
        public void onAReleaseRP(Association association) throws IOException {
        }

        @Override // org.dcm4che3.net.State
        public void onAReleaseRQ(Association association) throws IOException {
        }

        @Override // org.dcm4che3.net.State
        public void onPDataTF(Association association) throws IOException {
        }

        @Override // org.dcm4che3.net.State
        public void write(Association association, AAbort aAbort) {
        }
    };

    private String name;

    State(String str) {
        this.name = str;
    }

    public void closeSocket(Association association) {
        association.doCloseSocket();
    }

    public void closeSocketDelayed(Association association) {
        association.doCloseSocketDelayed();
    }

    public void onAAssociateAC(Association association, AAssociateAC aAssociateAC) throws IOException {
        association.unexpectedPDU("A-ASSOCIATE-AC");
    }

    public void onAAssociateRJ(Association association, AAssociateRJ aAssociateRJ) throws IOException {
        association.unexpectedPDU("A-ASSOCIATE-RJ");
    }

    public void onAAssociateRQ(Association association, AAssociateRQ aAssociateRQ) throws IOException {
        association.unexpectedPDU("A-ASSOCIATE-RQ");
    }

    public void onAReleaseRP(Association association) throws IOException {
        association.unexpectedPDU("A-RELEASE-RP");
    }

    public void onAReleaseRQ(Association association) throws IOException {
        association.unexpectedPDU("A-RELEASE-RQ");
    }

    public void onPDataTF(Association association) throws IOException {
        association.unexpectedPDU("P-DATA-TF");
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public void write(Association association, AAbort aAbort) throws IOException {
        association.write(aAbort);
    }

    public void writeAReleaseRQ(Association association) throws IOException {
        throw new AssociationStateException(this);
    }

    public void writePDataTF(Association association) throws IOException {
        throw new AssociationStateException(this);
    }
}
