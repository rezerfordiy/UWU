package org.dcm4che3.net;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import org.dcm4che3.util.SafeClose;
import org.dcm4che3.util.StreamUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class SSLManagerFactory {
    public static KeyManager createKeyManager(String str, String str2, String str3, String str4) throws UnrecoverableKeyException, NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        return createKeyManager(loadKeyStore(str, str2, str3), str4);
    }

    public static KeyStore createKeyStore(X509Certificate... x509CertificateArr) throws KeyStoreException {
        KeyStore keyStore = KeyStore.getInstance("JKS");
        try {
            keyStore.load(null);
            for (X509Certificate x509Certificate : x509CertificateArr) {
                keyStore.setCertificateEntry(x509Certificate.getSubjectX500Principal().getName(), x509Certificate);
            }
            return keyStore;
        } catch (IOException e4) {
            throw new AssertionError(e4);
        } catch (NoSuchAlgorithmException e5) {
            throw new AssertionError(e5);
        } catch (CertificateException e6) {
            throw new AssertionError(e6);
        }
    }

    public static TrustManager createTrustManager(String str, String str2, String str3) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        return createTrustManager(loadKeyStore(str, str2, str3));
    }

    public static KeyStore loadKeyStore(String str, String str2, String str3) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        return loadKeyStore(str, str2, str3.toCharArray());
    }

    public static KeyManager createKeyManager(String str, String str2, char[] cArr, char[] cArr2) throws UnrecoverableKeyException, NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        return createKeyManager(loadKeyStore(str, str2, cArr), cArr2);
    }

    public static TrustManager createTrustManager(String str, String str2, char[] cArr) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        return createTrustManager(loadKeyStore(str, str2, cArr));
    }

    public static KeyStore loadKeyStore(String str, String str2, char[] cArr) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance(str);
        InputStream inputStreamOpenFileOrURL = StreamUtils.openFileOrURL(str2);
        try {
            keyStore.load(inputStreamOpenFileOrURL, cArr);
            return keyStore;
        } finally {
            SafeClose.close(inputStreamOpenFileOrURL);
        }
    }

    public static KeyManager createKeyManager(KeyStore keyStore, String str) throws UnrecoverableKeyException, KeyStoreException {
        return createKeyManager(keyStore, str.toCharArray());
    }

    public static TrustManager createTrustManager(KeyStore keyStore) throws KeyStoreException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length > 0) {
                return trustManagers[0];
            }
            return null;
        } catch (NoSuchAlgorithmException e4) {
            throw new AssertionError(e4);
        }
    }

    public static KeyManager createKeyManager(KeyStore keyStore, char[] cArr) throws UnrecoverableKeyException, KeyStoreException {
        try {
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            keyManagerFactory.init(keyStore, cArr);
            KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
            if (keyManagers.length > 0) {
                return keyManagers[0];
            }
            return null;
        } catch (NoSuchAlgorithmException e4) {
            throw new AssertionError(e4);
        }
    }

    public static TrustManager createTrustManager(X509Certificate... x509CertificateArr) throws KeyStoreException {
        return createTrustManager(createKeyStore(x509CertificateArr));
    }
}
