package org.dcm4che3.data;

import org.dcm4che3.data.Attributes;

/* JADX INFO: loaded from: classes.dex */
public class MergeAttributesCoercion implements AttributesCoercion {
    private final Attributes newAttrs;
    private AttributesCoercion next;

    public MergeAttributesCoercion(Attributes attributes, AttributesCoercion attributesCoercion) {
        this.newAttrs = attributes;
        this.next = attributesCoercion;
    }

    @Override // org.dcm4che3.data.AttributesCoercion
    public void coerce(Attributes attributes, Attributes attributes2) {
        Attributes.unifyCharacterSets(attributes, this.newAttrs);
        if (attributes2 != null) {
            attributes.update(Attributes.UpdatePolicy.OVERWRITE, this.newAttrs, attributes2);
        } else {
            attributes.addAll(this.newAttrs);
        }
        AttributesCoercion attributesCoercion = this.next;
        if (attributesCoercion != null) {
            attributesCoercion.coerce(attributes, attributes2);
        }
    }
}
