package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import c.j0;
import c.k0;
import c.o0;
import c.r0;
import v0.z0;

/* JADX INFO: loaded from: classes.dex */
@r0({r0.a.LIBRARY_GROUP_PREFIX})
public final class u implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3525a = "ReceiveContent";

    @o0(16)
    public static final class a {
        public static CharSequence a(@j0 Context context, @j0 ClipData.Item item, int i4) {
            if ((i4 & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence charSequenceCoerceToText = item.coerceToText(context);
            return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
        }
    }

    public static final class b {
        public static CharSequence a(@j0 Context context, @j0 ClipData.Item item, int i4) {
            CharSequence charSequenceCoerceToText = item.coerceToText(context);
            return ((i4 & 1) == 0 || !(charSequenceCoerceToText instanceof Spanned)) ? charSequenceCoerceToText : charSequenceCoerceToText.toString();
        }
    }

    @j0
    public static CharSequence b(@j0 ClipData clipData, @j0 Context context, int i4) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i5 = 0; i5 < clipData.getItemCount(); i5++) {
            CharSequence charSequenceC = c(context, clipData.getItemAt(i5), i4);
            if (charSequenceC != null) {
                spannableStringBuilder.append(charSequenceC);
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence c(@j0 Context context, @j0 ClipData.Item item, int i4) {
        return a.a(context, item, i4);
    }

    public static void d(@j0 TextView textView, @j0 v0.c cVar) {
        e((Editable) textView.getText(), b(cVar.c(), textView.getContext(), cVar.e()));
    }

    public static void e(@j0 Editable editable, @j0 CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // v0.z0
    @k0
    public v0.c a(@j0 View view, @j0 v0.c cVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + cVar);
        }
        int iG = cVar.g();
        if (iG == 2) {
            return cVar;
        }
        if (iG == 3) {
            d((TextView) view, cVar);
            return null;
        }
        ClipData clipDataC = cVar.c();
        int iE = cVar.e();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z3 = false;
        for (int i4 = 0; i4 < clipDataC.getItemCount(); i4++) {
            CharSequence charSequenceC = c(context, clipDataC.getItemAt(i4), iE);
            if (charSequenceC != null) {
                if (z3) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceC);
                } else {
                    e(editable, charSequenceC);
                    z3 = true;
                }
            }
        }
        return null;
    }
}
