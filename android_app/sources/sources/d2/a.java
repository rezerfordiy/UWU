package d2;

import android.content.Context;
import com.sonoptek.pvus_android.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import n2.o1;
import n2.z0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f6728n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f6729o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f6730p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f6731q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static a f6732r;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f6741i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f6743k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f6745m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6733a = "SONOPTEK_US_EXAM";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6734b = "SONOPTEK_US_EXAM_ANIMAL";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6735c = "LinearProbe";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6736d = "NotLinearProbe";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6737e = "_exam";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6738f = "US_default_exam_name";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6739g = "US_default_animal_exam_name";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6740h = "US_EXAM_TYPE";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6744l = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6742j = o1.d(null).e("US_EXAM_TYPE", 3);

    /* JADX INFO: renamed from: d2.a$a, reason: collision with other inner class name */
    public static class C0057a implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<String> f6746a = new ArrayList<>(Arrays.asList("gain", "zoom", "harmonic", "dr", "enhance", "focus", "enablePA", "ENH_VGAIN_0", "ENH_VGAIN_1", "ENH_VGAIN_2", "ENH_VGAIN_3", "ENH_VGAIN_4", "ENH_VGAIN_5", "ENH_VGAIN_6", "ENH_VGAIN_7", "bc_PRF", "bd_PRF", "bc_WF", "COLOR_BC_GAIN", "COLOR_BD_GAIN", "COLOR_BC_VOLUME", "COLOR_BC_START_POINT", "COLOR_BC_LINE_START", "COLOR_BC_LINE_END", "COLOR_BC_STEER_INDEX", "COLOR_BD_STEER_INDEX", "COLOR_BD_START_POINT", "COLOR_BD_LINE_POS", "bd_angle", "COLOR_BD_DYNAMIC_RANGE", "COLOR_BD_FOCUS_POS", "COLOR_BD_VOLUME_INDEX"));

        @Override // n2.z0
        public void a(String str, String str2, String str3) {
            if (this.f6746a.contains(str2)) {
                if (str2.endsWith("_N")) {
                    a.i(null).n(h.g0(), str2.substring(0, str2.lastIndexOf("_N")), str3);
                } else {
                    if ((h.h0() == h.b.Color || h.h0() == h.b.PW) && !h.l0() && str2.equals("harmonic")) {
                        return;
                    }
                    a.i(null).n(h.g0(), str2, str3);
                }
            }
        }

        public void b(ArrayList<String> arrayList) {
            this.f6746a = arrayList;
        }
    }

    public interface b {
        void a();
    }

    public a(Context context) {
        this.f6741i = context;
    }

    public static a i(Context context) {
        if (context != null && f6732r == null) {
            f6732r = new a(context);
        }
        return f6732r;
    }

    public void a() {
        o1.d(this.f6741i).j("SONOPTEK_US_EXAM", s0.a.f11071l);
        o1.d(this.f6741i).j("SONOPTEK_US_EXAM_ANIMAL", s0.a.f11071l);
        o1.d(this.f6741i).j("US_default_exam_name", s0.a.f11071l);
        o1.d(this.f6741i).j("US_default_animal_exam_name", s0.a.f11071l);
        b bVar = this.f6745m;
        if (bVar != null) {
            bVar.a();
        }
    }

    public List<String> b(String str) {
        JSONObject jSONObjectC = c(str);
        if (jSONObjectC == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObjectC.keys();
        while (itKeys.hasNext()) {
            arrayList.add(itKeys.next());
        }
        if (arrayList.contains("Users1")) {
            arrayList.remove("Users1");
            arrayList.add("Users1");
        }
        if (arrayList.contains("Users2")) {
            arrayList.remove("Users2");
            arrayList.add("Users2");
        }
        return arrayList;
    }

    public JSONObject c(String str) {
        String string;
        JSONObject jSONObjectE;
        if (str == null) {
            return null;
        }
        if (str.contains("_PA")) {
            str = str.substring(0, str.indexOf("_PA"));
        }
        if (str.startsWith("KX-1CT")) {
            str = "KX-1CT";
        }
        if (str.startsWith("UX-1C")) {
            str = "UX-1C";
        }
        int i4 = this.f6742j;
        if (i4 == 0) {
            return null;
        }
        String str2 = "ExamJsons";
        if (i4 == 1) {
            string = null;
        } else if (i4 == 2) {
            string = h(str);
            str2 = "ExamJsons_animal";
        } else if (i4 != 3) {
            str2 = s0.a.f11071l;
            string = null;
        } else {
            string = h(str);
        }
        if (string == null) {
            int i5 = this.f6742j;
            jSONObjectE = (i5 == 3 || i5 == 2) ? e(str, str2) : null;
            if (jSONObjectE != null) {
                string = jSONObjectE.toString();
            }
        } else {
            jSONObjectE = e(str, str2);
            if (jSONObjectE != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Iterator<String> itKeys = jSONObjectE.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!jSONObject.isNull(next)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            JSONObject jSONObject3 = jSONObjectE.getJSONObject(next);
                            Iterator<String> itKeys2 = jSONObject2.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                jSONObject3.put(next2, jSONObject2.get(next2));
                            }
                        }
                    }
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
                string = jSONObjectE.toString();
            }
        }
        if (string == null) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[Catch: JSONException -> 0x005d, TRY_LEAVE, TryCatch #0 {JSONException -> 0x005d, blocks: (B:23:0x004c, B:25:0x0057), top: B:41:0x004c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String d(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "_PA"
            boolean r1 = r5.contains(r0)
            r2 = 0
            if (r1 == 0) goto L11
            int r0 = r5.indexOf(r0)
            java.lang.String r5 = r5.substring(r2, r0)
        L11:
            java.lang.String r0 = "KX-1CT"
            boolean r1 = r5.startsWith(r0)
            if (r1 == 0) goto L1a
            r5 = r0
        L1a:
            java.lang.String r0 = "UX-1C"
            boolean r1 = r5.startsWith(r0)
            if (r1 == 0) goto L23
            r5 = r0
        L23:
            int r0 = r4.f6742j
            r1 = 3
            r3 = 0
            if (r0 != r1) goto L36
            android.content.Context r0 = r4.f6741i
            n2.o1 r0 = n2.o1.d(r0)
            java.lang.String r1 = "US_default_exam_name"
        L31:
            java.lang.String r0 = r0.f(r1, r3)
            goto L43
        L36:
            r1 = 2
            if (r0 != r1) goto L42
            android.content.Context r0 = r4.f6741i
            n2.o1 r0 = n2.o1.d(r0)
            java.lang.String r1 = "US_default_animal_exam_name"
            goto L31
        L42:
            r0 = r3
        L43:
            if (r0 == 0) goto L61
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L4c
            goto L61
        L4c:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5d
            r1.<init>(r0)     // Catch: org.json.JSONException -> L5d
            boolean r0 = r1.isNull(r5)     // Catch: org.json.JSONException -> L5d
            if (r0 != 0) goto L61
            java.lang.String r0 = r1.getString(r5)     // Catch: org.json.JSONException -> L5d
            r3 = r0
            goto L61
        L5d:
            r0 = move-exception
            r0.printStackTrace()
        L61:
            org.json.JSONObject r0 = r4.c(r5)
            if (r0 == 0) goto L6d
            boolean r0 = r0.isNull(r3)
            if (r0 != 0) goto L6f
        L6d:
            if (r3 != 0) goto L82
        L6f:
            java.util.List r5 = r4.b(r5)
            if (r5 == 0) goto L82
            int r0 = r5.size()
            if (r0 <= 0) goto L82
            java.lang.Object r5 = r5.get(r2)
            r3 = r5
            java.lang.String r3 = (java.lang.String) r3
        L82:
            r4.f6743k = r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.a.d(java.lang.String):java.lang.String");
    }

    public final JSONObject e(String str, String str2) {
        try {
            if (str.isEmpty()) {
                return null;
            }
            if (!Arrays.asList(this.f6741i.getAssets().list(str2)).contains(str + ".json")) {
                if (h.B0()) {
                    return new JSONObject(d2.b.a(this.f6741i, str2 + "/LinearProbe.json")).getJSONObject("LinearProbe");
                }
                return new JSONObject(d2.b.a(this.f6741i, str2 + "/NotLinearProbe.json")).getJSONObject("NotLinearProbe");
            }
            JSONObject jSONObject = new JSONObject(d2.b.a(this.f6741i, str2 + "/" + str + ".json")).getJSONObject(str);
            if (jSONObject.isNull("super")) {
                return jSONObject;
            }
            String string = jSONObject.getString("super");
            JSONObject jSONObjectL = l(str2, new JSONObject(d2.b.a(this.f6741i, str2 + "/" + string + ".json")).getJSONObject(string), jSONObject);
            jSONObjectL.remove("super");
            return jSONObjectL;
        } catch (IOException | JSONException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public final JSONObject f(String str) {
        try {
            return new JSONObject(d2.b.a(this.f6741i, str)).getJSONObject("Animal");
        } catch (JSONException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public JSONObject g(String str, String str2) {
        JSONObject jSONObjectC = c(str);
        JSONObject jSONObject = null;
        if (jSONObjectC == null || jSONObjectC.isNull(str2)) {
            return null;
        }
        try {
            jSONObject = jSONObjectC.getJSONObject(str2);
            if (str2.equals("VesselFlow") && this.f6744l) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next.endsWith("_flow")) {
                        String strSubstring = next.substring(0, next.indexOf("_flow"));
                        if (!jSONObject.isNull(strSubstring)) {
                            jSONObject.put(strSubstring, jSONObject.getString(next));
                        }
                    }
                }
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return jSONObject;
    }

    public final String h(String str) {
        String strF;
        o1 o1VarD;
        String str2;
        int i4 = this.f6742j;
        if (i4 == 3) {
            o1VarD = o1.d(this.f6741i);
            str2 = "SONOPTEK_US_EXAM";
        } else {
            if (i4 != 2) {
                strF = null;
                if (strF == null && !strF.isEmpty()) {
                    try {
                        JSONObject jSONObject = new JSONObject(strF);
                        if (jSONObject.isNull(str)) {
                            return null;
                        }
                        return jSONObject.getString(str);
                    } catch (JSONException e4) {
                        e4.printStackTrace();
                        return null;
                    }
                }
            }
            o1VarD = o1.d(this.f6741i);
            str2 = "SONOPTEK_US_EXAM_ANIMAL";
        }
        strF = o1VarD.f(str2, null);
        return strF == null ? null : null;
    }

    public int j() {
        return this.f6742j;
    }

    public boolean k() {
        return this.f6744l;
    }

    public final JSONObject l(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!next.equals("super")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                    if (jSONObject.isNull(next)) {
                        jSONObject.put(next, jSONObject3);
                    } else {
                        JSONObject jSONObject4 = jSONObject.getJSONObject(next);
                        Iterator<String> itKeys2 = jSONObject3.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            jSONObject4.put(next2, jSONObject3.getString(next2));
                        }
                        jSONObject.put(next, jSONObject4);
                    }
                }
            }
            if (jSONObject.isNull("super")) {
                return jSONObject;
            }
            String string = jSONObject.getString("super");
            JSONObject jSONObject5 = new JSONObject(d2.b.a(this.f6741i, str + "/" + string + ".json")).getJSONObject(string);
            try {
                return l(str, jSONObject5, jSONObject);
            } catch (JSONException e4) {
                e = e4;
                jSONObject = jSONObject5;
            }
        } catch (JSONException e5) {
            e = e5;
        }
        e.printStackTrace();
        return jSONObject;
    }

    public void m(String str, String str2) {
        if (str.contains("_PA")) {
            str = str.substring(0, str.indexOf("_PA"));
        }
        if (str.startsWith("KX-1CT")) {
            str = "KX-1CT";
        }
        if (str.startsWith("UX-1C")) {
            str = "UX-1C";
        }
        this.f6743k = str2;
        int i4 = this.f6742j;
        JSONObject jSONObject = null;
        String strF = i4 == 3 ? o1.d(this.f6741i).f("US_default_exam_name", null) : i4 == 2 ? o1.d(this.f6741i).f("US_default_animal_exam_name", null) : null;
        if (strF == null || strF.isEmpty()) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(strF);
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        if (this.f6742j == 3) {
            o1.d(this.f6741i).j("US_default_exam_name", jSONObject.toString());
        } else {
            o1.d(this.f6741i).j("US_default_animal_exam_name", jSONObject.toString());
        }
    }

    public void n(String str, String str2, String str3) {
        int i4 = this.f6742j;
        if ((i4 != 3 && i4 != 2) || str == null || this.f6743k == null) {
            return;
        }
        if (str.contains("_PA")) {
            str = str.substring(0, str.indexOf("_PA"));
        }
        if (str.startsWith("KX-1CT")) {
            str = "KX-1CT";
        }
        if (str.startsWith("UX-1C")) {
            str = "UX-1C";
        }
        r(str, this.f6743k, str2, str3);
    }

    public void o(boolean z3) {
        this.f6744l = z3;
    }

    public void p(b bVar) {
        this.f6745m = bVar;
    }

    public void q(int i4) {
        if (this.f6742j == i4) {
            return;
        }
        this.f6742j = i4;
        o1.d(null).i("US_EXAM_TYPE", i4);
        b bVar = this.f6745m;
        if (bVar != null) {
            bVar.a();
        }
    }

    public final void r(String str, String str2, String str3, String str4) {
        JSONObject jSONObjectC = c(str);
        if (jSONObjectC == null) {
            return;
        }
        try {
            if (!jSONObjectC.isNull(str2)) {
                JSONObject jSONObject = jSONObjectC.getJSONObject(str2);
                if (str2.equals("VesselFlow") && this.f6744l) {
                    if (!jSONObject.isNull(str3 + "_flow")) {
                        str3 = str3 + "_flow";
                    }
                    jSONObjectC.put(str2, jSONObject);
                } else {
                    if (!jSONObject.isNull(str3 + "_N")) {
                        str4 = jSONObject.getString(str3 + "_N");
                    }
                }
                jSONObject.put(str3, str4);
                jSONObjectC.put(str2, jSONObject);
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        int i4 = this.f6742j;
        JSONObject jSONObject2 = null;
        String strF = i4 == 3 ? o1.d(this.f6741i).f("SONOPTEK_US_EXAM", null) : i4 == 2 ? o1.d(this.f6741i).f("SONOPTEK_US_EXAM_ANIMAL", null) : null;
        if (strF == null || strF.isEmpty()) {
            jSONObject2 = new JSONObject();
        } else {
            try {
                jSONObject2 = new JSONObject(strF);
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
        if (jSONObject2 != null) {
            try {
                jSONObject2.put(str, jSONObjectC);
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
        }
        int i5 = this.f6742j;
        if (i5 == 3) {
            o1.d(this.f6741i).j("SONOPTEK_US_EXAM", jSONObject2.toString());
        } else if (i5 == 2) {
            o1.d(this.f6741i).j("SONOPTEK_US_EXAM_ANIMAL", jSONObject2.toString());
        }
    }
}
