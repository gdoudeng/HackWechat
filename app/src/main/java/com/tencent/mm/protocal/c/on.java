package com.tencent.mm.protocal.c;

import com.tencent.mm.bq.a;
import java.util.LinkedList;

public final class on extends a {
    public String vXr;
    public String vXs;
    public LinkedList<arc> vXt = new LinkedList();

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.vXr != null) {
                aVar.g(1, this.vXr);
            }
            if (this.vXs != null) {
                aVar.g(2, this.vXs);
            }
            aVar.d(3, 8, this.vXt);
            return 0;
        } else if (i == 1) {
            if (this.vXr != null) {
                r0 = e.a.a.b.b.a.h(1, this.vXr) + 0;
            } else {
                r0 = 0;
            }
            if (this.vXs != null) {
                r0 += e.a.a.b.b.a.h(2, this.vXs);
            }
            return r0 + e.a.a.a.c(3, 8, this.vXt);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.vXt.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(r0, unknownTagHandler);
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
            on onVar = (on) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    onVar.vXr = aVar3.Avy.readString();
                    return 0;
                case 2:
                    onVar.vXs = aVar3.Avy.readString();
                    return 0;
                case 3:
                    LinkedList Jl = aVar3.Jl(intValue);
                    int size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) Jl.get(intValue);
                        a com_tencent_mm_protocal_c_arc = new arc();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(r0, unknownTagHandler);
                        for (boolean z = true; z; z = com_tencent_mm_protocal_c_arc.a(aVar4, com_tencent_mm_protocal_c_arc, a.a(aVar4))) {
                        }
                        onVar.vXt.add(com_tencent_mm_protocal_c_arc);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
