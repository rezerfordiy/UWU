package org.dcm4che3.tool.storescu;

import java.util.HashMap;
import java.util.Properties;
import org.dcm4che3.data.UID;
import org.dcm4che3.net.pdu.CommonExtendedNegotiation;
import org.dcm4che3.util.StringUtils;

/* JADX INFO: loaded from: classes.dex */
class RelatedGeneralSOPClasses {
    private final HashMap<String, CommonExtendedNegotiation> commonExtNegs = new HashMap<>();

    public CommonExtendedNegotiation getCommonExtendedNegotiation(String str) {
        CommonExtendedNegotiation commonExtendedNegotiation = this.commonExtNegs.get(str);
        return commonExtendedNegotiation != null ? commonExtendedNegotiation : new CommonExtendedNegotiation(str, UID.StorageServiceClass, new String[0]);
    }

    public void init(Properties properties) {
        for (String str : properties.stringPropertyNames()) {
            this.commonExtNegs.put(str, new CommonExtendedNegotiation(str, UID.StorageServiceClass, StringUtils.split(properties.getProperty(str), ',')));
        }
    }
}
