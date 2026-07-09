package org.dcm4che3.io;

import javax.xml.transform.Templates;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.AttributesCoercion;
import org.dcm4che3.io.SAXTransformer;

/* JADX INFO: loaded from: classes.dex */
public class XSLTAttributesCoercion implements AttributesCoercion {
    private boolean includeKeyword;
    private boolean includeNameSpaceDeclaration;
    private AttributesCoercion next;
    private SAXTransformer.SetupTransformer setupTransformer;
    private final Templates templates;

    public XSLTAttributesCoercion(Templates templates, AttributesCoercion attributesCoercion) {
        this.templates = templates;
        this.next = attributesCoercion;
    }

    @Override // org.dcm4che3.data.AttributesCoercion
    public void coerce(Attributes attributes, Attributes attributes2) {
        try {
            Attributes attributesTransform = SAXTransformer.transform(attributes, this.templates, this.includeNameSpaceDeclaration, this.includeKeyword, this.setupTransformer);
            if (attributes2 != null) {
                attributes.update(Attributes.UpdatePolicy.OVERWRITE, attributesTransform, attributes2);
            } else {
                attributes.addAll(attributesTransform);
            }
            AttributesCoercion attributesCoercion = this.next;
            if (attributesCoercion != null) {
                attributesCoercion.coerce(attributes, attributes2);
            }
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }

    public SAXTransformer.SetupTransformer getSetupTransformer() {
        return this.setupTransformer;
    }

    public XSLTAttributesCoercion includeKeyword(boolean z3) {
        setIncludeKeyword(z3);
        return this;
    }

    public XSLTAttributesCoercion includeNameSpaceDeclaration(boolean z3) {
        setIncludeNameSpaceDeclaration(z3);
        return this;
    }

    public boolean isIncludeKeyword() {
        return this.includeKeyword;
    }

    public boolean isIncludeNameSpaceDeclaration() {
        return this.includeNameSpaceDeclaration;
    }

    public void setIncludeKeyword(boolean z3) {
        this.includeKeyword = z3;
    }

    public void setIncludeNameSpaceDeclaration(boolean z3) {
        this.includeNameSpaceDeclaration = z3;
    }

    public void setSetupTransformer(SAXTransformer.SetupTransformer setupTransformer) {
        this.setupTransformer = setupTransformer;
    }

    public XSLTAttributesCoercion setupTransformer(SAXTransformer.SetupTransformer setupTransformer) {
        setSetupTransformer(setupTransformer);
        return this;
    }
}
