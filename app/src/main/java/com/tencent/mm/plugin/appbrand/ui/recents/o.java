package com.tencent.mm.plugin.appbrand.ui.recents;

import android.support.v7.widget.RecyclerView.t;
import android.view.LayoutInflater;
import android.view.ViewGroup;

abstract class o<_Data, _ViewHolder extends t> {
    public abstract _ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract void a(_ViewHolder _ViewHolder, _Data _Data);

    public abstract long bf(_Data _Data);

    o() {
    }

    public boolean a(_ViewHolder _ViewHolder, Object obj, Object obj2) {
        return false;
    }
}
