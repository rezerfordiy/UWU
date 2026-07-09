package i2;

import android.graphics.Canvas;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<b> f8057j;

    @Override // i2.b, i2.d
    public void a() {
        if (this.f8057j != null) {
            for (int i4 = 0; i4 < this.f8057j.size(); i4++) {
                this.f8057j.get(i4).a();
            }
        }
    }

    @Override // i2.b, i2.d
    public void b(Canvas canvas) {
        if (this.f8057j != null) {
            for (int i4 = 0; i4 < this.f8057j.size(); i4++) {
                this.f8057j.get(i4).b(canvas);
            }
        }
    }

    @Override // i2.b, i2.d
    public d c(PointF pointF) {
        if (this.f8057j == null) {
            return null;
        }
        for (int i4 = 0; i4 < this.f8057j.size(); i4++) {
            d dVarC = this.f8057j.get(i4).c(pointF);
            if (dVarC != null) {
                return dVarC;
            }
        }
        return null;
    }

    @Override // i2.b, i2.d
    public boolean e() {
        if (this.f8057j == null) {
            return true;
        }
        for (int i4 = 0; i4 < this.f8057j.size(); i4++) {
            if (!this.f8057j.get(i4).e()) {
                return false;
            }
        }
        return true;
    }

    public void m(b bVar) {
        if (this.f8057j == null) {
            this.f8057j = new ArrayList<>();
        }
        if (bVar != null) {
            this.f8057j.add(bVar);
        }
    }

    public int n() {
        ArrayList<b> arrayList = this.f8057j;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void o() {
        ArrayList<b> arrayList = this.f8057j;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public void p(b bVar) {
        if (bVar == null || this.f8057j == null) {
            return;
        }
        for (int i4 = 0; i4 < this.f8057j.size(); i4++) {
            if (this.f8057j.get(i4) == bVar) {
                this.f8057j.remove(i4);
                return;
            }
        }
    }
}
