package com.tencent.mm.plugin.webview.ui.tools.game;

import com.tencent.mm.plugin.webview.ui.tools.game.menu.d;
import com.tencent.mm.sdk.platformtools.x;

class GameWebViewUI$6 implements Runnable {
    final /* synthetic */ d mZX;
    final /* synthetic */ GameWebViewUI tFJ;

    GameWebViewUI$6(GameWebViewUI gameWebViewUI, d dVar) {
        this.tFJ = gameWebViewUI;
        this.mZX = dVar;
    }

    public final void run() {
        if (this.tFJ.isFinishing() || GameWebViewUI.H(this.tFJ)) {
            x.i("MicroMsg.Wepkg.GameWebViewUI", "tryShow bottom sheet failed, the activity has been destroyed.");
        } else {
            this.mZX.bUk();
        }
    }
}
