package com.tencent.mm.protocal.b.a;

import com.tencent.mm.bq.a;

public final class d extends a {
    public String desc;
    public int fEI;
    public String fvC;
    public String mpH;
    public String title;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.title != null) {
                aVar.g(1, this.title);
            }
            if (this.desc != null) {
                aVar.g(2, this.desc);
            }
            if (this.fvC != null) {
                aVar.g(3, this.fvC);
            }
            aVar.fU(4, this.fEI);
            if (this.mpH == null) {
                return 0;
            }
            aVar.g(5, this.mpH);
            return 0;
        } else if (i == 1) {
            if (this.title != null) {
                r0 = e.a.a.b.b.a.h(1, this.title) + 0;
            } else {
                r0 = 0;
            }
            if (this.desc != null) {
                r0 += e.a.a.b.b.a.h(2, this.desc);
            }
            if (this.fvC != null) {
                r0 += e.a.a.b.b.a.h(3, this.fvC);
            }
            r0 += e.a.a.a.fR(4, this.fEI);
            if (this.mpH != null) {
                r0 += e.a.a.b.b.a.h(5, this.mpH);
            }
            return r0;
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
            d dVar = (d) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    dVar.title = aVar3.Avy.readString();
                    return 0;
                case 2:
                    dVar.desc = aVar3.Avy.readString();
                    return 0;
                case 3:
                    dVar.fvC = aVar3.Avy.readString();
                    return 0;
                case 4:
                    dVar.fEI = aVar3.Avy.ry();
                    return 0;
                case 5:
                    dVar.mpH = aVar3.Avy.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
