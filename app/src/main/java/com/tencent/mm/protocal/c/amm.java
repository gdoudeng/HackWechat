package com.tencent.mm.protocal.c;

import e.a.a.c.a;
import java.util.LinkedList;

public final class amm extends bcv {
    public String nfX;
    public String ngo;
    public LinkedList<String> wta = new LinkedList();
    public int wtc;
    public cbj wtd;
    public int wtf;
    public String wtg;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.wIV != null) {
                aVar.fW(1, this.wIV.bke());
                this.wIV.a(aVar);
            }
            if (this.ngo != null) {
                aVar.g(2, this.ngo);
            }
            aVar.d(3, 1, this.wta);
            aVar.fU(4, this.wtf);
            if (this.nfX != null) {
                aVar.g(5, this.nfX);
            }
            if (this.wtg != null) {
                aVar.g(6, this.wtg);
            }
            aVar.fU(7, this.wtc);
            if (this.wtd == null) {
                return 0;
            }
            aVar.fW(8, this.wtd.bke());
            this.wtd.a(aVar);
            return 0;
        } else if (i == 1) {
            if (this.wIV != null) {
                r0 = e.a.a.a.fT(1, this.wIV.bke()) + 0;
            } else {
                r0 = 0;
            }
            if (this.ngo != null) {
                r0 += e.a.a.b.b.a.h(2, this.ngo);
            }
            r0 = (r0 + e.a.a.a.c(3, 1, this.wta)) + e.a.a.a.fR(4, this.wtf);
            if (this.nfX != null) {
                r0 += e.a.a.b.b.a.h(5, this.nfX);
            }
            if (this.wtg != null) {
                r0 += e.a.a.b.b.a.h(6, this.wtg);
            }
            r0 += e.a.a.a.fR(7, this.wtc);
            if (this.wtd != null) {
                r0 += e.a.a.a.fT(8, this.wtd.bke());
            }
            return r0;
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.wta.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(r0, unknownTagHandler);
            for (r0 = bcv.a(aVar2); r0 > 0; r0 = bcv.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cJE();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            amm com_tencent_mm_protocal_c_amm = (amm) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Jl;
            int size;
            com.tencent.mm.bq.a fdVar;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) Jl.get(intValue);
                        fdVar = new fd();
                        aVar4 = new e.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = fdVar.a(aVar4, fdVar, bcv.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_amm.wIV = fdVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_amm.ngo = aVar3.Avy.readString();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_amm.wta.add(aVar3.Avy.readString());
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_amm.wtf = aVar3.Avy.ry();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_amm.nfX = aVar3.Avy.readString();
                    return 0;
                case 6:
                    com_tencent_mm_protocal_c_amm.wtg = aVar3.Avy.readString();
                    return 0;
                case 7:
                    com_tencent_mm_protocal_c_amm.wtc = aVar3.Avy.ry();
                    return 0;
                case 8:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) Jl.get(intValue);
                        fdVar = new cbj();
                        aVar4 = new e.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = fdVar.a(aVar4, fdVar, bcv.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_amm.wtd = fdVar;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}