package com.tencent.mm.protocal.c;

import e.a.a.c.a;
import java.util.LinkedList;

public final class w extends bcv {
    public int asN;
    public int offset;
    public int type;
    public String vDK;
    public int vDL;
    public int vDM;
    public String vDN;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.wIV != null) {
                aVar.fW(1, this.wIV.bke());
                this.wIV.a(aVar);
            }
            aVar.fU(2, this.asN);
            aVar.fU(3, this.offset);
            aVar.fU(4, this.type);
            if (this.vDK != null) {
                aVar.g(5, this.vDK);
            }
            aVar.fU(6, this.vDL);
            aVar.fU(7, this.vDM);
            if (this.vDN == null) {
                return 0;
            }
            aVar.g(8, this.vDN);
            return 0;
        } else if (i == 1) {
            if (this.wIV != null) {
                r0 = e.a.a.a.fT(1, this.wIV.bke()) + 0;
            } else {
                r0 = 0;
            }
            r0 = ((r0 + e.a.a.a.fR(2, this.asN)) + e.a.a.a.fR(3, this.offset)) + e.a.a.a.fR(4, this.type);
            if (this.vDK != null) {
                r0 += e.a.a.b.b.a.h(5, this.vDK);
            }
            r0 = (r0 + e.a.a.a.fR(6, this.vDL)) + e.a.a.a.fR(7, this.vDM);
            if (this.vDN != null) {
                r0 += e.a.a.b.b.a.h(8, this.vDN);
            }
            return r0;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
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
            w wVar = (w) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Jl = aVar3.Jl(intValue);
                    int size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Jl.get(intValue);
                        com.tencent.mm.bq.a fdVar = new fd();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = fdVar.a(aVar4, fdVar, bcv.a(aVar4))) {
                        }
                        wVar.wIV = fdVar;
                    }
                    return 0;
                case 2:
                    wVar.asN = aVar3.Avy.ry();
                    return 0;
                case 3:
                    wVar.offset = aVar3.Avy.ry();
                    return 0;
                case 4:
                    wVar.type = aVar3.Avy.ry();
                    return 0;
                case 5:
                    wVar.vDK = aVar3.Avy.readString();
                    return 0;
                case 6:
                    wVar.vDL = aVar3.Avy.ry();
                    return 0;
                case 7:
                    wVar.vDM = aVar3.Avy.ry();
                    return 0;
                case 8:
                    wVar.vDN = aVar3.Avy.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
