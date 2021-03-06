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

public final class yt extends c {
    private final int height = 108;
    private final int width = 108;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 108;
            case 1:
                return 108;
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
                a.setColor(-12632257);
                e = c.a(e, 1.0f, 0.0f, 21.0f, 0.0f, 1.0f, 45.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path j = c.j(looper);
                j.moveTo(4.01f, 2.09f);
                j.cubicTo(8.12f, -0.49f, 14.14f, 1.78f, 15.55f, 6.41f);
                j.cubicTo(17.46f, 11.32f, 13.29f, 17.17f, 8.03f, 16.99f);
                j.cubicTo(4.07f, 17.15f, 1.01f, 13.98f, 0.0f, 10.38f);
                j.lineTo(0.0f, 7.82f);
                j.cubicTo(0.82f, 5.62f, 1.75f, 3.18f, 4.01f, 2.09f);
                j.lineTo(4.01f, 2.09f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                j = c.j(looper);
                j.moveTo(30.32f, 1.48f);
                j.cubicTo(35.94f, -0.86f, 42.46f, 4.98f, 40.77f, 10.82f);
                j.cubicTo(39.73f, 16.46f, 32.05f, 19.0f, 27.84f, 15.09f);
                j.cubicTo(23.14f, 11.47f, 24.67f, 3.21f, 30.32f, 1.48f);
                j.lineTo(30.32f, 1.48f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                j = c.j(looper);
                j.moveTo(50.0f, 9.01f);
                j.cubicTo(49.85f, 4.09f, 54.96f, -0.04f, 59.74f, 1.21f);
                j.cubicTo(63.02f, 1.76f, 65.01f, 4.65f, 66.0f, 7.6f);
                j.lineTo(66.0f, 10.11f);
                j.cubicTo(65.19f, 12.9f, 63.56f, 15.73f, 60.57f, 16.56f);
                j.cubicTo(55.65f, 18.47f, 49.83f, 14.26f, 50.0f, 9.01f);
                j.lineTo(50.0f, 9.01f);
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
