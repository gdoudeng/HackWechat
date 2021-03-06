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

public final class acv extends c {
    private final int height = 96;
    private final int width = 96;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
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
                i2.setColor(-1);
                canvas.save();
                Paint a = c.a(i2, looper);
                Path j = c.j(looper);
                j.moveTo(47.999f, 33.0f);
                j.cubicTo(48.731f, 33.0f, 49.446f, 33.07f, 50.15f, 33.172f);
                j.lineTo(35.518f, 18.54f);
                j.cubicTo(28.743f, 21.415f, 23.158f, 26.549f, 19.726f, 33.009f);
                j.lineTo(47.836f, 33.009f);
                j.cubicTo(47.892f, 33.009f, 47.944f, 33.0f, 47.999f, 33.0f);
                j.lineTo(47.999f, 33.0f);
                j.close();
                j.moveTo(62.999f, 19.75f);
                j.lineTo(62.999f, 48.0f);
                j.cubicTo(62.999f, 48.715f, 62.932f, 49.413f, 62.835f, 50.101f);
                j.lineTo(77.455f, 35.48f);
                j.cubicTo(74.58f, 28.725f, 69.44f, 23.178f, 62.999f, 19.75f);
                j.lineTo(62.999f, 19.75f);
                j.close();
                j.moveTo(58.624f, 37.414f);
                j.cubicTo(59.124f, 37.915f, 59.574f, 38.462f, 59.999f, 39.029f);
                j.lineTo(59.999f, 18.337f);
                j.cubicTo(56.292f, 16.836f, 52.245f, 16.0f, 47.999f, 16.0f);
                j.cubicTo(44.737f, 16.0f, 41.595f, 16.501f, 38.63f, 17.409f);
                j.lineTo(58.63f, 37.409f);
                j.lineTo(58.624f, 37.414f);
                j.lineTo(58.624f, 37.414f);
                j.close();
                j.moveTo(39.023f, 36.009f);
                j.lineTo(18.331f, 36.009f);
                j.cubicTo(16.832f, 39.713f, 16.0f, 43.758f, 16.0f, 48.0f);
                j.cubicTo(16.0f, 51.279f, 16.507f, 54.437f, 17.424f, 57.416f);
                j.lineTo(36.871f, 37.969f);
                j.cubicTo(37.521f, 37.247f, 38.245f, 36.594f, 39.023f, 36.009f);
                j.lineTo(39.023f, 36.009f);
                j.close();
                j.moveTo(32.999f, 76.267f);
                j.lineTo(32.999f, 47.999f);
                j.cubicTo(32.999f, 47.292f, 33.065f, 46.602f, 33.16f, 45.921f);
                j.lineTo(18.557f, 60.524f);
                j.cubicTo(21.435f, 67.277f, 26.558f, 72.842f, 32.999f, 76.267f);
                j.lineTo(32.999f, 76.267f);
                j.close();
                j.moveTo(35.999f, 56.976f);
                j.lineTo(35.999f, 77.664f);
                j.cubicTo(39.706f, 79.165f, 43.754f, 79.999f, 47.999f, 79.999f);
                j.cubicTo(51.291f, 79.999f, 54.459f, 79.488f, 57.447f, 78.564f);
                j.lineTo(38.434f, 59.552f);
                j.cubicTo(37.521f, 58.797f, 36.711f, 57.926f, 35.999f, 56.976f);
                j.lineTo(35.999f, 56.976f);
                j.close();
                j.moveTo(78.59f, 38.589f);
                j.lineTo(58.948f, 58.231f);
                j.cubicTo(58.341f, 58.88f, 57.669f, 59.466f, 56.957f, 60.001f);
                j.lineTo(77.665f, 60.001f);
                j.cubicTo(79.166f, 56.294f, 80.0f, 52.246f, 80.0f, 48.001f);
                j.cubicTo(79.999f, 44.724f, 79.505f, 41.564f, 78.59f, 38.589f);
                j.lineTo(78.59f, 38.589f);
                j.close();
                j.moveTo(45.971f, 62.847f);
                j.lineTo(60.554f, 77.43f);
                j.cubicTo(67.293f, 74.55f, 72.846f, 69.431f, 76.267f, 63.0f);
                j.lineTo(47.999f, 63.0f);
                j.cubicTo(47.31f, 63.0f, 46.636f, 62.937f, 45.971f, 62.847f);
                j.lineTo(45.971f, 62.847f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
