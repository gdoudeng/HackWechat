package com.tencent.mm.protocal.c;

import com.tencent.mm.bq.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class de extends bdf {
    public b vIm;
    public int vIr;
    public int vIs;
    public dj vIt;
    public df vIu;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.wJr == null) {
                throw new e.a.a.b("Not all required fields were included: BaseResponse");
            }
            if (this.wJr != null) {
                aVar.fW(1, this.wJr.bke());
                this.wJr.a(aVar);
            }
            aVar.fU(2, this.vIr);
            aVar.fU(3, this.vIs);
            if (this.vIm != null) {
                aVar.b(4, this.vIm);
            }
            if (this.vIt != null) {
                aVar.fW(5, this.vIt.bke());
                this.vIt.a(aVar);
            }
            if (this.vIu == null) {
                return 0;
            }
            aVar.fW(6, this.vIu.bke());
            this.vIu.a(aVar);
            return 0;
        } else if (i == 1) {
            if (this.wJr != null) {
                r0 = e.a.a.a.fT(1, this.wJr.bke()) + 0;
            } else {
                r0 = 0;
            }
            r0 = (r0 + e.a.a.a.fR(2, this.vIr)) + e.a.a.a.fR(3, this.vIs);
            if (this.vIm != null) {
                r0 += e.a.a.a.a(4, this.vIm);
            }
            if (this.vIt != null) {
                r0 += e.a.a.a.fT(5, this.vIt.bke());
            }
            if (this.vIu != null) {
                r0 += e.a.a.a.fT(6, this.vIu.bke());
            }
            return r0;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = bdf.a(aVar2); r0 > 0; r0 = bdf.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cJE();
                }
            }
            if (this.wJr != null) {
                return 0;
            }
            throw new e.a.a.b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            de deVar = (de) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Jl;
            int size;
            byte[] bArr;
            com.tencent.mm.bq.a feVar;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Jl.get(intValue);
                        feVar = new fe();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = feVar.a(aVar4, feVar, bdf.a(aVar4))) {
                        }
                        deVar.wJr = feVar;
                    }
                    return 0;
                case 2:
                    deVar.vIr = aVar3.Avy.ry();
                    return 0;
                case 3:
                    deVar.vIs = aVar3.Avy.ry();
                    return 0;
                case 4:
                    deVar.vIm = aVar3.cJD();
                    return 0;
                case 5:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Jl.get(intValue);
                        feVar = new dj();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = feVar.a(aVar4, feVar, bdf.a(aVar4))) {
                        }
                        deVar.vIt = feVar;
                    }
                    return 0;
                case 6:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Jl.get(intValue);
                        feVar = new df();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = feVar.a(aVar4, feVar, bdf.a(aVar4))) {
                        }
                        deVar.vIu = feVar;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
