package org.dcm4che3.util;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class RegEx {
    private final Pattern pattern;

    public RegEx(String str) {
        this.pattern = Pattern.compile(str);
    }

    public boolean match(String str) {
        return this.pattern.matcher(str).matches();
    }
}
