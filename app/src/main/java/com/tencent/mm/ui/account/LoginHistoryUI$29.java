package com.tencent.mm.ui.account;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.R;
import com.tencent.mm.sdk.platformtools.w;

class LoginHistoryUI$29 implements OnClickListener {
    final /* synthetic */ LoginHistoryUI xPa;

    LoginHistoryUI$29(LoginHistoryUI loginHistoryUI) {
        this.xPa = loginHistoryUI;
    }

    public final void onClick(View view) {
        LoginHistoryUI.bp(this.xPa, this.xPa.getString(R.l.eke, new Object[]{w.cfi()}));
    }
}
