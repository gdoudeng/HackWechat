package com.tencent.mm.plugin.game.c;

import com.tencent.mm.bq.a;
import java.util.LinkedList;

public final class ax extends a {
    public String fon;
    public LinkedList<aa> nfN = new LinkedList();
    public String ngT;
    public String nht;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.d(1, 8, this.nfN);
            if (this.fon != null) {
                aVar.g(2, this.fon);
            }
            if (this.ngT != null) {
                aVar.g(3, this.ngT);
            }
            if (this.nht != null) {
                aVar.g(4, this.nht);
            }
            return 0;
        } else if (i == 1) {
            r0 = e.a.a.a.c(1, 8, this.nfN) + 0;
            if (this.fon != null) {
                r0 += e.a.a.b.b.a.h(2, this.fon);
            }
            if (this.ngT != null) {
                r0 += e.a.a.b.b.a.h(3, this.ngT);
            }
            if (this.nht != null) {
                return r0 + e.a.a.b.b.a.h(4, this.nht);
            }
            return r0;
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.nfN.clear();
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
            ax axVar = (ax) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Jl = aVar3.Jl(intValue);
                    int size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) Jl.get(intValue);
                        a aaVar = new aa();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(r0, unknownTagHandler);
                        for (boolean z = true; z; z = aaVar.a(aVar4, aaVar, a.a(aVar4))) {
                        }
                        axVar.nfN.add(aaVar);
                    }
                    return 0;
                case 2:
                    axVar.fon = aVar3.Avy.readString();
                    return 0;
                case 3:
                    axVar.ngT = aVar3.Avy.readString();
                    return 0;
                case 4:
                    axVar.nht = aVar3.Avy.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
