package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

public final class q {
    private final View mView;
    private ViewParent xw;
    public boolean xx;
    private int[] xy;

    public q(View view) {
        this.mView = view;
    }

    public final void setNestedScrollingEnabled(boolean z) {
        if (this.xx) {
            z.ah(this.mView);
        }
        this.xx = z;
    }

    public final boolean hasNestedScrollingParent() {
        return this.xw != null;
    }

    public final boolean startNestedScroll(int i) {
        if (hasNestedScrollingParent()) {
            return true;
        }
        if (this.xx) {
            View view = this.mView;
            for (ViewParent parent = this.mView.getParent(); parent != null; parent = parent.getParent()) {
                if (ag.a(parent, view, this.mView, i)) {
                    this.xw = parent;
                    ag.b(parent, view, this.mView, i);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void stopNestedScroll() {
        if (this.xw != null) {
            ag.a(this.xw, this.mView);
            this.xw = null;
        }
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        if (!this.xx || this.xw == null) {
            return false;
        }
        if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            int i5;
            int i6;
            if (iArr != null) {
                this.mView.getLocationInWindow(iArr);
                int i7 = iArr[0];
                i5 = iArr[1];
                i6 = i7;
            } else {
                i5 = 0;
                i6 = 0;
            }
            ag.a(this.xw, this.mView, i, i2, i3, i4);
            if (iArr != null) {
                this.mView.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i6;
                iArr[1] = iArr[1] - i5;
            }
            return true;
        } else if (iArr == null) {
            return false;
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        if (!this.xx || this.xw == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            int i3;
            int i4;
            if (iArr2 != null) {
                this.mView.getLocationInWindow(iArr2);
                i3 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i4 = 0;
                i3 = 0;
            }
            if (iArr == null) {
                if (this.xy == null) {
                    this.xy = new int[2];
                }
                iArr = this.xy;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            ag.a(this.xw, this.mView, i, i2, iArr);
            if (iArr2 != null) {
                this.mView.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i3;
                iArr2[1] = iArr2[1] - i4;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        if (!this.xx || this.xw == null) {
            return false;
        }
        return ag.a(this.xw, this.mView, f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        if (!this.xx || this.xw == null) {
            return false;
        }
        return ag.a(this.xw, this.mView, f, f2);
    }
}