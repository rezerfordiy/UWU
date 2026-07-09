package v;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f11736a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f11737b = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e A[PHI: r8 r15
      0x003e: PHI (r8v3 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:24:0x003c, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r15v3 boolean) = (r15v1 boolean), (r15v35 boolean) binds: [B:24:0x003c, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040 A[PHI: r8 r15
      0x0040: PHI (r8v43 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:24:0x003c, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r15v33 boolean) = (r15v1 boolean), (r15v35 boolean) binds: [B:24:0x003c, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015f  */
    /* JADX WARN: Type inference failed for: r38v0, types: [s.e] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [s.i] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [v.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(v.f r37, s.e r38, int r39, int r40, v.c r41) {
        /*
            Method dump skipped, instruction units count: 1293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.b.a(v.f, s.e, int, int, v.c):void");
    }

    public static void b(f fVar, s.e eVar, ArrayList<e> arrayList, int i4) {
        int i5;
        c[] cVarArr;
        int i6;
        if (i4 == 0) {
            i5 = fVar.f11865z1;
            cVarArr = fVar.C1;
            i6 = 0;
        } else {
            i5 = fVar.A1;
            cVarArr = fVar.B1;
            i6 = 2;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            c cVar = cVarArr[i7];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f11738a)) {
                a(fVar, eVar, i4, i6, cVar);
            }
        }
    }
}
