package com.tencent.mm.protocal.c;

import com.tencent.mm.bq.a;
import e.a.a.b;
import java.util.LinkedList;

public final class arn extends a {
    public int ktm;
    public bdo vGG;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.vGG == null) {
                throw new b("Not all required fields were included: ChatRoomName");
            }
            if (this.vGG != null) {
                aVar.fW(1, this.vGG.bke());
                this.vGG.a(aVar);
            }
            aVar.fU(2, this.ktm);
            return 0;
        } else if (i == 1) {
            if (this.vGG != null) {
                r0 = e.a.a.a.fT(1, this.vGG.bke()) + 0;
            } else {
                r0 = 0;
            }
            return r0 + e.a.a.a.fR(2, this.ktm);
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cJE();
                }
            }
            if (this.vGG != null) {
                return 0;
            }
            throw new b("Not all required fields were included: ChatRoomName");
        } else if (i != 3) {
            return -1;
        } else {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            arn com_tencent_mm_protocal_c_arn = (arn) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Jl = aVar3.Jl(intValue);
                    int size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Jl.get(intValue);
                        a com_tencent_mm_protocal_c_bdo = new bdo();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = com_tencent_mm_protocal_c_bdo.a(aVar4, com_tencent_mm_protocal_c_bdo, a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_arn.vGG = com_tencent_mm_protocal_c_bdo;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_arn.ktm = aVar3.Avy.ry();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
