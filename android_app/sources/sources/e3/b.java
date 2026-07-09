package e3;

import c3.c;
import c3.d;
import c3.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b extends d {
    @Override // c3.d
    public List<f> a(c cVar) {
        ArrayList arrayList = new ArrayList();
        int[] iArrInts = ((a) cVar.e(a.class)).ints();
        for (int i4 : iArrInts) {
            arrayList.add(f.a(Arrays.asList(iArrInts).toString(), Integer.valueOf(i4)));
        }
        return arrayList;
    }
}
