package com.tencent.mm.protocal.c;

import com.tencent.mm.bq.a;
import e.a.a.b;

public final class cm extends a {
    public String fyY;
    public int type;
    public String url;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.fyY == null) {
                throw new b("Not all required fields were included: wording");
            } else if (this.url == null) {
                throw new b("Not all required fields were included: url");
            } else {
                aVar.fU(1, this.type);
                if (this.fyY != null) {
                    aVar.g(2, this.fyY);
                }
                if (this.url != null) {
                    aVar.g(3, this.url);
                }
                return 0;
            }
        } else if (i == 1) {
            r0 = e.a.a.a.fR(1, this.type) + 0;
            if (this.fyY != null) {
                r0 += e.a.a.b.b.a.h(2, this.fyY);
            }
            if (this.url != null) {
                return r0 + e.a.a.b.b.a.h(3, this.url);
            }
            return r0;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cJE();
                }
            }
            if (this.fyY == null) {
                throw new b("Not all required fields were included: wording");
            } else if (this.url != null) {
                return 0;
            } else {
                throw new b("Not all required fields were included: url");
            }
        } else if (i != 3) {
            return -1;
        } else {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            cm cmVar = (cm) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    cmVar.type = aVar3.Avy.ry();
                    return 0;
                case 2:
                    cmVar.fyY = aVar3.Avy.readString();
                    return 0;
                case 3:
                    cmVar.url = aVar3.Avy.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
