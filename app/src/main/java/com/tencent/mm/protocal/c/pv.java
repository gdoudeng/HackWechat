package com.tencent.mm.protocal.c;

import e.a.a.c.a;
import java.util.LinkedList;

public final class pv extends bcv {
    public int kZx;
    public int rYW;
    public LinkedList<qe> vGF = new LinkedList();
    public String vYJ;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.wIV != null) {
                aVar.fW(1, this.wIV.bke());
                this.wIV.a(aVar);
            }
            aVar.fU(2, this.kZx);
            aVar.d(3, 8, this.vGF);
            if (this.vYJ != null) {
                aVar.g(4, this.vYJ);
            }
            aVar.fU(5, this.rYW);
            return 0;
        } else if (i == 1) {
            if (this.wIV != null) {
                r0 = e.a.a.a.fT(1, this.wIV.bke()) + 0;
            } else {
                r0 = 0;
            }
            r0 = (r0 + e.a.a.a.fR(2, this.kZx)) + e.a.a.a.c(3, 8, this.vGF);
            if (this.vYJ != null) {
                r0 += e.a.a.b.b.a.h(4, this.vYJ);
            }
            return r0 + e.a.a.a.fR(5, this.rYW);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.vGF.clear();
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
            pv pvVar = (pv) objArr[1];
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
                        pvVar.wIV = fdVar;
                    }
                    return 0;
                case 2:
                    pvVar.kZx = aVar3.Avy.ry();
                    return 0;
                case 3:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) Jl.get(intValue);
                        fdVar = new qe();
                        aVar4 = new e.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = fdVar.a(aVar4, fdVar, bcv.a(aVar4))) {
                        }
                        pvVar.vGF.add(fdVar);
                    }
                    return 0;
                case 4:
                    pvVar.vYJ = aVar3.Avy.readString();
                    return 0;
                case 5:
                    pvVar.rYW = aVar3.Avy.ry();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}