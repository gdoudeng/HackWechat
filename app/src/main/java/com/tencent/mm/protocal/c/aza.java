package com.tencent.mm.protocal.c;

import com.tencent.mm.bq.a;

public final class aza extends a {
    public String ksU;
    public String vUT;
    public int vXZ;
    public int wGa;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.ksU != null) {
                aVar.g(1, this.ksU);
            }
            if (this.vUT != null) {
                aVar.g(2, this.vUT);
            }
            aVar.fU(3, this.wGa);
            aVar.fU(4, this.vXZ);
            return 0;
        } else if (i == 1) {
            if (this.ksU != null) {
                r0 = e.a.a.b.b.a.h(1, this.ksU) + 0;
            } else {
                r0 = 0;
            }
            if (this.vUT != null) {
                r0 += e.a.a.b.b.a.h(2, this.vUT);
            }
            return (r0 + e.a.a.a.fR(3, this.wGa)) + e.a.a.a.fR(4, this.vXZ);
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
            aza com_tencent_mm_protocal_c_aza = (aza) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    com_tencent_mm_protocal_c_aza.ksU = aVar3.Avy.readString();
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_aza.vUT = aVar3.Avy.readString();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_aza.wGa = aVar3.Avy.ry();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_aza.vXZ = aVar3.Avy.ry();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
