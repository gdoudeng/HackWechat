package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class ajt extends c {
    private final int height = 60;
    private final int width = 60;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 60;
            case 1:
                return 60;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix f = c.f(looper);
                float[] e = c.e(looper);
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
                canvas.save();
                Paint a = c.a(i2, looper);
                a.setColor(-2105120);
                e = c.a(e, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 2.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path j = c.j(looper);
                j.moveTo(4.24f, 9.3f);
                j.cubicTo(8.92f, 2.94f, 17.39f, -0.19f, 25.1f, 1.41f);
                j.cubicTo(32.66f, 2.78f, 39.15f, 8.72f, 41.17f, 16.14f);
                j.cubicTo(43.04f, 22.59f, 41.49f, 29.57f, 38.39f, 35.38f);
                j.cubicTo(34.3f, 42.96f, 27.97f, 49.1f, 21.0f, 54.04f);
                j.cubicTo(12.64f, 48.07f, 4.94f, 40.33f, 1.47f, 30.46f);
                j.cubicTo(-1.06f, 23.52f, -0.39f, 15.22f, 4.24f, 9.3f);
                j.lineTo(4.24f, 9.3f);
                j.close();
                j.moveTo(17.121176f, 14.014381f);
                j.cubicTo(11.980267f, 16.542173f, 11.574966f, 24.57351f, 16.44923f, 27.602592f);
                j.cubicTo(21.355494f, 31.324953f, 29.25884f, 27.197294f, 28.949532f, 21.032469f);
                j.cubicTo(29.25884f, 15.198284f, 22.102098f, 10.963966f, 17.121176f, 14.014381f);
                j.lineTo(17.121176f, 14.014381f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
