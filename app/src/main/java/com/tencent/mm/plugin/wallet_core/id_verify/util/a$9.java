package com.tencent.mm.plugin.wallet_core.id_verify.util;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.sdk.platformtools.x;

class a$9 implements OnClickListener {
    final /* synthetic */ Activity icz;
    final /* synthetic */ boolean sKp;

    a$9(boolean z, Activity activity) {
        this.sKp = z;
        this.icz = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        x.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click cancel");
        dialogInterface.dismiss();
        if (this.sKp) {
            this.icz.finish();
        }
    }
}
