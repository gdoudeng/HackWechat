package com.tencent.mm.plugin.wallet.a;

import com.tencent.mm.bq.a;
import java.util.LinkedList;

public final class b extends a {
    public String oZA;
    public LinkedList<c> sDi = new LinkedList();

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.oZA != null) {
                aVar.g(1, this.oZA);
            }
            aVar.d(2, 8, this.sDi);
            return 0;
        } else if (i == 1) {
            if (this.oZA != null) {
                r0 = e.a.a.b.b.a.h(1, this.oZA) + 0;
            } else {
                r0 = 0;
            }
            return r0 + e.a.a.a.c(2, 8, this.sDi);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.sDi.clear();
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
            b bVar = (b) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    bVar.oZA = aVar3.Avy.readString();
                    return 0;
                case 2:
                    LinkedList Jl = aVar3.Jl(intValue);
                    int size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) Jl.get(intValue);
                        a cVar = new c();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(r0, unknownTagHandler);
                        for (boolean z = true; z; z = cVar.a(aVar4, cVar, a.a(aVar4))) {
                        }
                        bVar.sDi.add(cVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
