package org.dcm4che3.io;

import java.util.HashMap;
import javax.xml.transform.Templates;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.stream.StreamSource;

/* JADX INFO: loaded from: classes.dex */
public class TemplatesCache {
    private static TemplatesCache defaultCache;
    private final HashMap<String, Templates> map = new HashMap<>();

    public static synchronized TemplatesCache getDefault() {
        if (defaultCache == null) {
            defaultCache = new TemplatesCache();
        }
        return defaultCache;
    }

    public static synchronized void setDefault(TemplatesCache templatesCache) {
        if (templatesCache == null) {
            throw new NullPointerException();
        }
        defaultCache = templatesCache;
    }

    public void clear() {
        this.map.clear();
    }

    public Templates get(String str) throws TransformerConfigurationException {
        Templates templates = this.map.get(str);
        if (templates != null) {
            return templates;
        }
        HashMap<String, Templates> map = this.map;
        Templates templatesNewTemplates = SAXTransformer.newTemplates(new StreamSource(str));
        map.put(str, templatesNewTemplates);
        return templatesNewTemplates;
    }
}
