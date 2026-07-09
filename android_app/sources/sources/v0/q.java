package v0;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import c.r0;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12138a;

    public q(Object obj) {
        this.f12138a = obj;
    }

    @c.k0
    @c.r0({r0.a.LIBRARY_GROUP_PREFIX})
    public static q b(Activity activity, DragEvent dragEvent) {
        DragAndDropPermissions dragAndDropPermissionsRequestDragAndDropPermissions = activity.requestDragAndDropPermissions(dragEvent);
        if (dragAndDropPermissionsRequestDragAndDropPermissions != null) {
            return new q(dragAndDropPermissionsRequestDragAndDropPermissions);
        }
        return null;
    }

    public void a() {
        ((DragAndDropPermissions) this.f12138a).release();
    }
}
