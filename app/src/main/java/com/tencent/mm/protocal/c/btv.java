package com.tencent.mm.protocal.c;

import com.tencent.mm.bq.a;

public final class btv extends a {
    public int ktN;
    public String wVi;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.fU(1, this.ktN);
            if (this.wVi != null) {
                aVar.g(2, this.wVi);
            }
            return 0;
        } else if (i == 1) {
            r0 = e.a.a.a.fR(1, this.ktN) + 0;
            if (this.wVi != null) {
                return r0 + e.a.a.b.b.a.h(2, this.wVi);
            }
            return r0;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cJE();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            btv com_tencent_mm_protocal_c_btv = (btv) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    com_tencent_mm_protocal_c_btv.ktN = aVar3.Avy.ry();
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_btv.wVi = aVar3.Avy.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}