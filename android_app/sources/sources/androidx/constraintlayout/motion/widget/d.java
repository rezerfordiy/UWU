package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.widget.a;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2156a = "TransitionBuilder";

    public static a.b a(a aVar, int i4, int i5, androidx.constraintlayout.widget.d dVar, int i6, androidx.constraintlayout.widget.d dVar2) {
        a.b bVar = new a.b(i4, aVar, i5, i6);
        b(aVar, bVar, dVar, dVar2);
        return bVar;
    }

    public static void b(a aVar, a.b bVar, androidx.constraintlayout.widget.d dVar, androidx.constraintlayout.widget.d dVar2) {
        int iG = bVar.G();
        int iZ = bVar.z();
        aVar.W(iG, dVar);
        aVar.W(iZ, dVar2);
    }

    public static void c(MotionLayout motionLayout) {
        a aVar = motionLayout.H;
        if (aVar == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        }
        if (!aVar.f0(motionLayout)) {
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        if (aVar.f2076c == null || aVar.o().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }
}
