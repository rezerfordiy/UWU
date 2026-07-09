package j;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import c.o0;
import c.r0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public class j implements Window.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window.Callback f8273b;

    public j(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f8273b = callback;
    }

    public final Window.Callback a() {
        return this.f8273b;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f8273b.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f8273b.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f8273b.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f8273b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f8273b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f8273b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f8273b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f8273b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f8273b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f8273b.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i4, Menu menu) {
        return this.f8273b.onCreatePanelMenu(i4, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i4) {
        return this.f8273b.onCreatePanelView(i4);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f8273b.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        return this.f8273b.onMenuItemSelected(i4, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i4, Menu menu) {
        return this.f8273b.onMenuOpened(i4, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i4, Menu menu) {
        this.f8273b.onPanelClosed(i4, menu);
    }

    @Override // android.view.Window.Callback
    @o0(26)
    public void onPointerCaptureChanged(boolean z3) {
        this.f8273b.onPointerCaptureChanged(z3);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i4, View view, Menu menu) {
        return this.f8273b.onPreparePanel(i4, view, menu);
    }

    @Override // android.view.Window.Callback
    @o0(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i4) {
        this.f8273b.onProvideKeyboardShortcuts(list, menu, i4);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f8273b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f8273b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z3) {
        this.f8273b.onWindowFocusChanged(z3);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f8273b.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    @o0(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f8273b.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    @o0(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i4) {
        return this.f8273b.onWindowStartingActionMode(callback, i4);
    }
}
