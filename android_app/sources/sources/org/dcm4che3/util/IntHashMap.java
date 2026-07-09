package org.dcm4che3.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class IntHashMap<V> implements Cloneable, Serializable {
    private static final int DEFAULT_CAPACITY = 32;
    private static final byte FREE = 0;
    private static final byte FULL = 1;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final int MINIMUM_CAPACITY = 4;
    private static final byte REMOVED = -1;
    private static final long serialVersionUID = 9153226350279204066L;
    private transient int free;
    private transient int[] keys;
    private transient int size;
    private transient byte[] states;
    private transient Object[] values;

    public interface Visitor<V> {
        boolean visit(int i4, V v3);
    }

    public IntHashMap() {
        init(32);
    }

    private int capacity(int i4) {
        int i5 = i4 << 1;
        if (i5 > 1073741824) {
            return 1073741824;
        }
        int i6 = 4;
        while (i6 < i5) {
            i6 <<= 1;
        }
        return i6;
    }

    private void init(int i4) {
        this.keys = new int[i4];
        this.values = new Object[i4];
        this.states = new byte[i4];
        this.free = i4 >>> 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i4 = objectInputStream.readInt();
        init(capacity(i4));
        this.size = i4;
        this.free -= i4;
        byte[] bArr = this.states;
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        int length = iArr.length - 1;
        while (true) {
            int i5 = i4 - 1;
            if (i4 <= 0) {
                return;
            }
            int i6 = objectInputStream.readInt();
            int i7 = i6 & length;
            while (bArr[i7] != 0) {
                i7 = (i7 + 1) & length;
            }
            bArr[i7] = FULL;
            iArr[i7] = i6;
            objArr[i7] = objectInputStream.readObject();
            i4 = i5;
        }
    }

    private void resize(int i4) {
        if (i4 > 1073741824) {
            throw new IllegalStateException("Capacity exhausted.");
        }
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        byte[] bArr = this.states;
        int[] iArr2 = new int[i4];
        Object[] objArr2 = new Object[i4];
        byte[] bArr2 = new byte[i4];
        int i5 = i4 - 1;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            if (bArr[i6] > 0) {
                int i7 = iArr[i6];
                int i8 = i7 & i5;
                while (bArr2[i8] != 0) {
                    i8 = (i8 + 1) & i5;
                }
                bArr2[i8] = FULL;
                iArr2[i8] = i7;
                objArr2[i8] = objArr[i6];
                objArr[i6] = null;
            }
        }
        this.keys = iArr2;
        this.values = objArr2;
        this.states = bArr2;
        this.free = (i4 >>> 1) - this.size;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        byte[] bArr = this.states;
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        objectOutputStream.writeInt(this.size);
        for (int i4 = 0; i4 < bArr.length; i4++) {
            if (bArr[i4] > 0) {
                objectOutputStream.writeInt(iArr[i4]);
                objectOutputStream.writeObject(objArr[i4]);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean accept(Visitor<V> visitor) {
        int i4 = 0;
        while (true) {
            byte[] bArr = this.states;
            if (i4 >= bArr.length) {
                return true;
            }
            if (bArr[i4] > 0 && !visitor.visit(this.keys[i4], this.values[i4])) {
                return false;
            }
            i4++;
        }
    }

    public void clear() {
        Arrays.fill(this.values, (Object) null);
        Arrays.fill(this.states, (byte) 0);
        this.size = 0;
        this.free = this.keys.length >>> 1;
    }

    public Object clone() {
        try {
            IntHashMap intHashMap = (IntHashMap) super.clone();
            intHashMap.states = (byte[]) this.states.clone();
            intHashMap.keys = (int[]) this.keys.clone();
            intHashMap.values = (Object[]) this.values.clone();
            return intHashMap;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public boolean containsKey(int i4) {
        byte[] bArr = this.states;
        int[] iArr = this.keys;
        int length = iArr.length - 1;
        int i5 = i4 & length;
        while (true) {
            byte b4 = bArr[i5];
            if (b4 == 0) {
                return false;
            }
            if (iArr[i5] == i4) {
                return b4 > 0;
            }
            i5 = (i5 + 1) & length;
        }
    }

    public V get(int i4) {
        byte[] bArr = this.states;
        int[] iArr = this.keys;
        int length = iArr.length - 1;
        for (int i5 = i4 & length; bArr[i5] != 0; i5 = (i5 + 1) & length) {
            if (iArr[i5] == i4) {
                return (V) this.values[i5];
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public V put(int i4, V v3) {
        byte[] bArr = this.states;
        int[] iArr = this.keys;
        int length = iArr.length - 1;
        int i5 = i4 & length;
        while (true) {
            byte b4 = bArr[i5];
            if (b4 <= 0) {
                bArr[i5] = FULL;
                iArr[i5] = i4;
                this.values[i5] = v3;
                int i6 = this.size + 1;
                this.size = i6;
                if (b4 != 0) {
                    return null;
                }
                int i7 = this.free - 1;
                this.free = i7;
                if (i7 >= 0) {
                    return null;
                }
                resize(Math.max(capacity(i6), iArr.length));
                return null;
            }
            if (iArr[i5] == i4) {
                Object[] objArr = this.values;
                V v4 = (V) objArr[i5];
                objArr[i5] = v3;
                return v4;
            }
            i5 = (i5 + 1) & length;
        }
    }

    public void rehash() {
        resize(this.keys.length);
    }

    public V remove(int i4) {
        byte[] bArr = this.states;
        int[] iArr = this.keys;
        int length = iArr.length - 1;
        int i5 = i4 & length;
        while (true) {
            byte b4 = bArr[i5];
            if (b4 == 0) {
                return null;
            }
            if (iArr[i5] == i4) {
                if (b4 < 0) {
                    return null;
                }
                bArr[i5] = -1;
                Object[] objArr = this.values;
                V v3 = (V) objArr[i5];
                objArr[i5] = null;
                this.size--;
                return v3;
            }
            i5 = (i5 + 1) & length;
        }
    }

    public int size() {
        return this.size;
    }

    public void trimToSize() {
        resize(capacity(this.size));
    }

    public IntHashMap(int i4) {
        if (i4 >= 0) {
            init(capacity(i4));
            return;
        }
        throw new IllegalArgumentException("expectedMaxSize is negative: " + i4);
    }
}
