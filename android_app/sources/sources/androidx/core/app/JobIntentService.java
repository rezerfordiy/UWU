package androidx.core.app;

import a0.s;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import c.j0;
import c.k0;
import c.o0;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class JobIntentService extends Service {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f3338i = "JobIntentService";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f3339j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f3340k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap<ComponentName, h> f3341l = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f3342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f3343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f3344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3345e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3346f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3347g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<d> f3348h;

    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e eVarA = JobIntentService.this.a();
                if (eVarA == null) {
                    return null;
                }
                JobIntentService.this.h(eVarA.getIntent());
                eVarA.a();
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r12) {
            JobIntentService.this.j();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            JobIntentService.this.j();
        }
    }

    public interface b {
        e a();

        IBinder b();
    }

    public static final class c extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f3350d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PowerManager.WakeLock f3351e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final PowerManager.WakeLock f3352f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f3353g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f3354h;

        public c(Context context, ComponentName componentName) {
            super(componentName);
            this.f3350d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f3351e = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f3352f = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.h
        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f3367a);
            if (this.f3350d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f3353g) {
                        this.f3353g = true;
                        if (!this.f3354h) {
                            this.f3351e.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.h
        public void c() {
            synchronized (this) {
                if (this.f3354h) {
                    if (this.f3353g) {
                        this.f3351e.acquire(60000L);
                    }
                    this.f3354h = false;
                    this.f3352f.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.h
        public void d() {
            synchronized (this) {
                if (!this.f3354h) {
                    this.f3354h = true;
                    this.f3352f.acquire(600000L);
                    this.f3351e.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.h
        public void e() {
            synchronized (this) {
                this.f3353g = false;
            }
        }
    }

    public final class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f3355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3356b;

        public d(Intent intent, int i4) {
            this.f3355a = intent;
            this.f3356b = i4;
        }

        @Override // androidx.core.app.JobIntentService.e
        public void a() {
            JobIntentService.this.stopSelf(this.f3356b);
        }

        @Override // androidx.core.app.JobIntentService.e
        public Intent getIntent() {
            return this.f3355a;
        }
    }

    public interface e {
        void a();

        Intent getIntent();
    }

    @o0(26)
    public static final class f extends JobServiceEngine implements b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f3358d = "JobServiceEngineImpl";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final boolean f3359e = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JobIntentService f3360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f3361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public JobParameters f3362c;

        public final class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final JobWorkItem f3363a;

            public a(JobWorkItem jobWorkItem) {
                this.f3363a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.e
            public void a() {
                synchronized (f.this.f3361b) {
                    JobParameters jobParameters = f.this.f3362c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f3363a);
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.e
            public Intent getIntent() {
                return this.f3363a.getIntent();
            }
        }

        public f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f3361b = new Object();
            this.f3360a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.b
        public e a() {
            synchronized (this.f3361b) {
                JobParameters jobParameters = this.f3362c;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return null;
                }
                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f3360a.getClassLoader());
                return new a(jobWorkItemDequeueWork);
            }
        }

        @Override // androidx.core.app.JobIntentService.b
        public IBinder b() {
            return getBinder();
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f3362c = jobParameters;
            this.f3360a.e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean zB = this.f3360a.b();
            synchronized (this.f3361b) {
                this.f3362c = null;
            }
            return zB;
        }
    }

    @o0(26)
    public static final class g extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final JobInfo f3365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final JobScheduler f3366e;

        public g(Context context, ComponentName componentName, int i4) {
            super(componentName);
            b(i4);
            this.f3365d = new JobInfo.Builder(i4, this.f3367a).setOverrideDeadline(0L).build();
            this.f3366e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.JobIntentService.h
        public void a(Intent intent) {
            this.f3366e.enqueue(this.f3365d, s.a(intent));
        }
    }

    public static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f3367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f3368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3369c;

        public h(ComponentName componentName) {
            this.f3367a = componentName;
        }

        public abstract void a(Intent intent);

        public void b(int i4) {
            if (!this.f3368b) {
                this.f3368b = true;
                this.f3369c = i4;
            } else {
                if (this.f3369c == i4) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i4 + " is different than previous " + this.f3369c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public JobIntentService() {
        this.f3348h = Build.VERSION.SDK_INT >= 26 ? null : new ArrayList<>();
    }

    public static void c(@j0 Context context, @j0 ComponentName componentName, int i4, @j0 Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f3340k) {
            h hVarF = f(context, componentName, true, i4);
            hVarF.b(i4);
            hVarF.a(intent);
        }
    }

    public static void d(@j0 Context context, @j0 Class<?> cls, int i4, @j0 Intent intent) {
        c(context, new ComponentName(context, cls), i4, intent);
    }

    public static h f(Context context, ComponentName componentName, boolean z3, int i4) {
        h cVar;
        HashMap<ComponentName, h> map = f3341l;
        h hVar = map.get(componentName);
        if (hVar != null) {
            return hVar;
        }
        if (Build.VERSION.SDK_INT < 26) {
            cVar = new c(context, componentName);
        } else {
            if (!z3) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            cVar = new g(context, componentName, i4);
        }
        h hVar2 = cVar;
        map.put(componentName, hVar2);
        return hVar2;
    }

    public e a() {
        b bVar = this.f3342b;
        if (bVar != null) {
            return bVar.a();
        }
        synchronized (this.f3348h) {
            if (this.f3348h.size() <= 0) {
                return null;
            }
            return this.f3348h.remove(0);
        }
    }

    public boolean b() {
        a aVar = this.f3344d;
        if (aVar != null) {
            aVar.cancel(this.f3345e);
        }
        this.f3346f = true;
        return i();
    }

    public void e(boolean z3) {
        if (this.f3344d == null) {
            this.f3344d = new a();
            h hVar = this.f3343c;
            if (hVar != null && z3) {
                hVar.d();
            }
            this.f3344d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean g() {
        return this.f3346f;
    }

    public abstract void h(@j0 Intent intent);

    public boolean i() {
        return true;
    }

    public void j() {
        ArrayList<d> arrayList = this.f3348h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3344d = null;
                ArrayList<d> arrayList2 = this.f3348h;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    e(false);
                } else if (!this.f3347g) {
                    this.f3343c.c();
                }
            }
        }
    }

    public void k(boolean z3) {
        this.f3345e = z3;
    }

    @Override // android.app.Service
    public IBinder onBind(@j0 Intent intent) {
        b bVar = this.f3342b;
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3342b = new f(this);
            this.f3343c = null;
        } else {
            this.f3342b = null;
            this.f3343c = f(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.f3348h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3347g = true;
                this.f3343c.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@k0 Intent intent, int i4, int i5) {
        if (this.f3348h == null) {
            return 2;
        }
        this.f3343c.e();
        synchronized (this.f3348h) {
            ArrayList<d> arrayList = this.f3348h;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i5));
            e(true);
        }
        return 3;
    }
}
