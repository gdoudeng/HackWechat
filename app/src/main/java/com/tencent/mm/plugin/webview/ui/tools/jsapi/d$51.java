package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.mm.sdk.platformtools.x;

class d$51 implements Runnable {
    final /* synthetic */ String iXg;
    final /* synthetic */ d tHd;

    d$51(d dVar, String str) {
        this.tHd = dVar;
        this.iXg = str;
    }

    public final void run() {
        try {
            d.d(this.tHd).evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.iXg + ")", null);
        } catch (Exception e) {
            x.e("MicroMsg.JsApiHandler", "onTeachSearchDataReady fail, ex = %s", new Object[]{e.getMessage()});
        }
    }
}
