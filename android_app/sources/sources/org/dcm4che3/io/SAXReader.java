package org.dcm4che3.io;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.dcm4che3.data.Attributes;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes.dex */
public class SAXReader {
    public static Attributes parse(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        return parse(inputStream, (Attributes) null);
    }

    public static Attributes parse(InputStream inputStream, Attributes attributes) throws ParserConfigurationException, SAXException, IOException {
        if (attributes == null) {
            attributes = new Attributes();
        }
        SAXParserFactory.newInstance().newSAXParser().parse(inputStream, new ContentHandlerAdapter(attributes));
        return attributes;
    }

    public static Attributes parse(String str) throws ParserConfigurationException, SAXException, IOException {
        return parse(str, (Attributes) null);
    }

    public static Attributes parse(String str, Attributes attributes) throws ParserConfigurationException, SAXException, IOException {
        if (attributes == null) {
            attributes = new Attributes();
        }
        SAXParserFactory.newInstance().newSAXParser().parse(str, new ContentHandlerAdapter(attributes));
        return attributes;
    }
}
