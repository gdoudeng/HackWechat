package com.tencent.mm.plugin.setting.ui.qrcode;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.ui.account.FacebookAuthUI;

class ShareToQQUI$6 implements OnClickListener {
    final /* synthetic */ ShareToQQUI qgI;

    ShareToQQUI$6(ShareToQQUI shareToQQUI) {
        this.qgI = shareToQQUI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this.qgI.mController.xIM, FacebookAuthUI.class);
        intent.putExtra("is_force_unbind", true);
        this.qgI.mController.xIM.startActivityForResult(intent, 8);
    }
}
