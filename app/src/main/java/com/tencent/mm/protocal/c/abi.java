package com.tencent.mm.protocal.c;

import com.tencent.mm.bq.a;
import java.util.LinkedList;

public final class abi extends a {
    public int vDW;
    public int vZS;
    public int wko;
    public bdn wkp;
    public String wkq;
    public int wkr;
    public long wks;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.fU(1, this.vDW);
            aVar.fU(2, this.wko);
            if (this.wkp != null) {
                aVar.fW(3, this.wkp.bke());
                this.wkp.a(aVar);
            }
            aVar.fU(4, this.vZS);
            if (this.wkq != null) {
                aVar.g(5, this.wkq);
            }
            aVar.fU(6, this.wkr);
            aVar.S(7, this.wks);
            return 0;
        } else if (i == 1) {
            r0 = (e.a.a.a.fR(1, this.vDW) + 0) + e.a.a.a.fR(2, this.wko);
            if (this.wkp != null) {
                r0 += e.a.a.a.fT(3, this.wkp.bke());
            }
            r0 += e.a.a.a.fR(4, this.vZS);
            if (this.wkq != null) {
                r0 += e.a.a.b.b.a.h(5, this.wkq);
            }
            return (r0 + e.a.a.a.fR(6, this.wkr)) + e.a.a.a.R(7, this.wks);
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
            abi com_tencent_mm_protocal_c_abi = (abi) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    com_tencent_mm_protocal_c_abi.vDW = aVar3.Avy.ry();
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_abi.wko = aVar3.Avy.ry();
                    return 0;
                case 3:
                    LinkedList Jl = aVar3.Jl(intValue);
                    int size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Jl.get(intValue);
                        a com_tencent_mm_protocal_c_bdn = new bdn();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = com_tencent_mm_protocal_c_bdn.a(aVar4, com_tencent_mm_protocal_c_bdn, a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_abi.wkp = com_tencent_mm_protocal_c_bdn;
                    }
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_abi.vZS = aVar3.Avy.ry();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_abi.wkq = aVar3.Avy.readString();
                    return 0;
                case 6:
                    com_tencent_mm_protocal_c_abi.wkr = aVar3.Avy.ry();
                    return 0;
                case 7:
                    com_tencent_mm_protocal_c_abi.wks = aVar3.Avy.rz();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
