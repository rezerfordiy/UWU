package m2;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ boolean f8913a = false;

    public static l a(d0 d0Var) {
        u uVar = (u) d0Var.f8789f.get("b_data");
        byte[] bArr = uVar.f8883a;
        byte[] bArr2 = uVar.f8884b;
        byte[] bArr3 = bArr2 != null ? bArr2 : bArr;
        int i4 = uVar.f8885c;
        int i5 = uVar.f8886d;
        y yVar = (y) d0Var.f8789f.get("color_data");
        c0 c0Var = (c0) d0Var.f8789f.get("power_data");
        return yVar != null ? m.a(yVar.f8915b, yVar.f8921h, yVar.f8917d, yVar.f8918e, yVar.f8919f, yVar.f8920g, bArr3, i4, i5) : c0Var != null ? m.c(c0Var.f8728b, c0Var.f8734h, c0Var.f8730d, c0Var.f8731e, c0Var.f8732f, c0Var.f8733g, bArr3, i4, i5) : m.b(bArr3, i4, i5);
    }

    public static n b(d0 d0Var) {
        u uVar = (u) d0Var.f8789f.get("b_data");
        return o.b(uVar.f8889g, uVar.f8890h, uVar.f8888f, uVar.f8885c, uVar.f8886d, uVar.f8887e);
    }
}
