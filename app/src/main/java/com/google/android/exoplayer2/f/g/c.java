package com.google.android.exoplayer2.f.g;

import com.google.android.exoplayer2.f.a;
import com.google.android.exoplayer2.f.d;
import java.util.Collections;
import java.util.List;

final class c implements d {
    private final List<a> awy;

    public c(List<a> list) {
        this.awy = Collections.unmodifiableList(list);
    }

    public final int L(long j) {
        return j < 0 ? 0 : -1;
    }

    public final int kJ() {
        return 1;
    }

    public final long cH(int i) {
        com.google.android.exoplayer2.i.a.am(i == 0);
        return 0;
    }

    public final List<a> M(long j) {
        return j >= 0 ? this.awy : Collections.emptyList();
    }
}
