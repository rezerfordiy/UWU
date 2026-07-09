package org.dcm4che3.io;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import org.dcm4che3.data.Attributes;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes.dex */
public abstract class SAXTransformer {
    private static SAXTransformerFactory factory = (SAXTransformerFactory) TransformerFactory.newInstance();

    public interface SetupTransformer {
        void setup(Transformer transformer);
    }

    public static SAXWriter getSAXWriter(Result result) throws TransformerConfigurationException {
        return getSAXWriter(result, (SetupTransformer) null);
    }

    public static Templates newTemplates(Source source) throws TransformerConfigurationException {
        return factory.newTemplates(source);
    }

    public static Attributes transform(Attributes attributes, Templates templates, boolean z3, boolean z4) throws TransformerConfigurationException, SAXException {
        return transform(attributes, templates, z3, z4, null);
    }

    public static SAXWriter getSAXWriter(Result result, SetupTransformer setupTransformer) throws TransformerConfigurationException {
        return getSAXWriter(factory.newTransformerHandler(), result, setupTransformer);
    }

    public static Attributes transform(Attributes attributes, Templates templates, boolean z3, boolean z4, SetupTransformer setupTransformer) throws TransformerConfigurationException, SAXException {
        Attributes attributes2 = new Attributes();
        SAXWriter sAXWriter = getSAXWriter(templates, attributes2, setupTransformer);
        sAXWriter.setIncludeNamespaceDeclaration(z3);
        sAXWriter.setIncludeKeyword(z4);
        sAXWriter.write(attributes);
        return attributes2;
    }

    public static SAXWriter getSAXWriter(Templates templates, Result result) throws TransformerConfigurationException {
        return getSAXWriter(templates, result, (SetupTransformer) null);
    }

    public static SAXWriter getSAXWriter(Templates templates, Result result, SetupTransformer setupTransformer) throws TransformerConfigurationException {
        return getSAXWriter(factory.newTransformerHandler(templates), result, setupTransformer);
    }

    public static SAXWriter getSAXWriter(Templates templates, Attributes attributes) throws TransformerConfigurationException {
        return getSAXWriter(templates, attributes, (SetupTransformer) null);
    }

    public static SAXWriter getSAXWriter(Templates templates, Attributes attributes, SetupTransformer setupTransformer) throws TransformerConfigurationException {
        return getSAXWriter(templates, new SAXResult(new ContentHandlerAdapter(attributes)), setupTransformer);
    }

    private static SAXWriter getSAXWriter(TransformerHandler transformerHandler, Result result, SetupTransformer setupTransformer) {
        transformerHandler.setResult(result);
        if (setupTransformer != null) {
            setupTransformer.setup(transformerHandler.getTransformer());
        }
        return new SAXWriter(transformerHandler);
    }
}
