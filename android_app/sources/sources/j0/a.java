package j0;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import c.j0;
import c.k0;
import c.o0;
import c.q0;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8274a;

    /* JADX INFO: renamed from: j0.a$a, reason: collision with other inner class name */
    public class C0065a extends FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f8275a;

        public C0065a(b bVar) {
            this.f8275a = bVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i4, CharSequence charSequence) {
            this.f8275a.a(i4, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f8275a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i4, CharSequence charSequence) {
            this.f8275a.c(i4, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f8275a.d(new c(a.f(authenticationResult.getCryptoObject())));
        }
    }

    public static abstract class b {
        public void a(int i4, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(int i4, CharSequence charSequence) {
        }

        public void d(c cVar) {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f8276a;

        public c(d dVar) {
            this.f8276a = dVar;
        }

        public d a() {
            return this.f8276a;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Signature f8277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Cipher f8278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Mac f8279c;

        public d(@j0 Signature signature) {
            this.f8277a = signature;
            this.f8278b = null;
            this.f8279c = null;
        }

        @k0
        public Cipher a() {
            return this.f8278b;
        }

        @k0
        public Mac b() {
            return this.f8279c;
        }

        @k0
        public Signature c() {
            return this.f8277a;
        }

        public d(@j0 Cipher cipher) {
            this.f8278b = cipher;
            this.f8277a = null;
            this.f8279c = null;
        }

        public d(@j0 Mac mac) {
            this.f8279c = mac;
            this.f8278b = null;
            this.f8277a = null;
        }
    }

    public a(Context context) {
        this.f8274a = context;
    }

    @j0
    public static a b(@j0 Context context) {
        return new a(context);
    }

    @k0
    @o0(23)
    public static FingerprintManager c(@j0 Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    @o0(23)
    public static d f(FingerprintManager.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new d(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new d(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new d(cryptoObject.getMac());
        }
        return null;
    }

    @o0(23)
    public static FingerprintManager.AuthenticationCallback g(b bVar) {
        return new C0065a(bVar);
    }

    @o0(23)
    public static FingerprintManager.CryptoObject h(d dVar) {
        if (dVar == null) {
            return null;
        }
        if (dVar.a() != null) {
            return new FingerprintManager.CryptoObject(dVar.a());
        }
        if (dVar.c() != null) {
            return new FingerprintManager.CryptoObject(dVar.c());
        }
        if (dVar.b() != null) {
            return new FingerprintManager.CryptoObject(dVar.b());
        }
        return null;
    }

    @q0("android.permission.USE_FINGERPRINT")
    public void a(@k0 d dVar, int i4, @k0 p0.b bVar, @j0 b bVar2, @k0 Handler handler) {
        FingerprintManager fingerprintManagerC = c(this.f8274a);
        if (fingerprintManagerC != null) {
            fingerprintManagerC.authenticate(h(dVar), bVar != null ? (CancellationSignal) bVar.b() : null, i4, g(bVar2), handler);
        }
    }

    @q0("android.permission.USE_FINGERPRINT")
    public boolean d() {
        FingerprintManager fingerprintManagerC = c(this.f8274a);
        return fingerprintManagerC != null && fingerprintManagerC.hasEnrolledFingerprints();
    }

    @q0("android.permission.USE_FINGERPRINT")
    public boolean e() {
        FingerprintManager fingerprintManagerC = c(this.f8274a);
        return fingerprintManagerC != null && fingerprintManagerC.isHardwareDetected();
    }
}
