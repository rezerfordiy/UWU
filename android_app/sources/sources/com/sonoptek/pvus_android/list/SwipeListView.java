package com.sonoptek.pvus_android.list;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class SwipeListView extends ListView implements AbsListView.OnScrollListener {
    public SwipeListView(Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        a aVar;
        SwipeLayout swipeLayout;
        if (i4 == 1 && (getAdapter() instanceof a) && (swipeLayout = (aVar = (a) getAdapter()).f6080d) != null && swipeLayout.e()) {
            aVar.f6080d.b();
        }
    }

    public SwipeListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeListView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        setOnScrollListener(this);
    }
}
