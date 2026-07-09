package org.dcm4che3.data;

import java.util.Map;
import org.dcm4che3.util.UIDUtils;

/* JADX INFO: loaded from: classes.dex */
public class RemapUIDsAttributesCoercion implements AttributesCoercion {
    private final AttributesCoercion next;
    private final Map<String, String> uidMap;

    public RemapUIDsAttributesCoercion(Map<String, String> map, AttributesCoercion attributesCoercion) {
        this.uidMap = map;
        this.next = attributesCoercion;
    }

    @Override // org.dcm4che3.data.AttributesCoercion
    public void coerce(Attributes attributes, Attributes attributes2) {
        Map<String, String> map = this.uidMap;
        if (map != null && !map.isEmpty()) {
            UIDUtils.remapUIDs(attributes, this.uidMap);
        }
        AttributesCoercion attributesCoercion = this.next;
        if (attributesCoercion != null) {
            attributesCoercion.coerce(attributes, attributes2);
        }
    }
}
