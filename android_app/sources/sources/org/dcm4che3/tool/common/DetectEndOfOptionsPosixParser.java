package org.dcm4che3.tool.common;

import java.util.Arrays;
import java.util.Properties;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;

/* JADX INFO: loaded from: classes.dex */
public class DetectEndOfOptionsPosixParser extends PosixParser {
    public CommandLine parse(Options options, String[] strArr, Properties properties, boolean z3) throws ParseException {
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (!"--".equals(strArr[length]));
        CommandLine commandLine = super.parse(options, length < 0 ? strArr : (String[]) Arrays.copyOf(strArr, length), properties, z3);
        if (length >= 0) {
            while (true) {
                length++;
                if (length >= strArr.length) {
                    break;
                }
                commandLine.getArgList().add(strArr[length]);
            }
        }
        return commandLine;
    }
}
