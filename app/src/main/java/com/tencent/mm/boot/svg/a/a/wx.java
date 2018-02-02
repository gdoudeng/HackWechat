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
import com.tencent.wcdb.FileUtils;

public final class wx extends c {
    private final int height = 84;
    private final int width = 84;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 84;
            case 1:
                return 84;
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
                canvas.saveLayerAlpha(null, FileUtils.S_IWUSR, 4);
                canvas.save();
                Paint a = c.a(i2, looper);
                a.setColor(1717131609);
                Path j = c.j(looper);
                j.moveTo(0.0f, 9.0093975f);
                j.cubicTo(0.0f, 4.0336447f, 4.0231953f, 0.0f, 9.0093975f, 0.0f);
                j.lineTo(74.9906f, 0.0f);
                j.cubicTo(79.966354f, 0.0f, 84.0f, 4.0231953f, 84.0f, 9.0093975f);
                j.lineTo(84.0f, 74.9906f);
                j.cubicTo(84.0f, 79.966354f, 79.97681f, 84.0f, 74.9906f, 84.0f);
                j.lineTo(9.0093975f, 84.0f);
                j.cubicTo(4.0336447f, 84.0f, 0.0f, 79.97681f, 0.0f, 74.9906f);
                j.lineTo(0.0f, 9.0093975f);
                j.close();
                j.moveTo(2.0f, 10.0000515f);
                j.lineTo(2.0f, 73.99995f);
                j.cubicTo(2.0f, 78.42021f, 5.5817447f, 82.0f, 10.0000515f, 82.0f);
                j.lineTo(73.99995f, 82.0f);
                j.cubicTo(78.42021f, 82.0f, 82.0f, 78.41826f, 82.0f, 73.99995f);
                j.lineTo(82.0f, 10.0000515f);
                j.cubicTo(82.0f, 5.5797863f, 78.41826f, 2.0f, 73.99995f, 2.0f);
                j.lineTo(10.0000515f, 2.0f);
                j.cubicTo(5.5797863f, 2.0f, 2.0f, 5.5817447f, 2.0f, 10.0000515f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                i3 = c.a(i2, looper);
                i3.setColor(1719039606);
                Path j2 = c.j(looper);
                j2.moveTo(0.0f, 0.0f);
                j2.lineTo(84.0f, 0.0f);
                j2.lineTo(84.0f, 84.0f);
                j2.lineTo(0.0f, 84.0f);
                j2.lineTo(0.0f, 0.0f);
                j2.close();
                canvas.drawPath(j2, i3);
                canvas.restore();
                canvas.save();
                i3 = c.a(i2, looper);
                i3.setColor(-1);
                j2 = c.j(looper);
                j2.moveTo(18.0f, 60.0f);
                j2.lineTo(66.0f, 60.0f);
                j2.lineTo(66.0f, 66.0f);
                j2.lineTo(18.0f, 66.0f);
                j2.lineTo(18.0f, 60.0f);
                j2.close();
                canvas.drawPath(j2, i3);
                canvas.restore();
                canvas.save();
                i2 = c.a(i2, looper);
                i2.setColor(-1);
                float[] a2 = c.a(e, 1.0f, 0.0f, 32.0f, 0.0f, 1.0f, 18.0f);
                f.reset();
                f.setValues(a2);
                canvas.concat(f);
                canvas.save();
                Paint a3 = c.a(i2, looper);
                a2 = c.a(a2, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 58.0f);
                f.reset();
                f.setValues(a2);
                canvas.concat(f);
                j = c.j(looper);
                j.moveTo(10.0f, 23.0f);
                j.lineTo(20.0f, 35.0f);
                j.lineTo(-2.6645353E-15f, 35.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 1);
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                i3 = c.a(i2, looper);
                j2 = c.j(looper);
                j2.moveTo(7.0f, 0.0f);
                j2.lineTo(13.0f, 0.0f);
                j2.lineTo(13.0f, 27.0f);
                j2.lineTo(7.0f, 27.0f);
                j2.lineTo(7.0f, 0.0f);
                j2.close();
                canvas.drawPath(j2, i3);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}