package com.tencent.mm.bm;

import com.tencent.mm.sdk.platformtools.x;

class d$4 implements b {
    final /* synthetic */ String vzO;

    d$4(String str) {
        this.vzO = str;
    }

    public final void c(Exception exception) {
        x.e("MicroMsg.PluginHelper", "start wizard activity failed, plugin(%s) not loaded", this.vzO);
        x.e("MicroMsg.PluginHelper", "start wizard activity with exception:%s", exception);
    }
}
