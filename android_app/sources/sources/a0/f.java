package a0;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static void a(@c.j0 AlarmManager alarmManager, long j4, @c.j0 PendingIntent pendingIntent, @c.j0 PendingIntent pendingIntent2) {
        alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j4, pendingIntent), pendingIntent2);
    }

    public static void b(@c.j0 AlarmManager alarmManager, int i4, long j4, @c.j0 PendingIntent pendingIntent) {
        alarmManager.setAndAllowWhileIdle(i4, j4, pendingIntent);
    }

    public static void c(@c.j0 AlarmManager alarmManager, int i4, long j4, @c.j0 PendingIntent pendingIntent) {
        alarmManager.setExact(i4, j4, pendingIntent);
    }

    public static void d(@c.j0 AlarmManager alarmManager, int i4, long j4, @c.j0 PendingIntent pendingIntent) {
        alarmManager.setExactAndAllowWhileIdle(i4, j4, pendingIntent);
    }
}
