package com.tencent.mm.modelgeo;

import android.os.Looper;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.x;

class c$1 extends e {
    final /* synthetic */ c hyh;

    c$1(c cVar) {
        this.hyh = cVar;
    }

    public final void a(boolean z, double d, double d2, int i, double d3, double d4, double d5, String str, String str2, int i2) {
        c.a(this.hyh, z);
        if (z) {
            this.hyh.hxV = d;
            this.hyh.hxW = d2;
            this.hyh.hxX = i;
            this.hyh.hxY = d3;
            this.hyh.hxZ = d4;
            this.hyh.bhF = d5;
            this.hyh.hya = str;
            this.hyh.hyb = str2;
            this.hyh.hyc = i2;
            this.hyh.hxS = System.currentTimeMillis();
            this.hyh.hxT = true;
            this.hyh.hxU = false;
            c.a(this.hyh, 67592);
        }
        x.d("MicroMsg.LocationGeo", "onGetLocation fLongitude: %f fLatitude:%f locType:%d %f:spped", Double.valueOf(d2), Double.valueOf(d), Integer.valueOf(i), Double.valueOf(d3));
        new af(Looper.getMainLooper()).post(new 1(this, z, d, d2, i, d3, d4, d5));
    }
}
