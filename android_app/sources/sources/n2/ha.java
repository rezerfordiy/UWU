package n2;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ha extends ga {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f9336v0 = false;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f9337w0 = 1;

    public void S1() {
        ga gaVar = (ga) ((ia) this.f9561c).y();
        try {
            gaVar.u(true);
        } catch (Exception unused) {
        }
        this.f9562d = gaVar.f9562d;
        this.A = gaVar.A;
        this.B = gaVar.B;
        this.J = gaVar.J;
        q0(gaVar.a0());
        k kVar = gaVar.C;
        this.C = kVar;
        this.K = gaVar.K;
        this.L = gaVar.L;
        kVar.t(true);
        this.K.x(true);
        this.L.w(true);
        i0 i0Var = (i0) this.f9561c;
        int i4 = this.f9564f;
        if (i4 == 5 || i4 == 6) {
            if (i0Var.A.f9369p) {
                return;
            }
        } else if (i4 != 7 || i0Var.A.A) {
            return;
        }
        gaVar.v0(false);
    }

    public void T1(boolean z3) {
        if (z3 == this.f9336v0) {
            int i4 = this.f9337w0;
            if (i4 <= 0) {
                return;
            } else {
                this.f9337w0 = i4 - 1;
            }
        }
        this.f9336v0 = z3;
        ((ia) this.f9561c).e2(z3);
        this.f9297l0.r(W1().w());
        P1(W1().w(), 32);
        this.J = W1().C1();
        this.B = W1().D1();
        this.A = W1().i0();
        this.f9562d = W1().E1();
        M1(W1().F1(), W1().w());
        q0(W1().L0());
        S1();
    }

    public boolean U1() {
        return this.f9336v0;
    }

    public void V1(boolean z3) {
        this.f9336v0 = z3;
    }

    public ia W1() {
        return (ia) this.f9561c;
    }

    @Override // n2.h0, n2.w0, n2.a1, n2.r0
    public void j(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (!jSONObject.isNull("enablePA")) {
                if (jSONObject.getInt("enablePA") == 0) {
                    T1(false);
                } else {
                    T1(true);
                }
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        super.j(jSONObject);
    }

    @Override // n2.ga, n2.h0, n2.w0, n2.a1, n2.r0
    public byte[] v(int i4) {
        byte[] bArrV = super.v(i4);
        if (bArrV != null && this.f9336v0) {
            bArrV[5] = 3;
        }
        return bArrV;
    }
}
