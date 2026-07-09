package n2;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class y0 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9746c;

    public y0(String str, JSONObject jSONObject) {
        this.f9745b = str;
        if (jSONObject != null) {
            this.f9746c = jSONObject.toString();
        }
    }

    public JSONObject a() {
        try {
            return new JSONObject(this.f9746c);
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public void b(JSONObject jSONObject) {
        this.f9746c = jSONObject == null ? s0.a.f11071l : jSONObject.toString();
    }
}
