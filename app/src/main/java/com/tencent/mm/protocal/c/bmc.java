package com.tencent.mm.protocal.c;

import com.tencent.mm.bq.a;

public final class bmc extends a {
    public int wPH;
    public boolean wPI;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.fU(1, this.wPH);
            aVar.al(2, this.wPI);
            return 0;
        } else if (i == 1) {
            return (e.a.a.a.fR(1, this.wPH) + 0) + (e.a.a.b.b.a.dX(2) + 1);
        } else {
            if (i == 2) {
                e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
                for (int a = a.a(aVar2); a > 0; a = a.a(aVar2)) {
                    if (!super.a(aVar2, this, a)) {
                        aVar2.cJE();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
                bmc com_tencent_mm_protocal_c_bmc = (bmc) objArr[1];
                switch (((Integer) objArr[2]).intValue()) {
                    case 1:
                        com_tencent_mm_protocal_c_bmc.wPH = aVar3.Avy.ry();
                        return 0;
                    case 2:
                        com_tencent_mm_protocal_c_bmc.wPI = aVar3.cJC();
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
