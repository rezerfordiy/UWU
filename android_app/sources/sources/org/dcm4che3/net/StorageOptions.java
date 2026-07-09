package org.dcm4che3.net;

import java.io.Serializable;
import org.dcm4che3.net.pdu.ExtendedNegotiation;

/* JADX INFO: loaded from: classes.dex */
public class StorageOptions implements Serializable {
    private static final long serialVersionUID = 6911502883119290413L;
    private DigitalSignatureSupport digitalSignatureSupport;
    private ElementCoercion elementCoercion;
    private LevelOfSupport levelOfSupport;

    public enum DigitalSignatureSupport {
        UNSPECIFIED,
        LEVEL_1,
        LEVEL_2,
        LEVEL_3;

        public static DigitalSignatureSupport valueOf(int i4) {
            return i4 != 1 ? i4 != 2 ? i4 != 3 ? UNSPECIFIED : LEVEL_3 : LEVEL_2 : LEVEL_1;
        }
    }

    public enum ElementCoercion {
        NO,
        YES,
        UNSPECIFIED;

        public static ElementCoercion valueOf(int i4) {
            return i4 != 0 ? i4 != 1 ? UNSPECIFIED : YES : NO;
        }
    }

    public enum LevelOfSupport {
        LEVEL_0,
        LEVEL_1,
        LEVEL_2,
        UNSPECIFIED;

        public static LevelOfSupport valueOf(int i4) {
            return i4 != 0 ? i4 != 1 ? i4 != 2 ? UNSPECIFIED : LEVEL_2 : LEVEL_1 : LEVEL_0;
        }
    }

    public StorageOptions() {
        this(LevelOfSupport.UNSPECIFIED, DigitalSignatureSupport.UNSPECIFIED, ElementCoercion.UNSPECIFIED);
    }

    public static StorageOptions valueOf(ExtendedNegotiation extendedNegotiation) {
        return new StorageOptions(LevelOfSupport.valueOf(extendedNegotiation.getField(0, (byte) 3)), DigitalSignatureSupport.valueOf(extendedNegotiation.getField(2, (byte) 0)), ElementCoercion.valueOf(extendedNegotiation.getField(4, (byte) 2)));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StorageOptions)) {
            return false;
        }
        StorageOptions storageOptions = (StorageOptions) obj;
        return this.levelOfSupport == storageOptions.levelOfSupport && this.digitalSignatureSupport == storageOptions.digitalSignatureSupport && this.elementCoercion == storageOptions.elementCoercion;
    }

    public final DigitalSignatureSupport getDigitalSignatureSupport() {
        return this.digitalSignatureSupport;
    }

    public final ElementCoercion getElementCoercion() {
        return this.elementCoercion;
    }

    public final LevelOfSupport getLevelOfSupport() {
        return this.levelOfSupport;
    }

    public int hashCode() {
        return this.levelOfSupport.hashCode() + this.digitalSignatureSupport.hashCode() + this.elementCoercion.hashCode();
    }

    public final void setDigitalSignatureSupport(DigitalSignatureSupport digitalSignatureSupport) {
        this.digitalSignatureSupport = digitalSignatureSupport;
    }

    public final void setElementCoercion(ElementCoercion elementCoercion) {
        this.elementCoercion = elementCoercion;
    }

    public final void setLevelOfSupport(LevelOfSupport levelOfSupport) {
        this.levelOfSupport = levelOfSupport;
    }

    public byte[] toExtendedNegotiationInformation() {
        return new byte[]{(byte) this.levelOfSupport.ordinal(), 0, (byte) this.digitalSignatureSupport.ordinal(), 0, (byte) this.elementCoercion.ordinal(), 0};
    }

    public String toString() {
        return "StorageOptions[levelOfSupport=" + this.levelOfSupport.ordinal() + ", digitalSignatureSupport=" + this.digitalSignatureSupport.ordinal() + ", elementCoercion=" + this.elementCoercion.ordinal() + "]";
    }

    public StorageOptions(LevelOfSupport levelOfSupport, DigitalSignatureSupport digitalSignatureSupport, ElementCoercion elementCoercion) {
        this.levelOfSupport = levelOfSupport;
        this.digitalSignatureSupport = digitalSignatureSupport;
        this.elementCoercion = elementCoercion;
    }
}
