package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class ajj extends c {
    private final int height = 186;
    private final int width = 186;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 186;
            case 1:
                return 186;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                c.f(looper);
                c.e(looper);
                Paint i2 = c.i(looper);
                i2.setFlags(385);
                i2.setStyle(Style.FILL);
                Paint i3 = c.i(looper);
                i3.setFlags(385);
                i3.setStyle(Style.STROKE);
                i2.setColor(WebView.NIGHT_MODE_COLOR);
                i3.setStrokeWidth(1.0f);
                i3.setStrokeCap(Cap.BUTT);
                i3.setStrokeJoin(Join.MITER);
                i3.setStrokeMiter(4.0f);
                i3.setPathEffect(null);
                c.a(i3, looper).setStrokeWidth(1.0f);
                i2 = c.a(i2, looper);
                i2.setColor(-2105120);
                canvas.save();
                i3 = c.a(i2, looper);
                Path j = c.j(looper);
                j.moveTo(0.0f, 0.0f);
                j.lineTo(186.0f, 0.0f);
                j.lineTo(186.0f, 186.0f);
                j.lineTo(0.0f, 186.0f);
                j.lineTo(0.0f, 0.0f);
                j.lineTo(0.0f, 0.0f);
                j.close();
                j.moveTo(3.0f, 3.0f);
                j.lineTo(3.0f, 183.0f);
                j.lineTo(183.0f, 183.0f);
                j.lineTo(183.0f, 3.0f);
                j.lineTo(3.0f, 3.0f);
                j.lineTo(3.0f, 3.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, i3);
                canvas.restore();
                canvas.save();
                i2 = c.a(i2, looper);
                Path j2 = c.j(looper);
                j2.moveTo(90.0f, 33.0f);
                j2.lineTo(96.0f, 33.0f);
                j2.lineTo(96.0f, 90.0f);
                j2.lineTo(153.0f, 90.0f);
                j2.lineTo(153.0f, 96.0f);
                j2.lineTo(96.0f, 96.0f);
                j2.lineTo(96.0f, 153.0f);
                j2.lineTo(90.0f, 153.0f);
                j2.lineTo(90.0f, 96.0f);
                j2.lineTo(33.0f, 96.0f);
                j2.lineTo(33.0f, 90.0f);
                j2.lineTo(90.0f, 90.0f);
                j2.lineTo(90.0f, 33.0f);
                j2.lineTo(90.0f, 33.0f);
                j2.close();
                WeChatSVGRenderC2Java.setFillType(j2, 2);
                canvas.drawPath(j2, i2);
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
