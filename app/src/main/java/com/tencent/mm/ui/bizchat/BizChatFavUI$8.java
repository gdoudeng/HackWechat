package com.tencent.mm.ui.bizchat;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.mm.aq.o;

class BizChatFavUI$8 implements OnScrollListener {
    final /* synthetic */ BizChatFavUI ynN;

    BizChatFavUI$8(BizChatFavUI bizChatFavUI) {
        this.ynN = bizChatFavUI;
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        o.PA().bp(i);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
