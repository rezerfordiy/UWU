package org.dcm4che3.net;

import java.io.Serializable;
import java.util.EnumSet;
import org.dcm4che3.data.UID;
import org.dcm4che3.util.StringUtils;
import org.dcm4che3.util.UIDUtils;
import org.slf4j.Marker;
import s0.a;

/* JADX INFO: loaded from: classes.dex */
public class TransferCapability implements Serializable {
    private static final long serialVersionUID = 6386251434418693778L;
    private ApplicationEntity ae;
    private String commonName;
    private EnumSet<QueryOption> queryOptions;
    private Role role;
    private String sopClass;
    private StorageOptions storageOptions;
    private String[] transferSyntaxes;

    public enum Role {
        SCU,
        SCP
    }

    public TransferCapability() {
        this(null, UID.VerificationSOPClass, Role.SCU, UID.ImplicitVRLittleEndian);
    }

    public boolean containsTransferSyntax(String str) {
        if (Marker.ANY_MARKER.equals(this.transferSyntaxes[0])) {
            return true;
        }
        for (String str2 : this.transferSyntaxes) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public String getCommonName() {
        return this.commonName;
    }

    public EnumSet<QueryOption> getQueryOptions() {
        return this.queryOptions;
    }

    public Role getRole() {
        return this.role;
    }

    public String getSopClass() {
        return this.sopClass;
    }

    public StorageOptions getStorageOptions() {
        return this.storageOptions;
    }

    public String[] getTransferSyntaxes() {
        return this.transferSyntaxes;
    }

    public StringBuilder promptTo(StringBuilder sb, String str) {
        String str2 = str + "  ";
        StringUtils.appendLine(sb, str, "TransferCapability[cn: ", this.commonName);
        StringUtils.appendLine(sb, str2, "role: ", this.role);
        sb.append(str2);
        sb.append("as: ");
        UIDUtils.promptTo(this.sopClass, sb).append(StringUtils.LINE_SEPARATOR);
        for (String str3 : this.transferSyntaxes) {
            sb.append(str2);
            sb.append("ts: ");
            UIDUtils.promptTo(str3, sb).append(StringUtils.LINE_SEPARATOR);
        }
        if (this.queryOptions != null) {
            sb.append(str2);
            sb.append("QueryOptions");
            sb.append(this.queryOptions);
            sb.append(StringUtils.LINE_SEPARATOR);
        }
        if (this.storageOptions != null) {
            sb.append(str2);
            sb.append(this.storageOptions);
            sb.append(StringUtils.LINE_SEPARATOR);
        }
        sb.append(str);
        sb.append(']');
        return sb;
    }

    public void setApplicationEntity(ApplicationEntity applicationEntity) {
        if (applicationEntity == null || this.ae == null) {
            this.ae = applicationEntity;
            return;
        }
        throw new IllegalStateException("already owned by AE " + this.ae.getAETitle());
    }

    public void setCommonName(String str) {
        this.commonName = str;
    }

    public void setQueryOptions(EnumSet<QueryOption> enumSet) {
        this.queryOptions = enumSet;
    }

    public void setRole(Role role) {
        role.getClass();
        Role role2 = this.role;
        if (role2 == role) {
            return;
        }
        ApplicationEntity applicationEntity = this.ae;
        if (applicationEntity != null) {
            applicationEntity.removeTransferCapabilityFor(this.sopClass, role2);
        }
        this.role = role;
        if (applicationEntity != null) {
            applicationEntity.addTransferCapability(this);
        }
    }

    public void setSopClass(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("empty sopClass");
        }
        if (str.equals(this.sopClass)) {
            return;
        }
        ApplicationEntity applicationEntity = this.ae;
        if (applicationEntity != null) {
            applicationEntity.removeTransferCapabilityFor(str, this.role);
        }
        this.sopClass = str;
        if (applicationEntity != null) {
            applicationEntity.addTransferCapability(this);
        }
    }

    public void setStorageOptions(StorageOptions storageOptions) {
        this.storageOptions = storageOptions;
    }

    public void setTransferSyntaxes(String... strArr) {
        if (strArr.length == 0) {
            throw new IllegalArgumentException("missing transferSyntax");
        }
        for (String str : strArr) {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("empty transferSyntax");
            }
        }
        this.transferSyntaxes = strArr;
    }

    public String toString() {
        return promptTo(new StringBuilder(512), a.f11071l).toString();
    }

    public TransferCapability(String str, String str2, Role role, String... strArr) {
        setCommonName(str);
        setSopClass(str2);
        setRole(role);
        setTransferSyntaxes(strArr);
    }
}
