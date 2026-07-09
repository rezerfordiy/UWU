package org.dcm4che3.net;

import java.io.IOException;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.dcm4che3.data.Code;
import org.dcm4che3.data.Issuer;
import org.dcm4che3.util.StringUtils;
import org.slf4j.Marker;
import s0.a;

/* JADX INFO: loaded from: classes.dex */
public class Device implements Serializable {
    private static final long serialVersionUID = -5816872456184522866L;
    private final LinkedHashMap<String, ApplicationEntity> aes;
    private transient AssociationHandler associationHandler;
    private final transient List<Association> associations;
    private final LinkedHashMap<String, X509Certificate[]> authorizedNodeCertificates;
    private transient ConnectionMonitor connectionMonitor;
    private final List<Connection> conns;
    private String description;
    private String deviceName;
    private String deviceSerialNumber;
    private String deviceUID;
    private transient DimseRQHandler dimseRQHandler;
    private transient Executor executor;
    private final Map<Class<? extends DeviceExtension>, DeviceExtension> extensions;
    private boolean installed;
    private String[] institutionAddresses;
    private Code[] institutionCodes;
    private String[] institutionNames;
    private String[] institutionalDepartmentNames;
    private Issuer issuerOfAccessionNumber;
    private Issuer issuerOfAdmissionID;
    private Issuer issuerOfContainerIdentifier;
    private Issuer issuerOfPatientID;
    private Issuer issuerOfServiceEpisodeID;
    private Issuer issuerOfSpecimenIdentifier;
    private String keyStoreKeyPin;
    private String keyStoreKeyPinProperty;
    private String keyStorePin;
    private String keyStorePinProperty;
    private String keyStoreType;
    private String keyStoreURL;
    private volatile transient KeyManager km;
    private int limitOpenAssociations;
    private String manufacturer;
    private String manufacturerModelName;
    private Issuer orderFillerIdentifier;
    private Issuer orderPlacerIdentifier;
    private String[] primaryDeviceTypes;
    private String[] relatedDeviceRefs;
    private transient ScheduledExecutorService scheduledExecutor;
    private String[] softwareVersions;
    private volatile transient SSLContext sslContext;
    private String stationName;
    private final LinkedHashMap<String, X509Certificate[]> thisNodeCertificates;
    private TimeZone timeZoneOfDevice;
    private volatile transient TrustManager tm;
    private String trustStorePin;
    private String trustStorePinProperty;
    private String trustStoreType;
    private String trustStoreURL;
    private byte[][] vendorData;

    public Device() {
        this.softwareVersions = new String[0];
        this.primaryDeviceTypes = new String[0];
        this.institutionNames = new String[0];
        this.institutionCodes = new Code[0];
        this.institutionAddresses = new String[0];
        this.institutionalDepartmentNames = new String[0];
        this.relatedDeviceRefs = new String[0];
        this.vendorData = new byte[0][];
        this.installed = true;
        this.authorizedNodeCertificates = new LinkedHashMap<>();
        this.thisNodeCertificates = new LinkedHashMap<>();
        this.conns = new ArrayList();
        this.aes = new LinkedHashMap<>();
        this.extensions = new HashMap();
        this.associationHandler = new AssociationHandler();
        this.associations = new ArrayList();
    }

    private void checkNotEmpty(String str, String str2) {
        if (str2 == null || !str2.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be empty");
    }

    private String keyPin(String str) {
        String str2 = this.keyStoreKeyPin;
        if (str2 != null) {
            return str2;
        }
        String str3 = this.keyStoreKeyPinProperty;
        if (str3 == null) {
            return str;
        }
        String property = System.getProperty(str3);
        if (property != null) {
            return property;
        }
        throw new IllegalStateException("No such keyPinProperty: " + this.keyStoreKeyPinProperty);
    }

    private String keyStorePin() {
        String str = this.keyStorePin;
        if (str != null) {
            return str;
        }
        String str2 = this.keyStorePinProperty;
        if (str2 == null) {
            throw new IllegalStateException("keyStoreURL requires keyStorePin or keyStorePinProperty");
        }
        String property = System.getProperty(str2);
        if (property != null) {
            return property;
        }
        throw new IllegalStateException("No such keyStorePinProperty: " + this.keyStorePinProperty);
    }

    private String keyStoreType() {
        String str = this.keyStoreType;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("keyStoreURL requires keyStoreType");
    }

    private KeyManager km() throws GeneralSecurityException, IOException {
        KeyManager keyManager = this.km;
        if (keyManager != null || this.keyStoreURL == null) {
            return keyManager;
        }
        KeyManager keyManagerCreateKeyManager = SSLManagerFactory.createKeyManager(keyStoreType(), StringUtils.replaceSystemProperties(this.keyStoreURL), keyStorePin(), keyPin(keyStorePin()));
        this.km = keyManagerCreateKeyManager;
        return keyManagerCreateKeyManager;
    }

    private void needRebindConnections() {
        Iterator<Connection> it = this.conns.iterator();
        while (it.hasNext()) {
            it.next().needRebind();
        }
    }

    private void needReconfigureTLS() {
        for (Connection connection : this.conns) {
            if (connection.isTls()) {
                connection.needRebind();
            }
        }
        this.sslContext = null;
    }

    private void reconfigureApplicationEntities(Device device) {
        this.aes.keySet().retainAll(device.aes.keySet());
        for (ApplicationEntity applicationEntity : device.aes.values()) {
            ApplicationEntity applicationEntity2 = this.aes.get(applicationEntity.getAETitle());
            if (applicationEntity2 == null) {
                applicationEntity2 = new ApplicationEntity(applicationEntity.getAETitle());
                addApplicationEntity(applicationEntity2);
            }
            applicationEntity2.reconfigure(applicationEntity);
        }
    }

    private void reconfigureDeviceExtensions(Device device) {
        Iterator<Class<? extends DeviceExtension>> it = this.extensions.keySet().iterator();
        while (it.hasNext()) {
            if (!device.extensions.containsKey(it.next())) {
                it.remove();
            }
        }
        for (DeviceExtension deviceExtension : device.extensions.values()) {
            Class<?> cls = deviceExtension.getClass();
            DeviceExtension deviceExtension2 = this.extensions.get(cls);
            if (deviceExtension2 == null) {
                try {
                    deviceExtension2 = (DeviceExtension) cls.newInstance();
                    addDeviceExtension(deviceExtension2);
                } catch (Exception e4) {
                    throw new RuntimeException("Failed to instantiate " + cls.getName(), e4);
                }
            }
            deviceExtension2.reconfigure(deviceExtension);
        }
    }

    private TrustManager tm() throws GeneralSecurityException, IOException {
        TrustManager trustManagerCreateTrustManager = this.tm;
        if (trustManagerCreateTrustManager == null && (this.trustStoreURL != null || !this.authorizedNodeCertificates.isEmpty())) {
            trustManagerCreateTrustManager = this.trustStoreURL != null ? SSLManagerFactory.createTrustManager(trustStoreType(), StringUtils.replaceSystemProperties(this.trustStoreURL), trustStorePin()) : SSLManagerFactory.createTrustManager(getAllAuthorizedNodeCertificates());
            this.tm = trustManagerCreateTrustManager;
        }
        return trustManagerCreateTrustManager;
    }

    private static X509Certificate[] toArray(Collection<X509Certificate[]> collection) {
        Iterator<X509Certificate[]> it = collection.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().length;
        }
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        int length2 = 0;
        for (X509Certificate[] x509CertificateArr2 : collection) {
            System.arraycopy(x509CertificateArr2, 0, x509CertificateArr, length2, x509CertificateArr2.length);
            length2 += x509CertificateArr2.length;
        }
        return x509CertificateArr;
    }

    private String trustStorePin() {
        String str = this.trustStorePin;
        if (str != null) {
            return str;
        }
        String str2 = this.trustStorePinProperty;
        if (str2 == null) {
            throw new IllegalStateException("trustStoreURL requires trustStorePin or trustStorePinProperty");
        }
        String property = System.getProperty(str2);
        if (property != null) {
            return property;
        }
        throw new IllegalStateException("No such trustStorePinProperty: " + this.trustStorePinProperty);
    }

    private String trustStoreType() {
        String str = this.trustStoreType;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("trustStoreURL requires trustStoreType");
    }

    private boolean update(Map<String, X509Certificate[]> map, Map<String, X509Certificate[]> map2) {
        boolean zRetainAll = map.keySet().retainAll(map2.keySet());
        for (Map.Entry<String, X509Certificate[]> entry : map2.entrySet()) {
            String key = entry.getKey();
            X509Certificate[] value = entry.getValue();
            X509Certificate[] x509CertificateArr = map.get(key);
            if (x509CertificateArr == null || !Arrays.equals(value, x509CertificateArr)) {
                map.put(key, value);
                zRetainAll = true;
            }
        }
        return zRetainAll;
    }

    public void addApplicationEntity(ApplicationEntity applicationEntity) {
        applicationEntity.setDevice(this);
        this.aes.put(applicationEntity.getAETitle(), applicationEntity);
    }

    public void addAssociation(Association association) {
        synchronized (this.associations) {
            this.associations.add(association);
        }
    }

    public void addConnection(Connection connection) {
        connection.setDevice(this);
        this.conns.add(connection);
        connection.needRebind();
    }

    public void addDeviceExtension(DeviceExtension deviceExtension) {
        Class<?> cls = deviceExtension.getClass();
        if (!this.extensions.containsKey(cls)) {
            deviceExtension.setDevice(this);
            this.extensions.put((Class<? extends DeviceExtension>) cls, deviceExtension);
        } else {
            throw new IllegalStateException("already contains Device Extension:" + cls);
        }
    }

    public void bindConnections() throws GeneralSecurityException, IOException {
        Iterator<Connection> it = this.conns.iterator();
        while (it.hasNext()) {
            it.next().bind();
        }
    }

    public Connection connectionWithEqualsRDN(Connection connection) {
        for (Connection connection2 : this.conns) {
            if (connection2.equalsRDN(connection)) {
                return connection2;
            }
        }
        return null;
    }

    public void execute(Runnable runnable) {
        Executor executor = this.executor;
        if (executor == null) {
            throw new IllegalStateException("executer not initalized");
        }
        executor.execute(runnable);
    }

    public X509Certificate[] getAllAuthorizedNodeCertificates() {
        return toArray(this.authorizedNodeCertificates.values());
    }

    public X509Certificate[] getAllThisNodeCertificates() {
        return toArray(this.thisNodeCertificates.values());
    }

    public Collection<String> getApplicationAETitles() {
        return this.aes.keySet();
    }

    public Collection<ApplicationEntity> getApplicationEntities() {
        return this.aes.values();
    }

    public ApplicationEntity getApplicationEntity(String str) {
        return this.aes.get(str);
    }

    public final AssociationHandler getAssociationHandler() {
        return this.associationHandler;
    }

    public String[] getAuthorizedNodeCertificateRefs() {
        return (String[]) this.authorizedNodeCertificates.keySet().toArray(StringUtils.EMPTY_STRING);
    }

    public X509Certificate[] getAuthorizedNodeCertificates(String str) {
        return this.authorizedNodeCertificates.get(str);
    }

    public ConnectionMonitor getConnectionMonitor() {
        return this.connectionMonitor;
    }

    public final String getDescription() {
        return this.description;
    }

    public <T extends DeviceExtension> T getDeviceExtension(Class<T> cls) {
        return (T) this.extensions.get(cls);
    }

    public <T extends DeviceExtension> T getDeviceExtensionNotNull(Class<T> cls) {
        T t4 = (T) getDeviceExtension(cls);
        if (t4 != null) {
            return t4;
        }
        throw new IllegalStateException("No " + cls.getName() + " configured for Device: " + this.deviceName);
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    public String getDeviceUID() {
        return this.deviceUID;
    }

    public final DimseRQHandler getDimseRQHandler() {
        return this.dimseRQHandler;
    }

    public final Executor getExecutor() {
        return this.executor;
    }

    public final String[] getInstitutionAddresses() {
        return this.institutionAddresses;
    }

    public final Code[] getInstitutionCodes() {
        return this.institutionCodes;
    }

    public final String[] getInstitutionNames() {
        return this.institutionNames;
    }

    public final String[] getInstitutionalDepartmentNames() {
        return this.institutionalDepartmentNames;
    }

    public final Issuer getIssuerOfAccessionNumber() {
        return this.issuerOfAccessionNumber;
    }

    public final Issuer getIssuerOfAdmissionID() {
        return this.issuerOfAdmissionID;
    }

    public final Issuer getIssuerOfContainerIdentifier() {
        return this.issuerOfContainerIdentifier;
    }

    public final Issuer getIssuerOfPatientID() {
        return this.issuerOfPatientID;
    }

    public final Issuer getIssuerOfServiceEpisodeID() {
        return this.issuerOfServiceEpisodeID;
    }

    public final Issuer getIssuerOfSpecimenIdentifier() {
        return this.issuerOfSpecimenIdentifier;
    }

    public final KeyManager getKeyManager() {
        return this.km;
    }

    public final String getKeyStoreKeyPin() {
        return this.keyStoreKeyPin;
    }

    public final String getKeyStoreKeyPinProperty() {
        return this.keyStoreKeyPinProperty;
    }

    public final String getKeyStorePin() {
        return this.keyStorePin;
    }

    public final String getKeyStorePinProperty() {
        return this.keyStorePinProperty;
    }

    public final String getKeyStoreType() {
        return this.keyStoreType;
    }

    public final String getKeyStoreURL() {
        return this.keyStoreURL;
    }

    public final int getLimitOpenAssociations() {
        return this.limitOpenAssociations;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getManufacturerModelName() {
        return this.manufacturerModelName;
    }

    public int getNumberOfOpenAssociations() {
        return this.associations.size();
    }

    public final Issuer getOrderFillerIdentifier() {
        return this.orderFillerIdentifier;
    }

    public final Issuer getOrderPlacerIdentifier() {
        return this.orderPlacerIdentifier;
    }

    public final String[] getPrimaryDeviceTypes() {
        return this.primaryDeviceTypes;
    }

    public final String[] getRelatedDeviceRefs() {
        return this.relatedDeviceRefs;
    }

    public final ScheduledExecutorService getScheduledExecutor() {
        return this.scheduledExecutor;
    }

    public final String[] getSoftwareVersions() {
        return this.softwareVersions;
    }

    public final String getStationName() {
        return this.stationName;
    }

    public String[] getThisNodeCertificateRefs() {
        return (String[]) this.thisNodeCertificates.keySet().toArray(StringUtils.EMPTY_STRING);
    }

    public X509Certificate[] getThisNodeCertificates(String str) {
        return this.thisNodeCertificates.get(str);
    }

    public TimeZone getTimeZoneOfDevice() {
        return this.timeZoneOfDevice;
    }

    public final TrustManager getTrustManager() {
        return this.tm;
    }

    public final String getTrustStorePin() {
        return this.trustStorePin;
    }

    public final String getTrustStorePinProperty() {
        return this.trustStorePinProperty;
    }

    public final String getTrustStoreType() {
        return this.trustStoreType;
    }

    public final String getTrustStoreURL() {
        return this.trustStoreURL;
    }

    public final byte[][] getVendorData() {
        return this.vendorData;
    }

    public final boolean isInstalled() {
        return this.installed;
    }

    public boolean isLimitOfOpenAssociationsExceeded() {
        return this.limitOpenAssociations > 0 && this.associations.size() > this.limitOpenAssociations;
    }

    public KeyManager[] keyManagers() throws GeneralSecurityException, IOException {
        KeyManager keyManagerKm = km();
        if (keyManagerKm != null) {
            return new KeyManager[]{keyManagerKm};
        }
        return null;
    }

    public List<Connection> listConnections() {
        return Collections.unmodifiableList(this.conns);
    }

    public Collection<DeviceExtension> listDeviceExtensions() {
        return this.extensions.values();
    }

    public Association[] listOpenAssociations() {
        Association[] associationArr;
        synchronized (this.associations) {
            List<Association> list = this.associations;
            associationArr = (Association[]) list.toArray(new Association[list.size()]);
        }
        return associationArr;
    }

    public StringBuilder promptTo(StringBuilder sb, String str) {
        String str2 = str + "  ";
        StringUtils.appendLine(sb, str, "Device[name: ", this.deviceName);
        StringUtils.appendLine(sb, str2, "desc: ", this.description);
        StringUtils.appendLine(sb, str2, "installed: ", Boolean.valueOf(this.installed));
        Iterator<Connection> it = this.conns.iterator();
        while (it.hasNext()) {
            it.next().promptTo(sb, str2).append(StringUtils.LINE_SEPARATOR);
        }
        Iterator<ApplicationEntity> it2 = this.aes.values().iterator();
        while (it2.hasNext()) {
            it2.next().promptTo(sb, str2).append(StringUtils.LINE_SEPARATOR);
        }
        sb.append(str);
        sb.append(']');
        return sb;
    }

    public void rebindConnections() throws GeneralSecurityException, IOException {
        for (Connection connection : this.conns) {
            if (connection.isRebindNeeded()) {
                connection.rebind();
            }
        }
    }

    public void reconfigure(Device device) throws GeneralSecurityException, IOException {
        setDeviceAttributes(device);
        reconfigureConnections(device);
        reconfigureApplicationEntities(device);
        reconfigureDeviceExtensions(device);
    }

    public void reconfigureConnections(List<Connection> list, List<Connection> list2) {
        list.clear();
        Iterator<Connection> it = list2.iterator();
        while (it.hasNext()) {
            list.add(connectionWithEqualsRDN(it.next()));
        }
    }

    public void removeAllAuthorizedNodeCertificates() {
        this.authorizedNodeCertificates.clear();
        setTrustManager(null);
    }

    public void removeAllThisNodeCertificates() {
        this.thisNodeCertificates.clear();
    }

    public ApplicationEntity removeApplicationEntity(String str) {
        ApplicationEntity applicationEntityRemove = this.aes.remove(str);
        if (applicationEntityRemove != null) {
            applicationEntityRemove.setDevice(null);
        }
        return applicationEntityRemove;
    }

    public void removeAssociation(Association association) {
        synchronized (this.associations) {
            this.associations.remove(association);
            this.associations.notifyAll();
        }
    }

    public X509Certificate[] removeAuthorizedNodeCertificates(String str) {
        X509Certificate[] x509CertificateArrRemove = this.authorizedNodeCertificates.remove(str);
        setTrustManager(null);
        return x509CertificateArrRemove;
    }

    public boolean removeConnection(Connection connection) {
        for (ApplicationEntity applicationEntity : this.aes.values()) {
            if (applicationEntity.getConnections().contains(connection)) {
                throw new IllegalStateException(connection + " used by AE: " + applicationEntity.getAETitle());
            }
        }
        Iterator<DeviceExtension> it = this.extensions.values().iterator();
        while (it.hasNext()) {
            it.next().verifyNotUsed(connection);
        }
        if (!this.conns.remove(connection)) {
            return false;
        }
        connection.setDevice(null);
        connection.unbind();
        return true;
    }

    public boolean removeDeviceExtension(DeviceExtension deviceExtension) {
        if (this.extensions.remove(deviceExtension.getClass()) == null) {
            return false;
        }
        deviceExtension.setDevice(null);
        return true;
    }

    public X509Certificate[] removeThisNodeCertificates(String str) {
        return this.thisNodeCertificates.remove(str);
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j4, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.scheduledExecutor;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.schedule(runnable, j4, timeUnit);
        }
        throw new IllegalStateException("scheduled executor service not initalized");
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j4, long j5, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.scheduledExecutor;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.scheduleAtFixedRate(runnable, j4, j5, timeUnit);
        }
        throw new IllegalStateException("scheduled executor service not initalized");
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j4, long j5, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.scheduledExecutor;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.scheduleWithFixedDelay(runnable, j4, j5, timeUnit);
        }
        throw new IllegalStateException("scheduled executor service not initalized");
    }

    public void setAssociationHandler(AssociationHandler associationHandler) {
        associationHandler.getClass();
        this.associationHandler = associationHandler;
    }

    public void setAuthorizedNodeCertificates(String str, X509Certificate... x509CertificateArr) {
        this.authorizedNodeCertificates.put(str, x509CertificateArr);
        setTrustManager(null);
    }

    public void setConnectionMonitor(ConnectionMonitor connectionMonitor) {
        this.connectionMonitor = connectionMonitor;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public void setDeviceAttributes(Device device) {
        setDescription(device.description);
        setDeviceUID(device.deviceUID);
        setManufacturer(device.manufacturer);
        setManufacturerModelName(device.manufacturerModelName);
        setSoftwareVersions(device.softwareVersions);
        setStationName(device.stationName);
        setDeviceSerialNumber(device.deviceSerialNumber);
        setTrustStoreURL(device.trustStoreURL);
        setTrustStoreType(device.trustStoreType);
        setTrustStorePin(device.trustStorePin);
        setKeyStoreURL(device.keyStoreURL);
        setKeyStoreType(device.keyStoreType);
        setKeyStorePin(device.keyStorePin);
        setKeyStoreKeyPin(device.keyStoreKeyPin);
        setTimeZoneOfDevice(device.timeZoneOfDevice);
        setIssuerOfPatientID(device.issuerOfPatientID);
        setIssuerOfAccessionNumber(device.issuerOfAccessionNumber);
        setOrderPlacerIdentifier(device.orderPlacerIdentifier);
        setOrderFillerIdentifier(device.orderFillerIdentifier);
        setIssuerOfAdmissionID(device.issuerOfAdmissionID);
        setIssuerOfServiceEpisodeID(device.issuerOfServiceEpisodeID);
        setIssuerOfContainerIdentifier(device.issuerOfContainerIdentifier);
        setIssuerOfSpecimenIdentifier(device.issuerOfSpecimenIdentifier);
        setInstitutionNames(device.institutionNames);
        setInstitutionCodes(device.institutionCodes);
        setInstitutionAddresses(device.institutionAddresses);
        setInstitutionalDepartmentNames(device.institutionalDepartmentNames);
        setPrimaryDeviceTypes(device.primaryDeviceTypes);
        setRelatedDeviceRefs(device.relatedDeviceRefs);
        setAuthorizedNodeCertificates(device.authorizedNodeCertificates);
        setThisNodeCertificates(device.thisNodeCertificates);
        setVendorData(device.vendorData);
        setLimitOpenAssociations(device.limitOpenAssociations);
        setInstalled(device.installed);
    }

    public final void setDeviceName(String str) {
        checkNotEmpty("Device Name", str);
        this.deviceName = str;
    }

    public final void setDeviceSerialNumber(String str) {
        this.deviceSerialNumber = str;
    }

    public void setDeviceUID(String str) {
        this.deviceUID = str;
    }

    public final void setDimseRQHandler(DimseRQHandler dimseRQHandler) {
        this.dimseRQHandler = dimseRQHandler;
    }

    public final void setExecutor(Executor executor) {
        this.executor = executor;
    }

    public final void setInstalled(boolean z3) {
        if (this.installed == z3) {
            return;
        }
        this.installed = z3;
        needRebindConnections();
    }

    public void setInstitutionAddresses(String... strArr) {
        this.institutionAddresses = strArr;
    }

    public void setInstitutionCodes(Code... codeArr) {
        this.institutionCodes = codeArr;
    }

    public void setInstitutionNames(String... strArr) {
        this.institutionNames = strArr;
    }

    public void setInstitutionalDepartmentNames(String... strArr) {
        this.institutionalDepartmentNames = strArr;
    }

    public final void setIssuerOfAccessionNumber(Issuer issuer) {
        this.issuerOfAccessionNumber = issuer;
    }

    public final void setIssuerOfAdmissionID(Issuer issuer) {
        this.issuerOfAdmissionID = issuer;
    }

    public final void setIssuerOfContainerIdentifier(Issuer issuer) {
        this.issuerOfContainerIdentifier = issuer;
    }

    public final void setIssuerOfPatientID(Issuer issuer) {
        this.issuerOfPatientID = issuer;
    }

    public final void setIssuerOfServiceEpisodeID(Issuer issuer) {
        this.issuerOfServiceEpisodeID = issuer;
    }

    public final void setIssuerOfSpecimenIdentifier(Issuer issuer) {
        this.issuerOfSpecimenIdentifier = issuer;
    }

    public final void setKeyManager(KeyManager keyManager) {
        this.km = keyManager;
        needReconfigureTLS();
    }

    public final void setKeyStoreKeyPin(String str) {
        checkNotEmpty("keyStoreKeyPin", str);
        this.keyStoreKeyPin = str;
    }

    public final void setKeyStoreKeyPinProperty(String str) {
        checkNotEmpty("keyStoreKeyPinProperty", str);
        this.keyStoreKeyPinProperty = str;
    }

    public final void setKeyStorePin(String str) {
        checkNotEmpty("keyStorePin", str);
        this.keyStorePin = str;
    }

    public final void setKeyStorePinProperty(String str) {
        checkNotEmpty("keyStorePinProperty", str);
        this.keyStorePinProperty = str;
    }

    public final void setKeyStoreType(String str) {
        checkNotEmpty("keyStoreType", this.keyStoreURL);
        this.keyStoreType = str;
    }

    public final void setKeyStoreURL(String str) {
        checkNotEmpty("keyStoreURL", str);
        String str2 = this.keyStoreURL;
        if (str == null) {
            if (str2 == null) {
                return;
            }
        } else if (str.equals(str2)) {
            return;
        }
        this.keyStoreURL = str;
        setKeyManager(null);
    }

    public final void setLimitOpenAssociations(int i4) {
        if (i4 >= 0) {
            this.limitOpenAssociations = i4;
            return;
        }
        throw new IllegalArgumentException("limit: " + i4);
    }

    public final void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public final void setManufacturerModelName(String str) {
        this.manufacturerModelName = str;
    }

    public final void setOrderFillerIdentifier(Issuer issuer) {
        this.orderFillerIdentifier = issuer;
    }

    public final void setOrderPlacerIdentifier(Issuer issuer) {
        this.orderPlacerIdentifier = issuer;
    }

    public void setPrimaryDeviceTypes(String... strArr) {
        this.primaryDeviceTypes = strArr;
    }

    public void setRelatedDeviceRefs(String... strArr) {
        this.relatedDeviceRefs = strArr;
    }

    public final void setScheduledExecutor(ScheduledExecutorService scheduledExecutorService) {
        this.scheduledExecutor = scheduledExecutorService;
    }

    public final void setSoftwareVersions(String... strArr) {
        this.softwareVersions = strArr;
    }

    public final void setStationName(String str) {
        this.stationName = str;
    }

    public void setThisNodeCertificates(String str, X509Certificate... x509CertificateArr) {
        this.thisNodeCertificates.put(str, x509CertificateArr);
    }

    public void setTimeZoneOfDevice(TimeZone timeZone) {
        this.timeZoneOfDevice = timeZone;
    }

    public final void setTrustManager(TrustManager trustManager) {
        this.tm = trustManager;
        needReconfigureTLS();
    }

    public final void setTrustStorePin(String str) {
        checkNotEmpty("trustStorePin", str);
        this.trustStorePin = str;
    }

    public final void setTrustStorePinProperty(String str) {
        checkNotEmpty("keyPin", this.keyStoreKeyPin);
        this.trustStorePinProperty = str;
    }

    public final void setTrustStoreType(String str) {
        checkNotEmpty("trustStoreType", str);
        this.trustStoreType = str;
    }

    public final void setTrustStoreURL(String str) {
        checkNotEmpty("trustStoreURL", str);
        String str2 = this.trustStoreURL;
        if (str == null) {
            if (str2 == null) {
                return;
            }
        } else if (str.equals(str2)) {
            return;
        }
        this.trustStoreURL = str;
        setTrustManager(null);
    }

    public void setVendorData(byte[]... bArr) {
        this.vendorData = bArr;
    }

    public SSLContext sslContext() throws GeneralSecurityException, IOException {
        SSLContext sSLContext = this.sslContext;
        if (sSLContext != null) {
            return sSLContext;
        }
        SSLContext sSLContext2 = SSLContext.getInstance("TLS");
        sSLContext2.init(keyManagers(), trustManagers(), null);
        this.sslContext = sSLContext2;
        return sSLContext2;
    }

    public String toString() {
        return promptTo(new StringBuilder(512), a.f11071l).toString();
    }

    public TrustManager[] trustManagers() throws GeneralSecurityException, IOException {
        TrustManager trustManagerTm = tm();
        if (trustManagerTm != null) {
            return new TrustManager[]{trustManagerTm};
        }
        return null;
    }

    public void unbindConnections() {
        Iterator<Connection> it = this.conns.iterator();
        while (it.hasNext()) {
            it.next().unbind();
        }
    }

    public void waitForNoOpenConnections() throws InterruptedException {
        synchronized (this.associations) {
            while (!this.associations.isEmpty()) {
                this.associations.wait();
            }
        }
    }

    public Device(String str) {
        this.softwareVersions = new String[0];
        this.primaryDeviceTypes = new String[0];
        this.institutionNames = new String[0];
        this.institutionCodes = new Code[0];
        this.institutionAddresses = new String[0];
        this.institutionalDepartmentNames = new String[0];
        this.relatedDeviceRefs = new String[0];
        this.vendorData = new byte[0][];
        this.installed = true;
        this.authorizedNodeCertificates = new LinkedHashMap<>();
        this.thisNodeCertificates = new LinkedHashMap<>();
        this.conns = new ArrayList();
        this.aes = new LinkedHashMap<>();
        this.extensions = new HashMap();
        this.associationHandler = new AssociationHandler();
        this.associations = new ArrayList();
        setDeviceName(str);
    }

    private void reconfigureConnections(Device device) {
        Iterator<Connection> it = this.conns.iterator();
        while (it.hasNext()) {
            Connection next = it.next();
            if (device.connectionWithEqualsRDN(next) == null) {
                it.remove();
                next.setDevice(null);
                next.unbind();
            }
        }
        for (Connection connection : device.conns) {
            Connection connectionConnectionWithEqualsRDN = connectionWithEqualsRDN(connection);
            if (connectionConnectionWithEqualsRDN == null) {
                connectionConnectionWithEqualsRDN = new Connection();
                addConnection(connectionConnectionWithEqualsRDN);
            }
            connectionConnectionWithEqualsRDN.reconfigure(connection);
        }
    }

    private void setAuthorizedNodeCertificates(Map<String, X509Certificate[]> map) {
        if (update(this.authorizedNodeCertificates, map)) {
            setTrustManager(null);
        }
    }

    private void setThisNodeCertificates(Map<String, X509Certificate[]> map) {
        update(this.thisNodeCertificates, map);
    }

    public ApplicationEntity getApplicationEntity(String str, boolean z3) {
        ApplicationEntity applicationEntity = this.aes.get(str);
        if (applicationEntity == null) {
            applicationEntity = this.aes.get(Marker.ANY_MARKER);
        }
        if (applicationEntity == null && z3) {
            for (ApplicationEntity applicationEntity2 : getApplicationEntities()) {
                if (applicationEntity2.isOtherAETitle(str)) {
                    return applicationEntity2;
                }
            }
        }
        return applicationEntity;
    }

    public ApplicationEntity removeApplicationEntity(ApplicationEntity applicationEntity) {
        return removeApplicationEntity(applicationEntity.getAETitle());
    }
}
