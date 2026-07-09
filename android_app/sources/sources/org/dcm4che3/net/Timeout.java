package org.dcm4che3.net;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public class Timeout implements Runnable {
    public static Logger LOG = LoggerFactory.getLogger(Timeout.class);
    private final Association as;
    private final String cancelMsg;
    private final String expiredMsg;
    private final ScheduledFuture<?> future;

    private Timeout(Association association, String str, String str2, int i4) {
        this.as = association;
        this.expiredMsg = str;
        this.cancelMsg = str2;
        this.future = association.getDevice().schedule(this, i4, TimeUnit.MILLISECONDS);
    }

    public static Timeout start(Association association, String str, String str2, String str3, int i4) {
        LOG.debug(str, association, Integer.valueOf(i4));
        return new Timeout(association, str2, str3, i4);
    }

    @Override // java.lang.Runnable
    public void run() {
        LOG.info(this.expiredMsg, this.as);
        this.as.abort();
    }

    public void stop() {
        LOG.debug(this.cancelMsg, this.as);
        this.future.cancel(false);
    }
}
