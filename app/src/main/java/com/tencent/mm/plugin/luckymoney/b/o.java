package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.ae.b;
import com.tencent.mm.ae.e;
import com.tencent.mm.ae.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.x;

public final class o extends k implements com.tencent.mm.network.k {
    private b gJQ;
    private e gJT;

    public final int getType() {
        return 980;
    }

    public final int a(com.tencent.mm.network.e eVar, e eVar2) {
        this.gJT = eVar2;
        return a(eVar, this.gJQ, this);
    }

    public final void a(int i, int i2, int i3, String str, q qVar, byte[] bArr) {
        x.d("MicroMsg.NetSceneAsyncBizSubscribe", "onGYNetEnd errType:" + i2 + " errCode:" + i3);
        if (this.gJT != null) {
            this.gJT.a(i2, i3, str, this);
        }
    }
}
